.class public Lcom/facebook/c/k;
.super Lcom/facebook/c/q;
.source "DynamicSecureBroadcastReceiver.java"


# instance fields
.field private final a:Lcom/google/common/a/ev;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/a/ev",
            "<",
            "Ljava/lang/String;",
            "Lcom/facebook/c/b;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/facebook/c/b;)V
    .locals 1

    .prologue
    .line 29
    invoke-static {p1, p2}, Lcom/google/common/a/ev;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ev;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/facebook/c/k;-><init>(Ljava/util/Map;)V

    .line 30
    return-void
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "+",
            "Lcom/facebook/c/b;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 18
    invoke-direct {p0}, Lcom/facebook/c/q;-><init>()V

    .line 19
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "Must include an entry for at least one action"

    invoke-static {v0, v1}, Lcom/google/common/base/Preconditions;->checkState(ZLjava/lang/Object;)V

    .line 21
    invoke-static {p1}, Lcom/google/common/a/ev;->a(Ljava/util/Map;)Lcom/google/common/a/ev;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/c/k;->a:Lcom/google/common/a/ev;

    .line 22
    return-void

    .line 20
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method protected final b(Landroid/content/Context;Landroid/content/Intent;)Lcom/google/common/base/Optional;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/content/Intent;",
            ")",
            "Lcom/google/common/base/Optional",
            "<",
            "Lcom/facebook/c/b;",
            ">;"
        }
    .end annotation

    .prologue
    .line 43
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 44
    const/4 v0, 0x0

    .line 45
    if-eqz v1, :cond_0

    .line 46
    iget-object v0, p0, Lcom/facebook/c/k;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0, v1}, Lcom/google/common/a/ev;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/b;

    .line 49
    :cond_0
    invoke-static {v0}, Lcom/google/common/base/Optional;->fromNullable(Ljava/lang/Object;)Lcom/google/common/base/Optional;

    move-result-object v0

    return-object v0
.end method

.method public final b()Ljava/lang/Iterable;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Iterable",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 34
    iget-object v0, p0, Lcom/facebook/c/k;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    return-object v0
.end method
