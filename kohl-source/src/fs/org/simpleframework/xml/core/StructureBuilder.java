// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Attribute;
import fs.org.simpleframework.xml.Element;
import fs.org.simpleframework.xml.ElementArray;
import fs.org.simpleframework.xml.ElementList;
import fs.org.simpleframework.xml.ElementListUnion;
import fs.org.simpleframework.xml.ElementMap;
import fs.org.simpleframework.xml.ElementMapUnion;
import fs.org.simpleframework.xml.ElementUnion;
import fs.org.simpleframework.xml.Order;
import fs.org.simpleframework.xml.Text;
import fs.org.simpleframework.xml.Version;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            ExpressionBuilder, ModelAssembler, TreeModel, LabelMap, 
//            LabelResolver, Comparer, Expression, Model, 
//            UnionException, Label, LabelFactory, PersistenceException, 
//            TextException, Parameter, Contact, ConstructorException, 
//            Scanner, Creator, AttributeException, Initializer, 
//            ElementException, Structure

class StructureBuilder
{

    private ModelAssembler assembler;
    private LabelMap attributes;
    private ExpressionBuilder builder;
    private Comparer comparer;
    private LabelMap elements;
    private boolean primitive;
    private LabelResolver resolver;
    private Model root;
    private Scanner scanner;
    private Label text;
    private LabelMap texts;
    private Class type;
    private Label version;

    public StructureBuilder(Scanner scanner1, Class class1)
        throws Exception
    {
        builder = new ExpressionBuilder(class1);
        assembler = new ModelAssembler(builder, class1);
        root = new TreeModel(scanner1, class1);
        attributes = new LabelMap(scanner1);
        elements = new LabelMap(scanner1);
        texts = new LabelMap(scanner1);
        resolver = new LabelResolver();
        comparer = new Comparer();
        scanner = scanner1;
        type = class1;
    }

    private Model create(Expression expression)
        throws Exception
    {
        Model model = root;
        Expression expression1 = expression;
        expression = model;
        do
        {
            Object obj;
label0:
            {
                obj = expression;
                if (expression != null)
                {
                    String s = expression1.getPrefix();
                    String s1 = expression1.getFirst();
                    int i = expression1.getIndex();
                    obj = expression;
                    if (s1 != null)
                    {
                        obj = expression.register(s1, s, i);
                    }
                    if (expression1.isPath())
                    {
                        break label0;
                    }
                }
                return ((Model) (obj));
            }
            expression1 = expression1.getPath(1);
            expression = ((Expression) (obj));
        } while (true);
    }

    private Annotation[] extract(Annotation annotation)
        throws Exception
    {
        Method amethod[] = annotation.annotationType().getDeclaredMethods();
        if (amethod.length != 1)
        {
            throw new UnionException("Annotation '%s' is not a valid union for %s", new Object[] {
                annotation, type
            });
        } else
        {
            return (Annotation[])(Annotation[])amethod[0].invoke(annotation, new Object[0]);
        }
    }

    private boolean isAttribute(String s)
        throws Exception
    {
        s = builder.build(s);
        Model model = lookup(s);
        if (model != null)
        {
            return model.isAttribute(s.getLast());
        } else
        {
            return false;
        }
    }

    private boolean isElement(String s)
        throws Exception
    {
        Model model;
        String s1;
        int i;
        s = builder.build(s);
        model = lookup(s);
        if (model == null)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        s1 = s.getLast();
        i = s.getIndex();
        if (!model.isElement(s1)) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!model.isModel(s1))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (!model.lookup(s1, i).isEmpty()) goto _L1; else goto _L3
_L3:
        return false;
        return false;
    }

    private boolean isEmpty()
    {
        if (text != null)
        {
            return false;
        } else
        {
            return root.isEmpty();
        }
    }

    private Model lookup(Expression expression)
        throws Exception
    {
        Expression expression1 = expression.getPath(0, 1);
        if (expression.isPath())
        {
            return root.lookup(expression1);
        } else
        {
            return root;
        }
    }

    private void process(Contact contact, Label label, LabelMap labelmap)
        throws Exception
    {
        Expression expression = label.getExpression();
        String s = label.getPath();
        contact = root;
        if (!expression.isEmpty())
        {
            contact = register(expression);
        }
        resolver.register(label);
        contact.register(label);
        labelmap.put(s, label);
    }

    private void process(Contact contact, Annotation annotation, LabelMap labelmap)
        throws Exception
    {
        annotation = LabelFactory.getInstance(contact, annotation);
        String s = annotation.getPath();
        String s1 = annotation.getName();
        if (labelmap.get(s) != null)
        {
            throw new PersistenceException("Duplicate annotation of name '%s' on %s", new Object[] {
                s1, contact
            });
        } else
        {
            process(contact, ((Label) (annotation)), labelmap);
            validate(annotation, s);
            return;
        }
    }

    private Model register(Expression expression)
        throws Exception
    {
        Model model = root.lookup(expression);
        if (model != null)
        {
            return model;
        } else
        {
            return create(expression);
        }
    }

    private void text(Contact contact, Annotation annotation)
        throws Exception
    {
        Label label = LabelFactory.getInstance(contact, annotation);
        Expression expression = label.getExpression();
        String s = label.getPath();
        contact = root;
        if (!expression.isEmpty())
        {
            contact = register(expression);
        }
        if (texts.get(s) != null)
        {
            throw new TextException("Multiple text annotations in %s", new Object[] {
                annotation
            });
        } else
        {
            resolver.register(label);
            contact.register(label);
            texts.put(s, label);
            return;
        }
    }

    private void union(Contact contact, Annotation annotation, LabelMap labelmap)
        throws Exception
    {
        Annotation aannotation[] = extract(annotation);
        int j = aannotation.length;
        for (int i = 0; i < j; i++)
        {
            Label label = LabelFactory.getInstance(contact, annotation, aannotation[i]);
            String s = label.getPath();
            String s1 = label.getName();
            if (labelmap.get(s) != null)
            {
                throw new PersistenceException("Duplicate annotation of name '%s' on %s", new Object[] {
                    s1, label
                });
            }
            process(contact, label, labelmap);
            validate(label, s);
        }

    }

    private void validate(Label label, Parameter parameter)
        throws Exception
    {
        Collection collection = label.getNames();
        Contact contact = label.getContact();
        String s = parameter.getName();
        if (contact.getType() != parameter.getType())
        {
            throw new ConstructorException("Type does not match %s for '%s' in %s", new Object[] {
                label, s, parameter
            });
        }
        if (!collection.contains(s))
        {
            String s1 = label.getName();
            if (s != s1)
            {
                if (s == null || s1 == null)
                {
                    throw new ConstructorException("Annotation does not match %s for '%s' in %s", new Object[] {
                        label, s, parameter
                    });
                }
                if (!s.equals(s1))
                {
                    throw new ConstructorException("Annotation does not match %s for '%s' in %s", new Object[] {
                        label, s, parameter
                    });
                }
            }
        }
        validateAnnotations(label, parameter);
    }

    private void validate(Label label, String s)
        throws Exception
    {
        s = scanner.getCreator().getParameter(s);
        if (s != null)
        {
            validate(label, ((Parameter) (s)));
        }
    }

    private void validateAnnotations(Label label, Parameter parameter)
        throws Exception
    {
        Object obj1 = label.getAnnotation();
        Object obj = parameter.getAnnotation();
        label = parameter.getName();
        if (!comparer.equals(((Annotation) (obj1)), ((Annotation) (obj))))
        {
            obj1 = ((Annotation) (obj1)).annotationType();
            obj = ((Annotation) (obj)).annotationType();
            if (!obj1.equals(obj))
            {
                throw new ConstructorException("Annotation %s does not match %s for '%s' in %s", new Object[] {
                    obj, obj1, label, parameter
                });
            }
        }
    }

    private void validateAttributes(Class class1, Order order)
        throws Exception
    {
        if (order != null)
        {
            order = order.attributes();
            int j = order.length;
            for (int i = 0; i < j; i++)
            {
                String s = order[i];
                if (!isAttribute(s))
                {
                    throw new AttributeException("Ordered attribute '%s' missing in %s", new Object[] {
                        s, class1
                    });
                }
            }

        }
    }

    private void validateConstructor(Label label, List list)
        throws Exception
    {
        Iterator iterator = list.iterator();
label0:
        do
        {
label1:
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                Initializer initializer = (Initializer)iterator.next();
                list = label.getContact();
                Object obj = label.getPath();
                if (!list.isReadOnly())
                {
                    continue;
                }
                obj = initializer.getParameter(((String) (obj)));
                Object obj1 = label.getNames();
                list = ((List) (obj));
                if (obj != null)
                {
                    break label1;
                }
                obj1 = ((Collection) (obj1)).iterator();
                list = ((List) (obj));
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break label1;
                    }
                    obj = initializer.getParameter((String)((Iterator) (obj1)).next());
                    list = ((List) (obj));
                } while (obj == null);
                list = ((List) (obj));
            }
            if (list == null)
            {
                iterator.remove();
            }
        } while (true);
    }

    private void validateConstructors(LabelMap labelmap)
        throws Exception
    {
        for (labelmap = labelmap.iterator(); labelmap.hasNext();)
        {
            Label label = (Label)labelmap.next();
            if (label != null && label.getContact().isReadOnly())
            {
                throw new ConstructorException("Default constructor can not accept read only %s in %s", new Object[] {
                    label, type
                });
            }
        }

    }

    private void validateConstructors(LabelMap labelmap, List list)
        throws Exception
    {
        labelmap = labelmap.iterator();
        do
        {
            if (!labelmap.hasNext())
            {
                break;
            }
            Label label = (Label)labelmap.next();
            if (label != null)
            {
                validateConstructor(label, list);
            }
        } while (true);
        if (list.isEmpty())
        {
            throw new ConstructorException("No constructor accepts all read only values in %s", new Object[] {
                type
            });
        } else
        {
            return;
        }
    }

    private void validateConstructors(Class class1)
        throws Exception
    {
        class1 = scanner.getCreator();
        List list = class1.getInitializers();
        if (class1.isDefault())
        {
            validateConstructors(elements);
            validateConstructors(attributes);
        }
        if (!list.isEmpty())
        {
            validateConstructors(elements, list);
            validateConstructors(attributes, list);
        }
    }

    private void validateElements(Class class1, Order order)
        throws Exception
    {
        if (order != null)
        {
            order = order.elements();
            int j = order.length;
            for (int i = 0; i < j; i++)
            {
                String s = order[i];
                if (!isElement(s))
                {
                    throw new ElementException("Ordered element '%s' missing for %s", new Object[] {
                        s, class1
                    });
                }
            }

        }
    }

    private void validateModel(Class class1)
        throws Exception
    {
        if (!root.isEmpty())
        {
            root.validate(class1);
        }
    }

    private void validateParameters(Creator creator)
        throws Exception
    {
        for (creator = creator.getParameters().iterator(); creator.hasNext();)
        {
            Object obj = (Parameter)creator.next();
            Label label = resolver.resolve(((Parameter) (obj)));
            obj = ((Parameter) (obj)).getPath();
            if (label == null)
            {
                throw new ConstructorException("Parameter '%s' does not have a match in %s", new Object[] {
                    obj, type
                });
            }
        }

    }

    private void validateText(Class class1)
        throws Exception
    {
        if (root.getText() != null)
        {
            if (!elements.isEmpty())
            {
                throw new TextException("Elements used with %s in %s", new Object[] {
                    text, class1
                });
            }
            if (root.isComposite())
            {
                throw new TextException("Paths used with %s in %s", new Object[] {
                    text, class1
                });
            }
        } else
        if (scanner.isEmpty())
        {
            primitive = isEmpty();
        }
    }

    private void validateUnions(Class class1)
        throws Exception
    {
        class1 = elements.iterator();
        Contact contact;
        Annotation annotation;
label0:
        do
        {
            if (class1.hasNext())
            {
                Label label = (Label)class1.next();
                Object obj = label.getPaths();
                contact = label.getContact();
                obj = ((Collection) (obj)).iterator();
                Object obj1;
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        continue label0;
                    }
                    obj1 = (String)((Iterator) (obj)).next();
                    annotation = contact.getAnnotation();
                    obj1 = (Label)elements.get(obj1);
                    if (label.isInline() != ((Label) (obj1)).isInline())
                    {
                        throw new UnionException("Inline must be consistent in %s for %s", new Object[] {
                            annotation, contact
                        });
                    }
                } while (label.isRequired() == ((Label) (obj1)).isRequired());
                break;
            } else
            {
                return;
            }
        } while (true);
        throw new UnionException("Required must be consistent in %s for %s", new Object[] {
            annotation, contact
        });
    }

    private void version(Contact contact, Annotation annotation)
        throws Exception
    {
        contact = LabelFactory.getInstance(contact, annotation);
        if (version != null)
        {
            throw new AttributeException("Multiple version annotations in %s", new Object[] {
                annotation
            });
        } else
        {
            version = contact;
            return;
        }
    }

    public void assemble(Class class1)
        throws Exception
    {
        class1 = scanner.getOrder();
        if (class1 != null)
        {
            assembler.assemble(root, class1);
        }
    }

    public Structure build(Class class1)
    {
        return new Structure(root, version, text, primitive);
    }

    public void process(Contact contact, Annotation annotation)
        throws Exception
    {
        if (annotation instanceof Attribute)
        {
            process(contact, annotation, attributes);
        }
        if (annotation instanceof ElementUnion)
        {
            union(contact, annotation, elements);
        }
        if (annotation instanceof ElementListUnion)
        {
            union(contact, annotation, elements);
        }
        if (annotation instanceof ElementMapUnion)
        {
            union(contact, annotation, elements);
        }
        if (annotation instanceof ElementList)
        {
            process(contact, annotation, elements);
        }
        if (annotation instanceof ElementArray)
        {
            process(contact, annotation, elements);
        }
        if (annotation instanceof ElementMap)
        {
            process(contact, annotation, elements);
        }
        if (annotation instanceof Element)
        {
            process(contact, annotation, elements);
        }
        if (annotation instanceof Version)
        {
            version(contact, annotation);
        }
        if (annotation instanceof Text)
        {
            text(contact, annotation);
        }
    }

    public void validate(Class class1)
        throws Exception
    {
        Creator creator = scanner.getCreator();
        Order order = scanner.getOrder();
        validateUnions(class1);
        validateElements(class1, order);
        validateAttributes(class1, order);
        validateParameters(creator);
        validateConstructors(class1);
        validateModel(class1);
        validateText(class1);
    }
}
