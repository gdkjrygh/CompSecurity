.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->w()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V
    .locals 0

    .prologue
    .line 1561
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 1564
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->I(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v0

    .line 1565
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v1

    .line 1566
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v2

    .line 1567
    const/4 v3, 0x1

    aget v0, v0, v3

    const/4 v3, 0x0

    aget v1, v1, v3

    add-int/2addr v0, v1

    add-int/2addr v0, v2

    if-lez v0, :cond_0

    .line 1585
    :goto_0
    return-void

    .line 1570
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->g(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/app/Activity;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13$1;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;)V

    invoke-virtual {v0, v1}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    goto :goto_0
.end method
