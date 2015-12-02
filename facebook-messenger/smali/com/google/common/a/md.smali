.class Lcom/google/common/a/md;
.super Lcom/google/common/a/k;
.source "TransformedImmutableList.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/k",
        "<TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/mc;


# direct methods
.method constructor <init>(Lcom/google/common/a/mc;II)V
    .locals 0

    .prologue
    .line 82
    iput-object p1, p0, Lcom/google/common/a/md;->a:Lcom/google/common/a/mc;

    invoke-direct {p0, p2, p3}, Lcom/google/common/a/k;-><init>(II)V

    return-void
.end method


# virtual methods
.method protected a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    .prologue
    .line 84
    iget-object v0, p0, Lcom/google/common/a/md;->a:Lcom/google/common/a/mc;

    invoke-virtual {v0, p1}, Lcom/google/common/a/mc;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
