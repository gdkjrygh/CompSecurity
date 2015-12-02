.class Lcom/facebook/orca/reflex/f;
.super Ljava/lang/Object;
.source "ReflexThreadListExperiment.java"

# interfaces
.implements Lcom/facebook/abtest/qe/d/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/abtest/qe/d/c",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/reflex/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/reflex/e;)V
    .locals 0

    .prologue
    .line 36
    iput-object p1, p0, Lcom/facebook/orca/reflex/f;->a:Lcom/facebook/orca/reflex/e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 36
    invoke-virtual {p0, p1}, Lcom/facebook/orca/reflex/f;->b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Ljava/lang/Boolean;
    .locals 3

    .prologue
    .line 39
    const/4 v0, 0x0

    .line 40
    const-string v1, "useReflex"

    invoke-virtual {p1, v1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v1

    .line 42
    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 43
    invoke-virtual {v1}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    move-result v0

    .line 45
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    return-object v0
.end method
