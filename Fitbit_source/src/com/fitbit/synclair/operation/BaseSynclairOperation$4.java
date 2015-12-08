// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.synclair.operation;


// Referenced classes of package com.fitbit.synclair.operation:
//            BaseSynclairOperation

class a
    implements Runnable
{

    final int a;
    final BaseSynclairOperation b;

    public void run()
    {
        BaseSynclairOperation.a(b, a);
    }

    (BaseSynclairOperation basesynclairoperation, int i)
    {
        b = basesynclairoperation;
        a = i;
        super();
    }
}
