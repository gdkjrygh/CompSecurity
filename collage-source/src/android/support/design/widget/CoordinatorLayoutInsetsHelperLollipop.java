// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.ViewCompat;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayoutInsetsHelper

class CoordinatorLayoutInsetsHelperLollipop
    implements CoordinatorLayoutInsetsHelper
{

    CoordinatorLayoutInsetsHelperLollipop()
    {
    }

    public void setupForWindowInsets(View view, OnApplyWindowInsetsListener onapplywindowinsetslistener)
    {
        if (ViewCompat.getFitsSystemWindows(view))
        {
            ViewCompat.setOnApplyWindowInsetsListener(view, onapplywindowinsetslistener);
            view.setSystemUiVisibility(1280);
        }
    }
}
