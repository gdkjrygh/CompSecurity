// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


// Referenced classes of package retrofit:
//            RequestInterceptorTape

private static abstract class <init> extends Enum
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
        ADD_HEADER = new RequestInterceptorTape.Command("ADD_HEADER", 0) {

            public void intercept(RequestInterceptor.RequestFacade requestfacade, String s, String s1)
            {
                requestfacade.addHeader(s, s1);
            }

        };
        ADD_PATH_PARAM = new RequestInterceptorTape.Command("ADD_PATH_PARAM", 1) {

            public void intercept(RequestInterceptor.RequestFacade requestfacade, String s, String s1)
            {
                requestfacade.addPathParam(s, s1);
            }

        };
        ADD_ENCODED_PATH_PARAM = new RequestInterceptorTape.Command("ADD_ENCODED_PATH_PARAM", 2) {

            public void intercept(RequestInterceptor.RequestFacade requestfacade, String s, String s1)
            {
                requestfacade.addEncodedPathParam(s, s1);
            }

        };
        ADD_QUERY_PARAM = new RequestInterceptorTape.Command("ADD_QUERY_PARAM", 3) {

            public void intercept(RequestInterceptor.RequestFacade requestfacade, String s, String s1)
            {
                requestfacade.addQueryParam(s, s1);
            }

        };
        ADD_ENCODED_QUERY_PARAM = new RequestInterceptorTape.Command("ADD_ENCODED_QUERY_PARAM", 4) {

            public void intercept(RequestInterceptor.RequestFacade requestfacade, String s, String s1)
            {
                requestfacade.addEncodedQueryParam(s, s1);
            }

        };
        $VALUES = (new .VALUES[] {
            ADD_HEADER, ADD_PATH_PARAM, ADD_ENCODED_PATH_PARAM, ADD_QUERY_PARAM, ADD_ENCODED_QUERY_PARAM
        });
    }

    private _cls5(String s, int i)
    {
        super(s, i);
    }

    _cls5(String s, int i, _cls5 _pcls5)
    {
        this(s, i);
    }
}
