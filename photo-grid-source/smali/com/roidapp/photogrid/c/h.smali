.class public final Lcom/roidapp/photogrid/c/h;
.super Lcom/roidapp/baselib/c/c;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/roidapp/baselib/c/c",
        "<",
        "Ljava/lang/String;",
        "Ljava/lang/Integer;",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field private a:Z

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:I

.field private f:I

.field private g:Landroid/content/Context;

.field private h:Lcom/roidapp/photogrid/c/c;

.field private i:Z

.field private j:Ljava/lang/String;

.field private k:Z

.field private l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/c/c;ZZ)V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Lcom/roidapp/baselib/c/c;-><init>()V

    .line 30
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/c/h;->a:Z

    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/c/h;->i:Z

    .line 44
    iput-object p1, p0, Lcom/roidapp/photogrid/c/h;->g:Landroid/content/Context;

    .line 45
    iput-object p2, p0, Lcom/roidapp/photogrid/c/h;->h:Lcom/roidapp/photogrid/c/c;

    .line 46
    iput-boolean p3, p0, Lcom/roidapp/photogrid/c/h;->k:Z

    .line 47
    iput-boolean p4, p0, Lcom/roidapp/photogrid/c/h;->l:Z

    .line 48
    return-void
.end method

.method private a(Ljava/lang/String;)Z
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 91
    const-string v0, ""

    .line 96
    :cond_0
    :try_start_0
    iget-boolean v1, p0, Lcom/roidapp/photogrid/c/h;->i:Z

    if-nez v1, :cond_2

    .line 99
    new-instance v1, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    .line 100
    new-instance v3, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {v3, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 101
    const/16 v4, 0x3a98

    invoke-static {v1, v4}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 103
    const/16 v4, 0x6978

    invoke-static {v1, v4}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    .line 104
    const/16 v4, 0x400

    invoke-static {v1, v4}, Lorg/apache/http/params/HttpConnectionParams;->setSocketBufferSize(Lorg/apache/http/params/HttpParams;I)V

    .line 105
    const/4 v4, 0x1

    invoke-static {v1, v4}, Lorg/apache/http/client/params/HttpClientParams;->setRedirecting(Lorg/apache/http/params/HttpParams;Z)V

    .line 106
    new-instance v4, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v4, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V

    .line 107
    invoke-interface {v4, v3}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;

    move-result-object v1

    .line 109
    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v3

    invoke-interface {v3}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v3

    const/16 v4, 0xc8

    if-ne v3, v4, :cond_1

    .line 110
    invoke-interface {v1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    .line 111
    if-eqz v1, :cond_0

    .line 112
    const-string v3, "utf-8"

    invoke-static {v1, v3}, Lorg/apache/http/util/EntityUtils;->toString(Lorg/apache/http/HttpEntity;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 113
    const-string v1, "XmlAsyncTask"

    invoke-static {v1, v0}, Lcom/roidapp/photogrid/c/g;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v1, v0

    .line 137
    :goto_0
    iget-boolean v0, p0, Lcom/roidapp/photogrid/c/h;->i:Z

    if-nez v0, :cond_4

    .line 138
    iget-boolean v0, p0, Lcom/roidapp/photogrid/c/h;->a:Z

    if-eqz v0, :cond_4

    .line 140
    :try_start_1
    new-instance v0, Lorg/json/JSONTokener;

    invoke-static {v1}, Lcom/roidapp/photogrid/c/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lorg/json/JSONTokener;-><init>(Ljava/lang/String;)V

    .line 142
    invoke-virtual {v0}, Lorg/json/JSONTokener;->nextValue()Ljava/lang/Object;

    move-result-object v0

    .line 143
    instance-of v3, v0, Lorg/json/JSONObject;

    if-nez v3, :cond_3

    .line 144
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/roidapp/photogrid/c/h;->a:Z

    .line 145
    const-string v3, "Error Object:"

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catch Lorg/json/JSONException; {:try_start_1 .. :try_end_1} :catch_2

    move v0, v2

    .line 164
    :goto_1
    return v0

    .line 117
    :cond_1
    const/4 v1, 0x0

    :try_start_2
    iput-boolean v1, p0, Lcom/roidapp/photogrid/c/h;->a:Z

    .line 118
    const-string v1, "404!"

    iput-object v1, p0, Lcom/roidapp/photogrid/c/h;->j:Ljava/lang/String;
    :try_end_2
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 .. :try_end_2} :catch_0
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v1, v0

    .line 119
    goto :goto_0

    :cond_2
    move-object v1, v0

    .line 135
    goto :goto_0

    .line 123
    :catch_0
    move-exception v1

    .line 125
    :try_start_3
    const-string v3, "XmlAsyncTask"

    invoke-virtual {v1}, Lorg/apache/http/client/ClientProtocolException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 126
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/roidapp/photogrid/c/h;->a:Z

    .line 127
    invoke-virtual {v1}, Lorg/apache/http/client/ClientProtocolException;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/c/h;->j:Ljava/lang/String;

    move-object v1, v0

    .line 135
    goto :goto_0

    .line 128
    :catch_1
    move-exception v1

    .line 130
    const-string v3, "XmlAsyncTask"

    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    const/4 v3, 0x0

    iput-boolean v3, p0, Lcom/roidapp/photogrid/c/h;->a:Z

    .line 132
    invoke-virtual {v1}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/c/h;->j:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object v1, v0

    .line 135
    goto :goto_0

    .line 134
    :catchall_0
    move-exception v0

    throw v0

    .line 148
    :cond_3
    :try_start_4
    check-cast v0, Lorg/json/JSONObject;

    .line 149
    const-string v3, "latest_version"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/photogrid/c/h;->b:Ljava/lang/String;

    .line 150
    const-string v3, "latest_md5"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/photogrid/c/h;->c:Ljava/lang/String;

    .line 151
    const-string v3, "message"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/roidapp/photogrid/c/h;->d:Ljava/lang/String;

    .line 152
    const-string v3, "size"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    iput v3, p0, Lcom/roidapp/photogrid/c/h;->f:I

    .line 153
    const-string v3, "versionCode"

    invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/c/h;->e:I
    :try_end_4
    .catch Lorg/json/JSONException; {:try_start_4 .. :try_end_4} :catch_2

    .line 164
    :cond_4
    :goto_2
    iget-boolean v0, p0, Lcom/roidapp/photogrid/c/h;->a:Z

    goto :goto_1

    .line 154
    :catch_2
    move-exception v0

    .line 156
    const-string v3, "result:"

    invoke-static {v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 157
    invoke-virtual {v0}, Lorg/json/JSONException;->printStackTrace()V

    .line 158
    iput-boolean v2, p0, Lcom/roidapp/photogrid/c/h;->a:Z

    .line 159
    invoke-virtual {v0}, Lorg/json/JSONException;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/c/h;->j:Ljava/lang/String;

    goto :goto_2
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 85
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/c/h;->i:Z

    .line 86
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/c/h;->a:Z

    .line 87
    const-string v0, "XmlAsyncTask"

    const-string v1, "oncancel"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 88
    return-void
.end method

.method protected final synthetic doInBackground([Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 27
    check-cast p1, [Ljava/lang/String;

    .line 2059
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/photogrid/c/h;->j:Ljava/lang/String;

    .line 2060
    const/4 v0, 0x0

    aget-object v0, p1, v0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/c/h;->a(Ljava/lang/String;)Z

    .line 2061
    iget-boolean v0, p0, Lcom/roidapp/photogrid/c/h;->a:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    .line 27
    return-object v0
.end method

.method protected final synthetic onPostExecute(Ljava/lang/Object;)V
    .locals 4

    .prologue
    .line 27
    check-cast p1, Ljava/lang/Boolean;

    .line 1067
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1069
    iget-object v0, p0, Lcom/roidapp/photogrid/c/h;->g:Landroid/content/Context;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "update_md5"

    iget-object v2, p0, Lcom/roidapp/photogrid/c/h;->c:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "size"

    iget v2, p0, Lcom/roidapp/photogrid/c/h;->f:I

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1072
    iget-object v0, p0, Lcom/roidapp/photogrid/c/h;->h:Lcom/roidapp/photogrid/c/c;

    iget-object v1, p0, Lcom/roidapp/photogrid/c/h;->b:Ljava/lang/String;

    iget v2, p0, Lcom/roidapp/photogrid/c/h;->e:I

    iget-object v3, p0, Lcom/roidapp/photogrid/c/h;->d:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lcom/roidapp/photogrid/c/c;->a(Ljava/lang/String;ILjava/lang/String;)V

    :cond_0
    :goto_0
    return-void

    .line 1075
    :cond_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/c/h;->i:Z

    if-nez v0, :cond_0

    .line 1076
    iget-boolean v0, p0, Lcom/roidapp/photogrid/c/h;->k:Z

    if-nez v0, :cond_0

    .line 1077
    iget-object v0, p0, Lcom/roidapp/photogrid/c/h;->h:Lcom/roidapp/photogrid/c/c;

    sget-object v1, Lcom/roidapp/photogrid/c/b;->b:Lcom/roidapp/photogrid/c/b;

    iget-object v2, p0, Lcom/roidapp/photogrid/c/h;->j:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/roidapp/photogrid/c/c;->a(Lcom/roidapp/photogrid/c/b;Ljava/lang/String;)V

    goto :goto_0
.end method

.method protected final onPreExecute()V
    .locals 1

    .prologue
    .line 52
    iget-boolean v0, p0, Lcom/roidapp/photogrid/c/h;->l:Z

    if-nez v0, :cond_0

    .line 53
    iget-object v0, p0, Lcom/roidapp/photogrid/c/h;->h:Lcom/roidapp/photogrid/c/c;

    invoke-interface {v0}, Lcom/roidapp/photogrid/c/c;->e()V

    .line 54
    :cond_0
    return-void
.end method
