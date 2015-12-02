// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.module;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.KeyDeserializer;
import com.fasterxml.jackson.databind.Module;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.jsontype.NamedType;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

// Referenced classes of package com.fasterxml.jackson.databind.module:
//            SimpleAbstractTypeResolver, SimpleDeserializers, SimpleKeyDeserializers, SimpleSerializers, 
//            SimpleValueInstantiators

public class SimpleModule extends Module
{

    protected SimpleAbstractTypeResolver _abstractTypes;
    protected SimpleDeserializers _deserializers;
    protected SimpleKeyDeserializers _keyDeserializers;
    protected SimpleSerializers _keySerializers;
    protected HashMap _mixins;
    protected final String _name;
    protected SimpleSerializers _serializers;
    protected LinkedHashSet _subtypes;
    protected SimpleValueInstantiators _valueInstantiators;
    protected final Version _version;

    public SimpleModule()
    {
        _serializers = null;
        _deserializers = null;
        _keySerializers = null;
        _keyDeserializers = null;
        _abstractTypes = null;
        _valueInstantiators = null;
        _mixins = null;
        _subtypes = null;
        _name = (new StringBuilder()).append("SimpleModule-").append(System.identityHashCode(this)).toString();
        _version = Version.unknownVersion();
    }

    public SimpleModule(Version version1)
    {
        _serializers = null;
        _deserializers = null;
        _keySerializers = null;
        _keyDeserializers = null;
        _abstractTypes = null;
        _valueInstantiators = null;
        _mixins = null;
        _subtypes = null;
        _name = version1.getArtifactId();
        _version = version1;
    }

    public SimpleModule(String s)
    {
        this(s, Version.unknownVersion());
    }

    public SimpleModule(String s, Version version1)
    {
        _serializers = null;
        _deserializers = null;
        _keySerializers = null;
        _keyDeserializers = null;
        _abstractTypes = null;
        _valueInstantiators = null;
        _mixins = null;
        _subtypes = null;
        _name = s;
        _version = version1;
    }

    public SimpleModule addAbstractTypeMapping(Class class1, Class class2)
    {
        if (_abstractTypes == null)
        {
            _abstractTypes = new SimpleAbstractTypeResolver();
        }
        _abstractTypes = _abstractTypes.addMapping(class1, class2);
        return this;
    }

    public SimpleModule addDeserializer(Class class1, JsonDeserializer jsondeserializer)
    {
        if (_deserializers == null)
        {
            _deserializers = new SimpleDeserializers();
        }
        _deserializers.addDeserializer(class1, jsondeserializer);
        return this;
    }

    public SimpleModule addKeyDeserializer(Class class1, KeyDeserializer keydeserializer)
    {
        if (_keyDeserializers == null)
        {
            _keyDeserializers = new SimpleKeyDeserializers();
        }
        _keyDeserializers.addDeserializer(class1, keydeserializer);
        return this;
    }

    public SimpleModule addKeySerializer(Class class1, JsonSerializer jsonserializer)
    {
        if (_keySerializers == null)
        {
            _keySerializers = new SimpleSerializers();
        }
        _keySerializers.addSerializer(class1, jsonserializer);
        return this;
    }

    public SimpleModule addSerializer(JsonSerializer jsonserializer)
    {
        if (_serializers == null)
        {
            _serializers = new SimpleSerializers();
        }
        _serializers.addSerializer(jsonserializer);
        return this;
    }

    public SimpleModule addSerializer(Class class1, JsonSerializer jsonserializer)
    {
        if (_serializers == null)
        {
            _serializers = new SimpleSerializers();
        }
        _serializers.addSerializer(class1, jsonserializer);
        return this;
    }

    public SimpleModule addValueInstantiator(Class class1, ValueInstantiator valueinstantiator)
    {
        if (_valueInstantiators == null)
        {
            _valueInstantiators = new SimpleValueInstantiators();
        }
        _valueInstantiators = _valueInstantiators.addValueInstantiator(class1, valueinstantiator);
        return this;
    }

    public String getModuleName()
    {
        return _name;
    }

    public transient SimpleModule registerSubtypes(NamedType anamedtype[])
    {
        if (_subtypes == null)
        {
            _subtypes = new LinkedHashSet(Math.max(16, anamedtype.length));
        }
        int j = anamedtype.length;
        for (int i = 0; i < j; i++)
        {
            NamedType namedtype = anamedtype[i];
            _subtypes.add(namedtype);
        }

        return this;
    }

    public transient SimpleModule registerSubtypes(Class aclass[])
    {
        if (_subtypes == null)
        {
            _subtypes = new LinkedHashSet(Math.max(16, aclass.length));
        }
        int j = aclass.length;
        for (int i = 0; i < j; i++)
        {
            Class class1 = aclass[i];
            _subtypes.add(new NamedType(class1));
        }

        return this;
    }

    public void setAbstractTypes(SimpleAbstractTypeResolver simpleabstracttyperesolver)
    {
        _abstractTypes = simpleabstracttyperesolver;
    }

    public void setDeserializers(SimpleDeserializers simpledeserializers)
    {
        _deserializers = simpledeserializers;
    }

    public void setKeyDeserializers(SimpleKeyDeserializers simplekeydeserializers)
    {
        _keyDeserializers = simplekeydeserializers;
    }

    public void setKeySerializers(SimpleSerializers simpleserializers)
    {
        _keySerializers = simpleserializers;
    }

    public SimpleModule setMixInAnnotation(Class class1, Class class2)
    {
        if (_mixins == null)
        {
            _mixins = new HashMap();
        }
        _mixins.put(class1, class2);
        return this;
    }

    public void setSerializers(SimpleSerializers simpleserializers)
    {
        _serializers = simpleserializers;
    }

    public void setValueInstantiators(SimpleValueInstantiators simplevalueinstantiators)
    {
        _valueInstantiators = simplevalueinstantiators;
    }

    public void setupModule(com.fasterxml.jackson.databind.Module.SetupContext setupcontext)
    {
        if (_serializers != null)
        {
            setupcontext.addSerializers(_serializers);
        }
        if (_deserializers != null)
        {
            setupcontext.addDeserializers(_deserializers);
        }
        if (_keySerializers != null)
        {
            setupcontext.addKeySerializers(_keySerializers);
        }
        if (_keyDeserializers != null)
        {
            setupcontext.addKeyDeserializers(_keyDeserializers);
        }
        if (_abstractTypes != null)
        {
            setupcontext.addAbstractTypeResolver(_abstractTypes);
        }
        if (_valueInstantiators != null)
        {
            setupcontext.addValueInstantiators(_valueInstantiators);
        }
        if (_subtypes != null && _subtypes.size() > 0)
        {
            setupcontext.registerSubtypes((NamedType[])_subtypes.toArray(new NamedType[_subtypes.size()]));
        }
        if (_mixins != null)
        {
            java.util.Map.Entry entry;
            for (Iterator iterator = _mixins.entrySet().iterator(); iterator.hasNext(); setupcontext.setMixInAnnotations((Class)entry.getKey(), (Class)entry.getValue()))
            {
                entry = (java.util.Map.Entry)iterator.next();
            }

        }
    }

    public Version version()
    {
        return _version;
    }
}
