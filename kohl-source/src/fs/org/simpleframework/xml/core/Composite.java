// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Version;
import fs.org.simpleframework.xml.strategy.Type;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.NamespaceMap;
import fs.org.simpleframework.xml.stream.NodeMap;
import fs.org.simpleframework.xml.stream.OutputNode;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Converter, ObjectFactory, Primitive, Collector, 
//            Revision, Context, Schema, Caller, 
//            Instance, Creator, Section, LabelMap, 
//            AttributeException, Criteria, ElementException, Label, 
//            ValueRequiredException, Variable, Contact, Decorator, 
//            TextException

class Composite
    implements Converter
{

    private final Context context;
    private final Criteria criteria;
    private final ObjectFactory factory;
    private final Primitive primitive;
    private final Revision revision;
    private final Type type;

    public Composite(Context context1, Type type1)
    {
        this(context1, type1, null);
    }

    public Composite(Context context1, Type type1, Class class1)
    {
        factory = new ObjectFactory(context1, type1, class1);
        primitive = new Primitive(context1, type1);
        criteria = new Collector(context1);
        revision = new Revision();
        context = context1;
        type = type1;
    }

    private boolean isOverridden(OutputNode outputnode, Object obj, Type type1)
        throws Exception
    {
        return factory.setOverride(type1, obj, outputnode);
    }

    private Object read(InputNode inputnode, Instance instance, Class class1)
        throws Exception
    {
        Object obj = context.getSchema(class1);
        class1 = ((Schema) (obj)).getCaller();
        obj = read(inputnode, ((Schema) (obj)), instance);
        class1.validate(obj);
        class1.commit(obj);
        instance.setInstance(obj);
        return readResolve(inputnode, obj, class1);
    }

    private Object read(InputNode inputnode, Schema schema, Instance instance)
        throws Exception
    {
        if (schema.getCreator().isDefault())
        {
            return readDefault(inputnode, schema, instance);
        } else
        {
            read(inputnode, null, schema);
            return readConstructor(inputnode, schema, instance);
        }
    }

    private void read(InputNode inputnode, Object obj, Schema schema)
        throws Exception
    {
        Section section = schema.getSection();
        readVersion(inputnode, obj, schema);
        readSection(inputnode, obj, section);
    }

    private void readAttribute(InputNode inputnode, Object obj, Section section, LabelMap labelmap)
        throws Exception
    {
        section = section.getAttribute(inputnode.getName());
        Label label = labelmap.getLabel(section);
        if (label == null)
        {
            inputnode = inputnode.getPosition();
            obj = context.getType(type, obj);
            if (labelmap.isStrict(context) && revision.isEqual())
            {
                throw new AttributeException("Attribute '%s' does not have a match in %s at %s", new Object[] {
                    section, obj, inputnode
                });
            }
        } else
        {
            readInstance(inputnode, obj, label);
        }
    }

    private void readAttributes(InputNode inputnode, Object obj, Section section)
        throws Exception
    {
        Object obj1 = inputnode.getAttributes();
        LabelMap labelmap = section.getAttributes();
        obj1 = ((NodeMap) (obj1)).iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            InputNode inputnode1 = inputnode.getAttribute((String)((Iterator) (obj1)).next());
            if (inputnode1 != null)
            {
                readAttribute(inputnode1, obj, section, labelmap);
            }
        } while (true);
        validate(inputnode, labelmap, obj);
    }

    private Object readConstructor(InputNode inputnode, Schema schema, Instance instance)
        throws Exception
    {
        inputnode = ((InputNode) (schema.getCreator().getInstance(context, criteria)));
        if (instance != null)
        {
            instance.setInstance(inputnode);
            criteria.commit(inputnode);
        }
        return inputnode;
    }

    private Object readDefault(InputNode inputnode, Schema schema, Instance instance)
        throws Exception
    {
        Object obj = instance.getInstance();
        if (instance != null)
        {
            instance.setInstance(obj);
            read(inputnode, obj, schema);
            criteria.commit(obj);
        }
        return obj;
    }

    private void readElement(InputNode inputnode, Object obj, Section section, LabelMap labelmap)
        throws Exception
    {
        String s = section.getPath(inputnode.getName());
        Label label = labelmap.getLabel(s);
        section = label;
        if (label == null)
        {
            section = criteria.get(s);
        }
        if (section == null)
        {
            section = inputnode.getPosition();
            obj = context.getType(type, obj);
            if (labelmap.isStrict(context) && revision.isEqual())
            {
                throw new ElementException("Element '%s' does not have a match in %s at %s", new Object[] {
                    s, obj, section
                });
            } else
            {
                inputnode.skip();
                return;
            }
        } else
        {
            readUnion(inputnode, obj, labelmap, section);
            return;
        }
    }

    private void readElements(InputNode inputnode, Object obj, Section section)
        throws Exception
    {
        LabelMap labelmap = section.getElements();
        InputNode inputnode1 = inputnode.getNext();
        while (inputnode1 != null) 
        {
            Section section1 = section.getSection(inputnode1.getName());
            if (section1 != null)
            {
                readSection(inputnode1, obj, section1);
            } else
            {
                readElement(inputnode1, obj, section, labelmap);
            }
            inputnode1 = inputnode.getNext();
        }
        validate(inputnode, labelmap, obj);
    }

    private Object readInstance(InputNode inputnode, Object obj, Label label)
        throws Exception
    {
        Object obj1 = readVariable(inputnode, obj, label);
        if (obj1 == null)
        {
            inputnode = inputnode.getPosition();
            obj = context.getType(type, obj);
            if (label.isRequired() && revision.isEqual())
            {
                throw new ValueRequiredException("Empty value for %s in %s at %s", new Object[] {
                    label, obj, inputnode
                });
            }
        } else
        if (obj1 != label.getEmpty(context))
        {
            criteria.set(label, obj1);
        }
        return obj1;
    }

    private Object readPrimitive(InputNode inputnode, Instance instance)
        throws Exception
    {
        Class class1 = instance.getType();
        inputnode = ((InputNode) (primitive.read(inputnode, class1)));
        if (class1 != null)
        {
            instance.setInstance(inputnode);
        }
        return inputnode;
    }

    private Object readResolve(InputNode inputnode, Object obj, Caller caller)
        throws Exception
    {
        if (obj != null)
        {
            fs.org.simpleframework.xml.stream.Position position = inputnode.getPosition();
            inputnode = ((InputNode) (caller.resolve(obj)));
            obj = type.getType();
            caller = inputnode.getClass();
            if (!((Class) (obj)).isAssignableFrom(caller))
            {
                throw new ElementException("Type %s does not match %s at %s", new Object[] {
                    caller, obj, position
                });
            }
        } else
        {
            inputnode = ((InputNode) (obj));
        }
        return inputnode;
    }

    private void readSection(InputNode inputnode, Object obj, Section section)
        throws Exception
    {
        readText(inputnode, obj, section);
        readAttributes(inputnode, obj, section);
        readElements(inputnode, obj, section);
    }

    private void readText(InputNode inputnode, Object obj, Section section)
        throws Exception
    {
        section = section.getText();
        if (section != null)
        {
            readInstance(inputnode, obj, section);
        }
    }

    private void readUnion(InputNode inputnode, Object obj, LabelMap labelmap, Label label)
        throws Exception
    {
        inputnode = ((InputNode) (readInstance(inputnode, obj, label)));
        obj = label.getPaths(context).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Label label1 = labelmap.getLabel((String)((Iterator) (obj)).next());
            if (label.isInline())
            {
                criteria.set(label1, inputnode);
            }
        } while (true);
    }

    private Object readVariable(InputNode inputnode, Object obj, Label label)
        throws Exception
    {
        Converter converter = label.getConverter(context);
        Object obj1 = label.getName(context);
        if (label.isCollection())
        {
            obj1 = criteria.get(((String) (obj1)));
            label = label.getContact();
            if (obj1 != null)
            {
                return converter.read(inputnode, ((Variable) (obj1)).getValue());
            }
            if (obj != null)
            {
                obj = label.get(obj);
                if (obj != null)
                {
                    return converter.read(inputnode, obj);
                }
            }
        }
        return converter.read(inputnode);
    }

    private void readVersion(InputNode inputnode, Object obj, Label label)
        throws Exception
    {
        inputnode = ((InputNode) (readInstance(inputnode, obj, label)));
        obj = type.getType();
        if (inputnode != null)
        {
            double d = context.getVersion(((Class) (obj))).revision();
            if (!inputnode.equals(revision))
            {
                revision.compare(Double.valueOf(d), inputnode);
            }
        }
    }

    private void readVersion(InputNode inputnode, Object obj, Schema schema)
        throws Exception
    {
        Class class1;
label0:
        {
            schema = schema.getVersion();
            class1 = type.getType();
            if (schema != null)
            {
                String s = schema.getName();
                inputnode = (InputNode)inputnode.getAttributes().remove(s);
                if (inputnode == null)
                {
                    break label0;
                }
                readVersion(inputnode, obj, ((Label) (schema)));
            }
            return;
        }
        inputnode = context.getVersion(class1);
        obj = Double.valueOf(revision.getDefault());
        double d = inputnode.revision();
        criteria.set(schema, obj);
        revision.compare(Double.valueOf(d), obj);
    }

    private void validate(InputNode inputnode, LabelMap labelmap, Object obj)
        throws Exception
    {
        obj = context.getType(type, obj);
        inputnode = inputnode.getPosition();
        labelmap = labelmap.iterator();
        do
        {
            if (!labelmap.hasNext())
            {
                break;
            }
            Label label = (Label)labelmap.next();
            if (label.isRequired() && revision.isEqual())
            {
                throw new ValueRequiredException("Unable to satisfy %s for %s at %s", new Object[] {
                    label, obj, inputnode
                });
            }
            Object obj1 = label.getEmpty(context);
            if (obj1 != null)
            {
                criteria.set(label, obj1);
            }
        } while (true);
    }

    private void write(OutputNode outputnode, Object obj, Schema schema)
        throws Exception
    {
        Section section = schema.getSection();
        writeVersion(outputnode, obj, schema);
        writeSection(outputnode, obj, section);
    }

    private void writeAttribute(OutputNode outputnode, Object obj, Label label)
        throws Exception
    {
        if (obj != null)
        {
            label.getDecorator().decorate(outputnode.setAttribute(label.getName(context), factory.getText(obj)));
        }
    }

    private void writeAttributes(OutputNode outputnode, Object obj, Section section)
        throws Exception
    {
        Label label;
        for (Iterator iterator = section.getAttributes().iterator(); iterator.hasNext(); writeAttribute(outputnode, section, label))
        {
            label = (Label)iterator.next();
            Object obj1 = label.getContact().get(obj);
            Class class1 = context.getType(type, obj);
            section = ((Section) (obj1));
            if (obj1 == null)
            {
                section = ((Section) (label.getEmpty(context)));
            }
            if (section == null && label.isRequired())
            {
                throw new AttributeException("Value for %s is null in %s", new Object[] {
                    label, class1
                });
            }
        }

    }

    private void writeElement(OutputNode outputnode, Object obj, Converter converter)
        throws Exception
    {
        converter.write(outputnode, obj);
    }

    private void writeElement(OutputNode outputnode, Object obj, Label label)
        throws Exception
    {
        if (obj != null)
        {
            Class class1 = obj.getClass();
            Label label1 = label.getLabel(class1);
            String s = label1.getName(context);
            label = label.getType(class1);
            outputnode = outputnode.getChild(s);
            if (!label1.isInline())
            {
                writeNamespaces(outputnode, label, label1);
            }
            if (label1.isInline() || !isOverridden(outputnode, obj, label))
            {
                label = label1.getConverter(context);
                outputnode.setData(label1.isData());
                writeElement(outputnode, obj, ((Converter) (label)));
            }
        }
    }

    private void writeElements(OutputNode outputnode, Object obj, Section section)
        throws Exception
    {
        Iterator iterator = section.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            Section section1 = section.getSection(s);
            if (section1 != null)
            {
                writeSection(outputnode.getChild(s), obj, section1);
            } else
            {
                String s1 = section.getPath(s);
                Label label = section.getElement(s1);
                Class class1 = context.getType(type, obj);
                if (criteria.get(s1) == null)
                {
                    if (label == null)
                    {
                        throw new ElementException("Element '%s' not defined in %s", new Object[] {
                            s, class1
                        });
                    }
                    writeUnion(outputnode, obj, section, label);
                }
            }
        } while (true);
    }

    private void writeNamespaces(OutputNode outputnode, Type type1, Label label)
        throws Exception
    {
        type1 = type1.getType();
        type1 = context.getDecorator(type1);
        label.getDecorator().decorate(outputnode, type1);
    }

    private Object writeReplace(Object obj)
        throws Exception
    {
        Object obj1 = obj;
        if (obj != null)
        {
            obj1 = obj.getClass();
            obj1 = context.getCaller(((Class) (obj1))).replace(obj);
        }
        return obj1;
    }

    private void writeSection(OutputNode outputnode, Object obj, Section section)
        throws Exception
    {
        Object obj1 = outputnode.getNamespaces();
        String s = section.getPrefix();
        if (s != null)
        {
            obj1 = ((NamespaceMap) (obj1)).getReference(s);
            if (obj1 == null)
            {
                throw new ElementException("Namespace prefix '%s' in %s is not in scope", new Object[] {
                    s, type
                });
            }
            outputnode.setReference(((String) (obj1)));
        }
        writeAttributes(outputnode, obj, section);
        writeElements(outputnode, obj, section);
        writeText(outputnode, obj, section);
    }

    private void writeText(OutputNode outputnode, Object obj, Label label)
        throws Exception
    {
        if (obj != null)
        {
            obj = factory.getText(obj);
            outputnode.setData(label.isData());
            outputnode.setValue(((String) (obj)));
        }
    }

    private void writeText(OutputNode outputnode, Object obj, Section section)
        throws Exception
    {
        Label label = section.getText();
        if (label != null)
        {
            section = ((Section) (label.getContact().get(obj)));
            Class class1 = context.getType(type, obj);
            obj = section;
            if (section == null)
            {
                obj = label.getEmpty(context);
            }
            if (obj == null && label.isRequired())
            {
                throw new TextException("Value for %s is null in %s", new Object[] {
                    label, class1
                });
            }
            writeText(outputnode, obj, label);
        }
    }

    private void writeUnion(OutputNode outputnode, Object obj, Section section, Label label)
        throws Exception
    {
        Object obj1 = label.getContact().get(obj);
        obj = context.getType(type, obj);
        if (obj1 == null && label.isRequired())
        {
            throw new ElementException("Value for %s is null in %s", new Object[] {
                label, obj
            });
        }
        obj = writeReplace(obj1);
        if (obj != null)
        {
            writeElement(outputnode, obj, label);
        }
        outputnode = label.getPaths(context).iterator();
        do
        {
            if (!outputnode.hasNext())
            {
                break;
            }
            label = section.getElement((String)outputnode.next());
            if (label != null)
            {
                criteria.set(label, obj);
            }
        } while (true);
    }

    private void writeVersion(OutputNode outputnode, Object obj, Schema schema)
        throws Exception
    {
label0:
        {
            obj = schema.getRevision();
            schema = schema.getVersion();
            if (obj != null)
            {
                double d = revision.getDefault();
                obj = Double.valueOf(((Version) (obj)).revision());
                if (!revision.compare(obj, Double.valueOf(d)))
                {
                    break label0;
                }
                if (schema.isRequired())
                {
                    writeAttribute(outputnode, obj, schema);
                }
            }
            return;
        }
        writeAttribute(outputnode, obj, schema);
    }

    public Object read(InputNode inputnode)
        throws Exception
    {
        Instance instance = factory.getInstance(inputnode);
        Class class1 = instance.getType();
        if (instance.isReference())
        {
            return instance.getInstance();
        }
        if (context.isPrimitive(class1))
        {
            return readPrimitive(inputnode, instance);
        } else
        {
            return read(inputnode, instance, class1);
        }
    }

    public Object read(InputNode inputnode, Object obj)
        throws Exception
    {
        Object obj1 = obj.getClass();
        obj1 = context.getSchema(((Class) (obj1)));
        Caller caller = ((Schema) (obj1)).getCaller();
        read(inputnode, obj, ((Schema) (obj1)));
        criteria.commit(obj);
        caller.validate(obj);
        caller.commit(obj);
        return readResolve(inputnode, obj, caller);
    }

    public void write(OutputNode outputnode, Object obj)
        throws Exception
    {
        Object obj1;
        Schema schema;
        obj1 = obj.getClass();
        schema = context.getSchema(((Class) (obj1)));
        obj1 = schema.getCaller();
        if (!schema.isPrimitive()) goto _L2; else goto _L1
_L1:
        primitive.write(outputnode, obj);
_L4:
        ((Caller) (obj1)).complete(obj);
        return;
_L2:
        ((Caller) (obj1)).persist(obj);
        write(outputnode, obj, schema);
        if (true) goto _L4; else goto _L3
_L3:
        outputnode;
        ((Caller) (obj1)).complete(obj);
        throw outputnode;
    }
}
