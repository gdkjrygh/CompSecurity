.class public abstract Landroid/support/v7/widget/bi;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Landroid/view/View;

.field b:I

.field c:I

.field d:J

.field e:I

.field f:I

.field g:Landroid/support/v7/widget/bi;

.field h:Landroid/support/v7/widget/bi;

.field i:Landroid/support/v7/widget/RecyclerView;

.field private j:I

.field private k:I

.field private l:Landroid/support/v7/widget/az;


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 7965
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7873
    iput v2, p0, Landroid/support/v7/widget/bi;->b:I

    .line 7874
    iput v2, p0, Landroid/support/v7/widget/bi;->c:I

    .line 7875
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroid/support/v7/widget/bi;->d:J

    .line 7876
    iput v2, p0, Landroid/support/v7/widget/bi;->e:I

    .line 7877
    iput v2, p0, Landroid/support/v7/widget/bi;->f:I

    .line 7880
    iput-object v3, p0, Landroid/support/v7/widget/bi;->g:Landroid/support/v7/widget/bi;

    .line 7882
    iput-object v3, p0, Landroid/support/v7/widget/bi;->h:Landroid/support/v7/widget/bi;

    .line 7953
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/bi;->k:I

    .line 7957
    iput-object v3, p0, Landroid/support/v7/widget/bi;->l:Landroid/support/v7/widget/az;

    .line 7966
    if-nez p1, :cond_0

    .line 7967
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "itemView may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 7969
    :cond_0
    iput-object p1, p0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    .line 7970
    return-void
.end method

.method static synthetic a(Landroid/support/v7/widget/bi;)Z
    .locals 1

    .prologue
    .line 7871
    .line 9263
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->hasTransientState(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 7871
    goto :goto_0
.end method

.method static synthetic b(Landroid/support/v7/widget/bi;)Landroid/support/v7/widget/az;
    .locals 1

    .prologue
    .line 7871
    const/4 v0, 0x0

    iput-object v0, p0, Landroid/support/v7/widget/bi;->l:Landroid/support/v7/widget/az;

    return-object v0
.end method

.method static synthetic c(Landroid/support/v7/widget/bi;)Z
    .locals 1

    .prologue
    .line 7871
    .line 10255
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 7871
    goto :goto_0
.end method

.method static synthetic d(Landroid/support/v7/widget/bi;)I
    .locals 1

    .prologue
    .line 7871
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    return v0
.end method


# virtual methods
.method final a()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 7995
    iput v0, p0, Landroid/support/v7/widget/bi;->c:I

    .line 7996
    iput v0, p0, Landroid/support/v7/widget/bi;->f:I

    .line 7997
    return-void
.end method

.method final a(I)V
    .locals 1

    .prologue
    .line 8174
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    or-int/2addr v0, p1

    iput v0, p0, Landroid/support/v7/widget/bi;->j:I

    .line 8175
    return-void
.end method

.method final a(II)V
    .locals 2

    .prologue
    .line 8170
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    xor-int/lit8 v1, p2, -0x1

    and-int/2addr v0, v1

    and-int v1, p1, p2

    or-int/2addr v0, v1

    iput v0, p0, Landroid/support/v7/widget/bi;->j:I

    .line 8171
    return-void
.end method

.method final a(IZ)V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 7979
    iget v0, p0, Landroid/support/v7/widget/bi;->c:I

    if-ne v0, v1, :cond_0

    .line 7980
    iget v0, p0, Landroid/support/v7/widget/bi;->b:I

    iput v0, p0, Landroid/support/v7/widget/bi;->c:I

    .line 7982
    :cond_0
    iget v0, p0, Landroid/support/v7/widget/bi;->f:I

    if-ne v0, v1, :cond_1

    .line 7983
    iget v0, p0, Landroid/support/v7/widget/bi;->b:I

    iput v0, p0, Landroid/support/v7/widget/bi;->f:I

    .line 7985
    :cond_1
    if-eqz p2, :cond_2

    .line 7986
    iget v0, p0, Landroid/support/v7/widget/bi;->f:I

    add-int/2addr v0, p1

    iput v0, p0, Landroid/support/v7/widget/bi;->f:I

    .line 7988
    :cond_2
    iget v0, p0, Landroid/support/v7/widget/bi;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Landroid/support/v7/widget/bi;->b:I

    .line 7989
    iget-object v0, p0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 7990
    iget-object v0, p0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/support/v7/widget/RecyclerView$LayoutParams;->c:Z

    .line 7992
    :cond_3
    return-void
.end method

.method final a(Landroid/support/v7/widget/az;)V
    .locals 0

    .prologue
    .line 8134
    iput-object p1, p0, Landroid/support/v7/widget/bi;->l:Landroid/support/v7/widget/az;

    .line 8135
    return-void
.end method

.method public final a(Z)V
    .locals 3

    .prologue
    .line 8221
    if-eqz p1, :cond_1

    iget v0, p0, Landroid/support/v7/widget/bi;->k:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    iput v0, p0, Landroid/support/v7/widget/bi;->k:I

    .line 8222
    iget v0, p0, Landroid/support/v7/widget/bi;->k:I

    if-gez v0, :cond_2

    .line 8223
    const/4 v0, 0x0

    iput v0, p0, Landroid/support/v7/widget/bi;->k:I

    .line 8228
    const-string v0, "View"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8238
    :cond_0
    :goto_1
    return-void

    .line 8221
    :cond_1
    iget v0, p0, Landroid/support/v7/widget/bi;->k:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 8230
    :cond_2
    if-nez p1, :cond_3

    iget v0, p0, Landroid/support/v7/widget/bi;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 8231
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Landroid/support/v7/widget/bi;->j:I

    goto :goto_1

    .line 8232
    :cond_3
    if-eqz p1, :cond_0

    iget v0, p0, Landroid/support/v7/widget/bi;->k:I

    if-nez v0, :cond_0

    .line 8233
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Landroid/support/v7/widget/bi;->j:I

    goto :goto_1
.end method

.method final b()Z
    .locals 1

    .prologue
    .line 8006
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()I
    .locals 2

    .prologue
    .line 8045
    iget v0, p0, Landroid/support/v7/widget/bi;->f:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Landroid/support/v7/widget/bi;->b:I

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Landroid/support/v7/widget/bi;->f:I

    goto :goto_0
.end method

.method public final d()I
    .locals 1

    .prologue
    .line 8106
    iget v0, p0, Landroid/support/v7/widget/bi;->e:I

    return v0
.end method

.method final e()Z
    .locals 1

    .prologue
    .line 8110
    iget-object v0, p0, Landroid/support/v7/widget/bi;->l:Landroid/support/v7/widget/az;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final f()V
    .locals 1

    .prologue
    .line 8114
    iget-object v0, p0, Landroid/support/v7/widget/bi;->l:Landroid/support/v7/widget/az;

    invoke-virtual {v0, p0}, Landroid/support/v7/widget/az;->b(Landroid/support/v7/widget/bi;)V

    .line 8115
    return-void
.end method

.method final g()Z
    .locals 1

    .prologue
    .line 8118
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final h()V
    .locals 1

    .prologue
    .line 8122
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Landroid/support/v7/widget/bi;->j:I

    .line 8123
    return-void
.end method

.method final i()V
    .locals 1

    .prologue
    .line 8126
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Landroid/support/v7/widget/bi;->j:I

    .line 8127
    return-void
.end method

.method final j()Z
    .locals 1

    .prologue
    .line 8138
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final k()Z
    .locals 1

    .prologue
    .line 8142
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final l()Z
    .locals 1

    .prologue
    .line 8146
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final m()Z
    .locals 1

    .prologue
    .line 8150
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final n()Z
    .locals 1

    .prologue
    .line 8154
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final o()Z
    .locals 1

    .prologue
    .line 8158
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit16 v0, v0, 0x20c

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final p()Z
    .locals 1

    .prologue
    .line 8162
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final q()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 8178
    iput v3, p0, Landroid/support/v7/widget/bi;->j:I

    .line 8179
    iput v2, p0, Landroid/support/v7/widget/bi;->b:I

    .line 8180
    iput v2, p0, Landroid/support/v7/widget/bi;->c:I

    .line 8181
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Landroid/support/v7/widget/bi;->d:J

    .line 8182
    iput v2, p0, Landroid/support/v7/widget/bi;->f:I

    .line 8183
    iput v3, p0, Landroid/support/v7/widget/bi;->k:I

    .line 8184
    iput-object v4, p0, Landroid/support/v7/widget/bi;->g:Landroid/support/v7/widget/bi;

    .line 8185
    iput-object v4, p0, Landroid/support/v7/widget/bi;->h:Landroid/support/v7/widget/bi;

    .line 8186
    return-void
.end method

.method public final r()Z
    .locals 1

    .prologue
    .line 8246
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-static {v0}, Landroid/support/v4/view/ViewCompat;->hasTransientState(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 8190
    new-instance v1, Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "ViewHolder{"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " position="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Landroid/support/v7/widget/bi;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " id="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Landroid/support/v7/widget/bi;->d:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", oldPos="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Landroid/support/v7/widget/bi;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", pLpos:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Landroid/support/v7/widget/bi;->f:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8193
    invoke-virtual {p0}, Landroid/support/v7/widget/bi;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, " scrap"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8194
    :cond_0
    invoke-virtual {p0}, Landroid/support/v7/widget/bi;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, " invalid"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8195
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/bi;->m()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, " unbound"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8196
    :cond_2
    invoke-virtual {p0}, Landroid/support/v7/widget/bi;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, " update"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8197
    :cond_3
    invoke-virtual {p0}, Landroid/support/v7/widget/bi;->n()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, " removed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8198
    :cond_4
    invoke-virtual {p0}, Landroid/support/v7/widget/bi;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, " ignored"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8199
    :cond_5
    invoke-virtual {p0}, Landroid/support/v7/widget/bi;->l()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, " changed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8200
    :cond_6
    invoke-virtual {p0}, Landroid/support/v7/widget/bi;->p()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, " tmpDetached"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8201
    :cond_7
    invoke-virtual {p0}, Landroid/support/v7/widget/bi;->r()Z

    move-result v0

    if-nez v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, " not recyclable("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Landroid/support/v7/widget/bi;->k:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9166
    :cond_8
    iget v0, p0, Landroid/support/v7/widget/bi;->j:I

    and-int/lit16 v0, v0, 0x200

    if-nez v0, :cond_9

    invoke-virtual {p0}, Landroid/support/v7/widget/bi;->j()Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_9
    const/4 v0, 0x1

    .line 8202
    :goto_0
    if-eqz v0, :cond_a

    const-string v0, "undefined adapter position"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8204
    :cond_a
    iget-object v0, p0, Landroid/support/v7/widget/bi;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_b

    const-string v0, " no parent"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8205
    :cond_b
    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8206
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 9166
    :cond_c
    const/4 v0, 0x0

    goto :goto_0
.end method
