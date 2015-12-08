// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


abstract class <init> extends Enum
{

    private static final ADD_ENCODED_QUERY_PARAM $VALUES[];
    public static final ADD_ENCODED_QUERY_PARAM ADD_ENCODED_PATH_PARAM;
    public static final ADD_ENCODED_QUERY_PARAM ADD_ENCODED_QUERY_PARAM;
    public static final ADD_ENCODED_QUERY_PARAM ADD_HEADER;
    public static final ADD_ENCODED_QUERY_PARAM ADD_PATH_PARAM;
    public static final ADD_ENCODED_QUERY_PARAM ADD_QUERY_PARAM;

    public static <init> valueOf(String s)
    {
        return (<init>)Enum.valueOf(retrofit/RequestInterceptorTape$Command, s);
    }

    public static <init>[] values()
    {
        return (<init>[])$VALUES.clone();
    }

    abstract void intercept(e e, String s, String s1);

    static 
    {
        class _cls1 extends RequestInterceptorTape.Command
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
        class _cls2 extends RequestInterceptorTape.Command
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
        class _cls3 extends RequestInterceptorTape.Command
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
        class _cls4 extends RequestInterceptorTape.Command
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
        class _cls5 extends RequestInterceptorTape.Command
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
        $VALUES = (new .VALUES[] {
            ADD_HEADER, ADD_PATH_PARAM, ADD_ENCODED_PATH_PARAM, ADD_QUERY_PARAM, ADD_ENCODED_QUERY_PARAM
        });
    }

    private e(String s, int i)
    {
        super(s, i);
    }

    e(String s, int i, e e)
    {
        this(s, i);
    }
}
