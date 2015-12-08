// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.common;

import java.io.InputStream;

// Referenced classes of package io.fabric.sdk.android.services.common:
//            QueueFile

class a
    implements ementReader
{

    boolean a;
    final StringBuilder b;
    final QueueFile c;

    public void a(InputStream inputstream, int i)
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

    ementReader(QueueFile queuefile, StringBuilder stringbuilder)
    {
        c = queuefile;
        b = stringbuilder;
        super();
        a = true;
    }
}
