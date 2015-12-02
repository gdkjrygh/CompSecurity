.class public Lcom/facebook/fbservice/a/a;
.super Ljava/lang/Object;
.source "RemoteProxyHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# instance fields
.field private final a:Lcom/facebook/fbservice/service/p;

.field private final b:Lcom/facebook/fbservice/ops/k;

.field private final c:Landroid/content/Context;


# direct methods
.method public constructor <init>(Lcom/facebook/fbservice/service/p;Lcom/facebook/fbservice/ops/k;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 36
    iput-object p1, p0, Lcom/facebook/fbservice/a/a;->a:Lcom/facebook/fbservice/service/p;

    .line 37
    iput-object p2, p0, Lcom/facebook/fbservice/a/a;->b:Lcom/facebook/fbservice/ops/k;

    .line 38
    iput-object p3, p0, Lcom/facebook/fbservice/a/a;->c:Landroid/content/Context;

    .line 39
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 43
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 45
    iget-object v1, p0, Lcom/facebook/fbservice/a/a;->a:Lcom/facebook/fbservice/service/p;

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/p;->d(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;

    move-result-object v1

    .line 47
    iget-object v2, p0, Lcom/facebook/fbservice/a/a;->a:Lcom/facebook/fbservice/service/p;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationType;->d()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/facebook/fbservice/service/p;->d(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;

    move-result-object v2

    .line 51
    if-ne v1, v2, :cond_0

    .line 52
    iget-object v1, p0, Lcom/facebook/fbservice/a/a;->a:Lcom/facebook/fbservice/service/p;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationType;->d()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/facebook/fbservice/service/p;->a(Lcom/facebook/fbservice/service/OperationType;)Ljava/lang/Class;

    move-result-object v0

    .line 54
    iget-object v1, p0, Lcom/facebook/fbservice/a/a;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 55
    const-class v2, Lcom/facebook/fbservice/service/e;

    invoke-virtual {v1, v2, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/e;

    .line 56
    invoke-interface {v0, p1}, Lcom/facebook/fbservice/service/e;->a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    .line 63
    :goto_0
    return-object v0

    .line 60
    :cond_0
    iget-object v1, p0, Lcom/facebook/fbservice/a/a;->b:Lcom/facebook/fbservice/ops/k;

    invoke-virtual {v0}, Lcom/facebook/fbservice/service/OperationType;->d()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/facebook/fbservice/ops/k;->a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/fbservice/ops/m;->b()Lcom/facebook/fbservice/ops/n;

    move-result-object v0

    .line 63
    invoke-interface {v0}, Lcom/google/common/d/a/s;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/OperationResult;

    goto :goto_0
.end method
