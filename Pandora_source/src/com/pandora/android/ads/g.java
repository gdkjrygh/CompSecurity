// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.ads;

import android.app.Activity;
import com.pandora.radio.data.a;
import java.util.Map;

// Referenced classes of package com.pandora.android.ads:
//            t, h

public interface g
{

    public static final t b = new t(t.a.c, true, true);
    public static final t c = new t(t.a.b, false, false);
    public static final t d = new t(com.pandora.android.ads.t.a.a, true, true);

    public abstract int a();

    public abstract int a(Activity activity, h h, int i);

    public abstract void a(int i);

    public abstract void a(int i, String s, boolean flag);

    public abstract void a(long l, h.b b1);

    public abstract void a(a a1);

    public abstract void a(String s, String s1, String s2);

    public abstract void b(int i);

    public abstract void b(int i, String s, boolean flag);

    public abstract boolean b(String s);

    public abstract void c(int i);

    public abstract void c(String s);

    public abstract void d();

    public abstract void d(int i);

    public abstract boolean e();

    public abstract String j();

    public abstract boolean m();

    public abstract boolean n();

    public abstract Map o();

}
