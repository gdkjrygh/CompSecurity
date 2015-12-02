// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor.mp4;

import com.google.android.exoplayer.MediaFormat;
import com.google.android.exoplayer.util.Util;

// Referenced classes of package com.google.android.exoplayer.extractor.mp4:
//            TrackEncryptionBox

public final class Track
{

    public static final int a = Util.e("vide");
    public static final int b = Util.e("soun");
    public static final int c = Util.e("text");
    public static final int d = Util.e("sbtl");
    public final int e;
    public final int f;
    public final long g;
    public final long h;
    public final MediaFormat i;
    public final TrackEncryptionBox j[];
    public final int k;

    public Track(int l, int i1, long l1, long l2, MediaFormat mediaformat, 
            TrackEncryptionBox atrackencryptionbox[], int j1)
    {
        e = l;
        f = i1;
        g = l1;
        h = l2;
        i = mediaformat;
        j = atrackencryptionbox;
        k = j1;
    }

}
