.class final Lcom/roidapp/photogrid/release/fh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/fb;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/fb;)V
    .locals 0

    .prologue
    .line 466
    iput-object p1, p0, Lcom/roidapp/photogrid/release/fh;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .prologue
    .line 468
    iget-object v0, p0, Lcom/roidapp/photogrid/release/fh;->a:Lcom/roidapp/photogrid/release/fb;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/fb;->d(Lcom/roidapp/photogrid/release/fb;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    const/16 v1, 0x42

    invoke-virtual {v0, v1}, Landroid/widget/HorizontalScrollView;->fullScroll(I)Z

    .line 469
    return-void
.end method
