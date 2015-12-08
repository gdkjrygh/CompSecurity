.class public Landroid/support/v7/widget/LinearLayoutManager;
.super Landroid/support/v7/widget/au;
.source "SourceFile"


# instance fields
.field private a:Landroid/support/v7/widget/y;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field j:I

.field k:Landroid/support/v7/widget/ad;

.field l:Z

.field m:I

.field n:I

.field o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

.field final p:Landroid/support/v7/widget/w;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 144
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(B)V

    .line 145
    return-void
.end method

.method private constructor <init>(B)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 153
    invoke-direct {p0}, Landroid/support/v7/widget/au;-><init>()V

    .line 94
    iput-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->c:Z

    .line 101
    iput-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    .line 108
    iput-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    .line 114
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->e:Z

    .line 120
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    .line 126
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    .line 130
    iput-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    .line 136
    new-instance v0, Landroid/support/v7/widget/w;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/w;-><init>(Landroid/support/v7/widget/LinearLayoutManager;)V

    iput-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/w;

    .line 154
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 9372
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Ljava/lang/String;)V

    .line 9373
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->c:Z

    if-eqz v0, :cond_0

    .line 9376
    iput-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->c:Z

    .line 9377
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->n()V

    .line 156
    :cond_0
    return-void
.end method

.method private B()Landroid/view/View;
    .locals 1

    .prologue
    .line 1485
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method private a(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)I
    .locals 3

    .prologue
    .line 837
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v0

    sub-int/2addr v0, p1

    .line 839
    if-lez v0, :cond_1

    .line 840
    neg-int v0, v0

    invoke-direct {p0, v0, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->d(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v0

    neg-int v0, v0

    .line 845
    add-int v1, p1, v0

    .line 846
    if-eqz p4, :cond_0

    .line 848
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->d()I

    move-result v2

    sub-int v1, v2, v1

    .line 849
    if-lez v1, :cond_0

    .line 850
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/ad;->a(I)V

    .line 851
    add-int/2addr v0, v1

    .line 854
    :cond_0
    :goto_0
    return v0

    .line 842
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;Landroid/support/v7/widget/bf;Z)I
    .locals 8

    .prologue
    const/high16 v7, -0x80000000

    const/4 v6, 0x0

    .line 1310
    iget v1, p2, Landroid/support/v7/widget/y;->c:I

    .line 1311
    iget v0, p2, Landroid/support/v7/widget/y;->g:I

    if-eq v0, v7, :cond_1

    .line 1313
    iget v0, p2, Landroid/support/v7/widget/y;->c:I

    if-gez v0, :cond_0

    .line 1314
    iget v0, p2, Landroid/support/v7/widget/y;->g:I

    iget v2, p2, Landroid/support/v7/widget/y;->c:I

    add-int/2addr v0, v2

    iput v0, p2, Landroid/support/v7/widget/y;->g:I

    .line 1316
    :cond_0
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;)V

    .line 1318
    :cond_1
    iget v0, p2, Landroid/support/v7/widget/y;->c:I

    iget v2, p2, Landroid/support/v7/widget/y;->h:I

    add-int/2addr v0, v2

    .line 1319
    new-instance v2, Landroid/support/v7/widget/x;

    invoke-direct {v2}, Landroid/support/v7/widget/x;-><init>()V

    .line 1320
    :cond_2
    if-lez v0, :cond_7

    invoke-virtual {p2, p3}, Landroid/support/v7/widget/y;->a(Landroid/support/v7/widget/bf;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 20180
    iput v6, v2, Landroid/support/v7/widget/x;->a:I

    .line 20181
    iput-boolean v6, v2, Landroid/support/v7/widget/x;->b:Z

    .line 20182
    iput-boolean v6, v2, Landroid/support/v7/widget/x;->c:Z

    .line 20183
    iput-boolean v6, v2, Landroid/support/v7/widget/x;->d:Z

    .line 1322
    invoke-virtual {p0, p1, p3, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Landroid/support/v7/widget/y;Landroid/support/v7/widget/x;)V

    .line 1323
    iget-boolean v3, v2, Landroid/support/v7/widget/x;->b:Z

    if-nez v3, :cond_7

    .line 1326
    iget v3, p2, Landroid/support/v7/widget/y;->b:I

    iget v4, v2, Landroid/support/v7/widget/x;->a:I

    iget v5, p2, Landroid/support/v7/widget/y;->f:I

    mul-int/2addr v4, v5

    add-int/2addr v3, v4

    iput v3, p2, Landroid/support/v7/widget/y;->b:I

    .line 1333
    iget-boolean v3, v2, Landroid/support/v7/widget/x;->c:Z

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget-object v3, v3, Landroid/support/v7/widget/y;->k:Ljava/util/List;

    if-nez v3, :cond_3

    invoke-virtual {p3}, Landroid/support/v7/widget/bf;->a()Z

    move-result v3

    if-nez v3, :cond_4

    .line 1335
    :cond_3
    iget v3, p2, Landroid/support/v7/widget/y;->c:I

    iget v4, v2, Landroid/support/v7/widget/x;->a:I

    sub-int/2addr v3, v4

    iput v3, p2, Landroid/support/v7/widget/y;->c:I

    .line 1337
    iget v3, v2, Landroid/support/v7/widget/x;->a:I

    sub-int/2addr v0, v3

    .line 1340
    :cond_4
    iget v3, p2, Landroid/support/v7/widget/y;->g:I

    if-eq v3, v7, :cond_6

    .line 1341
    iget v3, p2, Landroid/support/v7/widget/y;->g:I

    iget v4, v2, Landroid/support/v7/widget/x;->a:I

    add-int/2addr v3, v4

    iput v3, p2, Landroid/support/v7/widget/y;->g:I

    .line 1342
    iget v3, p2, Landroid/support/v7/widget/y;->c:I

    if-gez v3, :cond_5

    .line 1343
    iget v3, p2, Landroid/support/v7/widget/y;->g:I

    iget v4, p2, Landroid/support/v7/widget/y;->c:I

    add-int/2addr v3, v4

    iput v3, p2, Landroid/support/v7/widget/y;->g:I

    .line 1345
    :cond_5
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;)V

    .line 1347
    :cond_6
    if-eqz p4, :cond_2

    iget-boolean v3, v2, Landroid/support/v7/widget/x;->d:Z

    if-eqz v3, :cond_2

    .line 1354
    :cond_7
    iget v0, p2, Landroid/support/v7/widget/y;->c:I

    sub-int v0, v1, v0

    return v0
.end method

.method private a(IIZ)Landroid/view/View;
    .locals 7

    .prologue
    .line 1675
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->k()V

    .line 1676
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v3

    .line 1677
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v4

    .line 1678
    if-le p2, p1, :cond_1

    const/4 v0, 0x1

    .line 1679
    :goto_0
    const/4 v2, 0x0

    .line 1680
    :goto_1
    if-eq p1, p2, :cond_3

    .line 1681
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v1

    .line 1682
    iget-object v5, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v1}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v5

    .line 1683
    iget-object v6, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v6, v1}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v6

    .line 1684
    if-ge v5, v4, :cond_4

    if-le v6, v3, :cond_4

    .line 1685
    if-eqz p3, :cond_0

    .line 1686
    if-lt v5, v3, :cond_2

    if-gt v6, v4, :cond_2

    .line 1696
    :cond_0
    :goto_2
    return-object v1

    .line 1678
    :cond_1
    const/4 v0, -0x1

    goto :goto_0

    .line 1688
    :cond_2
    if-nez v2, :cond_4

    .line 1680
    :goto_3
    add-int/2addr p1, v0

    move-object v2, v1

    goto :goto_1

    :cond_3
    move-object v1, v2

    .line 1696
    goto :goto_2

    :cond_4
    move-object v1, v2

    goto :goto_3
.end method

.method private a(Z)Landroid/view/View;
    .locals 2

    .prologue
    .line 1497
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    .line 1498
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v0

    .line 1501
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v1

    invoke-direct {p0, v0, v1, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method private a(IIZLandroid/support/v7/widget/bf;)V
    .locals 6

    .prologue
    const/4 v0, -0x1

    const/4 v1, 0x1

    .line 1107
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    invoke-direct {p0, p4}, Landroid/support/v7/widget/LinearLayoutManager;->g(Landroid/support/v7/widget/bf;)I

    move-result v3

    iput v3, v2, Landroid/support/v7/widget/y;->h:I

    .line 1108
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput p1, v2, Landroid/support/v7/widget/y;->f:I

    .line 1110
    if-ne p1, v1, :cond_2

    .line 1111
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v3, v2, Landroid/support/v7/widget/y;->h:I

    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v4}, Landroid/support/v7/widget/ad;->g()I

    move-result v4

    add-int/2addr v3, v4

    iput v3, v2, Landroid/support/v7/widget/y;->h:I

    .line 1113
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->B()Landroid/view/View;

    move-result-object v2

    .line 1115
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget-boolean v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v4, :cond_1

    :goto_0
    iput v0, v3, Landroid/support/v7/widget/y;->e:I

    .line 1117
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    invoke-static {v2}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v3, v3, Landroid/support/v7/widget/y;->e:I

    add-int/2addr v1, v3

    iput v1, v0, Landroid/support/v7/widget/y;->d:I

    .line 1118
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/y;->b:I

    .line 1120
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->d()I

    move-result v1

    sub-int/2addr v0, v1

    .line 1133
    :goto_1
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput p2, v1, Landroid/support/v7/widget/y;->c:I

    .line 1134
    if-eqz p3, :cond_0

    .line 1135
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v2, v1, Landroid/support/v7/widget/y;->c:I

    sub-int/2addr v2, v0

    iput v2, v1, Landroid/support/v7/widget/y;->c:I

    .line 1137
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v0, v1, Landroid/support/v7/widget/y;->g:I

    .line 1138
    return-void

    :cond_1
    move v0, v1

    .line 1115
    goto :goto_0

    .line 1124
    :cond_2
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->d()Landroid/view/View;

    move-result-object v2

    .line 1125
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v4, v3, Landroid/support/v7/widget/y;->h:I

    iget-object v5, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v5}, Landroid/support/v7/widget/ad;->c()I

    move-result v5

    add-int/2addr v4, v5

    iput v4, v3, Landroid/support/v7/widget/y;->h:I

    .line 1126
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget-boolean v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v4, :cond_3

    :goto_2
    iput v1, v3, Landroid/support/v7/widget/y;->e:I

    .line 1128
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    invoke-static {v2}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v3, v3, Landroid/support/v7/widget/y;->e:I

    add-int/2addr v1, v3

    iput v1, v0, Landroid/support/v7/widget/y;->d:I

    .line 1129
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/y;->b:I

    .line 1130
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v0

    neg-int v0, v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->c()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_1

    :cond_3
    move v1, v0

    .line 1126
    goto :goto_2
.end method

.method private a(Landroid/support/v7/widget/az;II)V
    .locals 1

    .prologue
    .line 1180
    if-ne p2, p3, :cond_1

    .line 1195
    :cond_0
    return-void

    .line 1186
    :cond_1
    if-le p3, p2, :cond_2

    .line 1187
    add-int/lit8 v0, p3, -0x1

    :goto_0
    if-lt v0, p2, :cond_0

    .line 1188
    invoke-virtual {p0, v0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(ILandroid/support/v7/widget/az;)V

    .line 1187
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 1191
    :cond_2
    :goto_1
    if-le p2, p3, :cond_0

    .line 1192
    invoke-virtual {p0, p2, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(ILandroid/support/v7/widget/az;)V

    .line 1191
    add-int/lit8 p2, p2, -0x1

    goto :goto_1
.end method

.method private a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 1286
    iget-boolean v0, p2, Landroid/support/v7/widget/y;->a:Z

    if-nez v0, :cond_1

    .line 19229
    :cond_0
    :goto_0
    return-void

    .line 1289
    :cond_1
    iget v0, p2, Landroid/support/v7/widget/y;->f:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_5

    .line 1290
    iget v0, p2, Landroid/support/v7/widget/y;->g:I

    .line 18245
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v2

    .line 18246
    if-ltz v0, :cond_0

    .line 18253
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3}, Landroid/support/v7/widget/ad;->e()I

    move-result v3

    sub-int/2addr v3, v0

    .line 18254
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_3

    move v0, v1

    .line 18255
    :goto_1
    if-ge v0, v2, :cond_0

    .line 18256
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v4

    .line 18257
    iget-object v5, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v4}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v4

    if-ge v4, v3, :cond_2

    .line 18258
    invoke-direct {p0, p1, v1, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;II)V

    goto :goto_0

    .line 18255
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 18263
    :cond_3
    add-int/lit8 v0, v2, -0x1

    :goto_2
    if-ltz v0, :cond_0

    .line 18264
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v1

    .line 18265
    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v4, v1}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v1

    if-ge v1, v3, :cond_4

    .line 18266
    add-int/lit8 v1, v2, -0x1

    invoke-direct {p0, p1, v1, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;II)V

    goto :goto_0

    .line 18263
    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 1292
    :cond_5
    iget v2, p2, Landroid/support/v7/widget/y;->g:I

    .line 19206
    if-ltz v2, :cond_0

    .line 19215
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v3

    .line 19216
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_7

    .line 19217
    add-int/lit8 v0, v3, -0x1

    :goto_3
    if-ltz v0, :cond_0

    .line 19218
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v1

    .line 19219
    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v4, v1}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v1

    if-le v1, v2, :cond_6

    .line 19220
    add-int/lit8 v1, v3, -0x1

    invoke-direct {p0, p1, v1, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;II)V

    goto :goto_0

    .line 19217
    :cond_6
    add-int/lit8 v0, v0, -0x1

    goto :goto_3

    :cond_7
    move v0, v1

    .line 19225
    :goto_4
    if-ge v0, v3, :cond_0

    .line 19226
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v4

    .line 19227
    iget-object v5, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v4}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v4

    if-le v4, v2, :cond_8

    .line 19228
    invoke-direct {p0, p1, v1, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;II)V

    goto :goto_0

    .line 19225
    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_4
.end method

.method private a(Landroid/support/v7/widget/w;)V
    .locals 2

    .prologue
    .line 883
    iget v0, p1, Landroid/support/v7/widget/w;->a:I

    iget v1, p1, Landroid/support/v7/widget/w;->b:I

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(II)V

    .line 884
    return-void
.end method

.method private b(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)I
    .locals 4

    .prologue
    .line 862
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v0

    sub-int v0, p1, v0

    .line 864
    if-lez v0, :cond_1

    .line 866
    invoke-direct {p0, v0, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->d(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v0

    neg-int v0, v0

    .line 870
    add-int v1, p1, v0

    .line 871
    if-eqz p4, :cond_0

    .line 873
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->c()I

    move-result v2

    sub-int/2addr v1, v2

    .line 874
    if-lez v1, :cond_0

    .line 875
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    neg-int v3, v1

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/ad;->a(I)V

    .line 876
    sub-int/2addr v0, v1

    .line 879
    :cond_0
    :goto_0
    return v0

    .line 868
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Z)Landroid/view/View;
    .locals 2

    .prologue
    .line 1515
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    .line 1516
    const/4 v0, 0x0

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v1

    invoke-direct {p0, v0, v1, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v0

    .line 1519
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method private b(Landroid/support/v7/widget/w;)V
    .locals 2

    .prologue
    .line 897
    iget v0, p1, Landroid/support/v7/widget/w;->a:I

    iget v1, p1, Landroid/support/v7/widget/w;->b:I

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->f(II)V

    .line 898
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 340
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->j()Z

    move-result v1

    if-nez v1, :cond_2

    .line 341
    :cond_0
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->c:Z

    .line 343
    :cond_1
    :goto_0
    iput-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    .line 345
    return-void

    .line 343
    :cond_2
    iget-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->c:Z

    if-eqz v1, :cond_1

    const/4 v0, 0x0

    goto :goto_0
.end method

.method private d(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1141
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move p1, v2

    .line 1163
    :goto_0
    return p1

    .line 1144
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput-boolean v1, v0, Landroid/support/v7/widget/y;->a:Z

    .line 1145
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->k()V

    .line 1146
    if-lez p1, :cond_2

    move v0, v1

    .line 1147
    :goto_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    .line 1148
    invoke-direct {p0, v0, v3, v1, p3}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZLandroid/support/v7/widget/bf;)V

    .line 1149
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v1, v1, Landroid/support/v7/widget/y;->g:I

    .line 1150
    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    invoke-direct {p0, p2, v4, p3, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;Landroid/support/v7/widget/bf;Z)I

    move-result v4

    add-int/2addr v1, v4

    .line 1151
    if-gez v1, :cond_3

    move p1, v2

    .line 1155
    goto :goto_0

    .line 1146
    :cond_2
    const/4 v0, -0x1

    goto :goto_1

    .line 1157
    :cond_3
    if-le v3, v1, :cond_4

    mul-int p1, v0, v1

    .line 1158
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    neg-int v1, p1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/ad;->a(I)V

    .line 1162
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput p1, v0, Landroid/support/v7/widget/y;->j:I

    goto :goto_0
.end method

.method private d()Landroid/view/View;
    .locals 1

    .prologue
    .line 1475
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e(II)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 887
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->d()I

    move-result v2

    sub-int/2addr v2, p2

    iput v2, v0, Landroid/support/v7/widget/y;->c:I

    .line 888
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    iput v0, v2, Landroid/support/v7/widget/y;->e:I

    .line 890
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput p1, v0, Landroid/support/v7/widget/y;->d:I

    .line 891
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v1, v0, Landroid/support/v7/widget/y;->f:I

    .line 892
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput p2, v0, Landroid/support/v7/widget/y;->b:I

    .line 893
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/high16 v1, -0x80000000

    iput v1, v0, Landroid/support/v7/widget/y;->g:I

    .line 894
    return-void

    :cond_0
    move v0, v1

    .line 888
    goto :goto_0
.end method

.method private f(II)V
    .locals 3

    .prologue
    const/4 v1, -0x1

    .line 901
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->c()I

    move-result v2

    sub-int v2, p2, v2

    iput v2, v0, Landroid/support/v7/widget/y;->c:I

    .line 902
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput p1, v0, Landroid/support/v7/widget/y;->d:I

    .line 903
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput v0, v2, Landroid/support/v7/widget/y;->e:I

    .line 905
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v1, v0, Landroid/support/v7/widget/y;->f:I

    .line 906
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput p2, v0, Landroid/support/v7/widget/y;->b:I

    .line 907
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/high16 v1, -0x80000000

    iput v1, v0, Landroid/support/v7/widget/y;->g:I

    .line 909
    return-void

    :cond_0
    move v0, v1

    .line 903
    goto :goto_0
.end method

.method private g(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 414
    invoke-virtual {p1}, Landroid/support/v7/widget/bf;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 415
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->f()I

    move-result v0

    .line 417
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g(I)Landroid/view/View;
    .locals 2

    .prologue
    .line 1557
    const/4 v0, 0x0

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v1

    invoke-virtual {p0, v0, v1, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(III)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private h(Landroid/support/v7/widget/bf;)I
    .locals 7

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 1041
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    if-nez v0, :cond_0

    .line 1045
    :goto_0
    return v4

    .line 1044
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->k()V

    .line 1045
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->e:Z

    if-nez v0, :cond_1

    move v0, v3

    :goto_1
    invoke-direct {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->e:Z

    if-nez v0, :cond_2

    :goto_2
    invoke-direct {p0, v3}, Landroid/support/v7/widget/LinearLayoutManager;->b(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroid/support/v7/widget/LinearLayoutManager;->e:Z

    iget-boolean v6, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v6}, Landroid/support/v7/widget/bl;->a(Landroid/support/v7/widget/bf;Landroid/support/v7/widget/ad;Landroid/view/View;Landroid/view/View;Landroid/support/v7/widget/au;ZZ)I

    move-result v4

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_1

    :cond_2
    move v3, v4

    goto :goto_2
.end method

.method private h(I)Landroid/view/View;
    .locals 2

    .prologue
    .line 1561
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(III)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private i(Landroid/support/v7/widget/bf;)I
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 1052
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    if-nez v0, :cond_0

    .line 1056
    :goto_0
    return v4

    .line 1055
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->k()V

    .line 1056
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->e:Z

    if-nez v0, :cond_1

    move v0, v3

    :goto_1
    invoke-direct {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->e:Z

    if-nez v0, :cond_2

    :goto_2
    invoke-direct {p0, v3}, Landroid/support/v7/widget/LinearLayoutManager;->b(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroid/support/v7/widget/LinearLayoutManager;->e:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Landroid/support/v7/widget/bl;->a(Landroid/support/v7/widget/bf;Landroid/support/v7/widget/ad;Landroid/view/View;Landroid/view/View;Landroid/support/v7/widget/au;Z)I

    move-result v4

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_1

    :cond_2
    move v3, v4

    goto :goto_2
.end method

.method private j(Landroid/support/v7/widget/bf;)I
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 1063
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    if-nez v0, :cond_0

    .line 1067
    :goto_0
    return v4

    .line 1066
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->k()V

    .line 1067
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->e:Z

    if-nez v0, :cond_1

    move v0, v3

    :goto_1
    invoke-direct {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Z)Landroid/view/View;

    move-result-object v2

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->e:Z

    if-nez v0, :cond_2

    :goto_2
    invoke-direct {p0, v3}, Landroid/support/v7/widget/LinearLayoutManager;->b(Z)Landroid/view/View;

    move-result-object v3

    iget-boolean v5, p0, Landroid/support/v7/widget/LinearLayoutManager;->e:Z

    move-object v0, p1

    move-object v4, p0

    invoke-static/range {v0 .. v5}, Landroid/support/v7/widget/bl;->b(Landroid/support/v7/widget/bf;Landroid/support/v7/widget/ad;Landroid/view/View;Landroid/view/View;Landroid/support/v7/widget/au;Z)I

    move-result v4

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_1

    :cond_2
    move v3, v4

    goto :goto_2
.end method

.method private k(Landroid/support/v7/widget/bf;)Landroid/view/View;
    .locals 1

    .prologue
    .line 1536
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v7/widget/bf;->e()I

    move-result v0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->g(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Landroid/support/v7/widget/bf;->e()I

    move-result v0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->h(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method private l(Landroid/support/v7/widget/bf;)Landroid/view/View;
    .locals 1

    .prologue
    .line 1552
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Landroid/support/v7/widget/bf;->e()I

    move-result v0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->h(I)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p1}, Landroid/support/v7/widget/bf;->e()I

    move-result v0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->g(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method


# virtual methods
.method public final a(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 2

    .prologue
    .line 992
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 993
    const/4 v0, 0x0

    .line 995
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->d(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v0

    goto :goto_0
.end method

.method public final a(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 1012
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->h(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final a(I)Landroid/view/View;
    .locals 2

    .prologue
    .line 385
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    .line 386
    if-nez v0, :cond_1

    .line 387
    const/4 v0, 0x0

    .line 398
    :cond_0
    :goto_0
    return-object v0

    .line 389
    :cond_1
    const/4 v1, 0x0

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v1

    .line 390
    sub-int v1, p1, v1

    .line 391
    if-ltz v1, :cond_2

    if-ge v1, v0, :cond_2

    .line 392
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v0

    .line 393
    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v1

    if-eq v1, p1, :cond_0

    .line 398
    :cond_2
    invoke-super {p0, p1}, Landroid/support/v7/widget/au;->a(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method a(III)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 1566
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->k()V

    .line 1569
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v5

    .line 1570
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v6

    .line 1571
    if-le p2, p1, :cond_0

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    move-object v4, v2

    .line 1572
    :goto_1
    if-eq p1, p2, :cond_3

    .line 1573
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v3

    .line 1574
    invoke-static {v3}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    .line 1575
    if-ltz v0, :cond_6

    if-ge v0, p3, :cond_6

    .line 1576
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 22388
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->n()Z

    move-result v0

    .line 1576
    if-eqz v0, :cond_1

    .line 1577
    if-nez v4, :cond_6

    move-object v0, v2

    .line 1572
    :goto_2
    add-int/2addr p1, v1

    move-object v2, v0

    move-object v4, v3

    goto :goto_1

    .line 1571
    :cond_0
    const/4 v0, -0x1

    move v1, v0

    goto :goto_0

    .line 1580
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v0

    if-ge v0, v6, :cond_2

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v0

    if-ge v0, v5, :cond_4

    .line 1582
    :cond_2
    if-nez v2, :cond_6

    move-object v0, v3

    move-object v3, v4

    .line 1583
    goto :goto_2

    .line 1590
    :cond_3
    if-eqz v2, :cond_5

    move-object v3, v2

    :cond_4
    :goto_3
    return-object v3

    :cond_5
    move-object v3, v4

    goto :goto_3

    :cond_6
    move-object v0, v2

    move-object v3, v4

    goto :goto_2
.end method

.method public final a(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 260
    instance-of v0, p1, Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_0

    .line 261
    check-cast p1, Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    iput-object p1, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    .line 262
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->n()V

    .line 269
    :cond_0
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;)V
    .locals 2

    .prologue
    .line 424
    new-instance v0, Landroid/support/v7/widget/v;

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/support/v7/widget/v;-><init>(Landroid/support/v7/widget/LinearLayoutManager;Landroid/content/Context;)V

    .line 432
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/aa;->b(I)V

    .line 433
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/bd;)V

    .line 434
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/az;)V
    .locals 1

    .prologue
    .line 213
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/au;->a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/az;)V

    .line 214
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->f:Z

    if-eqz v0, :cond_0

    .line 215
    invoke-virtual {p0, p2}, Landroid/support/v7/widget/LinearLayoutManager;->c(Landroid/support/v7/widget/az;)V

    .line 216
    invoke-virtual {p2}, Landroid/support/v7/widget/az;->a()V

    .line 218
    :cond_0
    return-void
.end method

.method a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Landroid/support/v7/widget/y;Landroid/support/v7/widget/x;)V
    .locals 11

    .prologue
    const/4 v1, 0x0

    const/4 v9, -0x1

    const/4 v5, 0x1

    .line 1359
    invoke-virtual {p3, p1}, Landroid/support/v7/widget/y;->a(Landroid/support/v7/widget/az;)Landroid/view/View;

    move-result-object v6

    .line 1360
    if-nez v6, :cond_0

    .line 1366
    iput-boolean v5, p4, Landroid/support/v7/widget/x;->b:Z

    .line 1429
    :goto_0
    return-void

    .line 1369
    :cond_0
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 1370
    iget-object v2, p3, Landroid/support/v7/widget/y;->k:Ljava/util/List;

    if-nez v2, :cond_5

    .line 1371
    iget-boolean v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    iget v3, p3, Landroid/support/v7/widget/y;->f:I

    if-ne v3, v9, :cond_1

    move v1, v5

    :cond_1
    if-ne v2, v1, :cond_4

    .line 1373
    invoke-virtual {p0, v6}, Landroid/support/v7/widget/LinearLayoutManager;->c(Landroid/view/View;)V

    .line 20621
    :goto_1
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 20623
    iget-object v2, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v6}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v2

    .line 20624
    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v4, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x0

    .line 20625
    iget v4, v2, Landroid/graphics/Rect;->top:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v4

    add-int/lit8 v2, v2, 0x0

    .line 20627
    invoke-virtual {p0}, Landroid/support/v7/widget/au;->s()I

    move-result v4

    invoke-virtual {p0}, Landroid/support/v7/widget/au;->u()I

    move-result v7

    invoke-virtual {p0}, Landroid/support/v7/widget/au;->w()I

    move-result v8

    add-int/2addr v7, v8

    iget v8, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->leftMargin:I

    add-int/2addr v7, v8

    iget v8, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->rightMargin:I

    add-int/2addr v7, v8

    add-int/2addr v3, v7

    iget v7, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->width:I

    invoke-virtual {p0}, Landroid/support/v7/widget/au;->g()Z

    move-result v8

    invoke-static {v4, v3, v7, v8}, Landroid/support/v7/widget/au;->a(IIIZ)I

    move-result v3

    .line 20631
    invoke-virtual {p0}, Landroid/support/v7/widget/au;->t()I

    move-result v4

    invoke-virtual {p0}, Landroid/support/v7/widget/au;->v()I

    move-result v7

    invoke-virtual {p0}, Landroid/support/v7/widget/au;->x()I

    move-result v8

    add-int/2addr v7, v8

    iget v8, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->topMargin:I

    add-int/2addr v7, v8

    iget v8, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->bottomMargin:I

    add-int/2addr v7, v8

    add-int/2addr v2, v7

    iget v1, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->height:I

    invoke-virtual {p0}, Landroid/support/v7/widget/au;->h()Z

    move-result v7

    invoke-static {v4, v2, v1, v7}, Landroid/support/v7/widget/au;->a(IIIZ)I

    move-result v1

    .line 20635
    invoke-virtual {v6, v3, v1}, Landroid/view/View;->measure(II)V

    .line 1386
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v1

    iput v1, p4, Landroid/support/v7/widget/x;->a:I

    .line 1388
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-ne v1, v5, :cond_a

    .line 1389
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->j()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 1390
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->s()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->w()I

    move-result v2

    sub-int/2addr v1, v2

    .line 1391
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v2, v6}, Landroid/support/v7/widget/ad;->d(Landroid/view/View;)I

    move-result v2

    sub-int v2, v1, v2

    .line 1396
    :goto_2
    iget v3, p3, Landroid/support/v7/widget/y;->f:I

    if-ne v3, v9, :cond_9

    .line 1397
    iget v3, p3, Landroid/support/v7/widget/y;->b:I

    .line 1398
    iget v4, p3, Landroid/support/v7/widget/y;->b:I

    iget v7, p4, Landroid/support/v7/widget/x;->a:I

    sub-int/2addr v4, v7

    move v10, v3

    move v3, v4

    move v4, v2

    move v2, v1

    move v1, v10

    .line 1417
    :goto_3
    iget v7, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->leftMargin:I

    add-int/2addr v4, v7

    iget v7, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->topMargin:I

    add-int/2addr v3, v7

    iget v7, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->rightMargin:I

    sub-int/2addr v2, v7

    iget v7, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->bottomMargin:I

    sub-int/2addr v1, v7

    invoke-static {v6, v4, v3, v2, v1}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/view/View;IIII)V

    .line 21388
    iget-object v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v1}, Landroid/support/v7/widget/bi;->n()Z

    move-result v1

    .line 1425
    if-nez v1, :cond_2

    .line 21399
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->l()Z

    move-result v0

    .line 1425
    if-eqz v0, :cond_3

    .line 1426
    :cond_2
    iput-boolean v5, p4, Landroid/support/v7/widget/x;->c:Z

    .line 1428
    :cond_3
    invoke-virtual {v6}, Landroid/view/View;->isFocusable()Z

    move-result v0

    iput-boolean v0, p4, Landroid/support/v7/widget/x;->d:Z

    goto/16 :goto_0

    .line 1375
    :cond_4
    invoke-virtual {p0, v6}, Landroid/support/v7/widget/LinearLayoutManager;->d(Landroid/view/View;)V

    goto/16 :goto_1

    .line 1378
    :cond_5
    iget-boolean v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    iget v3, p3, Landroid/support/v7/widget/y;->f:I

    if-ne v3, v9, :cond_6

    move v1, v5

    :cond_6
    if-ne v2, v1, :cond_7

    .line 1380
    invoke-virtual {p0, v6}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/view/View;)V

    goto/16 :goto_1

    .line 1382
    :cond_7
    invoke-virtual {p0, v6}, Landroid/support/v7/widget/LinearLayoutManager;->b(Landroid/view/View;)V

    goto/16 :goto_1

    .line 1393
    :cond_8
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->u()I

    move-result v2

    .line 1394
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/ad;->d(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v2

    goto :goto_2

    .line 1400
    :cond_9
    iget v4, p3, Landroid/support/v7/widget/y;->b:I

    .line 1401
    iget v3, p3, Landroid/support/v7/widget/y;->b:I

    iget v7, p4, Landroid/support/v7/widget/x;->a:I

    add-int/2addr v3, v7

    move v10, v3

    move v3, v4

    move v4, v2

    move v2, v1

    move v1, v10

    goto :goto_3

    .line 1404
    :cond_a
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->v()I

    move-result v3

    .line 1405
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/ad;->d(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v3

    .line 1407
    iget v2, p3, Landroid/support/v7/widget/y;->f:I

    if-ne v2, v9, :cond_b

    .line 1408
    iget v2, p3, Landroid/support/v7/widget/y;->b:I

    .line 1409
    iget v4, p3, Landroid/support/v7/widget/y;->b:I

    iget v7, p4, Landroid/support/v7/widget/x;->a:I

    sub-int/2addr v4, v7

    goto :goto_3

    .line 1411
    :cond_b
    iget v4, p3, Landroid/support/v7/widget/y;->b:I

    .line 1412
    iget v2, p3, Landroid/support/v7/widget/y;->b:I

    iget v7, p4, Landroid/support/v7/widget/x;->a:I

    add-int/2addr v2, v7

    goto :goto_3
.end method

.method a(Landroid/support/v7/widget/bf;Landroid/support/v7/widget/w;)V
    .locals 0

    .prologue
    .line 623
    return-void
.end method

.method public final a(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .prologue
    .line 222
    invoke-super {p0, p1}, Landroid/support/v7/widget/au;->a(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 223
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    if-lez v0, :cond_0

    .line 224
    invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->asRecord(Landroid/view/accessibility/AccessibilityEvent;)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;

    move-result-object v0

    .line 226
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->l()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setFromIndex(I)V

    .line 227
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->m()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setToIndex(I)V

    .line 229
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1168
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-nez v0, :cond_0

    .line 1169
    invoke-super {p0, p1}, Landroid/support/v7/widget/au;->a(Ljava/lang/String;)V

    .line 1171
    :cond_0
    return-void
.end method

.method public final b(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 1004
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-nez v0, :cond_0

    .line 1005
    const/4 v0, 0x0

    .line 1007
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->d(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)I

    move-result v0

    goto :goto_0
.end method

.method public final b(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 1017
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->h(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public b()Landroid/support/v7/widget/RecyclerView$LayoutParams;
    .locals 2

    .prologue
    const/4 v1, -0x2

    .line 179
    new-instance v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    invoke-direct {v0, v1, v1}, Landroid/support/v7/widget/RecyclerView$LayoutParams;-><init>(II)V

    return-object v0
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 949
    iput p1, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    .line 950
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    .line 951
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_0

    .line 952
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    .line 18047
    const/4 v1, -0x1

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a:I

    .line 954
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->n()V

    .line 955
    return-void
.end method

.method public final c(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 1022
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->i(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final c(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v0, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x1

    const/high16 v6, -0x80000000

    .line 1702
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->c()V

    .line 1703
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v1

    if-nez v1, :cond_1

    .line 1740
    :cond_0
    :goto_0
    return-object v0

    .line 22442
    :cond_1
    sparse-switch p1, :sswitch_data_0

    move v3, v6

    .line 1708
    :goto_1
    if-eq v3, v6, :cond_0

    .line 1711
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->k()V

    .line 1713
    if-ne v3, v4, :cond_6

    .line 1714
    invoke-direct {p0, p3}, Landroid/support/v7/widget/LinearLayoutManager;->l(Landroid/support/v7/widget/bf;)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    .line 1718
    :goto_2
    if-eqz v2, :cond_0

    .line 1725
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->k()V

    .line 1726
    const v1, 0x3ea8f5c3    # 0.33f

    iget-object v7, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v7}, Landroid/support/v7/widget/ad;->f()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v1, v7

    float-to-int v1, v1

    .line 1727
    invoke-direct {p0, v3, v1, v8, p3}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZLandroid/support/v7/widget/bf;)V

    .line 1728
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v6, v1, Landroid/support/v7/widget/y;->g:I

    .line 1729
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput-boolean v8, v1, Landroid/support/v7/widget/y;->a:Z

    .line 1730
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    invoke-direct {p0, p2, v1, p3, v5}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;Landroid/support/v7/widget/bf;Z)I

    .line 1732
    if-ne v3, v4, :cond_7

    .line 1733
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->d()Landroid/view/View;

    move-result-object v1

    .line 1737
    :goto_3
    if-eq v1, v2, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->isFocusable()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    .line 1740
    goto :goto_0

    :sswitch_0
    move v3, v4

    .line 22444
    goto :goto_1

    :sswitch_1
    move v3, v5

    .line 22446
    goto :goto_1

    .line 22448
    :sswitch_2
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-ne v1, v5, :cond_2

    move v3, v4

    goto :goto_1

    :cond_2
    move v3, v6

    goto :goto_1

    .line 22451
    :sswitch_3
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-ne v1, v5, :cond_3

    move v3, v5

    goto :goto_1

    :cond_3
    move v3, v6

    goto :goto_1

    .line 22454
    :sswitch_4
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-nez v1, :cond_4

    move v3, v4

    goto :goto_1

    :cond_4
    move v3, v6

    goto :goto_1

    .line 22457
    :sswitch_5
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-nez v1, :cond_5

    move v3, v5

    goto :goto_1

    :cond_5
    move v3, v6

    goto :goto_1

    .line 1716
    :cond_6
    invoke-direct {p0, p3}, Landroid/support/v7/widget/LinearLayoutManager;->k(Landroid/support/v7/widget/bf;)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    goto :goto_2

    .line 1735
    :cond_7
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->B()Landroid/view/View;

    move-result-object v1

    goto :goto_3

    .line 22442
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_0
        0x2 -> :sswitch_1
        0x11 -> :sswitch_4
        0x21 -> :sswitch_2
        0x42 -> :sswitch_5
        0x82 -> :sswitch_3
    .end sparse-switch
.end method

.method public c(Landroid/support/v7/widget/az;Landroid/support/v7/widget/bf;)V
    .locals 12

    .prologue
    .line 464
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 465
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    iget v0, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a:I

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    .line 468
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->k()V

    .line 469
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/support/v7/widget/y;->a:Z

    .line 471
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->c()V

    .line 473
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/w;

    .line 10084
    const/4 v1, -0x1

    iput v1, v0, Landroid/support/v7/widget/w;->a:I

    .line 10085
    const/high16 v1, -0x80000000

    iput v1, v0, Landroid/support/v7/widget/w;->b:I

    .line 10086
    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/support/v7/widget/w;->c:Z

    .line 474
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/w;

    iget-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    iget-boolean v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    xor-int/2addr v1, v2

    iput-boolean v1, v0, Landroid/support/v7/widget/w;->c:Z

    .line 476
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/w;

    .line 10751
    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    .line 10752
    :cond_1
    const/4 v0, 0x0

    .line 10684
    :goto_0
    if-nez v0, :cond_3

    .line 11711
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    if-eqz v0, :cond_24

    .line 12426
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    if-nez v0, :cond_18

    .line 12427
    const/4 v0, 0x0

    move-object v1, v0

    .line 11715
    :goto_1
    if-eqz v1, :cond_1e

    .line 13109
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 13388
    iget-object v3, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->n()Z

    move-result v3

    .line 13110
    if-nez v3, :cond_1b

    .line 13416
    iget-object v3, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v3}, Landroid/support/v7/widget/bi;->c()I

    move-result v3

    .line 13110
    if-ltz v3, :cond_1b

    .line 14416
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/bi;

    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v0

    .line 13110
    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->e()I

    move-result v3

    if-ge v0, v3, :cond_1b

    const/4 v0, 0x1

    .line 11715
    :goto_2
    if-eqz v0, :cond_1e

    .line 15115
    iget-object v0, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, v0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->b()I

    move-result v0

    .line 15116
    if-ltz v0, :cond_1c

    .line 15117
    invoke-virtual {v2, v1}, Landroid/support/v7/widget/w;->a(Landroid/view/View;)V

    .line 11717
    :cond_2
    :goto_3
    const/4 v0, 0x1

    .line 10691
    :goto_4
    if-nez v0, :cond_3

    .line 10700
    invoke-virtual {v2}, Landroid/support/v7/widget/w;->a()V

    .line 10701
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    if-eqz v0, :cond_25

    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->e()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_5
    iput v0, v2, Landroid/support/v7/widget/w;->a:I

    .line 485
    :cond_3
    invoke-direct {p0, p2}, Landroid/support/v7/widget/LinearLayoutManager;->g(Landroid/support/v7/widget/bf;)I

    move-result v0

    .line 488
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v1, v1, Landroid/support/v7/widget/y;->j:I

    if-ltz v1, :cond_26

    .line 490
    const/4 v1, 0x0

    .line 495
    :goto_6
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->c()I

    move-result v2

    add-int/2addr v1, v2

    .line 496
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->g()I

    move-result v2

    add-int/2addr v0, v2

    .line 497
    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->a()Z

    move-result v2

    if-eqz v2, :cond_4

    iget v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    const/4 v3, -0x1

    if-eq v2, v3, :cond_4

    iget v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    const/high16 v3, -0x80000000

    if-eq v2, v3, :cond_4

    .line 502
    iget v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    invoke-virtual {p0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(I)Landroid/view/View;

    move-result-object v2

    .line 503
    if-eqz v2, :cond_4

    .line 506
    iget-boolean v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v3, :cond_27

    .line 507
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3}, Landroid/support/v7/widget/ad;->d()I

    move-result v3

    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v4, v2}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v2

    sub-int v2, v3, v2

    .line 509
    iget v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    sub-int/2addr v2, v3

    .line 515
    :goto_7
    if-lez v2, :cond_28

    .line 516
    add-int/2addr v1, v2

    .line 524
    :cond_4
    :goto_8
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/w;

    invoke-virtual {p0, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/bf;Landroid/support/v7/widget/w;)V

    .line 525
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;)V

    .line 526
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->a()Z

    move-result v3

    iput-boolean v3, v2, Landroid/support/v7/widget/y;->i:Z

    .line 527
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/w;

    iget-boolean v2, v2, Landroid/support/v7/widget/w;->c:Z

    if-eqz v2, :cond_29

    .line 529
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/w;

    invoke-direct {p0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->b(Landroid/support/v7/widget/w;)V

    .line 530
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v1, v2, Landroid/support/v7/widget/y;->h:I

    .line 531
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;Landroid/support/v7/widget/bf;Z)I

    .line 532
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v1, v1, Landroid/support/v7/widget/y;->b:I

    .line 533
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v3, v2, Landroid/support/v7/widget/y;->d:I

    .line 534
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v2, v2, Landroid/support/v7/widget/y;->c:I

    if-lez v2, :cond_5

    .line 535
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v2, v2, Landroid/support/v7/widget/y;->c:I

    add-int/2addr v0, v2

    .line 538
    :cond_5
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/w;

    invoke-direct {p0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/w;)V

    .line 539
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v0, v2, Landroid/support/v7/widget/y;->h:I

    .line 540
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v2, v0, Landroid/support/v7/widget/y;->d:I

    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v4, v4, Landroid/support/v7/widget/y;->e:I

    add-int/2addr v2, v4

    iput v2, v0, Landroid/support/v7/widget/y;->d:I

    .line 541
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;Landroid/support/v7/widget/bf;Z)I

    .line 542
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v2, v0, Landroid/support/v7/widget/y;->b:I

    .line 544
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v0, v0, Landroid/support/v7/widget/y;->c:I

    if-lez v0, :cond_35

    .line 546
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v0, v0, Landroid/support/v7/widget/y;->c:I

    .line 547
    invoke-direct {p0, v3, v1}, Landroid/support/v7/widget/LinearLayoutManager;->f(II)V

    .line 548
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v0, v1, Landroid/support/v7/widget/y;->h:I

    .line 549
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;Landroid/support/v7/widget/bf;Z)I

    .line 550
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v0, v0, Landroid/support/v7/widget/y;->b:I

    :goto_9
    move v1, v0

    move v0, v2

    .line 582
    :cond_6
    :goto_a
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v2

    if-lez v2, :cond_34

    .line 586
    iget-boolean v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    iget-boolean v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    xor-int/2addr v2, v3

    if-eqz v2, :cond_2b

    .line 587
    const/4 v2, 0x1

    invoke-direct {p0, v0, p1, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)I

    move-result v2

    .line 588
    add-int/2addr v1, v2

    .line 589
    add-int/2addr v0, v2

    .line 590
    const/4 v2, 0x0

    invoke-direct {p0, v1, p1, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->b(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)I

    move-result v2

    .line 591
    add-int/2addr v1, v2

    .line 592
    add-int/2addr v0, v2

    move v2, v1

    move v1, v0

    .line 15634
    :goto_b
    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->a()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->e()Z

    move-result v0

    if-nez v0, :cond_2c

    .line 603
    :cond_7
    :goto_c
    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->a()Z

    move-result v0

    if-nez v0, :cond_8

    .line 604
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    .line 605
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    .line 606
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->a()V

    .line 608
    :cond_8
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    iput-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->b:Z

    .line 609
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    .line 613
    return-void

    .line 10755
    :cond_9
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    if-ltz v0, :cond_a

    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->e()I

    move-result v1

    if-lt v0, v1, :cond_b

    .line 10756
    :cond_a
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    .line 10757
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    .line 10761
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 10766
    :cond_b
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    iput v0, v2, Landroid/support/v7/widget/w;->a:I

    .line 10767
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_d

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a()Z

    move-result v0

    if-eqz v0, :cond_d

    .line 10770
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    iget-boolean v0, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->c:Z

    iput-boolean v0, v2, Landroid/support/v7/widget/w;->c:Z

    .line 10771
    iget-boolean v0, v2, Landroid/support/v7/widget/w;->c:Z

    if-eqz v0, :cond_c

    .line 10772
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    iget v1, v1, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->b:I

    sub-int/2addr v0, v1

    iput v0, v2, Landroid/support/v7/widget/w;->b:I

    .line 10778
    :goto_d
    const/4 v0, 0x1

    goto/16 :goto_0

    .line 10775
    :cond_c
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    iget v1, v1, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->b:I

    add-int/2addr v0, v1

    iput v0, v2, Landroid/support/v7/widget/w;->b:I

    goto :goto_d

    .line 10781
    :cond_d
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_16

    .line 10782
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(I)Landroid/view/View;

    move-result-object v0

    .line 10783
    if-eqz v0, :cond_12

    .line 10784
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v1

    .line 10785
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3}, Landroid/support/v7/widget/ad;->f()I

    move-result v3

    if-le v1, v3, :cond_e

    .line 10787
    invoke-virtual {v2}, Landroid/support/v7/widget/w;->a()V

    .line 10829
    :goto_e
    const/4 v0, 0x1

    goto/16 :goto_0

    .line 10790
    :cond_e
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3}, Landroid/support/v7/widget/ad;->c()I

    move-result v3

    sub-int/2addr v1, v3

    .line 10792
    if-gez v1, :cond_f

    .line 10793
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v0

    iput v0, v2, Landroid/support/v7/widget/w;->b:I

    .line 10794
    const/4 v0, 0x0

    iput-boolean v0, v2, Landroid/support/v7/widget/w;->c:Z

    goto :goto_e

    .line 10797
    :cond_f
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->d()I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v1, v3

    .line 10799
    if-gez v1, :cond_10

    .line 10800
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v0

    iput v0, v2, Landroid/support/v7/widget/w;->b:I

    .line 10801
    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/support/v7/widget/w;->c:Z

    goto :goto_e

    .line 10804
    :cond_10
    iget-boolean v1, v2, Landroid/support/v7/widget/w;->c:Z

    if-eqz v1, :cond_11

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->b()I

    move-result v1

    add-int/2addr v0, v1

    :goto_f
    iput v0, v2, Landroid/support/v7/widget/w;->b:I

    .line 10817
    :goto_10
    const/4 v0, 0x1

    goto/16 :goto_0

    .line 10804
    :cond_11
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v0

    goto :goto_f

    .line 10809
    :cond_12
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    if-lez v0, :cond_13

    .line 10811
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    .line 10812
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    if-ge v1, v0, :cond_14

    const/4 v0, 0x1

    :goto_11
    iget-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-ne v0, v1, :cond_15

    const/4 v0, 0x1

    :goto_12
    iput-boolean v0, v2, Landroid/support/v7/widget/w;->c:Z

    .line 10815
    :cond_13
    invoke-virtual {v2}, Landroid/support/v7/widget/w;->a()V

    goto :goto_10

    .line 10812
    :cond_14
    const/4 v0, 0x0

    goto :goto_11

    :cond_15
    const/4 v0, 0x0

    goto :goto_12

    .line 10820
    :cond_16
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    iput-boolean v0, v2, Landroid/support/v7/widget/w;->c:Z

    .line 10822
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_17

    .line 10823
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v0

    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    sub-int/2addr v0, v1

    iput v0, v2, Landroid/support/v7/widget/w;->b:I

    goto/16 :goto_e

    .line 10826
    :cond_17
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v0

    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    add-int/2addr v0, v1

    iput v0, v2, Landroid/support/v7/widget/w;->b:I

    goto/16 :goto_e

    .line 12429
    :cond_18
    iget-object v0, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    .line 12430
    if-eqz v0, :cond_19

    iget-object v1, p0, Landroid/support/v7/widget/au;->q:Landroid/support/v7/widget/d;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/d;->b(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_1a

    .line 12431
    :cond_19
    const/4 v0, 0x0

    move-object v1, v0

    goto/16 :goto_1

    :cond_1a
    move-object v1, v0

    .line 12433
    goto/16 :goto_1

    .line 13110
    :cond_1b
    const/4 v0, 0x0

    goto/16 :goto_2

    .line 15120
    :cond_1c
    invoke-static {v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v3

    iput v3, v2, Landroid/support/v7/widget/w;->a:I

    .line 15121
    iget-boolean v3, v2, Landroid/support/v7/widget/w;->c:Z

    if-eqz v3, :cond_1d

    .line 15122
    iget-object v3, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v3, v3, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3}, Landroid/support/v7/widget/ad;->d()I

    move-result v3

    sub-int v0, v3, v0

    .line 15123
    iget-object v3, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v3, v3, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v3

    .line 15124
    sub-int/2addr v0, v3

    .line 15125
    iget-object v3, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v3, v3, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3}, Landroid/support/v7/widget/ad;->d()I

    move-result v3

    sub-int/2addr v3, v0

    iput v3, v2, Landroid/support/v7/widget/w;->b:I

    .line 15127
    if-lez v0, :cond_2

    .line 15128
    iget-object v3, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v3, v3, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v3

    .line 15129
    iget v4, v2, Landroid/support/v7/widget/w;->b:I

    sub-int v3, v4, v3

    .line 15130
    iget-object v4, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v4, v4, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v4}, Landroid/support/v7/widget/ad;->c()I

    move-result v4

    .line 15131
    iget-object v5, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v5, v5, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v1}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v1, v4

    .line 15133
    const/4 v5, 0x0

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/2addr v1, v4

    .line 15134
    sub-int v1, v3, v1

    .line 15135
    if-gez v1, :cond_2

    .line 15137
    iget v3, v2, Landroid/support/v7/widget/w;->b:I

    neg-int v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v0, v3

    iput v0, v2, Landroid/support/v7/widget/w;->b:I

    goto/16 :goto_3

    .line 15141
    :cond_1d
    iget-object v3, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v3, v3, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v3

    .line 15142
    iget-object v4, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v4, v4, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v4}, Landroid/support/v7/widget/ad;->c()I

    move-result v4

    sub-int v4, v3, v4

    .line 15143
    iput v3, v2, Landroid/support/v7/widget/w;->b:I

    .line 15144
    if-lez v4, :cond_2

    .line 15145
    iget-object v5, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v5, v5, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v1}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v5

    add-int/2addr v3, v5

    .line 15147
    iget-object v5, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v5, v5, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v5}, Landroid/support/v7/widget/ad;->d()I

    move-result v5

    sub-int v0, v5, v0

    .line 15149
    iget-object v5, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v5, v5, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v5, v1}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v0, v1

    .line 15151
    iget-object v1, v2, Landroid/support/v7/widget/w;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v1, v1, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->d()I

    move-result v1

    const/4 v5, 0x0

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v0, v1, v0

    .line 15153
    sub-int/2addr v0, v3

    .line 15154
    if-gez v0, :cond_2

    .line 15155
    iget v1, v2, Landroid/support/v7/widget/w;->b:I

    neg-int v0, v0

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v0, v1, v0

    iput v0, v2, Landroid/support/v7/widget/w;->b:I

    goto/16 :goto_3

    .line 11719
    :cond_1e
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->b:Z

    iget-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    if-ne v0, v1, :cond_24

    .line 11722
    iget-boolean v0, v2, Landroid/support/v7/widget/w;->c:Z

    if-eqz v0, :cond_21

    invoke-direct {p0, p2}, Landroid/support/v7/widget/LinearLayoutManager;->k(Landroid/support/v7/widget/bf;)Landroid/view/View;

    move-result-object v0

    .line 11724
    :goto_13
    if-eqz v0, :cond_24

    .line 11725
    invoke-virtual {v2, v0}, Landroid/support/v7/widget/w;->a(Landroid/view/View;)V

    .line 11728
    invoke-virtual {p2}, Landroid/support/v7/widget/bf;->a()Z

    move-result v1

    if-nez v1, :cond_20

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->e()Z

    move-result v1

    if-eqz v1, :cond_20

    .line 11730
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3}, Landroid/support/v7/widget/ad;->d()I

    move-result v3

    if-ge v1, v3, :cond_1f

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v1}, Landroid/support/v7/widget/ad;->c()I

    move-result v1

    if-ge v0, v1, :cond_22

    :cond_1f
    const/4 v0, 0x1

    .line 11735
    :goto_14
    if-eqz v0, :cond_20

    .line 11736
    iget-boolean v0, v2, Landroid/support/v7/widget/w;->c:Z

    if-eqz v0, :cond_23

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->d()I

    move-result v0

    :goto_15
    iput v0, v2, Landroid/support/v7/widget/w;->b:I

    .line 11741
    :cond_20
    const/4 v0, 0x1

    goto/16 :goto_4

    .line 11722
    :cond_21
    invoke-direct {p0, p2}, Landroid/support/v7/widget/LinearLayoutManager;->l(Landroid/support/v7/widget/bf;)Landroid/view/View;

    move-result-object v0

    goto :goto_13

    .line 11730
    :cond_22
    const/4 v0, 0x0

    goto :goto_14

    .line 11736
    :cond_23
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v0}, Landroid/support/v7/widget/ad;->c()I

    move-result v0

    goto :goto_15

    .line 11743
    :cond_24
    const/4 v0, 0x0

    goto/16 :goto_4

    .line 10701
    :cond_25
    const/4 v0, 0x0

    goto/16 :goto_5

    .line 493
    :cond_26
    const/4 v1, 0x0

    move v11, v1

    move v1, v0

    move v0, v11

    goto/16 :goto_6

    .line 511
    :cond_27
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3, v2}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v2

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3}, Landroid/support/v7/widget/ad;->c()I

    move-result v3

    sub-int/2addr v2, v3

    .line 513
    iget v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    sub-int v2, v3, v2

    goto/16 :goto_7

    .line 518
    :cond_28
    sub-int/2addr v0, v2

    goto/16 :goto_8

    .line 554
    :cond_29
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/w;

    invoke-direct {p0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/w;)V

    .line 555
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v0, v2, Landroid/support/v7/widget/y;->h:I

    .line 556
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;Landroid/support/v7/widget/bf;Z)I

    .line 557
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v0, v0, Landroid/support/v7/widget/y;->b:I

    .line 558
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v2, v2, Landroid/support/v7/widget/y;->d:I

    .line 559
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v3, v3, Landroid/support/v7/widget/y;->c:I

    if-lez v3, :cond_2a

    .line 560
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v3, v3, Landroid/support/v7/widget/y;->c:I

    add-int/2addr v1, v3

    .line 563
    :cond_2a
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/w;

    invoke-direct {p0, v3}, Landroid/support/v7/widget/LinearLayoutManager;->b(Landroid/support/v7/widget/w;)V

    .line 564
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v1, v3, Landroid/support/v7/widget/y;->h:I

    .line 565
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v3, v1, Landroid/support/v7/widget/y;->d:I

    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v4, v4, Landroid/support/v7/widget/y;->e:I

    add-int/2addr v3, v4

    iput v3, v1, Landroid/support/v7/widget/y;->d:I

    .line 566
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v3, 0x0

    invoke-direct {p0, p1, v1, p2, v3}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;Landroid/support/v7/widget/bf;Z)I

    .line 567
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v1, v1, Landroid/support/v7/widget/y;->b:I

    .line 569
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v3, v3, Landroid/support/v7/widget/y;->c:I

    if-lez v3, :cond_6

    .line 570
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v3, v3, Landroid/support/v7/widget/y;->c:I

    .line 572
    invoke-direct {p0, v2, v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(II)V

    .line 573
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v3, v0, Landroid/support/v7/widget/y;->h:I

    .line 574
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;Landroid/support/v7/widget/bf;Z)I

    .line 575
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iget v0, v0, Landroid/support/v7/widget/y;->b:I

    goto/16 :goto_a

    .line 594
    :cond_2b
    const/4 v2, 0x1

    invoke-direct {p0, v1, p1, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->b(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)I

    move-result v2

    .line 595
    add-int/2addr v1, v2

    .line 596
    add-int/2addr v0, v2

    .line 597
    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(ILandroid/support/v7/widget/az;Landroid/support/v7/widget/bf;Z)I

    move-result v2

    .line 598
    add-int/2addr v1, v2

    .line 599
    add-int/2addr v0, v2

    move v2, v1

    move v1, v0

    goto/16 :goto_b

    .line 15639
    :cond_2c
    const/4 v5, 0x0

    const/4 v4, 0x0

    .line 15640
    invoke-virtual {p1}, Landroid/support/v7/widget/az;->b()Ljava/util/List;

    move-result-object v7

    .line 15641
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    .line 15642
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->c(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v9

    .line 15643
    const/4 v0, 0x0

    move v6, v0

    :goto_16
    if-ge v6, v8, :cond_30

    .line 15644
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/bi;

    .line 15645
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->n()Z

    move-result v3

    if-nez v3, :cond_33

    .line 15648
    invoke-virtual {v0}, Landroid/support/v7/widget/bi;->c()I

    move-result v3

    .line 15649
    if-ge v3, v9, :cond_2d

    const/4 v3, 0x1

    :goto_17
    iget-boolean v10, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eq v3, v10, :cond_2e

    const/4 v3, -0x1

    .line 15651
    :goto_18
    const/4 v10, -0x1

    if-ne v3, v10, :cond_2f

    .line 15652
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    iget-object v0, v0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v0

    add-int/2addr v0, v5

    move v3, v0

    move v0, v4

    .line 15643
    :goto_19
    add-int/lit8 v4, v6, 0x1

    move v6, v4

    move v5, v3

    move v4, v0

    goto :goto_16

    .line 15649
    :cond_2d
    const/4 v3, 0x0

    goto :goto_17

    :cond_2e
    const/4 v3, 0x1

    goto :goto_18

    .line 15654
    :cond_2f
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    iget-object v0, v0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/ad;->c(Landroid/view/View;)I

    move-result v0

    add-int/2addr v0, v4

    move v3, v5

    goto :goto_19

    .line 15662
    :cond_30
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput-object v7, v0, Landroid/support/v7/widget/y;->k:Ljava/util/List;

    .line 15663
    if-lez v5, :cond_31

    .line 15664
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->d()Landroid/view/View;

    move-result-object v0

    .line 15665
    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    invoke-direct {p0, v0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->f(II)V

    .line 15666
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v5, v0, Landroid/support/v7/widget/y;->h:I

    .line 15667
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v2, 0x0

    iput v2, v0, Landroid/support/v7/widget/y;->c:I

    .line 15668
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    .line 15975
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/y;->a(Landroid/support/v7/widget/bi;)V

    .line 15669
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;Landroid/support/v7/widget/bf;Z)I

    .line 15672
    :cond_31
    if-lez v4, :cond_32

    .line 15673
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->B()Landroid/view/View;

    move-result-object v0

    .line 15674
    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(II)V

    .line 15675
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    iput v4, v0, Landroid/support/v7/widget/y;->h:I

    .line 15676
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v1, 0x0

    iput v1, v0, Landroid/support/v7/widget/y;->c:I

    .line 15677
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    .line 16975
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/y;->a(Landroid/support/v7/widget/bi;)V

    .line 15678
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/az;Landroid/support/v7/widget/y;Landroid/support/v7/widget/bf;Z)I

    .line 15680
    :cond_32
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    const/4 v1, 0x0

    iput-object v1, v0, Landroid/support/v7/widget/y;->k:Ljava/util/List;

    goto/16 :goto_c

    :cond_33
    move v0, v4

    move v3, v5

    goto :goto_19

    :cond_34
    move v2, v1

    move v1, v0

    goto/16 :goto_b

    :cond_35
    move v0, v1

    goto/16 :goto_9
.end method

.method public final d(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 1027
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->i(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final e(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 1032
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->j(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public e()Z
    .locals 2

    .prologue
    .line 1809
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->b:Z

    iget-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final f(Landroid/support/v7/widget/bf;)I
    .locals 1

    .prologue
    .line 1037
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->j(Landroid/support/v7/widget/bf;)I

    move-result v0

    return v0
.end method

.method public final f()Landroid/os/Parcelable;
    .locals 4

    .prologue
    .line 233
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_0

    .line 234
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    invoke-direct {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager$SavedState;-><init>(Landroid/support/v7/widget/LinearLayoutManager$SavedState;)V

    .line 255
    :goto_0
    return-object v0

    .line 236
    :cond_0
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    invoke-direct {v0}, Landroid/support/v7/widget/LinearLayoutManager$SavedState;-><init>()V

    .line 237
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v1

    if-lez v1, :cond_2

    .line 238
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->k()V

    .line 239
    iget-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->b:Z

    iget-boolean v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    xor-int/2addr v1, v2

    .line 240
    iput-boolean v1, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->c:Z

    .line 241
    if-eqz v1, :cond_1

    .line 242
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->B()Landroid/view/View;

    move-result-object v1

    .line 243
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->d()I

    move-result v2

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/ad;->b(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v2, v3

    iput v2, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->b:I

    .line 245
    invoke-static {v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a:I

    goto :goto_0

    .line 247
    :cond_1
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->d()Landroid/view/View;

    move-result-object v1

    .line 248
    invoke-static {v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v2

    iput v2, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a:I

    .line 249
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/ad;->a(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    invoke-virtual {v2}, Landroid/support/v7/widget/ad;->c()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->b:I

    goto :goto_0

    .line 10047
    :cond_2
    const/4 v1, -0x1

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a:I

    goto :goto_0
.end method

.method public final g()Z
    .locals 1

    .prologue
    .line 276
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 284
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final i()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 324
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Ljava/lang/String;)V

    .line 325
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-ne v1, v0, :cond_0

    .line 331
    :goto_0
    return-void

    .line 328
    :cond_0
    iput v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    .line 329
    iput-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    .line 330
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->n()V

    goto :goto_0
.end method

.method protected final j()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 912
    .line 17913
    iget-object v1, p0, Landroid/support/v7/widget/au;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v1

    .line 912
    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final k()V
    .locals 1

    .prologue
    .line 916
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    if-nez v0, :cond_0

    .line 17930
    new-instance v0, Landroid/support/v7/widget/y;

    invoke-direct {v0}, Landroid/support/v7/widget/y;-><init>()V

    .line 917
    iput-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/y;

    .line 919
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    if-nez v0, :cond_1

    .line 920
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    invoke-static {p0, v0}, Landroid/support/v7/widget/ad;->a(Landroid/support/v7/widget/au;I)Landroid/support/v7/widget/ad;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/ad;

    .line 922
    :cond_1
    return-void
.end method

.method public final l()I
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1612
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v0

    invoke-direct {p0, v1, v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v0

    .line 1613
    if-nez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    goto :goto_0
.end method

.method public final m()I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 1652
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->r()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v1

    .line 1653
    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-static {v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    goto :goto_0
.end method
