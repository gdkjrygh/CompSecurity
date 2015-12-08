.class public Lcom/googlecode/flickrjandroid/RESTResponse;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/flickrjandroid/Response;


# instance fields
.field private errorCode:Ljava/lang/String;

.field private errorMessage:Ljava/lang/String;

.field private jsonObj:Lorg/json/JSONObject;

.field private rawResponse:Ljava/lang/String;

.field private stat:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->rawResponse:Ljava/lang/String;

    .line 30
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->rawResponse:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/googlecode/flickrjandroid/RESTResponse;->parse(Ljava/lang/String;)V

    .line 31
    return-void
.end method


# virtual methods
.method public getData()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->jsonObj:Lorg/json/JSONObject;

    return-object v0
.end method

.method public getErrorCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 63
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->errorCode:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 67
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getRawResponse()Ljava/lang/String;
    .locals 1

    .prologue
    .line 75
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->rawResponse:Ljava/lang/String;

    return-object v0
.end method

.method public getStat()Ljava/lang/String;
    .locals 1

    .prologue
    .line 50
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->stat:Ljava/lang/String;

    return-object v0
.end method

.method public isError()Z
    .locals 1

    .prologue
    .line 59
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->errorCode:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public parse(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 38
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->rawResponse:Ljava/lang/String;

    .line 39
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->jsonObj:Lorg/json/JSONObject;

    .line 40
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->jsonObj:Lorg/json/JSONObject;

    const-string v1, "stat"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->stat:Ljava/lang/String;

    .line 41
    const-string v0, "ok"

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->stat:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 43
    const-string v0, "fail"

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->stat:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 44
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->jsonObj:Lorg/json/JSONObject;

    const-string v1, "code"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->errorCode:Ljava/lang/String;

    .line 45
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->jsonObj:Lorg/json/JSONObject;

    const-string v1, "message"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/RESTResponse;->errorMessage:Ljava/lang/String;

    .line 47
    :cond_0
    return-void
.end method
