// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import org.apache.http.Header;
import org.apache.http.ParseException;
import org.apache.http.message.BasicLineParser;
import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package b.a:
//            qe, c, i

public abstract class b extends qe
{

    boolean a;
    int b;
    boolean c;
    private boolean g;
    private boolean h;

    public b(qe qe1)
    {
        super(qe1);
        a = false;
        g = false;
        h = false;
        c = false;
    }

    public final qe a()
    {
        if (h)
        {
            return b();
        } else
        {
            super.e.clear();
            return this;
        }
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        int j = super.e.length();
        if (j == 0 || j == 1 && super.e.charAt(0) == '\r')
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!j) goto _L2; else goto _L1
_L1:
        h = true;
_L4:
        return true;
_L2:
        int k;
        chararraybuffer = BasicLineParser.DEFAULT.parseHeader(chararraybuffer);
        if (a || !chararraybuffer.getName().equalsIgnoreCase("content-length"))
        {
            break MISSING_BLOCK_LABEL_105;
        }
        k = Integer.parseInt(chararraybuffer.getValue());
        if (k < 0)
        {
            return false;
        }
        try
        {
            a = true;
            b = k;
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
        c = chararraybuffer.getValue().equalsIgnoreCase("chunked");
        return true;
        if (g || !chararraybuffer.getName().equalsIgnoreCase("host")) goto _L4; else goto _L3
_L3:
        chararraybuffer = chararraybuffer.getValue();
        if (chararraybuffer == null) goto _L4; else goto _L5
_L5:
        g = true;
        super.d.a(chararraybuffer);
        return true;
    }

    protected abstract qe b();

    public final qe c()
    {
        super.e.clear();
        return new i(this);
    }

    protected final int d()
    {
        return 32;
    }

    protected final int e()
    {
        return 128;
    }
}
