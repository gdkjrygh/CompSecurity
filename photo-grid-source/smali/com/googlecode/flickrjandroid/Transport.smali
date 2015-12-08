.class public abstract Lcom/googlecode/flickrjandroid/Transport;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final REST:Ljava/lang/String; = "REST"


# instance fields
.field private host:Ljava/lang/String;

.field private path:Ljava/lang/String;

.field private port:I

.field protected responseClass:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field

.field private transportType:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    const/16 v0, 0x1bb

    iput v0, p0, Lcom/googlecode/flickrjandroid/Transport;->port:I

    .line 25
    return-void
.end method


# virtual methods
.method public abstract get(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Lcom/googlecode/flickrjandroid/Response;"
        }
    .end annotation
.end method

.method public getHost()Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Transport;->host:Ljava/lang/String;

    return-object v0
.end method

.method public getPath()Ljava/lang/String;
    .locals 1

    .prologue
    .line 120
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Transport;->path:Ljava/lang/String;

    return-object v0
.end method

.method public getPort()I
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/googlecode/flickrjandroid/Transport;->port:I

    return v0
.end method

.method public getResponseClass()Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation

    .prologue
    .line 131
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Transport;->responseClass:Ljava/lang/Class;

    return-object v0
.end method

.method public getTransportType()Ljava/lang/String;
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/Transport;->transportType:Ljava/lang/String;

    return-object v0
.end method

.method protected abstract post(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Lcom/googlecode/flickrjandroid/Response;"
        }
    .end annotation
.end method

.method public postJSON(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Lcom/googlecode/flickrjandroid/Response;"
        }
    .end annotation

    .prologue
    .line 101
    const/4 v0, 0x0

    .line 102
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    :goto_0
    if-gez v1, :cond_1

    .line 108
    :goto_1
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "nojsoncallback"

    const-string v3, "1"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    new-instance v1, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "format"

    const-string v3, "json"

    invoke-direct {v1, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {p2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    if-eqz v0, :cond_0

    .line 111
    const-string v0, "https://api.flickr.com/services/rest"

    invoke-static {p1, v0, p2}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 113
    :cond_0
    const-string v0, "/services/rest"

    invoke-virtual {p0, v0, p2}, Lcom/googlecode/flickrjandroid/Transport;->post(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    return-object v0

    .line 103
    :cond_1
    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v2, v2, Lcom/googlecode/flickrjandroid/oauth/OAuthTokenParameter;

    if-eqz v2, :cond_2

    .line 104
    const/4 v0, 0x1

    .line 105
    goto :goto_1

    .line 102
    :cond_2
    add-int/lit8 v1, v1, -0x1

    goto :goto_0
.end method

.method public replace(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Lcom/googlecode/flickrjandroid/Response;"
        }
    .end annotation

    .prologue
    .line 93
    const-string v0, "https://api.flickr.com/services/replace/"

    invoke-static {p1, v0, p2}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 94
    const-string v0, "/services/replace/"

    invoke-virtual {p0, v0, p2}, Lcom/googlecode/flickrjandroid/Transport;->sendUpload(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    return-object v0
.end method

.method protected abstract sendUpload(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Lcom/googlecode/flickrjandroid/Response;"
        }
    .end annotation
.end method

.method public setHost(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 40
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/Transport;->host:Ljava/lang/String;

    .line 41
    return-void
.end method

.method public setPath(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 127
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/Transport;->path:Ljava/lang/String;

    .line 128
    return-void
.end method

.method public setPort(I)V
    .locals 0

    .prologue
    .line 48
    iput p1, p0, Lcom/googlecode/flickrjandroid/Transport;->port:I

    .line 49
    return-void
.end method

.method public setResponseClass(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class",
            "<*>;)V"
        }
    .end annotation

    .prologue
    .line 135
    if-nez p1, :cond_0

    .line 136
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "The response Class cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 138
    :cond_0
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/Transport;->responseClass:Ljava/lang/Class;

    .line 139
    return-void
.end method

.method public setTransportType(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 56
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/Transport;->transportType:Ljava/lang/String;

    .line 57
    return-void
.end method

.method public upload(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;)",
            "Lcom/googlecode/flickrjandroid/Response;"
        }
    .end annotation

    .prologue
    .line 85
    const-string v0, "https://api.flickr.com/services/upload/"

    invoke-static {p1, v0, p2}, Lcom/googlecode/flickrjandroid/oauth/OAuthUtils;->addOAuthParams(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 86
    const-string v0, "/services/upload/"

    invoke-virtual {p0, v0, p2}, Lcom/googlecode/flickrjandroid/Transport;->sendUpload(Ljava/lang/String;Ljava/util/List;)Lcom/googlecode/flickrjandroid/Response;

    move-result-object v0

    return-object v0
.end method
