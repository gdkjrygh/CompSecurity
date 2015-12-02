.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$2;
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
.field final synthetic a:Lcom/nineoldandroids/a/a$a;

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Lcom/nineoldandroids/a/a$a;)V
    .locals 0

    .prologue
    .line 1260
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$2;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$2;->a:Lcom/nineoldandroids/a/a$a;

    invoke-direct {p0}, Lcom/nineoldandroids/a/b;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Lcom/nineoldandroids/a/a;)V
    .locals 8

    .prologue
    const-wide/16 v6, 0x12c

    const/4 v5, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    .line 1267
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$2;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->a:Landroid/view/View;

    const-string/jumbo v1, "alpha"

    new-array v2, v3, [F

    aput v4, v2, v5

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 1268
    invoke-virtual {v0, v6, v7}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$2;->a:Lcom/nineoldandroids/a/a$a;

    invoke-virtual {v1, v2}, Lcom/nineoldandroids/a/k;->a(Lcom/nineoldandroids/a/a$a;)V

    .line 1269
    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 1273
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$2;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->ae(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Lcom/qihoo/security/locale/widget/LocaleTextView;

    move-result-object v0

    const-string/jumbo v1, "alpha"

    new-array v2, v3, [F

    aput v4, v2, v5

    invoke-static {v0, v1, v2}, Lcom/nineoldandroids/a/k;->a(Ljava/lang/Object;Ljava/lang/String;[F)Lcom/nineoldandroids/a/k;

    move-result-object v0

    invoke-virtual {v0, v6, v7}, Lcom/nineoldandroids/a/k;->c(J)Lcom/nineoldandroids/a/k;

    move-result-object v0

    .line 1274
    invoke-virtual {v0}, Lcom/nineoldandroids/a/k;->a()V

    .line 1278
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$2;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0, v3}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->e(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z

    .line 1279
    return-void
.end method
