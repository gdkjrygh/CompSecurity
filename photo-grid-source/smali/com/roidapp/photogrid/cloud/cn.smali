.class final Lcom/roidapp/photogrid/cloud/cn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V
    .locals 0

    .prologue
    .line 148
    iput-object p1, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    const/4 v2, 0x4

    const/4 v1, 0x0

    .line 151
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    .line 191
    :cond_0
    :goto_0
    return-void

    .line 153
    :sswitch_0
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->a(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V

    goto :goto_0

    .line 156
    :sswitch_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->b(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 157
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->c(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Lcom/roidapp/cloudlib/template/b/c;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/b/c;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 158
    new-instance v0, Ljava/lang/ref/WeakReference;

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-direct {v0, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    const v2, 0x7f0700e2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/an;->c(Ljava/lang/ref/WeakReference;Ljava/lang/String;)V

    goto :goto_0

    .line 161
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->d(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Lcom/roidapp/cloudlib/template/c/f;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/c/f;->c()Lcom/roidapp/cloudlib/template/a/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/cloudlib/template/a/e;->d()V

    .line 162
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->e(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V

    .line 163
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->f(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    goto :goto_0

    .line 165
    :pswitch_0
    const-string v0, "Template_Switch_Refresh"

    invoke-static {v0, v2, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    goto :goto_0

    .line 168
    :pswitch_1
    const-string v0, "Template_Layout_Refresh"

    invoke-static {v0, v2, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    goto :goto_0

    .line 175
    :sswitch_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->g(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 176
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->h(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V

    .line 181
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->f(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)I

    move-result v0

    packed-switch v0, :pswitch_data_1

    goto :goto_0

    .line 183
    :pswitch_2
    const-string v0, "Template_Switch_Back"

    invoke-static {v0, v2, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    goto :goto_0

    .line 179
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/cloud/cn;->a:Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;->a(Lcom/roidapp/photogrid/cloud/TemplateChangeActivity;)V

    goto :goto_1

    .line 186
    :pswitch_3
    const-string v0, "Template_Layout_Back"

    invoke-static {v0, v2, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;II)V

    goto :goto_0

    .line 151
    nop

    :sswitch_data_0
    .sparse-switch
        0x7f0d008c -> :sswitch_1
        0x7f0d00e8 -> :sswitch_2
        0x7f0d040d -> :sswitch_0
    .end sparse-switch

    .line 163
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 181
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method
