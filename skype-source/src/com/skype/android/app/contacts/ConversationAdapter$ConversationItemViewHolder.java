// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.app.recents.Recent;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.text.BoldTypeFacedSpan;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.SkypeAvatarView;

// Referenced classes of package com.skype.android.app.contacts:
//            ImageItemViewHolder, ConversationAdapter

public static class multipane extends ImageItemViewHolder
{

    private final BoldTypeFacedSpan boldfaced;
    public CheckBox checkbox;
    private final TextView firstLineView;
    private final ObjectIdMap map;
    private final boolean multipane;
    private final TextView secondLineView;

    private void highlightSearchString(SpannableStringBuilder spannablestringbuilder, int i, int j)
    {
        spannablestringbuilder.setSpan(boldfaced, i, i + j, 18);
    }

    private void setFirstLine(Recent recent)
    {
        String s;
        String s1;
        SpannableStringBuilder spannablestringbuilder;
        s1 = recent.getDisplayName();
        spannablestringbuilder = new SpannableStringBuilder(s1);
        s = null;
        if (ConversationAdapter.access$000() != null)
        {
            s = ConversationAdapter.access$000().toString();
        }
        if (TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        int i;
        String s2 = s1.toLowerCase();
        s = s.toLowerCase();
        i = s2.indexOf(s);
        if (i == -1) goto _L4; else goto _L3
_L3:
        highlightSearchString(spannablestringbuilder, i, s.length());
_L2:
        firstLineView.setText(spannablestringbuilder);
        return;
_L4:
        int j = recent.getIdentity().indexOf(s);
        if (j != -1)
        {
            spannablestringbuilder.append(" (").append(recent.getIdentity()).append(")");
            highlightSearchString(spannablestringbuilder, j + (s1.length() + 2), s.length());
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void setSecondLine(Recent recent, Conversation conversation)
    {
        if (!recent.isDialog() && conversation != null)
        {
            int i = conversation.getParticipants(com.skype.sationItemViewHolder).ntObjectIDList.length;
            recent = String.format(secondLineView.getContext().getString(0x7f0802fb), new Object[] {
                Integer.valueOf(i)
            });
            secondLineView.setText(recent);
            secondLineView.setVisibility(0);
            return;
        } else
        {
            secondLineView.setVisibility(8);
            return;
        }
    }

    protected void onSetData(Object obj)
    {
        obj = (Recent)obj;
        Conversation conversation = (Conversation)map.a(((Recent) (obj)).getConversationObjectId(), com/skype/Conversation);
        bindImage(conversation);
        setFirstLine(((Recent) (obj)));
        setSecondLine(((Recent) (obj)), conversation);
        if (multipane)
        {
            obj = checkbox;
            int i;
            if (isItemChecked())
            {
                i = 0;
            } else
            {
                i = 8;
            }
            ((CheckBox) (obj)).setVisibility(i);
        }
    }

    public (Activity activity, View view, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, SkyLib skylib, 
            ObjectIdMap objectidmap, TypeFaceFactory typefacefactory)
    {
        super(activity, view, (SkypeAvatarView)ViewUtil.a(view, 0x7f10030c), imagecache, contactutil, groupavatarutil, defaultavatars, skylib);
        map = objectidmap;
        firstLineView = (TextView)ViewUtil.a(view, 0x7f10031a);
        secondLineView = (TextView)ViewUtil.a(view, 0x7f10031b);
        checkbox = (CheckBox)ViewUtil.a(view, 0x7f100319);
        boldfaced = new BoldTypeFacedSpan(typefacefactory);
        checkbox.setVisibility(8);
        multipane = view.getContext().getResources().getBoolean(0x7f0d0003);
    }
}
