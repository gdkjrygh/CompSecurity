.class public Lorg/chromium/ui/ColorPickerSimple;
.super Landroid/widget/ListView;
.source "ColorPickerSimple.java"

# interfaces
.implements Lorg/chromium/ui/ColorSuggestionListAdapter$OnColorSuggestionClickListener;


# static fields
.field private static final DEFAULT_COLORS:[I

.field private static final DEFAULT_COLOR_LABEL_IDS:[I


# instance fields
.field private mOnColorChangedListener:Lorg/chromium/ui/OnColorChangedListener;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    const/16 v1, 0x8

    .line 22
    new-array v0, v1, [I

    fill-array-data v0, :array_0

    sput-object v0, Lorg/chromium/ui/ColorPickerSimple;->DEFAULT_COLORS:[I

    .line 33
    new-array v0, v1, [I

    const/4 v1, 0x0

    sget v2, Lorg/chromium/ui/R$string;->color_picker_button_red:I

    aput v2, v0, v1

    const/4 v1, 0x1

    sget v2, Lorg/chromium/ui/R$string;->color_picker_button_cyan:I

    aput v2, v0, v1

    const/4 v1, 0x2

    sget v2, Lorg/chromium/ui/R$string;->color_picker_button_blue:I

    aput v2, v0, v1

    const/4 v1, 0x3

    sget v2, Lorg/chromium/ui/R$string;->color_picker_button_green:I

    aput v2, v0, v1

    const/4 v1, 0x4

    sget v2, Lorg/chromium/ui/R$string;->color_picker_button_magenta:I

    aput v2, v0, v1

    const/4 v1, 0x5

    sget v2, Lorg/chromium/ui/R$string;->color_picker_button_yellow:I

    aput v2, v0, v1

    const/4 v1, 0x6

    sget v2, Lorg/chromium/ui/R$string;->color_picker_button_black:I

    aput v2, v0, v1

    const/4 v1, 0x7

    sget v2, Lorg/chromium/ui/R$string;->color_picker_button_white:I

    aput v2, v0, v1

    sput-object v0, Lorg/chromium/ui/ColorPickerSimple;->DEFAULT_COLOR_LABEL_IDS:[I

    return-void

    .line 22
    :array_0
    .array-data 4
        -0x10000
        -0xff0001
        -0xffff01
        -0xff0100
        -0xff01
        -0x100
        -0x1000000
        -0x1
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 45
    invoke-direct {p0, p1}, Landroid/widget/ListView;-><init>(Landroid/content/Context;)V

    .line 46
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    .line 49
    invoke-direct {p0, p1, p2}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 50
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;
    .param p3, "defStyle"    # I

    .prologue
    .line 53
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/ListView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 54
    return-void
.end method


# virtual methods
.method public init([Lorg/chromium/ui/ColorSuggestion;Lorg/chromium/ui/OnColorChangedListener;)V
    .locals 6
    .param p1, "suggestions"    # [Lorg/chromium/ui/ColorSuggestion;
    .param p2, "onColorChangedListener"    # Lorg/chromium/ui/OnColorChangedListener;

    .prologue
    .line 66
    iput-object p2, p0, Lorg/chromium/ui/ColorPickerSimple;->mOnColorChangedListener:Lorg/chromium/ui/OnColorChangedListener;

    .line 68
    if-nez p1, :cond_0

    .line 69
    sget-object v2, Lorg/chromium/ui/ColorPickerSimple;->DEFAULT_COLORS:[I

    array-length v2, v2

    new-array p1, v2, [Lorg/chromium/ui/ColorSuggestion;

    .line 70
    const/4 v1, 0x0

    .local v1, "i":I
    :goto_0
    array-length v2, p1

    if-ge v1, v2, :cond_0

    .line 71
    new-instance v2, Lorg/chromium/ui/ColorSuggestion;

    sget-object v3, Lorg/chromium/ui/ColorPickerSimple;->DEFAULT_COLORS:[I

    aget v3, v3, v1

    invoke-virtual {p0}, Lorg/chromium/ui/ColorPickerSimple;->getContext()Landroid/content/Context;

    move-result-object v4

    sget-object v5, Lorg/chromium/ui/ColorPickerSimple;->DEFAULT_COLOR_LABEL_IDS:[I

    aget v5, v5, v1

    invoke-virtual {v4, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v4

    invoke-direct {v2, v3, v4}, Lorg/chromium/ui/ColorSuggestion;-><init>(ILjava/lang/String;)V

    aput-object v2, p1, v1

    .line 70
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 76
    .end local v1    # "i":I
    :cond_0
    new-instance v0, Lorg/chromium/ui/ColorSuggestionListAdapter;

    invoke-virtual {p0}, Lorg/chromium/ui/ColorPickerSimple;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, p1}, Lorg/chromium/ui/ColorSuggestionListAdapter;-><init>(Landroid/content/Context;[Lorg/chromium/ui/ColorSuggestion;)V

    .line 78
    .local v0, "adapter":Lorg/chromium/ui/ColorSuggestionListAdapter;
    invoke-virtual {v0, p0}, Lorg/chromium/ui/ColorSuggestionListAdapter;->setOnColorSuggestionClickListener(Lorg/chromium/ui/ColorSuggestionListAdapter$OnColorSuggestionClickListener;)V

    .line 79
    invoke-virtual {p0, v0}, Lorg/chromium/ui/ColorPickerSimple;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 80
    return-void
.end method

.method public onColorSuggestionClick(Lorg/chromium/ui/ColorSuggestion;)V
    .locals 2
    .param p1, "suggestion"    # Lorg/chromium/ui/ColorSuggestion;

    .prologue
    .line 84
    iget-object v0, p0, Lorg/chromium/ui/ColorPickerSimple;->mOnColorChangedListener:Lorg/chromium/ui/OnColorChangedListener;

    iget v1, p1, Lorg/chromium/ui/ColorSuggestion;->mColor:I

    invoke-interface {v0, v1}, Lorg/chromium/ui/OnColorChangedListener;->onColorChanged(I)V

    .line 85
    return-void
.end method
