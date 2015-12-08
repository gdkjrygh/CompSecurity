.class public final Lcom/arist/model/errorinfo/c;
.super Ljava/lang/Object;


# static fields
.field public static c:Lcom/arist/model/errorinfo/c;


# instance fields
.field public a:Lcom/arist/model/errorinfo/e;

.field public b:I

.field public d:Lcom/arist/model/errorinfo/b;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a()Lcom/arist/model/errorinfo/c;
    .locals 1

    sget-object v0, Lcom/arist/model/errorinfo/c;->c:Lcom/arist/model/errorinfo/c;

    if-nez v0, :cond_0

    new-instance v0, Lcom/arist/model/errorinfo/c;

    invoke-direct {v0}, Lcom/arist/model/errorinfo/c;-><init>()V

    sput-object v0, Lcom/arist/model/errorinfo/c;->c:Lcom/arist/model/errorinfo/c;

    :cond_0
    sget-object v0, Lcom/arist/model/errorinfo/c;->c:Lcom/arist/model/errorinfo/c;

    return-object v0
.end method

.method private static a(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    if-gtz v2, :cond_2

    :cond_0
    move v0, v1

    :cond_1
    :goto_0
    return v0

    :cond_2
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const-string v3, "code"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-string v3, "code"

    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v2

    :goto_1
    if-eq v2, v0, :cond_1

    move v0, v1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v0, v1

    goto :goto_0

    :cond_3
    move v2, v1

    goto :goto_1
.end method

.method private static b(Ljava/lang/String;Lcom/arist/model/errorinfo/b;)Ljava/lang/String;
    .locals 6

    const-string v0, ""

    if-eqz p0, :cond_0

    if-nez p1, :cond_2

    :cond_0
    const-string v0, ""

    :cond_1
    :goto_0
    return-object v0

    :cond_2
    :try_start_0
    new-instance v1, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v1, p0}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    const-string v4, "request"

    const-string v5, "ERRORINFO"

    invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    const-string v4, "errorType"

    invoke-virtual {p1}, Lcom/arist/model/errorinfo/b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    const-string v4, "errorPhone"

    invoke-virtual {p1}, Lcom/arist/model/errorinfo/b;->b()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    const-string v4, "errorInfo"

    invoke-virtual {p1}, Lcom/arist/model/errorinfo/b;->d()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    const-string v4, "errorTime"

    invoke-virtual {p1}, Lcom/arist/model/errorinfo/b;->c()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lorg/apache/http/message/BasicNameValuePair;

    const-string v4, "errorPath"

    invoke-virtual {p1}, Lcom/arist/model/errorinfo/b;->e()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v3, v4, v5}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v2, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance v3, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    const-string v4, "UTF-8"

    invoke-direct {v3, v2, v4}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    new-instance v2, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    invoke-virtual {v2, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v1

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v2

    invoke-interface {v2}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v2

    const/16 v3, 0xc8

    if-ne v2, v3, :cond_1

    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    invoke-static {v0}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/net/MalformedURLException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/net/MalformedURLException;->printStackTrace()V

    const-string v0, ""

    goto/16 :goto_0

    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    const-string v0, ""

    goto/16 :goto_0
.end method


# virtual methods
.method public final a(Lcom/arist/model/errorinfo/e;Lcom/arist/model/errorinfo/b;)V
    .locals 1

    iput-object p1, p0, Lcom/arist/model/errorinfo/c;->a:Lcom/arist/model/errorinfo/e;

    const/4 v0, 0x0

    iput v0, p0, Lcom/arist/model/errorinfo/c;->b:I

    iput-object p2, p0, Lcom/arist/model/errorinfo/c;->d:Lcom/arist/model/errorinfo/b;

    return-void
.end method

.method public final a(Ljava/lang/String;Lcom/arist/model/errorinfo/b;)V
    .locals 4

    invoke-static {p1, p2}, Lcom/arist/model/errorinfo/c;->b(Ljava/lang/String;Lcom/arist/model/errorinfo/b;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "eeeeeee"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "result:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {v0}, Lcom/arist/model/errorinfo/c;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Lcom/arist/model/errorinfo/c;->a:Lcom/arist/model/errorinfo/e;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/arist/model/errorinfo/c;->a:Lcom/arist/model/errorinfo/e;

    iget v2, p0, Lcom/arist/model/errorinfo/c;->b:I

    invoke-interface {v1, v0}, Lcom/arist/model/errorinfo/e;->a(Ljava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/arist/model/errorinfo/c;->a:Lcom/arist/model/errorinfo/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/errorinfo/c;->a:Lcom/arist/model/errorinfo/e;

    iget v1, p0, Lcom/arist/model/errorinfo/c;->b:I

    invoke-virtual {p2}, Lcom/arist/model/errorinfo/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/arist/model/errorinfo/e;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/arist/model/errorinfo/c;->a:Lcom/arist/model/errorinfo/e;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/arist/model/errorinfo/c;->a:Lcom/arist/model/errorinfo/e;

    iget v1, p0, Lcom/arist/model/errorinfo/c;->b:I

    invoke-virtual {p2}, Lcom/arist/model/errorinfo/b;->e()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Lcom/arist/model/errorinfo/e;->b(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 2

    iget-object v0, p0, Lcom/arist/model/errorinfo/c;->d:Lcom/arist/model/errorinfo/b;

    if-nez v0, :cond_0

    :goto_0
    return-void

    :cond_0
    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/arist/model/errorinfo/d;

    invoke-direct {v1, p0}, Lcom/arist/model/errorinfo/d;-><init>(Lcom/arist/model/errorinfo/c;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    goto :goto_0
.end method
