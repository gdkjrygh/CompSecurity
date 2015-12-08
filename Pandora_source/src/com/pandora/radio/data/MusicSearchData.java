// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package com.pandora.radio.data:
//            ArtistSearchData, SongSearchData, GenreStationSearchData, SearchDescriptor

public class MusicSearchData
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public MusicSearchData a(Parcel parcel)
        {
            return new MusicSearchData(parcel);
        }

        public MusicSearchData[] a(int i)
        {
            return new MusicSearchData[i];
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
    private final ArtistSearchData a[];
    private final SongSearchData b[];
    private final GenreStationSearchData c[];
    private final String d;
    private final SearchDescriptor e;
    private t.a f;

    public MusicSearchData(Parcel parcel)
    {
        a = (ArtistSearchData[])parcel.createTypedArray(ArtistSearchData.CREATOR);
        b = (SongSearchData[])parcel.createTypedArray(SongSearchData.CREATOR);
        c = (GenreStationSearchData[])parcel.createTypedArray(GenreStationSearchData.CREATOR);
        try
        {
            f = t.a.valueOf(parcel.readString());
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            f = null;
        }
        d = parcel.readString();
        e = (SearchDescriptor)parcel.readParcelable(com/pandora/radio/data/SearchDescriptor.getClassLoader());
    }

    public MusicSearchData(ArtistSearchData aartistsearchdata[], SongSearchData asongsearchdata[], GenreStationSearchData agenrestationsearchdata[], SearchDescriptor searchdescriptor)
    {
        this(aartistsearchdata, asongsearchdata, agenrestationsearchdata, null, t.a.g, searchdescriptor);
    }

    public MusicSearchData(ArtistSearchData aartistsearchdata[], SongSearchData asongsearchdata[], GenreStationSearchData agenrestationsearchdata[], String s, t.a a1, SearchDescriptor searchdescriptor)
    {
        if (searchdescriptor == null)
        {
            throw new IllegalArgumentException("searchDescriptor cannot be null");
        } else
        {
            d = s;
            a = aartistsearchdata;
            b = asongsearchdata;
            c = agenrestationsearchdata;
            f = a1;
            e = searchdescriptor;
            return;
        }
    }

    public ArtistSearchData[] a()
    {
        return a;
    }

    public SongSearchData[] b()
    {
        return b;
    }

    public GenreStationSearchData[] c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public SearchDescriptor e()
    {
        return e;
    }

    public String f()
    {
        Object obj;
        int i;
        int l;
        int j1;
        l = 0;
        j1 = 0;
        i = 0;
        obj = "";
        static class _cls2
        {

            static final int a[];

            static 
            {
                a = new int[t.a.values().length];
                try
                {
                    a[t.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[t.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[t.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls2.a[f.ordinal()];
        JVM INSTR tableswitch 1 3: default 48
    //                   1 50
    //                   2 103
    //                   3 160;
           goto _L1 _L2 _L3 _L4
_L1:
        return ((String) (obj));
_L2:
        ArtistSearchData aartistsearchdata[] = a;
        l = aartistsearchdata.length;
        Object obj1 = obj;
        do
        {
            obj = obj1;
            if (i >= l)
            {
                continue;
            }
            obj = aartistsearchdata[i];
            if (((ArtistSearchData) (obj)).a().equals(d))
            {
                obj1 = ((ArtistSearchData) (obj)).b();
            }
            i++;
        } while (true);
_L3:
        SongSearchData asongsearchdata[] = b;
        j1 = asongsearchdata.length;
        int j = l;
        Object obj2 = obj;
        do
        {
            obj = obj2;
            if (j >= j1)
            {
                continue;
            }
            obj = asongsearchdata[j];
            if (((SongSearchData) (obj)).a().equals(d))
            {
                obj2 = ((SongSearchData) (obj)).toString();
            }
            j++;
        } while (true);
_L4:
        GenreStationSearchData agenrestationsearchdata[] = c;
        int i1 = agenrestationsearchdata.length;
        int k = j1;
        Object obj3 = obj;
        do
        {
            obj = obj3;
            if (k >= i1)
            {
                continue;
            }
            obj = agenrestationsearchdata[k];
            if (((GenreStationSearchData) (obj)).a().equals(d))
            {
                obj3 = ((GenreStationSearchData) (obj)).b();
            }
            k++;
        } while (true);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public int g()
    {
        int k = 0;
        int i;
        int j;
        if (a != null)
        {
            i = a.length;
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.length;
        } else
        {
            j = 0;
        }
        if (c != null)
        {
            k = c.length;
        }
        return j + (0 + i) + k;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeTypedArray(a, 0);
        parcel.writeTypedArray(b, 0);
        parcel.writeTypedArray(c, 0);
        String s;
        if (f == null)
        {
            s = "";
        } else
        {
            s = f.name();
        }
        parcel.writeString(s);
        parcel.writeString(d);
        parcel.writeParcelable(e, 0);
    }

}
