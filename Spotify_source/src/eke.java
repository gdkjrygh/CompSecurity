// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.spotify.mobile.android.service.media.MediaService;
import java.util.concurrent.Executors;

public class eke
    implements dmx
{

    final ecj a = new ecj(Executors.newSingleThreadScheduledExecutor());

    public eke()
    {
    }

    public final ekh a(MediaService mediaservice, ebf ebf, String s)
    {
        return new ekh(this, mediaservice, ebf, s);
    }
}
