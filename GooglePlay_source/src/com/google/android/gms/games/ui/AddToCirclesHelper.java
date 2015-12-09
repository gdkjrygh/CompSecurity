// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.audience.dialogs.CircleSelection;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.Players;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.people.Graph;
import com.google.android.gms.people.GraphUpdate;
import com.google.android.gms.people.People;
import com.google.android.gms.people.internal.PeopleUtils;
import com.google.android.gms.people.model.Circle;
import com.google.android.gms.people.model.CircleBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.gms.games.ui:
//            G, GamesFragment

public final class AddToCirclesHelper
    implements GamesFragment.OnActivityResultListener
{
    public static interface CirclesModifiedListener
    {

        public abstract void onPlayerAddedToCircleByCirclePicker(String s, String s1);

        public abstract void onPlayerCircleModificationInProgress(String s);

        public abstract void onPlayerCirclePickerModificationFailed(String s);

        public abstract void onPlayerRemovedFromCircleByCirclePicker(String s, String s1);
    }

    public static interface OneTouchCirclesListener
    {

        public abstract void onOneTouchCircleAddFailed(String s);

        public abstract void onOneTouchCircleAddSucceeded(String s, String s1);

        public abstract void onOneTouchCircleLoadFailed(String s);

        public abstract void onOneTouchCircleRemoveFailed(String s);

        public abstract void onOneTouchCircleRemoveSucceeded$16da05f7(String s);
    }


    private Set mCirclesModifiedListeners;
    Context mContext;
    String mCurrentAccountName;
    String mFollowingCircleId;
    String mFollowingCircleName;
    final Object mListenerLock = new Object();
    private int mLogActionSource;
    Set mOneTouchCirclesListeners;
    private String mPlayerIdBeingModified;

    public AddToCirclesHelper(Context context)
    {
        mContext = (Context)Preconditions.checkNotNull(context);
        mCirclesModifiedListeners = new HashSet();
        mOneTouchCirclesListeners = new HashSet();
    }

    private void notifyCirclePickerAddComplete(String s, String s1)
    {
        Object obj = mListenerLock;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mCirclesModifiedListeners.iterator(); iterator.hasNext(); ((CirclesModifiedListener)iterator.next()).onPlayerAddedToCircleByCirclePicker(s, s1)) { }
        break MISSING_BLOCK_LABEL_53;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj;
        JVM INSTR monitorexit ;
    }

    private void notifyCirclePickerModificationFailed(String s)
    {
        Object obj = mListenerLock;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mCirclesModifiedListeners.iterator(); iterator.hasNext(); ((CirclesModifiedListener)iterator.next()).onPlayerCirclePickerModificationFailed(s)) { }
        break MISSING_BLOCK_LABEL_49;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj;
        JVM INSTR monitorexit ;
    }

    private void notifyCirclePickerModificationInProgress(String s)
    {
        Object obj = mListenerLock;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mCirclesModifiedListeners.iterator(); iterator.hasNext(); ((CirclesModifiedListener)iterator.next()).onPlayerCircleModificationInProgress(s)) { }
        break MISSING_BLOCK_LABEL_49;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj;
        JVM INSTR monitorexit ;
    }

    private void notifyCirclePickerRemoveComplete$16da05f7(String s)
    {
        Object obj = mListenerLock;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mCirclesModifiedListeners.iterator(); iterator.hasNext(); ((CirclesModifiedListener)iterator.next()).onPlayerRemovedFromCircleByCirclePicker(s, null)) { }
        break MISSING_BLOCK_LABEL_50;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj;
        JVM INSTR monitorexit ;
    }

    private void notifyOneTouchCircleLoadFailed(String s)
    {
        Object obj = mListenerLock;
        obj;
        JVM INSTR monitorenter ;
        for (Iterator iterator = mOneTouchCirclesListeners.iterator(); iterator.hasNext(); ((OneTouchCirclesListener)iterator.next()).onOneTouchCircleLoadFailed(s)) { }
        break MISSING_BLOCK_LABEL_49;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
        obj;
        JVM INSTR monitorexit ;
    }

    public final void loadData(GoogleApiClient googleapiclient)
    {
        if (Games.Players.getCurrentPlayer(googleapiclient) != null)
        {
            mCurrentAccountName = Games.getCurrentAccountName(googleapiclient);
            if (((Boolean)G.oneTouchAddToCircles.get()).booleanValue())
            {
                mFollowingCircleName = mContext.getResources().getString(0x7f1000a8);
                if (mFollowingCircleName != null)
                {
                    People.GraphApi.loadCircles$3c0ce7d1(googleapiclient, mCurrentAccountName, null).setResultCallback(new ResultCallback() {

                        final AddToCirclesHelper this$0;

                        public final volatile void onResult(Result result)
                        {
                            result = (com.google.android.gms.people.Graph.LoadCirclesResult)result;
                            if (!result.getStatus().isSuccess()) goto _L2; else goto _L1
_L1:
                            CircleBuffer circlebuffer;
                            int j;
                            circlebuffer = result.getCircles();
                            j = circlebuffer.getCount();
                            int i = 0;
_L8:
                            if (i >= j) goto _L4; else goto _L3
_L3:
                            if (mFollowingCircleId != null) goto _L4; else goto _L5
_L5:
                            Circle circle = circlebuffer.get(i);
                            if (mFollowingCircleName.equals(circle.getCircleName()))
                            {
                                mFollowingCircleId = circle.getCircleId();
                            }
                              goto _L6
_L2:
                            GamesLog.w("AddToCirclesHelper", "Failed to load circles.");
_L4:
                            result.release();
                            return;
                            Exception exception;
                            exception;
                            result.release();
                            throw exception;
_L6:
                            i++;
                            if (true) goto _L8; else goto _L7
_L7:
                        }

            
            {
                this$0 = AddToCirclesHelper.this;
                super();
            }
                    });
                    return;
                }
            }
        }
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        boolean flag1 = true;
        if (i == 1)
        {
            if (j == -1)
            {
                intent = CircleSelection.getResults(intent);
                boolean flag = flag1;
                Object obj;
                ArrayList arraylist;
                if (intent.getAddedCirclesDelta().isEmpty())
                {
                    if (!intent.getRemovedCirclesDelta().isEmpty())
                    {
                        flag = flag1;
                    } else
                    {
                        flag = false;
                    }
                }
                GamesPlayLogger.logAddToCirclesAction(mContext, "", mCurrentAccountName, mLogActionSource, flag);
                arraylist = intent.getSelectedCircles();
                obj = null;
                intent = obj;
                if (arraylist != null)
                {
                    intent = obj;
                    if (arraylist.size() > 0)
                    {
                        intent = new StringBuilder();
                        for (i = 0; i < arraylist.size(); i++)
                        {
                            if (i > 0)
                            {
                                intent.append(", ");
                            }
                            intent.append(((AudienceMember)arraylist.get(i)).mDisplayName);
                        }

                        intent = intent.toString();
                    }
                }
                if (intent == null)
                {
                    notifyCirclePickerRemoveComplete$16da05f7(mPlayerIdBeingModified);
                } else
                {
                    notifyCirclePickerAddComplete(mPlayerIdBeingModified, intent);
                }
            } else
            {
                notifyCirclePickerModificationFailed(mPlayerIdBeingModified);
            }
            mPlayerIdBeingModified = null;
        }
    }

    public final void onPlayerFollowClicked(GamesFragment gamesfragment, GoogleApiClient googleapiclient, final int logActionSource, Player player)
    {
        final String playerId = player.getPlayerId();
        if (mFollowingCircleId != null)
        {
            gamesfragment = new ArrayList();
            gamesfragment.add(PeopleUtils.gaiaIdToPeopleQualifiedId(playerId));
            notifyCirclePickerModificationInProgress(playerId);
            People.GraphUpdateApi.addPeopleToCircle$6bf529d6(googleapiclient, mCurrentAccountName, mFollowingCircleId, gamesfragment).setResultCallback(new ResultCallback() {

                final AddToCirclesHelper this$0;
                final int val$logActionSource;
                final String val$playerId;

                public final volatile void onResult(Result result)
                {
                    String s;
                    Object obj;
                    Object obj1;
                    if (!((com.google.android.gms.people.GraphUpdate.AddPeopleToCircleResult)result).getStatus().isSuccess())
                    {
                        break MISSING_BLOCK_LABEL_116;
                    }
                    GamesPlayLogger.logAddToCirclesAction(mContext, "", mCurrentAccountName, logActionSource, true);
                    obj1 = AddToCirclesHelper.this;
                    s = playerId;
                    obj = mFollowingCircleName;
                    result = ((Result) (((AddToCirclesHelper) (obj1)).mListenerLock));
                    result;
                    JVM INSTR monitorenter ;
                    for (obj1 = ((AddToCirclesHelper) (obj1)).mOneTouchCirclesListeners.iterator(); ((Iterator) (obj1)).hasNext(); ((OneTouchCirclesListener)((Iterator) (obj1)).next()).onOneTouchCircleAddSucceeded(s, ((String) (obj)))) { }
                    break MISSING_BLOCK_LABEL_113;
                    Exception exception;
                    exception;
                    result;
                    JVM INSTR monitorexit ;
                    throw exception;
                    result;
                    JVM INSTR monitorexit ;
                    return;
                    GamesLog.w("AddToCirclesHelper", "Failed to add player to circle.");
                    obj = AddToCirclesHelper.this;
                    exception = playerId;
                    result = ((Result) (((AddToCirclesHelper) (obj)).mListenerLock));
                    result;
                    JVM INSTR monitorenter ;
                    for (obj = ((AddToCirclesHelper) (obj)).mOneTouchCirclesListeners.iterator(); ((Iterator) (obj)).hasNext(); ((OneTouchCirclesListener)((Iterator) (obj)).next()).onOneTouchCircleAddFailed(exception)) { }
                    break MISSING_BLOCK_LABEL_182;
                    exception;
                    result;
                    JVM INSTR monitorexit ;
                    throw exception;
                    result;
                    JVM INSTR monitorexit ;
                }

            
            {
                this$0 = AddToCirclesHelper.this;
                logActionSource = i;
                playerId = s;
                super();
            }
            });
            return;
        }
        if (((Boolean)G.oneTouchAddToCircles.get()).booleanValue())
        {
            notifyOneTouchCircleLoadFailed(playerId);
        }
        gamesfragment.registerOnActivityResultListener(this, new int[] {
            1
        });
        googleapiclient = UiUtils.createAddUpdateCirclesIntent(mContext, mCurrentAccountName, player.getPlayerId(), null);
        mPlayerIdBeingModified = player.getPlayerId();
        mLogActionSource = logActionSource;
        UiUtils.startActivityForResultFromFragment(gamesfragment, googleapiclient, 1);
    }

    public final void onPlayerUnfollowClicked(GoogleApiClient googleapiclient, final Player playerId)
    {
        if (mFollowingCircleId != null)
        {
            playerId = playerId.getPlayerId();
            notifyCirclePickerModificationInProgress(playerId);
            ArrayList arraylist = new ArrayList();
            arraylist.add(mFollowingCircleId);
            People.GraphUpdateApi.updatePersonCircles$50c1611b(googleapiclient, mCurrentAccountName, PeopleUtils.gaiaIdToPeopleQualifiedId(playerId), arraylist).setResultCallback(new ResultCallback() {

                final AddToCirclesHelper this$0;
                final String val$playerId;

                public final volatile void onResult(Result result)
                {
                    String s;
                    Object obj;
                    if (!((com.google.android.gms.people.GraphUpdate.UpdatePersonCircleResult)result).getStatus().isSuccess())
                    {
                        break MISSING_BLOCK_LABEL_77;
                    }
                    obj = AddToCirclesHelper.this;
                    s = playerId;
                    result = ((Result) (((AddToCirclesHelper) (obj)).mListenerLock));
                    result;
                    JVM INSTR monitorenter ;
                    for (obj = ((AddToCirclesHelper) (obj)).mOneTouchCirclesListeners.iterator(); ((Iterator) (obj)).hasNext(); ((OneTouchCirclesListener)((Iterator) (obj)).next())._mth16da05f7(s)) { }
                    break MISSING_BLOCK_LABEL_74;
                    Exception exception;
                    exception;
                    result;
                    JVM INSTR monitorexit ;
                    throw exception;
                    result;
                    JVM INSTR monitorexit ;
                    return;
                    GamesLog.w("AddToCirclesHelper", "Failed to remove player from circle.");
                    obj = AddToCirclesHelper.this;
                    exception = playerId;
                    result = ((Result) (((AddToCirclesHelper) (obj)).mListenerLock));
                    result;
                    JVM INSTR monitorenter ;
                    for (obj = ((AddToCirclesHelper) (obj)).mOneTouchCirclesListeners.iterator(); ((Iterator) (obj)).hasNext(); ((OneTouchCirclesListener)((Iterator) (obj)).next()).onOneTouchCircleRemoveFailed(exception)) { }
                    break MISSING_BLOCK_LABEL_143;
                    exception;
                    result;
                    JVM INSTR monitorexit ;
                    throw exception;
                    result;
                    JVM INSTR monitorexit ;
                }

            
            {
                this$0 = AddToCirclesHelper.this;
                playerId = s;
                super();
            }
            });
        }
    }

    public final void registerCircleModificationListener(CirclesModifiedListener circlesmodifiedlistener)
    {
        synchronized (mListenerLock)
        {
            mCirclesModifiedListeners.add(circlesmodifiedlistener);
        }
        return;
        circlesmodifiedlistener;
        obj;
        JVM INSTR monitorexit ;
        throw circlesmodifiedlistener;
    }

    public final void registerOneTouchCirclesListener(OneTouchCirclesListener onetouchcircleslistener)
    {
        synchronized (mListenerLock)
        {
            mOneTouchCirclesListeners.add(onetouchcircleslistener);
        }
        return;
        onetouchcircleslistener;
        obj;
        JVM INSTR monitorexit ;
        throw onetouchcircleslistener;
    }

    public final void restoreSavedInstanceState(GamesFragment gamesfragment, Bundle bundle)
    {
        if (bundle != null)
        {
            mPlayerIdBeingModified = bundle.getString("savedStateModifyingPlayerId");
            mLogActionSource = bundle.getInt("savedStateModifyingPlayerLogSource");
            if (mPlayerIdBeingModified != null)
            {
                gamesfragment.registerOnActivityResultListener(this, new int[] {
                    1
                });
            }
        }
    }

    public final void saveInstanceState(Bundle bundle)
    {
        if (mPlayerIdBeingModified != null)
        {
            bundle.putString("savedStateModifyingPlayerId", mPlayerIdBeingModified);
            bundle.putInt("savedStateModifyingPlayerLogSource", mLogActionSource);
        }
    }
}
