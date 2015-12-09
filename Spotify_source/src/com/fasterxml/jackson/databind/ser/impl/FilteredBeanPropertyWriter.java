// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

public abstract class FilteredBeanPropertyWriter
{

    public static BeanPropertyWriter constructViewBased(BeanPropertyWriter beanpropertywriter, Class aclass[])
    {
        if (aclass.length == 1)
        {
            return new SingleView(beanpropertywriter, aclass[0]);
        } else
        {
            return new MultiView(beanpropertywriter, aclass);
        }
    }

    private class SingleView extends BeanPropertyWriter
    {

        protected final BeanPropertyWriter _delegate;
        protected final Class _view;

        public final void assignNullSerializer(JsonSerializer jsonserializer)
        {
            _delegate.assignNullSerializer(jsonserializer);
        }

        public final void assignSerializer(JsonSerializer jsonserializer)
        {
            _delegate.assignSerializer(jsonserializer);
        }

        public final volatile BeanPropertyWriter rename(NameTransformer nametransformer)
        {
            return rename(nametransformer);
        }

        public final SingleView rename(NameTransformer nametransformer)
        {
            return new SingleView(_delegate.rename(nametransformer), _view);
        }

        public final void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            Class class1 = serializerprovider.getActiveView();
            if (class1 == null || _view.isAssignableFrom(class1))
            {
                _delegate.serializeAsElement(obj, jsongenerator, serializerprovider);
                return;
            } else
            {
                _delegate.serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
                return;
            }
        }

        public final void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            Class class1 = serializerprovider.getActiveView();
            if (class1 == null || _view.isAssignableFrom(class1))
            {
                _delegate.serializeAsField(obj, jsongenerator, serializerprovider);
                return;
            } else
            {
                _delegate.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
                return;
            }
        }

        protected SingleView(BeanPropertyWriter beanpropertywriter, Class class1)
        {
            super(beanpropertywriter);
            _delegate = beanpropertywriter;
            _view = class1;
        }
    }


    private class MultiView extends BeanPropertyWriter
    {

        protected final BeanPropertyWriter _delegate;
        protected final Class _views[];

        public final void assignNullSerializer(JsonSerializer jsonserializer)
        {
            _delegate.assignNullSerializer(jsonserializer);
        }

        public final void assignSerializer(JsonSerializer jsonserializer)
        {
            _delegate.assignSerializer(jsonserializer);
        }

        public final volatile BeanPropertyWriter rename(NameTransformer nametransformer)
        {
            return rename(nametransformer);
        }

        public final MultiView rename(NameTransformer nametransformer)
        {
            return new MultiView(_delegate.rename(nametransformer), _views);
        }

        public final void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            Class class1 = serializerprovider.getActiveView();
            if (class1 != null)
            {
                int i = 0;
                int j;
                for (j = _views.length; i < j && !_views[i].isAssignableFrom(class1); i++) { }
                if (i == j)
                {
                    _delegate.serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
                    return;
                }
            }
            _delegate.serializeAsElement(obj, jsongenerator, serializerprovider);
        }

        public final void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            Class class1 = serializerprovider.getActiveView();
            if (class1 != null)
            {
                int i = 0;
                int j;
                for (j = _views.length; i < j && !_views[i].isAssignableFrom(class1); i++) { }
                if (i == j)
                {
                    _delegate.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
                    return;
                }
            }
            _delegate.serializeAsField(obj, jsongenerator, serializerprovider);
        }

        protected MultiView(BeanPropertyWriter beanpropertywriter, Class aclass[])
        {
            super(beanpropertywriter);
            _delegate = beanpropertywriter;
            _views = aclass;
        }
    }

}
