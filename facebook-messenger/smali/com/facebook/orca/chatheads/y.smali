.class Lcom/facebook/orca/chatheads/y;
.super Ljava/lang/Object;
.source "ChatHeadTextBubbleView.java"

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
.field final synthetic a:Lcom/facebook/orca/chatheads/v;


# direct methods
.method constructor <init>(Lcom/facebook/orca/chatheads/v;)V
    .locals 0

    .prologue
    .line 247
    iput-object p1, p0, Lcom/facebook/orca/chatheads/y;->a:Lcom/facebook/orca/chatheads/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 247
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/chatheads/y;->a(Ljava/lang/Void;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 257
    instance-of v0, p1, Ljava/util/concurrent/CancellationException;

    if-nez v0, :cond_0

    .line 258
    invoke-static {}, Lcom/facebook/orca/chatheads/v;->c()Ljava/lang/Class;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "handleTimeout onFailure: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;)V

    .line 260
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/Void;)V
    .locals 1

    .prologue
    .line 250
    iget-object v0, p0, Lcom/facebook/orca/chatheads/y;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/v;->b(Lcom/facebook/orca/chatheads/v;)Lcom/facebook/orca/chatheads/ab;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 251
    iget-object v0, p0, Lcom/facebook/orca/chatheads/y;->a:Lcom/facebook/orca/chatheads/v;

    invoke-static {v0}, Lcom/facebook/orca/chatheads/v;->b(Lcom/facebook/orca/chatheads/v;)Lcom/facebook/orca/chatheads/ab;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/orca/chatheads/ab;->a()V

    .line 253
    :cond_0
    return-void
.end method
