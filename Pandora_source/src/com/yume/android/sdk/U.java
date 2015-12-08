// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.sdk;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Timer;

// Referenced classes of package com.yume.android.sdk:
//            M, YuMeAdBlockType, YuMeDownloadStatus, S, 
//            Y, q, Q, ah, 
//            n, o, YuMeSDKInterfaceImpl, p, 
//            YuMeStorageMode, T, g, d, 
//            R, h, aq, E, 
//            au, YuMeAdParams, V, N, 
//            Z, W, ay, X, 
//            aF, az, F, J, 
//            K

final class U
{

    private static float v = 0.0F;
    private static int y[];
    private static int z[];
    YuMeAdBlockType a;
    float b;
    String c;
    String d;
    private M e;
    private ArrayList f;
    private ArrayList g;
    private ArrayList h;
    private Q i;
    private volatile ArrayList j;
    private Timer k;
    private Timer l;
    private Timer m;
    private int n;
    private int o;
    private YuMeDownloadStatus p;
    private File q;
    private File r;
    private ArrayList s;
    private boolean t;
    private boolean u;
    private boolean w;
    private Q x;

    public U()
    {
        e = M.a();
        i = null;
        j = null;
        n = 2;
        o = n;
        a = YuMeAdBlockType.NONE;
        p = YuMeDownloadStatus.NONE;
        q = null;
        r = null;
        s = null;
        t = false;
        u = false;
        w = false;
        b = 0.0F;
        c = null;
        d = null;
        x = null;
    }

    private static int[] A()
    {
        int ai[] = z;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[S.values().length];
        try
        {
            ai[S.i.ordinal()] = 9;
        }
        catch (NoSuchFieldError nosuchfielderror9) { }
        try
        {
            ai[S.e.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror8) { }
        try
        {
            ai[S.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror7) { }
        try
        {
            ai[S.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            ai[S.f.ordinal()] = 6;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            ai[S.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            ai[S.j.ordinal()] = 10;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[S.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[S.h.ordinal()] = 8;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[S.g.ordinal()] = 7;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        z = ai;
        return ai;
    }

    private float a(float f1, ArrayList arraylist)
    {
        float f2;
        File afile[];
        int i1;
        File file = r;
        if (file == null)
        {
            return 0.0F;
        }
        int k1;
        if (file == null)
        {
            afile = null;
        } else
        if (!file.isDirectory())
        {
            afile = null;
        } else
        {
            afile = file.listFiles();
            Arrays.sort(afile, new Y());
        }
        if (afile == null || !file.isDirectory()) goto _L2; else goto _L1
_L1:
        k1 = afile.length;
        i1 = 0;
        f2 = 0.0F;
_L12:
        if (i1 < k1) goto _L3; else goto _L2
_L2:
        e.c("Required Space cannot be reclaimed.");
        return 0.0F;
_L3:
        File file1;
        String s1;
        file1 = afile[i1];
        s1 = file1.getName();
        if (arraylist == null) goto _L5; else goto _L4
_L4:
        int j1;
        int l1;
        l1 = arraylist.size();
        j1 = 0;
_L10:
        if (j1 < l1) goto _L6; else goto _L5
_L5:
        j1 = 0;
_L8:
        if (j1 == 0)
        {
            if (s == null)
            {
                s = new ArrayList();
            }
            if (s != null)
            {
                s.add(s1);
            }
            e.b((new StringBuilder("Deleting File For Space: ")).append(s1).toString());
            float f3 = (float)file1.length() + f2;
            file1.delete();
            f2 = f3;
            if (f3 >= f1)
            {
                e.b((new StringBuilder("Required Space reclaimed: requiredSize: ")).append(f1).append(", reclaimedSize: ").append(f3).toString());
                return f3;
            }
        }
        break; /* Loop/switch isn't completed */
_L6:
        if (!s1.equals(com.yume.android.sdk.q.b((String)arraylist.get(j1))))
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = 1;
        if (true) goto _L8; else goto _L7
_L7:
        j1++;
        if (true) goto _L10; else goto _L9
_L9:
        i1++;
        if (true) goto _L12; else goto _L11
_L11:
    }

    private int a(Q q1, int i1, ArrayList arraylist)
    {
        int j1;
        int k1;
        int l1;
        int j2;
        j1 = 0;
        k1 = 0;
        q1 = q1.g();
        if (q1 == null)
        {
            return -1;
        }
        j2 = q1.size();
        l1 = 0;
_L1:
        if (l1 >= j2)
        {
            if ((i1 == ah.a || i1 == ah.b || i1 == ah.c) && k1 == 0)
            {
                j1 = -1;
            }
            n n1;
            String s1;
            o o1;
            int i2;
            long l2;
            if (i1 > 0)
            {
                e.b((new StringBuilder("Space Required (for bitrate: ")).append(i1).append("): ").append(j1).toString());
                return j1;
            } else
            {
                e.b((new StringBuilder("Space Required for Assets: ")).append(j1).toString());
                return j1;
            }
        }
        n1 = (n)q1.get(l1);
        if (n1 == null)
        {
            break MISSING_BLOCK_LABEL_281;
        }
        s1 = n1.a();
        l2 = n1.e();
        o1 = n1.f();
        i2 = n1.g();
        if (!n1.b())
        {
            if (o1 == o.a)
            {
                if (!a(i1, i2))
                {
                    break MISSING_BLOCK_LABEL_281;
                }
                k1 = (int)((long)j1 + l2);
                j1 = 1;
            } else
            {
                i2 = (int)((long)j1 + l2);
                j1 = k1;
                k1 = i2;
            }
        } else
        {
label0:
            {
                if (o1 != o.a)
                {
                    break label0;
                }
                if (!a(i1, i2))
                {
                    break MISSING_BLOCK_LABEL_281;
                }
                if (arraylist != null)
                {
                    arraylist.add(s1);
                }
                i2 = 1;
                k1 = j1;
                j1 = i2;
            }
        }
        i2 = l1 + 1;
        l1 = k1;
        k1 = j1;
        j1 = l1;
        l1 = i2;
          goto _L1
        if (arraylist != null)
        {
            arraylist.add(s1);
        }
        i2 = j1;
        j1 = k1;
        k1 = i2;
        break MISSING_BLOCK_LABEL_183;
    }

    private void a(Q q1, int i1)
    {
        ArrayList arraylist = q1.g();
        if (arraylist != null)
        {
            int k1 = arraylist.size();
            int j1 = 0;
            while (j1 < k1) 
            {
                n n1 = (n)arraylist.get(j1);
                if (n1 != null)
                {
                    o o1 = n1.f();
                    int l1 = n1.g();
                    String s1 = n1.a();
                    if (!n1.b())
                    {
                        if (o1 == o.a)
                        {
                            if (!a(i1, l1))
                            {
                                n1.a(true);
                                n1.c();
                            } else
                            {
                                a(q1, s1, n1.h());
                            }
                        }
                    } else
                    if (o1 == o.a && a(i1, l1))
                    {
                        a(q1, s1, n1.h());
                    }
                }
                j1++;
            }
        }
    }

    private void a(Q q1, int i1, YuMeAdBlockType yumeadblocktype)
    {
        ArrayList arraylist = q1.g();
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        boolean flag;
        int j1;
        int k1;
        k1 = arraylist.size();
        j1 = 0;
        flag = false;
_L10:
        if (j1 >= k1) goto _L1; else goto _L3
_L3:
        n n1;
        boolean flag1;
        n1 = (n)arraylist.get(j1);
        flag1 = flag;
        if (n1 == null) goto _L5; else goto _L4
_L4:
        o o1;
        String s1;
        int l1;
        o1 = n1.f();
        l1 = n1.g();
        s1 = n1.a();
        if (n1.b())
        {
            break MISSING_BLOCK_LABEL_233;
        }
        if (o1 != o.a) goto _L7; else goto _L6
_L6:
        if (a(i1, l1)) goto _L9; else goto _L8
_L8:
        n1.a(true);
        n1.c();
        flag1 = flag;
_L5:
        j1++;
        flag = flag1;
          goto _L10
_L9:
        a(q1, s1, n1.h());
_L7:
        if (!flag)
        {
            a(YuMeDownloadStatus.DOWNLOADS_IN_PROGRESS);
            if (i1 > 0)
            {
                e.b((new StringBuilder("Downloading Playlist Assets (for bitrate: ")).append(i1).append(")...").toString());
                flag = true;
            } else
            {
                e.b("Downloading Playlist Assets...");
                flag = true;
            }
        }
        YuMeSDKInterfaceImpl.k.a(s1, n1.e(), q1.b(), q1.a(), yumeadblocktype);
        flag1 = flag;
          goto _L5
        flag1 = flag;
        if (o1 == o.a)
        {
            flag1 = flag;
            if (a(i1, l1))
            {
                a(q1, s1, n1.h());
                flag1 = flag;
            }
        }
          goto _L5
    }

    private void a(Q q1, YuMeAdBlockType yumeadblocktype)
    {
        if (b > 0.0F) goto _L2; else goto _L1
_L1:
        e.c("Insufficient Storage Size configured. Hence, Playlist Assets cannot be Cached.");
        b(q1);
_L4:
        return;
_L2:
        ArrayList arraylist;
        boolean flag;
        int j1;
        int k1;
        if (YuMeSDKInterfaceImpl.k.c.e == YuMeStorageMode.EXTERNAL_STORAGE)
        {
            Context context = YuMeSDKInterfaceImpl.a();
            if (context != null)
            {
                int i1 = context.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
                if (i1 == 0)
                {
                    e.b("Permission GRANTED for writing to External Storage.");
                } else
                if (i1 == -1)
                {
                    e.c("Permission DENIED for writing to External Storage. Hence, Playlist Assets cannot be Cached.");
                    b(q1);
                    return;
                }
            }
        }
        if (!p())
        {
            e.c("Assets Storage directories not accessible. Hence, Playlist Assets cannot be Cached.");
            b(q1);
            return;
        }
        ah.a(q1);
        arraylist = q1.g();
        if (arraylist == null)
        {
            YuMeSDKInterfaceImpl.h.a(false);
            v();
            return;
        }
        flag = false;
        boolean flag1 = false;
        if (t)
        {
            continue; /* Loop/switch isn't completed */
        }
        k1 = arraylist.size();
        j1 = 0;
        flag = flag1;
_L11:
        if (j1 < k1)
        {
            break MISSING_BLOCK_LABEL_192;
        }
        if (flag) goto _L4; else goto _L3
_L3:
        t = true;
        b(q1, yumeadblocktype);
        return;
        n n1;
        boolean flag2;
        n1 = (n)arraylist.get(j1);
        flag2 = flag;
        if (n1 == null) goto _L6; else goto _L5
_L5:
        String s1;
        long l1;
        s1 = n1.a();
        l1 = n1.e();
        if (!com.yume.android.sdk.q.a(d, s1)) goto _L8; else goto _L7
_L7:
        long l2 = -1L;
        Object obj = com.yume.android.sdk.q.b(s1);
        l1 = l2;
        if (obj != null)
        {
            obj = new File(r, ((String) (obj)));
            l1 = l2;
            if (((File) (obj)).exists())
            {
                l1 = ((File) (obj)).length();
            }
        }
        if (l1 <= 0L) goto _L10; else goto _L9
_L9:
        n1.a(l1);
        n1.a(true);
        flag2 = flag;
_L6:
        j1++;
        flag = flag2;
          goto _L11
_L10:
        String s2 = com.yume.android.sdk.q.b(s1);
        if (s2 != null)
        {
            File file = new File(r, s2);
            e.b((new StringBuilder("Deleting Zero-length file: ")).append(s2).toString());
            file.delete();
        }
_L13:
        if (!flag)
        {
            flag = true;
            e.b("Fetching Playlist Assets' Size...");
            a(YuMeDownloadStatus.DOWNLOADS_IN_PROGRESS);
            q1.a(S.c);
        }
        YuMeSDKInterfaceImpl.k.a(s1, q1.b(), q1.a(), yumeadblocktype);
        flag2 = flag;
          goto _L6
_L8:
        if (l1 <= 0L) goto _L13; else goto _L12
_L12:
        e.b((new StringBuilder("Asset Size Received: ")).append(com.yume.android.sdk.q.b(s1)).append(" (").append(l1).append(")").toString());
        flag2 = flag;
          goto _L6
    }

    private void a(Q q1, YuMeAdBlockType yumeadblocktype, boolean flag)
    {
        Object obj;
        ArrayList arraylist;
        int i1;
        int j1;
        boolean flag1 = false;
        if (q1.h() == S.e)
        {
            return;
        }
        String s1;
        R r1;
        if (w)
        {
            e.b("Some PF Playlist Assets not Cached.");
            w = false;
        } else
        if (flag)
        {
            e.b("All PF Playlist Assets Already Exists in Local Cache.");
        } else
        {
            e.b("All PF Playlist Assets Downloaded.");
        }
        a(YuMeDownloadStatus.DOWNLOADS_NOT_IN_PROGRESS);
        b(yumeadblocktype, true);
        q1.a(S.e);
        arraylist = q1.g();
        obj = d(yumeadblocktype);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (Q)((ArrayList) (obj)).get(0);
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ((Q) (obj)).f();
        if (obj == null) goto _L2; else goto _L4
_L4:
        obj = ((g) (obj)).b.d();
        if (j == null) goto _L6; else goto _L5
_L5:
        j1 = j.size();
        i1 = 0;
_L11:
        if (i1 < j1) goto _L7; else goto _L6
_L6:
        if (j == null)
        {
            j = new ArrayList();
        }
        r1 = new R();
        r1.a(((String) (obj)));
        obj = "";
        s1 = ((String) (obj));
        if (arraylist == null) goto _L9; else goto _L8
_L8:
        j1 = arraylist.size();
        i1 = ((flag1) ? 1 : 0);
_L12:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_326;
        }
        s1 = ((String) (obj));
_L9:
        r1.b(s1);
        r1.a(yumeadblocktype);
        if (j != null)
        {
            j.add(r1);
        }
_L2:
        a(q1.f());
        return;
_L7:
        Object obj1;
        obj1 = (R)j.get(i1);
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = ((R) (obj1)).a();
        if (obj1 != null && ((String) (obj1)).equals(obj)) goto _L2; else goto _L10
_L10:
        i1++;
          goto _L11
        Object obj2 = (n)arraylist.get(i1);
        if (obj2 != null)
        {
            obj2 = com.yume.android.sdk.q.b(((n) (obj2)).a());
            if (obj2 != null)
            {
                obj2 = (new StringBuilder(String.valueOf(obj))).append(((String) (obj2))).toString();
                obj = obj2;
                if (i1 < j1 - 1)
                {
                    obj = (new StringBuilder(String.valueOf(obj2))).append(",").toString();
                }
            }
        }
        i1++;
          goto _L12
    }

    private void a(Q q1, String s1, String s2)
    {
        aq aq1 = null;
        if (q1 != null)
        {
            if ((q1 = q1.f()) != null)
            {
                if (!((g) (q1)).i)
                {
                    q1.g = s1;
                    e.b((new StringBuilder("Selected Media Url: ")).append(((g) (q1)).g).toString());
                    return;
                }
                if (s2 != null)
                {
                    if (((g) (q1)).f != null)
                    {
                        q1 = ((g) (q1)).f.a();
                    } else
                    {
                        q1 = null;
                    }
                    if (q1 != null)
                    {
                        aq1 = (aq)q1.get(s2);
                    }
                    if (aq1 != null)
                    {
                        aq1.d = s1;
                        e.b((new StringBuilder("Selected Media Url (Slate Id: ")).append(s2).append("): ").append(aq1.d).toString());
                        return;
                    }
                }
            }
        }
    }

    public static void a(YuMeAdBlockType yumeadblocktype, String s1)
    {
        if (YuMeSDKInterfaceImpl.h.a())
        {
            E.a(yumeadblocktype, s1);
            YuMeSDKInterfaceImpl.h.a(false);
        }
    }

    private void a(YuMeDownloadStatus yumedownloadstatus)
    {
        if (yumedownloadstatus != p)
        {
            e.b((new StringBuilder("Current Download Status: ")).append(yumedownloadstatus).toString());
        }
        p = yumedownloadstatus;
    }

    private void a(g g1)
    {
        boolean flag = false;
        int i1 = ((flag) ? 1 : 0);
        if (g1 != null)
        {
            i1 = ((flag) ? 1 : 0);
            if (g1.b != null)
            {
                i1 = g1.b.c();
            }
        }
        c(i1);
    }

    private void a(ArrayList arraylist, String s1, YuMeAdBlockType yumeadblocktype, long l1)
    {
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist1;
        if ((arraylist = (Q)arraylist.get(0)) == null || (arraylist1 = arraylist.g()) == null) goto _L1; else goto _L3
_L3:
        int i1;
        int j1;
        j1 = arraylist1.size();
        i1 = 0;
_L8:
        if (i1 < j1) goto _L5; else goto _L4
_L4:
        int k1;
        i1 = 0;
        if (arraylist1 == null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        k1 = arraylist1.size();
        j1 = 0;
_L9:
        if (j1 < k1) goto _L7; else goto _L6
_L6:
        if (i1 != k1)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        i1 = 1;
_L10:
        if (i1 != 0)
        {
            e.b("All Assets' Size Fetched.");
            t = true;
            b(arraylist, yumeadblocktype);
            return;
        }
          goto _L1
_L5:
        n n1 = (n)arraylist1.get(i1);
        if (n1 != null && s1.equals(n1.a()))
        {
            n1.a(l1);
        }
        i1++;
          goto _L8
_L7:
        s1 = (n)arraylist1.get(j1);
        if (s1 != null && s1.e() != -1L)
        {
            i1++;
        }
        j1++;
          goto _L9
        i1 = 0;
          goto _L10
    }

    private void a(ArrayList arraylist, String s1, YuMeAdBlockType yumeadblocktype, boolean flag)
    {
        if (arraylist != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        ArrayList arraylist1;
        int i1;
        if ((arraylist = (Q)arraylist.get(0)) == null || (arraylist1 = arraylist.g()) == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        int j1;
        if (flag)
        {
            w = true;
            e.b((new StringBuilder("Asset not cached due to insufficient storage space: ")).append(com.yume.android.sdk.q.b(s1)).toString());
        } else
        {
            e.b((new StringBuilder("Downloaded: ")).append(com.yume.android.sdk.q.b(s1)).toString());
        }
        j1 = arraylist1.size();
        i1 = 0;
_L4:
label0:
        {
            if (i1 < j1)
            {
                break label0;
            }
            if (a(arraylist1))
            {
                u = true;
                a(((Q) (arraylist)), yumeadblocktype, false);
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        n n1 = (n)arraylist1.get(i1);
        if (n1 != null && s1.equals(n1.a()))
        {
            n1.a(true);
        }
        i1++;
          goto _L4
        if (true) goto _L1; else goto _L5
_L5:
    }

    public static boolean a(float f1)
    {
        com/yume/android/sdk/U;
        JVM INSTR monitorenter ;
        if (v <= f1) goto _L2; else goto _L1
_L1:
        v -= f1;
        boolean flag = true;
_L4:
        com/yume/android/sdk/U;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private static boolean a(int i1, int j1)
    {
        return i1 == ah.a && j1 >= ah.d && j1 <= ah.a || i1 == ah.b && j1 > ah.a && j1 <= ah.b || i1 == ah.c && j1 > ah.b && j1 <= ah.c;
    }

    private boolean a(int i1, ArrayList arraylist)
    {
        float f1;
        float f2;
        boolean flag;
        boolean flag1;
        flag1 = true;
        f1 = i1;
        int k1;
        if (r == null)
        {
            flag = false;
        } else
        {
label0:
            {
                f2 = com.yume.android.sdk.p.h();
                if (f2 != 0.0F)
                {
                    break label0;
                }
                flag = false;
            }
        }
_L6:
        if (s == null) goto _L2; else goto _L1
_L1:
        k1 = s.size();
        i1 = 0;
_L18:
        if (i1 < k1) goto _L3; else goto _L2
_L2:
        s = null;
        return flag;
        float f3;
        float f5;
        f3 = b * 1024F * 1024F;
        float f4 = x();
        f5 = f3 - f4;
        e.b((new StringBuilder("diskSpaceAvailable: ")).append(f2).append(", givenQuota: ").append(f3).append(", requiredSize: ").append(f1).toString());
        e.b((new StringBuilder("usedQuota: ")).append(f4).append(", remainingQuota: ").append(f5).append(", storageSize (MB): ").append(b).toString());
        if (f1 <= f3) goto _L5; else goto _L4
_L4:
        flag = false;
_L10:
        e.b((new StringBuilder("Space Available For Download: ")).append(flag).toString());
        if (flag)
        {
            v = f3 - f1 - x();
        }
          goto _L6
_L5:
        if (f5 < f1) goto _L8; else goto _L7
_L7:
        flag = flag1;
        if (f2 >= f1) goto _L10; else goto _L9
_L9:
        flag = flag1;
        if (a(f1 - f2, arraylist) > 0.0F) goto _L10; else goto _L11
_L11:
        flag = false;
          goto _L10
_L8:
        if (a(f1 - f5, arraylist) <= 0.0F) goto _L11; else goto _L12
_L12:
        flag = flag1;
          goto _L10
_L3:
        if (j == null) goto _L14; else goto _L13
_L13:
        String s1;
        int j1;
        int l1;
        s1 = (String)s.get(i1);
        l1 = j.size();
        j1 = 0;
        arraylist = null;
_L19:
        if (j1 < l1) goto _L16; else goto _L15
_L15:
        if (arraylist == null) goto _L14; else goto _L17
_L17:
        l1 = arraylist.size();
        j1 = 0;
_L20:
        if (j1 < l1)
        {
            break MISSING_BLOCK_LABEL_448;
        }
_L14:
        i1++;
          goto _L18
_L16:
        R r1 = (R)j.get(j1);
        ArrayList arraylist1 = arraylist;
        if (r1 != null)
        {
            arraylist1 = arraylist;
            if (r1.b().contains(s1))
            {
                arraylist1 = arraylist;
                if (arraylist == null)
                {
                    arraylist1 = new ArrayList();
                }
                arraylist1.add(r1);
            }
        }
        j1++;
        arraylist = arraylist1;
          goto _L19
        j.remove(arraylist.get(j1));
        j1++;
          goto _L20
    }

    private static boolean a(File file)
    {
        if (file != null && file.isDirectory())
        {
            file = file.list();
            if (file != null && file.length > 0)
            {
                return false;
            }
        }
        return true;
    }

    private boolean a(File file, boolean flag)
    {
        boolean flag1;
        boolean flag2;
        flag1 = true;
        flag2 = true;
        if (file != null) goto _L2; else goto _L1
_L1:
        return flag2;
_L2:
        if (!file.isDirectory()) goto _L4; else goto _L3
_L3:
        File afile[];
        int i1;
        int j1;
        afile = file.listFiles();
        j1 = afile.length;
        i1 = 0;
        flag1 = true;
_L5:
        if (i1 < j1)
        {
            break MISSING_BLOCK_LABEL_58;
        }
_L4:
        flag2 = flag1;
        if (flag)
        {
            return flag1 & file.delete();
        }
          goto _L1
        boolean flag3 = a(afile[i1], true);
        i1++;
        flag1 = flag3 & flag1;
          goto _L5
    }

    private static boolean a(ArrayList arraylist)
    {
        if (arraylist != null)
        {
            int k1 = arraylist.size();
            int j1 = 0;
            int i1 = 0;
            do
            {
                if (j1 >= k1)
                {
                    if (i1 == k1)
                    {
                        return true;
                    }
                    break;
                }
                n n1 = (n)arraylist.get(j1);
                if (n1 != null && n1.b())
                {
                    i1++;
                }
                j1++;
            } while (true);
        }
        return false;
    }

    public static void b(float f1)
    {
        com/yume/android/sdk/U;
        JVM INSTR monitorenter ;
        v += f1;
        com/yume/android/sdk/U;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(Q q1)
    {
        g g1 = q1.f();
        if (!g1.i && !g1.k)
        {
            a(q1, YuMeSDKInterfaceImpl.j.b(g1.c), ((String) (null)));
        }
        YuMeSDKInterfaceImpl.h.a(false);
        a(g1);
    }

    private void b(Q q1, YuMeAdBlockType yumeadblocktype)
    {
        g g1 = q1.f();
        ArrayList arraylist;
        int i1;
        int j1;
        int k1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (g1 != null)
        {
            flag2 = g1.k;
        } else
        {
            flag2 = false;
        }
        if (com.yume.android.sdk.p.h() <= 0.0F)
        {
            break MISSING_BLOCK_LABEL_445;
        }
        arraylist = new ArrayList();
        if (flag2) goto _L2; else goto _L1
_L1:
        k1 = ah.c;
        i1 = a(q1, k1, arraylist);
        if (i1 == -1) goto _L4; else goto _L3
_L3:
        if (i1 != 0) goto _L6; else goto _L5
_L5:
        a(q1, k1);
        a(q1, yumeadblocktype, true);
_L7:
        return;
_L6:
        flag1 = a(i1, arraylist);
        j1 = 0;
        break MISSING_BLOCK_LABEL_92;
_L4:
        j1 = 1;
        flag1 = false;
        i1 = j1;
        flag = flag1;
        if (!flag1)
        {
            k1 = ah.b;
            arraylist.clear();
            i1 = a(q1, k1, arraylist);
            if (i1 != -1)
            {
                if (i1 == 0)
                {
                    a(q1, k1);
                    a(q1, yumeadblocktype, true);
                    return;
                }
                flag = a(i1, arraylist);
                i1 = j1;
            } else
            {
                i1 = j1 + 1;
                flag = flag1;
            }
        }
        if (!flag)
        {
            k1 = ah.a;
            arraylist.clear();
            j1 = a(q1, k1, arraylist);
            if (j1 != -1)
            {
                if (j1 == 0)
                {
                    a(q1, k1);
                    a(q1, yumeadblocktype, true);
                    return;
                }
                flag = a(j1, arraylist);
                j1 = i1;
                i1 = k1;
            } else
            {
                j1 = i1 + 1;
                i1 = k1;
            }
        } else
        {
            j1 = i1;
            i1 = k1;
        }
_L8:
        if (j1 == 3 || flag2)
        {
            arraylist.clear();
            i1 = a(q1, 0, arraylist);
            if (i1 == 0)
            {
                a(q1, 0);
                a(q1, yumeadblocktype, true);
                return;
            }
            flag = a(i1, arraylist);
            i1 = 0;
        }
_L9:
        if (!flag)
        {
            e.c("Storage Space Not Available (or) Storage Space Available Insufficent for downloading Playlist Assets.");
            if (g1 != null && !g1.i && !flag2)
            {
                a(q1, YuMeSDKInterfaceImpl.j.b(g1.c), ((String) (null)));
            }
            YuMeSDKInterfaceImpl.h.a(false);
            a(g1);
            a(YuMeDownloadStatus.DOWNLOADS_NOT_IN_PROGRESS);
            if (i != null)
            {
                i.a(S.b);
                return;
            }
        } else
        {
            a(q1, i1, yumeadblocktype);
            return;
        }
          goto _L7
_L2:
        j1 = 0;
        i1 = 0;
        flag = false;
          goto _L8
        i1 = 0;
        flag = false;
          goto _L9
    }

    private static void b(Q q1, YuMeAdBlockType yumeadblocktype, boolean flag)
    {
        if (flag)
        {
            q1 = ah.a(q1.c(), yumeadblocktype);
        } else
        {
            q1 = ah.a(q1.d(), yumeadblocktype);
        }
        if (flag)
        {
            YuMeSDKInterfaceImpl.k.a(q1, au.b);
            return;
        } else
        {
            YuMeSDKInterfaceImpl.k.a(q1, au.a);
            return;
        }
    }

    public static void b(YuMeAdBlockType yumeadblocktype, boolean flag)
    {
        if (YuMeSDKInterfaceImpl.h.a())
        {
            E.a(yumeadblocktype, flag);
            if (!YuMeSDKInterfaceImpl.b.bEnableCaching.booleanValue())
            {
                YuMeSDKInterfaceImpl.h.a(false);
            } else
            if (flag)
            {
                YuMeSDKInterfaceImpl.h.a(false);
                return;
            }
        }
    }

    private void c(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (k != null) goto _L2; else goto _L1
_L1:
        int j1 = i1 * 1000;
        if (j1 <= 0) goto _L4; else goto _L3
_L3:
        e.b((new StringBuilder("Starting Ad Expiry Timer: Interval (secs): ")).append(i1).toString());
        k = new Timer();
        k.schedule(new V(this), j1);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        e.c((new StringBuilder("Invalid Ad Expiry Time Interval: ")).append(i1).toString());
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    private void c(Q q1)
    {
        x = q1;
        if (x != null)
        {
            q1 = x.f();
            t();
            b(x, a, true);
            x.a(S.g);
            N.a = ((g) (q1)).l;
            YuMeSDKInterfaceImpl.l.a(q1);
        }
    }

    private ArrayList d(YuMeAdBlockType yumeadblocktype)
    {
        switch (z()[yumeadblocktype.ordinal()])
        {
        default:
            return null;

        case 2: // '\002'
            return f;

        case 3: // '\003'
            return g;

        case 4: // '\004'
            return h;
        }
    }

    private void d(int i1)
    {
        this;
        JVM INSTR monitorenter ;
        if (l != null) goto _L2; else goto _L1
_L1:
        int j1 = i1 * 1000;
        if (j1 <= 0) goto _L4; else goto _L3
_L3:
        e.b((new StringBuilder("Starting Prefetch Request Callback Timer: Interval (secs): ")).append(i1).toString());
        l = new Timer();
        l.schedule(new W(this), j1);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L4:
        e.c((new StringBuilder("Invalid Prefetch Request Callback Time Interval: ")).append(i1).toString());
        if (true) goto _L2; else goto _L5
_L5:
        Exception exception;
        exception;
        throw exception;
    }

    private void e(int i1)
    {
        g g1;
label0:
        {
            g1 = null;
            if (i != null)
            {
                g1 = i.f();
            }
            if (g1 != null && g1.j)
            {
                if (i1 > 0)
                {
                    break label0;
                }
                YuMeSDKInterfaceImpl.k.a(ay.m, g1.e);
            }
            return;
        }
        YuMeSDKInterfaceImpl.k.a(ay.k, g1.e);
    }

    private void q()
    {
        if (f != null)
        {
            Q q1 = (Q)f.get(0);
            if (q1 != null && q1.h() != S.h)
            {
                q1.a(S.h);
                e.b("Preroll Ad marked as Served.");
            }
        }
    }

    private void r()
    {
        if (g != null)
        {
            Q q1 = (Q)g.get(0);
            if (q1 != null && q1.h() != S.h)
            {
                q1.a(S.h);
                e.b("Midroll Ad marked as Served.");
            }
        }
    }

    private void s()
    {
        if (h != null)
        {
            Q q1 = (Q)h.get(0);
            if (q1 != null && q1.h() != S.h)
            {
                q1.a(S.h);
                e.b("Postroll Ad marked as Served.");
            }
        }
    }

    private void t()
    {
        this;
        JVM INSTR monitorenter ;
        if (k != null)
        {
            e.b("Stopping Ad Expiry Timer.");
            k.cancel();
            k = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void u()
    {
        this;
        JVM INSTR monitorenter ;
        if (l != null)
        {
            e.b("Stopping Prefetch Request Callback Timer.");
            l.cancel();
            l = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void v()
    {
        this;
        JVM INSTR monitorenter ;
        if (YuMeSDKInterfaceImpl.b.bEnableAutoPrefetch.booleanValue()) goto _L2; else goto _L1
_L1:
        e.b("Auto Prefetching Disabled.");
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (m != null) goto _L4; else goto _L3
_L3:
        int i1;
        i1 = o;
        if (o < 128)
        {
            o = o << 1;
        }
        int j1;
        j1 = i1 * 1000;
        if (j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        e.b((new StringBuilder("Starting Auto Prefetch Timer: Interval (secs): ")).append(i1).toString());
        m = new Timer();
        m.schedule(new X(this), j1);
          goto _L4
        Exception exception;
        exception;
        throw exception;
        e.c((new StringBuilder("Invalid Auto Prefetch Time Interval: ")).append(i1).toString());
          goto _L4
    }

    private void w()
    {
        this;
        JVM INSTR monitorenter ;
        if (m != null)
        {
            e.b("Stopping Auto Prefetch Timer.");
            m.cancel();
            m = null;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private float x()
    {
        float f1;
        float f2;
        float f4;
        File file;
        f4 = 0.0F;
        f2 = 0.0F;
        file = r;
        f1 = f4;
        if (file == null) goto _L2; else goto _L1
_L1:
        f1 = f4;
        if (!file.isDirectory()) goto _L2; else goto _L3
_L3:
        File afile[];
        int i1;
        int j1;
        afile = file.listFiles();
        j1 = afile.length;
        i1 = 0;
        f1 = f2;
_L6:
        if (i1 < j1) goto _L4; else goto _L2
_L2:
        return f1;
_L4:
        float f3 = afile[i1].length();
        i1++;
        f1 = f3 + f1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    private void y()
    {
        if (i == null) goto _L2; else goto _L1
_L1:
        Q q1;
        YuMeAdBlockType yumeadblocktype;
        w();
        q1 = i;
        yumeadblocktype = a;
        q1.a(S.b);
        z()[yumeadblocktype.ordinal()];
        JVM INSTR tableswitch 2 4: default 64
    //                   2 65
    //                   3 122
    //                   4 157;
           goto _L3 _L4 _L5 _L6
_L3:
        return;
_L4:
        f = null;
        f = new ArrayList();
        if (f != null)
        {
            f.add(q1);
        }
_L8:
        g g1;
        g1 = q1.f();
        if (g1 == null)
        {
            a(yumeadblocktype, "Empty Ad Received.");
            d(q1.e());
            return;
        }
        break; /* Loop/switch isn't completed */
_L5:
        g = null;
        g = new ArrayList();
        if (g != null)
        {
            g.add(q1);
        }
        continue; /* Loop/switch isn't completed */
_L6:
        h = null;
        h = new ArrayList();
        if (h != null)
        {
            h.add(q1);
        }
        if (true) goto _L8; else goto _L7
_L7:
        if (g1.k)
        {
            g1.g = YuMeSDKInterfaceImpl.j.a(g1);
            boolean flag;
            if (g1.g != null)
            {
                e.b((new StringBuilder("Selected Image Url: ")).append(g1.g).toString());
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = YuMeSDKInterfaceImpl.j.a(g1, true);
        }
        if (!flag)
        {
            a(yumeadblocktype, "Unsupported Ad Received.");
            q1.a(S.d);
            v();
            return;
        }
        g();
        g1.h = true;
        b(yumeadblocktype, false);
        if (!YuMeSDKInterfaceImpl.b.bEnableCaching.booleanValue())
        {
            e.b("Caching disabled. Not proceeding with asset downloads.");
            if (!g1.i && !g1.k)
            {
                a(q1, YuMeSDKInterfaceImpl.j.b(g1.c), ((String) (null)));
            }
            a(g1);
            return;
        } else
        {
            a(q1, yumeadblocktype);
            return;
        }
_L2:
        a(a, "Unsupported Ad Received.");
        v();
        return;
    }

    private static int[] z()
    {
        int ai[] = y;
        if (ai != null)
        {
            return ai;
        }
        ai = new int[YuMeAdBlockType.values().length];
        try
        {
            ai[YuMeAdBlockType.MIDROLL.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            ai[YuMeAdBlockType.NONE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            ai[YuMeAdBlockType.POSTROLL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            ai[YuMeAdBlockType.PREROLL.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror) { }
        y = ai;
        return ai;
    }

    public final Q a(YuMeAdBlockType yumeadblocktype)
    {
        yumeadblocktype = d(yumeadblocktype);
        if (yumeadblocktype == null)
        {
            return null;
        }
        yumeadblocktype = (Q)yumeadblocktype.get(0);
        if (yumeadblocktype == null || yumeadblocktype.h() == S.h)
        {
            yumeadblocktype = null;
        }
        return yumeadblocktype;
    }

    public final ArrayList a()
    {
        return j;
    }

    public final void a(int i1)
    {
        a(YuMeDownloadStatus.DOWNLOADS_NOT_IN_PROGRESS);
        if (i != null)
        {
            i.a(S.d);
        }
        YuMeSDKInterfaceImpl.h.a(false);
        E.a(a);
        E.a("Assets Download Failed.");
        E.a(YuMeAdBlockType.NONE);
        e(i1);
        v();
    }

    public final void a(Q q1)
    {
        i = q1;
        y();
    }

    public final void a(YuMeAdBlockType yumeadblocktype, int i1)
    {
        if (i1 <= 0) goto _L2; else goto _L1
_L1:
        a(yumeadblocktype, "Ad Error.");
_L4:
        a = yumeadblocktype;
        v();
        return;
_L2:
        if (!YuMeSDKInterfaceImpl.b.bEnableAutoPrefetch.booleanValue())
        {
            a(yumeadblocktype, "Ad Error.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(YuMeAdBlockType yumeadblocktype, boolean flag)
    {
        if (flag)
        {
            f = null;
            g = null;
            h = null;
            i = null;
            return;
        }
        i = null;
        switch (z()[yumeadblocktype.ordinal()])
        {
        default:
            return;

        case 2: // '\002'
            f = null;
            r();
            s();
            return;

        case 3: // '\003'
            g = null;
            q();
            s();
            return;

        case 4: // '\004'
            h = null;
            break;
        }
        q();
        r();
    }

    public final void a(String s1, YuMeAdBlockType yumeadblocktype)
    {
        a = yumeadblocktype;
        t = false;
        u = false;
        if (YuMeSDKInterfaceImpl.m != null)
        {
            i = YuMeSDKInterfaceImpl.m.b(s1);
            y();
        } else
        if (YuMeSDKInterfaceImpl.n != null)
        {
            YuMeSDKInterfaceImpl.n.d = true;
            YuMeSDKInterfaceImpl.n.a(s1, true, yumeadblocktype);
            return;
        }
    }

    public final void a(String s1, YuMeAdBlockType yumeadblocktype, long l1)
    {
        if (!t)
        {
            if (yumeadblocktype == YuMeAdBlockType.PREROLL)
            {
                a(f, s1, yumeadblocktype, l1);
                return;
            }
            if (yumeadblocktype == YuMeAdBlockType.MIDROLL)
            {
                a(g, s1, yumeadblocktype, l1);
                return;
            }
            if (yumeadblocktype == YuMeAdBlockType.POSTROLL)
            {
                a(h, s1, yumeadblocktype, l1);
                return;
            }
        }
    }

    public final void a(String s1, YuMeAdBlockType yumeadblocktype, boolean flag)
    {
        if (!u)
        {
            if (yumeadblocktype == YuMeAdBlockType.PREROLL)
            {
                a(f, s1, yumeadblocktype, flag);
                return;
            }
            if (yumeadblocktype == YuMeAdBlockType.MIDROLL)
            {
                a(g, s1, yumeadblocktype, flag);
                return;
            }
            if (yumeadblocktype == YuMeAdBlockType.POSTROLL)
            {
                a(h, s1, yumeadblocktype, flag);
                return;
            }
        }
    }

    final void a(String s1, String s2)
    {
        c = s1;
        d = s2;
    }

    public final void a(boolean flag)
    {
        if (p != YuMeDownloadStatus.DOWNLOADS_IN_PROGRESS && p != YuMeDownloadStatus.DOWNLOADS_PAUSED)
        {
            e.b("No Downloads to be Aborted.");
        } else
        {
            YuMeSDKInterfaceImpl.f.a(false, false);
            a(YuMeDownloadStatus.DOWNLOADS_NOT_IN_PROGRESS);
            if (!a(q, false))
            {
                e.c("Error clearing downloading directory.");
            }
            if (i != null && !flag)
            {
                i.a(S.i);
                return;
            }
        }
    }

    public final YuMeDownloadStatus b()
    {
        return p;
    }

    public final void b(int i1)
    {
        a(YuMeDownloadStatus.DOWNLOADS_NOT_IN_PROGRESS);
        if (i != null)
        {
            i.a(S.d);
        }
        YuMeSDKInterfaceImpl.h.a(false);
        E.a(a);
        E.a("Assets Download Failed.");
        E.a(YuMeAdBlockType.NONE);
        e(i1);
        v();
    }

    public final void b(YuMeAdBlockType yumeadblocktype)
    {
        while (p == YuMeDownloadStatus.DOWNLOADS_IN_PROGRESS || yumeadblocktype == YuMeAdBlockType.NONE || a == YuMeAdBlockType.NONE || a != yumeadblocktype || i == null || i.h() == S.e) 
        {
            return;
        }
        e.b("Initiating asset downloads...");
        a(i, yumeadblocktype);
    }

    final void c()
    {
        t();
        if (i != null)
        {
            e.b("Marking Ad as Expired.");
            i.a(S.f);
            E.b(a);
        }
    }

    public final void c(float f1)
    {
        b = f1;
    }

    public final boolean c(YuMeAdBlockType yumeadblocktype)
    {
        Q q1;
        S s1;
        boolean flag;
        flag = true;
        q1 = a(yumeadblocktype);
        if (q1 == null)
        {
            e.b("Ad Not Present.");
            YuMeSDKInterfaceImpl.h.b(yumeadblocktype);
            return false;
        }
        if (q1.f() == null)
        {
            e.b("Ad Present and Empty.");
            b(q1, yumeadblocktype, false);
            return false;
        }
        s1 = q1.h();
        A()[s1.ordinal()];
        JVM INSTR tableswitch 2 10: default 120
    //                   2 136
    //                   3 213
    //                   4 333
    //                   5 235
    //                   6 285
    //                   7 253
    //                   8 269
    //                   9 315
    //                   10 355;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10
_L1:
        e.c("Unknown Playlist State.");
        flag = false;
_L12:
        return flag;
_L2:
        if (!YuMeSDKInterfaceImpl.b.bEnableCaching.booleanValue())
        {
            e.b("Ad Present and Not Expired (Caching Disabled).");
            c(q1);
        } else
        if (k != null)
        {
            e.b("Ad Present and Not Expired (Caching Enabled but Assets not cached).");
            c(q1);
        } else
        {
            e.b("Ad Present and Asset Download Attempt In Progress.");
            b(q1, yumeadblocktype, true);
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        e.b("Ad Present and Download In Progress.");
        b(q1, yumeadblocktype, true);
        flag = false;
        continue; /* Loop/switch isn't completed */
_L5:
        e.b("Ad Present and Not Expired (Caching Enabled).");
        c(q1);
        continue; /* Loop/switch isn't completed */
_L7:
        e.b("Ad Present but Playing already in progress.");
        flag = false;
        continue; /* Loop/switch isn't completed */
_L8:
        e.b("Ad Present but it is already Played.");
        flag = false;
        continue; /* Loop/switch isn't completed */
_L6:
        e.b("Ad Present but Expired.");
        b(q1, yumeadblocktype, false);
        YuMeSDKInterfaceImpl.h.a(yumeadblocktype, false);
        flag = false;
        continue; /* Loop/switch isn't completed */
_L9:
        e.b("Ad Present but Asset Download Aborted.");
        c(q1);
        continue; /* Loop/switch isn't completed */
_L4:
        e.b("Ad Present and Asset Download could not be Completed.");
        b(q1, yumeadblocktype, true);
        flag = false;
        continue; /* Loop/switch isn't completed */
_L10:
        e.b("Ad Present but Asset Download Paused.");
        b(q1, yumeadblocktype, true);
        flag = false;
        if (true) goto _L12; else goto _L11
_L11:
    }

    final void d()
    {
        u();
        YuMeSDKInterfaceImpl.h.a(a, true);
    }

    final void e()
    {
        w();
        YuMeSDKInterfaceImpl.h.a(a, false);
    }

    public final void f()
    {
        t();
        u();
        w();
    }

    public final void g()
    {
        if (o != n)
        {
            e.b((new StringBuilder("Resetting Auto Prefetch Timer to its Default Value: ")).append(n).toString());
            o = n;
        }
    }

    public final void h()
    {
        if (p != YuMeDownloadStatus.DOWNLOADS_IN_PROGRESS)
        {
            e.b("No Downloads to be Paused.");
        } else
        {
            F f1 = YuMeSDKInterfaceImpl.f;
            if (f1.b != null && f1.c != null)
            {
                f1.a.b("Pausing Asset Downloads...");
                (new Thread(new J(f1))).start();
            }
            a(YuMeDownloadStatus.DOWNLOADS_PAUSED);
            if (i != null)
            {
                i.a(S.j);
                return;
            }
        }
    }

    public final void i()
    {
        if (p != YuMeDownloadStatus.DOWNLOADS_PAUSED)
        {
            e.b("No Downloads to be Resumed.");
            return;
        }
        if (i != null)
        {
            i.a(S.c);
        }
        F f1 = YuMeSDKInterfaceImpl.f;
        if (f1.b != null && f1.c != null)
        {
            f1.a.b("Resuming Asset Downloads...");
            (new Thread(new K(f1))).start();
        }
        a(YuMeDownloadStatus.DOWNLOADS_IN_PROGRESS);
    }

    public final void j()
    {
        boolean flag;
        boolean flag1;
        f();
        g();
        YuMeSDKInterfaceImpl.f.a(false, false);
        p();
        flag = a(q);
        flag1 = a(r);
        if (!flag || !flag1) goto _L2; else goto _L1
_L1:
        e.b("No Cache to be cleared.");
_L4:
        a(a, true);
        j = null;
        if (p == YuMeDownloadStatus.DOWNLOADS_IN_PROGRESS)
        {
            a(YuMeDownloadStatus.DOWNLOADS_NOT_IN_PROGRESS);
        }
        if (a != YuMeAdBlockType.NONE)
        {
            YuMeSDKInterfaceImpl.h.a(a, false);
        }
        return;
_L2:
        if (!flag)
        {
            flag = a(q, false);
            if (!flag)
            {
                e.c("Error clearing downloading directory.");
            }
        } else
        {
            flag = false;
        }
        if (!flag1)
        {
            boolean flag2 = a(r, false);
            flag1 = flag2;
            if (!flag2)
            {
                e.c("Error clearing downloaded directory.");
                flag1 = flag2;
            }
        } else
        {
            flag1 = false;
        }
        if (flag || flag1)
        {
            e.b("Cache Cleared.");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void k()
    {
        if (a == YuMeAdBlockType.NONE)
        {
            return;
        } else
        {
            f();
            g();
            YuMeSDKInterfaceImpl.f.a(false, false);
            q();
            r();
            s();
            a(YuMeDownloadStatus.DOWNLOADS_NOT_IN_PROGRESS);
            return;
        }
    }

    public final void l()
    {
        if (a == YuMeAdBlockType.NONE)
        {
            return;
        } else
        {
            f();
            g();
            YuMeSDKInterfaceImpl.f.a(false, false);
            YuMeSDKInterfaceImpl.k.g();
            a(a, true);
            return;
        }
    }

    public final float m()
    {
        int i1;
        int k1;
        k1 = 0;
        i1 = 0;
        if (i != null && t) goto _L2; else goto _L1
_L1:
        return 0.0F;
_L2:
        if (p == YuMeDownloadStatus.DOWNLOADS_IN_PROGRESS || p == YuMeDownloadStatus.DOWNLOADS_PAUSED)
        {
            break; /* Loop/switch isn't completed */
        }
        if (i.h() == S.e)
        {
            return 100F;
        }
        if (true) goto _L1; else goto _L3
_L3:
        ArrayList arraylist;
        int j1;
        int l1;
        int i2;
        arraylist = i.g();
        if (arraylist == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        i2 = arraylist.size();
        l1 = 0;
        j1 = 0;
_L6:
        if (l1 < i2) goto _L5; else goto _L4
_L4:
        float f1;
        Object obj;
        File file;
        if (j1 > 0)
        {
            f1 = ((float)i1 / (float)j1) * 100F;
        } else
        {
            f1 = 0.0F;
        }
        return f1;
_L5:
label0:
        {
            obj = (n)arraylist.get(l1);
            k1 = j1;
            if (obj == null)
            {
                break label0;
            }
            k1 = j1;
            if (!((n) (obj)).d())
            {
                break label0;
            }
            j1 = (int)((long)j1 + ((n) (obj)).e());
            obj = com.yume.android.sdk.q.b(((n) (obj)).a());
            k1 = j1;
            if (obj == null)
            {
                break label0;
            }
            file = new File(r, ((String) (obj)));
            if (file.exists())
            {
                i1 = (int)((long)i1 + file.length());
            } else
            {
                obj = new File(q, ((String) (obj)));
                k1 = j1;
                if (!((File) (obj)).exists())
                {
                    break label0;
                }
                i1 = (int)((long)i1 + ((File) (obj)).length());
            }
        }
_L7:
        l1++;
          goto _L6
        j1 = k1;
          goto _L7
        j1 = 0;
        i1 = k1;
          goto _L4
    }

    final void n()
    {
        if (i != null)
        {
            i.a(S.h);
        }
    }

    final void o()
    {
        S s1;
        if (i != null)
        {
            s1 = i.h();
            break MISSING_BLOCK_LABEL_15;
        }
        do
        {
            return;
        } while (s1 == S.i || s1 != S.c);
        e.b("Setting Playlist State as ABORTED as external storage is removed.");
        YuMeSDKInterfaceImpl.f.a(false, true);
        i.a(S.i);
    }

    final boolean p()
    {
        YuMeSDKInterfaceImpl.k.e();
        if (c != null)
        {
            q = new File(c);
        }
        if (d != null)
        {
            r = new File(d);
        }
        return q != null && r != null;
    }

}
