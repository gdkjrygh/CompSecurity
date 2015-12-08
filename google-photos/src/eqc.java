// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class eqc extends mtf
{

    private static final ekk a = (new ekm()).a(hpg).a(jdv).b(gaf).a();
    private final int b;
    private final List c;
    private final int j;

    public eqc(int i, List list, int k)
    {
        super("CreateMediaProjectTask");
        boolean flag;
        if (list != null && !list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "mediaList cannot be empty");
        b = i;
        c = list;
        j = k;
    }

    protected final mue a(Context context)
    {
        ArrayList arraylist = new ArrayList(c.size());
        try
        {
            ekp ekp1;
            for (Iterator iterator = c.iterator(); iterator.hasNext(); arraylist.add(b.a(context, ekp1).a(ekp1, a).a()))
            {
                ekp1 = (ekp)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        context = new eqb(context, b, arraylist, j);
        context.d();
        if (context.l())
        {
            return new mue(((nxx) (context)).l, ((nxx) (context)).n, null);
        }
        if (((eqb) (context)).b != null)
        {
            context = ((eqb) (context)).b.a;
            mue mue1 = new mue(0, new Exception("CreateMediaProjectRequest failed"), context);
            mue1.a().putBoolean("show_error_message", TextUtils.isEmpty(context));
            return mue1;
        } else
        {
            mue mue2 = new mue(true);
            mue2.a().putString("media_key", ((eqb) (context)).a.a);
            return mue2;
        }
    }

}
