// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import java.util.Collections;

public final class hly extends mtf
{

    private final int a;
    private final ekq b;
    private final String c;
    private final String j;

    public hly(int i, ekq ekq1)
    {
        super("SaveCollectionTask");
        a = i;
        b = ekq1;
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

    protected final mue a(Context context)
    {
        noz noz1;
        Object obj;
        hkn hkn1;
        long l;
        noz1 = noz.a(context, "SaveCollectionTask", new String[0]);
        try
        {
            obj = noz.a(context, 3, "SaveCollectionTask", new String[] {
                "perf"
            });
            hkn1 = hkn.a(context, a, c, j);
            l = noy.a();
            hkn1.d();
            if (hkn1.l())
            {
                throw new eke("AddToLibrary failed", ((nxx) (hkn1)).n);
            }
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = new mue(false);
            context.a().putParcelable("com.google.android.apps.photos.core.media_collection", b);
            return context;
        }
        if (((noz) (obj)).a())
        {
            noy.a("duration", l);
        }
        obj = Collections.unmodifiableList(hkn1.a);
        obj = mtj.b(context, new hlp(a, ((java.util.List) (obj))));
        if (((mue) (obj)).c() && noz1.a())
        {
            noy.a("taskResult", obj);
        }
        ((eum)olm.a(context, eum)).a(a, "SaveMediaToLibraryTask", c);
        context = new mue(true);
        context.a().putParcelable("com.google.android.apps.photos.core.media_collection", b);
        return context;
    }
}
