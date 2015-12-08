.class public Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;
.super Landroid/view/ViewGroup;


# instance fields
.field private a:I

.field private b:Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;

.field private c:Landroid/view/View;

.field private d:Landroid/view/View;

.field private e:I

.field private f:I

.field private g:Lcom/jeremyfeinstein/slidingmenu/lib/k;

.field private h:Z

.field private i:I

.field private j:Z

.field private final k:Landroid/graphics/Paint;

.field private l:F

.field private m:Landroid/graphics/drawable/Drawable;

.field private n:Landroid/graphics/drawable/Drawable;

.field private o:I

.field private p:F

.field private q:Z

.field private r:Landroid/graphics/Bitmap;

.field private s:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 3

    const/4 v2, 0x1

    invoke-direct {p0, p1, p2}, Landroid/view/ViewGroup;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 v0, 0x0

    iput v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->a:I

    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->k:Landroid/graphics/Paint;

    iput-boolean v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->q:Z

    const/high16 v0, 0x42400000    # 48.0f

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    invoke-static {v2, v0, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->e:I

    return-void
.end method

.method private e()I
    .locals 3

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->s:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getTop()I

    move-result v0

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->s:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->r:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    sub-int/2addr v1, v2

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    return v0
.end method

.method public final a(Landroid/view/View;I)I
    .locals 2

    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-nez v0, :cond_1

    packed-switch p2, :pswitch_data_0

    :cond_0
    :goto_0
    :pswitch_0
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    :goto_1
    return v0

    :pswitch_1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_1

    :pswitch_2
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    goto :goto_1

    :cond_1
    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    packed-switch p2, :pswitch_data_1

    :pswitch_3
    goto :goto_0

    :pswitch_4
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    goto :goto_1

    :pswitch_5
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_1

    :cond_2
    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    packed-switch p2, :pswitch_data_2

    :pswitch_6
    goto :goto_0

    :pswitch_7
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    goto :goto_1

    :pswitch_8
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_5
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_8
    .end packed-switch
.end method

.method public final a(F)V
    .locals 0

    iput p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->l:F

    return-void
.end method

.method public final a(I)V
    .locals 0

    iput p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->f:I

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->requestLayout()V

    return-void
.end method

.method public final a(Landroid/graphics/Bitmap;)V
    .locals 0

    iput-object p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->r:Landroid/graphics/Bitmap;

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->refreshDrawableState()V

    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    iput-object p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->invalidate()V

    return-void
.end method

.method public final a(Landroid/view/View;)V
    .locals 1

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->removeView(Landroid/view/View;)V

    :cond_0
    iput-object p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->addView(Landroid/view/View;)V

    return-void
.end method

.method public final a(Landroid/view/View;II)V
    .locals 5

    const/4 v0, 0x0

    const/4 v1, 0x4

    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-nez v2, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    if-lt p2, v2, :cond_0

    move v0, v1

    :cond_0
    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int/2addr v2, p2

    int-to-float v2, v2

    iget v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->l:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {p0, v2, p3}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->scrollTo(II)V

    :cond_1
    :goto_0
    if-ne v0, v1, :cond_2

    const-string v1, "CustomViewBehind"

    const-string v2, "behind INVISIBLE"

    invoke-static {v1, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_2
    invoke-virtual {p0, v0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->setVisibility(I)V

    return-void

    :cond_3
    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v3, 0x1

    if-ne v2, v3, :cond_5

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    if-gt p2, v2, :cond_4

    move v0, v1

    :cond_4
    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getWidth()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    iget-object v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    sub-int v3, p2, v3

    int-to-float v3, v3

    iget v4, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->l:F

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {p0, v2, p3}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->scrollTo(II)V

    goto :goto_0

    :cond_5
    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    iget-object v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    if-lt p2, v2, :cond_7

    move v2, v1

    :goto_1
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->d:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    if-gt p2, v2, :cond_8

    move v2, v1

    :goto_2
    invoke-virtual {v3, v2}, Landroid/view/View;->setVisibility(I)V

    if-nez p2, :cond_6

    move v0, v1

    :cond_6
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    if-gt p2, v2, :cond_9

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    add-int/2addr v2, p2

    int-to-float v2, v2

    iget v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->l:F

    mul-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {p0, v2, p3}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->scrollTo(II)V

    goto :goto_0

    :cond_7
    move v2, v0

    goto :goto_1

    :cond_8
    move v2, v0

    goto :goto_2

    :cond_9
    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getWidth()I

    move-result v3

    sub-int/2addr v2, v3

    int-to-float v2, v2

    iget-object v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    sub-int v3, p2, v3

    int-to-float v3, v3

    iget v4, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->l:F

    mul-float/2addr v3, v4

    add-float/2addr v2, v3

    float-to-int v2, v2

    invoke-virtual {p0, v2, p3}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->scrollTo(II)V

    goto/16 :goto_0
.end method

.method public final a(Landroid/view/View;Landroid/graphics/Canvas;)V
    .locals 5

    const/4 v1, 0x0

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->m:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->o:I

    if-gtz v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-eqz v0, :cond_3

    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v2, 0x1

    if-ne v0, v2, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    :goto_1
    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->m:Landroid/graphics/drawable/Drawable;

    iget v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->o:I

    add-int/2addr v3, v0

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getHeight()I

    move-result v4

    invoke-virtual {v2, v0, v1, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->m:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    goto :goto_0

    :cond_2
    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v2, 0x2

    if-ne v0, v2, :cond_4

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->n:Landroid/graphics/drawable/Drawable;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->n:Landroid/graphics/drawable/Drawable;

    iget v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->o:I

    add-int/2addr v3, v0

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getHeight()I

    move-result v4

    invoke-virtual {v2, v0, v1, v3, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->n:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p2}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->o:I

    sub-int/2addr v0, v2

    goto :goto_1

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method public final a(Landroid/view/View;Landroid/graphics/Canvas;F)V
    .locals 6

    const/4 v2, 0x0

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->j:Z

    if-nez v1, :cond_0

    :goto_0
    return-void

    :cond_0
    iget v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->p:F

    const/high16 v3, 0x437f0000    # 255.0f

    mul-float/2addr v1, v3

    const/high16 v3, 0x3f800000    # 1.0f

    sub-float/2addr v3, p3

    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    move-result v3

    mul-float/2addr v1, v3

    float-to-int v1, v1

    iget-object v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->k:Landroid/graphics/Paint;

    invoke-static {v1, v0, v0, v0}, Landroid/graphics/Color;->argb(IIII)I

    move-result v1

    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    iget v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-nez v1, :cond_1

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int v1, v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    :goto_1
    int-to-float v1, v1

    int-to-float v3, v0

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getHeight()I

    move-result v0

    int-to-float v4, v0

    iget-object v5, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->k:Landroid/graphics/Paint;

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    goto :goto_0

    :cond_1
    iget v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v3, 0x1

    if-ne v1, v3, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    iget-object v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    add-int/2addr v0, v3

    goto :goto_1

    :cond_2
    iget v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v3, 0x2

    if-ne v1, v3, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v3

    int-to-float v1, v0

    int-to-float v3, v3

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getHeight()I

    move-result v0

    int-to-float v4, v0

    iget-object v5, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->k:Landroid/graphics/Paint;

    move-object v0, p2

    invoke-virtual/range {v0 .. v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v0

    iget-object v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    move-result v3

    add-int/2addr v0, v3

    goto :goto_1

    :cond_3
    move v1, v0

    goto :goto_1
.end method

.method public final a(Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;)V
    .locals 0

    iput-object p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->b:Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;

    return-void
.end method

.method public final a(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->h:Z

    return-void
.end method

.method public final a(Landroid/view/View;IF)Z
    .locals 1

    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :pswitch_0
    const/4 v0, 0x1

    goto :goto_0

    :pswitch_1
    invoke-virtual {p0, p1, p2, p3}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->b(Landroid/view/View;IF)Z

    move-result v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Landroid/view/View;)I
    .locals 2

    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    sub-int/2addr v0, v1

    :goto_0
    return v0

    :cond_1
    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    return-object v0
.end method

.method public final b(F)V
    .locals 2

    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p1, v0

    if-gtz v0, :cond_0

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-gez v0, :cond_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "The BehindFadeDegree must be between 0.0f and 1.0f"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iput p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->p:F

    return-void
.end method

.method public final b(I)V
    .locals 2

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    if-ne p1, v0, :cond_2

    :cond_0
    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_1
    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->d:Landroid/view/View;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->d:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    iput p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    return-void
.end method

.method public final b(Landroid/view/View;Landroid/graphics/Canvas;F)V
    .locals 5

    const/4 v4, 0x0

    const/4 v3, 0x0

    iget-boolean v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->q:Z

    if-nez v0, :cond_1

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->r:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->s:Landroid/view/View;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->s:Landroid/view/View;

    sget v1, Lcom/jeremyfeinstein/slidingmenu/lib/f;->a:I

    invoke-virtual {v0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const-string v1, "CustomViewBehindSelectedView"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p2}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->r:Landroid/graphics/Bitmap;

    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p3

    float-to-int v0, v0

    iget v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-nez v1, :cond_3

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v1

    sub-int v0, v1, v0

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getHeight()I

    move-result v2

    invoke-virtual {p2, v0, v3, v1, v2}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->r:Landroid/graphics/Bitmap;

    int-to-float v0, v0

    invoke-direct {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->e()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p2, v1, v0, v2, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    :cond_2
    :goto_1
    invoke-virtual {p2}, Landroid/graphics/Canvas;->restore()V

    goto :goto_0

    :cond_3
    iget v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_2

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v1

    add-int/2addr v0, v1

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getHeight()I

    move-result v2

    invoke-virtual {p2, v1, v3, v0, v2}, Landroid/graphics/Canvas;->clipRect(IIII)Z

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->r:Landroid/graphics/Bitmap;

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->r:Landroid/graphics/Bitmap;

    invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    sub-int/2addr v0, v2

    int-to-float v0, v0

    invoke-direct {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->e()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p2, v1, v0, v2, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    goto :goto_1
.end method

.method public final b(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->j:Z

    return-void
.end method

.method public final b(Landroid/view/View;I)Z
    .locals 6

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v3

    iget v4, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-nez v4, :cond_2

    if-lt p2, v2, :cond_1

    iget v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->e:I

    add-int/2addr v2, v3

    if-gt p2, v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    iget v4, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-ne v4, v0, :cond_4

    if-gt p2, v3, :cond_3

    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->e:I

    sub-int v2, v3, v2

    if-ge p2, v2, :cond_0

    :cond_3
    move v0, v1

    goto :goto_0

    :cond_4
    iget v4, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v5, 0x2

    if-ne v4, v5, :cond_7

    if-lt p2, v2, :cond_5

    iget v4, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->e:I

    add-int/2addr v2, v4

    if-le p2, v2, :cond_0

    :cond_5
    if-gt p2, v3, :cond_6

    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->e:I

    sub-int v2, v3, v2

    if-ge p2, v2, :cond_0

    :cond_6
    move v0, v1

    goto :goto_0

    :cond_7
    move v0, v1

    goto :goto_0
.end method

.method public final b(Landroid/view/View;IF)Z
    .locals 4

    const/4 v3, 0x2

    const/4 v1, 0x1

    const/4 v0, 0x0

    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-eqz v2, :cond_0

    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-ne v2, v3, :cond_2

    if-nez p2, :cond_2

    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v2

    int-to-float v2, v2

    cmpl-float v2, p3, v2

    if-ltz v2, :cond_1

    move v0, v1

    :cond_1
    :goto_0
    return v0

    :cond_2
    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-eq v2, v1, :cond_3

    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-ne v2, v3, :cond_1

    if-ne p2, v3, :cond_1

    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getRight()I

    move-result v2

    int-to-float v2, v2

    cmpg-float v2, p3, v2

    if-gtz v2, :cond_1

    move v0, v1

    goto :goto_0
.end method

.method public final c(Landroid/view/View;)I
    .locals 2

    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    iget v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_2

    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getLeft()I

    move-result v0

    iget-object v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()Landroid/view/View;
    .locals 1

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->d:Landroid/view/View;

    return-object v0
.end method

.method public final c(I)V
    .locals 0

    iput p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->o:I

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->invalidate()V

    return-void
.end method

.method public final c(F)Z
    .locals 4

    const/4 v3, 0x0

    const/4 v1, 0x0

    const/4 v0, 0x1

    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-nez v2, :cond_2

    cmpl-float v2, p1, v3

    if-lez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-ne v2, v0, :cond_3

    cmpg-float v2, p1, v3

    if-ltz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_3
    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method public final d(I)I
    .locals 4

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v3, 0x1

    if-le p1, v3, :cond_1

    move p1, v0

    :cond_0
    :goto_0
    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-nez v2, :cond_2

    if-le p1, v3, :cond_2

    :goto_1
    return v1

    :cond_1
    if-gtz p1, :cond_0

    move p1, v1

    goto :goto_0

    :cond_2
    iget v1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-ne v1, v3, :cond_3

    if-gtz p1, :cond_3

    move v1, v0

    goto :goto_1

    :cond_3
    move v1, p1

    goto :goto_1
.end method

.method public final d()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->q:Z

    return-void
.end method

.method public final d(F)Z
    .locals 4

    const/4 v3, 0x0

    const/4 v1, 0x0

    const/4 v0, 0x1

    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-nez v2, :cond_2

    cmpg-float v2, p1, v3

    if-gez v2, :cond_1

    :cond_0
    :goto_0
    return v0

    :cond_1
    move v0, v1

    goto :goto_0

    :cond_2
    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    if-ne v2, v0, :cond_3

    cmpl-float v2, p1, v3

    if-gtz v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_3
    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->i:I

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    move v0, v1

    goto :goto_0
.end method

.method protected dispatchDraw(Landroid/graphics/Canvas;)V
    .locals 1

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->g:Lcom/jeremyfeinstein/slidingmenu/lib/k;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->g:Lcom/jeremyfeinstein/slidingmenu/lib/k;

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->b:Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;

    invoke-virtual {v0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewAbove;->c()F

    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    :goto_0
    return-void

    :cond_0
    invoke-super {p0, p1}, Landroid/view/ViewGroup;->dispatchDraw(Landroid/graphics/Canvas;)V

    goto :goto_0
.end method

.method public final e(I)V
    .locals 0

    iput p1, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->a:I

    return-void
.end method

.method public onInterceptTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method protected onLayout(ZIIII)V
    .locals 5

    const/4 v4, 0x0

    sub-int v0, p4, p2

    sub-int v1, p5, p3

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    iget v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->f:I

    sub-int v3, v0, v3

    invoke-virtual {v2, v4, v4, v3, v1}, Landroid/view/View;->layout(IIII)V

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->d:Landroid/view/View;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->d:Landroid/view/View;

    iget v3, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->f:I

    sub-int/2addr v0, v3

    invoke-virtual {v2, v4, v4, v0, v1}, Landroid/view/View;->layout(IIII)V

    :cond_0
    return-void
.end method

.method protected onMeasure(II)V
    .locals 4

    const/4 v3, 0x0

    invoke-static {v3, p1}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getDefaultSize(II)I

    move-result v0

    invoke-static {v3, p2}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getDefaultSize(II)I

    move-result v1

    invoke-virtual {p0, v0, v1}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->setMeasuredDimension(II)V

    iget v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->f:I

    sub-int/2addr v0, v2

    invoke-static {p1, v3, v0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getChildMeasureSpec(III)I

    move-result v0

    invoke-static {p2, v3, v1}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->getChildMeasureSpec(III)I

    move-result v1

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->c:Landroid/view/View;

    invoke-virtual {v2, v0, v1}, Landroid/view/View;->measure(II)V

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->d:Landroid/view/View;

    if-eqz v2, :cond_0

    iget-object v2, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->d:Landroid/view/View;

    invoke-virtual {v2, v0, v1}, Landroid/view/View;->measure(II)V

    :cond_0
    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1

    iget-boolean v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->h:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public scrollTo(II)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroid/view/ViewGroup;->scrollTo(II)V

    iget-object v0, p0, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->g:Lcom/jeremyfeinstein/slidingmenu/lib/k;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/jeremyfeinstein/slidingmenu/lib/CustomViewBehind;->invalidate()V

    :cond_0
    return-void
.end method
