.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/i;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/ui/antivirus/a;

.field final synthetic b:Lcom/qihoo/security/opti/trashclear/ui/i;

.field final synthetic c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/ui/antivirus/a;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 611
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;->a:Lcom/qihoo/security/ui/antivirus/a;

    iput-object p3, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;->b:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 614
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "setting_auto_start"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->b(Landroid/content/Context;Ljava/lang/String;Z)Z

    move-result v0

    if-nez v0, :cond_0

    .line 615
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "setting_auto_start"

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 618
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;->a:Lcom/qihoo/security/ui/antivirus/a;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->b(Landroid/app/Dialog;)V

    .line 619
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->h(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/ui/antivirus/list/c;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;->b:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-interface {v1}, Lcom/qihoo/security/opti/trashclear/ui/i;->a()Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/c;->h(Lcom/qihoo/security/opti/trashclear/ui/i;)Ljava/util/List;

    move-result-object v0

    .line 620
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/opti/trashclear/ui/i;

    .line 621
    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$17;->c:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v2, v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->b(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    goto :goto_0

    .line 623
    :cond_1
    const/16 v0, 0x36c3

    invoke-static {v0}, Lcom/qihoo/security/support/b;->c(I)V

    .line 624
    return-void
.end method
