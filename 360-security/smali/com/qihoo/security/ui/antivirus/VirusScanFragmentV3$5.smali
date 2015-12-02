.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$5;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->q()V
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
    .line 1327
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$5;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 1331
    const/16 v0, 0xb

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$5;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ab(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/b/b;->a(ILandroid/view/View;)V

    .line 1332
    return-void
.end method

.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 1336
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$5;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ab(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1337
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$5;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ab(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 1338
    return-void
.end method
