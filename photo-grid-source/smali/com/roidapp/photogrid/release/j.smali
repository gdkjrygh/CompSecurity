.class final Lcom/roidapp/photogrid/release/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnKeyListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/c;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/c;)V
    .locals 0

    .prologue
    .line 265
    iput-object p1, p0, Lcom/roidapp/photogrid/release/j;->a:Lcom/roidapp/photogrid/release/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onKey(Landroid/content/DialogInterface;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 269
    const/4 v0, 0x4

    if-ne p2, v0, :cond_1

    invoke-virtual {p3}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_1

    .line 270
    iget-object v0, p0, Lcom/roidapp/photogrid/release/j;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->c(Lcom/roidapp/photogrid/release/c;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    iget-object v0, p0, Lcom/roidapp/photogrid/release/j;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->b(Lcom/roidapp/photogrid/release/c;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 271
    iget-object v0, p0, Lcom/roidapp/photogrid/release/j;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->d(Lcom/roidapp/photogrid/release/c;)Landroid/widget/ImageView;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 272
    iget-object v0, p0, Lcom/roidapp/photogrid/release/j;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->c(Lcom/roidapp/photogrid/release/c;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/j;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/c;->b(Lcom/roidapp/photogrid/release/c;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->e(Landroid/view/View;)V

    .line 276
    :goto_0
    const/4 v0, 0x1

    .line 278
    :goto_1
    return v0

    .line 274
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/j;->a:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->i(Lcom/roidapp/photogrid/release/c;)V

    goto :goto_0

    .line 278
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method
