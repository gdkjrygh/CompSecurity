// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.util.List;

public final class hht extends mtf
{

    private static final ekk a = (new ekm()).a(hpg).a();
    private final int b;
    private final hhq c;
    private ekq j;

    public hht(int i, ekq ekq, hhq hhq1)
    {
        boolean flag1 = true;
        super("RemoveCollectionTask");
        boolean flag;
        if (i != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "Invalid account id.");
        if (ekq != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "Invalid media collection.");
        b = i;
        j = ekq;
        c = hhq1;
    }

    private mue a(hhn hhn1, Context context)
    {
        List list;
        try
        {
            list = b.a((List)b.a(context, j).a(j, ekw.a, a).a(), j, context);
        }
        // Misplaced declaration of an exception variable
        catch (hhn hhn1)
        {
            return new mue(0, hhn1, null);
        }
        hhn1 = hhn1.a(b, j);
        if (TextUtils.isEmpty(((qbx) (hhn1)).a) || TextUtils.isEmpty(((qbx) (hhn1)).b.b) || TextUtils.isEmpty(((qbx) (hhn1)).b.a))
        {
            return new mue(0, new eke("Remote remove from album failed: No collection ID."), null);
        }
        hhn1 = new hkp(context, b, hhn1);
        hhn1.d();
        if (hhn1.l())
        {
            hhn1.d("RemoveCollectionTask");
            return new mue(((nxx) (hhn1)).l, ((nxx) (hhn1)).n, ((nxx) (hhn1)).m);
        } else
        {
            context = (eto)olm.a(context, eto);
            int i = b;
            qgg aqgg[] = ((hkp) (hhn1)).b.a;
            qfu qfu1 = new qfu();
            qfu1.b = ((hkp) (hhn1)).a.b.a;
            context.a(i, aqgg, list, qfu1, true);
            return new mue(true);
        }
    }

    protected final mue a(Context context)
    {
        Object obj = (hhn)olm.a(context, hhn);
        mue mue1 = a(((hhn) (obj)), context);
        hhq hhq1 = c;
        boolean flag;
        if (!mue1.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        hhq1.a = flag;
        obj = ((hhn) (obj)).a(b, j).a;
        mtj.b(context, new hlu(b, ((String) (obj))));
        return mue1;
    }

    static 
    {
        (new ekm()).a(hpe).a();
    }
}
