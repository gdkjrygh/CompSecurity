.class public Lcom/facebook/orca/chatheads/dv;
.super Ljava/lang/Object;
.source "FloatingChatWindow.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Landroid/view/View;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# static fields
.field protected static final a:I


# instance fields
.field private final b:Landroid/view/WindowManager;

.field private c:Landroid/view/WindowManager$LayoutParams;

.field private d:Landroid/view/View;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation
.end field

.field private e:Z

.field private f:D

.field private g:Lcom/a/a/a;

.field private h:Lcom/google/common/d/a/s;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private i:Landroid/os/Handler;

.field private j:I

.field private k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 43
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-ge v0, v1, :cond_0

    const/16 v0, 0x7d2

    :goto_0
    sput v0, Lcom/facebook/orca/chatheads/dv;->a:I

    return-void

    :cond_0
    const/16 v0, 0x7d7

    goto :goto_0
.end method

.method public constructor <init>(Landroid/view/WindowManager;Landroid/view/WindowManager$LayoutParams;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dv;->b:Landroid/view/WindowManager;

    .line 80
    iput-object p2, p0, Lcom/facebook/orca/chatheads/dv;->c:Landroid/view/WindowManager$LayoutParams;

    .line 82
    iput-boolean v1, p0, Lcom/facebook/orca/chatheads/dv;->k:Z

    .line 83
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dv;->i:Landroid/os/Handler;

    .line 84
    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/dv;->b(Z)V

    .line 85
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dv;->c(Z)V

    .line 86
    return-void
.end method

.method private a(IZ)V
    .locals 3

    .prologue
    .line 386
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 388
    if-eqz p2, :cond_1

    .line 389
    iget v0, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    or-int/2addr v0, p1

    .line 393
    :goto_0
    iget v2, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    if-eq v0, v2, :cond_0

    .line 394
    iput v0, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 395
    invoke-virtual {p0, v1}, Lcom/facebook/orca/chatheads/dv;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 397
    :cond_0
    return-void

    .line 391
    :cond_1
    iget v0, v1, Landroid/view/WindowManager$LayoutParams;->flags:I

    xor-int/lit8 v2, p1, -0x1

    and-int/2addr v0, v2

    goto :goto_0
.end method


# virtual methods
.method protected a(FI)Lcom/google/common/d/a/s;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(FI)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 310
    iget-wide v0, p0, Lcom/facebook/orca/chatheads/dv;->f:D

    float-to-double v2, p1

    cmpl-double v0, v0, v2

    if-nez v0, :cond_1

    .line 311
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->h:Lcom/google/common/d/a/s;

    if-nez v0, :cond_0

    .line 312
    const/4 v0, 0x0

    invoke-static {v0}, Lcom/google/common/d/a/i;->a(Ljava/lang/Object;)Lcom/google/common/d/a/s;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dv;->h:Lcom/google/common/d/a/s;

    .line 314
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->h:Lcom/google/common/d/a/s;

    .line 328
    :goto_0
    return-object v0

    .line 317
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->g:Lcom/a/a/a;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->g:Lcom/a/a/a;

    invoke-virtual {v0}, Lcom/a/a/a;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 318
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->g:Lcom/a/a/a;

    invoke-virtual {v0}, Lcom/a/a/a;->b()V

    .line 321
    :cond_2
    float-to-double v0, p1

    iput-wide v0, p0, Lcom/facebook/orca/chatheads/dv;->f:D

    .line 323
    const-string v0, "alpha"

    const/4 v1, 0x1

    new-array v1, v1, [F

    const/4 v2, 0x0

    aput p1, v1, v2

    invoke-static {p0, v0, v1}, Lcom/a/a/q;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/a/a/q;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dv;->g:Lcom/a/a/a;

    .line 324
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->g:Lcom/a/a/a;

    int-to-long v1, p2

    invoke-virtual {v0, v1, v2}, Lcom/a/a/a;->a(J)Lcom/a/a/a;

    .line 325
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->g:Lcom/a/a/a;

    invoke-virtual {v0}, Lcom/a/a/a;->a()V

    .line 327
    new-instance v0, Lcom/facebook/ui/a/e;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dv;->g:Lcom/a/a/a;

    invoke-direct {v0, v1}, Lcom/facebook/ui/a/e;-><init>(Lcom/a/a/a;)V

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dv;->h:Lcom/google/common/d/a/s;

    .line 328
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->h:Lcom/google/common/d/a/s;

    goto :goto_0
.end method

.method public a()V
    .locals 3

    .prologue
    .line 113
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dv;->e:Z

    if-eqz v0, :cond_0

    .line 131
    :goto_0
    return-void

    .line 117
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->b:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dv;->d:Landroid/view/View;

    iget-object v2, p0, Lcom/facebook/orca/chatheads/dv;->c:Landroid/view/WindowManager$LayoutParams;

    invoke-interface {v0, v1, v2}, Landroid/view/WindowManager;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 119
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/dv;->e:Z

    .line 125
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->i:Landroid/os/Handler;

    new-instance v1, Lcom/facebook/orca/chatheads/dw;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/dw;-><init>(Lcom/facebook/orca/chatheads/dv;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0
.end method

.method public a(Landroid/view/View;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 96
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->d:Landroid/view/View;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 99
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dv;->d:Landroid/view/View;

    .line 100
    return-void

    .line 97
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method protected a(Landroid/view/WindowManager$LayoutParams;)V
    .locals 2

    .prologue
    .line 348
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dv;->e:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/facebook/orca/chatheads/dv;->j:I

    if-nez v0, :cond_0

    .line 349
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->b:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dv;->d:Landroid/view/View;

    invoke-interface {v0, v1, p1}, Landroid/view/WindowManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 350
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/dv;->k:Z

    .line 355
    :goto_0
    return-void

    .line 352
    :cond_0
    iput-object p1, p0, Lcom/facebook/orca/chatheads/dv;->c:Landroid/view/WindowManager$LayoutParams;

    .line 353
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/dv;->k:Z

    goto :goto_0
.end method

.method public b()V
    .locals 2

    .prologue
    .line 141
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dv;->e:Z

    if-nez v0, :cond_0

    .line 149
    :goto_0
    return-void

    .line 145
    :cond_0
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dv;->c:Landroid/view/WindowManager$LayoutParams;

    .line 146
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->b:Landroid/view/WindowManager;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/dv;->d:Landroid/view/View;

    invoke-interface {v0, v1}, Landroid/view/WindowManager;->removeView(Landroid/view/View;)V

    .line 148
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/facebook/orca/chatheads/dv;->e:Z

    goto :goto_0
.end method

.method protected b(Z)V
    .locals 2

    .prologue
    .line 255
    const/16 v1, 0x10

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/chatheads/dv;->a(IZ)V

    .line 256
    return-void

    .line 255
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public c(I)V
    .locals 2

    .prologue
    .line 220
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 221
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    if-eq v1, p1, :cond_0

    .line 222
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 223
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dv;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 225
    :cond_0
    return-void
.end method

.method protected c(Z)V
    .locals 2

    .prologue
    .line 262
    const/16 v1, 0x8

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/chatheads/dv;->a(IZ)V

    .line 263
    return-void

    .line 262
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public d(I)V
    .locals 2

    .prologue
    .line 238
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 239
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    if-eq v1, p1, :cond_0

    .line 240
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 241
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dv;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 243
    :cond_0
    return-void
.end method

.method public e(I)Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 296
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {p0, v0, p1}, Lcom/facebook/orca/chatheads/dv;->a(FI)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public f(I)Lcom/google/common/d/a/s;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/google/common/d/a/s",
            "<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    .prologue
    .line 303
    const/4 v0, 0x0

    invoke-virtual {p0, v0, p1}, Lcom/facebook/orca/chatheads/dv;->a(FI)Lcom/google/common/d/a/s;

    move-result-object v0

    return-object v0
.end method

.method public getAlpha()F
    .locals 1

    .prologue
    .line 289
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->alpha:F

    return v0
.end method

.method public getX()I
    .locals 1

    .prologue
    .line 168
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    return v0
.end method

.method public getY()I
    .locals 1

    .prologue
    .line 194
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iget v0, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    return v0
.end method

.method public h()Landroid/view/View;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .prologue
    .line 106
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->d:Landroid/view/View;

    return-object v0
.end method

.method public i()Z
    .locals 1

    .prologue
    .line 134
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dv;->e:Z

    return v0
.end method

.method public j()V
    .locals 1

    .prologue
    .line 187
    const v0, 0x186a0

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dv;->setX(I)V

    .line 188
    return-void
.end method

.method protected k()Landroid/view/WindowManager$LayoutParams;
    .locals 1

    .prologue
    .line 336
    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dv;->e:Z

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/facebook/orca/chatheads/dv;->j:I

    if-nez v0, :cond_0

    .line 337
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->d:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/view/WindowManager$LayoutParams;

    .line 340
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->c:Landroid/view/WindowManager$LayoutParams;

    goto :goto_0
.end method

.method public l()V
    .locals 2

    .prologue
    .line 365
    iget v0, p0, Lcom/facebook/orca/chatheads/dv;->j:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/facebook/orca/chatheads/dv;->j:I

    if-nez v0, :cond_0

    .line 366
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/orca/chatheads/dv;->c:Landroid/view/WindowManager$LayoutParams;

    .line 368
    :cond_0
    return-void
.end method

.method public m()V
    .locals 1

    .prologue
    .line 375
    iget v0, p0, Lcom/facebook/orca/chatheads/dv;->j:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lcom/facebook/orca/chatheads/dv;->j:I

    if-nez v0, :cond_0

    iget-boolean v0, p0, Lcom/facebook/orca/chatheads/dv;->k:Z

    if-eqz v0, :cond_0

    .line 376
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->c:Landroid/view/WindowManager$LayoutParams;

    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dv;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 378
    :cond_0
    return-void
.end method

.method public setAlpha(F)V
    .locals 2

    .prologue
    .line 277
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 278
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->alpha:F

    cmpl-float v1, v1, p1

    if-eqz v1, :cond_0

    .line 279
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->alpha:F

    .line 280
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dv;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 282
    :cond_0
    return-void
.end method

.method public setX(I)V
    .locals 2

    .prologue
    .line 175
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 176
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 177
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    if-eq v1, p1, :cond_0

    .line 178
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 179
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dv;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 181
    :cond_0
    return-void
.end method

.method public setY(I)V
    .locals 2

    .prologue
    .line 201
    iget-object v0, p0, Lcom/facebook/orca/chatheads/dv;->i:Landroid/os/Handler;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 202
    invoke-virtual {p0}, Lcom/facebook/orca/chatheads/dv;->k()Landroid/view/WindowManager$LayoutParams;

    move-result-object v0

    .line 203
    iget v1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    if-eq v1, p1, :cond_0

    .line 204
    iput p1, v0, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 205
    invoke-virtual {p0, v0}, Lcom/facebook/orca/chatheads/dv;->a(Landroid/view/WindowManager$LayoutParams;)V

    .line 207
    :cond_0
    return-void
.end method
