// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.media;

import android.util.Pair;
import java.util.Comparator;

// Referenced classes of package com.skype.android.app.media:
//            UrlPreviewMediaAgent, MediaLinkProfile

final class this._cls0
    implements Comparator
{

    final UrlPreviewMediaAgent this$0;

    public final int compare(Pair pair, Pair pair1)
    {
        int i = ((Integer)pair.first).intValue();
        int j = ((Integer)pair1.first).intValue();
        if (i != j)
        {
            return i - j;
        } else
        {
            return ((MediaLinkProfile)pair.second).ordinal() - ((MediaLinkProfile)pair1.second).ordinal();
        }
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        return compare((Pair)obj, (Pair)obj1);
    }

    ()
    {
        this$0 = UrlPreviewMediaAgent.this;
        super();
    }
}
