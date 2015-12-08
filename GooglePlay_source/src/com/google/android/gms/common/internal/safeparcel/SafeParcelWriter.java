// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public final class SafeParcelWriter
{

    public static int beginVariableData(Parcel parcel, int i)
    {
        parcel.writeInt(0xffff0000 | i);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void finishVariableData(Parcel parcel, int i)
    {
        int j = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(j - i);
        parcel.setDataPosition(j);
    }

    public static void writeBoolean(Parcel parcel, int i, boolean flag)
    {
        writeHeader(parcel, i, 4);
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }

    public static void writeBundle(Parcel parcel, int i, Bundle bundle, boolean flag)
    {
        if (bundle == null)
        {
            if (flag)
            {
                writeHeader(parcel, i, 0);
            }
            return;
        } else
        {
            i = beginVariableData(parcel, i);
            parcel.writeBundle(bundle);
            finishVariableData(parcel, i);
            return;
        }
    }

    public static void writeByte(Parcel parcel, int i, byte byte0)
    {
        writeHeader(parcel, i, 4);
        parcel.writeInt(byte0);
    }

    public static void writeByteArray(Parcel parcel, int i, byte abyte0[], boolean flag)
    {
        if (abyte0 == null)
        {
            if (flag)
            {
                writeHeader(parcel, i, 0);
            }
            return;
        } else
        {
            i = beginVariableData(parcel, i);
            parcel.writeByteArray(abyte0);
            finishVariableData(parcel, i);
            return;
        }
    }

    public static void writeDouble(Parcel parcel, int i, double d)
    {
        writeHeader(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void writeFloat(Parcel parcel, int i, float f)
    {
        writeHeader(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void writeHeader(Parcel parcel, int i, int j)
    {
        if (j >= 65535)
        {
            parcel.writeInt(0xffff0000 | i);
            parcel.writeInt(j);
            return;
        } else
        {
            parcel.writeInt(j << 16 | i);
            return;
        }
    }

    public static void writeIBinder$cdac282(Parcel parcel, int i, IBinder ibinder)
    {
        if (ibinder == null)
        {
            return;
        } else
        {
            i = beginVariableData(parcel, i);
            parcel.writeStrongBinder(ibinder);
            finishVariableData(parcel, i);
            return;
        }
    }

    public static void writeInt(Parcel parcel, int i, int j)
    {
        writeHeader(parcel, i, 4);
        parcel.writeInt(j);
    }

    public static void writeIntArray(Parcel parcel, int i, int ai[], boolean flag)
    {
        if (ai == null)
        {
            if (flag)
            {
                writeHeader(parcel, i, 0);
            }
            return;
        } else
        {
            i = beginVariableData(parcel, i);
            parcel.writeIntArray(ai);
            finishVariableData(parcel, i);
            return;
        }
    }

    public static void writeIntegerList$62107c48(Parcel parcel, int i, List list)
    {
        if (list == null)
        {
            return;
        }
        int j = beginVariableData(parcel, i);
        int k = list.size();
        parcel.writeInt(k);
        for (i = 0; i < k; i++)
        {
            parcel.writeInt(((Integer)list.get(i)).intValue());
        }

        finishVariableData(parcel, j);
    }

    public static void writeIntegerObject$1ed7098(Parcel parcel, int i, Integer integer)
    {
        if (integer == null)
        {
            return;
        } else
        {
            writeHeader(parcel, i, 4);
            parcel.writeInt(integer.intValue());
            return;
        }
    }

    public static void writeLong(Parcel parcel, int i, long l)
    {
        writeHeader(parcel, i, 8);
        parcel.writeLong(l);
    }

    public static void writeLongArray(Parcel parcel, int i, long al[], boolean flag)
    {
        if (al == null)
        {
            if (flag)
            {
                writeHeader(parcel, i, 0);
            }
            return;
        } else
        {
            i = beginVariableData(parcel, i);
            parcel.writeLongArray(al);
            finishVariableData(parcel, i);
            return;
        }
    }

    public static void writeLongObject$53422a(Parcel parcel, int i, Long long1)
    {
        if (long1 == null)
        {
            return;
        } else
        {
            writeHeader(parcel, i, 8);
            parcel.writeLong(long1.longValue());
            return;
        }
    }

    public static void writeParcel(Parcel parcel, int i, Parcel parcel1, boolean flag)
    {
        if (parcel1 == null)
        {
            if (flag)
            {
                writeHeader(parcel, i, 0);
            }
            return;
        } else
        {
            i = beginVariableData(parcel, i);
            parcel.appendFrom(parcel1, 0, parcel1.dataSize());
            finishVariableData(parcel, i);
            return;
        }
    }

    public static void writeParcelList$62107c48(Parcel parcel, int i, List list)
    {
        int j = beginVariableData(parcel, i);
        int k = list.size();
        parcel.writeInt(k);
        i = 0;
        while (i < k) 
        {
            Parcel parcel1 = (Parcel)list.get(i);
            if (parcel1 != null)
            {
                parcel.writeInt(parcel1.dataSize());
                parcel.appendFrom(parcel1, 0, parcel1.dataSize());
            } else
            {
                parcel.writeInt(0);
            }
            i++;
        }
        finishVariableData(parcel, j);
    }

    public static void writeParcelable(Parcel parcel, int i, Parcelable parcelable, int j, boolean flag)
    {
        if (parcelable == null)
        {
            if (flag)
            {
                writeHeader(parcel, i, 0);
            }
            return;
        } else
        {
            i = beginVariableData(parcel, i);
            parcelable.writeToParcel(parcel, j);
            finishVariableData(parcel, i);
            return;
        }
    }

    public static void writeString(Parcel parcel, int i, String s, boolean flag)
    {
        if (s == null)
        {
            if (flag)
            {
                writeHeader(parcel, i, 0);
            }
            return;
        } else
        {
            i = beginVariableData(parcel, i);
            parcel.writeString(s);
            finishVariableData(parcel, i);
            return;
        }
    }

    public static void writeStringArray(Parcel parcel, int i, String as[], boolean flag)
    {
        if (as == null)
        {
            if (flag)
            {
                writeHeader(parcel, i, 0);
            }
            return;
        } else
        {
            i = beginVariableData(parcel, i);
            parcel.writeStringArray(as);
            finishVariableData(parcel, i);
            return;
        }
    }

    public static void writeStringList(Parcel parcel, int i, List list, boolean flag)
    {
        if (list == null)
        {
            if (flag)
            {
                writeHeader(parcel, i, 0);
            }
            return;
        } else
        {
            i = beginVariableData(parcel, i);
            parcel.writeStringList(list);
            finishVariableData(parcel, i);
            return;
        }
    }

    public static void writeTypedArray$2d7953c6(Parcel parcel, int i, Parcelable aparcelable[], int j)
    {
        if (aparcelable == null)
        {
            return;
        }
        int k = beginVariableData(parcel, i);
        int l = aparcelable.length;
        parcel.writeInt(l);
        i = 0;
        while (i < l) 
        {
            Parcelable parcelable = aparcelable[i];
            if (parcelable == null)
            {
                parcel.writeInt(0);
            } else
            {
                writeTypedItemWithSize(parcel, parcelable, j);
            }
            i++;
        }
        finishVariableData(parcel, k);
    }

    private static void writeTypedItemWithSize(Parcel parcel, Parcelable parcelable, int i)
    {
        int j = parcel.dataPosition();
        parcel.writeInt(1);
        int k = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        i = parcel.dataPosition();
        parcel.setDataPosition(j);
        parcel.writeInt(i - k);
        parcel.setDataPosition(i);
    }

    public static void writeTypedList(Parcel parcel, int i, List list, boolean flag)
    {
        if (list == null)
        {
            if (flag)
            {
                writeHeader(parcel, i, 0);
            }
            return;
        }
        int j = beginVariableData(parcel, i);
        int k = list.size();
        parcel.writeInt(k);
        i = 0;
        while (i < k) 
        {
            Parcelable parcelable = (Parcelable)list.get(i);
            if (parcelable == null)
            {
                parcel.writeInt(0);
            } else
            {
                writeTypedItemWithSize(parcel, parcelable, 0);
            }
            i++;
        }
        finishVariableData(parcel, j);
    }
}
