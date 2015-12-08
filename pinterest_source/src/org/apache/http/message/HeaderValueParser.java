// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.message;

import org.apache.http.HeaderElement;
import org.apache.http.NameValuePair;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package org.apache.http.message:
//            ParserCursor

public interface HeaderValueParser
{

    public abstract HeaderElement[] parseElements(CharArrayBuffer chararraybuffer, ParserCursor parsercursor);

    public abstract HeaderElement parseHeaderElement(CharArrayBuffer chararraybuffer, ParserCursor parsercursor);

    public abstract NameValuePair parseNameValuePair(CharArrayBuffer chararraybuffer, ParserCursor parsercursor);

    public abstract NameValuePair[] parseParameters(CharArrayBuffer chararraybuffer, ParserCursor parsercursor);
}
