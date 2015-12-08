// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import org.apache.http.util.CharArrayBuffer;

// Referenced classes of package crittercism.android:
//            af, aq, ah, as, 
//            al

public final class ai extends af
{

    private int d;

    public ai(af af1)
    {
        super(af1);
        d = -1;
    }

    public final boolean a(CharArrayBuffer chararraybuffer)
    {
        int i = chararraybuffer.indexOf(59);
        int j = chararraybuffer.length();
        if (i <= 0)
        {
            i = j;
        }
        try
        {
            d = Integer.parseInt(chararraybuffer.substringTrimmed(0, i), 16);
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
        int i = d;
        if (d == 0)
        {
            return new aq(this);
        } else
        {
            super.b.clear();
            return new ah(this, d);
        }
    }

    public final af c()
    {
        return as.d;
    }

    protected final int d()
    {
        return 16;
    }

    protected final int e()
    {
        return 256;
    }

    public final void f()
    {
        super.a.b(a());
        super.a.a(as.d);
    }
}
