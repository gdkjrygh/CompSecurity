.class Lcom/facebook/orca/a/f;
.super Ljava/lang/Object;
.source "MessengerGroupNameUpsellInitializer.java"

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
.field final synthetic a:Lcom/facebook/orca/a/d;


# direct methods
.method constructor <init>(Lcom/facebook/orca/a/d;)V
    .locals 0

    .prologue
    .line 89
    iput-object p1, p0, Lcom/facebook/orca/a/f;->a:Lcom/facebook/orca/a/d;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V
    .locals 2

    .prologue
    .line 92
    invoke-static {}, Lcom/facebook/orca/a/d;->d()Ljava/lang/Class;

    move-result-object v0

    const-string v1, "onSuccess"

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 93
    iget-object v0, p0, Lcom/facebook/orca/a/f;->a:Lcom/facebook/orca/a/d;

    invoke-static {v0, p1}, Lcom/facebook/orca/a/d;->a(Lcom/facebook/orca/a/d;Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V

    .line 94
    iget-object v0, p0, Lcom/facebook/orca/a/f;->a:Lcom/facebook/orca/a/d;

    sget-object v1, Lcom/facebook/orca/a/g;->INITIALIZED:Lcom/facebook/orca/a/g;

    invoke-static {v0, v1}, Lcom/facebook/orca/a/d;->a(Lcom/facebook/orca/a/d;Lcom/facebook/orca/a/g;)Lcom/facebook/orca/a/g;

    .line 95
    return-void
.end method

.method public bridge synthetic a(Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 89
    check-cast p1, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/a/f;->a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)V

    return-void
.end method

.method public a(Ljava/lang/Throwable;)V
    .locals 3

    .prologue
    .line 99
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "failed to get experiment info. Using fallback of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Lcom/facebook/orca/a/d;->e()Lcom/facebook/orca/a/b;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 101
    iget-object v1, p0, Lcom/facebook/orca/a/f;->a:Lcom/facebook/orca/a/d;

    sget-object v2, Lcom/facebook/orca/a/g;->UNINITIALIZED:Lcom/facebook/orca/a/g;

    invoke-static {v1, v2}, Lcom/facebook/orca/a/d;->a(Lcom/facebook/orca/a/d;Lcom/facebook/orca/a/g;)Lcom/facebook/orca/a/g;

    .line 102
    invoke-static {}, Lcom/facebook/orca/a/d;->d()Ljava/lang/Class;

    move-result-object v1

    invoke-static {v1, v0}, Lcom/facebook/debug/log/b;->d(Ljava/lang/Class;Ljava/lang/String;)V

    .line 103
    iget-object v1, p0, Lcom/facebook/orca/a/f;->a:Lcom/facebook/orca/a/d;

    invoke-static {v1}, Lcom/facebook/orca/a/d;->a(Lcom/facebook/orca/a/d;)Lcom/facebook/common/e/h;

    move-result-object v1

    invoke-static {}, Lcom/facebook/orca/a/d;->d()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v2, v0, p1}, Lcom/facebook/common/e/h;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 107
    return-void
.end method
