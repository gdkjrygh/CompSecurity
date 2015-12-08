// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;

public class btv extends mtf
{

    private static String a = btv.getSimpleName();
    private final bww b;
    private final int c;
    private final noj j;
    private final bxp k;

    public btv(String s, bww bww1, int i, noj noj1, bxp bxp1)
    {
        String s1 = a;
        super((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("|").append(s).toString());
        b = (bww)b.a(bww1, "state", null);
        c = i;
        j = (noj)b.a(noj1, "plusDataProvider", null);
        k = (bxp)b.a(bxp1, "storyboardCache", null);
    }

    protected final mue a(Context context)
    {
        Object obj;
        android.net.Uri uri;
        context = j.a(c, b.b.X);
        c.a(context, "aamMedia", null);
        obj = context.b();
        uri = context.d();
        c.a(obj, "storyboardResult", null);
        if (((nom) (obj)).a != noo.a)
        {
            context = a;
            obj = String.valueOf(((nom) (obj)).a);
            Log.e(context, (new StringBuilder(String.valueOf(obj).length() + 49)).append("Error status code when loading cloud storyboard: ").append(((String) (obj))).toString());
            return new mue(1, null, null);
        }
        Object obj1;
        obj1 = ((nom) (obj)).b;
        context = new StringBuilder();
        try
        {
            b.a(context, ((pye) (obj1)), true);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            try
            {
                throw new dey(String.format("Parsing storyboard caused RuntimeException. Errors before crash: <%s>", new Object[] {
                    context.toString()
                }), ((Throwable) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e(a, "Invalid storyboard from server.", context);
                return new mue(2, context, null);
            }
        }
        if (context.length() > 0)
        {
            throw new dey(context.toString());
        }
        context = ((nom) (obj)).c;
        obj1 = k.a(b.b.X);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_340;
        }
        if (!bxp.a(((pkk) (obj1)), context)) goto _L2; else goto _L1
_L1:
        context = new nom(noo.a, 200, ((pkk) (obj1)).c.b.b.a.c.a, context);
_L3:
        if (context != null)
        {
            b.p(true);
        } else
        {
            context = ((Context) (obj));
        }
        obj = new mue(true);
        ((mue) (obj)).a().putParcelable("storyboard", context);
        ((mue) (obj)).a().putParcelable("videoStreamUri", uri);
        return ((mue) (obj));
_L2:
        k.b(b.b.X);
        context = null;
          goto _L3
    }

}
