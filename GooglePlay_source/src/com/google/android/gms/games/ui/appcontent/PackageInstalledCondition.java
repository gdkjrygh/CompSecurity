// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.appcontent.AppContentCondition;
import com.google.android.gms.games.client.games.GameFirstParty;
import com.google.android.gms.games.internal.GamesLog;

// Referenced classes of package com.google.android.gms.games.ui.appcontent:
//            ExtendedAppContentCondition, ExtendedAppContentSection, AppContentFragment

public final class PackageInstalledCondition extends ExtendedAppContentCondition
{

    int mLoadState;
    String mPackageName;

    public PackageInstalledCondition(ExtendedAppContentSection extendedappcontentsection, AppContentCondition appcontentcondition, ExtendedAppContentCondition.EventListener eventlistener)
    {
        super(extendedappcontentsection, appcontentcondition, eventlistener);
        mLoadState = 0;
        mPackageName = null;
    }

    public final boolean evaluate()
    {
        if (mLoadState != 0) goto _L2; else goto _L1
_L1:
        Object obj = mCondition.getPredicateParameters().getString("applicationId");
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        GamesLog.e("PkgInstalledCond", "Missing application id");
_L6:
        return false;
_L4:
        mLoadState = 1;
        mSection.mFragment.getGame(((String) (obj)), new AppContentFragment.GameLoadedCallback() {

            final PackageInstalledCondition this$0;

            public final void onGameLoaded(GameFirstParty gamefirstparty)
            {
                mPackageName = gamefirstparty.getGame().getInstancePackageName();
                if (mLoadState == 2)
                {
                    mEventListener.onConditionChanged$7a33ab32();
                }
            }

            
            {
                this$0 = PackageInstalledCondition.this;
                super();
            }
        });
        mLoadState = 2;
_L2:
        if (mPackageName == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = ((Fragment) (getFragment())).mActivity.getPackageManager();
        ((PackageManager) (obj)).getApplicationInfo(mPackageName, 0);
        boolean flag = true;
_L7:
        if (flag == getExpectedBoolean())
        {
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        android.content.pm.PackageManager.NameNotFoundException namenotfoundexception;
        namenotfoundexception;
        flag = false;
          goto _L7
    }
}
