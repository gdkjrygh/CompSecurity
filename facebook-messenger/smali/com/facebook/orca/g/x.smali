.class public Lcom/facebook/orca/g/x;
.super Lcom/facebook/common/s/a;
.source "DbThreadPropertyKey.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/facebook/common/s/a",
        "<",
        "Lcom/facebook/orca/g/x;",
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
.method protected a(Ljava/lang/String;)Lcom/facebook/orca/g/x;
    .locals 1

    .prologue
    .line 18
    new-instance v0, Lcom/facebook/orca/g/x;

    invoke-direct {v0, p1}, Lcom/facebook/orca/g/x;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method protected synthetic b(Ljava/lang/String;)Lcom/facebook/common/s/a;
    .locals 1

    .prologue
    .line 10
    invoke-virtual {p0, p1}, Lcom/facebook/orca/g/x;->a(Ljava/lang/String;)Lcom/facebook/orca/g/x;

    move-result-object v0

    return-object v0
.end method
