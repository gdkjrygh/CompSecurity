.class Lcom/google/common/a/hl;
.super Lcom/google/common/a/ji;
.source "LinkedListMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/ji",
        "<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/Object;

.field final synthetic b:Lcom/google/common/a/hk;


# direct methods
.method constructor <init>(Lcom/google/common/a/hk;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 798
    iput-object p1, p0, Lcom/google/common/a/hl;->b:Lcom/google/common/a/hk;

    iput-object p2, p0, Lcom/google/common/a/hl;->a:Ljava/lang/Object;

    invoke-direct {p0}, Lcom/google/common/a/ji;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 801
    iget-object v0, p0, Lcom/google/common/a/hl;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public b()I
    .locals 2

    .prologue
    .line 805
    iget-object v0, p0, Lcom/google/common/a/hl;->b:Lcom/google/common/a/hk;

    iget-object v0, v0, Lcom/google/common/a/hk;->b:Lcom/google/common/a/hj;

    iget-object v0, v0, Lcom/google/common/a/hj;->a:Lcom/google/common/a/hh;

    iget-object v0, v0, Lcom/google/common/a/hh;->a:Lcom/google/common/a/gw;

    invoke-static {v0}, Lcom/google/common/a/gw;->d(Lcom/google/common/a/gw;)Lcom/google/common/a/jf;

    move-result-object v0

    iget-object v1, p0, Lcom/google/common/a/hl;->a:Ljava/lang/Object;

    invoke-interface {v0, v1}, Lcom/google/common/a/jf;->a(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
