// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.os.Bundle;
import org.chromium.content.common.IChildProcessCallback;

// Referenced classes of package org.chromium.content.browser:
//            ChildProcessConnectionImpl, FileDescriptorInfo

private static class mSharedRelros
{

    final IChildProcessCallback mCallback;
    final String mCommandLine[];
    final FileDescriptorInfo mFilesToBeMapped[];
    final Bundle mSharedRelros;

    (String as[], FileDescriptorInfo afiledescriptorinfo[], IChildProcessCallback ichildprocesscallback, Bundle bundle)
    {
        mCommandLine = as;
        mFilesToBeMapped = afiledescriptorinfo;
        mCallback = ichildprocesscallback;
        mSharedRelros = bundle;
    }
}
