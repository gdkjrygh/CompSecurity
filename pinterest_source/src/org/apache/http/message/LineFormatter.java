// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.util.CharArrayBuffer;

public interface LineFormatter
{

    public abstract CharArrayBuffer appendProtocolVersion(CharArrayBuffer chararraybuffer, ProtocolVersion protocolversion);

    public abstract CharArrayBuffer formatHeader(CharArrayBuffer chararraybuffer, Header header);

    public abstract CharArrayBuffer formatRequestLine(CharArrayBuffer chararraybuffer, RequestLine requestline);

    public abstract CharArrayBuffer formatStatusLine(CharArrayBuffer chararraybuffer, StatusLine statusline);
}
