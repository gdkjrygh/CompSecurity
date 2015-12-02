.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->N()V
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
    .line 3015
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 3018
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->I(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v0

    .line 3019
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)[I

    move-result-object v1

    .line 3020
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->J(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v2

    .line 3021
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    aget v0, v0, v4

    aget v1, v1, v4

    add-int/2addr v0, v1

    add-int/2addr v0, v2

    invoke-static {v3, v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;I)I

    .line 3022
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aw(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->obtainMessage()Landroid/os/Message;

    move-result-object v0

    .line 3023
    const/4 v1, 0x3

    iput v1, v0, Landroid/os/Message;->what:I

    .line 3024
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ax(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)I

    move-result v1

    iput v1, v0, Landroid/os/Message;->arg1:I

    .line 3025
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$31;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ay(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->sendMessage(Landroid/os/Message;)Z

    .line 3026
    return-void
.end method
