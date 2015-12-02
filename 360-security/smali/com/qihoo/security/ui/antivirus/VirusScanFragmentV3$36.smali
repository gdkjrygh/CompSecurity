.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;
.super Lcom/qihoo/security/alasticbutton/a;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->m()V
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
    .line 1101
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Lcom/qihoo/security/alasticbutton/a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 1118
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c_()V

    .line 1119
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 1133
    return-void
.end method

.method public d()V
    .locals 2

    .prologue
    .line 1123
    invoke-static {}, Lcom/qihoo/security/ui/b/b;->a()V

    .line 1124
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->d(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z

    .line 1125
    return-void
.end method

.method public f()V
    .locals 2

    .prologue
    .line 1104
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->c(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    move-result-object v0

    sget-object v1, Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;->EXCELLENT:Lcom/qihoo/security/ui/exam/ExamMainAnim$ExamStatus;

    if-ne v0, v1, :cond_0

    .line 1105
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Y(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    .line 1113
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->d(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z

    .line 1114
    return-void

    .line 1107
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Z(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1108
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->Y(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    goto :goto_0

    .line 1110
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$36;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->aa(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)V

    goto :goto_0
.end method
