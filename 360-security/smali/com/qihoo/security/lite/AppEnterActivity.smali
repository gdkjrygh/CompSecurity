.class public Lcom/qihoo/security/lite/AppEnterActivity;
.super Lcom/qihoo/security/app/BaseActivity;
.source "360Security"


# static fields
.field private static final z:Ljava/lang/String;


# instance fields
.field private A:Landroid/content/Context;

.field private B:Landroid/content/Intent;

.field private C:I

.field private final D:Landroid/os/Handler;

.field y:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 39
    const-class v0, Lcom/qihoo/security/lite/AppEnterActivity;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo/security/lite/AppEnterActivity;->z:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/qihoo/security/app/BaseActivity;-><init>()V

    .line 69
    const-wide/16 v0, 0x320

    iput-wide v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->y:J

    .line 302
    new-instance v0, Lcom/qihoo/security/lite/AppEnterActivity$2;

    invoke-direct {v0, p0}, Lcom/qihoo/security/lite/AppEnterActivity$2;-><init>(Lcom/qihoo/security/lite/AppEnterActivity;)V

    iput-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->D:Landroid/os/Handler;

    return-void
.end method

.method private a(J)V
    .locals 3

    .prologue
    .line 151
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->D:Landroid/os/Handler;

    new-instance v1, Lcom/qihoo/security/lite/AppEnterActivity$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/lite/AppEnterActivity$1;-><init>(Lcom/qihoo/security/lite/AppEnterActivity;)V

    invoke-virtual {v0, v1, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 157
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/lite/AppEnterActivity;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->p()V

    return-void
.end method

.method static synthetic b(Lcom/qihoo/security/lite/AppEnterActivity;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->r()V

    return-void
.end method

.method static synthetic c(Lcom/qihoo/security/lite/AppEnterActivity;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->s()V

    return-void
.end method

.method static synthetic d(Lcom/qihoo/security/lite/AppEnterActivity;)Landroid/content/Context;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    return-object v0
.end method

.method static synthetic e(Lcom/qihoo/security/lite/AppEnterActivity;)Landroid/content/Intent;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    return-object v0
.end method

.method private o()V
    .locals 4

    .prologue
    .line 135
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "key_app_version"

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/c;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 137
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "key_notice_language_upgrade_show_times"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V

    .line 139
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "key_notice_language_upgrade_time"

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 141
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "key_app_version"

    invoke-static {v0, v1}, Lcom/qihoo/security/locale/c;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 143
    :cond_0
    return-void
.end method

.method private p()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    .line 160
    invoke-static {}, Lcom/qihoo/security/a;->c()V

    .line 162
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    iput-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    .line 163
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    const/high16 v1, 0x20000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 166
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "license"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    .line 167
    if-eqz v0, :cond_0

    .line 171
    iget-object v1, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->c(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 172
    invoke-static {}, Lcom/qihoo/security/v5/UpdateService;->a()V

    .line 181
    :cond_0
    :goto_0
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/r;->a()V

    .line 182
    if-nez v0, :cond_1

    .line 183
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/r;->c(Landroid/content/Context;)Z

    move-result v0

    .line 198
    if-eqz v0, :cond_3

    .line 199
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->D:Landroid/os/Handler;

    const/4 v1, 0x1

    const-wide/16 v2, 0x320

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 245
    :goto_1
    return-void

    .line 175
    :cond_2
    iget-object v1, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo360/mobilesafe/b/a;->f(Landroid/content/Context;)V

    goto :goto_0

    .line 203
    :cond_3
    iget v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->C:I

    packed-switch v0, :pswitch_data_0

    .line 242
    :pswitch_0
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->D:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/qihoo/security/lite/AppEnterActivity;->y:J

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1

    .line 208
    :pswitch_1
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->D:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/qihoo/security/lite/AppEnterActivity;->y:J

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1

    .line 212
    :pswitch_2
    invoke-direct {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->t()V

    goto :goto_1

    .line 216
    :pswitch_3
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->D:Landroid/os/Handler;

    iget-wide v2, p0, Lcom/qihoo/security/lite/AppEnterActivity;->y:J

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_1

    .line 219
    :pswitch_4
    invoke-direct {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->u()V

    goto :goto_1

    .line 229
    :pswitch_5
    invoke-direct {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->v()V

    goto :goto_1

    .line 203
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_2
        :pswitch_4
        :pswitch_0
        :pswitch_0
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_3
    .end packed-switch
.end method

.method private q()V
    .locals 4

    .prologue
    const v3, 0x7f030093

    const/4 v2, 0x0

    .line 251
    invoke-virtual {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    .line 252
    const-string/jumbo v1, "from"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/b/h;->a(Landroid/content/Intent;Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->C:I

    .line 257
    iget v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->C:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->C:I

    const/4 v1, 0x3

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->C:I

    const/4 v1, 0x5

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->C:I

    const/16 v1, 0x8

    if-eq v0, v1, :cond_0

    iget v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->C:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_1

    .line 264
    :cond_0
    invoke-virtual {p0, v2}, Lcom/qihoo/security/lite/AppEnterActivity;->setVisible(Z)V

    .line 266
    const-wide/16 v0, 0x0

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/lite/AppEnterActivity;->a(J)V

    .line 287
    :goto_0
    return-void

    .line 268
    :cond_1
    invoke-static {}, Lcom/qihoo/security/ui/b/a;->a()Lcom/qihoo/security/ui/b/a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/qihoo/security/ui/b/a;->b(I)Lcom/qihoo/security/ui/b/a$f;

    move-result-object v0

    .line 270
    if-nez v0, :cond_2

    .line 271
    invoke-virtual {p0, v3}, Lcom/qihoo/security/lite/AppEnterActivity;->setContentView(I)V

    .line 280
    :goto_1
    const-wide/16 v0, 0x320

    iput-wide v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->y:J

    .line 281
    const v0, 0x7f0b01de

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/AppEnterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 282
    const v0, 0x7f0b01e1

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/AppEnterActivity;->findViewById(I)Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 285
    const-wide/16 v0, 0x12c

    invoke-direct {p0, v0, v1}, Lcom/qihoo/security/lite/AppEnterActivity;->a(J)V

    goto :goto_0

    .line 276
    :cond_2
    iget-object v0, v0, Lcom/qihoo/security/ui/b/a$f;->b:Landroid/view/View;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/AppEnterActivity;->setContentView(Landroid/view/View;)V

    goto :goto_1
.end method

.method private r()V
    .locals 3

    .prologue
    .line 328
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/lite/LicenseActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 329
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/AppEnterActivity;->startActivity(Landroid/content/Intent;)V

    .line 330
    invoke-virtual {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->finish()V

    .line 331
    const v0, 0x10a0002

    const v1, 0x10a0003

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/lite/AppEnterActivity;->overridePendingTransition(II)V

    .line 332
    return-void
.end method

.method private s()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 340
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "user_ex"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 341
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "license"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 345
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->f(Landroid/content/Context;)V

    .line 349
    :try_start_0
    invoke-virtual {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    invoke-virtual {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v0

    .line 350
    invoke-static {}, Lcom/qihoo/security/SecurityApplication;->a()Landroid/content/Context;

    move-result-object v1

    const-string/jumbo v2, "guide_ver"

    iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I

    invoke-static {v1, v2, v0}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 357
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    invoke-static {}, Lcom/qihoo360/mobilesafe/b/r;->b()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 358
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/AppEnterActivity;->startActivity(Landroid/content/Intent;)V

    .line 359
    invoke-virtual {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->finish()V

    .line 360
    const/high16 v0, 0x10a0000

    const v1, 0x10a0001

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/lite/AppEnterActivity;->overridePendingTransition(II)V

    .line 368
    return-void

    .line 352
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method private t()V
    .locals 3

    .prologue
    .line 386
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/settings/SettingsActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 387
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/AppEnterActivity;->startActivity(Landroid/content/Intent;)V

    .line 388
    invoke-virtual {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->finish()V

    .line 391
    return-void
.end method

.method private u()V
    .locals 3

    .prologue
    .line 398
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    const-string/jumbo v1, "from"

    const/4 v2, 0x3

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 399
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/ui/settings/LocaleSettingActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 400
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/AppEnterActivity;->startActivity(Landroid/content/Intent;)V

    .line 401
    invoke-virtual {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->finish()V

    .line 402
    const v0, 0x10a0002

    const v1, 0x10a0003

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/lite/AppEnterActivity;->overridePendingTransition(II)V

    .line 403
    return-void
.end method

.method private v()V
    .locals 4

    .prologue
    .line 409
    new-instance v0, Lcom/qihoo360/common/utils/FeatureConfigUtils;

    iget-object v1, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    invoke-direct {v0, v1}, Lcom/qihoo360/common/utils/FeatureConfigUtils;-><init>(Landroid/content/Context;)V

    .line 410
    iget-object v1, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    invoke-static {v1}, Lcom/qihoo/security/env/a;->a(Landroid/content/Context;)I

    move-result v1

    .line 411
    invoke-virtual {v0, v1}, Lcom/qihoo360/common/utils/FeatureConfigUtils;->isUsingGooglePlay(I)Z

    move-result v0

    .line 412
    if-eqz v0, :cond_0

    .line 413
    const/16 v0, 0x6591

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 414
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    const-string/jumbo v1, "from"

    const/4 v2, 0x6

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 415
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-class v2, Lcom/qihoo/security/appbox/ui/AppBoxActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 416
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->B:Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/qihoo/security/lite/AppEnterActivity;->startActivity(Landroid/content/Intent;)V

    .line 417
    invoke-virtual {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->finish()V

    .line 418
    const v0, 0x10a0002

    const v1, 0x10a0003

    invoke-virtual {p0, v0, v1}, Lcom/qihoo/security/lite/AppEnterActivity;->overridePendingTransition(II)V

    .line 422
    :goto_0
    return-void

    .line 420
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->D:Landroid/os/Handler;

    const/4 v1, 0x2

    const-wide/16 v2, 0x320

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0
.end method


# virtual methods
.method protected i()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    const-string/jumbo v0, "appe"

    return-object v0
.end method

.method public onAttachedToWindow()V
    .locals 1

    .prologue
    .line 291
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onAttachedToWindow()V

    .line 295
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Landroid/content/Context;)V

    .line 296
    return-void
.end method

.method public onBackPressed()V
    .locals 0

    .prologue
    .line 325
    return-void
.end method

.method protected onCreate(Landroid/os/Bundle;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x0

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 73
    invoke-super {p0, p1}, Lcom/qihoo/security/app/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 77
    invoke-virtual {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    .line 79
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "current_app_start_time"

    invoke-static {v0, v1, v6, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;J)J

    move-result-wide v0

    .line 80
    cmp-long v2, v0, v6

    if-nez v2, :cond_0

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "the_last_start_app_time"

    invoke-static {v0, v1, v6, v7}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 85
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "current_app_start_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 87
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "the_first_start_app_condition"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    .line 88
    if-nez v0, :cond_1

    .line 89
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "the_first_start_app"

    invoke-static {v0, v1, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 90
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "the_first_start_app_condition"

    invoke-static {v0, v1, v5}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 102
    :goto_1
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "skfutv"

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 104
    if-eqz v0, :cond_2

    .line 105
    const-string/jumbo v1, "1.0.8.3742"

    invoke-static {v0, v1}, Lcom/qihoo360/common/utils/Utils;->compareVersion(Ljava/lang/String;Ljava/lang/String;)I

    move-result v0

    if-lez v0, :cond_2

    .line 106
    new-instance v0, Ljava/io/File;

    invoke-virtual {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->getFilesDir()Ljava/io/File;

    move-result-object v1

    const-string/jumbo v2, "v5/saved/info"

    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/r;->a(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 108
    if-eqz v0, :cond_2

    .line 109
    const-string/jumbo v1, "1"

    const-string/jumbo v2, "force"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    .line 110
    if-eqz v1, :cond_2

    .line 111
    const-string/jumbo v1, "uiforce"

    invoke-virtual {v0, v1, v5}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 112
    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-class v3, Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 113
    const/high16 v2, 0x10000000

    invoke-virtual {v1, v2}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 114
    invoke-virtual {v1, v0}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;

    .line 115
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 116
    invoke-virtual {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->finish()V

    .line 130
    :goto_2
    return-void

    .line 83
    :cond_0
    iget-object v2, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v3, "the_last_start_app_time"

    invoke-static {v2, v3, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    goto/16 :goto_0

    .line 92
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    const-string/jumbo v1, "the_first_start_app"

    invoke-static {v0, v1, v4}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    goto :goto_1

    .line 123
    :cond_2
    invoke-direct {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->q()V

    .line 125
    invoke-direct {p0}, Lcom/qihoo/security/lite/AppEnterActivity;->o()V

    .line 127
    iget-object v0, p0, Lcom/qihoo/security/lite/AppEnterActivity;->A:Landroid/content/Context;

    invoke-static {v0, v4}, Lcom/qihoo/utils/notice/c;->a(Landroid/content/Context;Z)V

    goto :goto_2
.end method

.method protected onDestroy()V
    .locals 0

    .prologue
    .line 426
    invoke-super {p0}, Lcom/qihoo/security/app/BaseActivity;->onDestroy()V

    .line 431
    return-void
.end method
