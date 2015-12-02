// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.photos.b;

import android.content.Context;
import com.facebook.a.a;
import com.facebook.f.n;
import com.facebook.inject.d;
import com.facebook.j.a.a.e;
import com.facebook.prefs.shared.ae;

public class f extends d
{

    private static final ae a = n.a("messenger_new_photo_upload_native_resize_android");
    private final com.facebook.prefs.shared.d b;
    private final Context c;
    private final a d;

    public f(com.facebook.prefs.shared.d d1, Context context, a a1)
    {
        b = d1;
        c = context;
        d = a1;
    }

    public com.facebook.j.a.a.a a()
    {
        if (f())
        {
            return new e(c);
        } else
        {
            return new com.facebook.j.a.a.d(c, d);
        }
    }

    public Object b()
    {
        return a();
    }

    public boolean f()
    {
        System.loadLibrary("fb_nativejpeg");
        boolean flag = true;
_L1:
        UnsatisfiedLinkError unsatisfiedlinkerror;
        return b.a(a, false) && flag;
        unsatisfiedlinkerror;
        flag = false;
          goto _L1
    }

}
