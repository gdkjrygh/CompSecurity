// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.activities;


// Referenced classes of package com.cardinalblue.android.piccollage.activities:
//            BaseActivity, AbsDrawerActivity

public class BaseFragmentActivity extends BaseActivity
{

    public BaseFragmentActivity()
    {
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        if (AbsDrawerActivity.b())
        {
            AbsDrawerActivity.a(true);
        }
    }

    protected void onResume()
    {
        super.onResume();
        if (!(this instanceof AbsDrawerActivity))
        {
            AbsDrawerActivity.a(false);
        }
    }
}
