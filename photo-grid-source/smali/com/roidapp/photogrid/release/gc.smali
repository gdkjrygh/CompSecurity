.class final Lcom/roidapp/photogrid/release/gc;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/AbsListView$OnScrollListener;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/ga;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/ga;)V
    .locals 0

    .prologue
    .line 162
    iput-object p1, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onScroll(Landroid/widget/AbsListView;III)V
    .locals 3

    .prologue
    .line 170
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ga;->isDetached()Z

    move-result v0

    if-nez v0, :cond_0

    if-nez p4, :cond_1

    .line 188
    :cond_0
    :goto_0
    return-void

    .line 171
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0, p2}, Lcom/roidapp/photogrid/release/ga;->a(Lcom/roidapp/photogrid/release/ga;I)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 172
    invoke-static {p1}, Lcom/roidapp/photogrid/release/ga;->a(Landroid/widget/AbsListView;)I

    move-result v1

    .line 173
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ga;->b(Lcom/roidapp/photogrid/release/ga;)I

    move-result v0

    sub-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    move-result v0

    iget-object v2, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/ga;->c(Lcom/roidapp/photogrid/release/ga;)I

    move-result v2

    if-le v0, v2, :cond_3

    const/4 v0, 0x1

    .line 174
    :goto_1
    if-eqz v0, :cond_2

    .line 175
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ga;->b(Lcom/roidapp/photogrid/release/ga;)I

    move-result v0

    if-le v0, v1, :cond_2

    .line 176
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ga;->d(Lcom/roidapp/photogrid/release/ga;)V

    .line 179
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ga;->b(Lcom/roidapp/photogrid/release/ga;I)I

    goto :goto_0

    .line 173
    :cond_3
    const/4 v0, 0x0

    goto :goto_1

    .line 181
    :cond_4
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ga;->e(Lcom/roidapp/photogrid/release/ga;)I

    move-result v0

    if-le p2, v0, :cond_5

    .line 182
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/ga;->d(Lcom/roidapp/photogrid/release/ga;)V

    .line 185
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {p1}, Lcom/roidapp/photogrid/release/ga;->a(Landroid/widget/AbsListView;)I

    move-result v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/release/ga;->b(Lcom/roidapp/photogrid/release/ga;I)I

    .line 186
    iget-object v0, p0, Lcom/roidapp/photogrid/release/gc;->a:Lcom/roidapp/photogrid/release/ga;

    invoke-static {v0, p2}, Lcom/roidapp/photogrid/release/ga;->c(Lcom/roidapp/photogrid/release/ga;I)I

    goto :goto_0
.end method

.method public final onScrollStateChanged(Landroid/widget/AbsListView;I)V
    .locals 0

    .prologue
    .line 166
    return-void
.end method
