.class Lcom/google/common/a/jk;
.super Ljava/lang/Object;
.source "Multisets.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<",
        "Lcom/google/common/a/jg",
        "<TE;>;TE;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/common/a/jj;


# direct methods
.method constructor <init>(Lcom/google/common/a/jj;)V
    .locals 0

    .prologue
    .line 718
    iput-object p1, p0, Lcom/google/common/a/jk;->a:Lcom/google/common/a/jj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/common/a/jg;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/common/a/jg",
            "<TE;>;)TE;"
        }
    .end annotation

    .prologue
    .line 720
    invoke-interface {p1}, Lcom/google/common/a/jg;->a()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 718
    check-cast p1, Lcom/google/common/a/jg;

    invoke-virtual {p0, p1}, Lcom/google/common/a/jk;->a(Lcom/google/common/a/jg;)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
