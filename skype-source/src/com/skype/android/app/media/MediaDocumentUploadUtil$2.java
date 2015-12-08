// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.graphics.Bitmap;
import android.net.Uri;
import com.skype.Conversation;
import com.skype.android.app.transfer.PathRetriever;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentUploadUtil

final class val.legacyText
    implements Callable
{

    final MediaDocumentUploadUtil this$0;
    final Conversation val$conversation;
    final String val$legacyText;
    final Bitmap val$thumbnail;
    final String val$thumbnailPath;
    final Uri val$videoUri;

    public final Boolean call()
        throws Exception
    {
        return Boolean.valueOf(MediaDocumentUploadUtil.access$200(MediaDocumentUploadUtil.this, val$conversation, PathRetriever.getPath(MediaDocumentUploadUtil.access$100(MediaDocumentUploadUtil.this), val$videoUri, false), val$thumbnailPath, val$thumbnail, val$legacyText));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_mediadocumentuploadutil;
        val$conversation = conversation1;
        val$videoUri = uri;
        val$thumbnailPath = s;
        val$thumbnail = bitmap;
        val$legacyText = String.this;
        super();
    }
}
