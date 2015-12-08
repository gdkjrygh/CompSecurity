.class public Landroid/support/v7/widget/LinearLayoutManager;
.super Landroid/support/v7/widget/RecyclerView$i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v7/widget/LinearLayoutManager$b;,
        Landroid/support/v7/widget/LinearLayoutManager$a;,
        Landroid/support/v7/widget/LinearLayoutManager$SavedState;,
        Landroid/support/v7/widget/LinearLayoutManager$c;
    }
.end annotation


# instance fields
.field private a:Landroid/support/v7/widget/LinearLayoutManager$c;

.field private b:Z

.field private c:Z

.field private d:Z

.field private e:Z

.field private f:Z

.field j:I

.field k:Landroid/support/v7/widget/q;

.field l:Z

.field m:I

.field n:I

.field o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

.field final p:Landroid/support/v7/widget/LinearLayoutManager$a;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 144
    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;-><init>(IZ)V

    .line 145
    return-void
.end method

.method public constructor <init>(IZ)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 153
    invoke-direct {p0}, Landroid/support/v7/widget/RecyclerView$i;-><init>()V

    .line 94
    iput-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->c:Z

    .line 101
    iput-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    .line 108
    iput-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    .line 114
    iput-boolean v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->e:Z

    .line 120
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    .line 126
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    .line 130
    iput-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    .line 136
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager$a;

    invoke-direct {v0, p0}, Landroid/support/v7/widget/LinearLayoutManager$a;-><init>(Landroid/support/v7/widget/LinearLayoutManager;)V

    iput-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/LinearLayoutManager$a;

    .line 154
    if-eqz p1, :cond_0

    if-eq p1, v2, :cond_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "invalid orientation:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_0
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->a(Ljava/lang/String;)V

    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-eq p1, v0, :cond_1

    iput p1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    iput-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->l()V

    .line 155
    :cond_1
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->a(Ljava/lang/String;)V

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->c:Z

    if-eq p2, v0, :cond_2

    iput-boolean p2, p0, Landroid/support/v7/widget/LinearLayoutManager;->c:Z

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->l()V

    .line 156
    :cond_2
    return-void
.end method

.method private a(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Z)I
    .locals 3

    .prologue
    .line 842
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->d()I

    move-result v0

    sub-int/2addr v0, p1

    .line 843
    if-lez v0, :cond_1

    .line 845
    neg-int v0, v0

    invoke-direct {p0, v0, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->d(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    neg-int v0, v0

    .line 850
    add-int v1, p1, v0

    .line 851
    if-eqz p4, :cond_0

    .line 853
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2}, Landroid/support/v7/widget/q;->d()I

    move-result v2

    sub-int v1, v2, v1

    .line 854
    if-lez v1, :cond_0

    .line 855
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/q;->a(I)V

    .line 856
    add-int/2addr v0, v1

    .line 859
    :cond_0
    :goto_0
    return v0

    .line 847
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/RecyclerView$q;Z)I
    .locals 8

    .prologue
    const/high16 v7, -0x80000000

    const/4 v6, 0x0

    .line 1315
    iget v1, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    .line 1316
    iget v0, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    if-eq v0, v7, :cond_1

    .line 1318
    iget v0, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    if-gez v0, :cond_0

    .line 1319
    iget v0, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    iget v2, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    add-int/2addr v0, v2

    iput v0, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    .line 1321
    :cond_0
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;)V

    .line 1323
    :cond_1
    iget v0, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    iget v2, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    add-int/2addr v0, v2

    .line 1324
    new-instance v2, Landroid/support/v7/widget/LinearLayoutManager$b;

    invoke-direct {v2}, Landroid/support/v7/widget/LinearLayoutManager$b;-><init>()V

    .line 1325
    :cond_2
    if-lez v0, :cond_7

    invoke-virtual {p2, p3}, Landroid/support/v7/widget/LinearLayoutManager$c;->a(Landroid/support/v7/widget/RecyclerView$q;)Z

    move-result v3

    if-eqz v3, :cond_7

    .line 1326
    iput v6, v2, Landroid/support/v7/widget/LinearLayoutManager$b;->a:I

    iput-boolean v6, v2, Landroid/support/v7/widget/LinearLayoutManager$b;->b:Z

    iput-boolean v6, v2, Landroid/support/v7/widget/LinearLayoutManager$b;->c:Z

    iput-boolean v6, v2, Landroid/support/v7/widget/LinearLayoutManager$b;->d:Z

    .line 1327
    invoke-virtual {p0, p1, p3, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/LinearLayoutManager$b;)V

    .line 1328
    iget-boolean v3, v2, Landroid/support/v7/widget/LinearLayoutManager$b;->b:Z

    if-nez v3, :cond_7

    .line 1329
    iget v3, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    iget v4, v2, Landroid/support/v7/widget/LinearLayoutManager$b;->a:I

    iget v5, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->f:I

    mul-int/2addr v4, v5

    add-int/2addr v3, v4

    iput v3, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 1338
    iget-boolean v3, v2, Landroid/support/v7/widget/LinearLayoutManager$b;->c:Z

    if-eqz v3, :cond_3

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget-object v3, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    if-nez v3, :cond_3

    invoke-virtual {p3}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v3

    if-nez v3, :cond_4

    .line 1340
    :cond_3
    iget v3, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    iget v4, v2, Landroid/support/v7/widget/LinearLayoutManager$b;->a:I

    sub-int/2addr v3, v4

    iput v3, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    .line 1342
    iget v3, v2, Landroid/support/v7/widget/LinearLayoutManager$b;->a:I

    sub-int/2addr v0, v3

    .line 1345
    :cond_4
    iget v3, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    if-eq v3, v7, :cond_6

    .line 1346
    iget v3, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    iget v4, v2, Landroid/support/v7/widget/LinearLayoutManager$b;->a:I

    add-int/2addr v3, v4

    iput v3, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    .line 1347
    iget v3, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    if-gez v3, :cond_5

    .line 1348
    iget v3, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    iget v4, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    add-int/2addr v3, v4

    iput v3, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    .line 1350
    :cond_5
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;)V

    .line 1352
    :cond_6
    if-eqz p4, :cond_2

    iget-boolean v3, v2, Landroid/support/v7/widget/LinearLayoutManager$b;->d:Z

    if-eqz v3, :cond_2

    .line 1353
    :cond_7
    iget v0, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    sub-int v0, v1, v0

    return v0
.end method

.method private a(IIZ)Landroid/view/View;
    .locals 7

    .prologue
    .line 1683
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 1684
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->c()I

    move-result v3

    .line 1685
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->d()I

    move-result v4

    .line 1686
    if-le p2, p1, :cond_1

    const/4 v0, 0x1

    .line 1687
    :goto_0
    const/4 v2, 0x0

    .line 1688
    :goto_1
    if-eq p1, p2, :cond_3

    .line 1689
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v1

    .line 1690
    iget-object v5, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v5, v1}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v5

    .line 1691
    iget-object v6, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v6, v1}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v6

    .line 1692
    if-ge v5, v4, :cond_4

    if-le v6, v3, :cond_4

    .line 1693
    if-eqz p3, :cond_0

    .line 1694
    if-lt v5, v3, :cond_2

    if-gt v6, v4, :cond_2

    .line 1704
    :cond_0
    :goto_2
    return-object v1

    .line 1686
    :cond_1
    const/4 v0, -0x1

    goto :goto_0

    .line 1696
    :cond_2
    if-nez v2, :cond_4

    .line 1688
    :goto_3
    add-int/2addr p1, v0

    move-object v2, v1

    goto :goto_1

    :cond_3
    move-object v1, v2

    .line 1704
    goto :goto_2

    :cond_4
    move-object v1, v2

    goto :goto_3
.end method

.method private a(Z)Landroid/view/View;
    .locals 2

    .prologue
    .line 1502
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    .line 1503
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v0

    .line 1506
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v1

    invoke-direct {p0, v0, v1, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method private a(IIZLandroid/support/v7/widget/RecyclerView$q;)V
    .locals 6

    .prologue
    const/4 v0, -0x1

    const/4 v1, 0x1

    .line 1112
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    invoke-direct {p0, p4}, Landroid/support/v7/widget/LinearLayoutManager;->g(Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v3

    iput v3, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    .line 1113
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput p1, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->f:I

    .line 1115
    if-ne p1, v1, :cond_2

    .line 1116
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v3, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v4}, Landroid/support/v7/widget/q;->g()I

    move-result v4

    add-int/2addr v3, v4

    iput v3, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    .line 1118
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->z()Landroid/view/View;

    move-result-object v2

    .line 1120
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget-boolean v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v4, :cond_1

    :goto_0
    iput v0, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->e:I

    .line 1122
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    invoke-static {v2}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v3, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->e:I

    add-int/2addr v1, v3

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    .line 1123
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 1125
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1}, Landroid/support/v7/widget/q;->d()I

    move-result v1

    sub-int/2addr v0, v1

    .line 1138
    :goto_1
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput p2, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    .line 1139
    if-eqz p3, :cond_0

    .line 1140
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v2, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    sub-int/2addr v2, v0

    iput v2, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    .line 1142
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v0, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    .line 1143
    return-void

    :cond_1
    move v0, v1

    .line 1120
    goto :goto_0

    .line 1129
    :cond_2
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->y()Landroid/view/View;

    move-result-object v2

    .line 1130
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v4, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    iget-object v5, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v5}, Landroid/support/v7/widget/q;->c()I

    move-result v5

    add-int/2addr v4, v5

    iput v4, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    .line 1131
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget-boolean v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v4, :cond_3

    :goto_2
    iput v1, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->e:I

    .line 1133
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    invoke-static {v2}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v3, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->e:I

    add-int/2addr v1, v3

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    .line 1134
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1, v2}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v1

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 1135
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v0

    neg-int v0, v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1}, Landroid/support/v7/widget/q;->c()I

    move-result v1

    add-int/2addr v0, v1

    goto :goto_1

    :cond_3
    move v1, v0

    .line 1131
    goto :goto_2
.end method

.method private a(Landroid/support/v7/widget/LinearLayoutManager$a;)V
    .locals 2

    .prologue
    .line 888
    iget v0, p1, Landroid/support/v7/widget/LinearLayoutManager$a;->a:I

    iget v1, p1, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->f(II)V

    .line 889
    return-void
.end method

.method private a(Landroid/support/v7/widget/RecyclerView$m;II)V
    .locals 1

    .prologue
    .line 1185
    if-ne p2, p3, :cond_1

    .line 1200
    :cond_0
    return-void

    .line 1191
    :cond_1
    if-le p3, p2, :cond_2

    .line 1192
    add-int/lit8 v0, p3, -0x1

    :goto_0
    if-lt v0, p2, :cond_0

    .line 1193
    invoke-virtual {p0, v0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(ILandroid/support/v7/widget/RecyclerView$m;)V

    .line 1192
    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 1196
    :cond_2
    :goto_1
    if-le p2, p3, :cond_0

    .line 1197
    invoke-virtual {p0, p2, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(ILandroid/support/v7/widget/RecyclerView$m;)V

    .line 1196
    add-int/lit8 p2, p2, -0x1

    goto :goto_1
.end method

.method private a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;)V
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 1291
    iget-boolean v0, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->a:Z

    if-nez v0, :cond_1

    .line 1299
    :cond_0
    :goto_0
    return-void

    .line 1294
    :cond_1
    iget v0, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->f:I

    const/4 v2, -0x1

    if-ne v0, v2, :cond_5

    .line 1295
    iget v0, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v2

    if-ltz v0, :cond_0

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3}, Landroid/support/v7/widget/q;->e()I

    move-result v3

    sub-int/2addr v3, v0

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_3

    move v0, v1

    :goto_1
    if-ge v0, v2, :cond_0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v5, v4}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v4

    if-ge v4, v3, :cond_2

    invoke-direct {p0, p1, v1, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;II)V

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_3
    add-int/lit8 v0, v2, -0x1

    :goto_2
    if-ltz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v1

    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v4, v1}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v1

    if-ge v1, v3, :cond_4

    add-int/lit8 v1, v2, -0x1

    invoke-direct {p0, p1, v1, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;II)V

    goto :goto_0

    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    .line 1297
    :cond_5
    iget v2, p2, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    if-ltz v2, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v3

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_7

    add-int/lit8 v0, v3, -0x1

    :goto_3
    if-ltz v0, :cond_0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v1

    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v4, v1}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v1

    if-le v1, v2, :cond_6

    add-int/lit8 v1, v3, -0x1

    invoke-direct {p0, p1, v1, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;II)V

    goto :goto_0

    :cond_6
    add-int/lit8 v0, v0, -0x1

    goto :goto_3

    :cond_7
    move v0, v1

    :goto_4
    if-ge v0, v3, :cond_0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v4

    iget-object v5, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v5, v4}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v4

    if-le v4, v2, :cond_8

    invoke-direct {p0, p1, v1, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;II)V

    goto :goto_0

    :cond_8
    add-int/lit8 v0, v0, 0x1

    goto :goto_4
.end method

.method private b(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Z)I
    .locals 4

    .prologue
    .line 867
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->c()I

    move-result v0

    sub-int v0, p1, v0

    .line 868
    if-lez v0, :cond_1

    .line 871
    invoke-direct {p0, v0, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->d(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    neg-int v0, v0

    .line 875
    add-int v1, p1, v0

    .line 876
    if-eqz p4, :cond_0

    .line 878
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2}, Landroid/support/v7/widget/q;->c()I

    move-result v2

    sub-int/2addr v1, v2

    .line 879
    if-lez v1, :cond_0

    .line 880
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    neg-int v3, v1

    invoke-virtual {v2, v3}, Landroid/support/v7/widget/q;->a(I)V

    .line 881
    sub-int/2addr v0, v1

    .line 884
    :cond_0
    :goto_0
    return v0

    .line 873
    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private b(Z)Landroid/view/View;
    .locals 2

    .prologue
    .line 1520
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    .line 1521
    const/4 v0, 0x0

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v1

    invoke-direct {p0, v0, v1, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v0

    .line 1524
    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    const/4 v1, -0x1

    invoke-direct {p0, v0, v1, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method private b(Landroid/support/v7/widget/LinearLayoutManager$a;)V
    .locals 2

    .prologue
    .line 902
    iget v0, p1, Landroid/support/v7/widget/LinearLayoutManager$a;->a:I

    iget v1, p1, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->g(II)V

    .line 903
    return-void
.end method

.method private c()V
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 340
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-eq v1, v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->h()Z

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

.method private d(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1146
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_1

    :cond_0
    move p1, v2

    .line 1168
    :goto_0
    return p1

    .line 1149
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput-boolean v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->a:Z

    .line 1150
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 1151
    if-lez p1, :cond_2

    move v0, v1

    .line 1152
    :goto_1
    invoke-static {p1}, Ljava/lang/Math;->abs(I)I

    move-result v3

    .line 1153
    invoke-direct {p0, v0, v3, v1, p3}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZLandroid/support/v7/widget/RecyclerView$q;)V

    .line 1154
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v1, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    .line 1155
    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    invoke-direct {p0, p2, v4, p3, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/RecyclerView$q;Z)I

    move-result v4

    add-int/2addr v1, v4

    .line 1156
    if-gez v1, :cond_3

    move p1, v2

    .line 1160
    goto :goto_0

    .line 1151
    :cond_2
    const/4 v0, -0x1

    goto :goto_1

    .line 1162
    :cond_3
    if-le v3, v1, :cond_4

    mul-int p1, v0, v1

    .line 1163
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    neg-int v1, p1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/q;->a(I)V

    .line 1167
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput p1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->j:I

    goto :goto_0
.end method

.method private d(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;
    .locals 1

    .prologue
    .line 1542
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->f(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->g(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method private e(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;
    .locals 1

    .prologue
    .line 1559
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->g(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->f(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method private f(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;
    .locals 6

    .prologue
    .line 1564
    const/4 v3, 0x0

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v4

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;III)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private f(II)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 892
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2}, Landroid/support/v7/widget/q;->d()I

    move-result v2

    sub-int/2addr v2, p2

    iput v2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    .line 893
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->e:I

    .line 895
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput p1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    .line 896
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->f:I

    .line 897
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput p2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 898
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/high16 v1, -0x80000000

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    .line 899
    return-void

    :cond_0
    move v0, v1

    .line 893
    goto :goto_0
.end method

.method private g(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 414
    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$q;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 415
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->f()I

    move-result v0

    .line 417
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private g(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;
    .locals 6

    .prologue
    .line 1568
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    add-int/lit8 v3, v0, -0x1

    const/4 v4, -0x1

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-virtual/range {v0 .. v5}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;III)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method private g(II)V
    .locals 3

    .prologue
    const/4 v1, -0x1

    .line 906
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2}, Landroid/support/v7/widget/q;->c()I

    move-result v2

    sub-int v2, p2, v2

    iput v2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    .line 907
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput p1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    .line 908
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->e:I

    .line 910
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->f:I

    .line 911
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput p2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 912
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/high16 v1, -0x80000000

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    .line 914
    return-void

    :cond_0
    move v0, v1

    .line 908
    goto :goto_0
.end method

.method private h(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 7

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 1046
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    if-nez v0, :cond_0

    .line 1050
    :goto_0
    return v4

    .line 1049
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 1050
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

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

    invoke-static/range {v0 .. v6}, Landroid/support/v7/widget/aa;->a(Landroid/support/v7/widget/RecyclerView$q;Landroid/support/v7/widget/q;Landroid/view/View;Landroid/view/View;Landroid/support/v7/widget/RecyclerView$i;ZZ)I

    move-result v4

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_1

    :cond_2
    move v3, v4

    goto :goto_2
.end method

.method private i(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 1057
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    if-nez v0, :cond_0

    .line 1061
    :goto_0
    return v4

    .line 1060
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 1061
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

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

    invoke-static/range {v0 .. v5}, Landroid/support/v7/widget/aa;->a(Landroid/support/v7/widget/RecyclerView$q;Landroid/support/v7/widget/q;Landroid/view/View;Landroid/view/View;Landroid/support/v7/widget/RecyclerView$i;Z)I

    move-result v4

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_1

    :cond_2
    move v3, v4

    goto :goto_2
.end method

.method private j(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 6

    .prologue
    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 1068
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    if-nez v0, :cond_0

    .line 1072
    :goto_0
    return v4

    .line 1071
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 1072
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

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

    invoke-static/range {v0 .. v5}, Landroid/support/v7/widget/aa;->b(Landroid/support/v7/widget/RecyclerView$q;Landroid/support/v7/widget/q;Landroid/view/View;Landroid/view/View;Landroid/support/v7/widget/RecyclerView$i;Z)I

    move-result v4

    goto :goto_0

    :cond_1
    move v0, v4

    goto :goto_1

    :cond_2
    move v3, v4

    goto :goto_2
.end method

.method private y()Landroid/view/View;
    .locals 1

    .prologue
    .line 1480
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private z()Landroid/view/View;
    .locals 1

    .prologue
    .line 1490
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method


# virtual methods
.method public final a(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 2

    .prologue
    .line 997
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 998
    const/4 v0, 0x0

    .line 1000
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->d(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    goto :goto_0
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 1017
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->h(Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    return v0
.end method

.method a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;III)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 1574
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 1577
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->c()I

    move-result v5

    .line 1578
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->d()I

    move-result v6

    .line 1579
    if-le p4, p3, :cond_0

    const/4 v0, 0x1

    move v1, v0

    :goto_0
    move-object v4, v2

    .line 1580
    :goto_1
    if-eq p3, p4, :cond_3

    .line 1581
    invoke-virtual {p0, p3}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v3

    .line 1582
    invoke-static {v3}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    .line 1583
    if-ltz v0, :cond_6

    if-ge v0, p5, :cond_6

    .line 1584
    invoke-virtual {v3}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1585
    if-nez v4, :cond_6

    move-object v0, v2

    .line 1580
    :goto_2
    add-int/2addr p3, v1

    move-object v2, v0

    move-object v4, v3

    goto :goto_1

    .line 1579
    :cond_0
    const/4 v0, -0x1

    move v1, v0

    goto :goto_0

    .line 1588
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v0

    if-ge v0, v6, :cond_2

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0, v3}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v0

    if-ge v0, v5, :cond_4

    .line 1590
    :cond_2
    if-nez v2, :cond_6

    move-object v0, v3

    move-object v3, v4

    .line 1591
    goto :goto_2

    .line 1598
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
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->l()V

    .line 269
    :cond_0
    return-void
.end method

.method a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Landroid/support/v7/widget/LinearLayoutManager$a;)V
    .locals 0

    .prologue
    .line 625
    return-void
.end method

.method a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/LinearLayoutManager$b;)V
    .locals 11

    .prologue
    const/4 v1, 0x0

    const/4 v9, -0x1

    const/4 v5, 0x1

    .line 1364
    invoke-virtual {p3, p1}, Landroid/support/v7/widget/LinearLayoutManager$c;->a(Landroid/support/v7/widget/RecyclerView$m;)Landroid/view/View;

    move-result-object v6

    .line 1365
    if-nez v6, :cond_0

    .line 1371
    iput-boolean v5, p4, Landroid/support/v7/widget/LinearLayoutManager$b;->b:Z

    .line 1434
    :goto_0
    return-void

    .line 1374
    :cond_0
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    .line 1375
    iget-object v2, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    if-nez v2, :cond_5

    .line 1376
    iget-boolean v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    iget v3, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->f:I

    if-ne v3, v9, :cond_1

    move v1, v5

    :cond_1
    if-ne v2, v1, :cond_4

    .line 1378
    invoke-virtual {p0, v6}, Landroid/support/v7/widget/LinearLayoutManager;->c(Landroid/view/View;)V

    .line 1390
    :goto_1
    invoke-virtual {v6}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v2, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v2, v6}, Landroid/support/v7/widget/RecyclerView;->e(Landroid/view/View;)Landroid/graphics/Rect;

    move-result-object v2

    iget v3, v2, Landroid/graphics/Rect;->left:I

    iget v4, v2, Landroid/graphics/Rect;->right:I

    add-int/2addr v3, v4

    add-int/lit8 v3, v3, 0x0

    iget v4, v2, Landroid/graphics/Rect;->top:I

    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    add-int/2addr v2, v4

    add-int/lit8 v2, v2, 0x0

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->q()I

    move-result v4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->s()I

    move-result v7

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->u()I

    move-result v8

    add-int/2addr v7, v8

    iget v8, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->leftMargin:I

    add-int/2addr v7, v8

    iget v8, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->rightMargin:I

    add-int/2addr v7, v8

    add-int/2addr v3, v7

    iget v7, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->width:I

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->f()Z

    move-result v8

    invoke-static {v4, v3, v7, v8}, Landroid/support/v7/widget/RecyclerView$i;->a(IIIZ)I

    move-result v3

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->r()I

    move-result v4

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->t()I

    move-result v7

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->v()I

    move-result v8

    add-int/2addr v7, v8

    iget v8, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->topMargin:I

    add-int/2addr v7, v8

    iget v8, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->bottomMargin:I

    add-int/2addr v7, v8

    add-int/2addr v2, v7

    iget v1, v1, Landroid/support/v7/widget/RecyclerView$LayoutParams;->height:I

    invoke-virtual {p0}, Landroid/support/v7/widget/RecyclerView$i;->g()Z

    move-result v7

    invoke-static {v4, v2, v1, v7}, Landroid/support/v7/widget/RecyclerView$i;->a(IIIZ)I

    move-result v1

    invoke-virtual {v6, v3, v1}, Landroid/view/View;->measure(II)V

    .line 1391
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/q;->c(Landroid/view/View;)I

    move-result v1

    iput v1, p4, Landroid/support/v7/widget/LinearLayoutManager$b;->a:I

    .line 1393
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-ne v1, v5, :cond_a

    .line 1394
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->h()Z

    move-result v1

    if-eqz v1, :cond_8

    .line 1395
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->q()I

    move-result v1

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->u()I

    move-result v2

    sub-int/2addr v1, v2

    .line 1396
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2, v6}, Landroid/support/v7/widget/q;->d(Landroid/view/View;)I

    move-result v2

    sub-int v2, v1, v2

    .line 1401
    :goto_2
    iget v3, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->f:I

    if-ne v3, v9, :cond_9

    .line 1402
    iget v3, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 1403
    iget v4, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    iget v7, p4, Landroid/support/v7/widget/LinearLayoutManager$b;->a:I

    sub-int/2addr v4, v7

    move v10, v3

    move v3, v4

    move v4, v2

    move v2, v1

    move v1, v10

    .line 1422
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

    .line 1430
    iget-object v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v1}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1431
    :cond_2
    iput-boolean v5, p4, Landroid/support/v7/widget/LinearLayoutManager$b;->c:Z

    .line 1433
    :cond_3
    invoke-virtual {v6}, Landroid/view/View;->isFocusable()Z

    move-result v0

    iput-boolean v0, p4, Landroid/support/v7/widget/LinearLayoutManager$b;->d:Z

    goto/16 :goto_0

    .line 1380
    :cond_4
    invoke-virtual {p0, v6}, Landroid/support/v7/widget/LinearLayoutManager;->d(Landroid/view/View;)V

    goto/16 :goto_1

    .line 1383
    :cond_5
    iget-boolean v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    iget v3, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->f:I

    if-ne v3, v9, :cond_6

    move v1, v5

    :cond_6
    if-ne v2, v1, :cond_7

    .line 1385
    invoke-virtual {p0, v6}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/view/View;)V

    goto/16 :goto_1

    .line 1387
    :cond_7
    invoke-virtual {p0, v6}, Landroid/support/v7/widget/LinearLayoutManager;->b(Landroid/view/View;)V

    goto/16 :goto_1

    .line 1398
    :cond_8
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->s()I

    move-result v2

    .line 1399
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/q;->d(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v2

    goto :goto_2

    .line 1405
    :cond_9
    iget v4, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 1406
    iget v3, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    iget v7, p4, Landroid/support/v7/widget/LinearLayoutManager$b;->a:I

    add-int/2addr v3, v7

    move v10, v3

    move v3, v4

    move v4, v2

    move v2, v1

    move v1, v10

    goto :goto_3

    .line 1409
    :cond_a
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->t()I

    move-result v3

    .line 1410
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1, v6}, Landroid/support/v7/widget/q;->d(Landroid/view/View;)I

    move-result v1

    add-int/2addr v1, v3

    .line 1412
    iget v2, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->f:I

    if-ne v2, v9, :cond_b

    .line 1413
    iget v2, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 1414
    iget v4, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    iget v7, p4, Landroid/support/v7/widget/LinearLayoutManager$b;->a:I

    sub-int/2addr v4, v7

    goto :goto_3

    .line 1416
    :cond_b
    iget v4, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 1417
    iget v2, p3, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    iget v7, p4, Landroid/support/v7/widget/LinearLayoutManager$b;->a:I

    add-int/2addr v2, v7

    goto :goto_3
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;I)V
    .locals 2

    .prologue
    .line 424
    new-instance v0, Landroid/support/v7/widget/m;

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Landroid/support/v7/widget/m;-><init>(Landroid/support/v7/widget/LinearLayoutManager;Landroid/content/Context;)V

    .line 432
    invoke-virtual {v0, p2}, Landroid/support/v7/widget/o;->b(I)V

    .line 433
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$p;)V

    .line 434
    return-void
.end method

.method public final a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$m;)V
    .locals 1

    .prologue
    .line 213
    invoke-super {p0, p1, p2}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/support/v7/widget/RecyclerView;Landroid/support/v7/widget/RecyclerView$m;)V

    .line 214
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->f:Z

    if-eqz v0, :cond_0

    .line 215
    invoke-virtual {p0, p2}, Landroid/support/v7/widget/LinearLayoutManager;->c(Landroid/support/v7/widget/RecyclerView$m;)V

    .line 216
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$m;->a()V

    .line 218
    :cond_0
    return-void
.end method

.method public final a(Landroid/view/accessibility/AccessibilityEvent;)V
    .locals 2

    .prologue
    .line 222
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$i;->a(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 223
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    if-lez v0, :cond_0

    .line 224
    invoke-static {p1}, Landroid/support/v4/view/accessibility/AccessibilityEventCompat;->asRecord(Landroid/view/accessibility/AccessibilityEvent;)Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;

    move-result-object v0

    .line 226
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->j()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setFromIndex(I)V

    .line 227
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->k()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v4/view/accessibility/AccessibilityRecordCompat;->setToIndex(I)V

    .line 229
    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 1173
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-nez v0, :cond_0

    .line 1174
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$i;->a(Ljava/lang/String;)V

    .line 1176
    :cond_0
    return-void
.end method

.method public final b(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 1009
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-nez v0, :cond_0

    .line 1010
    const/4 v0, 0x0

    .line 1012
    :goto_0
    return v0

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->d(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    goto :goto_0
.end method

.method public final b(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 1022
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->h(Landroid/support/v7/widget/RecyclerView$q;)I

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

.method public final b(I)Landroid/view/View;
    .locals 2

    .prologue
    .line 385
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

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

    invoke-virtual {p0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v1

    invoke-static {v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v1

    .line 390
    sub-int v1, p1, v1

    .line 391
    if-ltz v1, :cond_2

    if-ge v1, v0, :cond_2

    .line 392
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v0

    .line 393
    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v1

    if-eq v1, p1, :cond_0

    .line 398
    :cond_2
    invoke-super {p0, p1}, Landroid/support/v7/widget/RecyclerView$i;->b(I)Landroid/view/View;

    move-result-object v0

    goto :goto_0
.end method

.method public final c(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 1027
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->i(Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    return v0
.end method

.method public final c(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;
    .locals 9

    .prologue
    const/4 v8, 0x0

    const/4 v0, 0x0

    const/4 v4, -0x1

    const/4 v5, 0x1

    const/high16 v6, -0x80000000

    .line 1710
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->c()V

    .line 1711
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v1

    if-nez v1, :cond_1

    .line 1748
    :cond_0
    :goto_0
    return-object v0

    .line 1715
    :cond_1
    sparse-switch p1, :sswitch_data_0

    move v3, v6

    .line 1716
    :goto_1
    if-eq v3, v6, :cond_0

    .line 1719
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 1721
    if-ne v3, v4, :cond_6

    .line 1722
    invoke-direct {p0, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    .line 1726
    :goto_2
    if-eqz v2, :cond_0

    .line 1733
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 1734
    const v1, 0x3ea8f5c3    # 0.33f

    iget-object v7, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v7}, Landroid/support/v7/widget/q;->f()I

    move-result v7

    int-to-float v7, v7

    mul-float/2addr v1, v7

    float-to-int v1, v1

    .line 1735
    invoke-direct {p0, v3, v1, v8, p3}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZLandroid/support/v7/widget/RecyclerView$q;)V

    .line 1736
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v6, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->g:I

    .line 1737
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput-boolean v8, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->a:Z

    .line 1738
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    invoke-direct {p0, p2, v1, p3, v5}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/RecyclerView$q;Z)I

    .line 1740
    if-ne v3, v4, :cond_7

    .line 1741
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->y()Landroid/view/View;

    move-result-object v1

    .line 1745
    :goto_3
    if-eq v1, v2, :cond_0

    invoke-virtual {v1}, Landroid/view/View;->isFocusable()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v0, v1

    .line 1748
    goto :goto_0

    :sswitch_0
    move v3, v4

    .line 1715
    goto :goto_1

    :sswitch_1
    move v3, v5

    goto :goto_1

    :sswitch_2
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-ne v1, v5, :cond_2

    move v3, v4

    goto :goto_1

    :cond_2
    move v3, v6

    goto :goto_1

    :sswitch_3
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-ne v1, v5, :cond_3

    move v3, v5

    goto :goto_1

    :cond_3
    move v3, v6

    goto :goto_1

    :sswitch_4
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-nez v1, :cond_4

    move v3, v4

    goto :goto_1

    :cond_4
    move v3, v6

    goto :goto_1

    :sswitch_5
    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    if-nez v1, :cond_5

    move v3, v5

    goto :goto_1

    :cond_5
    move v3, v6

    goto :goto_1

    .line 1724
    :cond_6
    invoke-direct {p0, p2, p3}, Landroid/support/v7/widget/LinearLayoutManager;->d(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;

    move-result-object v1

    move-object v2, v1

    goto :goto_2

    .line 1743
    :cond_7
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->z()Landroid/view/View;

    move-result-object v1

    goto :goto_3

    .line 1715
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

.method public final c(I)V
    .locals 2

    .prologue
    .line 954
    iput p1, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    .line 955
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    .line 956
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_0

    .line 957
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    const/4 v1, -0x1

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a:I

    .line 959
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->l()V

    .line 960
    return-void
.end method

.method public c(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)V
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
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 469
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->a:Z

    .line 471
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->c()V

    .line 473
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/LinearLayoutManager$a;

    const/4 v1, -0x1

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$a;->a:I

    const/high16 v1, -0x80000000

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    .line 474
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/LinearLayoutManager$a;

    iget-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    iget-boolean v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    xor-int/2addr v1, v2

    iput-boolean v1, v0, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    .line 476
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/LinearLayoutManager$a;

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-nez v0, :cond_1

    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_9

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_3

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    if-eqz v0, :cond_24

    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    if-nez v0, :cond_18

    const/4 v0, 0x0

    move-object v1, v0

    :goto_1
    if-eqz v1, :cond_1e

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    iget-object v3, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v3

    if-nez v3, :cond_1b

    iget-object v3, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v3}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v3

    if-ltz v3, :cond_1b

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->a:Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v0

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v3

    if-ge v0, v3, :cond_1b

    const/4 v0, 0x1

    :goto_2
    if-eqz v0, :cond_1e

    iget-object v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v0, v0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->b()I

    move-result v0

    if-ltz v0, :cond_1c

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/LinearLayoutManager$a;->a(Landroid/view/View;)V

    :cond_2
    :goto_3
    const/4 v0, 0x1

    :goto_4
    if-nez v0, :cond_3

    invoke-virtual {v2}, Landroid/support/v7/widget/LinearLayoutManager$a;->a()V

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    if-eqz v0, :cond_25

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    :goto_5
    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->a:I

    .line 485
    :cond_3
    invoke-direct {p0, p2}, Landroid/support/v7/widget/LinearLayoutManager;->g(Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    .line 488
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v1, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->j:I

    if-ltz v1, :cond_26

    .line 490
    const/4 v1, 0x0

    .line 495
    :goto_6
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2}, Landroid/support/v7/widget/q;->c()I

    move-result v2

    add-int/2addr v1, v2

    .line 496
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2}, Landroid/support/v7/widget/q;->g()I

    move-result v2

    add-int/2addr v0, v2

    .line 497
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

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

    invoke-virtual {p0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->b(I)Landroid/view/View;

    move-result-object v2

    .line 503
    if-eqz v2, :cond_4

    .line 506
    iget-boolean v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v3, :cond_27

    .line 507
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3}, Landroid/support/v7/widget/q;->d()I

    move-result v3

    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v4, v2}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

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
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/LinearLayoutManager$a;

    invoke-virtual {p0, p1, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Landroid/support/v7/widget/LinearLayoutManager$a;)V

    .line 525
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;)V

    .line 526
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v3

    iput-boolean v3, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->i:Z

    .line 527
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/LinearLayoutManager$a;

    iget-boolean v2, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    if-eqz v2, :cond_29

    .line 529
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/LinearLayoutManager$a;

    invoke-direct {p0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->b(Landroid/support/v7/widget/LinearLayoutManager$a;)V

    .line 530
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v1, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    .line 531
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v1, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/RecyclerView$q;Z)I

    .line 532
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v1, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 533
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v3, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    .line 534
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v2, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    if-lez v2, :cond_5

    .line 535
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v2, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    add-int/2addr v0, v2

    .line 538
    :cond_5
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/LinearLayoutManager$a;

    invoke-direct {p0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/LinearLayoutManager$a;)V

    .line 539
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    .line 540
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v4, v4, Landroid/support/v7/widget/LinearLayoutManager$c;->e:I

    add-int/2addr v2, v4

    iput v2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    .line 541
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/RecyclerView$q;Z)I

    .line 542
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 544
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v0, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    if-lez v0, :cond_35

    .line 546
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v0, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    .line 547
    invoke-direct {p0, v3, v1}, Landroid/support/v7/widget/LinearLayoutManager;->g(II)V

    .line 548
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v0, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    .line 549
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/RecyclerView$q;Z)I

    .line 550
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v0, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    :goto_9
    move v1, v0

    move v0, v2

    .line 582
    :cond_6
    :goto_a
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v2

    if-lez v2, :cond_34

    .line 586
    iget-boolean v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    iget-boolean v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    xor-int/2addr v2, v3

    if-eqz v2, :cond_2b

    .line 587
    const/4 v2, 0x1

    invoke-direct {p0, v0, p1, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Z)I

    move-result v2

    .line 588
    add-int/2addr v1, v2

    .line 589
    add-int/2addr v0, v2

    .line 590
    const/4 v2, 0x0

    invoke-direct {p0, v1, p1, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->b(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Z)I

    move-result v2

    .line 591
    add-int/2addr v1, v2

    .line 592
    add-int/2addr v0, v2

    move v2, v1

    move v1, v0

    .line 602
    :goto_b
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->b()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-nez v0, :cond_7

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->d()Z

    move-result v0

    if-nez v0, :cond_2c

    .line 603
    :cond_7
    :goto_c
    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v0

    if-nez v0, :cond_8

    .line 604
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    .line 605
    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    .line 606
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->a()V

    .line 608
    :cond_8
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    iput-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->b:Z

    .line 609
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    .line 613
    return-void

    .line 476
    :cond_9
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    if-ltz v0, :cond_a

    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->e()I

    move-result v1

    if-lt v0, v1, :cond_b

    :cond_a
    const/4 v0, -0x1

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    const/high16 v0, -0x80000000

    iput v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    const/4 v0, 0x0

    goto/16 :goto_0

    :cond_b
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->a:I

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_d

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    invoke-virtual {v0}, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a()Z

    move-result v0

    if-eqz v0, :cond_d

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    iget-boolean v0, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->c:Z

    iput-boolean v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    iget-boolean v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    if-eqz v0, :cond_c

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->d()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    iget v1, v1, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->b:I

    sub-int/2addr v0, v1

    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    :goto_d
    const/4 v0, 0x1

    goto/16 :goto_0

    :cond_c
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->c()I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    iget v1, v1, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->b:I

    add-int/2addr v0, v1

    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    goto :goto_d

    :cond_d
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_16

    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->b(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_12

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/q;->c(Landroid/view/View;)I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3}, Landroid/support/v7/widget/q;->f()I

    move-result v3

    if-le v1, v3, :cond_e

    invoke-virtual {v2}, Landroid/support/v7/widget/LinearLayoutManager$a;->a()V

    :goto_e
    const/4 v0, 0x1

    goto/16 :goto_0

    :cond_e
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3}, Landroid/support/v7/widget/q;->c()I

    move-result v3

    sub-int/2addr v1, v3

    if-gez v1, :cond_f

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->c()I

    move-result v0

    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    const/4 v0, 0x0

    iput-boolean v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    goto :goto_e

    :cond_f
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1}, Landroid/support/v7/widget/q;->d()I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v1, v3

    if-gez v1, :cond_10

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->d()I

    move-result v0

    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    const/4 v0, 0x1

    iput-boolean v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    goto :goto_e

    :cond_10
    iget-boolean v1, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    if-eqz v1, :cond_11

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1}, Landroid/support/v7/widget/q;->b()I

    move-result v1

    add-int/2addr v0, v1

    :goto_f
    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    :goto_10
    const/4 v0, 0x1

    goto/16 :goto_0

    :cond_11
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v0

    goto :goto_f

    :cond_12
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    if-lez v0, :cond_13

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    if-ge v1, v0, :cond_14

    const/4 v0, 0x1

    :goto_11
    iget-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-ne v0, v1, :cond_15

    const/4 v0, 0x1

    :goto_12
    iput-boolean v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    :cond_13
    invoke-virtual {v2}, Landroid/support/v7/widget/LinearLayoutManager$a;->a()V

    goto :goto_10

    :cond_14
    const/4 v0, 0x0

    goto :goto_11

    :cond_15
    const/4 v0, 0x0

    goto :goto_12

    :cond_16
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    iput-boolean v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eqz v0, :cond_17

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->d()I

    move-result v0

    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    sub-int/2addr v0, v1

    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    goto/16 :goto_e

    :cond_17
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->c()I

    move-result v0

    iget v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    add-int/2addr v0, v1

    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    goto/16 :goto_e

    :cond_18
    iget-object v0, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView;->getFocusedChild()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_19

    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->q:Landroid/support/v7/widget/b;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/b;->b(Landroid/view/View;)Z

    move-result v1

    if-eqz v1, :cond_1a

    :cond_19
    const/4 v0, 0x0

    move-object v1, v0

    goto/16 :goto_1

    :cond_1a
    move-object v1, v0

    goto/16 :goto_1

    :cond_1b
    const/4 v0, 0x0

    goto/16 :goto_2

    :cond_1c
    invoke-static {v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v3

    iput v3, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->a:I

    iget-boolean v3, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    if-eqz v3, :cond_1d

    iget-object v3, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v3, v3, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3}, Landroid/support/v7/widget/q;->d()I

    move-result v3

    sub-int v0, v3, v0

    iget-object v3, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v3, v3, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v3

    sub-int/2addr v0, v3

    iget-object v3, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v3, v3, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3}, Landroid/support/v7/widget/q;->d()I

    move-result v3

    sub-int/2addr v3, v0

    iput v3, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    if-lez v0, :cond_2

    iget-object v3, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v3, v3, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/q;->c(Landroid/view/View;)I

    move-result v3

    iget v4, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    sub-int v3, v4, v3

    iget-object v4, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v4, v4, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v4}, Landroid/support/v7/widget/q;->c()I

    move-result v4

    iget-object v5, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v5, v5, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v5, v1}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v1, v4

    const/4 v5, 0x0

    invoke-static {v1, v5}, Ljava/lang/Math;->min(II)I

    move-result v1

    add-int/2addr v1, v4

    sub-int v1, v3, v1

    if-gez v1, :cond_2

    iget v3, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    neg-int v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    add-int/2addr v0, v3

    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    goto/16 :goto_3

    :cond_1d
    iget-object v3, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v3, v3, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v3

    iget-object v4, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v4, v4, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v4}, Landroid/support/v7/widget/q;->c()I

    move-result v4

    sub-int v4, v3, v4

    iput v3, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    if-lez v4, :cond_2

    iget-object v5, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v5, v5, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v5, v1}, Landroid/support/v7/widget/q;->c(Landroid/view/View;)I

    move-result v5

    add-int/2addr v3, v5

    iget-object v5, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v5, v5, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v5}, Landroid/support/v7/widget/q;->d()I

    move-result v5

    sub-int v0, v5, v0

    iget-object v5, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v5, v5, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v5, v1}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v1

    sub-int/2addr v0, v1

    iget-object v1, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->d:Landroid/support/v7/widget/LinearLayoutManager;

    iget-object v1, v1, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1}, Landroid/support/v7/widget/q;->d()I

    move-result v1

    const/4 v5, 0x0

    invoke-static {v5, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v0, v1, v0

    sub-int/2addr v0, v3

    if-gez v0, :cond_2

    iget v1, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    neg-int v0, v0

    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    sub-int v0, v1, v0

    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    goto/16 :goto_3

    :cond_1e
    iget-boolean v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->b:Z

    iget-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->d:Z

    if-ne v0, v1, :cond_24

    iget-boolean v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    if-eqz v0, :cond_21

    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->d(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;

    move-result-object v0

    :goto_13
    if-eqz v0, :cond_24

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/LinearLayoutManager$a;->a(Landroid/view/View;)V

    invoke-virtual {p2}, Landroid/support/v7/widget/RecyclerView$q;->a()Z

    move-result v1

    if-nez v1, :cond_20

    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->d()Z

    move-result v1

    if-eqz v1, :cond_20

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v1

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3}, Landroid/support/v7/widget/q;->d()I

    move-result v3

    if-ge v1, v3, :cond_1f

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

    move-result v0

    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v1}, Landroid/support/v7/widget/q;->c()I

    move-result v1

    if-ge v0, v1, :cond_22

    :cond_1f
    const/4 v0, 0x1

    :goto_14
    if-eqz v0, :cond_20

    iget-boolean v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->c:Z

    if-eqz v0, :cond_23

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->d()I

    move-result v0

    :goto_15
    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$a;->b:I

    :cond_20
    const/4 v0, 0x1

    goto/16 :goto_4

    :cond_21
    invoke-direct {p0, p1, p2}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;)Landroid/view/View;

    move-result-object v0

    goto :goto_13

    :cond_22
    const/4 v0, 0x0

    goto :goto_14

    :cond_23
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v0}, Landroid/support/v7/widget/q;->c()I

    move-result v0

    goto :goto_15

    :cond_24
    const/4 v0, 0x0

    goto/16 :goto_4

    :cond_25
    const/4 v0, 0x0

    goto/16 :goto_5

    .line 492
    :cond_26
    const/4 v1, 0x0

    move v11, v1

    move v1, v0

    move v0, v11

    goto/16 :goto_6

    .line 511
    :cond_27
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3, v2}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v2

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3}, Landroid/support/v7/widget/q;->c()I

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
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/LinearLayoutManager$a;

    invoke-direct {p0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/LinearLayoutManager$a;)V

    .line 555
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v0, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    .line 556
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/RecyclerView$q;Z)I

    .line 557
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v0, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 558
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v2, v2, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    .line 559
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v3, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    if-lez v3, :cond_2a

    .line 560
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v3, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    add-int/2addr v1, v3

    .line 563
    :cond_2a
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->p:Landroid/support/v7/widget/LinearLayoutManager$a;

    invoke-direct {p0, v3}, Landroid/support/v7/widget/LinearLayoutManager;->b(Landroid/support/v7/widget/LinearLayoutManager$a;)V

    .line 564
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v1, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    .line 565
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v3, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    iget-object v4, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v4, v4, Landroid/support/v7/widget/LinearLayoutManager$c;->e:I

    add-int/2addr v3, v4

    iput v3, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->d:I

    .line 566
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v3, 0x0

    invoke-direct {p0, p1, v1, p2, v3}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/RecyclerView$q;Z)I

    .line 567
    iget-object v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v1, v1, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    .line 569
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v3, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    if-lez v3, :cond_6

    .line 570
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v3, v3, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    .line 572
    invoke-direct {p0, v2, v0}, Landroid/support/v7/widget/LinearLayoutManager;->f(II)V

    .line 573
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v3, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    .line 574
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/RecyclerView$q;Z)I

    .line 575
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iget v0, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->b:I

    goto/16 :goto_a

    .line 594
    :cond_2b
    const/4 v2, 0x1

    invoke-direct {p0, v1, p1, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->b(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Z)I

    move-result v2

    .line 595
    add-int/2addr v1, v2

    .line 596
    add-int/2addr v0, v2

    .line 597
    const/4 v2, 0x0

    invoke-direct {p0, v0, p1, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(ILandroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/RecyclerView$q;Z)I

    move-result v2

    .line 598
    add-int/2addr v1, v2

    .line 599
    add-int/2addr v0, v2

    move v2, v1

    move v1, v0

    goto/16 :goto_b

    .line 602
    :cond_2c
    const/4 v5, 0x0

    const/4 v4, 0x0

    invoke-virtual {p1}, Landroid/support/v7/widget/RecyclerView$m;->b()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v8

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/LinearLayoutManager;->d(I)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v9

    const/4 v0, 0x0

    move v6, v0

    :goto_16
    if-ge v6, v8, :cond_30

    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$t;

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->m()Z

    move-result v3

    if-nez v3, :cond_33

    invoke-virtual {v0}, Landroid/support/v7/widget/RecyclerView$t;->c()I

    move-result v3

    if-ge v3, v9, :cond_2d

    const/4 v3, 0x1

    :goto_17
    iget-boolean v10, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    if-eq v3, v10, :cond_2e

    const/4 v3, -0x1

    :goto_18
    const/4 v10, -0x1

    if-ne v3, v10, :cond_2f

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/q;->c(Landroid/view/View;)I

    move-result v0

    add-int/2addr v0, v5

    move v3, v0

    move v0, v4

    :goto_19
    add-int/lit8 v4, v6, 0x1

    move v5, v3

    move v6, v4

    move v4, v0

    goto :goto_16

    :cond_2d
    const/4 v3, 0x0

    goto :goto_17

    :cond_2e
    const/4 v3, 0x1

    goto :goto_18

    :cond_2f
    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView$t;->a:Landroid/view/View;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/q;->c(Landroid/view/View;)I

    move-result v0

    add-int/2addr v0, v4

    move v3, v5

    goto :goto_19

    :cond_30
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput-object v7, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->k:Ljava/util/List;

    if-lez v5, :cond_31

    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->y()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    invoke-direct {p0, v0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->g(II)V

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v5, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v2, 0x0

    iput v2, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/LinearLayoutManager$c;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, p2, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/RecyclerView$q;Z)I

    :cond_31
    if-lez v4, :cond_32

    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->z()Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    invoke-direct {p0, v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->f(II)V

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    iput v4, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->h:I

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v1, 0x0

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->c:I

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/LinearLayoutManager$c;->a(Landroid/support/v7/widget/RecyclerView$t;)V

    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v1, 0x0

    invoke-direct {p0, p1, v0, p2, v1}, Landroid/support/v7/widget/LinearLayoutManager;->a(Landroid/support/v7/widget/RecyclerView$m;Landroid/support/v7/widget/LinearLayoutManager$c;Landroid/support/v7/widget/RecyclerView$q;Z)I

    :cond_32
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    const/4 v1, 0x0

    iput-object v1, v0, Landroid/support/v7/widget/LinearLayoutManager$c;->k:Ljava/util/List;

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

.method public final d(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 1032
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->i(Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 2

    .prologue
    .line 1817
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

.method public final e(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 1037
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->j(Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    return v0
.end method

.method public final e()Landroid/os/Parcelable;
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
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v1

    if-lez v1, :cond_2

    .line 238
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->i()V

    .line 239
    iget-boolean v1, p0, Landroid/support/v7/widget/LinearLayoutManager;->b:Z

    iget-boolean v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->l:Z

    xor-int/2addr v1, v2

    .line 240
    iput-boolean v1, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->c:Z

    .line 241
    if-eqz v1, :cond_1

    .line 242
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->z()Landroid/view/View;

    move-result-object v1

    .line 243
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2}, Landroid/support/v7/widget/q;->d()I

    move-result v2

    iget-object v3, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v3, v1}, Landroid/support/v7/widget/q;->b(Landroid/view/View;)I

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
    invoke-direct {p0}, Landroid/support/v7/widget/LinearLayoutManager;->y()Landroid/view/View;

    move-result-object v1

    .line 248
    invoke-static {v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v2

    iput v2, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a:I

    .line 249
    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2, v1}, Landroid/support/v7/widget/q;->a(Landroid/view/View;)I

    move-result v1

    iget-object v2, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    invoke-virtual {v2}, Landroid/support/v7/widget/q;->c()I

    move-result v2

    sub-int/2addr v1, v2

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->b:I

    goto :goto_0

    .line 253
    :cond_2
    const/4 v1, -0x1

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a:I

    goto :goto_0
.end method

.method public final e(II)V
    .locals 2

    .prologue
    .line 982
    iput p1, p0, Landroid/support/v7/widget/LinearLayoutManager;->m:I

    .line 983
    iput p2, p0, Landroid/support/v7/widget/LinearLayoutManager;->n:I

    .line 984
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    if-eqz v0, :cond_0

    .line 985
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->o:Landroid/support/v7/widget/LinearLayoutManager$SavedState;

    const/4 v1, -0x1

    iput v1, v0, Landroid/support/v7/widget/LinearLayoutManager$SavedState;->a:I

    .line 987
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->l()V

    .line 988
    return-void
.end method

.method public final f(Landroid/support/v7/widget/RecyclerView$q;)I
    .locals 1

    .prologue
    .line 1042
    invoke-direct {p0, p1}, Landroid/support/v7/widget/LinearLayoutManager;->j(Landroid/support/v7/widget/RecyclerView$q;)I

    move-result v0

    return v0
.end method

.method public final f()Z
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

.method public final g()Z
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

.method protected final h()Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 917
    iget-object v1, p0, Landroid/support/v7/widget/RecyclerView$i;->r:Landroid/support/v7/widget/RecyclerView;

    invoke-static {v1}, Landroid/support/v4/view/ViewCompat;->getLayoutDirection(Landroid/view/View;)I

    move-result v1

    if-ne v1, v0, :cond_0

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final i()V
    .locals 1

    .prologue
    .line 921
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    if-nez v0, :cond_0

    .line 922
    new-instance v0, Landroid/support/v7/widget/LinearLayoutManager$c;

    invoke-direct {v0}, Landroid/support/v7/widget/LinearLayoutManager$c;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->a:Landroid/support/v7/widget/LinearLayoutManager$c;

    .line 924
    :cond_0
    iget-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    if-nez v0, :cond_1

    .line 925
    iget v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->j:I

    invoke-static {p0, v0}, Landroid/support/v7/widget/q;->a(Landroid/support/v7/widget/RecyclerView$i;I)Landroid/support/v7/widget/q;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/LinearLayoutManager;->k:Landroid/support/v7/widget/q;

    .line 927
    :cond_1
    return-void
.end method

.method public final j()I
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 1620
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v0

    invoke-direct {p0, v1, v0, v1}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v0

    .line 1621
    if-nez v0, :cond_0

    const/4 v0, -0x1

    :goto_0
    return v0

    :cond_0
    invoke-static {v0}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    goto :goto_0
.end method

.method public final k()I
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 1660
    invoke-virtual {p0}, Landroid/support/v7/widget/LinearLayoutManager;->p()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    const/4 v2, 0x0

    invoke-direct {p0, v1, v0, v2}, Landroid/support/v7/widget/LinearLayoutManager;->a(IIZ)Landroid/view/View;

    move-result-object v1

    .line 1661
    if-nez v1, :cond_0

    :goto_0
    return v0

    :cond_0
    invoke-static {v1}, Landroid/support/v7/widget/LinearLayoutManager;->e(Landroid/view/View;)I

    move-result v0

    goto :goto_0
.end method
