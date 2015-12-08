.class final Lcom/roidapp/photogrid/release/hn;
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
    .line 151
    iput-object p1, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    const/4 v4, 0x0

    .line 155
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    iget v0, v0, Lcom/roidapp/photogrid/release/hk;->e:I

    if-nez v0, :cond_0

    .line 156
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v2}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v2

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, v0, Lcom/roidapp/photogrid/release/hk;->e:I

    .line 158
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->c(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->c(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a()I

    move-result v0

    if-nez v0, :cond_1

    .line 159
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->c(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    move-result-object v2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v3}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v3

    if-le v0, v3, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->getWidth()I

    move-result v0

    :goto_0
    invoke-virtual {v2, v0}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(I)V

    .line 161
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    iget v0, v0, Lcom/roidapp/photogrid/release/hk;->e:I

    if-nez v0, :cond_3

    .line 175
    :goto_1
    return-void

    .line 159
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v0}, Lcom/roidapp/photogrid/release/hk;->b(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/HorizontalScrollViewEx;->a()Landroid/widget/LinearLayout;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/LinearLayout;->getWidth()I

    move-result v0

    goto :goto_0

    .line 165
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    iget v0, v0, Lcom/roidapp/photogrid/release/hk;->e:I

    int-to-float v0, v0

    div-float v0, p1, v0

    .line 166
    cmpg-float v2, v0, v1

    if-gez v2, :cond_4

    move v0, v1

    .line 171
    :cond_4
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v1, v4, v4}, Lcom/roidapp/photogrid/release/ng;->a(ZZ)V

    .line 172
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ng;->s()V

    .line 173
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/hk;->b:Lcom/roidapp/photogrid/release/ng;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ng;->o()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, v0

    float-to-int v2, v2

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/release/ng;->l(I)V

    .line 174
    iget-object v1, p0, Lcom/roidapp/photogrid/release/hn;->a:Lcom/roidapp/photogrid/release/hk;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hk;->c(Lcom/roidapp/photogrid/release/hk;)Lcom/roidapp/photogrid/video/ScrollImageViewEx;

    move-result-object v1

    const/high16 v2, 0x44800000    # 1024.0f

    mul-float/2addr v0, v2

    float-to-int v0, v0

    invoke-virtual {v1, v0, v4}, Lcom/roidapp/photogrid/video/ScrollImageViewEx;->a(IZ)V

    goto :goto_1
.end method
