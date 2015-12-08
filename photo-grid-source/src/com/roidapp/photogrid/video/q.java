// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.Context;
import android.os.Handler;
import android.text.format.Time;
import android.util.SparseArray;
import com.google.a.k;
import com.roidapp.baselib.c.c;
import com.roidapp.baselib.d.a;
import com.roidapp.baselib.e.l;
import com.roidapp.photogrid.video.onlinemusic.CloundServer;
import com.roidapp.photogrid.video.onlinemusic.Genre;
import com.roidapp.photogrid.video.onlinemusic.GenrePage;
import com.roidapp.photogrid.video.onlinemusic.LocalServer;
import com.roidapp.photogrid.video.onlinemusic.LocalTrack;
import com.roidapp.photogrid.video.onlinemusic.LocalTrackPageItem;
import com.roidapp.photogrid.video.onlinemusic.Track;
import com.roidapp.photogrid.video.onlinemusic.TrackPageItem;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.roidapp.photogrid.video:
//            aa, r, z, m, 
//            t, c, bi, u, 
//            v, w, o, x, 
//            ac, s, a, ab, 
//            y

public final class q
{

    private Handler A;
    private ArrayList B;
    private boolean C;
    private boolean D;
    private int E;
    private HashMap F;
    private int a;
    private aa b;
    private Context c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private CloundServer i;
    private ArrayList j;
    private ArrayList k;
    private ArrayList l;
    private ArrayList m;
    private ArrayList n;
    private ArrayList o;
    private ac p;
    private LocalServer q;
    private ab r;
    private SparseArray s;
    private SparseArray t;
    private ArrayList u;
    private SparseArray v;
    private ArrayList w;
    private HashMap x;
    private ArrayList y;
    private int z;

    public q(Context context, ac ac1, String s1)
    {
        a = 0;
        b = com.roidapp.photogrid.video.aa.a;
        c = null;
        d = null;
        e = null;
        f = null;
        g = null;
        h = null;
        i = null;
        j = new ArrayList();
        k = new ArrayList();
        l = new ArrayList();
        m = new ArrayList();
        n = new ArrayList();
        o = new ArrayList();
        p = null;
        q = null;
        r = null;
        s = new SparseArray();
        t = new SparseArray();
        u = new ArrayList();
        v = new SparseArray();
        w = new ArrayList();
        x = new HashMap();
        y = new ArrayList();
        z = 0x989680;
        A = new r(this);
        B = new ArrayList();
        C = false;
        D = false;
        E = 0;
        F = new HashMap();
        c = context;
        p = ac1;
        f = s1;
        if (f != null && !f.endsWith("/"))
        {
            f = (new StringBuilder()).append(f).append("/").toString();
        }
    }

    private LocalTrack a(int i1, LocalTrack localtrack)
    {
        if (i().ordinal() >= com.roidapp.photogrid.video.aa.c.ordinal() && i().ordinal() != aa.f.ordinal())
        {
            if (k == null || k.size() == 0)
            {
                return null;
            }
            for (int j1 = 0; j1 < k.size(); j1++)
            {
                z z1 = (z)k.get(j1);
                if (z1.a == i1)
                {
                    ((ArrayList)v.get(z1.b)).set(z1.c, localtrack);
                    return (LocalTrack)((ArrayList)v.get(z1.b)).get(z1.c);
                }
            }

            return null;
        } else
        {
            return null;
        }
    }

    static LocalTrack a(q q1, int i1, LocalTrack localtrack)
    {
        return q1.a(i1, localtrack);
    }

    static String a(String s1)
    {
        return g(s1);
    }

    static HashMap a(q q1)
    {
        return q1.x;
    }

    private void a(int i1, int j1, int k1, Track track)
    {
        int l1;
        int i2;
        l1 = 0;
        i2 = -1;
_L8:
        if (l1 >= track.genre.length) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        int j2;
        j2 = Integer.parseInt(track.genre[l1]);
        if (t.get(j2) == null)
        {
            t.put(j2, new ArrayList());
        }
        arraylist = (ArrayList)t.get(j2);
        if (j1 == j2)
        {
            i2 = l1;
        }
        j2 = 0;
_L7:
        if (j2 >= arraylist.size()) goto _L4; else goto _L3
_L3:
        if (((z)arraylist.get(j2)).a != track.track_id) goto _L6; else goto _L5
_L5:
        return;
_L6:
        j2++;
          goto _L7
_L4:
        arraylist.add(new z(this, track.track_id, i1, k1));
        l1++;
          goto _L8
_L2:
        if (i2 != -1 || j1 == 0x989680) goto _L5; else goto _L9
_L9:
        if (t.get(j1) == null)
        {
            t.put(j1, new ArrayList());
        }
        ((ArrayList)t.get(j1)).add(new z(this, track.track_id, i1, k1));
        return;
          goto _L7
    }

    private void a(aa aa1)
    {
        synchronized (b)
        {
            b = aa1;
        }
        return;
        aa1;
        aa2;
        JVM INSTR monitorexit ;
        throw aa1;
    }

    private void a(Genre genre)
    {
        if (j.size() <= 0)
        {
            j.add(genre);
            return;
        }
        for (Iterator iterator = j.iterator(); iterator.hasNext();)
        {
            if (((Genre)iterator.next()).genre_id == genre.genre_id)
            {
                return;
            }
        }

        j.add(genre);
    }

    static void a(q q1, aa aa1)
    {
        q1.a(aa1);
    }

    private boolean a(int i1, String s1)
    {
_L16:
        int i2;
        int j2;
        if (l1 == -1)
        {
            return false;
        }
        m1 = (m)w.get(l1);
        if (m1.d)
        {
            return true;
        }
        String s2;
        ArrayList arraylist;
        String s3;
        try
        {
            arraylist = (ArrayList)(new k()).a(s1, (new t(this)).b());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            m1.d = true;
            w.set(l1, m1);
            if (u.size() > m1.a && u.get(m1.a) != null)
            {
                a = a - ((LocalTrackPageItem)u.get(m1.a)).trackPageItem.count;
            }
            return false;
        }
        if (arraylist == null) goto _L2; else goto _L1
_L1:
        if (arraylist.size() > 0) goto _L3; else goto _L2
_L3:
        k1 = 0;
        arraylist1 = new ArrayList();
        i2 = 0;
_L17:
        if (i2 >= arraylist.size()) goto _L5; else goto _L4
_L4:
        track = (Track)arraylist.get(i2);
        if (!a(track)) goto _L7; else goto _L6
_L6:
        s1 = m(track.track_id);
        if (s1 != null) goto _L9; else goto _L8
_L8:
        a(i1, m1.e, k1, track);
        s2 = "";
        j2 = 0;
_L15:
        s1 = s2;
        if (j2 >= o.size()) goto _L11; else goto _L10
_L10:
        s1 = (com.roidapp.photogrid.video.c)o.get(j2);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_600;
        }
        if (!((com.roidapp.photogrid.video.c) (s1)).b.equalsIgnoreCase((new StringBuilder()).append(track.track_title).append("_").append(d(track.mp3_url)).toString()))
        {
            break MISSING_BLOCK_LABEL_600;
        }
        (new StringBuilder("AddCloudTrackInfo music exists:")).append(((com.roidapp.photogrid.video.c) (s1)).a);
        s3 = com.roidapp.photogrid.video.bi.a(((com.roidapp.photogrid.video.c) (s1)).a);
        if (s3 == null) goto _L13; else goto _L12
_L12:
        if (!s3.equalsIgnoreCase(track.file_md5)) goto _L13; else goto _L14
_L14:
        s1 = ((com.roidapp.photogrid.video.c) (s1)).a;
        o.remove(j2);
        m.add(new z(this, track.track_id, i1, k1));
_L11:
        if (v.get(i1) == null)
        {
            v.put(i1, new ArrayList());
        }
        ((ArrayList)v.get(i1)).add(new LocalTrack(track, s1));
        k.add(new z(this, track.track_id, i1, k1));
        arraylist1.add(new LocalTrack(track, s1));
        k1++;
        break; /* Loop/switch isn't completed */
_L13:
        s1 = new File(((com.roidapp.photogrid.video.c) (s1)).a);
        if (s1.exists())
        {
            s1.delete();
        }
        o.remove(j2);
        s1 = s2;
          goto _L11
        j2++;
        if (true) goto _L15; else goto _L7
_L9:
        if (m1.e != 0x989680 || ((z) (s1)).b == i1)
        {
            break MISSING_BLOCK_LABEL_1064;
        }
        LocalTrack localtrack = (LocalTrack)((ArrayList)v.get(((z) (s1)).b)).get(((z) (s1)).c);
        if (v.get(i1) == null)
        {
            v.put(i1, new ArrayList());
        }
        ((ArrayList)v.get(i1)).add(localtrack);
        k.set(((z) (s1)).d, new z(this, track.track_id, i1, k1));
        arraylist1.add(localtrack);
        k1++;
          goto _L7
_L18:
        for (; j2 < track.genre.length && Integer.parseInt(track.genre[j2]) != m1.e; j2++) { }
        if (j2 >= track.genre.length)
        {
            if (t.get(m1.e) == null)
            {
                t.put(m1.e, new ArrayList());
            }
            ((ArrayList)t.get(m1.e)).add(s1);
        }
          goto _L7
_L5:
        if (m1.e == 0x989680 && arraylist1.size() > 0 && com.roidapp.photogrid.video.bi.a((new StringBuilder()).append(g).append(e(m1.b)).toString(), (new k()).a(arraylist1)))
        {
            ((LocalTrackPageItem)u.get(m1.a)).filePath = (new StringBuilder()).append(g).append(e(m1.b)).toString();
            ((LocalTrackPageItem)u.get(m1.a)).localkey = com.roidapp.photogrid.video.bi.a(((LocalTrackPageItem)u.get(m1.a)).filePath);
            m1.b = (new StringBuilder()).append(g).append(e(m1.b)).toString();
        }
        m1.d = true;
        w.set(l1, m1);
        return true;
        if (s1 == null)
        {
            return false;
        }
        m m1;
        ArrayList arraylist1;
        Track track;
        int k1;
        int l1;
        for (int j1 = 0; j1 < w.size(); j1++)
        {
            if (w.get(j1) != null && ((m)w.get(j1)).a == i1)
            {
                l1 = j1;
                break MISSING_BLOCK_LABEL_56;
            }
        }

        l1 = -1;
          goto _L16
_L2:
        return false;
_L7:
        i2++;
          goto _L17
        j2 = 0;
          goto _L18
    }

    private static boolean a(Track track)
    {
        while (track == null || track.track_id == 0 || track.genre == null || track.mp3_url == null) 
        {
            return false;
        }
        return true;
    }

    static boolean a(q q1, int i1)
    {
        return q1.j(i1);
    }

    static boolean a(q q1, int i1, String s1)
    {
        if (s1 != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        int j1 = 0;
_L6:
        if (j1 >= q1.w.size())
        {
            break MISSING_BLOCK_LABEL_125;
        }
        if (q1.w.get(j1) == null || ((m)q1.w.get(j1)).a != i1) goto _L4; else goto _L3
_L3:
        if (j1 == -1) goto _L1; else goto _L5
_L4:
        j1++;
          goto _L6
_L5:
        m m1 = (m)q1.w.get(j1);
        if (m1.d)
        {
            return true;
        }
        if (m1.b.toLowerCase(Locale.ENGLISH).startsWith("http"))
        {
            return q1.a(i1, s1);
        } else
        {
            return q1.b(i1, com.roidapp.photogrid.video.bi.c(s1));
        }
        j1 = -1;
          goto _L3
    }

    static boolean a(q q1, String s1)
    {
        return q1.c(s1);
    }

    static String b(String s1)
    {
        return e(s1);
    }

    static void b(q q1)
    {
        q1.f();
    }

    private boolean b(int i1, String s1)
    {
_L13:
        int k1;
        int i2;
        int j2;
        if (l1 == -1)
        {
            return false;
        }
        m1 = (m)w.get(l1);
        if (m1.d)
        {
            return true;
        }
        LocalTrack localtrack;
        String s2;
        try
        {
            s1 = (ArrayList)(new k()).a(s1, (new u(this)).b());
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            m1.d = true;
            w.set(l1, m1);
            a = a - ((LocalTrackPageItem)u.get(m1.a)).trackPageItem.count;
            return false;
        }
        if (s1 == null) goto _L2; else goto _L1
_L1:
        if (s1.size() > 0) goto _L3; else goto _L2
_L14:
        if (i2 >= s1.size()) goto _L5; else goto _L4
_L4:
        localtrack = (LocalTrack)s1.get(i2);
        if (localtrack == null) goto _L7; else goto _L6
_L6:
        track = localtrack.track;
        if (!a(track)) goto _L7; else goto _L8
_L8:
        obj = m(track.track_id);
        if (obj != null) goto _L10; else goto _L9
_L9:
        a(i1, m1.e, i2, track);
        j2 = 0;
_L12:
        if (j2 >= o.size())
        {
            break MISSING_BLOCK_LABEL_351;
        }
        obj = (com.roidapp.photogrid.video.c)o.get(j2);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_516;
        }
        if (!((com.roidapp.photogrid.video.c) (obj)).b.equalsIgnoreCase((new StringBuilder()).append(track.track_title).append("_").append(d(track.mp3_url)).toString()))
        {
            break MISSING_BLOCK_LABEL_516;
        }
        (new StringBuilder("AddLocalTrackInfo music file exists:")).append(((com.roidapp.photogrid.video.c) (obj)).a);
        s2 = com.roidapp.photogrid.video.bi.a(((com.roidapp.photogrid.video.c) (obj)).a);
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_427;
        }
        if (!s2.equalsIgnoreCase(track.file_md5))
        {
            break MISSING_BLOCK_LABEL_427;
        }
        localtrack.filePath = ((com.roidapp.photogrid.video.c) (obj)).a;
        o.remove(j2);
_L11:
        if (v.get(i1) == null)
        {
            v.put(i1, new ArrayList());
        }
        ((ArrayList)v.get(i1)).add(localtrack);
        k.add(new z(this, track.track_id, i1, k1));
        k1++;
        break; /* Loop/switch isn't completed */
        obj = new File(((com.roidapp.photogrid.video.c) (obj)).a);
        if (((File) (obj)).exists())
        {
            ((File) (obj)).delete();
        }
        o.remove(j2);
          goto _L11
        j2++;
        if (true) goto _L12; else goto _L7
_L10:
        if (m1.e != 0x989680 || ((z) (obj)).b == i1)
        {
            break MISSING_BLOCK_LABEL_800;
        }
        LocalTrack localtrack1 = (LocalTrack)((ArrayList)v.get(((z) (obj)).b)).get(((z) (obj)).c);
        if (v.get(i1) == null)
        {
            v.put(i1, new ArrayList());
        }
        ((ArrayList)v.get(i1)).add(localtrack1);
        k.set(((z) (obj)).d, new z(this, track.track_id, i1, k1));
        k1++;
          goto _L7
_L15:
        for (; j2 < track.genre.length && Integer.parseInt(track.genre[j2]) != m1.e; j2++) { }
        if (j2 >= track.genre.length)
        {
            if (t.get(m1.e) == null)
            {
                t.put(m1.e, new ArrayList());
            }
            ((ArrayList)t.get(m1.e)).add(obj);
        }
          goto _L7
_L5:
        m1.d = true;
        w.set(l1, m1);
        return true;
        if (s1 == null)
        {
            return false;
        }
        m m1;
        Track track;
        Object obj;
        int l1;
        for (int j1 = 0; j1 < w.size(); j1++)
        {
            if (w.get(j1) != null && ((m)w.get(j1)).a == i1)
            {
                l1 = j1;
                break MISSING_BLOCK_LABEL_56;
            }
        }

        l1 = -1;
          goto _L13
_L2:
        return false;
_L3:
        k1 = 0;
        i2 = 0;
          goto _L14
_L7:
        i2++;
          goto _L14
        j2 = 0;
          goto _L15
    }

    static boolean c(q q1)
    {
        return q1.g();
    }

    private boolean c(String s1)
    {
label0:
        {
label1:
            {
                if (s1 == null)
                {
                    return false;
                }
                if (i != null)
                {
                    return true;
                }
                int i1;
                try
                {
                    i = (CloundServer)(new k()).a(s1, com/roidapp/photogrid/video/onlinemusic/CloundServer);
                    if (i == null || i.files == null)
                    {
                        break label1;
                    }
                    i1 = i.files.size();
                }
                // Misplaced declaration of an exception variable
                catch (String s1)
                {
                    s1.printStackTrace();
                    return false;
                }
                if (i1 != 0)
                {
                    break label0;
                }
            }
            return false;
        }
        return true;
    }

    static ac d(q q1)
    {
        return q1.p;
    }

    private static String d(String s1)
    {
        if (s1 == null)
        {
            return null;
        } else
        {
            return e(s1);
        }
    }

    private int e()
    {
label0:
        {
            synchronized (B)
            {
                if (B.size() > 0)
                {
                    break label0;
                }
            }
            return -1;
        }
        int i1 = ((Integer)B.remove(B.size() - 1)).intValue();
        arraylist;
        JVM INSTR monitorexit ;
        return i1;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static aa e(q q1)
    {
        return q1.i();
    }

    private static String e(String s1)
    {
        if (s1 == null)
        {
            return null;
        }
        int i1 = s1.lastIndexOf("/");
        int j1 = s1.lastIndexOf("?");
        if (j1 != -1 && j1 > i1)
        {
            return s1.substring(i1 + 1, j1);
        } else
        {
            return s1.substring(i1 + 1);
        }
    }

    private static long f(String s1)
    {
        int i1;
        int k1;
        if (s1 == null || s1.length() == 0)
        {
            return 0L;
        }
        i1 = 0;
        k1 = -1;
_L11:
        if (i1 >= s1.length()) goto _L2; else goto _L1
_L1:
        if (s1.charAt(i1) >= '0' && s1.charAt(i1) <= '9') goto _L4; else goto _L3
_L3:
        if (s1.charAt(i1) != ' ') goto _L6; else goto _L5
_L5:
        int j1 = k1;
        if (k1 == -1) goto _L7; else goto _L6
_L6:
        if (s1.charAt(i1) != '.') goto _L9; else goto _L8
_L8:
        j1 = k1;
        if (k1 != -1) goto _L7; else goto _L9
_L9:
        if (k1 == -1)
        {
            return 0L;
        }
        j1 = 1;
          goto _L10
_L4:
        j1 = k1;
        if (k1 == -1)
        {
            j1 = i1;
        }
_L7:
        i1++;
        k1 = j1;
          goto _L11
_L10:
        if (i1 != -1) goto _L13; else goto _L12
_L12:
        i1 = s1.length();
_L14:
        return (long)(j1 * Math.round(Float.parseFloat(s1.substring(k1, i1))));
_L13:
        String s2 = s1.substring(i1);
        if (s2.equalsIgnoreCase("k") || s2.equalsIgnoreCase("kb"))
        {
            j1 = 1024;
        } else
        if (s2.equalsIgnoreCase("m") || s2.equalsIgnoreCase("mb"))
        {
            j1 = 0x100000;
        } else
        if (s2.equalsIgnoreCase("g") || s2.equalsIgnoreCase("gb"))
        {
            j1 = 0x40000000;
        }
        if (true) goto _L14; else goto _L2
_L2:
        i1 = -1;
          goto _L9
    }

    static ArrayList f(q q1)
    {
        return q1.k;
    }

    private void f()
    {
        synchronized (B)
        {
            B.clear();
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static int g(q q1)
    {
        return q1.a;
    }

    private static String g(String s1)
    {
        String s2 = s1.replace('-', '_').replace(' ', '_').replace('.', '_').replace(':', '_').replace('&', '_').replace('(', '_').replace(')', '_').replace('\'', '_');
        s1 = s2;
        if (s2.length() > 50)
        {
            s1 = s2.substring(0, 50);
        }
        return s1;
    }

    private boolean g()
    {
        boolean aflag[];
        boolean flag;
        boolean flag3;
        aflag = null;
        flag3 = true;
        flag = false;
        if (q != null && q.localPageList != null && q.localPageList.size() != 0 || i != null && i.files != null && i.files.size() != 0) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L4:
        return flag1;
_L2:
        if (!C)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag3;
        if (D) goto _L4; else goto _L3
_L3:
        if (!C)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = flag3;
        if (i == null) goto _L4; else goto _L5
_L5:
        j.clear();
        Iterator iterator;
        Genre genre;
        Iterator iterator1;
        GenrePage genrepage;
        int i1;
        if (y == null)
        {
            i1 = 0;
        } else
        {
            i1 = y.size();
        }
        a(new Genre(0x989682, "History", null, i1));
        a(new Genre(0, "Top 100", null, 100));
        a(new Genre(0x989680, "All Genres", null, 500));
        if (i == null) goto _L7; else goto _L6
_L6:
        if (i.genre != null && i.genre.size() != 0 && i.genreNames != null && i.genreNames.size() != 0)
        {
            iterator = i.genreNames.iterator();
label0:
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                genre = (Genre)iterator.next();
                iterator1 = i.genre.iterator();
                do
                {
                    if (!iterator1.hasNext())
                    {
                        continue label0;
                    }
                    genrepage = (GenrePage)iterator1.next();
                } while (genre.genre_id != genrepage.id);
                a(genre);
            } while (true);
        }
        Object obj2 = new ArrayList();
        Object obj;
        String s1;
        Object obj1;
        Iterator iterator2;
        LocalTrackPageItem localtrackpageitem;
        LocalTrackPageItem localtrackpageitem1;
        int k1;
        int l1;
        boolean flag2;
        if (u.size() > 0)
        {
            obj = u;
        } else
        if (q != null && q.localPageList != null && q.localPageList.size() > 0)
        {
            obj = q.localPageList;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            aflag = new boolean[((ArrayList) (obj)).size()];
            for (int j1 = 0; j1 < ((ArrayList) (obj)).size(); j1++)
            {
                aflag[j1] = false;
            }

        }
        iterator2 = i.files.iterator();
        if (!iterator2.hasNext()) goto _L9; else goto _L8
_L8:
        obj1 = (TrackPageItem)iterator2.next();
        localtrackpageitem = new LocalTrackPageItem();
        localtrackpageitem.trackPageItem = ((TrackPageItem) (obj1));
        localtrackpageitem.filePath = "";
        (new StringBuilder("onServerInfoDone cloud, trackpage:")).append(((TrackPageItem) (obj1)).url);
        if (obj == null || ((ArrayList) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_1562;
        }
        k1 = 0;
_L12:
        if (k1 >= ((ArrayList) (obj)).size())
        {
            break MISSING_BLOCK_LABEL_1562;
        }
        localtrackpageitem1 = (LocalTrackPageItem)((ArrayList) (obj)).get(k1);
        if (localtrackpageitem1 == null || localtrackpageitem1.trackPageItem == null || localtrackpageitem1.trackPageItem.md5 == null || localtrackpageitem1.filePath == null || ((TrackPageItem) (obj1)).md5 == null || !localtrackpageitem1.trackPageItem.md5.equalsIgnoreCase(((TrackPageItem) (obj1)).md5)) goto _L11; else goto _L10
_L10:
        if ((new File(localtrackpageitem1.filePath)).exists())
        {
            obj1 = localtrackpageitem1.filePath;
        } else
        {
            obj1 = "";
        }
        localtrackpageitem.filePath = ((String) (obj1));
        localtrackpageitem.localkey = localtrackpageitem1.localkey;
        if (u.size() > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        aflag[k1] = true;
        (new StringBuilder("onServerInfoDone cloud, local info exists for:")).append(localtrackpageitem1.filePath).append(",pageExists:").append(flag2).append(", index:").append(k1);
_L13:
        if (!flag2)
        {
            ((ArrayList) (obj2)).add(localtrackpageitem);
        }
        break MISSING_BLOCK_LABEL_448;
_L11:
        k1++;
          goto _L12
_L9:
        u.addAll(((Collection) (obj2)));
        for (k1 = 0; k1 < n.size(); k1 = l1 + 1)
        {
            obj = (com.roidapp.photogrid.video.c)n.get(k1);
            l1 = k1;
            if (obj == null)
            {
                continue;
            }
            l1 = k1;
            if (((com.roidapp.photogrid.video.c) (obj)).a == null)
            {
                continue;
            }
            l1 = k1;
            if (!((com.roidapp.photogrid.video.c) (obj)).a.endsWith(".json"))
            {
                continue;
            }
            l1 = k1;
            if (((com.roidapp.photogrid.video.c) (obj)).a.equalsIgnoreCase(d))
            {
                continue;
            }
            obj = new File(((com.roidapp.photogrid.video.c) (obj)).a);
            if (((File) (obj)).exists())
            {
                ((File) (obj)).delete();
            }
            n.remove(k1);
            l1 = k1;
            if (k1 > 0)
            {
                l1 = k1 - 1;
            }
        }

        if (u.size() > i.files.size())
        {
            obj = new ArrayList();
            k1 = 0;
            while (k1 < u.size()) 
            {
                if (aflag == null || k1 >= aflag.length || aflag[k1])
                {
                    ((ArrayList) (obj)).add(u.get(k1));
                } else
                if (k1 < w.size())
                {
                    obj1 = (m)w.get(k1);
                    obj1.d = true;
                    obj1.c = true;
                    w.set(k1, obj1);
                }
                k1++;
            }
            com.roidapp.photogrid.video.bi.a(d, (new k()).a(new LocalServer(j, ((ArrayList) (obj)))).toString());
        } else
        {
            com.roidapp.photogrid.video.bi.a(d, (new k()).a(new LocalServer(j, u)).toString());
        }
        D = true;
        break MISSING_BLOCK_LABEL_1059;
_L7:
        u.clear();
        if (q.genreList != null)
        {
            for (obj = q.genreList.iterator(); ((Iterator) (obj)).hasNext(); a((Genre)((Iterator) (obj)).next())) { }
        }
        if (q.localPageList != null)
        {
            u.addAll(q.localPageList);
        }
        a = 0;
        w.clear();
        C = true;
        obj1 = new Time();
        ((Time) (obj1)).setToNow();
        k1 = w.size();
        while (k1 < u.size()) 
        {
            obj2 = (LocalTrackPageItem)u.get(k1);
            if (obj2 == null || ((LocalTrackPageItem) (obj2)).trackPageItem == null)
            {
                u.remove(k1);
                k1--;
            } else
            {
label1:
                {
                    s1 = ((LocalTrackPageItem) (obj2)).filePath;
                    if (s1 != null && !((LocalTrackPageItem) (obj2)).filePath.equalsIgnoreCase(""))
                    {
                        obj = s1;
                        if ((new File(s1)).exists())
                        {
                            break label1;
                        }
                    }
                    obj = (new StringBuilder()).append(((LocalTrackPageItem) (obj2)).trackPageItem.url).append("?X=").append(((Time) (obj1)).hour).toString();
                }
                w.add(new m(k1, ((String) (obj)), 0x989680));
                l1 = a;
                a = ((LocalTrackPageItem) (obj2)).trackPageItem.count + l1;
            }
            k1++;
        }
        E = w.size();
        if (i != null && i.genre != null)
        {
            for (k1 = ((flag) ? 1 : 0); k1 < i.genre.size(); k1++)
            {
                obj = (GenrePage)i.genre.get(k1);
                w.add(new m(E + k1, (new StringBuilder()).append(((GenrePage) (obj)).url).append("?X=").append(((Time) (obj1)).hour).append(((Time) (obj1)).minute).toString(), ((GenrePage) (obj)).id));
            }

        }
        k1 = e();
        if (k1 != -1)
        {
            z = k1;
        }
        return j(z);
        flag2 = false;
          goto _L13
    }

    static int h(q q1)
    {
        return q1.e();
    }

    private boolean h()
    {
        Object obj1;
        obj1 = null;
        (new StringBuilder("initCacheInfo in:")).append(f);
        if (f != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        File file;
        if (!f.endsWith("/"))
        {
            f = (new StringBuilder()).append(f).append("/").toString();
        }
        file = new File(f);
        if (!file.exists())
        {
            file.mkdirs();
        }
        if (!file.exists()) goto _L1; else goto _L3
_L3:
        Object obj2;
        g = (new StringBuilder()).append(f).append(".track/").toString();
        obj2 = new File(g);
        if (!((File) (obj2)).exists())
        {
            ((File) (obj2)).mkdirs();
        }
        if (!((File) (obj2)).exists()) goto _L1; else goto _L4
_L4:
        d = (new StringBuilder()).append(f).append(".track/main.json").toString();
        Object obj;
        Exception exception;
        Exception exception1;
        File file1;
        int j1;
        boolean flag1;
        int k1;
        if (((File) (obj2)).exists())
        {
            obj = ((File) (obj2)).listFiles();
        } else
        {
            obj = null;
        }
        e = (new StringBuilder()).append(f).append(".track/history.json").toString();
        if ((new File(e)).exists())
        {
            try
            {
                y = (ArrayList)(new k()).a(bi.b(e), (new v(this)).b());
            }
            catch (Exception exception2)
            {
                y = new ArrayList(0);
            }
        }
        n.clear();
        if (obj != null && obj.length > 0)
        {
            int i1 = 0;
            while (i1 < obj.length) 
            {
                String s1 = obj[i1].getAbsolutePath();
                boolean flag;
                if (s1 != null && s1.substring(s1.lastIndexOf(".") + 1).toLowerCase(Locale.ENGLISH).equals("json"))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && !obj[i1].getAbsolutePath().equalsIgnoreCase(e))
                {
                    n.add(new com.roidapp.photogrid.video.c(obj[i1].getAbsolutePath(), com.roidapp.photogrid.video.bi.a(obj[i1].getAbsolutePath())));
                }
                i1++;
            }
        }
        h = com.roidapp.baselib.d.a.d();
        file1 = new File(h);
        if (!file1.exists())
        {
            file1.mkdirs();
        }
        if (!file1.exists()) goto _L1; else goto _L5
_L5:
        obj = obj1;
        if (file1.exists())
        {
            obj = ((File) (obj2)).listFiles();
        }
        o.clear();
        if (obj == null || obj.length <= 0)
        {
            break MISSING_BLOCK_LABEL_693;
        }
        j1 = 0;
_L7:
        if (j1 >= obj.length)
        {
            break MISSING_BLOCK_LABEL_693;
        }
        obj1 = obj[j1].getAbsolutePath();
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = ((String) (obj1)).substring(((String) (obj1)).lastIndexOf(".") + 1).toLowerCase(Locale.ENGLISH);
        if (!((String) (obj1)).equals("mp3") && !((String) (obj1)).equals("m4a") && !((String) (obj1)).equals("amr") && !((String) (obj1)).equals("aac") && !((String) (obj1)).equals("ogg") && !((String) (obj1)).equals("flac") && !((String) (obj1)).equals("3gpp") && !((String) (obj1)).equals("3ga") && !((String) (obj1)).equals("wav"))
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = true;
_L8:
        if (flag1)
        {
            o.add(new com.roidapp.photogrid.video.c(obj[j1].getAbsolutePath(), d(obj[j1].getAbsolutePath())));
        }
        j1++;
        if (true) goto _L7; else goto _L6
_L6:
        flag1 = false;
          goto _L8
        if (true) goto _L7; else goto _L9
_L9:
        obj = new File(d);
        if (!((File) (obj)).exists())
        {
            return true;
        }
        (new StringBuilder("initCacheInfo local addr exists")).append(d);
        try
        {
            q = (LocalServer)(new k()).a(bi.b(d), com/roidapp/photogrid/video/onlinemusic/LocalServer);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            ((File) (obj)).delete();
            return true;
        }
        if (q == null || q.localPageList == null || q.localPageList.size() == 0)
        {
            return true;
        }
        j1 = 0;
_L14:
        if (j1 >= q.localPageList.size()) goto _L11; else goto _L10
_L10:
        obj = (LocalTrackPageItem)q.localPageList.get(j1);
        k1 = 0;
_L12:
        if (k1 >= n.size())
        {
            break MISSING_BLOCK_LABEL_1000;
        }
        exception = (com.roidapp.photogrid.video.c)n.get(k1);
        if (!((com.roidapp.photogrid.video.c) (exception)).b.equals(((LocalTrackPageItem) (obj)).localkey) || ((com.roidapp.photogrid.video.c) (exception)).a.equalsIgnoreCase(d))
        {
            break MISSING_BLOCK_LABEL_1061;
        }
        obj2 = (ArrayList)(new k()).a(bi.b(((com.roidapp.photogrid.video.c) (exception)).a), (new w(this)).b());
        if (obj2 != null && obj != null)
        {
            try
            {
                if (((LocalTrackPageItem) (obj)).trackPageItem != null && ((ArrayList) (obj2)).size() == ((LocalTrackPageItem) (obj)).trackPageItem.count)
                {
                    (new StringBuilder("initCacheInfo check local page succeed:")).append(((com.roidapp.photogrid.video.c) (exception)).a);
                    obj.filePath = ((com.roidapp.photogrid.video.c) (exception)).a;
                    q.localPageList.set(j1, obj);
                    n.remove(k1);
                }
            }
            // Misplaced declaration of an exception variable
            catch (Exception exception1)
            {
                (new StringBuilder("initCacheInfo check local page error:")).append(((com.roidapp.photogrid.video.c) (exception)).a);
            }
        }
        if (obj == null || ((LocalTrackPageItem) (obj)).trackPageItem == null)
        {
            q.localPageList.remove(j1);
            j1--;
        } else
        if (((LocalTrackPageItem) (obj)).trackPageItem.md5 == null || ((LocalTrackPageItem) (obj)).filePath == null || ((LocalTrackPageItem) (obj)).filePath.equalsIgnoreCase("") || !(new File(((LocalTrackPageItem) (obj)).filePath)).exists())
        {
            q.localPageList.remove(j1);
            j1--;
        }
        j1++;
        continue; /* Loop/switch isn't completed */
        k1++;
        if (true) goto _L12; else goto _L11
_L11:
        return true;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private aa i()
    {
        aa aa2;
        synchronized (b)
        {
            aa2 = b;
        }
        return aa2;
        exception;
        aa1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static CloundServer i(q q1)
    {
        return q1.i;
    }

    private void i(int i1)
    {
        ArrayList arraylist = B;
        arraylist;
        JVM INSTR monitorenter ;
        int j1 = 0;
_L2:
        if (j1 >= B.size())
        {
            break MISSING_BLOCK_LABEL_44;
        }
        if (((Integer)B.get(j1)).intValue() != i1)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        arraylist;
        JVM INSTR monitorexit ;
        return;
        B.add(Integer.valueOf(i1));
        arraylist;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
        j1++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    static Handler j(q q1)
    {
        return q1.A;
    }

    private boolean j()
    {
        if (!com.roidapp.baselib.e.l.b(c))
        {
            return false;
        }
        if (D || x.get(Integer.valueOf(0x989681)) != null)
        {
            return true;
        } else
        {
            o o1 = new o(0x989681);
            o1.a(new x(this));
            x.put(Integer.valueOf(0x989681), o1);
            o1.executeOnExecutor(c.SINGLE_EXECUTOR, new m[] {
                new m(0, "http://dl.pg.ksmobile.com/fma_music/main.json", 0x989680)
            });
            return true;
        }
    }

    private boolean j(int i1)
    {
        boolean flag = false;
        this;
        JVM INSTR monitorenter ;
        Object obj = x.get(Integer.valueOf(i1));
        if (obj == null) goto _L2; else goto _L1
_L1:
        boolean flag1 = false;
_L54:
        this;
        JVM INSTR monitorexit ;
        return flag1;
_L2:
        (new StringBuilder("loadMoreTracks genre_id:")).append(i1).append(",mTotalTrackCount:").append(a).append(",mAvailableTracks.size():").append(k.size());
        if (k.size() < a || i1 == 0)
        {
            break MISSING_BLOCK_LABEL_104;
        }
        if (D)
        {
            flag1 = false;
            continue; /* Loop/switch isn't completed */
        }
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        Object obj1;
        Object obj2;
        if (k.size() >= 500 && i1 != 0)
        {
            flag1 = false;
            continue; /* Loop/switch isn't completed */
        }
        if (i1 == 0x989682)
        {
            flag1 = false;
            continue; /* Loop/switch isn't completed */
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_167;
        }
        if (t.get(0) != null && ((ArrayList)t.get(0)).size() >= 100)
        {
            flag1 = false;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = k(i1);
        if (obj1 == null)
        {
            flag1 = false;
            continue; /* Loop/switch isn't completed */
        }
        if (t.get(i1) != null && ((ArrayList)t.get(i1)).size() >= ((Genre) (obj1)).count && ((Genre) (obj1)).count > 0)
        {
            flag1 = false;
            continue; /* Loop/switch isn't completed */
        }
        if (i().ordinal() <= aa.e.ordinal() && i().ordinal() >= aa.b.ordinal()) goto _L4; else goto _L3
_L4:
        obj1 = new m[w.size()];
        if (i1 == 0x989680) goto _L6; else goto _L5
_L5:
        j2 = E;
        k1 = 0;
        j1 = 0;
_L43:
        if (j2 >= w.size()) goto _L8; else goto _L7
_L7:
        obj2 = (m)w.get(j2);
        if (obj2 == null) goto _L10; else goto _L9
_L9:
        if (((m) (obj2)).b == null || ((m) (obj2)).c || i1 != ((m) (obj2)).e || !com.roidapp.baselib.e.l.b(c) && ((m) (obj2)).b.startsWith("http")) goto _L10; else goto _L11
_L11:
        i2 = k1;
        if (!((m) (obj2)).b.startsWith("http")) goto _L13; else goto _L12
_L12:
        if (!com.roidapp.baselib.e.l.b(c)) goto _L10; else goto _L14
_L14:
        i2 = k1;
        if (k1 == 0)
        {
            i2 = 1;
        }
_L13:
        obj2.c = true;
        (new StringBuilder("loadMoreTracks requestUrl:")).append(((m) (obj2)).b);
        w.set(j2, obj2);
        obj1[j2] = ((m) (obj2));
        if (i == null) goto _L16; else goto _L15
_L15:
        if (j2 >= i.files.size()) goto _L18; else goto _L17
_L17:
        j1 += ((TrackPageItem)i.files.get(j2)).count;
          goto _L19
_L18:
        if (i.genre != null && j2 <= i.genre.size() + i.files.size())
        {
            j1 += ((GenrePage)i.genre.get(j2 - i.files.size())).count;
        }
          goto _L19
_L16:
        j1 += ((LocalTrackPageItem)q.localPageList.get(j2)).trackPageItem.count;
          goto _L19
_L46:
        if (k2 >= E) goto _L21; else goto _L20
_L20:
        obj2 = (m)w.get(k2);
        if (obj2 == null) goto _L23; else goto _L22
_L22:
        if (((m) (obj2)).b == null || ((m) (obj2)).c || !com.roidapp.baselib.e.l.b(c) && ((m) (obj2)).b.startsWith("http")) goto _L23; else goto _L24
_L24:
        l1 = k1;
        if (!((m) (obj2)).b.startsWith("http")) goto _L26; else goto _L25
_L25:
        if (!com.roidapp.baselib.e.l.b(c)) goto _L23; else goto _L27
_L27:
        l1 = k1;
        if (k1 == 0)
        {
            l1 = 1;
        }
_L26:
        obj2.c = true;
        (new StringBuilder("loadMoreTracks requestUrl:")).append(((m) (obj2)).b);
        w.set(k2, obj2);
        obj1[k2] = ((m) (obj2));
        if (i == null) goto _L29; else goto _L28
_L28:
        if (k2 >= i.files.size()) goto _L31; else goto _L30
_L30:
        j1 += ((TrackPageItem)i.files.get(k2)).count;
          goto _L32
_L31:
        if (i.genre != null && k2 <= i.genre.size() + i.files.size())
        {
            j1 += ((GenrePage)i.genre.get(k2 - i.files.size())).count;
        }
          goto _L32
_L29:
        j1 += ((LocalTrackPageItem)q.localPageList.get(k2)).trackPageItem.count;
          goto _L32
_L52:
        for (; j1 >= obj1.length; j1++)
        {
            break MISSING_BLOCK_LABEL_934;
        }

        if (obj1[j1] == null)
        {
            break MISSING_BLOCK_LABEL_1344;
        }
        if (obj1[j1].b != null)
        {
            b(obj1[j1].a, bi.b(obj1[j1].b));
        }
        break MISSING_BLOCK_LABEL_1344;
        if (i().ordinal() < com.roidapp.photogrid.video.aa.c.ordinal() || i().ordinal() == aa.f.ordinal()) goto _L34; else goto _L33
_L33:
        if (p != null)
        {
            p.a(i1);
        }
_L36:
        if (k.size() >= a && D)
        {
            a(aa.e);
        }
        break MISSING_BLOCK_LABEL_1353;
_L34:
        a(com.roidapp.photogrid.video.aa.c);
        if (p != null)
        {
            p.a();
        }
        if (true) goto _L36; else goto _L35
_L35:
        obj1;
        throw obj1;
_L51:
        obj2 = new o(i1);
        ((o) (obj2)).a(new s(this));
        x.put(Integer.valueOf(i1), obj2);
        ((o) (obj2)).executeOnExecutor(c.SINGLE_EXECUTOR, ((Object []) (obj1)));
        flag1 = true;
        continue; /* Loop/switch isn't completed */
_L23:
        l1 = j1;
        j1 = k1;
        k1 = l1;
          goto _L37
_L10:
        l1 = j1;
        j1 = k1;
        k1 = l1;
          goto _L38
_L6:
        k1 = 0;
        l1 = 0;
          goto _L39
_L3:
        flag1 = false;
        continue; /* Loop/switch isn't completed */
_L19:
        if (i2 == 0) goto _L41; else goto _L40
_L40:
        l1 = j1;
        k1 = i2;
        if (j1 >= 50) goto _L39; else goto _L41
_L41:
        l1 = j1;
        k1 = i2;
        if (j1 >= 100) goto _L39; else goto _L42
_L42:
        k1 = j1;
        j1 = i2;
_L38:
        j2++;
        l1 = k1;
        k1 = j1;
        j1 = l1;
          goto _L43
_L8:
        l1 = j1;
_L39:
        j2 = l1;
        i2 = k1;
        if (l1 != 0) goto _L45; else goto _L44
_L44:
        k2 = 0;
        j1 = l1;
          goto _L46
_L32:
        if (l1 == 0) goto _L48; else goto _L47
_L47:
        j2 = j1;
        i2 = l1;
        if (j1 >= 50) goto _L45; else goto _L48
_L48:
        j2 = j1;
        i2 = l1;
        if (j1 >= 100) goto _L45; else goto _L49
_L49:
        k1 = j1;
        j1 = l1;
_L37:
        k2++;
        l1 = k1;
        k1 = j1;
        j1 = l1;
          goto _L46
_L21:
        i2 = k1;
        j2 = j1;
_L45:
        if (j2 != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        flag1 = false;
        continue; /* Loop/switch isn't completed */
        if (i2 != 0) goto _L51; else goto _L50
_L50:
        j1 = ((flag) ? 1 : 0);
          goto _L52
        flag1 = true;
        if (true) goto _L54; else goto _L53
_L53:
    }

    static ab k(q q1)
    {
        return q1.r;
    }

    private Genre k(int i1)
    {
        for (Iterator iterator = j.iterator(); iterator.hasNext();)
        {
            Genre genre = (Genre)iterator.next();
            if (genre.genre_id == i1)
            {
                return genre;
            }
        }

        return null;
    }

    private ArrayList l(int i1)
    {
        return (ArrayList)t.get(i1);
    }

    static HashMap l(q q1)
    {
        return q1.F;
    }

    private z m(int i1)
    {
        if (i().ordinal() >= com.roidapp.photogrid.video.aa.c.ordinal() && i().ordinal() != aa.f.ordinal())
        {
            if (k == null || k.size() == 0)
            {
                return null;
            }
            for (int j1 = 0; j1 < k.size(); j1++)
            {
                z z1 = (z)k.get(j1);
                if (z1 != null && z1.a == i1)
                {
                    z1.d = j1;
                    return z1;
                }
            }

            return null;
        } else
        {
            return null;
        }
    }

    static String m(q q1)
    {
        return q1.h;
    }

    private void n(int i1)
    {
        LocalTrack localtrack = c(i1);
        (new StringBuilder("cancelDownloadTrack downloadTrack:")).append(localtrack);
        if (localtrack != null)
        {
            if (localtrack.filePath == null || localtrack.filePath.equalsIgnoreCase(""))
            {
                String s1 = g(localtrack.track.track_title);
                localtrack.filePath = (new StringBuilder()).append(h).append(s1).append("_").append(e(localtrack.track.mp3_url)).toString();
            }
            (new StringBuilder("cancelDownloadTrack downloadTrack.filePath:")).append(localtrack.filePath);
            File file = new File(localtrack.filePath);
            if (file.exists() && localtrack.getTrack() != null)
            {
                String s2 = com.roidapp.photogrid.video.bi.a(localtrack.filePath);
                if (s2 != null && !s2.equalsIgnoreCase(localtrack.getTrack().file_md5))
                {
                    (new StringBuilder("delete file track_id:")).append(localtrack.filePath);
                    file.delete();
                    return;
                }
            }
        }
    }

    public final int a()
    {
        boolean flag;
        flag = false;
        (new StringBuilder("prepare in, state:")).append(i());
        if (i().ordinal() < aa.b.ordinal()) goto _L2; else goto _L1
_L1:
        int i1 = 1;
_L4:
        return i1;
_L2:
        a(aa.b);
        if (!h())
        {
            a(com.roidapp.photogrid.video.aa.a);
            return 2;
        }
        if (!g() || !C)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ((flag) ? 1 : 0);
        if (i().ordinal() > com.roidapp.photogrid.video.aa.c.ordinal())
        {
            a(com.roidapp.photogrid.video.aa.c);
            i1 = ((flag) ? 1 : 0);
            if (p != null)
            {
                p.a();
                return 0;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!com.roidapp.baselib.e.l.b(c))
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = ((flag) ? 1 : 0);
        if (j()) goto _L4; else goto _L5
_L5:
        i1 = ((flag) ? 1 : 0);
        if (!C)
        {
            a(com.roidapp.photogrid.video.aa.a);
            return 3;
        }
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final LocalTrack a(int i1, int j1)
    {
        if (i().ordinal() >= com.roidapp.photogrid.video.aa.c.ordinal() && i().ordinal() != aa.f.ordinal())
        {
            if (j1 == 0x989682)
            {
                if (y.size() > i1)
                {
                    return (LocalTrack)y.get(i1);
                } else
                {
                    return null;
                }
            }
            if (k == null || k.size() <= i1)
            {
                return null;
            }
            (new StringBuilder("index:")).append(i1).append(",genre:").append(j1).append("mAvailableTracks:").append(k.size());
            int k1 = ((z)k.get(i1)).c;
            int l1 = ((z)k.get(i1)).b;
            (new StringBuilder("trackPageId:")).append(l1).append(",trackIndex:").append(k1);
            if (v.get(l1) != null && ((ArrayList)v.get(l1)).size() <= k1)
            {
                (new StringBuilder("trackPage size:")).append(((ArrayList)v.get(l1)).size());
                return null;
            }
            if (j1 == 0x989680)
            {
                return (LocalTrack)((ArrayList)v.get(((z)k.get(i1)).b)).get(((z)k.get(i1)).c);
            }
            ArrayList arraylist = l(j1);
            if (arraylist == null || i1 >= arraylist.size())
            {
                return null;
            }
            if (v.get(((z)arraylist.get(i1)).b) == null || ((ArrayList)v.get(((z)arraylist.get(i1)).b)).size() <= ((z)arraylist.get(i1)).c)
            {
                return null;
            } else
            {
                return (LocalTrack)((ArrayList)v.get(((z)arraylist.get(i1)).b)).get(((z)arraylist.get(i1)).c);
            }
        } else
        {
            return null;
        }
    }

    public final void a(ab ab1)
    {
        r = ab1;
    }

    public final void a(LocalTrack localtrack)
    {
label0:
        {
            synchronized (y)
            {
                if (y.size() <= 0)
                {
                    break label0;
                }
                Iterator iterator = y.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (((LocalTrack)iterator.next()).track.track_id != localtrack.track.track_id);
            }
            return;
        }
        y.add(localtrack);
        com.roidapp.photogrid.video.bi.a(e, (new k()).a(y).toString());
        arraylist;
        JVM INSTR monitorexit ;
        return;
        localtrack;
        arraylist;
        JVM INSTR monitorexit ;
        throw localtrack;
    }

    public final boolean a(int i1)
    {
        z = i1;
        break MISSING_BLOCK_LABEL_5;
_L1:
        return false;
        if (i().ordinal() <= aa.e.ordinal() && i().ordinal() >= com.roidapp.photogrid.video.aa.c.ordinal() && (i().ordinal() != aa.e.ordinal() || i1 != 0x989680) && i1 != 0x989682)
        {
            (new StringBuilder("updateMoreTracks mCloudLoaded : ")).append(D).append(",NetworkUtils.isNetworkAvailable:").append(com.roidapp.baselib.e.l.b(c));
            if (D)
            {
                return j(i1);
            }
            if (com.roidapp.baselib.e.l.b(c))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (a <= k.size() && i1 == 0x989680 || i1 == 0)
            {
                if (p != null)
                {
                    p.a(4096, 8193);
                    return false;
                }
            } else
            {
                return j(0x989680);
            }
        }
          goto _L1
        if (!j()) goto _L1; else goto _L2
_L2:
        i(i1);
        return true;
    }

    public final Genre b(int i1)
    {
        while (i().ordinal() < com.roidapp.photogrid.video.aa.c.ordinal() || i1 >= j.size()) 
        {
            return null;
        }
        return (Genre)j.get(i1);
    }

    public final void b()
    {
        f();
        if (x.size() != 0)
        {
            Iterator iterator = x.values().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                o o1 = (o)iterator.next();
                if (o1 != null)
                {
                    o1.cancel(true);
                }
            } while (true);
        }
        x.clear();
        if (F.size() != 0)
        {
            int i1;
            for (Iterator iterator1 = F.keySet().iterator(); iterator1.hasNext(); n(i1))
            {
                i1 = ((Integer)iterator1.next()).intValue();
                com.roidapp.photogrid.video.a a1 = (com.roidapp.photogrid.video.a)F.get(Integer.valueOf(i1));
                if (a1 != null)
                {
                    a1.a(null);
                    a1.a();
                }
            }

            F.clear();
        }
        a(com.roidapp.photogrid.video.aa.a);
        if (f != null)
        {
            File file = new File(f);
            if (!file.exists())
            {
                file.mkdirs();
            }
        }
        if (g != null)
        {
            File file1 = new File(g);
            if (!file1.exists())
            {
                file1.mkdirs();
            }
        }
        if (g != null)
        {
            int j1 = 0;
            while (j1 < v.size()) 
            {
                int k1 = v.keyAt(j1);
                ArrayList arraylist;
                TrackPageItem trackpageitem;
                if (w.get(k1) != null && ((m)w.get(k1)).e == 0x989680 && ((ArrayList)v.get(k1)).size() > 0)
                {
                    try
                    {
                        com.roidapp.photogrid.video.bi.a((new StringBuilder()).append(g).append(e(((LocalTrackPageItem)u.get(k1)).trackPageItem.url)).toString(), (new k()).a(v.get(k1)).toString());
                        ((LocalTrackPageItem)u.get(k1)).localkey = com.roidapp.photogrid.video.bi.a((new StringBuilder()).append(g).append(e(((LocalTrackPageItem)u.get(k1)).trackPageItem.url)).toString());
                        ((LocalTrackPageItem)u.get(k1)).filePath = (new StringBuilder()).append(g).append(e(((LocalTrackPageItem)u.get(k1)).trackPageItem.url)).toString();
                    }
                    catch (Exception exception) { }
                }
                j1++;
            }
        }
        if (d == null) goto _L2; else goto _L1
_L1:
        arraylist = new ArrayList();
        if (i == null || i.files == null || u.size() <= i.files.size()) goto _L4; else goto _L3
_L3:
        j1 = 0;
_L7:
        if (j1 < i.files.size())
        {
            trackpageitem = (TrackPageItem)i.files.get(j1);
            k1 = 0;
            do
            {
label0:
                {
                    if (k1 < u.size())
                    {
                        if (!((LocalTrackPageItem)u.get(k1)).trackPageItem.md5.equalsIgnoreCase(trackpageitem.md5))
                        {
                            break label0;
                        }
                        arraylist.add(u.get(k1));
                    }
                    j1++;
                    continue; /* Loop/switch isn't completed */
                }
                k1++;
            } while (true);
        }
        com.roidapp.photogrid.video.bi.a(d, (new k()).a(new LocalServer(j, arraylist)).toString());
_L2:
        if (e != null)
        {
            com.roidapp.photogrid.video.bi.a(e, (new k()).a(y).toString());
        }
        F.clear();
        j.clear();
        k.clear();
        l.clear();
        m.clear();
        u.clear();
        v.clear();
        t.clear();
        w.clear();
        return;
_L4:
        if (j.size() != 0 && u.size() != 0)
        {
            com.roidapp.photogrid.video.bi.a(d, (new k()).a(new LocalServer(j, u)).toString());
        }
        if (true) goto _L2; else goto _L5
_L5:
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final LocalTrack c(int i1)
    {
        if (i().ordinal() >= com.roidapp.photogrid.video.aa.c.ordinal() && i().ordinal() != aa.f.ordinal())
        {
            if (k == null || k.size() == 0 && (y == null || y.size() == 0))
            {
                return null;
            }
            for (Iterator iterator = y.iterator(); iterator.hasNext();)
            {
                LocalTrack localtrack = (LocalTrack)iterator.next();
                if (localtrack.track.track_id == i1)
                {
                    return localtrack;
                }
            }

            for (Iterator iterator1 = k.iterator(); iterator1.hasNext();)
            {
                z z1 = (z)iterator1.next();
                if (z1 != null && z1.a == i1)
                {
                    if (v.get(z1.b) != null && ((ArrayList)v.get(z1.b)).size() > z1.c)
                    {
                        return (LocalTrack)((ArrayList)v.get(z1.b)).get(z1.c);
                    } else
                    {
                        return null;
                    }
                }
            }

            return null;
        } else
        {
            return null;
        }
    }

    public final void c()
    {
        synchronized (y)
        {
            if (y.size() >= 0)
            {
                y.clear();
                File file = new File(e);
                if (file.exists())
                {
                    file.delete();
                }
            }
        }
        return;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final int d()
    {
        if (i().ordinal() < com.roidapp.photogrid.video.aa.c.ordinal())
        {
            return 0;
        } else
        {
            return j.size();
        }
    }

    public final int d(int i1)
    {
        boolean flag = false;
        int j1 = ((flag) ? 1 : 0);
        if (i().ordinal() >= com.roidapp.photogrid.video.aa.c.ordinal())
        {
            j1 = ((flag) ? 1 : 0);
            if (i().ordinal() != aa.f.ordinal())
            {
                if (i1 == 0x989680)
                {
                    j1 = a;
                } else
                {
                    if (i1 == 0x989682)
                    {
                        return y.size();
                    }
                    Genre genre = k(i1);
                    j1 = ((flag) ? 1 : 0);
                    if (genre != null)
                    {
                        return genre.count;
                    }
                }
            }
        }
        return j1;
    }

    public final int e(int i1)
    {
        if (i().ordinal() >= com.roidapp.photogrid.video.aa.c.ordinal() && i().ordinal() != aa.f.ordinal() && k != null)
        {
            if (i1 == 0x989680)
            {
                return k.size();
            }
            if (i1 == 0x989682)
            {
                return y.size();
            }
            ArrayList arraylist = l(i1);
            if (arraylist != null)
            {
                return arraylist.size();
            }
        }
        return 0;
    }

    public final boolean f(int i1)
    {
        LocalTrack localtrack = c(i1);
        if (localtrack != null)
        {
            if (localtrack.filePath == null || localtrack.filePath.equalsIgnoreCase(""))
            {
                String s1 = g(localtrack.track.track_title);
                localtrack.filePath = (new StringBuilder()).append(h).append(s1).append("_").append(e(localtrack.track.mp3_url)).toString();
            }
            if ((new File(localtrack.filePath)).exists() && com.roidapp.photogrid.video.bi.a(localtrack.filePath).equalsIgnoreCase(localtrack.getTrack().file_md5))
            {
                a(i1, localtrack);
                return true;
            }
        }
        return false;
    }

    public final void g(int i1)
    {
        if (F.get(Integer.valueOf(i1)) == null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        LocalTrack localtrack;
        localtrack = c(i1);
        if (localtrack != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (r != null)
        {
            r.a(i1, 1, null);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        File file;
        if (localtrack.filePath == null || localtrack.filePath.equalsIgnoreCase(""))
        {
            String s1 = g(localtrack.track.track_title);
            localtrack.filePath = (new StringBuilder()).append(h).append(s1).append("_").append(e(localtrack.track.mp3_url)).toString();
        }
        (new StringBuilder("DownloadTrack updateTrack.getTrack().file_md5:")).append(localtrack.getTrack().file_md5);
        file = new File(localtrack.filePath);
        if (!file.exists() || !com.roidapp.photogrid.video.bi.a(localtrack.filePath).equalsIgnoreCase(localtrack.getTrack().file_md5))
        {
            break; /* Loop/switch isn't completed */
        }
        a(i1, localtrack);
        if (r != null)
        {
            r.a(i1, localtrack.filePath);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        (new StringBuilder("DownloadTrack DownloadTask:")).append(localtrack.filePath);
        if (file.exists())
        {
            file.delete();
        }
        if (com.roidapp.baselib.e.l.b(c))
        {
            break; /* Loop/switch isn't completed */
        }
        if (r != null)
        {
            r.a(i1, 0, null);
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
        if (com.roidapp.baselib.d.a.b(new File(h)) <= f(localtrack.track.file_size))
        {
            if (r != null)
            {
                r.a(i1, 2, null);
                return;
            }
        } else
        {
            com.roidapp.photogrid.video.a a1 = new com.roidapp.photogrid.video.a();
            a1.a(new y(this, i1));
            F.put(Integer.valueOf(i1), a1);
            a1.a(localtrack.track.mp3_url, localtrack.filePath);
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

    public final void h(int i1)
    {
        if (F.size() <= 0)
        {
            return;
        }
        com.roidapp.photogrid.video.a a1 = (com.roidapp.photogrid.video.a)F.get(Integer.valueOf(i1));
        if (a1 != null)
        {
            a1.a(null);
            F.remove(Integer.valueOf(i1));
            a1.a();
        }
        n(i1);
    }
}
