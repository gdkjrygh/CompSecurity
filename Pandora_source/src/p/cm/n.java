// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.cm;

import android.os.AsyncTask;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.radio.data.j;
import com.pandora.radio.provider.d;
import com.pandora.radio.util.c;
import p.df.a;

public class n extends AsyncTask
{

    private String a;
    private String b;
    private String c;

    public n(String s1)
    {
        c = s1;
    }

    public n(String s1, String s2)
    {
        a = s1;
        b = s2;
    }

    protected transient PandoraIntent a(Object aobj[])
    {
        PandoraIntent pandoraintent;
        pandoraintent = new PandoraIntent("show_genre_stations");
        pandoraintent.putExtra("intent_show_force_screen", true);
        pandoraintent.putExtra("intent_search_result_consumer", new c(null));
        aobj = b.a.b().w().c();
        if (s.a(a)) goto _L2; else goto _L1
_L1:
        aobj = ((com.pandora.radio.provider.c) (aobj)).a(a);
_L13:
        if (aobj == null) goto _L4; else goto _L3
_L3:
        pandoraintent.putExtra("intent_genre_category_name", ((j) (aobj)).a());
        if (b == null) goto _L6; else goto _L5
_L5:
        String s1 = b;
_L7:
        pandoraintent.putExtra("intent_genre_name", s1);
        pandoraintent.putExtra("intent_category_ad_url", ((j) (aobj)).c());
        pandoraintent.putExtra("intent_category_gcat", ((j) (aobj)).b());
        pandoraintent.putExtra("intent_stations_list", ((j) (aobj)).d());
        pandoraintent.putExtra("intent_page_name", p.i);
        return pandoraintent;
_L2:
        if (!s.a(c))
        {
            aobj = ((com.pandora.radio.provider.c) (aobj)).b(c);
            continue; /* Loop/switch isn't completed */
        }
        aobj = null;
        continue; /* Loop/switch isn't completed */
_L6:
        s1 = ((j) (aobj)).a();
          goto _L7
_L4:
        if (a == null) goto _L9; else goto _L8
_L8:
        aobj = a;
_L10:
        p.df.a.c("GetGenreStationCategoryTask", String.format("Odd, a genre station match string of '%s' was specified, but no such genre was found", new Object[] {
            aobj
        }));
_L11:
        pandoraintent.putExtra("intent_page_name", p.h);
        return pandoraintent;
_L9:
        aobj = c;
          goto _L10
        aobj;
        p.df.a.b("GetGenreStationCategoryTask", "GetGenreStationCategoryTask error ", ((Throwable) (aobj)));
          goto _L11
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void a(PandoraIntent pandoraintent)
    {
        b.a.C().a(pandoraintent);
    }

    protected Object doInBackground(Object aobj[])
    {
        return a(aobj);
    }

    public void onPostExecute(Object obj)
    {
        a((PandoraIntent)obj);
    }
}
