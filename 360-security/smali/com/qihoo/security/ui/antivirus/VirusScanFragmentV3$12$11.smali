.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$11;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->b(Lcom/qihoo/security/malware/a$d;)V
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
    .line 777
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$11;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 781
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$11;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    invoke-virtual {v0, v1, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;Z)V

    .line 782
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$11;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z

    .line 783
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$11;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->R(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 784
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$11;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->S(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 786
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$11;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->f(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    .line 787
    return-void
.end method
