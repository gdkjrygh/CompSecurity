// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.google.android.libraries.video.preview.VideoWithPreviewView;

final class ced
    implements android.view.ViewTreeObserver.OnGlobalLayoutListener
{

    private cec a;

    ced(cec cec1)
    {
        a = cec1;
        super();
    }

    public final void onGlobalLayout()
    {
        if (((am) (a)).R != null)
        {
            cec.a(a).a(((am) (a)).R.getHeight());
        }
    }
}
