// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.joran.spi.ActionException;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.joran.spi.JoranException;
import fs.ch.qos.logback.core.util.Loader;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import org.xml.sax.Attributes;

// Referenced classes of package fs.ch.qos.logback.core.joran.action:
//            Action

public abstract class AbstractIncludeAction extends Action
{

    private String attributeInUse;

    public AbstractIncludeAction()
    {
    }

    private URL attributeToURL(String s)
    {
        URL url;
        url = new URL(s);
        url.openStream().close();
        return url;
        Object obj;
        obj;
        handleError((new StringBuilder()).append("URL [").append(s).append("] is not well formed.").toString(), ((Exception) (obj)));
_L2:
        return null;
        obj;
        handleError((new StringBuilder()).append("URL [").append(s).append("] cannot be opened.").toString(), ((Exception) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
    }

    private boolean checkAttributes(Attributes attributes)
    {
        String s = attributes.getValue("file");
        String s1 = attributes.getValue("url");
        attributes = attributes.getValue("resource");
        int i;
        int j;
        if (!OptionHelper.isEmpty(s))
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i = j;
        if (!OptionHelper.isEmpty(s1))
        {
            i = j + 1;
        }
        j = i;
        if (!OptionHelper.isEmpty(attributes))
        {
            j = i + 1;
        }
        if (j == 0)
        {
            handleError(String.format("One of \"%1$s\", \"%2$s\" or \"%3$s\" attributes must be set.", new Object[] {
                "file", "resource", "url"
            }), null);
            return false;
        }
        if (j > 1)
        {
            handleError(String.format("Only one of \"%1$s\", \"%2$s\" or \"%3$s\" attributes should be set.", new Object[] {
                "file", "resource", "url"
            }), null);
            return false;
        }
        if (j == 1)
        {
            return true;
        } else
        {
            throw new IllegalStateException((new StringBuilder()).append("Count value [").append(j).append("] is not expected").toString());
        }
    }

    private URL filePathAsURL(String s)
    {
        File file = new File(s);
        if (!file.exists() || !file.isFile())
        {
            handleError((new StringBuilder()).append("File does not exist [").append(s).append("]").toString(), new FileNotFoundException(s));
            return null;
        }
        s = file.toURI();
        try
        {
            s = s.toURL();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s.printStackTrace();
            return null;
        }
        return s;
    }

    private URL getInputURL(InterpretationContext interpretationcontext, Attributes attributes)
    {
        String s = attributes.getValue("file");
        String s1 = attributes.getValue("url");
        attributes = attributes.getValue("resource");
        if (!OptionHelper.isEmpty(s))
        {
            attributeInUse = interpretationcontext.subst(s);
            return filePathAsURL(attributeInUse);
        }
        if (!OptionHelper.isEmpty(s1))
        {
            attributeInUse = interpretationcontext.subst(s1);
            return attributeToURL(attributeInUse);
        }
        if (!OptionHelper.isEmpty(attributes))
        {
            attributeInUse = interpretationcontext.subst(attributes);
            return resourceAsURL(attributeInUse);
        } else
        {
            throw new IllegalStateException("A URL stream should have been returned");
        }
    }

    private URL resourceAsURL(String s)
    {
        URL url = Loader.getResourceBySelfClassLoader(s);
        if (url == null)
        {
            handleError((new StringBuilder()).append("Could not find resource corresponding to [").append(s).append("]").toString(), null);
            return null;
        } else
        {
            return url;
        }
    }

    public void begin(InterpretationContext interpretationcontext, String s, Attributes attributes)
        throws ActionException
    {
        attributeInUse = null;
        if (checkAttributes(attributes)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((s = getInputURL(interpretationcontext, attributes)) == null) goto _L1; else goto _L3
_L3:
        try
        {
            processInclude(interpretationcontext, s);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InterpretationContext interpretationcontext)
        {
            handleError((new StringBuilder()).append("Error while parsing ").append(attributeInUse).toString(), interpretationcontext);
        }
        return;
    }

    protected void close(InputStream inputstream)
    {
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_8;
        }
        inputstream.close();
        return;
        inputstream;
    }

    public void end(InterpretationContext interpretationcontext, String s)
        throws ActionException
    {
    }

    protected void handleError(String s, Exception exception)
    {
        addError(s, exception);
    }

    protected abstract void processInclude(InterpretationContext interpretationcontext, URL url)
        throws JoranException;
}
