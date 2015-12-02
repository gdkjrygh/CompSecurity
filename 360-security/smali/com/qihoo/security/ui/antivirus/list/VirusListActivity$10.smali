.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lcom/qihoo/security/ui/antivirus/list/a$a;


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
    .line 1457
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/qihoo/security/opti/trashclear/ui/i",
            "<",
            "Lcom/qihoo/security/malware/vo/MaliciousInfo;",
            ">;)V"
        }
    .end annotation

    .prologue
    const/4 v2, 0x0

    .line 1463
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0, v2}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->d(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Z)Z

    .line 1464
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0, p1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->c(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1465
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->q(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/malware/a/b;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->r(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1466
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->q(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/malware/a/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/malware/a/b;->c()V

    .line 1467
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->s(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->n(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1468
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->t(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/ui/antivirus/list/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->a()V

    .line 1471
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->u(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1472
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->s(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)I

    move-result v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->k(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-ge v0, v1, :cond_2

    .line 1473
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->k(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->s(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)I

    move-result v1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v0}, Lcom/qihoo/security/opti/trashclear/ui/i;->c()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget-object v0, v0, Lcom/qihoo/security/malware/vo/MaliciousInfo;->packageName:Ljava/lang/String;

    .line 1474
    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    iget-object v1, v1, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    invoke-static {v1, v0}, Lcom/qihoo360/mobilesafe/b/a;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 1475
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->t(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/ui/antivirus/list/b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/list/b;->b()V

    .line 1480
    :cond_1
    :goto_0
    return-void

    .line 1477
    :cond_2
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$10;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0, v2}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->c(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Z)Z

    goto :goto_0
.end method
