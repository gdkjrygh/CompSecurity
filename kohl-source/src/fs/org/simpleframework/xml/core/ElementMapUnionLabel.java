// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.ElementMap;
import fs.org.simpleframework.xml.ElementMapUnion;
import fs.org.simpleframework.xml.strategy.Type;
import java.lang.annotation.Annotation;
import java.util.Collection;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Label, GroupExtractor, ElementMapLabel, UnionException, 
//            CompositeMapUnion, Contact, Expression, Context, 
//            Converter, Decorator

class ElementMapUnionLabel
    implements Label
{

    private Contact contact;
    private Expression expression;
    private GroupExtractor extractor;
    private Label label;

    public ElementMapUnionLabel(Contact contact1, ElementMapUnion elementmapunion, ElementMap elementmap)
        throws Exception
    {
        extractor = new GroupExtractor(contact1, elementmapunion);
        label = new ElementMapLabel(contact1, elementmap);
        contact = contact1;
    }

    public Annotation getAnnotation()
    {
        return label.getAnnotation();
    }

    public Contact getContact()
    {
        return contact;
    }

    public Converter getConverter(Context context)
        throws Exception
    {
        Expression expression1 = getExpression();
        Contact contact1 = getContact();
        if (contact1 == null)
        {
            throw new UnionException("Union %s was not declared on a field or method", new Object[] {
                label
            });
        } else
        {
            return new CompositeMapUnion(context, extractor, expression1, contact1);
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
        if (expression == null)
        {
            expression = label.getExpression();
        }
        return expression;
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
        return extractor.getNames();
    }

    public Collection getNames(Context context)
        throws Exception
    {
        return extractor.getNames(context);
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
        return extractor.getPaths();
    }

    public Collection getPaths(Context context)
        throws Exception
    {
        return extractor.getPaths(context);
    }

    public Type getType(Class class1)
    {
        return getContact();
    }

    public Class getType()
    {
        return label.getType();
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
        return true;
    }

    public String toString()
    {
        return label.toString();
    }
}
