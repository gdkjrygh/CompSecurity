// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.widget.RelativeLayout;
import com.snapchat.android.camera.cameradecor.CameraDecor;

public final class qA extends CameraDecor
{

    public RelativeLayout b;

    public qA(Context context, RelativeLayout relativelayout)
    {
        super(null);
        if (relativelayout == null)
        {
            throw new NullPointerException("decor container can not be null");
        } else
        {
            b = relativelayout;
            b.setBackgroundColor(context.getResources().getColor(0x7f0c0033));
            return;
        }
    }
}
