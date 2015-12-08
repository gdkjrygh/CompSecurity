// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.j.v;
import com.google.android.m4b.maps.j.x;
import com.google.android.m4b.maps.model.a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            az

public abstract class bl
{
    public static final class a extends bl
    {

        private final String a;

        public final Bitmap a(Context context)
        {
            Object obj;
            try
            {
                context = context.getAssets().open(a);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return null;
            }
            obj = BitmapFactory.decodeStream(context);
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                return ((Bitmap) (obj));
            }
            return ((Bitmap) (obj));
            obj;
            try
            {
                context.close();
            }
            // Misplaced declaration of an exception variable
            catch (Context context) { }
            throw obj;
        }

        public final boolean equals(Object obj)
        {
            if (this == obj)
            {
                return true;
            }
            if (!(obj instanceof a))
            {
                return false;
            } else
            {
                obj = (a)obj;
                return a.equals(((a) (obj)).a);
            }
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                a
            });
        }

        public final String toString()
        {
            return v.a(this).a("asset", a).toString();
        }

        private a(String s)
        {
            super((byte)3, (byte)0);
            a = (String)x.a(s, "null asset name");
        }

        a(String s, byte byte0)
        {
            this(s);
        }
    }

    public static final class b extends bl
    {

        private final bl a;
        private final float b;

        public final Bitmap a(Context context)
        {
            Bitmap bitmap = a.a(context);
            float f1 = b;
            int j = bitmap.getHeight();
            int k = bitmap.getWidth();
            context = new int[j * k];
            bitmap.getPixels(context, 0, k, 0, 0, k, j);
            int ai[] = new int[j * k];
            float af[] = new float[3];
            for (int i = 0; i < context.length; i++)
            {
                Color.colorToHSV(context[i], af);
                af[0] = f1;
                ai[i] = Color.HSVToColor(Color.alpha(context[i]), af);
            }

            return Bitmap.createBitmap(ai, 0, k, k, j, android.graphics.Bitmap.Config.ARGB_8888);
        }

        public final boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (!(obj instanceof b))
                {
                    return false;
                }
                obj = (b)obj;
                if (!a.equals(((b) (obj)).a) || Float.floatToIntBits(b) != Float.floatToIntBits(((b) (obj)).b))
                {
                    return false;
                }
            }
            return true;
        }

        public final int hashCode()
        {
            return Arrays.hashCode(new Object[] {
                