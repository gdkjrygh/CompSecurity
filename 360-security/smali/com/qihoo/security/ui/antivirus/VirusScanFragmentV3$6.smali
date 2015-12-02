.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$6;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->s()V
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
    .line 1381
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$6;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 1384
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$6;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ab(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/widget/LinearLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 1385
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$6;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ab(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->clearAnimation()V

    .line 1386
    return-void
.end method
