// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Order;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ExpressionBuilder, Expression, PathException, Model

class ModelAssembler
{

    private final ExpressionBuilder builder;
    private final Class type;

    public ModelAssembler(ExpressionBuilder expressionbuilder, Class class1)
        throws Exception
    {
        builder = expressionbuilder;
        type = class1;
    }

    private void assembleAttributes(Model model, Order order)
        throws Exception
    {
        order = order.attributes();
        int j = order.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = order[i];
            obj = builder.build(((String) (obj)));
            if (!((Expression) (obj)).isAttribute() && ((Expression) (obj)).isPath())
            {
                throw new PathException("Ordered attribute '%s' references an element in %s", new Object[] {
                    obj, type
                });
            }
            registerAttributes(model, ((Expression) (obj)));
        }

    }

    private void assembleElements(Model model, Order order)
        throws Exception
    {
        order = order.elements();
        int j = order.length;
        for (int i = 0; i < j; i++)
        {
            Object obj = order[i];
            obj = builder.build(((String) (obj)));
            if (((Expression) (obj)).isAttribute())
            {
                throw new PathException("Ordered element '%s' references an attribute in %s", new Object[] {
                    obj, type
                });
            }
            registerElements(model, ((Expression) (obj)));
        }

    }

    private void registerAttribute(Model model, Expression expression)
        throws Exception
    {
        expression = expression.getFirst();
        if (expression != null)
        {
            model.registerAttribute(expression);
        }
    }

    private void registerAttributes(Model model, Expression expression)
        throws Exception
    {
        String s1 = expression.getPrefix();
        String s = expression.getFirst();
        int i = expression.getIndex();
        if (expression.isPath())
        {
            model = model.register(s, s1, i);
            expression = expression.getPath(1);
            if (model == null)
            {
                throw new PathException("Element '%s' does not exist in %s", new Object[] {
                    s, type
                });
            } else
            {
                registerAttributes(model, expression);
                return;
            }
        } else
        {
            registerAttribute(model, expression);
            return;
        }
    }

    private void registerElement(Model model, Expression expression)
        throws Exception
    {
        String s = expression.getPrefix();
        String s1 = expression.getFirst();
        int i = expression.getIndex();
        if (i > 1 && model.lookup(s1, i - 1) == null)
        {
            throw new PathException("Ordered element '%s' in path '%s' is out of sequence for %s", new Object[] {
                s1, expression, type
            });
        } else
        {
            model.register(s1, s, i);
            return;
        }
    }

    private void registerElements(Model model, Expression expression)
        throws Exception
    {
        Object obj = expression.getPrefix();
        Object obj1 = expression.getFirst();
        int i = expression.getIndex();
        if (obj1 != null)
        {
            obj = model.register(((String) (obj1)), ((String) (obj)), i);
            obj1 = expression.getPath(1);
            if (expression.isPath())
            {
                registerElements(((Model) (obj)), ((Expression) (obj1)));
            }
        }
        registerElement(model, expression);
    }

    public void assemble(Model model, Order order)
        throws Exception
    {
        assembleElements(model, order);
        assembleAttributes(model, order);
    }
}
