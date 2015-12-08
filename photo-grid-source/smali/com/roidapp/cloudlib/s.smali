.class final Lcom/roidapp/cloudlib/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/cloudlib/AccountMgrActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/cloudlib/AccountMgrActivity;)V
    .locals 0

    .prologue
    .line 444
    iput-object p1, p0, Lcom/roidapp/cloudlib/s;->a:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 448
    iget-object v0, p0, Lcom/roidapp/cloudlib/s;->a:Lcom/roidapp/cloudlib/AccountMgrActivity;

    new-instance v1, Landroid/content/Intent;

    iget-object v2, p0, Lcom/roidapp/cloudlib/s;->a:Lcom/roidapp/cloudlib/AccountMgrActivity;

    invoke-static {}, Lcom/roidapp/cloudlib/al;->g()Lcom/roidapp/cloudlib/al;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/cloudlib/al;->b()Ljava/lang/Class;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/cloudlib/AccountMgrActivity;->startActivity(Landroid/content/Intent;)V

    .line 449
    return-void
.end method
