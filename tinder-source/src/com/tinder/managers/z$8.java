// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.managers;

import android.os.AsyncTask;
import com.squareup.okhttp.e;
import com.squareup.okhttp.r;
import com.squareup.okhttp.s;
import com.squareup.okhttp.u;
import com.squareup.okhttp.v;
import com.squareup.okhttp.w;
import com.tinder.a.f;
import com.tinder.e.y;
import com.tinder.f.ak;
import com.tinder.model.User;
import com.tinder.parse.UserParse;
import java.io.IOException;
import java.util.ArrayList;
import okio.d;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            z, ManagerApp, d

final class it> extends AsyncTask
{

    final JSONObject a;
    final ArrayList b;
    final y c;
    final ArrayList d;
    final z e;

    private transient Boolean a()
    {
        Object obj;
        obj = (new com.squareup.okhttp.<init>()).a(e.a.e).a("DELETE", new u() {

            final z._cls8 a;

            public final r a()
            {
                return r.a("application/json");
            }

            public final void a(d d1)
                throws IOException
            {
                d1.c(a.a.toString().getBytes());
            }

            
            {
                a = z._cls8.this;
                super();
            }
        }).b("User-Agent", f.a);
        ManagerApp.h().g();
        obj = ((com.squareup.okhttp.gerApp.h) (obj)).b("X-Auth-Token", com.tinder.managers.d.b()).b("os-version", f.ab).b("app-version", f.ac).b("platform", "android").a();
        int i = -1;
        try
        {
            obj = e.c.a(((com.squareup.okhttp.t) (obj))).a();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.tinder.utils.v.a("Failed to delete photo", ((Throwable) (obj)));
            return Boolean.valueOf(false);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        i = ((v) (obj)).h.c;
        if (i != 200)
        {
            return Boolean.valueOf(false);
        }
        ArrayList arraylist;
        try
        {
            obj = ((v) (obj)).g.e();
        }
        catch (IOException ioexception)
        {
            com.tinder.utils.v.a("Failed to parse body of photo delete to string", ioexception);
            return Boolean.valueOf(false);
        }
        arraylist = new ArrayList(6);
        try
        {
            ManagerApp.h().d();
            UserParse.a(new JSONArray(((String) (obj))), arraylist, e.b().getId());
        }
        catch (Exception exception)
        {
            com.tinder.utils.v.a("Failed to parse into json delete photo response", exception);
            return Boolean.valueOf(false);
        }
        e.a(arraylist);
        return Boolean.valueOf(true);
    }

    protected final Object doInBackground(Object aobj[])
    {
        return a();
    }

    public final void onPostExecute(Object obj)
    {
        if (!((Boolean)obj).booleanValue()) goto _L2; else goto _L1
_L1:
        if (b.size() != 1) goto _L4; else goto _L3
_L3:
        c.b(((Integer)d.get(0)).intValue());
_L6:
        return;
_L4:
        c.a(d);
        return;
_L2:
        int i = 0;
        while (i < b.size()) 
        {
            c.c(((Integer)d.get(i)).intValue());
            i++;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    nit>(z z1, JSONObject jsonobject, ArrayList arraylist, y y1, ArrayList arraylist1)
    {
        e = z1;
        a = jsonobject;
        b = arraylist;
        c = y1;
        d = arraylist1;
        super();
    }
}
