.class final Lcom/google/common/a/cj;
.super Lcom/google/common/a/ci;
.source "CustomConcurrentHashMap.java"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/a/bj",
        "<TK;TV;>.com/google/common/a/ci;",
        "Ljava/util/Iterator",
        "<TK;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/bj;


# direct methods
.method constructor <init>(Lcom/google/common/a/bj;)V
    .locals 0

    .prologue
    .line 3753
    iput-object p1, p0, Lcom/google/common/a/cj;->a:Lcom/google/common/a/bj;

    invoke-direct {p0, p1}, Lcom/google/common/a/ci;-><init>(Lcom/google/common/a/bj;)V

    return-void
.end method


# virtual methods
.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    .prologue
    .line 3757
    invoke-virtual {p0}, Lcom/google/common/a/cj;->e()Lcom/google/common/a/dk;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/common/a/dk;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
