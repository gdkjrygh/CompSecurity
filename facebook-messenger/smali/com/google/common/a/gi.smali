.class final Lcom/google/common/a/gi;
.super Lcom/google/common/a/k;
.source "Iterators.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/k",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:[Ljava/lang/Object;


# direct methods
.method constructor <init>(I[Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1008
    iput-object p2, p0, Lcom/google/common/a/gi;->a:[Ljava/lang/Object;

    invoke-direct {p0, p1}, Lcom/google/common/a/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method protected a(I)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TT;"
        }
    .end annotation

    .prologue
    .line 1010
    iget-object v0, p0, Lcom/google/common/a/gi;->a:[Ljava/lang/Object;

    aget-object v0, v0, p1

    return-object v0
.end method
