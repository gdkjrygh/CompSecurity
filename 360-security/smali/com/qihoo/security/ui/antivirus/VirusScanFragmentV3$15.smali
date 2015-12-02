.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->onResume()V
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
    .line 1658
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    .prologue
    const/4 v5, 0x0

    .line 1661
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->I(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v0

    .line 1662
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v1

    .line 1663
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v2

    .line 1664
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    aget v4, v0, v5

    aget v5, v1, v5

    add-int/2addr v4, v5

    add-int/2addr v4, v2

    invoke-static {v3, v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;I)I

    .line 1665
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/vo/a;

    move-result-object v3

    if-nez v3, :cond_0

    .line 1666
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    new-instance v4, Lcom/qihoo/security/malware/vo/a;

    invoke-direct {v4, v0, v1, v2}, Lcom/qihoo/security/malware/vo/a;-><init>([I[II)V

    invoke-static {v3, v4}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Lcom/qihoo/security/malware/vo/a;)Lcom/qihoo/security/malware/vo/a;

    .line 1672
    :goto_0
    return-void

    .line 1668
    :cond_0
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/vo/a;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/qihoo/security/malware/vo/a;->a([I)V

    .line 1669
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/vo/a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/malware/vo/a;->b([I)V

    .line 1670
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$15;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->al(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/malware/vo/a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/malware/vo/a;->a(I)V

    goto :goto_0
.end method
