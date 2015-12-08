// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

final class ear extends mtf
{

    private static final ekk a = (new ekm()).a(hpg).a();
    private static final ekk b;
    private final int c;
    private final ekp j;
    private final ekq k;

    ear(int i, ekp ekp1, ekq ekq)
    {
        super("LoadPagerMediaTask");
        c = i;
        j = ekp1;
        k = ekq;
    }

    protected final mue a(Context context)
    {
        Object obj;
        try
        {
            obj = (ekp)b.a(context, j).a(j, a).a();
            Object obj1 = (hpg)((ekp) (obj)).a(hpg);
            if (((hpg) (obj1)).b() == null)
            {
                return new mue(false);
            }
            obj1 = ((hpg) (obj1)).b().c;
            obj = new ikb(c, ((String) (obj1)), ((ekp) (obj)).c(), ((ekp) (obj)).d(), k, elm.a);
            context = (ekp)b.a(context, ((ekp) (obj))).a(((ekg) (obj)), b).a();
            obj = new mue(true);
            ((mue) (obj)).a().putParcelable("com.google.android.apps.photos.core.media", context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        return ((mue) (obj));
    }

    static 
    {
        b = gnw.a;
    }
}
