// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.graphics.Bitmap;
import com.skype.MediaDocument;
import com.skype.android.util.ImageCache;
import java.util.concurrent.Callable;

// Referenced classes of package com.skype.android.app.media:
//            MediaDocumentDownloadUtil, MediaLinkProfile

final class val.cacheTimestamp
    implements Callable
{

    final MediaDocumentDownloadUtil this$0;
    final String val$cacheIdentity;
    final long val$cacheTimestamp;
    final MediaDocument val$mediaAvatar;

    public final Bitmap call()
        throws Exception
    {
        Object obj = val$mediaAvatar.getMediaLink(MediaLinkProfile.GROUP_AVATAR_PROFILE.toString());
        if (((com.skype.esult) (obj)).m_return != com.skype.EDIA_LOADED)
        {
            putUnavailableMedia(val$mediaAvatar.getObjectID(), MediaLinkProfile.GROUP_AVATAR_PROFILE, ((com.skype.esult) (obj)).m_return);
            return null;
        }
        removeUnavailableMedia(val$mediaAvatar.getObjectID(), MediaLinkProfile.GROUP_AVATAR_PROFILE);
        Bitmap bitmap = null;
        try
        {
            obj = MediaDocumentDownloadUtil.access$000(MediaDocumentDownloadUtil.this, ((com.skype.esult) (obj)).m_path, MediaLinkProfile.GROUP_AVATAR_PROFILE, val$mediaAvatar.getDocTypeProp());
        }
        catch (Exception exception)
        {
            exception.printStackTrace();
            return bitmap;
        }
        bitmap = ((Bitmap) (obj));
        MediaDocumentDownloadUtil.access$100(MediaDocumentDownloadUtil.this).a(val$cacheIdentity, ((Bitmap) (obj)), val$cacheTimestamp);
        return ((Bitmap) (obj));
    }

    public final volatile Object call()
        throws Exception
    {
        return call();
    }

    ()
    {
        this$0 = final_mediadocumentdownloadutil;
        val$mediaAvatar = mediadocument;
        val$cacheIdentity = s;
        val$cacheTimestamp = J.this;
        super();
    }
}
