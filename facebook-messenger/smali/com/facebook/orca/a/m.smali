.class Lcom/facebook/orca/a/m;
.super Ljava/lang/Object;
.source "SendMessageParametersExperimentInitializer.java"

# interfaces
.implements Lcom/google/common/d/a/h;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/d/a/h",
        "<",
        "Lcom/facebook/abtest/qe/data/QuickExperimentInfo;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/a/k;


# direct methods
.method constructor <init>(Lcom/facebook/orca/a/k;)V
    .locals 0

    .prologue
    .line 69
    iput-object p1, p0, Lcom/facebook/orca/a/m;->a:Lcom/facebook/orca/a/k;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V
    .locals 2

    .prologue
    .line 72
    invoke-static {}, Lcom/facebook/orca/a/k;->c()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onSuccess"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 73
    iget-object v0, p0, Lcom/facebook/orca/a/m;->a:Lcom/facebook/orca/a/k;

    invoke-static {v0, p1}, Lcom/facebook/orca/a/k;->a(Lcom/facebook/orca/a/k;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V

    .line 74
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 69
    check-cast p1, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/a/m;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 2

    .prologue
    .line 77
    invoke-static {}, Lcom/facebook/orca/a/k;->c()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "failed to get experiment info, using defaults"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 78
    return-void
.end method
