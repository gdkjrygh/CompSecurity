.class final Lcom/roidapp/photogrid/release/hq;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/roidapp/photogrid/release/hs;


# instance fields
.field final synthetic a:Lcom/roidapp/photogrid/release/hk;


# direct methods
.method constructor <init>(Lcom/roidapp/photogrid/release/hk;)V
    .locals 0

    .prologue
    .line 210
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 213
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->c(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(F)I

    move-result v0

    .line 214
    if-gez v0, :cond_0

    move v0, v1

    .line 217
    :cond_0
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v2, v1, v1}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 218
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ng;->s()V

    .line 219
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    iget v2, v2, Lcom/roidapp/photogrid/release/hk;->e:I

    if-nez v2, :cond_1

    .line 220
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v3

    invoke-virtual {v3}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v4

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/roidapp/photogrid/release/hk;->e:I

    .line 222
    :cond_1
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/hk;->c(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    move-result-object v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/hk;->c(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a()I

    move-result v2

    if-nez v2, :cond_2

    .line 223
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/hk;->c(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    move-result-object v3

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v2

    iget-object v4, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v4}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v4

    if-le v2, v4, :cond_4

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v2

    :goto_0
    invoke-virtual {v3, v2}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(I)V

    .line 225
    :cond_2
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    iget v2, v2, Lcom/roidapp/photogrid/release/hk;->e:I

    if-lez v2, :cond_3

    .line 226
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    iget v3, v3, Lcom/roidapp/photogrid/release/hk;->e:I

    mul-int/2addr v3, v0

    shr-int/lit8 v3, v3, 0xa

    invoke-virtual {v2, v3, v1}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->scrollTo(II)V

    .line 229
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    int-to-float v0, v0

    const/high16 v2, 0x44800000    # 1024.0f

    div-float/2addr v0, v2

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ng;->o()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-virtual {v1, v0}, Lcom/roidapp/photogrid/release/ng;->l(I)V

    .line 230
    return-void

    .line 223
    :cond_4
    iget-object v2, p0, Lcom/roidapp/photogrid/release/hq;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v2

    goto :goto_0
.end method
