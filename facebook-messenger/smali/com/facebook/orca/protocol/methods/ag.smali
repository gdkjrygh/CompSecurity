.class public Lcom/facebook/orca/protocol/methods/ag;
.super Ljava/lang/Object;
.source "RequestSmsConfirmationCodeMethod.java"

# interfaces
.implements Lcom/facebook/http/protocol/f;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/facebook/http/protocol/f",
        "<",
        "Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;)Lcom/facebook/http/protocol/n;
    .locals 6

    .prologue
    .line 25
    invoke-static {}, Lcom/google/common/a/hq;->a()Ljava/util/ArrayList;

    move-result-object v4

    .line 26
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "format"

    const-string v2, "json"

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 27
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "country"

    invoke-virtual {p1}, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;->a()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 28
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "phone_number"

    invoke-virtual {p1}, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;->b()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 29
    invoke-virtual {p1}, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;->c()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 30
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "marker"

    invoke-virtual {p1}, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;->c()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    :cond_0
    invoke-virtual {p1}, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 33
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "flow"

    invoke-virtual {p1}, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;->d()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 35
    :cond_1
    invoke-virtual {p1}, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;->e()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 36
    new-instance v0, Lorg/apache/http/message/BasicNameValuePair;

    const-string v1, "reg_instance"

    invoke-virtual {p1}, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;->e()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v4, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 39
    :cond_2
    new-instance v0, Lcom/facebook/http/protocol/n;

    const-string v1, "requestSmsConfirmationCode"

    const-string v2, "POST"

    const-string v3, "method/mobile.sendPhoneConfirmationCode"

    sget-object v5, Lcom/facebook/http/protocol/t;->STRING:Lcom/facebook/http/protocol/t;

    invoke-direct/range {v0 .. v5}, Lcom/facebook/http/protocol/n;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/facebook/http/protocol/t;)V

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;)Lcom/facebook/http/protocol/n;
    .locals 1

    .prologue
    .line 20
    check-cast p1, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;

    invoke-virtual {p0, p1}, Lcom/facebook/orca/protocol/methods/ag;->a(Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;)Lcom/facebook/http/protocol/n;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic a(Ljava/lang/Object;Lcom/facebook/http/protocol/r;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 20
    check-cast p1, Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;

    invoke-virtual {p0, p1, p2}, Lcom/facebook/orca/protocol/methods/ag;->a(Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public a(Lcom/facebook/orca/server/RequestSmsConfirmationCodeParams;Lcom/facebook/http/protocol/r;)Ljava/lang/Void;
    .locals 1

    .prologue
    .line 50
    invoke-virtual {p2}, Lcom/facebook/http/protocol/r;->f()V

    .line 51
    const/4 v0, 0x0

    return-object v0
.end method
