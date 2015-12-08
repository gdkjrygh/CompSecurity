// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.apache.http.ParseException;
import org.apache.http.StatusLine;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

public final class ZG extends afi
{

    private int a;

    public ZG(ZC zc)
    {
        super(zc);
        a = -1;
    }

    public final afi a()
    {
        return new ZF(this, a);
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        ParserCursor parsercursor = new ParserCursor(0, chararraybuffer.length());
        try
        {
            chararraybuffer = BasicLineParser.DEFAULT.parseStatusLine(chararraybuffer, parsercursor);
            a = chararraybuffer.getStatusCode();
            super.d.a(chararraybuffer.getStatusCode());
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
        return 20;
    }

    protected final int e()
    {
        return 64;
    }
}
