.class final Lcom/roidapp/photogrid/release/ho;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/release/hr;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/hk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/hk;)V
    .locals 0

    .prologue
    .line 178
    iput-object p1, p0, Lcom/roidapp/photogrid/release/ho;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 181
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ho;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 182
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ho;->a:Lcom/roidapp/photogrid/release/hk;

    iget v0, v0, Lcom/roidapp/photogrid/release/hk;->e:I

    if-nez v0, :cond_0

    .line 183
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ho;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ho;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v1

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ho;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/roidapp/photogrid/release/hk;->e:I

    .line 186
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ho;->a:Lcom/roidapp/photogrid/release/hk;

    iget v0, v0, Lcom/roidapp/photogrid/release/hk;->e:I

    if-lez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/ho;->a:Lcom/roidapp/photogrid/release/hk;

    iget v0, v0, Lcom/roidapp/photogrid/release/hk;->f:I

    if-eqz v0, :cond_1

    .line 187
    iget-object v0, p0, Lcom/roidapp/photogrid/release/ho;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/release/ho;->a:Lcom/roidapp/photogrid/release/hk;

    iget v1, v1, Lcom/roidapp/photogrid/release/hk;->e:I

    iget-object v2, p0, Lcom/roidapp/photogrid/release/ho;->a:Lcom/roidapp/photogrid/release/hk;

    iget v2, v2, Lcom/roidapp/photogrid/release/hk;->f:I

    mul-int/2addr v1, v2

    shr-int/lit8 v1, v1, 0xa

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->b(I)V

    .line 192
    :cond_1
    return-void
.end method
