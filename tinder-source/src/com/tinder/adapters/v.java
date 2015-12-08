// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.support.v7.util.SortedList;
import android.support.v7.widget.util.SortedListAdapterCallback;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.model.Person;
import com.tinder.utils.j;
import com.tinder.views.RoundImageView;
import de.greenrobot.event.c;
import java.util.TreeSet;

public final class v extends android.support.v7.widget.RecyclerView.Adapter
{
    static final class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        View a;
        RoundImageView b;
        TextView c;
        TextView d;
        TextView e;
        ImageView f;

        public a(View view)
        {
            super(view);
            a = view;
            b = (RoundImageView)view.findViewById(0x7f0e01ec);
            c = (TextView)view.findViewById(0x7f0e01f3);
            d = (TextView)view.findViewById(0x7f0e01f4);
            e = (TextView)view.findViewById(0x7f0e01f5);
            f = (ImageView)view.findViewById(0x7f0e01f8);
        }
    }


    c a;
    public SortedList b;
    private Context c;

    public v(Context context)
    {
        c = context;
        ManagerApp.h().a(this);
        b = new SortedList(com/tinder/model/Match, new SortedListAdapterCallback(this) {

            final v a;

            public final boolean areContentsTheSame(Object obj, Object obj1)
            {
                obj = (Match)obj;
                obj1 = (Match)obj1;
                boolean flag2 = ((Match) (obj)).getThumbnailUrl().equals(((Match) (obj1)).getThumbnailUrl());
                boolean flag3 = ((Match) (obj)).getLatestTimestamp().equals(((Match) (obj1)).getLatestTimestamp());
                boolean flag4 = ((Match) (obj)).getName().equals(((Match) (obj1)).getName());
                boolean flag;
                boolean flag1;
                if (((Match) (obj)).isTouched() == ((Match) (obj1)).isTouched())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (((Match) (obj)).hasMessages() && ((Match) (obj1)).hasMessages())
                {
                    if (((Message)((Match) (obj)).getMessages().last()).compareTo((Message)((Match) (obj1)).getMessages().last()) == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                } else
                {
                    flag = true;
                }
                return flag2 && flag3 && flag4 && flag1 && flag;
            }

            public final boolean areItemsTheSame(Object obj, Object obj1)
            {
                obj = (Match)obj;
                obj1 = (Match)obj1;
                return ((Match) (obj)).getId().equals(((Match) (obj1)).getId());
            }

            public final int compare(Object obj, Object obj1)
            {
                return ((Match)obj).compareTo((Match)obj1);
            }

            
            {
                a = v.this;
                super(adapter);
            }
        });
    }

    public final int a(Match match)
    {
        return b.indexOf(match);
    }

    public final int getItemCount()
    {
        return b.size();
    }

    public final void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        Object obj;
        Object obj1;
label0:
        {
            viewholder = (a)viewholder;
            obj = (Match)b.get(i);
            obj1 = ((Match) (obj)).getThumbnailUrl();
            if (!TextUtils.isEmpty(((CharSequence) (obj1))))
            {
                Picasso.a(c).a(((String) (obj1))).a(0x7f020167).a(0x7f090081, 0x7f090081).b().a(((a) (viewholder)).b);
            }
            obj1 = ((a) (viewholder)).f;
            ManagerApp.h().j();
            if (ae.z() && ((Match) (obj)).isSuperlike())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((ImageView) (obj1)).setVisibility(i);
            obj1 = ((Match) (obj)).getName();
            if (((Match) (obj)).getPerson() != null)
            {
                obj = ((Match) (obj)).getPerson().getAge();
                if (obj == null || !((String) (obj)).isEmpty())
                {
                    break label0;
                }
                ((a) (viewholder)).c.setText(((CharSequence) (obj1)));
            }
            return;
        }
        obj = new SpannableString((new StringBuilder()).append(((String) (obj1))).append(", ").append(((String) (obj))).toString());
        ((SpannableString) (obj)).setSpan(new j(c, com.tinder.utils.CustomFont.Font.b), ((String) (obj1)).length(), ((SpannableString) (obj)).length(), 0);
        ((a) (viewholder)).c.setText(((CharSequence) (obj1)));
    }

    public final android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        return new a(LayoutInflater.from(c).inflate(0x7f03007d, viewgroup, false));
    }
}
