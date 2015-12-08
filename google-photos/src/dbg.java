// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;
import com.google.android.apps.moviemaker.ui.ThemeItemView;

public final class dbg extends Property
{

    public dbg(Class class1, String s)
    {
        super(class1, s);
    }

    public final Object get(Object obj)
    {
        return Float.valueOf(((ThemeItemView)obj).d);
    }

    public final void set(Object obj, Object obj1)
    {
        ((ThemeItemView)obj).b(((Float)obj1).floatValue());
    }
}
