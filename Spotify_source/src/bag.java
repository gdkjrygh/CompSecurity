// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;

public final class bag
    implements baf
{

    private final bdb a;
    private final int b;

    public bag(bdb bdb1, int i)
    {
        a = bdb1;
        b = i;
    }

    public final void a(List list, long l, bad abad[], bah bah1)
    {
        bad bad1;
        int i;
        boolean flag;
        long l1;
        bad bad2;
        long l2;
        if (list.isEmpty())
        {
            l1 = 0L;
        } else
        {
            l1 = ((bak)list.get(list.size() - 1)).g - l;
        }
        bad1 = bah1.c;
        l2 = a.a();
        if (l2 == -1L)
        {
            l2 = b;
        } else
        {
            l2 = (long)((float)l2 * 0.75F);
        }
        i = 0;
_L9:
        if (i >= abad.length) goto _L2; else goto _L1
_L1:
        bad2 = abad[i];
        if ((long)bad2.c > l2) goto _L4; else goto _L3
_L3:
        abad = bad2;
_L10:
        if (abad != null && bad1 != null && ((bad) (abad)).c > bad1.c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (abad != null && bad1 != null && ((bad) (abad)).c < bad1.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (i == 0) goto _L6; else goto _L5
_L5:
        if (l1 >= 0x3d0900L) goto _L8; else goto _L7
_L7:
        list = bad1;
_L11:
        if (bad1 != null && list != bad1)
        {
            bah1.b = 3;
        }
        bah1.c = list;
        return;
_L4:
        i++;
          goto _L9
_L2:
        abad = abad[abad.length - 1];
          goto _L10
_L8:
        if (l1 < 0x17d7840L)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        i = 1;
_L12:
label0:
        {
            if (i >= list.size())
            {
                break MISSING_BLOCK_LABEL_378;
            }
            bak bak1 = (bak)list.get(i);
            if (bak1.f - l < 0x17d7840L || bak1.c.c >= ((bad) (abad)).c || bak1.c.e >= ((bad) (abad)).e || bak1.c.e >= 720 || bak1.c.d >= 1280)
            {
                break label0;
            }
            bah1.a = i;
            list = abad;
        }
          goto _L11
        i++;
          goto _L12
        list = abad;
          goto _L11
_L6:
        if (!flag || bad1 == null || l1 < 0x17d7840L)
        {
            break MISSING_BLOCK_LABEL_409;
        }
        list = bad1;
          goto _L11
        list = abad;
          goto _L11
    }
}
