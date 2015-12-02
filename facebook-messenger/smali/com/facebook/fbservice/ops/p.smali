.class public Lcom/facebook/fbservice/ops/p;
.super Ljava/lang/Object;
.source "DefaultBlueServiceOperationFactory.java"

# interfaces
.implements Lcom/facebook/fbservice/ops/k;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/fbservice/service/p;

.field private final c:Lcom/facebook/common/executors/a;

.field private final d:Lcom/facebook/auth/viewercontext/e;

.field private final e:Lcom/facebook/common/process/d;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/fbservice/service/p;Lcom/facebook/common/executors/a;Lcom/facebook/auth/viewercontext/e;Lcom/facebook/common/process/d;)V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Lcom/facebook/fbservice/ops/p;->a:Landroid/content/Context;

    .line 76
    iput-object p2, p0, Lcom/facebook/fbservice/ops/p;->b:Lcom/facebook/fbservice/service/p;

    .line 77
    iput-object p3, p0, Lcom/facebook/fbservice/ops/p;->c:Lcom/facebook/common/executors/a;

    .line 78
    iput-object p4, p0, Lcom/facebook/fbservice/ops/p;->d:Lcom/facebook/auth/viewercontext/e;

    .line 79
    iput-object p5, p0, Lcom/facebook/fbservice/ops/p;->e:Lcom/facebook/common/process/d;

    .line 80
    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/m;
    .locals 1

    .prologue
    .line 52
    invoke-virtual {p0, p1, p2}, Lcom/facebook/fbservice/ops/p;->b(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/r;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;)Lcom/facebook/fbservice/ops/r;
    .locals 8

    .prologue
    .line 86
    invoke-static {p1}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    invoke-static {p2}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 88
    new-instance v0, Lcom/facebook/fbservice/ops/r;

    iget-object v3, p0, Lcom/facebook/fbservice/ops/p;->a:Landroid/content/Context;

    iget-object v4, p0, Lcom/facebook/fbservice/ops/p;->b:Lcom/facebook/fbservice/service/p;

    iget-object v5, p0, Lcom/facebook/fbservice/ops/p;->c:Lcom/facebook/common/executors/a;

    iget-object v6, p0, Lcom/facebook/fbservice/ops/p;->d:Lcom/facebook/auth/viewercontext/e;

    iget-object v7, p0, Lcom/facebook/fbservice/ops/p;->e:Lcom/facebook/common/process/d;

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v7}, Lcom/facebook/fbservice/ops/r;-><init>(Lcom/facebook/fbservice/service/OperationType;Landroid/os/Bundle;Landroid/content/Context;Lcom/facebook/fbservice/service/p;Lcom/facebook/common/executors/a;Lcom/facebook/auth/viewercontext/e;Lcom/facebook/common/process/d;)V

    .line 96
    iget-object v1, p0, Lcom/facebook/fbservice/ops/p;->a:Landroid/content/Context;

    instance-of v1, v1, Lcom/facebook/common/d/c;

    if-eqz v1, :cond_0

    .line 97
    iget-object v1, p0, Lcom/facebook/fbservice/ops/p;->a:Landroid/content/Context;

    check-cast v1, Lcom/facebook/common/d/c;

    invoke-static {v0}, Lcom/facebook/fbservice/ops/r;->a(Lcom/facebook/fbservice/ops/r;)Lcom/facebook/common/d/e;

    move-result-object v2

    invoke-interface {v1, v2}, Lcom/facebook/common/d/c;->a(Lcom/facebook/common/d/e;)V

    .line 99
    :cond_0
    return-object v0
.end method
