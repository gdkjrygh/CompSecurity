// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android.advanced;

import android.os.Handler;
import android.os.Message;
import com.moodstocks.android.MoodstocksError;
import com.moodstocks.android.Scanner;
import com.moodstocks.android.core.Loader;

public class Synchronizer extends Handler
{

    private boolean cancelled;
    private com.moodstocks.android.Scanner.SyncListener listener;
    private Scanner scanner;

    public Synchronizer(Scanner scanner1)
    {
        scanner = null;
        listener = null;
        cancelled = false;
        scanner = scanner1;
    }

    private int onProgress(int i, int j)
    {
        if (cancelled)
        {
            return -1;
        }
        if (i != -1)
        {
            obtainMessage(3, i, j).sendToTarget();
        }
        return 0;
    }

    private native void sync(Scanner scanner1);

    public void cancel()
    {
        cancelled = true;
    }

    public void handleMessage(Message message)
    {
        if (listener == null)
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            listener.onSyncStart();
            return;

        case 1: // '\001'
            listener.onSyncComplete();
            return;

        case 2: // '\002'
            listener.onSyncFailed((MoodstocksError)message.obj);
            return;

        case 3: // '\003'
            listener.onSyncProgress(message.arg1, message.arg2);
            break;
        }
    }

    public void setListener(com.moodstocks.android.Scanner.SyncListener synclistener)
    {
        listener = synclistener;
    }

    public void synchronize()
    {
        obtainMessage(0).sendToTarget();
        MoodstocksError moodstockserror = null;
        try
        {
            sync(scanner);
        }
        // Misplaced declaration of an exception variable
        catch (MoodstocksError moodstockserror) { }
        if (moodstockserror != null)
        {
            obtainMessage(2, moodstockserror).sendToTarget();
            return;
        } else
        {
            obtainMessage(1).sendToTarget();
            return;
        }
    }

    static 
    {
        Loader.load();
    }
}
