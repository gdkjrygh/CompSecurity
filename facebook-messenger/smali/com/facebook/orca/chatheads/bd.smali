.class Lcom/facebook/orca/chatheads/bd;
.super Ljava/lang/Object;
.source "ChatHeadWindowManager.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

.field final synthetic b:Lcom/facebook/messages/threads/model/ThreadViewSpec;

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Lcom/google/common/d/a/ab;

.field final synthetic e:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;Lcom/facebook/messages/threads/model/ThreadViewSpec;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;Lcom/google/common/d/a/ab;)V
    .locals 0

    .prologue
    .line 2710
    iput-object p1, p0, Lcom/facebook/orca/chatheads/bd;->e:Lcom/facebook/orca/chatheads/al;

    iput-object p2, p0, Lcom/facebook/orca/chatheads/bd;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iput-object p3, p0, Lcom/facebook/orca/chatheads/bd;->b:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iput-object p4, p0, Lcom/facebook/orca/chatheads/bd;->c:Ljava/lang/String;

    iput-object p5, p0, Lcom/facebook/orca/chatheads/bd;->d:Lcom/google/common/d/a/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 2710
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/chatheads/bd;->a(Ljava/lang/Void;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 2734
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_0

    const/4 v0, 0x3

    invoke-static {v0}, Lcom/facebook/debug/log/b;->b(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2735
    sget-object v0, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    const-string v1, "Got exception opening chat head popup space: "

    invoke-static {v0, v1, p1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 2737
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bd;->d:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->cancel(Z)Z

    .line 2738
    return-void
.end method

.method public a(Ljava/lang/Void;)V
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 2713
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bd;->e:Lcom/facebook/orca/chatheads/al;

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/al;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2730
    :goto_0
    return-void

    .line 2719
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bd;->e:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 2720
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bd;->e:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->b()Lcom/facebook/orca/chatheads/ef;

    move-result-object v0

    .line 2723
    new-instance v1, Landroid/graphics/PointF;

    invoke-direct {v1, v2, v2}, Landroid/graphics/PointF;-><init>(FF)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/chatheads/ef;->b(Landroid/graphics/PointF;)V

    .line 2725
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bd;->e:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->t(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/dc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/orca/chatheads/dc;->c()V

    .line 2727
    :cond_1
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bd;->e:Lcom/facebook/orca/chatheads/al;

    iget-object v1, p0, Lcom/facebook/orca/chatheads/bd;->e:Lcom/facebook/orca/chatheads/al;

    invoke-static {v1}, Lcom/facebook/orca/chatheads/al;->D(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/orca/chatheads/ak;

    move-result-object v1

    iget-object v2, p0, Lcom/facebook/orca/chatheads/bd;->a:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    invoke-virtual {v1, v2}, Lcom/facebook/orca/chatheads/ak;->d(Lcom/facebook/messages/threads/model/ThreadViewSpec;)Lcom/facebook/orca/chatheads/ag;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/orca/chatheads/al;->c(Lcom/facebook/orca/chatheads/al;Lcom/facebook/orca/chatheads/ag;)V

    .line 2728
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bd;->e:Lcom/facebook/orca/chatheads/al;

    const-string v1, "open"

    iget-object v2, p0, Lcom/facebook/orca/chatheads/bd;->b:Lcom/facebook/messages/threads/model/ThreadViewSpec;

    iget-object v3, p0, Lcom/facebook/orca/chatheads/bd;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;Ljava/lang/String;Lcom/facebook/messages/threads/model/ThreadViewSpec;Ljava/lang/String;)V

    .line 2729
    iget-object v0, p0, Lcom/facebook/orca/chatheads/bd;->d:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    goto :goto_0
.end method
