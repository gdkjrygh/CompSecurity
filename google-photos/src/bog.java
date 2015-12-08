// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class bog extends mtf
{

    private static String a = bog.getSimpleName();
    private final int b;
    private final noj c;
    private final boh j;
    private final nom k;

    public bog(String s, int i, noj noj1, boh boh1, nom nom1)
    {
        String s1 = a;
        super((new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append("|").append(s).toString());
        b = i;
        c = (noj)b.a(noj1, "dataProvider", null);
        j = (boh)b.a(boh1, "assetUriProvider", null);
        k = (nom)b.a(nom1, "storyboardResult", null);
    }

    protected final mue a(Context context)
    {
        boi boi1;
        Object obj;
        int i;
        int l;
        pxo apxo[];
        pxo pxo1;
        int j1;
        try
        {
            boi1 = new boi(this);
            l = b;
            nom nom1 = k;
            obj = new HashSet(nom1.b.b.length);
            apxo = nom1.b.b;
            j1 = apxo.length;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.w(a, "failed to lookup cloud media URIs", context);
            return new mue(0, context, null);
        }
        i = 0;
_L9:
        if (i >= j1)
        {
            break MISSING_BLOCK_LABEL_193;
        }
        pxo1 = apxo[i];
        if (pxo1.a == 3 || pxo1.a == 1)
        {
            ((Set) (obj)).add(pxo1.b.a.c);
            break MISSING_BLOCK_LABEL_765;
        }
        if (pxo1.a == 7)
        {
            boi1.b.put(nnt.a(pxo1.b.d.a.longValue()), boi1.j.j.a(pxo1.b.d.a.longValue()));
        }
        break MISSING_BLOCK_LABEL_765;
        Map map;
        map = boi1.j.c.a(l, ((java.util.Collection) (obj)));
        obj = ((Set) (obj)).iterator();
_L5:
        if (!((Iterator) (obj)).hasNext()) goto _L2; else goto _L1
_L1:
        nnt nnt1;
        Object obj1;
        obj1 = (String)((Iterator) (obj)).next();
        nnt1 = nnt.a(((String) (obj1)));
        if (map.containsKey(obj1)) goto _L4; else goto _L3
_L3:
        boi1.a.add(nnt1);
          goto _L5
_L4:
        obj1 = (nns)map.get(obj1);
        if (boi1.e || ((nns) (obj1)).a() != nod.b || ((nns) (obj1)).d() != null) goto _L7; else goto _L6
_L6:
        boi1.e = true;
_L2:
        if (boi1.e)
        {
            return new mue(1, null, null);
        }
        break MISSING_BLOCK_LABEL_501;
_L7:
        nob nob = ((nns) (obj1)).c();
        if (nob != null)
        {
            break MISSING_BLOCK_LABEL_367;
        }
        boi1.a.add(nnt1);
          goto _L5
label0:
        {
            boi1.d = boi1.d + 1;
            boi1.b.put(nnt1, nob);
            boi1.c.put(nnt1, Boolean.valueOf(((nns) (obj1)).e()));
            if (!((nns) (obj1)).f())
            {
                break MISSING_BLOCK_LABEL_462;
            }
            if (((nns) (obj1)).a() != nod.a)
            {
                break label0;
            }
            boi1.f = boi1.f + 1;
        }
          goto _L5
        boi1.h = boi1.h + 1;
          goto _L5
label1:
        {
            if (((nns) (obj1)).a() != nod.a)
            {
                break label1;
            }
            boi1.g = boi1.g + 1;
        }
          goto _L5
        boi1.i = boi1.i + 1;
          goto _L5
        Map map1 = (Map)b.a(boi1.b, "mediaIdToUri", null);
        Set set = (Set)b.a(boi1.a, "deletedCloudMediaIds", null);
        ocg ocg1 = new ocg();
        i = boi1.f;
        int i1 = boi1.h;
        int k1 = boi1.g;
        int l1 = boi1.i;
        rar rar1 = new rar();
        rar1.a = Integer.valueOf(i);
        rar1.c = Integer.valueOf(i1);
        rar1.b = Integer.valueOf(k1);
        rar1.d = Integer.valueOf(l1);
        ocg1.a = rar1;
        ((mrv)olm.a(context, mrv)).a(context, ocg1);
        boolean flag;
        if (set.isEmpty() && boi1.g == 0 && boi1.i == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = new mue(true);
        context.a().putParcelable("media", new ddv(map1));
        context.a().putParcelableArrayList("deletedMedia", new ArrayList(set));
        context.a().putInt("numDeletedMedia", boi1.d);
        context.a().putParcelable("localVideoStreams", new ddt(boi1.c));
        context.a().putBoolean("allAssetsLocal", flag);
        return context;
        i++;
        if (true) goto _L9; else goto _L8
_L8:
    }

}
