.class final Lcom/roidapp/photogrid/common/bf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Landroid/app/Activity;

.field final synthetic b:Lcom/roidapp/photogrid/common/be;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/common/be;Landroid/app/Activity;)V
    .locals 0

    .prologue
    .line 106
    iput-object p1, p0, Lcom/roidapp/photogrid/common/bf;->b:Lcom/roidapp/photogrid/common/be;

    iput-object p2, p0, Lcom/roidapp/photogrid/common/bf;->a:Landroid/app/Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 110
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bf;->a:Landroid/app/Activity;

    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    .line 111
    iget-boolean v1, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v1, :cond_0

    .line 116
    :goto_0
    return-void

    .line 114
    :cond_0
    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->y()V

    .line 115
    iget-object v0, p0, Lcom/roidapp/photogrid/common/bf;->b:Lcom/roidapp/photogrid/common/be;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/be;->a(Lcom/roidapp/photogrid/common/be;)V

    goto :goto_0
.end method
