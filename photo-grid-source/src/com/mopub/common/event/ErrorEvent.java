// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;


// Referenced classes of package com.mopub.common.event:
//            BaseEvent

public class ErrorEvent extends BaseEvent
{

    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final Integer g;

    private ErrorEvent(Builder builder)
    {
        super(builder);
        a = Builder.a(builder);
        b = Builder.b(builder);
        c = Builder.c(builder);
        d = Builder.d(builder);
        e = Builder.e(builder);
        f = Builder.f(builder);
        g = Builder.g(builder);
    }

    ErrorEvent(Builder builder, byte byte0)
    {
        this(builder);
    }

    public String getErrorClassName()
    {
        return e;
    }

    public String getErrorExceptionClassName()
    {
        return a;
    }

    public String getErrorFileName()
    {
        return d;
    }

    public Integer getErrorLineNumber()
    {
        return g;
    }

    public String getErrorMessage()
    {
        return b;
    }

    public String getErrorMethodName()
    {
        return f;
    }

    public String getErrorStackTrace()
    {
        return c;
    }

    public String toString()
    {
        String s = super.toString();
        return (new StringBuilder()).append(s).append("ErrorEvent\nErrorExceptionClassName: ").append(getErrorExceptionClassName()).append("\nErrorMessage: ").append(getErrorMessage()).append("\nErrorStackTrace: ").append(getErrorStackTrace()).append("\nErrorFileName: ").append(getErrorFileName()).append("\nErrorClassName: ").append(getErrorClassName()).append("\nErrorMethodName: ").append(getErrorMethodName()).append("\nErrorLineNumber: ").append(getErrorLineNumber()).append("\n").toString();
    }

    private class Builder extends BaseEvent.Builder
    {

        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private Integer g;

        static String a(Builder builder)
        {
            return builder.a;
        }

        static String b(Builder builder)
        {
            return builder.b;
        }

        static String c(Builder builder)
        {
            return builder.c;
        }

        static String d(Builder builder)
        {
            return builder.d;
        }

        static String e(Builder builder)
        {
            return builder.e;
        }

        static String f(Builder builder)
        {
            return builder.f;
        }

        static Integer g(Builder builder)
        {
            return builder.g;
        }

        public volatile BaseEvent build()
        {
            return build();
        }

        public ErrorEvent build()
        {
            return new ErrorEvent(this, (byte)0);
        }

        public Builder withErrorClassName(String s)
        {
            e = s;
            return this;
        }

        public Builder withErrorExceptionClassName(String s)
        {
            a = s;
            return this;
        }

        public Builder withErrorFileName(String s)
        {
            d = s;
            return this;
        }

        public Builder withErrorLineNumber(Integer integer)
        {
            g = integer;
            return this;
        }

        public Builder withErrorMessage(String s)
        {
            b = s;
            return this;
        }

        public Builder withErrorMethodName(String s)
        {
            f = s;
            return this;
        }

        public Builder withErrorStackTrace(String s)
        {
            c = s;
            return this;
        }

        public Builder withException(Exception exception)
        {
            a = exception.getClass().getName();
            b = exception.getMessage();
            StringWriter stringwriter = new StringWriter();
            exception.printStackTrace(new PrintWriter(stringwriter));
            c = stringwriter.toString();
            if (exception.getStackTrace().length > 0)
            {
                d = exception.getStackTrace()[0].getFileName();
                e = exception.getStackTrace()[0].getClassName();
                f = exception.getStackTrace()[0].getMethodName();
                g = Integer.valueOf(exception.getStackTrace()[0].getLineNumber());
            }
            return this;
        }

        public Builder(BaseEvent.Name name, BaseEvent.Category category, double d1)
        {
            super(BaseEvent.ScribeCategory.EXCHANGE_CLIENT_ERROR, name, category, d1);
        }
    }

}
