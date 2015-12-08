// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Callable;

// Referenced classes of package com.facebook:
//            FacebookSdk

static final class le
    implements Callable
{

    public File call()
        throws Exception
    {
        return FacebookSdk.access$000().getCacheDir();
    }

    public volatile Object call()
        throws Exception
    {
        return call();
    }

    le()
    {
    }
}
