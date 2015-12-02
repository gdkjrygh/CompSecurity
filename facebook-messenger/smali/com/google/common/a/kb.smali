.class final Lcom/google/common/a/kb;
.super Lcom/google/common/a/eq;
.source "RegularImmutableMap.java"

# interfaces
.implements Lcom/google/common/a/jz;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/eq",
        "<TK;TV;>;",
        "Lcom/google/common/a/jz",
        "<TK;TV;>;"
    }
.end annotation

.annotation build Ljavax/annotation/concurrent/Immutable;
.end annotation


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)V"
        }
    .end annotation

    .prologue
    .line 134
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/eq;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    return-void
.end method


# virtual methods
.method public a()Lcom/google/common/a/jz;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/jz",
            "<TK;TV;>;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .prologue
    .line 138
    const/4 v0, 0x0

    return-object v0
.end method
