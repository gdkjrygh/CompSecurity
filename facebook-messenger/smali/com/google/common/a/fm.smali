.class Lcom/google/common/a/fm;
.super Lcom/google/common/a/k;
.source "ImmutableSet.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/k",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/fl;


# direct methods
.method constructor <init>(Lcom/google/common/a/fl;I)V
    .locals 0

    .prologue
    .line 485
    iput-object p1, p0, Lcom/google/common/a/fm;->a:Lcom/google/common/a/fl;

    invoke-direct {p0, p2}, Lcom/google/common/a/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected a(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 487
    iget-object v0, p0, Lcom/google/common/a/fm;->a:Lcom/google/common/a/fl;

    iget-object v1, p0, Lcom/google/common/a/fm;->a:Lcom/google/common/a/fl;

    iget-object v1, v1, Lcom/google/common/a/fl;->a:[Ljava/lang/Object;

    aget-object v1, v1, p1

    invoke-virtual {v0, v1}, Lcom/google/common/a/fl;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
