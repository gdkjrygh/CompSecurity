// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.immersion.hapticmediasdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import rrrrrr.rrrcrr;

public class HapticFileInformation
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new rrrcrr();
    public static int b042104210421042104210421 = 0;
    public static int b042104210421042104210421 = 2;
    public static int b042104210421042104210421 = 1;
    public static int b042104210421042104210421 = 81;
    private String a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i[];
    private int j;
    private int k;
    private int l;

    public HapticFileInformation()
    {
        if (((b042104210421042104210421 + b042104210421042104210421()) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = 6;
            b042104210421042104210421 = 23;
        }
        super();
    }

    public HapticFileInformation(Parcel parcel)
    {
        int ai[];
        int i1;
        try
        {
            super();
            a = parcel.readString();
            b = parcel.readInt();
            c = parcel.readInt();
            d = parcel.readInt();
            f = parcel.readInt();
            g = parcel.readInt();
            h = parcel.readInt();
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421())
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = b042104210421042104210421();
        }
        i = new int[h];
        i1 = 0;
_L2:
        try
        {
            if (i1 >= h)
            {
                break; /* Loop/switch isn't completed */
            }
            ai = i;
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw parcel;
        }
        ai[i1] = parcel.readInt();
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        j = parcel.readInt();
        k = parcel.readInt();
        l = parcel.readInt();
        return;
    }

    private HapticFileInformation(Builder builder)
    {
        a = Builder.b042504250425042504250425(builder);
        b = Builder.b042504250425042504250425(builder);
        c = Builder.b042504250425042504250425(builder);
        d = Builder.b042504250425042504250425(builder);
        e = Builder.b042504250425042504250425(builder);
        f = Builder.b042504250425042504250425(builder);
        g = Builder.b042504250425042504250425(builder);
        if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = b042104210421042104210421();
        }
        h = Builder.b042504250425042504250425(builder);
        i = Builder.b042504250425042504250425(builder);
        j = Builder.b042504250425042504250425(builder);
        k = Builder.b042504250425042504250425(builder);
        l = Builder.b042504250425042504250425(builder);
    }

    public HapticFileInformation(Builder builder, rrrcrr rrrcrr1)
    {
        int i1 = b042104210421042104210421;
        switch ((i1 * (b042104210421042104210421 + i1)) % b042104210421042104210421())
        {
        default:
            b042104210421042104210421 = 42;
            b042104210421042104210421 = b042104210421042104210421();
            // fall through

        case 0: // '\0'
            this(builder);
            break;
        }
    }

    public static int b042104210421042104210421()
    {
        return 23;
    }

    public static int b042104210421042104210421()
    {
        return 2;
    }

    public static int b042104210421042104210421()
    {
        return 1;
    }

    public static int b042104210421042104210421()
    {
        return 0;
    }

    public int describeContents()
    {
        int i1 = b042104210421042104210421;
        switch ((i1 * (b042104210421042104210421 + i1)) % b042104210421042104210421)
        {
        default:
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = 72;
            // fall through

        case 0: // '\0'
            return 0;
        }
    }

    public int[] getActuatorArray()
    {
        int ai[] = i;
        if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421() != b042104210421042104210421)
        {
            b042104210421042104210421 = 6;
            b042104210421042104210421 = 63;
        }
        return ai;
    }

    public int getBitsPerSample()
    {
        int i1;
        if (((b042104210421042104210421 + b042104210421042104210421()) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = 66;
        }
        try
        {
            i1 = g;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return i1;
    }

    public int getCompressionScheme()
    {
        if (((b042104210421042104210421 + b042104210421042104210421()) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = 43;
            b042104210421042104210421 = 94;
        }
        return j;
    }

    public int getEncoding()
    {
        int i1;
        if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = 80;
        }
        try
        {
            i1 = e;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return i1;
    }

    public int getFileLength()
    {
        do
        {
        } while (true);
    }

    public String getFilePath()
    {
        if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421() != b042104210421042104210421)
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = b042104210421042104210421();
        }
        String s;
        try
        {
            s = a;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        return s;
    }

    public int getHapticDataLength()
    {
        return k;
    }

    public int getHapticDataStartByteOffset()
    {
        try
        {
            throw new NullPointerException();
        }
        catch (Exception exception)
        {
            b042104210421042104210421 = 82;
        }
        try
        {
            throw new NullPointerException();
        }
        catch (Exception exception1)
        {
            b042104210421042104210421 = b042104210421042104210421();
        }
        do
        {
        } while (true);
    }

    public int getMajorVersion()
    {
        return c;
    }

    public int getMinorVersion()
    {
        if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = b042104210421042104210421();
        }
        return d;
    }

    public int getNumberOfChannels()
    {
        int i1;
        try
        {
            i1 = h;
        }
        catch (Exception exception)
        {
            throw exception;
        }
        if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = 66;
            b042104210421042104210421 = 11;
        }
        return i1;
    }

    public int getSampleHertz()
    {
        int i1 = b042104210421042104210421;
        switch ((i1 * (b042104210421042104210421() + i1)) % b042104210421042104210421)
        {
        default:
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = b042104210421042104210421();
            // fall through

        case 0: // '\0'
            return f;
        }
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        if (((b042104210421042104210421 + b042104210421042104210421()) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = b042104210421042104210421();
            b042104210421042104210421 = 82;
        }
        parcel.writeInt(e);
        parcel.writeInt(f);
        parcel.writeInt(g);
        parcel.writeInt(h);
        for (i1 = 0; i1 < h; i1++)
        {
            parcel.writeInt(i[i1]);
        }

        parcel.writeInt(j);
        parcel.writeInt(k);
        parcel.writeInt(l);
    }

    static 
    {
        if (((b042104210421042104210421() + b042104210421042104210421()) * b042104210421042104210421()) % b042104210421042104210421 != b042104210421042104210421)
        {
            b042104210421042104210421 = 81;
            b042104210421042104210421 = 79;
        }
    }

    private class Builder
    {

        public static int b042104210421042104210421 = 1;
        public static int b042104210421042104210421 = 0;
        public static int b042104210421042104210421 = 66;
        public static int b042104210421042104210421 = 2;
        private String a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i[];
        private int j;
        private int k;
        private int l;

        public static int b042104210421042104210421()
        {
            return 2;
        }

        public static int b042104210421042104210421()
        {
            return 0;
        }

        public static int b042504250425042504250425(Builder builder)
        {
            do
            {
            } while (true);
        }

        public static int b042504250425042504250425(Builder builder)
        {
            if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
            {
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = b042104210421042104210421();
            }
            return builder.d;
        }

        public static int b042504250425042504250425(Builder builder)
        {
            if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
            {
                b042104210421042104210421 = 55;
                b042104210421042104210421 = 19;
            }
            return builder.l;
        }

        public static int b042504250425042504250425(Builder builder)
        {
            do
            {
            } while (true);
        }

        public static int b042504250425042504250425(Builder builder)
        {
            if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421())
            {
                b042104210421042104210421 = 41;
                b042104210421042104210421 = 36;
            }
            int i1;
            try
            {
                i1 = builder.b;
            }
            // Misplaced declaration of an exception variable
            catch (Builder builder)
            {
                throw builder;
            }
            return i1;
        }

        public static int b042504250425042504250425(Builder builder)
        {
            int i1 = builder.j;
            int j1 = b042104210421042104210421;
            switch ((j1 * (b042104210421042104210421() + j1)) % b042104210421042104210421)
            {
            default:
                b042104210421042104210421 = 84;
                b042104210421042104210421 = b042104210421042104210421();
                // fall through

            case 0: // '\0'
                return i1;
            }
        }

        public static int b042104210421042104210421()
        {
            return 61;
        }

        public static int b042104210421042104210421()
        {
            return 1;
        }

        public static int b042504250425042504250425(Builder builder)
        {
            return builder.g;
        }

        public static int b042504250425042504250425(Builder builder)
        {
            if (((b042104210421042104210421() + b042104210421042104210421) * b042104210421042104210421()) % b042104210421042104210421 != b042104210421042104210421)
            {
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = b042104210421042104210421();
            }
            return builder.c;
        }

        public static int b042504250425042504250425(Builder builder)
        {
            int i1;
            if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
            {
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = 13;
            }
            try
            {
                i1 = builder.k;
            }
            // Misplaced declaration of an exception variable
            catch (Builder builder)
            {
                throw builder;
            }
            return i1;
        }

        public static int b042504250425042504250425(Builder builder)
        {
            int i1 = builder.e;
            int j1 = b042104210421042104210421;
            switch ((j1 * (b042104210421042104210421() + j1)) % b042104210421042104210421)
            {
            default:
                b042104210421042104210421 = 76;
                b042104210421042104210421 = 93;
                // fall through

            case 0: // '\0'
                return i1;
            }
        }

        public static String b042504250425042504250425(Builder builder)
        {
            builder = builder.a;
            if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
            {
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = 58;
            }
            return builder;
        }

        public static int[] b042504250425042504250425(Builder builder)
        {
            int i1 = b042104210421042104210421;
            switch ((i1 * (b042104210421042104210421 + i1)) % b042104210421042104210421())
            {
            default:
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = b042104210421042104210421();
                // fall through

            case 0: // '\0'
                return builder.i;
            }
        }

        public HapticFileInformation build()
        {
            if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
            {
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = b042104210421042104210421();
            }
            return new HapticFileInformation(this, null);
        }

        public Builder setActuatorArray(int ai[])
        {
            if (((b042104210421042104210421 + b042104210421042104210421()) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
            {
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = 53;
            }
            i = ai;
            return this;
        }

        public Builder setBitsPerSample(int i1)
        {
            int j1 = b042104210421042104210421;
            switch ((j1 * (b042104210421042104210421() + j1)) % b042104210421042104210421())
            {
            default:
                b042104210421042104210421 = 71;
                b042104210421042104210421 = 41;
                break;

            case 0: // '\0'
                break;
            }
            try
            {
                g = i1;
            }
            catch (Exception exception)
            {
                throw exception;
            }
            return this;
        }

        public Builder setCompressionScheme(int i1)
        {
            if (((b042104210421042104210421 + b042104210421042104210421()) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
            {
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = b042104210421042104210421();
            }
            j = i1;
            return this;
        }

        public Builder setEncoding(int i1)
        {
            if (((b042104210421042104210421() + b042104210421042104210421) * b042104210421042104210421()) % b042104210421042104210421 != b042104210421042104210421)
            {
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = 98;
            }
            e = i1;
            return this;
        }

        public Builder setFilePath(String s)
        {
            try
            {
                a = s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            return this;
        }

        public Builder setHapticDataLength(int i1)
        {
            if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421())
            {
                b042104210421042104210421 = 14;
                b042104210421042104210421 = b042104210421042104210421();
            }
            try
            {
                k = i1;
            }
            catch (Exception exception)
            {
                throw exception;
            }
            return this;
        }

        public Builder setHapticDataStartByteOffset(int i1)
        {
            if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
            {
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = b042104210421042104210421();
            }
            try
            {
                l = i1;
            }
            catch (Exception exception)
            {
                throw exception;
            }
            return this;
        }

        public Builder setMajorVersion(int i1)
        {
            c = i1;
            if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421() != b042104210421042104210421)
            {
                b042104210421042104210421 = 18;
                b042104210421042104210421 = 18;
            }
            return this;
        }

        public Builder setMinorVersion(int i1)
        {
            int j1 = b042104210421042104210421();
            switch ((j1 * (b042104210421042104210421 + j1)) % b042104210421042104210421)
            {
            default:
                b042104210421042104210421 = 41;
                b042104210421042104210421 = b042104210421042104210421();
                // fall through

            case 0: // '\0'
                d = i1;
                break;
            }
            return this;
        }

        public Builder setNumberOfChannels(int i1)
        {
            if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421())
            {
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = 32;
            }
            h = i1;
            return this;
        }

        public Builder setSampleHertz(int i1)
        {
            do
            {
            } while (true);
        }

        public Builder setTotalFileLength(int i1)
        {
            if (((b042104210421042104210421 + b042104210421042104210421) * b042104210421042104210421) % b042104210421042104210421 != b042104210421042104210421)
            {
                b042104210421042104210421 = b042104210421042104210421();
                b042104210421042104210421 = b042104210421042104210421();
            }
            try
            {
                b = i1;
            }
            catch (Exception exception)
            {
                throw exception;
            }
            return this;
        }

        public Builder()
        {
            int i1 = b042104210421042104210421;
            switch ((i1 * (b042104210421042104210421 + i1)) % b042104210421042104210421)
            {
            default:
                b042104210421042104210421 = 47;
                b042104210421042104210421 = 60;
                // fall through

            case 0: // '\0'
                super();
                break;
            }
        }
    }

}
