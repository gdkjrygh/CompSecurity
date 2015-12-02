.class final Lcom/facebook/user/u;
.super Ljava/lang/Object;
.source "UserKey.java"

# interfaces
.implements Lcom/google/common/base/Function;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/common/base/Function",
        "<",
        "Lcom/facebook/user/UserKey;",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 132
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/user/UserKey;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 135
    invoke-virtual {p1}, Lcom/facebook/user/UserKey;->c()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public synthetic apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 132
    check-cast p1, Lcom/facebook/user/UserKey;

    invoke-virtual {p0, p1}, Lcom/facebook/user/u;->a(Lcom/facebook/user/UserKey;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
