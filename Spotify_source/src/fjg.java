// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.spotlets.socialchart.model.InfluencerModel;
import com.spotify.mobile.android.spotlets.socialchart.model.TrackModel;
import com.spotify.mobile.android.spotlets.socialchart.model.UserModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public final class fjg
{

    public final View a = a();
    private UserModel b;
    private int c;
    private Context d;
    private String e;

    public fjg(Context context, UserModel usermodel)
    {
        d = context;
        b = usermodel;
    }

    private View a()
    {
        TextView textview;
        View view;
        TextView textview1;
        ViewGroup viewgroup;
        LinkedHashSet linkedhashset;
        TrackModel atrackmodel[];
        int i;
        int j;
        if (ggi.b(d))
        {
            i = 2;
        } else
        {
            i = 4;
        }
        c = i;
        view = LayoutInflater.from(d).inflate(0x7f030132, null);
        textview = (TextView)view.findViewById(0x7f11026e);
        viewgroup = (ViewGroup)view.findViewById(0x7f1104c6);
        textview1 = (TextView)view.findViewById(0x7f1104c7);
        linkedhashset = new LinkedHashSet();
        dgo.b(d, textview, 0x7f0101dc);
        atrackmodel = b.getTrackModels();
        j = atrackmodel.length;
        for (i = 0; i < j; i++)
        {
            linkedhashset.addAll(Arrays.asList(atrackmodel[i].getInfluencers()));
        }

        i = linkedhashset.size();
        textview.setText(d.getResources().getQuantityString(0x7f09001f, i, new Object[] {
            Integer.valueOf(i)
        }));
        j = c;
        ArrayList arraylist = new ArrayList();
        Iterator iterator = linkedhashset.iterator();
        i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            InfluencerModel influencermodel = (InfluencerModel)iterator.next();
            if (i >= j)
            {
                break;
            }
            ImageView imageview = (ImageView)viewgroup.getChildAt(i);
            dmz.a(gjj);
            gjj.a(d).b(imageview, dto.a(influencermodel.getImageUrl()));
            imageview.setVisibility(0);
            String s = "";
            if (TextUtils.isEmpty(influencermodel.getName()))
            {
                if (!TextUtils.isEmpty(influencermodel.getUsername()))
                {
                    s = influencermodel.getUsername();
                }
            } else
            {
                s = influencermodel.getName().toString();
            }
            arraylist.add(s);
            imageview.setOnClickListener(new android.view.View.OnClickListener(influencermodel) {

                private InfluencerModel a;

                public final void onClick(View view1)
                {
                    if (!TextUtils.isEmpty(a.getUri()))
                    {
                        view1 = view1.getContext();
                        view1.startActivity(gms.a(view1, a.getUri()).a);
                    }
                }

            
            {
                a = influencermodel;
                super();
            }
            });
            i++;
        } while (true);
        i = linkedhashset.size() - c;
        if (i > 0)
        {
            StringBuilder stringbuilder = new StringBuilder(TextUtils.join(", ", arraylist.subList(0, c)));
            String s1 = d.getResources().getQuantityString(0x7f09001e, i, new Object[] {
                Integer.valueOf(i)
            });
            stringbuilder.append(' ');
            textview1.setText(new SpannableString(stringbuilder.toString()));
            SpannableString spannablestring = new SpannableString(s1);
            spannablestring.setSpan(new ForegroundColorSpan(gcg.b(d, 0x7f0f0128)), 0, spannablestring.length(), 33);
            textview1.append(spannablestring);
            e = stringbuilder.append(s1).toString();
            return view;
        } else
        {
            e = TextUtils.join(", ", arraylist);
            textview1.setText(e);
            return view;
        }
    }
}
