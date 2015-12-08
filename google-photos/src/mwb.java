// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class mwb extends omp
{

    private List a;
    private Bundle b;
    private mwg c;

    public mwb()
    {
    }

    static void a(mwb mwb1)
    {
        mvz mvz1 = new mvz();
        Object obj2 = mwb1.a;
        Object obj = mwb1.b;
        Object obj1 = new mvw(new StringWriter());
        Collections.sort(((List) (obj2)), new mvy());
        obj2 = ((List) (obj2)).iterator();
        do
        {
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            mvx mvx1 = (mvx)((Iterator) (obj2)).next();
            if (((Bundle) (obj)).getBoolean(mvx1.a(), false))
            {
                String s = String.valueOf(mvx1.a());
                ((PrintWriter) (obj1)).println((new StringBuilder(String.valueOf(s).length() + 15)).append("-- ").append(s).append(" ----------\n").toString());
                mvx1.a(((PrintWriter) (obj1)));
                ((PrintWriter) (obj1)).println("");
            }
        } while (true);
        obj = obj1.toString();
        obj1 = new Bundle();
        ((Bundle) (obj1)).putString("bundled_text_key", ((String) (obj)));
        mvz1.f(((Bundle) (obj1)));
        mwb1.O_().c().a().b(q.bo, mvz1).a(null).b();
    }

    static void a(mwb mwb1, View view)
    {
        CheckBox checkbox = (CheckBox)view.findViewById(q.bp);
        checkbox.toggle();
        view = (String)view.getTag();
        if (checkbox.isChecked())
        {
            mwb1.b.putBoolean(view, checkbox.isChecked());
            return;
        } else
        {
            mwb1.b.remove(view);
            return;
        }
    }

    static Bundle b(mwb mwb1)
    {
        return mwb1.b;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = (LinearLayout)layoutinflater.inflate(b.Ew, viewgroup, false);
        viewgroup = (RecyclerView)layoutinflater.findViewById(q.br);
        viewgroup.a(new adi(ad));
        viewgroup.a(new mwe(this, a));
        ((Button)layoutinflater.findViewById(q.bt)).setOnClickListener(new mwc(this));
        return layoutinflater;
    }

    public final void a(Activity activity)
    {
        super.a(activity);
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        c = new mwg(ad);
        Object obj = c.a.getStringSet("app_info_bundle_key", new HashSet());
        bundle = new Bundle();
        if (obj != null)
        {
            for (obj = ((Set) (obj)).iterator(); ((Iterator) (obj)).hasNext(); bundle.putBoolean((String)((Iterator) (obj)).next(), true)) { }
        }
        b = bundle;
        a = ae.c(mvx);
        Collections.sort(a, new mvy());
    }

    public final void aj_()
    {
        super.aj_();
        mwg mwg1 = c;
        Bundle bundle = b;
        mwg1.a.edit().putStringSet("app_info_bundle_key", bundle.keySet()).apply();
    }
}
