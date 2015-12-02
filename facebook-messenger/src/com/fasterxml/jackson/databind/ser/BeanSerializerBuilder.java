// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.ser.impl.ObjectIdWriter;
import java.util.List;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            BeanPropertyWriter, BeanSerializer, AnyGetterWriter

public class BeanSerializerBuilder
{

    private static final BeanPropertyWriter NO_PROPERTIES[] = new BeanPropertyWriter[0];
    protected AnyGetterWriter _anyGetter;
    protected final BeanDescription _beanDesc;
    protected Object _filterId;
    protected BeanPropertyWriter _filteredProperties[];
    protected ObjectIdWriter _objectIdWriter;
    protected List _properties;
    protected AnnotatedMember _typeId;

    public BeanSerializerBuilder(BeanDescription beandescription)
    {
        _beanDesc = beandescription;
    }

    protected BeanSerializerBuilder(BeanSerializerBuilder beanserializerbuilder)
    {
        _beanDesc = beanserializerbuilder._beanDesc;
        _properties = beanserializerbuilder._properties;
        _filteredProperties = beanserializerbuilder._filteredProperties;
        _anyGetter = beanserializerbuilder._anyGetter;
        _filterId = beanserializerbuilder._filterId;
    }

    public JsonSerializer build()
    {
        BeanPropertyWriter abeanpropertywriter[];
        if (_properties == null || _properties.isEmpty())
        {
            if (_anyGetter == null)
            {
                return null;
            }
            abeanpropertywriter = NO_PROPERTIES;
        } else
        {
            abeanpropertywriter = (BeanPropertyWriter[])_properties.toArray(new BeanPropertyWriter[_properties.size()]);
        }
        return new BeanSerializer(_beanDesc.getType(), this, abeanpropertywriter, _filteredProperties);
    }

    public BeanSerializer createDummy()
    {
        return BeanSerializer.createDummy(_beanDesc.getType());
    }

    public AnyGetterWriter getAnyGetter()
    {
        return _anyGetter;
    }

    public BeanDescription getBeanDescription()
    {
        return _beanDesc;
    }

    public Object getFilterId()
    {
        return _filterId;
    }

    public BeanPropertyWriter[] getFilteredProperties()
    {
        return _filteredProperties;
    }

    public ObjectIdWriter getObjectIdWriter()
    {
        return _objectIdWriter;
    }

    public List getProperties()
    {
        return _properties;
    }

    public AnnotatedMember getTypeId()
    {
        return _typeId;
    }

    public boolean hasProperties()
    {
        return _properties != null && _properties.size() > 0;
    }

    public void setAnyGetter(AnyGetterWriter anygetterwriter)
    {
        _anyGetter = anygetterwriter;
    }

    public void setFilterId(Object obj)
    {
        _filterId = obj;
    }

    public void setFilteredProperties(BeanPropertyWriter abeanpropertywriter[])
    {
        _filteredProperties = abeanpropertywriter;
    }

    public void setObjectIdWriter(ObjectIdWriter objectidwriter)
    {
        _objectIdWriter = objectidwriter;
    }

    public void setProperties(List list)
    {
        _properties = list;
    }

    public void setTypeId(AnnotatedMember annotatedmember)
    {
        if (_typeId != null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Multiple type ids specified with ").append(_typeId).append(" and ").append(annotatedmember).toString());
        } else
        {
            _typeId = annotatedmember;
            return;
        }
    }

}
