// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.property;

import java.util.UUID;

// Referenced classes of package ezvcard.property:
//            UriProperty

public class Uid extends UriProperty
{

    public Uid(String s)
    {
        super(s);
    }

    public static Uid random()
    {
        String s = UUID.randomUUID().toString();
        return new Uid((new StringBuilder()).append("urn:uuid:").append(s).toString());
    }
}
