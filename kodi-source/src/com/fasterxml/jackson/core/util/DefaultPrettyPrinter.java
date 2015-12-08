// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import java.io.Serializable;

// Referenced classes of package com.fasterxml.jackson.core.util:
//            DefaultIndenter

public class DefaultPrettyPrinter
    implements PrettyPrinter, Serializable
{
    public static class FixedSpaceIndenter extends NopIndenter
    {

        public static final FixedSpaceIndenter instance = new FixedSpaceIndenter();


        public FixedSpaceIndenter()
        {
        }
    }

    public static interface Indenter
    {
    }

    public static class NopIndenter
        implements Indenter, Serializable
    {

        public static final NopIndenter instance = new NopIndenter();


        public NopIndenter()
        {
        }
    }


    public static final SerializedString DEFAULT_ROOT_VALUE_SEPARATOR = new SerializedString(" ");
    protected Indenter _arrayIndenter;
    protected transient int _nesting;
    protected Indenter _objectIndenter;
    protected final SerializableString _rootSeparator;
    protected boolean _spacesInObjectEntries;

    public DefaultPrettyPrinter()
    {
        this(((SerializableString) (DEFAULT_ROOT_VALUE_SEPARATOR)));
    }

    public DefaultPrettyPrinter(SerializableString serializablestring)
    {
        _arrayIndenter = FixedSpaceIndenter.instance;
        _objectIndenter = DefaultIndenter.SYSTEM_LINEFEED_INSTANCE;
        _spacesInObjectEntries = true;
        _nesting = 0;
        _rootSeparator = serializablestring;
    }

}
