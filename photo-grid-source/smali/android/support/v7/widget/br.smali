.class final Landroid/support/v7/widget/br;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field a:I

.field b:I

.field c:I

.field final d:I

.field final synthetic e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

.field private f:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Landroid/view/View;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Landroid/support/v7/widget/StaggeredGridLayoutManager;I)V
    .locals 2

    .prologue
    const/high16 v1, -0x80000000

    .line 2095
    iput-object p1, p0, Landroid/support/v7/widget/br;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2089
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    .line 2090
    iput v1, p0, Landroid/support/v7/widget/br;->a:I

    .line 2091
    iput v1, p0, Landroid/support/v7/widget/br;->b:I

    .line 2092
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/br;->c:I

    .line 2096
    iput p2, p0, Landroid/support/v7/widget/br;->d:I

    .line 2097
    return-void
.end method

.method synthetic constructor <init>(Landroid/support/v7/widget/StaggeredGridLayoutManager;IB)V
    .locals 0

    .prologue
    .line 2086
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/br;-><init>(Landroid/support/v7/widget/StaggeredGridLayoutManager;I)V

    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/br;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 2086
    iget-object v0, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    return-object v0
.end method

.method private f()V
    .locals 3

    .prologue
    .line 2111
    iget-object v0, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 9261
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 2113
    iget-object v2, p0, Landroid/support/v7/widget/br;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v2, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/br;->a:I

    .line 2114
    iget-boolean v0, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v0, :cond_0

    .line 2115
    iget-object v0, p0, Landroid/support/v7/widget/br;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    .line 9416
    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->c()I

    move-result v1

    .line 2115
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->d(I)Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    move-result-object v0

    .line 2117
    if-eqz v0, :cond_0

    iget v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->b:I

    const/4 v2, -0x1

    if-ne v1, v2, :cond_0

    .line 2118
    iget v1, p0, Landroid/support/v7/widget/br;->a:I

    iget v2, p0, Landroid/support/v7/widget/br;->d:I

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->a(I)I

    move-result v0

    sub-int v0, v1, v0

    iput v0, p0, Landroid/support/v7/widget/br;->a:I

    .line 2121
    :cond_0
    return-void
.end method

.method private g()V
    .locals 3

    .prologue
    .line 2145
    iget-object v0, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    iget-object v1, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 10261
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 2147
    iget-object v2, p0, Landroid/support/v7/widget/br;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v2, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/br;->b:I

    .line 2148
    iget-boolean v0, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->f:Z

    if-eqz v0, :cond_0

    .line 2149
    iget-object v0, p0, Landroid/support/v7/widget/br;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager;->f:Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;

    .line 10416
    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->c()I

    move-result v1

    .line 2149
    invoke-virtual {v0, v1}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup;->d(I)Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;

    move-result-object v0

    .line 2151
    if-eqz v0, :cond_0

    iget v1, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->b:I

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 2152
    iget v1, p0, Landroid/support/v7/widget/br;->b:I

    iget v2, p0, Landroid/support/v7/widget/br;->d:I

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;->a(I)I

    move-result v0

    add-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/br;->b:I

    .line 2155
    :cond_0
    return-void
.end method


# virtual methods
.method final a()I
    .locals 2

    .prologue
    .line 2125
    iget v0, p0, Landroid/support/v7/widget/br;->a:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    .line 2126
    iget v0, p0, Landroid/support/v7/widget/br;->a:I

    .line 2129
    :goto_0
    return v0

    .line 2128
    :cond_0
    invoke-direct {p0}, Landroid/support/v7/widget/br;->f()V

    .line 2129
    iget v0, p0, Landroid/support/v7/widget/br;->a:I

    goto :goto_0
.end method

.method final a(I)I
    .locals 2

    .prologue
    .line 2100
    iget v0, p0, Landroid/support/v7/widget/br;->a:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    .line 2101
    iget p1, p0, Landroid/support/v7/widget/br;->a:I

    .line 2107
    :cond_0
    :goto_0
    return p1

    .line 2103
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_0

    .line 2106
    invoke-direct {p0}, Landroid/support/v7/widget/br;->f()V

    .line 2107
    iget p1, p0, Landroid/support/v7/widget/br;->a:I

    goto :goto_0
.end method

.method final a(Landroid/view/View;)V
    .locals 4

    .prologue
    const/high16 v3, -0x80000000

    .line 2167
    .line 11261
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 2168
    iput-object p0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    .line 2169
    iget-object v1, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    const/4 v2, 0x0

    invoke-virtual {v1, v2, p1}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 2170
    iput v3, p0, Landroid/support/v7/widget/br;->a:I

    .line 2171
    iget-object v1, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 2172
    iput v3, p0, Landroid/support/v7/widget/br;->b:I

    .line 11388
    :cond_0
    iget-object v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->n()Z

    move-result v1

    .line 2174
    if-nez v1, :cond_1

    .line 11399
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->l()Z

    move-result v0

    .line 2174
    if-eqz v0, :cond_2

    .line 2175
    :cond_1
    iget v0, p0, Landroid/support/v7/widget/br;->c:I

    iget-object v1, p0, Landroid/support/v7/widget/br;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v1, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, p1}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/br;->c:I

    .line 2177
    :cond_2
    return-void
.end method

.method final b()I
    .locals 2

    .prologue
    .line 2159
    iget v0, p0, Landroid/support/v7/widget/br;->b:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    .line 2160
    iget v0, p0, Landroid/support/v7/widget/br;->b:I

    .line 2163
    :goto_0
    return v0

    .line 2162
    :cond_0
    invoke-direct {p0}, Landroid/support/v7/widget/br;->g()V

    .line 2163
    iget v0, p0, Landroid/support/v7/widget/br;->b:I

    goto :goto_0
.end method

.method final b(I)I
    .locals 2

    .prologue
    .line 2133
    iget v0, p0, Landroid/support/v7/widget/br;->b:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    .line 2134
    iget p1, p0, Landroid/support/v7/widget/br;->b:I

    .line 2141
    :cond_0
    :goto_0
    return p1

    .line 2136
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 2137
    if-eqz v0, :cond_0

    .line 2140
    invoke-direct {p0}, Landroid/support/v7/widget/br;->g()V

    .line 2141
    iget p1, p0, Landroid/support/v7/widget/br;->b:I

    goto :goto_0
.end method

.method final b(Landroid/view/View;)V
    .locals 4

    .prologue
    const/high16 v3, -0x80000000

    .line 2180
    .line 12261
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 2181
    iput-object p0, v0, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    .line 2182
    iget-object v1, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2183
    iput v3, p0, Landroid/support/v7/widget/br;->b:I

    .line 2184
    iget-object v1, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 2185
    iput v3, p0, Landroid/support/v7/widget/br;->a:I

    .line 12388
    :cond_0
    iget-object v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->n()Z

    move-result v1

    .line 2187
    if-nez v1, :cond_1

    .line 12399
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->l()Z

    move-result v0

    .line 2187
    if-eqz v0, :cond_2

    .line 2188
    :cond_1
    iget v0, p0, Landroid/support/v7/widget/br;->c:I

    iget-object v1, p0, Landroid/support/v7/widget/br;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v1, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, p1}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/br;->c:I

    .line 2190
    :cond_2
    return-void
.end method

.method final c()V
    .locals 2

    .prologue
    const/high16 v1, -0x80000000

    .line 2215
    iget-object v0, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 13221
    iput v1, p0, Landroid/support/v7/widget/br;->a:I

    .line 13222
    iput v1, p0, Landroid/support/v7/widget/br;->b:I

    .line 2217
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/br;->c:I

    .line 2218
    return-void
.end method

.method final c(I)V
    .locals 0

    .prologue
    .line 2226
    iput p1, p0, Landroid/support/v7/widget/br;->a:I

    iput p1, p0, Landroid/support/v7/widget/br;->b:I

    .line 2227
    return-void
.end method

.method final d()V
    .locals 5

    .prologue
    const/high16 v4, -0x80000000

    .line 2230
    iget-object v0, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 2231
    iget-object v0, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    add-int/lit8 v1, v2, -0x1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 13261
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 2233
    const/4 v3, 0x0

    iput-object v3, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    .line 13388
    iget-object v3, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->n()Z

    move-result v3

    .line 2234
    if-nez v3, :cond_0

    .line 13399
    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->l()Z

    move-result v1

    .line 2234
    if-eqz v1, :cond_1

    .line 2235
    :cond_0
    iget v1, p0, Landroid/support/v7/widget/br;->c:I

    iget-object v3, p0, Landroid/support/v7/widget/br;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v3, v3, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v0

    sub-int v0, v1, v0

    iput v0, p0, Landroid/support/v7/widget/br;->c:I

    .line 2237
    :cond_1
    const/4 v0, 0x1

    if-ne v2, v0, :cond_2

    .line 2238
    iput v4, p0, Landroid/support/v7/widget/br;->a:I

    .line 2240
    :cond_2
    iput v4, p0, Landroid/support/v7/widget/br;->b:I

    .line 2241
    return-void
.end method

.method final d(I)V
    .locals 2

    .prologue
    const/high16 v1, -0x80000000

    .line 2265
    iget v0, p0, Landroid/support/v7/widget/br;->a:I

    if-eq v0, v1, :cond_0

    .line 2266
    iget v0, p0, Landroid/support/v7/widget/br;->a:I

    add-int/2addr v0, p1

    iput v0, p0, Landroid/support/v7/widget/br;->a:I

    .line 2268
    :cond_0
    iget v0, p0, Landroid/support/v7/widget/br;->b:I

    if-eq v0, v1, :cond_1

    .line 2269
    iget v0, p0, Landroid/support/v7/widget/br;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Landroid/support/v7/widget/br;->b:I

    .line 2271
    :cond_1
    return-void
.end method

.method final e()V
    .locals 4

    .prologue
    const/high16 v3, -0x80000000

    .line 2244
    iget-object v0, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    .line 14261
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;

    .line 2246
    const/4 v2, 0x0

    iput-object v2, v1, Landroid/support/v7/widget/StaggeredGridLayoutManager$LayoutParams;->e:Landroid/support/v7/widget/br;

    .line 2247
    iget-object v2, p0, Landroid/support/v7/widget/br;->f:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-nez v2, :cond_0

    .line 2248
    iput v3, p0, Landroid/support/v7/widget/br;->b:I

    .line 14388
    :cond_0
    iget-object v2, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v2}, Landroid/support/v7/widget/bi;->n()Z

    move-result v2

    .line 2250
    if-nez v2, :cond_1

    .line 14399
    iget-object v1, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->l()Z

    move-result v1

    .line 2250
    if-eqz v1, :cond_2

    .line 2251
    :cond_1
    iget v1, p0, Landroid/support/v7/widget/br;->c:I

    iget-object v2, p0, Landroid/support/v7/widget/br;->e:Landroid/support/v7/widget/StaggeredGridLayoutManager;

    iget-object v2, v2, Landroid/support/v7/widget/StaggeredGridLayoutManager;->a:Landroid/support/v7/widget/ad;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v0

    sub-int v0, v1, v0

    iput v0, p0, Landroid/support/v7/widget/br;->c:I

    .line 2253
    :cond_2
    iput v3, p0, Landroid/support/v7/widget/br;->a:I

    .line 2254
    return-void
.end method
