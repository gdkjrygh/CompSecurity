.class final Lcom/roidapp/photogrid/release/qd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/Preference;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/Preference;)V
    .locals 0

    .prologue
    .line 271
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qd;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 274
    invoke-interface {p1}, Landroid/content/DialogInterface;->dismiss()V

    .line 275
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qd;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-static {v0, p2}, Lcom/roidapp/photogrid/common/an;->b(Landroid/content/Context;I)V

    .line 276
    new-instance v0, Landroid/content/Intent;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/qd;->a:Lcom/roidapp/photogrid/release/Preference;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/qd;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 277
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qd;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/Preference;->finish()V

    .line 278
    iget-object v1, p0, Lcom/roidapp/photogrid/release/qd;->a:Lcom/roidapp/photogrid/release/Preference;

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/Preference;->startActivity(Landroid/content/Intent;)V

    .line 279
    return-void
.end method
