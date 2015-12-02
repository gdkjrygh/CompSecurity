.class public Lcom/facebook/contacts/g/a/a;
.super Ljava/lang/Object;
.source "AddUserToRolodexMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/contacts/g/a/b;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/contacts/g/a/b;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 30
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 32
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "profile_id"

    invoke-static {p1}, Lcom/facebook/contacts/g/a/b;->a(Lcom/facebook/contacts/g/a/b;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 33
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "addUserToRolodexMethod"

    const-string v2, "POST"

    const-string v3, "/contacts"

    sget-object v5, Lcom/facebook/http/protocol/t;->STRING:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 19
    check-cast p1, Lcom/facebook/contacts/g/a/b;

    invoke-virtual {p0, p1}, Lcom/facebook/contacts/g/a/a;->a(Lcom/facebook/contacts/g/a/b;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 19
    check-cast p1, Lcom/facebook/contacts/g/a/b;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/contacts/g/a/a;->a(Lcom/facebook/contacts/g/a/b;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/contacts/g/a/b;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;
    .locals 1

    .prologue
    .line 41
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->f()V

    .line 42
    const/4 v0, 0x0

    return-object v0
.end method
