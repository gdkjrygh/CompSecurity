// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.splitfare;

import java.util.List;
import rx.Observable;

public interface ISplitFareService
{

    public abstract Observable acceptDeclineRequest(String s, boolean flag);

    public abstract void addUnknownPhoneNumber(String s);

    public abstract Observable observeSplitFareContacts();

    public abstract Observable sendInvites(List list);
}
