.class public Lcom/qihoo/antivirus/update/ai;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/antivirus/update/ac;
.implements Lcom/qihoo/antivirus/update/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/antivirus/update/ai$a;
    }
.end annotation


# instance fields
.field public a:Z

.field private final b:Landroid/content/Context;

.field private c:Lcom/qihoo/antivirus/update/d;

.field private d:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/qihoo/antivirus/update/d;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    .line 23
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/qihoo/antivirus/update/ai;->a:Z

    .line 499
    new-instance v0, Lcom/qihoo/antivirus/update/ai$1;

    invoke-direct {v0, p0}, Lcom/qihoo/antivirus/update/ai$1;-><init>(Lcom/qihoo/antivirus/update/ai;)V

    iput-object v0, p0, Lcom/qihoo/antivirus/update/ai;->d:Ljava/lang/Runnable;

    .line 26
    iput-object p1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    .line 27
    iput-object p2, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    .line 28
    return-void
.end method

.method static synthetic a(Lcom/qihoo/antivirus/update/ai;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    return-object v0
.end method

.method private a()V
    .locals 7

    .prologue
    .line 79
    sget-object v0, Lcom/qihoo/antivirus/update/d;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 80
    new-instance v0, Ljava/io/File;

    sget-object v1, Lcom/qihoo/antivirus/update/d;->b:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    new-instance v1, Lcom/qihoo/antivirus/update/ai$a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lcom/qihoo/antivirus/update/ai$a;-><init>(Lcom/qihoo/antivirus/update/ai$a;)V

    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;

    move-result-object v2

    .line 81
    if-eqz v2, :cond_0

    .line 82
    array-length v3, v2

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-lt v1, v3, :cond_1

    .line 101
    :cond_0
    return-void

    .line 82
    :cond_1
    aget-object v4, v2, v1

    .line 83
    invoke-virtual {v4}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 84
    invoke-virtual {v4}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    .line 85
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    const-string/jumbo v6, "product"

    invoke-static {v0, v6}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 86
    if-eqz v0, :cond_3

    .line 87
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v0, "_"

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 91
    :goto_1
    invoke-virtual {v5, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 95
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 82
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 89
    :cond_3
    const-string/jumbo v0, "MyUpdate_"

    goto :goto_1
.end method

.method public static a(Ljava/lang/String;Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 362
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 363
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.ERROR"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 364
    const-string/jumbo v1, "error_code"

    invoke-virtual {v0, v1, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 365
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 366
    sget-object v1, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 368
    :cond_0
    invoke-static {p1}, Lcom/qihoo/antivirus/update/UpdateService;->a(Landroid/content/Context;)V

    .line 369
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 401
    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 402
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.UPDATE_OVER"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 403
    const-string/jumbo v1, "app_path"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 404
    const-string/jumbo v1, "app_version"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 405
    const-string/jumbo v1, "app_desc"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 406
    const-string/jumbo v1, "force"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 407
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 408
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 411
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/UpdateService;->a(Landroid/content/Context;)V

    .line 412
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 480
    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 481
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/UpdateService;->a(Landroid/content/Context;)V

    .line 497
    :goto_0
    return-void

    .line 485
    :cond_0
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.UPDATE_NOTICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 486
    const-string/jumbo v1, "app_desc"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 487
    const-string/jumbo v1, "app_patch_size"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 488
    const-string/jumbo v1, "app_size"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 489
    const-string/jumbo v1, "app_version"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 490
    const-string/jumbo v1, "force"

    invoke-virtual {v0, v1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 491
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 492
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 495
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    .line 496
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->d:Ljava/lang/Runnable;

    const-wide/32 v2, 0x1d4c0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    goto :goto_0
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 122
    .line 123
    if-eqz p6, :cond_0

    .line 124
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0, p2}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 126
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {v1, p5, v0}, Lcom/qihoo/antivirus/update/UpdatePatchInstall;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v1

    .line 127
    if-eqz v1, :cond_2

    .line 128
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/ai;->d()V

    move-object p5, v0

    .line 134
    :cond_0
    :goto_0
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    .line 135
    invoke-direct {p0, p2, p1, p4, p5}, Lcom/qihoo/antivirus/update/ai;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    :goto_1
    return-void

    .line 140
    :cond_1
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/UpdateService;->a(Landroid/content/Context;)V

    goto :goto_1

    :cond_2
    move-object p5, v0

    goto :goto_0
.end method

.method private a(Z)V
    .locals 3

    .prologue
    .line 150
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    const-class v2, Lcom/qihoo/antivirus/update/UpdateService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 151
    const-string/jumbo v1, "com.qihoo.action.BEGIN_UPGRADE_APP"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 152
    const-string/jumbo v1, "extra_apk_merge"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 153
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 154
    return-void
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 3

    .prologue
    .line 105
    const/4 v0, 0x0

    .line 106
    new-instance v1, Ljava/io/File;

    invoke-direct {v1, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 107
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 108
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/qihoo/antivirus/update/af;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 109
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 110
    const/4 v0, 0x1

    .line 113
    :cond_0
    return v0
.end method

.method private b()V
    .locals 14

    .prologue
    .line 171
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v1, "Update"

    const-string/jumbo v2, "version"

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 172
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v1, "Update"

    const-string/jumbo v3, "description"

    invoke-virtual {v0, v1, v3}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 174
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v3, "Update"

    const-string/jumbo v4, "versioncode"

    invoke-virtual {v0, v3, v4}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 175
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v3, "Update"

    const-string/jumbo v4, "size"

    invoke-virtual {v0, v3, v4}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 176
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0, v2}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    .line 177
    iget-object v4, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v5, "Update"

    const-string/jumbo v6, "md5"

    invoke-virtual {v4, v5, v6}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 178
    iget-object v4, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v5, "Update"

    const-string/jumbo v7, "force"

    invoke-virtual {v4, v5, v7}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 179
    iget-object v5, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v7, "Update"

    const-string/jumbo v8, "patchsize"

    invoke-virtual {v5, v7, v8}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 180
    iget-object v5, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v7, "Update"

    const-string/jumbo v8, "patchmd5"

    invoke-virtual {v5, v7, v8}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 181
    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    .line 187
    const-wide/16 v10, 0x0

    invoke-static {v9, v10, v11}, Lcom/qihoo/antivirus/update/af;->a(Ljava/lang/String;J)J

    move-result-wide v10

    .line 188
    const-wide/16 v12, 0x0

    cmp-long v0, v10, v12

    if-lez v0, :cond_2

    .line 192
    invoke-direct {p0, v5, v6}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 193
    if-eqz v0, :cond_0

    .line 198
    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 225
    :goto_0
    return-void

    .line 201
    :cond_0
    invoke-direct {p0, v5}, Lcom/qihoo/antivirus/update/ai;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v7}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 202
    if-eqz v0, :cond_1

    .line 207
    invoke-direct {p0, v5}, Lcom/qihoo/antivirus/update/ai;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/4 v6, 0x1

    move-object v0, p0

    move-object v3, v9

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 211
    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/qihoo/antivirus/update/ai;->a:Z

    .line 212
    const/4 v11, 0x1

    move-object v5, p0

    move-object v6, v1

    move-object v7, v2

    move-object v8, v3

    move-object v10, v4

    invoke-direct/range {v5 .. v11}, Lcom/qihoo/antivirus/update/ai;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 214
    :cond_2
    invoke-direct {p0, v5, v6}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    .line 215
    if-eqz v0, :cond_3

    .line 220
    const/4 v6, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0

    .line 223
    :cond_3
    const/4 v11, 0x0

    move-object v5, p0

    move-object v6, v1

    move-object v7, v2

    move-object v8, v3

    move-object v10, v4

    invoke-direct/range {v5 .. v11}, Lcom/qihoo/antivirus/update/ai;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    goto :goto_0
.end method

.method private b(I)V
    .locals 3

    .prologue
    .line 388
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 389
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_INI"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 390
    const-string/jumbo v1, "data_file_count"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 391
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 392
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 394
    :cond_0
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 462
    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 463
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.INSTALL_NOTICE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 464
    const-string/jumbo v1, "app_desc"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 465
    const-string/jumbo v1, "app_path"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 466
    const-string/jumbo v1, "app_version"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 467
    const-string/jumbo v1, "force"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 468
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 469
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 472
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/UpdateService;->a(Landroid/content/Context;)V

    .line 473
    return-void
.end method

.method private b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .locals 3

    .prologue
    .line 162
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    .line 163
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    const-string/jumbo v1, "silent_update"

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/qihoo/antivirus/update/e;->a(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 164
    invoke-direct {p0, p6}, Lcom/qihoo/antivirus/update/ai;->a(Z)V

    .line 168
    :goto_0
    return-void

    .line 166
    :cond_0
    invoke-direct/range {p0 .. p5}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method private c()V
    .locals 3

    .prologue
    .line 418
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 419
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.CONNECT_RETRY"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 420
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 421
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 423
    :cond_0
    return-void
.end method

.method private c(JJ)V
    .locals 3

    .prologue
    .line 426
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 427
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.APP_PROGRESS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 428
    const-string/jumbo v1, "current"

    invoke-virtual {v0, v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 429
    const-string/jumbo v1, "total"

    invoke-virtual {v0, v1, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 430
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 431
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 433
    :cond_0
    return-void
.end method

.method private d()V
    .locals 3

    .prologue
    .line 449
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 450
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.APK_PATCH_ERROR"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 451
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 452
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 454
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/UpdateService;->a(Landroid/content/Context;)V

    .line 455
    return-void
.end method

.method private d(JJ)V
    .locals 3

    .prologue
    .line 436
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 437
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 438
    const-string/jumbo v1, "current"

    invoke-virtual {v0, v1, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 439
    const-string/jumbo v1, "total"

    invoke-virtual {v0, v1, p3, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;J)Landroid/content/Intent;

    .line 440
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 441
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 443
    :cond_0
    return-void
.end method

.method private static e()Z
    .locals 1

    .prologue
    .line 512
    sget-boolean v0, Lcom/qihoo/antivirus/update/UpdateService;->f:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private f(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 145
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, ".patch"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private g(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 375
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 376
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.UPDATE_CHECK_OVER"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 377
    const-string/jumbo v1, "data_file_version"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 378
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 379
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 381
    :cond_0
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/UpdateService;->a(Landroid/content/Context;)V

    .line 382
    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .prologue
    .line 229
    invoke-direct {p0, p1}, Lcom/qihoo/antivirus/update/ai;->b(I)V

    .line 230
    return-void
.end method

.method public a(ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 281
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/ai;->c()V

    .line 282
    return-void
.end method

.method public a(JJ)V
    .locals 1

    .prologue
    .line 319
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qihoo/antivirus/update/ai;->c(JJ)V

    .line 320
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 355
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 356
    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;IIII)V
    .locals 3

    .prologue
    .line 289
    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 290
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.PATCH_FILE_NOTIFY"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 291
    const-string/jumbo v1, "vdata_patch_name"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 292
    const-string/jumbo v1, "vdata_target_name"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 293
    const-string/jumbo v1, "vdata_flag"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 294
    const-string/jumbo v1, "vdata_method"

    invoke-virtual {v0, v1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 295
    const-string/jumbo v1, "vdata_version"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 296
    const-string/jumbo v1, "vdata_patch_type"

    invoke-virtual {v0, v1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 297
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 299
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 301
    :cond_0
    return-void
.end method

.method public a(Ljava/lang/String;Z)V
    .locals 3

    .prologue
    .line 308
    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 309
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.UPDATED_FILE_NOTIFY"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 310
    const-string/jumbo v1, "vdata_target_name"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 311
    const-string/jumbo v1, "vdata_update_result"

    invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 312
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 313
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 315
    :cond_0
    return-void
.end method

.method public a(ZZ)V
    .locals 2

    .prologue
    .line 41
    if-eqz p1, :cond_1

    .line 42
    sget-object v0, Lcom/qihoo/antivirus/update/d;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 43
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/ai;->b()V

    .line 61
    :goto_0
    return-void

    .line 48
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const/4 v1, 0x1

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string/jumbo v1, "99"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 49
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {v0, v1}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_0

    .line 53
    :cond_1
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/ai;->a()V

    .line 58
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/antivirus/update/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 59
    invoke-direct {p0, v0}, Lcom/qihoo/antivirus/update/ai;->g(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public b(ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 273
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/ai;->c()V

    .line 274
    return-void
.end method

.method public b(JJ)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/qihoo/antivirus/update/ai;->d(JJ)V

    .line 33
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 5

    .prologue
    .line 329
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v1, "Update"

    const-string/jumbo v2, "version"

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 330
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v2, "Update"

    const-string/jumbo v3, "description"

    invoke-virtual {v0, v2, v3}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 331
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    const-string/jumbo v3, "Update"

    const-string/jumbo v4, "force"

    invoke-virtual {v0, v3, v4}, Lcom/qihoo/antivirus/update/d;->b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 335
    iget-boolean v0, p0, Lcom/qihoo/antivirus/update/ai;->a:Z

    if-eqz v0, :cond_1

    .line 336
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->c:Lcom/qihoo/antivirus/update/d;

    invoke-virtual {v0, v1}, Lcom/qihoo/antivirus/update/d;->a(Ljava/lang/String;)Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 338
    iget-object v4, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {v4, p1, v0}, Lcom/qihoo/antivirus/update/UpdatePatchInstall;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)I

    move-result v4

    .line 339
    if-eqz v4, :cond_0

    .line 340
    invoke-direct {p0}, Lcom/qihoo/antivirus/update/ai;->d()V

    .line 348
    :goto_0
    return-void

    :cond_0
    move-object p1, v0

    .line 347
    :cond_1
    invoke-direct {p0, p1, v1, v2, v3}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public c(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 238
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 239
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_BEGIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 240
    const-string/jumbo v1, "data_file_path"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 241
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 242
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 244
    :cond_0
    return-void
.end method

.method public d(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 252
    sget v0, Lcom/qihoo/antivirus/update/UpdateService;->b:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    invoke-static {}, Lcom/qihoo/antivirus/update/ai;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 253
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_END"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 254
    const-string/jumbo v1, "data_file_path"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 255
    const-string/jumbo v1, "product"

    sget-object v2, Lcom/qihoo/antivirus/update/UpdateService;->c:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 256
    iget-object v1, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    sget-object v2, Lcom/qihoo/antivirus/update/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v0, v2}, Landroid/content/Context;->sendBroadcast(Landroid/content/Intent;Ljava/lang/String;)V

    .line 258
    :cond_0
    return-void
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 265
    iget-object v0, p0, Lcom/qihoo/antivirus/update/ai;->b:Landroid/content/Context;

    invoke-static {p1, v0}, Lcom/qihoo/antivirus/update/ai;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 266
    return-void
.end method
