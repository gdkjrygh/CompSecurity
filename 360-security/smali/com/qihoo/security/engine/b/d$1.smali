.class Lcom/qihoo/security/engine/b/d$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/engine/b/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/engine/b/d;


# direct methods
.method constructor <init>(Lcom/qihoo/security/engine/b/d;)V
    .locals 0

    iput-object p1, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private a(II)V
    .locals 4

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/d;->m:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/d;->l:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/services/ScanResult;

    :cond_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    iget-object v1, v1, Lcom/qihoo/security/engine/b/d;->b:Lcom/qihoo/security/engine/b/c;

    new-instance v2, Lcom/qihoo/security/services/ScanProgress;

    iget-object v3, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v3}, Lcom/qihoo/security/engine/b/d;->g()I

    move-result v3

    invoke-direct {v2, v0, v3, p1, p2}, Lcom/qihoo/security/services/ScanProgress;-><init>(Lcom/qihoo/security/services/ScanResult;III)V

    const/4 v0, 0x0

    invoke-virtual {v1, v2, v0}, Lcom/qihoo/security/engine/b/c;->a(Lcom/qihoo/security/services/ScanProgress;Z)V

    :cond_1
    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    iget-boolean v0, v0, Lcom/qihoo/security/engine/b/d;->o:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/d;->d()V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/d;->i()I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v1}, Lcom/qihoo/security/engine/b/d;->h()I

    move-result v1

    iget-object v2, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    iget-boolean v2, v2, Lcom/qihoo/security/engine/b/d;->n:Z

    if-eqz v2, :cond_2

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    iget-object v1, v1, Lcom/qihoo/security/engine/b/d;->m:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    iget-object v1, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    iget-object v1, v1, Lcom/qihoo/security/engine/b/d;->b:Lcom/qihoo/security/engine/b/c;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/engine/b/c;->b(Ljava/util/List;)V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    invoke-virtual {v0}, Lcom/qihoo/security/engine/b/d;->d()V

    goto :goto_0

    :cond_2
    iget-object v2, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    iget-boolean v2, v2, Lcom/qihoo/security/engine/b/d;->p:Z

    if-nez v2, :cond_0

    invoke-direct {p0, v1, v0}, Lcom/qihoo/security/engine/b/d$1;->a(II)V

    iget-object v0, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    iget-object v0, v0, Lcom/qihoo/security/engine/b/d;->j:Landroid/os/Handler;

    iget-object v1, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    iget-object v1, v1, Lcom/qihoo/security/engine/b/d;->k:Ljava/lang/Runnable;

    iget-object v2, p0, Lcom/qihoo/security/engine/b/d$1;->a:Lcom/qihoo/security/engine/b/d;

    iget-wide v2, v2, Lcom/qihoo/security/engine/b/d;->g:J

    const-wide/16 v4, 0xc8

    invoke-static {v2, v3, v4, v5}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method
