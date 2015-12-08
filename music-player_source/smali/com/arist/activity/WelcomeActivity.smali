.class public Lcom/arist/activity/WelcomeActivity;
.super Lcom/arist/activity/base/BaseActivity;


# instance fields
.field private a:Landroid/os/Handler;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/arist/activity/base/BaseActivity;-><init>()V

    new-instance v0, Lcom/arist/activity/am;

    invoke-direct {v0, p0}, Lcom/arist/activity/am;-><init>(Lcom/arist/activity/WelcomeActivity;)V

    iput-object v0, p0, Lcom/arist/activity/WelcomeActivity;->a:Landroid/os/Handler;

    return-void
.end method

.method static synthetic a(Lcom/arist/activity/WelcomeActivity;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/arist/activity/MainActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/WelcomeActivity;->startActivity(Landroid/content/Intent;)V

    const v0, 0x7f04000e

    const/4 v1, 0x0

    invoke-virtual {p0, v0, v1}, Lcom/arist/activity/WelcomeActivity;->overridePendingTransition(II)V

    invoke-virtual {p0}, Lcom/arist/activity/WelcomeActivity;->finish()V

    return-void
.end method

.method static synthetic b(Lcom/arist/activity/WelcomeActivity;)Landroid/os/Handler;
    .locals 1

    iget-object v0, p0, Lcom/arist/activity/WelcomeActivity;->a:Landroid/os/Handler;

    return-object v0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 5

    const/4 v4, 0x0

    invoke-super {p0, p1}, Lcom/arist/activity/base/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    const v0, 0x7f030044

    invoke-virtual {p0, v0}, Lcom/arist/activity/WelcomeActivity;->setContentView(I)V

    const-string v0, "WelcomActivity"

    const-string v1, "onCreate()"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {}, Lcom/ijoysoft/a/a;->a()Lcom/ijoysoft/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/ijoysoft/a/a;->b()V

    invoke-static {}, Lcom/ijoysoft/a/a;->a()Lcom/ijoysoft/a/a;

    move-result-object v0

    invoke-virtual {v0, p0, v4}, Lcom/ijoysoft/a/a;->a(Landroid/app/Activity;Z)V

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    const-class v2, Lcom/arist/service/MusicPlayService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const-string v1, "from"

    const-string v2, "WelcomeActivity"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0, v0}, Lcom/arist/activity/WelcomeActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    sget-boolean v0, Lcom/arist/activity/MyApplication;->r:Z

    if-eqz v0, :cond_0

    const-string v0, "WelcomeActivity"

    const-string v1, "\u5f00\u542f\u684c\u9762\u6b4c\u8bcd"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    new-instance v0, Landroid/content/Intent;

    sget-object v1, Lcom/arist/activity/MyApplication;->q:Landroid/content/Context;

    const-class v2, Lcom/arist/service/DeskLrcService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/arist/activity/WelcomeActivity;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    :cond_0
    sget-boolean v0, Lcom/arist/activity/MyApplication;->s:Z

    if-nez v0, :cond_1

    new-instance v0, Lcom/arist/activity/ao;

    invoke-direct {v0, p0}, Lcom/arist/activity/ao;-><init>(Lcom/arist/activity/WelcomeActivity;)V

    invoke-virtual {v0}, Lcom/arist/activity/ao;->start()V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/arist/activity/WelcomeActivity;->a:Landroid/os/Handler;

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v4, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    goto :goto_0
.end method
