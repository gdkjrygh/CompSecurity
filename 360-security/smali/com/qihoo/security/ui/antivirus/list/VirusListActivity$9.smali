.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/malware/a/a$a;


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
    .line 1287
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    .prologue
    .line 1291
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->b(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Z)Z

    .line 1292
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->k(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 1293
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->l(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    .line 1295
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->m(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1296
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->n(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 1297
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v2, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->b(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 1299
    :cond_1
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/app/BaseActivity$a;

    move-result-object v0

    new-instance v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9$1;

    invoke-direct {v1, p0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9$1;-><init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$9;)V

    const-wide/16 v2, 0x190

    invoke-virtual {v0, v1, v2, v3}, Lcom/qihoo/security/app/BaseActivity$a;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 1306
    :cond_2
    return-void
.end method

.method public a(Lcom/qihoo/security/malware/vo/MaliciousInfo;II)V
    .locals 0

    .prologue
    .line 1316
    return-void
.end method

.method public b()V
    .locals 0

    .prologue
    .line 1311
    return-void
.end method
