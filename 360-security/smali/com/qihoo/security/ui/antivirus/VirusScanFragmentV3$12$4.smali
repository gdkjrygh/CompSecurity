.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$4;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a(Lcom/qihoo/security/malware/a$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;)V
    .locals 0

    .prologue
    .line 877
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$4;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .prologue
    .line 880
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$4;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->G(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    .line 881
    return-void
.end method
