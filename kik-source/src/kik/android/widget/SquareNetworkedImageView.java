// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;

// Referenced classes of package kik.android.widget:
//            KikNetworkedImageView, cs, w

public class SquareNetworkedImageView extends KikNetworkedImageView
{

    public SquareNetworkedImageView(Context context)
    {
        super(context);
    }

    public SquareNetworkedImageView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public SquareNetworkedImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    protected final w a(Bitmap bitmap, String s)
    {
        return new cs(bitmap, s);
    }
}
