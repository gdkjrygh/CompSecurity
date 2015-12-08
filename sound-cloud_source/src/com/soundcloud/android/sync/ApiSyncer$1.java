// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import android.content.ContentResolver;
import com.soundcloud.android.storage.BaseDAO;
import com.soundcloud.android.storage.provider.Content;

// Referenced classes of package com.soundcloud.android.sync:
//            ApiSyncer

class init> extends BaseDAO
{

    final ApiSyncer this$0;
    final Content val$content;

    public Content getContent()
    {
        return val$content;
    }

    Content(Content content1)
    {
        this$0 = final_apisyncer;
        val$content = content1;
        super(ContentResolver.this);
    }
}
