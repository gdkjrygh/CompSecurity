.class final Lcom/roidapp/photogrid/cloud/cp;
.super Landroid/os/Handler;
.source "SourceFile"


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V
    .locals 0

    .prologue
    .line 489
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cp;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 1

    .prologue
    .line 491
    iget v0, p1, Landroid/os/Message;->what:I

    packed-switch v0, :pswitch_data_0

    .line 498
    :cond_0
    :goto_0
    return-void

    .line 493
    :pswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cp;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 494
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cp;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->i(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Lcom/roidapp/photogrid/common/al;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/common/al;->a()V

    goto :goto_0

    .line 491
    :pswitch_data_0
    .packed-switch 0x236
        :pswitch_0
    .end packed-switch
.end method
