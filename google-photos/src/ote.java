// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.IOException;
import java.util.Arrays;

public class ote
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new otf();
    public final Uri a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final long f;
    public final long g[];
    public final int h[];

    ote(Uri uri, int i, int j, int k, int l, long l1, 
            long al[], int ai[])
    {
        boolean flag;
        flag = true;
        super();
        a = (Uri)p.a(uri);
        b = i;
        c = j;
        d = k;
        if (l != 0 && l != 90 && l != 180 && l != 270)
        {
            throw new IOException((new StringBuilder(39)).append("Video rotation unsupported: ").append(l).toString());
        }
        e = l;
        f = l1;
        if (al == null || al.length <= 0)
        {
            throw new IOException("Could not parse any frame times from video");
        }
        for (i = 1; i < al.length; i++)
        {
            if (al[i] <= al[i - 1])
            {
                throw new IOException("Frame times are not strictly ascending");
            }
        }

        g = al;
        if (ai == null)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        if (ai.length <= 0) goto _L2; else goto _L1
_L1:
        i = ((flag) ? 1 : 0);
        if (ai[0] >= 0) goto _L3; else goto _L2
_L2:
        throw new IOException("Could not parse sync samples from video");
_L5:
        i++;
_L3:
        if (i >= ai.length)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        j = ai[i];
        if (j <= ai[i - 1])
        {
            throw new IOException("Sync samples are not strictly ascending");
        }
        if (j < al.length) goto _L5; else goto _L4
_L4:
        throw new IOException("Sync sample is not a valid frame");
        h = ai;
        return;
    }

    ote(Parcel parcel)
    {
        a = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readInt();
        e = parcel.readInt();
        f = parcel.readLong();
        g = parcel.createLongArray();
        h = parcel.createIntArray();
    }

    private int b()
    {
        if (h != null)
        {
            return h.length;
        } else
        {
            return g.length;
        }
    }

    private int e(int i)
    {
        int j = i;
        if (i < 0)
        {
            j = i + b();
        }
        i = j;
        if (h != null)
        {
            i = h[j];
        }
        return i;
    }

    private int e(long l)
    {
        int i = a(l);
        if (i == -1)
        {
            return -1;
        } else
        {
            return d(i);
        }
    }

    public final float a()
    {
        float f1;
        int i;
        if (e == 0 || e == 180)
        {
            i = c;
        } else
        {
            i = d;
        }
        f1 = i;
        if (e == 0 || e == 180)
        {
            i = d;
        } else
        {
            i = c;
        }
        return f1 / (float)i;
    }

    public final int a(long l)
    {
        int i;
        if (l < 0L || l >= f)
        {
            i = -1;
        } else
        {
            int j = Arrays.binarySearch(g, l);
            i = j;
            if (j < 0)
            {
                return -j - 2;
            }
        }
        return i;
    }

    public final boolean a(int i)
    {
        p.a(i, g.length);
        return h == null || Arrays.binarySearch(h, i) >= 0;
    }

    public final int b(long l)
    {
        boolean flag = false;
        int i;
        if (l < g[e(0)])
        {
            i = e(0);
        } else
        {
            if (l > g[e(-1)])
            {
                return e(-1);
            }
            int k = e(l);
            if (k != -1)
            {
                flag = true;
            }
            p.b(flag);
            int j = e(k);
            i = j;
            if (k != b() - 1)
            {
                k = e(k + 1);
                i = j;
                if (g[k] - l <= l - g[j])
                {
                    return k;
                }
            }
        }
        return i;
    }

    public final long b(int i)
    {
        p.a(i, g.length);
        return g[i];
    }

    public final int c(int i)
    {
        if (i < 0)
        {
            return -1;
        }
        if (i >= g.length)
        {
            return e(-1);
        } else
        {
            return e(d(i));
        }
    }

    public final int c(long l)
    {
        byte byte0 = -1;
        int i;
        if (l < g[e(0)])
        {
            i = e(0);
        } else
        {
            int j = e(l);
            i = byte0;
            if (j != -1)
            {
                if (g[e(j)] == l)
                {
                    return e(j);
                }
                i = byte0;
                if (j != b() - 1)
                {
                    return e(j + 1);
                }
            }
        }
        return i;
    }

    public int d(int i)
    {
        boolean flag1 = true;
        if (h != null)
        {
            int j = Arrays.binarySearch(h, i);
            i = j;
            if (j < 0)
            {
                i = -j - 2;
                boolean flag;
                if (i >= 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.b(flag);
                if (i < h.length)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                p.b(flag);
                return i;
            }
        }
        return i;
    }

    public final int d(long l)
    {
        int i = -1;
        if (l > g[e(-1)])
        {
            i = e(-1);
        } else
        {
            int j = e(l);
            if (j != -1)
            {
                return e(j);
            }
        }
        return i;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof ote))
        {
            return false;
        } else
        {
            obj = (ote)obj;
            return c.c(a, ((ote) (obj)).a);
        }
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a
        });
    }

    public String toString()
    {
        String s = getClass().getName();
        Object obj = String.valueOf(a);
        String s1 = (new StringBuilder(String.valueOf(obj).length() + 7)).append("source=").append(((String) (obj))).toString();
        int i = b;
        String s2 = (new StringBuilder(27)).append("videoTrackIndex=").append(i).toString();
        i = c;
        String s3 = (new StringBuilder(17)).append("width=").append(i).toString();
        i = d;
        String s4 = (new StringBuilder(18)).append("height=").append(i).toString();
        i = e;
        String s5 = (new StringBuilder(27)).append("rotationDegrees=").append(i).toString();
        long l = f;
        String s6 = (new StringBuilder(31)).append("durationUs=").append(l).toString();
        i = g.length;
        String s7 = (new StringBuilder(30)).append("frameTimesUs count=").append(i).toString();
        if (h != null)
        {
            obj = Integer.valueOf(h.length);
        } else
        {
            obj = "null";
        }
        obj = String.valueOf(obj);
        return c.a(s, new Object[] {
            s1, s2, s3, s4, s5, s6, s7, (new StringBuilder(String.valueOf(obj).length() + 25)).append("syncSamplesIndices count=").append(((String) (obj))).toString()
        });
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, 0);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeLong(f);
        parcel.writeLongArray(g);
        parcel.writeIntArray(h);
    }

}
