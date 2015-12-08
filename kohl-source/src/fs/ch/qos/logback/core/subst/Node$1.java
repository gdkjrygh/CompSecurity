// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.subst;


// Referenced classes of package fs.ch.qos.logback.core.subst:
//            Node

static class pe
{

    static final int $SwitchMap$ch$qos$logback$core$subst$Node$Type[];

    static 
    {
        $SwitchMap$ch$qos$logback$core$subst$Node$Type = new int[pe.values().length];
        try
        {
            $SwitchMap$ch$qos$logback$core$subst$Node$Type[pe.LITERAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$ch$qos$logback$core$subst$Node$Type[pe.VARIABLE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
