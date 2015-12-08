// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import java.io.Serializable;
import java.util.Calendar;

public class BirthdayInfo
    implements Serializable
{

    private static final long serialVersionUID = 0x2a5ac335bbeb60c6L;
    public final int age;

    private BirthdayInfo(int i)
    {
        age = i;
    }

    public static BirthdayInfo buildFrom(int i)
    {
        return new BirthdayInfo(i);
    }

    public int getMonth()
    {
        return Calendar.getInstance().get(2);
    }

    public int getYear()
    {
        return Calendar.getInstance().get(1) - age;
    }

    public boolean isValid()
    {
        return age >= 13;
    }
}
