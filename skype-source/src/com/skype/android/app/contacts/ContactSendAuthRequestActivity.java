// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.app.LayoutExperience;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.AccessibleEditText;

public class ContactSendAuthRequestActivity extends SkypeActivity
    implements android.view.View.OnClickListener, android.widget.TextView.OnEditorActionListener
{

    ActionBarCustomizer actionBarCustomizer;
    Analytics analytics;
    Button cancelButton;
    private Contact contact;
    ContactUtil contactUtil;
    AccessibleEditText editText;
    InputMethodManager ime;
    LayoutExperience nav;
    Button sendButton;

    public ContactSendAuthRequestActivity()
    {
    }

    private void cancel()
    {
        setResult(0);
        finish();
    }

    private void hideKeyboard()
    {
        ime.hideSoftInputFromWindow(editText.getWindowToken(), 1);
    }

    private void send()
    {
        if (ContactUtil.r(contact))
        {
            analytics.c(AnalyticsEvent.bi);
        }
        String s = editText.getText().toString();
        ContactUtil.a(contact, s, analytics);
        setResult(-1);
        finish();
    }

    public void finish()
    {
        hideKeyboard();
        super.finish();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131755812: 
            send();
            return;

        case 2131755813: 
            cancel();
            break;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        contact = (Contact)getObjectInterface(com/skype/Contact);
        lifecycleSupport.addListener(actionBarCustomizer);
        actionBarCustomizer.setTitle(0x7f08023f);
        if (nav.isMultipane())
        {
            ViewUtil.a(this, new View[] {
                sendButton, cancelButton
            });
            getSupportActionBar().a(false);
        } else
        {
            sendButton.setVisibility(8);
            cancelButton.setVisibility(8);
        }
        editText.setText(getString(0x7f080475, new Object[] {
            contactUtil.l(contact)
        }));
        editText.setOnEditorActionListener(this);
        editText.forceImeAction(true);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        if (!nav.isMultipane())
        {
            getMenuInflater().inflate(0x7f11000e, menu);
            int i;
            if (getResources().getConfiguration().orientation == 1)
            {
                i = 0x7f020050;
            } else
            {
                i = 0x7f020110;
            }
            menu.getItem(0).setIcon(i);
        }
        return true;
    }

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6)
        {
            send();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756490: 
            send();
            break;
        }
        return true;
    }
}
