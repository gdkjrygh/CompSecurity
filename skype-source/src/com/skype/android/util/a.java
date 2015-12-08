// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.util;

import android.text.TextUtils;
import com.skype.Conversation;
import com.skype.MediaDocument;
import com.skype.MediaDocumentImpl;

// Referenced classes of package com.skype.android.util:
//            ImageSource

final class a
    implements ImageSource
{

    private final Conversation a;

    public a(Conversation conversation)
    {
        a = conversation;
    }

    public final String getIdentity()
    {
        return a.getIdentityProp();
    }

    public final byte[] getImageData()
    {
        if (TextUtils.isEmpty(a.getPictureProp()))
        {
            return a.getMetaPictureProp();
        } else
        {
            return null;
        }
    }

    public final long getImageTimestamp()
    {
        if (TextUtils.isEmpty(a.getPictureProp()))
        {
            return (long)a.getCreationTimestampProp();
        }
        MediaDocumentImpl mediadocumentimpl = new MediaDocumentImpl();
        if (a.getPictureMediaDocument(mediadocumentimpl))
        {
            return (long)mediadocumentimpl.getObjectID();
        } else
        {
            return 0L;
        }
    }
}
