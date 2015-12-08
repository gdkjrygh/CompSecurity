.class final Lcom/roidapp/photogrid/release/mo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/imagelib/d/d;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/mm;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/mm;)V
    .locals 0

    .prologue
    .line 716
    iput-object p1, p0, Lcom/roidapp/photogrid/release/mo;->a:Lcom/roidapp/photogrid/release/mm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;)V
    .locals 2

    .prologue
    .line 719
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->be()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 720
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mo;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/release/an;->a(Landroid/graphics/Bitmap;)V

    .line 721
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mo;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/an;->b(Z)V

    .line 722
    iget-object v0, p0, Lcom/roidapp/photogrid/release/mo;->a:Lcom/roidapp/photogrid/release/mm;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/mm;->q:Lcom/roidapp/photogrid/release/an;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/an;->invalidate()V

    .line 728
    :cond_0
    return-void
.end method
