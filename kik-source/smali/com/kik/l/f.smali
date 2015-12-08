.class public final Lcom/kik/l/f;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/android/volley/p;

.field private b:Lcom/kik/cache/ap;

.field private c:Lcom/android/volley/toolbox/d;

.field private d:Lcom/kik/cache/ad;

.field private e:Lcom/kik/cache/SimpleLruBitmapCache;

.field private f:Lcom/kik/g/f;

.field private g:Ljava/lang/Runnable;

.field private h:Ljava/io/File;

.field private i:Lcom/kik/g/k;

.field private j:Lcom/kik/g/i;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .prologue
    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    new-instance v0, Lcom/kik/g/f;

    invoke-direct {v0}, Lcom/kik/g/f;-><init>()V

    iput-object v0, p0, Lcom/kik/l/f;->f:Lcom/kik/g/f;

    .line 64
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/l/f;->h:Ljava/io/File;

    .line 65
    new-instance v0, Lcom/kik/g/k;

    invoke-direct {v0, p0}, Lcom/kik/g/k;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lcom/kik/l/f;->i:Lcom/kik/g/k;

    .line 387
    new-instance v0, Lcom/kik/l/k;

    invoke-direct {v0, p0}, Lcom/kik/l/k;-><init>(Lcom/kik/l/f;)V

    iput-object v0, p0, Lcom/kik/l/f;->j:Lcom/kik/g/i;

    .line 69
    iput-object p1, p0, Lcom/kik/l/f;->h:Ljava/io/File;

    .line 70
    return-void
.end method

.method static synthetic a(Lcom/kik/l/f;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/kik/l/f;->g:Ljava/lang/Runnable;

    return-object v0
.end method

.method static synthetic a(Lcom/kik/l/f;Lcom/kik/cache/z;)V
    .locals 2

    .prologue
    .line 48
    if-eqz p1, :cond_0

    instance-of v0, p1, Lcom/kik/cache/k;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/kik/l/f;->i:Lcom/kik/g/k;

    check-cast p1, Lcom/kik/cache/k;

    invoke-virtual {p1}, Lcom/kik/cache/k;->u()Lkik/a/d/k;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    :cond_0
    :goto_0
    return-void

    :cond_1
    instance-of v0, p1, Lcom/kik/cache/v;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/l/f;->i:Lcom/kik/g/k;

    check-cast p1, Lcom/kik/cache/v;

    invoke-virtual {p1}, Lcom/kik/cache/v;->u()Lkik/a/d/n;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/g/k;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method static synthetic a(Ljava/io/File;)[B
    .locals 6

    .prologue
    .line 48
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v0

    long-to-int v1, v0

    new-instance v2, Ljava/io/FileInputStream;

    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V

    new-array v3, v1, [B

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    sub-int v4, v1, v0

    invoke-virtual {v2, v3, v0, v4}, Ljava/io/FileInputStream;->read([BII)I

    move-result v4

    const/4 v5, -0x1

    if-eq v4, v5, :cond_0

    add-int/2addr v0, v4

    goto :goto_0

    :cond_0
    if-eq v0, v1, :cond_1

    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Expected "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, " bytes, read "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " bytes"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_1
    return-object v3
.end method

.method static synthetic b(Lcom/kik/l/f;)Lcom/android/volley/p;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/kik/l/f;->a:Lcom/android/volley/p;

    return-object v0
.end method

.method static synthetic c(Lcom/kik/l/f;)Lcom/kik/cache/ap;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/kik/l/f;->b:Lcom/kik/cache/ap;

    return-object v0
.end method

.method static synthetic d(Lcom/kik/l/f;)Lcom/android/volley/toolbox/d;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    return-object v0
.end method

.method static synthetic e(Lcom/kik/l/f;)Lcom/kik/cache/ad;
    .locals 1

    .prologue
    .line 48
    iget-object v0, p0, Lcom/kik/l/f;->d:Lcom/kik/cache/ad;

    return-object v0
.end method


# virtual methods
.method public final a()Lcom/kik/g/e;
    .locals 1

    .prologue
    .line 215
    iget-object v0, p0, Lcom/kik/l/f;->i:Lcom/kik/g/k;

    invoke-virtual {v0}, Lcom/kik/g/k;->a()Lcom/kik/g/e;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;Lcom/kik/g/e;Ljava/io/File;)V
    .locals 4

    .prologue
    .line 78
    new-instance v1, Ljava/io/File;

    iget-object v0, p0, Lcom/kik/l/f;->h:Ljava/io/File;

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 79
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p3, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 80
    invoke-static {v0, v1}, Lkik/android/util/d;->a(Ljava/io/File;Ljava/io/File;)V

    .line 82
    const-string v2, "AN"

    .line 83
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v0, v3, :cond_0

    .line 86
    new-instance v0, Lcom/android/volley/toolbox/h;

    invoke-direct {v0}, Lcom/android/volley/toolbox/h;-><init>()V

    .line 94
    :goto_0
    new-instance v2, Lcom/android/volley/toolbox/a;

    invoke-direct {v2, v0}, Lcom/android/volley/toolbox/a;-><init>(Lcom/android/volley/toolbox/g;)V

    .line 95
    new-instance v0, Lcom/android/volley/toolbox/d;

    const/high16 v3, 0x1400000

    invoke-direct {v0, v1, v3}, Lcom/android/volley/toolbox/d;-><init>(Ljava/io/File;I)V

    iput-object v0, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    .line 96
    new-instance v0, Lcom/android/volley/p;

    iget-object v1, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    invoke-direct {v0, v1, v2}, Lcom/android/volley/p;-><init>(Lcom/android/volley/b;Lcom/android/volley/h;)V

    iput-object v0, p0, Lcom/kik/l/f;->a:Lcom/android/volley/p;

    .line 98
    new-instance v0, Lcom/kik/cache/ap;

    iget-object v1, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lcom/kik/cache/ap;-><init>(Lcom/android/volley/b;I)V

    iput-object v0, p0, Lcom/kik/l/f;->b:Lcom/kik/cache/ap;

    .line 99
    invoke-static {}, Lcom/kik/m/k;->a()Lcom/kik/cache/SimpleLruBitmapCache;

    move-result-object v0

    iput-object v0, p0, Lcom/kik/l/f;->e:Lcom/kik/cache/SimpleLruBitmapCache;

    .line 101
    iget-object v0, p0, Lcom/kik/l/f;->g:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    .line 103
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    const-wide/16 v2, 0x1388

    invoke-static {v0, v2, v3}, Lcom/kik/g/s;->a(Lcom/kik/g/p;J)Lcom/kik/g/p;

    move-result-object v0

    .line 104
    new-instance v1, Ljava/lang/Thread;

    new-instance v2, Lcom/kik/l/g;

    invoke-direct {v2, p0, v0}, Lcom/kik/l/g;-><init>(Lcom/kik/l/f;Lcom/kik/g/p;)V

    invoke-direct {v1, v2}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v1}, Ljava/lang/Thread;->start()V

    .line 113
    new-instance v1, Lcom/kik/l/h;

    invoke-direct {v1, p0}, Lcom/kik/l/h;-><init>(Lcom/kik/l/f;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Lcom/kik/g/r;)Lcom/kik/g/r;

    .line 128
    :goto_1
    new-instance v0, Lcom/kik/cache/ad;

    iget-object v1, p0, Lcom/kik/l/f;->a:Lcom/android/volley/p;

    iget-object v2, p0, Lcom/kik/l/f;->e:Lcom/kik/cache/SimpleLruBitmapCache;

    iget-object v3, p0, Lcom/kik/l/f;->b:Lcom/kik/cache/ap;

    invoke-direct {v0, v1, v2, v3}, Lcom/kik/cache/ad;-><init>(Lcom/android/volley/p;Lcom/kik/cache/ad$b;Lcom/kik/cache/ap;)V

    iput-object v0, p0, Lcom/kik/l/f;->d:Lcom/kik/cache/ad;

    .line 129
    iget-object v0, p0, Lcom/kik/l/f;->f:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/l/f;->d:Lcom/kik/cache/ad;

    invoke-virtual {v1}, Lcom/kik/cache/ad;->a()Lcom/kik/g/e;

    move-result-object v1

    new-instance v2, Lcom/kik/l/i;

    invoke-direct {v2, p0}, Lcom/kik/l/i;-><init>(Lcom/kik/l/f;)V

    invoke-virtual {v0, v1, v2}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 136
    iget-object v0, p0, Lcom/kik/l/f;->f:Lcom/kik/g/f;

    iget-object v1, p0, Lcom/kik/l/f;->j:Lcom/kik/g/i;

    invoke-virtual {v0, p2, v1}, Lcom/kik/g/f;->a(Lcom/kik/g/e;Lcom/kik/g/i;)Lcom/kik/g/i;

    .line 138
    iget-object v0, p0, Lcom/kik/l/f;->d:Lcom/kik/cache/ad;

    invoke-virtual {v0}, Lcom/kik/cache/ad;->b()V

    .line 139
    return-void

    .line 91
    :cond_0
    new-instance v0, Lcom/android/volley/toolbox/e;

    invoke-static {v2}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/android/volley/toolbox/e;-><init>(Lorg/apache/http/client/HttpClient;)V

    goto :goto_0

    .line 124
    :cond_1
    iget-object v0, p0, Lcom/kik/l/f;->a:Lcom/android/volley/p;

    invoke-virtual {v0}, Lcom/android/volley/p;->a()V

    .line 125
    iget-object v0, p0, Lcom/kik/l/f;->b:Lcom/kik/cache/ap;

    invoke-virtual {v0}, Lcom/kik/cache/ap;->a()V

    goto :goto_1
.end method

.method public final a(Ljava/util/Hashtable;Landroid/content/Context;Lkik/android/util/ar;)V
    .locals 3

    .prologue
    .line 154
    const-string v0, "Kik.Storage.ContactImageCache.pref"

    invoke-interface {p3, v0}, Lkik/android/util/ar;->a(Ljava/lang/String;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 155
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "ContactImageCache.volley.migrated"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 156
    new-instance v0, Lcom/kik/l/j;

    invoke-direct {v0, p0, p1, p2}, Lcom/kik/l/j;-><init>(Lcom/kik/l/f;Ljava/util/Hashtable;Landroid/content/Context;)V

    iput-object v0, p0, Lcom/kik/l/f;->g:Ljava/lang/Runnable;

    .line 195
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 2

    .prologue
    .line 238
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkik/a/d/k;

    .line 242
    invoke-virtual {p0, v0}, Lcom/kik/l/f;->a(Lkik/a/d/k;)V

    goto :goto_0

    .line 244
    :cond_0
    return-void
.end method

.method public final a(Lkik/a/d/k;)V
    .locals 4

    .prologue
    .line 248
    if-nez p1, :cond_1

    .line 269
    :cond_0
    :goto_0
    return-void

    .line 251
    :cond_1
    const/4 v0, 0x0

    .line 254
    instance-of v1, p1, Lkik/a/d/n;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lkik/a/d/k;->r()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    move-object v0, p1

    .line 255
    check-cast v0, Lkik/a/d/n;

    invoke-static {v0}, Lcom/kik/cache/v;->a(Lkik/a/d/n;)Ljava/lang/String;

    move-result-object v1

    .line 256
    check-cast p1, Lkik/a/d/n;

    invoke-static {p1}, Lcom/kik/cache/v;->b(Lkik/a/d/n;)Lcom/kik/cache/SimpleLruBitmapCache$a;

    move-result-object v2

    .line 259
    const/4 v0, 0x1

    .line 265
    :goto_1
    if-eqz v1, :cond_0

    .line 266
    iget-object v3, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    invoke-virtual {v3, v1, v0}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;Z)V

    .line 267
    iget-object v0, p0, Lcom/kik/l/f;->e:Lcom/kik/cache/SimpleLruBitmapCache;

    invoke-virtual {v0, v2}, Lcom/kik/cache/SimpleLruBitmapCache;->a(Lcom/kik/cache/SimpleLruBitmapCache$a;)V

    goto :goto_0

    .line 262
    :cond_2
    invoke-static {p1}, Lcom/kik/cache/k;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v1

    .line 263
    invoke-static {p1}, Lcom/kik/cache/k;->b(Lkik/a/d/k;)Lcom/kik/cache/SimpleLruBitmapCache$a;

    move-result-object v2

    goto :goto_1
.end method

.method public final a([BLkik/a/d/aa;)V
    .locals 4

    .prologue
    const-wide/32 v2, 0x41353000

    .line 349
    if-nez p1, :cond_0

    .line 351
    iget-object v0, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    const-string v1, "myPicVolleyDiskKey"

    invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/d;->b(Ljava/lang/String;)V

    .line 352
    iget-object v0, p0, Lcom/kik/l/f;->e:Lcom/kik/cache/SimpleLruBitmapCache;

    const-string v1, "myPicVolleyDiskKey"

    invoke-virtual {v0, v1}, Lcom/kik/cache/SimpleLruBitmapCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    :goto_0
    return-void

    .line 355
    :cond_0
    iget-object v0, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    const-string v1, "myPicVolleyDiskKey"

    invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;)Lcom/android/volley/b$a;

    move-result-object v0

    .line 356
    if-nez v0, :cond_1

    .line 357
    new-instance v0, Lcom/android/volley/b$a;

    invoke-direct {v0}, Lcom/android/volley/b$a;-><init>()V

    .line 358
    iput-wide v2, v0, Lcom/android/volley/b$a;->d:J

    .line 359
    iput-wide v2, v0, Lcom/android/volley/b$a;->e:J

    .line 361
    :cond_1
    iput-object p1, v0, Lcom/android/volley/b$a;->a:[B

    .line 363
    iget-object v1, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    const-string v2, "myPicVolleyDiskKey"

    invoke-virtual {v1, v2, v0}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;Lcom/android/volley/b$a;)V

    .line 364
    iget-object v0, p0, Lcom/kik/l/f;->e:Lcom/kik/cache/SimpleLruBitmapCache;

    const/4 v1, 0x0

    invoke-static {p2, v1}, Lcom/kik/cache/ak;->a(Lkik/a/d/aa;Z)Lcom/kik/cache/SimpleLruBitmapCache$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/cache/SimpleLruBitmapCache;->a(Lcom/kik/cache/SimpleLruBitmapCache$a;)V

    goto :goto_0
.end method

.method public final a([BLkik/a/d/n;)V
    .locals 6

    .prologue
    const-wide/32 v4, 0x41353000

    .line 318
    if-nez p2, :cond_0

    .line 345
    :goto_0
    return-void

    .line 321
    :cond_0
    invoke-virtual {p2}, Lkik/a/d/n;->r()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkik/android/util/cq;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 323
    invoke-static {p2}, Lcom/kik/cache/v;->a(Lkik/a/d/n;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0}, Lkik/a/d/n;->c(Ljava/lang/String;)V

    .line 326
    :cond_1
    invoke-static {p2}, Lcom/kik/cache/k;->a(Lkik/a/d/k;)Ljava/lang/String;

    move-result-object v1

    .line 327
    invoke-static {p2}, Lcom/kik/cache/k;->b(Lkik/a/d/k;)Lcom/kik/cache/SimpleLruBitmapCache$a;

    move-result-object v2

    .line 329
    if-nez p1, :cond_2

    .line 331
    iget-object v0, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/d;->b(Ljava/lang/String;)V

    .line 332
    iget-object v0, p0, Lcom/kik/l/f;->e:Lcom/kik/cache/SimpleLruBitmapCache;

    invoke-virtual {v0, v1}, Lcom/kik/cache/SimpleLruBitmapCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 335
    :cond_2
    iget-object v0, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;)Lcom/android/volley/b$a;

    move-result-object v0

    .line 336
    if-nez v0, :cond_3

    .line 337
    new-instance v0, Lcom/android/volley/b$a;

    invoke-direct {v0}, Lcom/android/volley/b$a;-><init>()V

    .line 338
    iput-wide v4, v0, Lcom/android/volley/b$a;->d:J

    .line 339
    iput-wide v4, v0, Lcom/android/volley/b$a;->e:J

    .line 341
    :cond_3
    iput-object p1, v0, Lcom/android/volley/b$a;->a:[B

    .line 343
    iget-object v3, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    invoke-virtual {v3, v1, v0}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;Lcom/android/volley/b$a;)V

    .line 344
    iget-object v0, p0, Lcom/kik/l/f;->e:Lcom/kik/cache/SimpleLruBitmapCache;

    invoke-virtual {v0, v2}, Lcom/kik/cache/SimpleLruBitmapCache;->a(Lcom/kik/cache/SimpleLruBitmapCache$a;)V

    goto :goto_0
.end method

.method public final b()Lcom/kik/cache/ad;
    .locals 1

    .prologue
    .line 233
    iget-object v0, p0, Lcom/kik/l/f;->d:Lcom/kik/cache/ad;

    return-object v0
.end method

.method public final b([BLkik/a/d/aa;)V
    .locals 4

    .prologue
    const-wide/32 v2, 0x41353000

    .line 369
    if-nez p1, :cond_0

    .line 371
    iget-object v0, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    const-string v1, "myPicVolleyDiskKey#FULLSIZE"

    invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/d;->b(Ljava/lang/String;)V

    .line 372
    iget-object v0, p0, Lcom/kik/l/f;->e:Lcom/kik/cache/SimpleLruBitmapCache;

    const-string v1, "myPicVolleyDiskKey#FULLSIZE"

    invoke-virtual {v0, v1}, Lcom/kik/cache/SimpleLruBitmapCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    :goto_0
    return-void

    .line 375
    :cond_0
    iget-object v0, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    const-string v1, "myPicVolleyDiskKey#FULLSIZE"

    invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;)Lcom/android/volley/b$a;

    move-result-object v0

    .line 376
    if-nez v0, :cond_1

    .line 377
    new-instance v0, Lcom/android/volley/b$a;

    invoke-direct {v0}, Lcom/android/volley/b$a;-><init>()V

    .line 378
    iput-wide v2, v0, Lcom/android/volley/b$a;->d:J

    .line 379
    iput-wide v2, v0, Lcom/android/volley/b$a;->e:J

    .line 381
    :cond_1
    iput-object p1, v0, Lcom/android/volley/b$a;->a:[B

    .line 383
    iget-object v1, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    const-string v2, "myPicVolleyDiskKey#FULLSIZE"

    invoke-virtual {v1, v2, v0}, Lcom/android/volley/toolbox/d;->a(Ljava/lang/String;Lcom/android/volley/b$a;)V

    .line 384
    iget-object v0, p0, Lcom/kik/l/f;->e:Lcom/kik/cache/SimpleLruBitmapCache;

    const/4 v1, 0x1

    invoke-static {p2, v1}, Lcom/kik/cache/ak;->a(Lkik/a/d/aa;Z)Lcom/kik/cache/SimpleLruBitmapCache$a;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/cache/SimpleLruBitmapCache;->a(Lcom/kik/cache/SimpleLruBitmapCache$a;)V

    goto :goto_0
.end method

.method public final c()V
    .locals 1

    .prologue
    .line 273
    iget-object v0, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    invoke-virtual {v0}, Lcom/android/volley/toolbox/d;->b()V

    .line 274
    return-void
.end method

.method public final d()Z
    .locals 2

    .prologue
    .line 286
    iget-object v0, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    const-string v1, "myPicVolleyDiskKey"

    invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/d;->c(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/kik/l/f;->c:Lcom/android/volley/toolbox/d;

    const-string v1, "myPicVolleyDiskKey#FULLSIZE"

    invoke-virtual {v0, v1}, Lcom/android/volley/toolbox/d;->c(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method
