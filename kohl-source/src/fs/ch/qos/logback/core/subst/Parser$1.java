// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.subst;


// Referenced classes of package fs.ch.qos.logback.core.subst:
//            Parser

static class e
{

    static final int $SwitchMap$ch$qos$logback$core$subst$Token$Type[];

    static 
    {
        $SwitchMap$ch$qos$logback$core$subst$Token$Type = new int[e.values().length];
        try
        {
            $SwitchMap$ch$qos$logback$core$subst$Token$Type[e.LITERAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$ch$qos$logback$core$subst$Token$Type[e.CURLY_LEFT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$ch$qos$logback$core$subst$Token$Type[e.START.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
