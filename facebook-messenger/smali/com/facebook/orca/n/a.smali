.class public Lcom/facebook/orca/n/a;
.super Ljava/lang/Object;
.source "MessengerSelfUpdateNotificationHandler.java"

# interfaces
.implements Lcom/facebook/selfupdate/ae;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lcom/facebook/orca/notify/av;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/facebook/orca/notify/av;)V
    .locals 0

    .prologue
    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/facebook/orca/n/a;->a:Landroid/content/Context;

    .line 28
    iput-object p2, p0, Lcom/facebook/orca/n/a;->b:Lcom/facebook/orca/notify/av;

    .line 29
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 52
    iget-object v0, p0, Lcom/facebook/orca/n/a;->b:Lcom/facebook/orca/notify/av;

    invoke-virtual {v0}, Lcom/facebook/orca/notify/av;->a()V

    .line 53
    return-void
.end method

.method public a(Landroid/content/Intent;)V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v6, 0x0

    .line 33
    const-string v0, "app_name"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 34
    iget-object v1, p0, Lcom/facebook/orca/n/a;->a:Landroid/content/Context;

    sget v2, Lcom/facebook/o;->notify_new_build_title:I

    invoke-virtual {v1, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 36
    iget-object v2, p0, Lcom/facebook/orca/n/a;->a:Landroid/content/Context;

    sget v3, Lcom/facebook/o;->notify_new_build_text:I

    invoke-virtual {v2, v3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 38
    iget-object v3, p0, Lcom/facebook/orca/n/a;->a:Landroid/content/Context;

    sget v4, Lcom/facebook/o;->notify_new_build_ticker:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 40
    new-instance v4, Lcom/facebook/orca/notify/ao;

    new-array v5, v7, [Ljava/lang/Object;

    aput-object v0, v5, v6

    invoke-static {v1, v5}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-array v5, v7, [Ljava/lang/Object;

    aput-object v0, v5, v6

    invoke-static {v3, v5}, Lcom/facebook/common/w/n;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v4, v1, v2, v0, p1}, Lcom/facebook/orca/notify/ao;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V

    .line 47
    iget-object v0, p0, Lcom/facebook/orca/n/a;->b:Lcom/facebook/orca/notify/av;

    invoke-virtual {v0, v4}, Lcom/facebook/orca/notify/av;->a(Lcom/facebook/orca/notify/ao;)V

    .line 48
    return-void
.end method
