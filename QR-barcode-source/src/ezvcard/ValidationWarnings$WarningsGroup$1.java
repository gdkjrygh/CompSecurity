// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard;


// Referenced classes of package ezvcard:
//            ValidationWarnings

class val.prefix
    implements ezvcard.util.refix
{

    final val.prefix this$0;
    final String val$prefix;

    public volatile void handle(StringBuilder stringbuilder, Object obj)
    {
        handle(stringbuilder, (String)obj);
    }

    public void handle(StringBuilder stringbuilder, String s)
    {
        stringbuilder.append(val$prefix).append(s);
    }

    ()
    {
        this$0 = final_;
        val$prefix = String.this;
        super();
    }
}
