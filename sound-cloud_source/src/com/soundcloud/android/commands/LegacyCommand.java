// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.commands;

import java.util.concurrent.Callable;
import rx.b;
import rx.b.f;

public abstract class LegacyCommand
    implements Callable, f
{
    public static class CommandFailedException extends RuntimeException
    {

        public CommandFailedException(Throwable throwable)
        {
            super(throwable);
        }
    }


    public Object input;

    public LegacyCommand()
    {
    }

    public final LegacyCommand andThen(LegacyCommand legacycommand)
        throws Exception
    {
        return legacycommand.with(call());
    }

    public volatile Object call(Object obj)
    {
        return call(obj);
    }

    public final b call(Object obj)
    {
        return with(obj).toObservable();
    }

    public final b flatMap(LegacyCommand legacycommand)
    {
        return toObservable().flatMap(legacycommand);
    }

    public final Object getInput()
    {
        return input;
    }

    public final rx.b.b toAction()
    {
        return new _cls1();
    }

    public b toObservable()
    {
        return b.create(new rx.i.a.a.a.a(this));
    }

    public final LegacyCommand with(Object obj)
    {
        input = obj;
        return this;
    }

    private class _cls1
        implements rx.b.b
    {

        final LegacyCommand this$0;

        public void call(Object obj)
        {
            try
            {
                with(obj).call();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw new CommandFailedException(((Throwable) (obj)));
            }
        }

        _cls1()
        {
            this$0 = LegacyCommand.this;
            super();
        }
    }

}
