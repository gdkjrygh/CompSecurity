// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import android.os.Parcel;
import android.os.Parcelable;
import com.fitbit.data.bl.Blob;
import com.fitbit.e.a;

// Referenced classes of package com.fitbit.data.domain.device:
//            FirmwareVersion

public class FirmwareImage
    implements Parcelable
{
    public static final class DeviceMode extends Enum
    {

        private static final DeviceMode $VALUES[];
        public static final DeviceMode APP;
        public static final DeviceMode BSL;

        public static DeviceMode valueOf(String s)
        {
            return (DeviceMode)Enum.valueOf(com/fitbit/data/domain/device/FirmwareImage$DeviceMode, s);
        }

        public static DeviceMode[] values()
        {
            return (DeviceMode[])$VALUES.clone();
        }

        static 
        {
            APP = new DeviceMode("APP", 0);
            BSL = new DeviceMode("BSL", 1);
            $VALUES = (new DeviceMode[] {
                APP, BSL
            });
        }

        private DeviceMode(String s, int i)
        {
            super(s, i);
        }
    }

    public static final class TypeOfData extends Enum
    {

        private static final TypeOfData $VALUES[];
        public static final TypeOfData MEGA;
        public static final TypeOfData MICRO;
        public static final TypeOfData MICROV2;

        public static TypeOfData valueOf(String s)
        {
            return (TypeOfData)Enum.valueOf(com/fitbit/data/domain/device/FirmwareImage$TypeOfData, s);
        }

        public static TypeOfData[] values()
        {
            return (TypeOfData[])$VALUES.clone();
        }

        static 
        {
            MICRO = new TypeOfData("MICRO", 0);
            MICROV2 = new TypeOfData("MICROV2", 1);
            MEGA = new TypeOfData("MEGA", 2);
            $VALUES = (new TypeOfData[] {
                MICRO, MICROV2, MEGA
            });
        }

        private TypeOfData(String s, int i)
        {
            super(s, i);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final TypeOfData a;
    private final FirmwareVersion b;
    private final Blob c;
    private final DeviceMode d;

    public FirmwareImage(DeviceMode devicemode, FirmwareVersion firmwareversion, TypeOfData typeofdata, Blob blob)
    {
        c = blob;
        d = devicemode;
        b = firmwareversion;
        a = typeofdata;
        com.fitbit.e.a.a("FirmwareImage", String.format("mode=%s, version=%s, typeOfData=%s, size=%s", new Object[] {
            devicemode, firmwareversion, a, Integer.valueOf(blob.a().length)
        }), new Object[0]);
    }

    public FirmwareImage(DeviceMode devicemode, FirmwareVersion firmwareversion, TypeOfData typeofdata, byte abyte0[])
    {
        this(devicemode, firmwareversion, typeofdata, new Blob(abyte0));
    }

    public TypeOfData a()
    {
        return a;
    }

    public FirmwareVersion b()
    {
        return b;
    }

    public byte[] c()
    {
        return c.a();
    }

    public DeviceMode d()
    {
        return d;
    }

    public int describeContents()
    {
        return 1;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeByte((byte)a.ordinal());
        int j;
        if (d != null)
        {
            j = d.ordinal();
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
    }


    /* member class not found */
    class _cls1 {}

}
