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
import com.tinder.model.ProfilePhoto;
import com.tinder.model.User;
import com.tinder.parse.UserParse;
import java.io.IOException;
import java.util.ArrayList;
import okio.d;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.tinder.managers:
//            z, ManagerApp, d

final class t> extends u
{

    final ng a;

    public final r a()
    {
        return r.a("application/json");
    }

    public final void a(d d1)
        throws IOException
    {
        d1.c(a.a.toString().getBytes());
    }

    >(> >)
    {
        a = >;
        super();
    }

    // Unreferenced inner class com/tinder/managers/z$7

/* anonymous class */
    final class z._cls7 extends AsyncTask
    {

        final JSONObject a;
        final boolean b;
        final boolean c;
        final int d;
        final int e;
        final String f;
        final y g;
        final ProfilePhoto h;
        final z i;

        private transient Boolean a()
        {
            Object obj;
            obj = (new com.squareup.okhttp.t.a()).a(i.a.e).a("DELETE", new z._cls7._cls1(this)).b("User-Agent", f.a);
            ManagerApp.h().g();
            obj = ((com.squareup.okhttp.t.a) (obj)).b("X-Auth-Token", com.tinder.managers.d.b()).b("os-version", f.ab).b("app-version", f.ac).b("platform", "android").a();
            int j = -1;
            try
            {
                obj = i.c.a(((com.squareup.okhttp.t) (obj))).a();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                com.tinder.utils.v.a("FAiled to delete photo", ((Throwable) (obj)));
                return Boolean.valueOf(false);
            }
            if (obj == null)
            {
                break MISSING_BLOCK_LABEL_116;
            }
            j = ((v) (obj)).h.c;
            if (j != 200)
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
                UserParse.a(new JSONArray(((String) (obj))), arraylist, i.b().getId());
            }
            catch (Exception exception)
            {
                com.tinder.utils.v.a("Failed to parse into json delete photo response", exception);
                return Boolean.valueOf(false);
            }
            i.a(arraylist);
            return Boolean.valueOf(true);
        }

        protected final Object doInBackground(Object aobj[])
        {
            return a();
        }

        public final void onPostExecute(Object obj)
        {
            if (((Boolean)obj).booleanValue())
            {
                if (b)
                {
                    if (c)
                    {
                        i.a(d, e, f, i.b().getOtherPhotoIds(f), g, h);
                        return;
                    } else
                    {
                        g.a(e, h);
                        return;
                    }
                } else
                {
                    g.b(e);
                    return;
                }
            }
            if (b)
            {
                g.a(e);
                return;
            } else
            {
                g.c(e);
                return;
            }
        }

            
            {
                i = z1;
                a = jsonobject;
                b = flag;
                c = flag1;
                d = j;
                e = k;
                f = s1;
                g = y1;
                h = profilephoto;
                super();
            }
    }

}
