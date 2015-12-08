// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.util.logging.Logger;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class dko extends dxx
{

    private TextView Y;
    private Button Z;
    private AsyncTask a;
    private Button aa;
    private String ab;
    private String ac;
    private String ad;
    private ImageView b;

    public dko()
    {
    }

    private JSONObject F()
    {
        Object obj2 = null;
        Object obj;
        int i;
        obj = (new grp(new gro())).a(new URL("https://api.spotify.com/v1/me"));
        ((HttpURLConnection) (obj)).setRequestMethod("GET");
        ((HttpURLConnection) (obj)).addRequestProperty("Accept", "application/json");
        ((HttpURLConnection) (obj)).addRequestProperty("Authorization", (new StringBuilder("Bearer ")).append(ad).toString());
        i = ((HttpURLConnection) (obj)).getResponseCode();
        if (i != 200) goto _L2; else goto _L1
_L1:
        obj = ((HttpURLConnection) (obj)).getInputStream();
        Object obj3;
        obj2 = obj;
        obj3 = obj2;
        obj = new JSONObject(a(((InputStream) (obj2))));
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                Logger.c("Error", new Object[] {
                    obj2
                });
                return ((JSONObject) (obj));
            }
        }
        return ((JSONObject) (obj));
        Object obj1;
        obj1;
        obj2 = null;
_L6:
        obj3 = obj2;
        Logger.c("Failed obtaining user data.", new Object[] {
            obj1
        });
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                Logger.c("Error", new Object[] {
                    obj1
                });
            }
        }
_L2:
        return null;
        obj1;
_L4:
        if (obj2 != null)
        {
            try
            {
                ((InputStream) (obj2)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj2)
            {
                Logger.c("Error", new Object[] {
                    obj2
                });
            }
        }
        throw obj1;
        obj1;
        obj2 = obj3;
        if (true) goto _L4; else goto _L3
_L3:
        obj1;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj2 = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private static String a(InputStream inputstream)
    {
        StringBuilder stringbuilder = new StringBuilder();
        inputstream = new InputStreamReader(inputstream, "UTF-8");
        char ac1[] = new char[4096];
        do
        {
            int i = inputstream.read(ac1);
            if (-1 != i)
            {
                stringbuilder.append(ac1, 0, i);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    static JSONObject a(dko dko1)
    {
        return dko1.F();
    }

    static void a(dko dko1, JSONObject jsonobject)
    {
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        dko1.ab = jsonobject.getString("display_name");
        dko1.ac = jsonobject.getJSONArray("images").getJSONObject(0).getString("url");
        dko1.Y.setText(dko1.ab);
        dmz.a(gjj);
        jsonobject = gjj.a(dko1.k());
        jsonobject.a(dko1.b, dko1.ac, dff.f(((gji) (jsonobject)).a), dfo.a());
        return;
        dko1;
        Logger.c("JSON error", new Object[] {
            dko1
        });
        return;
    }

    static AsyncTask b(dko dko1)
    {
        dko1.a = null;
        return null;
    }

    public final void B()
    {
        super.B();
        if (a != null)
        {
            a.cancel(true);
            a = null;
        }
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f030076, viewgroup, false);
    }

    public final dkp a()
    {
        return (dkp)H().a(this);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        b = (ImageView)view.findViewById(0x7f110351);
        Y = (TextView)view.findViewById(0x7f110352);
        Z = (Button)view.findViewById(0x7f110353);
        aa = (Button)view.findViewById(0x7f110354);
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        ctz.a(a());
        ctz.a(g());
        ctz.a(Boolean.valueOf(g().containsKey("ARG_TOKEN")));
        ctz.a(Boolean.valueOf(g().containsKey("ARG_USER_NAME")));
        ad = g().getString("ARG_TOKEN");
        Y.setText(g().getString("ARG_USER_NAME"));
        b.setImageDrawable(dff.f(k()));
        Z.setOnClickListener(new android.view.View.OnClickListener() {

            private dko a;

            public final void onClick(View view)
            {
                a.a();
            }

            
            {
                a = dko.this;
                super();
            }
        });
        aa.setOnClickListener(new android.view.View.OnClickListener() {

            private dko a;

            public final void onClick(View view)
            {
                a.a();
            }

            
            {
                a = dko.this;
                super();
            }
        });
        a = new AsyncTask() {

            private dko a;

            protected final Object doInBackground(Object aobj[])
            {
                return dko.a(a);
            }

            protected final void onPostExecute(Object obj)
            {
                obj = (JSONObject)obj;
                dko.b(a);
                dko.a(a, ((JSONObject) (obj)));
            }

            
            {
                a = dko.this;
                super();
            }
        };
        a.execute(new String[0]);
    }
}
