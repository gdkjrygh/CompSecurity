.class public Lcom/google/maps/android/ui/IconGenerator;
.super Ljava/lang/Object;
.source "IconGenerator.java"


# static fields
.field public static final STYLE_BLUE:I = 0x4

.field public static final STYLE_DEFAULT:I = 0x1

.field public static final STYLE_GREEN:I = 0x5

.field public static final STYLE_ORANGE:I = 0x7

.field public static final STYLE_PURPLE:I = 0x6

.field public static final STYLE_RED:I = 0x3

.field public static final STYLE_WHITE:I = 0x2


# instance fields
.field private mAnchorU:F

.field private mAnchorV:F

.field private mBackground:Lcom/google/maps/android/ui/BubbleDrawable;

.field private mContainer:Landroid/view/ViewGroup;

.field private mContentView:Landroid/view/View;

.field private final mContext:Landroid/content/Context;

.field private mRotation:I

.field private mRotationLayout:Lcom/google/maps/android/ui/RotationLayout;

.field private mTextView:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 3
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    .line 58
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    const/high16 v0, 0x3f000000    # 0.5f

    iput v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mAnchorU:F

    .line 52
    const/high16 v0, 0x3f800000    # 1.0f

    iput v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mAnchorV:F

    .line 59
    iput-object p1, p0, Lcom/google/maps/android/ui/IconGenerator;->mContext:Landroid/content/Context;

    .line 60
    new-instance v0, Lcom/google/maps/android/ui/BubbleDrawable;

    iget-object v1, p0, Lcom/google/maps/android/ui/IconGenerator;->mContext:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/google/maps/android/ui/BubbleDrawable;-><init>(Landroid/content/res/Resources;)V

    iput-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mBackground:Lcom/google/maps/android/ui/BubbleDrawable;

    .line 61
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mContext:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lcom/google/maps/android/R$layout;->text_bubble:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    .line 62
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/maps/android/ui/RotationLayout;

    iput-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotationLayout:Lcom/google/maps/android/ui/RotationLayout;

    .line 63
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotationLayout:Lcom/google/maps/android/ui/RotationLayout;

    sget v1, Lcom/google/maps/android/R$id;->text:I

    invoke-virtual {v0, v1}, Lcom/google/maps/android/ui/RotationLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mTextView:Landroid/widget/TextView;

    iput-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mContentView:Landroid/view/View;

    .line 64
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/google/maps/android/ui/IconGenerator;->setStyle(I)V

    .line 65
    return-void
.end method

.method private static getStyleColor(I)I
    .locals 1
    .param p0, "style"    # I

    .prologue
    .line 267
    packed-switch p0, :pswitch_data_0

    .line 271
    const/4 v0, -0x1

    .line 281
    :goto_0
    return v0

    .line 273
    :pswitch_0
    const/high16 v0, -0x340000

    goto :goto_0

    .line 275
    :pswitch_1
    const v0, -0xff6634

    goto :goto_0

    .line 277
    :pswitch_2
    const v0, -0x996700

    goto :goto_0

    .line 279
    :pswitch_3
    const v0, -0x66cc34

    goto :goto_0

    .line 281
    :pswitch_4
    const/16 v0, -0x7800

    goto :goto_0

    .line 267
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method private static getTextStyle(I)I
    .locals 1
    .param p0, "style"    # I

    .prologue
    .line 286
    packed-switch p0, :pswitch_data_0

    .line 290
    sget v0, Lcom/google/maps/android/R$style;->Bubble_TextAppearance_Dark:I

    .line 296
    :goto_0
    return v0

    :pswitch_0
    sget v0, Lcom/google/maps/android/R$style;->Bubble_TextAppearance_Light:I

    goto :goto_0

    .line 286
    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method private rotateAnchor(FF)F
    .locals 2
    .param p1, "u"    # F
    .param p2, "v"    # F

    .prologue
    const/high16 v1, 0x3f800000    # 1.0f

    .line 171
    iget v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotation:I

    packed-switch v0, :pswitch_data_0

    .line 181
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 175
    :pswitch_0
    sub-float p1, v1, p2

    .line 179
    .end local p1    # "u":F
    :goto_0
    :pswitch_1
    return p1

    .line 177
    .restart local p1    # "u":F
    :pswitch_2
    sub-float p1, v1, p1

    goto :goto_0

    :pswitch_3
    move p1, p2

    .line 179
    goto :goto_0

    .line 171
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method


# virtual methods
.method public getAnchorU()F
    .locals 2

    .prologue
    .line 157
    iget v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mAnchorU:F

    iget v1, p0, Lcom/google/maps/android/ui/IconGenerator;->mAnchorV:F

    invoke-direct {p0, v0, v1}, Lcom/google/maps/android/ui/IconGenerator;->rotateAnchor(FF)F

    move-result v0

    return v0
.end method

.method public getAnchorV()F
    .locals 2

    .prologue
    .line 164
    iget v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mAnchorV:F

    iget v1, p0, Lcom/google/maps/android/ui/IconGenerator;->mAnchorU:F

    invoke-direct {p0, v0, v1}, Lcom/google/maps/android/ui/IconGenerator;->rotateAnchor(FF)F

    move-result v0

    return v0
.end method

.method public makeIcon()Landroid/graphics/Bitmap;
    .locals 10

    .prologue
    const/4 v9, 0x1

    const/4 v8, 0x0

    const/4 v7, 0x0

    .line 87
    invoke-static {v7, v7}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v1

    .line 88
    .local v1, "measureSpec":I
    iget-object v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5, v1, v1}, Landroid/view/ViewGroup;->measure(II)V

    .line 90
    iget-object v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v3

    .line 91
    .local v3, "measuredWidth":I
    iget-object v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v2

    .line 93
    .local v2, "measuredHeight":I
    iget-object v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5, v7, v7, v3, v2}, Landroid/view/ViewGroup;->layout(IIII)V

    .line 95
    iget v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotation:I

    if-eq v5, v9, :cond_0

    iget v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotation:I

    const/4 v6, 0x3

    if-ne v5, v6, :cond_1

    .line 96
    :cond_0
    iget-object v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getMeasuredWidth()I

    move-result v2

    .line 97
    iget-object v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5}, Landroid/view/ViewGroup;->getMeasuredHeight()I

    move-result v3

    .line 100
    :cond_1
    sget-object v5, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v3, v2, v5}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 101
    .local v4, "r":Landroid/graphics/Bitmap;
    invoke-virtual {v4, v7}, Landroid/graphics/Bitmap;->eraseColor(I)V

    .line 103
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v4}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 105
    .local v0, "canvas":Landroid/graphics/Canvas;
    iget v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotation:I

    if-nez v5, :cond_2

    .line 116
    :goto_0
    iget-object v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v5, v0}, Landroid/view/ViewGroup;->draw(Landroid/graphics/Canvas;)V

    .line 117
    return-object v4

    .line 107
    :cond_2
    iget v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotation:I

    if-ne v5, v9, :cond_3

    .line 108
    int-to-float v5, v3

    invoke-virtual {v0, v5, v8}, Landroid/graphics/Canvas;->translate(FF)V

    .line 109
    const/high16 v5, 0x42b40000    # 90.0f

    invoke-virtual {v0, v5}, Landroid/graphics/Canvas;->rotate(F)V

    goto :goto_0

    .line 110
    :cond_3
    iget v5, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotation:I

    const/4 v6, 0x2

    if-ne v5, v6, :cond_4

    .line 111
    const/high16 v5, 0x43340000    # 180.0f

    div-int/lit8 v6, v3, 0x2

    int-to-float v6, v6

    div-int/lit8 v7, v2, 0x2

    int-to-float v7, v7

    invoke-virtual {v0, v5, v6, v7}, Landroid/graphics/Canvas;->rotate(FFF)V

    goto :goto_0

    .line 113
    :cond_4
    int-to-float v5, v2

    invoke-virtual {v0, v8, v5}, Landroid/graphics/Canvas;->translate(FF)V

    .line 114
    const/high16 v5, 0x43870000    # 270.0f

    invoke-virtual {v0, v5}, Landroid/graphics/Canvas;->rotate(F)V

    goto :goto_0
.end method

.method public makeIcon(Ljava/lang/String;)Landroid/graphics/Bitmap;
    .locals 1
    .param p1, "text"    # Ljava/lang/String;

    .prologue
    .line 73
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    :cond_0
    invoke-virtual {p0}, Lcom/google/maps/android/ui/IconGenerator;->makeIcon()Landroid/graphics/Bitmap;

    move-result-object v0

    return-object v0
.end method

.method public setBackground(Landroid/graphics/drawable/Drawable;)V
    .locals 6
    .param p1, "background"    # Landroid/graphics/drawable/Drawable;

    .prologue
    const/4 v2, 0x0

    .line 232
    iget-object v1, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v1, p1}, Landroid/view/ViewGroup;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 236
    if-eqz p1, :cond_0

    .line 237
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    .line 238
    .local v0, "rect":Landroid/graphics/Rect;
    invoke-virtual {p1, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 239
    iget-object v1, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    iget v2, v0, Landroid/graphics/Rect;->left:I

    iget v3, v0, Landroid/graphics/Rect;->top:I

    iget v4, v0, Landroid/graphics/Rect;->right:I

    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/view/ViewGroup;->setPadding(IIII)V

    .line 243
    .end local v0    # "rect":Landroid/graphics/Rect;
    :goto_0
    return-void

    .line 241
    :cond_0
    iget-object v1, p0, Lcom/google/maps/android/ui/IconGenerator;->mContainer:Landroid/view/ViewGroup;

    invoke-virtual {v1, v2, v2, v2, v2}, Landroid/view/ViewGroup;->setPadding(IIII)V

    goto :goto_0
.end method

.method public setColor(I)V
    .locals 1
    .param p1, "color"    # I

    .prologue
    .line 220
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mBackground:Lcom/google/maps/android/ui/BubbleDrawable;

    invoke-virtual {v0, p1}, Lcom/google/maps/android/ui/BubbleDrawable;->setColor(I)V

    .line 221
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mBackground:Lcom/google/maps/android/ui/BubbleDrawable;

    invoke-virtual {p0, v0}, Lcom/google/maps/android/ui/IconGenerator;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 222
    return-void
.end method

.method public setContentPadding(IIII)V
    .locals 1
    .param p1, "left"    # I
    .param p2, "top"    # I
    .param p3, "right"    # I
    .param p4, "bottom"    # I

    .prologue
    .line 255
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mContentView:Landroid/view/View;

    invoke-virtual {v0, p1, p2, p3, p4}, Landroid/view/View;->setPadding(IIII)V

    .line 256
    return-void
.end method

.method public setContentRotation(I)V
    .locals 1
    .param p1, "degrees"    # I

    .prologue
    .line 140
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotationLayout:Lcom/google/maps/android/ui/RotationLayout;

    invoke-virtual {v0, p1}, Lcom/google/maps/android/ui/RotationLayout;->setViewRotation(I)V

    .line 141
    return-void
.end method

.method public setContentView(Landroid/view/View;)V
    .locals 3
    .param p1, "contentView"    # Landroid/view/View;

    .prologue
    .line 127
    iget-object v1, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotationLayout:Lcom/google/maps/android/ui/RotationLayout;

    invoke-virtual {v1}, Lcom/google/maps/android/ui/RotationLayout;->removeAllViews()V

    .line 128
    iget-object v1, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotationLayout:Lcom/google/maps/android/ui/RotationLayout;

    invoke-virtual {v1, p1}, Lcom/google/maps/android/ui/RotationLayout;->addView(Landroid/view/View;)V

    .line 129
    iput-object p1, p0, Lcom/google/maps/android/ui/IconGenerator;->mContentView:Landroid/view/View;

    .line 130
    iget-object v1, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotationLayout:Lcom/google/maps/android/ui/RotationLayout;

    sget v2, Lcom/google/maps/android/R$id;->text:I

    invoke-virtual {v1, v2}, Lcom/google/maps/android/ui/RotationLayout;->findViewById(I)Landroid/view/View;

    move-result-object v0

    .line 131
    .local v0, "view":Landroid/view/View;
    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_0

    check-cast v0, Landroid/widget/TextView;

    .end local v0    # "view":Landroid/view/View;
    :goto_0
    iput-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mTextView:Landroid/widget/TextView;

    .line 132
    return-void

    .line 131
    .restart local v0    # "view":Landroid/view/View;
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setRotation(I)V
    .locals 1
    .param p1, "degrees"    # I

    .prologue
    .line 149
    add-int/lit16 v0, p1, 0x168

    rem-int/lit16 v0, v0, 0x168

    div-int/lit8 v0, v0, 0x5a

    iput v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mRotation:I

    .line 150
    return-void
.end method

.method public setStyle(I)V
    .locals 2
    .param p1, "style"    # I

    .prologue
    .line 210
    invoke-static {p1}, Lcom/google/maps/android/ui/IconGenerator;->getStyleColor(I)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/maps/android/ui/IconGenerator;->setColor(I)V

    .line 211
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mContext:Landroid/content/Context;

    invoke-static {p1}, Lcom/google/maps/android/ui/IconGenerator;->getTextStyle(I)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/google/maps/android/ui/IconGenerator;->setTextAppearance(Landroid/content/Context;I)V

    .line 212
    return-void
.end method

.method public setTextAppearance(I)V
    .locals 1
    .param p1, "resid"    # I

    .prologue
    .line 203
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mContext:Landroid/content/Context;

    invoke-virtual {p0, v0, p1}, Lcom/google/maps/android/ui/IconGenerator;->setTextAppearance(Landroid/content/Context;I)V

    .line 204
    return-void
.end method

.method public setTextAppearance(Landroid/content/Context;I)V
    .locals 1
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "resid"    # I

    .prologue
    .line 191
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mTextView:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 192
    iget-object v0, p0, Lcom/google/maps/android/ui/IconGenerator;->mTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1, p2}, Landroid/widget/TextView;->setTextAppearance(Landroid/content/Context;I)V

    .line 194
    :cond_0
    return-void
.end method
