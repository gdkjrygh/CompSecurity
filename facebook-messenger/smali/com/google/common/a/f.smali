.class Lcom/google/common/a/f;
.super Lcom/google/common/a/a;
.source "AbstractBiMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/a",
        "<TK;TV;>;"
    }
.end annotation


# direct methods
.method private constructor <init>(Ljava/util/Map;Lcom/google/common/a/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<TK;TV;>;",
            "Lcom/google/common/a/a",
            "<TV;TK;>;)V"
        }
    .end annotation

    .prologue
    .line 374
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lcom/google/common/a/a;-><init>(Ljava/util/Map;Lcom/google/common/a/a;Lcom/google/common/a/b;)V

    .line 375
    return-void
.end method

.method synthetic constructor <init>(Ljava/util/Map;Lcom/google/common/a/a;Lcom/google/common/a/b;)V
    .locals 0

    .prologue
    .line 372
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/f;-><init>(Ljava/util/Map;Lcom/google/common/a/a;)V

    return-void
.end method


# virtual methods
.method protected synthetic c()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 372
    invoke-super {p0}, Lcom/google/common/a/a;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public synthetic values()Ljava/util/Collection;
    .locals 1

    .prologue
    .line 372
    invoke-super {p0}, Lcom/google/common/a/a;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method
