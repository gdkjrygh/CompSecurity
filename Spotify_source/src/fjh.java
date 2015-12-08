// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.mobile.android.spotlets.socialchart.model.InfluencerModel;
import com.spotify.mobile.android.spotlets.socialchart.model.TrackModel;
import com.spotify.mobile.android.spotlets.socialchart.widget.ActivatableRelativeLayout;
import com.spotify.mobile.android.util.ClientEvent;
import java.util.ArrayList;
import java.util.Arrays;

public final class fjh extends ArrayAdapter
{

    public String a;
    private fuj b;
    private boolean c;
    private Context d;
    private fjj e;
    private final gji f;

    public fjh(Context context, TrackModel atrackmodel[], boolean flag, fuj fuj, fjj fjj)
    {
        super(context, 0, new ArrayList(Arrays.asList(atrackmodel)));
        c = flag;
        b = fuj;
        d = context;
        e = fjj;
        dmz.a(gjj);
        f = gjj.a(context);
    }

    static Context a(fjh fjh1)
    {
        return fjh1.d;
    }

    static fuj b(fjh fjh1)
    {
        return fjh1.b;
    }

    static fjj c(fjh fjh1)
    {
        return fjh1.e;
    }

    public final void a(String s)
    {
        a = s;
        notifyDataSetChanged();
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        TrackModel trackmodel = (TrackModel)getItem(i);
        Object obj;
        InfluencerModel ainfluencermodel[];
        Object obj1;
        int j;
        int k;
        boolean flag;
        if (view == null)
        {
            View view1 = LayoutInflater.from(getContext()).inflate(0x7f030134, viewgroup, false);
            fji fji1 = new fji();
            fji1.a = (ActivatableRelativeLayout)view1.findViewById(0x7f11046d);
            fji1.b = (LinearLayout)view1.findViewById(0x7f1104c6);
            fji1.e = (TextView)view1.findViewById(0x7f1104c8);
            fji1.d = (TextView)view1.findViewById(0x7f1102ef);
            fji1.c = (TextView)view1.findViewById(0x7f11026e);
            fji1.f = view1.findViewById(0x7f11046f);
            view = new dhr((ViewGroup)view1.findViewById(0x7f110470));
            viewgroup = gae.a(d, SpotifyIcon.aM);
            viewgroup.setOnClickListener(new android.view.View.OnClickListener(trackmodel, i) {

                private TrackModel a;
                private int b;
                private fjh c;

                public final void onClick(View view2)
                {
                    fud.a(fjh.a(c), fjh.b(c), a);
                    view2 = fjh.c(c);
                    TrackModel trackmodel1 = a;
                    int i1 = b;
                    view2.a(new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.E), trackmodel1, i1);
                }

            
            {
                c = fjh.this;
                a = trackmodel;
                b = i;
                super();
            }
            });
            view.a(viewgroup);
            view1.setTag(fji1);
            viewgroup = fji1;
            view = view1;
            if (!c)
            {
                dgo.b(getContext(), fji1.c, 0x7f0101da);
                dgo.b(getContext(), fji1.d, 0x7f0101db);
                view = view1;
                viewgroup = fji1;
            }
        } else
        {
            viewgroup = (fji)view.getTag();
        }
        obj = ((fji) (viewgroup)).a;
        if (a != null && a.equals(trackmodel.getTrackUri()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj.a = flag;
        ((ActivatableRelativeLayout) (obj)).refreshDrawableState();
        obj = ((fji) (viewgroup)).a;
        if (!trackmodel.isUnavailable())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((ActivatableRelativeLayout) (obj)).setEnabled(flag);
        obj = ((fji) (viewgroup)).d;
        if (!trackmodel.isUnavailable())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((TextView) (obj)).setEnabled(flag);
        obj = ((fji) (viewgroup)).e;
        flag = c;
        if (!trackmodel.isUnavailable())
        {
            j = 1;
        } else
        {
            j = 0;
        }
        k = dgo.c(d, 0x7f0101d1).getColorForState(new int[] {
            0xfefeff62
        }, -1);
        if (j == 0)
        {
            obj1 = dgo.c(d, 0x7f0101d5);
            InfluencerModel influencermodel;
            ImageView imageview;
            int l;
            if (flag)
            {
                j = ((ColorStateList) (obj1)).getColorForState(new int[] {
                    0x101009e
                }, -1);
            } else
            {
                j = ((ColorStateList) (obj1)).getColorForState(new int[] {
                    0xfefeff62
                }, -1);
            }
        } else
        {
            j = k;
        }
        ((TextView) (obj)).setTextColor(j);
        view.setTag(0x7f110041, new fxh(b, trackmodel));
        ainfluencermodel = trackmodel.getInfluencers();
        obj1 = ((fji) (viewgroup)).b;
        l = ainfluencermodel.length;
        k = 0;
        j = 0;
        do
        {
            if (j >= l)
            {
                break;
            }
            influencermodel = ainfluencermodel[j];
            if (k == 3)
            {
                break;
            }
            imageview = (ImageView)((LinearLayout) (obj1)).getChildAt(k);
            f.b(imageview, dto.a(influencermodel.getImageUrl()));
            imageview.setVisibility(0);
            k++;
            j++;
        } while (true);
        for (j = ainfluencermodel.length; j < ((LinearLayout) (obj1)).getChildCount(); j++)
        {
            ((LinearLayout) (obj1)).getChildAt(j).setVisibility(8);
        }

        obj1 = (TextView)((LinearLayout) (obj1)).findViewById(0x7f1104c9);
        j = ainfluencermodel.length;
        if (j <= 3)
        {
            ((TextView) (obj1)).setVisibility(8);
        } else
        if (j < 100)
        {
            ((TextView) (obj1)).setVisibility(0);
            ((TextView) (obj1)).setText((new StringBuilder("+")).append(j - 3).toString());
        } else
        {
            ((TextView) (obj1)).setVisibility(0);
            ((TextView) (obj1)).setText((new StringBuilder()).append(j).append("+").toString());
        }
        ((fji) (viewgroup)).c.setText(trackmodel.getTrackName());
        ((fji) (viewgroup)).d.setText(trackmodel.getArtistsString());
        ((fji) (viewgroup)).e.setText(Integer.toString(trackmodel.getRank()));
        viewgroup = ((fji) (viewgroup)).f;
        if (c && i != getCount() - 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        viewgroup.setVisibility(i);
        return view;
    }
}
