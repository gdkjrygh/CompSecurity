// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class otb
{

    private static final Set a;
    private static final Set b;
    private static final Set c;

    public static ote a(Context context, Uri uri)
    {
        qsw qsw1 = orz.a(context, uri);
        Object obj;
        long l;
        l = qsw1.b();
        obj = osl.a.a(qsw1, null);
        if (!(obj instanceof bbl))
        {
            throw new otd("Not an ISO-14496-12 compatible file");
        }
          goto _L1
_L6:
        if (((context instanceof IOException) || (context.getCause() instanceof IOException)) && !(context instanceof otd))
        {
            throw new otd("Unable to parse file", context);
        }
        break; /* Loop/switch isn't completed */
_L1:
        boolean flag;
        obj = (bbl)obj;
        flag = b.contains(((bbl) (obj)).a);
        boolean flag1 = flag;
        if (flag) goto _L3; else goto _L2
_L2:
        Iterator iterator = ((bbl) (obj)).b.iterator();
_L4:
        flag1 = flag;
        String s;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        s = (String)iterator.next();
        if (c.contains(s))
        {
            flag = true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!flag1)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        qsw1.a(l);
        context = a(context, new baw(qsw1, osl.a), uri).a();
        qsw1.close();
        return context;
        try
        {
            context = String.valueOf(obj);
            throw new otd((new StringBuilder(String.valueOf(context).length() + 27)).append("Unsupported container type ").append(context).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        finally
        {
            qsw1.close();
            throw context;
        }
        if (true) goto _L6; else goto _L5
_L5:
        throw context;
    }

    private static otg a(Context context, baw baw1, Uri uri)
    {
        otg otg1;
        long l1;
label0:
        {
            int l = -1;
            int k = -1;
            otg1 = new otg();
            otg1.a = uri;
            baw1 = baw1.a();
            if (baw1 == null)
            {
                throw new otd("No moov atom found");
            }
            baw1 = baw1.a(bcm);
            int i1 = baw1.size();
            for (int i = 0; i < i1; i++)
            {
                String s = ((bcm)baw1.get(i)).g().g().a;
                if (!a.contains(s))
                {
                    context = String.valueOf(s);
                    if (context.length() != 0)
                    {
                        context = "Unsupported track type found: ".concat(context);
                    } else
                    {
                        context = new String("Unsupported track type found: ");
                    }
                    throw new otd(context);
                }
                if ("vide".equals(s))
                {
                    if (l != -1)
                    {
                        throw new otd("Multiple video tracks are not supported");
                    }
                    l = i;
                }
                if (!"soun".equals(s))
                {
                    continue;
                }
                if (k != -1)
                {
                    throw new otd("Multiple audio tracks are not supported");
                }
                k = i;
            }

            if (l == -1)
            {
                throw new otd("No video tracks found");
            }
            if (k != -1)
            {
                bcm bcm1 = (bcm)baw1.get(k);
                if (!a(bcm1))
                {
                    throw new otd("AudioTrack missing SampleTableBox");
                }
                if (!b(bcm1))
                {
                    throw new otd("AudioTrack SampleTable missing ChunkOffsetBox");
                }
                if (!e(bcm1))
                {
                    throw new otd("AudioTrack missing MediaInformationBox");
                }
                if (!d(bcm1))
                {
                    throw new otd("AudioTrack missing HandlerBox");
                }
            }
            otg1.b = l;
            try
            {
                ota ota1 = osy.a.a();
                ota1.a(context, uri, null);
                ota1.b(l);
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                throw new otd((new StringBuilder(48)).append("MediaExtractor could not find track: ").append(l).toString(), context);
            }
            baw1 = (bcm)baw1.get(l);
            if (!a(((bcm) (baw1))))
            {
                throw new otd("VideoTrack missing SampleTableBox");
            }
            if (!b(baw1))
            {
                throw new otd("VideoTrack SampleTable missing ChunkOffsetBox");
            }
            if (!e(baw1))
            {
                throw new otd("VideoTrack missing MediaInformationBox");
            }
            if (!d(baw1))
            {
                throw new otd("VideoTrack missing HandlerBox");
            }
            context = baw1.g();
            l1 = context.f().c;
            otg1.f = (context.f().d * 1000L * 1000L) / l1;
            baw1 = baw1.e();
            otg1.c = (int)((bcn) (baw1)).i;
            otg1.d = (int)((bcn) (baw1)).j;
            baw1 = ((bcn) (baw1)).h;
            uri = new qvc(((qvc) (baw1)).d, ((qvc) (baw1)).e, ((qvc) (baw1)).f, ((qvc) (baw1)).g, ((qvc) (baw1)).a, ((qvc) (baw1)).b, ((qvc) (baw1)).c, 0.0D, 0.0D);
            int j = 0;
            if (c.c(uri, qvc.h))
            {
                j = 0;
            } else
            if (c.c(uri, qvc.i))
            {
                j = 90;
            } else
            if (c.c(uri, qvc.j))
            {
                j = 180;
            } else
            if (c.c(uri, qvc.k))
            {
                j = 270;
            } else
            {
                baw1 = String.valueOf(baw1);
                orw.b((new StringBuilder(String.valueOf(baw1).length() + 58)).append("track contains rotation matrix other than simple rotation ").append(baw1).toString());
            }
            otg1.e = j;
            context = context.e().e();
            if (context.k() == null)
            {
                break label0;
            }
            baw1 = context.k().a.iterator();
            do
            {
                if (!baw1.hasNext())
                {
                    break label0;
                }
            } while (((bbd)baw1.next()).b == 0);
            throw new otd("B-Frames are not yet supported");
        }
        otg1.g = a(((bca) (context)), l1);
        context = a(((bca) (context)));
        if (context != null)
        {
            if (context.length <= 0)
            {
                throw new otd("VideoTrack has no sync samples");
            }
            if (context[0] != 0)
            {
                throw new otd("First sync sample is not first frame");
            }
        }
        otg1.h = context;
        return otg1;
    }

    private static boolean a(bcm bcm1)
    {
        return bcm1.f() != null;
    }

    private static int[] a(bca bca1)
    {
        bca1 = bca1.j();
        if (bca1 == null)
        {
            return null;
        }
        bca1 = ((bcj) (bca1)).a;
        int ai[] = new int[bca1.length];
        for (int i = 0; i < bca1.length; i++)
        {
            ai[i] = (int)bca1[i] - 1;
        }

        return ai;
    }

    private static long[] a(bca bca1, long l)
    {
        Object obj = bca1.i().a;
        bca1 = ((List) (obj)).iterator();
        int i;
        long l1;
        for (i = 0; bca1.hasNext(); i = (int)((long)i + l1))
        {
            l1 = ((bcl)bca1.next()).a;
            if (l1 < 0L)
            {
                throw new otd("Frame time getCount < 0");
            }
        }

        if (i <= 0)
        {
            throw new otd("Frame count <= 0");
        }
        bca1 = new long[i];
        obj = ((List) (obj)).iterator();
        i = 0;
        long l2 = 0L;
        while (((Iterator) (obj)).hasNext()) 
        {
            bcl bcl1 = (bcl)((Iterator) (obj)).next();
            long l3 = bcl1.a;
            long l4 = bcl1.b;
            if (l4 < 0L)
            {
                throw new otd("Frame time getDelta < 0");
            }
            if (((Iterator) (obj)).hasNext() && l4 == 0L)
            {
                throw new otd("Non-final frame time getDelta == 0");
            }
            l4 = (l4 * 1000L * 1000L) / l;
            while (l3 > 0L) 
            {
                bca1[i] = l2;
                l3--;
                l2 += l4;
                i++;
            }
        }
        return bca1;
    }

    private static boolean b(bcm bcm1)
    {
        return a(bcm1) && bcm1.f().h() != null;
    }

    private static boolean c(bcm bcm1)
    {
        return bcm1.g() != null;
    }

    private static boolean d(bcm bcm1)
    {
        return c(bcm1) && bcm1.g().g() != null;
    }

    private static boolean e(bcm bcm1)
    {
        return c(bcm1) && bcm1.g().e() != null;
    }

    static 
    {
        HashSet hashset = new HashSet();
        a = hashset;
        hashset.add("vide");
        a.add("soun");
        a.add("hint");
        hashset = new HashSet();
        b = hashset;
        hashset.add("mp41");
        b.add("mp42");
        b.add("3gp4");
        b.add("qt  ");
        hashset = new HashSet();
        c = hashset;
        hashset.addAll(b);
        c.add("isom");
        c.add("iso2");
    }
}
