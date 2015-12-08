// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            t, ds, cb, dv, 
//            ce, cd

public interface ah
{
    public static interface a
    {

        public abstract void aR();
    }


    public abstract void a(a a1);

    public abstract void a(t t, ds ds, cb cb, dv dv, boolean flag, ce ce);

    public abstract void a(String s, cd cd);

    public abstract void a(String s, JSONObject jsonobject);

    public abstract void destroy();

    public abstract void f(String s);

    public abstract void g(String s);

    public abstract void pause();

    public abstract void resume();
}
