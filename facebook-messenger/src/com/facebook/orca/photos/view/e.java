// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.view;

import android.view.MotionEvent;

// Referenced classes of package com.facebook.orca.photos.view:
//            PhotoViewActivity

class e extends android.view.GestureDetector.SimpleOnGestureListener
{

    final PhotoViewActivity a;

    e(PhotoViewActivity photoviewactivity)
    {
        a = photoviewactivity;
        super();
    }

    public boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        if (PhotoViewActivity.k(a))
        {
            PhotoViewActivity.l(a);
        } else
        {
            PhotoViewActivity.a(a);
        }
        return true;
    }
}
