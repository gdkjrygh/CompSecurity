// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.mediacontent;

import com.skype.android.util.cache.SpannedStringCache;

// Referenced classes of package com.skype.android.mediacontent:
//            MediaContentRoster

final class a
    implements Runnable
{

    final SpannedStringCache a;
    final MediaContentRoster b;

    public final void run()
    {
        a.a();
    }

    _cls9(MediaContentRoster mediacontentroster, SpannedStringCache spannedstringcache)
    {
        b = mediacontentroster;
        a = spannedstringcache;
        super();
    }
}
