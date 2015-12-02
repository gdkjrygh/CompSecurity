.class Lcom/qihoo/security/floatview/ui/c$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/floatview/ui/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/floatview/ui/c;


# direct methods
.method constructor <init>(Lcom/qihoo/security/floatview/ui/c;)V
    .locals 0

    .prologue
    .line 71
    iput-object p1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 7

    .prologue
    const/4 v4, 0x0

    .line 75
    const/4 v0, 0x1

    .line 77
    :try_start_0
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v1}, Lcom/qihoo/security/floatview/ui/c;->a(Lcom/qihoo/security/floatview/ui/c;)Landroid/widget/Scroller;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Scroller;->computeScrollOffset()Z
    :try_end_0
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 80
    :goto_0
    if-eqz v0, :cond_7

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->a(Lcom/qihoo/security/floatview/ui/c;)Landroid/widget/Scroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrX()I

    move-result v1

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->a(Lcom/qihoo/security/floatview/ui/c;)Landroid/widget/Scroller;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Scroller;->getCurrY()I

    move-result v0

    .line 83
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v2, v2, Lcom/qihoo/security/floatview/ui/c;->i:I

    iget-object v3, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-virtual {v3}, Lcom/qihoo/security/floatview/ui/c;->getWidthOnSide()I

    move-result v3

    sub-int/2addr v2, v3

    if-lt v1, v2, :cond_0

    .line 84
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v1, v1, Lcom/qihoo/security/floatview/ui/c;->i:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-virtual {v2}, Lcom/qihoo/security/floatview/ui/c;->getWidthOnSide()I

    move-result v2

    sub-int/2addr v1, v2

    .line 85
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v2}, Lcom/qihoo/security/floatview/ui/c;->a(Lcom/qihoo/security/floatview/ui/c;)Landroid/widget/Scroller;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/Scroller;->abortAnimation()V

    .line 86
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v2, v4}, Lcom/qihoo/security/floatview/ui/c;->a(Lcom/qihoo/security/floatview/ui/c;Z)Z

    .line 87
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v2}, Lcom/qihoo/security/floatview/ui/c;->b(Lcom/qihoo/security/floatview/ui/c;)V

    .line 88
    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v2}, Lcom/qihoo/security/floatview/ui/c;->c(Lcom/qihoo/security/floatview/ui/c;)V

    .line 90
    :cond_0
    if-gtz v1, :cond_1

    .line 92
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v1}, Lcom/qihoo/security/floatview/ui/c;->a(Lcom/qihoo/security/floatview/ui/c;)Landroid/widget/Scroller;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/Scroller;->abortAnimation()V

    .line 93
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v1, v4}, Lcom/qihoo/security/floatview/ui/c;->a(Lcom/qihoo/security/floatview/ui/c;Z)Z

    .line 94
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v1}, Lcom/qihoo/security/floatview/ui/c;->b(Lcom/qihoo/security/floatview/ui/c;)V

    .line 95
    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v1}, Lcom/qihoo/security/floatview/ui/c;->c(Lcom/qihoo/security/floatview/ui/c;)V

    move v1, v4

    .line 97
    :cond_1
    if-gez v0, :cond_b

    .line 100
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v0, v0, Lcom/qihoo/security/floatview/ui/c;->j:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-virtual {v2}, Lcom/qihoo/security/floatview/ui/c;->getHeight()I

    move-result v2

    sub-int/2addr v0, v2

    if-lt v4, v0, :cond_2

    .line 101
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v0, v0, Lcom/qihoo/security/floatview/ui/c;->j:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-virtual {v2}, Lcom/qihoo/security/floatview/ui/c;->getHeight()I

    move-result v2

    sub-int v4, v0, v2

    .line 103
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iput v1, v2, Lcom/qihoo/security/floatview/ui/c;->k:I

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 104
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iput v4, v1, Lcom/qihoo/security/floatview/ui/c;->m:I

    iput v4, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 105
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->d(Lcom/qihoo/security/floatview/ui/c;)Lcom/qihoo/security/floatview/ui/c$b;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v0, v0, Lcom/qihoo/security/floatview/ui/c;->k:I

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v1, v1, Lcom/qihoo/security/floatview/ui/c;->l:I

    if-eq v0, v1, :cond_3

    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v0, v0, Lcom/qihoo/security/floatview/ui/c;->m:I

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v1, v1, Lcom/qihoo/security/floatview/ui/c;->n:I

    if-eq v0, v1, :cond_3

    .line 106
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->d(Lcom/qihoo/security/floatview/ui/c;)Lcom/qihoo/security/floatview/ui/c$b;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v1, v1, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v2, v2, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    invoke-interface {v0, v1, v2}, Lcom/qihoo/security/floatview/ui/c$b;->a(II)V

    .line 108
    :cond_3
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v1, v1, Lcom/qihoo/security/floatview/ui/c;->i:I

    div-int/lit8 v1, v1, 0x2

    if-lt v0, v1, :cond_6

    .line 109
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/c;->setSide(I)V

    .line 113
    :goto_2
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-virtual {v0}, Lcom/qihoo/security/floatview/ui/c;->isShown()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 114
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v1, v1, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/c;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 116
    :cond_4
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v1, v1, Lcom/qihoo/security/floatview/ui/c;->k:I

    iput v1, v0, Lcom/qihoo/security/floatview/ui/c;->l:I

    .line 117
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v1, v1, Lcom/qihoo/security/floatview/ui/c;->m:I

    iput v1, v0, Lcom/qihoo/security/floatview/ui/c;->n:I

    .line 118
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->e(Lcom/qihoo/security/floatview/ui/c;)Landroid/os/Handler;

    move-result-object v0

    const-wide/16 v2, 0x14

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 137
    :cond_5
    :goto_3
    return-void

    .line 111
    :cond_6
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/floatview/ui/c;->setSide(I)V

    goto :goto_2

    .line 120
    :cond_7
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->f(Lcom/qihoo/security/floatview/ui/c;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 121
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->g(Lcom/qihoo/security/floatview/ui/c;)Z

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v1, v1, Lcom/qihoo/security/floatview/ui/c;->i:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-virtual {v2}, Lcom/qihoo/security/floatview/ui/c;->getWidthOnSide()I

    move-result v2

    sub-int/2addr v1, v2

    if-eq v0, v1, :cond_9

    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    if-eqz v0, :cond_9

    .line 122
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v0, v0, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v1, v1, Lcom/qihoo/security/floatview/ui/c;->i:I

    div-int/lit8 v1, v1, 0x2

    if-lt v0, v1, :cond_8

    .line 123
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->a(Lcom/qihoo/security/floatview/ui/c;)Landroid/widget/Scroller;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v1, v1, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v2, v2, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    iget-object v3, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v3, v3, Lcom/qihoo/security/floatview/ui/c;->i:I

    iget-object v5, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-virtual {v5}, Lcom/qihoo/security/floatview/ui/c;->getWidthOnSide()I

    move-result v5

    sub-int/2addr v3, v5

    iget-object v5, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v5, v5, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v5, v5, Landroid/view/WindowManager$LayoutParams;->x:I

    sub-int/2addr v3, v5

    iget-object v5, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget v5, v5, Lcom/qihoo/security/floatview/ui/c;->i:I

    iget-object v6, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-virtual {v6}, Lcom/qihoo/security/floatview/ui/c;->getWidthOnSide()I

    move-result v6

    sub-int/2addr v5, v6

    iget-object v6, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v6, v6, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v6, v6, Landroid/view/WindowManager$LayoutParams;->x:I

    sub-int/2addr v5, v6

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    .line 128
    :goto_4
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->e(Lcom/qihoo/security/floatview/ui/c;)Landroid/os/Handler;

    move-result-object v0

    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_3

    .line 126
    :cond_8
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->a(Lcom/qihoo/security/floatview/ui/c;)Landroid/widget/Scroller;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v1, v1, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v1, v1, Landroid/view/WindowManager$LayoutParams;->x:I

    iget-object v2, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v2, v2, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v2, v2, Landroid/view/WindowManager$LayoutParams;->y:I

    iget-object v3, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v3, v3, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v3, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    neg-int v3, v3

    iget-object v5, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    iget-object v5, v5, Lcom/qihoo/security/floatview/ui/c;->h:Landroid/view/WindowManager$LayoutParams;

    iget v5, v5, Landroid/view/WindowManager$LayoutParams;->x:I

    invoke-static {v5}, Ljava/lang/Math;->abs(I)I

    move-result v5

    div-int/lit8 v5, v5, 0x2

    invoke-virtual/range {v0 .. v5}, Landroid/widget/Scroller;->startScroll(IIIII)V

    goto :goto_4

    .line 130
    :cond_9
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0, v4}, Lcom/qihoo/security/floatview/ui/c;->a(Lcom/qihoo/security/floatview/ui/c;Z)Z

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->g(Lcom/qihoo/security/floatview/ui/c;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 132
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->b(Lcom/qihoo/security/floatview/ui/c;)V

    .line 134
    :cond_a
    iget-object v0, p0, Lcom/qihoo/security/floatview/ui/c$1;->a:Lcom/qihoo/security/floatview/ui/c;

    invoke-static {v0}, Lcom/qihoo/security/floatview/ui/c;->c(Lcom/qihoo/security/floatview/ui/c;)V

    goto/16 :goto_3

    .line 78
    :catch_0
    move-exception v1

    goto/16 :goto_0

    :cond_b
    move v4, v0

    goto/16 :goto_1
.end method
