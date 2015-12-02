.class Lcom/google/common/a/ao;
.super Lcom/google/common/a/ak;
.source "AbstractMultimap.java"

# interfaces
.implements Ljava/util/Set;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/x",
        "<TK;TV;>.com/google/common/a/ak;",
        "Ljava/util/Set",
        "<TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/x;


# direct methods
.method constructor <init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/Set;)V
    .locals 1
    .param p2    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;",
            "Ljava/util/Set",
            "<TV;>;)V"
        }
    .end annotation

    .prologue
    .line 647
    iput-object p1, p0, Lcom/google/common/a/ao;->a:Lcom/google/common/a/x;

    .line 648
    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lcom/google/common/a/ak;-><init>(Lcom/google/common/a/x;Ljava/lang/Object;Ljava/util/Collection;Lcom/google/common/a/ak;)V

    .line 649
    return-void
.end method
