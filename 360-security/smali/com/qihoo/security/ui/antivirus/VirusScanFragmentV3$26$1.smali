.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/malware/widget/RadarProgressBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;)V
    .locals 0

    .prologue
    .line 2720
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 2734
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->as(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    .line 2735
    const/16 v0, 0xc

    invoke-static {v0}, Lcom/qihoo/security/ui/b/b;->b(I)V

    .line 2736
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->am(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/widget/RadarProgressBar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->b()V

    .line 2737
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/widget/RadarView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/malware/widget/RadarView;->a()V

    .line 2738
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->at(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    .line 2739
    return-void
.end method

.method public a(F)V
    .locals 2

    .prologue
    .line 2728
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aj(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    const-string/jumbo v1, "100"

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 2729
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    const/16 v1, 0x64

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;I)I

    .line 2730
    return-void
.end method
