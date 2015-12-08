// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.SpotifyLink;
import com.squareup.picasso.Picasso;
import java.lang.ref.WeakReference;

public final class faw extends fav
{

    View k;
    View l;
    private final ezn m;
    private ImageView n;
    private TextView o;

    public faw(LayoutInflater layoutinflater, ViewGroup viewgroup, ezn ezn1)
    {
        super(layoutinflater.inflate(0x7f03006a, viewgroup, false));
        m = ezn1;
        n = (ImageView)a.findViewById(0x7f11026a);
        o = (TextView)a.findViewById(0x7f1102a3);
        k = a.findViewById(0x7f11032d);
        l = a.findViewById(0x7f11032e);
    }

    public final void a(Object obj, int i)
    {
        Object obj1 = (PlayerTrack)obj;
        obj = ((gft)dmz.a(gft)).a();
        ImageView imageview = n;
        TextView textview = o;
        String s = ((PlayerTrack) (obj1)).uri();
        if ((new SpotifyLink(s)).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
        {
            ezn ezn1 = m;
            Object obj2 = new ezo(s, textview) {

                private String a;
                private TextView b;

                public final void a(String s1, String s2)
                {
                    if (s1.equals(a) && !TextUtils.isEmpty(s2))
                    {
                        b.setText(fiw.a(s2));
                        return;
                    } else
                    {
                        b.setVisibility(8);
                        return;
                    }
                }

            
            {
                a = s;
                b = textview;
                super();
            }
            };
            Context context = (Context)ezn1.a.get();
            if (context != null)
            {
                obj2 = new ezp(s, ((ezo) (obj2)), (byte)0);
                (new fie(context, ezn1.b, ((epc) (obj2)))).b(new String[] {
                    s
                });
            }
        }
        textview.setVisibility(8);
        obj1 = fbn.c(((PlayerTrack) (obj1)));
        if (Uri.EMPTY.equals(obj1))
        {
            imageview.setImageResource(0x7f02006b);
        } else
        {
            ((Picasso) (obj)).a(imageview);
            ((Picasso) (obj)).a(((Uri) (obj1))).a(0x7f02006b).a(imageview, null);
        }
        ((com.spotify.android.paste.widget.carousel.CarouselLayoutManager.CarouselLayoutParams)a.getLayoutParams()).a(false);
        x();
    }

    public final void x()
    {
        if (k.getVisibility() == 0)
        {
            l.setVisibility(8);
            return;
        } else
        {
            View view = l;
            View view1 = k;
            view.animate().alpha(0.0F).setListener(new ggp._cls2(view, view1)).start();
            return;
        }
    }
}
