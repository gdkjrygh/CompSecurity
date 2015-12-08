// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.widget.ImageView;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            SimpleImageDialog

public class 
{

    public static void inject(butterknife.geDialog gedialog, SimpleImageDialog simpleimagedialog, Object obj)
    {
        simpleimagedialog._imageView = (ImageView)gedialog._imageView(obj, 0x7f0f01a8, "field '_imageView'");
    }

    public static void reset(SimpleImageDialog simpleimagedialog)
    {
        simpleimagedialog._imageView = null;
    }

    public ()
    {
    }
}
