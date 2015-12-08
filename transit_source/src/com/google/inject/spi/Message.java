// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.spi;

import com.google.inject.Binder;
import com.google.inject.internal.Errors;
import com.google.inject.internal.util.$ImmutableList;
import com.google.inject.internal.util.$Objects;
import com.google.inject.internal.util.$Preconditions;
import com.google.inject.internal.util.$SourceProvider;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.List;

// Referenced classes of package com.google.inject.spi:
//            Element, ElementVisitor

public final class Message
    implements Serializable, Element
{

    private static final long serialVersionUID = 0L;
    private final Throwable cause;
    private final String message;
    private final List sources;

    public Message(Object obj, String s)
    {
        this(((List) ($ImmutableList.of(obj))), s, null);
    }

    public Message(String s)
    {
        this(((List) ($ImmutableList.of())), s, null);
    }

    public Message(List list, String s, Throwable throwable)
    {
        sources = $ImmutableList.copyOf(list);
        message = (String)$Preconditions.checkNotNull(s, "message");
        cause = throwable;
    }

    private Object writeReplace()
        throws ObjectStreamException
    {
        Object aobj[] = sources.toArray();
        for (int i = 0; i < aobj.length; i++)
        {
            aobj[i] = Errors.convert(aobj[i]).toString();
        }

        return new Message($ImmutableList.of(aobj), message, cause);
    }

    public Object acceptVisitor(ElementVisitor elementvisitor)
    {
        return elementvisitor.visit(this);
    }

    public void applyTo(Binder binder)
    {
        binder.withSource(getSource()).addError(this);
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Message)
        {
            if (message.equals(((Message) (obj = (Message)obj)).message) && $Objects.equal(cause, ((Message) (obj)).cause) && sources.equals(((Message) (obj)).sources))
            {
                return true;
            }
        }
        return false;
    }

    public Throwable getCause()
    {
        return cause;
    }

    public String getMessage()
    {
        return message;
    }

    public volatile Object getSource()
    {
        return getSource();
    }

    public String getSource()
    {
        if (sources.isEmpty())
        {
            return $SourceProvider.UNKNOWN_SOURCE.toString();
        } else
        {
            return Errors.convert(sources.get(sources.size() - 1)).toString();
        }
    }

    public List getSources()
    {
        return sources;
    }

    public int hashCode()
    {
        return message.hashCode();
    }

    public String toString()
    {
        return message;
    }
}
