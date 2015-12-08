.class final Lcom/roidapp/photogrid/release/ca;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/by;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/by;)V
    .locals 0

    .prologue
    .line 185
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ca;->a:Lcom/roidapp/photogrid/release/by;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 189
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ca;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-eqz v0, :cond_0

    .line 193
    :goto_0
    return-void

    .line 192
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ca;->a:Lcom/roidapp/photogrid/release/by;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/by;->a(Lcom/roidapp/photogrid/release/by;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->g(Z)V

    goto :goto_0
.end method
