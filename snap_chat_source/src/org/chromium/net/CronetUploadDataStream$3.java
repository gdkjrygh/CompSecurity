// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.net;


// Referenced classes of package org.chromium.net:
//            CronetUploadDataStream

final class a
    implements Runnable
{

    private CronetUploadDataStream a;

    public final void run()
    {
        CronetUploadDataStream.i(a);
    }

    (CronetUploadDataStream cronetuploaddatastream)
    {
        a = cronetuploaddatastream;
        super();
    }
}
