// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ipc.annotation;

import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// Referenced classes of package com.facebook.ipc.annotation:
//            a

public class b
{

    public b()
    {
    }

    public static Parcelable a(Parcel parcel, Class class1)
    {
        int i = parcel.dataPosition();
        int j = parcel.readInt();
        Object obj;
        int k;
        try
        {
            obj = class1.getDeclaredConstructor(new Class[] {
                android/os/Parcel
            });
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new BadParcelableException(parcel);
        }
        ((Constructor) (obj)).setAccessible(true);
        try
        {
            obj = (Parcelable)((Constructor) (obj)).newInstance(new Object[] {
                parcel
            });
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new BadParcelableException(parcel);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new BadParcelableException(parcel);
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new BadParcelableException(parcel);
        }
        k = parcel.dataPosition();
        if (k > i + j)
        {
            throw new BadParcelableException((new StringBuilder()).append(class1.getName()).append(" constructor read too far in Parcel, Parcel corrupted.").toString());
        }
        if (k < i + j)
        {
            parcel.setDataPosition(i + j);
        }
        return ((Parcelable) (obj));
    }

    public static void a(Parcel parcel, int i, a a1)
    {
        int j = parcel.dataPosition();
        parcel.writeInt(0);
        a1.a(parcel, i);
        i = parcel.dataPosition();
        parcel.setDataPosition(j);
        parcel.writeInt(i - j);
        parcel.setDataPosition(i);
    }
}
