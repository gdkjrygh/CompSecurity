.class Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->a(Landroid/view/View;ILandroid/view/ViewGroup;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;Lcom/qihoo/security/malware/vo/MaliciousInfo;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$2;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$2;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 213
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$2;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->c:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->b(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;Z)Z

    .line 214
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$2;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->a(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;)Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$2;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    iget v1, v1, Lcom/qihoo/security/malware/vo/MaliciousInfo;->_id:I

    invoke-static {v0, v1}, Lcom/qihoo/security/malware/db/c;->a(Landroid/content/Context;I)V

    .line 215
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$2;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->c:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;->b(Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$2;->a:Lcom/qihoo/security/malware/vo/MaliciousInfo;

    invoke-interface {v0, v1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 216
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a$2;->b:Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;

    invoke-virtual {v0}, Lcom/qihoo/security/ui/antivirus/VirusIgnoreListActivity$a;->notifyDataSetChanged()V

    .line 217
    return-void
.end method
