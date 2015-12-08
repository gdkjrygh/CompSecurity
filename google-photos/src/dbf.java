// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Property;
import com.google.android.apps.moviemaker.ui.ThemeItemView;

public final class dbf extends Property
{

    public dbf(Class class1, String s)
    {
        super(class1, s);
    }

    public final Object get(Object obj)
    {
        return Float.valueOf(((ThemeItemView)obj).c);
    }

    public final void set(Object obj, Object obj1)
    {
        ((ThemeItemView)obj).a(((Float)obj1).floatValue());
    }
}
