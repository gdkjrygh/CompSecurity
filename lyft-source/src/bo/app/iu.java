// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.drawable.Drawable;
import android.os.Handler;

// Referenced classes of package bo.app:
//            jn, kj, it, ku, 
//            ki

public final class iu
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
    ku o;
    ku p;
    ki q;
    Handler r;
    boolean s;

    public iu()
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
        j = jn.b;
        k = new android.graphics.BitmapFactory.Options();
        l = 0;
        m = false;
        n = null;
        o = null;
        p = null;
        q = new kj();
        r = null;
        s = false;
        k.inPurgeable = true;
        k.inInputShareable = true;
    }

    public final it a()
    {
        return new it(this, (byte)0);
    }
}
