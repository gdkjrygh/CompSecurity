.class public Lcom/cleanmaster/util/ReceiverUtils;
.super Landroid/content/BroadcastReceiver;
.source "SourceFile"


# static fields
.field private static a:Lcom/cleanmaster/util/ReceiverUtils;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 34
    if-nez p0, :cond_0

    .line 45
    :goto_0
    return-void

    .line 37
    :cond_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 38
    const-string v1, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 39
    const-string v1, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 40
    const-string v1, "package"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 41
    sget-object v1, Lcom/cleanmaster/util/ReceiverUtils;->a:Lcom/cleanmaster/util/ReceiverUtils;

    if-nez v1, :cond_1

    .line 42
    new-instance v1, Lcom/cleanmaster/util/ReceiverUtils;

    invoke-direct {v1}, Lcom/cleanmaster/util/ReceiverUtils;-><init>()V

    sput-object v1, Lcom/cleanmaster/util/ReceiverUtils;->a:Lcom/cleanmaster/util/ReceiverUtils;

    .line 44
    :cond_1
    sget-object v1, Lcom/cleanmaster/util/ReceiverUtils;->a:Lcom/cleanmaster/util/ReceiverUtils;

    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    goto :goto_0
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .prologue
    .line 21
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v0

    .line 22
    const-string v1, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 23
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 24
    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v0

    .line 25
    :goto_0
    invoke-static {}, Lcom/cleanmaster/func/cache/a;->a()Lcom/cleanmaster/func/cache/a;

    move-result-object v1

    invoke-virtual {v1, v0, p1}, Lcom/cleanmaster/func/cache/a;->a(Ljava/lang/String;Landroid/content/Context;)V

    .line 31
    :cond_0
    :goto_1
    return-void

    .line 24
    :cond_1
    const-string v0, ""

    goto :goto_0

    .line 26
    :cond_2
    const-string v1, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 27
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    .line 28
    if-eqz v0, :cond_3

    invoke-virtual {v0}, Landroid/net/Uri;->getSchemeSpecificPart()Ljava/lang/String;

    move-result-object v0

    .line 29
    :goto_2
    invoke-static {}, Lcom/cleanmaster/func/cache/a;->a()Lcom/cleanmaster/func/cache/a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/cleanmaster/func/cache/a;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 28
    :cond_3
    const-string v0, ""

    goto :goto_2
.end method
