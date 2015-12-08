// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.apache.http.Header;
import org.apache.http.ParseException;
import org.apache.http.message.BasicLineParser;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package crittercism.android:
//            af, al, ar

public abstract class ak extends af
{

    boolean d;
    int e;
    boolean f;
    private boolean g;
    private boolean h;

    public ak(af af1)
    {
        super(af1);
        d = false;
        g = false;
        h = false;
        f = false;
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        int i = super.b.length();
        if (i == 0 || i == 1 && super.b.charAt(0) == '\r')
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (!i) goto _L2; else goto _L1
_L1:
        h = true;
_L4:
        return true;
_L2:
        int j;
        chararraybuffer = BasicLineParser.DEFAULT.parseHeader(chararraybuffer);
        if (d || !chararraybuffer.getName().equalsIgnoreCase("content-length"))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        j = Integer.parseInt(chararraybuffer.getValue());
        if (j < 0)
        {
            return false;
        }
        try
        {
            d = true;
            e = j;
        }
        // Misplaced declaration of an exception variable
        catch (CharArrayBuffer chararraybuffer)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (CharArrayBuffer chararraybuffer)
        {
            return false;
        }
        return true;
        if (!chararraybuffer.getName().equalsIgnoreCase("transfer-encoding"))
        {
            continue; /* Loop/switch isn't completed */
        }
        f = chararraybuffer.getValue().equalsIgnoreCase("chunked");
        return true;
        if (g || !chararraybuffer.getName().equalsIgnoreCase("host")) goto _L4; else goto _L3
_L3:
        chararraybuffer = chararraybuffer.getValue();
        if (chararraybuffer == null) goto _L4; else goto _L5
_L5:
        g = true;
        super.a.a(chararraybuffer);
        return true;
    }

    public final af b()
    {
        if (h)
        {
            return g();
        } else
        {
            super.b.clear();
            return this;
        }
    }

    public final af c()
    {
        super.b.clear();
        return new ar(this);
    }

    protected final int d()
    {
        return 32;
    }

    protected final int e()
    {
        return 128;
    }

    protected abstract af g();
}
