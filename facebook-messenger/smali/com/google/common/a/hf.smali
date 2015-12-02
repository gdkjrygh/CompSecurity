.class Lcom/google/common/a/hf;
.super Lcom/google/common/a/w;
.source "LinkedListMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/w",
        "<TK;",
        "Ljava/util/Collection",
        "<TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/google/common/a/he;


# direct methods
.method constructor <init>(Lcom/google/common/a/he;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 1012
    iput-object p1, p0, Lcom/google/common/a/hf;->b:Lcom/google/common/a/he;

    iput-object p2, p0, Lcom/google/common/a/hf;->a:Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/common/a/w;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/util/Collection;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<TV;>;"
        }
    .end annotation

    .prologue
    .line 1018
    iget-object v0, p0, Lcom/google/common/a/hf;->b:Lcom/google/common/a/he;

    iget-object v0, v0, Lcom/google/common/a/he;->b:Lcom/google/common/a/hd;

    iget-object v0, v0, Lcom/google/common/a/hd;->a:Lcom/google/common/a/gw;

    iget-object v1, p0, Lcom/google/common/a/hf;->a:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lcom/google/common/a/gw;->b(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 1014
    iget-object v0, p0, Lcom/google/common/a/hf;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public synthetic getValue()Ljava/lang/Object;
    .locals 1

    .prologue
    .line 1012
    invoke-virtual {p0}, Lcom/google/common/a/hf;->a()Ljava/util/Collection;

    move-result-object v0

    return-object v0
.end method
