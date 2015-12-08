// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.Timber;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class KH
{

    private static final String TAG = "CbcSlightlySecurePreferences";
    public final Map mPrefKeyToMapMap = new HashMap();
    public KO mSlightlySecurePreferences;

    public KH()
    {
        SnapchatApplication.getDIComponent().a(this);
    }

    public static Map a(byte abyte0[])
    {
        HashMap hashmap = ep.a();
        PR pr;
        abyte0 = ByteBuffer.wrap(abyte0);
        pr = new PR();
        abyte0.order(ByteOrder.LITTLE_ENDIAN);
        pr.a = abyte0.getInt(abyte0.position()) + abyte0.position();
        pr.b = abyte0;
        int i = 0;
_L24:
        int j = pr.a(4);
        if (j == 0) goto _L2; else goto _L1
_L1:
        j = pr.d(j);
_L15:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_408;
        }
        Object obj;
        obj = new PM();
        j = pr.a(4);
        if (j == 0) goto _L4; else goto _L3
_L3:
        j = pr.b(pr.e(j) + (i << 2));
        abyte0 = pr.b;
        obj.a = j;
        obj.b = abyte0;
_L16:
        abyte0 = new PL();
        j = ((PM) (obj)).a(6);
        if (j == 0) goto _L6; else goto _L5
_L5:
        j = ((PM) (obj)).b(j + ((PM) (obj)).a);
        ByteBuffer bytebuffer = ((PM) (obj)).b;
        abyte0.a = j;
        abyte0.b = bytebuffer;
_L17:
        j = ((PM) (obj)).a(4);
        if (j == 0) goto _L8; else goto _L7
_L7:
        obj = ((PM) (obj)).c(j + ((PM) (obj)).a);
_L18:
        j = abyte0.a(4);
        if (j == 0) goto _L10; else goto _L9
_L9:
        String s = abyte0.c(j + ((PL) (abyte0)).a);
_L19:
        j = abyte0.a(6);
        if (j == 0) goto _L12; else goto _L11
_L11:
        String s1 = abyte0.c(j + ((PL) (abyte0)).a);
_L20:
        j = abyte0.a(8);
        if (j == 0) goto _L14; else goto _L13
_L13:
        String s2 = abyte0.c(j + ((PL) (abyte0)).a);
_L21:
        j = abyte0.a(10);
        if (j == 0)
        {
            break MISSING_BLOCK_LABEL_386;
        }
        long l = ((PL) (abyte0)).b.getLong(((PL) (abyte0)).a + j);
_L22:
        hashmap.put(obj, new KF(s, s1, s2, l));
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        j = 0;
          goto _L15
_L4:
        obj = null;
          goto _L16
_L6:
        abyte0 = null;
          goto _L17
_L8:
        obj = null;
          goto _L18
_L10:
        s = null;
          goto _L19
_L12:
        s1 = null;
          goto _L20
_L14:
        s2 = null;
          goto _L21
        l = 0L;
          goto _L22
        abyte0;
        Timber.c("CbcSlightlySecurePreferences", "fail to get map from ssp", new Object[] {
            abyte0
        });
        return hashmap;
        if (true) goto _L24; else goto _L23
_L23:
    }

    public static byte[] a(Map map)
    {
        if (map == null)
        {
            return null;
        }
        eW ew = new eW((byte)0);
        int ai[] = new int[map.size()];
        map = map.entrySet().iterator();
        int i = 0;
        do
        {
            if (!map.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            KF kf = (KF)entry.getValue();
            if (kf.mKey != null && kf.mIv != null)
            {
                int j = ew.a((String)entry.getKey());
                int k = ew.a(kf.mKey);
                int l = ew.a(kf.mIv);
                int i1 = ew.a(dA.a(kf.mThumbnailIv));
                long l1 = kf.mTimestamp;
                ew.b(4);
                if (l1 != 0L)
                {
                    ew.a(8, 0);
                    ByteBuffer bytebuffer = ew.a;
                    int j1 = ew.b - 8;
                    ew.b = j1;
                    bytebuffer.putLong(j1, l1);
                    ew.c(3);
                }
                ew.b(2, i1);
                ew.b(1, l);
                ew.b(0, k);
                k = ew.b();
                ew.b(2);
                ew.b(1, k);
                ew.b(0, j);
                ai[i] = ew.b();
                i++;
            }
        } while (true);
        ew.a(4, ai.length, 4);
        for (i = ai.length - 1; i >= 0; i--)
        {
            ew.a(ai[i]);
        }

        i = ew.a();
        ew.b(1);
        ew.b(0, i);
        ew.d(ew.b());
        return ew.c();
    }

    public final void a(KP kp, Map map)
    {
        mSlightlySecurePreferences.a(kp, a(map));
    }

    public final void a(List list, KP kp)
    {
        HashMap hashmap = new HashMap();
        Bk bk;
        KF kf;
        for (list = list.iterator(); list.hasNext(); hashmap.put(bk.mMediaId, kf))
        {
            bk = (Bk)list.next();
            kf = bk.aE();
        }

        list = a(((Map) (hashmap)));
        mSlightlySecurePreferences.a(kp, list);
    }
}
