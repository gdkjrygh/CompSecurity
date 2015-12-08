.class public final Lcom/kik/cards/web/iap/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/cards/web/iap/l;


# instance fields
.field private final a:Lkik/a/e/d;


# direct methods
.method public constructor <init>(Lkik/a/e/d;)V
    .locals 0

    .prologue
    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lcom/kik/cards/web/iap/a;->a:Lkik/a/e/d;

    .line 20
    return-void
.end method


# virtual methods
.method public final a(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 25
    iget-object v0, p0, Lcom/kik/cards/web/iap/a;->a:Lkik/a/e/d;

    invoke-interface {v0}, Lkik/a/e/d;->c()Ljava/security/interfaces/RSAPrivateKey;

    move-result-object v0

    .line 26
    iget-object v1, p0, Lcom/kik/cards/web/iap/a;->a:Lkik/a/e/d;

    invoke-interface {v1}, Lkik/a/e/d;->b()Ljava/net/URL;

    move-result-object v1

    .line 27
    if-eqz v0, :cond_0

    if-nez v1, :cond_1

    .line 28
    :cond_0
    const-string v0, ""

    .line 45
    :goto_0
    return-object v0

    .line 31
    :cond_1
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 33
    const-string v1, "kikUsr"

    invoke-virtual {v0, v1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 35
    const-string v1, "kikExt"

    const-string v2, "iap"

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    invoke-static {p3}, Lcom/kik/cards/web/bf;->j(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 39
    const-string v2, "kikCrdDm"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    .line 43
    iget-object v2, p0, Lcom/kik/cards/web/iap/a;->a:Lkik/a/e/d;

    invoke-interface {v2, v0, v1}, Lkik/a/e/d;->a(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
