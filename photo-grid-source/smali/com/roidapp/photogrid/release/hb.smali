.class final Lcom/roidapp/photogrid/release/hb;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/photogrid/release/ha;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ha;I)V
    .locals 0

    .prologue
    .line 542
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hb;->b:Lcom/roidapp/photogrid/release/ha;

    iput p2, p0, Lcom/roidapp/photogrid/release/hb;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 545
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hb;->b:Lcom/roidapp/photogrid/release/ha;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->i:Z

    if-nez v0, :cond_0

    .line 546
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hb;->b:Lcom/roidapp/photogrid/release/ha;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/hb;->b:Lcom/roidapp/photogrid/release/ha;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ge;->f(Lcom/roidapp/photogrid/release/ge;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    invoke-static {v1}, Lcom/roidapp/photogrid/release/rc;->a(Landroid/content/Context;)Lcom/roidapp/photogrid/release/rc;

    invoke-static {}, Lcom/roidapp/photogrid/release/rc;->e()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hb;->b:Lcom/roidapp/photogrid/release/ha;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ha;->b:Lcom/roidapp/photogrid/release/ge;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ge;->i(Lcom/roidapp/photogrid/release/ge;)[Ljava/lang/String;

    move-result-object v2

    iget v3, p0, Lcom/roidapp/photogrid/release/hb;->a:I

    aget-object v2, v2, v3

    invoke-static {v0, v1, v2}, Lcom/roidapp/photogrid/release/ge;->b(Lcom/roidapp/photogrid/release/ge;Ljava/lang/String;Ljava/lang/String;)V

    .line 547
    :cond_0
    return-void
.end method
