// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.appindexing.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            hh, qw, hz, hr

public class hy
{

    private static hh a(String s, mv.c c)
    {
        s = (new hp.a(s)).G(true).au(s).at("blob").fG();
        return new hh(qw.f(c), s);
    }

    public static hr a(Action action, String s, long l, String s1, int i)
    {
        Object obj = new Bundle();
        ((Bundle) (obj)).putAll(action.fI());
        Object obj1 = ((Bundle) (obj)).getBundle("object");
        String s2;
        String s3;
        if (((Bundle) (obj1)).containsKey("id"))
        {
            obj = Uri.parse(((Bundle) (obj1)).getString("id"));
        } else
        {
            obj = null;
        }
        s2 = ((Bundle) (obj1)).getString("name");
        s3 = ((Bundle) (obj1)).getString("type");
        obj1 = hz.a(s1, Uri.parse(((Bundle) (obj1)).getString("url")));
        obj = hr.a(((android.content.Intent) (obj1)), s2, ((Uri) (obj)), s3, null);
        ((hd.a) (obj)).a(a(".private:action", d(action.fI())));
        ((hd.a) (obj)).a(aw(s));
        return new hr(hr.a(s1, ((android.content.Intent) (obj1))), l, i, null, ((hd.a) (obj)).fD());
    }

    private static hh aw(String s)
    {
        return new hh(s, (new hp.a(".private:actionId")).G(true).au(".private:actionId").at("blob").fG());
    }

    static mv.c d(Bundle bundle)
    {
        mv.c c = new mv.c();
        ArrayList arraylist = new ArrayList();
        Iterator iterator = bundle.keySet().iterator();
        while (iterator.hasNext()) 
        {
            String s = (String)iterator.next();
            Object obj = bundle.get(s);
            mv.b b = new mv.b();
            b.name = s;
            b.afz = new mv.d();
            if (obj instanceof String)
            {
                b.afz.NJ = (String)obj;
            } else
            if (obj instanceof Bundle)
            {
                b.afz.afE = d((Bundle)obj);
            } else
            {
                Log.e("AppDataSearchClient", (new StringBuilder()).append("Unsupported value: ").append(obj).toString());
            }
            arraylist.add(b);
        }
        if (bundle.containsKey("type"))
        {
            c.type = bundle.getString("type");
        }
        c.afA = (mv.b[])arraylist.toArray(new mv.b[arraylist.size()]);
        return c;
    }
}
