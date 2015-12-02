.class Lcom/google/common/a/z;
.super Lcom/google/common/a/iz;
.source "AbstractMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/iz",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/x;


# direct methods
.method constructor <init>(Lcom/google/common/a/x;)V
    .locals 0

    .prologue
    .line 1074
    iput-object p1, p0, Lcom/google/common/a/z;->a:Lcom/google/common/a/x;

    invoke-direct {p0}, Lcom/google/common/a/iz;-><init>()V

    return-void
.end method


# virtual methods
.method a()Lcom/google/common/a/iw;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/a/iw",
            "<TK;TV;>;"
        }
    .end annotation

    .prologue
    .line 1076
    iget-object v0, p0, Lcom/google/common/a/z;->a:Lcom/google/common/a/x;

    return-object v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator",
            "<",
            "Ljava/util/Map$Entry",
            "<TK;TV;>;>;"
        }
    .end annotation

    .prologue
    .line 1080
    iget-object v0, p0, Lcom/google/common/a/z;->a:Lcom/google/common/a/x;

    invoke-virtual {v0}, Lcom/google/common/a/x;->k()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
