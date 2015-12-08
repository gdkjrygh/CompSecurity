// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.model.Match;
import com.tinder.utils.v;
import com.tinder.views.BadgeView;
import com.tinder.views.CustomTextView;
import com.tinder.views.RoundImageView;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

// Referenced classes of package com.tinder.adapters:
//            x

public class ab extends android.support.v7.widget.RecyclerView.Adapter
{
    static final class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        android.support.v7.widget.RecyclerView.LayoutParams a;
        int b;
        View c;
        RoundImageView d;
        ImageView e;
        ImageView f;
        BadgeView g;
        CustomTextView h;

        public a(View view)
        {
            super(view);
            a = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
            b = a.rightMargin;
            c = view;
            h = (CustomTextView)view.findViewById(0x7f0e01ea);
            d = (RoundImageView)view.findViewById(0x7f0e01ec);
            e = (ImageView)view.findViewById(0x7f0e01ed);
            f = (ImageView)view.findViewById(0x7f0e01ee);
            g = (BadgeView)view.findViewById(0x7f0e01eb);
        }
    }


    c a;
    public ArrayList b;
    private int c;
    private Context d;

    public ab(Context context)
    {
        ManagerApp.h().a(this);
        d = context;
        c = d.getResources().getDimensionPixelSize(0x7f090159);
        b = new RecyclerAdapterNewMatches._cls1();
    }

    public final int a(Match match)
    {
        b.add(match);
        return b.indexOf(match);
    }

    public final Match a(int i)
        throws IndexOutOfBoundsException
    {
        if (i < 0 || i >= b.size())
        {
            return null;
        } else
        {
            return (Match)b.get(i);
        }
    }

    public final void a(int i, Match match)
    {
        if (i < 0 || i >= b.size())
        {
            v.b((new StringBuilder("Cannot update new match position at ")).append(i).append(", because that is an invalid index.").toString());
            return;
        } else
        {
            b.remove(i);
            notifyItemRemoved(i);
            b.add(i, match);
            return;
        }
    }

    public final boolean b(Match match)
    {
        int i = b.indexOf(match);
        if (i >= 0 && i < b.size())
        {
            b.remove(i);
            notifyItemRemoved(i);
            return true;
        }
        if (i >= 0 && b.remove(match))
        {
            notifyDataSetChanged();
        }
        return false;
    }

    public final int c(Match match)
    {
        return b.indexOf(match);
    }

    public int getItemCount()
    {
        return b.size();
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        viewholder = (a)viewholder;
        Match match = (Match)b.get(i);
        String s1;
        if (i == 0)
        {
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams = ((a) (viewholder)).a;
            layoutparams.leftMargin = c;
            ((a) (viewholder)).itemView.setLayoutParams(layoutparams);
        } else
        {
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams1 = ((a) (viewholder)).a;
            layoutparams1.leftMargin = ((a) (viewholder)).b;
            ((a) (viewholder)).itemView.setLayoutParams(layoutparams1);
        }
        ((a) (viewholder)).h.setText(match.getName());
        s1 = match.getThumbnailUrl();
        if (!TextUtils.isEmpty(s1))
        {
            Picasso.a(d).a(s1).a(0x7f020167).a(0x7f090081, 0x7f090081).b().a(com/tinder/adapters/ab).a(((a) (viewholder)).d);
        } else
        {
            Picasso.a(d).a(0x7f020167).a(0x7f090081, 0x7f090081).b().a(com/tinder/adapters/x).a(((a) (viewholder)).d);
        }
        if (match.isTouched())
        {
            ((a) (viewholder)).e.setVisibility(8);
        } else
        {
            ((a) (viewholder)).e.setVisibility(0);
        }
        if (match.isSuperlike())
        {
            ((a) (viewholder)).f.setVisibility(0);
        } else
        {
            ((a) (viewholder)).f.setVisibility(8);
        }
        ((a) (viewholder)).g.displayBadge(match);
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new a(LayoutInflater.from(d).inflate(0x7f03007a, viewgroup, false));
    }

    // Unreferenced inner class com/tinder/adapters/RecyclerAdapterNewMatches$1

/* anonymous class */
    class RecyclerAdapterNewMatches._cls1 extends ArrayList
    {

        final ab a;

        public void add(int i, Object obj)
        {
            super.add(i, (Match)obj);
            a.notifyItemInserted(i);
        }

        public boolean add(Object obj)
        {
            obj = (Match)obj;
            int j = Collections.binarySearch(this, obj);
            int i = j;
            if (j < 0)
            {
                i = ~j;
            }
            super.add(i, obj);
            a.notifyItemInserted(i);
            return true;
        }

        public boolean addAll(Collection collection)
        {
            super.addAll(collection);
            Collections.sort(this);
            a.notifyDataSetChanged();
            return true;
        }

            
            {
                a = ab.this;
                super(10);
            }
    }

}
