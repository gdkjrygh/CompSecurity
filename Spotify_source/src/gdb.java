// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.TextView;
import com.spotify.android.paste.graphics.DownloadIndicatorDrawable;

public final class gdb
{

    public static boolean a(Context context, TextView textview, int i, int j)
    {
        boolean flag2 = com.spotify.mobile.android.provider.Metadata.OfflineSync.c(i);
        boolean flag;
        boolean flag1;
        if (j != -1)
        {
            flag = com.spotify.mobile.android.provider.Metadata.OfflineSync.a(i, j);
        } else
        {
            flag = com.spotify.mobile.android.provider.Metadata.OfflineSync.a(i, 0);
        }
        if (j != -1)
        {
            flag1 = com.spotify.mobile.android.provider.Metadata.OfflineSync.b(i, j);
        } else
        {
            flag1 = com.spotify.mobile.android.provider.Metadata.OfflineSync.d(i);
        }
        if (flag2 || flag || flag1)
        {
            DownloadIndicatorDrawable downloadindicatordrawable = (DownloadIndicatorDrawable)gdc.a(context, textview, 0x7f110048, new cue(context) {

                private Context a;

                public final Object a()
                {
                    return new DownloadIndicatorDrawable(a);
                }

            
            {
                a = context;
                super();
            }
            });
            if (flag2)
            {
                downloadindicatordrawable.a(com.spotify.android.paste.graphics.DownloadIndicatorDrawable.DownloadState.b);
                if (j != -1)
                {
                    textview.setText(context.getString(0x7f0802ee, new Object[] {
                        Integer.valueOf(j)
                    }));
                }
            } else
            if (flag)
            {
                downloadindicatordrawable.a(com.spotify.android.paste.graphics.DownloadIndicatorDrawable.DownloadState.a);
            } else
            {
                downloadindicatordrawable.a(com.spotify.android.paste.graphics.DownloadIndicatorDrawable.DownloadState.c);
            }
            return flag2;
        } else
        {
            gdc.a(textview, 0x7f110048);
            return false;
        }
    }
}
