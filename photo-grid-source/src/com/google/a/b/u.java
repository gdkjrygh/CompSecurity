// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.ag;
import com.google.a.am;
import com.google.a.b.a.y;
import com.google.a.d.a;
import com.google.a.d.f;
import com.google.a.d.h;
import com.google.a.x;
import com.google.a.z;
import java.io.EOFException;
import java.io.IOException;

public final class u
{

    public static x a(a a1)
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
                return z.a;
            } else
            {
                throw new ag(a1);
            }
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new ag(a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new com.google.a.y(a1);
        }
        // Misplaced declaration of an exception variable
        catch (a a1)
        {
            throw new ag(a1);
        }
        flag = false;
        a1 = (x)y.P.a(a1);
        return a1;
    }

    public static void a(x x1, f f)
    {
        y.P.a(f, x1);
    }
}
