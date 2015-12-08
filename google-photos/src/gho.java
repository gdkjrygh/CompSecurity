// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import android.widget.ImageView;
import java.io.File;
import java.io.IOException;

public final class gho
    implements mli
{

    private final Context a;
    private final String b;

    public gho(Context context, String s)
    {
        a = context;
        b = s;
    }

    public final void a(String s, ImageView imageview)
    {
        imageview.setImageDrawable(new BitmapDrawable(a.getResources(), a.getAssets().open((new File(b, s)).getPath())));
_L1:
        return;
        imageview;
        if (Log.isLoggable("BtfyAssetsImageProvider", 6))
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Error loading image: ".concat(s);
            } else
            {
                s = new String("Error loading image: ");
            }
            Log.e("BtfyAssetsImageProvider", s, imageview);
            return;
        }
          goto _L1
    }
}
