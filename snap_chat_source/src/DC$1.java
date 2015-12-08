// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class nit> extends Dz
{

    private a a;
    private DC b;

    protected final void onPostExecute(Object obj)
    {
        obj = (DD)obj;
        super.onPostExecute(obj);
        b.b = null;
        a.a(((DD) (obj)));
    }

    >(DC dc, sR sr, t t)
    {
        b = dc;
        a = t;
        super(sr);
    }
}
