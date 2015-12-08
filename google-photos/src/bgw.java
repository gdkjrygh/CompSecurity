// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.libraries.video.preview.VideoWithPreviewView;

final class bgw
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private bgv a;

    bgw(bgv bgv1)
    {
        a = bgv1;
        super();
    }

    public final void onGlobalLayout()
    {
        if (((am) (a)).R != null)
        {
            bgv.a(a).a(((am) (a)).R.getHeight());
        }
    }
}
