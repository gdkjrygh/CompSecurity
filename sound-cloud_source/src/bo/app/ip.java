// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import android.graphics.drawable.Drawable;
import android.os.Handler;

// Referenced classes of package bo.app:
//            ji, ke, io, kp, 
//            kd

public final class ip
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
    kp o;
    kp p;
    kd q;
    Handler r;
    boolean s;

    public ip()
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
        j = ji.b;
        k = new android.graphics.BitmapFactory.Options();
        l = 0;
        m = false;
        n = null;
        o = null;
        p = null;
        q = new ke();
        r = null;
        s = false;
        k.inPurgeable = true;
        k.inInputShareable = true;
    }

    public final io a()
    {
        return new io(this, (byte)0);
    }
}
