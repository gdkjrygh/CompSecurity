// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.List;

final class ggx extends BaseAdapter
{

    private Context a;
    private mmv b;
    private List c;

    ggx(Context context, mmv mmv1, List list)
    {
        a = context;
        b = mmv1;
        c = list;
    }

    private mmx a(int i)
    {
        if (getItemViewType(i) == ggy.a - 1)
        {
            return b.a(((Integer)c.get(i - 1)).intValue());
        } else
        {
            return null;
        }
    }

    public final boolean areAllItemsEnabled()
    {
        return false;
    }

    public final int getCount()
    {
        return c.size() + 1 + 1 + 1 + 1 + 1;
    }

    public final Object getItem(int i)
    {
        return a(i);
    }

    public final long getItemId(int i)
    {
        switch (ggw.a[ggy.a()[getItemViewType(i)] - 1])
        {
        default:
            return -3L;

        case 1: // '\001'
            return (long)((Integer)c.get(i - 1)).intValue();

        case 2: // '\002'
            return -1L;

        case 3: // '\003'
            return -2L;
        }
    }

    public final int getItemViewType(int i)
    {
        if (i > 0 && i < c.size() + 1)
        {
            return ggy.a - 1;
        }
        if (i == c.size() + 1)
        {
            return ggy.b - 1;
        }
        if (i == c.size() + 3)
        {
            return ggy.c - 1;
        }
        if (i == 0 || i == getCount() - 1)
        {
            return ggy.d - 1;
        } else
        {
            return ggy.e - 1;
        }
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        ggw.a[ggy.a()[getItemViewType(i)] - 1];
        JVM INSTR tableswitch 1 5: default 48
    //                   1 54
    //                   2 166
    //                   3 189
    //                   4 212
    //                   5 235;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        View view1 = null;
_L8:
        return view1;
_L2:
        mmx mmx1 = a(i);
        view1 = view;
        if (view == null)
        {
            view1 = LayoutInflater.from(a).inflate(b.rD, viewgroup, false);
        }
        ((AvatarView)view1.findViewById(s.K)).a(mmx1.b("gaia_id"), mmx1.b("profile_photo_url"));
        ((TextView)view1.findViewById(s.Q)).setText(mmx1.b("display_name"));
        ((TextView)view1.findViewById(s.Z)).setText(mmx1.b("account_name"));
        return view1;
_L3:
        view1 = view;
        if (view == null)
        {
            return LayoutInflater.from(a).inflate(b.rE, viewgroup, false);
        }
        continue; /* Loop/switch isn't completed */
_L4:
        view1 = view;
        if (view == null)
        {
            return LayoutInflater.from(a).inflate(b.rG, viewgroup, false);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        view1 = view;
        if (view == null)
        {
            return LayoutInflater.from(a).inflate(b.rH, viewgroup, false);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        view1 = view;
        if (view == null)
        {
            return LayoutInflater.from(a).inflate(b.rF, viewgroup, false);
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final int getViewTypeCount()
    {
        return ggy.a().length;
    }

    public final boolean isEnabled(int i)
    {
        return getItemViewType(i) != ggy.d - 1 && getItemViewType(i) != ggy.e - 1;
    }
}
