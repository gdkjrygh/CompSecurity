// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat.picker;

import com.skype.android.mediacontent.MediaContent;
import com.skype.android.mediacontent.MediaContentRoster;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat.picker:
//            MRUTab

final class val.type
    implements tomRowBuilder.CustomPickerMediaProviderCallback
{

    final MRUTab this$0;
    final List val$recentItemsIds;
    final com.skype.ment.DOCUMENT_TYPE val$type;

    public final MediaContent getMediaForPosition(int i)
    {
        return getMediaContentRoster().a((String)val$recentItemsIds.get(i), val$type);
    }

    public final int size()
    {
        return val$recentItemsIds.size();
    }

    ()
    {
        this$0 = final_mrutab;
        val$recentItemsIds = list;
        val$type = com.skype.ment.DOCUMENT_TYPE.this;
        super();
    }
}
