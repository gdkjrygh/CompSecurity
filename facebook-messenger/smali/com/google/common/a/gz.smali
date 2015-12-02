.class final Lcom/google/common/a/gz;
.super Lcom/google/common/a/w;
.source "LinkedListMultimap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/w",
        "<TK;TV;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/hm;


# direct methods
.method constructor <init>(Lcom/google/common/a/hm;)V
    .locals 0

    .prologue
    .line 898
    iput-object p1, p0, Lcom/google/common/a/gz;->a:Lcom/google/common/a/hm;

    invoke-direct {p0}, Lcom/google/common/a/w;-><init>()V

    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 900
    iget-object v0, p0, Lcom/google/common/a/gz;->a:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    .prologue
    .line 903
    iget-object v0, p0, Lcom/google/common/a/gz;->a:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->b:Ljava/lang/Object;

    return-object v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    .prologue
    .line 906
    iget-object v0, p0, Lcom/google/common/a/gz;->a:Lcom/google/common/a/hm;

    iget-object v0, v0, Lcom/google/common/a/hm;->b:Ljava/lang/Object;

    .line 907
    iget-object v1, p0, Lcom/google/common/a/gz;->a:Lcom/google/common/a/hm;

    iput-object p1, v1, Lcom/google/common/a/hm;->b:Ljava/lang/Object;

    .line 908
    return-object v0
.end method
