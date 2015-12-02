.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;)V
    .locals 0

    .prologue
    .line 605
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$2;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 608
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$2;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->K(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    .line 609
    return-void
.end method
