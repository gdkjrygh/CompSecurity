// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media;

import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.netflix.mediaclient.Log;
import java.nio.ByteBuffer;

// Referenced classes of package com.netflix.mediaclient.media:
//            BifManager

public static class 
{

    public static void showBifInView(BifManager bifmanager, int i, ImageView imageview)
    {
        showBifInView(bifmanager.getIndexFrame(i), imageview);
    }

    public static void showBifInView(ByteBuffer bytebuffer, ImageView imageview)
    {
        if (imageview == null)
        {
            Log.w("BifManager", "View is null");
            return;
        }
        if (bytebuffer == null)
        {
            Log.v("BifManager", "ByteBuffer is null");
            return;
        }
        if (imageview.getVisibility() != 0)
        {
            imageview.setVisibility(0);
        }
        bytebuffer = BitmapFactory.decodeByteArray(bytebuffer.array(), bytebuffer.position(), bytebuffer.limit());
        if (bytebuffer != null)
        {
            imageview.setImageBitmap(bytebuffer);
            return;
        } else
        {
            Log.w("BifManager", "decoded bif bitmap is null");
            return;
        }
    }

    public ()
    {
    }
}
