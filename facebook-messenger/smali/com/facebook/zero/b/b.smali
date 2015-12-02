.class public Lcom/facebook/zero/b/b;
.super Lcom/facebook/common/s/a;
.source "ZeroDbKey.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/common/s/a",
        "<",
        "Lcom/facebook/zero/b/b;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Lcom/facebook/common/s/a;-><init>(Ljava/lang/String;)V

    .line 14
    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)Lcom/facebook/zero/b/b;
    .locals 1

    .prologue
    .line 18
    new-instance v0, Lcom/facebook/zero/b/b;

    invoke-direct {v0, p1}, Lcom/facebook/zero/b/b;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public synthetic b(Ljava/lang/String;)Lcom/facebook/common/s/a;
    .locals 1

    .prologue
    .line 10
    invoke-virtual {p0, p1}, Lcom/facebook/zero/b/b;->a(Ljava/lang/String;)Lcom/facebook/zero/b/b;

    move-result-object v0

    return-object v0
.end method
