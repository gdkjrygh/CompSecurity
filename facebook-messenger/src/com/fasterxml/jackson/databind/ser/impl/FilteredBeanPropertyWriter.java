// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;

public abstract class FilteredBeanPropertyWriter
{

    public FilteredBeanPropertyWriter()
    {
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

    private class SingleView extends BeanPropertyWriter
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

        public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            Class class1 = serializerprovider.getSerializationView();
            if (class1 == null || _view.isAssignableFrom(class1))
            {
                _delegate.serializeAsField(obj, jsongenerator, serializerprovider);
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

        public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        {
            Class class1 = serializerprovider.getSerializationView();
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

}
