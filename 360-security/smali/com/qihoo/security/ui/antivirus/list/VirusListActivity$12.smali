.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$12;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->o()V
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
    .line 245
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$12;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 248
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$12;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$12;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->b(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Landroid/view/View;

    move-result-object v1

    iget-object v2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$12;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v2}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->c(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Landroid/view/View;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 249
    return-void
.end method
