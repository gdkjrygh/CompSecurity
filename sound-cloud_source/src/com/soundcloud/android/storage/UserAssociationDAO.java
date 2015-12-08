// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage;

import android.content.ContentResolver;
import com.soundcloud.android.api.legacy.model.UserAssociation;
import com.soundcloud.android.api.legacy.model.behavior.Identifiable;
import com.soundcloud.android.storage.provider.Content;

// Referenced classes of package com.soundcloud.android.storage:
//            BaseDAO

class UserAssociationDAO extends BaseDAO
{

    public UserAssociationDAO(ContentResolver contentresolver)
    {
        super(contentresolver);
    }

    protected static UserAssociationDAO forContent(Content content, final ContentResolver final_contentresolver)
    {
        return new _cls1(content);
    }

    public boolean delete(UserAssociation userassociation)
    {
        return delete(getContent().uri, "target_id=? AND association_type=?", new String[] {
            String.valueOf(userassociation.getItemId()), String.valueOf(userassociation.associationType)
        });
    }

    public volatile boolean delete(Identifiable identifiable)
    {
        return delete((UserAssociation)identifiable);
    }

    public Content getContent()
    {
        return Content.USER_ASSOCIATIONS;
    }

    public Class getModelClass()
    {
        return com/soundcloud/android/api/legacy/model/UserAssociation;
    }

    public boolean update(UserAssociation userassociation)
    {
        long l = userassociation.getItemId();
        int i = userassociation.associationType;
        return resolver.update(getContent().uri, userassociation.buildContentValues(), "target_id = ? AND association_type = ?", new String[] {
            String.valueOf(l), String.valueOf(i)
        }) == 1;
    }

    public volatile boolean update(Identifiable identifiable)
    {
        return update((UserAssociation)identifiable);
    }

    private class _cls1 extends UserAssociationDAO
    {

        final Content val$content;

        public final volatile boolean delete(Identifiable identifiable)
        {
            return delete((UserAssociation)identifiable);
        }

        public final Content getContent()
        {
            return content;
        }

        public final volatile boolean update(Identifiable identifiable)
        {
            return update((UserAssociation)identifiable);
        }

        _cls1(Content content1)
        {
            content = content1;
            super(final_contentresolver);
        }
    }

}
