.class public Lcom/facebook/selfupdate/af;
.super Ljava/lang/Object;
.source "SelfUpdateNotifier.java"


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0x9
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/prefs/shared/d;

.field private final c:Lcom/facebook/config/b/a;

.field private final d:Lcom/facebook/selfupdate/o;

.field private final e:Lcom/facebook/c/s;

.field private final f:Lcom/facebook/common/executors/a;

.field private final g:Lcom/facebook/selfupdate/h;

.field private final h:Lcom/facebook/common/f/d;

.field private final i:Landroid/app/DownloadManager;

.field private final j:Lcom/facebook/selfupdate/ae;

.field private final k:Lcom/facebook/base/broadcast/j;

.field private l:Lcom/facebook/base/broadcast/l;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/prefs/shared/d;Lcom/facebook/config/b/a;Lcom/facebook/common/executors/a;Lcom/facebook/selfupdate/o;Lcom/facebook/c/s;Lcom/facebook/selfupdate/h;Lcom/facebook/common/f/d;Landroid/app/DownloadManager;Lcom/facebook/base/broadcast/j;Lcom/facebook/selfupdate/ae;)V
    .locals 0

    .prologue
    .line 126
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 127
    iput-object p1, p0, Lcom/facebook/selfupdate/af;->a:Landroid/content/Context;

    .line 128
    iput-object p2, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    .line 129
    iput-object p3, p0, Lcom/facebook/selfupdate/af;->c:Lcom/facebook/config/b/a;

    .line 130
    iput-object p4, p0, Lcom/facebook/selfupdate/af;->f:Lcom/facebook/common/executors/a;

    .line 131
    iput-object p5, p0, Lcom/facebook/selfupdate/af;->d:Lcom/facebook/selfupdate/o;

    .line 132
    iput-object p6, p0, Lcom/facebook/selfupdate/af;->e:Lcom/facebook/c/s;

    .line 133
    iput-object p7, p0, Lcom/facebook/selfupdate/af;->g:Lcom/facebook/selfupdate/h;

    .line 134
    iput-object p8, p0, Lcom/facebook/selfupdate/af;->h:Lcom/facebook/common/f/d;

    .line 135
    iput-object p9, p0, Lcom/facebook/selfupdate/af;->i:Landroid/app/DownloadManager;

    .line 136
    iput-object p10, p0, Lcom/facebook/selfupdate/af;->k:Lcom/facebook/base/broadcast/j;

    .line 137
    iput-object p11, p0, Lcom/facebook/selfupdate/af;->j:Lcom/facebook/selfupdate/ae;

    .line 138
    return-void
.end method

.method static synthetic a(Lcom/facebook/selfupdate/af;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->a:Landroid/content/Context;

    return-object v0
.end method

.method public static a(Landroid/net/Uri;Landroid/content/Context;)Landroid/content/Intent;
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    const/4 v3, 0x1

    .line 65
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 67
    const-string v1, "application/vnd.android.package-archive"

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 74
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v1, v2, :cond_0

    .line 75
    const-string v1, "android.intent.action.INSTALL_PACKAGE"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 76
    const-string v1, "android.intent.extra.NOT_UNKNOWN_SOURCE"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 77
    const-string v1, "android.intent.extra.RETURN_RESULT"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 80
    const-string v1, "android.intent.extra.ALLOW_REPLACE"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 83
    const-string v1, "android.intent.extra.INSTALLER_PACKAGE_NAME"

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v2

    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 90
    :goto_0
    return-object v0

    .line 86
    :cond_0
    const-string v1, "android.intent.action.VIEW"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 87
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    goto :goto_0
.end method

.method public static a(Landroid/net/Uri;Landroid/app/Activity;)V
    .locals 4
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .prologue
    .line 102
    invoke-static {p1}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v1, Lcom/facebook/c/s;

    invoke-virtual {v0, v1}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/c/s;

    .line 103
    invoke-static {p0, p1}, Lcom/facebook/selfupdate/af;->a(Landroid/net/Uri;Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v1

    .line 104
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xe

    if-lt v2, v3, :cond_0

    .line 109
    const/4 v2, 0x4

    invoke-virtual {v0, v1, v2, p1}, Lcom/facebook/c/s;->a(Landroid/content/Intent;ILandroid/app/Activity;)V

    .line 113
    :goto_0
    return-void

    .line 111
    :cond_0
    invoke-virtual {v0, v1, p1}, Lcom/facebook/c/s;->b(Landroid/content/Intent;Landroid/content/Context;)V

    goto :goto_0
.end method

.method static synthetic b(Lcom/facebook/selfupdate/af;)Lcom/facebook/c/s;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->e:Lcom/facebook/c/s;

    return-object v0
.end method

.method static synthetic c(Lcom/facebook/selfupdate/af;)Lcom/facebook/base/broadcast/l;
    .locals 1

    .prologue
    .line 40
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->l:Lcom/facebook/base/broadcast/l;

    return-object v0
.end method

.method private c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 340
    :try_start_0
    new-instance v0, Ljava/net/URI;

    invoke-direct {v0, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 349
    invoke-virtual {v0}, Ljava/net/URI;->isAbsolute()Z

    move-result v1

    if-eqz v1, :cond_1

    const-string v1, "file"

    invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 352
    :try_start_1
    iget-object v1, p0, Lcom/facebook/selfupdate/af;->h:Lcom/facebook/common/f/d;

    invoke-virtual {v1, v0}, Lcom/facebook/common/f/d;->a(Ljava/net/URI;)Ljava/io/File;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    .line 360
    :goto_0
    if-eqz v0, :cond_0

    .line 361
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 363
    :cond_0
    :goto_1
    return-void

    .line 353
    :catch_0
    move-exception v0

    .line 354
    const/4 v0, 0x0

    .line 355
    goto :goto_0

    .line 357
    :cond_1
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->h:Lcom/facebook/common/f/d;

    invoke-virtual {v0, p1}, Lcom/facebook/common/f/d;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    goto :goto_0

    .line 341
    :catch_1
    move-exception v0

    goto :goto_1
.end method


# virtual methods
.method protected a()Landroid/content/Intent;
    .locals 9

    .prologue
    const/4 v1, -0x1

    const/4 v6, 0x0

    .line 151
    :try_start_0
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/j;->d:Lcom/facebook/prefs/shared/ae;

    const/4 v3, -0x1

    invoke-interface {v0, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    .line 168
    :goto_0
    iget-object v1, p0, Lcom/facebook/selfupdate/af;->c:Lcom/facebook/config/b/a;

    invoke-interface {v1}, Lcom/facebook/config/b/a;->b()I

    move-result v7

    .line 169
    iget-object v1, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/j;->h:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v1, v2, v6}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 171
    iget-object v2, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/selfupdate/j;->f:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v2, v3, v6}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 173
    iget-object v3, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v4, Lcom/facebook/selfupdate/j;->i:Lcom/facebook/prefs/shared/ae;

    const/4 v5, 0x0

    invoke-interface {v3, v4, v5}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Z)Z

    move-result v3

    .line 175
    iget-object v4, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v5, Lcom/facebook/selfupdate/j;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v4, v5, v6}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 177
    iget-object v5, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v8, Lcom/facebook/selfupdate/j;->o:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v5, v8, v6}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 180
    if-ge v7, v0, :cond_0

    invoke-virtual {p0, v1}, Lcom/facebook/selfupdate/af;->a(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v6

    .line 186
    :goto_1
    return-object v0

    .line 152
    :catch_0
    move-exception v0

    .line 157
    :try_start_1
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/j;->d:Lcom/facebook/prefs/shared/ae;

    const-string v3, ""

    invoke-interface {v0, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    move-result-object v0

    .line 163
    :goto_2
    iget-object v2, p0, Lcom/facebook/selfupdate/af;->d:Lcom/facebook/selfupdate/o;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "SelfUpdateNotifier.createIntent - Stored new_version data type does not match: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;)V

    move v0, v1

    goto :goto_0

    .line 160
    :catch_1
    move-exception v0

    .line 161
    const-string v0, "error getting stored string"

    goto :goto_2

    :cond_1
    move-object v0, p0

    .line 186
    invoke-virtual/range {v0 .. v5}, Lcom/facebook/selfupdate/af;->a(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    goto :goto_1
.end method

.method protected a(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 233
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/facebook/selfupdate/af;->a:Landroid/content/Context;

    const-class v2, Lcom/facebook/selfupdate/SelfUpdateInstallActivity;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 235
    const/high16 v1, 0x4000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 236
    const-string v1, "local_uri"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 237
    if-eqz p2, :cond_0

    .line 238
    const-string v1, "release_notes"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 240
    :cond_0
    const-string v1, "no_cancel"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 241
    if-eqz p4, :cond_1

    .line 242
    const-string v1, "app_name"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 244
    :cond_1
    if-eqz p5, :cond_2

    const-string v1, "no_megaphone"

    invoke-virtual {p5, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 245
    const-string v1, "megaphone"

    invoke-virtual {v0, v1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 248
    :cond_2
    return-object v0
.end method

.method protected a(Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 309
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->f:Lcom/facebook/common/executors/a;

    new-instance v1, Lcom/facebook/selfupdate/ag;

    invoke-direct {v1, p0, p1}, Lcom/facebook/selfupdate/ag;-><init>(Lcom/facebook/selfupdate/af;Landroid/content/Intent;)V

    invoke-interface {v0, v1}, Lcom/facebook/common/executors/a;->b(Ljava/lang/Runnable;)V

    .line 315
    return-void
.end method

.method public a(Ljava/lang/String;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 190
    if-nez p1, :cond_1

    .line 210
    :cond_0
    :goto_0
    return v0

    .line 195
    :cond_1
    :try_start_0
    new-instance v1, Ljava/net/URI;

    invoke-direct {v1, p1}, Ljava/net/URI;-><init>(Ljava/lang/String;)V

    .line 197
    invoke-virtual {v1}, Ljava/net/URI;->isAbsolute()Z

    move-result v2

    if-eqz v2, :cond_2

    .line 198
    iget-object v2, p0, Lcom/facebook/selfupdate/af;->h:Lcom/facebook/common/f/d;

    invoke-virtual {v2, v1}, Lcom/facebook/common/f/d;->a(Ljava/net/URI;)Ljava/io/File;

    move-result-object v1

    .line 203
    :goto_1
    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 210
    const/4 v0, 0x1

    goto :goto_0

    .line 200
    :cond_2
    iget-object v1, p0, Lcom/facebook/selfupdate/af;->h:Lcom/facebook/common/f/d;

    invoke-virtual {v1, p1}, Lcom/facebook/common/f/d;->a(Ljava/lang/String;)Ljava/io/File;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v1

    goto :goto_1

    .line 206
    :catch_0
    move-exception v1

    goto :goto_0
.end method

.method public declared-synchronized b()V
    .locals 5

    .prologue
    .line 255
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/selfupdate/j;->n:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v0

    .line 259
    iget-object v1, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/j;->o:Lcom/facebook/prefs/shared/ae;

    const-string v3, "no_megaphone"

    invoke-interface {v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 262
    iget-object v2, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/selfupdate/j;->p:Lcom/facebook/prefs/shared/ae;

    const-string v4, "application/vnd.android.package-archive"

    invoke-interface {v2, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 265
    const/4 v3, 0x2

    if-ne v0, v3, :cond_0

    const-string v0, "no_megaphone"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "application/vnd.android.package-archive"

    invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 268
    invoke-virtual {p0}, Lcom/facebook/selfupdate/af;->c()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 270
    :cond_0
    monitor-exit p0

    return-void

    .line 255
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 426
    const-string v0, "application/java-archive"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 428
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->k:Lcom/facebook/base/broadcast/j;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/j;->a()Lcom/facebook/base/broadcast/k;

    move-result-object v0

    const-string v1, "clean_up_action"

    new-instance v2, Lcom/facebook/selfupdate/ah;

    invoke-direct {v2, p0}, Lcom/facebook/selfupdate/ah;-><init>(Lcom/facebook/selfupdate/af;)V

    invoke-interface {v0, v1, v2}, Lcom/facebook/base/broadcast/k;->a(Ljava/lang/String;Lcom/facebook/c/b;)Lcom/facebook/base/broadcast/k;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/base/broadcast/k;->a()Lcom/facebook/base/broadcast/l;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/selfupdate/af;->l:Lcom/facebook/base/broadcast/l;

    .line 438
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->l:Lcom/facebook/base/broadcast/l;

    invoke-interface {v0}, Lcom/facebook/base/broadcast/l;->b()V

    .line 440
    new-instance v0, Landroid/content/Intent;

    const-string v1, "download_complete_action"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 441
    iget-object v1, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v2, Lcom/facebook/selfupdate/j;->h:Lcom/facebook/prefs/shared/ae;

    const/4 v3, 0x0

    invoke-interface {v1, v2, v3}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 444
    iget-object v2, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v3, Lcom/facebook/selfupdate/j;->d:Lcom/facebook/prefs/shared/ae;

    const/4 v4, -0x1

    invoke-interface {v2, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v2

    .line 445
    const-string v3, "local_file"

    invoke-virtual {v0, v3, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 446
    const-string v1, "mime_type"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 447
    const-string v1, "new_build"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 448
    iget-object v1, p0, Lcom/facebook/selfupdate/af;->k:Lcom/facebook/base/broadcast/j;

    invoke-interface {v1, v0}, Lcom/facebook/base/broadcast/j;->a(Landroid/content/Intent;)V

    .line 449
    return-void
.end method

.method public declared-synchronized c()V
    .locals 2

    .prologue
    .line 279
    monitor-enter p0

    :try_start_0
    invoke-virtual {p0}, Lcom/facebook/selfupdate/af;->a()Landroid/content/Intent;

    move-result-object v0

    .line 281
    if-eqz v0, :cond_1

    .line 285
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 288
    iget-object v1, p0, Lcom/facebook/selfupdate/af;->g:Lcom/facebook/selfupdate/h;

    invoke-virtual {v1}, Lcom/facebook/selfupdate/h;->a()Landroid/app/Activity;

    move-result-object v1

    .line 289
    if-nez v1, :cond_0

    .line 293
    iget-object v1, p0, Lcom/facebook/selfupdate/af;->j:Lcom/facebook/selfupdate/ae;

    invoke-interface {v1, v0}, Lcom/facebook/selfupdate/ae;->a(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 300
    :goto_0
    monitor-exit p0

    return-void

    .line 295
    :cond_0
    :try_start_1
    invoke-virtual {p0, v0}, Lcom/facebook/selfupdate/af;->a(Landroid/content/Intent;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 279
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 298
    :cond_1
    :try_start_2
    invoke-virtual {p0}, Lcom/facebook/selfupdate/af;->f()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0
.end method

.method public declared-synchronized d()V
    .locals 2

    .prologue
    .line 325
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->d:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->CREATE_NOTIFICATION:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, p0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 326
    invoke-virtual {p0}, Lcom/facebook/selfupdate/af;->a()Landroid/content/Intent;

    move-result-object v0

    .line 328
    if-eqz v0, :cond_0

    .line 329
    iget-object v1, p0, Lcom/facebook/selfupdate/af;->j:Lcom/facebook/selfupdate/ae;

    invoke-interface {v1, v0}, Lcom/facebook/selfupdate/ae;->a(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 333
    :goto_0
    monitor-exit p0

    return-void

    .line 331
    :cond_0
    :try_start_1
    invoke-virtual {p0}, Lcom/facebook/selfupdate/af;->f()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    .line 325
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public e()V
    .locals 6

    .prologue
    .line 366
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/selfupdate/j;->d:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;I)I

    move-result v1

    .line 367
    if-eqz v1, :cond_0

    .line 369
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->a:Landroid/content/Context;

    invoke-static {v0}, Lcom/facebook/inject/t;->a(Landroid/content/Context;)Lcom/facebook/inject/t;

    move-result-object v0

    const-class v2, Lcom/facebook/common/time/a;

    invoke-virtual {v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/common/time/a;

    invoke-interface {v0}, Lcom/facebook/common/time/a;->a()J

    move-result-wide v2

    const-wide/32 v4, 0x5265c00

    add-long/2addr v2, v4

    .line 371
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v4, Lcom/facebook/selfupdate/j;->l:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v4, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;I)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->m:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v2, v3}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;J)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 376
    :cond_0
    return-void
.end method

.method public f()V
    .locals 6

    .prologue
    const-wide/16 v3, -0x1

    .line 379
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->d:Lcom/facebook/selfupdate/o;

    sget-object v1, Lcom/facebook/selfupdate/p;->CLEAN_UPDATE_INFO:Lcom/facebook/selfupdate/p;

    invoke-virtual {v0, p0, v1}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/Object;Lcom/facebook/selfupdate/p;)V

    .line 380
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->j:Lcom/facebook/selfupdate/ae;

    invoke-interface {v0}, Lcom/facebook/selfupdate/ae;->a()V

    .line 382
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/selfupdate/j;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1, v3, v4}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;J)J

    move-result-wide v1

    .line 384
    cmp-long v0, v1, v3

    if-eqz v0, :cond_0

    .line 389
    :try_start_0
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->i:Landroid/app/DownloadManager;

    const/4 v3, 0x1

    new-array v3, v3, [J

    const/4 v4, 0x0

    aput-wide v1, v3, v4

    invoke-virtual {v0, v3}, Landroid/app/DownloadManager;->remove([J)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 399
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    sget-object v1, Lcom/facebook/selfupdate/j;->h:Lcom/facebook/prefs/shared/ae;

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Lcom/facebook/prefs/shared/d;->a(Lcom/facebook/prefs/shared/ae;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 401
    if-eqz v0, :cond_1

    .line 402
    invoke-direct {p0, v0}, Lcom/facebook/selfupdate/af;->c(Ljava/lang/String;)V

    .line 406
    :cond_1
    iget-object v0, p0, Lcom/facebook/selfupdate/af;->b:Lcom/facebook/prefs/shared/d;

    invoke-interface {v0}, Lcom/facebook/prefs/shared/d;->b()Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->d:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->e:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->f:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->n:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->i:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->g:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->h:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->j:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->o:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    sget-object v1, Lcom/facebook/selfupdate/j;->p:Lcom/facebook/prefs/shared/ae;

    invoke-interface {v0, v1}, Lcom/facebook/prefs/shared/e;->a(Lcom/facebook/prefs/shared/ae;)Lcom/facebook/prefs/shared/e;

    move-result-object v0

    invoke-interface {v0}, Lcom/facebook/prefs/shared/e;->a()V

    .line 418
    return-void

    .line 390
    :catch_0
    move-exception v0

    .line 391
    iget-object v3, p0, Lcom/facebook/selfupdate/af;->d:Lcom/facebook/selfupdate/o;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "Failed to remove download ID from DownloadManager: "

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1, v0}, Lcom/facebook/selfupdate/o;->a(Ljava/lang/String;Ljava/lang/Exception;)V

    goto :goto_0
.end method
