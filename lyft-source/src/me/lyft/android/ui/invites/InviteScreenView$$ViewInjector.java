// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.invites;

import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import me.lyft.android.controls.MenuButtonToolbar;

// Referenced classes of package me.lyft.android.ui.invites:
//            InviteScreenView

public class _cls6.val.target
    implements butterknife...ViewInjector
{

    public volatile void inject(butterknife...ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (InviteScreenView)obj, obj1);
    }

    public void inject(butterknife...ViewInjector viewinjector, final InviteScreenView target, Object obj)
    {
        target.invitesHeaderText = (TextView)viewinjector.invitesHeaderText((View)viewinjector.invitesHeaderText(obj, 0x7f0d028f, "field 'invitesHeaderText'"), 0x7f0d028f, "field 'invitesHeaderText'");
        target.invitesReferralCodeText = (TextView)viewinjector.invitesReferralCodeText((View)viewinjector.invitesReferralCodeText(obj, 0x7f0d0290, "field 'invitesReferralCodeText'"), 0x7f0d0290, "field 'invitesReferralCodeText'");
        View view = (View)viewinjector.invitesReferralCodeText(obj, 0x7f0d023e, "field 'contactsList' and method 'onItemClick'");
        target.contactsList = (ListView)viewinjector.contactsList(view, 0x7f0d023e, "field 'contactsList'");
        ((AdapterView)view).setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            final InviteScreenView..ViewInjector this$0;
            final InviteScreenView val$target;

            public void onItemClick(AdapterView adapterview, View view1, int i, long l)
            {
                target.onItemClick(adapterview, view1, i, l);
            }

            
            {
                this$0 = InviteScreenView..ViewInjector.this;
                target = invitescreenview;
                super();
            }
        });
        target.contactsListEmptyView = (LinearLayout)viewinjector.contactsListEmptyView((View)viewinjector.contactsListEmptyView(obj, 0x7f0d0291, "field 'contactsListEmptyView'"), 0x7f0d0291, "field 'contactsListEmptyView'");
        view = (View)viewinjector.contactsListEmptyView(obj, 0x7f0d023f, "field 'sendInvitesButton' and method 'sendInvites'");
        target.sendInvitesButton = view;
        view.setOnClickListener(new DebouncingOnClickListener() {

            final InviteScreenView..ViewInjector this$0;
            final InviteScreenView val$target;

            public void doClick(View view1)
            {
                target.sendInvites();
            }

            
            {
                this$0 = InviteScreenView..ViewInjector.this;
                target = invitescreenview;
                super();
            }
        });
        target.heroContainer = (View)viewinjector.heroContainer(obj, 0x7f0d028d, "field 'heroContainer'");
        target.invitesHeaderContainer = (View)viewinjector.invitesHeaderContainer(obj, 0x7f0d028e, "field 'invitesHeaderContainer'");
        target.toolbar = (MenuButtonToolbar)viewinjector.toolbar((View)viewinjector.toolbar(obj, 0x7f0d002c, "field 'toolbar'"), 0x7f0d002c, "field 'toolbar'");
        ((View)viewinjector.toolbar(obj, 0x7f0d0293, "method 'shareWithTwitter'")).setOnClickListener(new DebouncingOnClickListener() {

            final InviteScreenView..ViewInjector this$0;
            final InviteScreenView val$target;

            public void doClick(View view1)
            {
                target.shareWithTwitter();
            }

            
            {
                this$0 = InviteScreenView..ViewInjector.this;
                target = invitescreenview;
                super();
            }
        });
        ((View)viewinjector.(obj, 0x7f0d0292, "method 'shareWithFacebook'")).setOnClickListener(new DebouncingOnClickListener() {

            final InviteScreenView..ViewInjector this$0;
            final InviteScreenView val$target;

            public void doClick(View view1)
            {
                target.shareWithFacebook();
            }

            
            {
                this$0 = InviteScreenView..ViewInjector.this;
                target = invitescreenview;
                super();
            }
        });
        ((View)viewinjector.(obj, 0x7f0d0294, "method 'shareWithSms'")).setOnClickListener(new DebouncingOnClickListener() {

            final InviteScreenView..ViewInjector this$0;
            final InviteScreenView val$target;

            public void doClick(View view1)
            {
                target.shareWithSms();
            }

            
            {
                this$0 = InviteScreenView..ViewInjector.this;
                target = invitescreenview;
                super();
            }
        });
        ((View)viewinjector.(obj, 0x7f0d0295, "method 'shareWithEmail'")).setOnClickListener(new DebouncingOnClickListener() {

            final InviteScreenView..ViewInjector this$0;
            final InviteScreenView val$target;

            public void doClick(View view1)
            {
                target.shareWithEmail();
            }

            
            {
                this$0 = InviteScreenView..ViewInjector.this;
                target = invitescreenview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((InviteScreenView)obj);
    }

    public void reset(InviteScreenView invitescreenview)
    {
        invitescreenview.invitesHeaderText = null;
        invitescreenview.invitesReferralCodeText = null;
        invitescreenview.contactsList = null;
        invitescreenview.contactsListEmptyView = null;
        invitescreenview.sendInvitesButton = null;
        invitescreenview.heroContainer = null;
        invitescreenview.invitesHeaderContainer = null;
        invitescreenview.toolbar = null;
    }

    public _cls6.val.target()
    {
    }
}
