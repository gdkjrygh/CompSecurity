// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.view.MotionEvent;

// Referenced classes of package com.aviary.android.feather.sdk.widget:
//            AviaryImageRestoreSwitcher

class a
    implements android.view.ener
{

    final AviaryImageRestoreSwitcher a;

    public boolean onDown(MotionEvent motionevent)
    {
        AviaryImageRestoreSwitcher.a.a("onDown");
        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        AviaryImageRestoreSwitcher.a.a("onFling");
        return false;
    }

    public void onLongPress(MotionEvent motionevent)
    {
        AviaryImageRestoreSwitcher.a.a("onLongPress");
        AviaryImageRestoreSwitcher.a(a, c);
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        AviaryImageRestoreSwitcher.a.a("onScroll");
        return false;
    }

    public void onShowPress(MotionEvent motionevent)
    {
        AviaryImageRestoreSwitcher.a.a("onShowPress");
        AviaryImageRestoreSwitcher.a(a, b);
    }

    public boolean onSingleTapUp(MotionEvent motionevent)
    {
        AviaryImageRestoreSwitcher.a.a("onSingleTapUp");
        return false;
    }

    (AviaryImageRestoreSwitcher aviaryimagerestoreswitcher)
    {
        a = aviaryimagerestoreswitcher;
        super();
    }
}
