// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.hls;

import com.google.android.exoplayer.chunk.DataChunk;
import com.google.android.exoplayer.upstream.DataSource;
import com.google.android.exoplayer.upstream.DataSpec;
import java.io.ByteArrayInputStream;

// Referenced classes of package com.google.android.exoplayer.hls:
//            HlsPlaylistParser, HlsMediaPlaylist

class h extends DataChunk
{

    public final int a;
    private final HlsPlaylistParser g;
    private final String h;
    private HlsMediaPlaylist i;

    protected final void a(byte abyte0[], int j)
    {
        i = (HlsMediaPlaylist)HlsPlaylistParser.a(h, new ByteArrayInputStream(abyte0, 0, j));
    }

    public final HlsMediaPlaylist b()
    {
        return i;
    }

    public (DataSource datasource, DataSpec dataspec, byte abyte0[], HlsPlaylistParser hlsplaylistparser, int j, String s)
    {
        super(datasource, dataspec, 4, 0, null, abyte0);
        a = j;
        g = hlsplaylistparser;
        h = s;
    }
}
