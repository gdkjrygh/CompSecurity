// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.List;

class gvz
{

    private final gur a;
    private final gwk b;

    gvz(Context context)
    {
        a = (gur)olm.a(context, gur);
        b = (gwk)olm.a(context, gwk);
    }

    final gum a(gue gue1)
    {
        int i = gue1.a;
        Object obj = (hpg)gue1.c.a(hpg);
        gue1 = ((hpk)((hpg) (obj)).a.get(0)).e;
        obj = ((hpg) (obj)).b();
        long l;
        if (((hpk) (obj)).a())
        {
            l = a.a(i, gue1);
        } else
        {
            gue1 = Uri.parse(((hpk) (obj)).a);
            l = a.a(i, gue1);
        }
        if (l == -1L)
        {
            throw new gwa("Edited image is missing now. Can't save.");
        } else
        {
            return a.a(i, l);
        }
    }

    final gum a(gum gum1, gue gue1)
    {
        guo guo1;
        guo1 = (new guo()).a(gum1);
        guo1.g = gue1.f;
        if (gue1.h != gvl.a) goto _L2; else goto _L1
_L1:
        try
        {
            gum1 = b.a(gum1.b);
        }
        // Misplaced declaration of an exception variable
        catch (gum gum1)
        {
            throw new gwa("Failed to make shadow copy with noise", gum1);
        }
        guo1.b = ((gwm) (gum1)).a;
        guo1.c = ((gwm) (gum1)).b;
_L4:
        return guo1.a();
_L2:
        boolean flag;
        if (!b.c(gum1.d) && gum1.b.equals(gum1.d))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            try
            {
                gue1 = b;
                gum1 = gum1.d;
                gum1 = gue1.a(((gwk) (gue1)).b.a(gum1));
            }
            // Misplaced declaration of an exception variable
            catch (gum gum1)
            {
                throw new gwa("Failed to make shadow copy", gum1);
            }
            guo1.b = gum1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
