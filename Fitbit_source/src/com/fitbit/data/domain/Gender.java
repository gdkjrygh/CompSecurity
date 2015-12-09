// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;


// Referenced classes of package com.fitbit.data.domain:
//            s

public final class Gender extends Enum
    implements s
{

    private static final Gender $VALUES[];
    public static final Gender FEMALE;
    public static final Gender MALE;
    public static final Gender NA;
    private final String serializableName;
    private final int stringId;

    private Gender(String s1, int i, String s2, int j)
    {
        super(s1, i);
        serializableName = s2;
        stringId = j;
    }

    public static Gender valueOf(String s1)
    {
        return (Gender)Enum.valueOf(com/fitbit/data/domain/Gender, s1);
    }

    public static Gender[] values()
    {
        return (Gender[])$VALUES.clone();
    }

    public String getSerializableName()
    {
        return serializableName;
    }

    public int getStringId()
    {
        return stringId;
    }

    static 
    {
        MALE = new Gender("MALE", 0, "MALE", 0x7f080460);
        FEMALE = new Gender("FEMALE", 1, "FEMALE", 0x7f08045a);
        NA = new Gender("NA", 2, "NA", 0);
        $VALUES = (new Gender[] {
            MALE, FEMALE, NA
        });
    }
}
