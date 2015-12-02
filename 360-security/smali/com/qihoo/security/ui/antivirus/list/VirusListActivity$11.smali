.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/ui/antivirus/list/PackageReceiver$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;
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
    .line 1505
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1536
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 6

    .prologue
    .line 1515
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->h(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/ui/antivirus/list/c;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 1516
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->h(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/ui/antivirus/list/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/c;->a()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1517
    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1518
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->r(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->u(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->v(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 1519
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->w(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/app/BaseActivity$a;

    move-result-object v1

    new-instance v2, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11$1;

    invoke-direct {v2, p0, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11$1;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    const-wide/16 v4, 0x190

    invoke-virtual {v1, v2, v4, v5}, Lcom/qihoo/security/app/BaseActivity$a;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1530
    :cond_1
    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 1511
    return-void
.end method
