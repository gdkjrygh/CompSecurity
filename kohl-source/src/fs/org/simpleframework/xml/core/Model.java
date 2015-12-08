// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


// Referenced classes of package fs.org.simpleframework.xml.core:
//            Context, LabelMap, ModelMap, Expression, 
//            Label

interface Model
    extends Iterable
{

    public abstract LabelMap buildAttributes(Context context)
        throws Exception;

    public abstract LabelMap buildElements(Context context)
        throws Exception;

    public abstract ModelMap buildModels(Context context)
        throws Exception;

    public abstract Expression getExpression();

    public abstract int getIndex();

    public abstract String getName();

    public abstract String getPrefix();

    public abstract Label getText();

    public abstract boolean isAttribute(String s);

    public abstract boolean isComposite();

    public abstract boolean isElement(String s);

    public abstract boolean isEmpty();

    public abstract boolean isModel(String s);

    public abstract Model lookup(Expression expression);

    public abstract Model lookup(String s, int i);

    public abstract Model register(String s, String s1, int i)
        throws Exception;

    public abstract void register(Label label)
        throws Exception;

    public abstract void registerAttribute(String s)
        throws Exception;

    public abstract void validate(Class class1)
        throws Exception;
}
