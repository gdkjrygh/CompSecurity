// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.configuration;

import java.util.List;

class UserPlan
{

    public final String id;
    public final List upsells;

    public UserPlan(String s, List list)
    {
        id = s;
        upsells = list;
    }
}
