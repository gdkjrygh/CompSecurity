// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.joran.action;

import fs.ch.qos.logback.core.Context;
import fs.ch.qos.logback.core.joran.spi.InterpretationContext;
import fs.ch.qos.logback.core.util.ContextUtil;
import fs.ch.qos.logback.core.util.OptionHelper;
import java.util.Properties;

public class ActionUtil
{
    public static final class Scope extends Enum
    {

        private static final Scope $VALUES[];
        public static final Scope CONTEXT;
        public static final Scope LOCAL;
        public static final Scope SYSTEM;

        public static Scope valueOf(String s)
        {
            return (Scope)Enum.valueOf(fs/ch/qos/logback/core/joran/action/ActionUtil$Scope, s);
        }

        public static Scope[] values()
        {
            return (Scope[])$VALUES.clone();
        }

        static 
        {
            LOCAL = new Scope("LOCAL", 0);
            CONTEXT = new Scope("CONTEXT", 1);
            SYSTEM = new Scope("SYSTEM", 2);
            $VALUES = (new Scope[] {
                LOCAL, CONTEXT, SYSTEM
            });
        }

        private Scope(String s, int i)
        {
            super(s, i);
        }
    }


    public static void setProperties(InterpretationContext interpretationcontext, Properties properties, Scope scope)
    {
        static class _cls1
        {

            static final int $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[];

            static 
            {
                $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope = new int[Scope.values().length];
                try
                {
                    $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[Scope.LOCAL.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[Scope.CONTEXT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$ch$qos$logback$core$joran$action$ActionUtil$Scope[Scope.SYSTEM.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.ch.qos.logback.core.joran.action.ActionUtil.Scope[scope.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            interpretationcontext.addSubstitutionProperties(properties);
            return;

        case 2: // '\002'
            (new ContextUtil(interpretationcontext.getContext())).addProperties(properties);
            return;

        case 3: // '\003'
            OptionHelper.setSystemProperties(interpretationcontext, properties);
            break;
        }
    }

    public static void setProperty(InterpretationContext interpretationcontext, String s, String s1, Scope scope)
    {
        switch (_cls1..SwitchMap.ch.qos.logback.core.joran.action.ActionUtil.Scope[scope.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            interpretationcontext.addSubstitutionProperty(s, s1);
            return;

        case 2: // '\002'
            interpretationcontext.getContext().putProperty(s, s1);
            return;

        case 3: // '\003'
            OptionHelper.setSystemProperty(interpretationcontext, s, s1);
            break;
        }
    }

    public static Scope stringToScope(String s)
    {
        if (Scope.SYSTEM.toString().equalsIgnoreCase(s))
        {
            return Scope.SYSTEM;
        }
        if (Scope.CONTEXT.toString().equalsIgnoreCase(s))
        {
            return Scope.CONTEXT;
        } else
        {
            return Scope.LOCAL;
        }
    }
}
