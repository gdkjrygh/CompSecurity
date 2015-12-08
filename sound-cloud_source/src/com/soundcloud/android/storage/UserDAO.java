// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import com.soundcloud.android.storage.provider.Content;

// Referenced classes of package com.soundcloud.android.storage:
//            BaseDAO

class UserDAO extends BaseDAO
{

    public UserDAO(ContentResolver contentresolver)
    {
        super(contentresolver);
    }

    public Content getContent()
    {
        return Content.USERS;
    }
}
