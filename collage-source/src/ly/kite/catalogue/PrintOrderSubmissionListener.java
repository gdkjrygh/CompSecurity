// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;


// Referenced classes of package ly.kite.catalogue:
//            PrintOrder

public interface PrintOrderSubmissionListener
{

    public abstract void onError(PrintOrder printorder, Exception exception);

    public abstract void onProgress(PrintOrder printorder, int i, int j);

    public abstract void onSubmissionComplete(PrintOrder printorder, String s);
}
