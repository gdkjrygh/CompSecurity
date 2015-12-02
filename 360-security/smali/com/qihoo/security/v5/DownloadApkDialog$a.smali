.class Lcom/qihoo/security/v5/DownloadApkDialog$a;
.super Ljava/lang/Object;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v5/DownloadApkDialog;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/DownloadApkDialog;

.field private final b:Landroid/content/Context;

.field private final c:Lcom/qihoo/security/widget/ProgressView;


# direct methods
.method public constructor <init>(Lcom/qihoo/security/v5/DownloadApkDialog;Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 70
    iput-object p1, p0, Lcom/qihoo/security/v5/DownloadApkDialog$a;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$a;->b:Landroid/content/Context;

    .line 72
    const v0, 0x7f0b0108

    invoke-virtual {p1, v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/ProgressView;

    iput-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$a;->c:Lcom/qihoo/security/widget/ProgressView;

    .line 73
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$a;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/DownloadApkDialog;->finish()V

    .line 90
    return-void
.end method

.method public a(I)V
    .locals 3

    .prologue
    .line 79
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$a;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    const v1, 0x7f0b0107

    invoke-virtual {v0, v1}, Lcom/qihoo/security/v5/DownloadApkDialog;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/locale/widget/LocaleTextView;

    .line 80
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, "%"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 81
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$a;->c:Lcom/qihoo/security/widget/ProgressView;

    int-to-float v1, p1

    const/high16 v2, 0x42c80000    # 100.0f

    div-float/2addr v1, v2

    invoke-virtual {v0, v1}, Lcom/qihoo/security/widget/ProgressView;->setProgress(F)V

    .line 82
    iget-object v0, p0, Lcom/qihoo/security/v5/DownloadApkDialog$a;->a:Lcom/qihoo/security/v5/DownloadApkDialog;

    invoke-static {v0, p1}, Lcom/qihoo/security/v5/DownloadApkDialog;->a(Lcom/qihoo/security/v5/DownloadApkDialog;I)I

    .line 83
    return-void
.end method
