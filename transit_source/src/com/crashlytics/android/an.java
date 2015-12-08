// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.crashlytics.android:
//            QueueFile

final class an
    implements QueueFile.ElementReader
{

    private boolean a;
    private StringBuilder b;

    an(QueueFile queuefile, StringBuilder stringbuilder)
    {
        b = stringbuilder;
        super();
        a = true;
    }

    public final void read(InputStream inputstream, int i)
        throws IOException
    {
        if (a)
        {
            a = false;
        } else
        {
            b.append(", ");
        }
        b.append(i);
    }
}
