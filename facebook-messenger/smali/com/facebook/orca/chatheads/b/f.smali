.class public Lcom/facebook/orca/chatheads/b/f;
.super Lcom/facebook/orca/chatheads/dv;
.source "ChatHeadNuxBubbleWindow.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/orca/chatheads/dv",
        "<",
        "Lcom/facebook/orca/chatheads/b/a;",
        ">;"
    }
.end annotation


# instance fields
.field private final b:Landroid/content/Context;

.field private final c:Landroid/os/Handler;

.field private d:I

.field private e:I

.field private f:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/view/WindowManager;Landroid/os/Handler;)V
    .locals 1

    .prologue
    .line 37
    invoke-static {}, Lcom/facebook/orca/chatheads/b/f;->f()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    invoke-direct {p0, p2, v0}, Lcom/facebook/orca/chatheads/dv;-><init>(Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)V

    .line 38
    iput-object p1, p0, Lcom/facebook/orca/chatheads/b/f;->b:Landroid/content/Context;

    .line 39
    iput-object p3, p0, Lcom/facebook/orca/chatheads/b/f;->c:Landroid/os/Handler;

    .line 40
    const v0, 0x186a0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/f;->setX(I)V

    .line 41
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/f;->c(Z)V

    .line 42
    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/chatheads/b/f;)V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/b/f;->e()V

    return-void
.end method

.method private e()V
    .locals 2

    .prologue
    .line 92
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/a;->getWidth()I

    move-result v0

    if-lez v0, :cond_1

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/a;->getHeight()I

    move-result v0

    if-lez v0, :cond_1

    .line 94
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/a;->getOrigin()Lcom/facebook/orca/chatheads/b/e;

    move-result-object v0

    .line 95
    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->LEFT:Lcom/facebook/orca/chatheads/b/e;

    if-eq v0, v1, :cond_0

    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->RIGHT:Lcom/facebook/orca/chatheads/b/e;

    if-ne v0, v1, :cond_2

    .line 97
    :cond_0
    iget v0, p0, Lcom/facebook/orca/chatheads/b/f;->e:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/f;->setX(I)V

    .line 98
    iget v1, p0, Lcom/facebook/orca/chatheads/b/f;->f:I

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/a;->getHeight()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/f;->setY(I)V

    .line 105
    :cond_1
    :goto_0
    return-void

    .line 100
    :cond_2
    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->BOTTOM:Lcom/facebook/orca/chatheads/b/e;

    if-ne v0, v1, :cond_1

    .line 101
    iget v1, p0, Lcom/facebook/orca/chatheads/b/f;->e:I

    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/a;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    sub-int v0, v1, v0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/f;->setX(I)V

    .line 102
    iget v0, p0, Lcom/facebook/orca/chatheads/b/f;->f:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/f;->setY(I)V

    goto :goto_0
.end method

.method private static final f()Landroid/view/WindowManager$LayoutParams;
    .locals 6

    .prologue
    const/4 v1, -0x2

    .line 146
    new-instance v0, Landroid/view/WindowManager$LayoutParams;

    sget v3, Lcom/facebook/orca/chatheads/b/f;->a:I

    const v4, 0x1000300

    const/4 v5, -0x3

    move v2, v1

    invoke-direct/range {v0 .. v5}, Landroid/view/WindowManager$LayoutParams;-><init>(IIIII)V

    .line 155
    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 157
    return-object v0
.end method


# virtual methods
.method public a(I)V
    .locals 3

    .prologue
    .line 81
    iput p1, p0, Lcom/facebook/orca/chatheads/b/f;->d:I

    .line 82
    new-instance v0, Lcom/facebook/orca/chatheads/b/a;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/b/f;->b:Landroid/content/Context;

    iget v2, p0, Lcom/facebook/orca/chatheads/b/f;->d:I

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/chatheads/b/a;-><init>(Landroid/content/Context;I)V

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/f;->a(Landroid/view/View;)V

    .line 83
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    new-instance v1, Lcom/facebook/orca/chatheads/b/i;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/b/i;-><init>(Lcom/facebook/orca/chatheads/b/f;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/b/a;->setOnSizeChangedListener(Lcom/facebook/orca/chatheads/b/d;)V

    .line 89
    return-void
.end method

.method public a(JLcom/facebook/orca/chatheads/b/j;)V
    .locals 2

    .prologue
    .line 59
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/f;->c:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/f;->c:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/chatheads/b/h;

    invoke-direct {v1, p0, p3}, Lcom/facebook/orca/chatheads/b/h;-><init>(Lcom/facebook/orca/chatheads/b/f;Lcom/facebook/orca/chatheads/b/j;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 70
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->d()V

    .line 71
    return-void
.end method

.method public a(Lcom/facebook/orca/chatheads/b/e;)V
    .locals 2

    .prologue
    .line 111
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    .line 112
    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/a;->getOrigin()Lcom/facebook/orca/chatheads/b/e;

    move-result-object v1

    if-ne p1, v1, :cond_0

    .line 128
    :goto_0
    return-void

    .line 115
    :cond_0
    invoke-virtual {v0, p1}, Lcom/facebook/orca/chatheads/b/a;->setOrigin(Lcom/facebook/orca/chatheads/b/e;)V

    .line 118
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 119
    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->LEFT:Lcom/facebook/orca/chatheads/b/e;

    if-ne p1, v1, :cond_2

    .line 120
    const/16 v1, 0x33

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 127
    :cond_1
    :goto_1
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/b/f;->a(Landroid/view/WindowManager$LayoutParams;)V

    goto :goto_0

    .line 121
    :cond_2
    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->RIGHT:Lcom/facebook/orca/chatheads/b/e;

    if-ne p1, v1, :cond_3

    .line 122
    const/16 v1, 0x35

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    goto :goto_1

    .line 123
    :cond_3
    sget-object v1, Lcom/facebook/orca/chatheads/b/e;->BOTTOM:Lcom/facebook/orca/chatheads/b/e;

    if-ne p1, v1, :cond_1

    .line 124
    const/16 v1, 0x53

    iput v1, v0, Landroid/view/WindowManager$LayoutParams;->gravity:I

    goto :goto_1
.end method

.method public b()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 75
    iget-object v0, p0, Lcom/facebook/orca/chatheads/b/f;->c:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 76
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/b/a;->setOnSizeChangedListener(Lcom/facebook/orca/chatheads/b/d;)V

    .line 77
    invoke-super {p0}, Lcom/facebook/orca/chatheads/dv;->b()V

    .line 78
    return-void
.end method

.method public b(I)V
    .locals 0

    .prologue
    .line 131
    iput p1, p0, Lcom/facebook/orca/chatheads/b/f;->e:I

    .line 132
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/b/f;->e()V

    .line 134
    return-void
.end method

.method public c()V
    .locals 3

    .prologue
    .line 45
    invoke-static {}, Lcom/google/common/d/a/ab;->a()Lcom/google/common/d/a/ab;

    .line 46
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/a;->b()Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/b/g;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/b/g;-><init>(Lcom/facebook/orca/chatheads/b/f;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 52
    return-void
.end method

.method public d()V
    .locals 1

    .prologue
    .line 55
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/b/f;->h()Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/chatheads/b/a;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/b/a;->a()Lcom/google/common/d/a/s;

    .line 56
    return-void
.end method

.method public g(I)V
    .locals 0

    .prologue
    .line 137
    iput p1, p0, Lcom/facebook/orca/chatheads/b/f;->f:I

    .line 138
    invoke-direct {p0}, Lcom/facebook/orca/chatheads/b/f;->e()V

    .line 139
    return-void
.end method
