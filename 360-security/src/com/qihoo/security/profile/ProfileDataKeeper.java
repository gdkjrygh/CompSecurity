// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.c.b;
import android.util.SparseArray;
import java.io.File;
import java.io.FileOutputStream;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.qihoo.security.profile:
//            f

class ProfileDataKeeper
{
    static final class Sample
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public Sample a(Parcel parcel)
            {
                return new Sample(parcel);
            }

            public Sample[] a(int i)
            {
                return new Sample[i];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i)
            {
                return a(i);
            }

        };
        long a;
        long b;
        int c;
        String d;
        SparseArray e;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeLong(a);
            parcel.writeLong(b);
            parcel.writeInt(c);
            String s;
            int j;
            if (d == null)
            {
                s = "";
            } else
            {
                s = d;
            }
            parcel.writeString(s);
            j = e.size();
            parcel.writeInt(j);
            for (i = 0; i < j; i++)
            {
                parcel.writeInt(e.keyAt(i));
                String s1 = (String)e.valueAt(i);
                s = s1;
                if (s1 == null)
                {
                    s = "";
                }
                parcel.writeString(s);
            }

        }


        Sample()
        {
            e = new SparseArray();
        }

        Sample(Parcel parcel)
        {
            e = new SparseArray();
            a = parcel.readLong();
            b = parcel.readLong();
            c = parcel.readInt();
            d = parcel.readString();
            int j = parcel.readInt();
            for (int i = 0; i < j; i++)
            {
                e.put(parcel.readInt(), parcel.readString());
            }

        }
    }


    Handler a;
    File b;
    List c;
    final f d;

    ProfileDataKeeper(Looper looper, File file, f f1)
    {
        d = f1;
        a = new Handler(looper);
        b = file;
        c = a(b);
    }

    static final List a(File file)
    {
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_45;
        }
        byte abyte0[] = (new b(file)).c();
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        file = a(file, parcel);
        return file;
        file;
        return new LinkedList();
    }

    private static List a(File file, Parcel parcel)
    {
        LinkedList linkedlist = new LinkedList();
        if (parcel.readInt() != 1)
        {
            file.delete();
        } else
        {
            int j = parcel.readInt();
            int i = 0;
            while (i < j) 
            {
                linkedlist.add(Sample.CREATOR.createFromParcel(parcel));
                i++;
            }
        }
        return linkedlist;
    }

    static void a(File file, List list)
    {
        Object obj = null;
        Parcel parcel;
        int j;
        parcel = Parcel.obtain();
        parcel.writeInt(1);
        j = list.size();
        parcel.writeInt(j);
        int i = 0;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        ((Sample)list.get(i)).writeToParcel(parcel, 0);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        byte abyte0[];
        abyte0 = parcel.marshall();
        if (file.exists())
        {
            file.delete();
        }
        file = new b(file);
        list = file.a();
        list.write(abyte0);
        file.a(list);
        parcel.recycle();
_L8:
        return;
        file;
        file = null;
        list = obj;
_L6:
        if (list != null && file != null)
        {
            list.b(file);
            return;
        }
          goto _L3
        list;
        Object obj1 = null;
        list = file;
        file = obj1;
          goto _L4
        Exception exception;
        exception;
        File file1 = file;
        file = list;
        list = file1;
_L4:
        if (true) goto _L6; else goto _L5
_L5:
_L3:
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void c()
    {
        if (c.size() > d.d())
        {
            c.remove(0);
        }
    }

    List a()
    {
        return c;
    }

    void a(Sample sample)
    {
        c.add(sample);
        c();
    }

    void b()
    {
        for (int i = d.d(); c.size() > i; c.remove(0)) { }
        a(b, c);
    }
}
