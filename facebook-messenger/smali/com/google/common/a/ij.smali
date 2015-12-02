.class final Lcom/google/common/a/ij;
.super Lcom/google/common/a/eq;
.source "MapMaker.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/common/a/eq",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field private final a:Lcom/google/common/a/ic;


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lcom/google/common/a/ic;)V
    .locals 0
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
            "(TK;TV;",
            "Lcom/google/common/a/ic;",
            ")V"
        }
    .end annotation

    .prologue
    .line 819
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/eq;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 820
    iput-object p3, p0, Lcom/google/common/a/ij;->a:Lcom/google/common/a/ic;

    .line 821
    return-void
.end method
