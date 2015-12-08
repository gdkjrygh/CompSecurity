// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class hlp extends mtf
{

    private final int a;
    private final List b;

    public hlp(int i, List list)
    {
        super("DownloadNewMediaItemsTask");
        a = i;
        b = Collections.unmodifiableList(new ArrayList(list));
    }

    protected final mue a(Context context)
    {
        eto eto1;
        Object obj;
        int i;
        try
        {
            Object obj1 = b;
            if (((List) (obj1)).isEmpty())
            {
                break MISSING_BLOCK_LABEL_165;
            }
            eto1 = (eto)olm.a(context, eto);
            i = a;
            obj = new ArrayList(((List) (obj1)).size());
            for (obj1 = ((List) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); ((List) (obj)).add(djf.a((String)((Iterator) (obj1)).next()))) { }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        context = djh.a(context, i, ((List) (obj)));
        context.d();
        if (context.l())
        {
            throw new eke("Error reading new media", ((nxx) (context)).n);
        }
        obj = ((djh) (context)).a.c[0];
        eto1.a(a, ((djh) (context)).a.b, new qgi[0], ((qfu) (obj)), true);
        context = new mue(true);
        return context;
    }
}
