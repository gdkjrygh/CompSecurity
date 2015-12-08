// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.stream.Style;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            Section, Context, Model, Expression, 
//            LabelMap, ModelMap, ModelList, Label

class ModelSection
    implements Section
{

    private LabelMap attributes;
    private Context context;
    private LabelMap elements;
    private Model model;
    private ModelMap models;
    private Style style;

    public ModelSection(Context context1, Model model1)
    {
        style = context1.getStyle();
        context = context1;
        model = model1;
    }

    public String getAttribute(String s)
        throws Exception
    {
        Expression expression = model.getExpression();
        if (expression == null)
        {
            return s;
        } else
        {
            return expression.getAttribute(s);
        }
    }

    public LabelMap getAttributes()
        throws Exception
    {
        if (attributes == null)
        {
            attributes = model.buildAttributes(context);
        }
        return attributes;
    }

    public Label getElement(String s)
        throws Exception
    {
        return getElements().getLabel(s);
    }

    public LabelMap getElements()
        throws Exception
    {
        if (elements == null)
        {
            elements = model.buildElements(context);
        }
        return elements;
    }

    public ModelMap getModels()
        throws Exception
    {
        if (models == null)
        {
            models = model.buildModels(context);
        }
        return models;
    }

    public String getPath(String s)
        throws Exception
    {
        Expression expression = model.getExpression();
        if (expression == null)
        {
            return s;
        } else
        {
            return expression.getElement(s);
        }
    }

    public String getPrefix()
    {
        return model.getPrefix();
    }

    public Section getSection(String s)
        throws Exception
    {
        s = (ModelList)getModels().get(s);
        if (s != null)
        {
            s = s.take();
            if (s != null)
            {
                return new ModelSection(context, s);
            }
        }
        return null;
    }

    public Label getText()
        throws Exception
    {
        return model.getText();
    }

    public Iterator iterator()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator1 = model.iterator();
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            String s = (String)iterator1.next();
            s = style.getElement(s);
            if (s != null)
            {
                arraylist.add(s);
            }
        } while (true);
        return arraylist.iterator();
    }
}
