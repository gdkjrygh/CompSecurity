.class public final Lkik/android/util/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/util/a$b;,
        Lkik/android/util/a$a;,
        Lkik/android/util/a$c;,
        Lkik/android/util/a$d;
    }
.end annotation


# static fields
.field private static final a:Lorg/c/b;

.field private static b:Lkik/android/util/a;


# instance fields
.field private c:Landroid/content/SharedPreferences;

.field private d:Landroid/app/Application;

.field private e:Lkik/a/e/v;

.field private f:Lcom/kik/l/ab;

.field private g:Landroid/os/HandlerThread;

.field private h:Ljava/util/HashMap;

.field private i:Ljava/util/HashSet;

.field private j:Ljava/util/Hashtable;

.field private final k:Lkik/android/util/a$c;

.field private l:Ljava/lang/String;

.field private m:Ljava/util/HashMap;

.field private final n:[B

.field private o:Z

.field private p:Ljava/util/HashMap;

.field private final q:Lkik/android/util/a$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 74
    const-string v0, "AndroidFileManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/util/a;->a:Lorg/c/b;

    return-void
.end method

.method private constructor <init>(Landroid/app/Application;Lkik/a/e/v;Lcom/kik/l/ab;Lkik/android/util/ar;)V
    .locals 2

    .prologue
    .line 94
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 110
    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "FiledDownManager"

    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/util/a;->g:Landroid/os/HandlerThread;

    .line 112
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lkik/android/util/a;->i:Ljava/util/HashSet;

    .line 113
    new-instance v0, Ljava/util/Hashtable;

    invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V

    iput-object v0, p0, Lkik/android/util/a;->j:Ljava/util/Hashtable;

    .line 131
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/android/util/a;->m:Ljava/util/HashMap;

    .line 158
    const/16 v0, 0x400

    new-array v0, v0, [B

    iput-object v0, p0, Lkik/android/util/a;->n:[B

    .line 160
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/util/a;->o:Z

    .line 432
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lkik/android/util/a;->p:Ljava/util/HashMap;

    .line 95
    iget-object v0, p0, Lkik/android/util/a;->g:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    .line 96
    new-instance v0, Lkik/android/util/a$c;

    iget-object v1, p0, Lkik/android/util/a;->g:Landroid/os/HandlerThread;

    invoke-virtual {v1}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lkik/android/util/a$c;-><init>(Lkik/android/util/a;Landroid/os/Looper;)V

    iput-object v0, p0, Lkik/android/util/a;->k:Lkik/android/util/a$c;

    .line 97
    new-instance v0, Lkik/android/util/a$b;

    invoke-interface {p2}, Lkik/a/e/v;->m()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, p0, p1, v1}, Lkik/android/util/a$b;-><init>(Lkik/android/util/a;Landroid/content/Context;Ljava/lang/String;)V

    iput-object v0, p0, Lkik/android/util/a;->q:Lkik/android/util/a$b;

    .line 98
    invoke-direct {p0}, Lkik/android/util/a;->e()Ljava/util/HashMap;

    move-result-object v0

    iput-object v0, p0, Lkik/android/util/a;->h:Ljava/util/HashMap;

    .line 99
    iput-object p1, p0, Lkik/android/util/a;->d:Landroid/app/Application;

    .line 100
    iput-object p2, p0, Lkik/android/util/a;->e:Lkik/a/e/v;

    .line 101
    const-string v0, "KikPrecachePrefs"

    invoke-interface {p4, v0}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    iput-object v0, p0, Lkik/android/util/a;->c:Landroid/content/SharedPreferences;

    .line 102
    iput-object p3, p0, Lkik/android/util/a;->f:Lcom/kik/l/ab;

    .line 103
    return-void
.end method

.method static synthetic a(Lkik/android/util/a;)Lcom/kik/l/ab;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lkik/android/util/a;->f:Lcom/kik/l/ab;

    return-object v0
.end method

.method public static a()Lkik/android/util/a;
    .locals 2

    .prologue
    .line 87
    sget-object v0, Lkik/android/util/a;->b:Lkik/android/util/a;

    if-nez v0, :cond_0

    .line 88
    new-instance v0, Ljava/lang/RuntimeException;

    const-string v1, "AndroidFileManager not initialized"

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 90
    :cond_0
    sget-object v0, Lkik/android/util/a;->b:Lkik/android/util/a;

    return-object v0
.end method

.method public static a(Landroid/app/Application;Lkik/a/e/v;Lcom/kik/l/ab;Lkik/android/util/ar;)V
    .locals 1

    .prologue
    .line 80
    sget-object v0, Lkik/android/util/a;->b:Lkik/android/util/a;

    if-nez v0, :cond_0

    .line 81
    new-instance v0, Lkik/android/util/a;

    invoke-direct {v0, p0, p1, p2, p3}, Lkik/android/util/a;-><init>(Landroid/app/Application;Lkik/a/e/v;Lcom/kik/l/ab;Lkik/android/util/ar;)V

    sput-object v0, Lkik/android/util/a;->b:Lkik/android/util/a;

    .line 83
    :cond_0
    return-void
.end method

.method private declared-synchronized a(Lkik/android/util/a$a;I)V
    .locals 20

    .prologue
    .line 165
    monitor-enter p0

    :try_start_0
    move-object/from16 v0, p0

    iget-boolean v2, v0, Lkik/android/util/a;->o:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v2, :cond_1

    .line 326
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 169
    :cond_1
    :try_start_1
    invoke-virtual/range {p1 .. p1}, Lkik/android/util/a$a;->a()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->c(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 173
    const/4 v3, 0x0

    .line 174
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/a;->c:Landroid/content/SharedPreferences;

    const-string v4, "interval-start"

    const-wide/16 v6, 0x0

    invoke-interface {v2, v4, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v10

    .line 175
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/a;->c:Landroid/content/SharedPreferences;

    const-string v4, "amount"

    const-wide/16 v6, 0x0

    invoke-interface {v2, v4, v6, v7}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v12

    .line 177
    const/4 v2, 0x2

    move/from16 v0, p2

    if-ne v0, v2, :cond_18

    .line 178
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/a;->d:Landroid/app/Application;

    const-string v4, "connectivity"

    invoke-virtual {v2, v4}, Landroid/app/Application;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/net/ConnectivityManager;

    .line 179
    const/4 v4, 0x1

    invoke-virtual {v2, v4}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;

    move-result-object v4

    .line 181
    if-eqz v4, :cond_2

    invoke-virtual {v4}, Landroid/net/NetworkInfo;->isConnected()Z

    move-result v4

    if-nez v4, :cond_18

    .line 182
    :cond_2
    invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;

    move-result-object v2

    .line 183
    if-eqz v2, :cond_3

    invoke-virtual {v2}, Landroid/net/NetworkInfo;->isRoaming()Z

    move-result v2

    if-nez v2, :cond_0

    .line 187
    :cond_3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v10

    const-wide/32 v4, 0x240c8400

    cmp-long v2, v2, v4

    if-gez v2, :cond_4

    const-wide/32 v2, 0x7d00000

    cmp-long v2, v12, v2

    if-gtz v2, :cond_0

    .line 191
    :cond_4
    const/4 v2, 0x1

    move v8, v2

    .line 195
    :goto_1
    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->d(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/util/a;->l:Ljava/lang/String;

    .line 197
    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->a(Lkik/android/util/a$a;)I

    move-result v4

    .line 198
    new-instance v7, Ljava/io/File;

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->e(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v7, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 200
    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->b(Lkik/android/util/a$a;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v3

    .line 202
    const/4 v5, 0x0

    .line 204
    :try_start_2
    new-instance v2, Ljava/io/FileOutputStream;

    if-eqz v3, :cond_b

    const/4 v6, 0x1

    :goto_2
    invoke-direct {v2, v7, v6}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;Z)V
    :try_end_2
    .catch Ljava/io/FileNotFoundException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-object v7, v2

    .line 214
    :goto_3
    :try_start_3
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/a;->e:Lkik/a/e/v;

    invoke-static {v2}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v9

    move v2, v3

    .line 215
    :goto_4
    invoke-virtual/range {p1 .. p1}, Lkik/android/util/a$a;->a()Z

    move-result v5

    if-nez v5, :cond_12

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->a(Lkik/android/util/a$a;)I

    move-result v5

    const/4 v6, -0x1

    if-eq v5, v6, :cond_5

    if-ge v2, v4, :cond_12

    .line 216
    :cond_5
    const/4 v5, 0x0

    .line 217
    new-instance v6, Lorg/apache/http/params/BasicHttpParams;

    invoke-direct {v6}, Lorg/apache/http/params/BasicHttpParams;-><init>()V

    const/16 v14, 0x4e20

    invoke-static {v6, v14}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V

    const/16 v14, 0x4e20

    invoke-static {v6, v14}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V

    new-instance v14, Lorg/apache/http/impl/client/DefaultHttpClient;

    invoke-direct {v14}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V

    new-instance v15, Lorg/apache/http/protocol/BasicHttpContext;

    invoke-direct {v15}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V

    new-instance v16, Lorg/apache/http/client/methods/HttpGet;

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->c(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, v16

    invoke-direct {v0, v6}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v16 .. v16}, Lorg/apache/http/client/methods/HttpGet;->getURI()Ljava/net/URI;

    move-result-object v6

    invoke-virtual {v6}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v6

    const-string v17, ".kik.com"

    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_7

    const-string v6, "x-kik-jid"

    invoke-virtual {v9}, Lkik/a/z;->a()Lkik/a/d/j;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Lkik/a/d/j;->a()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v6, v1}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "x-kik-password"

    invoke-virtual {v9}, Lkik/a/z;->b()Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v6, v1}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v17, "Range"

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v18, "bytes="

    move-object/from16 v0, v18

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v18, "-"

    move-object/from16 v0, v18

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v18

    const/4 v6, -0x1

    if-ne v4, v6, :cond_c

    const-string v6, ""

    :goto_5
    move-object/from16 v0, v18

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v1, v6}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    const-string v6, "com.kik.ext.video-camera"

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->g(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    const-string v6, "com.kik.ext.video-gallery"

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->g(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v17

    invoke-virtual {v6, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    :cond_6
    if-nez v2, :cond_d

    const-string v6, "Accept"

    const-string v17, "*/*, video/mp4"

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v6, v1}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V

    :cond_7
    :goto_6
    move-object/from16 v0, v16

    invoke-interface {v14, v0, v15}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;

    move-result-object v6

    .line 218
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v14

    invoke-interface {v14}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v14

    .line 219
    const/16 v15, 0xce

    if-ne v14, v15, :cond_14

    .line 220
    const-string v14, "Content-Type"

    invoke-interface {v6, v14}, Lorg/apache/http/HttpResponse;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;

    move-result-object v14

    .line 221
    const-string v15, "Content-Range"

    invoke-interface {v6, v15}, Lorg/apache/http/HttpResponse;->getHeaders(Ljava/lang/String;)[Lorg/apache/http/Header;

    move-result-object v15

    .line 223
    array-length v0, v15

    move/from16 v16, v0

    const/16 v17, 0x1

    move/from16 v0, v16

    move/from16 v1, v17

    if-ne v0, v1, :cond_8

    array-length v0, v14

    move/from16 v16, v0

    const/16 v17, 0x1

    move/from16 v0, v16

    move/from16 v1, v17

    if-ne v0, v1, :cond_8

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->f(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v16

    if-eqz v16, :cond_e

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->f(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v16

    const/16 v17, 0x0

    aget-object v17, v14, v17

    invoke-interface/range {v17 .. v17}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v17

    invoke-virtual/range {v16 .. v17}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v16

    if-nez v16, :cond_e

    .line 224
    :cond_8
    const/4 v5, 0x1

    move/from16 v19, v5

    move v5, v4

    move/from16 v4, v19

    .line 238
    :goto_7
    if-nez v4, :cond_10

    .line 239
    move-object/from16 v0, p0

    iget-object v15, v0, Lkik/android/util/a;->j:Ljava/util/Hashtable;

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->d(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v16

    invoke-virtual/range {v15 .. v16}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    const/4 v15, 0x0

    aget-object v14, v14, v15

    invoke-interface {v14}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v14

    move-object/from16 v0, p1

    invoke-static {v0, v14}, Lkik/android/util/a$a;->a(Lkik/android/util/a$a;Ljava/lang/String;)Ljava/lang/String;

    .line 241
    invoke-interface {v6}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v6

    invoke-interface {v6}, Lorg/apache/http/HttpEntity;->getContent()Ljava/io/InputStream;

    move-result-object v6

    .line 242
    :goto_8
    const/4 v14, -0x1

    move-object/from16 v0, p0

    iget-object v15, v0, Lkik/android/util/a;->n:[B

    invoke-virtual {v6, v15}, Ljava/io/InputStream;->read([B)I

    move-result v15

    if-eq v14, v15, :cond_f

    .line 244
    move-object/from16 v0, p0

    iget-object v14, v0, Lkik/android/util/a;->n:[B

    const/16 v16, 0x0

    move/from16 v0, v16

    invoke-virtual {v7, v14, v0, v15}, Ljava/io/FileOutputStream;->write([BII)V

    .line 245
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->flush()V

    .line 246
    add-int/2addr v2, v15

    .line 247
    move-object/from16 v0, p1

    invoke-virtual {v0, v2}, Lkik/android/util/a$a;->b(I)V
    :try_end_3
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_3 .. :try_end_3} :catch_0
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_8

    .line 310
    :catch_0
    move-exception v2

    :try_start_4
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exception while downloading file from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->c(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 317
    :cond_9
    :goto_9
    if-eqz v7, :cond_a

    .line 318
    :try_start_5
    invoke-virtual {v7}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 325
    :cond_a
    :goto_a
    const/4 v2, 0x0

    :try_start_6
    move-object/from16 v0, p0

    iput-object v2, v0, Lkik/android/util/a;->l:Ljava/lang/String;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto/16 :goto_0

    .line 165
    :catchall_0
    move-exception v2

    monitor-exit p0

    throw v2

    .line 204
    :cond_b
    const/4 v6, 0x0

    goto/16 :goto_2

    .line 206
    :catch_1
    move-exception v2

    :try_start_7
    invoke-virtual {v2}, Ljava/io/FileNotFoundException;->printStackTrace()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    move-object v7, v5

    goto/16 :goto_3

    .line 217
    :cond_c
    add-int/lit8 v6, v4, -0x1

    :try_start_8
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto/16 :goto_5

    :cond_d
    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->f(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_7

    const-string v6, "Accept"

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->f(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v17

    move-object/from16 v0, v16

    move-object/from16 v1, v17

    invoke-virtual {v0, v6, v1}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_8
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_8 .. :try_end_8} :catch_0
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_2
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    goto/16 :goto_6

    .line 313
    :catch_2
    move-exception v2

    :try_start_9
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Exception while downloading file from "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->c(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    goto :goto_9

    .line 228
    :cond_e
    const/16 v16, 0x0

    :try_start_a
    aget-object v15, v15, v16

    invoke-interface {v15}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;

    move-result-object v15

    .line 229
    const/16 v16, 0x2f

    invoke-virtual/range {v15 .. v16}, Ljava/lang/String;->indexOf(I)I

    move-result v16

    add-int/lit8 v16, v16, 0x1

    invoke-virtual/range {v15 .. v16}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v15

    .line 230
    move-object/from16 v0, p1

    invoke-virtual {v0, v15}, Lkik/android/util/a$a;->a(I)V

    .line 231
    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->a(Lkik/android/util/a$a;)I
    :try_end_a
    .catch Ljava/lang/Exception; {:try_start_a .. :try_end_a} :catch_3
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_a .. :try_end_a} :catch_0
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    move-result v4

    move/from16 v19, v5

    move v5, v4

    move/from16 v4, v19

    .line 235
    goto/16 :goto_7

    .line 234
    :catch_3
    move-exception v5

    const/4 v5, 0x1

    move/from16 v19, v5

    move v5, v4

    move/from16 v4, v19

    goto/16 :goto_7

    .line 250
    :cond_f
    if-eqz v8, :cond_10

    .line 251
    :try_start_b
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/util/a;->c:Landroid/content/SharedPreferences;

    invoke-interface {v6}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v6

    .line 252
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    sub-long/2addr v14, v10

    const-wide/32 v16, 0x240c8400

    cmp-long v14, v14, v16

    if-gez v14, :cond_13

    .line 253
    const-string v14, "amount"

    sub-int v15, v2, v3

    int-to-long v0, v15

    move-wide/from16 v16, v0

    add-long v16, v16, v12

    move-wide/from16 v0, v16

    invoke-interface {v6, v14, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 259
    :goto_b
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->commit()Z

    :cond_10
    move/from16 v19, v4

    move v4, v2

    move/from16 v2, v19

    .line 280
    :goto_c
    if-eqz v2, :cond_17

    .line 281
    const/4 v2, 0x1

    .line 282
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/util/a;->j:Ljava/util/Hashtable;

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->d(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6, v14}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_11

    .line 283
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/a;->j:Ljava/util/Hashtable;

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->d(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 284
    :cond_11
    move-object/from16 v0, p0

    iget-object v6, v0, Lkik/android/util/a;->j:Ljava/util/Hashtable;

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->d(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v14

    new-instance v15, Ljava/lang/Integer;

    invoke-direct {v15, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v6, v14, v15}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    const/4 v6, 0x3

    if-le v2, v6, :cond_17

    .line 289
    const/16 v3, 0xf

    if-le v2, v3, :cond_16

    .line 290
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/a;->j:Ljava/util/Hashtable;

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->d(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    :cond_12
    :goto_d
    invoke-virtual/range {p1 .. p1}, Lkik/android/util/a$a;->a()Z

    move-result v2

    if-eqz v2, :cond_9

    .line 305
    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->d(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v0, p0

    invoke-direct {v0, v2}, Lkik/android/util/a;->c(Ljava/lang/String;)V

    .line 306
    invoke-direct/range {p0 .. p0}, Lkik/android/util/a;->d()Z

    goto/16 :goto_9

    .line 256
    :cond_13
    const-string v14, "interval-start"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v16

    move-wide/from16 v0, v16

    invoke-interface {v6, v14, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 257
    const-string v14, "amount"

    sub-int v15, v2, v3

    int-to-long v0, v15

    move-wide/from16 v16, v0

    move-wide/from16 v0, v16

    invoke-interface {v6, v14, v0, v1}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    goto :goto_b

    .line 265
    :cond_14
    const/16 v5, 0x196

    if-ne v14, v5, :cond_15

    .line 266
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/a;->j:Ljava/util/Hashtable;

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->d(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    invoke-virtual/range {p1 .. p1}, Lkik/android/util/a$a;->b()Lkik/android/util/a$a;

    move-result-object v2

    .line 269
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/util/a;->h:Ljava/util/HashMap;

    invoke-static/range {p1 .. p1}, Lkik/android/util/a$a;->d(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/util/a;->k:Lkik/android/util/a$c;

    move/from16 v0, p2

    invoke-virtual {v3, v0}, Lkik/android/util/a$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 271
    iput-object v2, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 272
    move-object/from16 v0, p0

    iget-object v2, v0, Lkik/android/util/a;->k:Lkik/android/util/a$c;

    invoke-virtual {v2, v3}, Lkik/android/util/a$c;->sendMessage(Landroid/os/Message;)Z

    goto :goto_d

    .line 276
    :cond_15
    const/4 v5, 0x1

    move/from16 v19, v5

    move v5, v4

    move v4, v2

    move/from16 v2, v19

    goto/16 :goto_c

    .line 294
    :cond_16
    move-object/from16 v0, p0

    iget-object v3, v0, Lkik/android/util/a;->k:Lkik/android/util/a$c;

    move/from16 v0, p2

    invoke-virtual {v3, v0}, Lkik/android/util/a$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v3

    .line 295
    move-object/from16 v0, p1

    iput-object v0, v3, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 296
    move-object/from16 v0, p0

    iget-object v4, v0, Lkik/android/util/a;->k:Lkik/android/util/a$c;

    add-int/lit8 v5, v2, -0x3

    add-int/lit8 v6, v2, -0x3

    mul-int/2addr v5, v6

    add-int/lit8 v2, v2, -0x3

    mul-int/2addr v2, v5

    const/16 v5, 0xe10

    invoke-static {v2, v5}, Ljava/lang/Math;->min(II)I

    move-result v2

    mul-int/lit16 v2, v2, 0x3e8

    int-to-long v8, v2

    invoke-virtual {v4, v3, v8, v9}, Lkik/android/util/a$c;->sendMessageDelayed(Landroid/os/Message;J)Z
    :try_end_b
    .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_b .. :try_end_b} :catch_0
    .catch Ljava/io/IOException; {:try_start_b .. :try_end_b} :catch_2
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    goto/16 :goto_d

    :cond_17
    move v2, v4

    move v4, v5

    .line 301
    goto/16 :goto_4

    .line 321
    :catch_4
    move-exception v2

    :try_start_c
    invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    goto/16 :goto_a

    :cond_18
    move v8, v3

    goto/16 :goto_1
.end method

.method static synthetic a(Lkik/android/util/a;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lkik/android/util/a;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Vector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method static synthetic a(Lkik/android/util/a;Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1, p2, p3}, Lkik/android/util/a;->b(Ljava/lang/String;Ljava/lang/String;[B)V

    return-void
.end method

.method static synthetic a(Lkik/android/util/a;Lkik/android/util/a$a;I)V
    .locals 0

    .prologue
    .line 64
    invoke-direct {p0, p1, p2}, Lkik/android/util/a;->a(Lkik/android/util/a$a;I)V

    return-void
.end method

.method public static a(Lkik/a/e/v;Lkik/a/d/a/a;)Z
    .locals 2

    .prologue
    .line 790
    if-eqz p1, :cond_0

    const-string v0, "int-file-url-local"

    invoke-virtual {p1, v0}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/io/File;

    const-string v1, "int-file-url-local"

    invoke-virtual {p1, v1}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkik/a/e/v;->c(Ljava/io/File;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static b(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 782
    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    .line 783
    const/4 v1, 0x0

    const/16 v2, 0xa

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 784
    return-object v0
.end method

.method static synthetic b(Lkik/android/util/a;)Ljava/util/HashSet;
    .locals 1

    .prologue
    .line 64
    iget-object v0, p0, Lkik/android/util/a;->i:Ljava/util/HashSet;

    return-object v0
.end method

.method private declared-synchronized b(Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 438
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lkik/android/util/a;->e:Lkik/a/e/v;

    invoke-interface {v0, p2}, Lkik/a/e/v;->u(Ljava/lang/String;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v0

    if-eqz v0, :cond_1

    .line 464
    :cond_0
    :goto_0
    monitor-exit p0

    return-void

    .line 442
    :cond_1
    :try_start_1
    iget-object v0, p0, Lkik/android/util/a;->e:Lkik/a/e/v;

    invoke-static {v0}, Lkik/a/z;->b(Lkik/a/e/v;)Lkik/a/z;

    move-result-object v0

    invoke-static {p1, v0}, Lkik/android/p;->a(Ljava/lang/String;Lkik/a/z;)Lkik/android/net/d;

    move-result-object v0

    .line 444
    iget-object v2, v0, Lkik/android/net/d;->a:Ljava/lang/Object;

    check-cast v2, [B

    .line 445
    if-eqz v2, :cond_2

    iget-object v0, p0, Lkik/android/util/a;->e:Lkik/a/e/v;

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x1

    move-object v1, p2

    invoke-interface/range {v0 .. v5}, Lkik/a/e/v;->a(Ljava/lang/String;Ljava/lang/Object;ZZZ)Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 447
    iget-object v0, p0, Lkik/android/util/a;->p:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 438
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 450
    :cond_2
    :try_start_2
    iget-object v0, p0, Lkik/android/util/a;->p:Ljava/util/HashMap;

    invoke-virtual {v0, p2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    .line 451
    if-nez v0, :cond_3

    move v0, v6

    .line 452
    :goto_1
    add-int/lit8 v0, v0, 0x1

    .line 453
    if-gtz v0, :cond_0

    .line 459
    iget-object v1, p0, Lkik/android/util/a;->p:Ljava/util/HashMap;

    new-instance v2, Ljava/lang/Integer;

    invoke-direct {v2, v0}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v1, p2, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 460
    iget-object v0, p0, Lkik/android/util/a;->k:Lkik/android/util/a$c;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lkik/android/util/a$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 461
    new-instance v1, Lkik/android/util/a$d;

    invoke-direct {v1, p0, p1, p2, p3}, Lkik/android/util/a$d;-><init>(Lkik/android/util/a;Ljava/lang/String;Ljava/lang/String;[B)V

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 462
    iget-object v1, p0, Lkik/android/util/a;->k:Lkik/android/util/a$c;

    const-wide/16 v2, 0x1388

    invoke-virtual {v1, v0, v2, v3}, Lkik/android/util/a$c;->sendMessageDelayed(Landroid/os/Message;J)Z

    goto :goto_0

    .line 451
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move-result v0

    goto :goto_1
.end method

.method static synthetic b(Lkik/android/util/a;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 64
    iget-object v0, p0, Lkik/android/util/a;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Vector;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private c(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 330
    iget-object v0, p0, Lkik/android/util/a;->m:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Vector;

    .line 331
    if-eqz v0, :cond_0

    .line 332
    invoke-virtual {v0}, Ljava/util/Vector;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/ref/SoftReference;

    .line 333
    invoke-virtual {v0}, Ljava/lang/ref/SoftReference;->get()Ljava/lang/Object;

    goto :goto_0

    .line 339
    :cond_0
    return-void
.end method

.method private d()Z
    .locals 9

    .prologue
    .line 597
    iget-object v2, p0, Lkik/android/util/a;->q:Lkik/android/util/a$b;

    monitor-enter v2

    .line 598
    :try_start_0
    iget-object v0, p0, Lkik/android/util/a;->q:Lkik/android/util/a$b;

    invoke-virtual {v0}, Lkik/android/util/a$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v3

    .line 600
    const/4 v1, 0x1

    .line 602
    :try_start_1
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 603
    iget-object v0, p0, Lkik/android/util/a;->h:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/android/util/a$a;

    .line 604
    invoke-static {v0}, Lkik/android/util/a$a;->d(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v5

    .line 605
    if-eqz v5, :cond_0

    .line 607
    new-instance v6, Landroid/content/ContentValues;

    invoke-direct {v6}, Landroid/content/ContentValues;-><init>()V

    const-string v7, "uuid"

    invoke-static {v0}, Lkik/android/util/a$a;->d(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "appid"

    invoke-static {v0}, Lkik/android/util/a$a;->g(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "url"

    invoke-static {v0}, Lkik/android/util/a$a;->c(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "path"

    invoke-static {v0}, Lkik/android/util/a$a;->e(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    const-string v7, "size"

    invoke-static {v0}, Lkik/android/util/a$a;->a(Lkik/android/util/a$a;)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v7, "progress"

    invoke-static {v0}, Lkik/android/util/a$a;->b(Lkik/android/util/a$a;)I

    move-result v8

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v6, v7, v8}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    const-string v7, "contentType"

    invoke-static {v0}, Lkik/android/util/a$a;->f(Lkik/android/util/a$a;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v6, v7, v0}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/String;)V

    .line 608
    const-string v0, "AndroidFileTable"

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "uuid =\'"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    const-string v7, "\'"

    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const/4 v7, 0x0

    invoke-virtual {v3, v0, v6, v5, v7}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    .line 610
    const-string v0, "AndroidFileTable"

    const/4 v5, 0x0

    invoke-virtual {v3, v0, v5, v6}, Landroid/database/sqlite/SQLiteDatabase;->insert(Ljava/lang/String;Ljava/lang/String;Landroid/content/ContentValues;)J
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_0

    .line 616
    :catch_0
    move-exception v0

    .line 617
    :try_start_2
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "Android file update failed:"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 618
    const/4 v0, 0x0

    .line 621
    :try_start_3
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 624
    :goto_1
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    return v0

    .line 614
    :cond_1
    :try_start_4
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 621
    :try_start_5
    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    move v0, v1

    .line 623
    goto :goto_1

    .line 621
    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    throw v0

    .line 626
    :catchall_1
    move-exception v0

    monitor-exit v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw v0
.end method

.method private e()Ljava/util/HashMap;
    .locals 20

    .prologue
    .line 655
    new-instance v10, Ljava/util/HashMap;

    invoke-direct {v10}, Ljava/util/HashMap;-><init>()V

    .line 656
    move-object/from16 v0, p0

    iget-object v11, v0, Lkik/android/util/a;->q:Lkik/android/util/a$b;

    monitor-enter v11

    .line 657
    :try_start_0
    move-object/from16 v0, p0

    iget-object v1, v0, Lkik/android/util/a;->q:Lkik/android/util/a$b;

    invoke-virtual {v1}, Lkik/android/util/a$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v1

    .line 658
    const/4 v9, 0x0

    .line 661
    :try_start_1
    const-string v2, "AndroidFileTable"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-virtual/range {v1 .. v8}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-result-object v7

    .line 663
    :try_start_2
    const-string v1, "uuid"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v8

    .line 664
    const-string v1, "appid"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v9

    .line 665
    const-string v1, "url"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v12

    .line 666
    const-string v1, "path"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v13

    .line 667
    const-string v1, "size"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v14

    .line 668
    const-string v1, "progress"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v15

    .line 669
    const-string v1, "contentType"

    invoke-interface {v7, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    move-result v16

    .line 671
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 673
    :cond_0
    invoke-interface {v7, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 674
    invoke-interface {v7, v9}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 675
    invoke-interface {v7, v12}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v5

    .line 676
    invoke-interface {v7, v13}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v6

    .line 677
    invoke-interface {v7, v14}, Landroid/database/Cursor;->getInt(I)I

    move-result v17

    .line 678
    invoke-interface {v7, v15}, Landroid/database/Cursor;->getInt(I)I

    move-result v18

    .line 679
    move/from16 v0, v16

    invoke-interface {v7, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    move-result-object v19

    .line 681
    new-instance v1, Lkik/android/util/a$a;

    move-object/from16 v2, p0

    invoke-direct/range {v1 .. v6}, Lkik/android/util/a$a;-><init>(Lkik/android/util/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 682
    move/from16 v0, v17

    invoke-static {v1, v0}, Lkik/android/util/a$a;->a(Lkik/android/util/a$a;I)I

    .line 683
    move/from16 v0, v18

    invoke-static {v1, v0}, Lkik/android/util/a$a;->b(Lkik/android/util/a$a;I)I

    .line 684
    move-object/from16 v0, v19

    invoke-static {v1, v0}, Lkik/android/util/a$a;->a(Lkik/android/util/a$a;Ljava/lang/String;)Ljava/lang/String;

    .line 686
    invoke-virtual {v10, v4, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 687
    invoke-interface {v7}, Landroid/database/Cursor;->moveToNext()Z
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-result v1

    if-nez v1, :cond_0

    .line 695
    :cond_1
    if-eqz v7, :cond_2

    .line 696
    :try_start_3
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 699
    :cond_2
    :goto_0
    monitor-exit v11
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-object v10

    .line 690
    :catch_0
    move-exception v1

    move-object v2, v9

    .line 691
    :goto_1
    :try_start_4
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Error in getting files:"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 695
    if-eqz v2, :cond_2

    .line 696
    :try_start_5
    invoke-interface {v2}, Landroid/database/Cursor;->close()V

    goto :goto_0

    .line 700
    :catchall_0
    move-exception v1

    monitor-exit v11
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    throw v1

    .line 695
    :catchall_1
    move-exception v1

    move-object v7, v9

    :goto_2
    if-eqz v7, :cond_3

    .line 696
    :try_start_6
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    :cond_3
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 695
    :catchall_2
    move-exception v1

    goto :goto_2

    :catchall_3
    move-exception v1

    move-object v7, v2

    goto :goto_2

    .line 690
    :catch_1
    move-exception v1

    move-object v2, v7

    goto :goto_1
.end method


# virtual methods
.method public final a(Lkik/a/d/a/a;[BLjava/lang/String;Lcom/kik/cache/ad;Lcom/kik/cache/ContentImageView;Lcom/android/volley/r$a;Lcom/kik/android/a;)Lcom/kik/g/p;
    .locals 8

    .prologue
    const/4 v5, 0x0

    .line 707
    invoke-static {p3}, Lkik/a/f/e/a;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p1, :cond_1

    .line 709
    sget-object v0, Lcom/kik/cache/z;->e:Lcom/android/volley/r$b;

    invoke-static {p3, v0, p6}, Lcom/kik/cache/a;->a(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)Lcom/kik/cache/a;

    move-result-object v1

    .line 710
    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    move-object v2, v1

    move-object v1, v0

    .line 725
    :goto_0
    if-eqz v2, :cond_4

    .line 726
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 727
    if-eqz p1, :cond_0

    .line 730
    iget-object v3, p0, Lkik/android/util/a;->i:Ljava/util/HashSet;

    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 732
    :cond_0
    new-instance v3, Lkik/android/util/b;

    invoke-direct {v3, p0, v1, v0, p1}, Lkik/android/util/b;-><init>(Lkik/android/util/a;Ljava/lang/String;Lcom/kik/g/p;Lkik/a/d/a/a;)V

    const/4 v1, 0x1

    invoke-virtual {p4, v2, v3, v1}, Lcom/kik/cache/ad;->a(Lcom/kik/cache/z;Lcom/kik/cache/ad$d;Z)Lcom/kik/cache/ad$c;

    .line 771
    :goto_1
    return-object v0

    .line 712
    :cond_1
    if-eqz p1, :cond_2

    .line 713
    sget-object v2, Lcom/kik/cache/z;->e:Lcom/android/volley/r$b;

    const/4 v4, 0x0

    move-object v0, p1

    move-object v1, p3

    move-object v3, p6

    move-object v6, p2

    move-object v7, p7

    invoke-static/range {v0 .. v7}, Lcom/kik/cache/o;->a(Lkik/a/d/a/a;Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;ZLkik/a/z;[BLcom/kik/android/a;)Lcom/kik/cache/o;

    move-result-object v1

    .line 715
    invoke-virtual {p1}, Lkik/a/d/a/a;->o()Ljava/lang/String;

    move-result-object v0

    move-object v2, v1

    move-object v1, v0

    goto :goto_0

    .line 717
    :cond_2
    if-eqz p5, :cond_3

    .line 718
    invoke-virtual {p5}, Lcom/kik/cache/ContentImageView;->getMeasuredWidth()I

    move-result v0

    invoke-virtual {p5}, Lcom/kik/cache/ContentImageView;->getMeasuredHeight()I

    move-result v1

    invoke-static {p3, v0, v1}, Lcom/kik/cache/av;->a(Ljava/lang/String;II)Lcom/kik/cache/av;

    move-result-object v1

    .line 719
    invoke-static {p3}, Lkik/android/util/a;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v2, v1

    move-object v1, v0

    goto :goto_0

    .line 722
    :cond_3
    invoke-static {v5}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_1

    .line 771
    :cond_4
    invoke-static {v5}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;[B)V
    .locals 2

    .prologue
    .line 424
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 425
    iget-object v0, p0, Lkik/android/util/a;->k:Lkik/android/util/a$c;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lkik/android/util/a$c;->obtainMessage(I)Landroid/os/Message;

    move-result-object v0

    .line 426
    new-instance v1, Lkik/android/util/a$d;

    invoke-direct {v1, p0, p1, p2, p3}, Lkik/android/util/a$d;-><init>(Lkik/android/util/a;Ljava/lang/String;Ljava/lang/String;[B)V

    iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 427
    iget-object v1, p0, Lkik/android/util/a;->p:Ljava/util/HashMap;

    invoke-virtual {v1, p2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 428
    iget-object v1, p0, Lkik/android/util/a;->k:Lkik/android/util/a$c;

    invoke-virtual {v1, v0}, Lkik/android/util/a$c;->sendMessage(Landroid/os/Message;)Z

    .line 430
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 776
    iget-object v0, p0, Lkik/android/util/a;->i:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 631
    iget-object v0, p0, Lkik/android/util/a;->q:Lkik/android/util/a$b;

    invoke-virtual {v0}, Lkik/android/util/a$b;->getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;

    move-result-object v0

    .line 632
    invoke-virtual {v0}, Landroid/database/sqlite/SQLiteDatabase;->close()V

    .line 633
    return-void
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 637
    iget-object v0, p0, Lkik/android/util/a;->q:Lkik/android/util/a$b;

    invoke-virtual {v0}, Lkik/android/util/a$b;->a()V

    .line 638
    return-void
.end method
