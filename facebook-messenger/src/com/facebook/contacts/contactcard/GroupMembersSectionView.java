// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.util.AttributeSet;
import com.facebook.contacts.contactcard.entry.m;
import com.facebook.o;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.base.Preconditions;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.contacts.contactcard:
//            SectionView, aw, aj, ak, 
//            al, am

public class GroupMembersSectionView extends SectionView
{

    private List a;
    private boolean b;
    private am c;

    public GroupMembersSectionView(Context context)
    {
        this(context, null);
    }

    public GroupMembersSectionView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public GroupMembersSectionView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = Collections.emptyList();
        b = true;
    }

    private void a()
    {
        b();
        Iterator iterator = a.iterator();
        while (iterator.hasNext()) 
        {
            ThreadParticipant threadparticipant = (ThreadParticipant)iterator.next();
            aw aw1 = new aw(getContext());
            aw1.setParticipant(threadparticipant);
            if (threadparticipant.d().a() == n.EMAIL)
            {
                aw1.setOnClickListener(new aj(this));
            } else
            {
                aw1.setOnClickListener(new ak(this));
            }
            b(aw1);
        }
        if (b)
        {
            m m1 = new m(getContext());
            m1.setText(getResources().getString(o.contact_card_group_add_person));
            m1.setOnClickListener(new al(this));
            b(m1);
        }
    }

    static void a(GroupMembersSectionView groupmemberssectionview)
    {
        groupmemberssectionview.c();
    }

    static void a(GroupMembersSectionView groupmemberssectionview, ThreadParticipant threadparticipant)
    {
        groupmemberssectionview.a(threadparticipant);
    }

    static void a(GroupMembersSectionView groupmemberssectionview, UserKey userkey)
    {
        groupmemberssectionview.a(userkey);
    }

    private void a(ThreadParticipant threadparticipant)
    {
        if (c != null)
        {
            c.a(threadparticipant.d());
        }
    }

    private void a(UserKey userkey)
    {
        Intent intent;
        boolean flag;
        if (n.EMAIL == userkey.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        intent = new Intent("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.EMAIL", new String[] {
            userkey.b()
        });
        intent.setType("plain/text");
        getContext().startActivity(Intent.createChooser(intent, ""));
    }

    private void c()
    {
        if (c != null)
        {
            c.a();
        }
    }

    public void setGroupMembersSectionListener(am am1)
    {
        c = am1;
    }

    public void setThreadSummary(ThreadSummary threadsummary)
    {
        boolean flag;
        if (!com.facebook.orca.threads.m.g(threadsummary.a()) && threadsummary.w())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        a = threadsummary.j();
        a();
    }
}
