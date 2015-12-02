// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;


// Referenced classes of package com.google.common.a:
//            mc, fp, es

class fr extends mc
{

    final fp a;

    fr(fp fp, es es)
    {
        a = fp;
        super(es);
    }

    Object a(java.util.Map.Entry entry)
    {
        return entry.getKey();
    }

    Object b(Object obj)
    {
        return a((java.util.Map.Entry)obj);
    }
}
