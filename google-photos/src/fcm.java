// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.UUID;

public class fcm
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new fcn();
    public final int a;
    public final String b;
    fcy c;
    public int d;
    public long e;
    public boolean f;
    public boolean g;
    public fbn h;

    private fcm(int i, String s)
    {
        c = fcy.a;
        a = i;
        b = s;
    }

    fcm(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        c = fcy.a;
        a = parcel.readInt();
        b = parcel.readString();
        c = fcy.a(parcel.readInt());
        d = parcel.readInt();
        e = parcel.readLong();
        boolean flag;
        if (parcel.readByte() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        f = flag;
        if (parcel.readByte() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        g = flag;
        h = (fbn)parcel.readSerializable();
    }

    static fcm a(int i, Cursor cursor)
    {
        int j;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        boolean flag1;
        flag1 = true;
        j = cursor.getColumnIndexOrThrow("batch_id");
        k = cursor.getColumnIndexOrThrow("size_bytes");
        l = cursor.getColumnIndexOrThrow("threshold");
        i1 = cursor.getColumnIndexOrThrow("is_dismissed");
        j1 = cursor.getColumnIndexOrThrow("is_read");
        k1 = cursor.getColumnIndexOrThrow("has_original_bytes");
        boolean flag = cursor.moveToNext();
        if (!flag)
        {
            cursor.close();
            return null;
        }
        String s;
        fcm fcm1;
        s = cursor.getString(j);
        fcm1 = new fcm(i, s);
        fcm1.c = fcy.a(cursor.getInt(l));
        Exception exception;
        if (cursor.getInt(i1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fcm1.f = flag;
        if (cursor.getInt(j1) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        fcm1.g = flag;
_L2:
        fcm1.d = fcm1.d + 1;
        fcm1.e = fcm1.e + (long)cursor.getInt(k);
        fbn fbn1 = fbn.a(fco.a(cursor.getInt(k1)));
        fcm1.h = fbn.a(fcm1.h, fbn1);
        if (!s.equals(cursor.getString(j)))
        {
            throw new IllegalStateException("multiple batches exist in the device_mgmt_batch table!");
        }
          goto _L1
        exception;
        cursor.close();
        throw exception;
_L1:
        flag = cursor.moveToNext();
        if (!flag)
        {
            cursor.close();
            return fcm1;
        }
          goto _L2
    }

    public static fcm a(int i, fcy fcy1)
    {
        fcm fcm1 = new fcm(i, UUID.randomUUID().toString());
        fcm1.c = fcy1;
        return fcm1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (!(obj instanceof fcm))
        {
            break MISSING_BLOCK_LABEL_127;
        }
        obj = (fcm)obj;
        if (!b.equals(((fcm) (obj)).b) || !c.equals(((fcm) (obj)).c) || a != ((fcm) (obj)).a || d != ((fcm) (obj)).d || e != ((fcm) (obj)).e || f != ((fcm) (obj)).f || g != ((fcm) (obj)).g || h != null) goto _L2; else goto _L1
_L1:
        if (((fcm) (obj)).h != null) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (h == ((fcm) (obj)).h) goto _L3; else goto _L5
_L5:
        return false;
        return false;
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            Integer.valueOf(a), b, c, Integer.valueOf(d), Long.valueOf(e), Boolean.valueOf(f), Boolean.valueOf(g), h
        });
    }

    public String toString()
    {
        String s = String.valueOf("MediaBatchInfo[batchId: ");
        String s1 = b;
        int i = d;
        long l = e;
        String s2 = String.valueOf(c);
        String s3 = String.valueOf(h);
        return (new StringBuilder(String.valueOf(s).length() + 95 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length())).append(s).append(s1).append(", batchCount: ").append(i).append(", batchBytes: ").append(l).append(", threshold: ").append(s2).append(", batchBackupQuality: ").append(s3).append("]").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        parcel.writeInt(a);
        parcel.writeString(b);
        parcel.writeInt(c.e);
        parcel.writeInt(d);
        parcel.writeLong(e);
        if (f)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        if (g)
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
        parcel.writeSerializable(h);
    }

}
