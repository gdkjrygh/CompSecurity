// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;


// Referenced classes of package com.paypal.android.sdk:
//            dv, eb, ec, dx, 
//            ef

public abstract class fm extends dv
{

    public fm(ec ec, dx dx, ef ef, String s)
    {
        super(new eb(ec), dx, ef, (new StringBuilder("Bearer ")).append(s).toString());
        a("Content-Type", "application/json");
        a("Accept", "application/json");
    }
}
