// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;


// Referenced classes of package retrofit:
//            RetrofitError

public interface ErrorHandler
{

    public static final ErrorHandler DEFAULT = new ErrorHandler() {

        public Throwable handleError(RetrofitError retrofiterror)
        {
            return retrofiterror;
        }

    };

    public abstract Throwable handleError(RetrofitError retrofiterror);

}
