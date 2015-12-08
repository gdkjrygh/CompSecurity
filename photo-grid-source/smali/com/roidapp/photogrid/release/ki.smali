.class final Lcom/roidapp/photogrid/release/ki;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/GestureDetector$OnGestureListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/kg;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/kg;)V
    .locals 0

    .prologue
    .line 231
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 286
    const/4 v0, 0x0

    return v0
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/high16 v4, 0x42c80000    # 100.0f

    const/4 v0, 0x0

    .line 256
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 282
    :cond_0
    :goto_0
    return v0

    .line 259
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    sub-float/2addr v2, v3

    cmpl-float v2, v2, v4

    if-ltz v2, :cond_3

    .line 260
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;)I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->c(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ImageSelector;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    array-length v3, v3

    add-int/lit8 v3, v3, -0x1

    if-ne v2, v3, :cond_2

    .line 261
    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2, v0}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;I)I

    .line 265
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    new-instance v2, Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->c(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ImageSelector;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;)I

    move-result v4

    aget-object v3, v3, v4

    invoke-direct {v2, v3}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;Lcom/roidapp/photogrid/release/ig;)Lcom/roidapp/photogrid/release/ig;

    .line 266
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->c(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ImageSelector;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;)I

    move-result v3

    aget-object v2, v2, v3

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->c(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ImageSelector;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;)I

    move-result v3

    aget v2, v2, v3

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;I)I

    .line 268
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->d(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->e(Lcom/roidapp/photogrid/release/kg;)I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/kg;->f(Lcom/roidapp/photogrid/release/kg;)I

    move-result v4

    invoke-static {v0, v2, v3, v4}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;Lcom/roidapp/photogrid/release/ig;II)V

    move v0, v1

    .line 269
    goto/16 :goto_0

    .line 263
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;I)I

    goto :goto_1

    .line 270
    :cond_3
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result v2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    sub-float/2addr v2, v3

    cmpl-float v2, v2, v4

    if-ltz v2, :cond_0

    .line 271
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;)I

    move-result v0

    if-nez v0, :cond_4

    .line 272
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->c(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ImageSelector;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    array-length v2, v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;I)I

    .line 276
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    new-instance v2, Lcom/roidapp/photogrid/release/ig;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->c(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ImageSelector;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;)I

    move-result v4

    aget-object v3, v3, v4

    invoke-direct {v2, v3}, Lcom/roidapp/photogrid/release/ig;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;Lcom/roidapp/photogrid/release/ig;)Lcom/roidapp/photogrid/release/ig;

    .line 277
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->c(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ImageSelector;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ImageSelector;->b:[Ljava/lang/String;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;)I

    move-result v3

    aget-object v2, v2, v3

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;Ljava/lang/String;)Ljava/lang/String;

    .line 278
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->c(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ImageSelector;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ImageSelector;->c:[I

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;)I

    move-result v3

    aget v2, v2, v3

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;I)I

    .line 279
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->d(Lcom/roidapp/photogrid/release/kg;)Lcom/roidapp/photogrid/release/ig;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/kg;->e(Lcom/roidapp/photogrid/release/kg;)I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/kg;->f(Lcom/roidapp/photogrid/release/kg;)I

    move-result v4

    invoke-static {v0, v2, v3, v4}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;Lcom/roidapp/photogrid/release/ig;II)V

    move v0, v1

    .line 280
    goto/16 :goto_0

    .line 274
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ki;->a:Lcom/roidapp/photogrid/release/kg;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/kg;->b(Lcom/roidapp/photogrid/release/kg;)I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/release/kg;->a(Lcom/roidapp/photogrid/release/kg;I)I

    goto :goto_2
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 252
    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 246
    const/4 v0, 0x0

    return v0
.end method

.method public final onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 241
    return-void
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 235
    const/4 v0, 0x0

    return v0
.end method
