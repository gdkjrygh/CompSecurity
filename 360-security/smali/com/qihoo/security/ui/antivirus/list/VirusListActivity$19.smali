.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$19;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->d(Lcom/qihoo/security/opti/trashclear/ui/i;)V
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
    .line 637
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$19;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 3

    .prologue
    .line 640
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$19;->a:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    iget-object v0, v0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->p:Landroid/content/Context;

    const-string/jumbo v1, "setting_auto_start"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lcom/qihoo360/mobilesafe/share/SharedPref;->a(Landroid/content/Context;Ljava/lang/String;Z)V

    .line 641
    return-void
.end method
