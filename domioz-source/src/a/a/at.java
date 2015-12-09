// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.a.b;
import com.appboy.f;
import com.appboy.f.a;
import org.json.JSONException;

// Referenced classes of package a.a:
//            az, au, e, bn, 
//            ch, bu, du, bj, 
//            h, ba

public final class at
    implements az
{

    public static final String a;
    public final au b;
    public final e c;
    public final ba d;
    public final b e;
    public Class f;

    public at(au au1, e e1, ba ba, b b1)
    {
        f = null;
        b = au1;
        c = e1;
        d = ba;
        e = b1;
    }

    public final bn a()
    {
        bn bn1 = b.a();
        c.a(bn1);
        com.appboy.f.a.b(a, (new StringBuilder("Completed the openSession call. Starting or continuing session ")).append(bn1.d).toString());
        return bn1;
    }

    public final void a(int i)
    {
        c.a(new ch(e.a(), i));
    }

    public final void a(Throwable throwable)
    {
        try
        {
            a(((bj) (a.a.bu.a(throwable, b.c()))));
            return;
        }
        catch (JSONException jsonexception)
        {
            com.appboy.f.a.c(a, String.format("Failed to create error event from %s.", new Object[] {
                throwable
            }), jsonexception);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            com.appboy.f.a.c(a, "Failed to log error.", throwable);
        }
    }

    public final boolean a(bj bj1)
    {
        bj1 = b.a((bj)a.a.du.a(bj1));
        if (bj1 != null)
        {
            c.a(bj1);
            if (bj1.c())
            {
                a(h.d);
            }
            return true;
        } else
        {
            return false;
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            f.a, a/a/at.getName()
        });
    }
}
