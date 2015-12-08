// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ouj
{

    private static final Set a;
    private final Context b;
    private final File c;
    private final Uri d;
    private final ouk e;
    private final Uri f = null;
    private final float g = 0.0F;
    private final long h = 0L;

    private ouj(Context context, File file, Uri uri, long l, long l1, 
            Uri uri1, float f1, long l2)
    {
        b = context;
        c = context.getCacheDir();
        d = uri;
        e = new ouk(l, l1);
    }

    private static long a(long l, List list)
    {
        list = list.iterator();
        bcl bcl1;
        long l1;
        long l2;
        for (l1 = 0L; list.hasNext(); l1 = ((bcl1.b * 0xf4240L) / l) * l2 + l1)
        {
            bcl1 = (bcl)list.next();
            l2 = bcl1.a;
        }

        return l1;
    }

    private static long a(long al[], long l, long l1, boolean flag)
    {
        int j = Arrays.binarySearch(al, l1);
        int i = j;
        if (j < 0)
        {
            i = Math.max(0, ~j - 1);
        }
        j = i;
        if (!flag)
        {
            j = i + 1;
        }
        if (j < al.length)
        {
            l = al[j];
        }
        return l;
    }

    private Uri a(String s)
    {
        return Uri.fromFile(c).buildUpon().appendPath(s).build();
    }

    private static baw a(Context context, Uri uri)
    {
        context = orz.a(context, uri);
        try
        {
            uri = new baw(context, osl.a);
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            context.close();
            throw uri;
        }
        return uri;
    }

    public static ouj a(Context context, Uri uri, long l, long l1)
    {
        return new ouj(context, null, uri, l, l1, null, 0.0F, 0L);
    }

    private static ouk a(List list, ouk ouk1)
    {
        ouk ouk2 = new ouk(-1L, -1L);
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            qtb qtb1 = (qtb)list.next();
            if (qtb1.b() != null && qtb1.b().length > 0)
            {
                if (ouk2.a != -1L)
                {
                    throw new IOException("Only one track with sync samples is supported");
                }
                long al[] = a(qtb1.b(), qtb1.d.b, qtb1.c);
                long l = a(qtb1.d.b, qtb1.c);
                ouk2.a = a(al, l, ouk1.a, true);
                ouk2.b = a(al, l, ouk1.b, false);
            }
        } while (true);
        if (ouk2.a == -1L || ouk2.b == -1L)
        {
            throw new IOException("Unable to find keyframes to cut at");
        } else
        {
            return ouk2;
        }
    }

    private static qtr a(qtb qtb1, ouk ouk1, ouk ouk2)
    {
        long l7 = qtb1.d.b;
        long l = -1L;
        long l1 = -1L;
        Iterator iterator = qtb1.c.iterator();
        long l3 = 0L;
        long l2 = 0L;
        long l4 = -1L;
        while (iterator.hasNext()) 
        {
            bcl bcl1 = (bcl)iterator.next();
            long l8 = bcl1.a;
            long l9 = (bcl1.b * 0xf4240L) / l7;
            long l5 = l4;
            l4 = l3;
            int i = 0;
            l3 = l2;
            l2 = l1;
            l1 = l;
            l = l4;
            l4 = l1;
            l1 = l3;
            long l6;
            do
            {
                l6 = l5;
                l3 = l4;
                if ((long)i >= l8)
                {
                    break;
                }
                if (l1 <= ouk1.a)
                {
                    l5 = l1;
                    l4 = l;
                }
                l6 = l5;
                l3 = l4;
                if (l1 > ouk1.b)
                {
                    break;
                }
                i++;
                l1 += l9;
                l2 = l;
                l++;
            } while (true);
            l5 = l;
            l4 = l6;
            l6 = l2;
            l2 = l1;
            l = l3;
            l1 = l6;
            l3 = l5;
        }
        qtb1 = new qtr(qtb1, l, l1);
        ouk1 = ((qsy) (qtb1)).a;
        ouk1.clear();
        ouk1.add(new qsz(((ouk2.a - l4) * l7) / 0xf4240L, l7, 1.0D, (double)(ouk2.b - ouk2.a) / 1000000D));
        return qtb1;
    }

    private boolean a(Uri uri)
    {
        try
        {
            b.getContentResolver().openInputStream(uri).close();
        }
        // Misplaced declaration of an exception variable
        catch (Uri uri)
        {
            return false;
        }
        return true;
    }

    private static boolean a(bcm bcm1)
    {
        bcm1 = bcm1.g();
        if (bcm1 == null) goto _L2; else goto _L1
_L1:
        bcm1 = bcm1.e();
        if (bcm1 == null) goto _L2; else goto _L3
_L3:
        bcm1 = bcm1.d().iterator();
_L7:
        if (!bcm1.hasNext()) goto _L5; else goto _L4
_L4:
        baz baz1 = (baz)bcm1.next();
        if (!(baz1 instanceof bay)) goto _L7; else goto _L6
_L6:
        bcm1 = (bay)baz1;
_L8:
        return bcm1 instanceof bcd;
_L5:
        bcm1 = null;
        if (true) goto _L8; else goto _L2
_L2:
        return false;
    }

    private static long[] a(long al[], long l, List list)
    {
        long al1[] = new long[al.length];
        long l2 = 1L;
        long l1 = 0L;
        list = list.iterator();
        int i = 0;
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            bcl bcl1 = (bcl)list.next();
            long l3 = bcl1.a;
            long l4 = (bcl1.b * 0xf4240L) / l;
            for (; i < al.length && l2 <= al[i] && al[i] < l2 + l3; i++)
            {
                al1[i] = (al[i] - l2) * l4 + l1;
            }

            l2 += l3;
            l1 += l3 * l4;
        } while (i != al.length);
        return al1;
    }

    private Uri b()
    {
        Object obj1;
label0:
        {
            boolean flag1;
            if (e.a <= e.b)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p.a(flag1);
            if (e.a >= 0L)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            p.a(flag1);
            if (f != null)
            {
                int i = Arrays.hashCode(new Object[] {
                    d, Long.valueOf(e.a), Long.valueOf(e.b), f, Float.valueOf(g), Long.valueOf(h)
                });
                Object obj2 = (new StringBuilder(15)).append("hash").append(i).toString();
                Object obj = String.valueOf(obj2);
                obj1 = String.valueOf(".audioswap.m4a");
                File file;
                BufferedOutputStream bufferedoutputstream;
                Object obj3;
                boolean flag;
                long l;
                long l1;
                long l2;
                long l3;
                if (((String) (obj1)).length() != 0)
                {
                    obj = ((String) (obj)).concat(((String) (obj1)));
                } else
                {
                    obj = new String(((String) (obj)));
                }
                obj1 = a(((String) (obj)));
                if (a(((Uri) (obj1))))
                {
                    break label0;
                }
                obj = String.valueOf(obj2);
                obj2 = String.valueOf(".audioswap.part.m4a");
                if (((String) (obj2)).length() != 0)
                {
                    obj = ((String) (obj)).concat(((String) (obj2)));
                } else
                {
                    obj = new String(((String) (obj)));
                }
                obj2 = a(((String) (obj)));
                file = new File(((Uri) (obj2)).getPath());
                bufferedoutputstream = new BufferedOutputStream(new FileOutputStream(file));
                l1 = e.b;
                l2 = e.a;
                if (e.a > -1L)
                {
                    l = e.a;
                } else
                {
                    l = 0L;
                }
                l3 = -h;
                flag = false;
                obj = d;
                obj3 = ((bbt)p.a(a(b, (Uri)p.a(d)).a())).a(bcm).iterator();
                do
                {
                    if (!((Iterator) (obj3)).hasNext())
                    {
                        break;
                    }
                    if (a((bcm)((Iterator) (obj3)).next()))
                    {
                        flag = true;
                    }
                } while (true);
                if (!flag)
                {
                    obj = null;
                }
                obj = new oue(b, bufferedoutputstream, ((Uri) (obj)), l, f, l3, g, l1 - l2);
                ((oue) (obj)).start();
                try
                {
                    ((oue) (obj)).join();
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    throw new InterruptedIOException(((InterruptedException) (obj)).toString());
                }
                obj3 = ((oue) (obj)).a;
                if (obj3 != null)
                {
                    obj = String.valueOf(((Exception) (obj3)).toString());
                    if (((String) (obj)).length() != 0)
                    {
                        obj = "AudioMixRenderer failed with exception: ".concat(((String) (obj)));
                    } else
                    {
                        obj = new String("AudioMixRenderer failed with exception: ");
                    }
                    orw.a(((String) (obj)));
                    throw new IOException("AudioMixRenderer failed with exception", ((Throwable) (obj3)));
                }
                bufferedoutputstream.flush();
                bufferedoutputstream.close();
                if (file.renameTo(new File(((Uri) (obj1)).getPath())))
                {
                    break label0;
                }
                obj = String.valueOf(obj2);
                obj1 = String.valueOf(obj1);
                orw.a((new StringBuilder(String.valueOf(obj).length() + 38 + String.valueOf(obj1).length())).append("Failed to rename mixed audio from ").append(((String) (obj))).append(" to ").append(((String) (obj1))).toString());
            }
            return null;
        }
        return ((Uri) (obj1));
    }

    private static boolean b(bcm bcm1)
    {
        bcm1 = bcm1.g();
        if (bcm1 != null)
        {
            bcm1 = bcm1.g();
            if (bcm1 != null)
            {
                return a.contains(((bbo) (bcm1)).a);
            }
        }
        return false;
    }

    public ouo a()
    {
        Object obj1 = null;
        Object obj;
        baw baw1;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        int i;
        if (f != null)
        {
            obj = b();
        } else
        {
            obj = null;
        }
        try
        {
            baw1 = a(b, (Uri)p.a(d));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            baw1 = null;
            continue; /* Loop/switch isn't completed */
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = a(b, ((Uri) (obj)));
_L11:
        obj2 = new ArrayList();
        obj1 = (bbt)p.a(baw1.a());
        obj3 = ((bbt) (obj1)).a(bcm).iterator();
_L6:
        if (!((Iterator) (obj3)).hasNext()) goto _L4; else goto _L3
_L3:
        obj4 = (bcm)((Iterator) (obj3)).next();
        if (!b(((bcm) (obj4)))) goto _L6; else goto _L5
_L5:
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (a(((bcm) (obj4)))) goto _L6; else goto _L8
_L8:
        i = ((List) (obj2)).size();
        ((List) (obj2)).add(new qtb((new StringBuilder(17)).append("track-").append(i).toString(), ((bcm) (obj4)), new baw[0]));
          goto _L6
        obj2;
        obj1 = obj;
        obj = obj2;
_L9:
        if (baw1 != null)
        {
            baw1.close();
        }
        if (obj1 != null)
        {
            ((baw) (obj1)).close();
        }
        throw obj;
_L4:
        obj3 = new ArrayList();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        obj4 = ((baw) (obj)).a();
        if (obj4 == null)
        {
            break MISSING_BLOCK_LABEL_325;
        }
        obj4 = ((bbt) (obj4)).a(bcm).iterator();
        do
        {
            if (!((Iterator) (obj4)).hasNext())
            {
                break;
            }
            obj5 = (bcm)((Iterator) (obj4)).next();
            if (a(((bcm) (obj5))))
            {
                i = ((List) (obj2)).size();
                ((List) (obj3)).add(new qtb((new StringBuilder(17)).append("track-").append(i).toString(), ((bcm) (obj5)), new baw[0]));
            }
        } while (true);
        obj4 = new qta();
        if (e.a != -1L && e.b != -1L)
        {
            obj5 = a(((List) (obj2)), e);
            for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((qta) (obj4)).a(a((qtb)((Iterator) (obj2)).next(), ((ouk) (obj5)), e))) { }
            break MISSING_BLOCK_LABEL_456;
        }
        for (obj2 = ((List) (obj2)).iterator(); ((Iterator) (obj2)).hasNext(); ((qta) (obj4)).a((qtb)((Iterator) (obj2)).next())) { }
        for (obj2 = ((List) (obj3)).iterator(); ((Iterator) (obj2)).hasNext(); ((qta) (obj4)).a((qtb)((Iterator) (obj2)).next())) { }
        obj1 = ((bbt) (obj1)).a(bbu);
        if (!((List) (obj1)).isEmpty())
        {
            obj1 = (bbu)((List) (obj1)).get(0);
            obj4.c = ((bbu) (obj1)).a;
            obj4.b = ((bbu) (obj1)).b;
        }
        obj1 = new ouo(((qta) (obj4)), new qtf(), new Closeable[] {
            baw1, obj
        });
        return ((ouo) (obj1));
        obj;
        if (true) goto _L9; else goto _L2
_L2:
        obj = null;
        if (true) goto _L11; else goto _L10
_L10:
    }

    static 
    {
        HashSet hashset = new HashSet();
        a = hashset;
        hashset.add("vide");
        a.add("soun");
    }
}
