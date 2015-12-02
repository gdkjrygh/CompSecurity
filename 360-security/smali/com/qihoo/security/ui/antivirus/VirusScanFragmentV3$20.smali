.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$20;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->H()V
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
    .line 2523
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$20;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 2526
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$20;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "malware_find_issue_time"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 2528
    return-void
.end method
