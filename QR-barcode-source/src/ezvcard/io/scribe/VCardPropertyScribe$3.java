// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.io.scribe;


// Referenced classes of package ezvcard.io.scribe:
//            VCardPropertyScribe

static final class 
    implements ezvcard.util.ck
{

    public volatile void handle(StringBuilder stringbuilder, Object obj)
    {
        handle(stringbuilder, (String)obj);
    }

    public void handle(StringBuilder stringbuilder, String s)
    {
        stringbuilder.append('<').append(s).append('>');
    }

    ()
    {
    }
}
