.class final Lcom/roidapp/photogrid/release/gn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/widget/TextView;

.field final synthetic b:Landroid/widget/RelativeLayout;

.field final synthetic c:Lcom/roidapp/photogrid/release/ge;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ge;Landroid/widget/TextView;Landroid/widget/RelativeLayout;)V
    .locals 0

    .prologue
    .line 203
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gn;->c:Lcom/roidapp/photogrid/release/ge;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/gn;->a:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/gn;->b:Landroid/widget/RelativeLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 209
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gn;->a:Landroid/widget/TextView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 210
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gn;->b:Landroid/widget/RelativeLayout;

    const v1, 0x7f020074

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundResource(I)V

    .line 211
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gn;->c:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 212
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gn;->c:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 213
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gn;->c:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->e(Lcom/roidapp/photogrid/release/ge;)V

    .line 214
    return-void
.end method
