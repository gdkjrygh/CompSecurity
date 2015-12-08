.class public final Lcom/roidapp/videolib/b/g;
.super Lcom/roidapp/videolib/b/c;
.source "SourceFile"


# static fields
.field public static final x:Lcom/roidapp/videolib/b/u;


# instance fields
.field y:[J

.field private z:Ljp/co/cyberagent/android/a/s;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 20
    sget-object v0, Lcom/roidapp/videolib/b/u;->b:Lcom/roidapp/videolib/b/u;

    sput-object v0, Lcom/roidapp/videolib/b/g;->x:Lcom/roidapp/videolib/b/u;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 12

    .prologue
    const/4 v11, 0x1

    const/4 v10, 0x0

    const v7, 0x3f8ccccd    # 1.1f

    const/high16 v6, 0x3f800000    # 1.0f

    const/4 v1, 0x3

    .line 25
    invoke-direct {p0, p1}, Lcom/roidapp/videolib/b/c;-><init>(Landroid/content/Context;)V

    .line 22
    const/16 v0, 0x8

    new-array v0, v0, [J

    fill-array-data v0, :array_0

    iput-object v0, p0, Lcom/roidapp/videolib/b/g;->y:[J

    .line 29
    new-instance v0, Ljp/co/cyberagent/android/a/s;

    invoke-direct {v0}, Ljp/co/cyberagent/android/a/s;-><init>()V

    iput-object v0, p0, Lcom/roidapp/videolib/b/g;->z:Ljp/co/cyberagent/android/a/s;

    .line 31
    const/4 v0, 0x6

    new-array v8, v0, [Lcom/roidapp/videolib/b/x;

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0xc1c

    const-wide/16 v4, 0xed8

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v8, v10

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x14d2

    const-wide/16 v4, 0x1932

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v8, v11

    const/4 v9, 0x2

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x1e32

    const-wide/16 v4, 0x221a

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v8, v9

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x26ca

    const-wide/16 v4, 0x2af8

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v8, v1

    const/4 v9, 0x4

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x2d50

    const-wide/16 v4, 0x31e2

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v8, v9

    const/4 v9, 0x5

    new-instance v0, Lcom/roidapp/videolib/b/x;

    const-wide/16 v2, 0x35a2

    const-wide/16 v4, 0x3a98

    const v7, 0x3f866666    # 1.05f

    invoke-direct/range {v0 .. v7}, Lcom/roidapp/videolib/b/x;-><init>(IJJFF)V

    aput-object v0, v8, v9

    iput-object v8, p0, Lcom/roidapp/videolib/b/g;->p:[Lcom/roidapp/videolib/b/x;

    .line 45
    const/4 v0, 0x6

    new-array v8, v0, [Lcom/roidapp/videolib/b/l;

    new-instance v2, Lcom/roidapp/videolib/b/l;

    const-wide/16 v4, 0x708

    const-wide/16 v6, 0xf00

    move v3, v10

    invoke-direct/range {v2 .. v7}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v2, v8, v10

    new-instance v2, Lcom/roidapp/videolib/b/l;

    const-wide/16 v4, 0xf14

    const-wide/16 v6, 0x1932

    move v3, v11

    invoke-direct/range {v2 .. v7}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v2, v8, v11

    const/4 v0, 0x2

    new-instance v2, Lcom/roidapp/videolib/b/l;

    const/4 v3, 0x2

    const-wide/16 v4, 0x193c

    const-wide/16 v6, 0x2224

    invoke-direct/range {v2 .. v7}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v2, v8, v0

    new-instance v0, Lcom/roidapp/videolib/b/l;

    const-wide/16 v2, 0x2224

    const-wide/16 v4, 0x2af8

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v0, v8, v1

    const/4 v6, 0x4

    new-instance v0, Lcom/roidapp/videolib/b/l;

    const/4 v1, 0x4

    const-wide/16 v2, 0x2af8

    const-wide/16 v4, 0x31e2

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v0, v8, v6

    const/4 v6, 0x5

    new-instance v0, Lcom/roidapp/videolib/b/l;

    const/4 v1, 0x5

    const-wide/16 v2, 0x31e2

    const-wide/16 v4, 0x3a98

    invoke-direct/range {v0 .. v5}, Lcom/roidapp/videolib/b/l;-><init>(IJJ)V

    aput-object v0, v8, v6

    iput-object v8, p0, Lcom/roidapp/videolib/b/g;->q:[Lcom/roidapp/videolib/b/l;

    .line 54
    return-void

    .line 22
    :array_0
    .array-data 8
        0x0
        0x1f4
        0x5dc
        0xbb8
        0x1388
        0x2710
        0x2ee0
        0x3a98
    .end array-data
.end method


# virtual methods
.method public final a(J)Ljp/co/cyberagent/android/a/h;
    .locals 5

    .prologue
    .line 180
    iget-wide v0, p0, Lcom/roidapp/videolib/b/g;->v:J

    iget-wide v2, p0, Lcom/roidapp/videolib/b/g;->u:J

    sub-long/2addr v0, v2

    cmp-long v0, p1, v0

    if-ltz v0, :cond_2

    .line 182
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/g;->l:Ljava/util/List;

    .line 191
    :goto_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->k:Ljp/co/cyberagent/android/a/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->l:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/k;->a(Ljava/util/List;)V

    .line 192
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->r:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_0

    .line 193
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/k;->a(J)V

    .line 194
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->t:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_1

    .line 195
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->t:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0, p1, p2}, Lcom/roidapp/videolib/b/k;->a(J)V

    .line 196
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->k:Ljp/co/cyberagent/android/a/k;

    return-object v0

    .line 186
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iput-object v0, p0, Lcom/roidapp/videolib/b/g;->l:Ljava/util/List;

    goto :goto_0
.end method

.method protected final a()V
    .locals 3

    .prologue
    .line 68
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 69
    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v1, :cond_0

    .line 70
    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 71
    :cond_0
    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->m:Ljp/co/cyberagent/android/a/ag;

    if-eqz v1, :cond_1

    .line 72
    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->m:Ljp/co/cyberagent/android/a/ag;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 75
    :cond_1
    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->z:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 77
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 78
    iget-object v2, p0, Lcom/roidapp/videolib/b/g;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v2, :cond_2

    .line 79
    iget-object v2, p0, Lcom/roidapp/videolib/b/g;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 80
    :cond_2
    iget-object v2, p0, Lcom/roidapp/videolib/b/g;->m:Ljp/co/cyberagent/android/a/ag;

    if-eqz v2, :cond_3

    .line 81
    iget-object v2, p0, Lcom/roidapp/videolib/b/g;->m:Ljp/co/cyberagent/android/a/ag;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 84
    :cond_3
    iget-object v2, p0, Lcom/roidapp/videolib/b/g;->z:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 85
    iget-object v2, p0, Lcom/roidapp/videolib/b/g;->j:Ljp/co/cyberagent/android/a/h;

    if-eqz v2, :cond_4

    .line 86
    iget-object v2, p0, Lcom/roidapp/videolib/b/g;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 88
    :cond_4
    iget-object v2, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 89
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 92
    return-void
.end method

.method public final a(Lcom/roidapp/videolib/gl/e;)V
    .locals 2

    .prologue
    .line 59
    invoke-super {p0, p1}, Lcom/roidapp/videolib/b/c;->a(Lcom/roidapp/videolib/gl/e;)V

    .line 60
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->z:Ljp/co/cyberagent/android/a/s;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->o:Lcom/roidapp/videolib/gl/e;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/s;->a(Lcom/roidapp/videolib/gl/e;)V

    .line 66
    return-void
.end method

.method protected final b()V
    .locals 2

    .prologue
    .line 95
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 96
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->z:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 97
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->m:Ljp/co/cyberagent/android/a/ag;

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->m:Ljp/co/cyberagent/android/a/ag;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 100
    :cond_0
    return-void
.end method

.method protected final c()V
    .locals 2

    .prologue
    .line 103
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 106
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->z:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 109
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->m:Ljp/co/cyberagent/android/a/ag;

    if-eqz v0, :cond_0

    .line 110
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->m:Ljp/co/cyberagent/android/a/ag;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 112
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->h:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_1

    .line 113
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->h:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 114
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->j:Ljp/co/cyberagent/android/a/h;

    if-eqz v0, :cond_2

    .line 115
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 116
    :cond_2
    return-void
.end method

.method protected final d()V
    .locals 5

    .prologue
    .line 119
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->f:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_2

    .line 120
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 121
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->c:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 123
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 124
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->b:Ljava/util/List;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->f:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 126
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ge v1, v0, :cond_2

    .line 127
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p0, Lcom/roidapp/videolib/b/g;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v2}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v2

    .line 128
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v3, p0, Lcom/roidapp/videolib/b/g;->z:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v0, v3}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    move-result v3

    .line 129
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v4, p0, Lcom/roidapp/videolib/b/g;->f:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->removeAll(Ljava/util/Collection;)Z

    .line 130
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v4, p0, Lcom/roidapp/videolib/b/g;->f:Ljava/util/List;

    invoke-interface {v0, v4}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 131
    if-eqz v3, :cond_0

    .line 132
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v3, p0, Lcom/roidapp/videolib/b/g;->z:Ljp/co/cyberagent/android/a/s;

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 133
    :cond_0
    if-eqz v2, :cond_1

    .line 134
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    iget-object v2, p0, Lcom/roidapp/videolib/b/g;->j:Ljp/co/cyberagent/android/a/h;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 138
    :cond_2
    return-void
.end method

.method public final e()V
    .locals 0

    .prologue
    .line 141
    invoke-super {p0}, Lcom/roidapp/videolib/b/c;->e()V

    .line 142
    invoke-virtual {p0}, Lcom/roidapp/videolib/b/g;->f()V

    .line 143
    return-void
.end method

.method public final g()I
    .locals 1

    .prologue
    .line 200
    const/4 v0, 0x2

    return v0
.end method

.method public final h()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 170
    .line 1146
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1147
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1148
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->k:Ljp/co/cyberagent/android/a/k;

    if-eqz v0, :cond_0

    .line 1149
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->k:Ljp/co/cyberagent/android/a/k;

    iget-object v1, p0, Lcom/roidapp/videolib/b/g;->c:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljp/co/cyberagent/android/a/k;->a(Ljava/util/List;)V

    .line 1150
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->k:Ljp/co/cyberagent/android/a/k;

    invoke-virtual {v0}, Ljp/co/cyberagent/android/a/k;->i()V

    .line 1152
    :cond_0
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1153
    iput-object v2, p0, Lcom/roidapp/videolib/b/g;->k:Ljp/co/cyberagent/android/a/k;

    .line 1154
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->s:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_1

    .line 1155
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->s:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 1156
    :cond_1
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->r:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_2

    .line 1157
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->r:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 1158
    :cond_2
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->t:Lcom/roidapp/videolib/b/k;

    if-eqz v0, :cond_3

    .line 1159
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->t:Lcom/roidapp/videolib/b/k;

    invoke-virtual {v0}, Lcom/roidapp/videolib/b/k;->a()V

    .line 1160
    :cond_3
    iput-object v2, p0, Lcom/roidapp/videolib/b/g;->s:Lcom/roidapp/videolib/b/k;

    .line 1161
    iput-object v2, p0, Lcom/roidapp/videolib/b/g;->t:Lcom/roidapp/videolib/b/k;

    .line 1162
    iput-object v2, p0, Lcom/roidapp/videolib/b/g;->r:Lcom/roidapp/videolib/b/k;

    .line 1164
    iput-object v2, p0, Lcom/roidapp/videolib/b/g;->h:Ljp/co/cyberagent/android/a/h;

    .line 1165
    iget-object v0, p0, Lcom/roidapp/videolib/b/g;->e:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 1166
    iput-object v2, p0, Lcom/roidapp/videolib/b/g;->j:Ljp/co/cyberagent/android/a/h;

    .line 1167
    iput-object v2, p0, Lcom/roidapp/videolib/b/g;->i:Ljp/co/cyberagent/android/a/h;

    .line 171
    iput-object v2, p0, Lcom/roidapp/videolib/b/g;->m:Ljp/co/cyberagent/android/a/ag;

    .line 174
    iput-object v2, p0, Lcom/roidapp/videolib/b/g;->z:Ljp/co/cyberagent/android/a/s;

    .line 175
    iput-object v2, p0, Lcom/roidapp/videolib/b/g;->o:Lcom/roidapp/videolib/gl/e;

    .line 176
    invoke-super {p0}, Lcom/roidapp/videolib/b/c;->h()V

    .line 178
    return-void
.end method
