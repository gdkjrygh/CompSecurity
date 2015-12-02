.class Lcom/facebook/orca/threadview/g;
.super Ljava/lang/Object;
.source "GlobalAlertMessageView.java"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Landroid/content/Context;

.field final synthetic b:Lcom/facebook/orca/threadview/e;


# direct methods
.method constructor <init>(Lcom/facebook/orca/threadview/e;Landroid/content/Context;)V
    .locals 0

    .prologue
    .line 118
    iput-object p1, p0, Lcom/facebook/orca/threadview/g;->b:Lcom/facebook/orca/threadview/e;

    iput-object p2, p0, Lcom/facebook/orca/threadview/g;->a:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 121
    iget-object v0, p0, Lcom/facebook/orca/threadview/g;->b:Lcom/facebook/orca/threadview/e;

    invoke-static {v0}, Lcom/facebook/orca/threadview/e;->b(Lcom/facebook/orca/threadview/e;)Lcom/facebook/messages/ipc/k;

    move-result-object v0

    iget-object v1, p0, Lcom/facebook/orca/threadview/g;->a:Landroid/content/Context;

    invoke-interface {v0, v1}, Lcom/facebook/messages/ipc/k;->a(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    .line 122
    iget-object v1, p0, Lcom/facebook/orca/threadview/g;->a:Landroid/content/Context;

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 123
    return-void
.end method
