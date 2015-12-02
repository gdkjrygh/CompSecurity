.class public Lcom/facebook/auth/protocol/b;
.super Ljava/lang/Object;
.source "AuthExpireSessionMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Ljava/lang/Void;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 16
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1}, Lcom/facebook/auth/protocol/b;->a(Ljava/lang/Void;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Void;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 20
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "logout"

    const-string v2, "POST"

    const-string v3, "method/auth.expireSession"

    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    sget-object v5, Lcom/facebook/http/protocol/t;->STRING:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 16
    check-cast p1, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/auth/protocol/b;->a(Ljava/lang/Void;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public a(Ljava/lang/Void;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;
    .locals 1

    .prologue
    .line 30
    const/4 v0, 0x0

    return-object v0
.end method
