// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.pandora.radio.util.i;
import java.io.Serializable;
import p.cw.c;
import p.cx.e;

// Referenced classes of package com.pandora.radio.data:
//            af

public class SearchDescriptor
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public SearchDescriptor a(Parcel parcel)
        {
            return new SearchDescriptor(parcel);
        }

        public SearchDescriptor[] a(int j)
        {
            return new SearchDescriptor[j];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int j)
        {
            return a(j);
        }

    };
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final String e;
    public final Bundle f;
    public long g;

    public SearchDescriptor(Parcel parcel)
    {
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        e = parcel.readString();
        f = parcel.readBundle();
        g = parcel.readLong();
    }

    public SearchDescriptor(String s, String s1, String s2, boolean flag, String s3, Bundle bundle)
    {
        a = s;
        b = s1;
        c = s2;
        d = flag;
        e = s3;
        if (bundle == null)
        {
            bundle = new Bundle();
        }
        f = bundle;
        g = System.currentTimeMillis();
    }

    private String f()
    {
        return f.getString("partnerCode");
    }

    private String g()
    {
        if (!i.a(b))
        {
            return b;
        }
        if (!i.a(c))
        {
            return c;
        } else
        {
            return a;
        }
    }

    public String a()
    {
        if (i.a(c) && i.a(b))
        {
            throw new IllegalArgumentException("Error, both songName and artistName are empty. At least one must be non-empty.");
        }
        if (i.a(b))
        {
            return c;
        }
        if (i.a(c))
        {
            return b;
        } else
        {
            return i.a(" by ", new String[] {
                c, b
            });
        }
    }

    public boolean a(c c1)
    {
        if (c()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
label0:
        {
            {
                if (!f.containsKey("timeOut"))
                {
                    break label0;
                }
                long l;
                boolean flag;
                try
                {
                    l = Long.parseLong(f.getString("timeOut"));
                }
                // Misplaced declaration of an exception variable
                catch (c c1)
                {
                    return false;
                }
                l *= 1000L;
            }
            if (System.currentTimeMillis() - g > l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            return flag;
        }
        c1 = c1.m().a();
        if (c1 != null)
        {
            l = c1.z();
            break MISSING_BLOCK_LABEL_40;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public String b()
    {
        return f.getString("confirmationText");
    }

    public boolean c()
    {
        return !i.a(f());
    }

    public boolean d()
    {
        return Boolean.parseBoolean(f.getString("autoCreate"));
    }

    public int describeContents()
    {
        return 0;
    }

    public String e()
    {
        String s;
        byte byte0;
        if (i.a(e))
        {
            return g();
        }
        s = e;
        byte0 = -1;
        s.hashCode();
        JVM INSTR lookupswitch 5: default 76
    //                   -1409097913: 156
    //                   3355: 198
    //                   96748: 142
    //                   3536149: 170
    //                   98240899: 184;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_198;
_L7:
        switch (byte0)
        {
        default:
            throw new IllegalArgumentException((new StringBuilder()).append("getStationName: unknown search type ").append(e).toString());

        case 0: // '\0'
            return a;

        case 1: // '\001'
            return b;

        case 2: // '\002'
            return c;

        case 3: // '\003'
        case 4: // '\004'
            return g();
        }
_L4:
        if (s.equals("any"))
        {
            byte0 = 0;
        }
          goto _L7
_L2:
        if (s.equals("artist"))
        {
            byte0 = 1;
        }
          goto _L7
_L5:
        if (s.equals("song"))
        {
            byte0 = 2;
        }
          goto _L7
_L6:
        if (s.equals("genre"))
        {
            byte0 = 3;
        }
          goto _L7
        if (s.equals("id"))
        {
            byte0 = 4;
        }
          goto _L7
    }

    public void writeToParcel(Parcel parcel, int j)
    {
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        if (d)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        parcel.writeByte((byte)j);
        parcel.writeString(e);
        parcel.writeBundle(f);
        parcel.writeLong(g);
    }

}
