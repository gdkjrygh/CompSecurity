// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.l;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.k;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.ActionBarCustomizer;
import com.skype.android.inject.LifecycleSupport;
import com.skype.android.widget.MenuImageButton;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactListFragment, ContactDirectorySearchActivity, ContactAddNumberActivity

public class ContactListActivity extends SkypeActivity
    implements android.support.v7.internal.view.menu.f.a
{

    ActionBarCustomizer actionBarCustomizer;
    private f menuBuilder;
    private k popupMenuCompat;

    public ContactListActivity()
    {
    }

    public void onBackPressed()
    {
        ContactListFragment contactlistfragment = (ContactListFragment)getSupportFragmentManager().a(0x7f100308);
        if (contactlistfragment.isShowingSemanticView())
        {
            setResult(0);
            contactlistfragment.ensureListShown();
            return;
        } else
        {
            super.onBackPressed();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        lifecycleSupport.addListener(actionBarCustomizer);
        setContentView(0x7f03005d);
        setTitle(0x7f0802ff);
        actionBarCustomizer.setTitleWithRecents(0x7f0802ff);
        menuBuilder = new f(this);
        popupMenuCompat = new k(this, menuBuilder);
        menuBuilder.a(this);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f110002, menu);
        return true;
    }

    public boolean onMenuItemSelected(f f1, MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756450: 
            startActivity(new Intent(this, com/skype/android/app/contacts/ContactDirectorySearchActivity));
            return true;

        case 2131756451: 
            startActivity(new Intent(this, com/skype/android/app/contacts/ContactAddNumberActivity));
            break;
        }
        return true;
    }

    public void onMenuModeChange(f f1)
    {
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        Object obj = menu.findItem(0x7f1005a4);
        if (obj != null)
        {
            obj = (MenuImageButton)android.support.v4.view.k.a(((MenuItem) (obj)));
            ((MenuImageButton) (obj)).setBackgroundResource(0);
            ((MenuImageButton) (obj)).setImageDrawable(getResources().getDrawable(0x7f020046));
            ((MenuImageButton) (obj)).setContentDescription(getString(0x7f08004b));
            ((MenuImageButton) (obj)).setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            ((MenuImageButton) (obj)).setOnClickListener(new android.view.View.OnClickListener() {

                final ContactListActivity this$0;

                public final void onClick(View view)
                {
                    menuBuilder.clear();
                    getMenuInflater().inflate(0x7f110001, menuBuilder);
                    onPrepareOptionsMenu(menuBuilder);
                    popupMenuCompat.a(view);
                    popupMenuCompat.e();
                }

            
            {
                this$0 = ContactListActivity.this;
                super();
            }
            });
        }
        return super.onPrepareOptionsMenu(menu);
    }


}
