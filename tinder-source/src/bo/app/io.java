// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.drawable.Drawable;
import android.os.Handler;

// Referenced classes of package bo.app:
//            jh, kd, in, ko, 
//            kc

public final class io
{

    int a;
    int b;
    int c;
    Drawable d;
    Drawable e;
    Drawable f;
    boolean g;
    public boolean h;
    public boolean i;
    int j;
    android.graphics.BitmapFactory.Options k;
    int l;
    boolean m;
    Object n;
    ko o;
    ko p;
    kc q;
    Handler r;
    boolean s;

    public io()
    {
        a = 0;
        b = 0;
        c = 0;
        d = null;
        e = null;
        f = null;
        g = false;
        h = false;
        i = false;
        j = jh.b;
        k = new android.graphics.BitmapFactory.Options();
        l = 0;
        m = false;
        n = null;
        o = null;
        p = null;
        q = new kd();
        r = null;
        s = false;
        k.inPurgeable = true;
        k.inInputShareable = true;
    }

    public final in a()
    {
        return new in(this, (byte)0);
    }
}
