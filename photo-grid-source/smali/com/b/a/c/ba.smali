.class final Lcom/b/a/c/ba;
.super Lcom/b/a/c/bj;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/b/a/c/bf;Lcom/b/a/c/bk;)V
    .locals 3

    .prologue
    .line 284
    const/4 v0, 0x3

    const/4 v1, 0x2

    new-array v1, v1, [Lcom/b/a/c/bj;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 v2, 0x1

    aput-object p2, v1, v2

    invoke-direct {p0, v0, v1}, Lcom/b/a/c/bj;-><init>(I[Lcom/b/a/c/bj;)V

    .line 285
    return-void
.end method
