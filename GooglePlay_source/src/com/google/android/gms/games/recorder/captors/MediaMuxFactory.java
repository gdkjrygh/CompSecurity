// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.captors;

import android.net.Uri;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.recorder.encode.FileMuxer;
import com.google.android.gms.games.recorder.encode.MediaMux;

public final class MediaMuxFactory
{

    public static MediaMux createMediaMux$5cda557d$eaf4077(Uri uri, boolean flag)
    {
        Object obj;
        String s;
        s = uri.getScheme();
        obj = null;
label0:
        {
            if ("file".equals(s))
            {
                uri = new FileMuxer(uri.getPath(), true, flag);
                break label0;
            }
            try
            {
                GamesLog.e("MediaMuxFactory", (new StringBuilder("Unknown capture scheme: ")).append(s).toString());
            }
            // Misplaced declaration of an exception variable
            catch (Uri uri)
            {
                GamesLog.e("MediaMuxFactory", "Could not create media mux", uri);
                return null;
            }
            uri = obj;
        }
        return uri;
    }
}
