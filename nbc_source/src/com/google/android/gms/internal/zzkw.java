// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            zzkt, zzks

public class zzkw
{

    static Object mBaseCache[];
    static int mBaseCacheSize;
    static Object mTwiceBaseCache[];
    static int mTwiceBaseCacheSize;
    Object mArray[];
    int mHashes[];
    int mSize;

    public zzkw()
    {
        mHashes = zzkt.EMPTY_INTS;
        mArray = zzkt.EMPTY_OBJECTS;
        mSize = 0;
    }

    private static void zza(int ai[], Object aobj[], int i)
    {
        if (ai.length != 8) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorenter ;
        if (mTwiceBaseCacheSize < 10)
        {
            aobj[0] = ((Object) (mTwiceBaseCache));
            break MISSING_BLOCK_LABEL_24;
        }
          goto _L3
_L8:
        mTwiceBaseCache = aobj;
        mTwiceBaseCacheSize++;
_L3:
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorexit ;
        return;
        ai;
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorexit ;
        throw ai;
_L2:
        if (ai.length != 4) goto _L5; else goto _L4
_L4:
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorenter ;
        if (mBaseCacheSize >= 10) goto _L7; else goto _L6
_L6:
        aobj[0] = ((Object) (mBaseCache));
        aobj[1] = ai;
        i = (i << 1) - 1;
        break MISSING_BLOCK_LABEL_134;
_L9:
        mBaseCache = aobj;
        mBaseCacheSize++;
_L7:
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorexit ;
        return;
        ai;
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorexit ;
        throw ai;
        aobj[1] = ai;
        i = (i << 1) - 1;
        while (i >= 2) 
        {
            aobj[i] = null;
            i--;
        }
          goto _L8
_L5:
        return;
        while (i >= 2) 
        {
            aobj[i] = null;
            i--;
        }
          goto _L9
    }

    private void zzbC(int i)
    {
        if (i != 8) goto _L2; else goto _L1
_L1:
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorenter ;
        Object aobj[];
        if (mTwiceBaseCache == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        aobj = mTwiceBaseCache;
        mArray = aobj;
        mTwiceBaseCache = (Object[])(Object[])aobj[0];
        mHashes = (int[])(int[])aobj[1];
        aobj[1] = null;
        aobj[0] = null;
        mTwiceBaseCacheSize--;
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorexit ;
        return;
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorexit ;
_L4:
        mHashes = new int[i];
        mArray = new Object[i << 1];
        return;
        Exception exception;
        exception;
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (i != 4) goto _L4; else goto _L3
_L3:
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorenter ;
        if (mBaseCache == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        exception = ((Exception) (mBaseCache));
        mArray = exception;
        mBaseCache = (Object[])(Object[])exception[0];
        mHashes = (int[])(int[])exception[1];
        exception[1] = null;
        exception[0] = null;
        mBaseCacheSize--;
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorexit ;
        return;
        exception;
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorexit ;
        throw exception;
        com/google/android/gms/internal/zzks;
        JVM INSTR monitorexit ;
          goto _L4
    }

    public void clear()
    {
        if (mSize != 0)
        {
            zza(mHashes, mArray, mSize);
            mHashes = zzkt.EMPTY_INTS;
            mArray = zzkt.EMPTY_OBJECTS;
            mSize = 0;
        }
    }

    public boolean containsKey(Object obj)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        if (indexOfNull() < 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (indexOf(obj, obj.hashCode()) < 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    public boolean containsValue(Object obj)
    {
        return indexOfValue(obj) >= 0;
    }

    public void ensureCapacity(int i)
    {
        if (mHashes.length < i)
        {
            int ai[] = mHashes;
            Object aobj[] = mArray;
            zzbC(i);
            if (mSize > 0)
            {
                System.arraycopy(ai, 0, mHashes, 0, mSize);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, mSize << 1);
            }
            zza(ai, aobj, mSize);
        }
    }

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        int i;
        if (!(obj instanceof Map))
        {
            break MISSING_BLOCK_LABEL_121;
        }
        obj = (Map)obj;
        if (size() != ((Map) (obj)).size())
        {
            return false;
        }
        i = 0;
_L4:
        Object obj1;
        Object obj2;
        Object obj3;
        if (i >= mSize)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = keyAt(i);
        obj2 = valueAt(i);
        obj3 = ((Map) (obj)).get(obj1);
        if (obj2 != null)
        {
            break MISSING_BLOCK_LABEL_91;
        }
        if (obj3 != null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (!((Map) (obj)).containsKey(obj1))
        {
            break MISSING_BLOCK_LABEL_123;
        }
        break MISSING_BLOCK_LABEL_106;
        boolean flag;
        try
        {
            flag = obj2.equals(obj3);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return false;
        }
        if (!flag)
        {
            return false;
        }
        i++;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L1; else goto _L5
_L5:
        return false;
        return false;
    }

    public Object get(Object obj)
    {
        int i;
        if (obj == null)
        {
            i = indexOfNull();
        } else
        {
            i = indexOf(obj, obj.hashCode());
        }
        if (i >= 0)
        {
            return mArray[(i << 1) + 1];
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        int ai[] = mHashes;
        Object aobj[] = mArray;
        int i1 = mSize;
        int i = 1;
        int j = 0;
        int k = 0;
        while (j < i1) 
        {
            Object obj = aobj[i];
            int j1 = ai[j];
            int l;
            if (obj == null)
            {
                l = 0;
            } else
            {
                l = obj.hashCode();
            }
            k += l ^ j1;
            j++;
            i += 2;
        }
        return k;
    }

    int indexOf(Object obj, int i)
    {
        int i1 = mSize;
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        int j = -1;
_L4:
        return j;
_L2:
        int l;
        int k = zzkt.binarySearch(mHashes, i1, i);
        j = k;
        if (k >= 0)
        {
            j = k;
            if (!obj.equals(mArray[k << 1]))
            {
                for (l = k + 1; l < i1 && mHashes[l] == i; l++)
                {
                    if (obj.equals(mArray[l << 1]))
                    {
                        return l;
                    }
                }

                k--;
label0:
                do
                {
label1:
                    {
                        if (k < 0 || mHashes[k] != i)
                        {
                            break label1;
                        }
                        j = k;
                        if (obj.equals(mArray[k << 1]))
                        {
                            break label0;
                        }
                        k--;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ~l;
    }

    int indexOfNull()
    {
        int l = mSize;
        if (l != 0) goto _L2; else goto _L1
_L1:
        int i = -1;
_L4:
        return i;
_L2:
        int k;
        int j = zzkt.binarySearch(mHashes, l, 0);
        i = j;
        if (j >= 0)
        {
            i = j;
            if (mArray[j << 1] != null)
            {
                for (k = j + 1; k < l && mHashes[k] == 0; k++)
                {
                    if (mArray[k << 1] == null)
                    {
                        return k;
                    }
                }

                j--;
label0:
                do
                {
label1:
                    {
                        if (j < 0 || mHashes[j] != 0)
                        {
                            break label1;
                        }
                        i = j;
                        if (mArray[j << 1] == null)
                        {
                            break label0;
                        }
                        j--;
                    }
                } while (true);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ~k;
    }

    int indexOfValue(Object obj)
    {
        Object aobj[];
        int i;
        boolean flag;
        int j;
        i = 1;
        flag = true;
        j = mSize * 2;
        aobj = mArray;
        if (obj != null) goto _L2; else goto _L1
_L1:
        for (i = ((flag) ? 1 : 0); i < j; i += 2)
        {
            if (aobj[i] == null)
            {
                return i >> 1;
            }
        }

          goto _L3
_L4:
        i += 2;
_L2:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        if (obj.equals(aobj[i]))
        {
            return i >> 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return -1;
    }

    public boolean isEmpty()
    {
        return mSize <= 0;
    }

    public Object keyAt(int i)
    {
        return mArray[i << 1];
    }

    public Object put(Object obj, Object obj1)
    {
        int k;
        byte byte0;
        int l;
        byte0 = 8;
        int i;
        if (obj == null)
        {
            i = indexOfNull();
            k = 0;
        } else
        {
            k = obj.hashCode();
            i = indexOf(obj, k);
        }
        if (i >= 0)
        {
            i = (i << 1) + 1;
            obj = mArray[i];
            mArray[i] = obj1;
            return obj;
        }
        l = ~i;
        if (mSize < mHashes.length) goto _L2; else goto _L1
_L1:
        if (mSize < 8) goto _L4; else goto _L3
_L3:
        int j = mSize + (mSize >> 1);
_L6:
        int ai[] = mHashes;
        Object aobj[] = mArray;
        zzbC(j);
        if (mHashes.length > 0)
        {
            System.arraycopy(ai, 0, mHashes, 0, ai.length);
            System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, aobj.length);
        }
        zza(ai, aobj, mSize);
_L2:
        if (l < mSize)
        {
            System.arraycopy(mHashes, l, mHashes, l + 1, mSize - l);
            System.arraycopy(((Object) (mArray)), l << 1, ((Object) (mArray)), l + 1 << 1, mSize - l << 1);
        }
        mHashes[l] = k;
        mArray[l << 1] = obj;
        mArray[(l << 1) + 1] = obj1;
        mSize = mSize + 1;
        return null;
_L4:
        j = byte0;
        if (mSize < 4)
        {
            j = 4;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Object remove(Object obj)
    {
        int i;
        if (obj == null)
        {
            i = indexOfNull();
        } else
        {
            i = indexOf(obj, obj.hashCode());
        }
        if (i >= 0)
        {
            return removeAt(i);
        } else
        {
            return null;
        }
    }

    public Object removeAt(int i)
    {
        int j = 8;
        Object obj = mArray[(i << 1) + 1];
        if (mSize <= 1)
        {
            zza(mHashes, mArray, mSize);
            mHashes = zzkt.EMPTY_INTS;
            mArray = zzkt.EMPTY_OBJECTS;
            mSize = 0;
        } else
        if (mHashes.length > 8 && mSize < mHashes.length / 3)
        {
            if (mSize > 8)
            {
                j = mSize + (mSize >> 1);
            }
            int ai[] = mHashes;
            Object aobj[] = mArray;
            zzbC(j);
            mSize = mSize - 1;
            if (i > 0)
            {
                System.arraycopy(ai, 0, mHashes, 0, i);
                System.arraycopy(((Object) (aobj)), 0, ((Object) (mArray)), 0, i << 1);
            }
            if (i < mSize)
            {
                System.arraycopy(ai, i + 1, mHashes, i, mSize - i);
                System.arraycopy(((Object) (aobj)), i + 1 << 1, ((Object) (mArray)), i << 1, mSize - i << 1);
                return obj;
            }
        } else
        {
            mSize = mSize - 1;
            if (i < mSize)
            {
                System.arraycopy(mHashes, i + 1, mHashes, i, mSize - i);
                System.arraycopy(((Object) (mArray)), i + 1 << 1, ((Object) (mArray)), i << 1, mSize - i << 1);
            }
            mArray[mSize << 1] = null;
            mArray[(mSize << 1) + 1] = null;
            return obj;
        }
        return obj;
    }

    public Object setValueAt(int i, Object obj)
    {
        i = (i << 1) + 1;
        Object obj1 = mArray[i];
        mArray[i] = obj;
        return obj1;
    }

    public int size()
    {
        return mSize;
    }

    public String toString()
    {
        if (isEmpty())
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(mSize * 28);
        stringbuilder.append('{');
        int i = 0;
        while (i < mSize) 
        {
            if (i > 0)
            {
                stringbuilder.append(", ");
            }
            Object obj = keyAt(i);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            stringbuilder.append('=');
            obj = valueAt(i);
            if (obj != this)
            {
                stringbuilder.append(obj);
            } else
            {
                stringbuilder.append("(this Map)");
            }
            i++;
        }
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    public Object valueAt(int i)
    {
        return mArray[(i << 1) + 1];
    }
}
