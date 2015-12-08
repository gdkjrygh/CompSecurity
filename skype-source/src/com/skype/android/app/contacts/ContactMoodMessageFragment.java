// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.util.ContactUtil;

public class ContactMoodMessageFragment extends SkypeFragment
{

    private Contact contact;
    ContactUtil contactUtil;

    public ContactMoodMessageFragment()
    {
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        contact = (Contact)getObjectInterface(com/skype/Contact);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        return layoutinflater.inflate(0x7f0300e7, null);
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        super.onPrepareOptionsMenu(menu);
        menu.setGroupVisible(0x7f1005c3, false);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = (TextView)view.findViewById(0x7f1004cf);
        view.setText(contactUtil.d(contact));
        view.setMovementMethod(LinkMovementMethod.getInstance());
        setHasOptionsMenu(true);
    }
}
