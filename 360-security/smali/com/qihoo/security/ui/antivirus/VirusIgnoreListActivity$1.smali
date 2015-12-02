.class Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;
.super Ljava/lang/Thread;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->q()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;)V
    .locals 0

    .prologue
    .line 98
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->a:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    .prologue
    .line 101
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->a:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->p:Landroid/content/Context;

    invoke-static {v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    .line 102
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .line 104
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 105
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    .line 106
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->a:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->p:Landroid/content/Context;

    invoke-virtual {v0, v3}, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isUninstall(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_1

    .line 107
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    .line 108
    iget-object v3, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->a:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    iget-object v3, v3, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->p:Landroid/content/Context;

    iget v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v3, v0}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;I)V

    goto :goto_0

    .line 109
    :cond_1
    iget-boolean v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->isInMonitorList:Z

    if-eqz v0, :cond_0

    .line 110
    invoke-interface {v2}, Ljava/util/Iterator;->remove()V

    goto :goto_0

    .line 115
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->a:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    new-instance v2, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1$1;

    invoke-direct {v2, p0, v1}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1$1;-><init>(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;Ljava/util/List;)V

    invoke-virtual {v0, v2}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 124
    return-void
.end method
