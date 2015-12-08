// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class eld extends mtf
{

    private final List a;
    private final ekk b;

    public eld(List list, ekk ekk, int i)
    {
        super(a(i));
        a = list;
        b = ekk;
    }

    public static String a(int i)
    {
        String s = String.valueOf("CoreFeatureLoadTask:");
        return (new StringBuilder(String.valueOf(s).length() + 11)).append(s).append(i).toString();
    }

    protected final mue a(Context context)
    {
        Object obj = (elw)olm.a(context, elw);
        context = new ArrayList();
        try
        {
            ekp ekp1;
            for (Iterator iterator = a.iterator(); iterator.hasNext(); context.add(((ekv)((elw) (obj)).a(ekp1.a())).a(ekp1, b).a()))
            {
                ekp1 = (ekp)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        obj = new mue(true);
        ((mue) (obj)).a().putParcelableArrayList("com.google.android.apps.photos.core.media_list", context);
        return ((mue) (obj));
    }
}
