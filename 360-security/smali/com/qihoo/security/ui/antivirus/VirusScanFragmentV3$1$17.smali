.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$17;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->b(Lcom/qihoo/security/malware/a$d;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;)V
    .locals 0

    .prologue
    .line 419
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$17;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 423
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$17;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->IN_DANGER:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-eq v0, v1, :cond_1

    .line 425
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$17;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z

    .line 426
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$17;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->p(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->hasMessages(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 427
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$17;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->q(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/fragment/BaseFragment$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/fragment/BaseFragment$a;->removeMessages(I)V

    .line 429
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$17;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->f(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    .line 431
    :cond_1
    return-void
.end method
