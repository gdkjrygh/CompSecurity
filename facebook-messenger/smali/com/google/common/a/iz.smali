.class abstract Lcom/google/common/a/iz;
.super Lcom/google/common/a/iy;
.source "Multimaps.java"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/iy",
        "<TK;TV;>;",
        "Ljava/util/Set",
        "<",
        "Ljava/util/Map$Entry",
        "<TK;TV;>;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 2075
    invoke-direct {p0}, Lcom/google/common/a/iy;-><init>()V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    .prologue
    .line 2082
    invoke-static {p0, p1}, Lcom/google/common/a/kl;->a(Ljava/util/Set;Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    .prologue
    .line 2078
    invoke-static {p0}, Lcom/google/common/a/kl;->a(Ljava/util/Set;)I

    move-result v0

    return v0
.end method
