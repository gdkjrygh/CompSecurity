.class public final Lcrittercism/android/bi;
.super Lcrittercism/android/di;

# interfaces
.implements Lcrittercism/android/bs;


# instance fields
.field private a:J

.field private volatile b:J

.field private c:Landroid/os/ConditionVariable;

.field private d:Landroid/os/ConditionVariable;

.field private e:Lcrittercism/android/au;

.field private f:Lcrittercism/android/br;

.field private g:Lcrittercism/android/br;

.field private h:Lcrittercism/android/br;

.field private i:Lcrittercism/android/br;

.field private j:Ljava/lang/String;

.field private k:Landroid/content/Context;

.field private volatile l:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcrittercism/android/au;Lcrittercism/android/br;Lcrittercism/android/br;Lcrittercism/android/br;Lcrittercism/android/br;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 64
    invoke-direct {p0}, Lcrittercism/android/di;-><init>()V

    .line 47
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/bi;->a:J

    .line 48
    const-wide/16 v0, 0x2710

    iput-wide v0, p0, Lcrittercism/android/bi;->b:J

    .line 49
    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0, v2}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object v0, p0, Lcrittercism/android/bi;->c:Landroid/os/ConditionVariable;

    .line 50
    new-instance v0, Landroid/os/ConditionVariable;

    invoke-direct {v0, v2}, Landroid/os/ConditionVariable;-><init>(Z)V

    iput-object v0, p0, Lcrittercism/android/bi;->d:Landroid/os/ConditionVariable;

    .line 59
    iput-boolean v2, p0, Lcrittercism/android/bi;->l:Z

    .line 65
    iput-object p1, p0, Lcrittercism/android/bi;->k:Landroid/content/Context;

    .line 74
    iput-object p3, p0, Lcrittercism/android/bi;->f:Lcrittercism/android/br;

    .line 75
    iput-object p4, p0, Lcrittercism/android/bi;->g:Lcrittercism/android/br;

    .line 76
    iput-object p5, p0, Lcrittercism/android/bi;->h:Lcrittercism/android/br;

    .line 77
    iput-object p6, p0, Lcrittercism/android/bi;->i:Lcrittercism/android/br;

    .line 78
    iput-object p2, p0, Lcrittercism/android/bi;->e:Lcrittercism/android/au;

    .line 79
    iput-object p7, p0, Lcrittercism/android/bi;->j:Ljava/lang/String;

    .line 80
    iget-object v0, p0, Lcrittercism/android/bi;->f:Lcrittercism/android/br;

    invoke-virtual {v0, p0}, Lcrittercism/android/br;->a(Lcrittercism/android/bs;)V

    .line 81
    return-void
.end method

.method private a(Lorg/json/JSONArray;)Lorg/json/JSONObject;
    .locals 4

    .prologue
    .line 184
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 186
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 187
    const-string v2, "appID"

    iget-object v3, p0, Lcrittercism/android/bi;->e:Lcrittercism/android/au;

    invoke-interface {v3}, Lcrittercism/android/au;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 188
    const-string v2, "deviceID"

    iget-object v3, p0, Lcrittercism/android/bi;->e:Lcrittercism/android/au;

    invoke-interface {v3}, Lcrittercism/android/au;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 189
    const-string v2, "crPlatform"

    const-string v3, "android"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 190
    const-string v2, "crVersion"

    iget-object v3, p0, Lcrittercism/android/bi;->e:Lcrittercism/android/au;

    invoke-interface {v3}, Lcrittercism/android/au;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 191
    const-string v2, "deviceModel"

    iget-object v3, p0, Lcrittercism/android/bi;->e:Lcrittercism/android/au;

    invoke-interface {v3}, Lcrittercism/android/au;->j()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 192
    const-string v2, "osName"

    const-string v3, "android"

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 193
    const-string v2, "osVersion"

    iget-object v3, p0, Lcrittercism/android/bi;->e:Lcrittercism/android/au;

    invoke-interface {v3}, Lcrittercism/android/au;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 194
    const-string v2, "carrier"

    iget-object v3, p0, Lcrittercism/android/bi;->e:Lcrittercism/android/au;

    invoke-interface {v3}, Lcrittercism/android/au;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    const-string v2, "mobileCountryCode"

    iget-object v3, p0, Lcrittercism/android/bi;->e:Lcrittercism/android/au;

    invoke-interface {v3}, Lcrittercism/android/au;->g()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 196
    const-string v2, "mobileNetworkCode"

    iget-object v3, p0, Lcrittercism/android/bi;->e:Lcrittercism/android/au;

    invoke-interface {v3}, Lcrittercism/android/au;->h()I

    move-result v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 197
    const-string v2, "appVersion"

    iget-object v3, p0, Lcrittercism/android/bi;->e:Lcrittercism/android/au;

    invoke-interface {v3}, Lcrittercism/android/au;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 198
    const-string v2, "locale"

    new-instance v3, Lcrittercism/android/bw$k;

    invoke-direct {v3}, Lcrittercism/android/bw$k;-><init>()V

    iget-object v3, v3, Lcrittercism/android/bw$k;->a:Ljava/lang/String;

    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 200
    const-string v2, "appState"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 201
    const-string v1, "transactions"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 202
    invoke-static {p1}, Lcrittercism/android/bi;->b(Lorg/json/JSONArray;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 203
    const-string v1, "breadcrumbs"

    new-instance v2, Lcrittercism/android/bn;

    iget-object v3, p0, Lcrittercism/android/bi;->g:Lcrittercism/android/br;

    invoke-direct {v2, v3}, Lcrittercism/android/bn;-><init>(Lcrittercism/android/br;)V

    iget-object v2, v2, Lcrittercism/android/bn;->a:Lorg/json/JSONArray;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 205
    const-string v1, "endpoints"

    new-instance v2, Lcrittercism/android/bn;

    iget-object v3, p0, Lcrittercism/android/bi;->h:Lcrittercism/android/br;

    invoke-direct {v2, v3}, Lcrittercism/android/bn;-><init>(Lcrittercism/android/br;)V

    iget-object v2, v2, Lcrittercism/android/bn;->a:Lorg/json/JSONArray;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 206
    const-string v1, "systemBreadcrumbs"

    new-instance v2, Lcrittercism/android/bn;

    iget-object v3, p0, Lcrittercism/android/bi;->i:Lcrittercism/android/br;

    invoke-direct {v2, v3}, Lcrittercism/android/bn;-><init>(Lcrittercism/android/br;)V

    iget-object v2, v2, Lcrittercism/android/bn;->a:Lorg/json/JSONArray;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    :cond_0
    :goto_0
    return-object v0

    .line 209
    :catch_0
    move-exception v0

    .line 211
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private static b(Lorg/json/JSONArray;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 217
    move v0, v1

    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v2

    if-ge v0, v2, :cond_0

    .line 218
    invoke-virtual {p0, v0}, Lorg/json/JSONArray;->optJSONArray(I)Lorg/json/JSONArray;

    move-result-object v2

    .line 219
    if-eqz v2, :cond_1

    .line 221
    :try_start_0
    new-instance v3, Lcrittercism/android/bg;

    invoke-direct {v3, v2}, Lcrittercism/android/bg;-><init>(Lorg/json/JSONArray;)V

    .line 222
    invoke-virtual {v3}, Lcrittercism/android/bg;->k()Lcrittercism/android/bg$a;

    move-result-object v2

    .line 229
    sget-object v3, Lcrittercism/android/bg$a;->c:Lcrittercism/android/bg$a;

    if-eq v2, v3, :cond_1

    sget-object v3, Lcrittercism/android/bg$a;->i:Lcrittercism/android/bg$a;

    if-eq v2, v3, :cond_1

    sget-object v3, Lcrittercism/android/bg$a;->h:Lcrittercism/android/bg$a;
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/text/ParseException; {:try_start_0 .. :try_end_0} :catch_1

    if-eq v2, v3, :cond_1

    .line 232
    const/4 v1, 0x1

    .line 241
    :cond_0
    return v1

    .line 234
    :catch_0
    move-exception v2

    invoke-static {v2}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    .line 217
    :cond_1
    :goto_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 236
    :catch_1
    move-exception v2

    invoke-static {v2}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto :goto_1
.end method


# virtual methods
.method public final a()V
    .locals 6

    .prologue
    .line 85
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lcrittercism/android/bi;->l:Z

    if-nez v0, :cond_1

    .line 86
    iget-object v0, p0, Lcrittercism/android/bi;->c:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    .line 87
    iget-object v0, p0, Lcrittercism/android/bi;->d:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->block()V

    .line 89
    iget-boolean v0, p0, Lcrittercism/android/bi;->l:Z

    if-eqz v0, :cond_2

    .line 118
    :cond_1
    return-void

    .line 93
    :cond_2
    iget-wide v0, p0, Lcrittercism/android/bi;->b:J

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    iget-wide v4, p0, Lcrittercism/android/bi;->a:J

    sub-long/2addr v2, v4

    sub-long/2addr v0, v2

    .line 94
    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_3

    .line 96
    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_2

    .line 101
    :cond_3
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/bi;->a:J

    .line 102
    iget-object v0, p0, Lcrittercism/android/bi;->f:Lcrittercism/android/br;

    iget-object v1, p0, Lcrittercism/android/bi;->k:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lcrittercism/android/br;->a(Landroid/content/Context;)Lcrittercism/android/br;

    move-result-object v0

    .line 106
    iget-object v1, p0, Lcrittercism/android/bi;->f:Lcrittercism/android/br;

    invoke-virtual {v1, v0}, Lcrittercism/android/br;->b(Lcrittercism/android/br;)V

    .line 108
    new-instance v1, Lcrittercism/android/bn;

    invoke-direct {v1, v0}, Lcrittercism/android/bn;-><init>(Lcrittercism/android/br;)V

    iget-object v1, v1, Lcrittercism/android/bn;->a:Lorg/json/JSONArray;

    .line 109
    invoke-static {v0}, Lcrittercism/android/br;->a(Lcrittercism/android/br;)V

    .line 111
    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_0

    .line 112
    invoke-direct {p0, v1}, Lcrittercism/android/bi;->a(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v0

    .line 113
    if-eqz v0, :cond_0

    .line 114
    invoke-direct {p0, v1}, Lcrittercism/android/bi;->a(Lorg/json/JSONArray;)Lorg/json/JSONObject;

    move-result-object v0

    :try_start_1
    new-instance v1, Lcrittercism/android/dc;

    new-instance v2, Ljava/net/URL;

    iget-object v3, p0, Lcrittercism/android/bi;->j:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lcrittercism/android/dc;-><init>(Ljava/net/URL;)V

    invoke-virtual {v1}, Lcrittercism/android/dc;->a()Ljava/net/HttpURLConnection;

    move-result-object v1

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v2

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "UTF8"

    invoke-virtual {v0, v3}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I

    invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_0
    move-exception v0

    invoke-static {}, Lcrittercism/android/dx;->c()V

    goto/16 :goto_0

    :catch_1
    move-exception v0

    invoke-static {v0}, Lcrittercism/android/dx;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_0

    :catch_2
    move-exception v0

    goto :goto_1
.end method

.method public final a(ILjava/util/concurrent/TimeUnit;)V
    .locals 2

    .prologue
    .line 154
    int-to-long v0, p1

    invoke-virtual {p2, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    iput-wide v0, p0, Lcrittercism/android/bi;->b:J

    .line 155
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lcrittercism/android/bi;->c:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    .line 131
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 143
    iget-object v0, p0, Lcrittercism/android/bi;->f:Lcrittercism/android/br;

    .line 144
    iget-object v0, p0, Lcrittercism/android/bi;->d:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->open()V

    .line 145
    return-void
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 149
    iget-object v0, p0, Lcrittercism/android/bi;->f:Lcrittercism/android/br;

    .line 150
    iget-object v0, p0, Lcrittercism/android/bi;->d:Landroid/os/ConditionVariable;

    invoke-virtual {v0}, Landroid/os/ConditionVariable;->close()V

    .line 151
    return-void
.end method
