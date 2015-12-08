// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.internal.widget:
//            o, j

public final class m extends ContextWrapper
{
    static final class a extends j
    {

        private final o a;

        public final Drawable getDrawable(int i)
            throws android.content.res.Resources.NotFoundException
        {
            Drawable drawable = super.getDrawable(i);
            if (drawable != null)
            {
                a.a(i, drawable);
            }
            return drawable;
        }

        public a(Resources resources, o o1)
        {
            super(resources);
            a = o1;
        }
    }


    private Resources a;

    private m(Context context)
    {
        super(context);
    }

    public static Context a(Context context)
    {
        Object obj = context;
        if (!(context instanceof m))
        {
            obj = new m(context);
        }
        return ((Context) (obj));
    }

    public final Resources getResources()
    {
        if (a == null)
        {
            a = new a(super.getResources(), o.a(this));
        }
        return a;
    }
}
