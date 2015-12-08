// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.graphics.Bitmap;
import android.os.Handler;

// Referenced classes of package kik.android.chat.fragment:
//            ViewPictureFragment, th

final class tg
    implements com.android.volley.r.b
{

    final ViewPictureFragment a;

    tg(ViewPictureFragment viewpicturefragment)
    {
        a = viewpicturefragment;
        super();
    }

    public final void a(Object obj)
    {
        obj = (Bitmap)obj;
        ViewPictureFragment.d(a).post(new th(this, ((Bitmap) (obj))));
    }
}
