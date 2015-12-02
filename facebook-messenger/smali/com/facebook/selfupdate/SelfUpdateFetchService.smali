.class public Lcom/facebook/selfupdate/SelfUpdateFetchService;
.super Landroid/app/IntentService;
.source "SelfUpdateFetchService.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# instance fields
.field private a:Lcom/facebook/selfupdate/a;

.field private b:Lcom/facebook/config/b/a;

.field private c:Lcom/facebook/selfupdate/o;

.field private d:Lcom/facebook/prefs/shared/d;

.field private e:Lcom/facebook/http/protocol/aq;

.field private f:Landroid/app/AlarmManager;

.field private g:Landroid/app/DownloadManager;

.field private h:Lcom/facebook/common/time/a;

.field private i:Landroid/content/Context;

.field private j:Lcom/facebook/auth/viewercontext/ViewerContext;

.field private k:Lcom/facebook/selfupdate/af;

.field private l:Lcom/facebook/common/f/f;

.field private m:Lcom/facebook/selfupdate/f;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 70
    const-string v0, "SelfUpdateFetchService"

    invoke-direct {p0, v0}, Landroid/app/IntentService;-><init>(Ljava/lang/String;)V

    .line 71
    return-void
.end method

.method private a(Lcom/facebook/selfupdate/c;Ljava/lang/String;Z)J
    .locals 8
    .annotation build Landroid/annotation/TargetApi;
        value = 0xb
    .end annotation

    .prologue
    const/16 v7, 0xb

    const/4 v3, 0x0

    .line 227
    iget-object v0, p1, Lcom/facebook/selfupdate/c;->e:Ljava/lang/String;

    .line 228
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    .line 229
    const/4 v0, 0x0

    .line 232
    invoke-virtual {v1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    move-result-object v2

    const-string v4, "https"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 234
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v2, v7, :cond_6

    .line 236
    invoke-virtual {v1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object v1

    .line 237
    const-string v2, "http"

    invoke-virtual {v1, v2}, Landroid/net/Uri$Builder;->scheme(Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 238
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    move-result-object v1

    .line 246
    :cond_0
    :goto_0
    iget-object v2, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->k:Lcom/facebook/selfupdate/af;

    invoke-virtual {v2}, Lcom/facebook/selfupdate/af;->f()V

    .line 248
    iget-object v2, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->m:Lcom/facebook/selfupdate/f;

    invoke-virtual {v2, v1}, Lcom/facebook/selfupdate/f;->a(Landroid/net/Uri;)Landroid/app/DownloadManager$Request;

    move-result-object v4

    .line 250
    if-nez p3, :cond_a

    .line 253
    sget-object v2, Lcom/facebook/selfupdate/e;->MOBILE:Lcom/facebook/selfupdate/e;

    iget v2, v2, Lcom/facebook/selfupdate/e;->value:I

    iget v5, p1, Lcom/facebook/selfupdate/c;->i:I

    and-int/2addr v2, v5

    sget-object v5, Lcom/facebook/selfupdate/e;->MOBILE:Lcom/facebook/selfupdate/e;

    iget v5, v5, Lcom/facebook/selfupdate/e;->value:I

    if-ne v2, v5, :cond_9

    .line 255
    const/4 v2, 0x1

    .line 258
    :goto_1
    sget-object v5, Lcom/facebook/selfupdate/e;->WIFI:Lcom/facebook/selfupdate/e;

    iget v5, v5, Lcom/facebook/selfupdate/e;->value:I

    iget v6, p1, Lcom/facebook/selfupdate/c;->i:I

    and-int/2addr v5, v6

    sget-object v6, Lcom/facebook/selfupdate/e;->WIFI:Lcom/facebook/selfupdate/e;

    iget v6, v6, Lcom/facebook/selfupdate/e;->value:I

    if-ne v5, v6, :cond_1

    .line 260
    or-int/lit8 v2, v2, 0x2

    .line 264
    :cond_1
    const-string v5, "android.permission.DOWNLOAD_WITHOUT_NOTIFICATION"

    invoke-direct {p0, v5}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 265
    sget v5, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v5, v7, :cond_7

    .line 266
    const/4 v5, 0x2

    invoke-virtual {v4, v5}, Landroid/app/DownloadManager$Request;->setNotificationVisibility(I)Landroid/app/DownloadManager$Request;

    .line 275
    :cond_2
    :goto_2
    invoke-virtual {v4, v3}, Landroid/app/DownloadManager$Request;->setVisibleInDownloadsUi(Z)Landroid/app/DownloadManager$Request;

    .line 277
    if-eqz v2, :cond_3

    .line 278
    invoke-virtual {v4, v2}, Landroid/app/DownloadManager$Request;->setAllowedNetworkTypes(I)Landroid/app/DownloadManager$Request;

    .line 281
    :cond_3
    const-string v2, "Accept"

    const-string v3, "application/octet-stream"

    invoke-virtual {v4, v2, v3}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 283
    if-eqz v0, :cond_4

    .line 284
    const-string v2, "Authorization"

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "OAuth "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v2, v0}, Landroid/app/DownloadManager$Request;->addRequestHeader(Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 287
    :cond_4
    if-eqz p2, :cond_5

    .line 288
    invoke-virtual {v4, p2}, Landroid/app/DownloadManager$Request;->setTitle(Ljava/lang/CharSequence;)Landroid/app/DownloadManager$Request;

    .line 292
    :cond_5
    iget-wide v2, p1, Lcom/facebook/selfupdate/c;->k:J

    invoke-direct {p0, v2, v3, v4}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->a(JLandroid/app/DownloadManager$Request;)Z

    move-result v0

    if-nez v0, :cond_8

    .line 293
    const-wide/16 v0, -0x1

    .line 298
    :goto_3
    return-wide v0

    .line 241
    :cond_6
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->j:Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {v0}, Lcom/facebook/auth/viewercontext/ViewerContext;->b()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 269
    :cond_7
    invoke-virtual {v4, v3}, Landroid/app/DownloadManager$Request;->setShowRunningNotification(Z)Landroid/app/DownloadManager$Request;

    goto :goto_2

    .line 296
    :cond_8
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->c:Lcom/facebook/selfupdate/o;

    sget-object v2, Lcom/facebook/selfupdate/p;->QUEUE_DOWNLOAD:Lcom/facebook/selfupdate/p;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, p0, v2, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;Ljava/lang/String;)V

    .line 298
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->g:Landroid/app/DownloadManager;

    invoke-virtual {v0, v4}, Landroid/app/DownloadManager;->enqueue(Landroid/app/DownloadManager$Request;)J

    move-result-wide v0

    goto :goto_3

    :cond_9
    move v2, v3

    goto :goto_1

    :cond_a
    move v2, v3

    goto :goto_2
.end method

.method private a(Z)J
    .locals 5

    .prologue
    .line 112
    invoke-direct {p0, p1}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->b(Z)Lcom/facebook/selfupdate/c;

    move-result-object v2

    .line 113
    if-nez v2, :cond_0

    .line 114
    const-wide/32 v0, 0xa4cb80

    .line 126
    :goto_0
    return-wide v0

    .line 116
    :cond_0
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->i:Landroid/content/Context;

    invoke-direct {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v3

    .line 117
    const-wide/16 v0, -0x1

    .line 118
    invoke-virtual {v2}, Lcom/facebook/selfupdate/c;->a()Z

    move-result v4

    if-eqz v4, :cond_2

    if-nez p1, :cond_1

    invoke-direct {p0}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->a()Z

    move-result v4

    if-nez v4, :cond_2

    invoke-direct {p0, v2}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->a(Lcom/facebook/selfupdate/c;)Z

    move-result v4

    if-nez v4, :cond_2

    .line 121
    :cond_1
    sget v0, Lcom/facebook/o;->download_new_build:I

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->getString(I)Ljava/lang/String;

    move-result-object v0

    .line 122
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v3, v1, v4

    invoke-static {v0, v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    .line 123
    invoke-direct {p0, v2, v0, p1}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->a(Lcom/facebook/selfupdate/c;Ljava/lang/String;Z)J

    move-result-wide v0

    .line 125
    :cond_2
    invoke-direct {p0, v2, v0, v1, v3}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->a(Lcom/facebook/selfupdate/c;JLjava/lang/String;)V

    .line 126
    invoke-virtual {v2}, Lcom/facebook/selfupdate/c;->c()J

    move-result-wide v0

    goto :goto_0
.end method

.method private a(Landroid/content/Context;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 344
    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v1

    .line 347
    :try_start_0
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    :try_end_0
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    .line 351
    :goto_0
    if-eqz v0, :cond_0

    invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_1
    return-object v0

    .line 348
    :catch_0
    move-exception v0

    .line 349
    const/4 v0, 0x0

    goto :goto_0

    .line 351
    :cond_0
    const-string v0, ""

    goto :goto_1
.end method

.method private a(J)V
    .locals 7

    .prologue
    const-wide/32 v2, 0xf731400

    const-wide/32 v0, 0x493e0

    const/4 v6, 0x0

    .line 357
    cmp-long v4, p1, v2

    if-lez v4, :cond_1

    .line 361
    :goto_0
    cmp-long v4, v2, v0

    if-gez v4, :cond_0

    .line 365
    :goto_1
    iget-object v2, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->h:Lcom/facebook/common/time/a;

    invoke-interface {v2}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    add-long/2addr v2, v0

    .line 367
    iget-object v4, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v4}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v4

    sget-object v5, Lcom/facebook/selfupdate/j;->b:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v4, v5, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v4

    sget-object v5, Lcom/facebook/selfupdate/j;->c:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v4, v5, v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 372
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->i:Landroid/content/Context;

    const-class v4, Lcom/facebook/selfupdate/SelfUpdateFetchService;

    invoke-direct {v0, v1, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 374
    const-string v1, "force_update"

    invoke-virtual {v0, v1, v6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 376
    iget-object v1, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->i:Landroid/content/Context;

    invoke-static {v1, v6, v0, v6}, Landroid/app/PendingIntent;->getService(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v0

    .line 377
    iget-object v1, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->f:Landroid/app/AlarmManager;

    const/4 v4, 0x1

    invoke-virtual {v1, v4, v2, v3, v0}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    .line 379
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->c:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->ALARM_NEXT_TIME:Lcom/facebook/selfupdate/p;

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;Ljava/lang/String;)V

    .line 380
    return-void

    :cond_0
    move-wide v0, v2

    goto :goto_1

    :cond_1
    move-wide v2, p1

    goto :goto_0
.end method

.method private a(Lcom/facebook/selfupdate/c;JLjava/lang/String;)V
    .locals 4

    .prologue
    .line 158
    const-wide/16 v0, -0x1

    cmp-long v0, p2, v0

    if-eqz v0, :cond_0

    .line 160
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->d:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->d:Lcom/facebook/prefs/shared/ae;

    iget v2, p1, Lcom/facebook/selfupdate/c;->c:I

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, p2, p3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->e:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p1, Lcom/facebook/selfupdate/c;->e:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->f:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p1, Lcom/facebook/selfupdate/c;->f:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->i:Lcom/facebook/prefs/shared/ae;

    invoke-virtual {p1}, Lcom/facebook/selfupdate/c;->b()Z

    move-result v2

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Z)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, p4}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->k:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p1, Lcom/facebook/selfupdate/c;->h:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->n:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->o:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p1, Lcom/facebook/selfupdate/c;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->p:Lcom/facebook/prefs/shared/ae;

    iget-object v2, p1, Lcom/facebook/selfupdate/c;->j:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->q:Lcom/facebook/prefs/shared/ae;

    iget-wide v2, p1, Lcom/facebook/selfupdate/c;->k:J

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 175
    :cond_0
    return-void
.end method

.method private a()Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 184
    iget-object v1, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/j;->n:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v1

    .line 187
    if-eqz v1, :cond_0

    const/4 v0, 0x1

    :cond_0
    return v0
.end method

.method private a(JLandroid/app/DownloadManager$Request;)Z
    .locals 6

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 316
    iget-object v2, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->l:Lcom/facebook/common/f/f;

    sget-object v3, Lcom/facebook/common/f/g;->INTERNAL:Lcom/facebook/common/f/g;

    invoke-virtual {v2, v3}, Lcom/facebook/common/f/f;->a(Lcom/facebook/common/f/g;)J

    move-result-wide v2

    .line 318
    cmp-long v4, v2, p1

    if-gez v4, :cond_0

    .line 319
    iget-object v1, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->c:Lcom/facebook/selfupdate/o;

    sget-object v2, Lcom/facebook/selfupdate/p;->NO_FREE_SPACE_TO_DOWNLOAD:Lcom/facebook/selfupdate/p;

    invoke-virtual {v1, p0, v2}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 335
    :goto_0
    return v0

    .line 322
    :cond_0
    const-wide/16 v4, 0x2

    mul-long/2addr v4, p1

    cmp-long v2, v2, v4

    if-ltz v2, :cond_1

    move v0, v1

    .line 323
    goto :goto_0

    .line 325
    :cond_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageState()Ljava/lang/String;

    move-result-object v2

    const-string v3, "mounted"

    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->l:Lcom/facebook/common/f/f;

    sget-object v3, Lcom/facebook/common/f/g;->EXTERNAL:Lcom/facebook/common/f/g;

    invoke-virtual {v2, v3, p1, p2}, Lcom/facebook/common/f/f;->a(Lcom/facebook/common/f/g;J)Z

    move-result v2

    if-nez v2, :cond_2

    .line 327
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->i:Landroid/content/Context;

    sget-object v2, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    invoke-static {}, Lcom/facebook/common/h/a;->a()Ljava/util/UUID;

    move-result-object v3

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p3, v0, v2, v3}, Landroid/app/DownloadManager$Request;->setDestinationInExternalFilesDir(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/app/DownloadManager$Request;

    .line 331
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->c:Lcom/facebook/selfupdate/o;

    sget-object v2, Lcom/facebook/selfupdate/p;->DOWNLOAD_AT_EXTERNAL_DESTINATION:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, p0, v2}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    move v0, v1

    .line 332
    goto :goto_0

    .line 334
    :cond_2
    iget-object v1, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->c:Lcom/facebook/selfupdate/o;

    sget-object v2, Lcom/facebook/selfupdate/p;->NO_FREE_SPACE_TO_DOWNLOAD:Lcom/facebook/selfupdate/p;

    invoke-virtual {v1, p0, v2}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    goto :goto_0
.end method

.method private a(Lcom/facebook/selfupdate/c;)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 199
    invoke-virtual {p1}, Lcom/facebook/selfupdate/c;->b()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 215
    :cond_0
    :goto_0
    return v0

    .line 205
    :cond_1
    iget-object v1, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/j;->l:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v0}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v1

    .line 207
    iget v2, p1, Lcom/facebook/selfupdate/c;->c:I

    if-ne v1, v2, :cond_0

    .line 213
    iget-object v1, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->d:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/j;->m:Lcom/facebook/prefs/shared/ae;

    const-wide/16 v3, 0x0

    invoke-interface {v1, v2, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v1

    .line 215
    iget-object v3, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->h:Lcom/facebook/common/time/a;

    invoke-interface {v3}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v3

    cmp-long v1, v3, v1

    if-gez v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 302
    invoke-virtual {p0, p1}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->checkCallingOrSelfPermission(Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Z)Lcom/facebook/selfupdate/c;
    .locals 4
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    .prologue
    const/4 v1, 0x0

    .line 130
    if-eqz p1, :cond_0

    const/4 v0, 0x0

    .line 131
    :goto_0
    iget-object v2, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->i:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v2

    .line 132
    new-instance v3, Lcom/facebook/selfupdate/AppServerParams;

    invoke-direct {v3, v0, v2}, Lcom/facebook/selfupdate/AppServerParams;-><init>(ILjava/lang/String;)V

    .line 135
    :try_start_0
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->e:Lcom/facebook/http/protocol/aq;

    iget-object v2, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->a:Lcom/facebook/selfupdate/a;

    invoke-interface {v0, v2, v3}, Lcom/facebook/http/protocol/aq;->a(Lcom/facebook/http/protocol/f;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/c;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 150
    :goto_1
    return-object v0

    .line 130
    :cond_0
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->b:Lcom/facebook/config/b/a;

    invoke-interface {v0}, Lcom/facebook/config/b/a;->b()I

    move-result v0

    goto :goto_0

    .line 146
    :catch_0
    move-exception v0

    move-object v0, v1

    .line 147
    goto :goto_1

    .line 148
    :catch_1
    move-exception v0

    .line 149
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->c:Lcom/facebook/selfupdate/o;

    const-string v2, "Failed to fetch update information from server"

    invoke-virtual {v0, v2}, Lcom/facebook/selfupdate/o;->b(Ljava/lang/String;)V

    move-object v0, v1

    .line 150
    goto :goto_1
.end method


# virtual methods
.method public onCreate()V
    .locals 2

    .prologue
    .line 75
    invoke-super {p0}, Landroid/app/IntentService;->onCreate()V

    .line 77
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->setIntentRedelivery(Z)V

    .line 79
    invoke-static {p0}, Lcom/facebook/base/a/g;->a(Landroid/content/Context;)V

    .line 80
    invoke-static {p0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v1

    .line 82
    const-class v0, Lcom/facebook/selfupdate/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/a;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->a:Lcom/facebook/selfupdate/a;

    .line 83
    const-class v0, Lcom/facebook/config/b/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/b/a;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->b:Lcom/facebook/config/b/a;

    .line 84
    const-class v0, Lcom/facebook/selfupdate/o;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/o;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->c:Lcom/facebook/selfupdate/o;

    .line 85
    const-class v0, Lcom/facebook/prefs/shared/d;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/prefs/shared/d;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->d:Lcom/facebook/prefs/shared/d;

    .line 86
    const-class v0, Lcom/facebook/http/protocol/aq;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/http/protocol/aq;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->e:Lcom/facebook/http/protocol/aq;

    .line 87
    const-class v0, Landroid/app/AlarmManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->f:Landroid/app/AlarmManager;

    .line 88
    const-class v0, Landroid/app/DownloadManager;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/DownloadManager;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->g:Landroid/app/DownloadManager;

    .line 89
    const-class v0, Lcom/facebook/common/time/a;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->h:Lcom/facebook/common/time/a;

    .line 90
    const-class v0, Landroid/content/Context;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->i:Landroid/content/Context;

    .line 91
    const-class v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/auth/viewercontext/ViewerContext;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->j:Lcom/facebook/auth/viewercontext/ViewerContext;

    .line 92
    const-class v0, Lcom/facebook/selfupdate/af;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/af;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->k:Lcom/facebook/selfupdate/af;

    .line 93
    const-class v0, Lcom/facebook/common/f/f;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->b(Ljava/lang/Class;)Ljavax/inject/a;

    move-result-object v0

    invoke-interface {v0}, Ljavax/inject/a;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/f/f;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->l:Lcom/facebook/common/f/f;

    .line 94
    const-class v0, Lcom/facebook/selfupdate/f;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/selfupdate/f;

    iput-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->m:Lcom/facebook/selfupdate/f;

    .line 95
    return-void
.end method

.method public onHandleIntent(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 99
    if-nez p1, :cond_0

    .line 109
    :goto_0
    return-void

    .line 103
    :cond_0
    iget-object v0, p0, Lcom/facebook/selfupdate/SelfUpdateFetchService;->c:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->ON_HANDLE_INTENT:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, p0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 105
    const-string v0, "force_update"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    .line 107
    invoke-direct {p0, v0}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->a(Z)J

    move-result-wide v0

    .line 108
    invoke-direct {p0, v0, v1}, Lcom/facebook/selfupdate/SelfUpdateFetchService;->a(J)V

    goto :goto_0
.end method
