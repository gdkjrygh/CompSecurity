.class public final Lkik/android/b/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;

.field public static final c:[Ljava/lang/String;

.field private static final g:Lorg/c/b;

.field private static final h:Ljava/util/HashSet;

.field private static final i:Ljava/util/HashSet;


# instance fields
.field d:Lkik/android/e/a;

.field private final e:Ljava/lang/String;

.field private f:Lkik/android/e/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 53
    const-string v0, "unsupportedContentType"

    sput-object v0, Lkik/android/b/g;->a:Ljava/lang/String;

    .line 54
    const-string v0, "videoTranscoding"

    sput-object v0, Lkik/android/b/g;->b:Ljava/lang/String;

    .line 58
    const-string v0, "ApplicationLaunchManager"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/b/g;->g:Lorg/c/b;

    .line 61
    const/16 v0, 0x11

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "mp4"

    aput-object v1, v0, v3

    const-string v1, "3gp"

    aput-object v1, v0, v4

    const/4 v1, 0x2

    const-string v2, "mkv"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "wav"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "mid"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "wav"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "mp3"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "flac"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "ts"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "aac"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "xmf"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "mxmf"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "rtttl"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "rtx"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "ota"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "imy"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "ogg"

    aput-object v2, v0, v1

    sput-object v0, Lkik/android/b/g;->c:[Ljava/lang/String;

    .line 64
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "video/mp4"

    aput-object v1, v0, v3

    invoke-static {v0}, Lcom/c/a/b/aj;->a([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v0

    sput-object v0, Lkik/android/b/g;->h:Ljava/util/HashSet;

    .line 65
    new-array v0, v4, [Ljava/lang/String;

    const-string v1, "image/jpeg"

    aput-object v1, v0, v3

    invoke-static {v0}, Lcom/c/a/b/aj;->a([Ljava/lang/Object;)Ljava/util/HashSet;

    move-result-object v0

    sput-object v0, Lkik/android/b/g;->i:Ljava/util/HashSet;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 120
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 56
    const-string v0, "native"

    iput-object v0, p0, Lkik/android/b/g;->e:Ljava/lang/String;

    .line 67
    new-instance v0, Lkik/android/b/h;

    invoke-direct {v0, p0}, Lkik/android/b/h;-><init>(Lkik/android/b/g;)V

    iput-object v0, p0, Lkik/android/b/g;->d:Lkik/android/e/a;

    .line 121
    iget-object v0, p0, Lkik/android/b/g;->d:Lkik/android/e/a;

    iput-object v0, p0, Lkik/android/b/g;->f:Lkik/android/e/a;

    .line 127
    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;)Lcom/kik/g/p;
    .locals 8

    .prologue
    const/4 v1, 0x0

    .line 368
    if-nez p1, :cond_0

    move-object v0, v1

    .line 386
    :goto_0
    return-object v0

    .line 373
    :cond_0
    sget-object v3, Lkik/android/b/g;->c:[Ljava/lang/String;

    array-length v4, v3

    const/4 v0, 0x0

    move v2, v0

    move-object v0, v1

    :goto_1
    if-ge v2, v4, :cond_2

    aget-object v5, v3, v2

    .line 374
    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "."

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1, v5}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-static {p0, p1}, Lkik/android/util/DeviceUtils;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 375
    new-instance v0, Landroid/content/Intent;

    const-string v5, "android.intent.action.VIEW"

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v6

    invoke-direct {v0, v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 376
    const/high16 v5, 0x200000

    invoke-virtual {v0, v5}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 373
    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    .line 379
    :cond_2
    if-nez v0, :cond_3

    move-object v0, v1

    .line 380
    goto :goto_0

    .line 384
    :cond_3
    new-instance v1, Lcom/kik/g/p;

    invoke-direct {v1}, Lcom/kik/g/p;-><init>()V

    .line 385
    invoke-virtual {v1, v0}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    move-object v0, v1

    .line 386
    goto :goto_0
.end method

.method private a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Lcom/kik/g/p;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 310
    if-eqz p2, :cond_0

    const-string v1, "cards"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_0
    const-string v1, "card://"

    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    const-string v1, "cards://"

    invoke-virtual {p3, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 331
    :cond_1
    :goto_0
    return-object v0

    .line 318
    :cond_2
    invoke-static {p3}, Lcom/kik/cards/web/bf;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 320
    iget-object v2, p0, Lkik/android/b/g;->f:Lkik/android/e/a;

    invoke-interface {v2, p1, v1, p4}, Lkik/android/e/a;->a(Landroid/content/Context;Ljava/lang/String;I)Landroid/content/Intent;

    move-result-object v1

    .line 322
    if-eqz v1, :cond_1

    .line 324
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 326
    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Ljava/lang/String;Lkik/a/d/a/a;)Lcom/kik/g/p;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 336
    if-nez p1, :cond_1

    .line 353
    :cond_0
    :goto_0
    return-object v0

    .line 341
    :cond_1
    const-string v1, "http"

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-eqz v1, :cond_2

    const-string v1, "https"

    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    if-nez v1, :cond_0

    .line 342
    :cond_2
    new-instance v0, Lkik/android/chat/fragment/KikCardBrowserFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;-><init>()V

    .line 343
    invoke-virtual {v0, p1}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;->a(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v1

    invoke-static {p1}, Lcom/kik/cards/util/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kik/cards/web/CardsWebViewFragment$a;->b(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v1

    invoke-static {p2}, Lkik/android/b/g;->b(Lkik/a/d/a/a;)Lcom/kik/cards/web/kik/KikContentMessageParcelable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/kik/cards/web/CardsWebViewFragment$a;->a(Lcom/kik/cards/web/kik/KikContentMessageParcelable;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    .line 344
    invoke-static {v0, p0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->e()Landroid/content/Intent;

    move-result-object v1

    .line 351
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 352
    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto :goto_0
.end method

.method private static a(Landroid/content/Context;Ljava/util/Collection;Ljava/lang/String;)Lcom/kik/g/p;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 392
    .line 393
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v3

    .line 398
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v1, v0

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 400
    if-nez v0, :cond_0

    .line 450
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 411
    :cond_0
    :try_start_0
    const-string v2, "http"

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_1

    const-string v2, "card"

    invoke-virtual {v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_2

    .line 413
    :cond_1
    new-instance v2, Lkik/android/chat/fragment/KikCardBrowserFragment$a;

    invoke-direct {v2}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;-><init>()V

    .line 414
    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/KikCardBrowserFragment$a;->a(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    move-result-object v5

    invoke-static {v0}, Lcom/kik/cards/util/b;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v5, v0}, Lcom/kik/cards/web/CardsWebViewFragment$a;->b(Ljava/lang/String;)Lcom/kik/cards/web/CardsWebViewFragment$a;

    .line 415
    invoke-static {v2, p0}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->e()Landroid/content/Intent;

    move-result-object v0

    move-object v2, v0

    .line 424
    :goto_1
    const/4 v0, 0x0

    invoke-virtual {v3, v2, v0}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_3

    .line 450
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 418
    :cond_2
    new-instance v2, Landroid/content/Intent;

    const-string v5, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {v2, v5, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 419
    const/high16 v0, 0x200000

    invoke-virtual {v2, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    goto :goto_1

    .line 450
    :catch_0
    move-exception v0

    add-int/lit8 v0, v1, 0x1

    move v1, v0

    .line 451
    goto :goto_0

    .line 428
    :cond_3
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 430
    if-eqz v1, :cond_4

    invoke-static {}, Lkik/android/f/a/f;->a()Lkik/android/f/a/f;

    move-result-object v5

    invoke-virtual {v5, p2}, Lkik/android/f/a/f;->g(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 431
    :cond_4
    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 452
    :goto_2
    return-object v0

    .line 435
    :cond_5
    :try_start_1
    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    .line 439
    :catch_1
    move-exception v2

    const v2, 0x7f0900e2

    const/4 v5, 0x1

    :try_start_2
    invoke-static {p0, v2, v5}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    .line 440
    new-instance v2, Ljava/lang/Throwable;

    invoke-direct {v2}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0, v2}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catch Landroid/content/ActivityNotFoundException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_2

    .line 450
    :catchall_0
    move-exception v0

    throw v0

    .line 452
    :cond_6
    const/4 v0, 0x0

    goto :goto_2
.end method

.method public static a(Lkik/a/d/a/a;)Ljava/lang/String;
    .locals 4

    .prologue
    .line 266
    const-string v0, "android"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v0

    .line 267
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/kik/f/a/a/a;

    .line 268
    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    .line 269
    invoke-static {v2}, Lkik/android/util/t;->a(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 270
    if-eqz p0, :cond_2

    const-string v0, "com.kik.ext.video-camera"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    const-string v0, "com.kik.ext.video-gallery"

    invoke-virtual {p0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    :cond_1
    const/4 v0, 0x1

    :goto_0
    if-eqz v0, :cond_3

    .line 271
    invoke-virtual {p0}, Lkik/a/d/a/a;->h()Ljava/lang/String;

    move-result-object v0

    .line 287
    :goto_1
    return-object v0

    .line 270
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 274
    :cond_3
    invoke-virtual {p0}, Lkik/a/d/a/a;->g()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 276
    :cond_4
    if-eqz v2, :cond_5

    const-string v3, "com.kik.cards"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    const-string v2, "layout"

    invoke-virtual {p0, v2}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    const-string v2, "layout"

    invoke-virtual {p0, v2}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lkik/a/d/a/a$b;->b:Lkik/a/d/a/a$b;

    invoke-virtual {v3}, Lkik/a/d/a/a$b;->a()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 277
    invoke-virtual {p0}, Lkik/a/d/a/a;->g()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 279
    :cond_6
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v2

    const-string v3, "cards"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v2

    const-string v3, "card://"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v2

    const-string v3, "cards://"

    invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_8

    .line 280
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 282
    :cond_8
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v2

    const-string v3, "http"

    invoke-virtual {v2, v3}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v2

    if-nez v2, :cond_0

    .line 283
    invoke-virtual {v0}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    .line 287
    :cond_9
    const-string v0, ""

    goto :goto_1
.end method

.method private static b(Lkik/a/d/a/a;)Lcom/kik/cards/web/kik/KikContentMessageParcelable;
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 292
    if-eqz p0, :cond_0

    .line 293
    const-string v0, "icon"

    invoke-virtual {p0, v0}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v0

    check-cast v0, Lkik/a/d/d;

    .line 295
    if-eqz v0, :cond_1

    .line 296
    invoke-static {}, Lkik/a/h/e;->a()Lkik/a/h/e;

    move-result-object v2

    invoke-virtual {v2, v0}, Lkik/a/h/e;->a(Lkik/a/d/o;)[B

    move-result-object v0

    .line 297
    if-eqz v0, :cond_1

    .line 298
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "data:image/png;base64,"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/m/e;->a([B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 302
    :goto_0
    new-instance v1, Lcom/kik/cards/web/kik/KikContentMessageParcelable;

    invoke-direct {v1, p0, v0}, Lcom/kik/cards/web/kik/KikContentMessageParcelable;-><init>(Lkik/a/d/a/a;Ljava/lang/String;)V

    .line 305
    :cond_0
    return-object v1

    :cond_1
    move-object v0, v1

    goto :goto_0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Lcom/kik/f/a/a/a;I)Lcom/kik/g/p;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 233
    if-nez p2, :cond_1

    .line 261
    :cond_0
    :goto_0
    return-object v0

    .line 240
    :cond_1
    const-string v1, "image"

    invoke-virtual {p2}, Lcom/kik/f/a/a/a;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 241
    new-instance v0, Lkik/android/chat/fragment/ViewPictureFragment$a;

    invoke-direct {v0}, Lkik/android/chat/fragment/ViewPictureFragment$a;-><init>()V

    .line 242
    invoke-virtual {p2}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->c(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v1

    invoke-virtual {v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->b()Lkik/android/chat/fragment/ViewPictureFragment$a;

    .line 243
    invoke-static {v0, p1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->e()Landroid/content/Intent;

    move-result-object v0

    .line 244
    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Object;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0

    .line 247
    :cond_2
    invoke-virtual {p2}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lcom/kik/f/a/a/a;->h()Ljava/lang/String;

    invoke-virtual {p2}, Lcom/kik/f/a/a/a;->g()Ljava/lang/String;

    invoke-direct {p0, p1, v1, v2, p3}, Lkik/android/b/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Lcom/kik/g/p;

    move-result-object v1

    if-eqz v1, :cond_3

    move-object v0, v1

    .line 248
    goto :goto_0

    .line 250
    :cond_3
    invoke-virtual {p2}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lkik/android/b/g;->a(Landroid/content/Context;Ljava/lang/String;Lkik/a/d/a/a;)Lcom/kik/g/p;

    move-result-object v0

    if-nez v0, :cond_0

    .line 253
    invoke-virtual {p2}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Lcom/kik/f/a/a/a;->h()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-static {p1, v2, v1}, Lkik/android/b/g;->a(Landroid/content/Context;Ljava/util/Collection;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v0

    if-nez v0, :cond_0

    .line 258
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 259
    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public final a(Landroid/content/Context;Lkik/a/d/s;I)Lcom/kik/g/p;
    .locals 6

    .prologue
    .line 138
    const-class v0, Lkik/a/d/a/a;

    invoke-static {p2, v0}, Lkik/a/d/a/g;->a(Lkik/a/d/s;Ljava/lang/Class;)Lkik/a/d/a/g;

    move-result-object v0

    check-cast v0, Lkik/a/d/a/a;

    .line 142
    if-nez v0, :cond_0

    .line 143
    const/4 v0, 0x0

    .line 228
    :goto_0
    return-object v0

    .line 147
    :cond_0
    const-string v1, "android"

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->c(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 148
    const-string v2, "android"

    invoke-virtual {v0, v2}, Lkik/a/d/a/a;->e(Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 149
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    new-array v3, v3, [Ljava/lang/String;

    .line 150
    invoke-interface {v2, v3}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 153
    invoke-virtual {v0}, Lkik/a/d/a/a;->u()Ljava/lang/String;

    move-result-object v2

    .line 158
    invoke-static {v2}, Lkik/android/util/t;->a(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "image"

    invoke-virtual {v0, v3}, Lkik/a/d/a/a;->d(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const-string v3, "video"

    invoke-virtual {v0, v3}, Lkik/a/d/a/a;->d(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 161
    :cond_1
    const-string v1, "preview"

    invoke-virtual {v0, v1}, Lkik/a/d/a/a;->a(Ljava/lang/String;)Lkik/a/d/o;

    move-result-object v1

    check-cast v1, Lkik/a/d/d;

    .line 164
    invoke-virtual {v0}, Lkik/a/d/a/a;->g()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-virtual {v0}, Lkik/a/d/a/a;->h()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_2

    .line 165
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 166
    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto :goto_0

    .line 169
    :cond_2
    invoke-virtual {v0}, Lkik/a/d/a/a;->l()Z

    move-result v2

    if-eqz v2, :cond_3

    .line 170
    new-instance v0, Ljava/lang/Throwable;

    sget-object v1, Lkik/android/b/g;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lcom/kik/g/s;->a(Ljava/lang/Throwable;)Lcom/kik/g/p;

    move-result-object v0

    goto :goto_0

    .line 173
    :cond_3
    const-string v2, ""

    .line 174
    if-eqz v1, :cond_c

    .line 175
    invoke-virtual {v1}, Lkik/a/d/d;->b()Ljava/lang/String;

    move-result-object v1

    .line 177
    :goto_1
    new-instance v2, Lkik/android/chat/fragment/ViewPictureFragment$a;

    invoke-direct {v2}, Lkik/android/chat/fragment/ViewPictureFragment$a;-><init>()V

    invoke-static {v0}, Lkik/android/b/g;->b(Lkik/a/d/a/a;)Lcom/kik/cards/web/kik/KikContentMessageParcelable;

    move-result-object v3

    invoke-virtual {v2, v3}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a(Lcom/kik/cards/web/kik/KikContentMessageParcelable;)Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v2

    const-string v3, "file-url"

    invoke-virtual {v0, v3}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lkik/android/chat/fragment/ViewPictureFragment$a;->c(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v0

    invoke-virtual {p2}, Lkik/a/d/s;->o()[B

    move-result-object v2

    invoke-virtual {v0, v2}, Lkik/android/chat/fragment/ViewPictureFragment$a;->a([B)Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lkik/android/chat/fragment/ViewPictureFragment$a;->b(Ljava/lang/String;)Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/fragment/ViewPictureFragment$a;->c()Lkik/android/chat/fragment/ViewPictureFragment$a;

    move-result-object v0

    .line 184
    invoke-static {v0, p1}, Lkik/android/chat/activity/k;->a(Lkik/android/util/an;Landroid/content/Context;)Lkik/android/chat/activity/k$b;

    move-result-object v0

    invoke-virtual {v0}, Lkik/android/chat/activity/k$b;->e()Landroid/content/Intent;

    move-result-object v1

    .line 186
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 187
    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Object;)V

    goto/16 :goto_0

    .line 190
    :cond_4
    invoke-static {v2}, Lkik/a/d/a/a;->b(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_5

    .line 191
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 192
    new-instance v1, Ljava/lang/Throwable;

    sget-object v2, Lkik/android/b/g;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_0

    .line 198
    :cond_5
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_6
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/kik/f/a/a/a;

    .line 199
    invoke-virtual {v1}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    .line 200
    invoke-virtual {v1}, Lcom/kik/f/a/a/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v4

    if-eqz v0, :cond_7

    invoke-static {v0}, Lkik/android/util/ae;->a(Lkik/a/d/a/a;)Ljava/lang/String;

    :cond_7
    if-eqz v0, :cond_8

    const-string v5, "card-icon"

    invoke-virtual {v0, v5}, Lkik/a/d/a/a;->g(Ljava/lang/String;)Ljava/lang/String;

    :cond_8
    invoke-direct {p0, p1, v2, v4, p3}, Lkik/android/b/g;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;I)Lcom/kik/g/p;

    move-result-object v2

    if-eqz v2, :cond_9

    .line 204
    new-instance v0, Lkik/android/b/i;

    invoke-direct {v0, p0, p2}, Lkik/android/b/i;-><init>(Lkik/android/b/g;Lkik/a/d/s;)V

    invoke-static {v2, v0}, Lcom/kik/g/s;->b(Lcom/kik/g/p;Lcom/kik/g/as;)Lcom/kik/g/p;

    move-result-object v0

    goto/16 :goto_0

    .line 214
    :cond_9
    invoke-virtual {v1}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1, v2}, Lkik/android/b/g;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/kik/g/p;

    move-result-object v2

    if-eqz v2, :cond_a

    move-object v0, v2

    .line 216
    goto/16 :goto_0

    .line 218
    :cond_a
    invoke-virtual {v1}, Lcom/kik/f/a/a/a;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1, v1, v0}, Lkik/android/b/g;->a(Landroid/content/Context;Ljava/lang/String;Lkik/a/d/a/a;)Lcom/kik/g/p;

    move-result-object v1

    if-eqz v1, :cond_6

    move-object v0, v1

    .line 219
    goto/16 :goto_0

    .line 224
    :cond_b
    new-instance v0, Lcom/kik/g/p;

    invoke-direct {v0}, Lcom/kik/g/p;-><init>()V

    .line 225
    new-instance v1, Ljava/lang/Throwable;

    invoke-direct {v1}, Ljava/lang/Throwable;-><init>()V

    invoke-virtual {v0, v1}, Lcom/kik/g/p;->a(Ljava/lang/Throwable;)V

    goto/16 :goto_0

    :cond_c
    move-object v1, v2

    goto/16 :goto_1
.end method
