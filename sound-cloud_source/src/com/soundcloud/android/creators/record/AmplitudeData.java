// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.os.Parcel;
import android.os.Parcelable;
import com.soundcloud.android.utils.IOUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.android.creators.record:
//            SoundRecorder

public class AmplitudeData
    implements Parcelable, Iterable
{

    private static final int AVERAGE_RECORDING_TIME = 180;
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String EXTENSION = "amp";
    private float data[];
    private final int initialCapacity;
    private int pos;

    public AmplitudeData()
    {
        this(SoundRecorder.PIXELS_PER_SECOND * 180);
    }

    public AmplitudeData(int i)
    {
        initialCapacity = i;
        data = new float[i];
    }

    public AmplitudeData(Parcel parcel)
    {
        initialCapacity = parcel.readInt();
        pos = parcel.readInt();
        data = new float[parcel.readInt()];
        parcel.readFloatArray(data);
    }

    public AmplitudeData(float af[])
    {
        int i = af.length;
        pos = i;
        initialCapacity = i;
        data = af;
    }

    private void ensureCapacity(int i)
    {
        if (i > data.length)
        {
            float af[] = new float[Math.max(data.length << 1, i)];
            System.arraycopy(data, 0, af, 0, data.length);
            data = af;
        }
    }

    public static AmplitudeData fromFile(File file)
        throws IOException
    {
        byte abyte0[] = IOUtils.readInputStreamAsBytes(new FileInputStream(file));
        file = Parcel.obtain();
        file.unmarshall(abyte0, 0, abyte0.length);
        file.setDataPosition(0);
        AmplitudeData amplitudedata = new AmplitudeData(file);
        file.recycle();
        return amplitudedata;
    }

    public void add(float f)
    {
        ensureCapacity(pos + 1);
        float af[] = data;
        int i = pos;
        pos = i + 1;
        af[i] = f;
    }

    public transient void add(float af[])
    {
        ensureCapacity(pos + af.length);
        System.arraycopy(af, 0, data, pos, af.length);
        pos = pos + af.length;
    }

    public void clear()
    {
        data = new float[initialCapacity];
        pos = 0;
    }

    public int describeContents()
    {
        return 0;
    }

    public float get(int i)
    {
        if (i >= pos)
        {
            throw new ArrayIndexOutOfBoundsException(i);
        } else
        {
            return data[i];
        }
    }

    public float[] get()
    {
        return data;
    }

    public boolean isEmpty()
    {
        return size() == 0;
    }

    public Iterator iterator()
    {
        return new _cls2();
    }

    public float last()
    {
        if (pos > 0)
        {
            return data[pos - 1];
        } else
        {
            return 0.0F;
        }
    }

    public void set(AmplitudeData amplitudedata)
    {
        data = amplitudedata.get();
        pos = amplitudedata.pos;
    }

    public int size()
    {
        return pos;
    }

    public AmplitudeData slice(int i, int j)
    {
        float af[] = new float[j];
        System.arraycopy(data, i, af, 0, j);
        return new AmplitudeData(af);
    }

    public void store(File file)
        throws IOException
    {
        Object obj = SoundRecorder.TAG;
        (new StringBuilder("writing amplitude data to ")).append(file);
        file = new FileOutputStream(file);
        obj = Parcel.obtain();
        writeToParcel(((Parcel) (obj)), 0);
        file.write(((Parcel) (obj)).marshall());
        file.close();
        ((Parcel) (obj)).recycle();
    }

    public String toString()
    {
        return (new StringBuilder("AmplitudeData{pos=")).append(pos).append(", initialCapacity=").append(initialCapacity).append('}').toString();
    }

    public void truncate(int i)
    {
        if (i > 0)
        {
            float af[] = new float[i];
            System.arraycopy(data, 0, af, 0, i);
            data = af;
            pos = i;
        }
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(initialCapacity);
        parcel.writeInt(pos);
        parcel.writeInt(data.length);
        parcel.writeInt(data.length);
        for (i = 0; i < pos; i++)
        {
            parcel.writeFloat(data[i]);
        }

    }




    private class _cls2
        implements Iterator
    {

        int index;
        final AmplitudeData this$0;

        public boolean hasNext()
        {
            return index < pos;
        }

        public Float next()
        {
            float af[] = data;
            int i = index;
            index = i + 1;
            return Float.valueOf(af[i]);
        }

        public volatile Object next()
        {
            return next();
        }

        public void remove()
        {
            throw new UnsupportedOperationException();
        }

        _cls2()
        {
            this$0 = AmplitudeData.this;
            super();
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final AmplitudeData createFromParcel(Parcel parcel)
        {
            return new AmplitudeData(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final AmplitudeData[] newArray(int i)
        {
            return new AmplitudeData[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
