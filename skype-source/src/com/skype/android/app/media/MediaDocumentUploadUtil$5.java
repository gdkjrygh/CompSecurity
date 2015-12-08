// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.graphics.Bitmap;
import com.skype.MediaDocument;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentUploadUtil, MediaLinkProfile, ImageTransformer

final class val.mediaDocument
    implements Callable
{

    final MediaDocumentUploadUtil this$0;
    final MediaDocument val$mediaDocument;

    public final Bitmap call()
        throws Exception
    {
        Object obj = val$mediaDocument.getMediaLink(MediaLinkProfile.CACHE_PROFILE.toString());
        if (((com.skype._Result) (obj)).m_return != com.skype..MEDIA_LOADED)
        {
            return null;
        } else
        {
            obj = MediaDocumentUploadUtil.access$600(MediaDocumentUploadUtil.this).transform(((com.skype._Result) (obj)).m_path);
            return MediaDocumentUploadUtil.access$700(MediaDocumentUploadUtil.this, val$mediaDocument.getObjectID(), ((Bitmap) (obj)));
        }
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_mediadocumentuploadutil;
        val$mediaDocument = MediaDocument.this;
        super();
    }
}
