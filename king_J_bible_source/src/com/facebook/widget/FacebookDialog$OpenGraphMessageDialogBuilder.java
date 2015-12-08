// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.app.Activity;
import com.facebook.model.OpenGraphAction;
import java.util.EnumSet;
import java.util.List;

// Referenced classes of package com.facebook.widget:
//            FacebookDialog

public static class it> extends it>
{

    protected EnumSet getDialogFeatures()
    {
        return EnumSet.of(OG_MESSAGE_DIALOG);
    }

    public volatile OG_MESSAGE_DIALOG setDataErrorsFatal(boolean flag)
    {
        return super.DataErrorsFatal(flag);
    }

    public volatile DataErrorsFatal setImageAttachmentFilesForAction(List list)
    {
        return super.ImageAttachmentFilesForAction(list);
    }

    public volatile ImageAttachmentFilesForAction setImageAttachmentFilesForAction(List list, boolean flag)
    {
        return super.ImageAttachmentFilesForAction(list, flag);
    }

    public volatile ImageAttachmentFilesForAction setImageAttachmentFilesForObject(String s, List list)
    {
        return super.ImageAttachmentFilesForObject(s, list);
    }

    public volatile ImageAttachmentFilesForObject setImageAttachmentFilesForObject(String s, List list, boolean flag)
    {
        return super.ImageAttachmentFilesForObject(s, list, flag);
    }

    public volatile ImageAttachmentFilesForObject setImageAttachmentsForAction(List list)
    {
        return super.ImageAttachmentsForAction(list);
    }

    public volatile ImageAttachmentsForAction setImageAttachmentsForAction(List list, boolean flag)
    {
        return super.ImageAttachmentsForAction(list, flag);
    }

    public volatile ImageAttachmentsForAction setImageAttachmentsForObject(String s, List list)
    {
        return super.ImageAttachmentsForObject(s, list);
    }

    public volatile ImageAttachmentsForObject setImageAttachmentsForObject(String s, List list, boolean flag)
    {
        return super.ImageAttachmentsForObject(s, list, flag);
    }

    public (Activity activity, OpenGraphAction opengraphaction, String s)
    {
        super(activity, opengraphaction, s);
    }
}
