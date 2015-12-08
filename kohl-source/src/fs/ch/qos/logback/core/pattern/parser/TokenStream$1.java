// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.pattern.parser;


// Referenced classes of package fs.ch.qos.logback.core.pattern.parser:
//            TokenStream

static class kenizerState
{

    static final int $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[];

    static 
    {
        $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState = new int[kenizerState.values().length];
        try
        {
            $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[kenizerState.LITERAL_STATE.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        try
        {
            $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[kenizerState.FORMAT_MODIFIER_STATE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[kenizerState.OPTION_STATE.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[kenizerState.KEYWORD_STATE.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$ch$qos$logback$core$pattern$parser$TokenStream$TokenizerState[kenizerState.RIGHT_PARENTHESIS_STATE.ordinal()] = 5;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
