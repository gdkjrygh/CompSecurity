// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.common;


public final class W
{
    public static class Action
    {

        public static final String ICON = "icon";

        public Action()
        {
        }
    }

    public static final class Action.Icon
    {

        public static final String CHECKMARK = "checkmark";
        public static final String LINK = "link";
        public static final String MAIL = "mail";
        public static final String MAP = "map";
        public static final String NAVIGATION = "navigation";
        public static final String NONE = "none";
        public static final String PHONE = "phone";
        public static final String RECEIPT = "receipt";

        public Action.Icon()
        {
        }
    }

    public static final class Barcode
    {

        public static final String CODE = "code";
        public static final String READABLE_CODE = "readable-code";
        public static final String TYPE = "type";

        public Barcode()
        {
        }
    }

    public static class Barcode.BarcodeFormats
    {

        public static final String AZTEC = "aztec";
        public static final String CODABAR = "codabar";
        public static final String CODE_128 = "code_128";
        public static final String CODE_39 = "code_39";
        public static final String DATA_MATRIX = "data_matrix";
        public static final String EAN_13 = "ean_13";
        public static final String EAN_8 = "ean_8";
        public static final String ITF = "itf";
        public static final String PDF_417 = "pdf_417";
        public static final String PDF_417_COMPACT = "pdf_417_compact";
        public static final String QR_CODE = "qr_code";
        public static final String UPC_A = "upc_a";

        public Barcode.BarcodeFormats()
        {
        }
    }

    public static final class ColumnLayout
    {

        public static final String COLUMN_WIDTHS = "column-widths";
        public static final String NUM_COLUMNS = "num-columns";

        public ColumnLayout()
        {
        }
    }

    public static class ColumnLayoutSharedAttributes extends SharedAttributes
    {

        public static final String COLUMN = "column";
        public static final int COLUMN_DEFAULT = 0;
        public static final String COLUMN_SPAN = "column-span";
        public static final int COLUMN_SPAN_DEFAULT = 1;
        public static final String ROW = "row";
        public static final int ROW_DEFAULT = 0;
        public static final String ROW_SPAN = "row-span";
        public static final int ROW_SPAN_DEFAULT = 1;

        public ColumnLayoutSharedAttributes()
        {
        }
    }

    public static final class ColumnLayoutSharedAttributes.Units
    {

        public static final String DP = "dp";
        public static final String IN = "in";
        public static final String MM = "mm";
        public static final String PT = "pt";
        public static final String SP = "sp";
        public static final String WEIGHT = "wt";

        public ColumnLayoutSharedAttributes.Units()
        {
        }
    }

    public static final class Date
    {

        public static final String FORMAT = "format";
        public static final String REFERENCE = "reference";
        public static final String TEMPLATE = "template";
        public static final String TIME_PERIODS = "time-periods";
        public static final String TIME_ZONE = "time-zone";

        public Date()
        {
        }
    }

    public static final class Date.Reference
    {

        public static final String ABSOLUTE = "absolute";
        public static final String RELATIVE = "relative";

        public Date.Reference()
        {
        }
    }

    public static final class Date.Template
    {

        public static final String ABSOLUTE = "absolute";
        public static final String APPROXIMATE = "approximate";
        public static final String RELATIVE = "relative";

        public Date.Template()
        {
        }
    }

    public static final class Date.TimePeriods
    {

        public static final String SAME_DAY = "same-day";
        public static final String SAME_YEAR = "same-year";
        public static final String TOMORROW = "tomorrow";
        public static final String YESTERDAY = "yesterday";

        public Date.TimePeriods()
        {
        }
    }

    public static final class Image
    {

        public static final String ALT_TEXT = "alt-text";
        public static final String ASPECT = "aspect";
        public static final String SOURCE = "source";

        public Image()
        {
        }
    }

    public static final class Item
    {

        public static final String NAME = "name";

        public Item()
        {
        }
    }

    public static final class Layout
    {

        public static final String ID = "id";
        public static final String LANG = "lang";
        public static final String XMLNS = "xmlns";

        public Layout()
        {
        }
    }

    public static final class Line
    {

        public static final String COLOR = "color";
        public static final String LENGTH = "length";
        public static final String ORIENTATION = "orientation";
        public static final String THICKNESS = "thickness";

        public Line()
        {
        }
    }

    public static class Line.Orientations
    {

        public static final String HORIZONTAL = "horizontal";
        public static final String VERTICAL = "vertical";

        public Line.Orientations()
        {
        }
    }

    public static class SharedAttributes
    {

        public static final String ALPHA = "alpha";
        static final String ALT_TEXT = "alt-text";
        public static final String BACKGROUND_COLOR = "background-color";
        public static final String CLASS = "class";
        public static final String HORIZONTAL_ALIGN = "horizontal-align";
        public static final String MARGIN = "margin";
        public static final String MARGIN_BOTTOM = "margin-bottom";
        public static final String MARGIN_LEFT = "margin-left";
        public static final String MARGIN_RIGHT = "margin-right";
        public static final String MARGIN_TOP = "margin-top";
        public static final String PADDING = "padding";
        public static final String PADDING_BOTTOM = "padding-bottom";
        public static final String PADDING_LEFT = "padding-left";
        public static final String PADDING_RIGHT = "padding-right";
        public static final String PADDING_TOP = "padding-top";
        public static final String VERTICAL_ALIGN = "vertical-align";
        public static final String Z_DEPTH = "z-depth";

        public SharedAttributes()
        {
        }
    }

    public static final class SharedAttributes.HorizontalAlign
    {

        public static final String CENTER = "center";
        public static final String END = "end";
        public static final String LEFT = "left";
        public static final String RIGHT = "right";
        public static final String START = "start";

        public SharedAttributes.HorizontalAlign()
        {
        }
    }

    public static final class SharedAttributes.VerticalAlign
    {

        public static final String BOTTOM = "bottom";
        public static final String CENTER = "center";
        public static final String TOP = "top";

        public SharedAttributes.VerticalAlign()
        {
        }
    }

    public static final class Spinner
    {

        public static final String ALT_TEXT = "alt-text";

        public Spinner()
        {
        }
    }

    public static final class Style
    {

        public static final String CLASS = "class";

        public Style()
        {
        }
    }

    public static final class TapTargetSharedAttributes
    {

        public static final String TAP_URI = "tap-uri";

        public TapTargetSharedAttributes()
        {
        }
    }

    public static class TextSharedAttributes
    {

        public static final String FONT_ALPHA = "font-alpha";
        public static final String FONT_COLOR = "font-color";
        public static final String FONT_FAMILY = "font-family";
        public static final String FONT_SIZE = "font-size";
        public static final String FONT_STYLE = "font-style";
        public static final String FONT_WEIGHT = "font-weight";
        public static final String LINE_HEIGHT = "line-height";
        public static final String MAX_LINES = "max-lines";
        public static final String TEXT_ALIGN = "text-align";
        public static final String TEXT_OVERFLOW = "text-overflow";
        public static final String TEXT_TRANSFORM = "text-transform";

        public TextSharedAttributes()
        {
        }
    }

    public static final class TextSharedAttributes.Options
    {

        public static final String FONT_FAMILY_MONOSPACE = "monospace";
        public static final String FONT_FAMILY_NORMAL = "normal";
        public static final String FONT_FAMILY_SANS_SERIF = "sans-serif";
        public static final String FONT_FAMILY_SERIF = "serif";
        public static final String FONT_STYLE_ITALIC = "italic";
        public static final String FONT_STYLE_NORMAL = "normal";
        public static final String FONT_WEIGHT_BOLD = "bold";
        public static final String FONT_WEIGHT_LIGHT = "light";
        public static final String FONT_WEIGHT_NORMAL = "normal";
        public static final String TEXT_OVERFLOW_CLIP = "clip";
        public static final String TEXT_OVERFLOW_ELLIPSIS = "ellipsis";
        public static final String TEXT_TRANSFORM_CAPITALIZE = "capitalize";
        public static final String TEXT_TRANSFORM_LOWERCASE = "lowercase";
        public static final String TEXT_TRANSFORM_NONE = "none";
        public static final String TEXT_TRANSFORM_UPPERCASE = "uppercase";

        public TextSharedAttributes.Options()
        {
        }
    }


    public static final String ACTION = "action";
    public static final String BARCODE = "barcode";
    public static final String COLUMN_LAYOUT = "column-layout";
    public static final String DATE = "date";
    public static final String FIELD = "field";
    public static final String FIELD_NAME = "field-name";
    public static final String FIELD_VALUE = "field-value";
    public static final String HEAD = "head";
    public static final String IMAGE = "image";
    public static final String INLINE_LINK = "inline-link";
    public static final String ITEM = "item";
    public static final String LAYOUT = "layout";
    public static final String LINE = "line";
    public static final String SPINNER = "spinner";
    public static final String STYLE = "style";
    public static final String STYLESHEET = "stylesheet";
    public static final String TEXT = "text";

    private W()
    {
    }
}
