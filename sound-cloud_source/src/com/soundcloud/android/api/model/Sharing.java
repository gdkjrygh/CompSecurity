// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.java.strings.Strings;

public final class Sharing extends Enum
{

    private static final Sharing $VALUES[];
    public static final Sharing PRIVATE;
    public static final Sharing PUBLIC;
    public static final Sharing UNDEFINED;
    public final String value;

    private Sharing(String s, int i, String s1)
    {
        super(s, i);
        value = s1;
    }

    public static Sharing from(String s)
    {
        if (!Strings.isBlank(s))
        {
            Sharing asharing[] = values();
            int j = asharing.length;
            for (int i = 0; i < j; i++)
            {
                Sharing sharing = asharing[i];
                if (sharing.value.equalsIgnoreCase(s))
                {
                    return sharing;
                }
            }

        }
        return UNDEFINED;
    }

    public static Sharing from(boolean flag)
    {
        if (flag)
        {
            return PUBLIC;
        } else
        {
            return PRIVATE;
        }
    }

    public static Sharing valueOf(String s)
    {
        return (Sharing)Enum.valueOf(com/soundcloud/android/api/model/Sharing, s);
    }

    public static Sharing[] values()
    {
        return (Sharing[])$VALUES.clone();
    }

    public final boolean isPrivate()
    {
        return PRIVATE == this;
    }

    public final boolean isPublic()
    {
        return PUBLIC == this;
    }

    public final String value()
    {
        return value;
    }

    static 
    {
        UNDEFINED = new Sharing("UNDEFINED", 0, "");
        PUBLIC = new Sharing("PUBLIC", 1, "public");
        PRIVATE = new Sharing("PRIVATE", 2, "private");
        $VALUES = (new Sharing[] {
            UNDEFINED, PUBLIC, PRIVATE
        });
    }
}
