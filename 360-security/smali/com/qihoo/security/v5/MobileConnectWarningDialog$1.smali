.class Lcom/qihoo/security/v5/MobileConnectWarningDialog$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/MobileConnectWarningDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)V
    .locals 0

    .prologue
    .line 25
    iput-object p1, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$1;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 29
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$1;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-static {v1}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->a(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)Landroid/content/Context;

    move-result-object v1

    const-class v2, Lcom/qihoo/security/v5/UpdateDownloadUIService;

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    const-string/jumbo v1, "uiforce"

    iget-object v2, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$1;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-static {v2}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->b(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 31
    const-string/jumbo v1, "ispatch"

    iget-object v2, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$1;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-static {v2}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->c(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)Z

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 32
    const-string/jumbo v1, "type"

    iget-object v2, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$1;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-static {v2}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->d(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)I

    move-result v2

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 34
    iget-object v1, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$1;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-virtual {v1, v0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 35
    iget-object v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$1;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->finish()V

    .line 36
    return-void
.end method
