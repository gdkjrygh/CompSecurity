// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


public interface RequestInterceptor
{
    public static interface RequestFacade
    {

        public abstract void addEncodedPathParam(String s, String s1);

        public abstract void addEncodedQueryParam(String s, String s1);

        public abstract void addHeader(String s, String s1);

        public abstract void addPathParam(String s, String s1);

        public abstract void addQueryParam(String s, String s1);
    }


    public static final RequestInterceptor NONE = new RequestInterceptor() {

        public void intercept(RequestFacade requestfacade)
        {
        }

    };

    public abstract void intercept(RequestFacade requestfacade);

}
