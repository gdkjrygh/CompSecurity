.class final Lcom/roidapp/photogrid/video/cd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/video/XListView;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/XListView;)V
    .locals 0

    .prologue
    .line 133
    iput-object p1, p0, Lcom/roidapp/photogrid/video/cd;->a:Lcom/roidapp/photogrid/video/XListView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 137
    iget-object v0, p0, Lcom/roidapp/photogrid/video/cd;->a:Lcom/roidapp/photogrid/video/XListView;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/XListView;->a(Lcom/roidapp/photogrid/video/XListView;)Lcom/roidapp/photogrid/video/ce;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 138
    iget-object v0, p0, Lcom/roidapp/photogrid/video/cd;->a:Lcom/roidapp/photogrid/video/XListView;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/XListView;->a(Lcom/roidapp/photogrid/video/XListView;)Lcom/roidapp/photogrid/video/ce;

    move-result-object v0

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/ce;->b()V

    .line 140
    :cond_0
    return-void
.end method
