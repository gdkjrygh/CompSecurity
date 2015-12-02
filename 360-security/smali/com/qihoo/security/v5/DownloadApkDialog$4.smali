.class Lcom/qihoo/security/v5/DownloadApkDialog$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/DownloadApkDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/DownloadApkDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/DownloadApkDialog;)V
    .locals 0

    .prologue
    .line 144
    iput-object p1, p0, Lcom/qihoo/security/v5/DownloadApkDialog$4;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 147
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$4;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->b(Lcom/qihoo/security/v5/DownloadApkDialog;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/v5/c;->a(Landroid/content/Context;)I

    .line 148
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$4;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->b(Lcom/qihoo/security/v5/DownloadApkDialog;)Landroid/content/Context;

    move-result-object v0

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/qihoo/security/v5/DownloadApkDialog$4;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-static {v2}, Lcom/qihoo/security/v5/DownloadApkDialog;->b(Lcom/qihoo/security/v5/DownloadApkDialog;)Landroid/content/Context;

    move-result-object v2

    const-class v3, Lcom/qihoo/security/v5/UpdateDownloadUIService;

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Landroid/content/Context;->stopService(Landroid/content/Intent;)Z

    .line 149
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$4;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->finish()V

    .line 150
    return-void
.end method
