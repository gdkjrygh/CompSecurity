// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.bidimap;

import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import org.apache.commons.collections4.MapIterator;
import org.apache.commons.collections4.OrderedBidiMap;
import org.apache.commons.collections4.OrderedIterator;
import org.apache.commons.collections4.OrderedMapIterator;

public class TreeBidiMap
    implements Serializable, OrderedBidiMap
{
    static final class DataElement extends Enum
    {

        private static final DataElement $VALUES[];
        public static final DataElement KEY;
        public static final DataElement VALUE;
        private final String description;

        public static DataElement valueOf(String s)
        {
            return (DataElement)Enum.valueOf(org/apache/commons/collections4/bidimap/TreeBidiMap$DataElement, s);
        }

        public static DataElement[] values()
        {
            return (DataElement[])$VALUES.clone();
        }

        public String toString()
        {
            return description;
        }

        static 
        {
            KEY = new DataElement("KEY", 0, "key");
            VALUE = new DataElement("VALUE", 1, "value");
            $VALUES = (new DataElement[] {
                KEY, VALUE
            });
        }

        private DataElement(String s, int i, String s1)
        {
            super(s, i);
            description = s1;
        }
    }

    class EntryView extends View
    {

        final TreeBidiMap this$0;

        public boolean contains(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                Object obj1 = (java.util.Map.Entry)obj;
                obj = ((java.util.Map.Entry) (obj1)).getValue();
                obj1 = lookupKey(((java.util.Map.Entry) (obj1)).getKey());
                if (obj1 != null && ((Node) (obj1)).getValue().equals(obj))
                {
                    return true;
                }
            }
            return false;
        }

        public Iterator iterator()
        {
            return new ViewMapEntryIterator();
        }

        public boolean remove(Object obj)
        {
            if (obj instanceof java.util.Map.Entry)
            {
                Object obj1 = (java.util.Map.Entry)obj;
                obj = ((java.util.Map.Entry) (obj1)).getValue();
                obj1 = lookupKey(((java.util.Map.Entry) (obj1)).getKey());
                if (obj1 != null && ((Node) (obj1)).getValue().equals(obj))
                {
                    doRedBlackDelete(((Node) (obj1)));
                    return true;
                }
            }
            return false;
        }

        EntryView()
        {
            this$0 = TreeBidiMap.this;
            super(DataElement.KEY);
        }
    }

    class InverseViewMapIterator extends ViewIterator
        implements OrderedMapIterator
    {

        final TreeBidiMap this$0;

        public Comparable getValue()
        {
            if (lastReturnedNode == null)
            {
                throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
            } else
            {
                return lastReturnedNode.getKey();
            }
        }

        public volatile Object getValue()
        {
            return getValue();
        }

        public Comparable next()
        {
            return navigateNext().getValue();
        }

        public volatile Object next()
        {
            return next();
        }

        public InverseViewMapIterator(DataElement dataelement)
        {
            this$0 = TreeBidiMap.this;
            super(dataelement);
        }
    }

    class KeyView extends View
    {

        final TreeBidiMap this$0;

        public boolean contains(Object obj)
        {
            TreeBidiMap.checkNonNullComparable(obj, DataElement.KEY);
            return lookupKey(obj) != null;
        }

        public Iterator iterator()
        {
            return new ViewMapIterator(orderType);
        }

        public boolean remove(Object obj)
        {
            return doRemoveKey(obj) != null;
        }

        public KeyView(DataElement dataelement)
        {
            this$0 = TreeBidiMap.this;
            super(dataelement);
        }
    }

    static class Node
        implements java.util.Map.Entry
    {

        private final boolean blackColor[] = {
            1, 1
        };
        private boolean calculatedHashCode;
        private int hashcodeValue;
        private final Comparable key;
        private final Node leftNode[] = new Node[2];
        private final Node parentNode[] = new Node[2];
        private final Node rightNode[] = new Node[2];
        private final Comparable value;

        private void copyColor(Node node, DataElement dataelement)
        {
            blackColor[dataelement.ordinal()] = node.blackColor[dataelement.ordinal()];
        }

        private Object getData(DataElement dataelement)
        {
            static class _cls1
            {

                static final int $SwitchMap$org$apache$commons$collections4$bidimap$TreeBidiMap$DataElement[];

                static 
                {
                    $SwitchMap$org$apache$commons$collections4$bidimap$TreeBidiMap$DataElement = new int[DataElement.values().length];
                    try
                    {
                        $SwitchMap$org$apache$commons$collections4$bidimap$TreeBidiMap$DataElement[DataElement.KEY.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        $SwitchMap$org$apache$commons$collections4$bidimap$TreeBidiMap$DataElement[DataElement.VALUE.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1..SwitchMap.org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement[dataelement.ordinal()])
            {
            default:
                throw new IllegalArgumentException();

            case 1: // '\001'
                return getKey();

            case 2: // '\002'
                return getValue();
            }
        }

        private Node getLeft(DataElement dataelement)
        {
            return leftNode[dataelement.ordinal()];
        }

        private Node getParent(DataElement dataelement)
        {
            return parentNode[dataelement.ordinal()];
        }

        private Node getRight(DataElement dataelement)
        {
            return rightNode[dataelement.ordinal()];
        }

        private boolean isBlack(DataElement dataelement)
        {
            return blackColor[dataelement.ordinal()];
        }

        private boolean isLeftChild(DataElement dataelement)
        {
            return parentNode[dataelement.ordinal()] != null && parentNode[dataelement.ordinal()].leftNode[dataelement.ordinal()] == this;
        }

        private boolean isRed(DataElement dataelement)
        {
            return !blackColor[dataelement.ordinal()];
        }

        private boolean isRightChild(DataElement dataelement)
        {
            return parentNode[dataelement.ordinal()] != null && parentNode[dataelement.ordinal()].rightNode[dataelement.ordinal()] == this;
        }

        private void setBlack(DataElement dataelement)
        {
            blackColor[dataelement.ordinal()] = true;
        }

        private void setLeft(Node node, DataElement dataelement)
        {
            leftNode[dataelement.ordinal()] = node;
        }

        private void setParent(Node node, DataElement dataelement)
        {
            parentNode[dataelement.ordinal()] = node;
        }

        private void setRed(DataElement dataelement)
        {
            blackColor[dataelement.ordinal()] = false;
        }

        private void setRight(Node node, DataElement dataelement)
        {
            rightNode[dataelement.ordinal()] = node;
        }

        private void swapColors(Node node, DataElement dataelement)
        {
            boolean aflag[] = blackColor;
            int i = dataelement.ordinal();
            aflag[i] = aflag[i] ^ node.blackColor[dataelement.ordinal()];
            aflag = node.blackColor;
            i = dataelement.ordinal();
            aflag[i] = aflag[i] ^ blackColor[dataelement.ordinal()];
            aflag = blackColor;
            i = dataelement.ordinal();
            aflag[i] = aflag[i] ^ node.blackColor[dataelement.ordinal()];
        }

        public boolean equals(Object obj)
        {
            if (obj != this)
            {
                if (!(obj instanceof java.util.Map.Entry))
                {
                    return false;
                }
                obj = (java.util.Map.Entry)obj;
                if (!getKey().equals(((java.util.Map.Entry) (obj)).getKey()) || !getValue().equals(((java.util.Map.Entry) (obj)).getValue()))
                {
                    return false;
                }
            }
            return true;
        }

        public Comparable getKey()
        {
            return key;
        }

        public volatile Object getKey()
        {
            return getKey();
        }

        public Comparable getValue()
        {
            return value;
        }

        public volatile Object getValue()
        {
            return getValue();
        }

        public int hashCode()
        {
            if (!calculatedHashCode)
            {
                hashcodeValue = getKey().hashCode() ^ getValue().hashCode();
                calculatedHashCode = true;
            }
            return hashcodeValue;
        }

        public Comparable setValue(Comparable comparable)
            throws UnsupportedOperationException
        {
            throw new UnsupportedOperationException("Map.Entry.setValue is not supported");
        }

        public volatile Object setValue(Object obj)
        {
            return setValue((Comparable)obj);
        }
















        Node(Comparable comparable, Comparable comparable1)
        {
            key = comparable;
            value = comparable1;
            calculatedHashCode = false;
        }
    }

    class ValueView extends View
    {

        final TreeBidiMap this$0;

        public boolean contains(Object obj)
        {
            TreeBidiMap.checkNonNullComparable(obj, DataElement.VALUE);
            return lookupValue(obj) != null;
        }

        public Iterator iterator()
        {
            return new InverseViewMapIterator(orderType);
        }

        public boolean remove(Object obj)
        {
            return doRemoveValue(obj) != null;
        }

        public ValueView(DataElement dataelement)
        {
            this$0 = TreeBidiMap.this;
            super(dataelement);
        }
    }

    abstract class View extends AbstractSet
    {

        final DataElement orderType;
        final TreeBidiMap this$0;

        public void clear()
        {
            TreeBidiMap.this.clear();
        }

        public int size()
        {
            return TreeBidiMap.this.size();
        }

        View(DataElement dataelement)
        {
            this$0 = TreeBidiMap.this;
            super();
            orderType = dataelement;
        }
    }

    abstract class ViewIterator
    {

        private int expectedModifications;
        Node lastReturnedNode;
        private Node nextNode;
        private final DataElement orderType;
        private Node previousNode;
        final TreeBidiMap this$0;

        public final boolean hasNext()
        {
            return nextNode != null;
        }

        protected Node navigateNext()
        {
            if (nextNode == null)
            {
                throw new NoSuchElementException();
            }
            if (modifications != expectedModifications)
            {
                throw new ConcurrentModificationException();
            } else
            {
                lastReturnedNode = nextNode;
                previousNode = nextNode;
                nextNode = nextGreater(nextNode, orderType);
                return lastReturnedNode;
            }
        }

        public final void remove()
        {
            if (lastReturnedNode == null)
            {
                throw new IllegalStateException();
            }
            if (modifications != expectedModifications)
            {
                throw new ConcurrentModificationException();
            }
            doRedBlackDelete(lastReturnedNode);
            expectedModifications = expectedModifications + 1;
            lastReturnedNode = null;
            if (nextNode == null)
            {
                previousNode = greatestNode(rootNode[orderType.ordinal()], orderType);
                return;
            } else
            {
                previousNode = nextSmaller(nextNode, orderType);
                return;
            }
        }

        ViewIterator(DataElement dataelement)
        {
            this$0 = TreeBidiMap.this;
            super();
            orderType = dataelement;
            expectedModifications = modifications;
            nextNode = leastNode(rootNode[dataelement.ordinal()], dataelement);
            lastReturnedNode = null;
            previousNode = null;
        }
    }

    class ViewMapEntryIterator extends ViewIterator
        implements OrderedIterator
    {

        final TreeBidiMap this$0;

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            return navigateNext();
        }

        ViewMapEntryIterator()
        {
            this$0 = TreeBidiMap.this;
            super(DataElement.KEY);
        }
    }

    class ViewMapIterator extends ViewIterator
        implements OrderedMapIterator
    {

        final TreeBidiMap this$0;

        public Comparable getValue()
        {
            if (lastReturnedNode == null)
            {
                throw new IllegalStateException("Iterator getValue() can only be called after next() and before remove()");
            } else
            {
                return lastReturnedNode.getValue();
            }
        }

        public volatile Object getValue()
        {
            return getValue();
        }

        public Comparable next()
        {
            return navigateNext().getKey();
        }

        public volatile Object next()
        {
            return next();
        }

        ViewMapIterator(DataElement dataelement)
        {
            this$0 = TreeBidiMap.this;
            super(dataelement);
        }
    }


    private transient Set entrySet;
    private transient Set keySet;
    private transient int modifications;
    private transient int nodeCount;
    private transient Node rootNode[];
    private transient Set valuesSet;

    private static void checkKey(Object obj)
    {
        checkNonNullComparable(obj, DataElement.KEY);
    }

    private static void checkKeyAndValue(Object obj, Object obj1)
    {
        checkKey(obj);
        checkValue(obj1);
    }

    private static void checkNonNullComparable(Object obj, DataElement dataelement)
    {
        if (obj == null)
        {
            throw new NullPointerException((new StringBuilder()).append(dataelement).append(" cannot be null").toString());
        }
        if (!(obj instanceof Comparable))
        {
            throw new ClassCastException((new StringBuilder()).append(dataelement).append(" must be Comparable").toString());
        } else
        {
            return;
        }
    }

    private static void checkValue(Object obj)
    {
        checkNonNullComparable(obj, DataElement.VALUE);
    }

    private static int compare(Comparable comparable, Comparable comparable1)
    {
        return comparable.compareTo(comparable1);
    }

    private void copyColor(Node node, Node node1, DataElement dataelement)
    {
label0:
        {
            if (node1 != null)
            {
                if (node != null)
                {
                    break label0;
                }
                node1.setBlack(dataelement);
            }
            return;
        }
        node1.copyColor(node, dataelement);
    }

    private boolean doEquals(Object obj, DataElement dataelement)
    {
        if (obj != this) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof Map))
        {
            return false;
        }
        obj = (Map)obj;
        if (((Map) (obj)).size() != size())
        {
            return false;
        }
        if (nodeCount <= 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        dataelement = getMapIterator(dataelement);
        boolean flag;
        do
        {
            if (!dataelement.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            Object obj1 = dataelement.next();
            flag = dataelement.getValue().equals(((Map) (obj)).get(obj1));
        } while (flag);
        break; /* Loop/switch isn't completed */
        if (true) goto _L1; else goto _L3
_L3:
        return false;
        obj;
        return false;
        obj;
        return false;
    }

    private int doHashCode(DataElement dataelement)
    {
        int j = 0;
        int i = 0;
        if (nodeCount > 0)
        {
            dataelement = getMapIterator(dataelement);
            do
            {
                j = i;
                if (!dataelement.hasNext())
                {
                    break;
                }
                Object obj = dataelement.next();
                Object obj1 = dataelement.getValue();
                i += obj.hashCode() ^ obj1.hashCode();
            } while (true);
        }
        return j;
    }

    private void doPut(Comparable comparable, Comparable comparable1)
    {
        Node node;
        checkKeyAndValue(comparable, comparable1);
        doRemoveKey(comparable);
        doRemoveValue(comparable1);
        Node node1 = rootNode[DataElement.KEY.ordinal()];
        node = node1;
        if (node1 == null)
        {
            comparable = new Node(comparable, comparable1);
            rootNode[DataElement.KEY.ordinal()] = comparable;
            rootNode[DataElement.VALUE.ordinal()] = comparable;
            grow();
            return;
        }
          goto _L1
_L8:
        int i;
        if (i >= 0) goto _L3; else goto _L2
_L2:
        if (node.getLeft(DataElement.KEY) == null) goto _L5; else goto _L4
_L4:
        node = node.getLeft(DataElement.KEY);
_L1:
        if ((i = compare(comparable, node.getKey())) == 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Cannot store a duplicate key (\"").append(comparable).append("\") in this Map").toString());
        }
        continue; /* Loop/switch isn't completed */
_L5:
        comparable = new Node(comparable, comparable1);
        insertValue(comparable);
        node.setLeft(comparable, DataElement.KEY);
        comparable.setParent(node, DataElement.KEY);
        doRedBlackInsert(comparable, DataElement.KEY);
        grow();
        return;
_L3:
        if (node.getRight(DataElement.KEY) != null)
        {
            node = node.getRight(DataElement.KEY);
        } else
        {
            comparable = new Node(comparable, comparable1);
            insertValue(comparable);
            node.setRight(comparable, DataElement.KEY);
            comparable.setParent(node, DataElement.KEY);
            doRedBlackInsert(comparable, DataElement.KEY);
            grow();
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
        if (true) goto _L8; else goto _L7
_L7:
    }

    private void doRedBlackDelete(Node node)
    {
        DataElement adataelement[];
        int i;
        int j;
        adataelement = DataElement.values();
        j = adataelement.length;
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L1
_L1:
        Node node1;
        DataElement dataelement;
        dataelement = adataelement[i];
        if (node.getLeft(dataelement) != null && node.getRight(dataelement) != null)
        {
            swapPosition(nextGreater(node, dataelement), node, dataelement);
        }
        if (node.getLeft(dataelement) != null)
        {
            node1 = node.getLeft(dataelement);
        } else
        {
            node1 = node.getRight(dataelement);
        }
        if (node1 == null) goto _L4; else goto _L3
_L3:
        node1.setParent(node.getParent(dataelement), dataelement);
        if (node.getParent(dataelement) == null)
        {
            rootNode[dataelement.ordinal()] = node1;
        } else
        if (node == node.getParent(dataelement).Node.getLeft(dataelement))
        {
            node.getParent(dataelement).Node.setLeft(node1, dataelement);
        } else
        {
            node.getParent(dataelement).Node.setRight(node1, dataelement);
        }
        node.setLeft(null, dataelement);
        node.setRight(null, dataelement);
        node.setParent(null, dataelement);
        if (isBlack(node, dataelement))
        {
            doRedBlackDeleteFixup(node1, dataelement);
        }
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (node.getParent(dataelement) == null)
        {
            rootNode[dataelement.ordinal()] = null;
        } else
        {
            if (isBlack(node, dataelement))
            {
                doRedBlackDeleteFixup(node, dataelement);
            }
            if (node.getParent(dataelement) != null)
            {
                if (node == node.getParent(dataelement).Node.getLeft(dataelement))
                {
                    node.getParent(dataelement).Node.setLeft(null, dataelement);
                } else
                {
                    node.getParent(dataelement).Node.setRight(null, dataelement);
                }
                node.setParent(null, dataelement);
            }
        }
        if (true) goto _L5; else goto _L2
_L2:
        shrink();
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void doRedBlackDeleteFixup(Node node, DataElement dataelement)
    {
        while (node != rootNode[dataelement.ordinal()] && isBlack(node, dataelement)) 
        {
            if (node.isLeftChild(dataelement))
            {
                Node node3 = getRightChild(getParent(node, dataelement), dataelement);
                Node node1 = node3;
                if (isRed(node3, dataelement))
                {
                    makeBlack(node3, dataelement);
                    makeRed(getParent(node, dataelement), dataelement);
                    rotateLeft(getParent(node, dataelement), dataelement);
                    node1 = getRightChild(getParent(node, dataelement), dataelement);
                }
                if (isBlack(getLeftChild(node1, dataelement), dataelement) && isBlack(getRightChild(node1, dataelement), dataelement))
                {
                    makeRed(node1, dataelement);
                    node = getParent(node, dataelement);
                } else
                {
                    Node node4 = node1;
                    if (isBlack(getRightChild(node1, dataelement), dataelement))
                    {
                        makeBlack(getLeftChild(node1, dataelement), dataelement);
                        makeRed(node1, dataelement);
                        rotateRight(node1, dataelement);
                        node4 = getRightChild(getParent(node, dataelement), dataelement);
                    }
                    copyColor(getParent(node, dataelement), node4, dataelement);
                    makeBlack(getParent(node, dataelement), dataelement);
                    makeBlack(getRightChild(node4, dataelement), dataelement);
                    rotateLeft(getParent(node, dataelement), dataelement);
                    node = rootNode[dataelement.ordinal()];
                }
            } else
            {
                Node node5 = getLeftChild(getParent(node, dataelement), dataelement);
                Node node2 = node5;
                if (isRed(node5, dataelement))
                {
                    makeBlack(node5, dataelement);
                    makeRed(getParent(node, dataelement), dataelement);
                    rotateRight(getParent(node, dataelement), dataelement);
                    node2 = getLeftChild(getParent(node, dataelement), dataelement);
                }
                if (isBlack(getRightChild(node2, dataelement), dataelement) && isBlack(getLeftChild(node2, dataelement), dataelement))
                {
                    makeRed(node2, dataelement);
                    node = getParent(node, dataelement);
                } else
                {
                    Node node6 = node2;
                    if (isBlack(getLeftChild(node2, dataelement), dataelement))
                    {
                        makeBlack(getRightChild(node2, dataelement), dataelement);
                        makeRed(node2, dataelement);
                        rotateLeft(node2, dataelement);
                        node6 = getLeftChild(getParent(node, dataelement), dataelement);
                    }
                    copyColor(getParent(node, dataelement), node6, dataelement);
                    makeBlack(getParent(node, dataelement), dataelement);
                    makeBlack(getLeftChild(node6, dataelement), dataelement);
                    rotateRight(getParent(node, dataelement), dataelement);
                    node = rootNode[dataelement.ordinal()];
                }
            }
        }
        makeBlack(node, dataelement);
    }

    private void doRedBlackInsert(Node node, DataElement dataelement)
    {
        makeRed(node, dataelement);
        do
        {
            if (node == null || node == rootNode[dataelement.ordinal()] || !isRed(node.getParent(dataelement), dataelement))
            {
                break;
            }
            if (node.isLeftChild(dataelement))
            {
                Node node1 = getRightChild(getGrandParent(node, dataelement), dataelement);
                if (isRed(node1, dataelement))
                {
                    makeBlack(getParent(node, dataelement), dataelement);
                    makeBlack(node1, dataelement);
                    makeRed(getGrandParent(node, dataelement), dataelement);
                    node = getGrandParent(node, dataelement);
                } else
                {
                    Node node2 = node;
                    if (node.isRightChild(dataelement))
                    {
                        node2 = getParent(node, dataelement);
                        rotateLeft(node2, dataelement);
                    }
                    makeBlack(getParent(node2, dataelement), dataelement);
                    makeRed(getGrandParent(node2, dataelement), dataelement);
                    node = node2;
                    if (getGrandParent(node2, dataelement) != null)
                    {
                        rotateRight(getGrandParent(node2, dataelement), dataelement);
                        node = node2;
                    }
                }
            } else
            {
                Node node3 = getLeftChild(getGrandParent(node, dataelement), dataelement);
                if (isRed(node3, dataelement))
                {
                    makeBlack(getParent(node, dataelement), dataelement);
                    makeBlack(node3, dataelement);
                    makeRed(getGrandParent(node, dataelement), dataelement);
                    node = getGrandParent(node, dataelement);
                } else
                {
                    Node node4 = node;
                    if (node.isLeftChild(dataelement))
                    {
                        node4 = getParent(node, dataelement);
                        rotateRight(node4, dataelement);
                    }
                    makeBlack(getParent(node4, dataelement), dataelement);
                    makeRed(getGrandParent(node4, dataelement), dataelement);
                    node = node4;
                    if (getGrandParent(node4, dataelement) != null)
                    {
                        rotateLeft(getGrandParent(node4, dataelement), dataelement);
                        node = node4;
                    }
                }
            }
        } while (true);
        makeBlack(rootNode[dataelement.ordinal()], dataelement);
    }

    private Comparable doRemoveKey(Object obj)
    {
        obj = lookupKey(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            doRedBlackDelete(((Node) (obj)));
            return ((Node) (obj)).getValue();
        }
    }

    private Comparable doRemoveValue(Object obj)
    {
        obj = lookupValue(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            doRedBlackDelete(((Node) (obj)));
            return ((Node) (obj)).getKey();
        }
    }

    private String doToString(DataElement dataelement)
    {
        if (nodeCount == 0)
        {
            return "{}";
        }
        StringBuilder stringbuilder = new StringBuilder(nodeCount * 32);
        stringbuilder.append('{');
        MapIterator mapiterator = getMapIterator(dataelement);
        boolean flag = mapiterator.hasNext();
        do
        {
            if (!flag)
            {
                break;
            }
            Object obj1 = mapiterator.next();
            Object obj = mapiterator.getValue();
            dataelement = ((DataElement) (obj1));
            if (obj1 == this)
            {
                dataelement = "(this Map)";
            }
            obj1 = stringbuilder.append(dataelement).append('=');
            dataelement = ((DataElement) (obj));
            if (obj == this)
            {
                dataelement = "(this Map)";
            }
            ((StringBuilder) (obj1)).append(dataelement);
            boolean flag1 = mapiterator.hasNext();
            flag = flag1;
            if (flag1)
            {
                stringbuilder.append(", ");
                flag = flag1;
            }
        } while (true);
        stringbuilder.append('}');
        return stringbuilder.toString();
    }

    private Node getGrandParent(Node node, DataElement dataelement)
    {
        return getParent(getParent(node, dataelement), dataelement);
    }

    private Node getLeftChild(Node node, DataElement dataelement)
    {
        if (node == null)
        {
            return null;
        } else
        {
            return node.getLeft(dataelement);
        }
    }

    private MapIterator getMapIterator(DataElement dataelement)
    {
        switch (_cls1..SwitchMap.org.apache.commons.collections4.bidimap.TreeBidiMap.DataElement[dataelement.ordinal()])
        {
        default:
            throw new IllegalArgumentException();

        case 1: // '\001'
            return new ViewMapIterator(DataElement.KEY);

        case 2: // '\002'
            return new InverseViewMapIterator(DataElement.VALUE);
        }
    }

    private Node getParent(Node node, DataElement dataelement)
    {
        if (node == null)
        {
            return null;
        } else
        {
            return node.getParent(dataelement);
        }
    }

    private Node getRightChild(Node node, DataElement dataelement)
    {
        if (node == null)
        {
            return null;
        } else
        {
            return node.getRight(dataelement);
        }
    }

    private Node greatestNode(Node node, DataElement dataelement)
    {
        Node node1 = node;
        if (node != null)
        {
            do
            {
                node1 = node;
                if (node.getRight(dataelement) == null)
                {
                    break;
                }
                node = node.getRight(dataelement);
            } while (true);
        }
        return node1;
    }

    private void grow()
    {
        modify();
        nodeCount = nodeCount + 1;
    }

    private void insertValue(Node node)
        throws IllegalArgumentException
    {
        Node node1 = rootNode[DataElement.VALUE.ordinal()];
        do
        {
            int i = compare(node.getValue(), node1.getValue());
            if (i == 0)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Cannot store a duplicate value (\"").append(node.getData(DataElement.VALUE)).append("\") in this Map").toString());
            }
            if (i < 0)
            {
                if (node1.getLeft(DataElement.VALUE) != null)
                {
                    node1 = node1.getLeft(DataElement.VALUE);
                } else
                {
                    node1.setLeft(node, DataElement.VALUE);
                    node.setParent(node1, DataElement.VALUE);
                    doRedBlackInsert(node, DataElement.VALUE);
                    return;
                }
            } else
            if (node1.getRight(DataElement.VALUE) != null)
            {
                node1 = node1.getRight(DataElement.VALUE);
            } else
            {
                node1.setRight(node, DataElement.VALUE);
                node.setParent(node1, DataElement.VALUE);
                doRedBlackInsert(node, DataElement.VALUE);
                return;
            }
        } while (true);
    }

    private static boolean isBlack(Node node, DataElement dataelement)
    {
        return node == null || node.isBlack(dataelement);
    }

    private static boolean isRed(Node node, DataElement dataelement)
    {
        return node != null && node.isRed(dataelement);
    }

    private Node leastNode(Node node, DataElement dataelement)
    {
        Node node1 = node;
        if (node != null)
        {
            do
            {
                node1 = node;
                if (node.getLeft(dataelement) == null)
                {
                    break;
                }
                node = node.getLeft(dataelement);
            } while (true);
        }
        return node1;
    }

    private Node lookup(Object obj, DataElement dataelement)
    {
        Object obj1 = null;
        Node node = rootNode[dataelement.ordinal()];
        do
        {
            int i;
label0:
            {
                Node node1 = obj1;
                if (node != null)
                {
                    i = compare((Comparable)obj, (Comparable)node.getData(dataelement));
                    if (i != 0)
                    {
                        break label0;
                    }
                    node1 = node;
                }
                return node1;
            }
            if (i < 0)
            {
                node = node.getLeft(dataelement);
            } else
            {
                node = node.getRight(dataelement);
            }
        } while (true);
    }

    private Node lookupKey(Object obj)
    {
        return lookup(obj, DataElement.KEY);
    }

    private Node lookupValue(Object obj)
    {
        return lookup(obj, DataElement.VALUE);
    }

    private static void makeBlack(Node node, DataElement dataelement)
    {
        if (node != null)
        {
            node.setBlack(dataelement);
        }
    }

    private static void makeRed(Node node, DataElement dataelement)
    {
        if (node != null)
        {
            node.setRed(dataelement);
        }
    }

    private void modify()
    {
        modifications = modifications + 1;
    }

    private Node nextGreater(Node node, DataElement dataelement)
    {
        if (node == null)
        {
            return null;
        }
        if (node.getRight(dataelement) != null)
        {
            return leastNode(node.getRight(dataelement), dataelement);
        }
        Node node2 = node.getParent(dataelement);
        Node node1 = node;
        for (node = node2; node != null && node1 == node.getRight(dataelement); node = node.getParent(dataelement))
        {
            node1 = node;
        }

        return node;
    }

    private Node nextSmaller(Node node, DataElement dataelement)
    {
        if (node == null)
        {
            return null;
        }
        if (node.getLeft(dataelement) != null)
        {
            return greatestNode(node.getLeft(dataelement), dataelement);
        }
        Node node2 = node.getParent(dataelement);
        Node node1 = node;
        for (node = node2; node != null && node1 == node.getLeft(dataelement); node = node.getParent(dataelement))
        {
            node1 = node;
        }

        return node;
    }

    private void rotateLeft(Node node, DataElement dataelement)
    {
        Node node1 = node.getRight(dataelement);
        node.setRight(node1.getLeft(dataelement), dataelement);
        if (node1.getLeft(dataelement) != null)
        {
            node1.getLeft(dataelement).Node.setParent(node, dataelement);
        }
        node1.setParent(node.getParent(dataelement), dataelement);
        if (node.getParent(dataelement) == null)
        {
            rootNode[dataelement.ordinal()] = node1;
        } else
        if (node.getParent(dataelement).Node.getLeft(dataelement) == node)
        {
            node.getParent(dataelement).Node.setLeft(node1, dataelement);
        } else
        {
            node.getParent(dataelement).Node.setRight(node1, dataelement);
        }
        node1.setLeft(node, dataelement);
        node.setParent(node1, dataelement);
    }

    private void rotateRight(Node node, DataElement dataelement)
    {
        Node node1 = node.getLeft(dataelement);
        node.setLeft(node1.getRight(dataelement), dataelement);
        if (node1.getRight(dataelement) != null)
        {
            node1.getRight(dataelement).Node.setParent(node, dataelement);
        }
        node1.setParent(node.getParent(dataelement), dataelement);
        if (node.getParent(dataelement) == null)
        {
            rootNode[dataelement.ordinal()] = node1;
        } else
        if (node.getParent(dataelement).Node.getRight(dataelement) == node)
        {
            node.getParent(dataelement).Node.setRight(node1, dataelement);
        } else
        {
            node.getParent(dataelement).Node.setLeft(node1, dataelement);
        }
        node1.setRight(node, dataelement);
        node.setParent(node1, dataelement);
    }

    private void shrink()
    {
        modify();
        nodeCount = nodeCount - 1;
    }

    private void swapPosition(Node node, Node node1, DataElement dataelement)
    {
        Node node2 = node.getParent(dataelement);
        Node node3 = node.getLeft(dataelement);
        Node node4 = node.getRight(dataelement);
        Node node5 = node1.getParent(dataelement);
        Node node6 = node1.getLeft(dataelement);
        Node node7 = node1.getRight(dataelement);
        boolean flag;
        boolean flag1;
        if (node.getParent(dataelement) != null && node == node.getParent(dataelement).Node.getLeft(dataelement))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (node1.getParent(dataelement) != null && node1 == node1.getParent(dataelement).Node.getLeft(dataelement))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (node == node5)
        {
            node.setParent(node1, dataelement);
            if (flag1)
            {
                node1.setLeft(node, dataelement);
                node1.setRight(node4, dataelement);
            } else
            {
                node1.setRight(node, dataelement);
                node1.setLeft(node3, dataelement);
            }
        } else
        {
            node.setParent(node5, dataelement);
            if (node5 != null)
            {
                if (flag1)
                {
                    node5.setLeft(node, dataelement);
                } else
                {
                    node5.setRight(node, dataelement);
                }
            }
            node1.setLeft(node3, dataelement);
            node1.setRight(node4, dataelement);
        }
        if (node1 == node2)
        {
            node1.setParent(node, dataelement);
            if (flag)
            {
                node.setLeft(node1, dataelement);
                node.setRight(node7, dataelement);
            } else
            {
                node.setRight(node1, dataelement);
                node.setLeft(node6, dataelement);
            }
        } else
        {
            node1.setParent(node2, dataelement);
            if (node2 != null)
            {
                if (flag)
                {
                    node2.setLeft(node1, dataelement);
                } else
                {
                    node2.setRight(node1, dataelement);
                }
            }
            node.setLeft(node6, dataelement);
            node.setRight(node7, dataelement);
        }
        if (node.getLeft(dataelement) != null)
        {
            node.getLeft(dataelement).Node.setParent(node, dataelement);
        }
        if (node.getRight(dataelement) != null)
        {
            node.getRight(dataelement).Node.setParent(node, dataelement);
        }
        if (node1.getLeft(dataelement) != null)
        {
            node1.getLeft(dataelement).Node.setParent(node1, dataelement);
        }
        if (node1.getRight(dataelement) != null)
        {
            node1.getRight(dataelement).Node.setParent(node1, dataelement);
        }
        node.swapColors(node1, dataelement);
        if (rootNode[dataelement.ordinal()] == node)
        {
            rootNode[dataelement.ordinal()] = node1;
        } else
        if (rootNode[dataelement.ordinal()] == node1)
        {
            rootNode[dataelement.ordinal()] = node;
            return;
        }
    }

    public void clear()
    {
        modify();
        nodeCount = 0;
        rootNode[DataElement.KEY.ordinal()] = null;
        rootNode[DataElement.VALUE.ordinal()] = null;
    }

    public boolean containsKey(Object obj)
    {
        checkKey(obj);
        return lookupKey(obj) != null;
    }

    public boolean containsValue(Object obj)
    {
        checkValue(obj);
        return lookupValue(obj) != null;
    }

    public Set entrySet()
    {
        if (entrySet == null)
        {
            entrySet = new EntryView();
        }
        return entrySet;
    }

    public boolean equals(Object obj)
    {
        return doEquals(obj, DataElement.KEY);
    }

    public Comparable get(Object obj)
    {
        checkKey(obj);
        obj = lookupKey(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return ((Node) (obj)).getValue();
        }
    }

    public volatile Object get(Object obj)
    {
        return get(obj);
    }

    public int hashCode()
    {
        return doHashCode(DataElement.KEY);
    }

    public boolean isEmpty()
    {
        return nodeCount == 0;
    }

    public Set keySet()
    {
        if (keySet == null)
        {
            keySet = new KeyView(DataElement.KEY);
        }
        return keySet;
    }

    public Comparable put(Comparable comparable, Comparable comparable1)
    {
        Comparable comparable2 = get(comparable);
        doPut(comparable, comparable1);
        return comparable2;
    }

    public volatile Object put(Object obj, Object obj1)
    {
        return put((Comparable)obj, (Comparable)obj1);
    }

    public void putAll(Map map)
    {
        java.util.Map.Entry entry;
        for (map = map.entrySet().iterator(); map.hasNext(); put((Comparable)entry.getKey(), (Comparable)entry.getValue()))
        {
            entry = (java.util.Map.Entry)map.next();
        }

    }

    public Comparable remove(Object obj)
    {
        return doRemoveKey(obj);
    }

    public volatile Object remove(Object obj)
    {
        return remove(obj);
    }

    public int size()
    {
        return nodeCount;
    }

    public String toString()
    {
        return doToString(DataElement.KEY);
    }

    public volatile Collection values()
    {
        return values();
    }

    public Set values()
    {
        if (valuesSet == null)
        {
            valuesSet = new ValueView(DataElement.KEY);
        }
        return valuesSet;
    }












}
