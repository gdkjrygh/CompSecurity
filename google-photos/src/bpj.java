// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;

final class bpj
    implements det
{

    bpj()
    {
    }

    public final void a(Object obj)
    {
        obj = ((Context)obj).getCacheDir();
        for (int i = 0; i < 5; i++)
        {
            String s = (new String[] {
                "AamEventsLog", "ClusteringLog", "PluggedInLog", "PostSyncLog", "PostCaptureLog"
            })[i];
            for (int j = 1; j <= 5; j++)
            {
                (new File(((File) (obj)), (new StringBuilder(String.valueOf(s).length() + 12)).append(s).append(".").append(j).toString())).delete();
            }

            (new File(((File) (obj)), s)).delete();
        }

    }
}
