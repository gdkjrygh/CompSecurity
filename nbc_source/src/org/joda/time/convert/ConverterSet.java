// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.convert;


// Referenced classes of package org.joda.time.convert:
//            Converter

class ConverterSet
{
    static class Entry
    {

        final Converter iConverter;
        final Class iType;

        Entry(Class class1, Converter converter)
        {
            iType = class1;
            iConverter = converter;
        }
    }


    private final Converter iConverters[];
    private Entry iSelectEntries[];

    ConverterSet(Converter aconverter[])
    {
        iConverters = aconverter;
        iSelectEntries = new Entry[16];
    }

    private static Converter selectSlow(ConverterSet converterset, Class class1)
    {
        Converter aconverter[];
        Object obj1;
        int i;
        int j;
        obj1 = null;
        aconverter = converterset.iConverters;
        i = aconverter.length;
        j = i;
_L8:
        int l = j - 1;
        if (l < 0) goto _L2; else goto _L1
_L1:
        Object obj;
        Class class3;
        obj = aconverter[l];
        class3 = ((Converter) (obj)).getSupportedType();
        if (class3 != class1) goto _L4; else goto _L3
_L3:
        return ((Converter) (obj));
_L4:
        Converter aconverter1[];
label0:
        {
            if (class3 != null)
            {
                j = i;
                aconverter1 = aconverter;
                obj = converterset;
                if (class1 == null)
                {
                    break label0;
                }
                j = i;
                aconverter1 = aconverter;
                obj = converterset;
                if (class3.isAssignableFrom(class1))
                {
                    break label0;
                }
            }
            obj = converterset.remove(l, null);
            aconverter1 = ((ConverterSet) (obj)).iConverters;
            j = aconverter1.length;
        }
        i = j;
        aconverter = aconverter1;
        converterset = ((ConverterSet) (obj));
        j = l;
        continue; /* Loop/switch isn't completed */
_L2:
        obj = obj1;
        if (class1 == null) goto _L3; else goto _L5
_L5:
        obj = obj1;
        if (i == 0) goto _L3; else goto _L6
_L6:
        int k;
label1:
        {
            if (i == 1)
            {
                return aconverter[0];
            }
            k = i;
            do
            {
                i--;
                if (i < 0)
                {
                    break label1;
                }
                Class class2 = aconverter[i].getSupportedType();
                int i1 = k;
                do
                {
                    int j1 = i1 - 1;
                    if (j1 < 0)
                    {
                        break;
                    }
                    i1 = j1;
                    if (j1 != i)
                    {
                        i1 = j1;
                        if (aconverter[j1].getSupportedType().isAssignableFrom(class2))
                        {
                            converterset = converterset.remove(j1, null);
                            aconverter = converterset.iConverters;
                            k = aconverter.length;
                            i = k - 1;
                            i1 = j1;
                        }
                    }
                } while (true);
            } while (true);
        }
        if (k == 1)
        {
            return aconverter[0];
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Unable to find best converter for type \"");
        stringbuilder.append(class1.getName());
        stringbuilder.append("\" from remaining set: ");
        i = 0;
        while (i < k) 
        {
            converterset = aconverter[i];
            class1 = converterset.getSupportedType();
            stringbuilder.append(converterset.getClass().getName());
            stringbuilder.append('[');
            if (class1 == null)
            {
                converterset = null;
            } else
            {
                converterset = class1.getName();
            }
            stringbuilder.append(converterset);
            stringbuilder.append("], ");
            i++;
        }
        throw new IllegalStateException(stringbuilder.toString());
        if (true) goto _L8; else goto _L7
_L7:
    }

    ConverterSet add(Converter converter, Converter aconverter[])
    {
        Converter aconverter1[] = iConverters;
        int k = aconverter1.length;
        for (int i = 0; i < k; i++)
        {
            Converter converter1 = aconverter1[i];
            if (converter.equals(converter1))
            {
                if (aconverter != null)
                {
                    aconverter[0] = null;
                }
                return this;
            }
            if (converter.getSupportedType() == converter1.getSupportedType())
            {
                Converter aconverter3[] = new Converter[k];
                int j = 0;
                while (j < k) 
                {
                    if (j != i)
                    {
                        aconverter3[j] = aconverter1[j];
                    } else
                    {
                        aconverter3[j] = converter;
                    }
                    j++;
                }
                if (aconverter != null)
                {
                    aconverter[0] = converter1;
                }
                return new ConverterSet(aconverter3);
            }
        }

        Converter aconverter2[] = new Converter[k + 1];
        System.arraycopy(aconverter1, 0, aconverter2, 0, k);
        aconverter2[k] = converter;
        if (aconverter != null)
        {
            aconverter[0] = null;
        }
        return new ConverterSet(aconverter2);
    }

    void copyInto(Converter aconverter[])
    {
        System.arraycopy(iConverters, 0, aconverter, 0, iConverters.length);
    }

    ConverterSet remove(int i, Converter aconverter[])
    {
        Converter aconverter1[] = iConverters;
        int i1 = aconverter1.length;
        if (i >= i1)
        {
            throw new IndexOutOfBoundsException();
        }
        if (aconverter != null)
        {
            aconverter[0] = aconverter1[i];
        }
        aconverter = new Converter[i1 - 1];
        int k = 0;
        int j = 0;
        for (; k < i1; k++)
        {
            if (k != i)
            {
                int l = j + 1;
                aconverter[j] = aconverter1[k];
                j = l;
            }
        }

        return new ConverterSet(aconverter);
    }

    ConverterSet remove(Converter converter, Converter aconverter[])
    {
        Converter aconverter1[];
        int i;
        int j;
        aconverter1 = iConverters;
        j = aconverter1.length;
        i = 0;
_L8:
        if (i >= j) goto _L2; else goto _L1
_L1:
        if (!converter.equals(aconverter1[i])) goto _L4; else goto _L3
_L3:
        converter = remove(i, aconverter);
_L6:
        return converter;
_L4:
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        converter = this;
        if (aconverter == null) goto _L6; else goto _L5
_L5:
        aconverter[0] = null;
        return this;
        if (true) goto _L8; else goto _L7
_L7:
    }

    Converter select(Class class1)
        throws IllegalStateException
    {
        Entry aentry[] = iSelectEntries;
        int j1 = aentry.length;
        int i;
        if (class1 == null)
        {
            i = 0;
        } else
        {
            i = class1.hashCode() & j1 - 1;
        }
        do
        {
            Entry entry = aentry[i];
            if (entry == null)
            {
                break;
            }
            if (entry.iType == class1)
            {
                return entry.iConverter;
            }
            i++;
            if (i >= j1)
            {
                i = 0;
            }
        } while (true);
        Converter converter = selectSlow(this, class1);
        Entry entry1 = new Entry(class1, converter);
        class1 = (Entry[])(Entry[])aentry.clone();
        class1[i] = entry1;
        for (int j = 0; j < j1; j++)
        {
            if (class1[j] == null)
            {
                iSelectEntries = class1;
                return converter;
            }
        }

        int k1 = j1 << 1;
        aentry = new Entry[k1];
        for (int l = 0; l < j1; l++)
        {
            Entry entry2 = class1[l];
            Class class2 = entry2.iType;
            int k;
            if (class2 == null)
            {
                k = 0;
            } else
            {
                k = class2.hashCode() & k1 - 1;
            }
            do
            {
                if (aentry[k] == null)
                {
                    break;
                }
                int i1 = k + 1;
                k = i1;
                if (i1 >= k1)
                {
                    k = 0;
                }
            } while (true);
            aentry[k] = entry2;
        }

        iSelectEntries = aentry;
        return converter;
    }

    int size()
    {
        return iConverters.length;
    }
}
