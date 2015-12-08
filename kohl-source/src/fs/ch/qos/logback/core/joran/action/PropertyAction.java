// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.pattern.util.RegularEscapeUtil;
import fs.ch.qos.logback.core.util.Loader;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            Action, ActionUtil

public class PropertyAction extends Action
{

    static String INVALID_ATTRIBUTES = "In <property> element, either the \"file\" attribute alone, or the \"resource\" element alone, or both the \"name\" and \"value\" attributes must be set.";

    public PropertyAction()
    {
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
    {
        if ("substitutionProperty".equals(s))
        {
            addWarn("[substitutionProperty] element has been deprecated. Please use the [property] element instead.");
        }
        Object obj = attributes.getValue("name");
        String s1 = attributes.getValue("value");
        s = ActionUtil.stringToScope(attributes.getValue("scope"));
        if (checkFileAttributeSanity(attributes))
        {
            attributes = interpretationcontext.subst(attributes.getValue("file"));
            try
            {
                loadAndSetProperties(interpretationcontext, new FileInputStream(attributes), s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (InterpretationContext interpretationcontext)
            {
                addError((new StringBuilder()).append("Could not find properties file [").append(attributes).append("].").toString());
                return;
            }
            // Misplaced declaration of an exception variable
            catch (InterpretationContext interpretationcontext)
            {
                addError((new StringBuilder()).append("Could not read properties file [").append(attributes).append("].").toString(), interpretationcontext);
            }
            return;
        }
        if (checkResourceAttributeSanity(attributes))
        {
            attributes = interpretationcontext.subst(attributes.getValue("resource"));
            obj = Loader.getResourceBySelfClassLoader(attributes);
            if (obj == null)
            {
                addError((new StringBuilder()).append("Could not find resource [").append(attributes).append("].").toString());
                return;
            }
            try
            {
                loadAndSetProperties(interpretationcontext, ((URL) (obj)).openStream(), s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (InterpretationContext interpretationcontext)
            {
                addError((new StringBuilder()).append("Could not read resource file [").append(attributes).append("].").toString(), interpretationcontext);
            }
            return;
        }
        if (checkValueNameAttributesSanity(attributes))
        {
            ActionUtil.setProperty(interpretationcontext, ((String) (obj)), interpretationcontext.subst(RegularEscapeUtil.basicEscape(s1).trim()), s);
            return;
        } else
        {
            addError(INVALID_ATTRIBUTES);
            return;
        }
    }

    boolean checkFileAttributeSanity(Attributes attributes)
    {
        String s = attributes.getValue("file");
        String s1 = attributes.getValue("name");
        String s2 = attributes.getValue("value");
        attributes = attributes.getValue("resource");
        return !OptionHelper.isEmpty(s) && OptionHelper.isEmpty(s1) && OptionHelper.isEmpty(s2) && OptionHelper.isEmpty(attributes);
    }

    boolean checkResourceAttributeSanity(Attributes attributes)
    {
        String s = attributes.getValue("file");
        String s1 = attributes.getValue("name");
        String s2 = attributes.getValue("value");
        return !OptionHelper.isEmpty(attributes.getValue("resource")) && OptionHelper.isEmpty(s1) && OptionHelper.isEmpty(s2) && OptionHelper.isEmpty(s);
    }

    boolean checkValueNameAttributesSanity(Attributes attributes)
    {
        String s = attributes.getValue("file");
        String s1 = attributes.getValue("name");
        String s2 = attributes.getValue("value");
        attributes = attributes.getValue("resource");
        return !OptionHelper.isEmpty(s1) && !OptionHelper.isEmpty(s2) && OptionHelper.isEmpty(s) && OptionHelper.isEmpty(attributes);
    }

    public void end(InterpretationContext interpretationcontext, String s)
    {
    }

    void loadAndSetProperties(InterpretationContext interpretationcontext, InputStream inputstream, ActionUtil.Scope scope)
        throws IOException
    {
        Properties properties = new Properties();
        properties.load(inputstream);
        inputstream.close();
        ActionUtil.setProperties(interpretationcontext, properties, scope);
    }

}
