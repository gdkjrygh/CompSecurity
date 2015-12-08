.class final Lcom/roidapp/photogrid/cloud/cr;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/AlertDialog;

.field final synthetic b:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;Landroid/app/AlertDialog;)V
    .locals 0

    .prologue
    .line 457
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cr;->b:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    iput-object p2, p0, Lcom/roidapp/photogrid/cloud/cr;->a:Landroid/app/AlertDialog;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 460
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    const v1, 0x7f0d00eb

    if-ne v0, v1, :cond_0

    .line 461
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cr;->b:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->g(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V

    .line 466
    :goto_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cr;->a:Landroid/app/AlertDialog;

    invoke-virtual {v0}, Landroid/app/AlertDialog;->dismiss()V

    .line 467
    return-void

    .line 464
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cr;->b:Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;->h(Lcom/roidapp/photogrid/cloud/TemplateSelectorActivity;)V

    goto :goto_0
.end method
