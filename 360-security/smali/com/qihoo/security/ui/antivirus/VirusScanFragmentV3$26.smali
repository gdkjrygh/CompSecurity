.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/malware/widget/RadarProgressBar$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->K()V
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
    .line 2710
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    .prologue
    .line 2720
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->am(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/widget/RadarProgressBar;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->am(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/widget/RadarProgressBar;

    move-result-object v1

    invoke-virtual {v1}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->getProgress()F

    move-result v1

    const/high16 v2, 0x43b40000    # 360.0f

    const/16 v3, 0xc8

    new-instance v4, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26$1;

    invoke-direct {v4, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26$1;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;)V

    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/qihoo/security/malware/widget/RadarProgressBar;->a(FFILcom/qihoo/security/malware/widget/RadarProgressBar$a;)V

    .line 2741
    return-void
.end method

.method public a(F)V
    .locals 4

    .prologue
    const/high16 v3, 0x42c80000    # 100.0f

    .line 2714
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aj(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    mul-float v2, p1, v3

    float-to-int v2, v2

    div-int/lit16 v2, v2, 0x168

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string/jumbo v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setText(Ljava/lang/CharSequence;)V

    .line 2715
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$26;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    mul-float v1, p1, v3

    float-to-int v1, v1

    div-int/lit16 v1, v1, 0x168

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;I)I

    .line 2716
    return-void
.end method
