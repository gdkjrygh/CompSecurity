.class public final Lcom/roidapp/photogrid/release/pg;
.super Lcom/roidapp/photogrid/release/oi;
.source "SourceFile"


# instance fields
.field private A:I

.field private B:I

.field private C:Ljava/lang/String;

.field private D:Z

.field private E:Ljava/lang/String;

.field private F:Lcom/roidapp/videolib/b/u;

.field private G:Z

.field private H:Z

.field private I:Z

.field private J:Z

.field private r:Lcom/roidapp/photogrid/release/ng;

.field private s:Lcom/roidapp/videolib/core/a/b;

.field private t:Z

.field private u:Lcom/roidapp/videolib/core/a/c;

.field private v:Ljava/lang/String;

.field private w:Ljava/lang/String;

.field private x:I

.field private y:J

.field private z:Z


# direct methods
.method public constructor <init>(Landroid/app/Activity;[Lcom/roidapp/photogrid/release/ig;Lcom/roidapp/photogrid/release/ml;Lcom/roidapp/photogrid/release/PhotoView;Lcom/roidapp/photogrid/release/mm;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 64
    invoke-direct {p0}, Lcom/roidapp/photogrid/release/oi;-><init>()V

    .line 36
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/pg;->t:Z

    .line 38
    const-string v0, "Save"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/pg;->v:Ljava/lang/String;

    .line 44
    iput v1, p0, Lcom/roidapp/photogrid/release/pg;->A:I

    .line 45
    iput v1, p0, Lcom/roidapp/photogrid/release/pg;->B:I

    .line 46
    iput-object v2, p0, Lcom/roidapp/photogrid/release/pg;->C:Ljava/lang/String;

    .line 47
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/pg;->D:Z

    .line 48
    iput-object v2, p0, Lcom/roidapp/photogrid/release/pg;->E:Ljava/lang/String;

    .line 49
    iput-object v2, p0, Lcom/roidapp/photogrid/release/pg;->F:Lcom/roidapp/videolib/b/u;

    .line 50
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/pg;->G:Z

    .line 51
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/pg;->H:Z

    .line 52
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/pg;->I:Z

    .line 53
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/pg;->J:Z

    .line 65
    iput-object p1, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    .line 66
    iput-object p2, p0, Lcom/roidapp/photogrid/release/pg;->c:[Lcom/roidapp/photogrid/release/ig;

    .line 67
    iput-object p3, p0, Lcom/roidapp/photogrid/release/pg;->d:Lcom/roidapp/photogrid/release/ml;

    .line 68
    iput-object p4, p0, Lcom/roidapp/photogrid/release/pg;->g:Lcom/roidapp/photogrid/release/PhotoView;

    .line 69
    check-cast p5, Lcom/roidapp/photogrid/release/ng;

    iput-object p5, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    move-object v0, p1

    .line 70
    check-cast v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/PhotoGridActivity;->h:Z

    if-eqz v0, :cond_0

    .line 71
    const-string v0, "Share"

    iput-object v0, p0, Lcom/roidapp/photogrid/release/pg;->v:Ljava/lang/String;

    .line 73
    :cond_0
    new-instance v0, Lcom/roidapp/photogrid/release/ph;

    invoke-direct {v0, p0, p3, p1}, Lcom/roidapp/photogrid/release/ph;-><init>(Lcom/roidapp/photogrid/release/pg;Lcom/roidapp/photogrid/release/ml;Landroid/app/Activity;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/release/pg;->s:Lcom/roidapp/videolib/core/a/b;

    .line 141
    return-void
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/pg;I)I
    .locals 0

    .prologue
    .line 33
    iput p1, p0, Lcom/roidapp/photogrid/release/pg;->x:I

    return p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/pg;J)J
    .locals 1

    .prologue
    .line 33
    iput-wide p1, p0, Lcom/roidapp/photogrid/release/pg;->y:J

    return-wide p1
.end method

.method static synthetic a(Lcom/roidapp/photogrid/release/pg;)Z
    .locals 1

    .prologue
    .line 33
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/pg;->z:Z

    return v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->w:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic c(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/pg;->w:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->v:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/release/pg;)I
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lcom/roidapp/photogrid/release/pg;->A:I

    return v0
.end method

.method static synthetic f(Lcom/roidapp/photogrid/release/pg;)I
    .locals 1

    .prologue
    .line 33
    iget v0, p0, Lcom/roidapp/photogrid/release/pg;->B:I

    return v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->C:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic h(Lcom/roidapp/photogrid/release/pg;)Z
    .locals 1

    .prologue
    .line 33
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/pg;->D:Z

    return v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/release/pg;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->E:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/release/pg;)Lcom/roidapp/videolib/b/u;
    .locals 1

    .prologue
    .line 33
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->F:Lcom/roidapp/videolib/b/u;

    return-object v0
.end method

.method static synthetic k(Lcom/roidapp/photogrid/release/pg;)Z
    .locals 1

    .prologue
    .line 33
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/pg;->I:Z

    return v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/release/pg;)Z
    .locals 1

    .prologue
    .line 33
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/pg;->J:Z

    return v0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/release/pg;)Z
    .locals 1

    .prologue
    .line 33
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/pg;->G:Z

    return v0
.end method

.method static synthetic n(Lcom/roidapp/photogrid/release/pg;)Z
    .locals 1

    .prologue
    .line 33
    iget-boolean v0, p0, Lcom/roidapp/photogrid/release/pg;->H:Z

    return v0
.end method


# virtual methods
.method public final a()V
    .locals 15

    .prologue
    const/4 v0, 0x4

    const/16 v5, 0x280

    const/4 v14, 0x0

    const/4 v13, 0x0

    const/4 v12, 0x1

    .line 152
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/hw;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v6

    .line 153
    const-string v1, "smart"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    move v10, v0

    .line 163
    :goto_0
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    .line 165
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_e

    .line 167
    const-string v2, "Directed by "

    invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_d

    move v1, v12

    :goto_1
    move v2, v1

    move v1, v12

    .line 175
    :goto_2
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v3

    const/16 v4, -0x14

    if-ne v3, v4, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v3

    if-ne v3, v0, :cond_0

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v3

    if-eq v3, v0, :cond_1

    .line 181
    :cond_0
    iput-boolean v12, p0, Lcom/roidapp/photogrid/release/pg;->I:Z

    .line 184
    :cond_1
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v0

    cmpl-float v0, v0, v14

    if-gtz v0, :cond_2

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v0

    cmpl-float v0, v0, v14

    if-lez v0, :cond_3

    .line 185
    :cond_2
    iput-boolean v12, p0, Lcom/roidapp/photogrid/release/pg;->J:Z

    .line 188
    :cond_3
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ad()Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;

    move-result-object v3

    .line 189
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ac()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v4

    .line 190
    const-string v0, ""

    .line 191
    if-eqz v3, :cond_4

    .line 192
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v7, "GroupId:"

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v3}, Lcom/roidapp/imagelib/filter/groupinfo/IGroupInfo;->c()J

    move-result-wide v8

    invoke-virtual {v0, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 193
    :cond_4
    if-eqz v4, :cond_5

    .line 194
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ",FilterId:"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v4}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->c()I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, ",Name"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-interface {v4}, Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 195
    :cond_5
    const-string v3, ""

    .line 196
    iget-object v4, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    if-eqz v4, :cond_7

    .line 197
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/ih;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    iget-object v4, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    .line 1120
    invoke-virtual {v3, v4}, Lcom/roidapp/photogrid/release/ih;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_f

    .line 1122
    if-eqz v4, :cond_f

    const-string v3, "LovePhotoGrid"

    invoke-virtual {v4, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_6

    const-string v3, "love_photo_grid"

    invoke-virtual {v4, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_f

    :cond_6
    move v3, v12

    .line 197
    :goto_3
    if-eqz v3, :cond_10

    const-string v3, "default/"

    .line 199
    :cond_7
    :goto_4
    iget-object v7, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v8, "Video/VideoActivity/Save/Analytics/"

    invoke-direct {v4, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v8, v8, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    array-length v8, v8

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v8, "/"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    iget-object v4, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v4, v4, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    if-nez v4, :cond_12

    const-string v4, "none/"

    :goto_5
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v8, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-boolean v8, v8, Lcom/roidapp/photogrid/release/ng;->V:Z

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v8, "/"

    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    iget-object v8, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-boolean v8, v8, Lcom/roidapp/photogrid/release/ng;->V:Z

    if-nez v8, :cond_8

    iget-object v8, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v8, v8, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    if-nez v8, :cond_9

    :cond_8
    const-string v3, "noneMusic/"

    :cond_9
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Lcom/a/c/d;->a()Z

    move-result v3

    if-eqz v3, :cond_13

    const-string v3, "Yes"

    :goto_6
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v4

    invoke-virtual {v4}, Lcom/roidapp/photogrid/release/ih;->ab()Lcom/roidapp/videolib/b/u;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    if-eqz v1, :cond_14

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "/signshow/"

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_7
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v4, "/"

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v7, v3}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 211
    iget-object v4, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v7, "Video/VideoActivity/Save/Start/"

    invoke-direct {v3, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, p0, Lcom/roidapp/photogrid/release/pg;->v:Ljava/lang/String;

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "/"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v7, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v7, v7, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    array-length v7, v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "/"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v7, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget v7, v7, Lcom/roidapp/photogrid/release/ng;->T:I

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "/"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-object v3, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    if-nez v3, :cond_15

    const-string v3, "none/"

    :goto_8
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget-object v7, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-boolean v7, v7, Lcom/roidapp/photogrid/release/ng;->V:Z

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "/"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "/"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v7

    invoke-virtual {v7}, Lcom/roidapp/photogrid/release/ih;->ab()Lcom/roidapp/videolib/b/u;

    move-result-object v7

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "/"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/pg;->I:Z

    if-eqz v3, :cond_16

    const-string v3, "BackgroundOn/"

    :goto_9
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    iget-boolean v3, p0, Lcom/roidapp/photogrid/release/pg;->J:Z

    if-eqz v3, :cond_17

    const-string v3, "BorderOn/"

    :goto_a
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v7

    if-eqz v1, :cond_18

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "/signshow/"

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    :goto_b
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v7, "/"

    invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lcom/roidapp/photogrid/common/af;->b(Landroid/content/Context;Ljava/lang/String;)V

    .line 222
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    array-length v0, v0

    iput v0, p0, Lcom/roidapp/photogrid/release/pg;->A:I

    .line 223
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget v0, v0, Lcom/roidapp/photogrid/release/ng;->T:I

    iput v0, p0, Lcom/roidapp/photogrid/release/pg;->B:I

    .line 224
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    iput-object v0, p0, Lcom/roidapp/photogrid/release/pg;->C:Ljava/lang/String;

    .line 225
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ng;->V:Z

    iput-boolean v0, p0, Lcom/roidapp/photogrid/release/pg;->D:Z

    .line 226
    iput-object v6, p0, Lcom/roidapp/photogrid/release/pg;->E:Ljava/lang/String;

    .line 227
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/release/ih;->ab()Lcom/roidapp/videolib/b/u;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/pg;->F:Lcom/roidapp/videolib/b/u;

    .line 228
    iput-boolean v1, p0, Lcom/roidapp/photogrid/release/pg;->G:Z

    .line 229
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/pg;->H:Z

    .line 231
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->d:Lcom/roidapp/photogrid/release/ml;

    invoke-virtual {v0, v13, v12}, Lcom/roidapp/photogrid/release/ml;->b(II)V

    .line 235
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v0, v0, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    if-eqz v0, :cond_1a

    .line 236
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-boolean v0, v0, Lcom/roidapp/photogrid/release/ng;->V:Z

    if-nez v0, :cond_1a

    .line 240
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget v0, v0, Lcom/roidapp/photogrid/release/ng;->R:I

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget v1, v1, Lcom/roidapp/photogrid/release/ng;->S:I

    if-lt v0, v1, :cond_19

    .line 242
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iput v13, v0, Lcom/roidapp/photogrid/release/ng;->R:I

    move v2, v12

    .line 252
    :goto_c
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/roidapp/photogrid/release/pg;->w:Ljava/lang/String;

    .line 253
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/PhotoGrid_Video_"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/Calendar;->getTimeInMillis()J

    move-result-wide v6

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".mp4"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 254
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x13

    if-ne v0, v3, :cond_1c

    .line 256
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 261
    :try_start_0
    new-instance v3, Ljava/io/FileOutputStream;

    invoke-direct {v3, v0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V

    .line 262
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move v0, v12

    .line 269
    :goto_d
    if-nez v0, :cond_1c

    .line 270
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v3

    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v3, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    const v4, 0x7f07002e

    invoke-virtual {v3, v4}, Landroid/app/Activity;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 272
    new-instance v3, Ljava/io/File;

    invoke-direct {v3, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 273
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v4

    if-nez v4, :cond_1b

    .line 274
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    move-result v3

    if-nez v3, :cond_1b

    .line 275
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v1

    .line 276
    const/16 v2, 0x2bd

    iput v2, v1, Landroid/os/Message;->what:I

    .line 277
    iput-object v0, v1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 278
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->q:Landroid/os/Handler;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 452
    :goto_e
    return-void

    .line 155
    :cond_a
    const-string v1, "high"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_b

    move v10, v12

    .line 156
    goto/16 :goto_0

    .line 157
    :cond_b
    const-string v1, "medium"

    invoke-virtual {v6, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_c

    .line 158
    const/4 v10, 0x2

    goto/16 :goto_0

    .line 160
    :cond_c
    const/4 v10, 0x3

    goto/16 :goto_0

    :cond_d
    move v1, v13

    .line 167
    goto/16 :goto_1

    :cond_e
    move v1, v13

    move v2, v12

    .line 171
    goto/16 :goto_2

    :cond_f
    move v3, v13

    .line 1124
    goto/16 :goto_3

    .line 197
    :cond_10
    const-string v3, "onlineMusic/"

    goto/16 :goto_4

    :cond_11
    const-string v3, "myMusic/"

    goto/16 :goto_4

    .line 199
    :cond_12
    const-string v4, "has/"

    goto/16 :goto_5

    :cond_13
    const-string v3, "No"

    goto/16 :goto_6

    :cond_14
    const-string v3, ""

    goto/16 :goto_7

    .line 211
    :cond_15
    const-string v3, "has/"

    goto/16 :goto_8

    :cond_16
    const-string v3, "BackgroundOff/"

    goto/16 :goto_9

    :cond_17
    const-string v3, "BorderOff/"

    goto/16 :goto_a

    :cond_18
    const-string v3, ""

    goto/16 :goto_b

    .line 243
    :cond_19
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_2e

    .line 245
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iput v13, v0, Lcom/roidapp/photogrid/release/ng;->R:I

    move v2, v12

    goto/16 :goto_c

    :cond_1a
    move v2, v12

    .line 249
    goto/16 :goto_c

    .line 265
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v0, v13

    .line 266
    goto/16 :goto_d

    .line 283
    :cond_1b
    iget-object v3, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    invoke-static {v3, v0}, Lcom/roidapp/photogrid/release/ap;->a(Landroid/content/Context;Ljava/lang/String;)V

    .line 285
    new-instance v3, Ljava/io/File;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "PhotoGrid_"

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v6

    invoke-virtual {v4, v6, v7}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v4

    const-string v6, ".mp4"

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-direct {v3, v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 287
    iput-object v1, p0, Lcom/roidapp/photogrid/release/pg;->w:Ljava/lang/String;

    .line 288
    invoke-virtual {v3}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 294
    :cond_1c
    iput-boolean v2, p0, Lcom/roidapp/photogrid/release/pg;->z:Z

    .line 298
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    if-eqz v0, :cond_1d

    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->isFinishing()Z

    .line 305
    :cond_1d
    const/4 v0, 0x1

    :try_start_1
    invoke-static {v0}, Landroid/media/CamcorderProfile;->get(I)Landroid/media/CamcorderProfile;

    move-result-object v0

    .line 307
    iget v3, v0, Landroid/media/CamcorderProfile;->videoFrameHeight:I

    iget v4, v0, Landroid/media/CamcorderProfile;->videoFrameWidth:I

    if-le v3, v4, :cond_1f

    iget v0, v0, Landroid/media/CamcorderProfile;->videoFrameWidth:I
    :try_end_1
    .catch Ljava/lang/Throwable; {:try_start_1 .. :try_end_1} :catch_1

    .line 308
    :goto_f
    if-le v5, v0, :cond_20

    :goto_10
    move v3, v13

    .line 314
    :goto_11
    if-eqz v3, :cond_1e

    .line 316
    :try_start_2
    invoke-static {}, Lcom/a/c/d;->b()[I

    move-result-object v3

    .line 317
    if-eqz v3, :cond_2d

    .line 319
    const/4 v0, 0x0

    aget v0, v3, v0

    const/4 v4, 0x1

    aget v4, v3, v4

    if-le v0, v4, :cond_21

    const/4 v0, 0x1

    aget v0, v3, v0

    :goto_12
    move v3, v0

    .line 321
    :goto_13
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v0

    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v0

    .line 322
    invoke-static {}, Lcom/roidapp/photogrid/common/bm;->a()Lcom/roidapp/photogrid/common/bm;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bm;->a(Landroid/view/Display;)I

    move-result v4

    .line 323
    invoke-static {}, Lcom/roidapp/photogrid/common/bm;->a()Lcom/roidapp/photogrid/common/bm;

    invoke-static {v0}, Lcom/roidapp/photogrid/common/bm;->b(Landroid/view/Display;)I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    move-result v0

    .line 324
    if-le v4, v0, :cond_22

    .line 325
    :goto_14
    if-le v3, v0, :cond_23

    .line 332
    :cond_1e
    :goto_15
    if-gtz v0, :cond_24

    .line 334
    :goto_16
    rem-int/lit8 v0, v5, 0x10

    if-eqz v0, :cond_2c

    .line 338
    const/16 v0, 0x1e0

    if-lt v5, v0, :cond_25

    .line 339
    const/16 v5, 0x1e0

    move v4, v5

    .line 349
    :goto_17
    new-instance v0, Lcom/roidapp/videolib/core/a/a;

    if-eqz v2, :cond_28

    iget-object v2, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ng;->P:Ljava/lang/String;

    :goto_18
    iget-object v3, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v3, v3, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    iget-object v6, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget v6, v6, Lcom/roidapp/photogrid/release/ng;->R:I

    int-to-long v6, v6

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v8

    invoke-virtual {v8}, Lcom/roidapp/photogrid/release/ih;->ab()Lcom/roidapp/videolib/b/u;

    move-result-object v8

    invoke-static {v8}, Lcom/roidapp/videolib/core/e;->a(Lcom/roidapp/videolib/b/u;)Z

    move-result v8

    if-eqz v8, :cond_29

    const-wide/32 v8, 0xe4e1c0

    :goto_19
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v11

    invoke-virtual {v11}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v11

    invoke-direct/range {v0 .. v11}, Lcom/roidapp/videolib/core/a/a;-><init>(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;IIJJIZ)V

    .line 355
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ng;->X:Ljava/lang/String;

    iput-object v1, v0, Lcom/roidapp/videolib/core/a/a;->o:Ljava/lang/String;

    .line 357
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ab()Lcom/roidapp/videolib/b/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/core/a/a;->a(Lcom/roidapp/videolib/b/u;)V

    .line 358
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->aa()[Lcom/roidapp/videolib/b/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/core/a/a;->a([Lcom/roidapp/videolib/b/u;)V

    .line 359
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ae()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/core/a/a;->a(I)V

    .line 360
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ac()Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/roidapp/videolib/core/a/a;->a(Lcom/roidapp/imagelib/filter/filterinfo/IFilterInfo;)V

    .line 361
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v1

    cmpl-float v1, v1, v14

    if-nez v1, :cond_2a

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v1

    cmpl-float v1, v1, v14

    if-nez v1, :cond_2a

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ax()Z

    move-result v1

    if-eqz v1, :cond_2a

    .line 364
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Video/VideoActivity/Save/Analytics2/0/0/"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "/"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v3

    invoke-virtual {v3}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 381
    :goto_1a
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v1, v1, Lcom/roidapp/photogrid/release/ng;->j:Landroid/view/ViewGroup;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 382
    iget v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 383
    iget v1, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 387
    iget v3, p0, Lcom/roidapp/photogrid/release/pg;->f:I

    .line 388
    iget v4, p0, Lcom/roidapp/photogrid/release/pg;->f:I

    int-to-float v4, v4

    int-to-float v5, v2

    div-float/2addr v4, v5

    .line 389
    int-to-float v1, v1

    mul-float/2addr v1, v4

    float-to-int v5, v1

    .line 410
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->t()F

    move-result v1

    const/high16 v6, 0x3f800000    # 1.0f

    cmpg-float v1, v1, v6

    if-gez v1, :cond_2b

    .line 411
    int-to-float v1, v3

    .line 415
    :goto_1b
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v6

    invoke-virtual {v6}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v6

    .line 424
    const/high16 v7, 0x42c80000    # 100.0f

    div-float v7, v6, v7

    mul-float/2addr v7, v1

    .line 425
    const/high16 v8, 0x42c80000    # 100.0f

    div-float/2addr v6, v8

    mul-float/2addr v1, v6

    .line 429
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    move-result-object v8

    iget-object v9, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    invoke-virtual {v8, v9}, Lcom/roidapp/imagelib/ImageLibrary;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->a()Lcom/roidapp/imagelib/ImageLibrary;

    invoke-static {}, Lcom/roidapp/imagelib/ImageLibrary;->e()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    .line 430
    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    const-string v9, "/coverTemp.jpg"

    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    iput-object v8, p0, Lcom/roidapp/photogrid/release/pg;->p:Ljava/lang/String;

    .line 432
    iput v3, v0, Lcom/roidapp/videolib/core/a/a;->a:I

    .line 433
    iput v5, v0, Lcom/roidapp/videolib/core/a/a;->b:I

    .line 434
    iput v4, v0, Lcom/roidapp/videolib/core/a/a;->c:F

    .line 435
    iget v3, p0, Lcom/roidapp/photogrid/release/pg;->f:I

    int-to-float v3, v3

    const/16 v4, 0x2d0

    invoke-static {v2, v4}, Ljava/lang/Math;->min(II)I

    move-result v2

    int-to-float v2, v2

    div-float v2, v3, v2

    iput v2, v0, Lcom/roidapp/videolib/core/a/a;->d:F

    .line 436
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->A()I

    move-result v2

    iput v2, v0, Lcom/roidapp/videolib/core/a/a;->e:I

    .line 437
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->x()I

    move-result v2

    iput v2, v0, Lcom/roidapp/videolib/core/a/a;->f:I

    .line 438
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->y()I

    move-result v2

    iput v2, v0, Lcom/roidapp/videolib/core/a/a;->g:I

    .line 439
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->z()I

    move-result v2

    iput v2, v0, Lcom/roidapp/videolib/core/a/a;->h:I

    .line 440
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->V()F

    move-result v2

    iput v2, v0, Lcom/roidapp/videolib/core/a/a;->k:F

    .line 441
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v2

    invoke-virtual {v2}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v2

    iput v2, v0, Lcom/roidapp/videolib/core/a/a;->l:F

    .line 442
    iput v7, v0, Lcom/roidapp/videolib/core/a/a;->i:F

    .line 443
    iput v1, v0, Lcom/roidapp/videolib/core/a/a;->j:F

    .line 444
    iput-object v6, v0, Lcom/roidapp/videolib/core/a/a;->m:Ljava/lang/String;

    .line 445
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->af()Z

    move-result v1

    iput-boolean v1, v0, Lcom/roidapp/videolib/core/a/a;->p:Z

    .line 446
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->ag()I

    move-result v1

    iput v1, v0, Lcom/roidapp/videolib/core/a/a;->q:I

    .line 450
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    invoke-static {v1}, Lcom/roidapp/videolib/a/a;->a(Landroid/content/Context;)Lcom/roidapp/videolib/core/a/c;

    move-result-object v1

    iput-object v1, p0, Lcom/roidapp/photogrid/release/pg;->u:Lcom/roidapp/videolib/core/a/c;

    .line 451
    iget-object v1, p0, Lcom/roidapp/photogrid/release/pg;->u:Lcom/roidapp/videolib/core/a/c;

    iget-object v2, p0, Lcom/roidapp/photogrid/release/pg;->s:Lcom/roidapp/videolib/core/a/b;

    invoke-interface {v1, v12, v0, v2}, Lcom/roidapp/videolib/core/a/c;->a(ZLcom/roidapp/videolib/core/a/a;Lcom/roidapp/videolib/core/a/b;)V

    goto/16 :goto_e

    .line 307
    :cond_1f
    :try_start_3
    iget v0, v0, Landroid/media/CamcorderProfile;->videoFrameHeight:I
    :try_end_3
    .catch Ljava/lang/Throwable; {:try_start_3 .. :try_end_3} :catch_1

    goto/16 :goto_f

    :cond_20
    move v0, v5

    .line 308
    goto/16 :goto_10

    .line 310
    :catch_1
    move-exception v0

    move v3, v12

    move v0, v5

    goto/16 :goto_11

    .line 319
    :cond_21
    const/4 v0, 0x0

    :try_start_4
    aget v0, v3, v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto/16 :goto_12

    :cond_22
    move v0, v4

    .line 324
    goto/16 :goto_14

    :cond_23
    move v0, v3

    .line 325
    goto/16 :goto_15

    .line 328
    :catch_2
    move-exception v0

    move v0, v13

    goto/16 :goto_15

    :cond_24
    move v5, v0

    .line 332
    goto/16 :goto_16

    .line 340
    :cond_25
    const/16 v0, 0x140

    if-lt v5, v0, :cond_26

    .line 341
    const/16 v5, 0x140

    move v4, v5

    goto/16 :goto_17

    .line 342
    :cond_26
    const/16 v0, 0xf0

    if-lt v5, v0, :cond_27

    .line 343
    const/16 v5, 0xf0

    move v4, v5

    goto/16 :goto_17

    .line 344
    :cond_27
    const/16 v0, 0x90

    if-lt v5, v0, :cond_2c

    .line 345
    const/16 v5, 0x90

    move v4, v5

    goto/16 :goto_17

    .line 349
    :cond_28
    iget-object v2, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v2, v2, Lcom/roidapp/photogrid/release/ng;->N:Ljava/lang/String;

    goto/16 :goto_18

    :cond_29
    iget-object v8, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget v8, v8, Lcom/roidapp/photogrid/release/ng;->T:I

    iget-object v9, p0, Lcom/roidapp/photogrid/release/pg;->r:Lcom/roidapp/photogrid/release/ng;

    iget-object v9, v9, Lcom/roidapp/photogrid/release/ng;->L:[Ljava/lang/String;

    array-length v9, v9

    mul-int/2addr v8, v9

    mul-int/lit16 v8, v8, 0x3e8

    int-to-long v8, v8

    goto/16 :goto_19

    .line 370
    :cond_2a
    invoke-static {}, Lcom/roidapp/photogrid/release/ih;->C()Lcom/roidapp/photogrid/release/ih;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/release/ih;->S()F

    move-result v1

    .line 371
    iget-object v2, p0, Lcom/roidapp/photogrid/release/pg;->b:Landroid/app/Activity;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Video/VideoActivity/Save/Analytics2/"

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v3, v0, Lcom/roidapp/videolib/core/a/a;->k:F

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v3, v0, Lcom/roidapp/videolib/core/a/a;->f:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v3, v0, Lcom/roidapp/videolib/core/a/a;->g:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget v3, v0, Lcom/roidapp/videolib/core/a/a;->h:I

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lcom/roidapp/photogrid/common/af;->c(Landroid/content/Context;Ljava/lang/String;)V

    move v12, v13

    goto/16 :goto_1a

    .line 413
    :cond_2b
    int-to-float v1, v5

    goto/16 :goto_1b

    :cond_2c
    move v4, v5

    goto/16 :goto_17

    :cond_2d
    move v3, v0

    goto/16 :goto_13

    :cond_2e
    move v2, v13

    goto/16 :goto_c
.end method

.method public final a(I)V
    .locals 0

    .prologue
    .line 457
    return-void
.end method

.method public final c()I
    .locals 1

    .prologue
    .line 61
    const/16 v0, 0xa

    return v0
.end method

.method public final g()V
    .locals 1

    .prologue
    .line 461
    invoke-super {p0}, Lcom/roidapp/photogrid/release/oi;->g()V

    .line 462
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->u:Lcom/roidapp/videolib/core/a/c;

    if-eqz v0, :cond_0

    .line 463
    iget-object v0, p0, Lcom/roidapp/photogrid/release/pg;->u:Lcom/roidapp/videolib/core/a/c;

    invoke-interface {v0}, Lcom/roidapp/videolib/core/a/c;->a()V

    .line 466
    :cond_0
    return-void
.end method
