// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

public final class LinkedTreeMap extends AbstractMap
    implements Serializable
{

    static final boolean a;
    private static final Comparator b = new Comparator() {

        public int a(Comparable comparable, Comparable comparable1)
        {
            return comparable.compareTo(comparable1);
        }

        public int compare(Object obj, Object obj1)
        {
            return a((Comparable)obj, (Comparable)obj1);
        }

    };
    Comparator comparator;
    private EntrySet entrySet;
    final Node header;
    private KeySet keySet;
    int modCount;
    Node root;
    int size;

    public LinkedTreeMap()
    {
        this(b);
    }

    public LinkedTreeMap(Comparator comparator1)
    {
        size = 0;
        modCount = 0;
        header = new Node();
        if (comparator1 == null)
        {
            comparator1 = b;
        }
        comparator = comparator1;
    }

    private void a(Node node)
    {
        boolean flag = false;
        Node node1 = node.b;
        Node node2 = node.c;
        Node node3 = node2.b;
        Node node4 = node2.c;
        node.c = node3;
        if (node3 != null)
        {
            node3.a = node;
        }
        a(node, node2);
        node2.b = node;
        node.a = node2;
        int i;
        int j;
        if (node1 != null)
        {
            i = node1.h;
        } else
        {
            i = 0;
        }
        if (node3 != null)
        {
            j = node3.h;
        } else
        {
            j = 0;
        }
        node.h = Math.max(i, j) + 1;
        j = node.h;
        i = ((flag) ? 1 : 0);
        if (node4 != null)
        {
            i = node4.h;
        }
        node2.h = Math.max(j, i) + 1;
    }

    private void a(Node node, Node node1)
    {
        Node node2 = node.a;
        node.a = null;
        if (node1 != null)
        {
            node1.a = node2;
        }
        if (node2 != null)
        {
            if (node2.b == node)
            {
                node2.b = node1;
                return;
            }
            if (!a && node2.c != node)
            {
                throw new AssertionError();
            } else
            {
                node2.c = node1;
                return;
            }
        } else
        {
            root = node1;
            return;
        }
    }

    private boolean a(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    private void b(Node node)
    {
        boolean flag = false;
        Node node1 = node.b;
        Node node2 = node.c;
        Node node3 = node1.b;
        Node node4 = node1.c;
        node.b = node4;
        if (node4 != null)
        {
            node4.a = node;
        }
        a(node, node1);
        node1.c = node;
        node.a = node1;
        int i;
        int j;
        if (node2 != null)
        {
            i = node2.h;
        } else
        {
            i = 0;
        }
        if (node4 != null)
        {
            j = node4.h;
        } else
        {
            j = 0;
        }
        node.h = Math.max(i, j) + 1;
        j = node.h;
        i = ((flag) ? 1 : 0);
        if (node3 != null)
        {
            i = node3.h;
        }
        node1.h = Math.max(j, i) + 1;
    }

    private void b(Node node, boolean flag)
    {
_L11:
        if (node == null) goto _L2; else goto _L1
_L1:
        Node node1;
        Node node2;
        int i;
        int j;
        int k;
        node1 = node.b;
        node2 = node.c;
        Node node4;
        if (node1 != null)
        {
            i = node1.h;
        } else
        {
            i = 0;
        }
        if (node2 != null)
        {
            j = node2.h;
        } else
        {
            j = 0;
        }
        k = i - j;
        if (k != -2) goto _L4; else goto _L3
_L3:
        node1 = node2.b;
        node4 = node2.c;
        if (node4 != null)
        {
            i = node4.h;
        } else
        {
            i = 0;
        }
        if (node1 != null)
        {
            j = node1.h;
        } else
        {
            j = 0;
        }
        i = j - i;
        if (i == -1 || i == 0 && !flag)
        {
            a(node);
        } else
        {
            if (!a && i != 1)
            {
                throw new AssertionError();
            }
            b(node2);
            a(node);
        }
        if (!flag) goto _L5; else goto _L2
_L2:
        return;
_L4:
        if (k != 2) goto _L7; else goto _L6
_L6:
        Node node3 = node1.b;
        Node node5 = node1.c;
        if (node5 != null)
        {
            i = node5.h;
        } else
        {
            i = 0;
        }
        if (node3 != null)
        {
            j = node3.h;
        } else
        {
            j = 0;
        }
        i = j - i;
        if (i == 1 || i == 0 && !flag)
        {
            b(node);
        } else
        {
            if (!a && i != -1)
            {
                throw new AssertionError();
            }
            a(node1);
            b(node);
        }
        if (flag) goto _L2; else goto _L5
_L5:
        node = node.a;
        continue; /* Loop/switch isn't completed */
_L7:
        if (k != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        node.h = i + 1;
        if (flag)
        {
            return;
        }
        if (true) goto _L5; else goto _L8
_L8:
        if (!a && k != -1 && k != 1)
        {
            throw new AssertionError();
        }
        node.h = Math.max(i, j) + 1;
        if (flag) goto _L5; else goto _L9
_L9:
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private Object writeReplace()
    {
        return new LinkedHashMap(this);
    }

    Node a(Object obj)
    {
        Node node = null;
        if (obj != null)
        {
            try
            {
                node = a(obj, false);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
        }
        return node;
    }

    Node a(Object obj, boolean flag)
    {
        Node node;
        Object obj1;
        Comparator comparator1;
        obj1 = null;
        comparator1 = comparator;
        node = root;
        if (node == null) goto _L2; else goto _L1
_L1:
        Node node1;
        Comparable comparable;
        int i;
        if (comparator1 == b)
        {
            comparable = (Comparable)obj;
        } else
        {
            comparable = null;
        }
_L11:
        if (comparable != null)
        {
            i = comparable.compareTo(node.f);
        } else
        {
            i = comparator1.compare(obj, node.f);
        }
        if (i != 0) goto _L4; else goto _L3
_L3:
        node1 = node;
_L8:
        return node1;
_L4:
        if (i < 0)
        {
            node1 = node.b;
        } else
        {
            node1 = node.c;
        }
        if (node1 != null) goto _L6; else goto _L5
_L5:
        node1 = obj1;
        if (!flag) goto _L8; else goto _L7
_L7:
        node1 = header;
        if (node != null) goto _L10; else goto _L9
_L6:
        node = node1;
          goto _L11
_L9:
        if (comparator1 == b && !(obj instanceof Comparable))
        {
            throw new ClassCastException((new StringBuilder()).append(obj.getClass().getName()).append(" is not Comparable").toString());
        }
        obj = new Node(node, obj, node1, node1.e);
        root = ((Node) (obj));
_L12:
        size = size + 1;
        modCount = modCount + 1;
        return ((Node) (obj));
_L10:
        obj = new Node(node, obj, node1, node1.e);
        if (i < 0)
        {
            node.b = ((Node) (obj));
        } else
        {
            node.c = ((Node) (obj));
        }
        b(node, true);
        if (true) goto _L12; else goto _L2
_L2:
        i = 0;
          goto _L5
    }

    Node a(java.util.Map.Entry entry)
    {
        Node node = a(entry.getKey());
        boolean flag;
        if (node != null && a(node.g, entry.getValue()))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return node;
        } else
        {
            return null;
        }
    }

    void a(Node node, boolean flag)
    {
        int j = 0;
        if (flag)
        {
            node.e.d = node.d;
            node.d.e = node.e;
        }
        Node node1 = node.b;
        Node node2 = node.c;
        Node node3 = node.a;
        if (node1 != null && node2 != null)
        {
            int i;
            if (node1.h > node2.h)
            {
                node1 = node1.b();
            } else
            {
                node1 = node2.a();
            }
            a(node1, false);
            node2 = node.b;
            if (node2 != null)
            {
                i = node2.h;
                node1.b = node2;
                node2.a = node1;
                node.b = null;
            } else
            {
                i = 0;
            }
            node2 = node.c;
            if (node2 != null)
            {
                j = node2.h;
                node1.c = node2;
                node2.a = node1;
                node.c = null;
            }
            node1.h = Math.max(i, j) + 1;
            a(node, node1);
            return;
        }
        if (node1 != null)
        {
            a(node, node1);
            node.b = null;
        } else
        if (node2 != null)
        {
            a(node, node2);
            node.c = null;
        } else
        {
            a(node, ((Node) (null)));
        }
        b(node3, false);
        size = size - 1;
        modCount = modCount + 1;
    }

    Node b(Object obj)
    {
        obj = a(obj);
        if (obj != null)
        {
            a(((Node) (obj)), true);
        }
        return ((Node) (obj));
    }

    public void clear()
    {
        root = null;
        size = 0;
        modCount = modCount + 1;
        Node node = header;
        node.e = node;
        node.d = node;
    }

    public boolean containsKey(Object obj)
    {
        return a(obj) != null;
    }

    public Set entrySet()
    {
        EntrySet entryset = entrySet;
        if (entryset != null)
        {
            return entryset;
        } else
        {
            EntrySet entryset1 = new EntrySet();
            entrySet = entryset1;
            return entryset1;
        }
    }

    public Object get(Object obj)
    {
        obj = a(obj);
        if (obj != null)
        {
            return ((Node) (obj)).g;
        } else
        {
            return null;
        }
    }

    public Set keySet()
    {
        KeySet keyset = keySet;
        if (keyset != null)
        {
            return keyset;
        } else
        {
            KeySet keyset1 = new KeySet();
            keySet = keyset1;
            return keyset1;
        }
    }

    public Object put(Object obj, Object obj1)
    {
        if (obj == null)
        {
            throw new NullPointerException("key == null");
        } else
        {
            obj = a(obj, true);
            Object obj2 = ((Node) (obj)).g;
            obj.g = obj1;
            return obj2;
        }
    }

    public Object remove(Object obj)
    {
        obj = b(obj);
        if (obj != null)
        {
            return ((Node) (obj)).g;
        } else
        {
            return null;
        }
    }

    public int size()
    {
        return size;
    }

    static 
    {
        boolean flag;
        if (!com/google/gson/internal/LinkedTreeMap.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    private class Node
        implements java.util.Map.Entry
    {

        Node a;
        Node b;
        Node c;
        Node d;
        Node e;
        final Object f;
        Object g;
        int h;

        public Node a()
        {
            Node node = b;
            Node node1 = this;
            Node node2;
            for (; node != null; node = node2)
            {
                node2 = node.b;
                node1 = node;
            }

            return node1;
        }

        public Node b()
        {
            Node node = c;
            Node node1 = this;
            Node node2;
            for (; node != null; node = node2)
            {
                node2 = node.c;
                node1 = node;
            }

            return node1;
        }

        public boolean equals(Object obj)
        {
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = flag1;
            if (!(obj instanceof java.util.Map.Entry)) goto _L2; else goto _L1
_L1:
            obj = (java.util.Map.Entry)obj;
            if (f != null) goto _L4; else goto _L3
_L3:
            flag = flag1;
            if (((java.util.Map.Entry) (obj)).getKey() != null) goto _L2; else goto _L5
_L5:
            if (g != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((java.util.Map.Entry) (obj)).getValue() != null) goto _L2; else goto _L8
_L8:
            flag = true;
_L2:
            return flag;
_L4:
            flag = flag1;
            if (!f.equals(((java.util.Map.Entry) (obj)).getKey())) goto _L2; else goto _L5
_L7:
            flag = flag1;
            if (!g.equals(((java.util.Map.Entry) (obj)).getValue())) goto _L2; else goto _L8
        }

        public Object getKey()
        {
            return f;
        }

        public Object getValue()
        {
            return g;
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (f == null)
            {
                i = 0;
            } else
            {
                i = f.hashCode();
            }
            if (g != null)
            {
                j = g.hashCode();
            }
            return i ^ j;
        }

        public Object setValue(Object obj)
        {
            Object obj1 = g;
            g = obj;
            return obj1;
        }

        public String toString()
        {
            return (new StringBuilder()).append(f).append("=").append(g).toString();
        }

        Node()
        {
            f = null;
            e = this;
            d = this;
        }

        Node(Node node, Object obj, Node node1, Node node2)
        {
            a = node;
            f = obj;
            h = 1;
            d = node1;
            e = node2;
            node2.d = this;
            node1.e = this;
        }
    }


    private class EntrySet extends AbstractSet
    {

        final LinkedTreeMap a;

        public void clear()
        {
            a.clear();
        }

        public boolean contains(Object obj)
        {
            return (obj instanceof java.util.Map.Entry) && a.a((java.util.Map.Entry)obj) != null;
        }

        public Iterator iterator()
        {
            return new LinkedTreeMapIterator() {
                private class LinkedTreeMapIterator
                    implements Iterator
                {

                    Node b;
                    Node c;
                    int d;
                    final LinkedTreeMap e;

                    final Node b()
                    {
                        Node node = b;
                        if (node == e.header)
                        {
                            throw new NoSuchElementException();
                        }
                        if (e.modCount != d)
                        {
                            throw new ConcurrentModificationException();
                        } else
                        {
                            b = node.d;
                            c = node;
                            return node;
                        }
                    }

                    public final boolean hasNext()
                    {
                        return b != e.header;
                    }

                    public final void remove()
                    {
                        if (c == null)
                        {
                            throw new IllegalStateException();
                        } else
                        {
                            e.a(c, true);
                            c = null;
                            d = e.modCount;
                            return;
                        }
                    }

                    private LinkedTreeMapIterator()
                    {
                        e = LinkedTreeMap.this;
                        super();
                        b = e.header.d;
                        c = null;
                        d = e.modCount;
                    }

                }


                final EntrySet a;

                public java.util.Map.Entry a()
                {
                    return b();
                }

                public Object next()
                {
                    return a();
                }

                
                {
                    a = EntrySet.this;
                    EntrySet.this.a. super();
                }
            };
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                if ((obj = a.a((java.util.Map.Entry)obj)) != null)
                {
                    a.a(((Node) (obj)), true);
                    return true;
                }
            }
            return false;
        }

        public int size()
        {
            return a.size;
        }

        EntrySet()
        {
            a = LinkedTreeMap.this;
            super();
        }
    }


    private class KeySet extends AbstractSet
    {

        final LinkedTreeMap a;

        public void clear()
        {
            a.clear();
        }

        public boolean contains(Object obj)
        {
            return a.containsKey(obj);
        }

        public Iterator iterator()
        {
            return new LinkedTreeMapIterator() {

                final KeySet a;

                public Object next()
                {
                    return b().f;
                }

                
                {
                    a = KeySet.this;
                    KeySet.this.a. super();
                }
            };
        }

        public boolean remove(Object obj)
        {
            return a.b(obj) != null;
        }

        public int size()
        {
            return a.size;
        }

        KeySet()
        {
            a = LinkedTreeMap.this;
            super();
        }
    }

}
