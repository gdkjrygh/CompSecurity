// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.contacts;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.skype.SkyLib;
import com.skype.android.app.recents.RecentItem;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.text.TypeFaceFactory;
import com.skype.android.util.ContactUtil;
import com.skype.android.util.GroupAvatarUtil;
import com.skype.android.util.ImageCache;

// Referenced classes of package com.skype.android.app.contacts:
//            ConversationAdapter

private static final class typeFaceFactory extends com.skype.android.app.data.apter
{

    private final Activity activity;
    private final ContactUtil contactUtil;
    private final DefaultAvatars defaultAvatars;
    private final GroupAvatarUtil groupAvatarUtil;
    private final ImageCache imageCache;
    private final SkyLib lib;
    private final ObjectIdMap map;
    private final TypeFaceFactory typeFaceFactory;

    protected final int getItemId(Object obj)
    {
        return ((RecentItem)obj).getConversationObjectId();
    }

    protected final View onCreateView(ViewGroup viewgroup)
    {
        return LayoutInflater.from(viewgroup.getContext()).inflate(0x7f030063, viewgroup, false);
    }

    protected final nversationItemViewHolder onCreateViewHolder(View view)
    {
        return new nversationItemViewHolder(activity, view, imageCache, contactUtil, groupAvatarUtil, defaultAvatars, lib, map, typeFaceFactory);
    }

    protected final volatile com.skype.android.app.data.lder onCreateViewHolder(View view)
    {
        return onCreateViewHolder(view);
    }

    public (Activity activity1, ImageCache imagecache, ContactUtil contactutil, GroupAvatarUtil groupavatarutil, DefaultAvatars defaultavatars, SkyLib skylib, ObjectIdMap objectidmap, 
            TypeFaceFactory typefacefactory)
    {
        activity = activity1;
        imageCache = imagecache;
        contactUtil = contactutil;
        groupAvatarUtil = groupavatarutil;
        defaultAvatars = defaultavatars;
        lib = skylib;
        map = objectidmap;
        typeFaceFactory = typefacefactory;
    }
}
