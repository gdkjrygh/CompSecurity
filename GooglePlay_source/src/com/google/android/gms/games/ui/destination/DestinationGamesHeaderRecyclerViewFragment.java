// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.View;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.ui.GamesHeaderRecyclerViewFragment;
import com.google.android.gms.games.ui.destination.main.MainActivity;

// Referenced classes of package com.google.android.gms.games.ui.destination:
//            DestinationFragmentActivityBase, DestinationFragmentActivity, LoggablePage

public abstract class DestinationGamesHeaderRecyclerViewFragment extends GamesHeaderRecyclerViewFragment
    implements com.google.android.gms.games.app.PowerUpPlayLogger.PowerUpPlayLoggerProvider
{

    public DestinationFragmentActivity mParent;

    public DestinationGamesHeaderRecyclerViewFragment()
    {
    }

    public DestinationGamesHeaderRecyclerViewFragment(int i)
    {
        super(i);
    }

    public final PowerUpPlayLogger getLogger()
    {
        return ((DestinationFragmentActivityBase) (mParent)).mPlayLogger;
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        Asserts.checkState(super.mActivity instanceof DestinationFragmentActivity);
        mParent = (DestinationFragmentActivity)super.mActivity;
    }

    public void onResume()
    {
        super.onResume();
        if (super.mUserVisibleHint && (this instanceof LoggablePage))
        {
            ((LoggablePage)this).logPageView(((DestinationFragmentActivityBase) (mParent)).mPlayLogger);
        }
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = super.mActivity;
        if (view instanceof MainActivity)
        {
            ((MainActivity)view).onCurrentViewCreated();
        }
    }

    public final void setUserVisibleHint(boolean flag)
    {
        boolean flag1 = super.mUserVisibleHint;
        super.setUserVisibleHint(flag);
        if (super.mResumed && !flag1 && flag && (this instanceof LoggablePage))
        {
            ((LoggablePage)this).logPageView(((DestinationFragmentActivityBase) (mParent)).mPlayLogger);
        }
    }
}
