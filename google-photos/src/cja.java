// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.MediaFormat;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.google.android.apps.moviemaker.media.audio.AudioResampler;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class cja
{

    private static final String a = cja.getSimpleName();

    public cja()
    {
    }

    public static cjk a(cnp cnp1, ckx ckx, cjs cjs, int i)
    {
        ArrayList arraylist;
        int j;
        arraylist = new ArrayList(cnp1.b());
        j = 0;
_L2:
        cnn cnn1;
        if (j >= cnp1.b())
        {
            break; /* Loop/switch isn't completed */
        }
        cnn1 = cnp1.a(j);
        arraylist.add(a(cnn1, new ciu(cnp1.a(j)), ckx, cjs, i));
        j++;
        if (true) goto _L2; else goto _L1
        cnp1;
        for (i = 0; i < j; i++)
        {
            ckx = (cjo)arraylist.get(i);
            dee.a(((cjo) (ckx)).a);
            for (ckx = ((cjo) (ckx)).b.iterator(); ckx.hasNext(); dee.a((AudioResampler)ckx.next())) { }
        }

        throw cnp1;
_L1:
        return new cjk(arraylist, 44100, 2);
    }

    private static cjo a(cnn cnn1, ciu ciu1, ckx ckx, cjs cjs, int i)
    {
        civ aciv[];
        int j;
        boolean flag;
        flag = false;
        aciv = new civ[cnn1.a()];
        j = 0;
_L2:
        Object obj;
        if (j >= cnn1.a())
        {
            break MISSING_BLOCK_LABEL_215;
        }
        obj = new ckg(cjs, cnn1.a(j), i);
        aciv[j] = ((civ) (obj));
        ((ckg) (obj)).c();
        if (((ckg) (obj)).e())
        {
            ciu1.b[j] = (ckg)b.a(obj, "source", null);
            if (((ckj) (obj)).b.a.getInteger("channel-count") > 2)
            {
                throw b.a("Cannot handle audio with more than two channels");
            }
            break MISSING_BLOCK_LABEL_204;
        }
        break MISSING_BLOCK_LABEL_144;
        cnn1;
        for (i = 0; i < aciv.length; i++)
        {
            dee.a(aciv[i]);
            aciv[i] = null;
        }

        break; /* Loop/switch isn't completed */
        aciv[j] = null;
        ((ckg) (obj)).a();
        String s = a;
        obj = String.valueOf(obj);
        Log.w(s, (new StringBuilder(String.valueOf(obj).length() + 50)).append("Omitting an audio source that has no sample data: ").append(((String) (obj))).toString());
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        throw cnn1;
        ArrayList arraylist = new ArrayList(aciv.length);
        int k = aciv.length;
        i = ((flag) ? 1 : 0);
        while (i < k) 
        {
            cjs = aciv[i];
            if (cjs == null)
            {
                cjs = null;
            } else
            {
                cjs = new cjj(ckx, cjs);
            }
            arraylist.add(cjs);
            if (cjs != null)
            {
                ciu1.c.add(b.a(cjs, "releaseable", null));
            }
            i++;
        }
        ckx = new ArrayList(arraylist.size());
        cjs = new ArrayList(arraylist.size());
        a(((List) (ckx)), ((List) (cjs)), cnn1, aciv, ((List) (arraylist)));
        if (ckx.isEmpty() && cnn1.a() != 0)
        {
            throw new cjc();
        } else
        {
            return new cjo(new cjg(ckx), cjs, ciu1, cnn1);
        }
    }

    public static List a(cqn cqn1, ckx ckx, cjd cjd1, cjs cjs, cji cji1, int i)
    {
        ckj ackj[];
        cnq acnq[];
        cnq acnq1[];
        int j;
        ackj = new ckj[cqn1.d()];
        acnq = new cnq[cqn1.d()];
        acnq1 = new cnq[cqn1.d()];
        j = 0;
_L18:
        if (j >= cqn1.d()) goto _L2; else goto _L1
_L1:
        Object obj = cqn1.b(j);
        if (((cnq) (obj)).d != cnt.a && ((cnq) (obj)).d != cnt.e) goto _L4; else goto _L3
_L3:
        obj = new ckg(cjs, ((cnq) (obj)), i);
        ackj[j] = ((ckj) (obj));
        ((ckg) (obj)).d();
        if (!((ckg) (obj)).e()) goto _L6; else goto _L5
_L5:
        cnq cnq1 = cji1.c.b(j);
        if (cnq1.d != cnt.a && cnq1.d != cnt.e)
        {
            cqn1 = String.valueOf(cnq1.d);
            throw b.a((new StringBuilder(String.valueOf(cqn1).length() + 22)).append("Unexpected clip type: ").append(cqn1).toString());
        }
          goto _L7
        cqn1;
          goto _L8
_L7:
        cji1.d[j] = (ckg)b.a(obj, "source", null);
          goto _L9
_L6:
        ackj[j] = null;
        ((ckg) (obj)).a();
        String s = a;
        obj = String.valueOf(obj);
        Log.w(s, (new StringBuilder(String.valueOf(obj).length() + 49)).append("Omitting a video source that has no sample data: ").append(((String) (obj))).toString());
          goto _L9
_L4:
        if (((cnq) (obj)).d != cnt.c) goto _L11; else goto _L10
_L10:
        acnq[j] = ((cnq) (obj));
          goto _L9
_L11:
        if (((cnq) (obj)).d != cnt.d) goto _L13; else goto _L12
_L12:
        acnq1[j] = ((cnq) (obj));
          goto _L9
_L13:
        cqn1 = String.valueOf(((cnq) (obj)).d);
        throw b.a((new StringBuilder(String.valueOf(cqn1).length() + 22)).append("Unexpected clip type: ").append(cqn1).toString());
_L8:
        for (i = 0; i < ackj.length; i++)
        {
            dee.a(ackj[i]);
        }

        throw cqn1;
_L2:
        LinkedList linkedlist;
        cjs = new ckl[cqn1.d()];
        a(((ckl []) (cjs)), acnq, cqn1, cjd1, cji1);
        cjd1 = cji1.a(cqn1);
        linkedlist = new LinkedList();
        i = 0;
_L20:
        if (i >= cqn1.d()) goto _L15; else goto _L14
_L19:
        if (cqn1.b(i).d == cnt.d)
        {
            linkedlist.add(cjd1);
            break MISSING_BLOCK_LABEL_717;
        }
        if (j == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_537;
        }
        linkedlist.add(cjs[i]);
        break MISSING_BLOCK_LABEL_717;
        cqn1;
          goto _L16
        if (!flag || j != 0)
        {
            break MISSING_BLOCK_LABEL_605;
        }
        if (ackj[i].e())
        {
            cjj cjj1 = new cjj(ckx, ackj[i]);
            cji1.b.add(b.a(cjj1, "source", null));
            linkedlist.add(cjj1);
            break MISSING_BLOCK_LABEL_717;
        }
        if (!flag || j == 0)
        {
            break MISSING_BLOCK_LABEL_717;
        }
        throw c.a((new StringBuilder(58)).append("Both video and photo sources available at index").append(i).toString());
_L15:
        if (linkedlist.isEmpty())
        {
            throw new cjc();
        }
          goto _L17
_L16:
        for (i = 0; i < ackj.length; i++)
        {
            dee.a(ackj[i]);
        }

        for (i = 0; i < cjs.length; i++)
        {
            dee.a(cjs[i]);
        }

        dee.a(cjd1);
        throw cqn1;
_L17:
        return linkedlist;
_L9:
        j++;
          goto _L18
_L14:
        boolean flag;
        if (cjs[i] != null)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (ackj[i] != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L19
        i++;
          goto _L20
    }

    private static void a(List list, List list1, cnn cnn1, civ aciv[], List list2)
    {
        HashMap hashmap1 = new HashMap();
        HashMap hashmap2 = new HashMap();
        int i = 0;
        AudioResampler audioresampler = null;
        while (i < list2.size()) 
        {
            cje cje1 = (cje)list2.get(i);
            if (cje1 != null)
            {
                Object obj1 = c.c(aciv[i].b());
                Object obj = (AudioResampler)hashmap1.get(obj1);
                HashMap hashmap;
                long l;
                if (audioresampler == obj && obj != null)
                {
                    obj = (AudioResampler)hashmap2.get(obj1);
                    hashmap = hashmap2;
                } else
                {
                    hashmap = hashmap1;
                }
                audioresampler = ((AudioResampler) (obj));
                if (obj == null)
                {
                    audioresampler = new AudioResampler(aciv[i].b().getInteger("channel-count"), 44100, true);
                    hashmap.put(obj1, audioresampler);
                }
                list1.add(i, audioresampler);
                obj = new cjp(cje1, cnn1.a(i).f);
                l = cnn1.b(i) - cnn1.a(i).f.b;
                if (l != 0L)
                {
                    obj = new cjh(((cje) (obj)), l);
                }
                list.add(i, obj);
            } else
            {
                list.add(i, null);
                list1.add(null);
                audioresampler = null;
            }
            i++;
        }
    }

    private static void a(ckl ackl[], cnq acnq[], cqn cqn1, cjd cjd1, cji cji1)
    {
        ckl ackl1[];
        boolean flag;
        int i;
        long l;
        ackl1 = new ckl[2];
        i = 0;
        l = 0L;
        flag = false;
_L2:
        Object obj;
        cnq cnq1;
        ckl ckl1;
        if (i >= acnq.length)
        {
            break MISSING_BLOCK_LABEL_492;
        }
        if (acnq[i] == null)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        String s;
        int j;
        long l1;
        boolean flag1;
        if (i == 0 || acnq[i - 1] == null || !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            j = 0;
        } else
        {
            j = 1;
        }
        if (ackl1[j] == null)
        {
            ackl1[j] = new ckl(cjd1.a, cjd1.d, cjd1.b, cjd1.c, cjd1.e, cjd1.f);
        }
        ckl1 = ackl1[j];
        cnq1 = acnq[i];
        if (cnq1.d == cnt.c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        b.a(flag1, "clip type must be PHOTO");
        obj = cnq1.e;
        if (b.g())
        {
            break MISSING_BLOCK_LABEL_379;
        }
        s = ckn.a(((nny) (obj)).b, ckl1.b);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_379;
        }
        try
        {
            obj = ParcelFileDescriptor.open(new File(s), 0x10000000);
        }
        // Misplaced declaration of an exception variable
        catch (ckl ackl[])
        {
            acnq = String.valueOf(cnq1.e.b);
            throw new IllegalStateException((new StringBuilder(String.valueOf(acnq).length() + 25)).append("Failed to open photo URI ").append(acnq).toString(), ackl);
        }
        if (ckl1.c.isEmpty())
        {
            ckl1.f = cnq1.f.b;
        }
        ckl1.c.add(cnq1);
        ckl1.d.add(Long.valueOf(l));
        ckl1.e.add(obj);
        if (ckl1.g == null)
        {
            try
            {
                ckl1.g = ckl1.a(((ParcelFileDescriptor) (obj)));
                ckl1.h = cnq1.e.b;
            }
            catch (IOException ioexception)
            {
                Log.e(ckl.a, "preloading photo bitmap", ioexception);
            }
        }
        ackl[i] = ackl1[j];
        l1 = cqn1.b(i).f.a() + l;
        l = l1;
        if (i < cqn1.d() - 1)
        {
            l = l1 - cqn1.d(i).b();
        }
        i++;
        continue; /* Loop/switch isn't completed */
        obj = ParcelFileDescriptor.open((new cln(ckl1.b, ckl1.i, ckl1.j, ((nny) (obj)).a.a)).b(), 0x10000000);
        break MISSING_BLOCK_LABEL_188;
        if (ackl1[0] != null)
        {
            cji1.a(ackl1[0]);
        }
        if (ackl1[1] != null)
        {
            cji1.a(ackl1[1]);
        }
        return;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
