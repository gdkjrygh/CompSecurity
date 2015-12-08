// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.dncs.domain;


// Referenced classes of package com.fitbit.dncs.domain:
//            b

public final class NotificationAttributeId extends Enum
    implements b
{

    public static final NotificationAttributeId a;
    public static final NotificationAttributeId b;
    public static final NotificationAttributeId c;
    public static final NotificationAttributeId d;
    public static final NotificationAttributeId e;
    public static final NotificationAttributeId f;
    public static final NotificationAttributeId g;
    private static final NotificationAttributeId h[];
    private final byte attributeId;

    private NotificationAttributeId(String s, int i, byte byte0)
    {
        super(s, i);
        attributeId = byte0;
    }

    public static b a(byte byte0)
    {
        NotificationAttributeId anotificationattributeid[] = values();
        for (int i = 0; i < anotificationattributeid.length; i++)
        {
            NotificationAttributeId notificationattributeid = anotificationattributeid[i];
            if (notificationattributeid.attributeId == byte0)
            {
                return notificationattributeid;
            }
        }

        return g;
    }

    public static NotificationAttributeId valueOf(String s)
    {
        return (NotificationAttributeId)Enum.valueOf(com/fitbit/dncs/domain/NotificationAttributeId, s);
    }

    public static NotificationAttributeId[] values()
    {
        return (NotificationAttributeId[])h.clone();
    }

    public byte a()
    {
        return attributeId;
    }

    public boolean b()
    {
        return attributeId > 0 && attributeId < 4;
    }

    static 
    {
        a = new NotificationAttributeId("APP_IDENTIFIER", 0, (byte)0);
        b = new NotificationAttributeId("TITLE", 1, (byte)1);
        c = new NotificationAttributeId("SUBTITLE", 2, (byte)2);
        d = new NotificationAttributeId("MESSAGE", 3, (byte)3);
        e = new NotificationAttributeId("MESSAGE_SIZE", 4, (byte)4);
        f = new NotificationAttributeId("DATE", 5, (byte)5);
        g = new NotificationAttributeId("OTHER", 6, (byte)6);
        h = (new NotificationAttributeId[] {
            a, b, c, d, e, f, g
        });
    }
}
