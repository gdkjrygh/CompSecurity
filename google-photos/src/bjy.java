// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.concurrent.ExecutionException;

public class bjy
    implements bjw
{

    private cwr c;

    public bjy(cwr cwr1)
    {
        c = cwr1;
    }

    private static biv a(Uri uri, bii bii1)
    {
        return new bjz(bii1, uri);
    }

    private static void a(bii bii1, Uri uri, bim bim1, cmf cmf1)
    {
        if (cmf1.c().e)
        {
            bii1.a(uri, bim1, cmf1);
            return;
        } else
        {
            bii1.b(uri, bim1, cmf1);
            return;
        }
    }

    public final void a()
    {
        bis bis1;
        try
        {
            bis1 = (bis)c.d();
        }
        catch (cwt cwt1)
        {
            return;
        }
        if (bis1 == null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        bis1.a();
    }

    public final void a(Uri uri, bim bim1, bii bii1)
    {
        try
        {
            if (bim1.a.b)
            {
                a();
            }
            biv biv = a(uri, bii1);
            a(bii1, uri, bim1, ((bis)c.c()).a(uri, bim1, biv));
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            bii1.a(uri, bim1, interruptedexception);
            return;
        }
        catch (ExecutionException executionexception)
        {
            bii1.a(uri, bim1, (Exception)executionexception.getCause());
            return;
        }
        catch (cwt cwt1)
        {
            bii1.a(uri, bim1, cwt1);
        }
    }

    public final void a(Uri uri, bim bim1, cmf cmf1, bii bii1)
    {
        try
        {
            if (bim1.a.b)
            {
                a();
            }
            biv biv = a(uri, bii1);
            a(bii1, uri, bim1, ((bis)c.c()).a(uri, cmf1, bim1, biv));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (cmf cmf1)
        {
            bii1.a(uri, bim1, cmf1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (cmf cmf1)
        {
            bii1.a(uri, bim1, (Exception)cmf1.getCause());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (cmf cmf1)
        {
            bii1.a(uri, bim1, cmf1);
        }
    }

    static 
    {
        bjy.getSimpleName();
    }
}
