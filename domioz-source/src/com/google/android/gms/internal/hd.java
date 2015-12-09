// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.accounts.Account;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            ix, iw, iy, he, 
//            zzjb, zzir, gj, gr, 
//            no

public final class hd
{

    private static ix a(Bundle bundle)
    {
        ix ix1 = new ix();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = bundle.keySet().iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            Object obj = bundle.get(s);
            iw iw1 = new iw();
            iw1.a = s;
            iw1.b = new iy();
            if (obj instanceof String)
            {
                iw1.b.b = (String)obj;
            } else
            if (obj instanceof Bundle)
            {
                iw1.b.e = a((Bundle)obj);
            } else
            {
                Log.e("AppDataSearchClient", (new StringBuilder("Unsupported value: ")).append(obj).toString());
            }
            arraylist.add(iw1);
        }
        if (bundle.containsKey("type"))
        {
            ix1.a = bundle.getString("type");
        }
        ix1.b = (iw[])arraylist.toArray(new iw[arraylist.size()]);
        return ix1;
    }

    public static zzjb a(a a1, long l, String s, int i)
    {
        boolean flag = false;
        Object obj1 = new Bundle();
        ((Bundle) (obj1)).putAll(a1.a());
        Object obj2 = ((Bundle) (obj1)).getBundle("object");
        Object obj;
        String s1;
        String s2;
        int j;
        if (((Bundle) (obj2)).containsKey("id"))
        {
            obj = Uri.parse(((Bundle) (obj2)).getString("id"));
        } else
        {
            obj = null;
        }
        s1 = ((Bundle) (obj2)).getString("name");
        s2 = ((Bundle) (obj2)).getString("type");
        obj2 = com.google.android.gms.internal.he.a(s, Uri.parse(((Bundle) (obj2)).getString("url")));
        obj = com.google.android.gms.internal.zzjb.a(((android.content.Intent) (obj2)), s1, ((Uri) (obj)), s2);
        if (((Bundle) (obj1)).containsKey(".private:ssbContext"))
        {
            ((gj) (obj)).a(com.google.android.gms.internal.zzir.a(((Bundle) (obj1)).getByteArray(".private:ssbContext")));
            a1.a().remove(".private:ssbContext");
        }
        if (((Bundle) (obj1)).containsKey(".private:accountName"))
        {
            ((gj) (obj)).a(new Account(((Bundle) (obj1)).getString(".private:accountName"), "com.google"));
            a1.a().remove(".private:accountName");
        }
        j = i;
        if (((Bundle) (obj1)).containsKey(".private:isContextOnly"))
        {
            j = i;
            if (((Bundle) (obj1)).getBoolean(".private:isContextOnly"))
            {
                j = 4;
                a1.a().remove(".private:isContextOnly");
            }
        }
        if (((Bundle) (obj1)).containsKey(".private:isDeviceOnly"))
        {
            flag = ((Bundle) (obj1)).getBoolean(".private:isDeviceOnly", false);
            a1.a().remove(".private:isDeviceOnly");
        }
        a1 = a(a1.a());
        obj1 = (new gr(".private:action")).a().b(".private:action").a("blob").c();
        ((gj) (obj)).a(new zzir(com.google.android.gms.internal.no.a(a1), ((zziz) (obj1))));
        return new zzjb(com.google.android.gms.internal.zzjb.a(s, ((android.content.Intent) (obj2))), l, j, ((gj) (obj)).b(), flag);
    }
}
