// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.handwriting.base;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.android.libraries.handwriting.base:
//            d, StrokeList, ScoredCandidate

public class RecognitionResult
    implements Parcelable, Iterable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
    public static final RecognitionResult i = new RecognitionResult("");
    public int a;
    public long b;
    public long c;
    public String d;
    public final List e;
    public final List f;
    public int g;
    public int h;
    public StrokeList j;
    private final String k;
    private ExtraInfo l;

    public RecognitionResult()
    {
        this("");
    }

    public RecognitionResult(Parcel parcel)
    {
        d = null;
        l = null;
        g = 0;
        h = 0;
        j = StrokeList.EMPTY;
        k = parcel.readString();
        d = parcel.readString();
        e = new ArrayList();
        parcel.readTypedList(e, ScoredCandidate.CREATOR);
        f = new ArrayList();
        parcel.readTypedList(f, SegmentationInfo.CREATOR);
        if (parcel.readInt() == 1)
        {
            j = new StrokeList(parcel);
        }
    }

    public RecognitionResult(String s)
    {
        this(s, ((List) (new ArrayList())));
    }

    private RecognitionResult(String s, List list)
    {
        this(s, list, ((List) (new ArrayList())));
    }

    private RecognitionResult(String s, List list, List list1)
    {
        d = null;
        l = null;
        g = 0;
        h = 0;
        j = StrokeList.EMPTY;
        k = s;
        e = list;
        f = list1;
    }

    public final int a()
    {
        return e.size();
    }

    public final ScoredCandidate a(int i1)
    {
        return (ScoredCandidate)e.get(i1);
    }

    public final String b()
    {
        if (k == null)
        {
            return "";
        } else
        {
            return k;
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Iterator iterator()
    {
        return e.iterator();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("RequestId: ");
        stringbuilder.append(a);
        stringbuilder.append(" First result: ");
        String s;
        if (!e.isEmpty())
        {
            s = ((ScoredCandidate)e.get(0)).a;
        } else
        {
            s = "EMPTY RESULT";
        }
        stringbuilder.append(s);
        stringbuilder.append(" inkhash: ");
        stringbuilder.append(k);
        stringbuilder.append(" numStrokes: ");
        stringbuilder.append(j.size());
        return stringbuilder.toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(k);
        if (d == null)
        {
            parcel.writeString("");
        } else
        {
            parcel.writeString(d);
        }
        parcel.writeTypedList(e);
        parcel.writeTypedList(f);
        if (j != null && j != StrokeList.EMPTY)
        {
            parcel.writeInt(1);
            j.writeToParcel(parcel, i1);
            return;
        } else
        {
            parcel.writeInt(0);
            return;
        }
    }


    private class SegmentationInfo
        implements Parcelable
    {
        private class Segment
            implements Parcelable
        {
            private class InkRange
                implements Parcelable
            {

                public static final android.os.Parcelable.Creator CREATOR = new e();
                public final int a;
                public final int b;
                public final int c;
                public final int d;

                public int describeContents()
                {
                    return 0;
                }

                public void writeToParcel(Parcel parcel, int i1)
                {
                    parcel.writeInt(a);
                    parcel.writeInt(b);
                    parcel.writeInt(c);
                    parcel.writeInt(d);
                }


                public InkRange(Parcel parcel)
                {
                    a = parcel.readInt();
                    b = parcel.readInt();
                    c = parcel.readInt();
                    d = parcel.readInt();
                }

                public InkRange(int ai[])
                {
                    a = ai[0];
                    b = ai[1];
                    c = ai[2];
                    d = ai[3];
                }
            }


            public static final android.os.Parcelable.Creator CREATOR = new f();
            final String a;
            final InkRange b[];

            public int describeContents()
            {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i1)
            {
                parcel.writeString(a);
                parcel.writeInt(b.length);
                parcel.writeTypedArray(b, 0);
            }


            public Segment(Parcel parcel)
            {
                a = parcel.readString();
                b = new InkRange[parcel.readInt()];
                parcel.readTypedArray(b, InkRange.CREATOR);
            }

            public Segment(String s, int ai[][])
            {
                a = s;
                int j1 = ai.length;
                b = new InkRange[j1];
                for (int i1 = 0; i1 < j1; i1++)
                {
                    b[i1] = new InkRange(ai[i1]);
                }

            }
        }


        public static final android.os.Parcelable.Creator CREATOR = new g();
        final Segment a[];

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeInt(a.length);
            parcel.writeTypedArray(a, 0);
        }


        public SegmentationInfo(Parcel parcel)
        {
            a = new Segment[parcel.readInt()];
            parcel.readTypedArray(a, Segment.CREATOR);
        }

        public SegmentationInfo(String as[], int ai[][][])
        {
            int j1 = as.length;
            a = new Segment[j1];
            for (int i1 = 0; i1 < j1; i1++)
            {
                a[i1] = new Segment(as[i1], ai[i1]);
            }

        }
    }

}
