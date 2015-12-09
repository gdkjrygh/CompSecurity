// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ly.kite.catalogue;


// Referenced classes of package ly.kite.catalogue:
//            Catalogue

public interface ICatalogueConsumer
{

    public abstract void onCatalogueError(Exception exception);

    public abstract void onCatalogueSuccess(Catalogue catalogue);
}
