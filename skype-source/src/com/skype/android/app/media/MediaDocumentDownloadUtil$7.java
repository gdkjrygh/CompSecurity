// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.MediaDocument;
import com.skype.android.util.ImageCache;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil, MediaLinkProfile

final class val.cacheIdentity
    implements Callable
{

    final MediaDocumentDownloadUtil this$0;
    final String val$cacheIdentity;
    final MediaDocument val$mediaDocument;
    final MediaLinkProfile val$profile;

    public final tMediaLinkResult call()
        throws Exception
    {
        android.graphics.Bitmap bitmap;
        com.skype.esult esult;
        if (MediaDocumentDownloadUtil.access$400(MediaDocumentDownloadUtil.this, val$profile, val$mediaDocument) && !isMediaLoadedInCache(val$mediaDocument, val$profile))
        {
            return new tMediaLinkResult(null, getUnavailableMediaStatus(val$mediaDocument.getObjectID(), val$profile));
        }
        esult = val$mediaDocument.getMediaLink(val$profile.toString());
        if (esult.m_return != com.skype.EDIA_LOADED)
        {
            return new tMediaLinkResult(null, esult.m_return);
        }
        bitmap = null;
        android.graphics.Bitmap bitmap1 = MediaDocumentDownloadUtil.access$000(MediaDocumentDownloadUtil.this, esult.m_path, val$profile, val$mediaDocument.getDocTypeProp());
        bitmap = bitmap1;
_L3:
        .SwitchMap.com.skype.android.app.media.MediaLinkProfile[val$profile.ordinal()];
        JVM INSTR tableswitch 1 2: default 168
    //                   1 189
    //                   2 189;
           goto _L1 _L2 _L2
_L1:
        return new tMediaLinkResult(bitmap, esult.m_return);
        Exception exception;
        exception;
        exception.printStackTrace();
          goto _L3
_L2:
        MediaDocumentDownloadUtil.access$100(MediaDocumentDownloadUtil.this).a(val$cacheIdentity, bitmap);
          goto _L1
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    tMediaLinkResult()
    {
        this$0 = final_mediadocumentdownloadutil;
        val$profile = medialinkprofile;
        val$mediaDocument = mediadocument;
        val$cacheIdentity = String.this;
        super();
    }
}
