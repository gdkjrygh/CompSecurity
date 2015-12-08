.class public final Lcom/roidapp/photogrid/common/bq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/c/c;


# static fields
.field private static a:Lcom/roidapp/photogrid/common/bq;


# instance fields
.field private b:Landroid/app/Activity;

.field private c:Landroid/app/AlertDialog;

.field private d:Lcom/roidapp/photogrid/c/h;

.field private e:Z

.field private f:Landroid/widget/ProgressBar;

.field private g:Z

.field private h:Z

.field private i:Z


# direct methods
.method private constructor <init>(ZLandroid/app/Activity;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 77
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 46
    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/bq;->g:Z

    .line 47
    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/bq;->h:Z

    .line 48
    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/bq;->i:Z

    .line 78
    iput-object p2, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    .line 79
    iput-boolean p1, p0, Lcom/roidapp/photogrid/common/bq;->e:Z

    .line 80
    invoke-static {}, Lcom/roidapp/photogrid/c/g;->a()V

    .line 81
    return-void
.end method

.method public static a(ZLandroid/app/Activity;)Lcom/roidapp/photogrid/common/bq;
    .locals 1

    .prologue
    .line 84
    sget-object v0, Lcom/roidapp/photogrid/common/bq;->a:Lcom/roidapp/photogrid/common/bq;

    if-nez v0, :cond_0

    .line 85
    new-instance v0, Lcom/roidapp/photogrid/common/bq;

    invoke-direct {v0, p0, p1}, Lcom/roidapp/photogrid/common/bq;-><init>(ZLandroid/app/Activity;)V

    .line 86
    sput-object v0, Lcom/roidapp/photogrid/common/bq;->a:Lcom/roidapp/photogrid/common/bq;

    .line 88
    :goto_0
    return-object v0

    :cond_0
    sget-object v0, Lcom/roidapp/photogrid/common/bq;->a:Lcom/roidapp/photogrid/common/bq;

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/common/bq;)V
    .locals 3

    .prologue
    .line 38
    .line 3361
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/bq;->h:Z

    if-eqz v0, :cond_0

    .line 3362
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v0

    const-string v1, "version3"

    const-string v2, "version_name"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 3363
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "_show_update_tips"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 3364
    iget-object v1, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const/4 v2, 0x0

    invoke-interface {v1, v0, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 38
    :cond_0
    return-void
.end method

.method private a(Z)V
    .locals 5

    .prologue
    .line 468
    new-instance v1, Ljava/io/File;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/roidapp/photogrid/common/bq;->k()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "photoGrid.apk"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 469
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 470
    invoke-static {v1}, Lcom/roidapp/photogrid/c/a;->a(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v2}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v2

    const-string v3, "update_md5"

    const-string v4, ""

    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 472
    :try_start_0
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "chmod 777 "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;

    .line 473
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "chmod 777 "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/io/File;->getParent()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 474
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/Runtime;->exec(Ljava/lang/String;)Ljava/lang/Process;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 478
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-direct {p0}, Lcom/roidapp/photogrid/common/bq;->k()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "photoGrid.apk"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v0, v2, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 479
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 480
    const/high16 v2, 0x10000000

    invoke-virtual {v0, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 481
    const-string v2, "android.intent.action.VIEW"

    invoke-virtual {v0, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 482
    invoke-static {v1}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    const-string v2, "application/vnd.android.package-archive"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 483
    iget-object v1, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 499
    :cond_0
    :goto_1
    return-void

    .line 476
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V

    goto :goto_0

    .line 487
    :cond_1
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 488
    if-nez p1, :cond_0

    .line 489
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/c/d;->a(Landroid/content/Context;Lcom/roidapp/photogrid/c/c;)Lcom/roidapp/photogrid/c/d;

    move-result-object v0

    const-string v1, "http://dl.pg.ksmobile.com/update/photoGrid.apk"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/c/d;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 493
    :cond_2
    if-nez p1, :cond_0

    .line 494
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v0, p0}, Lcom/roidapp/photogrid/c/d;->a(Landroid/content/Context;Lcom/roidapp/photogrid/c/c;)Lcom/roidapp/photogrid/c/d;

    move-result-object v0

    const-string v1, "http://dl.pg.ksmobile.com/update/photoGrid.apk"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/c/d;->a(Ljava/lang/String;)V

    goto :goto_1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/common/bq;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/common/bq;->a(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private a(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 381
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v0, p1}, Lcom/roidapp/baselib/c/n;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/common/bq;)Landroid/app/AlertDialog;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/common/bq;)Z
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/bq;->h:Z

    return v0
.end method

.method public static d()V
    .locals 1

    .prologue
    .line 502
    sget-object v0, Lcom/roidapp/photogrid/common/bq;->a:Lcom/roidapp/photogrid/common/bq;

    if-eqz v0, :cond_1

    .line 503
    sget-object v0, Lcom/roidapp/photogrid/common/bq;->a:Lcom/roidapp/photogrid/common/bq;

    iget-object v0, v0, Lcom/roidapp/photogrid/common/bq;->d:Lcom/roidapp/photogrid/c/h;

    if-eqz v0, :cond_0

    .line 504
    sget-object v0, Lcom/roidapp/photogrid/common/bq;->a:Lcom/roidapp/photogrid/common/bq;

    iget-object v0, v0, Lcom/roidapp/photogrid/common/bq;->d:Lcom/roidapp/photogrid/c/h;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/c/h;->a()V

    .line 505
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/c/d;->a()V

    .line 506
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/common/bq;->a:Lcom/roidapp/photogrid/common/bq;

    .line 508
    :cond_1
    return-void
.end method

.method static synthetic d(Lcom/roidapp/photogrid/common/bq;)Z
    .locals 1

    .prologue
    .line 38
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/bq;->i:Z

    return v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/common/bq;)Z
    .locals 1

    .prologue
    .line 38
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/roidapp/photogrid/common/bq;->i:Z

    return v0
.end method

.method private k()Ljava/lang/String;
    .locals 3

    .prologue
    .line 460
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v0

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    .line 461
    iget-object v1, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v1}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v1

    const-string v2, "SAVEPATH"

    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/photogrid/c/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1373
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    .line 331
    if-eqz v0, :cond_1

    .line 332
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/bq;->e:Z

    if-nez v0, :cond_0

    const-string v0, "com.android.vending"

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/common/bq;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    const-string v0, "Update/GooglePlay"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 334
    invoke-virtual {p0}, Lcom/roidapp/photogrid/common/bq;->c()V

    .line 335
    invoke-static {}, Lcom/roidapp/photogrid/common/bq;->d()V

    .line 341
    :goto_0
    iput-boolean v3, p0, Lcom/roidapp/photogrid/common/bq;->h:Z

    .line 345
    :goto_1
    return-void

    .line 337
    :cond_0
    const-string v0, "Update/Http"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 338
    new-instance v0, Lcom/roidapp/photogrid/c/h;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    iget-boolean v2, p0, Lcom/roidapp/photogrid/common/bq;->g:Z

    invoke-direct {v0, v1, p0, v2, v3}, Lcom/roidapp/photogrid/c/h;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/c/c;ZZ)V

    iput-object v0, p0, Lcom/roidapp/photogrid/common/bq;->d:Lcom/roidapp/photogrid/c/h;

    .line 339
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->d:Lcom/roidapp/photogrid/c/h;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/String;

    const-string v2, "http://dl.pg.ksmobile.com/update/update2"

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/c/h;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    goto :goto_0

    .line 343
    :cond_1
    sget-object v0, Lcom/roidapp/photogrid/c/b;->a:Lcom/roidapp/photogrid/c/b;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    const v2, 0x7f070147

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/common/bq;->a(Lcom/roidapp/photogrid/c/b;Ljava/lang/String;)V

    goto :goto_1
.end method

.method public final a(ILjava/lang/String;Ljava/lang/String;I)V
    .locals 7

    .prologue
    const v5, 0x7f07010e

    const/4 v3, 0x0

    const/4 v6, 0x0

    .line 97
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 100
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 305
    :cond_1
    :goto_0
    return-void

    .line 102
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03008d

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 103
    const v0, 0x7f0d021d

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 104
    const v2, 0x7f070055

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setText(I)V

    .line 105
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f070054

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f070053

    new-instance v2, Lcom/roidapp/photogrid/common/bu;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/common/bu;-><init>(Lcom/roidapp/photogrid/common/bq;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/common/br;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/common/br;-><init>(Lcom/roidapp/photogrid/common/bq;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    .line 126
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0, v6}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 127
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 128
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    if-eqz v0, :cond_1

    .line 129
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto :goto_0

    .line 136
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v0}, Lcom/roidapp/baselib/c/n;->c(Landroid/content/Context;)I

    move-result v0

    .line 137
    iget-object v1, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/baselib/c/n;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    .line 139
    iget-boolean v2, p0, Lcom/roidapp/photogrid/common/bq;->g:Z

    if-nez v2, :cond_4

    .line 140
    if-le p4, v0, :cond_3

    .line 142
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03008e

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v4

    .line 143
    const v0, 0x7f0d021f

    invoke-virtual {v4, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 146
    const v1, 0x7f0d0225

    invoke-virtual {v4, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 147
    const v2, 0x7f0d0226

    invoke-virtual {v4, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 148
    const v3, 0x7f0d0227

    invoke-virtual {v4, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 149
    new-instance v5, Landroid/app/AlertDialog$Builder;

    iget-object v6, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-direct {v5, v6}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v5, v4}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v4

    invoke-virtual {v4}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v4

    iput-object v4, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    .line 169
    iget-object v4, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    new-instance v5, Lcom/roidapp/photogrid/common/bv;

    invoke-direct {v5, p0}, Lcom/roidapp/photogrid/common/bv;-><init>(Lcom/roidapp/photogrid/common/bq;)V

    invoke-virtual {v4, v5}, Landroid/app/AlertDialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 175
    const v4, 0x7f0701cf

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    .line 178
    invoke-virtual {v1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 179
    new-instance v0, Lcom/roidapp/photogrid/common/bw;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/bw;-><init>(Lcom/roidapp/photogrid/common/bq;)V

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 187
    new-instance v0, Lcom/roidapp/photogrid/common/bx;

    invoke-direct {v0, p0, p2}, Lcom/roidapp/photogrid/common/bx;-><init>(Lcom/roidapp/photogrid/common/bq;Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 226
    :cond_2
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 227
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    if-eqz v0, :cond_1

    .line 228
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_0

    .line 211
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/bq;->h:Z

    if-nez v0, :cond_2

    .line 212
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v2, 0x7f0701f9

    invoke-virtual {v0, v2}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    const v4, 0x7f0701a3

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/common/by;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/common/by;-><init>(Lcom/roidapp/photogrid/common/bq;)V

    invoke-virtual {v0, v5, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    goto :goto_1

    .line 233
    :cond_4
    if-le p4, v0, :cond_1

    .line 235
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "lastSilentCheckCode"

    invoke-interface {v0, v1, v6}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-le p4, v0, :cond_1

    .line 1314
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    const-string v1, "alarm"

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/AlarmManager;

    .line 1315
    new-instance v1, Landroid/content/Intent;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-virtual {v3}, Landroid/app/Activity;->getPackageName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_show_new_notification"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1316
    const-string v2, "NEW_VERSION_CODE"

    invoke-virtual {v1, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1317
    const-string v2, "NEW_VERSION"

    invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1318
    const-string v2, "NEW_VERSION_WHAT"

    invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1319
    iget-object v2, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v2, v6, v1, v6}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v1

    .line 1320
    invoke-virtual {v0, v1}, Landroid/app/AlarmManager;->cancel(Landroid/app/PendingIntent;)V

    .line 1321
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/32 v4, 0x6ddd00

    add-long/2addr v2, v4

    invoke-virtual {v0, v6, v2, v3, v1}, Landroid/app/AlarmManager;->set(IJLandroid/app/PendingIntent;)V

    goto/16 :goto_0

    .line 242
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f030006

    invoke-virtual {v0, v1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v1

    .line 243
    const v0, 0x7f0d0045

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ProgressBar;

    iput-object v0, p0, Lcom/roidapp/photogrid/common/bq;->f:Landroid/widget/ProgressBar;

    .line 244
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v2, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-direct {v0, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f070038

    new-instance v2, Lcom/roidapp/photogrid/common/cb;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/common/cb;-><init>(Lcom/roidapp/photogrid/common/bq;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    const v1, 0x7f070036

    new-instance v2, Lcom/roidapp/photogrid/common/ca;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/common/ca;-><init>(Lcom/roidapp/photogrid/common/bq;)V

    invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/common/bz;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/common/bz;-><init>(Lcom/roidapp/photogrid/common/bq;)V

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    .line 272
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0, v6}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V

    .line 273
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 274
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    if-eqz v0, :cond_1

    .line 275
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_0

    .line 281
    :pswitch_3
    new-instance v0, Landroid/app/AlertDialog$Builder;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    const v1, 0x7f070146

    invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setTitle(I)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    new-instance v1, Lcom/roidapp/photogrid/common/bs;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/common/bs;-><init>(Lcom/roidapp/photogrid/common/bq;)V

    invoke-virtual {v0, v5, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    move-result-object v0

    invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    .line 292
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/bq;->h:Z

    if-nez v0, :cond_1

    .line 293
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    move-result v0

    if-nez v0, :cond_1

    .line 294
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    if-eqz v0, :cond_1

    .line 295
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V

    goto/16 :goto_0

    .line 100
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public final a(Lcom/roidapp/photogrid/c/b;Ljava/lang/String;)V
    .locals 4

    .prologue
    .line 574
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/roidapp/photogrid/c/b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/roidapp/photogrid/c/g;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 575
    const-string v0, ""

    .line 576
    sget-object v1, Lcom/roidapp/photogrid/common/bt;->a:[I

    invoke-virtual {p1}, Lcom/roidapp/photogrid/c/b;->ordinal()I

    move-result v2

    aget v1, v1, v2

    packed-switch v1, :pswitch_data_0

    .line 593
    :goto_0
    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {p0, v1, v0, v2, v3}, Lcom/roidapp/photogrid/common/bq;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 594
    return-void

    .line 578
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    const v1, 0x7f070147

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 581
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    const v1, 0x7f070143

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 584
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    const v1, 0x7f070144

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 587
    :pswitch_3
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    const v1, 0x7f070145

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 590
    :pswitch_4
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    const v1, 0x7f070148

    invoke-virtual {v0, v1}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 576
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch
.end method

.method public final a(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    .prologue
    .line 522
    const/4 v0, 0x2

    invoke-virtual {p0, v0, p1, p3, p2}, Lcom/roidapp/photogrid/common/bq;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 523
    return-void
.end method

.method public final varargs a([Ljava/lang/Integer;)V
    .locals 2

    .prologue
    .line 563
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->f:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    aget-object v1, p1, v1

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setProgress(I)V

    .line 564
    return-void
.end method

.method public final b()V
    .locals 4

    .prologue
    const/4 v2, 0x1

    .line 2373
    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    .line 351
    if-eqz v0, :cond_0

    .line 354
    iput-boolean v2, p0, Lcom/roidapp/photogrid/common/bq;->h:Z

    .line 355
    new-instance v0, Lcom/roidapp/photogrid/c/h;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    invoke-direct {v0, v1, p0, v2, v2}, Lcom/roidapp/photogrid/c/h;-><init>(Landroid/content/Context;Lcom/roidapp/photogrid/c/c;ZZ)V

    iput-object v0, p0, Lcom/roidapp/photogrid/common/bq;->d:Lcom/roidapp/photogrid/c/h;

    .line 356
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->d:Lcom/roidapp/photogrid/c/h;

    new-array v1, v2, [Ljava/lang/String;

    const/4 v2, 0x0

    const-string v3, "http://dl.pg.ksmobile.com/update/update2"

    aput-object v3, v1, v2

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/c/h;->execute([Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    .line 358
    :cond_0
    return-void
.end method

.method public final c()V
    .locals 7

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    const/high16 v6, 0x10000000

    .line 389
    iget-object v3, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    .line 2407
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2408
    invoke-virtual {v2, v6}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 2409
    const-string v4, "com.android.vending"

    const-string v5, "com.google.android.finsky.activities.MainActivity"

    invoke-virtual {v2, v4, v5}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 2410
    const-string v4, "market://details?id=com.roidapp.photogrid"

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 2412
    :try_start_0
    invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    move v2, v0

    .line 2418
    :goto_0
    if-nez v2, :cond_0

    .line 2423
    :try_start_1
    new-instance v2, Landroid/content/Intent;

    const-string v4, "android.intent.action.VIEW"

    invoke-direct {v2, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 2424
    const-string v4, "com.android.vending"

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 2425
    const/high16 v4, 0x10000000

    invoke-virtual {v2, v4}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 2426
    const-string v4, "market://details?id=com.roidapp.photogrid"

    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v4

    invoke-virtual {v2, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 2427
    invoke-virtual {v3, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 2435
    :goto_1
    if-nez v0, :cond_0

    .line 2438
    const-string v0, "https://play.google.com/store/apps/details?id=com.roidapp.photogrid"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    .line 2439
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.VIEW"

    invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 2440
    invoke-virtual {v1, v6}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 2441
    invoke-virtual {v3, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 390
    :cond_0
    return-void

    .line 2414
    :catch_0
    move-exception v2

    invoke-virtual {v2}, Landroid/content/ActivityNotFoundException;->printStackTrace()V

    move v2, v1

    .line 2415
    goto :goto_0

    .line 2429
    :catch_1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v0, v1

    .line 2430
    goto :goto_1
.end method

.method public final e()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 515
    iget-boolean v0, p0, Lcom/roidapp/photogrid/common/bq;->g:Z

    if-nez v0, :cond_0

    .line 516
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v2, v1}, Lcom/roidapp/photogrid/common/bq;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 518
    :cond_0
    return-void
.end method

.method public final f()V
    .locals 1

    .prologue
    .line 527
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->d:Lcom/roidapp/photogrid/c/h;

    if-eqz v0, :cond_0

    .line 528
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->d:Lcom/roidapp/photogrid/c/h;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/c/h;->a()V

    .line 531
    :cond_0
    return-void
.end method

.method public final g()V
    .locals 2

    .prologue
    .line 535
    const-string v0, ""

    invoke-static {v0}, Lcom/roidapp/photogrid/c/a;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 536
    sget-object v0, Lcom/roidapp/photogrid/c/b;->e:Lcom/roidapp/photogrid/c/b;

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/common/bq;->a(Lcom/roidapp/photogrid/c/b;Ljava/lang/String;)V

    .line 541
    :goto_0
    return-void

    .line 538
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/common/bq;->a(Z)V

    goto :goto_0
.end method

.method public final h()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 545
    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v2, v2, v1}, Lcom/roidapp/photogrid/common/bq;->a(ILjava/lang/String;Ljava/lang/String;I)V

    .line 546
    return-void
.end method

.method public final i()V
    .locals 1

    .prologue
    .line 555
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 556
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->c:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 558
    :cond_0
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/common/bq;->a(Z)V

    .line 559
    return-void
.end method

.method public final j()V
    .locals 3

    .prologue
    .line 568
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    iget-object v1, p0, Lcom/roidapp/photogrid/common/bq;->b:Landroid/app/Activity;

    const v2, 0x7f070049

    invoke-virtual {v1, v2}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 569
    invoke-static {}, Lcom/roidapp/photogrid/c/d;->a()V

    .line 570
    return-void
.end method
