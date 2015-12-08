// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.OutputNode;
import java.lang.annotation.Annotation;
import java.util.Collection;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Label, Contact, Context, Converter, 
//            Decorator, Expression, Repeater, PersistenceException

class Variable
    implements Label
{
    private class Adapter
        implements Repeater
    {

        private final Converter reader;
        final Variable this$0;
        private final Object value;

        public Object read(InputNode inputnode)
            throws Exception
        {
            return read(inputnode, value);
        }

        public Object read(InputNode inputnode, Object obj)
            throws Exception
        {
            fs.org.simpleframework.xml.stream.Position position = inputnode.getPosition();
            String s = inputnode.getName();
            if (reader instanceof Repeater)
            {
                return ((Repeater)reader).read(inputnode, obj);
            } else
            {
                throw new PersistenceException("Element '%s' declared twice at %s", new Object[] {
                    s, position
                });
            }
        }

        public void write(OutputNode outputnode, Object obj)
            throws Exception
        {
            write(outputnode, obj);
        }

        public Adapter(Converter converter, Object obj)
        {
            this$0 = Variable.this;
            super();
            reader = converter;
            value = obj;
        }
    }


    private final Label label;
    private final Object value;

    public Variable(Label label1, Object obj)
    {
        label = label1;
        value = obj;
    }

    public Annotation getAnnotation()
    {
        return label.getAnnotation();
    }

    public Contact getContact()
    {
        return label.getContact();
    }

    public Converter getConverter(Context context)
        throws Exception
    {
        context = label.getConverter(context);
        if (context instanceof Adapter)
        {
            return context;
        } else
        {
            return new Adapter(context, value);
        }
    }

    public Decorator getDecorator()
        throws Exception
    {
        return label.getDecorator();
    }

    public Type getDependent()
        throws Exception
    {
        return label.getDependent();
    }

    public Object getEmpty(Context context)
        throws Exception
    {
        return label.getEmpty(context);
    }

    public String getEntry()
        throws Exception
    {
        return label.getEntry();
    }

    public Expression getExpression()
        throws Exception
    {
        return label.getExpression();
    }

    public Label getLabel(Class class1)
    {
        return this;
    }

    public String getName()
        throws Exception
    {
        return label.getName();
    }

    public String getName(Context context)
        throws Exception
    {
        return label.getName(context);
    }

    public Collection getNames()
        throws Exception
    {
        return label.getNames();
    }

    public Collection getNames(Context context)
        throws Exception
    {
        return label.getNames(context);
    }

    public String getOverride()
    {
        return label.getOverride();
    }

    public String getPath()
        throws Exception
    {
        return label.getPath();
    }

    public String getPath(Context context)
        throws Exception
    {
        return label.getPath(context);
    }

    public Collection getPaths()
        throws Exception
    {
        return label.getPaths();
    }

    public Collection getPaths(Context context)
        throws Exception
    {
        return label.getPaths(context);
    }

    public Type getType(Class class1)
        throws Exception
    {
        return label.getType(class1);
    }

    public Class getType()
    {
        return label.getType();
    }

    public Object getValue()
    {
        return value;
    }

    public boolean isAttribute()
    {
        return label.isAttribute();
    }

    public boolean isCollection()
    {
        return label.isCollection();
    }

    public boolean isData()
    {
        return label.isData();
    }

    public boolean isInline()
    {
        return label.isInline();
    }

    public boolean isRequired()
    {
        return label.isRequired();
    }

    public boolean isText()
    {
        return label.isText();
    }

    public boolean isUnion()
    {
        return label.isUnion();
    }

    public String toString()
    {
        return label.toString();
    }
}
