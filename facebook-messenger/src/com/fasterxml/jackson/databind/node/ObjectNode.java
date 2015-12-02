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
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ContainerNode, MissingNode, BaseJsonNode, TextNode, 
//            ArrayNode, JsonNodeFactory

public class ObjectNode extends ContainerNode
{

    protected LinkedHashMap _children;

    public ObjectNode(JsonNodeFactory jsonnodefactory)
    {
        super(jsonnodefactory);
        _children = null;
    }

    protected ObjectNode(JsonNodeFactory jsonnodefactory, LinkedHashMap linkedhashmap)
    {
        super(jsonnodefactory);
        _children = null;
        _children = linkedhashmap;
    }

    private final JsonNode _put(String s, JsonNode jsonnode)
    {
        if (_children == null)
        {
            _children = new LinkedHashMap();
        }
        return (JsonNode)_children.put(s, jsonnode);
    }

    public JsonToken asToken()
    {
        return JsonToken.START_OBJECT;
    }

    public volatile JsonNode deepCopy()
    {
        return deepCopy();
    }

    public ObjectNode deepCopy()
    {
        if (_children == null)
        {
            return new ObjectNode(_nodeFactory);
        }
        LinkedHashMap linkedhashmap = new LinkedHashMap(Math.max(4, _children.size()));
        java.util.Map.Entry entry;
        for (Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); linkedhashmap.put(entry.getKey(), ((JsonNode)entry.getValue()).deepCopy()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return new ObjectNode(_nodeFactory, linkedhashmap);
    }

    public Iterator elements()
    {
        if (_children == null)
        {
            return ContainerNode.NoNodesIterator.instance();
        } else
        {
            return _children.values().iterator();
        }
    }

    public boolean equals(Object obj)
    {
label0:
        {
            if (obj == this)
            {
                return true;
            }
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            obj = (ObjectNode)obj;
            if (((ObjectNode) (obj)).size() != size())
            {
                return false;
            }
            if (_children == null)
            {
                break label0;
            }
            Iterator iterator = _children.entrySet().iterator();
            Object obj1;
            Object obj2;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj2 = (java.util.Map.Entry)iterator.next();
                obj1 = (String)((java.util.Map.Entry) (obj2)).getKey();
                obj2 = (JsonNode)((java.util.Map.Entry) (obj2)).getValue();
                obj1 = ((ObjectNode) (obj)).get(((String) (obj1)));
            } while (obj1 != null && ((JsonNode) (obj1)).equals(obj2));
            return false;
        }
        return true;
    }

    public Iterator fieldNames()
    {
        if (_children == null)
        {
            return ContainerNode.NoStringsIterator.instance();
        } else
        {
            return _children.keySet().iterator();
        }
    }

    public Iterator fields()
    {
        if (_children == null)
        {
            return NoFieldsIterator.instance;
        } else
        {
            return _children.entrySet().iterator();
        }
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
            Iterator iterator = _children.entrySet().iterator();
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj = (java.util.Map.Entry)iterator.next();
                if (s.equals(((java.util.Map.Entry) (obj)).getKey()))
                {
                    return this;
                }
                obj = ((JsonNode)((java.util.Map.Entry) (obj)).getValue()).findParent(s);
            } while (obj == null);
            return (ObjectNode)obj;
        }
        return null;
    }

    public List findParents(String s, List list)
    {
        Object obj;
        if (_children != null)
        {
            Iterator iterator = _children.entrySet().iterator();
            do
            {
                obj = list;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = (java.util.Map.Entry)iterator.next();
                if (s.equals(((java.util.Map.Entry) (obj)).getKey()))
                {
                    if (list == null)
                    {
                        list = new ArrayList();
                    }
                    list.add(this);
                } else
                {
                    list = ((JsonNode)((java.util.Map.Entry) (obj)).getValue()).findParents(s, list);
                }
            } while (true);
        } else
        {
            obj = list;
        }
        return ((List) (obj));
    }

    public JsonNode findValue(String s)
    {
label0:
        {
            if (_children == null)
            {
                break label0;
            }
            Iterator iterator = _children.entrySet().iterator();
            Object obj;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                obj = (java.util.Map.Entry)iterator.next();
                if (s.equals(((java.util.Map.Entry) (obj)).getKey()))
                {
                    return (JsonNode)((java.util.Map.Entry) (obj)).getValue();
                }
                obj = ((JsonNode)((java.util.Map.Entry) (obj)).getValue()).findValue(s);
            } while (obj == null);
            return ((JsonNode) (obj));
        }
        return null;
    }

    public List findValues(String s, List list)
    {
        Object obj;
        if (_children != null)
        {
            Iterator iterator = _children.entrySet().iterator();
            do
            {
                obj = list;
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (s.equals(entry.getKey()))
                {
                    obj = list;
                    if (list == null)
                    {
                        obj = new ArrayList();
                    }
                    ((List) (obj)).add(entry.getValue());
                    list = ((List) (obj));
                } else
                {
                    list = ((JsonNode)entry.getValue()).findValues(s, list);
                }
            } while (true);
        } else
        {
            obj = list;
        }
        return ((List) (obj));
    }

    public List findValuesAsText(String s, List list)
    {
        Object obj;
        if (_children != null)
        {
            Iterator iterator = _children.entrySet().iterator();
            do
            {
                obj = list;
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (s.equals(entry.getKey()))
                {
                    obj = list;
                    if (list == null)
                    {
                        obj = new ArrayList();
                    }
                    ((List) (obj)).add(((JsonNode)entry.getValue()).asText());
                    list = ((List) (obj));
                } else
                {
                    list = ((JsonNode)entry.getValue()).findValuesAsText(s, list);
                }
            } while (true);
        } else
        {
            obj = list;
        }
        return ((List) (obj));
    }

    public JsonNode get(int i)
    {
        return null;
    }

    public JsonNode get(String s)
    {
        if (_children != null)
        {
            return (JsonNode)_children.get(s);
        } else
        {
            return null;
        }
    }

    public int hashCode()
    {
        if (_children == null)
        {
            return -1;
        } else
        {
            return _children.hashCode();
        }
    }

    public boolean isObject()
    {
        return true;
    }

    public JsonNode path(int i)
    {
        return MissingNode.getInstance();
    }

    public JsonNode path(String s)
    {
        if (_children != null)
        {
            s = (JsonNode)_children.get(s);
            if (s != null)
            {
                return s;
            }
        }
        return MissingNode.getInstance();
    }

    public JsonNode put(String s, JsonNode jsonnode)
    {
        Object obj = jsonnode;
        if (jsonnode == null)
        {
            obj = nullNode();
        }
        return _put(s, ((JsonNode) (obj)));
    }

    public ObjectNode put(String s, double d)
    {
        _put(s, numberNode(d));
        return this;
    }

    public ObjectNode put(String s, float f)
    {
        _put(s, numberNode(f));
        return this;
    }

    public ObjectNode put(String s, int i)
    {
        _put(s, numberNode(i));
        return this;
    }

    public ObjectNode put(String s, long l)
    {
        _put(s, numberNode(l));
        return this;
    }

    public ObjectNode put(String s, Boolean boolean1)
    {
        if (boolean1 == null)
        {
            _put(s, nullNode());
            return this;
        } else
        {
            _put(s, booleanNode(boolean1.booleanValue()));
            return this;
        }
    }

    public ObjectNode put(String s, Double double1)
    {
        if (double1 == null)
        {
            _put(s, nullNode());
            return this;
        } else
        {
            _put(s, numberNode(double1.doubleValue()));
            return this;
        }
    }

    public ObjectNode put(String s, Float float1)
    {
        if (float1 == null)
        {
            _put(s, nullNode());
            return this;
        } else
        {
            _put(s, numberNode(float1.floatValue()));
            return this;
        }
    }

    public ObjectNode put(String s, Integer integer)
    {
        if (integer == null)
        {
            _put(s, nullNode());
            return this;
        } else
        {
            _put(s, numberNode(integer.intValue()));
            return this;
        }
    }

    public ObjectNode put(String s, Long long1)
    {
        if (long1 == null)
        {
            _put(s, nullNode());
            return this;
        } else
        {
            _put(s, numberNode(long1.longValue()));
            return this;
        }
    }

    public ObjectNode put(String s, String s1)
    {
        if (s1 == null)
        {
            putNull(s);
            return this;
        } else
        {
            _put(s, textNode(s1));
            return this;
        }
    }

    public ObjectNode put(String s, BigDecimal bigdecimal)
    {
        if (bigdecimal == null)
        {
            putNull(s);
            return this;
        } else
        {
            _put(s, numberNode(bigdecimal));
            return this;
        }
    }

    public ObjectNode put(String s, boolean flag)
    {
        _put(s, booleanNode(flag));
        return this;
    }

    public ObjectNode put(String s, byte abyte0[])
    {
        if (abyte0 == null)
        {
            _put(s, nullNode());
            return this;
        } else
        {
            _put(s, binaryNode(abyte0));
            return this;
        }
    }

    public JsonNode putAll(ObjectNode objectnode)
    {
        int i = objectnode.size();
        if (i > 0)
        {
            if (_children == null)
            {
                _children = new LinkedHashMap(i);
            }
            objectnode.putContentsTo(_children);
        }
        return this;
    }

    public JsonNode putAll(Map map)
    {
        if (_children == null)
        {
            _children = new LinkedHashMap(map);
        } else
        {
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                JsonNode jsonnode = (JsonNode)entry.getValue();
                map = jsonnode;
                if (jsonnode == null)
                {
                    map = nullNode();
                }
                _children.put(entry.getKey(), map);
            }
        }
        return this;
    }

    public ArrayNode putArray(String s)
    {
        ArrayNode arraynode = arrayNode();
        _put(s, arraynode);
        return arraynode;
    }

    protected void putContentsTo(Map map)
    {
        if (_children != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); map.put(entry.getKey(), entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
    }

    public ObjectNode putNull(String s)
    {
        _put(s, nullNode());
        return this;
    }

    public ObjectNode putObject(String s)
    {
        ObjectNode objectnode = objectNode();
        _put(s, objectnode);
        return objectnode;
    }

    public ObjectNode putPOJO(String s, Object obj)
    {
        _put(s, POJONode(obj));
        return this;
    }

    public JsonNode remove(String s)
    {
        if (_children != null)
        {
            return (JsonNode)_children.remove(s);
        } else
        {
            return null;
        }
    }

    public ObjectNode remove(Collection collection)
    {
        if (_children != null)
        {
            String s;
            for (collection = collection.iterator(); collection.hasNext(); _children.remove(s))
            {
                s = (String)collection.next();
            }

        }
        return this;
    }

    public volatile ContainerNode removeAll()
    {
        return removeAll();
    }

    public ObjectNode removeAll()
    {
        _children = null;
        return this;
    }

    public ObjectNode retain(Collection collection)
    {
        if (_children != null)
        {
            Iterator iterator = _children.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                if (!collection.contains(((java.util.Map.Entry)iterator.next()).getKey()))
                {
                    iterator.remove();
                }
            } while (true);
        }
        return this;
    }

    public transient ObjectNode retain(String as[])
    {
        return retain(((Collection) (Arrays.asList(as))));
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeStartObject();
        if (_children != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); ((BaseJsonNode)entry.getValue()).serialize(jsongenerator, serializerprovider))
            {
                entry = (java.util.Map.Entry)iterator.next();
                jsongenerator.writeFieldName((String)entry.getKey());
            }

        }
        jsongenerator.writeEndObject();
    }

    public void serializeWithType(JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForObject(this, jsongenerator);
        if (_children != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = _children.entrySet().iterator(); iterator.hasNext(); ((BaseJsonNode)entry.getValue()).serialize(jsongenerator, serializerprovider))
            {
                entry = (java.util.Map.Entry)iterator.next();
                jsongenerator.writeFieldName((String)entry.getKey());
            }

        }
        typeserializer.writeTypeSuffixForObject(this, jsongenerator);
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
        StringBuilder stringbuilder = new StringBuilder((size() << 4) + 32);
        stringbuilder.append("{");
        if (_children != null)
        {
            Iterator iterator = _children.entrySet().iterator();
            for (int i = 0; iterator.hasNext(); i++)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (i > 0)
                {
                    stringbuilder.append(",");
                }
                TextNode.appendQuoted(stringbuilder, (String)entry.getKey());
                stringbuilder.append(':');
                stringbuilder.append(((JsonNode)entry.getValue()).toString());
            }

        }
        stringbuilder.append("}");
        return stringbuilder.toString();
    }

    public volatile JsonNode with(String s)
    {
        return with(s);
    }

    public ObjectNode with(String s)
    {
        ObjectNode objectnode;
        if (_children == null)
        {
            _children = new LinkedHashMap();
        } else
        {
            JsonNode jsonnode = (JsonNode)_children.get(s);
            if (jsonnode != null)
            {
                if (jsonnode instanceof ObjectNode)
                {
                    return (ObjectNode)jsonnode;
                } else
                {
                    throw new UnsupportedOperationException((new StringBuilder()).append("Property '").append(s).append("' has value that is not of type ObjectNode (but ").append(jsonnode.getClass().getName()).append(")").toString());
                }
            }
        }
        objectnode = objectNode();
        _children.put(s, objectnode);
        return objectnode;
    }

    public volatile JsonNode withArray(String s)
    {
        return withArray(s);
    }

    public ArrayNode withArray(String s)
    {
        ArrayNode arraynode;
        if (_children == null)
        {
            _children = new LinkedHashMap();
        } else
        {
            JsonNode jsonnode = (JsonNode)_children.get(s);
            if (jsonnode != null)
            {
                if (jsonnode instanceof ArrayNode)
                {
                    return (ArrayNode)jsonnode;
                } else
                {
                    throw new UnsupportedOperationException((new StringBuilder()).append("Property '").append(s).append("' has value that is not of type ArrayNode (but ").append(jsonnode.getClass().getName()).append(")").toString());
                }
            }
        }
        arraynode = arrayNode();
        _children.put(s, arraynode);
        return arraynode;
    }

    private class NoFieldsIterator
        implements Iterator
    {

        static final NoFieldsIterator instance = new NoFieldsIterator();

        public boolean hasNext()
        {
            return false;
        }

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            throw new NoSuchElementException();
        }

        public void remove()
        {
            throw new IllegalStateException();
        }


        private NoFieldsIterator()
        {
        }
    }

}
