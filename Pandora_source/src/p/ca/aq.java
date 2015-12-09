// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.pandora.android.util.aa;
import com.pandora.radio.data.StationRecommendation;
import com.pandora.radio.data.StationRecommendations;
import com.pandora.radio.provider.k;
import p.l.c;
import p.l.d;
import p.l.g;
import p.l.j;

public class aq extends ArrayAdapter
{

    private final LayoutInflater a;
    private aa b;

    public aq(Context context, StationRecommendations stationrecommendations, aa aa1, boolean flag)
    {
        if (flag)
        {
            stationrecommendations = new StationRecommendation[0];
        } else
        {
            stationrecommendations = k.a(stationrecommendations, null, null, true);
        }
        super(context, 0, stationrecommendations);
        a = (LayoutInflater)context.getSystemService("layout_inflater");
        b = aa1;
    }

    static boolean a(StationRecommendation stationrecommendation)
    {
        return stationrecommendation == k.c || stationrecommendation == k.a;
    }

    protected View a(View view, ViewGroup viewgroup, StationRecommendation stationrecommendation)
    {
        if (view == null)
        {
            view = a.inflate(0x7f0400a2, viewgroup, false);
        }
        viewgroup = (TextView)view.findViewById(0x7f1002ac);
        if (stationrecommendation == k.c)
        {
            viewgroup.setText(0x7f080261);
            return view;
        } else
        {
            viewgroup.setText(0x7f0800be);
            return view;
        }
    }

    public StationRecommendation[] a()
    {
        StationRecommendation astationrecommendation[] = new StationRecommendation[getCount()];
        for (int i = 0; i < getCount(); i++)
        {
            astationrecommendation[i] = (StationRecommendation)getItem(i);
        }

        return astationrecommendation;
    }

    public boolean areAllItemsEnabled()
    {
        return true;
    }

    protected View b(View view, ViewGroup viewgroup, StationRecommendation stationrecommendation)
    {
        if (view != null)
        {
            return view;
        } else
        {
            view = a.inflate(0x7f0400a4, viewgroup, false);
            viewgroup = (TextView)view.findViewById(0x7f10011b);
            viewgroup.setText(0x7f080260);
            ((android.widget.LinearLayout.LayoutParams)viewgroup.getLayoutParams()).topMargin = getContext().getResources().getDimensionPixelSize(0x7f09014b);
            return view;
        }
    }

    protected View c(View view, ViewGroup viewgroup, StationRecommendation stationrecommendation)
    {
        com.pandora.radio.data.StationRecommendations.b b1 = stationrecommendation.j();
        if (view == null)
        {
            if (b1 == com.pandora.radio.data.StationRecommendations.b.f)
            {
                view = a.inflate(0x7f040089, viewgroup, false);
            } else
            {
                view = a.inflate(0x7f0400a8, viewgroup, false);
            }
        }
        b.a(stationrecommendation);
        ((TextView)view.findViewById(0x7f10011b)).setText(stationrecommendation.b());
        viewgroup = (ImageView)view.findViewById(0x7f1000b5);
        g.b(getContext()).a(stationrecommendation.m()).a(0x7f0200e9).a(viewgroup);
        return view;
    }

    public int getItemViewType(int i)
    {
        StationRecommendation stationrecommendation = (StationRecommendation)getItem(i);
        if (stationrecommendation == k.b)
        {
            return 1;
        }
        return !a(stationrecommendation) ? 0 : 2;
    }

    public View getView(int i, View view, ViewGroup viewgroup)
    {
        StationRecommendation stationrecommendation = (StationRecommendation)getItem(i);
        if (stationrecommendation == k.b)
        {
            return b(view, viewgroup, stationrecommendation);
        }
        if (a(stationrecommendation))
        {
            return a(view, viewgroup, stationrecommendation);
        } else
        {
            return c(view, viewgroup, stationrecommendation);
        }
    }

    public int getViewTypeCount()
    {
        return 3;
    }

    public boolean isEnabled(int i)
    {
        return (StationRecommendation)getItem(i) != k.b;
    }
}
