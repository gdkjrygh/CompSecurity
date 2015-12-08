.class public Lcom/roidapp/photogrid/FacebookMessengerActivity;
.super Landroid/app/Activity;
.source "SourceFile"


# static fields
.field public static a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

.field public static b:Z


# instance fields
.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Landroid/app/Activity;-><init>()V

    return-void
.end method

.method public static a(Landroid/app/Activity;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 81
    sget-object v1, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

    if-eqz v1, :cond_0

    sget-object v1, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->isFinishing()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 87
    :cond_0
    :goto_0
    return v0

    .line 83
    :cond_1
    if-eqz p0, :cond_0

    .line 85
    invoke-virtual {p0}, Landroid/app/Activity;->getTaskId()I

    move-result v1

    sget-object v2, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->getTaskId()I

    move-result v2

    if-ne v1, v2, :cond_0

    .line 87
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 73
    sget-object v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

    if-eqz v0, :cond_0

    sget-object v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->isFinishing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 74
    :cond_0
    const/4 v0, 0x0

    .line 77
    :goto_0
    return v0

    .line 75
    :cond_1
    sget-object v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

    iput-object p0, v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->d:Ljava/lang/String;

    .line 76
    sget-object v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

    iput-object p1, v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->c:Ljava/lang/String;

    .line 77
    const/4 v0, 0x1

    goto :goto_0
.end method


# virtual methods
.method protected onCreate(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 26
    invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->setContentView(Landroid/view/View;)V

    .line 29
    sput-object p0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

    .line 30
    const/4 v0, 0x1

    sput-boolean v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->b:Z

    .line 32
    new-instance v0, Landroid/content/Intent;

    const-class v1, Lcom/roidapp/photogrid/MainPage;

    invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {p0, v0}, Lcom/roidapp/photogrid/FacebookMessengerActivity;->startActivity(Landroid/content/Intent;)V

    .line 34
    return-void
.end method

.method protected onDestroy()V
    .locals 1

    .prologue
    .line 68
    const/4 v0, 0x0

    sput-object v0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->a:Lcom/roidapp/photogrid/FacebookMessengerActivity;

    .line 69
    invoke-super {p0}, Landroid/app/Activity;->onDestroy()V

    .line 70
    return-void
.end method

.method protected onResume()V
    .locals 2

    .prologue
    .line 38
    invoke-super {p0}, Landroid/app/Activity;->onResume()V

    .line 56
    iget-object v0, p0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->d:Ljava/lang/String;

    if-eqz v0, :cond_0

    .line 58
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->d:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Landroid/net/Uri;->fromFile(Ljava/io/File;)Landroid/net/Uri;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->c:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/facebook/messenger/ShareToMessengerParams;->newBuilder(Landroid/net/Uri;Ljava/lang/String;)Lcom/facebook/messenger/ShareToMessengerParamsBuilder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/facebook/messenger/ShareToMessengerParamsBuilder;->build()Lcom/facebook/messenger/ShareToMessengerParams;

    move-result-object v0

    .line 61
    invoke-static {p0, v0}, Lcom/facebook/messenger/MessengerUtils;->finishShareToMessenger(Landroid/app/Activity;Lcom/facebook/messenger/ShareToMessengerParams;)V

    .line 63
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->d:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/FacebookMessengerActivity;->c:Ljava/lang/String;

    .line 64
    return-void
.end method
