// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package roboguice.test.shadow;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;

public class ShadowFragment
{

    protected FragmentActivity activity;
    protected View view;

    public ShadowFragment()
    {
    }

    public FragmentActivity getActivity()
    {
        return activity;
    }

    public View getView()
    {
        return view;
    }

    public void onAttach(Activity activity1)
    {
        activity = (FragmentActivity)activity1;
    }

    public void onViewCreated(View view1, Bundle bundle)
    {
        view = view1;
    }
}
