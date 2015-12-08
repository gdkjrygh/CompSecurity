.class final Lcom/roidapp/photogrid/release/gf;
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
    .line 188
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gf;->c:Lcom/roidapp/photogrid/release/ge;

    iput-object p2, p0, Lcom/roidapp/photogrid/release/gf;->a:Landroid/widget/TextView;

    iput-object p3, p0, Lcom/roidapp/photogrid/release/gf;->b:Landroid/widget/RelativeLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 192
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gf;->c:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->a(Lcom/roidapp/photogrid/release/ge;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 201
    :goto_0
    return-void

    .line 195
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gf;->a:Landroid/widget/TextView;

    const v1, 0x7f020074

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundResource(I)V

    .line 196
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gf;->b:Landroid/widget/RelativeLayout;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 197
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gf;->c:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 198
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gf;->c:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->c(Lcom/roidapp/photogrid/release/ge;)Landroid/widget/ListView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ListView;->setVisibility(I)V

    .line 199
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gf;->c:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->d(Lcom/roidapp/photogrid/release/ge;)V

    goto :goto_0
.end method
