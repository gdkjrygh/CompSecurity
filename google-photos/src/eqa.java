// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class eqa extends mtf
{

    private static final ekk a = (new ekm()).a(hpg).a();
    private static final ekk b = (new ekm()).a(elt).a();
    private static final ekk c = (new ekm()).a(hpe).a();
    private final int j;
    private final epd k;
    private final String l;
    private final epf m;
    private final List n;

    public eqa(int i, epf epf1, List list, epd epd1)
    {
        super("CreateMediaBundleTask");
        p.b(epf1, "bundleType cannot be null");
        boolean flag;
        if (list != null && !list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "mediaList cannot be empty");
        j = i;
        m = epf1;
        n = list;
        k = epd1;
        if (epd1 == null)
        {
            epf1 = null;
        } else
        {
            epf1 = epd1.a;
        }
        l = epf1;
    }

    private static elb a(Context context, int i, qgg qgg1)
    {
        qfu qfu1 = new qfu();
        qfu1.b = ((mmv)olm.a(context, mmv)).a(i).b("gaia_id");
        eto eto1 = (eto)olm.a(context, eto);
        qgi aqgi[] = qgi.b();
        eto1.a(i, new qgg[] {
            qgg1
        }, aqgi, qfu1, true);
        qgg1 = new dmb(i, Arrays.asList(new String[] {
            qgg1.b.a
        }));
        context = b.a(context, qgg1).a(qgg1, ekw.a, b);
        try
        {
            context = b.b(((List)context.a()).get(0));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return b.a(context);
        }
        return context;
    }

    protected final mue a(Context context)
    {
        Object obj = new ArrayList(n.size());
        ekp ekp1;
        for (Iterator iterator = n.iterator(); iterator.hasNext(); ((List) (obj)).add(b.a(context, ekp1).a(ekp1, a).a()))
        {
            ekp1 = (ekp)iterator.next();
        }

          goto _L1
        context;
        Object obj1 = new mue(0, context, null);
_L3:
        return ((mue) (obj1));
_L1:
        Bundle bundle;
        epz epz1;
        epz1 = new epz(context, j, m, ((List) (obj)), l);
        epz1.d();
        if (epz1.l())
        {
            obj = new mue(((nxx) (epz1)).l, ((nxx) (epz1)).n, null);
        } else
        if (!epz1.a)
        {
            obj = new mue(0, new Exception("Render failed"), null);
        } else
        {
            obj = new mue(true);
        }
        bundle = ((mue) (obj)).a();
        bundle.putString("hint_message", epz1.c);
        bundle.putParcelable("bundle_type", m);
        bundle.putBoolean("async_result", epz1.b);
        obj1 = obj;
        if (epz1.l())
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (!epz1.a)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        if (epz1.b)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!m.c())
        {
            break MISSING_BLOCK_LABEL_408;
        }
        obj1 = ((epc)((ekr)((els)olm.a(context, els)).a("com.google.android.apps.photos.allphotos.data.AllPhotosCore")).a(epc)).a(j, epz1.e);
        try
        {
            obj1 = (ekq)((elb) (obj1)).a();
            context = (hpe)((ekq)b.b(context, ((ekq) (obj1))).a(((ekg) (obj1)), c).a()).b(hpe);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return new mue(0, context, null);
        }
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_342;
        }
        if (((hpe) (context)).a != null)
        {
            bundle.putString("collection_media_key", ((hpe) (context)).a.a);
        }
        bundle.putParcelable("com.google.android.apps.photos.core.media_collection", ((Parcelable) (obj1)));
        return ((mue) (obj));
        obj1 = obj;
        if (m.a())
        {
            qgg qgg1;
            if (k != null)
            {
                bundle.putParcelable("com.google.android.apps.photos.core.media_collection", k.b);
            } else
            {
                bundle.putParcelable("com.google.android.apps.photos.core.media_collection", b.a(j, null));
            }
            qgg1 = epz1.d;
            if (m.c == 1)
            {
                qgg1.d.b.a.d = new qge();
                qgg1.d.b.a.d.c = new qfw();
            }
            context = a(context, j, qgg1);
            try
            {
                bundle.putParcelable("com.google.android.apps.photos.core.media", (Parcelable)context.a());
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return new mue(0, context, null);
            }
            return ((mue) (obj));
        }
        if (true) goto _L3; else goto _L2
_L2:
    }

}
