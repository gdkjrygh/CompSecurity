// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.common.w.n;
import com.facebook.i;
import com.facebook.k;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.photos.a.f;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.user.UserKey;
import com.facebook.user.tiles.UserTileView;
import com.google.common.base.Objects;
import java.util.Collections;
import java.util.List;

public class aq extends BaseAdapter
{

    private final Context a;
    private final LayoutInflater b;
    private List c;

    public aq(Context context, LayoutInflater layoutinflater)
    {
        c = Collections.emptyList();
        a = context;
        b = layoutinflater;
    }

    private View a(ThreadParticipant threadparticipant, View view)
    {
        Object obj = null;
        View view1 = view;
        if (view == null)
        {
            view1 = b.inflate(k.orca_thread_member_item, null);
        }
        ((TextView)view1.findViewById(i.member_user)).setText(threadparticipant.a().d());
        TextView textview = (TextView)view1.findViewById(i.member_email);
        if (threadparticipant.c())
        {
            view = threadparticipant.d().b();
        } else
        {
            view = obj;
            if (!threadparticipant.b())
            {
                view = obj;
                if (!n.a(threadparticipant.e()))
                {
                    view = obj;
                    if (!Objects.equal(threadparticipant.f(), threadparticipant.e()))
                    {
                        view = threadparticipant.e();
                    }
                }
            }
        }
        if (n.a(view))
        {
            textview.setVisibility(8);
        } else
        {
            textview.setText(view);
            textview.setVisibility(0);
        }
        ((UserTileView)view1.findViewById(i.member_user_img)).setParams(f.a(threadparticipant));
        return view1;
    }

    public int getCount()
    {
        return c.size();
    }

    public Object getItem(int j)
    {
        return c.get(j);
    }

    public long getItemId(int j)
    {
        return (long)j;
    }

    public int getItemViewType(int j)
    {
        return j >= c.size() ? 1 : 0;
    }

    public View getView(int j, View view, ViewGroup viewgroup)
    {
        return a((ThreadParticipant)c.get(j), view);
    }

    public int getViewTypeCount()
    {
        return 2;
    }
}
