.class final Lcom/roidapp/photogrid/release/ct;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/cs;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/cs;)V
    .locals 0

    .prologue
    .line 414
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ct;->a:Lcom/roidapp/photogrid/release/cs;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 3

    .prologue
    .line 419
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->d()I

    move-result v0

    if-lez v0, :cond_0

    .line 420
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ct;->a:Lcom/roidapp/photogrid/release/cs;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/cs;->a(Lcom/roidapp/photogrid/release/cs;)Landroid/widget/HorizontalScrollView;

    move-result-object v0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->d()I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/widget/HorizontalScrollView;->scrollTo(II)V

    .line 422
    :cond_0
    return-void
.end method
