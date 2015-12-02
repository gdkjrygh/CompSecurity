.class public final Lcom/google/common/a/ee;
.super Lcom/google/common/a/a;
.source "HashBiMap.java"


# annotations
.annotation build Lcom/google/common/annotations/GwtCompatible;
.end annotation

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
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 73
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    invoke-direct {p0, v0, v1}, Lcom/google/common/a/a;-><init>(Ljava/util/Map;Ljava/util/Map;)V

    .line 74
    return-void
.end method

.method public static e()Lcom/google/common/a/ee;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/a/ee",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 46
    new-instance v0, Lcom/google/common/a/ee;

    invoke-direct {v0}, Lcom/google/common/a/ee;-><init>()V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic b()Lcom/google/common/a/av;
    .locals 1

    .prologue
    .line 38
    invoke-super {p0}, Lcom/google/common/a/a;->b()Lcom/google/common/a/av;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic clear()V
    .locals 0

    .prologue
    .line 38
    invoke-super {p0}, Lcom/google/common/a/a;->clear()V

    return-void
.end method

.method public bridge synthetic containsValue(Ljava/lang/Object;)Z
    .locals 1

    .prologue
    .line 38
    invoke-super {p0, p1}, Lcom/google/common/a/a;->containsValue(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public bridge synthetic d()Ljava/util/Set;
    .locals 1

    .prologue
    .line 38
    invoke-super {p0}, Lcom/google/common/a/a;->d()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic entrySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 38
    invoke-super {p0}, Lcom/google/common/a/a;->entrySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic keySet()Ljava/util/Set;
    .locals 1

    .prologue
    .line 38
    invoke-super {p0}, Lcom/google/common/a/a;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)TV;"
        }
    .end annotation

    .prologue
    .line 85
    invoke-super {p0, p1, p2}, Lcom/google/common/a/a;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic putAll(Ljava/util/Map;)V
    .locals 0

    .prologue
    .line 38
    invoke-super {p0, p1}, Lcom/google/common/a/a;->putAll(Ljava/util/Map;)V

    return-void
.end method

.method public bridge synthetic remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 38
    invoke-super {p0, p1}, Lcom/google/common/a/a;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
