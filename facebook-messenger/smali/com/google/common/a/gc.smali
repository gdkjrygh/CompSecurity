.class final Lcom/google/common/a/gc;
.super Lcom/google/common/a/gf;
.source "Iterables.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/gf",
        "<TT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Iterable;


# direct methods
.method constructor <init>(Ljava/lang/Iterable;)V
    .locals 0

    .prologue
    .line 483
    iput-object p1, p0, Lcom/google/common/a/gc;->a:Ljava/lang/Iterable;

    invoke-direct {p0}, Lcom/google/common/a/gf;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<TT;>;"
        }
    .end annotation

    .prologue
    .line 486
    iget-object v0, p0, Lcom/google/common/a/gc;->a:Ljava/lang/Iterable;

    invoke-static {v0}, Lcom/google/common/a/gb;->d(Ljava/lang/Iterable;)Lcom/google/common/a/mh;

    move-result-object v0

    invoke-static {v0}, Lcom/google/common/a/gg;->e(Ljava/util/Iterator;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
