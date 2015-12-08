// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.ActionBar;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.reflect.Method;

// Referenced classes of package android.support.v7.app:
//            b

static final class c
{

    public Method a;
    public Method b;
    public ImageView c;

    tion(Activity activity)
    {
        a = android/app/ActionBar.getDeclaredMethod("setHomeAsUpIndicator", new Class[] {
            android/graphics/drawable/Drawable
        });
        b = android/app/ActionBar.getDeclaredMethod("setHomeActionContentDescription", new Class[] {
            Integer.TYPE
        });
_L1:
        return;
        NoSuchMethodException nosuchmethodexception;
        nosuchmethodexception;
        activity = activity.findViewById(0x102002c);
        if (activity != null)
        {
            Object obj = (ViewGroup)activity.getParent();
            if (((ViewGroup) (obj)).getChildCount() == 2)
            {
                activity = ((ViewGroup) (obj)).getChildAt(0);
                obj = ((ViewGroup) (obj)).getChildAt(1);
                if (activity.getId() == 0x102002c)
                {
                    activity = ((Activity) (obj));
                }
                if (activity instanceof ImageView)
                {
                    c = (ImageView)activity;
                    return;
                }
            }
        }
          goto _L1
    }
}
