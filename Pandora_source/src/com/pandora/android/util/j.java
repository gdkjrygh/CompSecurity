// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.widget.ImageView;
import com.pandora.android.view.SafeImageView;
import java.lang.reflect.Field;
import p.an.f;
import p.an.k;
import p.df.a;
import p.l.g;

public class j
{
    private static class a extends f
    {

        public k a(ImageView imageview, Class class1)
        {
            if (imageview instanceof SafeImageView)
            {
                ((SafeImageView)imageview).setGlideCallStack(new Throwable((new StringBuilder()).append("Loading from ").append(class1).append(" into ").append(imageview).toString()));
            }
            return super.a(imageview, class1);
        }

        private a()
        {
        }

    }


    public static void a(g g)
    {
        try
        {
            Field field = g.getClass().getDeclaredField("imageViewTargetFactory");
            field.setAccessible(true);
            field.set(g, new a());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (g g) { }
        // Misplaced declaration of an exception variable
        catch (g g) { }
        p.df.a.b("GlideSafeImageViewTargetFactory", "Unable to setup catchable draw factory via reflection, did you forgot to add proguard rule?", g);
    }
}
