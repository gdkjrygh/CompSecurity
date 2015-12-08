// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Rect;
import android.util.Property;
import com.google.android.apps.photos.pager.ClippingImageView;

public final class gna extends Property
{

    public gna(Class class1, String s)
    {
        super(class1, s);
    }

    public final Object get(Object obj)
    {
        return ((ClippingImageView)obj).a;
    }

    public final void set(Object obj, Object obj1)
    {
        ((ClippingImageView)obj).a((Rect)obj1);
    }
}
