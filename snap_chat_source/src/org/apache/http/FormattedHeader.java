// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http:
//            Header

public interface FormattedHeader
    extends Header
{

    public abstract CharArrayBuffer getBuffer();
}
