// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.analytics;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.android.play.analytics:
//            RollingFileStream

public static interface 
{

    public abstract void onNewOutputFile();

    public abstract void onWrite(Object obj, OutputStream outputstream)
        throws IOException;
}
