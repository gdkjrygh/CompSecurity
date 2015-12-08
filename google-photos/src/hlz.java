// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class hlz extends mtf
{

    private static final ekk a = (new ekm()).a(hpg).a();
    private final int b;
    private final String c;
    private final String j;
    private final List k;

    public hlz(int i, ekq ekq1, List list)
    {
        super("SaveMediaTask");
        b = i;
        k = list;
        c = ((hpe)ekq1.a(hpe)).a.a;
        ekq1 = (iks)ekq1.b(iks);
        if (ekq1 != null)
        {
            j = ((iks) (ekq1)).a;
            return;
        } else
        {
            j = null;
            return;
        }
    }

    private static void a(mue mue1, List list)
    {
        mue1.a().putParcelableArrayList("com.google.android.apps.photos.core.media_list", new ArrayList(list));
    }

    protected final mue a(Context context)
    {
        noz noz1;
        Object obj;
        noz1 = noz.a(context, "SaveMediaTask", new String[0]);
        try
        {
            obj = new ArrayList(k.size());
            ekp ekp1;
            for (Iterator iterator = k.iterator(); iterator.hasNext(); ((List) (obj)).add(((hpg)((ekp)b.a(context, ekp1).a(ekp1, a).a()).a(hpg)).b().c))
            {
                ekp1 = (ekp)iterator.next();
            }

        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = new mue(0, context, null);
            a(((mue) (context)), k);
            return context;
        }
        noz noz2 = noz.a(context, 3, "SaveMediaTask", new String[] {
            "perf"
        });
        obj = hkn.a(context, b, c, j, ((List) (obj)));
        long l = noy.a();
        ((hkn) (obj)).d();
        if (((hkn) (obj)).l())
        {
            throw new eke("", ((nxx) (obj)).n);
        }
        if (noz2.a())
        {
            noy.a("duration", l);
        }
        obj = Collections.unmodifiableList(((hkn) (obj)).a);
        obj = mtj.b(context, new hlp(b, ((List) (obj))));
        if (((mue) (obj)).c() && noz1.a())
        {
            noy.a("taskResult", obj);
        }
        ((eum)olm.a(context, eum)).a(b, "SaveMediaToLibraryTask", c);
        context = new mue(true);
        a(((mue) (context)), k);
        return context;
    }

}
