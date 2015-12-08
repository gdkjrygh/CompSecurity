.class public Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;
.super Lcom/roidapp/photogrid/release/ParentActivity;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/cloudlib/template/b/a;


# instance fields
.field private a:Lcom/roidapp/photogrid/common/al;

.field private b:Landroid/widget/RelativeLayout;

.field private c:Landroid/support/v4/view/ViewPager;

.field private d:Lcom/roidapp/photogrid/cloud/cu;

.field private e:Lcom/roidapp/cloudlib/template/b/c;

.field private f:[Z

.field private g:Z

.field private h:Z

.field private i:Landroid/widget/ImageView;

.field private j:Landroid/widget/ImageButton;

.field private k:Landroid/widget/RelativeLayout;

.field private l:Landroid/widget/RelativeLayout;

.field private m:Landroid/widget/RelativeLayout;

.field private n:Landroid/net/Uri;

.field private o:Lcom/roidapp/photogrid/cloud/ct;

.field private p:Landroid/os/Bundle;

.field private q:Lcom/roidapp/photogrid/cloud/aa;

.field private r:Lcom/roidapp/photogrid/cloud/aa;

.field private s:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 84
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/ParentActivity;-><init>()V

    .line 98
    const/4 v0, 0x3

    new-array v0, v0, [Z

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->f:[Z

    .line 99
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->g:Z

    .line 100
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->h:Z

    .line 111
    new-instance v0, Lcom/roidapp/photogrid/cloud/ct;

    invoke-direct {v0, p0, p0}, Lcom/roidapp/photogrid/cloud/ct;-><init>(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->o:Lcom/roidapp/photogrid/cloud/ct;

    .line 115
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->s:J

    .line 583
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/support/v4/view/ViewPager;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V
    .locals 0

    .prologue
    .line 84
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->j()V

    return-void
.end method

.method private c(Z)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 484
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e:Lcom/roidapp/cloudlib/template/b/c;

    if-eqz v0, :cond_0

    .line 485
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e:Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->a()V

    .line 487
    :cond_0
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 488
    const-string v1, "isFromTemplate"

    invoke-virtual {v0, v1, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 489
    if-eqz p1, :cond_1

    .line 490
    const-string v1, "FaceClip"

    invoke-virtual {p0, v1, v3}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 491
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "needFaceClip"

    invoke-interface {v1, v2, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 496
    :goto_0
    const-string v1, "CartPage_View"

    const-string v2, "Select_Cart"

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 497
    const-class v1, Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 498
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 499
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->finish()V

    .line 500
    return-void

    .line 493
    :cond_1
    const-string v1, "FaceClip"

    invoke-virtual {p0, v1, v3}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v1

    .line 494
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "needFaceClip"

    invoke-interface {v1, v2, v3}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    goto :goto_0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)[Z
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->f:[Z

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/cloudlib/template/b/c;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e:Lcom/roidapp/cloudlib/template/b/c;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/photogrid/cloud/cu;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    return-object v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Lcom/roidapp/photogrid/common/al;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a:Lcom/roidapp/photogrid/common/al;

    return-object v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V
    .locals 1

    .prologue
    .line 84
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c(Z)V

    return-void
.end method

.method static synthetic h(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V
    .locals 4

    .prologue
    .line 5508
    invoke-static {}, Lcom/roidapp/imagelib/b/d;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5509
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    const v1, 0x7f07028d

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 5536
    :goto_0
    return-void

    .line 5512
    :cond_0
    invoke-static {}, Lcom/roidapp/imagelib/b/d;->b()Z

    move-result v0

    if-nez v0, :cond_1

    .line 5513
    invoke-static {p0}, Lcom/roidapp/photogrid/common/y;->a(Landroid/content/Context;)V

    goto :goto_0

    .line 5517
    :cond_1
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.media.action.IMAGE_CAPTURE"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 5518
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v2

    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const v2, 0x7f07002e

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 5519
    new-instance v2, Ljava/io/File;

    invoke-direct {v2, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 5520
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v3

    if-nez v3, :cond_2

    .line 5521
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 5522
    new-instance v2, Ljava/io/File;

    const-string v3, ".camera.jpg"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 5523
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n:Landroid/net/Uri;

    .line 5524
    new-instance v1, Landroid/content/Intent;

    const-string v2, "android.intent.action.MEDIA_SCANNER_SCAN_FILE"

    iget-object v3, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n:Landroid/net/Uri;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, v1}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->sendBroadcast(Landroid/content/Intent;)V

    .line 5531
    :goto_1
    :try_start_0
    const-string v1, "output"

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n:Landroid/net/Uri;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 5532
    const-string v1, "android.intent.extra.videoQuality"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 5533
    const/16 v1, 0x3ea

    invoke-virtual {p0, v0, v1}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->startActivityForResult(Landroid/content/Intent;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 5535
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    goto :goto_0

    .line 5526
    :cond_2
    new-instance v2, Ljava/io/File;

    const-string v3, ".camera.jpg"

    invoke-direct {v2, v1, v3}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 5527
    invoke-static {v2}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n:Landroid/net/Uri;

    goto :goto_1
.end method

.method static synthetic i(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->i:Landroid/widget/ImageView;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/widget/ImageButton;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->j:Landroid/widget/ImageButton;

    return-object v0
.end method

.method private j()V
    .locals 2

    .prologue
    .line 361
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e:Lcom/roidapp/cloudlib/template/b/c;

    if-eqz v0, :cond_0

    .line 362
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e:Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->a()V

    .line 364
    :cond_0
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->d()V

    .line 365
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->a(Lcom/roidapp/cloudlib/template/d;)V

    .line 366
    const/4 v0, 0x0

    sput-boolean v0, Lcom/roidapp/photogrid/common/az;->x:Z

    .line 367
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 368
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 369
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->finish()V

    .line 370
    const-string v0, "MainPage_View"

    const-string v1, "Select_Home"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 371
    return-void
.end method

.method static synthetic k(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->k:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->l:Landroid/widget/RelativeLayout;

    return-object v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)Landroid/widget/RelativeLayout;
    .locals 1

    .prologue
    .line 84
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->m:Landroid/widget/RelativeLayout;

    return-object v0
.end method


# virtual methods
.method public final a()Landroid/support/v4/app/FragmentActivity;
    .locals 0

    .prologue
    .line 727
    return-object p0
.end method

.method public final a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V
    .locals 4

    .prologue
    .line 857
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 881
    :cond_0
    :goto_0
    return-void

    .line 860
    :cond_1
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "unlock_loading"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 861
    if-eqz v0, :cond_2

    .line 862
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 864
    :cond_2
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    .line 865
    invoke-static {}, Lcom/roidapp/cloudlib/ads/s;->c()Z

    move-result v1

    .line 866
    new-instance v2, Lcom/roidapp/cloudlib/template/c/i;

    invoke-direct {v2}, Lcom/roidapp/cloudlib/template/c/i;-><init>()V

    .line 867
    invoke-virtual {v2, p1}, Lcom/roidapp/cloudlib/template/c/i;->a(Lcom/roidapp/cloudlib/template/TemplateInfo;)V

    .line 868
    const/4 v0, 0x0

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/template/c/i;->a(I)V

    .line 869
    if-eqz v1, :cond_3

    const/16 v0, 0xa

    :goto_1
    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/template/c/i;->b(I)V

    .line 870
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v3, "TemplateUnlockDialog"

    invoke-virtual {v2, v0, v3}, Lcom/roidapp/cloudlib/template/c/i;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    .line 872
    if-nez v1, :cond_0

    .line 874
    invoke-virtual {p1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/roidapp/cloudlib/template/j;->c(J)V

    .line 875
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n_()V

    goto :goto_0

    .line 869
    :cond_3
    const/16 v0, 0x1e

    goto :goto_1

    .line 879
    :cond_4
    invoke-static {p0}, Lcom/roidapp/baselib/e/l;->a(Landroid/content/Context;)V

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/cloudlib/template/d;)V
    .locals 5

    .prologue
    const/4 v2, 0x0

    .line 892
    .line 4443
    invoke-static {p1}, Lcom/roidapp/photogrid/common/bd;->a(Lcom/roidapp/cloudlib/template/d;)V

    .line 4444
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/release/ih;->a([Lcom/roidapp/photogrid/release/ig;)V

    .line 5051
    iget-boolean v0, p1, Lcom/roidapp/cloudlib/template/d;->d:Z

    .line 4446
    if-eqz v0, :cond_0

    .line 4447
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    const v1, 0x7f03002b

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v2

    .line 4448
    const v0, 0x7f0d00eb

    invoke-virtual {v2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    .line 4449
    const v1, 0x7f0d00ec

    invoke-virtual {v2, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/TextView;

    .line 4452
    new-instance v3, Landroid/app/AlertDialog$Builder;

    invoke-direct {v3, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    invoke-virtual {v3, v2}, Landroid/app/AlertDialog$Builder;->setView(Landroid/view/View;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    const v4, 0x7f0702d8

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    move-result-object v2

    invoke-virtual {v2}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    move-result-object v2

    .line 4457
    new-instance v3, Lcom/roidapp/photogrid/cloud/cr;

    invoke-direct {v3, p0, v2}, Lcom/roidapp/photogrid/cloud/cr;-><init>(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;Landroid/app/AlertDialog;)V

    .line 4469
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4470
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 4471
    :goto_0
    return-void

    .line 4473
    :cond_0
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c(Z)V

    goto :goto_0
.end method

.method public final a(Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 885
    if-eqz p1, :cond_0

    .line 886
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    .line 888
    :cond_0
    return-void
.end method

.method public final a(Ljava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v5, 0x1

    const/4 v4, 0x2

    const/4 v1, 0x0

    .line 757
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->f:[Z

    aput-boolean v5, v0, v1

    .line 758
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->i()V

    .line 759
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/photogrid/cloud/cu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    if-eqz p1, :cond_0

    .line 760
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/photogrid/cloud/cu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/f;

    const/16 v2, 0x8

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/template/c/f;->b(I)V

    .line 761
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/photogrid/cloud/cu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/f;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/f;->c()Lcom/roidapp/cloudlib/template/a/e;

    move-result-object v2

    .line 762
    if-eqz v2, :cond_0

    .line 763
    invoke-virtual {v2, p1}, Lcom/roidapp/cloudlib/template/a/e;->a(Ljava/util/List;)V

    .line 764
    invoke-virtual {v2}, Lcom/roidapp/cloudlib/template/a/e;->c()V

    .line 765
    const-string v0, "Template_New_Card"

    invoke-virtual {v2, v0}, Lcom/roidapp/cloudlib/template/a/e;->a(Ljava/lang/String;)V

    .line 766
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->q:Lcom/roidapp/photogrid/cloud/aa;

    if-nez v0, :cond_0

    .line 767
    new-instance v0, Lcom/roidapp/photogrid/cloud/aa;

    invoke-direct {v0, p0, v4}, Lcom/roidapp/photogrid/cloud/aa;-><init>(Landroid/content/Context;I)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->q:Lcom/roidapp/photogrid/cloud/aa;

    .line 768
    new-array v0, v4, [Ljava/lang/String;

    const-string v3, "tempSort1"

    aput-object v3, v0, v1

    const-string v3, "tempSort2"

    aput-object v3, v0, v5

    move v0, v1

    :goto_0
    if-ge v0, v4, :cond_0

    .line 770
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->q:Lcom/roidapp/photogrid/cloud/aa;

    new-instance v3, Lcom/roidapp/photogrid/cloud/ac;

    invoke-direct {v3}, Lcom/roidapp/photogrid/cloud/ac;-><init>()V

    invoke-virtual {v1, p0, v3, v2}, Lcom/roidapp/photogrid/cloud/aa;->a(Landroid/content/Context;Lcom/roidapp/photogrid/cloud/ac;Lcom/roidapp/cloudlib/ads/i;)V

    .line 768
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 775
    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 2

    .prologue
    .line 826
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "TemplateUnlockDialog"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/i;

    .line 827
    if-eqz v0, :cond_0

    .line 828
    if-eqz p1, :cond_1

    .line 829
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/i;->a()V

    .line 833
    :cond_0
    :goto_0
    return-void

    .line 831
    :cond_1
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/i;->b()V

    goto :goto_0
.end method

.method public final b()Lcom/roidapp/cloudlib/ah;
    .locals 1

    .prologue
    .line 732
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e:Lcom/roidapp/cloudlib/template/b/c;

    return-object v0
.end method

.method public final b(Ljava/lang/Object;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 837
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->f:[Z

    const/4 v1, 0x1

    aput-boolean v1, v0, v2

    .line 838
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->i()V

    .line 839
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a(Ljava/lang/Object;)V

    .line 840
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/photogrid/cloud/cu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 841
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/photogrid/cloud/cu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/f;

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/template/c/f;->b(I)V

    .line 843
    :cond_0
    return-void
.end method

.method public final b(Ljava/util/List;)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const-wide/16 v10, -0x1

    const/4 v3, 0x0

    const/4 v7, 0x1

    .line 779
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->f:[Z

    aput-boolean v7, v0, v7

    .line 780
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->i()V

    .line 782
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/photogrid/cloud/cu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/f;

    if-eqz v0, :cond_3

    if-eqz p1, :cond_3

    .line 783
    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/c/f;->b(I)V

    .line 784
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/f;->c()Lcom/roidapp/cloudlib/template/a/e;

    move-result-object v2

    .line 785
    if-eqz v2, :cond_3

    .line 786
    invoke-virtual {v2, p1}, Lcom/roidapp/cloudlib/template/a/e;->a(Ljava/util/List;)V

    .line 787
    invoke-virtual {v2}, Lcom/roidapp/cloudlib/template/a/e;->c()V

    .line 789
    const/4 v1, -0x1

    .line 790
    invoke-static {}, Lcom/roidapp/baselib/c/n;->a()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v4

    invoke-static {v4}, Lcom/roidapp/photogrid/a/m;->a(Landroid/content/Context;)I

    move-result v4

    if-eq v4, v7, :cond_5

    invoke-static {}, Lcom/roidapp/baselib/c/aj;->a()Landroid/app/Application;

    move-result-object v4

    invoke-static {v4}, Lcom/roidapp/cloudlib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/cloudlib/a/a;

    move-result-object v4

    const-string v5, "ad"

    const-string v6, "cmlEnable"

    invoke-virtual {v4, v5, v6, v3}, Lcom/roidapp/cloudlib/a/a;->a(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 794
    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->q:Lcom/roidapp/photogrid/cloud/aa;

    if-nez v1, :cond_0

    .line 795
    new-instance v1, Lcom/roidapp/photogrid/cloud/aa;

    invoke-direct {v1, p0, v7}, Lcom/roidapp/photogrid/cloud/aa;-><init>(Landroid/content/Context;I)V

    iput-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->q:Lcom/roidapp/photogrid/cloud/aa;

    .line 797
    :cond_0
    new-instance v1, Lcom/roidapp/cloudlib/ads/j;

    invoke-direct {v1}, Lcom/roidapp/cloudlib/ads/j;-><init>()V

    .line 798
    const-string v4, "Template_CML_Card"

    invoke-virtual {v1, v4}, Lcom/roidapp/cloudlib/ads/j;->a(Ljava/lang/String;)V

    .line 799
    iget-object v4, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->q:Lcom/roidapp/photogrid/cloud/aa;

    invoke-virtual {v1, v4}, Lcom/roidapp/cloudlib/ads/j;->a(Lcom/roidapp/cloudlib/ads/k;)V

    .line 800
    invoke-virtual {v2, v1}, Lcom/roidapp/cloudlib/template/a/e;->a(Lcom/roidapp/cloudlib/ads/j;)I

    move-result v1

    move v2, v1

    .line 802
    :goto_0
    iget-wide v4, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->s:J

    cmp-long v1, v4, v10

    if-eqz v1, :cond_3

    .line 804
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/cloudlib/template/TemplateInfo;

    .line 805
    invoke-virtual {v1}, Lcom/roidapp/cloudlib/template/TemplateInfo;->e()J

    move-result-wide v6

    iget-wide v8, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->s:J

    cmp-long v1, v6, v8

    if-nez v1, :cond_4

    .line 806
    if-ltz v2, :cond_1

    if-lt v3, v2, :cond_1

    .line 807
    const/4 v1, 0x5

    if-eq v3, v1, :cond_1

    .line 808
    add-int/lit8 v3, v3, 0x1

    .line 810
    :cond_1
    invoke-virtual {v0, v3}, Lcom/roidapp/cloudlib/template/c/f;->c(I)V

    .line 815
    :cond_2
    iput-wide v10, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->s:J

    .line 819
    :cond_3
    return-void

    .line 813
    :cond_4
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    .line 814
    goto :goto_1

    :cond_5
    move v2, v1

    goto :goto_0
.end method

.method public final b(Z)V
    .locals 3

    .prologue
    .line 897
    if-eqz p1, :cond_2

    .line 898
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 925
    :cond_0
    :goto_0
    return-void

    .line 899
    :cond_1
    new-instance v0, Lcom/roidapp/photogrid/cloud/cs;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/cs;-><init>(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V

    .line 915
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    const-string v2, "unlock_loading"

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/cloudlib/common/e;->show(Landroid/support/v4/app/FragmentManager;Ljava/lang/String;)V

    goto :goto_0

    .line 5437
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->b:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->b:Landroid/widget/RelativeLayout;

    invoke-virtual {v0}, Landroid/widget/RelativeLayout;->isShown()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5438
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method public final c(Ljava/lang/Object;)V
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 847
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->f:[Z

    aput-boolean v1, v0, v1

    .line 848
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->i()V

    .line 849
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a(Ljava/lang/Object;)V

    .line 850
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/photogrid/cloud/cu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 851
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/photogrid/cloud/cu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/f;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/template/c/f;->b(I)V

    .line 853
    :cond_0
    return-void
.end method

.method public final c(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Lcom/roidapp/cloudlib/template/TemplateInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 822
    return-void
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 929
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 930
    return-void
.end method

.method public final e()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 934
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "TEMPLATE_PERSONAL_TAB"

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 935
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    const/4 v1, 0x2

    invoke-static {v1}, Lcom/roidapp/cloudlib/template/c/f;->a(I)Lcom/roidapp/cloudlib/template/c/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/cu;->b(Lcom/roidapp/cloudlib/template/c/f;)V

    .line 936
    const-string v0, "Template_Personal_Local"

    const/4 v1, 0x4

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    .line 937
    return-void
.end method

.method public final f()V
    .locals 3

    .prologue
    .line 941
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "TEMPLATE_PERSONAL_TAB"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 942
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    const/4 v1, 0x3

    invoke-static {v1}, Lcom/roidapp/cloudlib/template/c/f;->a(I)Lcom/roidapp/cloudlib/template/c/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/cloud/cu;->b(Lcom/roidapp/cloudlib/template/c/f;)V

    .line 943
    const-string v0, "Template_Personal_Favourite"

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    .line 944
    return-void
.end method

.method public final g()V
    .locals 3

    .prologue
    .line 750
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->f:[Z

    const/4 v1, 0x2

    const/4 v2, 0x1

    aput-boolean v2, v0, v1

    .line 751
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->i()V

    .line 752
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n_()V

    .line 753
    return-void
.end method

.method public final i()V
    .locals 2

    .prologue
    .line 428
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->b:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->f:[Z

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    aget-boolean v0, v0, v1

    if-eqz v0, :cond_1

    .line 429
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->b:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 434
    :cond_0
    :goto_0
    return-void

    .line 431
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->b:Landroid/widget/RelativeLayout;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->f:[Z

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v1}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v1

    aget-boolean v0, v0, v1

    if-nez v0, :cond_0

    .line 432
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    goto :goto_0
.end method

.method public final n_()V
    .locals 2

    .prologue
    .line 738
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    if-eqz v0, :cond_1

    .line 740
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/photogrid/cloud/cu;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/cloudlib/template/c/f;

    .line 741
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/f;->c()Lcom/roidapp/cloudlib/template/a/e;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 742
    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/a/e;->c()V

    goto :goto_0

    .line 746
    :cond_1
    return-void
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 542
    const/4 v0, -0x1

    if-eq p2, v0, :cond_0

    .line 568
    :goto_0
    return-void

    .line 544
    :cond_0
    packed-switch p1, :pswitch_data_0

    .line 565
    :goto_1
    invoke-super {p0, p1, p2, p3}, Lcom/roidapp/photogrid/release/ParentActivity;->onActivityResult(IILandroid/content/Intent;)V

    goto :goto_0

    .line 547
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n:Landroid/net/Uri;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->p:Landroid/os/Bundle;

    const-string v1, "PATH"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 548
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->p:Landroid/os/Bundle;

    const-string v1, "PATH"

    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n:Landroid/net/Uri;

    .line 550
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n:Landroid/net/Uri;

    if-nez v0, :cond_2

    .line 551
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getBaseContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    const v2, 0x7f070210

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0

    .line 558
    :cond_2
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/release/FaceDetectorActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 559
    const-string v1, "path"

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n:Landroid/net/Uri;

    invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 560
    const-string v1, "entryFrom"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 561
    const-string v1, "entryType"

    invoke-virtual {v0, v1, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 562
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->startActivity(Landroid/content/Intent;)V

    .line 563
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->finish()V

    goto :goto_1

    .line 544
    :pswitch_data_0
    .packed-switch 0x3ea
        :pswitch_0
    .end packed-switch
.end method

.method public onConfigurationChanged(Landroid/content/res/Configuration;)V
    .locals 0

    .prologue
    .line 580
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onConfigurationChanged(Landroid/content/res/Configuration;)V

    .line 581
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const-wide/16 v6, -0x1

    const/4 v5, 0x2

    const/4 v1, 0x1

    const/4 v4, 0x0

    .line 119
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onCreate(Landroid/os/Bundle;)V

    .line 121
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->b(Landroid/os/Bundle;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 122
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->j()V

    .line 144
    :cond_0
    :goto_0
    return-void

    .line 128
    :cond_1
    const v0, 0x7f03002c

    :try_start_0
    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->setContentView(I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 135
    :goto_1
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->h:Z

    if-nez v0, :cond_0

    .line 136
    new-instance v0, Lcom/roidapp/cloudlib/template/b/c;

    invoke-direct {v0, p0}, Lcom/roidapp/cloudlib/template/b/c;-><init>(Lcom/roidapp/cloudlib/template/b/a;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e:Lcom/roidapp/cloudlib/template/b/c;

    .line 137
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e:Lcom/roidapp/cloudlib/template/b/c;

    const/16 v2, 0x2310

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/template/b/c;->sendEmptyMessage(I)Z

    .line 138
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e:Lcom/roidapp/cloudlib/template/b/c;

    const/16 v2, 0x2312

    invoke-virtual {v0, v2}, Lcom/roidapp/cloudlib/template/b/c;->sendEmptyMessage(I)Z

    .line 1213
    const v0, 0x7f0d00f4

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/view/ViewPager;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    .line 1214
    const v0, 0x7f0d040d

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->b:Landroid/widget/RelativeLayout;

    .line 1215
    const v0, 0x7f0d00f2

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->i:Landroid/widget/ImageView;

    .line 1217
    const v0, 0x7f0d00f3

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->k:Landroid/widget/RelativeLayout;

    .line 1218
    const v0, 0x7f0d00ee

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->l:Landroid/widget/RelativeLayout;

    .line 1219
    const v0, 0x7f0d00f0

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RelativeLayout;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->m:Landroid/widget/RelativeLayout;

    .line 1220
    const v0, 0x7f0d008c

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->j:Landroid/widget/ImageButton;

    .line 1224
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    if-eqz v0, :cond_2

    .line 1225
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    const-string v2, "cmlTid"

    invoke-virtual {v0, v2, v6, v7}, Landroid/content/Intent;->getLongExtra(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->s:J

    .line 1227
    :cond_2
    new-instance v0, Lcom/roidapp/photogrid/cloud/cu;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/cu;-><init>(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    .line 1228
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-virtual {v0, v2}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 1229
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v5}, Landroid/support/v4/view/ViewPager;->setOffscreenPageLimit(I)V

    .line 1231
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 1235
    const-string v2, "template_new"

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "TEMPLATE_STUFF_NEW"

    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 1236
    :cond_3
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->i:Landroid/widget/ImageView;

    invoke-virtual {v2, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1239
    :cond_4
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v4}, Lcom/roidapp/cloudlib/template/c/f;->a(I)Lcom/roidapp/cloudlib/template/c/f;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/cloudlib/template/c/f;)V

    .line 1240
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v1}, Lcom/roidapp/cloudlib/template/c/f;->a(I)Lcom/roidapp/cloudlib/template/c/f;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/cloudlib/template/c/f;)V

    .line 1241
    const-string v2, "TEMPLATE_PERSONAL_TAB"

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v2

    if-nez v2, :cond_6

    .line 1242
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    invoke-static {v5}, Lcom/roidapp/cloudlib/template/c/f;->a(I)Lcom/roidapp/cloudlib/template/c/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/cloudlib/template/c/f;)V

    .line 1248
    :cond_5
    :goto_2
    new-instance v0, Lcom/roidapp/photogrid/cloud/cq;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/cloud/cq;-><init>(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V

    .line 1309
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1310
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1311
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v2, v0}, Landroid/widget/RelativeLayout;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1312
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->j:Landroid/widget/ImageButton;

    invoke-virtual {v2, v0}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1313
    const v2, 0x7f0d00e8

    invoke-virtual {p0, v2}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1316
    iget-wide v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->s:J

    cmp-long v0, v2, v6

    if-nez v0, :cond_7

    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v2, "TEMPLATE_TAB"

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    .line 1319
    :goto_3
    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2, v0}, Landroid/support/v4/view/ViewPager;->setCurrentItem(I)V

    .line 1320
    packed-switch v0, :pswitch_data_0

    .line 2194
    :goto_4
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {p0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_a

    .line 2195
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/roidapp/baselib/gl/c;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    .line 2196
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 2197
    const-string v0, "TemplateSelectorActivity/testGPU"

    invoke-static {v0}, Lcom/roidapp/photogrid/common/b;->a(Ljava/lang/String;)V

    .line 2198
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->o:Lcom/roidapp/photogrid/cloud/ct;

    const v0, 0x1020002

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v1, p0, v0}, Lcom/roidapp/baselib/gl/c;->a(Landroid/os/Handler;Landroid/content/Context;Landroid/view/ViewGroup;)V

    .line 3374
    :goto_5
    const-string v0, "DebugMode"

    invoke-virtual {p0, v0, v4}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object v0

    .line 3375
    const-string v1, "DebugMode"

    invoke-interface {v0, v1, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    .line 2379
    if-eqz v0, :cond_0

    .line 2380
    new-instance v0, Lcom/roidapp/photogrid/common/al;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->o:Lcom/roidapp/photogrid/cloud/ct;

    invoke-direct {v0, p0, v1}, Lcom/roidapp/photogrid/common/al;-><init>(Landroid/app/Activity;Landroid/os/Handler;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a:Lcom/roidapp/photogrid/common/al;

    .line 2381
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->a:Lcom/roidapp/photogrid/common/al;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->b()V

    .line 2382
    invoke-static {}, Lcom/roidapp/photogrid/common/ba;->a()Lcom/roidapp/photogrid/common/ba;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/ba;->b()V

    goto/16 :goto_0

    .line 130
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    .line 131
    iput-boolean v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->h:Z

    .line 132
    new-instance v0, Lcom/roidapp/photogrid/common/cc;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/common/cc;-><init>(Landroid/content/Context;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/cc;->a()V

    goto/16 :goto_1

    .line 1244
    :cond_6
    const-string v2, "TEMPLATE_PERSONAL_TAB"

    invoke-interface {v0, v2, v4}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v0

    if-ne v0, v1, :cond_5

    .line 1245
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    const/4 v2, 0x3

    invoke-static {v2}, Lcom/roidapp/cloudlib/template/c/f;->a(I)Lcom/roidapp/cloudlib/template/c/f;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/cloud/cu;->a(Lcom/roidapp/cloudlib/template/c/f;)V

    goto/16 :goto_2

    :cond_7
    move v0, v1

    .line 1316
    goto :goto_3

    .line 1322
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->m:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    goto :goto_4

    .line 1325
    :pswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->l:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    goto/16 :goto_4

    .line 1328
    :pswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->k:Landroid/widget/RelativeLayout;

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setSelected(Z)V

    goto/16 :goto_4

    .line 2200
    :cond_8
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    invoke-static {p0}, Lcom/roidapp/baselib/gl/c;->b(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 2202
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/gl/c;->a(Z)V

    goto :goto_5

    .line 2204
    :cond_9
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/roidapp/baselib/gl/c;->a(Z)V

    goto :goto_5

    .line 2208
    :cond_a
    invoke-static {}, Lcom/roidapp/baselib/gl/c;->a()Lcom/roidapp/baselib/gl/c;

    move-result-object v0

    invoke-virtual {v0, v4}, Lcom/roidapp/baselib/gl/c;->a(Z)V

    goto :goto_5

    .line 1320
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public onDestroy()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 172
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    if-eqz v0, :cond_0

    .line 173
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "TEMPLATE_TAB"

    iget-object v2, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v2}, Landroid/support/v4/view/ViewPager;->getCurrentItem()I

    move-result v2

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 175
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0}, Landroid/support/v4/view/ViewPager;->removeAllViews()V

    .line 176
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->c:Landroid/support/v4/view/ViewPager;

    invoke-virtual {v0, v3}, Landroid/support/v4/view/ViewPager;->setAdapter(Landroid/support/v4/view/PagerAdapter;)V

    .line 178
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e:Lcom/roidapp/cloudlib/template/b/c;

    if-eqz v0, :cond_1

    .line 179
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->e:Lcom/roidapp/cloudlib/template/b/c;

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->a()V

    .line 181
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->q:Lcom/roidapp/photogrid/cloud/aa;

    if-eqz v0, :cond_2

    .line 182
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->q:Lcom/roidapp/photogrid/cloud/aa;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/aa;->a()V

    .line 184
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->r:Lcom/roidapp/photogrid/cloud/aa;

    if-eqz v0, :cond_3

    .line 185
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->r:Lcom/roidapp/photogrid/cloud/aa;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/cloud/aa;->a()V

    .line 187
    :cond_3
    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->d:Lcom/roidapp/photogrid/cloud/cu;

    .line 188
    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->r:Lcom/roidapp/photogrid/cloud/aa;

    iput-object v3, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->q:Lcom/roidapp/photogrid/cloud/aa;

    .line 189
    invoke-static {}, Lcom/roidapp/cloudlib/template/j;->c()V

    .line 190
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onDestroy()V

    .line 191
    return-void
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 354
    iget-boolean v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    invoke-virtual {p2}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-nez v0, :cond_0

    .line 355
    invoke-direct {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->j()V

    .line 357
    :cond_0
    const/4 v0, 0x1

    return v0
.end method

.method public onPause()V
    .locals 2

    .prologue
    .line 160
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->h()Z

    move-result v0

    if-nez v0, :cond_0

    .line 162
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v0

    const-string v1, "unlock_loading"

    invoke-virtual {v0, v1}, Landroid/support/v4/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroid/support/v4/app/Fragment;

    move-result-object v0

    .line 163
    if-eqz v0, :cond_0

    .line 164
    invoke-virtual {p0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->getSupportFragmentManager()Landroid/support/v4/app/FragmentManager;

    move-result-object v1

    invoke-virtual {v1}, Landroid/support/v4/app/FragmentManager;->beginTransaction()Landroid/support/v4/app/FragmentTransaction;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/support/v4/app/FragmentTransaction;->remove(Landroid/support/v4/app/Fragment;)Landroid/support/v4/app/FragmentTransaction;

    move-result-object v0

    invoke-virtual {v0}, Landroid/support/v4/app/FragmentTransaction;->commit()I

    .line 166
    :cond_0
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onPause()V

    .line 167
    return-void
.end method

.method protected onRestoreInstanceState(Landroid/os/Bundle;)V
    .locals 0

    .prologue
    .line 348
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onRestoreInstanceState(Landroid/os/Bundle;)V

    .line 349
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->p:Landroid/os/Bundle;

    .line 350
    return-void
.end method

.method protected onResume()V
    .locals 1

    .prologue
    .line 154
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->g:Z

    .line 155
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onResume()V

    .line 156
    return-void
.end method

.method protected onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 340
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n:Landroid/net/Uri;

    if-eqz v0, :cond_0

    .line 341
    const-string v0, "PATH"

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->n:Landroid/net/Uri;

    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 342
    :cond_0
    invoke-super {p0, p1}, Lcom/roidapp/photogrid/release/ParentActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 343
    invoke-static {p1}, Lcom/roidapp/photogrid/common/an;->a(Landroid/os/Bundle;)V

    .line 344
    return-void
.end method

.method protected onStart()V
    .locals 1

    .prologue
    .line 148
    const-string v0, "TemplateSellectorActivity"

    invoke-static {v0}, Lcom/roidapp/baselib/c/b;->d(Ljava/lang/String;)V

    .line 149
    invoke-super {p0}, Lcom/roidapp/photogrid/release/ParentActivity;->onStart()V

    .line 150
    return-void
.end method

.method public final x()V
    .locals 1

    .prologue
    .line 335
    const-string v0, "template"

    iput-object v0, p0, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->t:Ljava/lang/String;

    .line 336
    return-void
.end method
