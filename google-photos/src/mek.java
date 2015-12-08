// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Iterator;
import java.util.List;

public final class mek
    implements meq
{

    public mek()
    {
    }

    public final mep a(List list)
    {
        lit lit1;
        lit1 = LatLngBounds.a();
        list = list.iterator();
_L6:
        double d;
        if (!list.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj = (meo)list.next();
        obj = new LatLng(((meo) (obj)).a, ((meo) (obj)).b);
        lit1.a = Math.min(lit1.a, ((LatLng) (obj)).b);
        lit1.b = Math.max(lit1.b, ((LatLng) (obj)).b);
        d = ((LatLng) (obj)).c;
        if (!Double.isNaN(lit1.c)) goto _L2; else goto _L1
_L1:
        lit1.c = d;
_L4:
        lit1.d = d;
        continue; /* Loop/switch isn't completed */
_L2:
        boolean flag;
        if (lit1.c <= lit1.d)
        {
            if (lit1.c <= d && d <= lit1.d)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        if (lit1.c <= d || d <= lit1.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (LatLngBounds.a(lit1.c, d) >= LatLngBounds.b(lit1.d, d)) goto _L4; else goto _L3
_L3:
        lit1.c = d;
        if (true) goto _L6; else goto _L5
_L5:
        boolean flag1;
        if (!Double.isNaN(lit1.c))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b.a(flag1, "no included points");
        return new mep(new LatLngBounds(new LatLng(lit1.a, lit1.c), new LatLng(lit1.b, lit1.d)));
    }
}
