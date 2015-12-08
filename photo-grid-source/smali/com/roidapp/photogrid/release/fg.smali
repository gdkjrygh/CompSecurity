.class final Lcom/roidapp/photogrid/release/fg;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/fb;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fb;)V
    .locals 0

    .prologue
    .line 449
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fg;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x4

    .line 453
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fg;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_0

    .line 460
    :goto_0
    return-void

    .line 456
    :cond_0
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    const-string v1, "template/layout"

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/ih;->j(Ljava/lang/String;)V

    .line 457
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fg;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    invoke-virtual {v0, v3}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(I)V

    .line 458
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fg;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->b(Lcom/roidapp/photogrid/release/fb;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const/4 v1, 0x5

    const/4 v2, 0x0

    invoke-virtual {v0, v3, v1, v2}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->a(IIZ)V

    .line 459
    const-string v0, "TemplateSelect_View"

    const-string v1, "LayoutTemplate_TemplateSelect"

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/b/f;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0
.end method
