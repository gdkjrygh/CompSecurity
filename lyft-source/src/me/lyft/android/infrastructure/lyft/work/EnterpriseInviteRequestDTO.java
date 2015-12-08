// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.work;

import java.util.List;

public class EnterpriseInviteRequestDTO
{

    final List invites;
    public final String type;

    public EnterpriseInviteRequestDTO(List list, String s)
    {
        invites = list;
        type = s;
    }
}
