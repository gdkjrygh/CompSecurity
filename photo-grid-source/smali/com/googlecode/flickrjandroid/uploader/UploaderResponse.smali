.class public Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/flickrjandroid/Response;


# instance fields
.field private errorCode:Ljava/lang/String;

.field private errorMessage:Ljava/lang/String;

.field private photoId:Ljava/lang/String;

.field private responsePayLoad:Lorg/w3c/dom/Element;

.field private status:Ljava/lang/String;

.field private ticketId:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getData()Lorg/json/JSONObject;
    .locals 1

    .prologue
    .line 114
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getErrorCode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 80
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->errorCode:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorMessage()Ljava/lang/String;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->errorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getPayload()Lorg/w3c/dom/Element;
    .locals 1

    .prologue
    .line 91
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->responsePayLoad:Lorg/w3c/dom/Element;

    return-object v0
.end method

.method public getPayloadCollection()Ljava/util/Collection;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .prologue
    .line 98
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getPhotoId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 68
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->photoId:Ljava/lang/String;

    return-object v0
.end method

.method public getRawResponse()Ljava/lang/String;
    .locals 1

    .prologue
    .line 122
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getStatus()Ljava/lang/String;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->status:Ljava/lang/String;

    return-object v0
.end method

.method public getTicketId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 72
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->ticketId:Ljava/lang/String;

    return-object v0
.end method

.method public isError()Z
    .locals 1

    .prologue
    .line 76
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->errorMessage:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public parse(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 106
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public parse(Lorg/w3c/dom/Document;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, 0x0

    .line 41
    invoke-interface {p1}, Lorg/w3c/dom/Document;->getDocumentElement()Lorg/w3c/dom/Element;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->responsePayLoad:Lorg/w3c/dom/Element;

    .line 42
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->responsePayLoad:Lorg/w3c/dom/Element;

    const-string v1, "stat"

    invoke-interface {v0, v1}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->status:Ljava/lang/String;

    .line 43
    const-string v0, "ok"

    iget-object v1, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->status:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 44
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->responsePayLoad:Lorg/w3c/dom/Element;

    const-string v1, "photoid"

    invoke-interface {v0, v1}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v0

    invoke-interface {v0, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Element;

    .line 45
    if-eqz v0, :cond_0

    .line 46
    invoke-interface {v0}, Lorg/w3c/dom/Element;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Text;

    invoke-interface {v0}, Lorg/w3c/dom/Text;->getData()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->photoId:Ljava/lang/String;

    .line 50
    :goto_0
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->responsePayLoad:Lorg/w3c/dom/Element;

    const-string v1, "ticketid"

    invoke-interface {v0, v1}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v0

    invoke-interface {v0, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Element;

    .line 51
    if-eqz v0, :cond_1

    .line 52
    invoke-interface {v0}, Lorg/w3c/dom/Element;->getFirstChild()Lorg/w3c/dom/Node;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Text;

    invoke-interface {v0}, Lorg/w3c/dom/Text;->getData()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->ticketId:Ljava/lang/String;

    .line 61
    :goto_1
    return-void

    .line 48
    :cond_0
    iput-object v3, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->photoId:Ljava/lang/String;

    goto :goto_0

    .line 54
    :cond_1
    iput-object v3, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->ticketId:Ljava/lang/String;

    goto :goto_1

    .line 57
    :cond_2
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->responsePayLoad:Lorg/w3c/dom/Element;

    const-string v1, "err"

    invoke-interface {v0, v1}, Lorg/w3c/dom/Element;->getElementsByTagName(Ljava/lang/String;)Lorg/w3c/dom/NodeList;

    move-result-object v0

    invoke-interface {v0, v2}, Lorg/w3c/dom/NodeList;->item(I)Lorg/w3c/dom/Node;

    move-result-object v0

    check-cast v0, Lorg/w3c/dom/Element;

    .line 58
    const-string v1, "code"

    invoke-interface {v0, v1}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->errorCode:Ljava/lang/String;

    .line 59
    const-string v1, "msg"

    invoke-interface {v0, v1}, Lorg/w3c/dom/Element;->getAttribute(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/googlecode/flickrjandroid/uploader/UploaderResponse;->errorMessage:Ljava/lang/String;

    goto :goto_1
.end method
