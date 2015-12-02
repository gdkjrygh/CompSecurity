.class public final Lcom/google/common/d/a/ab;
.super Lcom/google/common/d/a/a;
.source "SettableFuture.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/d/a/a",
        "<TV;>;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .prologue
    .line 41
    invoke-direct {p0}, Lcom/google/common/d/a/a;-><init>()V

    return-void
.end method

.method public static a()Lcom/google/common/d/a/ab;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<V:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/google/common/d/a/ab",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 34
    new-instance v0, Lcom/google/common/d/a/ab;

    invoke-direct {v0}, Lcom/google/common/d/a/ab;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a_(Ljava/lang/Object;)Z
    .locals 1
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)Z"
        }
    .end annotation

    .prologue
    .line 53
    invoke-super {p0, p1}, Lcom/google/common/d/a/a;->a_(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public a_(Ljava/lang/Throwable;)Z
    .locals 1

    .prologue
    .line 68
    invoke-super {p0, p1}, Lcom/google/common/d/a/a;->a_(Ljava/lang/Throwable;)Z

    move-result v0

    return v0
.end method
