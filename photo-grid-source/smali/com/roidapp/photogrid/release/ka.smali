.class final Lcom/roidapp/photogrid/release/ka;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ImageSelector;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ImageSelector;)V
    .locals 0

    .prologue
    .line 1041
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ka;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 1045
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ka;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->q(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-static {v0}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->g(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1046
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ka;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ImageSelector;->r(Lcom/roidapp/photogrid/release/ImageSelector;)Lcom/roidapp/baselib/view/FixedDrawerLayout;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ka;->a:Lcom/roidapp/photogrid/release/ImageSelector;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ImageSelector;->q(Lcom/roidapp/photogrid/release/ImageSelector;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/baselib/view/FixedDrawerLayout;->f(Landroid/view/View;)V

    .line 1048
    :cond_0
    return-void
.end method
