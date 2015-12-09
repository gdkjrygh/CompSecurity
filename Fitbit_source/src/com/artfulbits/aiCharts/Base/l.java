// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.artfulbits.aiCharts.Exceptions.XmlElementAttributeNotFoundException;
import com.artfulbits.aiCharts.Exceptions.XmlNodeValueParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

// Referenced classes of package com.artfulbits.aiCharts.Base:
//            j, ChartSeries, t, r

public final class l
    implements List
{
    class a
        implements t
    {

        protected String a;
        protected String b[];

        public j a(Object obj)
        {
            double d1;
            double ad[];
            int i;
label0:
            {
                if (!(obj instanceof Node))
                {
                    break MISSING_BLOCK_LABEL_298;
                }
                obj = (Node)obj;
                NamedNodeMap namednodemap = ((Node) (obj)).getAttributes();
                if (namednodemap == null)
                {
                    break MISSING_BLOCK_LABEL_298;
                }
                ad = new double[b.length];
                if (namednodemap.getNamedItem(a) != null)
                {
                    String s = namednodemap.getNamedItem(a).getNodeValue();
                    try
                    {
                        d1 = Double.parseDouble(s);
                    }
                    catch (Exception exception)
                    {
                        throw new XmlNodeValueParseException((new StringBuilder()).append(a).append(" attribute value is incorrect").toString(), ((Node) (obj)), exception);
                    }
                    i = 0;
                    break label0;
                } else
                {
                    throw new XmlElementAttributeNotFoundException((new StringBuilder("XML attribute ")).append(a).append(" does not exist for specified node").toString(), ((Node) (obj)), a);
                }
            }
            while (true) 
            {
                if (i >= b.length)
                {
                    break;
                }
                Object obj1 = namednodemap.getNamedItem(b[i]);
                if (obj1 == null)
                {
                    throw new XmlElementAttributeNotFoundException((new StringBuilder("XML attribute ")).append(b[i]).append(" does not exist for specified node").toString(), ((Node) (obj)), b[i]);
                }
                obj1 = ((Node) (obj1)).getNodeValue();
                try
                {
                    ad[i] = Double.parseDouble(((String) (obj1)));
                }
                catch (Exception exception1)
                {
                    throw new XmlNodeValueParseException((new StringBuilder()).append(b[i]).append(" attribute value is incorrect").toString(), ((Node) (obj)), exception1);
                }
                i++;
            }
            return new j(d1, ad);
            return null;
        }

        public Object a(Object obj, Object obj1)
        {
            return a(obj);
        }

        public transient a(String s, String as[])
        {
            a = s;
            b = as;
        }
    }

    static final class b
        implements t
    {

        private int a;
        private int b[];

        public final Object a(Object obj, Object obj1)
        {
            if (obj instanceof Cursor)
            {
                obj = (Cursor)obj;
                double d1 = ((Cursor) (obj)).getPosition();
                int i;
                if (b == null)
                {
                    i = 1;
                } else
                {
                    i = b.length;
                }
                obj1 = new double[i];
                if (a >= 0)
                {
                    d1 = ((Cursor) (obj)).getDouble(a);
                }
                if (b != null)
                {
                    for (i = 0; i < b.length; i++)
                    {
                        obj1[i] = ((Cursor) (obj)).getDouble(b[i]);
                    }

                }
                return new j(d1, ((double []) (obj1)));
            } else
            {
                return null;
            }
        }

        public b(int i, int ai[])
        {
            a = i;
            b = ai;
        }
    }

    final class c extends a
    {

        public final j a(Object obj)
        {
            if (obj instanceof Node)
            {
                Node node = (Node)obj;
                NodeList nodelist = node.getChildNodes();
                if (nodelist != null)
                {
                    int i1 = nodelist.getLength();
                    double d1 = 0.0D;
                    obj = new double[b.length];
                    int i = 0;
                    boolean flag1 = false;
                    boolean flag = false;
                    while (i < i1) 
                    {
                        Object obj1 = nodelist.item(i).getNodeName();
                        if (a.equals(obj1))
                        {
                            obj1 = nodelist.item(i).getFirstChild();
                            if (obj1 == null)
                            {
                                throw new XmlNodeValueParseException((new StringBuilder()).append(a).append("element's value is incorrect").toString(), node);
                            }
                            try
                            {
                                d1 = Double.parseDouble(((Node) (obj1)).getNodeValue());
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj)
                            {
                                throw new XmlNodeValueParseException((new StringBuilder()).append(a).append("element's value is incorrect").toString(), node, ((Exception) (obj)));
                            }
                            flag = true;
                        } else
                        {
                            int k = 0;
                            while (k < b.length) 
                            {
                                if (b[k].equals(obj1))
                                {
                                    Node node1 = nodelist.item(i).getFirstChild();
                                    if (node1 == null)
                                    {
                                        throw new XmlNodeValueParseException((new StringBuilder()).append(b[k]).append("element's value is incorrect").toString(), node);
                                    }
                                    try
                                    {
                                        obj[k] = Double.parseDouble(node1.getNodeValue());
                                    }
                                    catch (Exception exception)
                                    {
                                        throw new XmlNodeValueParseException((new StringBuilder()).append(obj[k]).append("element's value is incorrect").toString(), node, exception);
                                    }
                                    flag1 = true;
                                }
                                k++;
                            }
                        }
                        i++;
                    }
                    if (flag && flag1)
                    {
                        return new j(d1, ((double []) (obj)));
                    }
                    if (flag || flag1)
                    {
                        if (flag)
                        {
                            obj = a;
                        } else
                        {
                            obj = b[0];
                        }
                        throw new XmlElementAttributeNotFoundException("Child node not found", node, ((String) (obj)));
                    }
                }
            }
            return null;
        }

        public final Object a(Object obj, Object obj1)
        {
            return a(obj);
        }

        public transient c(String s, String as[])
        {
            super(s, as);
        }
    }


    protected final ArrayList a = new ArrayList();
    private final ChartSeries b;
    private int c;

    protected l(ChartSeries chartseries)
    {
        c = 0;
        b = chartseries;
    }

    public final int a(j j1)
    {
        return a.indexOf(j1);
    }

    public final transient j a(double d1, double ad[])
    {
        ad = new j(d1, ad);
        if (b(ad))
        {
            return ad;
        } else
        {
            return null;
        }
    }

    public final j a(int i)
    {
        return (j)a.get(i);
    }

    public final transient j a(long l1, double ad[])
    {
        b.a = ChartAxis.ValueType.b;
        return a(l1, ad);
    }

    public final transient j a(Calendar calendar, double ad[])
    {
        b.a = ChartAxis.ValueType.b;
        return a(calendar.getTimeInMillis(), ad);
    }

    public final transient j a(Date date, double ad[])
    {
        return a(date.getTime(), ad);
    }

    public final void a()
    {
        c = c + 1;
    }

    public final void a(int i, j j1)
    {
        if (j1.c() != null)
        {
            throw new IllegalArgumentException("Point already added to series");
        }
        a.add(i, j1);
        j1.a(b);
        if (c == 0)
        {
            b.a(j1, null);
        }
    }

    public final void a(Cursor cursor, int i, int ai[])
    {
        a(cursor, ((t) (new b(i, ai))));
    }

    public final void a(Cursor cursor, t t1)
    {
        a();
        clear();
        for (; cursor.moveToNext(); b((j)t1.a(cursor, null))) { }
        b();
    }

    public final void a(SQLiteDatabase sqlitedatabase, String s, String as[])
    {
        sqlitedatabase = sqlitedatabase.query(s, as, null, null, null, null, null);
        s = new int[as.length];
        for (int i = 0; i < s.length; i++)
        {
            s[i] = sqlitedatabase.getColumnIndex(as[i]);
        }

        a(((Cursor) (sqlitedatabase)), -1, ((int []) (s)));
        sqlitedatabase.close();
    }

    public final void a(Iterable iterable, t t1)
    {
        a();
        clear();
        for (iterable = iterable.iterator(); iterable.hasNext(); b((j)t1.a(iterable.next(), null))) { }
        b();
    }

    public final void a(Element element, t t1)
    {
        a();
        clear();
        element = element.getChildNodes();
        int k = element.getLength();
        for (int i = 0; i < k; i++)
        {
            j j1 = (j)t1.a(element.item(i), null);
            if (j1 != null)
            {
                b(j1);
            }
        }

        b();
    }

    public final transient void a(Element element, boolean flag, String s, String as[])
    {
        if (flag)
        {
            a(element, ((t) (new a(s, as))));
            return;
        } else
        {
            a(element, ((t) (new c(s, as))));
            return;
        }
    }

    public final void a(byte abyte0[])
    {
        a();
        clear();
        for (int i = 0; i < abyte0.length; i++)
        {
            b(new j(i, new double[] {
                (double)abyte0[i]
            }));
        }

        b();
    }

    public final void a(double ad[])
    {
        a();
        clear();
        for (int i = 0; i < ad.length; i++)
        {
            b(new j(i, new double[] {
                ad[i]
            }));
        }

        b();
    }

    public final void a(long al[])
    {
        a();
        clear();
        for (int i = 0; i < al.length; i++)
        {
            b(new j(i, new double[] {
                (double)al[i]
            }));
        }

        b();
    }

    public final void add(int i, Object obj)
    {
        a(i, (j)obj);
    }

    public final boolean add(Object obj)
    {
        return b((j)obj);
    }

    public final boolean addAll(int i, Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection)
    {
        throw new UnsupportedOperationException();
    }

    public final j b(int i, j j1)
    {
        j j2 = (j)a.set(i, j1);
        j1.a(b);
        j2.a(null);
        if (c == 0)
        {
            b.a(j1, j2);
        }
        return j2;
    }

    public final void b()
    {
        if (c > 0)
        {
            c = c - 1;
            if (c == 0)
            {
                b.a(a);
            }
        }
    }

    public final void b(int i)
    {
        e(i);
    }

    public final boolean b(j j1)
    {
        if (j1.c() != null)
        {
            throw new IllegalArgumentException("Point already added to series");
        }
        boolean flag = a.add(j1);
        if (flag)
        {
            j1.a(b);
            if (c == 0)
            {
                b.a(j1, null);
            }
        }
        return flag;
    }

    protected final r c(int i)
    {
        Iterator iterator1 = iterator();
        double d3 = 1.7976931348623157E+308D;
        double d1 = -1.7976931348623157E+308D;
        while (iterator1.hasNext()) 
        {
            double d4 = ((j)iterator1.next()).a(i);
            double d2 = d3;
            if (d3 > d4)
            {
                d2 = d4;
            }
            if (d1 < d4)
            {
                d1 = d4;
            }
            d3 = d2;
        }
        return new r(d3, d1);
    }

    public final j[] c()
    {
        return (j[])a.toArray(new j[a.size()]);
    }

    public final void clear()
    {
        for (int i = 0; i < a.size(); i++)
        {
            ((j)a.get(i)).a(null);
        }

        a.clear();
        if (c == 0)
        {
            b.a(null, null);
        }
    }

    public final boolean contains(Object obj)
    {
        return a.contains(obj);
    }

    public final boolean containsAll(Collection collection)
    {
        return a.containsAll(collection);
    }

    protected final double d(int i)
    {
        Iterator iterator1 = iterator();
        double d1;
        for (d1 = 0.0D; iterator1.hasNext(); d1 = ((j)iterator1.next()).a(i) + d1) { }
        return d1;
    }

    public final j e(int i)
    {
        j j1 = (j)a.remove(i);
        if (j1 != null)
        {
            j1.a(null);
            if (c == 0)
            {
                b.a(null, j1);
            }
        }
        return j1;
    }

    public final Object get(int i)
    {
        return a(i);
    }

    public final int indexOf(Object obj)
    {
        return a.indexOf(obj);
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Iterator iterator()
    {
        return a.iterator();
    }

    public final int lastIndexOf(Object obj)
    {
        return a.lastIndexOf(obj);
    }

    public final ListIterator listIterator()
    {
        return a.listIterator();
    }

    public final ListIterator listIterator(int i)
    {
        return a.listIterator(i);
    }

    public final Object remove(int i)
    {
        return e(i);
    }

    public final boolean remove(Object obj)
    {
        if (a.remove(obj))
        {
            obj = (j)obj;
            ((j) (obj)).a(null);
            if (c == 0)
            {
                b.a(null, ((j) (obj)));
            }
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean removeAll(Collection collection)
    {
        boolean flag = false;
        a();
        for (int i = a.size() - 1; i >= 0; i--)
        {
            j j1 = (j)a.get(i);
            if (collection.contains(j1))
            {
                j1.a(null);
                a.remove(i);
                flag = true;
            }
        }

        b();
        return flag;
    }

    public final boolean retainAll(Collection collection)
    {
        boolean flag = false;
        a();
        for (int i = a.size() - 1; i >= 0; i--)
        {
            j j1 = (j)a.get(i);
            if (!collection.contains(j1))
            {
                j1.a(null);
                a.remove(i);
                flag = true;
            }
        }

        b();
        return flag;
    }

    public final Object set(int i, Object obj)
    {
        return b(i, (j)obj);
    }

    public final int size()
    {
        return a.size();
    }

    public final List subList(int i, int k)
    {
        return a.subList(i, k);
    }

    public final Object[] toArray()
    {
        return c();
    }

    public final Object[] toArray(Object aobj[])
    {
        return a.toArray(aobj);
    }
}
