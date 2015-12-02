.class Lcom/facebook/i/a/e;
.super Ljava/lang/Object;
.source "PeerProcessManagerImpl.java"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/facebook/i/a/d;

.field private b:I


# direct methods
.method constructor <init>(Lcom/facebook/i/a/d;)V
    .locals 1

    .prologue
    .line 91
    iput-object p1, p0, Lcom/facebook/i/a/e;->a:Lcom/facebook/i/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    const/4 v0, 0x0

    iput v0, p0, Lcom/facebook/i/a/e;->b:I

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const-wide/32 v0, 0xea60

    .line 98
    iget-object v2, p0, Lcom/facebook/i/a/e;->a:Lcom/facebook/i/a/d;

    invoke-static {v2}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/d;)Landroid/content/Intent;

    move-result-object v2

    invoke-static {v2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    iget-object v2, p0, Lcom/facebook/i/a/e;->a:Lcom/facebook/i/a/d;

    invoke-static {v2}, Lcom/facebook/i/a/d;->b(Lcom/facebook/i/a/d;)Landroid/os/Handler;

    move-result-object v2

    invoke-static {v2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    iget-object v2, p0, Lcom/facebook/i/a/e;->a:Lcom/facebook/i/a/d;

    invoke-static {v2}, Lcom/facebook/i/a/d;->c(Lcom/facebook/i/a/d;)Lcom/facebook/base/broadcast/j;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/i/a/e;->a:Lcom/facebook/i/a/d;

    invoke-static {v3}, Lcom/facebook/i/a/d;->a(Lcom/facebook/i/a/d;)Landroid/content/Intent;

    move-result-object v3

    invoke-interface {v2, v3}, Lcom/facebook/base/broadcast/j;->a(Landroid/content/Intent;)V

    .line 101
    iget v2, p0, Lcom/facebook/i/a/e;->b:I

    add-int/lit8 v2, v2, 0x1

    iput v2, p0, Lcom/facebook/i/a/e;->b:I

    .line 102
    iget v2, p0, Lcom/facebook/i/a/e;->b:I

    const/4 v3, 0x5

    if-ge v2, v3, :cond_0

    .line 103
    const/4 v2, 0x1

    iget v3, p0, Lcom/facebook/i/a/e;->b:I

    shl-int/2addr v2, v3

    int-to-long v2, v2

    const-wide/16 v4, 0x3e8

    mul-long/2addr v2, v4

    .line 104
    cmp-long v4, v2, v0

    if-lez v4, :cond_1

    .line 107
    :goto_0
    iget-object v2, p0, Lcom/facebook/i/a/e;->a:Lcom/facebook/i/a/d;

    invoke-static {v2}, Lcom/facebook/i/a/d;->b(Lcom/facebook/i/a/d;)Landroid/os/Handler;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/i/a/e;->a:Lcom/facebook/i/a/d;

    invoke-static {v3}, Lcom/facebook/i/a/d;->d(Lcom/facebook/i/a/d;)Ljava/lang/Runnable;

    move-result-object v3

    invoke-virtual {v2, v3, v0, v1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 109
    :cond_0
    return-void

    :cond_1
    move-wide v0, v2

    goto :goto_0
.end method
