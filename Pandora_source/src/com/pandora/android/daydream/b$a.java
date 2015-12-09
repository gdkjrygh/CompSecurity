// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.daydream;

import android.graphics.Bitmap;
import p.cm.t;

// Referenced classes of package com.pandora.android.daydream:
//            b

private class <init> extends t
{

    final b a;
    private boolean b;

    protected void a(Bitmap bitmap)
    {
    }

    protected void b(Bitmap bitmap)
    {
        if (bitmap == null)
        {
            return;
        } else
        {
            a.a(bitmap, b);
            return;
        }
    }

    protected void onCancelled(Object obj)
    {
        a((Bitmap)obj);
    }

    protected void onPostExecute(Object obj)
    {
        b((Bitmap)obj);
    }

    private (b b1, boolean flag)
    {
        a = b1;
        super();
        b = flag;
    }

    b(b b1, boolean flag, b b2)
    {
        this(b1, flag);
    }
}
