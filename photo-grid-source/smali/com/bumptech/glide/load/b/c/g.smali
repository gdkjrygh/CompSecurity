.class final enum Lcom/bumptech/glide/load/b/c/g;
.super Lcom/bumptech/glide/load/b/c/e;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 42
    const/4 v0, 0x2

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, v1}, Lcom/bumptech/glide/load/b/c/e;-><init>(Ljava/lang/String;IB)V

    return-void
.end method


# virtual methods
.method protected final a(Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 45
    invoke-super {p0, p1}, Lcom/bumptech/glide/load/b/c/e;->a(Ljava/lang/Throwable;)V

    .line 46
    new-instance v0, Ljava/lang/RuntimeException;

    invoke-direct {v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method
