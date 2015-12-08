// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;

final class ngu extends BaseAdapter
{

    private final Context a;
    private final int b[];
    private final boolean c;

    ngu(Context context, int ai[], boolean flag)
    {
        a = context;
        b = ai;
        c = flag;
    }

    public final int getCount()
    {
        int j = b.length;
        int i;
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        return i + j;
    }

    public final Object getItem(int i)
    {
        return null;
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final int getItemViewType(int i)
    {
        return !c || i != b.length ? 0 : 1;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        getItemViewType(i);
        JVM INSTR tableswitch 0 1: default 28
    //                   0 32
    //                   1 232;
           goto _L1 _L2 _L3
_L1:
        viewgroup = null;
_L5:
        return viewgroup;
_L2:
        viewgroup = (njj)view;
        view = viewgroup;
        if (viewgroup == null)
        {
            view = new njj(a);
        }
        view.a = b[i];
        if (((njj) (view)).b.c(((njj) (view)).a))
        {
            Object obj = ((njj) (view)).b.a(((njj) (view)).a);
            ((njj) (view)).c.setVisibility(0);
            ((njj) (view)).d.setVisibility(4);
            viewgroup = ((mmx) (obj)).b("display_name");
            String s = ((mmx) (obj)).b("account_name");
            String s1 = ((mmx) (obj)).b("gaia_id");
            obj = ((mmx) (obj)).b("profile_photo_url");
            if (TextUtils.isEmpty(viewgroup))
            {
                ((njj) (view)).e.setText(s);
                ((njj) (view)).f.setVisibility(8);
            } else
            {
                ((njj) (view)).e.setText(viewgroup);
                ((njj) (view)).f.setText(s);
                ((njj) (view)).f.setVisibility(0);
            }
            ((njj) (view)).g.a(s1, ((String) (obj)));
            return view;
        } else
        {
            ((njj) (view)).c.setVisibility(8);
            return view;
        }
_L3:
        viewgroup = view;
        if (view == null)
        {
            return LayoutInflater.from(a).inflate(b.Gj, null);
        }
        if (true) goto _L5; else goto _L4
_L4:
    }

    public final int getViewTypeCount()
    {
        return !c ? 1 : 2;
    }
}
