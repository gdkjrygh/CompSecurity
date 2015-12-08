// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class FullSpanItem
{

    int a[];
    List b;

    final int a(int i)
    {
        if (b != null)
        {
            for (int j = b.size() - 1; j >= 0; j--)
            {
                class FullSpanItem
                    implements Parcelable
                {

                    public static final android.os.Parcelable.Creator CREATOR = new bp();
                    int a;
                    int b;
                    int c[];
                    boolean d;

                    final int a(int k)
                    {
                        if (c == null)
                        {
                            return 0;
                        } else
                        {
                            return c[k];
                        }
                    }

                    public int describeContents()
                    {
                        return 0;
                    }

                    public String toString()
                    {
                        return (new StringBuilder("FullSpanItem{mPosition=")).append(a).append(", mGapDir=").append(b).append(", mHasUnwantedGapAfter=").append(d).append(", mGapPerSpan=").append(Arrays.toString(c)).append('}').toString();
                    }

                    public void writeToParcel(Parcel parcel, int k)
                    {
                        parcel.writeInt(a);
                        parcel.writeInt(b);
                        if (d)
                        {
                            k = 1;
                        } else
                        {
                            k = 0;
                        }
                        parcel.writeInt(k);
                        if (c != null && c.length > 0)
                        {
                            parcel.writeInt(c.length);
                            parcel.writeIntArray(c);
                            return;
                        } else
                        {
                            parcel.writeInt(0);
                            return;
                        }
                    }


            public FullSpanItem()
            {
            }

            public FullSpanItem(Parcel parcel)
            {
                boolean flag = true;
                super();
                a = parcel.readInt();
                b = parcel.readInt();
                int i;
                if (parcel.readInt() != 1)
                {
                    flag = false;
                }
                d = flag;
                i = parcel.readInt();
                if (i > 0)
                {
                    c = new int[i];
                    parcel.readIntArray(c);
                }
            }
                }

                if (((FullSpanItem)b.get(j)).a >= i)
                {
                    b.remove(j);
                }
            }

        }
        return b(i);
    }

    public final FullSpanItem a(int i, int j, int k)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        FullSpanItem fullspanitem = null;
_L6:
        return fullspanitem;
_L2:
        int l;
        int i1;
        i1 = b.size();
        l = 0;
_L9:
        if (l >= i1) goto _L4; else goto _L3
_L3:
        FullSpanItem fullspanitem1;
        fullspanitem1 = (FullSpanItem)b.get(l);
        if (fullspanitem1.a >= j)
        {
            return null;
        }
        if (fullspanitem1.a < i)
        {
            continue; /* Loop/switch isn't completed */
        }
        fullspanitem = fullspanitem1;
        if (k == 0) goto _L6; else goto _L5
_L5:
        fullspanitem = fullspanitem1;
        if (fullspanitem1.b == k) goto _L6; else goto _L7
_L7:
        fullspanitem = fullspanitem1;
        if (fullspanitem1.d) goto _L6; else goto _L8
_L8:
        l++;
          goto _L9
_L4:
        return null;
    }

    final void a()
    {
        if (a != null)
        {
            Arrays.fill(a, -1);
        }
        b = null;
    }

    final void a(int i, int j)
    {
        if (a != null && i < a.length) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c(i + j);
        System.arraycopy(a, i + j, a, i, a.length - i - j);
        Arrays.fill(a, a.length - j, a.length, -1);
        if (b != null)
        {
            int k = b.size() - 1;
            while (k >= 0) 
            {
                FullSpanItem fullspanitem = (FullSpanItem)b.get(k);
                if (fullspanitem.a >= i)
                {
                    if (fullspanitem.a < i + j)
                    {
                        b.remove(k);
                    } else
                    {
                        fullspanitem.a = fullspanitem.a - j;
                    }
                }
                k--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void a(FullSpanItem fullspanitem)
    {
        if (b == null)
        {
            b = new ArrayList();
        }
        int j = b.size();
        for (int i = 0; i < j; i++)
        {
            FullSpanItem fullspanitem1 = (FullSpanItem)b.get(i);
            if (fullspanitem1.a == fullspanitem.a)
            {
                b.remove(i);
            }
            if (fullspanitem1.a >= fullspanitem.a)
            {
                b.add(i, fullspanitem);
                return;
            }
        }

        b.add(fullspanitem);
    }

    final int b(int i)
    {
        if (a == null)
        {
            return -1;
        }
        if (i >= a.length)
        {
            return -1;
        }
        if (b == null) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        FullSpanItem fullspanitem = d(i);
        if (fullspanitem != null)
        {
            b.remove(fullspanitem);
        }
        k = b.size();
        j = 0;
_L6:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_175;
        }
        if (((FullSpanItem)b.get(j)).a < i) goto _L4; else goto _L3
_L3:
        if (j == -1) goto _L2; else goto _L5
_L5:
        FullSpanItem fullspanitem1 = (FullSpanItem)b.get(j);
        b.remove(j);
        j = fullspanitem1.a;
_L7:
        if (j == -1)
        {
            Arrays.fill(a, i, a.length, -1);
            return a.length;
        } else
        {
            Arrays.fill(a, i, j + 1, -1);
            return j + 1;
        }
_L4:
        j++;
          goto _L6
_L2:
        j = -1;
          goto _L7
        j = -1;
          goto _L3
    }

    final void b(int i, int j)
    {
        if (a != null && i < a.length) goto _L2; else goto _L1
_L1:
        return;
_L2:
        c(i + j);
        System.arraycopy(a, i, a, i + j, a.length - i - j);
        Arrays.fill(a, i, i + j, -1);
        if (b != null)
        {
            int k = b.size() - 1;
            while (k >= 0) 
            {
                FullSpanItem fullspanitem = (FullSpanItem)b.get(k);
                if (fullspanitem.a >= i)
                {
                    fullspanitem.a = fullspanitem.a + j;
                }
                k--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    final void c(int i)
    {
        if (a == null)
        {
            a = new int[Math.max(i, 10) + 1];
            Arrays.fill(a, -1);
        } else
        if (i >= a.length)
        {
            int ai[] = a;
            int j;
            for (j = a.length; j <= i; j *= 2) { }
            a = new int[j];
            System.arraycopy(ai, 0, a, 0, ai.length);
            Arrays.fill(a, ai.length, a.length, -1);
            return;
        }
    }

    public final FullSpanItem d(int i)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        FullSpanItem fullspanitem = null;
_L4:
        return fullspanitem;
_L2:
        int j = b.size() - 1;
label0:
        do
        {
label1:
            {
                if (j < 0)
                {
                    break label1;
                }
                FullSpanItem fullspanitem1 = (FullSpanItem)b.get(j);
                fullspanitem = fullspanitem1;
                if (fullspanitem1.a == i)
                {
                    break label0;
                }
                j--;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
        return null;
    }

    FullSpanItem()
    {
    }
}
