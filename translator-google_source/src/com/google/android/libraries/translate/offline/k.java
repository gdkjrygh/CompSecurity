// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.offline;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.libraries.translate.f;
import com.google.common.base.p;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.offline:
//            d, OfflinePackage, j, l, 
//            b, e, ac, c

public final class k
    implements d
{

    private Context a;
    private b b;
    private e c;

    public k(Context context, b b1, e e1)
    {
        a = context;
        b = b1;
        c = e1;
    }

    public final boolean a(OfflinePackage offlinepackage)
    {
        offlinepackage = OfflinePackage.a(offlinepackage.d).values().iterator();
label0:
        do
        {
            Object obj;
            Object obj1;
label1:
            {
                if (!offlinepackage.hasNext())
                {
                    break label0;
                }
                obj = (j)offlinepackage.next();
                switch (l.a[((j) (obj)).e.ordinal()])
                {
                default:
                    break;

                case 3: // '\003'
                case 4: // '\004'
                case 5: // '\005'
                    obj1 = b;
                    break label1;
                }
                if (false)
                {
                    break label0;
                }
                continue;
            }
            long l1 = ((j) (obj)).j;
            obj = ((b) (obj1)).a;
            obj1 = String.valueOf("use_mobile_data_");
            if (!((SharedPreferences) (obj)).getBoolean((new StringBuilder(String.valueOf(obj1).length() + 20)).append(((String) (obj1))).append(l1).toString(), true))
            {
                return false;
            }
        } while (true);
        return true;
    }

    public final boolean a(j j1, boolean flag, String s)
    {
        boolean flag2 = false;
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (c.a(j1, j1.c)) goto _L2; else goto _L1
_L1:
        j1.e = OfflinePackage.Status.ERROR;
        j1.d = a.getString(f.msg_external_storage_inaccessible);
        j1.c();
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        Uri uri = Uri.parse(j1.b);
        flag1 = flag2;
        if (!TextUtils.isEmpty(j1.c))
        {
            flag1 = true;
        }
        p.a(flag1);
        if (!j1.b())
        {
            Uri uri1 = Uri.fromFile(new File(j1.c));
            j1.j = b.a(uri, uri1, s, flag);
        }
        j1.e = OfflinePackage.Status.INPROGRESS;
        j1.c();
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        j1;
        throw j1;
    }

    public final boolean a(Collection collection)
    {
        this;
        JVM INSTR monitorenter ;
        ArrayList arraylist;
        arraylist = new ArrayList();
        j j1;
        for (Iterator iterator = collection.iterator(); iterator.hasNext(); j1.a.g(j1))
        {
            j1 = (j)iterator.next();
            arraylist.add(j1.b);
        }

        break MISSING_BLOCK_LABEL_69;
        collection;
        throw collection;
        boolean flag = false;
        Iterator iterator1;
        collection = b(collection);
        iterator1 = collection.keySet().iterator();
_L4:
        if (!iterator1.hasNext()) goto _L2; else goto _L1
_L1:
        j j2;
        long l1;
        l1 = ((Long)iterator1.next()).longValue();
        j2 = (j)collection.get(Long.valueOf(l1));
        if (!arraylist.contains(j2.b)) goto _L4; else goto _L3
_L3:
        int i;
        b.b(l1);
        i = l.a[j2.e.ordinal()];
        i;
        JVM INSTR tableswitch 1 2: default 192
    //                   1 90
    //                   2 90;
           goto _L5 _L4 _L4
_L5:
        flag = true;
          goto _L4
_L2:
        this;
        JVM INSTR monitorexit ;
        return flag;
    }

    public final Map b(Collection collection)
    {
        Map map;
        HashMap hashmap;
        Iterator iterator;
        map = OfflinePackage.a(collection);
        hashmap = new HashMap();
        if (map.isEmpty())
        {
            return hashmap;
        }
        iterator = b.d().iterator();
_L8:
        OfflinePackage.Status status;
        c c1;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_378;
        }
        c1 = (c)iterator.next();
        status = OfflinePackage.Status.INPROGRESS;
        c1.e;
        JVM INSTR lookupswitch 3: default 108
    //                   4: 353
    //                   8: 238
    //                   16: 248;
           goto _L1 _L2 _L3 _L4
_L2:
        break MISSING_BLOCK_LABEL_353;
_L1:
        collection = "";
_L5:
        j j1 = (j)map.get(Long.valueOf(c1.a));
        if (j1 != null)
        {
            Object obj;
            int i;
            if (TextUtils.isEmpty(c1.c))
            {
                obj = "";
            } else
            {
                obj = Uri.parse(c1.c).getPath();
            }
            obj = new j(j1.a, j1.i, c1.b, ((String) (obj)), j1.f);
            obj.e = status;
            ((j) (obj)).b(c1.h);
            ((j) (obj)).a(c1.g);
            obj.j = c1.a;
            obj.d = collection;
            hashmap.put(Long.valueOf(c1.a), obj);
        }
        continue; /* Loop/switch isn't completed */
_L3:
        status = OfflinePackage.Status.DOWNLOADED;
        collection = "";
          goto _L5
_L4:
        i = c1.f;
        switch (i)
        {
        default:
            collection = String.valueOf(a.getString(f.err_download_offline_language_failed));
            collection = (new StringBuilder(String.valueOf(collection).length() + 13)).append(collection).append(" E").append(i).toString();
            break;

        case 1009: 
            break MISSING_BLOCK_LABEL_340;
        }
_L6:
        if (TextUtils.isEmpty(collection))
        {
            status = OfflinePackage.Status.DOWNLOADED;
        } else
        {
            status = OfflinePackage.Status.ERROR;
        }
          goto _L5
        collection = "";
          goto _L6
        status = OfflinePackage.Status.PAUSED;
        collection = "";
          goto _L5
        return hashmap;
        if (true) goto _L8; else goto _L7
_L7:
    }
}
