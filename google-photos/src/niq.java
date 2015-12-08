// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.libraries.social.avatars.ui.AvatarView;
import java.util.List;

final class niq extends BaseAdapter
{

    private final List a;
    private nio b;

    niq(nio nio1, List list)
    {
        b = nio1;
        super();
        a = list;
    }

    public final int getCount()
    {
        return a.size();
    }

    public final Object getItem(int i)
    {
        return null;
    }

    public final long getItemId(int i)
    {
        return (long)i;
    }

    public final View getView(int i, View view, ViewGroup viewgroup)
    {
        view = nio.a(b).inflate(b.GA, viewgroup, false);
        viewgroup = (nip)a.get(i);
        ((AvatarView)view.findViewById(aa.N)).a(((nip) (viewgroup)).a, ((nip) (viewgroup)).c);
        ((TextView)view.findViewById(aa.Q)).setText(((nip) (viewgroup)).b);
        return view;
    }
}
