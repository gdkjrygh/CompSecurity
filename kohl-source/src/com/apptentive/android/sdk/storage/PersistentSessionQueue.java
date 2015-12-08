// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.storage;

import com.apptentive.android.sdk.SessionEvent;
import java.util.List;

public interface PersistentSessionQueue
{

    public transient abstract void addEvents(SessionEvent asessionevent[]);

    public abstract void deleteAllEvents();

    public transient abstract void deleteEvents(SessionEvent asessionevent[]);

    public abstract List getAllEvents();
}
