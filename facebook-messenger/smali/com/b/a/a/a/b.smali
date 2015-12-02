.class public Lcom/b/a/a/a/b;
.super Lcom/b/a/a/f;
.source "LaxAll.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 17
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/b/a/a/g;

    const/4 v1, 0x0

    new-instance v2, Lcom/b/a/a/a/l;

    invoke-direct {v2}, Lcom/b/a/a/a/l;-><init>()V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Lcom/b/a/a/a/ad;

    invoke-direct {v2}, Lcom/b/a/a/a/ad;-><init>()V

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Lcom/b/a/a/f;-><init>([Lcom/b/a/a/g;)V

    .line 18
    return-void
.end method
