// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.push;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import com.pandora.android.util.s;
import com.pandora.android.util.t;

public final class PushNotification
    implements Parcelable
{
    public static class a
    {

        private final String a;
        private String b;
        private CharSequence c;
        private CharSequence d;
        private CharSequence e;
        private CharSequence f;
        private CharSequence g;
        private Uri h;
        private Uri i;
        private b j;

        public a a(Uri uri)
        {
            h = uri;
            return this;
        }

        public a a(b b1)
        {
            j = b1;
            return this;
        }

        public a a(String s1)
        {
            b = s1;
            return this;
        }

        public PushNotification a()
        {
            return new PushNotification(a, b, c, d, e, f, g, h, i, j);
        }

        public a b(Uri uri)
        {
            i = uri;
            return this;
        }

        public a b(String s1)
        {
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                s1 = Html.fromHtml(s1);
            }
            c = s1;
            return this;
        }

        public a c(String s1)
        {
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                s1 = Html.fromHtml(s1);
            }
            d = s1;
            return this;
        }

        public a d(String s1)
        {
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                s1 = Html.fromHtml(s1);
            }
            e = s1;
            return this;
        }

        public a e(String s1)
        {
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                s1 = Html.fromHtml(s1);
            }
            f = s1;
            return this;
        }

        public a f(String s1)
        {
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                s1 = Html.fromHtml(s1);
            }
            g = s1;
            return this;
        }

        public a g(String s1)
        {
            if (s1 == null)
            {
                s1 = null;
            } else
            {
                s1 = Uri.parse(s1);
            }
            return a(s1);
        }

        public a h(String s1)
        {
            if (s.a(s1))
            {
                s1 = null;
            } else
            {
                s1 = Uri.parse(s1);
            }
            return b(s1);
        }

        public a(String s1)
        {
            j = b.d;
            a = s1;
        }
    }

    public static final class b extends Enum
    {

        public static final b a;
        public static final b b;
        public static final b c;
        public static final b d;
        private static final b e[];

        public static b valueOf(String s)
        {
            return (b)Enum.valueOf(com/pandora/android/push/PushNotification$b, s);
        }

        public static b[] values()
        {
            return (b[])e.clone();
        }

        static 
        {
            a = new b("PANDORA", 0);
            b = new b("LISTENER", 1);
            c = new b("ARTIST", 2);
            d = new b("UNKNOWN", 3);
            e = (new b[] {
                a, b, c, d
            });
        }

        private b(String s, int k)
        {
            super(s, k);
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public PushNotification a(Parcel parcel)
        {
            return new PushNotification(parcel);
        }

        public PushNotification[] a(int k)
        {
            return new PushNotification[k];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int k)
        {
            return a(k);
        }

    };
    public final String a;
    public final String b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final Uri h;
    public final Uri i;
    public final b j;

    protected PushNotification(Parcel parcel)
    {
        a = t.a(parcel);
        b = t.a(parcel);
        c = t.b(parcel);
        d = t.b(parcel);
        e = t.b(parcel);
        f = t.b(parcel);
        g = t.b(parcel);
        h = (Uri)t.c(parcel);
        i = (Uri)t.c(parcel);
        j = (b)t.a(parcel, com/pandora/android/push/PushNotification$b);
    }

    protected PushNotification(String s, String s1, CharSequence charsequence, CharSequence charsequence1, CharSequence charsequence2, CharSequence charsequence3, CharSequence charsequence4, 
            Uri uri, Uri uri1, b b1)
    {
        a = s;
        b = s1;
        c = charsequence;
        d = charsequence1;
        e = charsequence2;
        f = charsequence3;
        g = charsequence4;
        h = uri;
        i = uri1;
        j = b1;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (PushNotification)obj;
        if (i == null)
        {
            if (((PushNotification) (obj)).i != null)
            {
                return false;
            }
        } else
        if (!i.equals(((PushNotification) (obj)).i))
        {
            return false;
        }
        if (j != ((PushNotification) (obj)).j)
        {
            return false;
        }
        if (a == null)
        {
            if (((PushNotification) (obj)).a != null)
            {
                return false;
            }
        } else
        if (!a.equals(((PushNotification) (obj)).a))
        {
            return false;
        }
        if (h == null)
        {
            if (((PushNotification) (obj)).h != null)
            {
                return false;
            }
        } else
        if (!h.equals(((PushNotification) (obj)).h))
        {
            return false;
        }
        if (b == null)
        {
            if (((PushNotification) (obj)).b != null)
            {
                return false;
            }
        } else
        if (!b.equals(((PushNotification) (obj)).b))
        {
            return false;
        }
        if (g == null)
        {
            if (((PushNotification) (obj)).g != null)
            {
                return false;
            }
        } else
        if (!g.equals(((PushNotification) (obj)).g))
        {
            return false;
        }
        if (d == null)
        {
            if (((PushNotification) (obj)).d != null)
            {
                return false;
            }
        } else
        if (!d.equals(((PushNotification) (obj)).d))
        {
            return false;
        }
        if (f == null)
        {
            if (((PushNotification) (obj)).f != null)
            {
                return false;
            }
        } else
        if (!f.equals(((PushNotification) (obj)).f))
        {
            return false;
        }
        if (e == null)
        {
            if (((PushNotification) (obj)).e != null)
            {
                return false;
            }
        } else
        if (!e.equals(((PushNotification) (obj)).e))
        {
            return false;
        }
        if (c != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((PushNotification) (obj)).c == null) goto _L1; else goto _L3
_L3:
        return false;
        if (c.equals(((PushNotification) (obj)).c)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public int hashCode()
    {
        int l2 = 0;
        int k;
        int l;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (i == null)
        {
            k = 0;
        } else
        {
            k = i.hashCode();
        }
        if (j == null)
        {
            l = 0;
        } else
        {
            l = j.hashCode();
        }
        if (a == null)
        {
            i1 = 0;
        } else
        {
            i1 = a.hashCode();
        }
        if (h == null)
        {
            j1 = 0;
        } else
        {
            j1 = h.hashCode();
        }
        if (b == null)
        {
            k1 = 0;
        } else
        {
            k1 = b.hashCode();
        }
        if (g == null)
        {
            l1 = 0;
        } else
        {
            l1 = g.hashCode();
        }
        if (d == null)
        {
            i2 = 0;
        } else
        {
            i2 = d.hashCode();
        }
        if (f == null)
        {
            j2 = 0;
        } else
        {
            j2 = f.hashCode();
        }
        if (e == null)
        {
            k2 = 0;
        } else
        {
            k2 = e.hashCode();
        }
        if (c != null)
        {
            l2 = c.hashCode();
        }
        return (k2 + (j2 + (i2 + (l1 + (k1 + (j1 + (i1 + (l + (k + 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + l2;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        t.a(parcel, a);
        t.a(parcel, b);
        t.a(parcel, c, k);
        t.a(parcel, d, k);
        t.a(parcel, e, k);
        t.a(parcel, f, k);
        t.a(parcel, g, k);
        t.a(parcel, h, k);
        t.a(parcel, i, k);
        t.a(parcel, j);
    }

}
