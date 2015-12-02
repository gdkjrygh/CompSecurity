.class public Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;
.super Landroid/content/BroadcastReceiver;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;
    }
.end annotation


# instance fields
.field private a:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 53
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 55
    return-void
.end method

.method public constructor <init>(Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;)V
    .locals 0

    .prologue
    .line 57
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 58
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;->a:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;

    .line 59
    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 91
    :try_start_0
    new-instance v0, Landroid/content/IntentFilter;

    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 92
    const-string/jumbo v1, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 93
    const-string/jumbo v1, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 94
    const-string/jumbo v1, "android.intent.action.PACKAGE_REPLACED"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 95
    const/16 v1, 0x3e7

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->setPriority(I)V

    .line 96
    const-string/jumbo v1, "package"

    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addDataScheme(Ljava/lang/String;)V

    .line 97
    invoke-virtual {p1, p0, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 103
    :goto_0
    return-void

    .line 98
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public b(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 107
    :try_start_0
    invoke-virtual {p1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    :goto_0
    return-void

    .line 108
    :catch_0
    move-exception v0

    goto :goto_0
.end method

.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 63
    if-nez p2, :cond_1

    .line 87
    :cond_0
    :goto_0
    return-void

    .line 66
    :cond_1
    invoke-virtual {p2}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getEncodedSchemeSpecificPart()Ljava/lang/String;

    move-result-object v0

    .line 67
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    move-result-object v1

    .line 68
    const-string/jumbo v2, "android.intent.extra.DATA_REMOVED"

    invoke-virtual {p2, v2, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v2

    .line 69
    const-string/jumbo v3, "android.intent.extra.REPLACING"

    invoke-virtual {p2, v3, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v3

    .line 74
    const-string/jumbo v4, "android.intent.action.PACKAGE_ADDED"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 75
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;->a:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;

    if-eqz v1, :cond_0

    if-nez v2, :cond_0

    if-nez v3, :cond_0

    .line 76
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;->a:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;->a(Ljava/lang/String;)V

    goto :goto_0

    .line 78
    :cond_2
    const-string/jumbo v4, "android.intent.action.PACKAGE_REPLACED"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 79
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;->a:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;

    if-eqz v1, :cond_0

    .line 80
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;->a:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;->c(Ljava/lang/String;)V

    goto :goto_0

    .line 82
    :cond_3
    const-string/jumbo v4, "android.intent.action.PACKAGE_REMOVED"

    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 83
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;->a:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;

    if-eqz v1, :cond_0

    if-eqz v2, :cond_0

    if-nez v3, :cond_0

    .line 84
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver;->a:Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;

    invoke-interface {v1, v0}, Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;->b(Ljava/lang/String;)V

    goto :goto_0
.end method
