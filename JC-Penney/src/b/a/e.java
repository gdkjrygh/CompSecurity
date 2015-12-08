// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.apache.http.ParseException;
import org.apache.http.RequestLine;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package b.a:
//            qe, d, c, j

public final class e extends qe
{

    public e(c c1)
    {
        super(c1);
    }

    public final qe a()
    {
        return new d(this);
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

    public final qe c()
    {
        return j.a;
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
