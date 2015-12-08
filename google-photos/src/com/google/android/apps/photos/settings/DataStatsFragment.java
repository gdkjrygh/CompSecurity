// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b;
import iav;
import iaw;
import iaz;
import java.util.Map;
import mmr;
import mwx;
import olm;
import omp;
import p;

public class DataStatsFragment extends omp
{

    private iaz a;
    private mwx b;
    private TextView c;
    private View d;

    public DataStatsFragment()
    {
    }

    public static TextView a(DataStatsFragment datastatsfragment)
    {
        return datastatsfragment.c;
    }

    public static void a(DataStatsFragment datastatsfragment, Map map)
    {
        datastatsfragment.c.setVisibility(0);
        TextView textview = datastatsfragment.c;
        String s = String.valueOf("Bootstrap status: ");
        String s1 = (String)map.get("Bootstrap status: ");
        String s2 = String.valueOf("Library sync status: ");
        String s3 = (String)map.get("Library sync status: ");
        String s4 = String.valueOf("Photos in Library:      ");
        String s5 = (String)map.get("media");
        String s6 = String.valueOf("Total Remote Photos:    ");
        String s7 = (String)map.get("remote_media");
        String s8 = String.valueOf("Total Local Photos:     ");
        String s9 = (String)map.get("local_media");
        String s10 = String.valueOf("Total Local Trash Photos:    ");
        String s11 = (String)map.get("Total Local Trash Photos:    ");
        String s12 = String.valueOf("Cached All Media Count: ");
        String s13 = (String)map.get("cached_all_media_count");
        String s14 = String.valueOf("All Deduplicated Media Count: ");
        String s15 = (String)map.get("All Deduplicated Media Count: ");
        String s16 = String.valueOf("Data subfolders:\n");
        String s17 = (String)map.get("Data subfolders:\n");
        String s18 = String.valueOf("Cache subfolders:\n");
        String s19 = (String)map.get("Cache subfolders:\n");
        String s20 = String.valueOf("Database files:\n");
        map = (String)map.get("Database files:\n");
        textview.setText((new StringBuilder(String.valueOf(s).length() + 11 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length() + String.valueOf(s5).length() + String.valueOf(s6).length() + String.valueOf(s7).length() + String.valueOf(s8).length() + String.valueOf(s9).length() + String.valueOf(s10).length() + String.valueOf(s11).length() + String.valueOf(s12).length() + String.valueOf(s13).length() + String.valueOf(s14).length() + String.valueOf(s15).length() + String.valueOf(s16).length() + String.valueOf(s17).length() + String.valueOf(s18).length() + String.valueOf(s19).length() + String.valueOf(s20).length() + String.valueOf(map).length())).append(s).append(s1).append("\n").append(s2).append(s3).append("\n").append(s4).append(s5).append("\n").append(s6).append(s7).append("\n").append(s8).append(s9).append("\n").append(s10).append(s11).append("\n").append(s12).append(s13).append("\n").append(s14).append(s15).append("\n").append(s16).append(s17).append("\n").append(s18).append(s19).append("\n").append(s20).append(map).append("\n").toString());
        datastatsfragment.d.setVisibility(8);
        datastatsfragment.b.a(new iaw(datastatsfragment), 1000L);
    }

    public static iaz b(DataStatsFragment datastatsfragment)
    {
        return datastatsfragment.a;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(b.yB, null);
        c = (TextView)layoutinflater.findViewById(p.aQ);
        c.setOnLongClickListener(new iav(this));
        d = layoutinflater.findViewById(p.aO);
        a.b();
        return layoutinflater;
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        int i = ((mmr)ae.a(mmr)).d();
        b = (mwx)ae.a(mwx);
        a = new iaz(this, O_(), af, i, p.aP);
    }
}
