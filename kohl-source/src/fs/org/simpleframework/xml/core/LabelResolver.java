// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;


// Referenced classes of package fs.org.simpleframework.xml.core:
//            LabelMap, Label, Parameter

class LabelResolver
{

    private final LabelMap attributes = new LabelMap();
    private final LabelMap elements = new LabelMap();
    private final LabelMap texts = new LabelMap();

    public LabelResolver()
    {
    }

    private void register(Label label, LabelMap labelmap)
        throws Exception
    {
        String s = label.getName();
        String s1 = label.getPath();
        if (labelmap.containsKey(s))
        {
            labelmap.put(s, null);
        } else
        {
            labelmap.put(s, label);
        }
        labelmap.put(s1, label);
    }

    private Label resolve(Parameter parameter, LabelMap labelmap)
        throws Exception
    {
        String s = parameter.getName();
        parameter = (Label)labelmap.get(parameter.getPath());
        if (parameter == null)
        {
            return (Label)labelmap.get(s);
        } else
        {
            return parameter;
        }
    }

    public void register(Label label)
        throws Exception
    {
        if (label.isAttribute())
        {
            register(label, attributes);
            return;
        }
        if (label.isText())
        {
            register(label, texts);
            return;
        } else
        {
            register(label, elements);
            return;
        }
    }

    public Label resolve(Parameter parameter)
        throws Exception
    {
        if (parameter.isAttribute())
        {
            return resolve(parameter, attributes);
        }
        if (parameter.isText())
        {
            return resolve(parameter, texts);
        } else
        {
            return resolve(parameter, elements);
        }
    }
}
