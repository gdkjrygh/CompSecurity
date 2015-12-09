// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.maps.model.a;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;
import java.util.List;

// Referenced classes of package com.google.android.gms.maps.model.a:
//            s

class u
    implements s
{

    private IBinder a;

    u(IBinder ibinder)
    {
        a = ibinder;
    }

    public void a()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        a.transact(1, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(float f1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        parcel.writeFloat(f1);
        a.transact(7, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(int l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        parcel.writeInt(l);
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void a(List list)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        parcel.writeTypedList(list);
        a.transact(3, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        list;
        parcel1.recycle();
        parcel.recycle();
        throw list;
    }

    public void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean a(s s1)
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_77;
        }
        s1 = s1.asBinder();
_L1:
        int l;
        parcel.writeStrongBinder(s1);
        a.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readInt();
        if (l != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        s1 = null;
          goto _L1
        s1;
        parcel1.recycle();
        parcel.recycle();
        throw s1;
    }

    public IBinder asBinder()
    {
        return a;
    }

    public String b()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        String s1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        a.transact(2, parcel, parcel1, 0);
        parcel1.readException();
        s1 = parcel1.readString();
        parcel1.recycle();
        parcel.recycle();
        return s1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(float f1)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        parcel.writeFloat(f1);
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(int l)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        parcel.writeInt(l);
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public void b(List list)
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        parcel.writeList(list);
        a.transact(5, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        list;
        parcel1.recycle();
        parcel.recycle();
        throw list;
    }

    public void b(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int l;
        l = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        if (flag)
        {
            l = 1;
        }
        parcel.writeInt(l);
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        parcel1.recycle();
        parcel.recycle();
        return;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public List c()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        java.util.ArrayList arraylist;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        a.transact(4, parcel, parcel1, 0);
        parcel1.readException();
        arraylist = parcel1.createTypedArrayList(LatLng.CREATOR);
        parcel1.recycle();
        parcel.recycle();
        return arraylist;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public List d()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        java.util.ArrayList arraylist;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        a.transact(6, parcel, parcel1, 0);
        parcel1.readException();
        arraylist = parcel1.readArrayList(getClass().getClassLoader());
        parcel1.recycle();
        parcel.recycle();
        return arraylist;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public float e()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        a.transact(8, parcel, parcel1, 0);
        parcel1.readException();
        f1 = parcel1.readFloat();
        parcel1.recycle();
        parcel.recycle();
        return f1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int f()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int l;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return l;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int g()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int l;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return l;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public float h()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        float f1;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        a.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        f1 = parcel1.readFloat();
        parcel1.recycle();
        parcel.recycle();
        return f1;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean i()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int l;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        a.transact(16, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readInt();
        if (l != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public boolean j()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int l;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        a.transact(18, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readInt();
        if (l != 0)
        {
            flag = true;
        }
        parcel1.recycle();
        parcel.recycle();
        return flag;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }

    public int k()
    {
        Parcel parcel;
        Parcel parcel1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int l;
        parcel.writeInterfaceToken("com.google.android.gms.maps.model.internal.IPolygonDelegate");
        a.transact(20, parcel, parcel1, 0);
        parcel1.readException();
        l = parcel1.readInt();
        parcel1.recycle();
        parcel.recycle();
        return l;
        Exception exception;
        exception;
        parcel1.recycle();
        parcel.recycle();
        throw exception;
    }
}
