// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package retrofit:
//            RequestInterceptor

final class RequestInterceptorTape
    implements RequestInterceptor, RequestInterceptor.RequestFacade
{

    private final List tape = new ArrayList();

    RequestInterceptorTape()
    {
    }

    public final void addEncodedPathParam(String s, String s1)
    {
        tape.add(new CommandWithParams(Command.ADD_ENCODED_PATH_PARAM, s, s1));
    }

    public final void addEncodedQueryParam(String s, String s1)
    {
        tape.add(new CommandWithParams(Command.ADD_ENCODED_QUERY_PARAM, s, s1));
    }

    public final void addHeader(String s, String s1)
    {
        tape.add(new CommandWithParams(Command.ADD_HEADER, s, s1));
    }

    public final void addPathParam(String s, String s1)
    {
        tape.add(new CommandWithParams(Command.ADD_PATH_PARAM, s, s1));
    }

    public final void addQueryParam(String s, String s1)
    {
        tape.add(new CommandWithParams(Command.ADD_QUERY_PARAM, s, s1));
    }

    public final void intercept(RequestInterceptor.RequestFacade requestfacade)
    {
        CommandWithParams commandwithparams;
        for (Iterator iterator = tape.iterator(); iterator.hasNext(); commandwithparams.command.intercept(requestfacade, commandwithparams.name, commandwithparams.value))
        {
            commandwithparams = (CommandWithParams)iterator.next();
        }

    }

    private class CommandWithParams
    {

        final Command command;
        final String name;
        final String value;

        CommandWithParams(Command command1, String s, String s1)
        {
            command = command1;
            name = s;
            value = s1;
        }
    }


    private class Command extends Enum
    {

        private static final Command $VALUES[];
        public static final Command ADD_ENCODED_PATH_PARAM;
        public static final Command ADD_ENCODED_QUERY_PARAM;
        public static final Command ADD_HEADER;
        public static final Command ADD_PATH_PARAM;
        public static final Command ADD_QUERY_PARAM;

        public static Command valueOf(String s)
        {
            return (Command)Enum.valueOf(retrofit/RequestInterceptorTape$Command, s);
        }

        public static Command[] values()
        {
            return (Command[])$VALUES.clone();
        }

        abstract void intercept(RequestInterceptor.RequestFacade requestfacade, String s, String s1);

        static 
        {
            class _cls1 extends Command
            {

                public final void intercept(RequestInterceptor.RequestFacade requestfacade, String s, String s1)
                {
                    requestfacade.addHeader(s, s1);
                }

                _cls1(String s, int i)
                {
                    super(s, i, null);
                }
            }

            ADD_HEADER = new _cls1("ADD_HEADER", 0);
            class _cls2 extends Command
            {

                public final void intercept(RequestInterceptor.RequestFacade requestfacade, String s, String s1)
                {
                    requestfacade.addPathParam(s, s1);
                }

                _cls2(String s, int i)
                {
                    super(s, i, null);
                }
            }

            ADD_PATH_PARAM = new _cls2("ADD_PATH_PARAM", 1);
            class _cls3 extends Command
            {

                public final void intercept(RequestInterceptor.RequestFacade requestfacade, String s, String s1)
                {
                    requestfacade.addEncodedPathParam(s, s1);
                }

                _cls3(String s, int i)
                {
                    super(s, i, null);
                }
            }

            ADD_ENCODED_PATH_PARAM = new _cls3("ADD_ENCODED_PATH_PARAM", 2);
            class _cls4 extends Command
            {

                public final void intercept(RequestInterceptor.RequestFacade requestfacade, String s, String s1)
                {
                    requestfacade.addQueryParam(s, s1);
                }

                _cls4(String s, int i)
                {
                    super(s, i, null);
                }
            }

            ADD_QUERY_PARAM = new _cls4("ADD_QUERY_PARAM", 3);
            class _cls5 extends Command
            {

                public final void intercept(RequestInterceptor.RequestFacade requestfacade, String s, String s1)
                {
                    requestfacade.addEncodedQueryParam(s, s1);
                }

                _cls5(String s, int i)
                {
                    super(s, i, null);
                }
            }

            ADD_ENCODED_QUERY_PARAM = new _cls5("ADD_ENCODED_QUERY_PARAM", 4);
            $VALUES = (new Command[] {
                ADD_HEADER, ADD_PATH_PARAM, ADD_ENCODED_PATH_PARAM, ADD_QUERY_PARAM, ADD_ENCODED_QUERY_PARAM
            });
        }

        private Command(String s, int i)
        {
            super(s, i);
        }

        Command(String s, int i, _cls1 _pcls1)
        {
            this(s, i);
        }
    }

}
