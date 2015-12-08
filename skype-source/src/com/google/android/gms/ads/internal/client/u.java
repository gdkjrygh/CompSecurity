// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.b.c;
import com.google.android.gms.internal.bi;
import com.google.android.gms.internal.en;
import com.google.android.gms.internal.er;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            AdSizeParcel, p, q, w, 
//            x, AdRequestParcel, i, k

public interface u
    extends IInterface
{
    public static abstract class a extends Binder
        implements u
    {

        public static u a(IBinder ibinder)
        {
            if (ibinder == null)
            {
                return null;
            }
            IInterface iinterface = ibinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
            if (iinterface != null && (iinterface instanceof u))
            {
                return (u)iinterface;
            } else
            {
                return new a(ibinder);
            }
        }

        public IBinder asBinder()
        {
            return this;
        }

        public boolean onTransact(int i1, Parcel parcel, Parcel parcel1, int j1)
            throws RemoteException
        {
            boolean flag2 = false;
            boolean flag1 = false;
            boolean flag = false;
            Object obj5 = null;
            c c1 = null;
            Object obj6 = null;
            Object obj3 = null;
            Object obj4 = null;
            Object obj = null;
            switch (i1)
            {
            default:
                return super.onTransact(i1, parcel, parcel1, j1);

            case 1598968902: 
                parcel1.writeString("com.google.android.gms.ads.internal.client.IAdManager");
                return true;

            case 1: // '\001'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                c1 = a();
                parcel1.writeNoException();
                parcel = obj;
                if (c1 != null)
                {
                    parcel = c1.asBinder();
                }
                parcel1.writeStrongBinder(parcel);
                return true;

            case 2: // '\002'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                b();
                parcel1.writeNoException();
                return true;

            case 3: // '\003'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                flag2 = c();
                parcel1.writeNoException();
                if (flag2)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                parcel1.writeInt(i1);
                return true;

            case 4: // '\004'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                Object obj1 = obj5;
                if (parcel.readInt() != 0)
                {
                    obj1 = AdRequestParcel.CREATOR;
                    obj1 = com.google.android.gms.ads.internal.client.i.a(parcel);
                }
                flag2 = a(((AdRequestParcel) (obj1)));
                parcel1.writeNoException();
                i1 = ((flag) ? 1 : 0);
                if (flag2)
                {
                    i1 = 1;
                }
                parcel1.writeInt(i1);
                return true;

            case 5: // '\005'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                d();
                parcel1.writeNoException();
                return true;

            case 6: // '\006'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                f();
                parcel1.writeNoException();
                return true;

            case 7: // '\007'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                a(q.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 8: // '\b'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = c1;
                } else
                {
                    IInterface iinterface = parcel.queryLocalInterface("com.google.android.gms.ads.internal.client.IAppEventListener");
                    if (iinterface != null && (iinterface instanceof w))
                    {
                        parcel = (w)iinterface;
                    } else
                    {
                        parcel = new w.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 9: // '\t'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                g();
                parcel1.writeNoException();
                return true;

            case 10: // '\n'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                h();
                parcel1.writeNoException();
                return true;

            case 11: // '\013'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                i();
                parcel1.writeNoException();
                return true;

            case 12: // '\f'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                parcel = j();
                parcel1.writeNoException();
                if (parcel != null)
                {
                    parcel1.writeInt(1);
                    parcel.writeToParcel(parcel1, 1);
                    return true;
                } else
                {
                    parcel1.writeInt(0);
                    return true;
                }

            case 13: // '\r'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                Object obj2 = obj6;
                if (parcel.readInt() != 0)
                {
                    obj2 = AdSizeParcel.CREATOR;
                    obj2 = com.google.android.gms.ads.internal.client.k.a(parcel);
                }
                a(((AdSizeParcel) (obj2)));
                parcel1.writeNoException();
                return true;

            case 14: // '\016'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                a(com.google.android.gms.internal.en.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 15: // '\017'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                a(com.google.android.gms.internal.er.a.a(parcel.readStrongBinder()), parcel.readString());
                parcel1.writeNoException();
                return true;

            case 18: // '\022'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                parcel = k();
                parcel1.writeNoException();
                parcel1.writeString(parcel);
                return true;

            case 19: // '\023'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                a(com.google.android.gms.internal.bi.a.a(parcel.readStrongBinder()));
                parcel1.writeNoException();
                return true;

            case 20: // '\024'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj3;
                } else
                {
                    IInterface iinterface1 = parcel.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdClickListener");
                    if (iinterface1 != null && (iinterface1 instanceof p))
                    {
                        parcel = (p)iinterface1;
                    } else
                    {
                        parcel = new p.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 21: // '\025'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                parcel = parcel.readStrongBinder();
                if (parcel == null)
                {
                    parcel = obj4;
                } else
                {
                    IInterface iinterface2 = parcel.queryLocalInterface("com.google.android.gms.ads.internal.client.ICorrelationIdProvider");
                    if (iinterface2 != null && (iinterface2 instanceof x))
                    {
                        parcel = (x)iinterface2;
                    } else
                    {
                        parcel = new x.a.a(parcel);
                    }
                }
                a(parcel);
                parcel1.writeNoException();
                return true;

            case 22: // '\026'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                if (parcel.readInt() != 0)
                {
                    flag2 = true;
                }
                a(flag2);
                parcel1.writeNoException();
                return true;

            case 23: // '\027'
                parcel.enforceInterface("com.google.android.gms.ads.internal.client.IAdManager");
                flag2 = l();
                parcel1.writeNoException();
                i1 = ((flag1) ? 1 : 0);
                break;
            }
            if (flag2)
            {
                i1 = 1;
            }
            parcel1.writeInt(i1);
            return true;
        }

        public a()
        {
            attachInterface(this, "com.google.android.gms.ads.internal.client.IAdManager");
        }
    }

    private static final class a.a
        implements u
    {

        private IBinder a;

        public final c a()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            c c1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            a.transact(1, parcel, parcel1, 0);
            parcel1.readException();
            c1 = com.google.android.gms.b.c.a.a(parcel1.readStrongBinder());
            parcel1.recycle();
            parcel.recycle();
            return c1;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final void a(AdSizeParcel adsizeparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (adsizeparcel == null)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeInt(1);
            adsizeparcel.writeToParcel(parcel, 0);
_L1:
            a.transact(13, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            parcel.writeInt(0);
              goto _L1
            adsizeparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adsizeparcel;
        }

        public final void a(p p1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (p1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            p1 = p1.asBinder();
_L1:
            parcel.writeStrongBinder(p1);
            a.transact(20, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            p1 = null;
              goto _L1
            p1;
            parcel1.recycle();
            parcel.recycle();
            throw p1;
        }

        public final void a(q q1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (q1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            q1 = q1.asBinder();
_L1:
            parcel.writeStrongBinder(q1);
            a.transact(7, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            q1 = null;
              goto _L1
            q1;
            parcel1.recycle();
            parcel.recycle();
            throw q1;
        }

        public final void a(w w1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (w1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            w1 = w1.asBinder();
_L1:
            parcel.writeStrongBinder(w1);
            a.transact(8, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            w1 = null;
              goto _L1
            w1;
            parcel1.recycle();
            parcel.recycle();
            throw w1;
        }

        public final void a(x x1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (x1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            x1 = x1.asBinder();
_L1:
            parcel.writeStrongBinder(x1);
            a.transact(21, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            x1 = null;
              goto _L1
            x1;
            parcel1.recycle();
            parcel.recycle();
            throw x1;
        }

        public final void a(bi bi1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (bi1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            bi1 = bi1.asBinder();
_L1:
            parcel.writeStrongBinder(bi1);
            a.transact(19, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            bi1 = null;
              goto _L1
            bi1;
            parcel1.recycle();
            parcel.recycle();
            throw bi1;
        }

        public final void a(en en1)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (en1 == null)
            {
                break MISSING_BLOCK_LABEL_58;
            }
            en1 = en1.asBinder();
_L1:
            parcel.writeStrongBinder(en1);
            a.transact(14, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            en1 = null;
              goto _L1
            en1;
            parcel1.recycle();
            parcel.recycle();
            throw en1;
        }

        public final void a(er er1, String s)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (er1 == null)
            {
                break MISSING_BLOCK_LABEL_67;
            }
            er1 = er1.asBinder();
_L1:
            parcel.writeStrongBinder(er1);
            parcel.writeString(s);
            a.transact(15, parcel, parcel1, 0);
            parcel1.readException();
            parcel1.recycle();
            parcel.recycle();
            return;
            er1 = null;
              goto _L1
            er1;
            parcel1.recycle();
            parcel.recycle();
            throw er1;
        }

        public final void a(boolean flag)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            int i1;
            i1 = 0;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (flag)
            {
                i1 = 1;
            }
            parcel.writeInt(i1);
            a.transact(22, parcel, parcel1, 0);
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

        public final boolean a(AdRequestParcel adrequestparcel)
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = true;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            if (adrequestparcel == null)
            {
                break MISSING_BLOCK_LABEL_72;
            }
            parcel.writeInt(1);
            adrequestparcel.writeToParcel(parcel, 0);
_L1:
            int i1;
            a.transact(4, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 == 0)
            {
                flag = false;
            }
            parcel1.recycle();
            parcel.recycle();
            return flag;
            parcel.writeInt(0);
              goto _L1
            adrequestparcel;
            parcel1.recycle();
            parcel.recycle();
            throw adrequestparcel;
        }

        public final IBinder asBinder()
        {
            return a;
        }

        public final void b()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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

        public final boolean c()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            a.transact(3, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        public final void d()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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

        public final void f()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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

        public final void g()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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

        public final void h()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            a.transact(10, parcel, parcel1, 0);
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

        public final void i()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
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

        public final AdSizeParcel j()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            a.transact(12, parcel, parcel1, 0);
            parcel1.readException();
            if (parcel1.readInt() == 0) goto _L2; else goto _L1
_L1:
            Object obj;
            obj = AdSizeParcel.CREATOR;
            obj = com.google.android.gms.ads.internal.client.k.a(parcel1);
_L4:
            parcel1.recycle();
            parcel.recycle();
            return ((AdSizeParcel) (obj));
_L2:
            obj = null;
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final String k()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            String s;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            a.transact(18, parcel, parcel1, 0);
            parcel1.readException();
            s = parcel1.readString();
            parcel1.recycle();
            parcel.recycle();
            return s;
            Exception exception;
            exception;
            parcel1.recycle();
            parcel.recycle();
            throw exception;
        }

        public final boolean l()
            throws RemoteException
        {
            Parcel parcel;
            Parcel parcel1;
            boolean flag;
            flag = false;
            parcel = Parcel.obtain();
            parcel1 = Parcel.obtain();
            int i1;
            parcel.writeInterfaceToken("com.google.android.gms.ads.internal.client.IAdManager");
            a.transact(23, parcel, parcel1, 0);
            parcel1.readException();
            i1 = parcel1.readInt();
            if (i1 != 0)
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

        a.a(IBinder ibinder)
        {
            a = ibinder;
        }
    }


    public abstract c a()
        throws RemoteException;

    public abstract void a(AdSizeParcel adsizeparcel)
        throws RemoteException;

    public abstract void a(p p)
        throws RemoteException;

    public abstract void a(q q)
        throws RemoteException;

    public abstract void a(w w)
        throws RemoteException;

    public abstract void a(x x)
        throws RemoteException;

    public abstract void a(bi bi)
        throws RemoteException;

    public abstract void a(en en)
        throws RemoteException;

    public abstract void a(er er, String s)
        throws RemoteException;

    public abstract void a(boolean flag)
        throws RemoteException;

    public abstract boolean a(AdRequestParcel adrequestparcel)
        throws RemoteException;

    public abstract void b()
        throws RemoteException;

    public abstract boolean c()
        throws RemoteException;

    public abstract void d()
        throws RemoteException;

    public abstract void f()
        throws RemoteException;

    public abstract void g()
        throws RemoteException;

    public abstract void h()
        throws RemoteException;

    public abstract void i()
        throws RemoteException;

    public abstract AdSizeParcel j()
        throws RemoteException;

    public abstract String k()
        throws RemoteException;

    public abstract boolean l()
        throws RemoteException;
}
