.class Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;Ljava/util/List;)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1$1;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1$1;->a:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 118
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1$1;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->a:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->a(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;)Landroid/widget/ProgressBar;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setVisibility(I)V

    .line 119
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1$1;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->a:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->a(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;Z)Z

    .line 120
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1$1;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->a:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1$1;->a:Ljava/util/List;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->a(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;Ljava/util/List;)Ljava/util/List;

    .line 121
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1$1;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->a:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->c(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;)Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1$1;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;

    iget-object v1, v1, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$1;->a:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->b(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->a(Ljava/util/List;)V

    .line 122
    return-void
.end method
