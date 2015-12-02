.class Lcom/qihoo/security/v5/UpdatedDialog$5;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/qihoo/security/v5/UpdatedDialog;->onCreate(Landroid/os/Bundle;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/qihoo/security/v5/UpdatedDialog;


# direct methods
.method constructor <init>(Lcom/qihoo/security/v5/UpdatedDialog;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/qihoo/security/v5/UpdatedDialog$5;->a:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 213
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog$5;->a:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdatedDialog;->a(Lcom/qihoo/security/v5/UpdatedDialog;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo/security/v5/c;->a(Landroid/content/Context;)I

    .line 214
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog$5;->a:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdatedDialog;->c(Lcom/qihoo/security/v5/UpdatedDialog;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 215
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog$5;->a:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-static {v0}, Lcom/qihoo/security/v5/UpdatedDialog;->a(Lcom/qihoo/security/v5/UpdatedDialog;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/qihoo360/mobilesafe/b/a;->e(Landroid/content/Context;)V

    .line 217
    :cond_0
    iget-object v0, p0, Lcom/qihoo/security/v5/UpdatedDialog$5;->a:Lcom/qihoo/security/v5/UpdatedDialog;

    invoke-virtual {v0}, Lcom/qihoo/security/v5/UpdatedDialog;->finish()V

    .line 218
    return-void
.end method
