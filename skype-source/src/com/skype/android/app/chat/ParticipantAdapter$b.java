// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.skype.Contact;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SkypeAvatarView;

// Referenced classes of package com.skype.android.app.chat:
//            ParticipantAdapter

final class statusText extends com.skype.android.app.data.older
{

    SkypeAvatarView avatarView;
    TextView fullNameText;
    ImageView removeIcon;
    TextView statusText;
    final ParticipantAdapter this$0;

    protected final void onSetData(final Contact contact)
    {
        contactUtil.a(fullNameText, contact);
        statusText.setText(contactUtil.d(contact));
        ImageView imageview = removeIcon;
        int i;
        if (ParticipantAdapter.access$000(ParticipantAdapter.this))
        {
            i = 0;
        } else
        {
            i = 8;
        }
        imageview.setVisibility(i);
        removeIcon.setOnClickListener(this);
        avatarView.setImageDrawable(contactUtil.a(contact, null));
        contactUtil.a(avatarView.b(), contact.getType(), contact.getAvailabilityProp());
        imageCache.a(contact, avatarView, new AsyncCallback() {

            final ParticipantAdapter.b this$1;
            final Contact val$contact;

            public final void done(AsyncResult asyncresult)
            {
                Bitmap bitmap = (Bitmap)asyncresult.a();
                asyncresult = (SkypeAvatarView)asyncresult.b();
                if (bitmap != null)
                {
                    asyncresult.setImageDrawable(contactUtil.a(contact, bitmap));
                    contactUtil.a(asyncresult.b(), contact.getType(), contact.getAvailabilityProp());
                }
            }

            
            {
                this$1 = ParticipantAdapter.b.this;
                contact = contact1;
                super();
            }
        });
    }

    protected final volatile void onSetData(Object obj)
    {
        onSetData((Contact)obj);
    }

    public _cls1.val.contact(View view)
    {
        this$0 = ParticipantAdapter.this;
        super(view);
        avatarView = (SkypeAvatarView)ViewUtil.a(view, 0x7f100240);
        removeIcon = (ImageView)ViewUtil.a(view, 0x7f100486);
        fullNameText = (TextView)ViewUtil.a(view, 0x7f100241);
        statusText = (TextView)ViewUtil.a(view, 0x7f10025a);
    }
}
