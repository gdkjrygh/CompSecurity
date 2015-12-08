// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import com.skype.MediaDocument;
import com.skype.android.app.media.MediaLinkProfile;
import com.skype.android.skylib.ObjectIdMap;
import java.util.Map;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.mediacontent:
//            MediaContentRoster

final class a
    implements Runnable
{

    final int a;
    final MediaContentRoster b;

    public final void run()
    {
        MediaDocument mediadocument = (MediaDocument)MediaContentRoster.e(b).a(a, com/skype/MediaDocument);
        if (mediadocument.getDocTypeProp() != com.skype.T_TYPE.MEDIA_EMOTICON && mediadocument.getDocTypeProp() != com.skype.T_TYPE.MEDIA_FLIK)
        {
            MediaContentRoster.g().severe(String.format("%d is not an emotion or a Moji (type=%s)", new Object[] {
                Integer.valueOf(a), mediadocument.getDocTypeProp()
            }));
        } else
        if (MediaContentRoster.f(b).get(Integer.valueOf(a)) == null)
        {
            MediaContentRoster.a(b, mediadocument, MediaLinkProfile.THUMBNAIL_PROFILE);
            return;
        }
    }

    _cls9(MediaContentRoster mediacontentroster, int i)
    {
        b = mediacontentroster;
        a = i;
        super();
    }
}
