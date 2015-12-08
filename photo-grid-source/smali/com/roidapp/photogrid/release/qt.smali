.class final Lcom/roidapp/photogrid/release/qt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/qs;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/qs;)V
    .locals 0

    .prologue
    .line 277
    iput-object p1, p0, Lcom/roidapp/photogrid/release/qt;->a:Lcom/roidapp/photogrid/release/qs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 281
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qt;->a:Lcom/roidapp/photogrid/release/qs;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/qs;->f:Lcom/roidapp/photogrid/release/RetouchActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->a(Lcom/roidapp/photogrid/release/RetouchActivity;)Landroid/widget/RelativeLayout;

    move-result-object v0

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setVisibility(I)V

    .line 282
    iget-object v0, p0, Lcom/roidapp/photogrid/release/qt;->a:Lcom/roidapp/photogrid/release/qs;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/qs;->f:Lcom/roidapp/photogrid/release/RetouchActivity;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/RetouchActivity;->b(Lcom/roidapp/photogrid/release/RetouchActivity;)V

    .line 283
    return-void
.end method
