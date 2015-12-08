// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.ProgressBar;
import com.google.android.libraries.social.media.ui.MediaView;

public final class nkb
    implements Runnable
{

    private long a;
    private long b;
    private MediaView c;

    public nkb(MediaView mediaview, long l, long l1)
    {
        c = mediaview;
        a = l;
        b = l1;
        super();
    }

    public final void run()
    {
        if (a != 0L)
        {
            if (MediaView.e(c).isIndeterminate())
            {
                MediaView.e(c).setIndeterminate(false);
                MediaView.e(c).setMax((int)b);
            }
            MediaView.e(c).setProgress((int)a);
            c.invalidate();
        }
    }
}
