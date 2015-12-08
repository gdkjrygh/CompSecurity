// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.MediaDocument;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil, MediaLinkProfile, MediaLinkSaveError

final class val.profile
    implements Callable
{

    final MediaDocumentDownloadUtil this$0;
    final MediaDocument val$mediaDocument;
    final MediaLinkProfile val$profile;

    public final MediaLinkSaveError call()
        throws Exception
    {
        com.skype.esult esult = val$mediaDocument.getMediaLink(val$profile.toString());
        if (esult.m_return != com.skype.EDIA_LOADED)
        {
            return null;
        } else
        {
            return MediaDocumentDownloadUtil.access$200(MediaDocumentDownloadUtil.this, val$mediaDocument, esult.m_path);
        }
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_mediadocumentdownloadutil;
        val$mediaDocument = mediadocument;
        val$profile = MediaLinkProfile.this;
        super();
    }
}
