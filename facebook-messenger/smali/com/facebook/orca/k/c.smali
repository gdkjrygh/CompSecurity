.class Lcom/facebook/orca/k/c;
.super Ljava/lang/Object;
.source "GeocodingForMessageLocationExecutor.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<",
        "Ljava/util/List",
        "<",
        "Lcom/facebook/location/g;",
        ">;",
        "Lcom/facebook/orca/k/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/facebook/orca/k/b;


# direct methods
.method constructor <init>(Lcom/facebook/orca/k/b;)V
    .locals 0

    .prologue
    .line 50
    iput-object p1, p0, Lcom/facebook/orca/k/c;->a:Lcom/facebook/orca/k/b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;)Lcom/facebook/orca/k/d;
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/facebook/location/g;",
            ">;)",
            "Lcom/facebook/orca/k/d;"
        }
    .end annotation

    .prologue
    .line 53
    new-instance v2, Lcom/facebook/orca/k/d;

    const/4 v0, 0x1

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/location/g;

    const/4 v1, 0x0

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/location/g;

    invoke-direct {v2, v0, v1}, Lcom/facebook/orca/k/d;-><init>(Lcom/facebook/location/g;Lcom/facebook/location/g;)V

    return-object v2
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 50
    check-cast p1, Ljava/util/List;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/k/c;->a(Ljava/util/List;)Lcom/facebook/orca/k/d;

    move-result-object v0

    return-object v0
.end method
