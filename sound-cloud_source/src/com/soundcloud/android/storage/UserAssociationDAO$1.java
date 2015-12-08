// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import com.soundcloud.android.api.legacy.model.UserAssociation;
import com.soundcloud.android.api.legacy.model.behavior.Identifiable;
import com.soundcloud.android.storage.provider.Content;

// Referenced classes of package com.soundcloud.android.storage:
//            UserAssociationDAO

final class nit> extends UserAssociationDAO
{

    final Content val$content;

    public final volatile boolean delete(Identifiable identifiable)
    {
        return super.delete((UserAssociation)identifiable);
    }

    public final Content getContent()
    {
        return val$content;
    }

    public final volatile boolean update(Identifiable identifiable)
    {
        return super.update((UserAssociation)identifiable);
    }

    ntifiable(Content content1)
    {
        val$content = content1;
        super(final_contentresolver);
    }
}
