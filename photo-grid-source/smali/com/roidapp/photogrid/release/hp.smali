.class final Lcom/roidapp/photogrid/release/hp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/release/hr;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/hk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/hk;)V
    .locals 0

    .prologue
    .line 201
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hp;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 204
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hp;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hp;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->c(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 205
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hp;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->c(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hp;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hp;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v2

    if-le v0, v2, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hp;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v0

    :goto_0
    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(I)V

    .line 207
    :cond_0
    return-void

    .line 205
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hp;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    goto :goto_0
.end method
