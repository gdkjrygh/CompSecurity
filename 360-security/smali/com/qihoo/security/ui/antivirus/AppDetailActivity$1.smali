.class Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->p()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/AppDetailActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/AppDetailActivity;)V
    .locals 0

    .prologue
    .line 83
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;->a:Lcom/qihoo/security/ui/antivirus/AppDetailActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 86
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;->a:Lcom/qihoo/security/ui/antivirus/AppDetailActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->a(Lcom/qihoo/security/ui/antivirus/AppDetailActivity;)Lcom/qihoo/security/malware/vo/MaliciousInfo;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;->a:Lcom/qihoo/security/ui/antivirus/AppDetailActivity;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;->a:Lcom/qihoo/security/ui/antivirus/AppDetailActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->finish()V

    .line 106
    :goto_0
    return-void

    .line 90
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;->a:Lcom/qihoo/security/ui/antivirus/AppDetailActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->a(Lcom/qihoo/security/ui/antivirus/AppDetailActivity;)Lcom/qihoo/security/malware/vo/MaliciousInfo;

    move-result-object v0

    iget-boolean v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInstalled:Z

    if-eqz v0, :cond_2

    .line 92
    :try_start_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;->a:Lcom/qihoo/security/ui/antivirus/AppDetailActivity;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;->a:Lcom/qihoo/security/ui/antivirus/AppDetailActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->a(Lcom/qihoo/security/ui/antivirus/AppDetailActivity;)Lcom/qihoo/security/malware/vo/MaliciousInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 93
    if-nez v0, :cond_1

    .line 94
    new-instance v0, Landroid/content/Intent;

    const-string/jumbo v1, "android.intent.action.MAIN"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 95
    const-string/jumbo v1, "android.intent.category.LAUNCHER"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 96
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;->a:Lcom/qihoo/security/ui/antivirus/AppDetailActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->a(Lcom/qihoo/security/ui/antivirus/AppDetailActivity;)Lcom/qihoo/security/malware/vo/MaliciousInfo;

    move-result-object v1

    iget-object v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 98
    :cond_1
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 99
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/AppDetailActivity$1;->a:Lcom/qihoo/security/ui/antivirus/AppDetailActivity;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/antivirus/AppDetailActivity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 100
    :catch_0
    move-exception v0

    .line 101
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c0110

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0

    .line 104
    :cond_2
    invoke-static {}, Lcom/qihoo360/mobilesafe/b/q;->a()Lcom/qihoo360/mobilesafe/b/q;

    move-result-object v0

    const v1, 0x7f0c010f

    invoke-virtual {v0, v1}, Lcom/qihoo360/mobilesafe/b/q;->a(I)V

    goto :goto_0
.end method
