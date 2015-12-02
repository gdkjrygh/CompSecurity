.class Lcom/facebook/orca/chatheads/at;
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
.field final synthetic a:Lcom/google/common/d/a/ab;

.field final synthetic b:Lcom/facebook/orca/chatheads/al;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/al;Lcom/google/common/d/a/ab;)V
    .locals 0

    .prologue
    .line 1189
    iput-object p1, p0, Lcom/facebook/orca/chatheads/at;->b:Lcom/facebook/orca/chatheads/al;

    iput-object p2, p0, Lcom/facebook/orca/chatheads/at;->a:Lcom/google/common/d/a/ab;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1189
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/chatheads/at;->a(Ljava/lang/Void;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 1206
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_0

    .line 1207
    iget-object v0, p0, Lcom/facebook/orca/chatheads/at;->b:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->v(Lcom/facebook/orca/chatheads/al;)Lcom/facebook/common/e/h;

    move-result-object v0

    sget-object v1, Lcom/facebook/orca/chatheads/al;->a:Ljava/lang/Class;

    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "popupNewChatHead failed"

    invoke-interface {v0, v1, v2, p1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 1209
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/at;->a:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 1210
    return-void
.end method

.method public a(Ljava/lang/Void;)V
    .locals 3

    .prologue
    .line 1192
    iget-object v0, p0, Lcom/facebook/orca/chatheads/at;->b:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->a(Lcom/facebook/orca/chatheads/al;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1193
    iget-object v0, p0, Lcom/facebook/orca/chatheads/at;->a:Lcom/google/common/d/a/ab;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/common/d/a/ab;->a_(Ljava/lang/Object;)Z

    .line 1202
    :goto_0
    return-void

    .line 1196
    :cond_0
    iget-object v0, p0, Lcom/facebook/orca/chatheads/at;->b:Lcom/facebook/orca/chatheads/al;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/al;->u(Lcom/facebook/orca/chatheads/al;)Lcom/google/common/d/a/s;

    move-result-object v0

    new-instance v1, Lcom/facebook/orca/chatheads/au;

    invoke-direct {v1, p0}, Lcom/facebook/orca/chatheads/au;-><init>(Lcom/facebook/orca/chatheads/at;)V

    invoke-static {}, Lcom/google/common/d/a/w;->a()Lcom/google/common/d/a/u;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lcom/google/common/d/a/s;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    goto :goto_0
.end method
