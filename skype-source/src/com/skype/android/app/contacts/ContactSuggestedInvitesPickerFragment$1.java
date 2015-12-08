// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.skype.ObjectInterface;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.MessagePopup;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactSuggestedInvitesPickerFragment

final class this._cls0
    implements this._cls0
{

    final ContactSuggestedInvitesPickerFragment this$0;

    public final void onItemClicked(boolean flag, ObjectInterface objectinterface)
    {
        ContactSuggestedInvitesPickerFragment.access$400(ContactSuggestedInvitesPickerFragment.this);
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        view = getActionBarActivity();
        ContactSuggestedInvitesPickerFragment.access$002(ContactSuggestedInvitesPickerFragment.this, (Button)view.findViewById(0x7f100490));
        ContactSuggestedInvitesPickerFragment.access$102(ContactSuggestedInvitesPickerFragment.this, (TextView)view.findViewById(0x7f10048f));
        ContactSuggestedInvitesPickerFragment.access$202(ContactSuggestedInvitesPickerFragment.this, (ViewGroup)view.findViewById(0x7f10048b));
        ViewUtil.a(ContactSuggestedInvitesPickerFragment.this, new View[] {
            ContactSuggestedInvitesPickerFragment.access$000(ContactSuggestedInvitesPickerFragment.this), ContactSuggestedInvitesPickerFragment.access$200(ContactSuggestedInvitesPickerFragment.this)
        });
        ContactSuggestedInvitesPickerFragment.access$302(ContactSuggestedInvitesPickerFragment.this, (MessagePopup)view.findViewById(0x7f1004b3));
        ContactSuggestedInvitesPickerFragment.access$300(ContactSuggestedInvitesPickerFragment.this).setOnTouchListener(ContactSuggestedInvitesPickerFragment.this);
        ContactSuggestedInvitesPickerFragment.access$100(ContactSuggestedInvitesPickerFragment.this).setTextColor(view.getResources().getColor(0x7f0f0114));
        ContactSuggestedInvitesPickerFragment.access$200(ContactSuggestedInvitesPickerFragment.this).setVisibility(8);
    }

    public final void saveInstanceState(Bundle bundle)
    {
    }

    ()
    {
        this$0 = ContactSuggestedInvitesPickerFragment.this;
        super();
    }
}
