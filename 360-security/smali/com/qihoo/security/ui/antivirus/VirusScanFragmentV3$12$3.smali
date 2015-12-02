.class Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$3;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a(Lcom/qihoo/security/malware/a$a;)V
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
    .line 868
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$3;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .prologue
    .line 871
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12$3;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3$12;->a:Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;->h(Lcom/qihoo/security/ui/antivirus/VirusScanFragmentV3;)Landroid/content/Context;

    move-result-object v0

    const-string/jumbo v1, "malware_is_scanning"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 872
    return-void
.end method
