.class public final Lcom/roidapp/cloudlib/instagram/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Ljava/lang/String;

.field private e:I

.field private f:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference",
            "<",
            "Landroid/os/Handler;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;Landroid/os/Handler;ZLjava/lang/String;)V
    .locals 1

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    const-string v0, "LoadPublicPhotoTask"

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/s;->a:Ljava/lang/String;

    .line 27
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/cloudlib/instagram/s;->c:Z

    .line 31
    const/16 v0, 0x14

    iput v0, p0, Lcom/roidapp/cloudlib/instagram/s;->e:I

    .line 41
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/s;->b:Ljava/lang/ref/WeakReference;

    .line 42
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/roidapp/cloudlib/instagram/s;->f:Ljava/lang/ref/WeakReference;

    .line 43
    iput-boolean p3, p0, Lcom/roidapp/cloudlib/instagram/s;->c:Z

    .line 44
    iput-object p4, p0, Lcom/roidapp/cloudlib/instagram/s;->d:Ljava/lang/String;

    .line 45
    return-void
.end method

.method private a(Ljava/lang/String;)Lcom/roidapp/cloudlib/instagram/r;
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 120
    if-eqz p1, :cond_0

    .line 121
    invoke-static {v2}, Lcom/roidapp/cloudlib/instagram/r;->a(Ljava/lang/String;)V

    .line 123
    :cond_0
    new-instance v1, Lcom/roidapp/cloudlib/instagram/r;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/instagram/r;-><init>()V

    .line 124
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "&count="

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v3, p0, Lcom/roidapp/cloudlib/instagram/s;->e:I

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 129
    invoke-static {}, Lcom/roidapp/cloudlib/instagram/r;->a()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_2

    const-string v3, ""

    invoke-static {}, Lcom/roidapp/cloudlib/instagram/r;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 130
    invoke-static {}, Lcom/roidapp/cloudlib/instagram/r;->a()Ljava/lang/String;

    move-result-object v0

    const-string v3, "false"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    move-object v0, v1

    .line 166
    :goto_0
    return-object v0

    .line 133
    :cond_1
    invoke-static {}, Lcom/roidapp/cloudlib/instagram/r;->a()Ljava/lang/String;

    move-result-object v0

    .line 137
    :cond_2
    invoke-static {v0}, Lcom/roidapp/cloudlib/instagram/s;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 138
    if-nez v0, :cond_3

    move-object v0, v2

    .line 139
    goto :goto_0

    .line 142
    :cond_3
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 143
    const-string v0, "data"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    .line 144
    const-string v0, "pagination"

    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 146
    :try_start_0
    const-string v2, "next_url"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 147
    if-eqz v0, :cond_4

    const-string v2, ""

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_4

    .line 148
    invoke-static {v0}, Lcom/roidapp/cloudlib/instagram/r;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 153
    :cond_4
    :goto_1
    const/4 v0, 0x0

    :goto_2
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_5

    .line 154
    invoke-virtual {v3, v0}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    .line 155
    const-string v4, "created_time"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    .line 159
    const-string v4, "images"

    invoke-virtual {v2, v4}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    .line 161
    new-instance v4, Lcom/roidapp/cloudlib/instagram/m;

    invoke-direct {v4}, Lcom/roidapp/cloudlib/instagram/m;-><init>()V

    .line 162
    const-string v5, "standard_resolution"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    const-string v6, "url"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/roidapp/cloudlib/instagram/m;->b(Ljava/lang/String;)V

    .line 163
    const-string v5, "thumbnail"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    const-string v5, "url"

    invoke-virtual {v2, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Lcom/roidapp/cloudlib/instagram/m;->a(Ljava/lang/String;)V

    .line 3029
    iget-object v2, v1, Lcom/roidapp/cloudlib/instagram/r;->a:Ljava/util/List;

    .line 164
    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 153
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 151
    :catch_0
    move-exception v0

    const-string v0, "false"

    invoke-static {v0}, Lcom/roidapp/cloudlib/instagram/r;->a(Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    move-object v0, v1

    .line 166
    goto :goto_0
.end method

.method private static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .prologue
    .line 170
    const/4 v3, 0x0

    .line 172
    :try_start_0
    new-instance v1, Ljava/net/URL;

    invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 173
    invoke-virtual {v1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object v2

    .line 174
    const/16 v1, 0x2710

    invoke-virtual {v2, v1}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 175
    const/16 v1, 0x2710

    invoke-virtual {v2, v1}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 176
    move-object v0, v2

    check-cast v0, Ljava/net/HttpURLConnection;

    move-object v1, v0

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    move-result v1

    const/16 v4, 0x1f7

    if-ne v1, v4, :cond_1

    .line 177
    new-instance v1, Ljava/io/IOException;

    const-string v2, "503"

    invoke-direct {v1, v2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 192
    :catchall_0
    move-exception v1

    move-object v2, v3

    :goto_0
    if-eqz v2, :cond_0

    .line 194
    :try_start_1
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 197
    :cond_0
    :goto_1
    throw v1

    .line 179
    :cond_1
    :try_start_2
    invoke-virtual {v2}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result-object v2

    .line 180
    :try_start_3
    new-instance v1, Ljava/io/InputStreamReader;

    const-string v3, "UTF-8"

    invoke-direct {v1, v2, v3}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 181
    new-instance v3, Ljava/io/BufferedReader;

    invoke-direct {v3, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 182
    new-instance v4, Ljava/lang/StringBuffer;

    invoke-direct {v4}, Ljava/lang/StringBuffer;-><init>()V

    .line 184
    :goto_2
    invoke-virtual {v3}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    .line 185
    invoke-virtual {v4, v5}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;

    goto :goto_2

    .line 192
    :catchall_1
    move-exception v1

    goto :goto_0

    .line 187
    :cond_2
    invoke-virtual {v3}, Ljava/io/BufferedReader;->close()V

    .line 188
    invoke-virtual {v1}, Ljava/io/InputStreamReader;->close()V

    .line 189
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V

    .line 190
    invoke-virtual {v4}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    move-result-object v1

    .line 192
    if-eqz v2, :cond_3

    .line 194
    :try_start_4
    invoke-virtual {v2}, Ljava/io/InputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 197
    :cond_3
    :goto_3
    return-object v1

    .line 196
    :catch_0
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_3

    :catch_1
    move-exception v2

    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_1
.end method


# virtual methods
.method public final run()V
    .locals 9

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 49
    .line 52
    :try_start_0
    iget-boolean v0, p0, Lcom/roidapp/cloudlib/instagram/s;->c:Z

    if-eqz v0, :cond_3

    .line 53
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/s;->b:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/s;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 1084
    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v0

    const-string v3, "Instagram"

    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/al;->b(Ljava/lang/String;)Lcom/roidapp/cloudlib/ak;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/instagram/h;

    .line 1086
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "https://api.instagram.com/v1/media/popular?client_id="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lcom/roidapp/cloudlib/instagram/h;->f:Ljava/lang/String;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 1087
    new-instance v0, Lcom/roidapp/cloudlib/instagram/r;

    invoke-direct {v0}, Lcom/roidapp/cloudlib/instagram/r;-><init>()V

    .line 1088
    invoke-static {v3}, Lcom/roidapp/cloudlib/instagram/s;->b(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    move-result-object v3

    .line 1089
    if-nez v3, :cond_2

    move-object v0, v1

    :cond_0
    move v1, v2

    move-object v3, v0

    .line 76
    :goto_0
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/s;->f:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    .line 77
    if-eqz v0, :cond_1

    .line 78
    const/16 v4, 0x200

    invoke-static {v0, v4, v1, v2, v3}, Landroid/os/Message;->obtain(Landroid/os/Handler;IIILjava/lang/Object;)Landroid/os/Message;

    move-result-object v1

    .line 79
    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 81
    :cond_1
    return-void

    .line 1092
    :cond_2
    :try_start_1
    const-string v4, "LoadPublicPhotoTask"

    invoke-static {v4, v3}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 1093
    new-instance v4, Lorg/json/JSONObject;

    invoke-direct {v4, v3}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 1094
    const-string v3, "data"

    invoke-virtual {v4, v3}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    move v3, v2

    .line 1095
    :goto_1
    invoke-virtual {v4}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-ge v3, v5, :cond_0

    .line 1096
    invoke-virtual {v4, v3}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 1097
    const-string v6, "images"

    invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 1099
    new-instance v6, Lcom/roidapp/cloudlib/instagram/m;

    invoke-direct {v6}, Lcom/roidapp/cloudlib/instagram/m;-><init>()V

    .line 1100
    const-string v7, "low_resolution"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v7

    const-string v8, "url"

    invoke-virtual {v7, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Lcom/roidapp/cloudlib/instagram/m;->b(Ljava/lang/String;)V

    .line 1101
    const-string v7, "thumbnail"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    const-string v7, "url"

    invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v5}, Lcom/roidapp/cloudlib/instagram/m;->a(Ljava/lang/String;)V

    .line 2029
    iget-object v5, v0, Lcom/roidapp/cloudlib/instagram/r;->a:Ljava/util/List;

    .line 1102
    invoke-interface {v5, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 1095
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 57
    :cond_3
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/s;->d:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/roidapp/cloudlib/instagram/s;->a(Ljava/lang/String;)Lcom/roidapp/cloudlib/instagram/r;
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v1

    :cond_4
    move-object v3, v1

    move v1, v2

    .line 74
    goto :goto_0

    .line 59
    :catch_0
    move-exception v0

    .line 60
    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    .line 61
    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    .line 62
    if-eqz v0, :cond_7

    .line 63
    const-string v3, "503"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    .line 64
    const/16 v0, 0x1f7

    move-object v3, v1

    move v1, v0

    goto :goto_0

    .line 65
    :cond_5
    const-string v3, "validate certificate"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_7

    const-string v3, "time"

    invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 66
    const/4 v0, -0x1

    :goto_2
    move-object v3, v1

    move v1, v0

    .line 74
    goto/16 :goto_0

    .line 69
    :catch_1
    move-exception v0

    move-object v3, v0

    .line 70
    iget-object v0, p0, Lcom/roidapp/cloudlib/instagram/s;->b:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;

    .line 71
    if-eqz v0, :cond_6

    .line 72
    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/instagram/InstagramPhotoFragment;->a(Ljava/lang/Exception;)V

    :cond_6
    move-object v3, v1

    move v1, v2

    goto/16 :goto_0

    :cond_7
    move v0, v2

    goto :goto_2
.end method
