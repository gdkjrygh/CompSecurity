// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.b;

import android.graphics.drawable.Drawable;
import java.lang.ref.SoftReference;

// Referenced classes of package com.qihoo360.mobilesafe.b:
//            g

private class a extends SoftReference
{

    public String a;
    final g b;

    public able(g g1, String s, Drawable drawable)
    {
        b = g1;
        super(drawable);
        a = null;
        a = s;
    }
}
