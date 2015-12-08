// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.apache.http.ParseException;
import org.apache.http.RequestLine;
import org.apache.http.message.BasicLineParser;
import org.apache.http.message.ParserCursor;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package crittercism.android:
//            af, al, am, as

public final class an extends af
{

    public an(al al1)
    {
        super(al1);
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        ParserCursor parsercursor = new ParserCursor(0, chararraybuffer.length());
        try
        {
            chararraybuffer = BasicLineParser.DEFAULT.parseRequestLine(chararraybuffer, parsercursor);
            super.a.a(chararraybuffer.getMethod(), chararraybuffer.getUri());
        }
        // Misplaced declaration of an exception variable
        catch (CharArrayBuffer chararraybuffer)
        {
            return false;
        }
        return true;
    }

    public final af b()
    {
        return new am(this);
    }

    public final af c()
    {
        return as.d;
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
