.class Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$6;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->B()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/dialog/i;

.field final synthetic b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;


# direct methods
.method constructor <init>(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;Lcom/qihoo/security/dialog/i;)V
    .locals 0

    .prologue
    .line 1178
    iput-object p1, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$6;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    iput-object p2, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$6;->a:Lcom/qihoo/security/dialog/i;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 1181
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$6;->b:Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;

    invoke-static {v0}, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;->j(Lcom/qihoo/security/ui/antivirus/list/VirusListActivity;)V

    .line 1182
    iget-object v0, p0, Lcom/qihoo/security/ui/antivirus/list/VirusListActivity$6;->a:Lcom/qihoo/security/dialog/i;

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/d;->b(Landroid/app/Dialog;)V

    .line 1183
    return-void
.end method
