// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.Header;
import org.apache.http.ProtocolVersion;
import org.apache.http.RequestLine;
import org.apache.http.StatusLine;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//            ParserCursor

public interface LineParser
{

    public abstract boolean hasProtocolVersion(CharArrayBuffer chararraybuffer, ParserCursor parsercursor);

    public abstract Header parseHeader(CharArrayBuffer chararraybuffer);

    public abstract ProtocolVersion parseProtocolVersion(CharArrayBuffer chararraybuffer, ParserCursor parsercursor);

    public abstract RequestLine parseRequestLine(CharArrayBuffer chararraybuffer, ParserCursor parsercursor);

    public abstract StatusLine parseStatusLine(CharArrayBuffer chararraybuffer, ParserCursor parsercursor);
}
