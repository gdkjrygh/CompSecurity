// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.adapters;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tinder.model.User;
import com.tinder.views.RecCard;
import java.util.ArrayList;
import java.util.List;

public final class i extends BaseAdapter
{

    public List a;
    public boolean b;
    public boolean c;

    public i()
    {
        a = new ArrayList(0);
    }

    public final void a()
    {
        c = true;
        notifyDataSetChanged();
    }

    public final void a(Object obj)
    {
        b = true;
        a(obj, 0);
    }

    public final void a(Object obj, int j)
    {
        int k = getCount();
        a.add(Math.min(k, j), obj);
        notifyDataSetChanged();
    }

    public final int getCount()
    {
        if (a == null || a.isEmpty())
        {
            return 0;
        } else
        {
            return a.size();
        }
    }

    public final Object getItem(int j)
    {
        if (a == null || a.isEmpty())
        {
            return null;
        } else
        {
            return a.get(j);
        }
    }

    public final long getItemId(int j)
    {
        return 0L;
    }

    public final int getItemViewType(int j)
    {
        if (a.isEmpty() || j >= a.size())
        {
            return 0;
        }
        Object obj = a.get(j);
        if (obj instanceof User)
        {
            obj = (User)obj;
            if (((User) (obj)).isBrand())
            {
                return 2;
            }
            return !((User) (obj)).isSuperLike() ? 0 : 3;
        } else
        {
            return 1;
        }
    }

    public final View getView(int j, View view, ViewGroup viewgroup)
    {
        if (view == null)
        {
            view = new RecCard(viewgroup.getContext());
        } else
        {
            view = (RecCard)view;
        }
        switch (getItemViewType(j))
        {
        default:
            view.setCardMode(com.tinder.views.RecCard.CardMode.REC);
            view.setRec((User)a.get(j));
            return view;

        case 0: // '\0'
            view.setCardMode(com.tinder.views.RecCard.CardMode.REC);
            view.setRec((User)a.get(j));
            return view;

        case 3: // '\003'
            view.setCardMode(com.tinder.views.RecCard.CardMode.SUPER_LIKE);
            view.setRec((User)a.get(j));
            return view;

        case 2: // '\002'
            view.setCardMode(com.tinder.views.RecCard.CardMode.PROMOTED_REC);
            view.setRec((User)a.get(j));
            return view;

        case 1: // '\001'
            view.setCardMode(com.tinder.views.RecCard.CardMode.VIDEO_AD);
            return view;
        }
    }

    public final boolean hasStableIds()
    {
        return false;
    }
}
