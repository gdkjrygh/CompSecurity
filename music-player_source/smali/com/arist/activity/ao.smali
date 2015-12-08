.class final Lcom/arist/activity/ao;
.super Ljava/lang/Thread;


# instance fields
.field final synthetic a:Lcom/arist/activity/WelcomeActivity;


# direct methods
.method constructor <init>(Lcom/arist/activity/WelcomeActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/arist/activity/ao;->a:Lcom/arist/activity/WelcomeActivity;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    new-instance v0, Lcom/arist/model/a/a;

    invoke-direct {v0}, Lcom/arist/model/a/a;-><init>()V

    iget-object v0, p0, Lcom/arist/activity/ao;->a:Lcom/arist/activity/WelcomeActivity;

    invoke-virtual {v0}, Lcom/arist/activity/WelcomeActivity;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/arist/model/a/a;->a(Landroid/content/Context;)I

    iget-object v0, p0, Lcom/arist/activity/ao;->a:Lcom/arist/activity/WelcomeActivity;

    new-instance v1, Landroid/content/Intent;

    sget-object v2, Lcom/arist/c/a;->k:Ljava/lang/String;

    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lcom/arist/activity/WelcomeActivity;->sendBroadcast(Landroid/content/Intent;)V

    const/4 v0, 0x1

    sput-boolean v0, Lcom/arist/activity/MyApplication;->s:Z

    iget-object v0, p0, Lcom/arist/activity/ao;->a:Lcom/arist/activity/WelcomeActivity;

    invoke-static {v0}, Lcom/arist/activity/WelcomeActivity;->b(Lcom/arist/activity/WelcomeActivity;)Landroid/os/Handler;

    move-result-object v0

    const/4 v1, 0x0

    const-wide/16 v2, 0x7d0

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    return-void
.end method
