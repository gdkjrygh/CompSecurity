.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$21;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H()V
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
    .line 2537
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$21;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 2540
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$21;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->am(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/widget/RadarProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->b()V

    .line 2541
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$21;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->i(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)V

    .line 2542
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$21;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->an(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    .line 2543
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$21;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ag(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 2544
    return-void
.end method
