// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import com.skype.MediaDocument;

// Referenced classes of package com.skype.android.app.media:
//            MediaLinkProfile

public interface MediaDocumentUrlPreviewObserver
{

    public abstract void documentProfileUpdated(MediaDocument mediadocument, MediaLinkProfile medialinkprofile, com.skype.MediaDocument.MEDIA_STATUS media_status);
}
