// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.porcelain.holder;

import aay;
import abc;
import abf;
import abm;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.spotify.android.paste.widget.CardView;
import com.spotify.mobile.android.porcelain.PorcelainAdapter;
import com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection;
import com.squareup.picasso.Picasso;
import cty;
import dgf;
import dgo;
import dmz;
import dog;
import doh;
import doi;
import doj;
import dqn;
import dqx;
import drf;
import gcz;
import ges;
import gft;
import ggi;
import ggp;
import gwb;
import gwi;

public final class PorcelainCarouselViewHolder extends dqx
{

    private final PorcelainAdapter k;
    private final TextView l;
    private final RecyclerView m;
    private final LinearLayoutManager n = new LinearLayoutManager();
    private CarouselScrollPosition o;
    private final aay p;
    private final ImageView q;
    private final View r;

    private PorcelainCarouselViewHolder(com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size size, ViewGroup viewgroup, doh doh1)
    {
        super(a(0x7f03011e, viewgroup), doh1);
        dog dog1 = new dog();
        dog1.b = doh1.a;
        dog1.c = doh1.b;
        dog1.a = doh1.c;
        dog1.e = doh1.d;
        dog1.d = doh1.e;
        dog1.c = new dqn(this, (byte)0);
        k = dog1.a(viewgroup.getContext());
        l = (TextView)a.findViewById(0x7f11026e);
        m = (RecyclerView)a.findViewById(0x7f11032d);
        q = (ImageView)a.findViewById(0x7f1102f2);
        r = a.findViewById(0x7f1104a1);
        p = m.o();
        viewgroup.getContext();
        int j1 = c(0x7f0c008d);
        int i;
        int j;
        int i1;
        int k1;
        if (size.compact)
        {
            i = 0;
        } else
        {
            i = c(0x7f0c0126);
        }
        if (size.small)
        {
            j = 0x7f0c0128;
        } else
        {
            j = 0x7f0c0127;
        }
        k1 = c(j);
        j = a.getResources().getInteger(0x7f0e0001);
        if (size.small)
        {
            j = (j * 3) / 2 + 1;
        }
        if (size.small)
        {
            i1 = 3;
        } else
        {
            i1 = 2;
        }
        i1 = j1 / i1;
        i = CardView.a(((gcz)dmz.a(gcz)).b(), j, k1 + i, i, i1 << 1);
        m.getLayoutParams().height = i;
        q.getLayoutParams().height = i;
        m.a(new abc(j1, i1) {

            private int a;
            private int b;
            private PorcelainCarouselViewHolder c;

            public final void a(Rect rect, View view, RecyclerView recyclerview, abm abm)
            {
                super.a(rect, view, recyclerview, abm);
                PorcelainCarouselViewHolder.a(c);
                int i2 = RecyclerView.d(view);
                int j2 = PorcelainCarouselViewHolder.b(c).w();
                int l1;
                if (i2 == 0)
                {
                    l1 = a;
                } else
                {
                    l1 = b;
                }
                if (i2 == j2)
                {
                    i2 = a;
                } else
                {
                    i2 = b;
                }
                rect.set(l1, 0, i2, 0);
            }

            
            {
                c = PorcelainCarouselViewHolder.this;
                a = i;
                b = j;
                super();
            }
        });
        n.a(0);
        m.a();
        m.a(doh1.e);
        m.a(n);
        m.a(k);
        m.a(new abf() {

            private PorcelainCarouselViewHolder a;

            public final void a(RecyclerView recyclerview, int l1, int i2)
            {
label0:
                {
                    if (PorcelainCarouselViewHolder.c(a) != null)
                    {
                        PorcelainCarouselViewHolder.c(a).a = PorcelainCarouselViewHolder.b(a).k();
                        recyclerview = PorcelainCarouselViewHolder.b(a).b(PorcelainCarouselViewHolder.c(a).a);
                        if (recyclerview == null)
                        {
                            break label0;
                        }
                        PorcelainCarouselViewHolder.c(a).b = recyclerview.getLeft();
                    }
                    return;
                }
                PorcelainCarouselViewHolder.c(a).a = 0;
                PorcelainCarouselViewHolder.c(a).b = 0;
            }

            
            {
                a = PorcelainCarouselViewHolder.this;
                super();
            }

            private class CarouselScrollPosition
                implements Parcelable
            {

                public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

                    public final Object createFromParcel(Parcel parcel)
                    {
                        CarouselScrollPosition carouselscrollposition = new CarouselScrollPosition((byte)0);
                        carouselscrollposition.a = parcel.readInt();
                        carouselscrollposition.b = parcel.readInt();
                        return carouselscrollposition;
                    }

                    public final volatile Object[] newArray(int i)
                    {
                        return new CarouselScrollPosition[i];
                    }

                };
                public int a;
                public int b;

                public final int describeContents()
                {
                    return 0;
                }

                public final void writeToParcel(Parcel parcel, int i)
                {
                    parcel.writeInt(a);
                    parcel.writeInt(b);
                }


                private CarouselScrollPosition()
                {
                }

                CarouselScrollPosition(byte byte0)
                {
                    this();
                }
            }

        });
    }

    static RecyclerView a(PorcelainCarouselViewHolder porcelaincarouselviewholder)
    {
        return porcelaincarouselviewholder.m;
    }

    static PorcelainCarouselViewHolder a(ViewGroup viewgroup, doh doh1)
    {
        return new PorcelainCarouselViewHolder(com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size.a, viewgroup, doh1);
    }

    static LinearLayoutManager b(PorcelainCarouselViewHolder porcelaincarouselviewholder)
    {
        return porcelaincarouselviewholder.n;
    }

    static PorcelainCarouselViewHolder b(ViewGroup viewgroup, doh doh1)
    {
        return new PorcelainCarouselViewHolder(com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size.c, viewgroup, doh1);
    }

    private int c(int i)
    {
        return a.getResources().getDimensionPixelSize(i);
    }

    static CarouselScrollPosition c(PorcelainCarouselViewHolder porcelaincarouselviewholder)
    {
        return porcelaincarouselviewholder.o;
    }

    static PorcelainCarouselViewHolder c(ViewGroup viewgroup, doh doh1)
    {
        return new PorcelainCarouselViewHolder(com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size.b, viewgroup, doh1);
    }

    static PorcelainCarouselViewHolder d(ViewGroup viewgroup, doh doh1)
    {
        return new PorcelainCarouselViewHolder(com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.Size.d, viewgroup, doh1);
    }

    protected final void a(drf drf, doj doj1)
    {
        PorcelainCarouselCollection porcelaincarouselcollection = (PorcelainCarouselCollection)drf;
        if (!ggi.a(k.d(), porcelaincarouselcollection))
        {
            k.a(porcelaincarouselcollection);
        }
        RecyclerView recyclerview = m;
        String s;
        com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle backgroundstyle;
        if (doj1.a)
        {
            drf = p;
        } else
        {
            drf = null;
        }
        ggp.a(recyclerview, drf);
        k.c();
        drf = porcelaincarouselcollection.getTitle();
        if (drf != null)
        {
            l.setVisibility(0);
            l.setText(drf);
        } else
        {
            l.setVisibility(8);
        }
        s = porcelaincarouselcollection.getBackground();
        backgroundstyle = porcelaincarouselcollection.getBackgroundStyle();
        if (!cty.a(s, q.getTag(0x7f1100e6)))
        {
            drf = ((gft)dmz.a(gft)).a();
            gwi gwi1 = (gwi)q.getTag(0x7f1100e9);
            if (gwi1 != null)
            {
                drf.a(gwi1);
            }
            if (s != null)
            {
                ges ges1 = new ges(q);
                gwb gwb1 = drf.a(s).a(ges1);
                q.setTag(0x7f1100e9, ges1);
                q.setVisibility(0);
                r.setVisibility(0);
                drf = gwb1;
                if (backgroundstyle == com.spotify.mobile.android.porcelain.collection.PorcelainCarouselCollection.BackgroundStyle.a)
                {
                    drf = gwb1.a(dgf.a);
                }
                drf.a(ges1);
            } else
            {
                dgo.a(q, null);
                q.setVisibility(8);
                r.setVisibility(8);
            }
            q.setTag(0x7f1100e6, s);
        }
        drf = doj1.b.a(porcelaincarouselcollection);
        if (drf instanceof CarouselScrollPosition)
        {
            o = (CarouselScrollPosition)drf;
        } else
        {
            o = new CarouselScrollPosition((byte)0);
            doj1.b.a(porcelaincarouselcollection, o);
        }
        m.i();
        n.a(o.a, o.b);
    }
}
