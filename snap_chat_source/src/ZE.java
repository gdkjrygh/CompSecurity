// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.ParseException;
import org.apache.http.RequestLine;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

public final class ZE extends afi
{

    public ZE(ZC zc)
    {
        super(zc);
    }

    public final afi a()
    {
        return new ZD(this);
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        ParserCursor parsercursor = new ParserCursor(0, chararraybuffer.length());
        try
        {
            chararraybuffer = BasicLineParser.DEFAULT.parseRequestLine(chararraybuffer, parsercursor);
            super.d.a(chararraybuffer.getMethod(), chararraybuffer.getUri());
        }
        // Misplaced declaration of an exception variable
        catch (CharArrayBuffer chararraybuffer)
        {
            return false;
        }
        return true;
    }

    public final afi c()
    {
        return ZJ.a;
    }

    protected final int d()
    {
        return 64;
    }

    protected final int e()
    {
        return 2048;
    }
}
