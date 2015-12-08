// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSequentialList;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            ListMultimap, LinkedHashMultiset, Maps, Multimap, 
//            Multiset, Lists, AbstractMapEntry, Iterators, 
//            Multisets

public final class LinkedListMultimap
    implements ListMultimap, Serializable
{
    private class AsMapEntries extends AbstractSet
    {

        final LinkedListMultimap this$0;

        public Iterator iterator()
        {
            return (new DistinctKeyIterator()). new Iterator() {

                final AsMapEntries this$1;
                final Iterator val$keyIterator;

                public boolean hasNext()
                {
                    return keyIterator.hasNext();
                }

                public volatile Object next()
                {
                    return next();
                }

                public java.util.Map.Entry next()
                {
                    return ((_cls1) (keyIterator.next())). new AbstractMapEntry() {

                        final AsMapEntries._cls1 this$2;
                        final Object val$key;

                        public Object getKey()
                        {
                            return key;
                        }

                        public volatile Object getValue()
                        {
                            return getValue();
                        }

                        public Collection getValue()
                        {
                            return get(key);
                        }

            
            {
                this$2 = final__pcls1;
                key = Object.this;
                super();
            }
                    };
                }

                public void remove()
                {
                    keyIterator.remove();
                }

            
            {
                this$1 = final_asmapentries;
                keyIterator = Iterator.this;
                super();
            }
            };
        }

        public int size()
        {
            return keyCount.elementSet().size();
        }

        private AsMapEntries()
        {
            this$0 = LinkedListMultimap.this;
            super();
        }

    }

    private class DistinctKeyIterator
        implements Iterator
    {

        Node current;
        Node next;
        final Set seenKeys;
        final LinkedListMultimap this$0;

        public boolean hasNext()
        {
            return next != null;
        }

        public Object next()
        {
            LinkedListMultimap.checkElement(next);
            current = next;
            seenKeys.add(current.key);
            do
            {
                next = next.next;
            } while (next != null && !seenKeys.add(next.key));
            return current.key;
        }

        public void remove()
        {
            boolean flag;
            if (current != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            removeAllNodes(current.key);
            current = null;
        }

        private DistinctKeyIterator()
        {
            this$0 = LinkedListMultimap.this;
            super();
            seenKeys = new HashSet(Maps.capacity(keySet().size()));
            next = head;
        }

    }

    private class MultisetView extends AbstractCollection
        implements Multiset
    {

        final LinkedListMultimap this$0;

        public int add(Object obj, int i)
        {
            throw new UnsupportedOperationException();
        }

        public int count(Object obj)
        {
            return keyCount.count(obj);
        }

        public Set elementSet()
        {
            return keySet();
        }

        public Set entrySet()
        {
            return new AbstractSet() {

                final MultisetView this$1;

                public Iterator iterator()
                {
                    return (new DistinctKeyIterator()). new Iterator() {

                        final MultisetView._cls2 this$2;
                        final Iterator val$keyIterator;

                        public boolean hasNext()
                        {
                            return keyIterator.hasNext();
                        }

                        public Multiset.Entry next()
                        {
                            return ((_cls1) (keyIterator.next())). new Multisets.AbstractEntry() {

                                final MultisetView._cls2._cls1 this$3;
                                final Object val$key;

                                public int getCount()
                                {
                                    return keyCount.count(key);
                                }

                                public Object getElement()
                                {
                                    return key;
                                }

            
            {
                this$3 = final__pcls1;
                key = Object.this;
                super();
            }
                            };
                        }

                        public volatile Object next()
                        {
                            return next();
                        }

                        public void remove()
                        {
                            keyIterator.remove();
                        }

            
            {
                this$2 = final__pcls2;
                keyIterator = Iterator.this;
                super();
            }
                    };
                }

                public int size()
                {
                    return keyCount.elementSet().size();
                }

            
            {
                this$1 = MultisetView.this;
                super();
            }
            };
        }

        public boolean equals(Object obj)
        {
            return keyCount.equals(obj);
        }

        public int hashCode()
        {
            return keyCount.hashCode();
        }

        public Iterator iterator()
        {
            return (new NodeIterator()). new Iterator() {

                final MultisetView this$1;
                final Iterator val$nodes;

                public boolean hasNext()
                {
                    return nodes.hasNext();
                }

                public Object next()
                {
                    return ((Node)nodes.next()).key;
                }

                public void remove()
                {
                    nodes.remove();
                }

            
            {
                this$1 = final_multisetview;
                nodes = Iterator.this;
                super();
            }
            };
        }

        public int remove(Object obj, int i)
        {
            int j;
            boolean flag;
            if (i >= 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            j = count(obj);
            for (obj = new ValueForKeyIterator(obj); i > 0 && ((Iterator) (obj)).hasNext(); i--)
            {
                ((Iterator) (obj)).next();
                ((Iterator) (obj)).remove();
            }

            return j;
        }

        public boolean removeAll(Collection collection)
        {
            return Iterators.removeAll(iterator(), collection);
        }

        public boolean retainAll(Collection collection)
        {
            return Iterators.retainAll(iterator(), collection);
        }

        public int setCount(Object obj, int i)
        {
            return Multisets.setCountImpl(this, obj, i);
        }

        public boolean setCount(Object obj, int i, int j)
        {
            return Multisets.setCountImpl(this, obj, i, j);
        }

        public int size()
        {
            return keyCount.size();
        }

        public String toString()
        {
            return keyCount.toString();
        }

        private MultisetView()
        {
            this$0 = LinkedListMultimap.this;
            super();
        }

    }

    private static final class Node
    {

        final Object key;
        Node next;
        Node nextSibling;
        Node previous;
        Node previousSibling;
        Object value;

        public String toString()
        {
            return (new StringBuilder()).append(key).append("=").append(value).toString();
        }

        Node(Object obj, Object obj1)
        {
            key = obj;
            value = obj1;
        }
    }

    private class NodeIterator
        implements Iterator
    {

        Node current;
        Node next;
        final LinkedListMultimap this$0;

        public boolean hasNext()
        {
            return next != null;
        }

        public Node next()
        {
            LinkedListMultimap.checkElement(next);
            current = next;
            next = next.next;
            return current;
        }

        public volatile Object next()
        {
            return next();
        }

        public void remove()
        {
            boolean flag;
            if (current != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            removeNode(current);
            current = null;
        }

        private NodeIterator()
        {
            this$0 = LinkedListMultimap.this;
            super();
            next = head;
        }

    }

    private class ValueForKeyIterator
        implements ListIterator
    {

        Node current;
        final Object key;
        Node next;
        int nextIndex;
        Node previous;
        final LinkedListMultimap this$0;

        public void add(Object obj)
        {
            previous = addNode(key, obj, next);
            nextIndex = nextIndex + 1;
            current = null;
        }

        public boolean hasNext()
        {
            return next != null;
        }

        public boolean hasPrevious()
        {
            return previous != null;
        }

        public Object next()
        {
            LinkedListMultimap.checkElement(next);
            Node node = next;
            current = node;
            previous = node;
            next = next.nextSibling;
            nextIndex = nextIndex + 1;
            return current.value;
        }

        public int nextIndex()
        {
            return nextIndex;
        }

        public Object previous()
        {
            LinkedListMultimap.checkElement(previous);
            Node node = previous;
            current = node;
            next = node;
            previous = previous.previousSibling;
            nextIndex = nextIndex - 1;
            return current.value;
        }

        public int previousIndex()
        {
            return nextIndex - 1;
        }

        public void remove()
        {
            boolean flag;
            if (current != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            if (current != next)
            {
                previous = current.previousSibling;
                nextIndex = nextIndex - 1;
            } else
            {
                next = current.nextSibling;
            }
            removeNode(current);
            current = null;
        }

        public void set(Object obj)
        {
            boolean flag;
            if (current != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkState(flag);
            current.value = obj;
        }

        ValueForKeyIterator(Object obj)
        {
            this$0 = LinkedListMultimap.this;
            super();
            key = obj;
            next = (Node)keyToKeyHead.get(obj);
        }

        public ValueForKeyIterator(Object obj, int i)
        {
            this$0 = LinkedListMultimap.this;
            super();
            int j = keyCount.count(obj);
            Preconditions.checkPositionIndex(i, j);
            if (i >= j / 2)
            {
                previous = (Node)keyToKeyTail.get(obj);
                nextIndex = j;
                for (; i < j; i++)
                {
                    previous();
                }

            } else
            {
                next = (Node)keyToKeyHead.get(obj);
                for (; i > 0; i--)
                {
                    next();
                }

            }
            key = obj;
            current = null;
        }
    }


    private static final long serialVersionUID = 0L;
    private transient Collection entries;
    private transient Node head;
    private transient Multiset keyCount;
    private transient Set keySet;
    private transient Map keyToKeyHead;
    private transient Map keyToKeyTail;
    private transient Multiset keys;
    private transient Map map;
    private transient Node tail;
    private transient Collection valuesCollection;

    private LinkedListMultimap()
    {
        keyCount = LinkedHashMultiset.create();
        keyToKeyHead = Maps.newHashMap();
        keyToKeyTail = Maps.newHashMap();
    }

    private LinkedListMultimap(int i)
    {
        keyCount = LinkedHashMultiset.create(i);
        keyToKeyHead = Maps.newHashMapWithExpectedSize(i);
        keyToKeyTail = Maps.newHashMapWithExpectedSize(i);
    }

    private LinkedListMultimap(Multimap multimap)
    {
        this(multimap.keySet().size());
        putAll(multimap);
    }

    private Node addNode(Object obj, Object obj1, Node node)
    {
        obj1 = new Node(obj, obj1);
        if (head == null)
        {
            tail = ((Node) (obj1));
            head = ((Node) (obj1));
            keyToKeyHead.put(obj, obj1);
            keyToKeyTail.put(obj, obj1);
        } else
        if (node == null)
        {
            tail.next = ((Node) (obj1));
            obj1.previous = tail;
            node = (Node)keyToKeyTail.get(obj);
            if (node == null)
            {
                keyToKeyHead.put(obj, obj1);
            } else
            {
                node.nextSibling = ((Node) (obj1));
                obj1.previousSibling = node;
            }
            keyToKeyTail.put(obj, obj1);
            tail = ((Node) (obj1));
        } else
        {
            obj1.previous = node.previous;
            obj1.previousSibling = node.previousSibling;
            obj1.next = node;
            obj1.nextSibling = node;
            if (node.previousSibling == null)
            {
                keyToKeyHead.put(obj, obj1);
            } else
            {
                node.previousSibling.nextSibling = ((Node) (obj1));
            }
            if (node.previous == null)
            {
                head = ((Node) (obj1));
            } else
            {
                node.previous.next = ((Node) (obj1));
            }
            node.previous = ((Node) (obj1));
            node.previousSibling = ((Node) (obj1));
        }
        keyCount.add(obj);
        return ((Node) (obj1));
    }

    private static void checkElement(Object obj)
    {
        if (obj == null)
        {
            throw new NoSuchElementException();
        } else
        {
            return;
        }
    }

    public static LinkedListMultimap create()
    {
        return new LinkedListMultimap();
    }

    public static LinkedListMultimap create(int i)
    {
        return new LinkedListMultimap(i);
    }

    public static LinkedListMultimap create(Multimap multimap)
    {
        return new LinkedListMultimap(multimap);
    }

    private List getCopy(Object obj)
    {
        return Collections.unmodifiableList(Lists.newArrayList(new ValueForKeyIterator(obj)));
    }

    private void readObject(ObjectInputStream objectinputstream)
        throws IOException, ClassNotFoundException
    {
        objectinputstream.defaultReadObject();
        keyCount = LinkedHashMultiset.create();
        keyToKeyHead = Maps.newHashMap();
        keyToKeyTail = Maps.newHashMap();
        int j = objectinputstream.readInt();
        for (int i = 0; i < j; i++)
        {
            put(objectinputstream.readObject(), objectinputstream.readObject());
        }

    }

    private void removeAllNodes(Object obj)
    {
        for (obj = new ValueForKeyIterator(obj); ((Iterator) (obj)).hasNext(); ((Iterator) (obj)).remove())
        {
            ((Iterator) (obj)).next();
        }

    }

    private void removeNode(Node node)
    {
        if (node.previous != null)
        {
            node.previous.next = node.next;
        } else
        {
            head = node.next;
        }
        if (node.next != null)
        {
            node.next.previous = node.previous;
        } else
        {
            tail = node.previous;
        }
        if (node.previousSibling != null)
        {
            node.previousSibling.nextSibling = node.nextSibling;
        } else
        if (node.nextSibling != null)
        {
            keyToKeyHead.put(node.key, node.nextSibling);
        } else
        {
            keyToKeyHead.remove(node.key);
        }
        if (node.nextSibling != null)
        {
            node.nextSibling.previousSibling = node.previousSibling;
        } else
        if (node.previousSibling != null)
        {
            keyToKeyTail.put(node.key, node.previousSibling);
        } else
        {
            keyToKeyTail.remove(node.key);
        }
        keyCount.remove(node.key);
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
        throws IOException
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeInt(size());
        java.util.Map.Entry entry;
        for (Iterator iterator = entries().iterator(); iterator.hasNext(); objectoutputstream.writeObject(entry.getValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
            objectoutputstream.writeObject(entry.getKey());
        }

    }

    public Map asMap()
    {
        Map map1 = map;
        Object obj = map1;
        if (map1 == null)
        {
            obj = new AbstractMap() {

                Set entrySet;
                final LinkedListMultimap this$0;

                public boolean containsKey(Object obj1)
                {
                    return LinkedListMultimap.this.containsKey(obj1);
                }

                public Set entrySet()
                {
                    Set set = entrySet;
                    Object obj1 = set;
                    if (set == null)
                    {
                        obj1 = new AsMapEntries();
                        entrySet = ((Set) (obj1));
                    }
                    return ((Set) (obj1));
                }

                public volatile Object get(Object obj1)
                {
                    return get(obj1);
                }

                public Collection get(Object obj1)
                {
                    List list = LinkedListMultimap.this.get(obj1);
                    obj1 = list;
                    if (list.isEmpty())
                    {
                        obj1 = null;
                    }
                    return ((Collection) (obj1));
                }

                public volatile Object remove(Object obj1)
                {
                    return remove(obj1);
                }

                public Collection remove(Object obj1)
                {
                    List list = removeAll(obj1);
                    obj1 = list;
                    if (list.isEmpty())
                    {
                        obj1 = null;
                    }
                    return ((Collection) (obj1));
                }

            
            {
                this$0 = LinkedListMultimap.this;
                super();
            }
            };
            map = ((Map) (obj));
        }
        return ((Map) (obj));
    }

    public void clear()
    {
        head = null;
        tail = null;
        keyCount.clear();
        keyToKeyHead.clear();
        keyToKeyTail.clear();
    }

    public boolean containsEntry(Object obj, Object obj1)
    {
        for (obj = new ValueForKeyIterator(obj); ((Iterator) (obj)).hasNext();)
        {
            if (Objects.equal(((Iterator) (obj)).next(), obj1))
            {
                return true;
            }
        }

        return false;
    }

    public boolean containsKey(Object obj)
    {
        return keyToKeyHead.containsKey(obj);
    }

    public boolean containsValue(Object obj)
    {
        for (NodeIterator nodeiterator = new NodeIterator(); nodeiterator.hasNext();)
        {
            if (Objects.equal(((Node)nodeiterator.next()).value, obj))
            {
                return true;
            }
        }

        return false;
    }

    public Collection entries()
    {
        Collection collection = entries;
        Object obj = collection;
        if (collection == null)
        {
            obj = new AbstractCollection() {

                final LinkedListMultimap this$0;

                public Iterator iterator()
                {
                    return (new NodeIterator()). new Iterator() {

                        final _cls4 this$1;
                        final Iterator val$nodes;

                        public boolean hasNext()
                        {
                            return nodes.hasNext();
                        }

                        public volatile Object next()
                        {
                            return next();
                        }

                        public java.util.Map.Entry next()
                        {
                            return ((Node)nodes.next()). new AbstractMapEntry() {

                                final _cls1 this$2;
                                final Node val$node;

                                public Object getKey()
                                {
                                    return node.key;
                                }

                                public Object getValue()
                                {
                                    return node.value;
                                }

                                public Object setValue(Object obj)
                                {
                                    Object obj1 = node.value;
                                    node.value = obj;
                                    return obj1;
                                }

            
            {
                this$2 = final__pcls1;
                node = Node.this;
                super();
            }
                            };
                        }

                        public void remove()
                        {
                            nodes.remove();
                        }

            
            {
                this$1 = final__pcls4;
                nodes = Iterator.this;
                super();
            }
                    };
                }

                public int size()
                {
                    return keyCount.size();
                }

            
            {
                this$0 = LinkedListMultimap.this;
                super();
            }
            };
            entries = ((Collection) (obj));
        }
        return ((Collection) (obj));
    }

    public boolean equals(Object obj)
    {
        if (obj == this)
        {
            return true;
        }
        if (obj instanceof Multimap)
        {
            obj = (Multimap)obj;
            return asMap().equals(((Multimap) (obj)).asMap());
        } else
        {
            return false;
        }
    }

    public volatile Collection get(Object obj)
    {
        return get(obj);
    }

    public List get(final Object key)
    {
        return new AbstractSequentialList() {

            final LinkedListMultimap this$0;
            final Object val$key;

            public ListIterator listIterator(int i)
            {
                return new ValueForKeyIterator(key, i);
            }

            public boolean removeAll(Collection collection)
            {
                return Iterators.removeAll(iterator(), collection);
            }

            public boolean retainAll(Collection collection)
            {
                return Iterators.retainAll(iterator(), collection);
            }

            public int size()
            {
                return keyCount.count(key);
            }

            
            {
                this$0 = LinkedListMultimap.this;
                key = obj;
                super();
            }
        };
    }

    public int hashCode()
    {
        return asMap().hashCode();
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public Set keySet()
    {
        Set set = keySet;
        Object obj = set;
        if (set == null)
        {
            obj = new AbstractSet() {

                final LinkedListMultimap this$0;

                public boolean contains(Object obj1)
                {
                    return keyCount.contains(obj1);
                }

                public Iterator iterator()
                {
                    return new DistinctKeyIterator();
                }

                public boolean removeAll(Collection collection)
                {
                    Preconditions.checkNotNull(collection);
                    return super.removeAll(collection);
                }

                public int size()
                {
                    return keyCount.elementSet().size();
                }

            
            {
                this$0 = LinkedListMultimap.this;
                super();
            }
            };
            keySet = ((Set) (obj));
        }
        return ((Set) (obj));
    }

    public Multiset keys()
    {
        Multiset multiset = keys;
        Object obj = multiset;
        if (multiset == null)
        {
            obj = new MultisetView();
            keys = ((Multiset) (obj));
        }
        return ((Multiset) (obj));
    }

    public boolean put(Object obj, Object obj1)
    {
        addNode(obj, obj1, null);
        return true;
    }

    public boolean putAll(Multimap multimap)
    {
        boolean flag = false;
        for (multimap = multimap.entries().iterator(); multimap.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)multimap.next();
            flag |= put(entry.getKey(), entry.getValue());
        }

        return flag;
    }

    public boolean putAll(Object obj, Iterable iterable)
    {
        boolean flag = false;
        for (iterable = iterable.iterator(); iterable.hasNext();)
        {
            flag |= put(obj, iterable.next());
        }

        return flag;
    }

    public boolean remove(Object obj, Object obj1)
    {
        for (obj = new ValueForKeyIterator(obj); ((Iterator) (obj)).hasNext();)
        {
            if (Objects.equal(((Iterator) (obj)).next(), obj1))
            {
                ((Iterator) (obj)).remove();
                return true;
            }
        }

        return false;
    }

    public volatile Collection removeAll(Object obj)
    {
        return removeAll(obj);
    }

    public List removeAll(Object obj)
    {
        List list = getCopy(obj);
        removeAllNodes(obj);
        return list;
    }

    public volatile Collection replaceValues(Object obj, Iterable iterable)
    {
        return replaceValues(obj, iterable);
    }

    public List replaceValues(Object obj, Iterable iterable)
    {
        List list = getCopy(obj);
        obj = new ValueForKeyIterator(obj);
        for (iterable = iterable.iterator(); ((ListIterator) (obj)).hasNext() && iterable.hasNext(); ((ListIterator) (obj)).set(iterable.next()))
        {
            ((ListIterator) (obj)).next();
        }

        for (; ((ListIterator) (obj)).hasNext(); ((ListIterator) (obj)).remove())
        {
            ((ListIterator) (obj)).next();
        }

        for (; iterable.hasNext(); ((ListIterator) (obj)).add(iterable.next())) { }
        return list;
    }

    public int size()
    {
        return keyCount.size();
    }

    public String toString()
    {
        return asMap().toString();
    }

    public Collection values()
    {
        Collection collection = valuesCollection;
        Object obj = collection;
        if (collection == null)
        {
            obj = new AbstractCollection() {

                final LinkedListMultimap this$0;

                public Iterator iterator()
                {
                    return (new NodeIterator()). new Iterator() {

                        final _cls3 this$1;
                        final Iterator val$nodes;

                        public boolean hasNext()
                        {
                            return nodes.hasNext();
                        }

                        public Object next()
                        {
                            return ((Node)nodes.next()).value;
                        }

                        public void remove()
                        {
                            nodes.remove();
                        }

            
            {
                this$1 = final__pcls3;
                nodes = Iterator.this;
                super();
            }
                    };
                }

                public int size()
                {
                    return keyCount.size();
                }

            
            {
                this$0 = LinkedListMultimap.this;
                super();
            }
            };
            valuesCollection = ((Collection) (obj));
        }
        return ((Collection) (obj));
    }








}
