// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.c;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.c;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.b;
import com.google.android.gms.maps.model.d;
import com.jcp.b.a;
import com.jcp.storepickup.pojo.Stores;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.c:
//            t

public class s extends AsyncTask
{

    private Stores a;
    private Context b;
    private c c;
    private d d;
    private List e;

    public s(Stores stores, Context context, c c1)
    {
        a = stores;
        b = context;
        c = c1;
        d = new d();
        e = new ArrayList();
    }

    static Context a(s s1)
    {
        return s1.b;
    }

    protected transient List a(Void avoid[])
    {
        if (b == null)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        String s1;
        if (c == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        avoid = a.getLatitude();
        s1 = a.getLongitude();
        if (avoid != null && s1 != null)
        {
            try
            {
                if (!avoid.isEmpty() && !s1.isEmpty())
                {
                    avoid = new LatLng(Double.valueOf(avoid).doubleValue(), Double.valueOf(s1).doubleValue());
                    d.a(avoid);
                    e.add(avoid);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Void avoid[])
            {
                avoid.printStackTrace();
            }
        }
        return e;
        com.jcp.b.a.i();
        break MISSING_BLOCK_LABEL_94;
    }

    protected void a(List list)
    {
        super.onPostExecute(list);
        for (int i = 0; i < list.size(); i++)
        {
            c.a((new MarkerOptions()).a((LatLng)list.get(i)).a(com.google.android.gms.maps.model.b.a(0x7f020169)));
            c.a(com.google.android.gms.maps.b.a(new LatLng(((LatLng)list.get(i)).a, ((LatLng)list.get(i)).b), 12F));
            c.a(new t(this));
        }

        com.jcp.b.a.i();
    }

    protected Object doInBackground(Object aobj[])
    {
        return a((Void[])aobj);
    }

    protected void onPostExecute(Object obj)
    {
        a((List)obj);
    }

    protected void onPreExecute()
    {
        super.onPreExecute();
        com.jcp.b.a.a(b, 0x7f070317);
    }
}
