.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11$1;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;->b(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/opti/trashclear/ui/i;

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;Lcom/qihoo/security/opti/trashclear/ui/i;)V
    .locals 0

    .prologue
    .line 1519
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11$1;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11$1;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .prologue
    .line 1522
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11$1;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    iget-object v1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$11$1;->a:Lcom/qihoo/security/opti/trashclear/ui/i;

    invoke-static {v0, v1}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->a(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/opti/trashclear/ui/i;)V

    .line 1523
    return-void
.end method
