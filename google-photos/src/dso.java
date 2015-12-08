// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Collection;
import java.util.Iterator;

final class dso
    implements eka
{

    private static final oni a = new oni("debug.photos.trash_interstitial");

    dso()
    {
    }

    public final Object a()
    {
        return dka;
    }

    public final boolean a(ar ar1, Collection collection)
    {
        boolean flag;
        Object obj1 = (mmr)olm.a(ar1, mmr);
        Object obj = (mmv)olm.a(ar1, mmv);
        int i = ((mmr) (obj1)).d();
        if (!((mmv) (obj)).a(i).d("com.google.android.apps.photos.allphotos.ui.actionconfirmation.AllMoveToTrashConfirmation").a("has_shown_interstitial", false))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            collection = dsp.a(new hyw(collection));
            ar1 = ar1.c().a();
            ar1.a(collection, "trash_interstitial");
            ar1.b();
            ((mmv) (obj)).b(i).h("com.google.android.apps.photos.allphotos.ui.actionconfirmation.AllMoveToTrashConfirmation").c("has_shown_interstitial", true).d();
            return true;
        }
        obj = collection.iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_234;
            }
            obj1 = (gej)((ekp)((Iterator) (obj)).next()).a(gej);
        } while (!((gej) (obj1)).n() && !((gej) (obj1)).o());
        flag = true;
_L1:
        if (flag)
        {
            collection = dsq.a(new hyw(collection));
            ar1 = ar1.c().a();
            ar1.a(collection, "delete_everywhere");
            ar1.b();
            return true;
        } else
        {
            return false;
        }
        flag = false;
          goto _L1
    }

}
