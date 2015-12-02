.class Lcom/google/common/a/hi;
.super Ljava/lang/Object;
.source "LinkedListMultimap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator",
        "<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/Iterator;

.field final synthetic b:Lcom/google/common/a/hh;


# direct methods
.method constructor <init>(Lcom/google/common/a/hh;Ljava/util/Iterator;)V
    .locals 0

    .prologue
    .line 719
    iput-object p1, p0, Lcom/google/common/a/hi;->b:Lcom/google/common/a/hh;

    iput-object p2, p0, Lcom/google/common/a/hi;->a:Ljava/util/Iterator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    .prologue
    .line 722
    iget-object v0, p0, Lcom/google/common/a/hi;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 726
    iget-object v0, p0, Lcom/google/common/a/hi;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public remove()V
    .locals 1

    .prologue
    .line 730
    iget-object v0, p0, Lcom/google/common/a/hi;->a:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 731
    return-void
.end method
