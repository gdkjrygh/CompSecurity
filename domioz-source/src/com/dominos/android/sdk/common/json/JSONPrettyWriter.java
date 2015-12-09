// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.common.json;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.dominos.android.sdk.common.json:
//            JSONWriter

public class JSONPrettyWriter extends JSONWriter
{

    private int indent;

    public JSONPrettyWriter()
    {
        indent = 0;
    }

    private boolean isList(Object obj)
    {
        return obj != null && ((obj instanceof Collection) || (obj instanceof Iterator) || obj.getClass().isArray());
    }

    protected void add(String s, Object obj)
    {
        addIndent();
        add('"');
        add(s);
        add("\":");
        value(obj);
    }

    protected void add(java.util.Map.Entry entry)
    {
        addIndent();
        value(entry.getKey());
        add(':');
        value(entry.getValue());
    }

    protected void addArrayClose()
    {
        indent = indent - 1;
        add(']');
    }

    protected void addArrayOpen()
    {
        add('[');
        indent = indent + 1;
    }

    protected void addArrayValue(Object obj)
    {
        if (isList(obj))
        {
            addIndent();
        }
        value(obj);
    }

    protected void addIndent()
    {
        add('\n');
        for (int i = 0; i < indent; i++)
        {
            add('\t');
        }

    }

    protected void addObjectClose()
    {
        indent = indent - 1;
        addIndent();
        add('}');
    }

    protected void addObjectOpen()
    {
        indent = indent + 1;
        add('{');
    }

    protected void addObjectSeparator()
    {
        add(',');
    }
}
