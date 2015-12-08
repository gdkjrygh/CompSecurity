// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.UnresolvedForwardReference;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            ReadableObjectId

public class ObjectIdReferenceProperty extends SettableBeanProperty
{

    private static final long serialVersionUID = 0x757aab3130223adfL;
    private SettableBeanProperty _forward;

    public ObjectIdReferenceProperty(SettableBeanProperty settablebeanproperty, ObjectIdInfo objectidinfo)
    {
        super(settablebeanproperty);
        _forward = settablebeanproperty;
        _objectIdInfo = objectidinfo;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectidreferenceproperty, JsonDeserializer jsondeserializer)
    {
        super(objectidreferenceproperty, jsondeserializer);
        _forward = objectidreferenceproperty._forward;
        _objectIdInfo = objectidreferenceproperty._objectIdInfo;
    }

    public ObjectIdReferenceProperty(ObjectIdReferenceProperty objectidreferenceproperty, PropertyName propertyname)
    {
        super(objectidreferenceproperty, propertyname);
        _forward = objectidreferenceproperty._forward;
        _objectIdInfo = objectidreferenceproperty._objectIdInfo;
    }

    public void deserializeAndSet(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
    }

    public Object deserializeSetAndReturn(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        boolean flag;
        if (_objectIdInfo != null || _valueDeserializer.getObjectIdReader() != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            deserializationcontext = ((DeserializationContext) (setAndReturn(obj, deserialize(jsonparser, deserializationcontext))));
        }
        // Misplaced declaration of an exception variable
        catch (DeserializationContext deserializationcontext)
        {
            if (!flag)
            {
                throw JsonMappingException.from(jsonparser, "Unresolved forward reference but no identity info.", deserializationcontext);
            } else
            {
                deserializationcontext.getRoid().appendReferring(new PropertyReferring(deserializationcontext, _type.getRawClass(), obj));
                return null;
            }
        }
        return deserializationcontext;
    }

    public AnnotatedMember getMember()
    {
        return _forward.getMember();
    }

    public void set(Object obj, Object obj1)
    {
        _forward.set(obj, obj1);
    }

    public Object setAndReturn(Object obj, Object obj1)
    {
        return _forward.setAndReturn(obj, obj1);
    }

    public SettableBeanProperty withName(PropertyName propertyname)
    {
        return new ObjectIdReferenceProperty(this, propertyname);
    }

    public SettableBeanProperty withValueDeserializer(JsonDeserializer jsondeserializer)
    {
        return new ObjectIdReferenceProperty(this, jsondeserializer);
    }

    private class PropertyReferring extends ReadableObjectId.Referring
    {

        private final ObjectIdReferenceProperty _parent;
        public final Object _pojo;

        public final void handleResolvedForwardReference(Object obj, Object obj1)
        {
            if (!hasId(obj))
            {
                throw new IllegalArgumentException((new StringBuilder("Trying to resolve a forward reference with id [")).append(obj).append("] that wasn't previously seen as unresolved.").toString());
            } else
            {
                _parent.set(_pojo, obj1);
                return;
            }
        }

        public PropertyReferring(UnresolvedForwardReference unresolvedforwardreference, Class class1, Object obj)
        {
            super(unresolvedforwardreference, class1);
            _parent = ObjectIdReferenceProperty.this;
            _pojo = obj;
        }
    }

}
