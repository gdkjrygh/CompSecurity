// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.os.Bundle;
import org.chromium.content.common.IChildProcessCallback;
import org.chromium.content.common.IChildProcessService;

// Referenced classes of package org.chromium.content.browser:
//            FileDescriptorInfo

public interface ChildProcessConnection
{
    public static interface ConnectionCallback
    {

        public abstract void onConnected(int i);
    }

    public static interface DeathCallback
    {

        public abstract void onChildProcessDied(ChildProcessConnection childprocessconnection);
    }


    public static final String EXTRA_COMMAND_LINE = "com.google.android.apps.chrome.extra.command_line";
    public static final String EXTRA_CPU_COUNT = "com.google.android.apps.chrome.extra.cpu_count";
    public static final String EXTRA_CPU_FEATURES = "com.google.android.apps.chrome.extra.cpu_features";
    public static final String EXTRA_FILES_FD_SUFFIX = "_fd";
    public static final String EXTRA_FILES_ID_SUFFIX = "_id";
    public static final String EXTRA_FILES_PREFIX = "com.google.android.apps.chrome.extra.extraFile_";

    public abstract void addStrongBinding();

    public abstract void dropOomBindings();

    public abstract int getPid();

    public abstract IChildProcessService getService();

    public abstract int getServiceNumber();

    public abstract boolean isInSandbox();

    public abstract boolean isInitialBindingBound();

    public abstract boolean isOomProtectedOrWasWhenDied();

    public abstract boolean isStrongBindingBound();

    public abstract void removeInitialBinding();

    public abstract void removeStrongBinding();

    public abstract void setupConnection(String as[], FileDescriptorInfo afiledescriptorinfo[], IChildProcessCallback ichildprocesscallback, ConnectionCallback connectioncallback, Bundle bundle);

    public abstract void start(String as[]);

    public abstract void stop();
}
