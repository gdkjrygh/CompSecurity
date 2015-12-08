// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public class ao extends RuntimeException
{

    public ao()
    {
    }

    public ao(ell ell, Class class1)
    {
        ell = String.valueOf(ell);
        class1 = String.valueOf(class1);
        super((new StringBuilder(String.valueOf(ell).length() + 49 + String.valueOf(class1).length())).append(ell).append(" returned null while building required feature:  ").append(class1).toString());
    }

    public ao(Class class1)
    {
        class1 = String.valueOf(class1);
        this((new StringBuilder(String.valueOf(class1).length() + 50)).append("Failed to find result encoder for resource class: ").append(class1).toString());
    }

    public ao(Class class1, Class class2)
    {
        class1 = String.valueOf(class1);
        class2 = String.valueOf(class2);
        this((new StringBuilder(String.valueOf(class1).length() + 54 + String.valueOf(class2).length())).append("Failed to find any ModelLoaders for model: ").append(class1).append(" and data: ").append(class2).toString());
    }

    public ao(Object obj)
    {
        obj = String.valueOf(obj);
        this((new StringBuilder(String.valueOf(obj).length() + 43)).append("Failed to find any ModelLoaders for model: ").append(((String) (obj))).toString());
    }

    public ao(String s)
    {
        super(s);
    }

    public ao(String s, Parcel parcel)
    {
        super((new StringBuilder()).append(s).append(" Parcel: pos=").append(parcel.dataPosition()).append(" size=").append(parcel.dataSize()).toString());
    }

    public ao(String s, Exception exception)
    {
        super(s, exception);
    }
}
