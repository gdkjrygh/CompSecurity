// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.msnp;


// Referenced classes of package com.skype.msnp:
//            MsnpParseException, MsnpIdentityType

public class MsnpIdentity
{

    private String a;
    private MsnpIdentityType b;

    public MsnpIdentity(String s)
    {
        String as[] = s.split(":");
        if (as == null || as.length == 0)
        {
            throw new MsnpParseException((new StringBuilder("Invalid MSNP idenity: ")).append(s).toString());
        } else
        {
            b = MsnpIdentityType.a(Integer.parseInt(as[0]));
            a = s;
            return;
        }
    }

    public final MsnpIdentityType a()
    {
        return b;
    }
}
