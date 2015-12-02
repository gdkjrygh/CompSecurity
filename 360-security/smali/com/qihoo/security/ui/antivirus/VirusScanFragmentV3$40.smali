.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$40;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p()V
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
    .line 1245
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$40;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 1

    .prologue
    .line 1252
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$40;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ac(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1253
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$40;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ad(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    .line 1256
    :cond_0
    return-void
.end method
