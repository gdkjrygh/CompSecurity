// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp.internal.framed;

import java.io.IOException;
import java.util.List;
import okio.ByteString;
import okio.e;

// Referenced classes of package com.squareup.okhttp.internal.framed:
//            a, ErrorCode, m, HeadersMode

public static interface ersMode
{

    public abstract void a(int i, long l);

    public abstract void a(int i, ErrorCode errorcode);

    public abstract void a(int i, List list)
        throws IOException;

    public abstract void a(int i, ByteString bytestring);

    public abstract void a(boolean flag, int i, int j);

    public abstract void a(boolean flag, int i, e e, int j)
        throws IOException;

    public abstract void a(boolean flag, m m);

    public abstract void a(boolean flag, boolean flag1, int i, List list, HeadersMode headersmode);
}
