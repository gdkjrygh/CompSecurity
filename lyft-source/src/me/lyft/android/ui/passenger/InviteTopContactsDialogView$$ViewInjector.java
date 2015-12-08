// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package me.lyft.android.ui.passenger:
//            InviteTopContactsDialogView

public class _cls3.val.target
    implements butterknife.ew..ViewInjector
{

    public volatile void inject(butterknife.ew..ViewInjector viewinjector, Object obj, Object obj1)
    {
        inject(viewinjector, (InviteTopContactsDialogView)obj, obj1);
    }

    public void inject(butterknife.ew..ViewInjector viewinjector, final InviteTopContactsDialogView target, Object obj)
    {
        target.rootContainer = (View)viewinjector.rootContainer(obj, 0x7f0d0244, "field 'rootContainer'");
        target.gridView = (AbsListView)viewinjector.gridView((View)viewinjector.gridView(obj, 0x7f0d0246, "field 'gridView'"), 0x7f0d0246, "field 'gridView'");
        target.titleTextView = (TextView)viewinjector.titleTextView((View)viewinjector.titleTextView(obj, 0x7f0d0074, "field 'titleTextView'"), 0x7f0d0074, "field 'titleTextView'");
        target.messageTextView = (TextView)viewinjector.messageTextView((View)viewinjector.messageTextView(obj, 0x7f0d01ec, "field 'messageTextView'"), 0x7f0d01ec, "field 'messageTextView'");
        View view = (View)viewinjector.messageTextView(obj, 0x7f0d014c, "field 'okButton' and method 'sendInvitesOnClick'");
        target.okButton = (Button)viewinjector.okButton(view, 0x7f0d014c, "field 'okButton'");
        view.setOnClickListener(new DebouncingOnClickListener() {

            final InviteTopContactsDialogView..ViewInjector this$0;
            final InviteTopContactsDialogView val$target;

            public void doClick(View view1)
            {
                target.sendInvitesOnClick(view1);
            }

            
            {
                this$0 = InviteTopContactsDialogView..ViewInjector.this;
                target = invitetopcontactsdialogview;
                super();
            }
        });
        ((View)viewinjector.ew(obj, 0x7f0d00b2, "method 'cancelButtonOnClick'")).setOnClickListener(new DebouncingOnClickListener() {

            final InviteTopContactsDialogView..ViewInjector this$0;
            final InviteTopContactsDialogView val$target;

            public void doClick(View view1)
            {
                target.cancelButtonOnClick(view1);
            }

            
            {
                this$0 = InviteTopContactsDialogView..ViewInjector.this;
                target = invitetopcontactsdialogview;
                super();
            }
        });
        ((View)viewinjector.ew(obj, 0x7f0d0245, "method 'termsOfServiceOnClick'")).setOnClickListener(new DebouncingOnClickListener() {

            final InviteTopContactsDialogView..ViewInjector this$0;
            final InviteTopContactsDialogView val$target;

            public void doClick(View view1)
            {
                target.termsOfServiceOnClick(view1);
            }

            
            {
                this$0 = InviteTopContactsDialogView..ViewInjector.this;
                target = invitetopcontactsdialogview;
                super();
            }
        });
    }

    public volatile void reset(Object obj)
    {
        reset((InviteTopContactsDialogView)obj);
    }

    public void reset(InviteTopContactsDialogView invitetopcontactsdialogview)
    {
        invitetopcontactsdialogview.rootContainer = null;
        invitetopcontactsdialogview.gridView = null;
        invitetopcontactsdialogview.titleTextView = null;
        invitetopcontactsdialogview.messageTextView = null;
        invitetopcontactsdialogview.okButton = null;
    }

    public _cls3.val.target()
    {
    }
}
