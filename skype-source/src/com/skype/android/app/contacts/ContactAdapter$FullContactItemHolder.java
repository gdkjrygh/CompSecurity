// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.skype.android.mediacontent.SpannedAnimationDrawableCallback;
import com.skype.android.widget.PathClippedImageView;
import com.skype.android.widget.SkypeAvatarView;
import com.skype.android.widget.SymbolView;
import java.util.concurrent.Future;

// Referenced classes of package com.skype.android.app.contacts:
//            ContactAdapter, ContactItem, ContactAdapterViewBuilder

public class statusMessage extends com.skype.android.app.data.der
{

    public SkypeAvatarView avatarView;
    public Future bitmapFuture;
    public CheckBox checkbox;
    public ContactItem contact;
    public TextView fullName;
    public Future moodFuture;
    public SymbolView presenceIcon;
    public TextView statusMessage;
    final ContactAdapter this$0;

    protected void onSetData(Object obj)
    {
        statusMessage statusmessage;
        if (ContactAdapter.access$600(ContactAdapter.this))
        {
            statusmessage = IRECTORY;
        } else
        {
            statusmessage = IRECTORY;
        }
        viewBuilder.bindContactView(this, context, itemView, (ContactItem)obj, ContactAdapter.access$700(ContactAdapter.this), statusmessage, ContactAdapter.access$800(ContactAdapter.this));
    }

    public void onViewRecycled()
    {
        super.cled();
        if (bitmapFuture != null)
        {
            bitmapFuture.cancel(true);
        }
        if (moodFuture != null)
        {
            moodFuture.cancel(true);
        }
    }

    public I(View view)
    {
        this$0 = ContactAdapter.this;
        super(view);
        avatarView = (SkypeAvatarView)view.findViewById(0x7f10030c);
        if (ContactAdapter.access$400(ContactAdapter.this))
        {
            avatarView.a().setClipCircleEnabled(true);
        }
        presenceIcon = (SymbolView)view.findViewById(0x7f100329);
        fullName = (TextView)view.findViewById(0x7f10031a);
        statusMessage = (TextView)view.findViewById(0x7f10031b);
        checkbox = (CheckBox)view.findViewById(0x7f100319);
        if (ContactAdapter.access$500(ContactAdapter.this) != -1)
        {
            checkbox.setButtonDrawable(ContactAdapter.access$500(ContactAdapter.this));
        }
        new SpannedAnimationDrawableCallback(statusMessage);
    }
}
