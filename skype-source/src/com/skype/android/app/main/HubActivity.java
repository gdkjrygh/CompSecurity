// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.k;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.skype.Account;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.Navigation;
import com.skype.android.app.contacts.ContactAddNumberActivity;
import com.skype.android.app.contacts.ContactDirectorySearchActivity;
import com.skype.android.app.dialer.DialpadActivity;
import com.skype.android.app.signin.SignInConstants;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.update.UpdateManager;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.util.cache.ContactMoodCache;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.SkypeAvatarView;

// Referenced classes of package com.skype.android.app.main:
//            AbstractHubActivity

public class HubActivity extends AbstractHubActivity
    implements android.support.v7.internal.view.menu.f.a, android.view.View.OnClickListener, SignInConstants
{

    ImageButton addContactsButton;
    SkypeAvatarView avatarImage;
    ImageButton callButton;
    ImageButton chatButton;
    private f menuBuilder;
    TextView moodText;
    ImageButton overflowButton;
    private k popupMenuCompat;
    private int unreadCount;

    public HubActivity()
    {
    }

    private boolean displayAllMenuItemsInOverflow()
    {
        return Build.MODEL.equalsIgnoreCase("XT910") && android.os.Build.VERSION.SDK_INT <= 15;
    }

    public boolean handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return false;

        case 1: // '\001'
            unreadCount = ((Integer)message.obj).intValue();
            return true;

        case 2: // '\002'
            updateAvatar();
            return true;

        case 3: // '\003'
            break;
        }
        if (accessibility.a())
        {
            AccessibilityUtil.b(avatarImage, getResources().getQuantityString(0x7f0b0003, unreadCount, new Object[] {
                Integer.valueOf(unreadCount)
            }));
        }
        return true;
    }

    public void onClick(View view)
    {
        if (view == avatarImage)
        {
            navigation.myProfile();
        } else
        {
            if (view == callButton)
            {
                startActivity(new Intent(this, com/skype/android/app/dialer/DialpadActivity));
                return;
            }
            if (view == chatButton)
            {
                showAddParticipantActivity();
                return;
            }
            if (view == addContactsButton)
            {
                menuBuilder.clear();
                getMenuInflater().inflate(0x7f110001, menuBuilder);
                onPrepareOptionsMenu(menuBuilder);
                popupMenuCompat.a(view);
                popupMenuCompat.e();
                return;
            }
            if (view == overflowButton)
            {
                menuBuilder.clear();
                getMenuInflater().inflate(0x7f110017, menuBuilder);
                onPrepareOptionsMenu(menuBuilder);
                popupMenuCompat.a(view);
                popupMenuCompat.e();
                return;
            }
        }
    }

    protected void onCreate(Bundle bundle)
    {
        if (getResources().getBoolean(0x7f0d0003))
        {
            setTheme(0x7f0901ac);
            super.onCreate(bundle);
            getComponent().inject(this);
            menuBuilder = new f(this);
            popupMenuCompat = new k(this, menuBuilder);
            menuBuilder.a(this);
            bundle = findViewById(0x7f10037f);
            if (bundle != null)
            {
                AccessibilityUtil.a(new View[] {
                    moodText
                });
                if (accessibility.a() && avatarImage != null)
                {
                    bundle.post(accessibility.a(bundle, avatarImage, 4));
                    accessibility.a(bundle);
                }
            }
            ViewUtil.a(this, new View[] {
                avatarImage, callButton, chatButton, addContactsButton, overflowButton
            });
            updateManager.a(this);
            if (avatarImage != null)
            {
                avatarImage.a().setClipCircleEnabled(true);
            }
            onNewIntent(getIntent());
            return;
        } else
        {
            throw new RuntimeException("This activity is deprecated for smartphones, use HubMaterialActivity instead");
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f110017, menu);
        return true;
    }

    public boolean onMenuItemSelected(f f1, MenuItem menuitem)
    {
        return onOptionsItemSelected(menuitem);
    }

    public void onMenuModeChange(f f1)
    {
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return false;

        case 2131756522: 
            startActivity(new Intent(this, com/skype/android/app/dialer/DialpadActivity));
            return true;

        case 2131756523: 
            showAddParticipantActivity();
            return true;

        case 2131756450: 
            startActivity(new Intent(this, com/skype/android/app/contacts/ContactDirectorySearchActivity));
            return true;

        case 2131756451: 
            startActivity(new Intent(this, com/skype/android/app/contacts/ContactAddNumberActivity));
            return true;

        case 2131756524: 
            navigation.settings();
            return true;

        case 2131756525: 
            signout(true);
            break;
        }
        return true;
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        if (accessibility.a())
        {
            AccessibilityUtil.a(menu.findItem(0x7f1005ea), 0x7f080095);
            AccessibilityUtil.a(menu.findItem(0x7f1005eb), 0x7f0800dd);
        }
        if (displayAllMenuItemsInOverflow())
        {
            menu.findItem(0x7f1005ea).setShowAsAction(0);
            menu.findItem(0x7f1005eb).setShowAsAction(0);
        }
        return true;
    }

    protected void updateAvailability()
    {
        com.skype.Contact.AVAILABILITY availability = account.getAvailabilityProp();
        contactUtil.a(avatarImage.b(), availability);
        String s = getString(0x7f0800a3);
        if (avatarImage != null)
        {
            avatarImage.setContentDescription(contactUtil.a(s, availability, spanned.a(account)));
        }
    }

    protected void updateAvatar()
    {
        if (avatarImage != null)
        {
            avatarImage.a().setDottedBorderDefaultAvatar(true, 0x7f020073);
            imageCache.a(account, avatarImage, new AsyncCallback() {

                final HubActivity this$0;

                public final void done(AsyncResult asyncresult)
                {
                    Bitmap bitmap = (Bitmap)asyncresult.a();
                    asyncresult = (SkypeAvatarView)asyncresult.b();
                    if (bitmap != null)
                    {
                        asyncresult.setImageBitmap(bitmap);
                        asyncresult.a().setDottedBorderDefaultAvatar(false, 0);
                    }
                }

            
            {
                this$0 = HubActivity.this;
                super();
            }
            });
        }
    }

    protected void updateMood()
    {
        int i = 0;
        if (moodText != null)
        {
            TextView textview;
            if (ContactUtil.b(account.getAvailabilityProp()))
            {
                moodText.setText(getString(0x7f0802f5));
                moodText.setVisibility(0);
            } else
            {
                CharSequence charsequence = spanned.a(account);
                moodText.setText(charsequence);
            }
            textview = moodText;
            if (!ViewUtil.a(this))
            {
                i = 8;
            }
            textview.setVisibility(i);
        }
    }
}
