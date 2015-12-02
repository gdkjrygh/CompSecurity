.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$14;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V
    .locals 0

    .prologue
    .line 302
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$14;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 305
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$14;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Z)Z

    .line 306
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$14;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->d(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/ui/antivirus/list/d;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/d;->b()V

    .line 307
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$14;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$14$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$14$1;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$14;)V

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 314
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$14;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Z)Z

    .line 315
    return-void
.end method
