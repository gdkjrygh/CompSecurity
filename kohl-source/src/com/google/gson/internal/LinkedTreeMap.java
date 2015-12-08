// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import java.util.Set;

public final class LinkedTreeMap extends AbstractMap
    implements Serializable
{
    class EntrySet extends AbstractSet
    {

        final LinkedTreeMap this$0;

        public void clear()
        {
            LinkedTreeMap.this.clear();
        }

        public boolean contains(Object obj)
        {
            return (obj instanceof java.util.Map.Entry) && findByEntry((java.util.Map.Entry)obj) != null;
        }

        public Iterator iterator()
        {
            return new LinkedTreeMapIterator() {

                final EntrySet this$1;

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return nextNode();
                }

            
            {
                this$1 = EntrySet.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                if ((obj = findByEntry((java.util.Map.Entry)obj)) != null)
                {
                    removeInternal(((Node) (obj)), true);
                    return true;
                }
            }
            return false;
        }

        public int size()
        {
            return LinkedTreeMap.this.size;
        }

        EntrySet()
        {
            this$0 = LinkedTreeMap.this;
            super();
        }
    }

    class KeySet extends AbstractSet
    {

        final LinkedTreeMap this$0;

        public void clear()
        {
            LinkedTreeMap.this.clear();
        }

        public boolean contains(Object obj)
        {
            return containsKey(obj);
        }

        public Iterator iterator()
        {
            return new LinkedTreeMapIterator() {

                final KeySet this$1;

                public Object next()
                {
                    return nextNode().key;
                }

            
            {
                this$1 = KeySet.this;
                super();
            }
            };
        }

        public boolean remove(Object obj)
        {
            return removeInternalByKey(obj) != null;
        }

        public int size()
        {
            return LinkedTreeMap.this.size;
        }

        KeySet()
        {
            this$0 = LinkedTreeMap.this;
            super();
        }
    }

    private abstract class LinkedTreeMapIterator
        implements Iterator
    {

        int expectedModCount;
        Node lastReturned;
        Node next;
        final LinkedTreeMap this$0;

        public final boolean hasNext()
        {
            return next != header;
        }

        final Node nextNode()
        {
            Node node = next;
            if (node == header)
            {
                throw new NoSuchElementException();
            }
            if (modCount != expectedModCount)
            {
                throw new ConcurrentModificationException();
            } else
            {
                next = node.next;
                lastReturned = node;
                return node;
            }
        }

        public final void remove()
        {
            if (lastReturned == null)
            {
                throw new IllegalStateException();
            } else
            {
                removeInternal(lastReturned, true);
                lastReturned = null;
                expectedModCount = modCount;
                return;
            }
        }

        private LinkedTreeMapIterator()
        {
            this$0 = LinkedTreeMap.this;
            super();
            next = header.next;
            lastReturned = null;
            expectedModCount = modCount;
        }

    }

    static final class Node
        implements java.util.Map.Entry
    {

        int height;
        final Object key;
        Node left;
        Node next;
        Node parent;
        Node prev;
        Node right;
        Object value;

        public boolean equals(Object obj)
        {
            boolean flag;
            boolean flag1;
            flag1 = false;
            flag = flag1;
            if (!(obj instanceof java.util.Map.Entry)) goto _L2; else goto _L1
_L1:
            obj = (java.util.Map.Entry)obj;
            if (key != null) goto _L4; else goto _L3
_L3:
            flag = flag1;
            if (((java.util.Map.Entry) (obj)).getKey() != null) goto _L2; else goto _L5
_L5:
            if (value != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((java.util.Map.Entry) (obj)).getValue() != null) goto _L2; else goto _L8
_L8:
            flag = true;
_L2:
            return flag;
_L4:
            flag = flag1;
            if (!key.equals(((java.util.Map.Entry) (obj)).getKey())) goto _L2; else goto _L5
_L7:
            flag = flag1;
            if (!value.equals(((java.util.Map.Entry) (obj)).getValue())) goto _L2; else goto _L8
        }

        public Node first()
        {
            Node node1 = this;
            for (Node node = node1.left; node != null; node = node1.left)
            {
                node1 = node;
            }

            return node1;
        }

        public Object getKey()
        {
            return key;
        }

        public Object getValue()
        {
            return value;
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (key == null)
            {
                i = 0;
            } else
            {
                i = key.hashCode();
            }
            if (value != null)
            {
                j = value.hashCode();
            }
            return i ^ j;
        }

        public Node last()
        {
            Node node1 = this;
            for (Node node = node1.right; node != null; node = node1.right)
            {
                node1 = node;
            }

            return node1;
        }

        public Object setValue(Object obj)
        {
            Object obj1 = value;
            value = obj;
            return obj1;
        }

        public String toString()
        {
            return (new StringBuilder()).append(key).append("=").append(value).toString();
        }

        Node()
        {
            key = null;
            prev = this;
            next = this;
        }

        Node(Node node, Object obj, Node node1, Node node2)
        {
            parent = node;
            key = obj;
            height = 1;
            next = node1;
            prev = node2;
            node2.next = this;
            node1.prev = this;
        }
    }


    static final boolean $assertionsDisabled;
    private static final Comparator NATURAL_ORDER = new Comparator() {

        public int compare(Comparable comparable, Comparable comparable1)
        {
            return comparable.compareTo(comparable1);
        }

        public volatile int compare(Object obj, Object obj1)
        {
            return compare((Comparable)obj, (Comparable)obj1);
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
        this(NATURAL_ORDER);
    }

    public LinkedTreeMap(Comparator comparator1)
    {
        size = 0;
        modCount = 0;
        header = new Node();
        if (comparator1 == null)
        {
            comparator1 = NATURAL_ORDER;
        }
        comparator = comparator1;
    }

    private boolean equal(Object obj, Object obj1)
    {
        return obj == obj1 || obj != null && obj.equals(obj1);
    }

    private void rebalance(Node node, boolean flag)
    {
_L11:
        if (node == null) goto _L2; else goto _L1
_L1:
        Node node1;
        Node node2;
        int i;
        int j;
        int k;
        node1 = node.left;
        node2 = node.right;
        Node node4;
        if (node1 != null)
        {
            i = node1.height;
        } else
        {
            i = 0;
        }
        if (node2 != null)
        {
            j = node2.height;
        } else
        {
            j = 0;
        }
        k = i - j;
        if (k != -2) goto _L4; else goto _L3
_L3:
        node1 = node2.left;
        node4 = node2.right;
        if (node4 != null)
        {
            i = node4.height;
        } else
        {
            i = 0;
        }
        if (node1 != null)
        {
            j = node1.height;
        } else
        {
            j = 0;
        }
        i = j - i;
        if (i == -1 || i == 0 && !flag)
        {
            rotateLeft(node);
        } else
        {
            if (!$assertionsDisabled && i != 1)
            {
                throw new AssertionError();
            }
            rotateRight(node2);
            rotateLeft(node);
        }
        if (!flag) goto _L5; else goto _L2
_L2:
        return;
_L4:
        if (k != 2) goto _L7; else goto _L6
_L6:
        Node node3 = node1.left;
        Node node5 = node1.right;
        if (node5 != null)
        {
            i = node5.height;
        } else
        {
            i = 0;
        }
        if (node3 != null)
        {
            j = node3.height;
        } else
        {
            j = 0;
        }
        i = j - i;
        if (i == 1 || i == 0 && !flag)
        {
            rotateRight(node);
        } else
        {
            if (!$assertionsDisabled && i != -1)
            {
                throw new AssertionError();
            }
            rotateLeft(node1);
            rotateRight(node);
        }
        if (flag) goto _L2; else goto _L5
_L5:
        node = node.parent;
        continue; /* Loop/switch isn't completed */
_L7:
        if (k != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        node.height = i + 1;
        if (flag)
        {
            return;
        }
        if (true) goto _L5; else goto _L8
_L8:
        if (!$assertionsDisabled && k != -1 && k != 1)
        {
            throw new AssertionError();
        }
        node.height = Math.max(i, j) + 1;
        if (flag) goto _L5; else goto _L9
_L9:
        return;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private void replaceInParent(Node node, Node node1)
    {
        Node node2 = node.parent;
        node.parent = null;
        if (node1 != null)
        {
            node1.parent = node2;
        }
        if (node2 != null)
        {
            if (node2.left == node)
            {
                node2.left = node1;
                return;
            }
            if (!$assertionsDisabled && node2.right != node)
            {
                throw new AssertionError();
            } else
            {
                node2.right = node1;
                return;
            }
        } else
        {
            root = node1;
            return;
        }
    }

    private void rotateLeft(Node node)
    {
        boolean flag = false;
        Node node1 = node.left;
        Node node2 = node.right;
        Node node3 = node2.left;
        Node node4 = node2.right;
        node.right = node3;
        if (node3 != null)
        {
            node3.parent = node;
        }
        replaceInParent(node, node2);
        node2.left = node;
        node.parent = node2;
        int i;
        int j;
        if (node1 != null)
        {
            i = node1.height;
        } else
        {
            i = 0;
        }
        if (node3 != null)
        {
            j = node3.height;
        } else
        {
            j = 0;
        }
        node.height = Math.max(i, j) + 1;
        j = node.height;
        i = ((flag) ? 1 : 0);
        if (node4 != null)
        {
            i = node4.height;
        }
        node2.height = Math.max(j, i) + 1;
    }

    private void rotateRight(Node node)
    {
        boolean flag = false;
        Node node1 = node.left;
        Node node2 = node.right;
        Node node3 = node1.left;
        Node node4 = node1.right;
        node.left = node4;
        if (node4 != null)
        {
            node4.parent = node;
        }
        replaceInParent(node, node1);
        node1.right = node;
        node.parent = node1;
        int i;
        int j;
        if (node2 != null)
        {
            i = node2.height;
        } else
        {
            i = 0;
        }
        if (node4 != null)
        {
            j = node4.height;
        } else
        {
            j = 0;
        }
        node.height = Math.max(i, j) + 1;
        j = node.height;
        i = ((flag) ? 1 : 0);
        if (node3 != null)
        {
            i = node3.height;
        }
        node1.height = Math.max(j, i) + 1;
    }

    private Object writeReplace()
        throws ObjectStreamException
    {
        return new LinkedHashMap(this);
    }

    public void clear()
    {
        root = null;
        size = 0;
        modCount = modCount + 1;
        Node node = header;
        node.prev = node;
        node.next = node;
    }

    public boolean containsKey(Object obj)
    {
        return findByObject(obj) != null;
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

    Node find(Object obj, boolean flag)
    {
        Node node;
        Node node1;
        Object obj1;
        Comparator comparator1;
        int i;
        obj1 = null;
        comparator1 = comparator;
        node = root;
        i = 0;
        node1 = node;
        if (node == null) goto _L2; else goto _L1
_L1:
        Comparable comparable;
        if (comparator1 == NATURAL_ORDER)
        {
            comparable = (Comparable)obj;
        } else
        {
            comparable = null;
        }
_L9:
        if (comparable != null)
        {
            i = comparable.compareTo(node.key);
        } else
        {
            i = comparator1.compare(obj, node.key);
        }
        if (i != 0) goto _L4; else goto _L3
_L3:
        return node;
_L4:
        if (i < 0)
        {
            node1 = node.left;
        } else
        {
            node1 = node.right;
        }
        if (node1 != null) goto _L6; else goto _L5
_L5:
        node1 = node;
_L2:
        node = obj1;
        if (!flag) goto _L3; else goto _L7
_L6:
        node = node1;
        if (true) goto _L9; else goto _L8
_L7:
        node = header;
        if (node1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (comparator1 == NATURAL_ORDER && !(obj instanceof Comparable))
        {
            throw new ClassCastException((new StringBuilder()).append(obj.getClass().getName()).append(" is not Comparable").toString());
        }
        obj = new Node(node1, obj, node, node.prev);
        root = ((Node) (obj));
_L11:
        size = size + 1;
        modCount = modCount + 1;
        return ((Node) (obj));
_L8:
        obj = new Node(node1, obj, node, node.prev);
        if (i < 0)
        {
            node1.left = ((Node) (obj));
        } else
        {
            node1.right = ((Node) (obj));
        }
        rebalance(node1, true);
        if (true) goto _L11; else goto _L10
_L10:
    }

    Node findByEntry(java.util.Map.Entry entry)
    {
        Node node = findByObject(entry.getKey());
        boolean flag;
        if (node != null && equal(node.value, entry.getValue()))
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

    Node findByObject(Object obj)
    {
        Node node = null;
        if (obj != null)
        {
            try
            {
                node = find(obj, false);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                return null;
            }
        }
        return node;
    }

    public Object get(Object obj)
    {
        obj = findByObject(obj);
        if (obj != null)
        {
            return ((Node) (obj)).value;
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
            obj = find(obj, true);
            Object obj2 = ((Node) (obj)).value;
            obj.value = obj1;
            return obj2;
        }
    }

    public Object remove(Object obj)
    {
        obj = removeInternalByKey(obj);
        if (obj != null)
        {
            return ((Node) (obj)).value;
        } else
        {
            return null;
        }
    }

    void removeInternal(Node node, boolean flag)
    {
        if (flag)
        {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        Node node1 = node.left;
        Node node2 = node.right;
        Node node3 = node.parent;
        if (node1 != null && node2 != null)
        {
            int i;
            int j;
            if (node1.height > node2.height)
            {
                node1 = node1.last();
            } else
            {
                node1 = node2.first();
            }
            removeInternal(node1, false);
            i = 0;
            node2 = node.left;
            if (node2 != null)
            {
                i = node2.height;
                node1.left = node2;
                node2.parent = node1;
                node.left = null;
            }
            j = 0;
            node2 = node.right;
            if (node2 != null)
            {
                j = node2.height;
                node1.right = node2;
                node2.parent = node1;
                node.right = null;
            }
            node1.height = Math.max(i, j) + 1;
            replaceInParent(node, node1);
            return;
        }
        if (node1 != null)
        {
            replaceInParent(node, node1);
            node.left = null;
        } else
        if (node2 != null)
        {
            replaceInParent(node, node2);
            node.right = null;
        } else
        {
            replaceInParent(node, null);
        }
        rebalance(node3, false);
        size = size - 1;
        modCount = modCount + 1;
    }

    Node removeInternalByKey(Object obj)
    {
        obj = findByObject(obj);
        if (obj != null)
        {
            removeInternal(((Node) (obj)), true);
        }
        return ((Node) (obj));
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
        $assertionsDisabled = flag;
    }
}
