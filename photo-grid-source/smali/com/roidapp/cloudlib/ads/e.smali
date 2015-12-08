.class public final Lcom/roidapp/cloudlib/ads/e;
.super Lcom/roidapp/cloudlib/ads/g;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/roidapp/cloudlib/ads/g",
        "<TT;>;",
        "Ljava/lang/Runnable;"
    }
.end annotation


# instance fields
.field private a:Lcom/roidapp/cloudlib/ads/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/roidapp/cloudlib/ads/g",
            "<TT;>;"
        }
    .end annotation
.end field

.field private b:Landroid/os/Handler;

.field private c:I

.field private d:I

.field private e:Z

.field private f:Z


# direct methods
.method public constructor <init>(Ljava/lang/Object;Lcom/roidapp/cloudlib/ads/g;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/roidapp/cloudlib/ads/g",
            "<TT;>;)V"
        }
    .end annotation

    .prologue
    .line 23
    invoke-direct {p0, p1}, Lcom/roidapp/cloudlib/ads/g;-><init>(Ljava/lang/Object;)V

    .line 24
    iput-object p2, p0, Lcom/roidapp/cloudlib/ads/e;->a:Lcom/roidapp/cloudlib/ads/g;

    .line 25
    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->b:Landroid/os/Handler;

    .line 26
    const/16 v0, 0x7530

    iput v0, p0, Lcom/roidapp/cloudlib/ads/e;->c:I

    .line 27
    const/4 v0, 0x0

    iput v0, p0, Lcom/roidapp/cloudlib/ads/e;->d:I

    .line 28
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 64
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/ads/e;->f()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 66
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->a:Lcom/roidapp/cloudlib/ads/g;

    if-eqz v0, :cond_0

    .line 67
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->a:Lcom/roidapp/cloudlib/ads/g;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/ads/g;->a(Ljava/lang/Object;)V

    .line 69
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/ads/e;->e:Z

    .line 70
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/ads/e;->f:Z

    if-nez v0, :cond_1

    .line 73
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->b:Landroid/os/Handler;

    if-eqz v0, :cond_1

    .line 74
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->b:Landroid/os/Handler;

    iget v1, p0, Lcom/roidapp/cloudlib/ads/e;->c:I

    int-to-long v2, v1

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 77
    :cond_1
    :goto_0
    return-void

    .line 76
    :cond_2
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/ads/e;->e()V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Object;Lcom/cmcm/a/a/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "Lcom/cmcm/a/a/a;",
            ")V"
        }
    .end annotation

    .prologue
    .line 86
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->a:Lcom/roidapp/cloudlib/ads/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->a:Lcom/roidapp/cloudlib/ads/g;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/cloudlib/ads/g;->a(Ljava/lang/Object;Lcom/cmcm/a/a/a;)V

    .line 87
    :cond_0
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 31
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/ads/e;->f:Z

    .line 33
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/ads/e;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 34
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->b:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 36
    :cond_0
    return-void
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .prologue
    .line 81
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->a:Lcom/roidapp/cloudlib/ads/g;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->a:Lcom/roidapp/cloudlib/ads/g;

    invoke-virtual {v0, p1}, Lcom/roidapp/cloudlib/ads/g;->b(Ljava/lang/Object;)V

    .line 82
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 4

    .prologue
    .line 39
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/ads/e;->f:Z

    .line 41
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/ads/e;->e:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    .line 42
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->b:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 43
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->b:Landroid/os/Handler;

    iget v1, p0, Lcom/roidapp/cloudlib/ads/e;->c:I

    int-to-long v2, v1

    invoke-virtual {v0, p0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 45
    :cond_0
    return-void
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 53
    iget v0, p0, Lcom/roidapp/cloudlib/ads/e;->d:I

    return v0
.end method

.method public final e()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 57
    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->b:Landroid/os/Handler;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/cloudlib/ads/e;->b:Landroid/os/Handler;

    invoke-virtual {v0, p0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 58
    :cond_0
    iput-object v1, p0, Lcom/roidapp/cloudlib/ads/e;->b:Landroid/os/Handler;

    .line 59
    iput-object v1, p0, Lcom/roidapp/cloudlib/ads/e;->a:Lcom/roidapp/cloudlib/ads/g;

    .line 60
    return-void
.end method

.method public final run()V
    .locals 1

    .prologue
    .line 91
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/ads/e;->e:Z

    .line 92
    iget v0, p0, Lcom/roidapp/cloudlib/ads/e;->d:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lcom/roidapp/cloudlib/ads/e;->d:I

    .line 93
    invoke-virtual {p0}, Lcom/roidapp/cloudlib/ads/e;->a()V

    .line 94
    return-void
.end method
