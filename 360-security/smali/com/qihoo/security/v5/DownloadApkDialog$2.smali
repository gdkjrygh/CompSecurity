.class Lcom/qihoo/security/v5/DownloadApkDialog$2;
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
    .line 126
    iput-object p1, p0, Lcom/qihoo/security/v5/DownloadApkDialog$2;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 129
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$2;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->b(Lcom/qihoo/security/v5/DownloadApkDialog;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/v5/c;->a(Landroid/content/Context;)I

    .line 130
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$2;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->finish()V

    .line 131
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$2;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->b(Lcom/qihoo/security/v5/DownloadApkDialog;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->e(Landroid/content/Context;)V

    .line 132
    return-void
.end method
