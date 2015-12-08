// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.util.NameTransformer;

public abstract class FilteredBeanPropertyWriter
{
    private static final class MultiView extends BeanPropertyWriter
    {

        protected final BeanPropertyWriter _delegate;
        protected final Class _views[];

        public void assignNullSerializer(JsonSerializer jsonserializer)
        {
            _delegate.assignNullSerializer(jsonserializer);
        }

        public void assignSerializer(JsonSerializer jsonserializer)
        {
            _delegate.assignSerializer(jsonserializer);
        }

        public volatile BeanPropertyWriter rename(NameTransformer nametransformer)
        {
            return rename(nametransformer);
        }

        public MultiView rename(NameTransformer nametransformer)
        {
            return new MultiView(_delegate.rename(nametransformer), _views);
        }

        public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws Exception
        {
            Class class1 = serializerprovider.getActiveView();
            if (class1 != null)
            {
                int i = 0;
                int j = _views.length;
                do
                {
                    if (i >= j || _views[i].isAssignableFrom(class1))
                    {
                        if (i == j)
                        {
                            _delegate.serializeAsPlaceholder(obj, jsongenerator, serializerprovider);
                            return;
                        }
                        break;
                    }
                    i++;
                } while (true);
            }
            _delegate.serializeAsElement(obj, jsongenerator, serializerprovider);
        }

        public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws Exception
        {
            Class class1 = serializerprovider.getActiveView();
            if (class1 != null)
            {
                int i = 0;
                int j = _views.length;
                do
                {
                    if (i >= j || _views[i].isAssignableFrom(class1))
                    {
                        if (i == j)
                        {
                            _delegate.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
                            return;
                        }
                        break;
                    }
                    i++;
                } while (true);
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

    private static final class SingleView extends BeanPropertyWriter
    {

        protected final BeanPropertyWriter _delegate;
        protected final Class _view;

        public void assignNullSerializer(JsonSerializer jsonserializer)
        {
            _delegate.assignNullSerializer(jsonserializer);
        }

        public void assignSerializer(JsonSerializer jsonserializer)
        {
            _delegate.assignSerializer(jsonserializer);
        }

        public volatile BeanPropertyWriter rename(NameTransformer nametransformer)
        {
            return rename(nametransformer);
        }

        public SingleView rename(NameTransformer nametransformer)
        {
            return new SingleView(_delegate.rename(nametransformer), _view);
        }

        public void serializeAsElement(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws Exception
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

        public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
            throws Exception
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
}
