.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/lang/String;

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 3071
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;->a:Ljava/lang/String;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 6

    .prologue
    .line 3074
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ae(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setLocalText(Ljava/lang/CharSequence;)V

    .line 3075
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ae(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32$1;-><init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;)V

    const/4 v2, 0x0

    const/high16 v3, 0x3f800000    # 1.0f

    const-wide/16 v4, 0x12c

    invoke-static/range {v0 .. v5}, Lcom/qihoo/security/ui/main/a;->a(Landroid/view/View;Lcom/nineoldandroids/a/a$a;FFJ)V

    .line 3081
    return-void
.end method
