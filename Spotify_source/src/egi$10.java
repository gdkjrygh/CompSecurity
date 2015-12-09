// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import com.ford.syncV4.proxy.rpc.enums.FileType;

final class ng.Object
    implements eby
{

    private egc a;
    private egi b;

    public final void a(Uri uri)
    {
        a.a(false);
    }

    public final void a(Uri uri, byte abyte0[])
    {
        egi egi1 = b;
        egc egc1 = a;
        uri = egi.a(uri);
        egi1.a(uri, FileType.a, abyte0, new init>(egi1, egc1, uri));
    }

    i(egi egi1, egc egc1)
    {
        b = egi1;
        a = egc1;
        super();
    }
}
