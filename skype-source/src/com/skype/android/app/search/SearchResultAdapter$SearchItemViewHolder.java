// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.search;

import android.app.Activity;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.app.contacts.ImageItemViewHolder;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.text.BoldTypeFacedSpan;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SkypeAvatarView;

// Referenced classes of package com.skype.android.app.search:
//            SearchResultAdapter

public abstract class boldfaced extends ImageItemViewHolder
{

    protected final BoldTypeFacedSpan boldfaced;
    protected Object data;
    protected final TextView firstLineView;
    protected final TextView secondLineView;
    final SearchResultAdapter this$0;

    protected abstract Conversation getConversationFromData(Object obj);

    protected void highlightSearchString(SpannableStringBuilder spannablestringbuilder, int i, int j)
    {
        spannablestringbuilder.setSpan(boldfaced, i, i + j, 18);
    }

    protected void onSetData(Object obj)
    {
        data = obj;
        obj = getConversationFromData(data);
        bindImage(((Conversation) (obj)));
        setFirstLine(((Conversation) (obj)));
        setSecondLine(((Conversation) (obj)));
    }

    protected abstract void setFirstLine(Conversation conversation);

    protected abstract void setSecondLine(Conversation conversation);

    public (Activity activity, View view, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, 
            SkyLib skylib, TypeFaceFactory typefacefactory)
    {
        this$0 = SearchResultAdapter.this;
        super(activity, view, (SkypeAvatarView)ViewUtil.a(view, 0x7f10030c), imagecache, contactutil, groupavatarutil, defaultavatars, skylib);
        firstLineView = (TextView)ViewUtil.a(view, 0x7f10031a);
        secondLineView = (TextView)ViewUtil.a(view, 0x7f10031b);
        boldfaced = new BoldTypeFacedSpan(typefacefactory);
    }
}
