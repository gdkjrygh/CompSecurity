// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class dkc
    implements glz
{

    private final Context a;

    public dkc(Context context)
    {
        a = context;
    }

    public final gly a(Class class1)
    {
        if (class1.equals(ekp))
        {
            return (gly)olm.a(a, dkb);
        }
        if (class1.equals(glq))
        {
            return new dml(a);
        } else
        {
            class1 = String.valueOf(class1);
            throw new IllegalArgumentException((new StringBuilder(String.valueOf(class1).length() + 21)).append("Cannot handle class: ").append(class1).toString());
        }
    }

    public final Object a()
    {
        return "com.google.android.apps.photos.allphotos.data.AllPhotosCore";
    }
}
