.class final Lcom/roidapp/photogrid/release/de;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/dc;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/dc;)V
    .locals 0

    .prologue
    .line 476
    iput-object p1, p0, Lcom/roidapp/photogrid/release/de;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 480
    iget-object v0, p0, Lcom/roidapp/photogrid/release/de;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dc;->d(Lcom/roidapp/photogrid/release/dc;)[Lcom/roidapp/photogrid/release/ig;

    .line 483
    iget-object v0, p0, Lcom/roidapp/photogrid/release/de;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/dc;->e(Lcom/roidapp/photogrid/release/dc;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/de;->a:Lcom/roidapp/photogrid/release/dc;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/dc;->e(Lcom/roidapp/photogrid/release/dc;)Lcom/roidapp/photogrid/release/PhotoGridActivity;

    move-result-object v1

    iget v1, v1, Lcom/roidapp/photogrid/release/PhotoGridActivity;->n:I

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/release/PhotoGridActivity;->c(I)V

    .line 485
    return-void
.end method
