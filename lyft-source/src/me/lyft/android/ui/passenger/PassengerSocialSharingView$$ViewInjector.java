// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerSocialSharingView

public class _cls4.val.target
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (PassengerSocialSharingView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, final PassengerSocialSharingView target, Object obj)
    {
        target.titleText = (TextView)viewinjector.titleText((View)viewinjector.titleText(obj, 0x7f0d03e2, "field 'titleText'"), 0x7f0d03e2, "field 'titleText'");
        target.subtitleText = (TextView)viewinjector.subtitleText((View)viewinjector.subtitleText(obj, 0x7f0d03e4, "field 'subtitleText'"), 0x7f0d03e4, "field 'subtitleText'");
        target.hr = (View)viewinjector.hr(obj, 0x7f0d03e3, "field 'hr'");
        View view = (View)viewinjector.hr(obj, 0x7f0d03e5, "field 'inviteContacts' and method 'shareWithContacts'");
        target.inviteContacts = view;
        view.setOnClickListener(new DebouncingOnClickListener() {

            final PassengerSocialSharingView..ViewInjector this$0;
            final PassengerSocialSharingView val$target;

            public void doClick(View view1)
            {
                target.shareWithContacts();
            }

            
            {
                this$0 = PassengerSocialSharingView..ViewInjector.this;
                target = passengersocialsharingview;
                super();
            }
        });
        view = (View)viewinjector.ew(obj, 0x7f0d0293, "field 'inviteTwitter' and method 'shareWithTwitter'");
        target.inviteTwitter = view;
        view.setOnClickListener(new DebouncingOnClickListener() {

            final PassengerSocialSharingView..ViewInjector this$0;
            final PassengerSocialSharingView val$target;

            public void doClick(View view1)
            {
                target.shareWithTwitter();
            }

            
            {
                this$0 = PassengerSocialSharingView..ViewInjector.this;
                target = passengersocialsharingview;
                super();
            }
        });
        ((View)viewinjector.ew(obj, 0x7f0d0292, "method 'shareWithFacebook'")).setOnClickListener(new DebouncingOnClickListener() {

            final PassengerSocialSharingView..ViewInjector this$0;
            final PassengerSocialSharingView val$target;

            public void doClick(View view1)
            {
                target.shareWithFacebook();
            }

            
            {
                this$0 = PassengerSocialSharingView..ViewInjector.this;
                target = passengersocialsharingview;
                super();
            }
        });
        ((View)viewinjector.ew(obj, 0x7f0d00b2, "method 'onCancelClicked'")).setOnClickListener(new DebouncingOnClickListener() {

            final PassengerSocialSharingView..ViewInjector this$0;
            final PassengerSocialSharingView val$target;

            public void doClick(View view1)
            {
                target.onCancelClicked();
            }

            
            {
                this$0 = PassengerSocialSharingView..ViewInjector.this;
                target = passengersocialsharingview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((PassengerSocialSharingView)obj);
    }

    public void reset(PassengerSocialSharingView passengersocialsharingview)
    {
        passengersocialsharingview.titleText = null;
        passengersocialsharingview.subtitleText = null;
        passengersocialsharingview.hr = null;
        passengersocialsharingview.inviteContacts = null;
        passengersocialsharingview.inviteTwitter = null;
    }

    public _cls4.val.target()
    {
    }
}
