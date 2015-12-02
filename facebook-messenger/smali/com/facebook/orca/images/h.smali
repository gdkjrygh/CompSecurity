.class public Lcom/facebook/orca/images/h;
.super Ljava/lang/Object;
.source "ImageSearchHandler.java"

# interfaces
.implements Lcom/facebook/fbservice/service/e;


# instance fields
.field private final a:Lcom/facebook/http/b/ap;

.field private final b:Lcom/facebook/http/protocol/s;


# direct methods
.method public constructor <init>(Lcom/facebook/http/b/ap;Lcom/facebook/http/protocol/s;)V
    .locals 0

    .prologue
    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iput-object p1, p0, Lcom/facebook/orca/images/h;->a:Lcom/facebook/http/b/ap;

    .line 36
    iput-object p2, p0, Lcom/facebook/orca/images/h;->b:Lcom/facebook/http/protocol/s;

    .line 37
    return-void
.end method

.method private a(Lorg/apache/http/HttpResponse;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 2

    .prologue
    .line 66
    new-instance v0, Lorg/json/JSONObject;

    new-instance v1, Lorg/json/JSONTokener;

    invoke-direct {v1, p2}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Lorg/json/JSONTokener;)V

    .line 67
    invoke-static {v0}, Lcom/facebook/common/w/e;->a(Lorg/json/JSONObject;)Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method

.method private a(Landroid/os/Bundle;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 51
    const-string v0, "http://api.search.live.net/json.aspx"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    .line 53
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 54
    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v0, v3}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_0

    .line 57
    :cond_0
    new-instance v2, Lcom/facebook/http/protocol/aw;

    iget-object v0, p0, Lcom/facebook/orca/images/h;->b:Lcom/facebook/http/protocol/s;

    invoke-direct {v2, v0}, Lcom/facebook/http/protocol/aw;-><init>(Lcom/facebook/http/protocol/s;)V

    .line 58
    new-instance v0, Lorg/apache/http/client/methods/HttpGet;

    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 59
    iget-object v1, p0, Lcom/facebook/orca/images/h;->a:Lcom/facebook/http/b/ap;

    const-string v3, "imageSearch"

    invoke-virtual {v1, v3, v0, v2}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/client/ResponseHandler;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 60
    invoke-virtual {v2}, Lcom/facebook/http/protocol/aw;->a()Lorg/apache/http/HttpResponse;

    move-result-object v1

    .line 61
    invoke-direct {p0, v1, v0}, Lcom/facebook/orca/images/h;->a(Lorg/apache/http/HttpResponse;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/fbservice/service/OperationResult;->a(Landroid/os/Parcelable;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public a(Lcom/facebook/fbservice/service/ad;)Lcom/facebook/fbservice/service/OperationResult;
    .locals 4

    .prologue
    .line 41
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->a()Lcom/facebook/fbservice/service/OperationType;

    move-result-object v0

    .line 42
    invoke-virtual {p1}, Lcom/facebook/fbservice/service/ad;->b()Landroid/os/Bundle;

    move-result-object v1

    .line 43
    sget-object v2, Lcom/facebook/orca/server/aq;->B:Lcom/facebook/fbservice/service/OperationType;

    invoke-virtual {v2, v0}, Lcom/facebook/fbservice/service/OperationType;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 44
    invoke-direct {p0, v1}, Lcom/facebook/orca/images/h;->a(Landroid/os/Bundle;)Lcom/facebook/fbservice/service/OperationResult;

    move-result-object v0

    return-object v0

    .line 46
    :cond_0
    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Unknown operation type: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
