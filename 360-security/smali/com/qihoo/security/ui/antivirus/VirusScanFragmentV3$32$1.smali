.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32$1;
.super Lcom/nineoldandroids/a/b;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;->b(Lcom/nineoldandroids/a/a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;)V
    .locals 0

    .prologue
    .line 3075
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 2

    .prologue
    .line 3078
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$32;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ae(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/locale/widget/LocaleTextView;->setVisibility(I)V

    .line 3079
    return-void
.end method
