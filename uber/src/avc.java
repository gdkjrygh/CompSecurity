// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IBinder;
import android.os.Parcel;

final class avc
    implements ava
{

    private IBinder a;

    avc(IBinder ibinder)
    {
        a = ibinder;
    }

    public final void a(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 1;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (!flag)
        {
            k = 0;
        }
        parcel.writeInt(k);
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

    public final boolean a()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        a.transact(9, parcel, parcel1, 0);
        parcel1.readException();
        k = parcel1.readInt();
        if (k != 0)
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

    public final IBinder asBinder()
    {
        return a;
    }

    public final void b(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (flag)
        {
            k = 1;
        }
        parcel.writeInt(k);
        a.transact(2, parcel, parcel1, 0);
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

    public final boolean b()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        a.transact(10, parcel, parcel1, 0);
        parcel1.readException();
        k = parcel1.readInt();
        if (k != 0)
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

    public final void c(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (flag)
        {
            k = 1;
        }
        parcel.writeInt(k);
        a.transact(3, parcel, parcel1, 0);
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

    public final boolean c()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        a.transact(11, parcel, parcel1, 0);
        parcel1.readException();
        k = parcel1.readInt();
        if (k != 0)
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

    public final void d(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (flag)
        {
            k = 1;
        }
        parcel.writeInt(k);
        a.transact(4, parcel, parcel1, 0);
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

    public final boolean d()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        a.transact(12, parcel, parcel1, 0);
        parcel1.readException();
        k = parcel1.readInt();
        if (k != 0)
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

    public final void e(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (flag)
        {
            k = 1;
        }
        parcel.writeInt(k);
        a.transact(5, parcel, parcel1, 0);
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

    public final boolean e()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        a.transact(13, parcel, parcel1, 0);
        parcel1.readException();
        k = parcel1.readInt();
        if (k != 0)
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

    public final void f(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (flag)
        {
            k = 1;
        }
        parcel.writeInt(k);
        a.transact(6, parcel, parcel1, 0);
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

    public final boolean f()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        a.transact(14, parcel, parcel1, 0);
        parcel1.readException();
        k = parcel1.readInt();
        if (k != 0)
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

    public final void g(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (flag)
        {
            k = 1;
        }
        parcel.writeInt(k);
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

    public final boolean g()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        a.transact(15, parcel, parcel1, 0);
        parcel1.readException();
        k = parcel1.readInt();
        if (k != 0)
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

    public final void h(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (flag)
        {
            k = 1;
        }
        parcel.writeInt(k);
        a.transact(8, parcel, parcel1, 0);
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

    public final boolean h()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        a.transact(17, parcel, parcel1, 0);
        parcel1.readException();
        k = parcel1.readInt();
        if (k != 0)
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

    public final void i(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (flag)
        {
            k = 1;
        }
        parcel.writeInt(k);
        a.transact(16, parcel, parcel1, 0);
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

    public final boolean i()
    {
        Parcel parcel;
        Parcel parcel1;
        boolean flag;
        flag = false;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        int k;
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        a.transact(19, parcel, parcel1, 0);
        parcel1.readException();
        k = parcel1.readInt();
        if (k != 0)
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

    public final void j(boolean flag)
    {
        Parcel parcel;
        Parcel parcel1;
        int k;
        k = 0;
        parcel = Parcel.obtain();
        parcel1 = Parcel.obtain();
        parcel.writeInterfaceToken("com.google.android.gms.maps.internal.IUiSettingsDelegate");
        if (flag)
        {
            k = 1;
        }
        parcel.writeInt(k);
        a.transact(18, parcel, parcel1, 0);
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
}
