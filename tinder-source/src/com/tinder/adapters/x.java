// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.s;
import com.tinder.events.match.EventMatchHeaderSizeChanged;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.ae;
import com.tinder.model.Match;
import com.tinder.model.Message;
import com.tinder.utils.v;
import com.tinder.views.BadgeView;
import com.tinder.views.RoundImageView;
import de.greenrobot.event.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class x extends android.support.v7.widget.RecyclerView.Adapter
{
    static final class a extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        View a;

        public a(View view)
        {
            super(view);
            a = view;
        }
    }

    static final class b extends android.support.v7.widget.RecyclerView.ViewHolder
    {

        View a;
        RoundImageView b;
        ImageView c;
        ImageView d;
        TextView e;
        TextView f;
        ImageView g;
        BadgeView h;

        public b(View view)
        {
            super(view);
            a = view;
            d = (ImageView)view.findViewById(0x7f0e01fc);
            b = (RoundImageView)view.findViewById(0x7f0e01ec);
            c = (ImageView)view.findViewById(0x7f0e01ed);
            e = (TextView)view.findViewById(0x7f0e01f3);
            f = (TextView)view.findViewById(0x7f0e01f7);
            g = (ImageView)view.findViewById(0x7f0e01f8);
            h = (BadgeView)view.findViewById(0x7f0e01f6);
        }
    }


    c a;
    public List b;
    public boolean c;
    private Context d;
    private int e;

    public x(Context context)
    {
        e = 0;
        c = false;
        d = context;
        ManagerApp.h().a(this);
        b = new RecyclerAdapterMatchMessages._cls1();
        setHasStableIds(true);
        a.a(this, true);
        notifyItemInserted(0);
    }

    private void a(Match amatch[])
    {
        int i = amatch.length - 1;
        while (i >= 0) 
        {
            Match match = amatch[i];
            int j = b.indexOf(match);
            if (j >= 0 && j != i)
            {
                int k = b.size();
                if (j >= 0 && j < k && i >= 0 && i < k)
                {
                    (new StringBuilder("Moving item position ")).append(j).append(" to position ").append(i).append(". Size: ").append(b.size());
                    Collections.swap(b, j, i);
                    (new StringBuilder("Moved item position ")).append(j + 1).append(" to position ").append(i + 1).append(". ItemCount: ").append(getItemCount());
                    notifyItemMoved(j + 1, i + 1);
                }
            }
            i--;
        }
    }

    static boolean a(x x1)
    {
        return x1.c;
    }

    public final int a(Match match)
    {
        int i = b.indexOf(match);
        if (i >= 0 && b.remove(match))
        {
            notifyItemRemoved(i + 1);
        }
        b.add(match);
        return b.indexOf(match) + 1;
    }

    public final Match a(int i)
        throws IndexOutOfBoundsException
    {
        if (i <= 0)
        {
            return null;
        } else
        {
            return (Match)b.get(i - 1);
        }
    }

    public final void a(int i, Match match)
    {
        if (i == 0 || i - 1 > b.size())
        {
            (new StringBuilder("Not updating match, index is invalid. ")).append(match);
            return;
        } else
        {
            (new StringBuilder("Updating match at index ")).append(i - 1).append(", ").append(match).append(", view position ").append(i);
            b.remove(i - 1);
            notifyItemRemoved(i);
            b.add(match);
            return;
        }
    }

    public final void a(Collection collection)
    {
        collection = (Match[])collection.toArray(new Match[collection.size()]);
        Arrays.sort(collection);
        for (int i = b.size() - 1; i >= 0; i--)
        {
            if (Arrays.binarySearch(collection, (Match)b.get(i)) < 0)
            {
                b(i + 1);
            }
        }

        int j = 0;
        int k = collection.length;
        while (j < k) 
        {
            Object obj = collection[j];
            if (!b.contains(obj))
            {
                if (j < 0 || j > b.size())
                {
                    (new StringBuilder("Not adding match, position is invalid. ")).append(obj);
                } else
                {
                    (new StringBuilder("Adding match to position ")).append(j).append(", ").append(obj);
                    b.add(j, obj);
                }
            }
            j++;
        }
        a(((Match []) (collection)));
    }

    public final int b(Match match)
    {
        int i = b.indexOf(match);
        if (i == -1)
        {
            return i;
        } else
        {
            return i + 1;
        }
    }

    public final Match b(int i)
    {
        if (i == 0 || i - 1 >= b.size())
        {
            return null;
        } else
        {
            Match match = (Match)b.remove(i - 1);
            (new StringBuilder("Removed match at position ")).append(i - 1).append(", ").append(match);
            notifyItemRemoved(i);
            return match;
        }
    }

    public int getItemCount()
    {
        return b.size() + 1;
    }

    public long getItemId(int i)
    {
        if (i == 0)
        {
            return 0L;
        } else
        {
            return (long)a(i).getId().hashCode();
        }
    }

    public int getItemViewType(int i)
    {
        switch (i)
        {
        default:
            return 1;

        case 0: // '\0'
            return 0;
        }
    }

    public void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder viewholder, int i)
    {
        (new StringBuilder("Binding position ")).append(i).append(" to a view holder of ").append(viewholder.getClass().getSimpleName());
        if (viewholder.getItemViewType() != getItemViewType(i))
        {
            v.b("Wrong view type provided!");
        }
        switch (viewholder.getItemViewType())
        {
        default:
            return;

        case 0: // '\0'
            android.support.v7.widget.RecyclerView.LayoutParams layoutparams = new android.support.v7.widget.RecyclerView.LayoutParams(1, e);
            ((a)viewholder).itemView.setLayoutParams(layoutparams);
            ((a)viewholder).itemView.setMinimumHeight(e);
            return;

        case 1: // '\001'
            viewholder = (b)viewholder;
            break;
        }
        Match match = a(i);
        (new StringBuilder("Binding match: ")).append(match);
        Object obj = match.getThumbnailUrl();
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            Picasso.a(d).a(((String) (obj))).a(0x7f020167).a(0x7f090081, 0x7f090081).b().a(com/tinder/adapters/x).a(((b) (viewholder)).b);
        } else
        {
            Picasso.a(d).a(0x7f020167).a(0x7f090081, 0x7f090081).b().a(com/tinder/adapters/x).a(((b) (viewholder)).b);
        }
        obj = ((b) (viewholder)).g;
        ManagerApp.h().j();
        if (ae.z() && match.isSuperlike())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((ImageView) (obj)).setVisibility(i);
        ((b) (viewholder)).h.displayBadge(match);
        ((b) (viewholder)).e.setText(match.getName());
        obj = match.getMessages();
        if (((TreeSet) (obj)).isEmpty())
        {
            v.b("Match does not have any messages?!");
            return;
        }
        obj = (Message)((TreeSet) (obj)).last();
        ((b) (viewholder)).f.setText(((Message) (obj)).getText());
        if (match.isTouched() || ((Message) (obj)).isFromMe())
        {
            ((b) (viewholder)).c.setVisibility(8);
        } else
        {
            ((b) (viewholder)).c.setVisibility(0);
        }
        if (((Message) (obj)).isFromMe())
        {
            ((b) (viewholder)).d.setVisibility(0);
            return;
        } else
        {
            ((b) (viewholder)).d.setVisibility(8);
            return;
        }
    }

    public android.support.v7.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewgroup, int i)
    {
        switch (i)
        {
        default:
            return new b(LayoutInflater.from(d).inflate(0x7f030080, viewgroup, false));

        case 0: // '\0'
            viewgroup = new View(d);
            break;
        }
        viewgroup.setLayoutParams(new android.support.v7.widget.RecyclerView.LayoutParams(1, e));
        return new a(viewgroup);
    }

    public void onEventMainThread(EventMatchHeaderSizeChanged eventmatchheadersizechanged)
    {
        int i = eventmatchheadersizechanged.getHeaderHeight();
        if (i == 0)
        {
            return;
        } else
        {
            e = i;
            return;
        }
    }

    // Unreferenced inner class com/tinder/adapters/RecyclerAdapterMatchMessages$1

/* anonymous class */
    class RecyclerAdapterMatchMessages._cls1 extends ArrayList
    {

        final x a;

        public void add(int i, Object obj)
        {
            super.add(i, (Match)obj);
            if (!x.a(a))
            {
                a.notifyItemInserted(i + 1);
            }
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
            if (!x.a(a))
            {
                a.notifyItemInserted(i + 1);
            }
            return true;
        }

            
            {
                a = x.this;
                super(10);
            }
    }

}
