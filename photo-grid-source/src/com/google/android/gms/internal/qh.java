// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.webkit.WebSettings;

// Referenced classes of package com.google.android.gms.internal:
//            qj

public class qh extends qj
{

    public qh()
    {
    }

    public final Drawable a(Context context, Bitmap bitmap, boolean flag, float f)
    {
        if (!flag || f <= 0.0F || f > 25F)
        {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        Object obj;
        try
        {
            Object obj2 = Bitmap.createScaledBitmap(bitmap, bitmap.getWidth(), bitmap.getHeight(), false);
            obj = Bitmap.createBitmap(((Bitmap) (obj2)));
            Object obj1 = RenderScript.create(context);
            ScriptIntrinsicBlur scriptintrinsicblur = ScriptIntrinsicBlur.create(((RenderScript) (obj1)), Element.U8_4(((RenderScript) (obj1))));
            obj2 = Allocation.createFromBitmap(((RenderScript) (obj1)), ((Bitmap) (obj2)));
            obj1 = Allocation.createFromBitmap(((RenderScript) (obj1)), ((Bitmap) (obj)));
            scriptintrinsicblur.setRadius(f);
            scriptintrinsicblur.setInput(((Allocation) (obj2)));
            scriptintrinsicblur.forEach(((Allocation) (obj1)));
            ((Allocation) (obj1)).copyTo(((Bitmap) (obj)));
            obj = new BitmapDrawable(context.getResources(), ((Bitmap) (obj)));
        }
        catch (RuntimeException runtimeexception)
        {
            return new BitmapDrawable(context.getResources(), bitmap);
        }
        return ((Drawable) (obj));
    }

    public final String a(Context context)
    {
        return WebSettings.getDefaultUserAgent(context);
    }

    public final boolean a(Context context, WebSettings websettings)
    {
        super.a(context, websettings);
        websettings.setMediaPlaybackRequiresUserGesture(false);
        return true;
    }
}
