// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;


// Referenced classes of package com.jcp.activities:
//            ak, MainActivity

class al
    implements Runnable
{

    final ak a;

    al(ak ak1)
    {
        a = ak1;
        super();
    }

    public void run()
    {
        MainActivity.a(a.e, a.b, a.c, a.a, a.d);
    }
}
