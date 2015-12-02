.class public Lcom/facebook/orca/intents/ShareLauncherActivity;
.super Lcom/facebook/base/activity/i;
.source "ShareLauncherActivity.java"

# interfaces
.implements Lcom/facebook/analytics/d;


# instance fields
.field private p:Lcom/facebook/orca/threadlist/m;

.field private q:Lcom/facebook/orca/threadview/do;

.field private r:Landroid/content/ComponentName;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0}, Lcom/facebook/base/activity/i;-><init>()V

    return-void
.end method

.method static synthetic a(Lcom/facebook/orca/intents/ShareLauncherActivity;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 29
    invoke-direct {p0, p1}, Lcom/facebook/orca/intents/ShareLauncherActivity;->b(Ljava/lang/String;)V

    return-void
.end method

.method private b(Landroid/content/Intent;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 99
    const-string v0, "android.intent.extra.TEXT"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private b(Ljava/lang/String;)V
    .locals 6

    .prologue
    const/4 v5, 0x1

    .line 64
    invoke-virtual {p0}, Lcom/facebook/orca/intents/ShareLauncherActivity;->getIntent()Landroid/content/Intent;

    move-result-object v2

    .line 65
    invoke-virtual {v2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v3

    .line 66
    invoke-direct {p0, v2}, Lcom/facebook/orca/intents/ShareLauncherActivity;->b(Landroid/content/Intent;)Ljava/lang/String;

    move-result-object v4

    .line 69
    sget-object v0, Lcom/facebook/orca/threadlist/m;->a:Ljava/lang/String;

    if-ne p1, v0, :cond_2

    .line 70
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/facebook/orca/creation/CreateThreadActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    move-object v1, v0

    .line 78
    :goto_0
    const-string v0, "show_composer"

    invoke-virtual {v1, v0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 79
    if-eqz v4, :cond_0

    .line 80
    const-string v0, "composer_initial_text"

    invoke-virtual {v1, v0, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 82
    :cond_0
    const-string v0, "android.intent.action.SEND"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 83
    const-string v0, "android.intent.extra.STREAM"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v0

    check-cast v0, Landroid/net/Uri;

    .line 84
    if-eqz v0, :cond_1

    .line 85
    new-array v2, v5, [Landroid/net/Uri;

    const/4 v3, 0x0

    aput-object v0, v2, v3

    invoke-static {v2}, Lcom/google/common/a/hq;->a([Ljava/lang/Object;)Ljava/util/ArrayList;

    move-result-object v0

    .line 86
    const-string v2, "composer_photo_uri_list"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 94
    :cond_1
    :goto_1
    invoke-virtual {p0, v1}, Lcom/facebook/orca/intents/ShareLauncherActivity;->startActivity(Landroid/content/Intent;)V

    .line 95
    invoke-virtual {p0}, Lcom/facebook/orca/intents/ShareLauncherActivity;->finish()V

    .line 96
    return-void

    .line 71
    :cond_2
    if-nez p1, :cond_3

    .line 72
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    .line 73
    iget-object v1, p0, Lcom/facebook/orca/intents/ShareLauncherActivity;->r:Landroid/content/ComponentName;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    move-object v1, v0

    goto :goto_0

    .line 75
    :cond_3
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/facebook/orca/threadview/ThreadViewActivity;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 76
    const-string v1, "thread_id"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-object v1, v0

    goto :goto_0

    .line 88
    :cond_4
    const-string v0, "android.intent.action.SEND_MULTIPLE"

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 89
    const-string v0, "android.intent.extra.STREAM"

    invoke-virtual {v2, v0}, Landroid/content/Intent;->getParcelableArrayListExtra(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    .line 90
    if-eqz v0, :cond_1

    .line 91
    const-string v2, "composer_photo_uri_list"

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    goto :goto_1
.end method


# virtual methods
.method public b(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    .line 41
    invoke-super {p0, p1}, Lcom/facebook/base/activity/i;->b(Landroid/os/Bundle;)V

    .line 43
    sget v0, Lcom/facebook/k;->orca_share_launcher:I

    invoke-virtual {p0, v0}, Lcom/facebook/orca/intents/ShareLauncherActivity;->setContentView(I)V

    .line 45
    invoke-static {p0}, Lcom/facebook/widget/titlebar/c;->a(Landroid/app/Activity;)Z

    .line 47
    invoke-virtual {p0}, Lcom/facebook/orca/intents/ShareLauncherActivity;->i()Lcom/facebook/inject/t;

    move-result-object v1

    .line 48
    const-class v0, Lcom/facebook/orca/threadlist/m;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadlist/m;

    iput-object v0, p0, Lcom/facebook/orca/intents/ShareLauncherActivity;->p:Lcom/facebook/orca/threadlist/m;

    .line 49
    const-class v0, Lcom/facebook/orca/threadview/do;

    invoke-virtual {v1, v0}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/threadview/do;

    iput-object v0, p0, Lcom/facebook/orca/intents/ShareLauncherActivity;->q:Lcom/facebook/orca/threadview/do;

    .line 50
    const-class v0, Landroid/content/ComponentName;

    const-class v2, Lcom/facebook/orca/threadlist/ForThreadListActivity;

    invoke-virtual {v1, v0, v2}, Lcom/facebook/inject/t;->a(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ComponentName;

    iput-object v0, p0, Lcom/facebook/orca/intents/ShareLauncherActivity;->r:Landroid/content/ComponentName;

    .line 52
    iget-object v0, p0, Lcom/facebook/orca/intents/ShareLauncherActivity;->p:Lcom/facebook/orca/threadlist/m;

    sget v1, Lcom/facebook/o;->sharing_dialog_title:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/intents/ShareLauncherActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/m;->a(Ljava/lang/String;)V

    .line 53
    iget-object v0, p0, Lcom/facebook/orca/intents/ShareLauncherActivity;->p:Lcom/facebook/orca/threadlist/m;

    sget v1, Lcom/facebook/o;->sharing_new_thread_list_item:I

    invoke-virtual {p0, v1}, Lcom/facebook/orca/intents/ShareLauncherActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/m;->b(Ljava/lang/String;)V

    .line 54
    iget-object v0, p0, Lcom/facebook/orca/intents/ShareLauncherActivity;->p:Lcom/facebook/orca/threadlist/m;

    new-instance v1, Lcom/facebook/orca/intents/g;

    invoke-direct {v1, p0}, Lcom/facebook/orca/intents/g;-><init>(Lcom/facebook/orca/intents/ShareLauncherActivity;)V

    invoke-virtual {v0, v1}, Lcom/facebook/orca/threadlist/m;->a(Lcom/facebook/orca/threadlist/p;)V

    .line 60
    iget-object v0, p0, Lcom/facebook/orca/intents/ShareLauncherActivity;->p:Lcom/facebook/orca/threadlist/m;

    invoke-virtual {v0}, Lcom/facebook/orca/threadlist/m;->show()V

    .line 61
    return-void
.end method

.method public g_()Lcom/facebook/analytics/f/a;
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/facebook/analytics/f/a;->SHARE_LAUNCHER_ACTIVITY_NAME:Lcom/facebook/analytics/f/a;

    return-object v0
.end method
