.class Lcom/facebook/orca/photos/b/c;
.super Ljava/lang/Object;
.source "MessengerPhotoResizeExperiment.java"

# interfaces
.implements Lcom/facebook/abtest/qe/d/c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/abtest/qe/d/c",
        "<",
        "Lcom/facebook/orca/photos/b/e;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/facebook/orca/photos/b/b;)V
    .locals 0

    .prologue
    .line 59
    invoke-direct {p0}, Lcom/facebook/orca/photos/b/c;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic a(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 59
    invoke-virtual {p0, p1}, Lcom/facebook/orca/photos/b/c;->b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/photos/b/e;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/facebook/abtest/qe/data/QuickExperimentInfo;)Lcom/facebook/orca/photos/b/e;
    .locals 5

    .prologue
    .line 66
    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->c()Z

    move-result v0

    if-nez v0, :cond_1

    .line 67
    :cond_0
    invoke-static {}, Lcom/facebook/orca/photos/b/a;->b()Lcom/facebook/orca/photos/b/e;

    move-result-object v0

    .line 83
    :goto_0
    return-object v0

    .line 71
    :cond_1
    sget-object v0, Lcom/facebook/orca/photos/b/a;->a:Lcom/google/common/a/ev;

    invoke-static {v0}, Lcom/google/common/a/ik;->a(Ljava/util/Map;)Ljava/util/HashMap;

    move-result-object v2

    .line 73
    sget-object v0, Lcom/facebook/orca/photos/b/a;->a:Lcom/google/common/a/ev;

    invoke-virtual {v0}, Lcom/google/common/a/ev;->i_()Lcom/google/common/a/fi;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/fi;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 74
    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/base/Optional;->isPresent()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 75
    invoke-virtual {p1, v0}, Lcom/facebook/abtest/qe/data/QuickExperimentInfo;->a(Ljava/lang/String;)Lcom/google/common/base/Optional;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/common/base/Optional;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    .line 76
    if-ltz v1, :cond_2

    .line 77
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    .line 83
    :cond_3
    new-instance v1, Lcom/facebook/orca/photos/b/e;

    const-string v0, "width"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    const-string v0, "height"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v4

    const-string v0, "quality"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-direct {v1, v3, v4, v0}, Lcom/facebook/orca/photos/b/e;-><init>(III)V

    move-object v0, v1

    goto :goto_0
.end method
