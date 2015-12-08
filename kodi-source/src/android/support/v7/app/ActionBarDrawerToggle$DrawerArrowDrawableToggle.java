// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Activity;
import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.view.Window;

// Referenced classes of package android.support.v7.app:
//            DrawerArrowDrawable, ActionBarDrawerToggle

static class mActivity extends DrawerArrowDrawable
    implements mActivity
{

    private final Activity mActivity;

    boolean isLayoutRtl()
    {
        return ViewCompat.getLayoutDirection(mActivity.getWindow().getDecorView()) == 1;
    }

    public void setPosition(float f)
    {
        if (f != 1.0F) goto _L2; else goto _L1
_L1:
        setVerticalMirror(true);
_L4:
        super.setProgress(f);
        return;
_L2:
        if (f == 0.0F)
        {
            setVerticalMirror(false);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public (Activity activity, Context context)
    {
        super(context);
        mActivity = activity;
    }
}
