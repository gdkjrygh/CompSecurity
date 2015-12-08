.class final Lcom/roidapp/photogrid/release/lv;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/PathSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/PathSelector;)V
    .locals 0

    .prologue
    .line 74
    iput-object p1, p0, Lcom/roidapp/photogrid/release/lv;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 78
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lv;->a:Lcom/roidapp/photogrid/release/PathSelector;

    const v1, 0xcc03

    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    invoke-virtual {v0, v1, v2}, Lcom/roidapp/photogrid/release/PathSelector;->setResult(ILandroid/content/Intent;)V

    .line 79
    iget-object v0, p0, Lcom/roidapp/photogrid/release/lv;->a:Lcom/roidapp/photogrid/release/PathSelector;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PathSelector;->finish()V

    .line 80
    return-void
.end method
