.class public Lcom/b/a/a/a/a;
.super Lcom/b/a/a/f;
.source "DetectAll.java"


# direct methods
.method public constructor <init>()V
    .locals 3

    .prologue
    .line 15
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/b/a/a/g;

    const/4 v1, 0x0

    new-instance v2, Lcom/b/a/a/a/h;

    invoke-direct {v2}, Lcom/b/a/a/a/h;-><init>()V

    aput-object v2, v0, v1

    const/4 v1, 0x1

    new-instance v2, Lcom/b/a/a/a/z;

    invoke-direct {v2}, Lcom/b/a/a/a/z;-><init>()V

    aput-object v2, v0, v1

    invoke-direct {p0, v0}, Lcom/b/a/a/f;-><init>([Lcom/b/a/a/g;)V

    .line 16
    return-void
.end method
