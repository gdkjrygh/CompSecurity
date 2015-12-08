.class final Lcom/roidapp/photogrid/release/h;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field a:I

.field final synthetic b:Lcom/roidapp/photogrid/release/c;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/c;)V
    .locals 0

    .prologue
    .line 238
    iput-object p1, p0, Lcom/roidapp/photogrid/release/h;->b:Lcom/roidapp/photogrid/release/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 1

    .prologue
    .line 250
    add-int v0, p2, p3

    iput v0, p0, Lcom/roidapp/photogrid/release/h;->a:I

    .line 251
    return-void
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 1

    .prologue
    .line 243
    iget-object v0, p0, Lcom/roidapp/photogrid/release/h;->b:Lcom/roidapp/photogrid/release/c;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/c;->g(Lcom/roidapp/photogrid/release/c;)Lcom/roidapp/photogrid/release/q;

    move-result-object v0

    if-nez v0, :cond_0

    .line 246
    :cond_0
    return-void
.end method
