// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.appcontent.AppContentAction;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.AddToCirclesHelper;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentAction, ExtendedAppContentAnnotation, AddToCirclesSharedObject, AppContentFragment, 
//            ExtendedAppContentSection

public final class EditCirclesForPlayerAction extends ExtendedAppContentAction
    implements com.google.android.gms.games.ui.AddToCirclesHelper.CirclesModifiedListener, com.google.android.gms.games.ui.AddToCirclesHelper.OneTouchCirclesListener
{

    private final AddToCirclesHelper mAddToCirclesHelper;
    private boolean mCanClickToUnfollow;
    private String mCircleNames;
    private int mFallbackMode;
    private int mMode;
    private final String mOriginalTitle;
    private final String mPlayerId = getAction().getExtras().getString("playerId");

    public EditCirclesForPlayerAction(ExtendedAppContentSection extendedappcontentsection, AppContentAction appcontentaction, ExtendedAppContentAction.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentaction, eventlistener);
        mMode = 0;
        mFallbackMode = 0;
        mOriginalTitle = super.mAnnotation.mTitle;
        mAddToCirclesHelper = ((AddToCirclesSharedObject)mFragment.getSharedObject(com/google/android/gms/games/ui/appcontent/AddToCirclesSharedObject)).mHelper;
        mAddToCirclesHelper.registerCircleModificationListener(this);
        mAddToCirclesHelper.registerOneTouchCirclesListener(this);
        setMode(1);
    }

    private PowerUpPlayLogger getLogger()
    {
        if (mContext instanceof com.google.android.gms.games.app.PowerUpPlayLogger.PowerUpPlayLoggerProvider)
        {
            return ((com.google.android.gms.games.app.PowerUpPlayLogger.PowerUpPlayLoggerProvider)mContext).getLogger();
        } else
        {
            return null;
        }
    }

    private void setMode(int i)
    {
        ExtendedAppContentAnnotation extendedappcontentannotation;
        Bundle bundle;
        boolean flag;
        flag = true;
        if (mMode == i)
        {
            return;
        }
        mMode = i;
        if (mMode != 2)
        {
            if (mFallbackMode != 0 && mFallbackMode != mMode)
            {
                mFragment.invalidateAppContentCache();
            }
            mFallbackMode = mMode;
        }
        extendedappcontentannotation = super.mAnnotation;
        extendedappcontentannotation.mTitle = "";
        bundle = new Bundle();
        extendedappcontentannotation.mModifiers = bundle;
        mMode;
        JVM INSTR tableswitch 1 3: default 112
    //                   1 146
    //                   2 206
    //                   3 238;
           goto _L1 _L2 _L3 _L4
_L1:
        GamesLog.e("EditCirclesAct", (new StringBuilder("Invalid mode : ")).append(mMode).toString());
_L6:
        mEventListener.onActionChanged$5ea2ff71();
        return;
_L2:
        bundle.putString("textColor", (new StringBuilder("#")).append(Integer.toHexString(mContext.getResources().getColor(0x7f0b0257))).toString());
        bundle.putString("backgroundResourceId", "FOLLOW_BUTTON");
        extendedappcontentannotation.mTitle = mOriginalTitle;
        setClickDisabled(false);
        continue; /* Loop/switch isn't completed */
_L3:
        bundle.putString("showSpinner", Boolean.TRUE.toString());
        bundle.putString("hideTitle", Boolean.TRUE.toString());
        setClickDisabled(true);
        continue; /* Loop/switch isn't completed */
_L4:
        bundle.putString("textColor", (new StringBuilder("#")).append(Integer.toHexString(mContext.getResources().getColor(0x7f0b00dc))).toString());
        bundle.putString("backgroundResourceId", "FRIEND_BUTTON");
        extendedappcontentannotation.mTitle = mCircleNames;
        if (mCanClickToUnfollow)
        {
            flag = false;
        }
        setClickDisabled(flag);
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void execute()
    {
        notifyStarted();
        final int mode = mMode;
        setMode(2);
        AppContentFragment appcontentfragment = mFragment;
        appcontentfragment.startNewLoader(new AppContentFragment.PlayerLoader(appcontentfragment, mPlayerId, new AppContentFragment.PlayerLoadedCallback() {

            final EditCirclesForPlayerAction this$0;
            final int val$mode;

            public final void onPlayerLoadFailed()
            {
                setMode(mFallbackMode);
                notifyFinished();
            }

            public final void onPlayerLoaded(Player player)
            {
                boolean flag = true;
                if (mode != 3) goto _L2; else goto _L1
_L1:
                if (mCanClickToUnfollow)
                {
                    mAddToCirclesHelper.onPlayerUnfollowClicked(mFragment.getGoogleApiClient(), player);
                    flag = false;
                }
_L4:
                if (flag)
                {
                    setMode(mFallbackMode);
                    notifyFinished();
                }
                return;
_L2:
                if (mode == 1)
                {
                    mAddToCirclesHelper.onPlayerFollowClicked(mFragment, mFragment.getGoogleApiClient(), mFragment.getLogId("CIRCLES_ACTION_SOURCE"), player);
                    flag = false;
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                this$0 = EditCirclesForPlayerAction.this;
                mode = i;
                super();
            }
        }));
    }

    public final int getLogflowUiElementType()
    {
        return 1142;
    }

    public final Bundle getSaveBundle()
    {
        Bundle bundle = new Bundle();
        bundle.putBoolean("CAN_CLICK_TO_UNFOLLOW", mCanClickToUnfollow);
        bundle.putString("CIRCLE_NAMES", mCircleNames);
        bundle.putInt("MODE", mFallbackMode);
        return bundle;
    }

    public final String getSaveKey()
    {
        return mPlayerId;
    }

    public final void loadFromSaveBundle(Bundle bundle)
    {
        mCanClickToUnfollow = bundle.getBoolean("CAN_CLICK_TO_UNFOLLOW", false);
        mCircleNames = bundle.getString("CIRCLE_NAMES");
        setMode(bundle.getInt("MODE", 1));
    }

    public final void onOneTouchCircleAddFailed(String s)
    {
        if (!s.equals(mPlayerId))
        {
            return;
        }
        setMode(mFallbackMode);
        s = getLogger();
        if (s != null)
        {
            s.logOneTouchCirclesAction(3, mFragment.getLogId("ACTION_TYPE"));
        }
        notifyFinished();
    }

    public final void onOneTouchCircleAddSucceeded(String s, String s1)
    {
        if (!s.equals(mPlayerId))
        {
            return;
        }
        mCircleNames = s1;
        mCanClickToUnfollow = true;
        setMode(3);
        s = getLogger();
        if (s != null)
        {
            s.logOneTouchCirclesAction(1, mFragment.getLogId("ACTION_TYPE"));
        }
        notifyFinished();
    }

    public final void onOneTouchCircleLoadFailed(String s)
    {
        if (s.equals(mPlayerId))
        {
            if ((s = getLogger()) != null)
            {
                s.logOneTouchCirclesAction(5, mFragment.getLogId("ACTION_TYPE"));
                return;
            }
        }
    }

    public final void onOneTouchCircleRemoveFailed(String s)
    {
        if (!s.equals(mPlayerId))
        {
            return;
        }
        setMode(mFallbackMode);
        s = getLogger();
        if (s != null)
        {
            s.logOneTouchCirclesAction(4, mFragment.getLogId("ACTION_TYPE"));
        }
        notifyFinished();
    }

    public final void onOneTouchCircleRemoveSucceeded$16da05f7(String s)
    {
        if (!s.equals(mPlayerId))
        {
            return;
        }
        mCanClickToUnfollow = false;
        setMode(1);
        s = getLogger();
        if (s != null)
        {
            s.logOneTouchCirclesAction(2, mFragment.getLogId("ACTION_TYPE"));
        }
        notifyFinished();
    }

    public final void onPlayerAddedToCircleByCirclePicker(String s, String s1)
    {
        if (!s.equals(mPlayerId))
        {
            return;
        } else
        {
            mCircleNames = s1;
            setMode(3);
            notifyFinished();
            return;
        }
    }

    public final void onPlayerCircleModificationInProgress(String s)
    {
        if (!s.equals(mPlayerId))
        {
            return;
        } else
        {
            setMode(2);
            return;
        }
    }

    public final void onPlayerCirclePickerModificationFailed(String s)
    {
        if (!s.equals(mPlayerId))
        {
            return;
        } else
        {
            setMode(mFallbackMode);
            notifyFinished();
            return;
        }
    }

    public final void onPlayerRemovedFromCircleByCirclePicker(String s, String s1)
    {
        if (!s.equals(mPlayerId))
        {
            return;
        } else
        {
            setMode(1);
            notifyFinished();
            return;
        }
    }




}
