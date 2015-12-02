// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.common.w.n;
import com.facebook.h;
import com.facebook.i;
import com.facebook.k;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.user.UserKey;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.f;
import com.google.common.base.Objects;

public class aw extends f
{

    private final TextView a;
    private final TextView b;
    private final UserTileView c;
    private ThreadParticipant d;

    public aw(Context context)
    {
        this(context, null);
    }

    public aw(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public aw(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        setContentView(k.orca_thread_member_item);
        setClickable(true);
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            setBackgroundResource(h.orca_item_background_holo_light);
        } else
        {
            setBackgroundResource(0x1080062);
        }
        a = (TextView)getView(i.member_user);
        b = (TextView)getView(i.member_email);
        c = (UserTileView)getView(i.member_user_img);
        getView(i.member_separator).setVisibility(8);
    }

    public ThreadParticipant getParticipant()
    {
        return d;
    }

    public void setParticipant(ThreadParticipant threadparticipant)
    {
        d = threadparticipant;
        String s = threadparticipant.a().d();
        a.setText(s);
        Object obj = null;
        if (threadparticipant.c())
        {
            s = threadparticipant.d().b();
        } else
        {
            s = obj;
            if (!threadparticipant.b())
            {
                s = obj;
                if (!n.a(threadparticipant.e()))
                {
                    s = obj;
                    if (!Objects.equal(threadparticipant.f(), threadparticipant.e()))
                    {
                        s = threadparticipant.e();
                    }
                }
            }
        }
        if (n.a(s))
        {
            b.setVisibility(8);
        } else
        {
            b.setText(s);
            b.setVisibility(0);
        }
        c.setParams(com.facebook.orca.photos.a.f.a(threadparticipant));
    }
}
