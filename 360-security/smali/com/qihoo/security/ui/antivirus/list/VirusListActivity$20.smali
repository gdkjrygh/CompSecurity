.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$20;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->onResume()V
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
    .line 759
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$20;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 762
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$20;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$20;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->g(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)Lcom/qihoo/security/opti/trashclear/ui/i;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 763
    return-void
.end method
