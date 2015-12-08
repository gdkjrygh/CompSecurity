// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.util;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.widget.Toast;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.people.data.AudienceMember;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.people.Graph;
import com.google.android.gms.people.People;
import com.google.android.gms.people.internal.PeopleUtils;
import com.google.android.gms.people.model.Circle;
import com.google.android.gms.people.model.CircleBuffer;
import com.google.android.gms.people.model.Person;
import com.google.android.gms.people.model.PersonBuffer;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.games.ui.util:
//            UiUtils

public final class ManageCirclesHelper
{
    public static interface ContinueProcessingCallback
    {

        public abstract boolean canContinueProcessing();
    }


    private final Activity mActivity;
    String mBelongingCircleIds[];
    private ArrayList mBelongingCircles;
    final ContinueProcessingCallback mCallback;
    boolean mCanceled;
    private final String mCurrentAccountName;
    private final Fragment mFragment;
    private final GoogleApiClient mGoogleApiClient;
    boolean mHasLoadedBelongingCircleIds;
    boolean mHasLoadedCircles;
    ArrayList mPlayerCircles;
    private final int mRequestCode;
    private Player mTargetPlayer;

    public ManageCirclesHelper(Player player, ContinueProcessingCallback continueprocessingcallback, Activity activity, GoogleApiClient googleapiclient, String s, int i)
    {
        mTargetPlayer = player;
        mCallback = continueprocessingcallback;
        mFragment = null;
        mActivity = activity;
        mGoogleApiClient = googleapiclient;
        mCurrentAccountName = s;
        mRequestCode = 1;
    }

    private ManageCirclesHelper(Player player, ContinueProcessingCallback continueprocessingcallback, Fragment fragment, GoogleApiClient googleapiclient, String s, int i)
    {
        mTargetPlayer = player;
        mCallback = continueprocessingcallback;
        mFragment = fragment;
        mActivity = null;
        mGoogleApiClient = googleapiclient;
        mCurrentAccountName = s;
        mRequestCode = i;
    }

    public static ManageCirclesHelper startHelperFromFragment(Player player, ContinueProcessingCallback continueprocessingcallback, Fragment fragment, GoogleApiClient googleapiclient, String s, int i)
    {
        player = new ManageCirclesHelper(player, continueprocessingcallback, fragment, googleapiclient, s, i);
        player.start();
        return player;
    }

    public final void cancel()
    {
        if (mCanceled)
        {
            throw new IllegalStateException("Canceling a previously canceled ManageCirclesHelper instance");
        } else
        {
            mCanceled = true;
            return;
        }
    }

    final void computeBelongingCircles()
    {
        if (mCanceled)
        {
            GamesLog.d("ManageCirclesHelper", "computeBelongingCircles: Canceled! Bailing out...");
        } else
        if (mHasLoadedCircles && mHasLoadedBelongingCircleIds)
        {
            mBelongingCircles = new ArrayList();
            if (mBelongingCircleIds != null)
            {
                int i = 0;
                for (int k = mBelongingCircleIds.length; i < k; i++)
                {
                    String s = mBelongingCircleIds[i];
                    int j = 0;
                    for (int l = mPlayerCircles.size(); j < l; j++)
                    {
                        AudienceMember audiencemember = (AudienceMember)mPlayerCircles.get(j);
                        if (s.equals(audiencemember.mCircleId))
                        {
                            mBelongingCircles.add(audiencemember);
                        }
                    }

                }

            }
            boolean flag;
            if (!mCanceled)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Asserts.checkState(flag);
            if (mFragment != null)
            {
                android.content.Intent intent = UiUtils.createAddUpdateCirclesIntent(mFragment.mActivity, mCurrentAccountName, mTargetPlayer.getPlayerId(), mBelongingCircles);
                UiUtils.startActivityForResultFromFragment(mFragment, intent, mRequestCode);
                return;
            }
            if (mActivity != null)
            {
                android.content.Intent intent1 = UiUtils.createAddUpdateCirclesIntent(mActivity, mCurrentAccountName, mTargetPlayer.getPlayerId(), mBelongingCircles);
                mActivity.startActivityForResult(intent1, mRequestCode);
                return;
            } else
            {
                throw new IllegalStateException("mFragment and mActivity cannot both be null.");
            }
        }
    }

    final void showManageCirclesFailure()
    {
        Object obj;
        if (mFragment != null)
        {
            obj = mFragment.mActivity;
        } else
        {
            obj = mActivity;
        }
        Toast.makeText(((android.content.Context) (obj)), 0x7f100217, 1).show();
    }

    public final void start()
    {
        if (mCanceled)
        {
            throw new IllegalStateException("Restarting a previously canceled ManageCirclesHelper instance");
        }
        mPlayerCircles = null;
        mHasLoadedCircles = false;
        mBelongingCircleIds = null;
        mHasLoadedBelongingCircleIds = false;
        mBelongingCircles = null;
        mCanceled = false;
        if (!mGoogleApiClient.isConnected())
        {
            GamesLog.w("ManageCirclesHelper", "ManageCirclesHelper.start: PeopleClient not connected!");
            return;
        } else
        {
            People.GraphApi.loadCircles$3c0ce7d1(mGoogleApiClient, mCurrentAccountName, null).setResultCallback(new ResultCallback() {

                final ManageCirclesHelper this$0;

                public final volatile void onResult(Result result)
                {
                    Object obj;
                    obj = (com.google.android.gms.people.Graph.LoadCirclesResult)result;
                    result = ManageCirclesHelper.this;
                    Status status = ((com.google.android.gms.people.Graph.LoadCirclesResult) (obj)).getStatus();
                    obj = ((com.google.android.gms.people.Graph.LoadCirclesResult) (obj)).getCircles();
                    if (((ManageCirclesHelper) (result)).mCanceled)
                    {
                        GamesLog.d("ManageCirclesHelper", "onCirclesLoaded: Canceled! Ignoring this callback...");
                        return;
                    }
                    if (!status.isSuccess())
                    {
                        GamesLog.w("ManageCirclesHelper", (new StringBuilder("onCirclesLoaded: error status: ")).append(status).toString());
                        result.showManageCirclesFailure();
                        return;
                    }
                    if (((ManageCirclesHelper) (result)).mCallback != null && !((ManageCirclesHelper) (result)).mCallback.canContinueProcessing())
                    {
                        GamesLog.w("ManageCirclesHelper", "onCirclesLoaded: processing halted at client's request");
                        result.showManageCirclesFailure();
                        return;
                    }
                    if (((ManageCirclesHelper) (result)).mPlayerCircles != null) goto _L2; else goto _L1
_L1:
                    result.mPlayerCircles = new ArrayList();
_L4:
                    Object obj1;
                    for (Iterator iterator = ((CircleBuffer) (obj)).iterator(); iterator.hasNext(); ((ManageCirclesHelper) (result)).mPlayerCircles.add(obj1))
                    {
                        obj1 = (Circle)iterator.next();
                        obj1 = AudienceMember.forCircle(((Circle) (obj1)).getCircleId(), ((Circle) (obj1)).getCircleName());
                    }

                    break MISSING_BLOCK_LABEL_195;
                    result;
                    ((CircleBuffer) (obj)).release();
                    throw result;
_L2:
                    ((ManageCirclesHelper) (result)).mPlayerCircles.clear();
                    if (true) goto _L4; else goto _L3
_L3:
                    ((CircleBuffer) (obj)).release();
                    result.mHasLoadedCircles = true;
                    result.computeBelongingCircles();
                    return;
                }

            
            {
                this$0 = ManageCirclesHelper.this;
                super();
            }
            });
            com.google.android.gms.people.Graph.LoadPeopleOptions loadpeopleoptions = new com.google.android.gms.people.Graph.LoadPeopleOptions();
            ArrayList arraylist = new ArrayList();
            arraylist.add(PeopleUtils.gaiaIdToPeopleQualifiedId(mTargetPlayer.getPlayerId()));
            loadpeopleoptions.mQualifiedIds = arraylist;
            People.GraphApi.loadPeople$7acb640d(mGoogleApiClient, mCurrentAccountName, loadpeopleoptions).setResultCallback(new ResultCallback() {

                final ManageCirclesHelper this$0;

                public final volatile void onResult(Result result)
                {
                    Object obj;
                    obj = (com.google.android.gms.people.Graph.LoadPeopleResult)result;
                    result = ManageCirclesHelper.this;
                    Status status = ((com.google.android.gms.people.Graph.LoadPeopleResult) (obj)).getStatus();
                    obj = ((com.google.android.gms.people.Graph.LoadPeopleResult) (obj)).getPeople();
                    if (((ManageCirclesHelper) (result)).mCanceled)
                    {
                        GamesLog.d("ManageCirclesHelper", "onPeopleLoaded: Canceled! Ignoring this callback...");
                        return;
                    }
                    if (!status.isSuccess())
                    {
                        GamesLog.w("ManageCirclesHelper", (new StringBuilder("onPeopleLoaded: error status: ")).append(status).toString());
                        result.showManageCirclesFailure();
                        return;
                    }
                    if (((ManageCirclesHelper) (result)).mCallback != null && !((ManageCirclesHelper) (result)).mCallback.canContinueProcessing())
                    {
                        GamesLog.w("ManageCirclesHelper", "onCirclesLoaded: processing halted at client's request");
                        result.showManageCirclesFailure();
                        return;
                    }
                    if (((PersonBuffer) (obj)).getCount() > 0)
                    {
                        result.mBelongingCircleIds = ((PersonBuffer) (obj)).get(0).getBelongingCircleIds();
                    }
                    ((PersonBuffer) (obj)).release();
                    result.mHasLoadedBelongingCircleIds = true;
                    result.computeBelongingCircles();
                    return;
                    result;
                    ((PersonBuffer) (obj)).release();
                    throw result;
                }

            
            {
                this$0 = ManageCirclesHelper.this;
                super();
            }
            });
            return;
        }
    }
}
