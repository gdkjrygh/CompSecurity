// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.skype.Conversation;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.async.UiCallback;
import com.skype.android.widget.SkypeAvatarView;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.app.contacts:
//            ExternalContactQueryHelper, ContactItem, JoinRequestHelper

public class OffNetworkInviteActivity extends SkypeActivity
    implements android.view.View.OnClickListener, AsyncCallback
{
    private static final class a
        implements Comparator
    {

        private static final int MOBILE_VALUE = -1;

        private int shiftLabelId(ContactItem.Contactable contactable)
        {
            static final class _cls3
            {

                static final int $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType[];

                static 
                {
                    $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType = new int[ContactItem.ContactableType.values().length];
                    try
                    {
                        $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType[ContactItem.ContactableType.EMAIL.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$com$skype$android$app$contacts$ContactItem$ContactableType[ContactItem.ContactableType.PHONE.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls3..SwitchMap.com.skype.android.app.contacts.ContactItem.ContactableType[contactable.type.ordinal()];
            JVM INSTR tableswitch 1 2: default 32
        //                       1 36
        //                       2 44;
               goto _L1 _L2 _L3
_L1:
            int i = 0;
_L5:
            return i;
_L2:
            return contactable.labelId >> 8;
_L3:
            int j = contactable.labelId;
            i = j;
            if (j == 2)
            {
                return -1;
            }
            if (true) goto _L5; else goto _L4
_L4:
        }

        public final int compare(ContactItem.Contactable contactable, ContactItem.Contactable contactable1)
        {
            return shiftLabelId(contactable) - shiftLabelId(contactable1);
        }

        public final volatile int compare(Object obj, Object obj1)
        {
            return compare((ContactItem.Contactable)obj, (ContactItem.Contactable)obj1);
        }

        private a()
        {
        }

    }


    public static final String EXTRA_LOOKUP_KEY = "extra_lookupkey";
    private static final int JOIN_REQUEST = 1;
    AsyncService asyncService;
    SkypeAvatarView avatarView;
    TextView contactInfoView;
    private ContactItem contactItem;
    ContactUtil contactUtil;
    private Conversation conversation;
    DefaultAvatars defaultAvatars;
    EcsConfiguration ecsConfiguration;
    Button inviteButton;
    JoinRequestHelper joinRequestHelper;
    private String lookupKey;
    TextView moodView;
    TextView nameView;
    private boolean sentInvite;
    Toolbar toolbar;

    public OffNetworkInviteActivity()
    {
    }

    private ContactItem buildContactItem(String s)
    {
        return (new ExternalContactQueryHelper(getApplicationContext(), ecsConfiguration)).querySingleContact(s);
    }

    private ContactItem.Contactable getBestContactable()
    {
        return (ContactItem.Contactable)contactItem.getContactables().get(0);
    }

    private boolean hasPhone()
    {
        return hasPhone(contactItem.getContactables());
    }

    private boolean hasPhone(List list)
    {
        return hasType(list, ContactItem.ContactableType.PHONE);
    }

    private boolean hasType(List list, ContactItem.ContactableType contactabletype)
    {
label0:
        {
            if (list == null)
            {
                break label0;
            }
            list = list.iterator();
            do
            {
                if (!list.hasNext())
                {
                    break label0;
                }
            } while (((ContactItem.Contactable)list.next()).type != contactabletype);
            return true;
        }
        return false;
    }

    private void requestJoinUrlAsync()
    {
        boolean flag = true;
        if (conversation == null)
        {
            conversation = joinRequestHelper.createJoinableConversation(String.format("Conversation with %1$s", new Object[] {
                contactItem.getDisplayName()
            }));
        }
        ContactItem.Contactable contactable = getBestContactable();
        JoinRequestHelper joinrequesthelper = joinRequestHelper;
        Conversation conversation1 = conversation;
        String s = contactable.address;
        if (contactable.type != ContactItem.ContactableType.PHONE)
        {
            flag = false;
        }
        joinrequesthelper.getInviteIntentAsync(conversation1, s, flag, new UiCallback(this, new AsyncCallback() {

            final OffNetworkInviteActivity this$0;

            public final void done(AsyncResult asyncresult)
            {
                if (asyncresult.e())
                {
                    startActivityForResult((Intent)asyncresult.a(), 1);
                    sentInvite = true;
                }
                inviteButton.setEnabled(true);
            }

            
            {
                this$0 = OffNetworkInviteActivity.this;
                super();
            }
        }));
    }

    private void setupUi()
    {
        boolean flag = true;
        avatarView.setVisibility(0);
        Object obj;
        if (hasPhone())
        {
            obj = com.skype.android.res.DefaultAvatars.AvatarType.b;
        } else
        {
            obj = com.skype.android.res.DefaultAvatars.AvatarType.c;
        }
        obj = defaultAvatars.a(((com.skype.android.res.DefaultAvatars.AvatarType) (obj)), com.skype.android.res.DefaultAvatars.AvatarSize.c);
        avatarView.setImageDrawable(((android.graphics.drawable.Drawable) (obj)));
        nameView.setText(contactItem.getDisplayName());
        obj = getBestContactable();
        contactInfoView.setText(((ContactItem.Contactable) (obj)).address);
        if (contactItem.getContactables().size() <= 1)
        {
            flag = false;
        }
        contactInfoView.setClickable(flag);
    }

    private void sortContactables()
    {
        Collections.sort(contactItem.getContactables(), new a());
    }

    public void done(AsyncResult asyncresult)
    {
        if (asyncresult.e())
        {
            contactItem = (ContactItem)asyncresult.a();
            sortContactables();
        }
        setupUi();
    }

    public void finish()
    {
        if (conversation != null && !sentInvite)
        {
            conversation.delete();
        }
        super.finish();
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            log.info((new StringBuilder("Join request result code ")).append(j).toString());
        }
    }

    public void onClick(View view)
    {
        if (view == contactInfoView)
        {
            Toast.makeText(this, "Show contactmethod dialog", 0).show();
            return;
        }
        if (view == inviteButton)
        {
            requestJoinUrlAsync();
            view.setEnabled(false);
            return;
        } else
        {
            onBackPressed();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        moodView.setVisibility(8);
        avatarView.setPresenceVisible(false);
        avatarView.setVisibility(4);
        contactInfoView.setOnClickListener(this);
        toolbar.setNavigationIcon(0x7f020049);
        toolbar.setNavigationOnClickListener(this);
        lookupKey = getIntent().getStringExtra("extra_lookupkey");
        asyncService.a(new Callable() {

            final OffNetworkInviteActivity this$0;

            public final ContactItem call()
                throws Exception
            {
                return buildContactItem(lookupKey);
            }

            public final volatile Object call()
                throws Exception
            {
                return call();
            }

            
            {
                this$0 = OffNetworkInviteActivity.this;
                super();
            }
        }, this);
    }




/*
    static boolean access$302(OffNetworkInviteActivity offnetworkinviteactivity, boolean flag)
    {
        offnetworkinviteactivity.sentInvite = flag;
        return flag;
    }

*/
}
