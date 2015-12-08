.class final Lcom/roidapp/baselib/view/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/baselib/view/DraggableGridView;


# direct methods
.method constructor <init>(Lcom/roidapp/baselib/view/DraggableGridView;)V
    .locals 0

    .prologue
    .line 179
    iput-object p1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 184
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 185
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    move-result-object v0

    sget-object v1, Landroid/widget/ImageView$ScaleType;->MATRIX:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 186
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->q(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getImageMatrix()Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/graphics/Matrix;->set(Landroid/graphics/Matrix;)V

    .line 187
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget v0, v0, Lcom/roidapp/baselib/view/DraggableGridView;->c:F

    const v1, 0x3dcccccd    # 0.1f

    cmpl-float v0, v0, v1

    if-lez v0, :cond_2

    .line 188
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget v0, v0, Lcom/roidapp/baselib/view/DraggableGridView;->c:F

    const v1, 0x3f7ff972    # 0.9999f

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    .line 189
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getWidth()I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 190
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/ImageView;->getHeight()I

    move-result v1

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 191
    new-instance v0, Landroid/util/DisplayMetrics;

    invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V

    .line 192
    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->s(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager;

    move-result-object v1

    invoke-interface {v1}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 193
    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v2, v2, Lcom/roidapp/baselib/view/DraggableGridView;->a:[I

    aget v2, v2, v5

    iget-object v3, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v3}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->width:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 194
    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v2, v2, Lcom/roidapp/baselib/view/DraggableGridView;->a:[I

    aget v2, v2, v6

    iget-object v3, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v3}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->height:I

    div-int/lit8 v3, v3, 0x2

    sub-int/2addr v2, v3

    iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I

    iget-object v3, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v3}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v3

    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->height:I

    sub-int/2addr v0, v3

    invoke-static {v2, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 195
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v0, v0, Lcom/roidapp/baselib/view/DraggableGridView;->b:[I

    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v1, v1, Lcom/roidapp/baselib/view/DraggableGridView;->a:[I

    aget v1, v1, v5

    iget-object v2, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->x:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->width:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    aput v1, v0, v5

    .line 196
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v0, v0, Lcom/roidapp/baselib/view/DraggableGridView;->b:[I

    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v1, v1, Lcom/roidapp/baselib/view/DraggableGridView;->a:[I

    aget v1, v1, v6

    iget-object v2, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    sub-int/2addr v1, v2

    iget-object v2, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->height:I

    div-int/lit8 v2, v2, 0x2

    sub-int/2addr v1, v2

    aput v1, v0, v6

    .line 197
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->s(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v2}, Lcom/roidapp/baselib/view/DraggableGridView;->r(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager$LayoutParams;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 200
    :cond_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->q(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/graphics/Matrix;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget v1, v1, Lcom/roidapp/baselib/view/DraggableGridView;->c:F

    iget-object v2, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget v2, v2, Lcom/roidapp/baselib/view/DraggableGridView;->c:F

    iget-object v3, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v3}, Lcom/roidapp/baselib/view/DraggableGridView;->p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/ImageView;->getWidth()I

    move-result v3

    div-int/lit8 v3, v3, 0x2

    iget-object v4, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v4, v4, Lcom/roidapp/baselib/view/DraggableGridView;->b:[I

    aget v4, v4, v5

    add-int/2addr v3, v4

    int-to-float v3, v3

    iget-object v4, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v4}, Lcom/roidapp/baselib/view/DraggableGridView;->p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    move-result-object v4

    invoke-virtual {v4}, Landroid/widget/ImageView;->getHeight()I

    move-result v4

    div-int/lit8 v4, v4, 0x2

    iget-object v5, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget-object v5, v5, Lcom/roidapp/baselib/view/DraggableGridView;->b:[I

    aget v5, v5, v6

    add-int/2addr v4, v5

    int-to-float v4, v4

    invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Matrix;->setScale(FFFF)V

    .line 201
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->q(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/graphics/Matrix;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageMatrix(Landroid/graphics/Matrix;)V

    .line 202
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->j(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->t(Lcom/roidapp/baselib/view/DraggableGridView;)Ljava/lang/Runnable;

    move-result-object v1

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 203
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    iget v1, v0, Lcom/roidapp/baselib/view/DraggableGridView;->c:F

    const v2, 0x3f4ccccd    # 0.8f

    mul-float/2addr v1, v2

    iput v1, v0, Lcom/roidapp/baselib/view/DraggableGridView;->c:F

    .line 221
    :cond_1
    :goto_0
    return-void

    .line 205
    :cond_2
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->j(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/os/Handler;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->t(Lcom/roidapp/baselib/view/DraggableGridView;)Ljava/lang/Runnable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 206
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 208
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->s(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/view/WindowManager;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v1}, Lcom/roidapp/baselib/view/DraggableGridView;->p(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    :goto_1
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->u(Lcom/roidapp/baselib/view/DraggableGridView;)Landroid/widget/ImageView;

    .line 215
    :cond_3
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->v(Lcom/roidapp/baselib/view/DraggableGridView;)Lcom/roidapp/baselib/view/d;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 216
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    invoke-static {v0}, Lcom/roidapp/baselib/view/DraggableGridView;->v(Lcom/roidapp/baselib/view/DraggableGridView;)Lcom/roidapp/baselib/view/d;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/baselib/view/d;->a()V

    .line 218
    :cond_4
    iget-object v0, p0, Lcom/roidapp/baselib/view/c;->a:Lcom/roidapp/baselib/view/DraggableGridView;

    const/high16 v1, 0x3f800000    # 1.0f

    iput v1, v0, Lcom/roidapp/baselib/view/DraggableGridView;->c:F

    goto :goto_0

    .line 210
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/IllegalArgumentException;->printStackTrace()V

    goto :goto_1
.end method
