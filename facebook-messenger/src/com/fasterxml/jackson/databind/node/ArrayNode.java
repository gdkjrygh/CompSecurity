// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ContainerNode, ObjectNode, MissingNode, BaseJsonNode, 
//            JsonNodeFactory

public class ArrayNode extends ContainerNode
{

    protected ArrayList _children;

    public ArrayNode(JsonNodeFactory jsonnodefactory)
    {
        super(jsonnodefactory);
    }

    protected ArrayNode(JsonNodeFactory jsonnodefactory, ArrayList arraylist)
    {
        super(jsonnodefactory);
        _children = arraylist;
    }

    private ArrayNode _add(JsonNode jsonnode)
    {
        if (_children == null)
        {
            _children = new ArrayList();
        }
        _children.add(jsonnode);
        return this;
    }

    private ArrayNode _insert(int i, JsonNode jsonnode)
    {
        if (_children == null)
        {
            _children = new ArrayList();
            _children.add(jsonnode);
            return this;
        }
        if (i < 0)
        {
            _children.add(0, jsonnode);
            return this;
        }
        if (i >= _children.size())
        {
            _children.add(jsonnode);
            return this;
        } else
        {
            _children.add(i, jsonnode);
            return this;
        }
    }

    private boolean _sameChildren(ArrayList arraylist)
    {
        int j = arraylist.size();
        if (size() != j)
        {
            return false;
        }
        for (int i = 0; i < j; i++)
        {
            if (!((JsonNode)_children.get(i)).equals(arraylist.get(i)))
            {
                return false;
            }
        }

        return true;
    }

    public JsonNode _set(int i, JsonNode jsonnode)
    {
        if (_children == null || i < 0 || i >= _children.size())
        {
            throw new IndexOutOfBoundsException((new StringBuilder()).append("Illegal index ").append(i).append(", array size ").append(size()).toString());
        } else
        {
            return (JsonNode)_children.set(i, jsonnode);
        }
    }

    public ArrayNode add(double d)
    {
        return _add(numberNode(d));
    }

    public ArrayNode add(float f)
    {
        return _add(numberNode(f));
    }

    public ArrayNode add(int i)
    {
        _add(numberNode(i));
        return this;
    }

    public ArrayNode add(long l)
    {
        return _add(numberNode(l));
    }

    public ArrayNode add(JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        _add(((JsonNode) (obj)));
        return this;
    }

    public ArrayNode add(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return addNull();
        } else
        {
            return _add(booleanNode(boolean1.booleanValue()));
        }
    }

    public ArrayNode add(Double double1)
    {
        if (double1 == null)
        {
            return addNull();
        } else
        {
            return _add(numberNode(double1.doubleValue()));
        }
    }

    public ArrayNode add(Float float1)
    {
        if (float1 == null)
        {
            return addNull();
        } else
        {
            return _add(numberNode(float1.floatValue()));
        }
    }

    public ArrayNode add(Integer integer)
    {
        if (integer == null)
        {
            return addNull();
        } else
        {
            return _add(numberNode(integer.intValue()));
        }
    }

    public ArrayNode add(Long long1)
    {
        if (long1 == null)
        {
            return addNull();
        } else
        {
            return _add(numberNode(long1.longValue()));
        }
    }

    public ArrayNode add(String s)
    {
        if (s == null)
        {
            return addNull();
        } else
        {
            return _add(textNode(s));
        }
    }

    public ArrayNode add(BigDecimal bigdecimal)
    {
        if (bigdecimal == null)
        {
            return addNull();
        } else
        {
            return _add(numberNode(bigdecimal));
        }
    }

    public ArrayNode add(boolean flag)
    {
        return _add(booleanNode(flag));
    }

    public ArrayNode add(byte abyte0[])
    {
        if (abyte0 == null)
        {
            return addNull();
        } else
        {
            return _add(binaryNode(abyte0));
        }
    }

    public ArrayNode addAll(ArrayNode arraynode)
    {
        int i = arraynode.size();
        if (i > 0)
        {
            if (_children == null)
            {
                _children = new ArrayList(i + 2);
            }
            arraynode.addContentsTo(_children);
        }
        return this;
    }

    public ArrayNode addAll(Collection collection)
    {
label0:
        {
            if (collection.size() > 0)
            {
                if (_children != null)
                {
                    break label0;
                }
                _children = new ArrayList(collection);
            }
            return this;
        }
        _children.addAll(collection);
        return this;
    }

    public ArrayNode addArray()
    {
        ArrayNode arraynode = arrayNode();
        _add(arraynode);
        return arraynode;
    }

    protected void addContentsTo(List list)
    {
        if (_children != null)
        {
            for (Iterator iterator = _children.iterator(); iterator.hasNext(); list.add((JsonNode)iterator.next())) { }
        }
    }

    public ArrayNode addNull()
    {
        _add(nullNode());
        return this;
    }

    public ObjectNode addObject()
    {
        ObjectNode objectnode = objectNode();
        _add(objectnode);
        return objectnode;
    }

    public ArrayNode addPOJO(Object obj)
    {
        if (obj == null)
        {
            addNull();
            return this;
        } else
        {
            _add(POJONode(obj));
            return this;
        }
    }

    public JsonToken asToken()
    {
        return JsonToken.START_ARRAY;
    }

    public volatile JsonNode deepCopy()
    {
        return deepCopy();
    }

    public ArrayNode deepCopy()
    {
        if (_children == null)
        {
            return new ArrayNode(_nodeFactory);
        }
        int j = _children.size();
        ArrayList arraylist = new ArrayList(Math.max(4, j));
        for (int i = 0; i < j; i++)
        {
            arraylist.add(((JsonNode)_children.get(i)).deepCopy());
        }

        return new ArrayNode(_nodeFactory, arraylist);
    }

    public Iterator elements()
    {
        if (_children == null)
        {
            return ContainerNode.NoNodesIterator.instance();
        } else
        {
            return _children.iterator();
        }
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            obj = (ArrayNode)obj;
            if (_children == null || _children.size() == 0)
            {
                if (((ArrayNode) (obj)).size() != 0)
                {
                    return false;
                }
            } else
            {
                return ((ArrayNode) (obj))._sameChildren(_children);
            }
        }
        return true;
    }

    public volatile JsonNode findParent(String s)
    {
        return findParent(s);
    }

    public ObjectNode findParent(String s)
    {
label0:
        {
            if (_children == null)
            {
                break label0;
            }
            Iterator iterator = _children.iterator();
            JsonNode jsonnode;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                jsonnode = ((JsonNode)iterator.next()).findParent(s);
            } while (jsonnode == null);
            return (ObjectNode)jsonnode;
        }
        return null;
    }

    public List findParents(String s, List list)
    {
        List list1 = list;
        if (_children != null)
        {
            Iterator iterator = _children.iterator();
            do
            {
                list1 = list;
                if (!iterator.hasNext())
                {
                    break;
                }
                list = ((JsonNode)iterator.next()).findParents(s, list);
            } while (true);
        }
        return list1;
    }

    public JsonNode findValue(String s)
    {
label0:
        {
            if (_children == null)
            {
                break label0;
            }
            Iterator iterator = _children.iterator();
            JsonNode jsonnode;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                jsonnode = ((JsonNode)iterator.next()).findValue(s);
            } while (jsonnode == null);
            return jsonnode;
        }
        return null;
    }

    public List findValues(String s, List list)
    {
        List list1 = list;
        if (_children != null)
        {
            Iterator iterator = _children.iterator();
            do
            {
                list1 = list;
                if (!iterator.hasNext())
                {
                    break;
                }
                list = ((JsonNode)iterator.next()).findValues(s, list);
            } while (true);
        }
        return list1;
    }

    public List findValuesAsText(String s, List list)
    {
        List list1 = list;
        if (_children != null)
        {
            Iterator iterator = _children.iterator();
            do
            {
                list1 = list;
                if (!iterator.hasNext())
                {
                    break;
                }
                list = ((JsonNode)iterator.next()).findValuesAsText(s, list);
            } while (true);
        }
        return list1;
    }

    public JsonNode get(int i)
    {
        if (i >= 0 && _children != null && i < _children.size())
        {
            return (JsonNode)_children.get(i);
        } else
        {
            return null;
        }
    }

    public JsonNode get(String s)
    {
        return null;
    }

    public int hashCode()
    {
        if (_children != null) goto _L2; else goto _L1
_L1:
        int j = 1;
_L4:
        return j;
_L2:
        int i = _children.size();
        Iterator iterator = _children.iterator();
        do
        {
            j = i;
            if (!iterator.hasNext())
            {
                continue;
            }
            JsonNode jsonnode = (JsonNode)iterator.next();
            if (jsonnode != null)
            {
                i = jsonnode.hashCode() ^ i;
            }
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public ArrayNode insert(int i, double d)
    {
        return _insert(i, numberNode(d));
    }

    public ArrayNode insert(int i, float f)
    {
        return _insert(i, numberNode(f));
    }

    public ArrayNode insert(int i, int j)
    {
        _insert(i, numberNode(j));
        return this;
    }

    public ArrayNode insert(int i, long l)
    {
        return _insert(i, numberNode(l));
    }

    public ArrayNode insert(int i, JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        _insert(i, ((JsonNode) (obj)));
        return this;
    }

    public ArrayNode insert(int i, Boolean boolean1)
    {
        if (boolean1 == null)
        {
            return insertNull(i);
        } else
        {
            return _insert(i, booleanNode(boolean1.booleanValue()));
        }
    }

    public ArrayNode insert(int i, Double double1)
    {
        if (double1 == null)
        {
            return insertNull(i);
        } else
        {
            return _insert(i, numberNode(double1.doubleValue()));
        }
    }

    public ArrayNode insert(int i, Float float1)
    {
        if (float1 == null)
        {
            return insertNull(i);
        } else
        {
            return _insert(i, numberNode(float1.floatValue()));
        }
    }

    public ArrayNode insert(int i, Integer integer)
    {
        if (integer == null)
        {
            insertNull(i);
            return this;
        } else
        {
            _insert(i, numberNode(integer.intValue()));
            return this;
        }
    }

    public ArrayNode insert(int i, Long long1)
    {
        if (long1 == null)
        {
            return insertNull(i);
        } else
        {
            return _insert(i, numberNode(long1.longValue()));
        }
    }

    public ArrayNode insert(int i, String s)
    {
        if (s == null)
        {
            return insertNull(i);
        } else
        {
            return _insert(i, textNode(s));
        }
    }

    public ArrayNode insert(int i, BigDecimal bigdecimal)
    {
        if (bigdecimal == null)
        {
            return insertNull(i);
        } else
        {
            return _insert(i, numberNode(bigdecimal));
        }
    }

    public ArrayNode insert(int i, boolean flag)
    {
        return _insert(i, booleanNode(flag));
    }

    public ArrayNode insert(int i, byte abyte0[])
    {
        if (abyte0 == null)
        {
            return insertNull(i);
        } else
        {
            return _insert(i, binaryNode(abyte0));
        }
    }

    public ArrayNode insertArray(int i)
    {
        ArrayNode arraynode = arrayNode();
        _insert(i, arraynode);
        return arraynode;
    }

    public ArrayNode insertNull(int i)
    {
        _insert(i, nullNode());
        return this;
    }

    public ObjectNode insertObject(int i)
    {
        ObjectNode objectnode = objectNode();
        _insert(i, objectnode);
        return objectnode;
    }

    public ArrayNode insertPOJO(int i, Object obj)
    {
        if (obj == null)
        {
            return insertNull(i);
        } else
        {
            return _insert(i, POJONode(obj));
        }
    }

    public boolean isArray()
    {
        return true;
    }

    public JsonNode path(int i)
    {
        if (i >= 0 && _children != null && i < _children.size())
        {
            return (JsonNode)_children.get(i);
        } else
        {
            return MissingNode.getInstance();
        }
    }

    public JsonNode path(String s)
    {
        return MissingNode.getInstance();
    }

    public JsonNode remove(int i)
    {
        if (i >= 0 && _children != null && i < _children.size())
        {
            return (JsonNode)_children.remove(i);
        } else
        {
            return null;
        }
    }

    public ArrayNode removeAll()
    {
        _children = null;
        return this;
    }

    public volatile ContainerNode removeAll()
    {
        return removeAll();
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeStartArray();
        if (_children != null)
        {
            for (Iterator iterator = _children.iterator(); iterator.hasNext(); ((BaseJsonNode)(JsonNode)iterator.next()).serialize(jsongenerator, serializerprovider)) { }
        }
        jsongenerator.writeEndArray();
    }

    public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForArray(this, jsongenerator);
        if (_children != null)
        {
            for (Iterator iterator = _children.iterator(); iterator.hasNext(); ((BaseJsonNode)(JsonNode)iterator.next()).serialize(jsongenerator, serializerprovider)) { }
        }
        typeserializer.writeTypeSuffixForArray(this, jsongenerator);
    }

    public JsonNode set(int i, JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        return _set(i, ((JsonNode) (obj)));
    }

    public int size()
    {
        if (_children == null)
        {
            return 0;
        } else
        {
            return _children.size();
        }
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder((size() << 4) + 16);
        stringbuilder.append('[');
        if (_children != null)
        {
            int j = _children.size();
            for (int i = 0; i < j; i++)
            {
                if (i > 0)
                {
                    stringbuilder.append(',');
                }
                stringbuilder.append(((JsonNode)_children.get(i)).toString());
            }

        }
        stringbuilder.append(']');
        return stringbuilder.toString();
    }
}
