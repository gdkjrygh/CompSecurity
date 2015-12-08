.class public Lcom/ijoysoft/appwall/AppWallView;
.super Landroid/view/View;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private a:Landroid/graphics/drawable/Drawable;

.field private b:Landroid/graphics/drawable/Drawable;

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:Ljava/lang/String;

.field private h:Landroid/graphics/Rect;

.field private i:Landroid/graphics/Rect;

.field private j:Landroid/graphics/Rect;

.field private k:Landroid/graphics/Rect;

.field private l:Landroid/text/TextPaint;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    const/4 v3, 0x0

    invoke-direct {p0, p1, p2}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    sget-object v0, Lcom/ijoysoft/appwall/ad;->a:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v0

    sget v1, Lcom/ijoysoft/appwall/ad;->b:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->a:Landroid/graphics/drawable/Drawable;

    sget v1, Lcom/ijoysoft/appwall/ad;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    iput-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->b:Landroid/graphics/drawable/Drawable;

    sget v1, Lcom/ijoysoft/appwall/ad;->h:I

    const/16 v2, 0xd

    invoke-virtual {v0, v1, v2}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/ijoysoft/appwall/AppWallView;->c:I

    sget v1, Lcom/ijoysoft/appwall/ad;->g:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/ijoysoft/appwall/AppWallView;->d:I

    sget v1, Lcom/ijoysoft/appwall/ad;->c:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/ijoysoft/appwall/AppWallView;->f:I

    sget v1, Lcom/ijoysoft/appwall/ad;->f:I

    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v1

    iput v1, p0, Lcom/ijoysoft/appwall/AppWallView;->e:I

    sget v1, Lcom/ijoysoft/appwall/ad;->d:I

    invoke-virtual {v0, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->g:Ljava/lang/String;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/ijoysoft/appwall/AppWallView;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/ijoysoft/appwall/a;->d(Landroid/content/Context;)I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->g:Ljava/lang/String;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    new-instance v0, Landroid/text/TextPaint;

    invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->l:Landroid/text/TextPaint;

    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->l:Landroid/text/TextPaint;

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setColor(I)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->l:Landroid/text/TextPaint;

    iget v1, p0, Lcom/ijoysoft/appwall/AppWallView;->c:I

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTextSize(F)V

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->j:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->h:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->i:Landroid/graphics/Rect;

    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->k:Landroid/graphics/Rect;

    invoke-virtual {p0, p0}, Lcom/ijoysoft/appwall/AppWallView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V
    .locals 7

    iget v0, p1, Landroid/graphics/Rect;->right:I

    iget v1, p1, Landroid/graphics/Rect;->left:I

    sub-int/2addr v0, v1

    iget v1, p1, Landroid/graphics/Rect;->bottom:I

    iget v2, p1, Landroid/graphics/Rect;->top:I

    sub-int/2addr v1, v2

    iget v2, p0, Landroid/graphics/Rect;->right:I

    iget v3, p0, Landroid/graphics/Rect;->left:I

    sub-int/2addr v2, v3

    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    iget v3, p0, Landroid/graphics/Rect;->bottom:I

    iget v4, p0, Landroid/graphics/Rect;->top:I

    sub-int/2addr v3, v4

    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    move-result v3

    sub-int v4, v0, v2

    div-int/lit8 v4, v4, 0x2

    iget v5, p1, Landroid/graphics/Rect;->left:I

    add-int/2addr v4, v5

    sub-int v5, v1, v3

    div-int/lit8 v5, v5, 0x2

    iget v6, p1, Landroid/graphics/Rect;->top:I

    add-int/2addr v5, v6

    sub-int/2addr v0, v2

    div-int/lit8 v0, v0, 0x2

    add-int/2addr v0, v2

    iget v2, p1, Landroid/graphics/Rect;->left:I

    add-int/2addr v0, v2

    sub-int/2addr v1, v3

    div-int/lit8 v1, v1, 0x2

    add-int/2addr v1, v3

    iget v2, p1, Landroid/graphics/Rect;->top:I

    add-int/2addr v1, v2

    invoke-virtual {p0, v4, v5, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 0

    if-eqz p1, :cond_0

    :goto_0
    iput-object p1, p0, Lcom/ijoysoft/appwall/AppWallView;->g:Ljava/lang/String;

    invoke-virtual {p0}, Lcom/ijoysoft/appwall/AppWallView;->postInvalidate()V

    return-void

    :cond_0
    const-string p1, ""

    goto :goto_0
.end method

.method public onClick(Landroid/view/View;)V
    .locals 1

    invoke-virtual {p0}, Lcom/ijoysoft/appwall/AppWallView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/ijoysoft/appwall/a;->b(Landroid/content/Context;)V

    return-void
.end method

.method protected onDraw(Landroid/graphics/Canvas;)V
    .locals 6

    const/4 v4, 0x0

    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->k:Landroid/graphics/Rect;

    invoke-virtual {p0}, Lcom/ijoysoft/appwall/AppWallView;->getWidth()I

    move-result v1

    invoke-virtual {p0}, Lcom/ijoysoft/appwall/AppWallView;->getHeight()I

    move-result v2

    invoke-virtual {v0, v4, v4, v1, v2}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v2, p0, Lcom/ijoysoft/appwall/AppWallView;->h:Landroid/graphics/Rect;

    iget v0, p0, Lcom/ijoysoft/appwall/AppWallView;->f:I

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/ijoysoft/appwall/AppWallView;->f:I

    :goto_0
    iget v1, p0, Lcom/ijoysoft/appwall/AppWallView;->f:I

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/ijoysoft/appwall/AppWallView;->f:I

    :goto_1
    invoke-virtual {v2, v4, v4, v0, v1}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->h:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->k:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Lcom/ijoysoft/appwall/AppWallView;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->a:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->h:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->l:Landroid/text/TextPaint;

    iget-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->g:Ljava/lang/String;

    iget-object v2, p0, Lcom/ijoysoft/appwall/AppWallView;->g:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    iget-object v3, p0, Lcom/ijoysoft/appwall/AppWallView;->i:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v4, v2, v3}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    iget v0, p0, Lcom/ijoysoft/appwall/AppWallView;->d:I

    mul-int/lit8 v0, v0, 0x2

    iget-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->i:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->right:I

    iget-object v2, p0, Lcom/ijoysoft/appwall/AppWallView;->i:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->left:I

    sub-int/2addr v1, v2

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    iget-object v2, p0, Lcom/ijoysoft/appwall/AppWallView;->i:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    iget-object v3, p0, Lcom/ijoysoft/appwall/AppWallView;->i:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    sub-int/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(I)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    add-int/2addr v0, v1

    iget-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->j:Landroid/graphics/Rect;

    iget-object v2, p0, Lcom/ijoysoft/appwall/AppWallView;->h:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->right:I

    sub-int/2addr v2, v0

    iget v3, p0, Lcom/ijoysoft/appwall/AppWallView;->e:I

    sub-int/2addr v2, v3

    iget-object v3, p0, Lcom/ijoysoft/appwall/AppWallView;->h:Landroid/graphics/Rect;

    iget v3, v3, Landroid/graphics/Rect;->top:I

    iget v4, p0, Lcom/ijoysoft/appwall/AppWallView;->e:I

    add-int/2addr v3, v4

    iget-object v4, p0, Lcom/ijoysoft/appwall/AppWallView;->h:Landroid/graphics/Rect;

    iget v4, v4, Landroid/graphics/Rect;->right:I

    iget v5, p0, Lcom/ijoysoft/appwall/AppWallView;->e:I

    sub-int/2addr v4, v5

    iget-object v5, p0, Lcom/ijoysoft/appwall/AppWallView;->h:Landroid/graphics/Rect;

    iget v5, v5, Landroid/graphics/Rect;->top:I

    add-int/2addr v0, v5

    iget v5, p0, Lcom/ijoysoft/appwall/AppWallView;->e:I

    add-int/2addr v0, v5

    invoke-virtual {v1, v2, v3, v4, v0}, Landroid/graphics/Rect;->set(IIII)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->i:Landroid/graphics/Rect;

    iget-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->j:Landroid/graphics/Rect;

    invoke-static {v0, v1}, Lcom/ijoysoft/appwall/AppWallView;->a(Landroid/graphics/Rect;Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->b:Landroid/graphics/drawable/Drawable;

    iget-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->j:Landroid/graphics/Rect;

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/Drawable;->setBounds(Landroid/graphics/Rect;)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->g:Ljava/lang/String;

    iget-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->i:Landroid/graphics/Rect;

    iget v1, v1, Landroid/graphics/Rect;->left:I

    int-to-float v1, v1

    iget-object v2, p0, Lcom/ijoysoft/appwall/AppWallView;->i:Landroid/graphics/Rect;

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    int-to-float v2, v2

    iget-object v3, p0, Lcom/ijoysoft/appwall/AppWallView;->l:Landroid/text/TextPaint;

    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/ijoysoft/appwall/AppWallView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v0

    goto/16 :goto_0

    :cond_1
    iget-object v1, p0, Lcom/ijoysoft/appwall/AppWallView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v1

    goto/16 :goto_1
.end method

.method protected onMeasure(II)V
    .locals 8

    const/high16 v7, -0x80000000

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v2

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v3

    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v1

    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    iget-object v4, p0, Lcom/ijoysoft/appwall/AppWallView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v4}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v4

    iget-object v5, p0, Lcom/ijoysoft/appwall/AppWallView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    add-int/2addr v4, v5

    iget-object v5, p0, Lcom/ijoysoft/appwall/AppWallView;->a:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v5}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v5

    iget-object v6, p0, Lcom/ijoysoft/appwall/AppWallView;->b:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v6}, Landroid/graphics/drawable/Drawable;->getIntrinsicHeight()I

    move-result v6

    div-int/lit8 v6, v6, 0x2

    add-int/2addr v5, v6

    if-ne v2, v7, :cond_0

    invoke-static {v1, v4}, Ljava/lang/Math;->min(II)I

    move-result v1

    :cond_0
    if-ne v3, v7, :cond_1

    invoke-static {v0, v5}, Ljava/lang/Math;->min(II)I

    move-result v0

    :cond_1
    invoke-virtual {p0, v1, v0}, Lcom/ijoysoft/appwall/AppWallView;->setMeasuredDimension(II)V

    return-void
.end method
