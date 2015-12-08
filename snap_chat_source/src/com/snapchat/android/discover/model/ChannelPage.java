// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.model;

import Jh;
import SG;
import SY;
import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import ds;
import ep;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import uA;

// Referenced classes of package com.snapchat.android.discover.model:
//            MediaState

public class ChannelPage
    implements Parcelable
{
    public static final class MediaType extends Enum
    {

        private static final MediaType $VALUES[];
        public static final MediaType FILLED_ICON;
        public static final MediaType INTRO_VIDEO;
        public static final MediaType INVERTED_ICON;
        public static final MediaType LOADING_ICON;

        public static MediaType valueOf(String s)
        {
            return (MediaType)Enum.valueOf(com/snapchat/android/discover/model/ChannelPage$MediaType, s);
        }

        public static MediaType[] values()
        {
            return (MediaType[])$VALUES.clone();
        }

        static 
        {
            INTRO_VIDEO = new MediaType("INTRO_VIDEO", 0);
            FILLED_ICON = new MediaType("FILLED_ICON", 1);
            INVERTED_ICON = new MediaType("INVERTED_ICON", 2);
            LOADING_ICON = new MediaType("LOADING_ICON", 3);
            $VALUES = (new MediaType[] {
                INTRO_VIDEO, FILLED_ICON, INVERTED_ICON, LOADING_ICON
            });
        }

        private MediaType(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static final class a
    {

        public MediaState A;
        public MediaState B;
        public SG C;
        public String a;
        public String b;
        public String c;
        public String d;
        public String e;
        int f;
        int g;
        public String h;
        public String i;
        public String j;
        public String k;
        public boolean l;
        public boolean m;
        public int n;
        public int o;
        public int p;
        public String q;
        public int r;
        public String s;
        public String t;
        public String u;
        public String v;
        public String w;
        public Map x;
        public MediaState y;
        public MediaState z;

        private static int a(String s1)
        {
            String s2 = s1;
            if (s1.charAt(0) != '#')
            {
                s2 = (new StringBuilder("#")).append(s1).toString();
            }
            return Color.parseColor(s2);
        }

        public final ChannelPage a()
        {
            if (a == null)
            {
                throw new uA("Cannot build ChannelPage with null publisher name.", "publisher_name");
            }
            if (d == null || d.length() == 0)
            {
                throw new uA((new StringBuilder("Cannot build ChannelPage with primary color: ")).append(d).toString(), "primary_color");
            }
            f = a(d);
            if (e == null || e.length() == 0)
            {
                throw new uA((new StringBuilder("Cannot build ChannelPage with secondary color: ")).append(e).toString(), "secondary_color");
            }
            g = a(e);
            if (h == null)
            {
                throw new uA("Cannot build ChannelPage with null filled icon URL.", "filled_icon");
            }
            if (i == null)
            {
                throw new uA("Cannot build ChannelPage with null inverted icon URL.", "inverted_icon");
            }
            if (k == null)
            {
                throw new uA("Cannot build ChannelPage with null intro video URL.", "intro_video");
            } else
            {
                return new ChannelPage(this, (byte)0);
            }
        }

        public a()
        {
            q = null;
            x = ep.a();
            y = MediaState.NOT_STARTED;
            z = MediaState.NOT_STARTED;
            A = MediaState.NOT_STARTED;
            B = MediaState.NOT_STARTED;
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new ChannelPage(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i1)
        {
            return new ChannelPage[i1];
        }

    };
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final String l;
    public final Map m;
    public final SG n;
    public final Map o;
    public final Map p;
    private final int q;
    private final Map r;

    private ChannelPage(Parcel parcel)
    {
        int i1 = 0;
        super();
        o = new HashMap(4);
        r = new HashMap(4);
        p = new HashMap(4);
        a = parcel.readString();
        b = parcel.readString();
        c = parcel.readString();
        d = parcel.readString();
        q = parcel.readInt();
        e = parcel.readInt();
        g = parcel.readInt();
        h = parcel.readInt();
        i = parcel.readInt();
        MediaType amediatype[];
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        if (parcel.readInt() == 1)
        {
            n = new SG();
            if (parcel.readInt() == 1)
            {
                SY sy = new SY();
                n.a(sy);
                if (parcel.readInt() == 1)
                {
                    sy.a(parcel.readString());
                }
                if (parcel.readInt() == 1)
                {
                    sy.b(parcel.readString());
                }
                if (parcel.readInt() == 1)
                {
                    sy.c(parcel.readString());
                }
                if (parcel.readInt() == 1)
                {
                    sy.d(parcel.readString());
                }
            }
            if (parcel.readInt() == 1)
            {
                n.a(parcel.readString());
            }
            if (parcel.readInt() == 1)
            {
                n.b(parcel.readString());
            }
            if (parcel.readInt() == 1)
            {
                n.c(parcel.readString());
            }
            if (parcel.readInt() == 1)
            {
                n.d(parcel.readString());
            }
            if (parcel.readInt() == 1)
            {
                n.e(parcel.readString());
            }
            if (parcel.readInt() == 1)
            {
                n.a(Integer.valueOf(parcel.readInt()));
            }
        } else
        {
            n = null;
        }
        l = parcel.readString();
        m = Jh.a(parcel.readString());
        f = parcel.readInt();
        amediatype = MediaType.values();
        for (int j1 = amediatype.length; i1 < j1; i1++)
        {
            MediaType mediatype = amediatype[i1];
            p.put(mediatype, parcel.readString());
            r.put(mediatype, parcel.readString());
            o.put(mediatype, MediaState.valueOf(parcel.readString()));
        }

    }

    ChannelPage(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    private ChannelPage(a a1)
    {
        o = new HashMap(4);
        r = new HashMap(4);
        p = new HashMap(4);
        a = a1.a;
        if (a1.b == null)
        {
            b = a1.a;
        } else
        {
            b = a1.b;
        }
        if (a1.c == null)
        {
            c = a1.a;
        } else
        {
            c = a1.c;
        }
        g = a1.f;
        h = a1.g;
        q = a1.n;
        e = a1.o;
        d = a1.q;
        i = a1.r;
        j = a1.l;
        k = a1.m;
        p.put(MediaType.INTRO_VIDEO, a1.k);
        p.put(MediaType.FILLED_ICON, a1.h);
        p.put(MediaType.INVERTED_ICON, a1.i);
        p.put(MediaType.LOADING_ICON, a1.j);
        r.put(MediaType.INTRO_VIDEO, a1.s);
        r.put(MediaType.FILLED_ICON, a1.t);
        r.put(MediaType.INVERTED_ICON, a1.u);
        r.put(MediaType.LOADING_ICON, a1.v);
        o.put(MediaType.INTRO_VIDEO, a1.y);
        o.put(MediaType.FILLED_ICON, a1.z);
        o.put(MediaType.INVERTED_ICON, a1.A);
        l = a1.w;
        m = (Map)ds.a(a1.x, ep.a());
        n = a1.C;
        if (TextUtils.isEmpty(a1.j))
        {
            o.put(MediaType.LOADING_ICON, MediaState.SUCCESS);
        } else
        {
            o.put(MediaType.LOADING_ICON, a1.B);
        }
        f = a1.p;
    }

    ChannelPage(a a1, byte byte0)
    {
        this(a1);
    }

    public final String a()
    {
        return (String)p.get(MediaType.FILLED_ICON);
    }

    public final String a(MediaType mediatype)
    {
        return (String)p.get(mediatype);
    }

    public final String b()
    {
        return (String)p.get(MediaType.INVERTED_ICON);
    }

    public final String c()
    {
        return (String)p.get(MediaType.LOADING_ICON);
    }

    public final String d()
    {
        return (String)p.get(MediaType.INTRO_VIDEO);
    }

    public int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return k() == MediaState.SUCCESS && h() != null;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ChannelPage))
            {
                return false;
            }
            obj = (ChannelPage)obj;
            boolean flag;
            if (n == null)
            {
                if (((ChannelPage) (obj)).n == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = n.equals(((ChannelPage) (obj)).n);
            }
            if (!TextUtils.equals(a, ((ChannelPage) (obj)).a) || !TextUtils.equals(b, ((ChannelPage) (obj)).b) || !TextUtils.equals(c, ((ChannelPage) (obj)).c) || !TextUtils.equals(d, ((ChannelPage) (obj)).d) || q != ((ChannelPage) (obj)).q || e != ((ChannelPage) (obj)).e || f != ((ChannelPage) (obj)).f || g != ((ChannelPage) (obj)).g || h != ((ChannelPage) (obj)).h || i != ((ChannelPage) (obj)).i || j != ((ChannelPage) (obj)).j || k != ((ChannelPage) (obj)).k || !TextUtils.equals(l, ((ChannelPage) (obj)).l) || !m.equals(((ChannelPage) (obj)).m) || !o.equals(((ChannelPage) (obj)).o) || !r.equals(((ChannelPage) (obj)).r) || !p.equals(((ChannelPage) (obj)).p) || !flag)
            {
                return false;
            }
        }
        return true;
    }

    public final boolean f()
    {
        boolean flag;
        if (n() == MediaState.SUCCESS)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && e())
        {
            if (l() == MediaState.SUCCESS && i() != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                if (m() == MediaState.SUCCESS)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public final String g()
    {
        return (String)r.get(MediaType.INTRO_VIDEO);
    }

    public final String h()
    {
        return (String)r.get(MediaType.FILLED_ICON);
    }

    public int hashCode()
    {
        return Arrays.hashCode(new Object[] {
            a, b, c, d, Integer.valueOf(q), Integer.valueOf(e), Integer.valueOf(f), Integer.valueOf(g), Integer.valueOf(h), Integer.valueOf(i), 
            Boolean.valueOf(j), Boolean.valueOf(k), l, m, o, r, p
        });
    }

    public final String i()
    {
        return (String)r.get(MediaType.INVERTED_ICON);
    }

    public final String j()
    {
        return (String)r.get(MediaType.LOADING_ICON);
    }

    public final MediaState k()
    {
        return (MediaState)o.get(MediaType.FILLED_ICON);
    }

    public final MediaState l()
    {
        return (MediaState)o.get(MediaType.INVERTED_ICON);
    }

    public final MediaState m()
    {
        return (MediaState)o.get(MediaType.LOADING_ICON);
    }

    public final MediaState n()
    {
        return (MediaState)o.get(MediaType.INTRO_VIDEO);
    }

    public final String o()
    {
        return Integer.toString(d().hashCode());
    }

    public String toString()
    {
        return (new StringBuilder("Channel-")).append(a).toString();
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = false;
        parcel.writeString(a);
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeInt(q);
        parcel.writeInt(e);
        parcel.writeInt(g);
        parcel.writeInt(h);
        parcel.writeInt(i);
        if (j)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (k)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (n != null)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (n != null)
        {
            if (n.b())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
            if (n.b())
            {
                SY sy = n.a();
                MediaType amediatype[];
                MediaType mediatype;
                int j1;
                if (sy.b())
                {
                    parcel.writeInt(1);
                    parcel.writeString(sy.a());
                } else
                {
                    parcel.writeInt(0);
                }
                if (sy.d())
                {
                    parcel.writeInt(1);
                    parcel.writeString(sy.c());
                } else
                {
                    parcel.writeInt(0);
                }
                if (sy.f())
                {
                    parcel.writeInt(1);
                    parcel.writeString(sy.e());
                } else
                {
                    parcel.writeInt(0);
                }
                if (sy.h())
                {
                    parcel.writeInt(1);
                    parcel.writeString(sy.g());
                } else
                {
                    parcel.writeInt(0);
                }
            }
            if (n.d())
            {
                parcel.writeInt(1);
                parcel.writeString(n.c());
            } else
            {
                parcel.writeInt(0);
            }
            if (n.g())
            {
                parcel.writeInt(1);
                parcel.writeString(n.e());
            } else
            {
                parcel.writeInt(0);
            }
            if (n.i())
            {
                parcel.writeInt(1);
                parcel.writeString(n.h());
            } else
            {
                parcel.writeInt(0);
            }
            if (n.k())
            {
                parcel.writeInt(1);
                parcel.writeString(n.j());
            } else
            {
                parcel.writeInt(0);
            }
            if (n.m())
            {
                parcel.writeInt(1);
                parcel.writeString(n.l());
            } else
            {
                parcel.writeInt(0);
            }
            if (n.s())
            {
                parcel.writeInt(1);
                parcel.writeInt(n.r().intValue());
            } else
            {
                parcel.writeInt(0);
            }
        }
        parcel.writeString(l);
        parcel.writeString(Jh.a(m));
        parcel.writeInt(f);
        amediatype = MediaType.values();
        j1 = amediatype.length;
        for (i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
        {
            mediatype = amediatype[i1];
            parcel.writeString((String)p.get(mediatype));
            parcel.writeString((String)r.get(mediatype));
            parcel.writeString(((MediaState)o.get(mediatype)).name());
        }

    }

}
