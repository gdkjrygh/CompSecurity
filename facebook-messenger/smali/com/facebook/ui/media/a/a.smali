.class public Lcom/facebook/ui/media/a/a;
.super Ljava/lang/Object;
.source "MediaDownloader.java"


# static fields
.field private static final a:Ljava/lang/Class;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/Class",
            "<*>;"
        }
    .end annotation
.end field


# instance fields
.field private final b:Lcom/facebook/http/b/ap;

.field private final c:Landroid/content/Context;

.field private final d:Ljava/lang/String;

.field private final e:Lcom/facebook/analytics/j/a;

.field private final f:Lcom/facebook/analytics/av;

.field private final g:Lcom/facebook/analytics/g/e;

.field private final h:Lcom/facebook/ui/media/a/h;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 41
    const-class v0, Lcom/facebook/ui/media/a/a;

    sput-object v0, Lcom/facebook/ui/media/a/a;->a:Ljava/lang/Class;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/facebook/http/b/ap;Ljava/lang/String;Lcom/facebook/analytics/j/a;Lcom/facebook/analytics/av;Lcom/facebook/analytics/g/e;)V
    .locals 2

    .prologue
    .line 181
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 167
    new-instance v0, Lcom/facebook/ui/media/a/h;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/ui/media/a/h;-><init>(Lcom/facebook/ui/media/a/b;)V

    iput-object v0, p0, Lcom/facebook/ui/media/a/a;->h:Lcom/facebook/ui/media/a/h;

    .line 182
    iput-object p1, p0, Lcom/facebook/ui/media/a/a;->c:Landroid/content/Context;

    .line 183
    iput-object p2, p0, Lcom/facebook/ui/media/a/a;->b:Lcom/facebook/http/b/ap;

    .line 184
    iput-object p3, p0, Lcom/facebook/ui/media/a/a;->d:Ljava/lang/String;

    .line 185
    iput-object p4, p0, Lcom/facebook/ui/media/a/a;->e:Lcom/facebook/analytics/j/a;

    .line 186
    iput-object p5, p0, Lcom/facebook/ui/media/a/a;->f:Lcom/facebook/analytics/av;

    .line 187
    iput-object p6, p0, Lcom/facebook/ui/media/a/a;->g:Lcom/facebook/analytics/g/e;

    .line 188
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;I)V
    .locals 5

    .prologue
    const/16 v4, 0x5f

    .line 385
    sget-object v0, Lcom/facebook/ui/media/a/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, " Url: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 387
    new-instance v0, Lcom/facebook/analytics/cb;

    const-string v1, "media_downloader_failure"

    invoke-direct {v0, v1}, Lcom/facebook/analytics/cb;-><init>(Ljava/lang/String;)V

    const-string v1, "category"

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, p0, Lcom/facebook/ui/media/a/a;->d:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "url"

    invoke-virtual {v0, v1, p2}, Lcom/facebook/analytics/cb;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/cb;

    move-result-object v0

    const-string v1, "http_code"

    invoke-virtual {v0, v1, p3}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;I)Lcom/facebook/analytics/cb;

    move-result-object v0

    .line 392
    invoke-static {p2}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v1

    .line 393
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 394
    invoke-virtual {v1}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v1}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 395
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 397
    const-string v1, "throttle_key"

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 398
    const-string v1, "throttle_duration"

    const-wide/32 v2, 0x36ee80

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/facebook/analytics/cb;->a(Ljava/lang/String;Ljava/lang/String;)Lcom/facebook/analytics/ca;

    .line 401
    iget-object v1, p0, Lcom/facebook/ui/media/a/a;->f:Lcom/facebook/analytics/av;

    iget-object v2, p0, Lcom/facebook/ui/media/a/a;->g:Lcom/facebook/analytics/g/e;

    invoke-interface {v1, v0, v2}, Lcom/facebook/analytics/av;->a(Lcom/facebook/analytics/ca;Lcom/facebook/analytics/g/e;)V

    .line 402
    return-void
.end method

.method private b(Landroid/net/Uri;)Lorg/apache/http/HttpResponse;
    .locals 7

    .prologue
    .line 258
    const/4 v2, 0x0

    .line 259
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 260
    const/4 v0, 0x0

    move v6, v0

    move-object v0, v2

    move-object v2, v1

    move v1, v6

    :goto_0
    const/4 v3, 0x3

    if-ge v1, v3, :cond_2

    .line 261
    sget-object v0, Lcom/facebook/ui/media/a/a;->a:Ljava/lang/Class;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Fetching "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lcom/facebook/debug/log/b;->a(Ljava/lang/Class;Ljava/lang/String;)V

    .line 262
    invoke-direct {p0, v2}, Lcom/facebook/ui/media/a/a;->h(Landroid/net/Uri;)V

    .line 263
    iget-object v0, p0, Lcom/facebook/ui/media/a/a;->e:Lcom/facebook/analytics/j/a;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/analytics/j/a;->b(Ljava/lang/String;)V

    .line 265
    new-instance v0, Lorg/apache/http/client/methods/HttpGet;

    invoke-virtual {v2}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v3}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    .line 267
    iget-object v3, p0, Lcom/facebook/ui/media/a/a;->b:Lcom/facebook/http/b/ap;

    iget-object v4, p0, Lcom/facebook/ui/media/a/a;->d:Ljava/lang/String;

    const-string v5, "MediaDownloader"

    invoke-virtual {v3, v4, v0, v5}, Lcom/facebook/http/b/ap;->a(Ljava/lang/String;Lorg/apache/http/client/methods/HttpUriRequest;Ljava/lang/String;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 268
    iget-object v3, p0, Lcom/facebook/ui/media/a/a;->h:Lcom/facebook/ui/media/a/h;

    invoke-virtual {v3, v0}, Lcom/facebook/ui/media/a/h;->a(Lorg/apache/http/HttpResponse;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 270
    :try_start_0
    iget-object v3, p0, Lcom/facebook/ui/media/a/a;->h:Lcom/facebook/ui/media/a/h;

    invoke-virtual {v3, v0, v2}, Lcom/facebook/ui/media/a/h;->a(Lorg/apache/http/HttpResponse;Landroid/net/Uri;)Landroid/net/Uri;
    :try_end_0
    .catch Lorg/apache/http/ProtocolException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v2

    .line 275
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v3

    .line 276
    if-eqz v3, :cond_0

    .line 278
    :try_start_1
    invoke-interface {v3}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 260
    :cond_0
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 272
    :catch_0
    move-exception v1

    .line 273
    :try_start_2
    new-instance v2, Lorg/apache/http/client/ClientProtocolException;

    invoke-direct {v2, v1}, Lorg/apache/http/client/ClientProtocolException;-><init>(Ljava/lang/Throwable;)V

    throw v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 275
    :catchall_0
    move-exception v1

    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v0

    .line 276
    if-eqz v0, :cond_1

    .line 278
    :try_start_3
    invoke-interface {v0}, Lorg/apache/http/HttpEntity;->consumeContent()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_2

    .line 283
    :cond_1
    :goto_2
    throw v1

    .line 279
    :catch_1
    move-exception v3

    goto :goto_1

    :catch_2
    move-exception v0

    goto :goto_2

    .line 289
    :cond_2
    return-object v0
.end method

.method private c(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;
    .locals 4

    .prologue
    .line 299
    .line 301
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/a/a;->b(Landroid/net/Uri;)Lorg/apache/http/HttpResponse;

    move-result-object v0

    .line 302
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;

    move-result-object v1

    .line 303
    invoke-interface {v0}, Lorg/apache/http/HttpResponse;->getStatusLine()Lorg/apache/http/StatusLine;

    move-result-object v0

    invoke-interface {v0}, Lorg/apache/http/StatusLine;->getStatusCode()I

    move-result v2

    .line 305
    const/16 v0, 0xc8

    if-ne v2, v0, :cond_2

    if-eqz v1, :cond_2

    .line 308
    iget-object v0, p0, Lcom/facebook/ui/media/a/a;->e:Lcom/facebook/analytics/j/a;

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/facebook/analytics/j/a;->c(Ljava/lang/String;)V

    .line 309
    invoke-static {v1}, Lcom/facebook/ui/media/a/c;->a(Lorg/apache/http/HttpEntity;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    .line 327
    :cond_0
    :goto_0
    invoke-virtual {v0}, Lcom/facebook/ui/media/a/c;->a()Lcom/facebook/ui/media/a/d;

    move-result-object v1

    sget-object v3, Lcom/facebook/ui/media/a/d;->SUCCESS:Lcom/facebook/ui/media/a/d;

    if-eq v1, v3, :cond_1

    .line 328
    const-string v1, "MediaDownloader (HTTP code)"

    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-direct {p0, v1, v3, v2}, Lcom/facebook/ui/media/a/a;->a(Ljava/lang/String;Ljava/lang/String;I)V

    .line 330
    :cond_1
    return-object v0

    .line 312
    :cond_2
    const/16 v0, 0x194

    if-ne v2, v0, :cond_3

    .line 313
    :try_start_0
    sget-object v0, Lcom/facebook/ui/media/a/d;->NOT_FOUND:Lcom/facebook/ui/media/a/d;

    invoke-static {v0}, Lcom/facebook/ui/media/a/c;->a(Lcom/facebook/ui/media/a/d;)Lcom/facebook/ui/media/a/c;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    .line 321
    :goto_1
    if-eqz v1, :cond_0

    .line 322
    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->consumeContent()V

    goto :goto_0

    .line 314
    :cond_3
    const/16 v0, 0x193

    if-ne v2, v0, :cond_4

    .line 315
    :try_start_1
    sget-object v0, Lcom/facebook/ui/media/a/d;->FORBIDDEN:Lcom/facebook/ui/media/a/d;

    invoke-static {v0}, Lcom/facebook/ui/media/a/c;->a(Lcom/facebook/ui/media/a/d;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    goto :goto_1

    .line 318
    :cond_4
    sget-object v0, Lcom/facebook/ui/media/a/d;->OTHER:Lcom/facebook/ui/media/a/d;

    invoke-static {v0}, Lcom/facebook/ui/media/a/c;->a(Lcom/facebook/ui/media/a/d;)Lcom/facebook/ui/media/a/c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    goto :goto_1

    .line 321
    :catchall_0
    move-exception v0

    if-eqz v1, :cond_5

    .line 322
    invoke-interface {v1}, Lorg/apache/http/HttpEntity;->consumeContent()V

    :cond_5
    throw v0
.end method

.method private d(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;
    .locals 2

    .prologue
    .line 334
    const-string v0, "com.android.contacts"

    invoke-virtual {p1}, Landroid/net/Uri;->getAuthority()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 335
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/a/a;->e(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    .line 337
    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/a/a;->f(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    goto :goto_0
.end method

.method private e(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;
    .locals 3

    .prologue
    .line 342
    sget-object v0, Lcom/facebook/ui/media/a/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Downloading contact photo from: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 345
    iget-object v0, p0, Lcom/facebook/ui/media/a/a;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    .line 346
    invoke-static {v0, p1}, Landroid/provider/ContactsContract$Contacts;->openContactPhotoInputStream(Landroid/content/ContentResolver;Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    .line 348
    if-nez v0, :cond_0

    .line 349
    sget-object v0, Lcom/facebook/ui/media/a/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Contact photo not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 350
    sget-object v0, Lcom/facebook/ui/media/a/d;->NOT_FOUND:Lcom/facebook/ui/media/a/d;

    invoke-static {v0}, Lcom/facebook/ui/media/a/c;->a(Lcom/facebook/ui/media/a/d;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    .line 352
    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/facebook/ui/media/a/c;->a(Ljava/io/InputStream;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    goto :goto_0
.end method

.method private f(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;
    .locals 3

    .prologue
    .line 356
    sget-object v0, Lcom/facebook/ui/media/a/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Downloading media from generic content resolver: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 357
    iget-object v0, p0, Lcom/facebook/ui/media/a/a;->c:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    .line 358
    if-nez v0, :cond_0

    .line 359
    sget-object v0, Lcom/facebook/ui/media/a/a;->a:Ljava/lang/Class;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Media not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;)V

    .line 360
    sget-object v0, Lcom/facebook/ui/media/a/d;->NOT_FOUND:Lcom/facebook/ui/media/a/d;

    invoke-static {v0}, Lcom/facebook/ui/media/a/c;->a(Lcom/facebook/ui/media/a/d;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    .line 362
    :goto_0
    return-object v0

    :cond_0
    invoke-static {v0}, Lcom/facebook/ui/media/a/c;->a(Ljava/io/InputStream;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    goto :goto_0
.end method

.method private g(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;
    .locals 2

    .prologue
    .line 367
    new-instance v0, Ljava/io/FileInputStream;

    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/facebook/ui/media/a/c;->a(Ljava/io/InputStream;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    return-object v0
.end method

.method private h(Landroid/net/Uri;)V
    .locals 3

    .prologue
    .line 376
    :try_start_0
    invoke-virtual {p1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 381
    return-void

    .line 377
    :catch_0
    move-exception v0

    .line 379
    new-instance v0, Ljava/io/IOException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Invalid URI: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public a(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;
    .locals 4

    .prologue
    .line 198
    :try_start_0
    const-string v0, "http"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "https"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 199
    :cond_0
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/a/a;->c(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    .line 210
    :goto_0
    return-object v0

    .line 200
    :cond_1
    const-string v0, "content"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 201
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/a/a;->d(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    goto :goto_0

    .line 202
    :cond_2
    const-string v0, "file"

    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 203
    invoke-direct {p0, p1}, Lcom/facebook/ui/media/a/a;->g(Landroid/net/Uri;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    goto :goto_0

    .line 205
    :cond_3
    sget-object v0, Lcom/facebook/ui/media/a/a;->a:Ljava/lang/Class;

    const-string v1, "Unsupported scheme: %s"

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    aput-object p1, v2, v3

    invoke-static {v0, v1, v2}, Lcom/facebook/debug/log/b;->e(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 206
    sget-object v0, Lcom/facebook/ui/media/a/d;->UNSUPPORTED_URI:Lcom/facebook/ui/media/a/d;

    invoke-static {v0}, Lcom/facebook/ui/media/a/c;->a(Lcom/facebook/ui/media/a/d;)Lcom/facebook/ui/media/a/c;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    goto :goto_0

    .line 208
    :catch_0
    move-exception v0

    .line 209
    sget-object v1, Lcom/facebook/ui/media/a/a;->a:Ljava/lang/Class;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "IOException downloading "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Lcom/facebook/debug/log/b;->b(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 210
    sget-object v0, Lcom/facebook/ui/media/a/d;->IO_EXCEPTION:Lcom/facebook/ui/media/a/d;

    invoke-static {v0}, Lcom/facebook/ui/media/a/c;->a(Lcom/facebook/ui/media/a/d;)Lcom/facebook/ui/media/a/c;

    move-result-object v0

    goto :goto_0
.end method
