// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.phonenumber.identification;


// Referenced classes of package com.facebook.orca.phonenumber.identification:
//            f

class h
    implements Runnable
{

    String a;
    final f b;

    public h(f f1, String s)
    {
        b = f1;
        super();
        a = s;
    }

    public void run()
    {
        f.a(b, a);
    }
}
