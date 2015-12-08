// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.optional;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.functions.Function;
import java.io.Serializable;
import java.util.Set;

// Referenced classes of package com.soundcloud.java.optional:
//            Absent, Present

public abstract class Optional
    implements Serializable
{

    private static final long serialVersionUID = 0L;

    Optional()
    {
    }

    public static Optional absent()
    {
        return Absent.withType();
    }

    public static Optional fromNullable(Object obj)
    {
        if (obj == null)
        {
            return absent();
        } else
        {
            return new Present(obj);
        }
    }

    public static Optional of(Object obj)
    {
        return new Present(Preconditions.checkNotNull(obj));
    }

    public static Iterable presentInstances(final Iterable optionals)
    {
        Preconditions.checkNotNull(optionals);
        return new _cls1();
    }

    public abstract Set asSet();

    public abstract boolean equals(Object obj);

    public abstract Object get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract Optional or(Optional optional);

    public abstract Object or(Object obj);

    public abstract Object orNull();

    public abstract String toString();

    public abstract Optional transform(Function function);

    private class _cls1
        implements Iterable
    {

        final Iterable val$optionals;

        public final Iterator iterator()
        {
            class _cls1 extends AbstractIterator
            {

                private final Iterator iterator;
                final _cls1 this$0;

                protected Object computeNext()
                {
                    while (iterator.hasNext()) 
                    {
                        Optional optional = (Optional)iterator.next();
                        if (optional.isPresent())
                        {
                            return optional.get();
                        }
                    }
                    return endOfData();
                }

                _cls1()
                {
                    this$0 = _cls1.this;
                    super();
                    iterator = (Iterator)Preconditions.checkNotNull(optionals.iterator());
                }
            }

            return new _cls1();
        }

        _cls1()
        {
            optionals = iterable;
            super();
        }
    }

}
