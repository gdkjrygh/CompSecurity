// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.squareup.picasso.Picasso;

public final class eiq extends BaseAdapter
{

    private String a;
    private Uri b;
    private String c;
    private Context d;
    private final Flags e;
    private Verified f;

    public eiq(Context context, String s, Uri uri, String s1, Flags flags)
    {
        a = s;
        b = uri;
        c = s1;
        d = context;
        e = flags;
    }

    static Flags a(eiq eiq1)
    {
        return eiq1.e;
    }

    static String b(eiq eiq1)
    {
        return eiq1.c;
    }

    static Context c(eiq eiq1)
    {
        return eiq1.d;
    }

    static String d(eiq eiq1)
    {
        return eiq1.a;
    }

    static Verified e(eiq eiq1)
    {
        return eiq1.f;
    }

    public final int getCount()
    {
        return 1;
    }

    public final Object getItem(int i)
    {
        return null;
    }

    public final long getItemId(int i)
    {
        return 0L;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        View view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(d).inflate(0x7f03003c, viewgroup, false);
            view = ((gft)dmz.a(gft)).a();
            TextView textview = (TextView)view1.findViewById(0x7f11026e);
            TextView textview1 = (TextView)view1.findViewById(0x7f1102ee);
            TextView textview2 = (TextView)view1.findViewById(0x7f1102ef);
            ImageView imageview = (ImageView)view1.findViewById(0x7f1102ed);
            ImageView imageview1 = (ImageView)view1.findViewById(0x7f1102eb);
            f = ViewUri.an.a((new StringBuilder()).append(a).append(":radio").toString());
            textview.setText(c);
            textview1.setText(0x7f080436);
            textview2.setText(d.getString(0x7f080435, new Object[] {
                c
            }));
            view1.setOnClickListener(new android.view.View.OnClickListener(viewgroup) {

                private ViewGroup a;
                private eiq b;

                public final void onClick(View view2)
                {
                    if (gpl.a(eiq.a(b)))
                    {
                        view2 = gms.a(eiq.c(b), gpl.b(eiq.d(b))).a(eiq.b(b)).a;
                        eiq.c(b).startActivity(view2);
                        return;
                    } else
                    {
                        dmz.a(fos);
                        fos.a(a.getContext(), eiq.d(b), eiq.e(b));
                        dmz.a(fos);
                        fos.a((Activity)a.getContext(), eiq.d(b));
                        return;
                    }
                }

            
            {
                b = eiq.this;
                a = viewgroup;
                super();
            }
            });
            view.a(b).a(0x7f02006d).a(new dgf(10, 64)).b(0x7f02006d).a(imageview1, null);
            view.a(b).a(0x7f02006d).a(new gah(d, true, (byte)0)).b(0x7f02006d).a(imageview, null);
        }
        return view1;
    }
}
