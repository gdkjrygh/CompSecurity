.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$16;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->b(Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Z

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)V
    .locals 0

    .prologue
    .line 1741
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$16;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iput-boolean p2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$16;->a:Z

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1745
    const-wide/16 v0, 0x9c4

    :try_start_0
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 1749
    :goto_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$16;->b:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    iget-boolean v1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$16;->a:Z

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->g(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;Z)Z

    .line 1750
    return-void

    .line 1746
    :catch_0
    move-exception v0

    .line 1747
    invoke-virtual {v0}, Ljava/lang/InterruptedException;->printStackTrace()V

    goto :goto_0
.end method
