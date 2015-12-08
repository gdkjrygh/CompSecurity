// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.caption;

import android.view.MotionEvent;

// Referenced classes of package com.snapchat.android.ui.caption:
//            FatCaptionEditText

final class <init> extends android.view.eOnGestureListener
{

    private FatCaptionEditText a;

    public final void onLongPress(MotionEvent motionevent)
    {
        if (a.n && !a.B)
        {
            FatCaptionEditText.a(a);
            a.B = true;
            a.performLongClick();
        }
    }

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        a.B = false;
        FatCaptionEditText.a(a);
        return true;
    }

    (FatCaptionEditText fatcaptionedittext)
    {
        a = fatcaptionedittext;
        super();
    }
}
