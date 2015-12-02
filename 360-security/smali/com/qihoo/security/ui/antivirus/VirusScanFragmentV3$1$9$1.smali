.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$1;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;)V
    .locals 0

    .prologue
    .line 592
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 595
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 596
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;

    iget-object v2, v2, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v2, v2, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "malware_scan_time"

    invoke-static {v2, v3, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 597
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;

    iget-object v2, v2, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1$9;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;

    iget-object v2, v2, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$1;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v2

    const-string/jumbo v3, "malware_fast_scan_time"

    invoke-static {v2, v3, v0, v1}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 598
    return-void
.end method
