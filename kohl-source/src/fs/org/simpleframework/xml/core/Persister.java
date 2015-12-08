// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.org.simpleframework.xml.core;

import fs.org.simpleframework.xml.Serializer;
import fs.org.simpleframework.xml.filter.Filter;
import fs.org.simpleframework.xml.filter.PlatformFilter;
import fs.org.simpleframework.xml.strategy.Strategy;
import fs.org.simpleframework.xml.strategy.TreeStrategy;
import fs.org.simpleframework.xml.stream.Format;
import fs.org.simpleframework.xml.stream.InputNode;
import fs.org.simpleframework.xml.stream.NodeBuilder;
import fs.org.simpleframework.xml.stream.OutputNode;
import fs.org.simpleframework.xml.stream.Style;
import fs.org.simpleframework.xml.transform.Matcher;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package fs.org.simpleframework.xml.core:
//            EmptyMatcher, Support, SessionManager, Traverser, 
//            Source, Context, Session

public class Persister
    implements Serializer
{

    private final Format format;
    private final SessionManager manager;
    private final Strategy strategy;
    private final Style style;
    private final Support support;

    public Persister()
    {
        this(((Map) (new HashMap())));
    }

    public Persister(Filter filter)
    {
        this(((Strategy) (new TreeStrategy())), filter);
    }

    public Persister(Strategy strategy1, Filter filter)
    {
        this(strategy1, filter, new Format());
    }

    public Persister(Strategy strategy1, Filter filter, Format format1)
    {
        this(strategy1, filter, ((Matcher) (new EmptyMatcher())), format1);
    }

    public Persister(Strategy strategy1, Filter filter, Matcher matcher)
    {
        this(strategy1, filter, matcher, new Format());
    }

    public Persister(Strategy strategy1, Filter filter, Matcher matcher, Format format1)
    {
        support = new Support(filter, matcher);
        manager = new SessionManager();
        style = format1.getStyle();
        strategy = strategy1;
        format = format1;
    }

    public Persister(Strategy strategy1, Matcher matcher)
    {
        this(strategy1, ((Filter) (new PlatformFilter())), matcher);
    }

    public Persister(Matcher matcher)
    {
        this(((Strategy) (new TreeStrategy())), matcher);
    }

    public Persister(Map map)
    {
        this(((Filter) (new PlatformFilter(map))));
    }

    private Object read(Class class1, InputNode inputnode, Context context)
        throws Exception
    {
        return (new Traverser(context)).read(inputnode, class1);
    }

    private Object read(Class class1, InputNode inputnode, Session session)
        throws Exception
    {
        return read(class1, inputnode, ((Context) (new Source(strategy, support, style, session))));
    }

    private void write(Object obj, OutputNode outputnode, Context context)
        throws Exception
    {
        (new Traverser(context)).write(outputnode, obj);
    }

    private void write(Object obj, OutputNode outputnode, Session session)
        throws Exception
    {
        write(obj, outputnode, ((Context) (new Source(strategy, support, style, session))));
    }

    public Object read(Class class1, InputNode inputnode, boolean flag)
        throws Exception
    {
        Session session = manager.open(flag);
        class1 = ((Class) (read(class1, inputnode, session)));
        manager.close();
        return class1;
        class1;
        manager.close();
        throw class1;
    }

    public Object read(Class class1, Reader reader, boolean flag)
        throws Exception
    {
        return read(class1, NodeBuilder.read(reader), flag);
    }

    public Object read(Class class1, String s)
        throws Exception
    {
        return read(class1, s, true);
    }

    public Object read(Class class1, String s, boolean flag)
        throws Exception
    {
        return read(class1, ((Reader) (new StringReader(s))), flag);
    }

    public void write(Object obj, OutputNode outputnode)
        throws Exception
    {
        Session session = manager.open();
        write(obj, outputnode, session);
        manager.close();
        return;
        obj;
        manager.close();
        throw obj;
    }

    public void write(Object obj, OutputStream outputstream)
        throws Exception
    {
        write(obj, outputstream, "utf-8");
    }

    public void write(Object obj, OutputStream outputstream, String s)
        throws Exception
    {
        write(obj, ((Writer) (new OutputStreamWriter(outputstream, s))));
    }

    public void write(Object obj, Writer writer)
        throws Exception
    {
        write(obj, NodeBuilder.write(writer, format));
    }
}
