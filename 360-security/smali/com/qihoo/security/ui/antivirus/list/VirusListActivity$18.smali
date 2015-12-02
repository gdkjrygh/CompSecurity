.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$18;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


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

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/ui/antivirus/a;)V
    .locals 0

    .prologue
    .line 626
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$18;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$18;->a:Lcom/qihoo/security/ui/antivirus/a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 629
    const/4 v0, 0x4

    if-ne p2, v0, :cond_0

    .line 631
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$18;->a:Lcom/qihoo/security/ui/antivirus/a;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->b(Landroid/app/Dialog;)V

    .line 632
    const/4 v0, 0x1

    .line 634
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
