// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.media;

import android.graphics.Canvas;

// Referenced classes of package android.media:
//            SubtitleTrack

public static interface OnChangedListener
{
    public static interface OnChangedListener
    {
    }


    public abstract void draw(Canvas canvas);

    public abstract void onAttachedToWindow();

    public abstract void onDetachedFromWindow();

    public abstract void setOnChangedListener(OnChangedListener onchangedlistener);

    public abstract void setSize(int i, int j);
}
