// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            t, dn, bw, dq, 
//            bz, by

public interface ah
{
    public static interface a
    {

        public abstract void aM();
    }


    public abstract void a(a a1);

    public abstract void a(t t, dn dn, bw bw, dq dq, boolean flag, bz bz);

    public abstract void a(String s, by by);

    public abstract void a(String s, JSONObject jsonobject);

    public abstract void destroy();

    public abstract void f(String s);

    public abstract void g(String s);

    public abstract void pause();

    public abstract void resume();
}
