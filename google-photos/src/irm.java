// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class irm extends android.view.View.BaseSavedState
{

    public static final android.os.Parcelable.Creator CREATOR = new irn();
    boolean a;
    List b;
    private boolean c;
    private long d;

    irm(Parcel parcel)
    {
        boolean flag1 = true;
        super(parcel);
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        a = flag;
        b = a(parcel);
        d = parcel.readLong();
    }

    public irm(Parcelable parcelable)
    {
        super(parcelable);
    }

    public static long a(irm irm1, long l)
    {
        irm1.d = l;
        return l;
    }

    private static List a(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            byte abyte0[] = new byte[parcel.readInt()];
            parcel.readByteArray(abyte0);
            arraylist.add(new irx(abyte0));
        }

        return arraylist;
    }

    public static List a(irm irm1)
    {
        return irm1.b;
    }

    public static List a(irm irm1, List list)
    {
        irm1.b = list;
        return list;
    }

    public static boolean a(irm irm1, boolean flag)
    {
        irm1.c = flag;
        return flag;
    }

    public static boolean b(irm irm1)
    {
        return irm1.c;
    }

    public static boolean b(irm irm1, boolean flag)
    {
        irm1.a = flag;
        return flag;
    }

    public static long c(irm irm1)
    {
        return irm1.d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        boolean flag1 = true;
        boolean flag = false;
        super.writeToParcel(parcel, i);
        Object obj;
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (a)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        obj = b;
        if (obj == null)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = ((List) (obj)).size();
        }
        parcel.writeInt(i);
        if (obj != null)
        {
            irx irx1;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); parcel.writeByteArray(irx1.a))
            {
                irx1 = (irx)((Iterator) (obj)).next();
                parcel.writeInt(irx1.a.length);
            }

        }
        parcel.writeLong(d);
    }

}
