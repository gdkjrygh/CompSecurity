.class final Lcom/roidapp/photogrid/video/bq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:I

.field final synthetic b:Lcom/roidapp/photogrid/video/bp;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/video/bp;I)V
    .locals 0

    .prologue
    .line 643
    iput-object p1, p0, Lcom/roidapp/photogrid/video/bq;->b:Lcom/roidapp/photogrid/video/bp;

    iput p2, p0, Lcom/roidapp/photogrid/video/bq;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 3

    .prologue
    .line 646
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bq;->b:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/bp;->b(Lcom/roidapp/photogrid/video/bp;)Lcom/roidapp/photogrid/video/ca;

    move-result-object v0

    if-nez v0, :cond_1

    .line 654
    :cond_0
    :goto_0
    return-void

    .line 649
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/video/bp;->c()[Z

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/bq;->a:I

    const/4 v2, 0x0

    aput-boolean v2, v0, v1

    .line 650
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bq;->b:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/bp;->b(Lcom/roidapp/photogrid/video/bp;)Lcom/roidapp/photogrid/video/ca;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/bq;->a:I

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/ca;->a(I)V

    .line 651
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bq;->b:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/bp;->c(Lcom/roidapp/photogrid/video/bp;)[Lcom/roidapp/photogrid/release/ig;

    move-result-object v0

    array-length v0, v0

    if-nez v0, :cond_0

    .line 652
    iget-object v0, p0, Lcom/roidapp/photogrid/video/bq;->b:Lcom/roidapp/photogrid/video/bp;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/bp;->a(Lcom/roidapp/photogrid/video/bp;)V

    goto :goto_0
.end method
