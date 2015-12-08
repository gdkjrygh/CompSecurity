// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Model, LabelMap, ModelMap, Label, 
//            AttributeException, ModelList, ElementException, Expression, 
//            PathException, TextException, Policy, Context

class TreeModel
    implements Model
{
    private static class OrderList extends ArrayList
    {

        public OrderList()
        {
        }
    }


    private LabelMap attributes;
    private LabelMap elements;
    private Expression expression;
    private int index;
    private ModelMap models;
    private String name;
    private OrderList order;
    private Policy policy;
    private String prefix;
    private Label text;
    private Class type;

    public TreeModel(Policy policy1, Class class1)
    {
        this(policy1, class1, null, null, 1);
    }

    public TreeModel(Policy policy1, Class class1, String s, String s1, int i)
    {
        attributes = new LabelMap(policy1);
        elements = new LabelMap(policy1);
        models = new ModelMap(class1);
        order = new OrderList();
        policy = policy1;
        prefix = s1;
        index = i;
        name = s;
        type = class1;
    }

    private Model create(String s, String s1, int i)
        throws Exception
    {
        s1 = new TreeModel(policy, type, s, s1, i);
        if (s != null)
        {
            models.register(s, s1);
            order.add(s);
        }
        return s1;
    }

    private void validateAttributes(Class class1)
        throws Exception
    {
        for (Iterator iterator1 = attributes.keySet().iterator(); iterator1.hasNext();)
        {
            String s = (String)iterator1.next();
            if ((Label)attributes.get(s) == null)
            {
                throw new AttributeException("Ordered attribute '%s' does not exist in %s", new Object[] {
                    s, class1
                });
            }
        }

    }

    private void validateElements(Class class1)
        throws Exception
    {
        for (Iterator iterator1 = elements.keySet().iterator(); iterator1.hasNext();)
        {
            String s = (String)iterator1.next();
            ModelList modellist = (ModelList)models.get(s);
            Label label = (Label)elements.get(s);
            if (modellist == null && label == null)
            {
                throw new ElementException("Ordered element '%s' does not exist in %s", new Object[] {
                    s, class1
                });
            }
            if (modellist != null && label != null && !modellist.isEmpty())
            {
                throw new ElementException("Element '%s' is also a path name in %s", new Object[] {
                    s, class1
                });
            }
        }

    }

    private void validateExpression(Label label)
        throws Exception
    {
        Object obj = label.getExpression();
        if (expression != null)
        {
            label = expression.getPath();
            obj = ((Expression) (obj)).getPath();
            if (!label.equals(obj))
            {
                throw new PathException("Path '%s' does not match '%s' in %s", new Object[] {
                    label, obj, type
                });
            }
        } else
        {
            expression = ((Expression) (obj));
        }
    }

    private void validateExpressions(Class class1)
        throws Exception
    {
        class1 = elements.iterator();
        do
        {
            if (!class1.hasNext())
            {
                break;
            }
            Label label = (Label)class1.next();
            if (label != null)
            {
                validateExpression(label);
            }
        } while (true);
        class1 = attributes.iterator();
        do
        {
            if (!class1.hasNext())
            {
                break;
            }
            Label label1 = (Label)class1.next();
            if (label1 != null)
            {
                validateExpression(label1);
            }
        } while (true);
        if (text != null)
        {
            validateExpression(text);
        }
    }

    private void validateModels(Class class1)
        throws Exception
    {
        for (Iterator iterator1 = models.iterator(); iterator1.hasNext();)
        {
            Object obj = (ModelList)iterator1.next();
            int i = 1;
            obj = ((ModelList) (obj)).iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                Model model = (Model)((Iterator) (obj)).next();
                if (model != null)
                {
                    String s = model.getName();
                    int j = model.getIndex();
                    if (j != i)
                    {
                        throw new ElementException("Path section '%s[%s]' is out of sequence in %s", new Object[] {
                            s, Integer.valueOf(j), class1
                        });
                    }
                    model.validate(class1);
                    i++;
                }
            }
        }

    }

    private void validateText(Class class1)
        throws Exception
    {
        if (text != null)
        {
            if (!elements.isEmpty())
            {
                throw new TextException("Text annotation %s used with elements in %s", new Object[] {
                    text, class1
                });
            }
            if (isComposite())
            {
                throw new TextException("Text annotation %s can not be used with paths in %s", new Object[] {
                    text, class1
                });
            }
        }
    }

    public LabelMap buildAttributes(Context context)
        throws Exception
    {
        return attributes.getLabels(context);
    }

    public LabelMap buildElements(Context context)
        throws Exception
    {
        return elements.getLabels(context);
    }

    public ModelMap buildModels(Context context)
        throws Exception
    {
        return models.getModels(context);
    }

    public Expression getExpression()
    {
        return expression;
    }

    public int getIndex()
    {
        return index;
    }

    public String getName()
    {
        return name;
    }

    public String getPrefix()
    {
        return prefix;
    }

    public Label getText()
    {
        return text;
    }

    public boolean isAttribute(String s)
    {
        return attributes.containsKey(s);
    }

    public boolean isComposite()
    {
        Iterator iterator1;
        iterator1 = models.iterator();
        break MISSING_BLOCK_LABEL_8;
        if (true) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (iterator1.hasNext())
        {
            Iterator iterator2 = ((ModelList)iterator1.next()).iterator();
            Model model;
            do
            {
                if (!iterator2.hasNext())
                {
                    continue; /* Loop/switch isn't completed */
                }
                model = (Model)iterator2.next();
            } while (model == null || model.isEmpty());
            break; /* Loop/switch isn't completed */
        }
        if (models.isEmpty())
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public boolean isElement(String s)
    {
        return elements.containsKey(s);
    }

    public boolean isEmpty()
    {
        while (text != null || !elements.isEmpty() || !attributes.isEmpty() || isComposite()) 
        {
            return false;
        }
        return true;
    }

    public boolean isModel(String s)
    {
        return models.containsKey(s);
    }

    public Iterator iterator()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator1 = order.iterator(); iterator1.hasNext(); arraylist.add((String)iterator1.next())) { }
        return arraylist.iterator();
    }

    public Model lookup(Expression expression1)
    {
        Model model1 = lookup(expression1.getFirst(), expression1.getIndex());
        Model model = model1;
        if (expression1.isPath())
        {
            expression1 = expression1.getPath(1, 0);
            model = model1;
            if (model1 != null)
            {
                model = model1.lookup(expression1);
            }
        }
        return model;
    }

    public Model lookup(String s, int i)
    {
        return models.lookup(s, i);
    }

    public Model register(String s, String s1, int i)
        throws Exception
    {
        Model model1 = models.lookup(s, i);
        Model model = model1;
        if (model1 == null)
        {
            model = create(s, s1, i);
        }
        return model;
    }

    public void register(Label label)
        throws Exception
    {
        if (label.isAttribute())
        {
            registerAttribute(label);
            return;
        }
        if (label.isText())
        {
            registerText(label);
            return;
        } else
        {
            registerElement(label);
            return;
        }
    }

    public void registerAttribute(Label label)
        throws Exception
    {
        String s = label.getName();
        if (attributes.get(s) != null)
        {
            throw new AttributeException("Duplicate annotation of name '%s' on %s", new Object[] {
                s, label
            });
        } else
        {
            attributes.put(s, label);
            return;
        }
    }

    public void registerAttribute(String s)
        throws Exception
    {
        attributes.put(s, null);
    }

    public void registerElement(Label label)
        throws Exception
    {
        String s = label.getName();
        if (elements.get(s) != null)
        {
            throw new ElementException("Duplicate annotation of name '%s' on %s", new Object[] {
                s, label
            });
        }
        if (!order.contains(s))
        {
            order.add(s);
        }
        elements.put(s, label);
    }

    public void registerText(Label label)
        throws Exception
    {
        if (text != null)
        {
            throw new TextException("Duplicate text annotation on %s", new Object[] {
                label
            });
        } else
        {
            text = label;
            return;
        }
    }

    public String toString()
    {
        return String.format("model '%s[%s]'", new Object[] {
            name, Integer.valueOf(index)
        });
    }

    public void validate(Class class1)
        throws Exception
    {
        validateExpressions(class1);
        validateAttributes(class1);
        validateElements(class1);
        validateModels(class1);
        validateText(class1);
    }
}
