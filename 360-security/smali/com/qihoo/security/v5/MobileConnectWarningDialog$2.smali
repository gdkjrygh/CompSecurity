.class Lcom/qihoo/security/v5/MobileConnectWarningDialog$2;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/MobileConnectWarningDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$2;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 41
    iget-object v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$2;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->e(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/v5/c;->a(Landroid/content/Context;)I

    .line 42
    iget-object v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$2;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->b(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 43
    iget-object v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$2;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->f(Lcom/qihoo/security/v5/MobileConnectWarningDialog;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->e(Landroid/content/Context;)V

    .line 45
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/v5/MobileConnectWarningDialog$2;->a:Lcom/qihoo/security/v5/MobileConnectWarningDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/MobileConnectWarningDialog;->finish()V

    .line 46
    return-void
.end method
