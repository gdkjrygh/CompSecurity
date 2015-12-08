// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.ListView;
import com.spotify.mobile.android.spotlets.openaccess.model.Track;
import com.spotify.mobile.android.spotlets.openaccess.view.ProgressPlayButton;

public final class exz
{

    public static void a(ListView listview, Track track, float f)
    {
        for (int i = 0; i <= listview.getChildCount(); i++)
        {
            View view = listview.getChildAt(i);
            if (view != null && track == view.getTag())
            {
                ((ProgressPlayButton)dhu.b(view).x()).a(f);
            }
        }

    }
}
