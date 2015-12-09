// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.pandora.radio.util.i;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p.cx.x;

// Referenced classes of package com.pandora.radio.data:
//            d, ac

public class aa
    implements Serializable
{
    public static class a
    {

        public String a;
        public String b;

        public a()
        {
        }
    }


    private String A;
    private String B;
    private String C;
    private String D;
    private boolean E;
    private String F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private boolean K;
    private boolean L;
    private int M;
    private long N;
    private String O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    protected String a;
    protected String b;
    protected String c;
    protected String d;
    protected String e;
    protected HashMap f;
    protected String g;
    private long h;
    private long i;
    private long j;
    private long k;
    private String l;
    private String m;
    private String n;
    private String o;
    private boolean p;
    private int q;
    private int r;
    private boolean s;
    private String t;
    private String u;
    private String v;
    private String w;
    private String x;
    private String y;
    private String z;

    aa(long l1)
    {
        R = true;
        S = false;
        if (l1 <= 0L)
        {
            throw new UnsupportedOperationException("invalid station id");
        } else
        {
            i = l1;
            N = System.currentTimeMillis();
            k = -1L;
            return;
        }
    }

    aa(long l1, JSONObject jsonobject)
        throws JSONException
    {
        R = true;
        S = false;
        if (l1 <= 0L)
        {
            throw new UnsupportedOperationException("invalid station id");
        }
        h = -1L;
        i = l1;
        j = -1L;
        k = -1L;
        l = jsonobject.optString("stationId", null);
        O = jsonobject.optString("musicId");
        a = jsonobject.getString("songName");
        b = jsonobject.getString("artistName");
        c = jsonobject.getString("albumName");
        String s1;
        if (jsonobject.has("albumArtUrl"))
        {
            s1 = jsonobject.getString("albumArtUrl");
        } else
        if (jsonobject.has("artUrl"))
        {
            s1 = jsonobject.getString("artUrl");
        } else
        {
            s1 = null;
        }
        d = s1;
        n = jsonobject.getString("trackToken");
        o = jsonobject.optString("nowPlayingStationAdUrl", null);
        p = jsonobject.optBoolean("allowFeedback");
        q = jsonobject.optInt("songRating");
        r = jsonobject.optInt("trackLength");
        e = jsonobject.optString("trackGain", null);
        f = p.cx.x.b(jsonobject.optJSONObject("audioUrlMap"));
        g = jsonobject.optString("additionalAudioUrl", null);
        s = false;
        B = jsonobject.optString("amazonSongDigitalAsin", null);
        t = jsonobject.optString("artistExplorerUrl", null);
        v = jsonobject.optString("audioReceiptUrl", null);
        w = jsonobject.optString("audioSkipUrl", null);
        u = jsonobject.optString("songDetailUrl", null);
        x = jsonobject.optString("backstageAdUrl", null);
        y = jsonobject.optString("amazonAlbumUrl", null);
        z = jsonobject.optString("amazonAlbumAsin", null);
        A = jsonobject.optString("amazonAlbumDigitalAsin", null);
        C = jsonobject.optString("socialAdUrl", null);
        E = jsonobject.optBoolean("competitiveSepReq");
        R = jsonobject.optBoolean("measureTimeForMonthlyCap", true);
        G = jsonobject.optBoolean("allowStartStationFromTrack", true);
        H = jsonobject.optBoolean("allowBuyTrack", true);
        I = jsonobject.optBoolean("allowTiredOfTrack", true);
        J = jsonobject.optBoolean("allowBookmarkTrack", true);
        K = jsonobject.optBoolean("allowShareTrack", true);
        L = jsonobject.optBoolean("allowSkipTrackWithoutLimit", false);
        D = jsonobject.optString("shareLandingUrl", null);
        F = jsonobject.optString("songIdentity", null);
        m = jsonobject.optString("artistTwitterHandle", null);
        S = jsonobject.optBoolean("isFeatured", false);
        M = 0;
        N = System.currentTimeMillis();
    }

    public aa(Cursor cursor)
    {
        boolean flag1 = true;
        super();
        R = true;
        S = false;
        h = cursor.getLong(0);
        i = cursor.getLong(1);
        j = cursor.getLong(2);
        l = cursor.getString(33);
        a = cursor.getString(3);
        b = cursor.getString(4);
        c = cursor.getString(5);
        d = cursor.getString(6);
        n = cursor.getString(7);
        o = cursor.getString(9);
        boolean flag;
        if (cursor.getInt(10) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        q = cursor.getInt(11);
        r = cursor.getInt(12);
        e = cursor.getString(13);
        f = a(cursor.getBlob(14));
        if (cursor.getInt(15) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s = flag;
        B = cursor.getString(16);
        t = cursor.getString(17);
        v = cursor.getString(18);
        M = cursor.getInt(19);
        N = cursor.getLong(20);
        u = cursor.getString(21);
        x = cursor.getString(22);
        y = cursor.getString(23);
        z = cursor.getString(24);
        A = cursor.getString(34);
        C = cursor.getString(26);
        D = cursor.getString(36);
        if (cursor.getInt(25) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        E = flag;
        if (cursor.getInt(27) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        R = flag;
        if (cursor.getInt(28) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        G = flag;
        if (cursor.getInt(29) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        H = flag;
        if (cursor.getInt(30) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        I = flag;
        if (cursor.getInt(31) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        J = flag;
        if (cursor.getInt(32) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        K = flag;
        if (cursor.getInt(35) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        L = flag;
        g = cursor.getString(37);
        F = cursor.getString(38);
        k = cursor.getLong(39);
        m = cursor.getString(42);
        if (cursor.getInt(40) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        S = flag;
        w = cursor.getString(41);
        if (i <= 0L)
        {
            throw new UnsupportedOperationException("invalid station id");
        } else
        {
            return;
        }
    }

    public static String a(aa aa1, String s1)
    {
label0:
        {
            if (aa1 != null)
            {
                if (!(aa1 instanceof d))
                {
                    break label0;
                }
                s1 = ((d)aa1).c();
            }
            return s1;
        }
        return aa1.w();
    }

    private static HashMap a(byte abyte0[])
    {
        Object obj = null;
        abyte0 = new ObjectInputStream(new ByteArrayInputStream(abyte0));
        obj = (HashMap)abyte0.readObject();
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[])
            {
                return ((HashMap) (obj));
            }
        }
        return ((HashMap) (obj));
        abyte0;
        abyte0 = null;
_L4:
        if (abyte0 != null)
        {
            try
            {
                abyte0.close();
            }
            // Misplaced declaration of an exception variable
            catch (byte abyte0[]) { }
        }
        return null;
        abyte0;
_L2:
        if (obj != null)
        {
            try
            {
                ((ObjectInputStream) (obj)).close();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj) { }
        }
        throw abyte0;
        Exception exception1;
        exception1;
        obj = abyte0;
        abyte0 = exception1;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean a(aa aa1)
    {
        return aa1 != null && aa1.w() != null && !(aa1 instanceof d);
    }

    private static byte[] a(HashMap hashmap)
    {
        byte abyte0[];
        ByteArrayOutputStream bytearrayoutputstream;
        abyte0 = null;
        bytearrayoutputstream = new ByteArrayOutputStream();
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(bytearrayoutputstream);
        objectoutputstream.writeObject(hashmap);
        hashmap = bytearrayoutputstream.toByteArray();
        abyte0 = hashmap;
        if (objectoutputstream != null)
        {
            try
            {
                objectoutputstream.close();
            }
            catch (IOException ioexception)
            {
                return hashmap;
            }
            abyte0 = hashmap;
        }
        return abyte0;
        hashmap;
        objectoutputstream = null;
_L4:
        if (objectoutputstream != null)
        {
            try
            {
                objectoutputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (HashMap hashmap)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_41;
        }
        hashmap;
        objectoutputstream = null;
_L2:
        if (objectoutputstream != null)
        {
            try
            {
                objectoutputstream.close();
            }
            catch (IOException ioexception1) { }
        }
        throw hashmap;
        hashmap;
        if (true) goto _L2; else goto _L1
_L1:
        hashmap;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public String A()
    {
        return A;
    }

    public boolean B()
    {
        return p;
    }

    public boolean C()
    {
        return L;
    }

    public HashMap D()
    {
        return f;
    }

    public int E()
    {
        return q;
    }

    public String F()
    {
        return e;
    }

    public int G()
    {
        return r;
    }

    public String H()
    {
        return B;
    }

    public String I()
    {
        return t;
    }

    public String J()
    {
        return v;
    }

    public String K()
    {
        return w;
    }

    public String L()
    {
        return D;
    }

    public boolean M()
    {
        return l() == ac.b;
    }

    public long N()
    {
        return N;
    }

    public boolean O()
    {
        return Q;
    }

    public boolean P()
    {
        return P;
    }

    public String Q()
    {
        return u;
    }

    public String R()
    {
        return O;
    }

    public boolean S()
    {
        return R;
    }

    public String T()
    {
        return g;
    }

    public String U()
    {
        return F;
    }

    public String V()
    {
        return m;
    }

    public boolean W()
    {
        return S;
    }

    public boolean X()
    {
        return !com.pandora.radio.util.i.a(m);
    }

    public a a(String s1, String s2, String s3)
    {
        a a1 = new a();
        Object obj = D();
        if (obj == null || ((HashMap) (obj)).isEmpty())
        {
            return null;
        }
        s1 = (HashMap)((HashMap) (obj)).get(s1);
        if (s1 == null)
        {
            s1 = (HashMap)((HashMap) (obj)).values().iterator().next();
        }
        a1.a = (String)s1.get("audioUrl");
        if (com.pandora.radio.util.i.a(a1.a))
        {
            return null;
        }
        a1.b = (String)s1.get("audioToken");
        if (a1.a.endsWith(".mp4"))
        {
            return a1;
        }
        obj = a1.a;
        s1 = s3;
        if (s3 == null)
        {
            s1 = "";
        }
        a1.a = String.format("%s&av=%s&acid=%s", new Object[] {
            obj, s2, s1
        });
        return a1;
    }

    public String a(String s1)
    {
        try
        {
            s1 = Uri.parse(s1).getQueryParameter("token");
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            return "";
        }
        return s1;
    }

    public void a(int i1)
    {
        r = i1;
    }

    public void a(long l1)
    {
        j = l1;
    }

    public void a(boolean flag)
    {
        Q = flag;
    }

    public void b(int i1)
    {
        q = i1;
    }

    public void b(long l1)
    {
        k = l1;
    }

    public void b(boolean flag)
    {
        P = flag;
    }

    public void c(int i1)
    {
        M = i1;
        if (M > 0)
        {
            N = System.currentTimeMillis();
            return;
        } else
        {
            N = 0L;
            return;
        }
    }

    public boolean c(long l1)
    {
        return N() + l1 <= System.currentTimeMillis();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (aa)obj;
            if (b == null ? ((aa) (obj)).b != null : !b.equals(((aa) (obj)).b))
            {
                return false;
            }
            if (a == null ? ((aa) (obj)).a != null : !a.equals(((aa) (obj)).a))
            {
                return false;
            }
            if (n == null ? ((aa) (obj)).n != null : !n.equals(((aa) (obj)).n))
            {
                return false;
            }
        }
        return true;
    }

    public boolean h()
    {
        return K;
    }

    public int hashCode()
    {
        int l1 = 0;
        int i1;
        int j1;
        int k1;
        if (a != null)
        {
            i1 = a.hashCode();
        } else
        {
            i1 = 0;
        }
        if (b != null)
        {
            j1 = b.hashCode();
        } else
        {
            j1 = 0;
        }
        if (c != null)
        {
            k1 = c.hashCode();
        } else
        {
            k1 = 0;
        }
        if (n != null)
        {
            l1 = n.hashCode();
        }
        return (k1 + (j1 + i1 * 31) * 31) * 31 + l1;
    }

    public boolean i()
    {
        return G;
    }

    public boolean j()
    {
        return H;
    }

    public boolean k()
    {
        return !B() && "Pandora".equalsIgnoreCase(t()) && "Pandora".equalsIgnoreCase(u()) && "Explicit Warning".equalsIgnoreCase(s());
    }

    public ac l()
    {
        return ac.a;
    }

    public boolean m()
    {
        return !k();
    }

    public boolean n()
    {
        return I;
    }

    public boolean o()
    {
        return J;
    }

    public ContentValues p()
    {
        boolean flag = true;
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("station_id", Long.valueOf(i));
        contentvalues.put("adData_id", Long.valueOf(j));
        contentvalues.put("stationId", l);
        contentvalues.put("title", a);
        contentvalues.put("creator", b);
        contentvalues.put("album", c);
        contentvalues.put("artUrl", d);
        contentvalues.put("trackToken", n);
        contentvalues.put("audioToken", (String)null);
        contentvalues.put("nowPlayingStationAdUrl", o);
        int i1;
        if (p)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("allowFeedback", Integer.valueOf(i1));
        contentvalues.put("songRating", Integer.valueOf(q));
        contentvalues.put("duration", Integer.valueOf(r));
        contentvalues.put("trackGain", e);
        contentvalues.put("audioUrlMap", a(f));
        if (s)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("adImpressionRegistered", Integer.valueOf(i1));
        contentvalues.put("amazonSongDigitalAsin", B);
        contentvalues.put("artistExplorerUrl", t);
        contentvalues.put("audioReceiptUrl", v);
        contentvalues.put("lastHeardPosition", Integer.valueOf(M));
        contentvalues.put("lastHeardTime", Long.valueOf(N));
        contentvalues.put("songDetailUrl", u);
        contentvalues.put("backstageAdUrl", x);
        contentvalues.put("amazonAlbumUrl", y);
        contentvalues.put("amazonAlbumAsin", z);
        contentvalues.put("amazonAlbumDigitalAsin", A);
        contentvalues.put("socialAdUrl", C);
        contentvalues.put("shareLandingUrl", D);
        if (E)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("competitiveSepIndicator", Integer.valueOf(i1));
        if (R)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("measureTimeForMonthlyCap", Integer.valueOf(i1));
        if (G)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("allowStartStationFromTrack", Integer.valueOf(i1));
        if (H)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("allowBuyTrack", Integer.valueOf(i1));
        if (I)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("allowTiredOfTrack", Integer.valueOf(i1));
        if (J)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("allowBookmarkTrack", Integer.valueOf(i1));
        if (K)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("allowShareTrack", Integer.valueOf(i1));
        if (L)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        contentvalues.put("allowSkipTrackWithoutLimit", Integer.valueOf(i1));
        contentvalues.put("additionalAudioUrl", g);
        contentvalues.put("songIdentity", F);
        contentvalues.put("artistMessage_id", Long.valueOf(k));
        contentvalues.put("artistTwitterHandle", m);
        if (S)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        contentvalues.put("featured", Integer.valueOf(i1));
        contentvalues.put("audioSkipUrl", w);
        return contentvalues;
    }

    public long q()
    {
        return i;
    }

    public String r()
    {
        return l;
    }

    public String s()
    {
        return a;
    }

    public String t()
    {
        return b;
    }

    public String toString()
    {
        return (new StringBuilder()).append("TrackData{title='").append(a).append('\'').append(", creator='").append(b).append('\'').append(", album='").append(c).append('\'').append(", artUrl='").append(d).append('\'').append(", trackToken='").append(n).append('\'').append(", stationId='").append(l).append('\'').append(", nowPlayingStationAdUrl='").append(o).append('\'').append(", allowFeedback=").append(p).append(", songRating=").append(q).append(", trackGain='").append(e).append('\'').append(", duration='").append(r).append('\'').append(", audioUrlMap=").append(f).append(", adImpressionRegistered=").append(s).append(", amazonSongDigitalAsin='").append(B).append('\'').append(", artistExplorerUrl='").append(t).append('\'').append(", audioReceiptUrl='").append(v).append('\'').append(", audioSkipUrl='").append(w).append('\'').append(", artistBookmarked='").append(P).append('\'').append(", trackBookmarked='").append(Q).append('\'').append(", songDetailUrl='").append(u).append('\'').append(", backstageAdUrl='").append(x).append('\'').append(", amazonAlbumUrl='").append(y).append('\'').append(", amazonAlbumAsin='").append(z).append('\'').append(", socialAdUrl='").append(C).append('\'').append(", shareLandingUrl='").append(D).append('\'').append(", competitiveSeparationIndicator='").append(E).append('\'').append(", measureTimeForMonthlyCap=").append(R).append(", allowStartStationFromTrack=").append(G).append(", allowBuyTrack=").append(H).append(", allowTiredOfTrack=").append(I).append(", allowBookmarkTrack=").append(J).append(", allowShareTrack=").append(K).append(", allowSkipTrackWithoutLimit=").append(L).append(", songIdentity=").append(F).append(", artistTwitterHandle=").append(m).append(", isFeatured=").append(S).append('}').toString();
    }

    public String u()
    {
        return c;
    }

    public String v()
    {
        return d;
    }

    public String w()
    {
        return n;
    }

    public String x()
    {
        return o;
    }

    public String y()
    {
        return x;
    }

    public String z()
    {
        return y;
    }
}
