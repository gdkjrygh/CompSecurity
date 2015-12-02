.class public final Lcom/google/common/a/ek;
.super Lcom/google/common/a/ew;
.source "ImmutableBiMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/ew",
        "<TK;TV;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 143
    invoke-direct {p0}, Lcom/google/common/a/ew;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/ej;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/ej",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 172
    invoke-super {p0}, Lcom/google/common/a/ew;->b()Lcom/google/common/a/ev;

    move-result-object v1

    .line 173
    invoke-virtual {v1}, Lcom/google/common/a/ev;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 174
    invoke-static {}, Lcom/google/common/a/ej;->e()Lcom/google/common/a/ej;

    move-result-object v0

    .line 176
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Lcom/google/common/a/jt;

    invoke-direct {v0, v1}, Lcom/google/common/a/jt;-><init>(Lcom/google/common/a/ev;)V

    goto :goto_0
.end method

.method public a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ek;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lcom/google/common/a/ek",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 150
    invoke-super {p0, p1, p2}, Lcom/google/common/a/ew;->b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;

    .line 151
    return-object p0
.end method

.method public a(Ljava/util/Map;)Lcom/google/common/a/ek;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map",
            "<+TK;+TV;>;)",
            "Lcom/google/common/a/ek",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 162
    invoke-super {p0, p1}, Lcom/google/common/a/ew;->b(Ljava/util/Map;)Lcom/google/common/a/ew;

    .line 163
    return-object p0
.end method

.method public synthetic b()Lcom/google/common/a/ev;
    .locals 1

    .prologue
    .line 137
    invoke-virtual {p0}, Lcom/google/common/a/ek;->a()Lcom/google/common/a/ej;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ew;
    .locals 1

    .prologue
    .line 137
    invoke-virtual {p0, p1, p2}, Lcom/google/common/a/ek;->a(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/a/ek;

    move-result-object v0

    return-object v0
.end method

.method public synthetic b(Ljava/util/Map;)Lcom/google/common/a/ew;
    .locals 1

    .prologue
    .line 137
    invoke-virtual {p0, p1}, Lcom/google/common/a/ek;->a(Ljava/util/Map;)Lcom/google/common/a/ek;

    move-result-object v0

    return-object v0
.end method
