// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.parser;


// Referenced classes of package com.google.wallet.wobl.parser:
//            WoblParser, AbstractAttributeParser, TextLineStyleAttributeParser, TextStyleAttributeParser, 
//            BoxStyleAttributeParser, PaddingAttributeParser, TapTargetAttributeParser, ZDepthAttributeParser, 
//            AlphaAttributeParser

abstract class AttributeParserType extends Enum
{

    private static final AttributeParserType $VALUES[];
    public static final AttributeParserType ALPHA;
    public static final AttributeParserType BOX_STYLED;
    public static final AttributeParserType MULTI_LINE_TEXT_STYLED;
    public static final AttributeParserType PADDING;
    public static final AttributeParserType TAP_TARGET;
    public static final AttributeParserType TEXT_STYLED;
    public static final AttributeParserType Z_DEPTH;

    private AttributeParserType(String s, int i)
    {
        super(s, i);
    }


    public static AttributeParserType valueOf(String s)
    {
        return (AttributeParserType)Enum.valueOf(com/google/wallet/wobl/parser/AttributeParserType, s);
    }

    public static AttributeParserType[] values()
    {
        return (AttributeParserType[])$VALUES.clone();
    }

    public abstract AbstractAttributeParser get(WoblParser woblparser);

    static 
    {
        MULTI_LINE_TEXT_STYLED = new AttributeParserType("MULTI_LINE_TEXT_STYLED", 0) {

            public final AbstractAttributeParser get(WoblParser woblparser)
            {
                return new TextLineStyleAttributeParser(woblparser);
            }

        };
        TEXT_STYLED = new AttributeParserType("TEXT_STYLED", 1) {

            public final AbstractAttributeParser get(WoblParser woblparser)
            {
                return new TextStyleAttributeParser(woblparser);
            }

        };
        BOX_STYLED = new AttributeParserType("BOX_STYLED", 2) {

            public final AbstractAttributeParser get(WoblParser woblparser)
            {
                return new BoxStyleAttributeParser(woblparser);
            }

        };
        PADDING = new AttributeParserType("PADDING", 3) {

            public final AbstractAttributeParser get(WoblParser woblparser)
            {
                return new PaddingAttributeParser(woblparser);
            }

        };
        TAP_TARGET = new AttributeParserType("TAP_TARGET", 4) {

            public final AbstractAttributeParser get(WoblParser woblparser)
            {
                return new TapTargetAttributeParser(woblparser);
            }

        };
        Z_DEPTH = new AttributeParserType("Z_DEPTH", 5) {

            public final AbstractAttributeParser get(WoblParser woblparser)
            {
                return new ZDepthAttributeParser(woblparser);
            }

        };
        ALPHA = new AttributeParserType("ALPHA", 6) {

            public final AbstractAttributeParser get(WoblParser woblparser)
            {
                return new AlphaAttributeParser(woblparser);
            }

        };
        $VALUES = (new AttributeParserType[] {
            MULTI_LINE_TEXT_STYLED, TEXT_STYLED, BOX_STYLED, PADDING, TAP_TARGET, Z_DEPTH, ALPHA
        });
    }
}
