.class public Lcom/hmobile/twitter/TwitterProvider$Tweeter;
.super Ljava/lang/Object;
.source "TwitterProvider.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/twitter/TwitterProvider;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "Tweeter"
.end annotation


# instance fields
.field protected oAuthConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

.field final synthetic this$0:Lcom/hmobile/twitter/TwitterProvider;


# direct methods
.method public constructor <init>(Lcom/hmobile/twitter/TwitterProvider;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3
    .param p2, "accessToken"    # Ljava/lang/String;
    .param p3, "secretToken"    # Ljava/lang/String;

    .prologue
    .line 158
    iput-object p1, p0, Lcom/hmobile/twitter/TwitterProvider$Tweeter;->this$0:Lcom/hmobile/twitter/TwitterProvider;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    new-instance v0, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    sget-object v1, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_CONSUMER_KEY:Ljava/lang/String;

    .line 160
    sget-object v2, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_CONSUMER_SECRET:Ljava/lang/String;

    invoke-direct {v0, v1, v2}, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    iput-object v0, p0, Lcom/hmobile/twitter/TwitterProvider$Tweeter;->oAuthConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    .line 161
    iget-object v0, p0, Lcom/hmobile/twitter/TwitterProvider$Tweeter;->oAuthConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    invoke-virtual {v0, p2, p3}, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;->setTokenWithSecret(Ljava/lang/String;Ljava/lang/String;)V

    .line 162
    return-void
.end method


# virtual methods
.method public tweet(Ljava/lang/String;)Z
    .locals 13
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 188
    if-nez p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v10

    const/16 v11, 0x8c

    if-le v10, v11, :cond_0

    .line 189
    new-instance v10, Ljava/lang/IllegalArgumentException;

    .line 190
    const-string v11, "message cannot be null and must be less than 140 chars"

    .line 189
    invoke-direct {v10, v11}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v10

    .line 195
    :cond_0
    :try_start_0
    new-instance v3, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v3}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 196
    .local v3, "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    sget-object v9, Lcom/hmobile/twitter/TwitterProvider;->TWITTER_POST_MESSAGE_URL:Ljava/lang/String;

    .line 197
    .local v9, "url":Ljava/lang/String;
    new-instance v5, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v5, v9}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 199
    .local v5, "request":Lorg/apache/http/client/methods/HttpPost;
    new-instance v4, Ljava/util/LinkedList;

    invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V

    .line 200
    .local v4, "out":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Lorg/apache/http/message/BasicNameValuePair;>;"
    new-instance v10, Lorg/apache/http/message/BasicNameValuePair;

    const-string v11, "status"

    invoke-direct {v10, v11, p1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v10}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 201
    new-instance v10, Lorg/apache/http/message/BasicNameValuePair;

    const-string v11, "wrap_links"

    const-string v12, "true"

    invoke-direct {v10, v11, v12}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v10}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 203
    new-instance v10, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    const-string v11, "UTF-8"

    invoke-direct {v10, v4, v11}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v5, v10}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 205
    const-string v10, "TWITTER"

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Requesting URL : "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 206
    iget-object v10, p0, Lcom/hmobile/twitter/TwitterProvider$Tweeter;->oAuthConsumer:Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    invoke-virtual {v10, v5}, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;->sign(Ljava/lang/Object;)Loauth/signpost/http/HttpRequest;

    .line 207
    invoke-virtual {v3, v5}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v7

    .line 208
    .local v7, "response":Lorg/apache/http/HttpResponse;
    const-string v10, "TWITTER"

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Statusline : "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v7}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 209
    invoke-interface {v7}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v10

    invoke-interface {v10}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v1

    .line 210
    .local v1, "data":Ljava/io/InputStream;
    new-instance v0, Ljava/io/BufferedReader;

    .line 211
    new-instance v10, Ljava/io/InputStreamReader;

    invoke-direct {v10, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 210
    invoke-direct {v0, v10}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 213
    .local v0, "bufferedReader":Ljava/io/BufferedReader;
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .local v8, "responseBuilder":Ljava/lang/StringBuilder;
    :goto_0
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v6

    .local v6, "responeLine":Ljava/lang/String;
    if-nez v6, :cond_1

    .line 217
    const-string v10, "TWITTER"

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "Response : "

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 219
    const/4 v10, 0x1

    .line 223
    .end local v0    # "bufferedReader":Ljava/io/BufferedReader;
    .end local v1    # "data":Ljava/io/InputStream;
    .end local v3    # "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v4    # "out":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Lorg/apache/http/message/BasicNameValuePair;>;"
    .end local v5    # "request":Lorg/apache/http/client/methods/HttpPost;
    .end local v6    # "responeLine":Ljava/lang/String;
    .end local v7    # "response":Lorg/apache/http/HttpResponse;
    .end local v8    # "responseBuilder":Ljava/lang/StringBuilder;
    .end local v9    # "url":Ljava/lang/String;
    :goto_1
    return v10

    .line 215
    .restart local v0    # "bufferedReader":Ljava/io/BufferedReader;
    .restart local v1    # "data":Ljava/io/InputStream;
    .restart local v3    # "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    .restart local v4    # "out":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Lorg/apache/http/message/BasicNameValuePair;>;"
    .restart local v5    # "request":Lorg/apache/http/client/methods/HttpPost;
    .restart local v6    # "responeLine":Ljava/lang/String;
    .restart local v7    # "response":Lorg/apache/http/HttpResponse;
    .restart local v8    # "responseBuilder":Ljava/lang/StringBuilder;
    .restart local v9    # "url":Ljava/lang/String;
    :cond_1
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 220
    .end local v0    # "bufferedReader":Ljava/io/BufferedReader;
    .end local v1    # "data":Ljava/io/InputStream;
    .end local v3    # "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v4    # "out":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Lorg/apache/http/message/BasicNameValuePair;>;"
    .end local v5    # "request":Lorg/apache/http/client/methods/HttpPost;
    .end local v6    # "responeLine":Ljava/lang/String;
    .end local v7    # "response":Lorg/apache/http/HttpResponse;
    .end local v8    # "responseBuilder":Ljava/lang/StringBuilder;
    .end local v9    # "url":Ljava/lang/String;
    :catch_0
    move-exception v2

    .line 221
    .local v2, "e":Ljava/lang/Exception;
    const-string v10, "TWITTER"

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 223
    const/4 v10, 0x0

    goto :goto_1
.end method

.method public upload(Ljava/lang/String;Z)V
    .locals 0
    .param p1, "msg"    # Ljava/lang/String;
    .param p2, "isImageAttached"    # Z
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 167
    if-nez p2, :cond_0

    .line 183
    invoke-virtual {p0, p1}, Lcom/hmobile/twitter/TwitterProvider$Tweeter;->tweet(Ljava/lang/String;)Z

    .line 185
    :cond_0
    return-void
.end method
