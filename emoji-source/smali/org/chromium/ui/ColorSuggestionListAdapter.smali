.class public Lorg/chromium/ui/ColorSuggestionListAdapter;
.super Landroid/widget/BaseAdapter;
.source "ColorSuggestionListAdapter.java"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/chromium/ui/ColorSuggestionListAdapter$OnColorSuggestionClickListener;
    }
.end annotation


# static fields
.field private static final COLORS_PER_ROW:I = 0x4


# instance fields
.field private mContext:Landroid/content/Context;

.field private mListener:Lorg/chromium/ui/ColorSuggestionListAdapter$OnColorSuggestionClickListener;

.field private mSuggestions:[Lorg/chromium/ui/ColorSuggestion;


# direct methods
.method constructor <init>(Landroid/content/Context;[Lorg/chromium/ui/ColorSuggestion;)V
    .locals 0
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "suggestions"    # [Lorg/chromium/ui/ColorSuggestion;

    .prologue
    .line 43
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 44
    iput-object p1, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mContext:Landroid/content/Context;

    .line 45
    iput-object p2, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mSuggestions:[Lorg/chromium/ui/ColorSuggestion;

    .line 46
    return-void
.end method

.method private setUpColorButton(Landroid/view/View;I)V
    .locals 9
    .param p1, "button"    # Landroid/view/View;
    .param p2, "index"    # I

    .prologue
    const/4 v5, 0x0

    const/4 v8, 0x0

    .line 62
    iget-object v4, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mSuggestions:[Lorg/chromium/ui/ColorSuggestion;

    array-length v4, v4

    if-lt p2, v4, :cond_0

    .line 63
    invoke-virtual {p1, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 64
    invoke-virtual {p1, v5}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 65
    const/4 v4, 0x4

    invoke-virtual {p1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 81
    :goto_0
    return-void

    .line 68
    :cond_0
    iget-object v4, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mSuggestions:[Lorg/chromium/ui/ColorSuggestion;

    aget-object v4, v4, p2

    invoke-virtual {p1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 69
    invoke-virtual {p1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 70
    iget-object v4, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mSuggestions:[Lorg/chromium/ui/ColorSuggestion;

    aget-object v2, v4, p2

    .line 71
    .local v2, "suggestion":Lorg/chromium/ui/ColorSuggestion;
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    check-cast v1, Landroid/graphics/drawable/LayerDrawable;

    .line 72
    .local v1, "layers":Landroid/graphics/drawable/LayerDrawable;
    sget v4, Lorg/chromium/ui/R$id;->color_button_swatch:I

    invoke-virtual {v1, v4}, Landroid/graphics/drawable/LayerDrawable;->findDrawableByLayerId(I)Landroid/graphics/drawable/Drawable;

    move-result-object v3

    check-cast v3, Landroid/graphics/drawable/GradientDrawable;

    .line 74
    .local v3, "swatch":Landroid/graphics/drawable/GradientDrawable;
    iget v4, v2, Lorg/chromium/ui/ColorSuggestion;->mColor:I

    invoke-virtual {v3, v4}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 75
    iget-object v0, v2, Lorg/chromium/ui/ColorSuggestion;->mLabel:Ljava/lang/String;

    .line 76
    .local v0, "description":Ljava/lang/String;
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    .line 77
    const-string v4, "#%06X"

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const v6, 0xffffff

    iget v7, v2, Lorg/chromium/ui/ColorSuggestion;->mColor:I

    and-int/2addr v6, v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    aput-object v6, v5, v8

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 79
    :cond_1
    invoke-virtual {p1, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 80
    invoke-virtual {p1, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_0
.end method


# virtual methods
.method public getCount()I
    .locals 1

    .prologue
    .line 140
    iget-object v0, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mSuggestions:[Lorg/chromium/ui/ColorSuggestion;

    array-length v0, v0

    add-int/lit8 v0, v0, 0x4

    add-int/lit8 v0, v0, -0x1

    div-int/lit8 v0, v0, 0x4

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1
    .param p1, "position"    # I

    .prologue
    .line 135
    const/4 v0, 0x0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2
    .param p1, "position"    # I

    .prologue
    .line 130
    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10
    .param p1, "position"    # I
    .param p2, "convertView"    # Landroid/view/View;
    .param p3, "parent"    # Landroid/view/ViewGroup;

    .prologue
    const/4 v9, 0x4

    const/4 v8, 0x0

    const/4 v7, -0x1

    .line 98
    if-eqz p2, :cond_1

    instance-of v5, p2, Landroid/widget/LinearLayout;

    if-eqz v5, :cond_1

    move-object v3, p2

    .line 99
    check-cast v3, Landroid/widget/LinearLayout;

    .line 122
    .local v3, "layout":Landroid/widget/LinearLayout;
    :cond_0
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    if-ge v2, v9, :cond_3

    .line 123
    invoke-virtual {v3, v2}, Landroid/widget/LinearLayout;->getChildAt(I)Landroid/view/View;

    move-result-object v5

    mul-int/lit8 v6, p1, 0x4

    add-int/2addr v6, v2

    invoke-direct {p0, v5, v6}, Lorg/chromium/ui/ColorSuggestionListAdapter;->setUpColorButton(Landroid/view/View;I)V

    .line 122
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 101
    .end local v2    # "i":I
    .end local v3    # "layout":Landroid/widget/LinearLayout;
    :cond_1
    new-instance v3, Landroid/widget/LinearLayout;

    iget-object v5, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mContext:Landroid/content/Context;

    invoke-direct {v3, v5}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 102
    .restart local v3    # "layout":Landroid/widget/LinearLayout;
    new-instance v5, Landroid/widget/AbsListView$LayoutParams;

    const/4 v6, -0x2

    invoke-direct {v5, v7, v6}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 105
    invoke-virtual {v3, v8}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 106
    invoke-virtual {v3, v7}, Landroid/widget/LinearLayout;->setBackgroundColor(I)V

    .line 107
    iget-object v5, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mContext:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, Lorg/chromium/ui/R$dimen;->color_button_height:I

    invoke-virtual {v5, v6}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v1

    .line 109
    .local v1, "buttonHeight":I
    const/4 v2, 0x0

    .restart local v2    # "i":I
    :goto_1
    if-ge v2, v9, :cond_0

    .line 110
    new-instance v0, Landroid/view/View;

    iget-object v5, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mContext:Landroid/content/Context;

    invoke-direct {v0, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    .line 111
    .local v0, "button":Landroid/view/View;
    new-instance v4, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-direct {v4, v8, v1, v5}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 113
    .local v4, "layoutParams":Landroid/widget/LinearLayout$LayoutParams;
    invoke-static {v4, v7}, Lorg/chromium/base/ApiCompatibilityUtils;->setMarginStart(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 114
    const/4 v5, 0x3

    if-ne v2, v5, :cond_2

    .line 115
    invoke-static {v4, v7}, Lorg/chromium/base/ApiCompatibilityUtils;->setMarginEnd(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 117
    :cond_2
    invoke-virtual {v0, v4}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 118
    sget v5, Lorg/chromium/ui/R$drawable;->color_button_background:I

    invoke-virtual {v0, v5}, Landroid/view/View;->setBackgroundResource(I)V

    .line 119
    invoke-virtual {v3, v0}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 109
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 125
    .end local v0    # "button":Landroid/view/View;
    .end local v1    # "buttonHeight":I
    .end local v4    # "layoutParams":Landroid/widget/LinearLayout$LayoutParams;
    :cond_3
    return-object v3
.end method

.method public onClick(Landroid/view/View;)V
    .locals 2
    .param p1, "v"    # Landroid/view/View;

    .prologue
    .line 85
    iget-object v1, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mListener:Lorg/chromium/ui/ColorSuggestionListAdapter$OnColorSuggestionClickListener;

    if-nez v1, :cond_1

    .line 93
    :cond_0
    :goto_0
    return-void

    .line 88
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/chromium/ui/ColorSuggestion;

    .line 89
    .local v0, "suggestion":Lorg/chromium/ui/ColorSuggestion;
    if-eqz v0, :cond_0

    .line 92
    iget-object v1, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mListener:Lorg/chromium/ui/ColorSuggestionListAdapter$OnColorSuggestionClickListener;

    invoke-interface {v1, v0}, Lorg/chromium/ui/ColorSuggestionListAdapter$OnColorSuggestionClickListener;->onColorSuggestionClick(Lorg/chromium/ui/ColorSuggestion;)V

    goto :goto_0
.end method

.method public setOnColorSuggestionClickListener(Lorg/chromium/ui/ColorSuggestionListAdapter$OnColorSuggestionClickListener;)V
    .locals 0
    .param p1, "listener"    # Lorg/chromium/ui/ColorSuggestionListAdapter$OnColorSuggestionClickListener;

    .prologue
    .line 52
    iput-object p1, p0, Lorg/chromium/ui/ColorSuggestionListAdapter;->mListener:Lorg/chromium/ui/ColorSuggestionListAdapter$OnColorSuggestionClickListener;

    .line 53
    return-void
.end method
