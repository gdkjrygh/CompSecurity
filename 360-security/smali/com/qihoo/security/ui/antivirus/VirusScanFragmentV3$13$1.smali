.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;)V
    .locals 0

    .prologue
    .line 1570
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1575
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Lcom/nineoldandroids/a/a$a;)V

    .line 1576
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->f(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z

    .line 1578
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;

    iget-object v1, v1, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ah(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/d;

    move-result-object v1

    const v2, 0x7f0c01d3

    invoke-virtual {v1, v2}, Lcom/qihoo/security/locale/d;->a(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a_(Ljava/lang/String;)V

    .line 1579
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->f(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z

    .line 1580
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$13;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ai(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/alasticbutton/ElasticImageButton;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/alasticbutton/ElasticImageButton;->a(Z)V

    .line 1581
    return-void
.end method
