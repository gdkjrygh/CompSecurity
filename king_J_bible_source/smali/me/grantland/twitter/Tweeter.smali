.class public Lme/grantland/twitter/Tweeter;
.super Ljava/lang/Object;
.source "Tweeter.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lme/grantland/twitter/Tweeter$SendTwit;,
        Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;
    }
.end annotation


# instance fields
.field protected oAuthConsumer:Loauth/signpost/OAuthConsumer;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p1, "accessToken"    # Ljava/lang/String;
    .param p2, "secretToken"    # Ljava/lang/String;
    .param p3, "consumer"    # Ljava/lang/String;
    .param p4, "consumer_secret"    # Ljava/lang/String;

    .prologue
    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;

    invoke-direct {v0, p3, p4}, Loauth/signpost/commonshttp/CommonsHttpOAuthConsumer;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lme/grantland/twitter/Tweeter;->oAuthConsumer:Loauth/signpost/OAuthConsumer;

    .line 27
    iget-object v0, p0, Lme/grantland/twitter/Tweeter;->oAuthConsumer:Loauth/signpost/OAuthConsumer;

    invoke-interface {v0, p1, p2}, Loauth/signpost/OAuthConsumer;->setTokenWithSecret(Ljava/lang/String;Ljava/lang/String;)V

    .line 28
    return-void
.end method


# virtual methods
.method public tweet(Ljava/lang/String;)Z
    .locals 16
    .param p1, "message"    # Ljava/lang/String;

    .prologue
    .line 95
    if-nez p1, :cond_0

    invoke-virtual/range {p1 .. p1}, Ljava/lang/String;->length()I

    move-result v13

    const/16 v14, 0xa

    if-le v13, v14, :cond_0

    .line 96
    new-instance v13, Ljava/lang/IllegalArgumentException;

    .line 97
    const-string v14, "message cannot be null and must be less than 10 chars"

    .line 96
    invoke-direct {v13, v14}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v13

    .line 100
    :cond_0
    const/4 v12, 0x0

    .line 103
    .local v12, "yes":Z
    :try_start_0
    new-instance v4, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    .line 105
    .local v4, "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    const-string v11, "https://api.twitter.com/1/statuses/update.json"

    .line 106
    .local v11, "url":Ljava/lang/String;
    new-instance v6, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {v6, v11}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    .line 108
    .local v6, "request":Lorg/apache/http/client/methods/HttpPost;
    new-instance v5, Ljava/util/LinkedList;

    invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V

    .line 109
    .local v5, "out":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Lorg/apache/http/message/BasicNameValuePair;>;"
    new-instance v13, Lorg/apache/http/message/BasicNameValuePair;

    const-string v14, "status"

    move-object/from16 v0, p1

    invoke-direct {v13, v14, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v13}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 110
    new-instance v13, Lorg/apache/http/message/BasicNameValuePair;

    const-string v14, "wrap_links"

    const-string v15, "true"

    invoke-direct {v13, v14, v15}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v13}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    .line 112
    new-instance v13, Lorg/apache/http/client/entity/UrlEncodedFormEntity;

    const-string v14, "UTF-8"

    invoke-direct {v13, v5, v14}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V

    invoke-virtual {v6, v13}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V

    .line 114
    const-string v13, "TWITTER"

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Requesting URL : "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v14, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 115
    move-object/from16 v0, p0

    iget-object v13, v0, Lme/grantland/twitter/Tweeter;->oAuthConsumer:Loauth/signpost/OAuthConsumer;

    invoke-interface {v13, v6}, Loauth/signpost/OAuthConsumer;->sign(Ljava/lang/Object;)Loauth/signpost/http/HttpRequest;

    .line 116
    invoke-virtual {v4, v6}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v8

    .line 117
    .local v8, "response":Lorg/apache/http/HttpResponse;
    invoke-interface {v8}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v13

    invoke-interface {v13}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v10

    .line 118
    .local v10, "statuscode":I
    const/16 v13, 0xc8

    if-ne v10, v13, :cond_1

    .line 119
    const/4 v12, 0x1

    .line 123
    :goto_0
    const-string v13, "TWITTER"

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Statusline : "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v8}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 124
    invoke-interface {v8}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v13

    invoke-interface {v13}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v2

    .line 125
    .local v2, "data":Ljava/io/InputStream;
    new-instance v1, Ljava/io/BufferedReader;

    .line 126
    new-instance v13, Ljava/io/InputStreamReader;

    invoke-direct {v13, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    .line 125
    invoke-direct {v1, v13}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 128
    .local v1, "bufferedReader":Ljava/io/BufferedReader;
    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 129
    .local v9, "responseBuilder":Ljava/lang/StringBuilder;
    :goto_1
    invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v7

    .local v7, "responeLine":Ljava/lang/String;
    if-nez v7, :cond_2

    .line 132
    const-string v13, "TWITTER"

    new-instance v14, Ljava/lang/StringBuilder;

    const-string v15, "Response : "

    invoke-direct {v14, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v14, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 138
    .end local v1    # "bufferedReader":Ljava/io/BufferedReader;
    .end local v2    # "data":Ljava/io/InputStream;
    .end local v4    # "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v5    # "out":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Lorg/apache/http/message/BasicNameValuePair;>;"
    .end local v6    # "request":Lorg/apache/http/client/methods/HttpPost;
    .end local v7    # "responeLine":Ljava/lang/String;
    .end local v8    # "response":Lorg/apache/http/HttpResponse;
    .end local v9    # "responseBuilder":Ljava/lang/StringBuilder;
    .end local v10    # "statuscode":I
    .end local v11    # "url":Ljava/lang/String;
    :goto_2
    return v12

    .line 121
    .restart local v4    # "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    .restart local v5    # "out":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Lorg/apache/http/message/BasicNameValuePair;>;"
    .restart local v6    # "request":Lorg/apache/http/client/methods/HttpPost;
    .restart local v8    # "response":Lorg/apache/http/HttpResponse;
    .restart local v10    # "statuscode":I
    .restart local v11    # "url":Ljava/lang/String;
    :cond_1
    const/4 v12, 0x0

    goto :goto_0

    .line 130
    .restart local v1    # "bufferedReader":Ljava/io/BufferedReader;
    .restart local v2    # "data":Ljava/io/InputStream;
    .restart local v7    # "responeLine":Ljava/lang/String;
    .restart local v9    # "responseBuilder":Ljava/lang/StringBuilder;
    :cond_2
    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    .line 134
    .end local v1    # "bufferedReader":Ljava/io/BufferedReader;
    .end local v2    # "data":Ljava/io/InputStream;
    .end local v4    # "httpclient":Lorg/apache/http/impl/client/DefaultHttpClient;
    .end local v5    # "out":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Lorg/apache/http/message/BasicNameValuePair;>;"
    .end local v6    # "request":Lorg/apache/http/client/methods/HttpPost;
    .end local v7    # "responeLine":Ljava/lang/String;
    .end local v8    # "response":Lorg/apache/http/HttpResponse;
    .end local v9    # "responseBuilder":Ljava/lang/StringBuilder;
    .end local v10    # "statuscode":I
    .end local v11    # "url":Ljava/lang/String;
    :catch_0
    move-exception v3

    .line 135
    .local v3, "e":Ljava/lang/Exception;
    const/4 v12, 0x0

    .line 136
    const-string v13, "TWITTER"

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v14, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v14

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v14

    invoke-static {v13, v14}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_2
.end method

.method public upload(Ljava/lang/String;ZLme/grantland/twitter/Tweeter$TwitterUploadDelegate;)V
    .locals 2
    .param p1, "msg"    # Ljava/lang/String;
    .param p2, "isImageAttached"    # Z
    .param p3, "delegate"    # Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .prologue
    .line 41
    if-nez p2, :cond_0

    .line 57
    new-instance v0, Lme/grantland/twitter/Tweeter$SendTwit;

    invoke-direct {v0, p0, p1, p3}, Lme/grantland/twitter/Tweeter$SendTwit;-><init>(Lme/grantland/twitter/Tweeter;Ljava/lang/String;Lme/grantland/twitter/Tweeter$TwitterUploadDelegate;)V

    .line 58
    .local v0, "send":Lme/grantland/twitter/Tweeter$SendTwit;
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lme/grantland/twitter/Tweeter$SendTwit;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 60
    .end local v0    # "send":Lme/grantland/twitter/Tweeter$SendTwit;
    :cond_0
    return-void
.end method
