// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.ab;
import com.google.a.af;
import com.google.a.b.a.z;
import com.google.a.d.a;
import com.google.a.d.d;
import com.google.a.d.e;
import com.google.a.t;
import com.google.a.u;
import com.google.a.v;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

// Referenced classes of package com.google.a.b:
//            ai

public final class ag
{

    public static t a(a a1)
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
                return v.a;
            } else
            {
                throw new ab(a1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new ab(a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new u(a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new ab(a1);
        }
        flag = false;
        a1 = (t)z.P.b(a1);
        return a1;
    }

    public static Writer a(Appendable appendable)
    {
        if (appendable instanceof Writer)
        {
            return (Writer)appendable;
        } else
        {
            return new ai(appendable, null);
        }
    }

    public static void a(t t1, d d)
    {
        z.P.a(d, t1);
    }
}
