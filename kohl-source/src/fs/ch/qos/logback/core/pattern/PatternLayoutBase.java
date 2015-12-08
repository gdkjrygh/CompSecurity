// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.LayoutBase;
import fs.ch.qos.logback.core.pattern.parser.Parser;
import fs.ch.qos.logback.core.spi.ScanException;
import fs.ch.qos.logback.core.status.ErrorStatus;
import fs.ch.qos.logback.core.status.StatusManager;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package fs.ch.qos.logback.core.pattern:
//            PostCompileProcessor, ConverterUtil, Converter

public abstract class PatternLayoutBase extends LayoutBase
{

    Converter head;
    Map instanceConverterMap;
    protected boolean outputPatternAsHeader;
    String pattern;
    protected PostCompileProcessor postCompileProcessor;

    public PatternLayoutBase()
    {
        instanceConverterMap = new HashMap();
        outputPatternAsHeader = false;
    }

    public abstract Map getDefaultConverterMap();

    public Map getEffectiveConverterMap()
    {
        HashMap hashmap = new HashMap();
        Object obj = getDefaultConverterMap();
        if (obj != null)
        {
            hashmap.putAll(((Map) (obj)));
        }
        obj = getContext();
        if (obj != null)
        {
            obj = (Map)((Context) (obj)).getObject("PATTERN_RULE_REGISTRY");
            if (obj != null)
            {
                hashmap.putAll(((Map) (obj)));
            }
        }
        hashmap.putAll(instanceConverterMap);
        return hashmap;
    }

    public String getPattern()
    {
        return pattern;
    }

    public void setOutputPatternAsHeader(boolean flag)
    {
        outputPatternAsHeader = flag;
    }

    public void setPattern(String s)
    {
        pattern = s;
    }

    public void setPostCompileProcessor(PostCompileProcessor postcompileprocessor)
    {
        postCompileProcessor = postcompileprocessor;
    }

    public void start()
    {
        if (pattern == null || pattern.length() == 0)
        {
            addError("Empty or null pattern.");
            return;
        }
        try
        {
            Parser parser = new Parser(pattern);
            if (getContext() != null)
            {
                parser.setContext(getContext());
            }
            head = parser.compile(parser.parse(), getEffectiveConverterMap());
            if (postCompileProcessor != null)
            {
                postCompileProcessor.process(head);
            }
            ConverterUtil.setContextForConverters(getContext(), head);
            ConverterUtil.startConverters(head);
            super.start();
            return;
        }
        catch (ScanException scanexception)
        {
            getContext().getStatusManager().add(new ErrorStatus((new StringBuilder()).append("Failed to parse pattern \"").append(getPattern()).append("\".").toString(), this, scanexception));
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getName()).append("(\"").append(getPattern()).append("\")").toString();
    }

    protected String writeLoopOnConverters(Object obj)
    {
        StringBuilder stringbuilder = new StringBuilder(128);
        for (Converter converter = head; converter != null; converter = converter.getNext())
        {
            converter.write(stringbuilder, obj);
        }

        return stringbuilder.toString();
    }
}
