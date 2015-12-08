.class final Lcom/b/a/c/bf;
.super Lcom/b/a/c/bj;
.source "SourceFile"


# direct methods
.method public constructor <init>(Lcom/b/a/c/bl;Lcom/b/a/c/bk;Lcom/b/a/c/bk;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 297
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/b/a/c/bj;

    const/4 v1, 0x0

    aput-object p2, v0, v1

    aput-object p1, v0, v2

    const/4 v1, 0x2

    aput-object p3, v0, v1

    invoke-direct {p0, v2, v0}, Lcom/b/a/c/bj;-><init>(I[Lcom/b/a/c/bj;)V

    .line 298
    return-void
.end method
