// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.contactcard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.base.fragment.FbFragment;
import com.facebook.i;
import com.facebook.inject.t;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.f.k;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.m;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.contacts.contactcard:
//            MapSectionView, ConversationSettingsView, NameConversationView, GroupMembersSectionView, 
//            ag, ah, ai

public class GroupContactCardFragment extends FbFragment
{

    private ai Z;
    private k a;
    private ThreadSummary aa;
    private MessagesCollection ab;
    private av b;
    private String c;
    private NameConversationView d;
    private GroupMembersSectionView e;
    private ConversationSettingsView f;
    private MapSectionView g;
    private Button h;
    private InputMethodManager i;

    public GroupContactCardFragment()
    {
    }

    static ai a(GroupContactCardFragment groupcontactcardfragment)
    {
        return groupcontactcardfragment.Z;
    }

    private void a(cb cb1)
    {
        cb1.e("GroupContactCardFragment");
        cb1.b("thread_id", c);
        b.a(cb1);
    }

    static void a(GroupContactCardFragment groupcontactcardfragment, cb cb1)
    {
        groupcontactcardfragment.a(cb1);
    }

    static String b(GroupContactCardFragment groupcontactcardfragment)
    {
        return groupcontactcardfragment.c;
    }

    private void c()
    {
        ThreadSummary threadsummary;
        if (a != null && c != null)
        {
            if ((threadsummary = a.b(c)) != null && threadsummary != aa)
            {
                a(threadsummary, a.c(threadsummary.a()));
                return;
            }
        }
    }

    public void A()
    {
        super.A();
        b();
        c();
    }

    public View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(com.facebook.k.contacts_group_card_fragment, viewgroup, false);
    }

    public void a()
    {
        if (ab == null)
        {
            return;
        } else
        {
            g.setVisibilityMode("visible");
            g.setGroupMessages(ab);
            return;
        }
    }

    public void a(ai ai)
    {
        Z = ai;
        if (g != null)
        {
            g.setContactCardListener(ai);
            f.setContactCardListener(ai);
        }
    }

    public void a(ThreadViewSpec threadviewspec)
    {
        boolean flag;
        if (threadviewspec.c() || threadviewspec.a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        c = threadviewspec.d();
        c();
    }

    public void a(ThreadSummary threadsummary, MessagesCollection messagescollection)
    {
        if (threadsummary != aa || messagescollection != ab)
        {
            aa = threadsummary;
            ab = messagescollection;
            d.setVisibility(0);
            h.setVisibility(0);
            f.setVisibility(0);
            if (m.g(c))
            {
                d.setVisibility(8);
                h.setVisibility(8);
            }
            if (threadsummary == null || !threadsummary.w())
            {
                d.setVisibility(8);
                h.setVisibility(8);
                f.setVisibility(8);
            }
            if (threadsummary != null)
            {
                d.a(threadsummary.g(), threadsummary);
                e.setThreadSummary(threadsummary);
                f.setThreadId(threadsummary.a());
            }
            if (messagescollection != null)
            {
                g.setGroupMessages(messagescollection);
                return;
            }
        }
    }

    public void b()
    {
        if (f != null)
        {
            f.a();
        }
    }

    public void c(boolean flag)
    {
        super.c(flag);
        if (!flag)
        {
            c();
            i.hideSoftInputFromWindow(z().getWindowToken(), 0);
        }
    }

    public void d(Bundle bundle)
    {
        super.d(bundle);
        bundle = S();
        a = (k)bundle.a(com/facebook/orca/f/k);
        b = (av)bundle.a(com/facebook/analytics/av);
        i = (InputMethodManager)bundle.a(android/view/inputmethod/InputMethodManager);
        d = (NameConversationView)d(i.name_conversation_section);
        e = (GroupMembersSectionView)d(i.group_members_section);
        f = (ConversationSettingsView)d(i.conversation_settings_section);
        g = (MapSectionView)d(i.map_section);
        h = (Button)d(i.group_contact_card_leave_conversation);
        if (Z != null)
        {
            g.setContactCardListener(Z);
            f.setContactCardListener(Z);
        }
        e.setGroupMembersSectionListener(new ag(this));
        h.setOnClickListener(new ah(this));
        c();
    }
}
