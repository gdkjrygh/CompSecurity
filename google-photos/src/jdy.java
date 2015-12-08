// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import java.io.File;

public class jdy
    implements eks
{

    public static final android.os.Parcelable.Creator CREATOR = new jdz();
    public final jea a;
    public final jea b;
    public final jea c;
    public final jee d;

    jdy(Parcel parcel)
    {
        ClassLoader classloader = jea.getClassLoader();
        a = (jea)parcel.readParcelable(classloader);
        b = (jea)parcel.readParcelable(classloader);
        c = (jea)parcel.readParcelable(classloader);
        d = jee.valueOf(parcel.readString());
    }

    private jdy(jea jea1, jea jea2, jea jea3, jee jee1)
    {
        a = jea1;
        b = jea2;
        c = jea3;
        d = jee1;
    }

    public static jdy a(String s)
    {
        return b((String)p.a(s, "localUriString may not be empty"), null, null);
    }

    public static jdy a(String s, qgg qgg1, jdr jdr1)
    {
        return b((String)p.a(s, "localUriString may not be empty"), (qgg)p.a(qgg1), (jdr)p.a(jdr1));
    }

    public static jdy a(qgg qgg1, jdr jdr1)
    {
        return b(null, (qgg)p.a(qgg1), (jdr)p.a(jdr1));
    }

    private static jee a(jea jea1, Integer integer)
    {
        if (jea1 != null)
        {
            return jee.a;
        }
        if (integer == null)
        {
            return jee.c;
        }
        switch (integer.intValue())
        {
        case 2: // '\002'
        default:
            return jee.c;

        case 3: // '\003'
        case 4: // '\004'
            return jee.a;

        case 1: // '\001'
            return jee.b;
        }
    }

    private static jdy b(String s, qgg qgg1, jdr jdr1)
    {
        jea jea1;
        if (!TextUtils.isEmpty(s))
        {
            jea1 = new jea(Uri.parse(s), null, jec.c);
        } else
        {
            jea1 = null;
        }
        if (qgg1 != null)
        {
            s = qgg1.d.c;
            if (s != null)
            {
                if (((qiw) (s)).d != null && ((qiw) (s)).d.b != null)
                {
                    int j1 = ((qiw) (s)).c;
                    qja aqja[] = ((qiw) (s)).d.b;
                    int k1 = aqja.length;
                    int k = 0;
                    int j = 0;
                    s = null;
                    jea jea2 = null;
                    qgg1 = null;
                    int i = 0;
                    while (i < k1) 
                    {
                        qja qja1 = aqja[i];
                        int l = k;
                        int i1 = j;
                        Object obj = s;
                        jea jea3 = jea2;
                        Object obj1 = qgg1;
                        if (!TextUtils.isEmpty(qja1.c))
                        {
                            l = k;
                            i1 = j;
                            obj = s;
                            jea3 = jea2;
                            obj1 = qgg1;
                            if (olj.a(qja1.a.intValue()))
                            {
                                Uri uri = Uri.parse(qja1.c);
                                obj = jdr1.a(qja1.c);
                                if (obj != null)
                                {
                                    s = ((File) (obj)).getPath();
                                }
                                if (qja1.b.intValue() <= 640)
                                {
                                    l = k;
                                    i1 = j;
                                    obj = s;
                                    jea3 = jea2;
                                    obj1 = qgg1;
                                    if (qja1.b.intValue() > k)
                                    {
                                        l = qja1.b.intValue();
                                        jea3 = new jea(uri, s, jec.b);
                                        obj1 = qgg1;
                                        obj = s;
                                        i1 = j;
                                    }
                                } else
                                {
                                    l = k;
                                    i1 = j;
                                    obj = s;
                                    jea3 = jea2;
                                    obj1 = qgg1;
                                    if (qja1.b.intValue() > j)
                                    {
                                        i1 = qja1.b.intValue();
                                        obj1 = new jea(uri, s, jec.a);
                                        l = k;
                                        obj = s;
                                        jea3 = jea2;
                                    }
                                }
                            }
                        }
                        i++;
                        k = l;
                        j = i1;
                        s = ((String) (obj));
                        jea2 = jea3;
                        qgg1 = ((qgg) (obj1));
                    }
                    return new jdy(jea1, qgg1, jea2, a(jea1, Integer.valueOf(j1)));
                } else
                {
                    return new jdy(jea1, null, null, a(jea1, Integer.valueOf(((qiw) (s)).c)));
                }
            }
        }
        return new jdy(jea1, null, null, a(jea1, ((Integer) (null))));
    }

    public final boolean a()
    {
        return a != null;
    }

    public final boolean b()
    {
        return b != null || c != null;
    }

    public final boolean c()
    {
        return !a();
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        String s = String.valueOf(super.toString());
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        String s3 = String.valueOf(c);
        String s4 = String.valueOf(d);
        return (new StringBuilder(String.valueOf(s).length() + 63 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s).append("{localStream=").append(s1).append(", remoteHdStream=").append(s2).append(", remoteSdStream=").append(s3).append(", remoteStatus=").append(s4).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(a, i);
        parcel.writeParcelable(b, i);
        parcel.writeParcelable(c, i);
        parcel.writeString(d.name());
    }

}
