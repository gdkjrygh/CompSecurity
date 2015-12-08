// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import com.google.b.af;
import com.google.b.al;
import com.google.b.b.a.z;
import com.google.b.d.a;
import com.google.b.d.d;
import com.google.b.d.e;
import com.google.b.w;
import com.google.b.x;
import com.google.b.y;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

// Referenced classes of package com.google.b.b:
//            ah

public final class ag
{

    public static w a(a a1)
    {
        boolean flag = true;
        try
        {
            a1.f();
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            if (flag)
            {
                return y.a;
            } else
            {
                throw new af(a1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new af(a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new x(a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new af(a1);
        }
        flag = false;
        a1 = (w)z.P.a(a1);
        return a1;
    }

    public static Writer a(Appendable appendable)
    {
        if (appendable instanceof Writer)
        {
            return (Writer)appendable;
        } else
        {
            return new ah(appendable, (byte)0);
        }
    }

    public static void a(w w1, d d)
    {
        z.P.a(d, w1);
    }
}
