// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;

public final class dxg
{

    public HashMap a;
    public HashMap b;
    public WeakReference c;

    public dxg()
    {
        a = new HashMap();
        b = new HashMap();
        c = new WeakReference(null);
    }

    public final dxg a(fyu fyu1, Serializable serializable)
    {
        a.put(fyu1.b, serializable);
        return this;
    }
}
