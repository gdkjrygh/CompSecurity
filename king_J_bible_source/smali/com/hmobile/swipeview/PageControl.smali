.class public Lcom/hmobile/swipeview/PageControl;
.super Landroid/widget/LinearLayout;
.source "PageControl.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;
    }
.end annotation


# instance fields
.field private activeDrawable:Landroid/graphics/drawable/Drawable;

.field private inactiveDrawable:Landroid/graphics/drawable/Drawable;

.field private indicators:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/widget/ImageView;",
            ">;"
        }
    .end annotation
.end field

.field private mContext:Landroid/content/Context;

.field private mCurrentPage:I

.field private mIndicatorSize:I

.field private mOnPageControlClickListener:Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;

.field private mPageCount:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;

    .prologue
    const/4 v1, 0x0

    .line 58
    invoke-direct {p0, p1}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 43
    const/4 v0, 0x7

    iput v0, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    .line 50
    iput v1, p0, Lcom/hmobile/swipeview/PageControl;->mPageCount:I

    .line 51
    iput v1, p0, Lcom/hmobile/swipeview/PageControl;->mCurrentPage:I

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/swipeview/PageControl;->mOnPageControlClickListener:Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;

    .line 59
    iput-object p1, p0, Lcom/hmobile/swipeview/PageControl;->mContext:Landroid/content/Context;

    .line 60
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageControl;->initPageControl()V

    .line 61
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2
    .param p1, "context"    # Landroid/content/Context;
    .param p2, "attrs"    # Landroid/util/AttributeSet;

    .prologue
    const/4 v1, 0x0

    .line 65
    invoke-direct {p0, p1, p2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 43
    const/4 v0, 0x7

    iput v0, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    .line 50
    iput v1, p0, Lcom/hmobile/swipeview/PageControl;->mPageCount:I

    .line 51
    iput v1, p0, Lcom/hmobile/swipeview/PageControl;->mCurrentPage:I

    .line 54
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/hmobile/swipeview/PageControl;->mOnPageControlClickListener:Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;

    .line 66
    iput-object p1, p0, Lcom/hmobile/swipeview/PageControl;->mContext:Landroid/content/Context;

    .line 68
    return-void
.end method

.method static synthetic access$0(Lcom/hmobile/swipeview/PageControl;)Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;
    .locals 1

    .prologue
    .line 54
    iget-object v0, p0, Lcom/hmobile/swipeview/PageControl;->mOnPageControlClickListener:Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;

    return-object v0
.end method

.method static synthetic access$1(Lcom/hmobile/swipeview/PageControl;)I
    .locals 1

    .prologue
    .line 51
    iget v0, p0, Lcom/hmobile/swipeview/PageControl;->mCurrentPage:I

    return v0
.end method

.method static synthetic access$2(Lcom/hmobile/swipeview/PageControl;)I
    .locals 1

    .prologue
    .line 50
    iget v0, p0, Lcom/hmobile/swipeview/PageControl;->mPageCount:I

    return v0
.end method

.method private initPageControl()V
    .locals 9

    .prologue
    const/4 v8, 0x1

    const/4 v7, 0x0

    .line 78
    const-string v4, "uk.co.jasonfry.android.tools.ui.PageControl"

    const-string v5, "Initialising PageControl"

    invoke-static {v4, v5}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 80
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    iput-object v4, p0, Lcom/hmobile/swipeview/PageControl;->indicators:Ljava/util/ArrayList;

    .line 82
    new-instance v4, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    iput-object v4, p0, Lcom/hmobile/swipeview/PageControl;->activeDrawable:Landroid/graphics/drawable/Drawable;

    .line 83
    new-instance v4, Landroid/graphics/drawable/ShapeDrawable;

    invoke-direct {v4}, Landroid/graphics/drawable/ShapeDrawable;-><init>()V

    iput-object v4, p0, Lcom/hmobile/swipeview/PageControl;->inactiveDrawable:Landroid/graphics/drawable/Drawable;

    .line 85
    iget-object v4, p0, Lcom/hmobile/swipeview/PageControl;->activeDrawable:Landroid/graphics/drawable/Drawable;

    iget v5, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    iget v6, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    invoke-virtual {v4, v7, v7, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 86
    iget-object v4, p0, Lcom/hmobile/swipeview/PageControl;->inactiveDrawable:Landroid/graphics/drawable/Drawable;

    iget v5, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    iget v6, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    invoke-virtual {v4, v7, v7, v5, v6}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 88
    new-instance v2, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v2}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    .line 89
    .local v2, "s1":Landroid/graphics/drawable/shapes/Shape;
    iget v4, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    int-to-float v4, v4

    iget v5, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    int-to-float v5, v5

    invoke-virtual {v2, v4, v5}, Landroid/graphics/drawable/shapes/Shape;->resize(FF)V

    .line 91
    new-instance v3, Landroid/graphics/drawable/shapes/OvalShape;

    invoke-direct {v3}, Landroid/graphics/drawable/shapes/OvalShape;-><init>()V

    .line 92
    .local v3, "s2":Landroid/graphics/drawable/shapes/Shape;
    iget v4, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    int-to-float v4, v4

    iget v5, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    int-to-float v5, v5

    invoke-virtual {v3, v4, v5}, Landroid/graphics/drawable/shapes/Shape;->resize(FF)V

    .line 94
    const/4 v4, 0x2

    new-array v1, v4, [I

    .line 95
    .local v1, "i":[I
    const v4, 0x1010038

    aput v4, v1, v7

    .line 96
    const v4, 0x101003a

    aput v4, v1, v8

    .line 97
    iget-object v4, p0, Lcom/hmobile/swipeview/PageControl;->mContext:Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v4

    invoke-virtual {v4, v1}, Landroid/content/res/Resources$Theme;->obtainStyledAttributes([I)Landroid/content/res/TypedArray;

    move-result-object v0

    .line 99
    .local v0, "a":Landroid/content/res/TypedArray;
    iget-object v4, p0, Lcom/hmobile/swipeview/PageControl;->activeDrawable:Landroid/graphics/drawable/Drawable;

    check-cast v4, Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v4

    const v5, -0xbbbbbc

    invoke-virtual {v0, v7, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 100
    iget-object v4, p0, Lcom/hmobile/swipeview/PageControl;->inactiveDrawable:Landroid/graphics/drawable/Drawable;

    check-cast v4, Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/ShapeDrawable;->getPaint()Landroid/graphics/Paint;

    move-result-object v4

    const v5, -0x333334

    invoke-virtual {v0, v8, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 102
    iget-object v4, p0, Lcom/hmobile/swipeview/PageControl;->activeDrawable:Landroid/graphics/drawable/Drawable;

    check-cast v4, Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v4, v2}, Landroid/graphics/drawable/ShapeDrawable;->setShape(Landroid/graphics/drawable/shapes/Shape;)V

    .line 103
    iget-object v4, p0, Lcom/hmobile/swipeview/PageControl;->inactiveDrawable:Landroid/graphics/drawable/Drawable;

    check-cast v4, Landroid/graphics/drawable/ShapeDrawable;

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/ShapeDrawable;->setShape(Landroid/graphics/drawable/shapes/Shape;)V

    .line 105
    iget v4, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    int-to-float v4, v4

    invoke-virtual {p0}, Lcom/hmobile/swipeview/PageControl;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v5

    iget v5, v5, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr v4, v5

    float-to-int v4, v4

    iput v4, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    .line 107
    new-instance v4, Lcom/hmobile/swipeview/PageControl$1;

    invoke-direct {v4, p0}, Lcom/hmobile/swipeview/PageControl$1;-><init>(Lcom/hmobile/swipeview/PageControl;)V

    invoke-virtual {p0, v4}, Lcom/hmobile/swipeview/PageControl;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 159
    return-void
.end method


# virtual methods
.method public getActiveDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 181
    iget-object v0, p0, Lcom/hmobile/swipeview/PageControl;->activeDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getCurrentPage()I
    .locals 1

    .prologue
    .line 264
    iget v0, p0, Lcom/hmobile/swipeview/PageControl;->mCurrentPage:I

    return v0
.end method

.method public getInactiveDrawable()Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 208
    iget-object v0, p0, Lcom/hmobile/swipeview/PageControl;->inactiveDrawable:Landroid/graphics/drawable/Drawable;

    return-object v0
.end method

.method public getIndicatorSize()I
    .locals 1

    .prologue
    .line 288
    iget v0, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    return v0
.end method

.method public getOnPageControlClickListener()Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;
    .locals 1

    .prologue
    .line 330
    iget-object v0, p0, Lcom/hmobile/swipeview/PageControl;->mOnPageControlClickListener:Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;

    return-object v0
.end method

.method public getPageCount()I
    .locals 1

    .prologue
    .line 239
    iget v0, p0, Lcom/hmobile/swipeview/PageControl;->mPageCount:I

    return v0
.end method

.method protected onFinishInflate()V
    .locals 0

    .prologue
    .line 73
    invoke-direct {p0}, Lcom/hmobile/swipeview/PageControl;->initPageControl()V

    .line 74
    return-void
.end method

.method public setActiveDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 2
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 168
    iput-object p1, p0, Lcom/hmobile/swipeview/PageControl;->activeDrawable:Landroid/graphics/drawable/Drawable;

    .line 170
    iget-object v0, p0, Lcom/hmobile/swipeview/PageControl;->indicators:Ljava/util/ArrayList;

    iget v1, p0, Lcom/hmobile/swipeview/PageControl;->mCurrentPage:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/hmobile/swipeview/PageControl;->activeDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 172
    return-void
.end method

.method public setCurrentPage(I)V
    .locals 2
    .param p1, "currentPage"    # I

    .prologue
    .line 249
    iget v0, p0, Lcom/hmobile/swipeview/PageControl;->mPageCount:I

    if-ge p1, v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/hmobile/swipeview/PageControl;->indicators:Ljava/util/ArrayList;

    iget v1, p0, Lcom/hmobile/swipeview/PageControl;->mCurrentPage:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/hmobile/swipeview/PageControl;->inactiveDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 252
    iget-object v0, p0, Lcom/hmobile/swipeview/PageControl;->indicators:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iget-object v1, p0, Lcom/hmobile/swipeview/PageControl;->activeDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 253
    iput p1, p0, Lcom/hmobile/swipeview/PageControl;->mCurrentPage:I

    .line 255
    :cond_0
    return-void
.end method

.method public setInactiveDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 3
    .param p1, "d"    # Landroid/graphics/drawable/Drawable;

    .prologue
    .line 191
    iput-object p1, p0, Lcom/hmobile/swipeview/PageControl;->inactiveDrawable:Landroid/graphics/drawable/Drawable;

    .line 193
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget v1, p0, Lcom/hmobile/swipeview/PageControl;->mPageCount:I

    if-lt v0, v1, :cond_0

    .line 198
    iget-object v1, p0, Lcom/hmobile/swipeview/PageControl;->indicators:Ljava/util/ArrayList;

    iget v2, p0, Lcom/hmobile/swipeview/PageControl;->mCurrentPage:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/hmobile/swipeview/PageControl;->activeDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 199
    return-void

    .line 195
    :cond_0
    iget-object v1, p0, Lcom/hmobile/swipeview/PageControl;->indicators:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    iget-object v2, p0, Lcom/hmobile/swipeview/PageControl;->inactiveDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 193
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public setIndicatorSize(I)V
    .locals 5
    .param p1, "indicatorSize"    # I

    .prologue
    .line 274
    iput p1, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    .line 275
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    iget v1, p0, Lcom/hmobile/swipeview/PageControl;->mPageCount:I

    if-lt v0, v1, :cond_0

    .line 279
    return-void

    .line 277
    :cond_0
    iget-object v1, p0, Lcom/hmobile/swipeview/PageControl;->indicators:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    iget v3, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    iget v4, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 275
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method

.method public setOnPageControlClickListener(Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;)V
    .locals 0
    .param p1, "onPageControlClickListener"    # Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;

    .prologue
    .line 320
    iput-object p1, p0, Lcom/hmobile/swipeview/PageControl;->mOnPageControlClickListener:Lcom/hmobile/swipeview/PageControl$OnPageControlClickListener;

    .line 321
    return-void
.end method

.method public setPageCount(I)V
    .locals 7
    .param p1, "pageCount"    # I

    .prologue
    .line 218
    iput p1, p0, Lcom/hmobile/swipeview/PageControl;->mPageCount:I

    .line 219
    const/4 v0, 0x0

    .local v0, "i":I
    :goto_0
    if-lt v0, p1, :cond_0

    .line 230
    return-void

    .line 221
    :cond_0
    new-instance v1, Landroid/widget/ImageView;

    iget-object v3, p0, Lcom/hmobile/swipeview/PageControl;->mContext:Landroid/content/Context;

    invoke-direct {v1, v3}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 222
    .local v1, "imageView":Landroid/widget/ImageView;
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    iget v3, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    iget v4, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    invoke-direct {v2, v3, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 223
    .local v2, "params":Landroid/widget/LinearLayout$LayoutParams;
    iget v3, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    div-int/lit8 v3, v3, 0x2

    iget v4, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    iget v5, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    div-int/lit8 v5, v5, 0x2

    iget v6, p0, Lcom/hmobile/swipeview/PageControl;->mIndicatorSize:I

    invoke-virtual {v2, v3, v4, v5, v6}, Landroid/widget/LinearLayout$LayoutParams;->setMargins(IIII)V

    .line 224
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 225
    iget-object v3, p0, Lcom/hmobile/swipeview/PageControl;->inactiveDrawable:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 227
    iget-object v3, p0, Lcom/hmobile/swipeview/PageControl;->indicators:Ljava/util/ArrayList;

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 228
    invoke-virtual {p0, v1}, Lcom/hmobile/swipeview/PageControl;->addView(Landroid/view/View;)V

    .line 219
    add-int/lit8 v0, v0, 0x1

    goto :goto_0
.end method
