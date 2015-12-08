// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.sync;

import com.skype.android.addressbook.IngestionCallback;
import java.util.concurrent.ExecutorService;

public interface ContactsIngestTask
{

    public static final String ACCESS_TOKEN_SCOPES_LIVE = "service::people.directory.live.com::MBI_SSL";
    public static final String ACCESS_TOKEN_SCOPES_TEST = "service::people.directory.live-int.com::MBI_SSL";

    public abstract void cleanup();

    public abstract long getElapsedTime();

    public abstract void run();

    public abstract void setExecutorService(ExecutorService executorservice);

    public abstract void setIngestionCallback(IngestionCallback ingestioncallback);
}
