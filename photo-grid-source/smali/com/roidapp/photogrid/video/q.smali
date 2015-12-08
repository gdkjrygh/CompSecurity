.class public final Lcom/roidapp/photogrid/video/q;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private A:Landroid/os/Handler;

.field private B:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private C:Z

.field private D:Z

.field private E:I

.field private F:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/roidapp/photogrid/video/a;",
            ">;"
        }
    .end annotation
.end field

.field private a:I

.field private b:Lcom/roidapp/photogrid/video/aa;

.field private c:Landroid/content/Context;

.field private d:Ljava/lang/String;

.field private e:Ljava/lang/String;

.field private f:Ljava/lang/String;

.field private g:Ljava/lang/String;

.field private h:Ljava/lang/String;

.field private i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

.field private j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/onlinemusic/Genre;",
            ">;"
        }
    .end annotation
.end field

.field private k:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/z;",
            ">;"
        }
    .end annotation
.end field

.field private l:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/z;",
            ">;"
        }
    .end annotation
.end field

.field private m:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/z;",
            ">;"
        }
    .end annotation
.end field

.field private n:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/c;",
            ">;"
        }
    .end annotation
.end field

.field private o:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/c;",
            ">;"
        }
    .end annotation
.end field

.field private p:Lcom/roidapp/photogrid/video/ac;

.field private q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

.field private r:Lcom/roidapp/photogrid/video/ab;

.field private s:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private t:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/z;",
            ">;>;"
        }
    .end annotation
.end field

.field private u:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;",
            ">;"
        }
    .end annotation
.end field

.field private v:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray",
            "<",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;",
            ">;>;"
        }
    .end annotation
.end field

.field private w:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/m;",
            ">;"
        }
    .end annotation
.end field

.field private x:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap",
            "<",
            "Ljava/lang/Integer;",
            "Lcom/roidapp/photogrid/video/o;",
            ">;"
        }
    .end annotation
.end field

.field private y:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;",
            ">;"
        }
    .end annotation
.end field

.field private z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/roidapp/photogrid/video/ac;Ljava/lang/String;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 247
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 88
    iput v2, p0, Lcom/roidapp/photogrid/video/q;->a:I

    .line 89
    sget-object v0, Lcom/roidapp/photogrid/video/aa;->a:Lcom/roidapp/photogrid/video/aa;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->b:Lcom/roidapp/photogrid/video/aa;

    .line 90
    iput-object v1, p0, Lcom/roidapp/photogrid/video/q;->c:Landroid/content/Context;

    .line 91
    iput-object v1, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    .line 92
    iput-object v1, p0, Lcom/roidapp/photogrid/video/q;->e:Ljava/lang/String;

    .line 93
    iput-object v1, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    .line 94
    iput-object v1, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    .line 95
    iput-object v1, p0, Lcom/roidapp/photogrid/video/q;->h:Ljava/lang/String;

    .line 96
    iput-object v1, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    .line 97
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    .line 98
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    .line 99
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->l:Ljava/util/ArrayList;

    .line 100
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->m:Ljava/util/ArrayList;

    .line 101
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->n:Ljava/util/ArrayList;

    .line 102
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->o:Ljava/util/ArrayList;

    .line 103
    iput-object v1, p0, Lcom/roidapp/photogrid/video/q;->p:Lcom/roidapp/photogrid/video/ac;

    .line 104
    iput-object v1, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    .line 105
    iput-object v1, p0, Lcom/roidapp/photogrid/video/q;->r:Lcom/roidapp/photogrid/video/ab;

    .line 106
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->s:Landroid/util/SparseArray;

    .line 108
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    .line 109
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    .line 110
    new-instance v0, Landroid/util/SparseArray;

    invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    .line 111
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    .line 112
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->x:Ljava/util/HashMap;

    .line 113
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    .line 115
    const v0, 0x989680

    iput v0, p0, Lcom/roidapp/photogrid/video/q;->z:I

    .line 158
    new-instance v0, Lcom/roidapp/photogrid/video/r;

    invoke-direct {v0, p0}, Lcom/roidapp/photogrid/video/r;-><init>(Lcom/roidapp/photogrid/video/q;)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->A:Landroid/os/Handler;

    .line 390
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->B:Ljava/util/ArrayList;

    .line 616
    iput-boolean v2, p0, Lcom/roidapp/photogrid/video/q;->C:Z

    .line 617
    iput-boolean v2, p0, Lcom/roidapp/photogrid/video/q;->D:Z

    .line 618
    iput v2, p0, Lcom/roidapp/photogrid/video/q;->E:I

    .line 1520
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    .line 248
    iput-object p1, p0, Lcom/roidapp/photogrid/video/q;->c:Landroid/content/Context;

    .line 249
    iput-object p2, p0, Lcom/roidapp/photogrid/video/q;->p:Lcom/roidapp/photogrid/video/ac;

    .line 250
    iput-object p3, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    .line 251
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 252
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    .line 253
    :cond_0
    return-void
.end method

.method private a(ILcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 1384
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_4

    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->f:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 1385
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v2

    .line 1397
    :goto_0
    return-object v0

    .line 1387
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 1388
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/z;

    .line 1389
    iget v3, v0, Lcom/roidapp/photogrid/video/z;->a:I

    if-ne v3, p1, :cond_2

    .line 1390
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    iget v2, v0, Lcom/roidapp/photogrid/video/z;->b:I

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    iget v2, v0, Lcom/roidapp/photogrid/video/z;->c:I

    invoke-virtual {v1, v2, p2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1391
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    iget v2, v0, Lcom/roidapp/photogrid/video/z;->b:I

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    iget v0, v0, Lcom/roidapp/photogrid/video/z;->c:I

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    goto :goto_0

    .line 1387
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_3
    move-object v0, v2

    .line 1394
    goto :goto_0

    :cond_4
    move-object v0, v2

    .line 1397
    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/q;ILcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/video/q;->a(ILcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    invoke-static {p0}, Lcom/roidapp/photogrid/video/q;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/q;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->x:Ljava/util/HashMap;

    return-object v0
.end method

.method private a(IIILcom/roidapp/photogrid/video/onlinemusic/Track;)V
    .locals 8

    .prologue
    const/4 v3, 0x0

    const/4 v4, -0x1

    .line 1264
    move v2, v3

    move v1, v4

    .line 1265
    :goto_0
    iget-object v0, p4, Lcom/roidapp/photogrid/video/onlinemusic/Track;->genre:[Ljava/lang/String;

    array-length v0, v0

    if-ge v2, v0, :cond_4

    .line 1266
    iget-object v0, p4, Lcom/roidapp/photogrid/video/onlinemusic/Track;->genre:[Ljava/lang/String;

    aget-object v0, v0, v2

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v5

    .line 1267
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_0

    .line 1268
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v5, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1269
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    invoke-virtual {v0, v5}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 1270
    if-ne p2, v5, :cond_6

    move v5, v2

    :goto_1
    move v6, v3

    .line 1273
    :goto_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v6, v1, :cond_3

    .line 1274
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/video/z;

    .line 1275
    iget v1, v1, Lcom/roidapp/photogrid/video/z;->a:I

    iget v7, p4, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    if-ne v1, v7, :cond_2

    .line 1287
    :cond_1
    :goto_3
    return-void

    .line 1273
    :cond_2
    add-int/lit8 v1, v6, 0x1

    move v6, v1

    goto :goto_2

    .line 1278
    :cond_3
    new-instance v1, Lcom/roidapp/photogrid/video/z;

    iget v6, p4, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-direct {v1, p0, v6, p1, p3}, Lcom/roidapp/photogrid/video/z;-><init>(Lcom/roidapp/photogrid/video/q;III)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1265
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    move v1, v5

    goto :goto_0

    .line 1281
    :cond_4
    if-ne v1, v4, :cond_1

    const v0, 0x989680

    if-eq p2, v0, :cond_1

    .line 1282
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_5

    .line 1283
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, p2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1284
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    invoke-virtual {v0, p2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    .line 1285
    new-instance v1, Lcom/roidapp/photogrid/video/z;

    iget v2, p4, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-direct {v1, p0, v2, p1, p3}, Lcom/roidapp/photogrid/video/z;-><init>(Lcom/roidapp/photogrid/video/q;III)V

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    move v5, v1

    goto :goto_1
.end method

.method private a(Lcom/roidapp/photogrid/video/aa;)V
    .locals 2

    .prologue
    .line 1329
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->b:Lcom/roidapp/photogrid/video/aa;

    monitor-enter v1

    .line 1330
    :try_start_0
    iput-object p1, p0, Lcom/roidapp/photogrid/video/q;->b:Lcom/roidapp/photogrid/video/aa;

    .line 1331
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method private a(Lcom/roidapp/photogrid/video/onlinemusic/Genre;)V
    .locals 3

    .prologue
    .line 1245
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 1246
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1254
    :goto_0
    return-void

    .line 1248
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    .line 1249
    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_id:I

    iget v2, p1, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_id:I

    if-ne v0, v2, :cond_1

    goto :goto_0

    .line 1252
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/q;Lcom/roidapp/photogrid/video/aa;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/aa;)V

    return-void
.end method

.method private a(ILjava/lang/String;)Z
    .locals 13

    .prologue
    .line 846
    if-nez p2, :cond_0

    .line 847
    const/4 v0, 0x0

    .line 958
    :goto_0
    return v0

    .line 849
    :cond_0
    const/4 v2, -0x1

    .line 850
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_14

    .line 851
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/m;

    iget v0, v0, Lcom/roidapp/photogrid/video/m;->a:I

    if-ne v0, p1, :cond_1

    move v8, v1

    .line 856
    :goto_2
    const/4 v0, -0x1

    if-ne v8, v0, :cond_2

    .line 857
    const/4 v0, 0x0

    goto :goto_0

    .line 850
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 858
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/m;

    .line 859
    iget-boolean v1, v0, Lcom/roidapp/photogrid/video/m;->d:Z

    if-eqz v1, :cond_3

    .line 860
    const/4 v0, 0x1

    goto :goto_0

    .line 863
    :cond_3
    :try_start_0
    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    new-instance v2, Lcom/roidapp/photogrid/video/t;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/video/t;-><init>(Lcom/roidapp/photogrid/video/q;)V

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/t;->b()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Lcom/google/a/k;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 864
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gtz v2, :cond_5

    .line 865
    :cond_4
    const/4 v0, 0x0

    goto :goto_0

    .line 867
    :cond_5
    const/4 v5, 0x0

    .line 868
    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 869
    const/4 v2, 0x0

    move v7, v2

    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v7, v2, :cond_12

    .line 870
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;

    .line 871
    invoke-static {v2}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/onlinemusic/Track;)Z

    move-result v3

    if-eqz v3, :cond_11

    .line 872
    iget v3, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/video/q;->m(I)Lcom/roidapp/photogrid/video/z;

    move-result-object v6

    .line 873
    if-nez v6, :cond_c

    .line 875
    iget v3, v0, Lcom/roidapp/photogrid/video/m;->e:I

    invoke-direct {p0, p1, v3, v5, v2}, Lcom/roidapp/photogrid/video/q;->a(IIILcom/roidapp/photogrid/video/onlinemusic/Track;)V

    .line 877
    const-string v4, ""

    .line 878
    const/4 v3, 0x0

    move v6, v3

    :goto_4
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->o:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v6, v3, :cond_6

    .line 879
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/video/c;

    .line 880
    if-eqz v3, :cond_b

    .line 883
    iget-object v10, v3, Lcom/roidapp/photogrid/video/c;->b:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    invoke-direct {v11}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    const-string v12, "_"

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    iget-object v12, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->mp3_url:Ljava/lang/String;

    invoke-static {v12}, Lcom/roidapp/photogrid/video/q;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v11

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_b

    .line 884
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "AddCloudTrackInfo music exists:"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v11, v3, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 885
    iget-object v10, v3, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    invoke-static {v10}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    .line 886
    if-eqz v10, :cond_8

    iget-object v11, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->file_md5:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_8

    .line 887
    iget-object v3, v3, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    .line 888
    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->o:Ljava/util/ArrayList;

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 889
    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->m:Ljava/util/ArrayList;

    new-instance v6, Lcom/roidapp/photogrid/video/z;

    iget v10, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-direct {v6, p0, v10, p1, v5}, Lcom/roidapp/photogrid/video/z;-><init>(Lcom/roidapp/photogrid/video/q;III)V

    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object v4, v3

    .line 899
    :cond_6
    :goto_5
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_7

    .line 900
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, p1, v6}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 901
    :cond_7
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    new-instance v6, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-direct {v6, v2, v4}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;-><init>(Lcom/roidapp/photogrid/video/onlinemusic/Track;Ljava/lang/String;)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 902
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    new-instance v6, Lcom/roidapp/photogrid/video/z;

    iget v10, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-direct {v6, p0, v10, p1, v5}, Lcom/roidapp/photogrid/video/z;-><init>(Lcom/roidapp/photogrid/video/q;III)V

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 903
    new-instance v3, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    invoke-direct {v3, v2, v4}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;-><init>(Lcom/roidapp/photogrid/video/onlinemusic/Track;Ljava/lang/String;)V

    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 904
    add-int/lit8 v2, v5, 0x1

    .line 869
    :goto_6
    add-int/lit8 v3, v7, 0x1

    move v5, v2

    move v7, v3

    goto/16 :goto_3

    .line 891
    :cond_8
    new-instance v10, Ljava/io/File;

    iget-object v3, v3, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    invoke-direct {v10, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 892
    invoke-virtual {v10}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 893
    invoke-virtual {v10}, Ljava/io/File;->delete()Z

    .line 894
    :cond_9
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 951
    :catch_0
    move-exception v1

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/video/m;->d:Z

    .line 952
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, v8, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 953
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v2, v0, Lcom/roidapp/photogrid/video/m;->a:I

    if-le v1, v2, :cond_a

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    iget v2, v0, Lcom/roidapp/photogrid/video/m;->a:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_a

    .line 954
    iget v1, p0, Lcom/roidapp/photogrid/video/q;->a:I

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    iget v0, v0, Lcom/roidapp/photogrid/video/m;->a:I

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->count:I

    sub-int v0, v1, v0

    iput v0, p0, Lcom/roidapp/photogrid/video/q;->a:I

    .line 956
    :cond_a
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 878
    :cond_b
    add-int/lit8 v3, v6, 0x1

    move v6, v3

    goto/16 :goto_4

    .line 907
    :cond_c
    :try_start_1
    iget v3, v0, Lcom/roidapp/photogrid/video/m;->e:I

    const v4, 0x989680

    if-ne v3, v4, :cond_e

    iget v3, v6, Lcom/roidapp/photogrid/video/z;->b:I

    if-eq v3, p1, :cond_e

    .line 908
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    iget v4, v6, Lcom/roidapp/photogrid/video/z;->b:I

    invoke-virtual {v3, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    iget v4, v6, Lcom/roidapp/photogrid/video/z;->c:I

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 909
    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v4, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    if-nez v4, :cond_d

    .line 910
    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v4, p1, v10}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 911
    :cond_d
    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v4, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/ArrayList;

    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 912
    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    iget v6, v6, Lcom/roidapp/photogrid/video/z;->d:I

    new-instance v10, Lcom/roidapp/photogrid/video/z;

    iget v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-direct {v10, p0, v2, p1, v5}, Lcom/roidapp/photogrid/video/z;-><init>(Lcom/roidapp/photogrid/video/q;III)V

    invoke-virtual {v4, v6, v10}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 913
    invoke-virtual {v9, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 914
    add-int/lit8 v2, v5, 0x1

    .line 916
    goto/16 :goto_6

    .line 918
    :cond_e
    const/4 v3, 0x0

    :goto_7
    iget-object v4, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->genre:[Ljava/lang/String;

    array-length v4, v4

    if-ge v3, v4, :cond_f

    .line 919
    iget-object v4, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->genre:[Ljava/lang/String;

    aget-object v4, v4, v3

    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v4

    iget v10, v0, Lcom/roidapp/photogrid/video/m;->e:I

    if-eq v4, v10, :cond_f

    .line 918
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    .line 923
    :cond_f
    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->genre:[Ljava/lang/String;

    array-length v2, v2

    if-lt v3, v2, :cond_11

    .line 924
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    iget v3, v0, Lcom/roidapp/photogrid/video/m;->e:I

    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_10

    .line 925
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    iget v3, v0, Lcom/roidapp/photogrid/video/m;->e:I

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v3, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 926
    :cond_10
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    iget v3, v0, Lcom/roidapp/photogrid/video/m;->e:I

    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 927
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_11
    move v2, v5

    goto/16 :goto_6

    .line 942
    :cond_12
    iget v1, v0, Lcom/roidapp/photogrid/video/m;->e:I

    const v2, 0x989680

    if-ne v1, v2, :cond_13

    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_13

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/google/a/k;

    invoke-direct {v2}, Lcom/google/a/k;-><init>()V

    invoke-virtual {v2, v9}, Lcom/google/a/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_13

    .line 943
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    iget v2, v0, Lcom/roidapp/photogrid/video/m;->a:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-static {v3}, Lcom/roidapp/photogrid/video/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    .line 944
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    iget v2, v0, Lcom/roidapp/photogrid/video/m;->a:I

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    iget v3, v0, Lcom/roidapp/photogrid/video/m;->a:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    .line 3202
    invoke-static {v2}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 944
    iput-object v2, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->localkey:Ljava/lang/String;

    .line 945
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    .line 947
    :cond_13
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/video/m;->d:Z

    .line 948
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, v8, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 958
    const/4 v0, 0x1

    goto/16 :goto_0

    :cond_14
    move v8, v2

    goto/16 :goto_2
.end method

.method private static a(Lcom/roidapp/photogrid/video/onlinemusic/Track;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 1292
    if-nez p0, :cond_1

    .line 1296
    :cond_0
    :goto_0
    return v0

    .line 1294
    :cond_1
    iget v1, p0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->genre:[Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->mp3_url:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 1296
    const/4 v0, 0x1

    goto :goto_0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/q;I)Z
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/q;->j(I)Z

    move-result v0

    return v0
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/q;ILjava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v3, -0x1

    const/4 v2, 0x0

    .line 4823
    if-nez p2, :cond_1

    .line 4839
    :cond_0
    :goto_0
    return v2

    :cond_1
    move v1, v2

    .line 4826
    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_5

    .line 4827
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/m;

    iget v0, v0, Lcom/roidapp/photogrid/video/m;->a:I

    if-ne v0, p1, :cond_2

    .line 4832
    :goto_2
    if-eq v1, v3, :cond_0

    .line 4834
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/m;

    .line 4835
    iget-boolean v1, v0, Lcom/roidapp/photogrid/video/m;->d:Z

    if-eqz v1, :cond_3

    .line 4836
    const/4 v2, 0x1

    goto :goto_0

    .line 4826
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 4838
    :cond_3
    iget-object v0, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "http"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 4839
    invoke-direct {p0, p1, p2}, Lcom/roidapp/photogrid/video/q;->a(ILjava/lang/String;)Z

    move-result v2

    goto :goto_0

    .line 4841
    :cond_4
    invoke-static {p2}, Lcom/roidapp/photogrid/video/bi;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lcom/roidapp/photogrid/video/q;->b(ILjava/lang/String;)Z

    move-result v2

    goto :goto_0

    :cond_5
    move v1, v3

    goto :goto_2
.end method

.method static synthetic a(Lcom/roidapp/photogrid/video/q;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/q;->c(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic b(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    invoke-static {p0}, Lcom/roidapp/photogrid/video/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lcom/roidapp/photogrid/video/q;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->f()V

    return-void
.end method

.method private b(ILjava/lang/String;)Z
    .locals 12

    .prologue
    .line 963
    if-nez p2, :cond_0

    .line 964
    const/4 v0, 0x0

    .line 1065
    :goto_0
    return v0

    .line 967
    :cond_0
    const/4 v2, -0x1

    .line 968
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_12

    .line 969
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/m;

    iget v0, v0, Lcom/roidapp/photogrid/video/m;->a:I

    if-ne v0, p1, :cond_1

    move v7, v1

    .line 974
    :goto_2
    const/4 v0, -0x1

    if-ne v7, v0, :cond_2

    .line 975
    const/4 v0, 0x0

    goto :goto_0

    .line 968
    :cond_1
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    .line 976
    :cond_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/m;

    .line 977
    iget-boolean v1, v0, Lcom/roidapp/photogrid/video/m;->d:Z

    if-eqz v1, :cond_3

    .line 978
    const/4 v0, 0x1

    goto :goto_0

    .line 982
    :cond_3
    :try_start_0
    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    new-instance v2, Lcom/roidapp/photogrid/video/u;

    invoke-direct {v2, p0}, Lcom/roidapp/photogrid/video/u;-><init>(Lcom/roidapp/photogrid/video/q;)V

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/u;->b()Ljava/lang/reflect/Type;

    move-result-object v2

    invoke-virtual {v1, p2, v2}, Lcom/google/a/k;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 983
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gtz v2, :cond_5

    .line 984
    :cond_4
    const/4 v0, 0x0

    goto :goto_0

    .line 986
    :cond_5
    const/4 v4, 0x0

    .line 987
    const/4 v2, 0x0

    move v6, v2

    :goto_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-ge v6, v2, :cond_11

    .line 988
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 989
    if-eqz v2, :cond_10

    .line 991
    iget-object v8, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    .line 992
    invoke-static {v8}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/onlinemusic/Track;)Z

    move-result v3

    if-eqz v3, :cond_10

    .line 994
    iget v3, v8, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/video/q;->m(I)Lcom/roidapp/photogrid/video/z;

    move-result-object v5

    .line 995
    if-nez v5, :cond_b

    .line 997
    iget v3, v0, Lcom/roidapp/photogrid/video/m;->e:I

    invoke-direct {p0, p1, v3, v6, v8}, Lcom/roidapp/photogrid/video/q;->a(IIILcom/roidapp/photogrid/video/onlinemusic/Track;)V

    .line 998
    const/4 v3, 0x0

    move v5, v3

    :goto_4
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->o:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v5, v3, :cond_6

    .line 999
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/roidapp/photogrid/video/c;

    .line 1000
    if-eqz v3, :cond_a

    .line 1002
    iget-object v9, v3, Lcom/roidapp/photogrid/video/c;->b:Ljava/lang/String;

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, v8, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, "_"

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    iget-object v11, v8, Lcom/roidapp/photogrid/video/onlinemusic/Track;->mp3_url:Ljava/lang/String;

    invoke-static {v11}, Lcom/roidapp/photogrid/video/q;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_a

    .line 1003
    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "AddLocalTrackInfo music file exists:"

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v10, v3, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1004
    iget-object v9, v3, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    invoke-static {v9}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1005
    if-eqz v9, :cond_8

    iget-object v10, v8, Lcom/roidapp/photogrid/video/onlinemusic/Track;->file_md5:Ljava/lang/String;

    invoke-virtual {v9, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v9

    if-eqz v9, :cond_8

    .line 1006
    iget-object v3, v3, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    iput-object v3, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    .line 1007
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1018
    :cond_6
    :goto_5
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_7

    .line 1019
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, p1, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1020
    :cond_7
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1021
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    new-instance v3, Lcom/roidapp/photogrid/video/z;

    iget v5, v8, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-direct {v3, p0, v5, p1, v4}, Lcom/roidapp/photogrid/video/z;-><init>(Lcom/roidapp/photogrid/video/q;III)V

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1022
    add-int/lit8 v2, v4, 0x1

    .line 987
    :goto_6
    add-int/lit8 v3, v6, 0x1

    move v4, v2

    move v6, v3

    goto/16 :goto_3

    .line 1010
    :cond_8
    new-instance v9, Ljava/io/File;

    iget-object v3, v3, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    invoke-direct {v9, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1011
    invoke-virtual {v9}, Ljava/io/File;->exists()Z

    move-result v3

    if-eqz v3, :cond_9

    .line 1012
    invoke-virtual {v9}, Ljava/io/File;->delete()Z

    .line 1013
    :cond_9
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->o:Ljava/util/ArrayList;

    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_5

    .line 1059
    :catch_0
    move-exception v1

    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/video/m;->d:Z

    .line 1060
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, v7, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1061
    iget v1, p0, Lcom/roidapp/photogrid/video/q;->a:I

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    iget v0, v0, Lcom/roidapp/photogrid/video/m;->a:I

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->count:I

    sub-int v0, v1, v0

    iput v0, p0, Lcom/roidapp/photogrid/video/q;->a:I

    .line 1063
    const/4 v0, 0x0

    goto/16 :goto_0

    .line 998
    :cond_a
    add-int/lit8 v3, v5, 0x1

    move v5, v3

    goto/16 :goto_4

    .line 1025
    :cond_b
    :try_start_1
    iget v2, v0, Lcom/roidapp/photogrid/video/m;->e:I

    const v3, 0x989680

    if-ne v2, v3, :cond_d

    iget v2, v5, Lcom/roidapp/photogrid/video/z;->b:I

    if-eq v2, p1, :cond_d

    .line 1026
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    iget v3, v5, Lcom/roidapp/photogrid/video/z;->b:I

    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    iget v3, v5, Lcom/roidapp/photogrid/video/z;->c:I

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 1027
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_c

    .line 1028
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    new-instance v9, Ljava/util/ArrayList;

    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v3, p1, v9}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1029
    :cond_c
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/ArrayList;

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1030
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    iget v3, v5, Lcom/roidapp/photogrid/video/z;->d:I

    new-instance v5, Lcom/roidapp/photogrid/video/z;

    iget v8, v8, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    invoke-direct {v5, p0, v8, p1, v4}, Lcom/roidapp/photogrid/video/z;-><init>(Lcom/roidapp/photogrid/video/q;III)V

    invoke-virtual {v2, v3, v5}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1031
    add-int/lit8 v2, v4, 0x1

    .line 1032
    goto/16 :goto_6

    .line 1034
    :cond_d
    const/4 v2, 0x0

    :goto_7
    iget-object v3, v8, Lcom/roidapp/photogrid/video/onlinemusic/Track;->genre:[Ljava/lang/String;

    array-length v3, v3

    if-ge v2, v3, :cond_e

    .line 1035
    iget-object v3, v8, Lcom/roidapp/photogrid/video/onlinemusic/Track;->genre:[Ljava/lang/String;

    aget-object v3, v3, v2

    invoke-static {v3}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v3

    iget v9, v0, Lcom/roidapp/photogrid/video/m;->e:I

    if-eq v3, v9, :cond_e

    .line 1034
    add-int/lit8 v2, v2, 0x1

    goto :goto_7

    .line 1039
    :cond_e
    iget-object v3, v8, Lcom/roidapp/photogrid/video/onlinemusic/Track;->genre:[Ljava/lang/String;

    array-length v3, v3

    if-lt v2, v3, :cond_10

    .line 1040
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    iget v3, v0, Lcom/roidapp/photogrid/video/m;->e:I

    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_f

    .line 1041
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    iget v3, v0, Lcom/roidapp/photogrid/video/m;->e:I

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v3, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 1042
    :cond_f
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    iget v3, v0, Lcom/roidapp/photogrid/video/m;->e:I

    invoke-virtual {v2, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/ArrayList;

    .line 1043
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_10
    move v2, v4

    goto/16 :goto_6

    .line 1054
    :cond_11
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcom/roidapp/photogrid/video/m;->d:Z

    .line 1055
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v1, v7, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 1065
    const/4 v0, 0x1

    goto/16 :goto_0

    :cond_12
    move v7, v2

    goto/16 :goto_2
.end method

.method static synthetic c(Lcom/roidapp/photogrid/video/q;)Z
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->g()Z

    move-result v0

    return v0
.end method

.method private c(Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 778
    if-nez p1, :cond_0

    move v0, v1

    .line 792
    :goto_0
    return v0

    .line 780
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    if-eqz v0, :cond_1

    move v0, v2

    .line 781
    goto :goto_0

    .line 784
    :cond_1
    :try_start_0
    new-instance v0, Lcom/google/a/k;

    invoke-direct {v0}, Lcom/google/a/k;-><init>()V

    const-class v3, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    invoke-virtual {v0, p1, v3}, Lcom/google/a/k;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    .line 785
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    move v0, v1

    .line 786
    goto :goto_0

    :cond_3
    move v0, v2

    .line 788
    goto :goto_0

    .line 790
    :catch_0
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V

    move v0, v1

    .line 792
    goto :goto_0
.end method

.method static synthetic d(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ac;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->p:Lcom/roidapp/photogrid/video/ac;

    return-object v0
.end method

.method private static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 1206
    if-nez p0, :cond_0

    .line 1207
    const/4 v0, 0x0

    .line 1210
    :goto_0
    return-object v0

    :cond_0
    invoke-static {p0}, Lcom/roidapp/photogrid/video/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private e()I
    .locals 3

    .prologue
    .line 403
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->B:Ljava/util/ArrayList;

    monitor-enter v1

    .line 404
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 405
    const/4 v0, -0x1

    monitor-exit v1

    .line 406
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->B:Ljava/util/ArrayList;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->B:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    monitor-exit v1

    goto :goto_0

    .line 407
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic e(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/aa;
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    return-object v0
.end method

.method private static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .prologue
    .line 1511
    if-nez p0, :cond_0

    .line 1512
    const/4 v0, 0x0

    .line 1517
    :goto_0
    return-object v0

    .line 1513
    :cond_0
    const-string v0, "/"

    invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v0

    .line 1514
    const-string v1, "?"

    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v1

    .line 1515
    const/4 v2, -0x1

    if-eq v1, v2, :cond_1

    if-le v1, v0, :cond_1

    .line 1516
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 1517
    :cond_1
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method private static f(Ljava/lang/String;)J
    .locals 7

    .prologue
    const-wide/16 v4, 0x0

    const/4 v2, -0x1

    .line 1531
    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-wide v0, v4

    .line 1570
    :goto_0
    return-wide v0

    .line 1536
    :cond_1
    const/4 v0, 0x0

    move v1, v2

    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v0, v3, :cond_f

    .line 1537
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v6, 0x30

    if-lt v3, v6, :cond_2

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v6, 0x39

    if-le v3, v6, :cond_5

    .line 1538
    :cond_2
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v6, 0x20

    if-ne v3, v6, :cond_3

    if-eq v1, v2, :cond_6

    .line 1540
    :cond_3
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v6, 0x2e

    if-ne v3, v6, :cond_4

    if-ne v1, v2, :cond_6

    :cond_4
    move v3, v0

    .line 1552
    :goto_2
    if-ne v1, v2, :cond_7

    move-wide v0, v4

    .line 1553
    goto :goto_0

    .line 1546
    :cond_5
    if-ne v1, v2, :cond_6

    move v1, v0

    .line 1536
    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1555
    :cond_7
    const/4 v0, 0x1

    .line 1556
    if-ne v3, v2, :cond_8

    .line 1557
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    .line 1569
    :goto_3
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->round(F)I

    move-result v1

    mul-int/2addr v0, v1

    int-to-long v0, v0

    .line 1570
    goto :goto_0

    .line 1559
    :cond_8
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v2

    .line 1560
    const-string v4, "k"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_9

    const-string v4, "kb"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_a

    .line 1561
    :cond_9
    const/16 v0, 0x400

    move v2, v3

    goto :goto_3

    .line 1562
    :cond_a
    const-string v4, "m"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, "mb"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_c

    .line 1563
    :cond_b
    const/high16 v0, 0x100000

    move v2, v3

    goto :goto_3

    .line 1564
    :cond_c
    const-string v4, "g"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_d

    const-string v4, "gb"

    invoke-virtual {v2, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 1565
    :cond_d
    const/high16 v0, 0x40000000    # 2.0f

    move v2, v3

    goto :goto_3

    :cond_e
    move v2, v3

    goto :goto_3

    :cond_f
    move v3, v2

    goto :goto_2
.end method

.method static synthetic f(Lcom/roidapp/photogrid/video/q;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    return-object v0
.end method

.method private f()V
    .locals 2

    .prologue
    .line 411
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->B:Ljava/util/ArrayList;

    monitor-enter v1

    .line 412
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 413
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic g(Lcom/roidapp/photogrid/video/q;)I
    .locals 1

    .prologue
    .line 37
    iget v0, p0, Lcom/roidapp/photogrid/video/q;->a:I

    return v0
.end method

.method private static g(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/16 v3, 0x32

    const/16 v2, 0x5f

    .line 1766
    const/16 v0, 0x2d

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 1767
    const/16 v1, 0x20

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 1768
    const/16 v1, 0x2e

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 1769
    const/16 v1, 0x3a

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 1770
    const/16 v1, 0x26

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 1771
    const/16 v1, 0x28

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 1772
    const/16 v1, 0x29

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 1773
    const/16 v1, 0x27

    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    move-result-object v0

    .line 1774
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-le v1, v3, :cond_0

    .line 1775
    const/4 v1, 0x0

    invoke-virtual {v0, v1, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 1776
    :cond_0
    return-object v0
.end method

.method private g()Z
    .locals 13

    .prologue
    const v12, 0x989680

    const/4 v3, 0x0

    const/4 v5, 0x1

    const/4 v2, 0x0

    .line 620
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_3

    :cond_1
    move v5, v2

    .line 775
    :cond_2
    :goto_0
    return v5

    .line 623
    :cond_3
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/q;->C:Z

    if-eqz v0, :cond_4

    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/q;->D:Z

    if-nez v0, :cond_2

    .line 626
    :cond_4
    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/q;->C:Z

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    if-eqz v0, :cond_2

    .line 628
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 629
    new-instance v1, Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    const v4, 0x989682

    const-string v6, "History"

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    if-nez v0, :cond_8

    move v0, v2

    :goto_1
    invoke-direct {v1, v4, v6, v3, v0}, Lcom/roidapp/photogrid/video/onlinemusic/Genre;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/onlinemusic/Genre;)V

    .line 630
    new-instance v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    const-string v1, "Top 100"

    const/16 v4, 0x64

    invoke-direct {v0, v2, v1, v3, v4}, Lcom/roidapp/photogrid/video/onlinemusic/Genre;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/onlinemusic/Genre;)V

    .line 631
    new-instance v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    const-string v1, "All Genres"

    const/16 v4, 0x1f4

    invoke-direct {v0, v12, v1, v3, v4}, Lcom/roidapp/photogrid/video/onlinemusic/Genre;-><init>(ILjava/lang/String;Ljava/lang/String;I)V

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/onlinemusic/Genre;)V

    .line 633
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    if-eqz v0, :cond_1b

    .line 635
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genreNames:Ljava/util/ArrayList;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genreNames:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_9

    .line 637
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genreNames:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_6
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_9

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    .line 638
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_7
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;

    .line 639
    iget v7, v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_id:I

    iget v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;->id:I

    if-ne v7, v1, :cond_7

    .line 640
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/onlinemusic/Genre;)V

    goto :goto_2

    .line 629
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_1

    .line 648
    :cond_9
    new-instance v7, Ljava/util/ArrayList;

    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 651
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_a

    .line 652
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    move-object v6, v0

    .line 658
    :goto_3
    if-eqz v6, :cond_c

    .line 659
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v1, v0, [Z

    move v0, v2

    .line 660
    :goto_4
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-ge v0, v3, :cond_b

    .line 661
    aput-boolean v2, v1, v0

    .line 660
    add-int/lit8 v0, v0, 0x1

    goto :goto_4

    .line 654
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    if-eqz v0, :cond_25

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    if-eqz v0, :cond_25

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_25

    .line 655
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    move-object v6, v0

    goto :goto_3

    :cond_b
    move-object v3, v1

    .line 664
    :cond_c
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_d
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_11

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    .line 665
    new-instance v9, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    invoke-direct {v9}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;-><init>()V

    .line 666
    iput-object v0, v9, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    .line 667
    const-string v1, ""

    iput-object v1, v9, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    .line 668
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "onServerInfoDone cloud, trackpage:"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v4, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->url:Ljava/lang/String;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 670
    if-eqz v6, :cond_24

    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_24

    move v4, v2

    .line 671
    :goto_6
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v4, v1, :cond_24

    .line 672
    invoke-virtual {v6, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    .line 673
    if-eqz v1, :cond_10

    iget-object v10, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    if-eqz v10, :cond_10

    .line 676
    iget-object v10, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget-object v10, v10, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->md5:Ljava/lang/String;

    if-eqz v10, :cond_10

    iget-object v10, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    if-eqz v10, :cond_10

    .line 679
    iget-object v10, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->md5:Ljava/lang/String;

    if-eqz v10, :cond_10

    iget-object v10, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget-object v10, v10, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->md5:Ljava/lang/String;

    iget-object v11, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->md5:Ljava/lang/String;

    invoke-virtual {v10, v11}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v10

    if-eqz v10, :cond_10

    .line 680
    new-instance v0, Ljava/io/File;

    iget-object v10, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    invoke-direct {v0, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_e

    iget-object v0, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    :goto_7
    iput-object v0, v9, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    .line 681
    iget-object v0, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->localkey:Ljava/lang/String;

    iput-object v0, v9, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->localkey:Ljava/lang/String;

    .line 682
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_f

    move v0, v5

    .line 683
    :goto_8
    aput-boolean v5, v3, v4

    .line 684
    new-instance v10, Ljava/lang/StringBuilder;

    const-string v11, "onServerInfoDone cloud, local info exists for:"

    invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v10, ",pageExists:"

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v10, ", index:"

    invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 689
    :goto_9
    if-nez v0, :cond_d

    .line 690
    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_5

    .line 680
    :cond_e
    const-string v0, ""

    goto :goto_7

    :cond_f
    move v0, v2

    .line 682
    goto :goto_8

    .line 671
    :cond_10
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_6

    .line 693
    :cond_11
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    move v1, v2

    .line 696
    :goto_a
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_14

    .line 697
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/c;

    .line 698
    if-eqz v0, :cond_13

    iget-object v4, v0, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    if-eqz v4, :cond_13

    iget-object v4, v0, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    const-string v6, ".json"

    invoke-virtual {v4, v6}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_13

    iget-object v4, v0, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    iget-object v6, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    invoke-virtual {v4, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_13

    .line 699
    new-instance v4, Ljava/io/File;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    invoke-direct {v4, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 700
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_12

    .line 701
    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    .line 702
    :cond_12
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 703
    if-lez v1, :cond_13

    .line 704
    add-int/lit8 v1, v1, -0x1

    .line 696
    :cond_13
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_a

    .line 709
    :cond_14
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v0, v1, :cond_1a

    .line 710
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    move v1, v2

    .line 711
    :goto_b
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_18

    .line 712
    if-eqz v3, :cond_15

    array-length v0, v3

    if-ge v1, v0, :cond_15

    aget-boolean v0, v3, v1

    if-eqz v0, :cond_17

    .line 714
    :cond_15
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 711
    :cond_16
    :goto_c
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_b

    .line 716
    :cond_17
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_16

    .line 717
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/m;

    .line 718
    iput-boolean v5, v0, Lcom/roidapp/photogrid/video/m;->d:Z

    .line 719
    iput-boolean v5, v0, Lcom/roidapp/photogrid/video/m;->c:Z

    .line 720
    iget-object v6, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v6, v1, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    goto :goto_c

    .line 724
    :cond_18
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    new-instance v3, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v6, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-direct {v3, v6, v4}, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v3}, Lcom/google/a/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 728
    :goto_d
    iput-boolean v5, p0, Lcom/roidapp/photogrid/video/q;->D:Z

    .line 746
    :goto_e
    new-instance v4, Landroid/text/format/Time;

    invoke-direct {v4}, Landroid/text/format/Time;-><init>()V

    .line 747
    invoke-virtual {v4}, Landroid/text/format/Time;->setToNow()V

    .line 748
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    move v1, v0

    :goto_f
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_21

    .line 749
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    .line 750
    if-eqz v0, :cond_19

    iget-object v3, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    if-nez v3, :cond_1e

    .line 751
    :cond_19
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 752
    add-int/lit8 v1, v1, -0x1

    .line 748
    :goto_10
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_f

    .line 726
    :cond_1a
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    new-instance v3, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    iget-object v6, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-direct {v3, v4, v6}, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v3}, Lcom/google/a/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_d

    .line 732
    :cond_1b
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 733
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->genreList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1c

    .line 734
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->genreList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_11
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1c

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    .line 735
    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/onlinemusic/Genre;)V

    goto :goto_11

    .line 739
    :cond_1c
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    if-eqz v0, :cond_1d

    .line 740
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 741
    :cond_1d
    iput v2, p0, Lcom/roidapp/photogrid/video/q;->a:I

    .line 742
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 743
    iput-boolean v5, p0, Lcom/roidapp/photogrid/video/q;->C:Z

    goto/16 :goto_e

    .line 755
    :cond_1e
    iget-object v3, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    .line 756
    if-eqz v3, :cond_1f

    iget-object v5, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v5

    if-nez v5, :cond_1f

    new-instance v5, Ljava/io/File;

    invoke-direct {v5, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v5

    if-nez v5, :cond_20

    .line 757
    :cond_1f
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget-object v5, v5, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->url:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    const-string v5, "?X="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    iget v5, v4, Landroid/text/format/Time;->hour:I

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    .line 758
    :cond_20
    iget-object v5, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    new-instance v6, Lcom/roidapp/photogrid/video/m;

    invoke-direct {v6, v1, v3, v12}, Lcom/roidapp/photogrid/video/m;-><init>(ILjava/lang/String;I)V

    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 759
    iget v3, p0, Lcom/roidapp/photogrid/video/q;->a:I

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->count:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/roidapp/photogrid/video/q;->a:I

    goto/16 :goto_10

    .line 762
    :cond_21
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iput v0, p0, Lcom/roidapp/photogrid/video/q;->E:I

    .line 763
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    if-eqz v0, :cond_22

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    if-eqz v0, :cond_22

    .line 764
    :goto_12
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_22

    .line 765
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;

    .line 767
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    new-instance v3, Lcom/roidapp/photogrid/video/m;

    iget v5, p0, Lcom/roidapp/photogrid/video/q;->E:I

    add-int/2addr v5, v2

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v7, v0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;->url:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    const-string v7, "?X="

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, v4, Landroid/text/format/Time;->hour:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    iget v7, v4, Landroid/text/format/Time;->minute:I

    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;->id:I

    invoke-direct {v3, v5, v6, v0}, Lcom/roidapp/photogrid/video/m;-><init>(ILjava/lang/String;I)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 764
    add-int/lit8 v2, v2, 0x1

    goto :goto_12

    .line 771
    :cond_22
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->e()I

    move-result v0

    .line 772
    const/4 v1, -0x1

    if-eq v0, v1, :cond_23

    .line 773
    iput v0, p0, Lcom/roidapp/photogrid/video/q;->z:I

    .line 775
    :cond_23
    iget v0, p0, Lcom/roidapp/photogrid/video/q;->z:I

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/q;->j(I)Z

    move-result v5

    goto/16 :goto_0

    :cond_24
    move v0, v2

    goto/16 :goto_9

    :cond_25
    move-object v6, v3

    goto/16 :goto_3
.end method

.method static synthetic h(Lcom/roidapp/photogrid/video/q;)I
    .locals 1

    .prologue
    .line 37
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->e()I

    move-result v0

    return v0
.end method

.method private h()Z
    .locals 10

    .prologue
    const/4 v2, 0x0

    const/4 v6, 0x1

    const/4 v3, 0x0

    .line 1070
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "initCacheInfo in:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1071
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    if-nez v0, :cond_1

    .line 1198
    :cond_0
    :goto_0
    return v3

    .line 1074
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 1075
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    .line 1077
    :cond_2
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1078
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_3

    .line 1079
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 1080
    :cond_3
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1083
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".track/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    .line 1084
    new-instance v5, Ljava/io/File;

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1085
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_4

    .line 1086
    invoke-virtual {v5}, Ljava/io/File;->mkdirs()Z

    .line 1088
    :cond_4
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1091
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".track/main.json"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    .line 1093
    invoke-virtual {v5}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_19

    .line 1094
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0

    move-object v1, v0

    .line 1097
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ".track/history.json"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->e:Ljava/lang/String;

    .line 1098
    new-instance v0, Ljava/io/File;

    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->e:Ljava/lang/String;

    invoke-direct {v0, v4}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1099
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 1101
    :try_start_0
    new-instance v0, Lcom/google/a/k;

    invoke-direct {v0}, Lcom/google/a/k;-><init>()V

    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->e:Ljava/lang/String;

    invoke-static {v4}, Lcom/roidapp/photogrid/video/bi;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    new-instance v7, Lcom/roidapp/photogrid/video/v;

    invoke-direct {v7, p0}, Lcom/roidapp/photogrid/video/v;-><init>(Lcom/roidapp/photogrid/video/q;)V

    invoke-virtual {v7}, Lcom/roidapp/photogrid/video/v;->b()Ljava/lang/reflect/Type;

    move-result-object v7

    invoke-virtual {v0, v4, v7}, Lcom/google/a/k;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 1111
    :cond_5
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1112
    if-eqz v1, :cond_8

    array-length v0, v1

    if-lez v0, :cond_8

    move v0, v3

    .line 1113
    :goto_3
    array-length v4, v1

    if-ge v0, v4, :cond_8

    .line 1114
    aget-object v4, v1, v0

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    .line 3234
    if-eqz v4, :cond_7

    .line 3235
    const-string v7, "."

    invoke-virtual {v4, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v7

    add-int/lit8 v7, v7, 0x1

    invoke-virtual {v4, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    sget-object v7, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v4, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v4

    .line 3236
    const-string v7, "json"

    invoke-virtual {v4, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_7

    move v4, v6

    .line 1114
    :goto_4
    if-eqz v4, :cond_6

    aget-object v4, v1, v0

    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v4

    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->e:Ljava/lang/String;

    invoke-virtual {v4, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v4

    if-nez v4, :cond_6

    .line 1115
    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->n:Ljava/util/ArrayList;

    new-instance v7, Lcom/roidapp/photogrid/video/c;

    aget-object v8, v1, v0

    invoke-virtual {v8}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    aget-object v9, v1, v0

    invoke-virtual {v9}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v9

    .line 4202
    invoke-static {v9}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 1115
    invoke-direct {v7, v8, v9}, Lcom/roidapp/photogrid/video/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1113
    :cond_6
    add-int/lit8 v0, v0, 0x1

    goto :goto_3

    .line 1106
    :catch_0
    move-exception v0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    goto :goto_2

    :cond_7
    move v4, v3

    .line 3240
    goto :goto_4

    .line 1120
    :cond_8
    invoke-static {}, Lcom/roidapp/baselib/d/a;->d()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->h:Ljava/lang/String;

    .line 1121
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->h:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1122
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_9

    .line 1123
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 1125
    :cond_9
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1131
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_a

    .line 1132
    invoke-virtual {v5}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v2

    .line 1135
    :cond_a
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->o:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1136
    if-eqz v2, :cond_e

    array-length v0, v2

    if-lez v0, :cond_e

    move v0, v3

    .line 1137
    :goto_5
    array-length v1, v2

    if-ge v0, v1, :cond_e

    .line 1138
    aget-object v1, v2, v0

    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v1

    .line 4214
    if-eqz v1, :cond_d

    .line 4215
    const-string v4, "."

    invoke-virtual {v1, v4}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    move-result v4

    add-int/lit8 v4, v4, 0x1

    invoke-virtual {v1, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    sget-object v4, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    invoke-virtual {v1, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v1

    .line 4216
    const-string v4, "mp3"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, "m4a"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, "amr"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, "aac"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, "ogg"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, "flac"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, "3gpp"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, "3ga"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    const-string v4, "wav"

    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    :cond_b
    move v1, v6

    .line 1138
    :goto_6
    if-eqz v1, :cond_c

    .line 1139
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->o:Ljava/util/ArrayList;

    new-instance v4, Lcom/roidapp/photogrid/video/c;

    aget-object v5, v2, v0

    invoke-virtual {v5}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v5

    aget-object v7, v2, v0

    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/roidapp/photogrid/video/q;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v4, v5, v7}, Lcom/roidapp/photogrid/video/c;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1137
    :cond_c
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_5

    :cond_d
    move v1, v3

    .line 4228
    goto :goto_6

    .line 1144
    :cond_e
    new-instance v1, Ljava/io/File;

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1145
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_f

    move v3, v6

    .line 1147
    goto/16 :goto_0

    .line 1149
    :cond_f
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "initCacheInfo local addr exists"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1151
    :try_start_1
    new-instance v0, Lcom/google/a/k;

    invoke-direct {v0}, Lcom/google/a/k;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/bi;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const-class v4, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    invoke-virtual {v0, v2, v4}, Lcom/google/a/k;->a(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iput-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 1158
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    if-eqz v0, :cond_10

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_11

    :cond_10
    move v3, v6

    .line 1159
    goto/16 :goto_0

    .line 1154
    :catch_1
    move-exception v0

    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    move v3, v6

    .line 1155
    goto/16 :goto_0

    :cond_11
    move v5, v3

    .line 1161
    :goto_7
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_17

    .line 1162
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    move v4, v3

    .line 1164
    :goto_8
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v4, v0, :cond_12

    .line 1165
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/c;

    .line 1166
    iget-object v1, v0, Lcom/roidapp/photogrid/video/c;->b:Ljava/lang/String;

    iget-object v7, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->localkey:Ljava/lang/String;

    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_14

    iget-object v1, v0, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    invoke-virtual {v1, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_14

    .line 1169
    :try_start_2
    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    iget-object v7, v0, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    invoke-static {v7}, Lcom/roidapp/photogrid/video/bi;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    new-instance v8, Lcom/roidapp/photogrid/video/w;

    invoke-direct {v8, p0}, Lcom/roidapp/photogrid/video/w;-><init>(Lcom/roidapp/photogrid/video/q;)V

    invoke-virtual {v8}, Lcom/roidapp/photogrid/video/w;->b()Ljava/lang/reflect/Type;

    move-result-object v8

    invoke-virtual {v1, v7, v8}, Lcom/google/a/k;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    .line 1171
    if-eqz v1, :cond_12

    if-eqz v2, :cond_12

    iget-object v7, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    if-eqz v7, :cond_12

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v7, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget v7, v7, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->count:I

    if-ne v1, v7, :cond_12

    .line 1172
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v7, "initCacheInfo check local page succeed:"

    invoke-direct {v1, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v7, v0, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1173
    iget-object v1, v0, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    iput-object v1, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    .line 1174
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    invoke-virtual {v1, v5, v2}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 1175
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->n:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2

    .line 1186
    :cond_12
    :goto_9
    if-eqz v2, :cond_13

    iget-object v0, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    if-nez v0, :cond_15

    .line 1187
    :cond_13
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1188
    add-int/lit8 v0, v5, -0x1

    .line 1161
    :goto_a
    add-int/lit8 v5, v0, 0x1

    goto/16 :goto_7

    .line 1180
    :catch_2
    move-exception v1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "initCacheInfo check local page error:"

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lcom/roidapp/photogrid/video/c;->a:Ljava/lang/String;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_9

    .line 1164
    :cond_14
    add-int/lit8 v0, v4, 0x1

    move v4, v0

    goto/16 :goto_8

    .line 1191
    :cond_15
    iget-object v0, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->md5:Ljava/lang/String;

    if-eqz v0, :cond_16

    iget-object v0, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    if-eqz v0, :cond_16

    iget-object v0, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    const-string v1, ""

    invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_16

    new-instance v0, Ljava/io/File;

    iget-object v1, v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v0

    if-nez v0, :cond_18

    .line 1192
    :cond_16
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 1193
    add-int/lit8 v0, v5, -0x1

    goto :goto_a

    :cond_17
    move v3, v6

    .line 1198
    goto/16 :goto_0

    :cond_18
    move v0, v5

    goto :goto_a

    :cond_19
    move-object v1, v2

    goto/16 :goto_1
.end method

.method private i()Lcom/roidapp/photogrid/video/aa;
    .locals 2

    .prologue
    .line 1323
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->b:Lcom/roidapp/photogrid/video/aa;

    monitor-enter v1

    .line 1324
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->b:Lcom/roidapp/photogrid/video/aa;

    monitor-exit v1

    return-object v0

    .line 1325
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic i(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    return-object v0
.end method

.method private i(I)V
    .locals 3

    .prologue
    .line 393
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->B:Ljava/util/ArrayList;

    monitor-enter v2

    .line 394
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->B:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 395
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->B:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    if-ne v0, p1, :cond_0

    .line 396
    monitor-exit v2

    .line 399
    :goto_1
    return-void

    .line 394
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 398
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->B:Ljava/util/ArrayList;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 399
    monitor-exit v2

    goto :goto_1

    :catchall_0
    move-exception v0

    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method static synthetic j(Lcom/roidapp/photogrid/video/q;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->A:Landroid/os/Handler;

    return-object v0
.end method

.method private j()Z
    .locals 8

    .prologue
    const v4, 0x989681

    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 1335
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1370
    :goto_0
    return v0

    .line 1337
    :cond_0
    iget-boolean v2, p0, Lcom/roidapp/photogrid/video/q;->D:Z

    if-nez v2, :cond_1

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->x:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    :cond_1
    move v0, v1

    .line 1338
    goto :goto_0

    .line 1339
    :cond_2
    new-instance v2, Lcom/roidapp/photogrid/video/o;

    invoke-direct {v2, v4}, Lcom/roidapp/photogrid/video/o;-><init>(I)V

    .line 1341
    new-instance v3, Lcom/roidapp/photogrid/video/x;

    invoke-direct {v3, p0}, Lcom/roidapp/photogrid/video/x;-><init>(Lcom/roidapp/photogrid/video/q;)V

    invoke-virtual {v2, v3}, Lcom/roidapp/photogrid/video/o;->a(Lcom/roidapp/photogrid/video/p;)V

    .line 1368
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->x:Ljava/util/HashMap;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1369
    sget-object v3, Lcom/roidapp/baselib/c/c;->SINGLE_EXECUTOR:Ljava/util/concurrent/Executor;

    new-array v4, v1, [Lcom/roidapp/photogrid/video/m;

    new-instance v5, Lcom/roidapp/photogrid/video/m;

    const-string v6, "http://dl.pg.ksmobile.com/fma_music/main.json"

    const v7, 0x989680

    invoke-direct {v5, v0, v6, v7}, Lcom/roidapp/photogrid/video/m;-><init>(ILjava/lang/String;I)V

    aput-object v5, v4, v0

    invoke-virtual {v2, v3, v4}, Lcom/roidapp/photogrid/video/o;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;

    move v0, v1

    .line 1370
    goto :goto_0
.end method

.method private declared-synchronized j(I)Z
    .locals 12

    .prologue
    const/16 v10, 0x32

    const/16 v9, 0x64

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 451
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->x:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v0

    if-eqz v0, :cond_0

    move v0, v3

    .line 612
    :goto_0
    monitor-exit p0

    return v0

    .line 454
    :cond_0
    :try_start_1
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "loadMoreTracks genre_id:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mTotalTrackCount:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lcom/roidapp/photogrid/video/q;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ",mAvailableTracks.size():"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 456
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/video/q;->a:I

    if-lt v0, v1, :cond_1

    if-eqz p1, :cond_1

    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/q;->D:Z

    if-eqz v0, :cond_1

    move v0, v3

    .line 457
    goto :goto_0

    .line 461
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x1f4

    if-lt v0, v1, :cond_2

    if-eqz p1, :cond_2

    move v0, v3

    .line 462
    goto :goto_0

    .line 464
    :cond_2
    const v0, 0x989682

    if-ne p1, v0, :cond_3

    move v0, v3

    .line 465
    goto :goto_0

    .line 468
    :cond_3
    if-nez p1, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt v0, v9, :cond_4

    move v0, v3

    .line 469
    goto :goto_0

    .line 472
    :cond_4
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/q;->k(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    move-result-object v1

    .line 473
    if-nez v1, :cond_5

    move v0, v3

    .line 474
    goto :goto_0

    .line 477
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_6

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v2, v1, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->count:I

    if-lt v0, v2, :cond_6

    iget v0, v1, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->count:I

    if-lez v0, :cond_6

    move v0, v3

    .line 478
    goto/16 :goto_0

    .line 480
    :cond_6
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->e:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-gt v0, v1, :cond_7

    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->b:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-ge v0, v1, :cond_8

    :cond_7
    move v0, v3

    .line 481
    goto/16 :goto_0

    .line 484
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v6, v0, [Lcom/roidapp/photogrid/video/m;

    .line 487
    const v0, 0x989680

    if-eq p1, v0, :cond_22

    .line 488
    iget v0, p0, Lcom/roidapp/photogrid/video/q;->E:I

    move v5, v0

    move v1, v3

    move v2, v3

    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_e

    .line 489
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/m;

    .line 490
    if-eqz v0, :cond_21

    iget-object v7, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    if-eqz v7, :cond_21

    iget-boolean v7, v0, Lcom/roidapp/photogrid/video/m;->c:Z

    if-nez v7, :cond_21

    iget v7, v0, Lcom/roidapp/photogrid/video/m;->e:I

    if-ne p1, v7, :cond_21

    .line 491
    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->c:Landroid/content/Context;

    invoke-static {v7}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v7

    if-nez v7, :cond_9

    iget-object v7, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    const-string v8, "http"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_21

    .line 493
    :cond_9
    iget-object v7, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    const-string v8, "http"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_a

    .line 494
    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->c:Landroid/content/Context;

    invoke-static {v7}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v7

    if-eqz v7, :cond_21

    .line 496
    if-nez v1, :cond_a

    move v1, v4

    .line 499
    :cond_a
    const/4 v7, 0x1

    iput-boolean v7, v0, Lcom/roidapp/photogrid/video/m;->c:Z

    .line 500
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "loadMoreTracks requestUrl:"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 501
    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v7, v5, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 502
    aput-object v0, v6, v5

    .line 503
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    if-eqz v0, :cond_d

    .line 504
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_c

    .line 505
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->count:I

    add-int/2addr v2, v0

    move v0, v2

    .line 512
    :goto_2
    if-eqz v1, :cond_b

    if-ge v0, v10, :cond_f

    .line 514
    :cond_b
    if-ge v0, v9, :cond_f

    move v11, v1

    move v1, v0

    move v0, v11

    .line 488
    :goto_3
    add-int/lit8 v2, v5, 0x1

    move v5, v2

    move v2, v1

    move v1, v0

    goto/16 :goto_1

    .line 506
    :cond_c
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    if-eqz v0, :cond_20

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v7, v7, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    add-int/2addr v0, v7

    if-gt v5, v0, :cond_20

    .line 507
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v7, v7, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    sub-int v7, v5, v7

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;->count:I

    add-int/2addr v2, v0

    move v0, v2

    goto :goto_2

    .line 510
    :cond_d
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->count:I

    add-int/2addr v2, v0

    move v0, v2

    goto :goto_2

    :cond_e
    move v0, v2

    .line 519
    :cond_f
    :goto_4
    if-nez v0, :cond_16

    move v5, v3

    move v2, v0

    .line 520
    :goto_5
    iget v0, p0, Lcom/roidapp/photogrid/video/q;->E:I

    if-ge v5, v0, :cond_15

    .line 521
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/m;

    .line 522
    if-eqz v0, :cond_1f

    iget-object v7, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    if-eqz v7, :cond_1f

    iget-boolean v7, v0, Lcom/roidapp/photogrid/video/m;->c:Z

    if-nez v7, :cond_1f

    .line 523
    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->c:Landroid/content/Context;

    invoke-static {v7}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v7

    if-nez v7, :cond_10

    iget-object v7, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    const-string v8, "http"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-nez v7, :cond_1f

    .line 525
    :cond_10
    iget-object v7, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    const-string v8, "http"

    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_11

    .line 526
    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->c:Landroid/content/Context;

    invoke-static {v7}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v7

    if-eqz v7, :cond_1f

    .line 528
    if-nez v1, :cond_11

    move v1, v4

    .line 531
    :cond_11
    const/4 v7, 0x1

    iput-boolean v7, v0, Lcom/roidapp/photogrid/video/m;->c:Z

    .line 532
    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "loadMoreTracks requestUrl:"

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v8, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 533
    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v7, v5, v0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 534
    aput-object v0, v6, v5

    .line 535
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    if-eqz v0, :cond_14

    .line 536
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v5, v0, :cond_13

    .line 537
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->count:I

    add-int/2addr v2, v0

    move v0, v2

    .line 543
    :goto_6
    if-eqz v1, :cond_12

    if-ge v0, v10, :cond_16

    .line 545
    :cond_12
    if-ge v0, v9, :cond_16

    move v11, v1

    move v1, v0

    move v0, v11

    .line 520
    :goto_7
    add-int/lit8 v2, v5, 0x1

    move v5, v2

    move v2, v1

    move v1, v0

    goto :goto_5

    .line 538
    :cond_13
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    if-eqz v0, :cond_1e

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v7, v7, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    add-int/2addr v0, v7

    if-gt v5, v0, :cond_1e

    .line 539
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->genre:Ljava/util/ArrayList;

    iget-object v7, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v7, v7, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v7}, Ljava/util/ArrayList;->size()I

    move-result v7

    sub-int v7, v5, v7

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/GenrePage;->count:I

    add-int/2addr v2, v0

    move v0, v2

    goto :goto_6

    .line 541
    :cond_14
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->q:Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;->localPageList:Ljava/util/ArrayList;

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->count:I

    add-int/2addr v2, v0

    move v0, v2

    goto :goto_6

    :cond_15
    move v0, v2

    .line 551
    :cond_16
    if-nez v0, :cond_17

    move v0, v3

    .line 552
    goto/16 :goto_0

    .line 556
    :cond_17
    if-nez v1, :cond_1d

    .line 558
    :goto_8
    array-length v0, v6

    if-ge v3, v0, :cond_19

    .line 559
    aget-object v0, v6, v3

    if-eqz v0, :cond_18

    aget-object v0, v6, v3

    iget-object v0, v0, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    if-eqz v0, :cond_18

    .line 560
    aget-object v0, v6, v3

    iget v0, v0, Lcom/roidapp/photogrid/video/m;->a:I

    aget-object v1, v6, v3

    iget-object v1, v1, Lcom/roidapp/photogrid/video/m;->b:Ljava/lang/String;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/bi;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Lcom/roidapp/photogrid/video/q;->b(ILjava/lang/String;)Z

    .line 558
    :cond_18
    add-int/lit8 v3, v3, 0x1

    goto :goto_8

    .line 563
    :cond_19
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_1c

    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->f:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-eq v0, v1, :cond_1c

    .line 564
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->p:Lcom/roidapp/photogrid/video/ac;

    if-eqz v0, :cond_1a

    .line 565
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->p:Lcom/roidapp/photogrid/video/ac;

    invoke-interface {v0, p1}, Lcom/roidapp/photogrid/video/ac;->a(I)V

    .line 573
    :cond_1a
    :goto_9
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget v1, p0, Lcom/roidapp/photogrid/video/q;->a:I

    if-lt v0, v1, :cond_1b

    iget-boolean v0, p0, Lcom/roidapp/photogrid/video/q;->D:Z

    if-eqz v0, :cond_1b

    .line 574
    sget-object v0, Lcom/roidapp/photogrid/video/aa;->e:Lcom/roidapp/photogrid/video/aa;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/aa;)V

    :cond_1b
    move v0, v4

    .line 577
    goto/16 :goto_0

    .line 568
    :cond_1c
    sget-object v0, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/aa;)V

    .line 569
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->p:Lcom/roidapp/photogrid/video/ac;

    if-eqz v0, :cond_1a

    .line 570
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->p:Lcom/roidapp/photogrid/video/ac;

    invoke-interface {v0}, Lcom/roidapp/photogrid/video/ac;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_9

    .line 451
    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0

    .line 580
    :cond_1d
    :try_start_2
    new-instance v0, Lcom/roidapp/photogrid/video/o;

    invoke-direct {v0, p1}, Lcom/roidapp/photogrid/video/o;-><init>(I)V

    .line 581
    new-instance v1, Lcom/roidapp/photogrid/video/s;

    invoke-direct {v1, p0}, Lcom/roidapp/photogrid/video/s;-><init>(Lcom/roidapp/photogrid/video/q;)V

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/o;->a(Lcom/roidapp/photogrid/video/p;)V

    .line 610
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->x:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 611
    sget-object v1, Lcom/roidapp/baselib/c/c;->SINGLE_EXECUTOR:Ljava/util/concurrent/Executor;

    invoke-virtual {v0, v1, v6}, Lcom/roidapp/photogrid/video/o;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Lcom/roidapp/baselib/c/c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    move v0, v4

    .line 612
    goto/16 :goto_0

    :cond_1e
    move v0, v2

    goto/16 :goto_6

    :cond_1f
    move v0, v1

    move v1, v2

    goto/16 :goto_7

    :cond_20
    move v0, v2

    goto/16 :goto_2

    :cond_21
    move v0, v1

    move v1, v2

    goto/16 :goto_3

    :cond_22
    move v1, v3

    move v0, v3

    goto/16 :goto_4
.end method

.method static synthetic k(Lcom/roidapp/photogrid/video/q;)Lcom/roidapp/photogrid/video/ab;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->r:Lcom/roidapp/photogrid/video/ab;

    return-object v0
.end method

.method private k(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;
    .locals 3

    .prologue
    .line 1313
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    .line 1314
    iget v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->genre_id:I

    if-ne v2, p1, :cond_0

    .line 1318
    :goto_0
    return-object v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private l(I)Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/ArrayList",
            "<",
            "Lcom/roidapp/photogrid/video/z;",
            ">;"
        }
    .end annotation

    .prologue
    .line 1380
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic l(Lcom/roidapp/photogrid/video/q;)Ljava/util/HashMap;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    return-object v0
.end method

.method private m(I)Lcom/roidapp/photogrid/video/z;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 1423
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_4

    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->f:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-eq v0, v1, :cond_4

    .line 1424
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v2

    .line 1436
    :goto_0
    return-object v0

    .line 1426
    :cond_1
    const/4 v0, 0x0

    move v1, v0

    :goto_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v1, v0, :cond_3

    .line 1427
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/z;

    .line 1428
    if-eqz v0, :cond_2

    iget v3, v0, Lcom/roidapp/photogrid/video/z;->a:I

    if-ne v3, p1, :cond_2

    .line 1429
    iput v1, v0, Lcom/roidapp/photogrid/video/z;->d:I

    goto :goto_0

    .line 1426
    :cond_2
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_1

    :cond_3
    move-object v0, v2

    .line 1433
    goto :goto_0

    :cond_4
    move-object v0, v2

    .line 1436
    goto :goto_0
.end method

.method static synthetic m(Lcom/roidapp/photogrid/video/q;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->h:Ljava/lang/String;

    return-object v0
.end method

.method private n(I)V
    .locals 4

    .prologue
    .line 1725
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/video/q;->c(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    .line 1726
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cancelDownloadTrack downloadTrack:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1727
    if-nez v0, :cond_1

    .line 1745
    :cond_0
    :goto_0
    return-void

    .line 1731
    :cond_1
    iget-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    if-eqz v1, :cond_2

    iget-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 1732
    :cond_2
    iget-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/q;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1733
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->mp3_url:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    .line 1735
    :cond_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "cancelDownloadTrack downloadTrack.filePath:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1736
    new-instance v1, Ljava/io/File;

    iget-object v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1737
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v2

    if-eqz v2, :cond_0

    .line 1739
    iget-object v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1740
    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/photogrid/video/onlinemusic/Track;->file_md5:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1741
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "delete file track_id:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1742
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 266
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "prepare in, state:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 267
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->b:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-lt v1, v2, :cond_1

    .line 268
    const/4 v0, 0x1

    .line 291
    :cond_0
    :goto_0
    return v0

    .line 269
    :cond_1
    sget-object v1, Lcom/roidapp/photogrid/video/aa;->b:Lcom/roidapp/photogrid/video/aa;

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/aa;)V

    .line 270
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->h()Z

    move-result v1

    if-nez v1, :cond_2

    .line 272
    sget-object v0, Lcom/roidapp/photogrid/video/aa;->a:Lcom/roidapp/photogrid/video/aa;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/aa;)V

    .line 273
    const/4 v0, 0x2

    goto :goto_0

    .line 276
    :cond_2
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->g()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-boolean v1, p0, Lcom/roidapp/photogrid/video/q;->C:Z

    if-eqz v1, :cond_3

    .line 277
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-le v1, v2, :cond_0

    .line 278
    sget-object v1, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-direct {p0, v1}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/aa;)V

    .line 279
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->p:Lcom/roidapp/photogrid/video/ac;

    if-eqz v1, :cond_0

    .line 280
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->p:Lcom/roidapp/photogrid/video/ac;

    invoke-interface {v1}, Lcom/roidapp/photogrid/video/ac;->a()V

    goto :goto_0

    .line 285
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->j()Z

    move-result v1

    if-nez v1, :cond_0

    .line 286
    :cond_4
    iget-boolean v1, p0, Lcom/roidapp/photogrid/video/q;->C:Z

    if-nez v1, :cond_0

    .line 287
    sget-object v0, Lcom/roidapp/photogrid/video/aa;->a:Lcom/roidapp/photogrid/video/aa;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/aa;)V

    .line 288
    const/4 v0, 0x3

    goto :goto_0
.end method

.method public final a(II)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 1439
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-lt v0, v2, :cond_a

    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->f:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-eq v0, v2, :cond_a

    .line 1440
    const v0, 0x989682

    if-ne p2, v0, :cond_1

    .line 1441
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, p1, :cond_0

    .line 1442
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 1470
    :goto_0
    return-object v0

    :cond_0
    move-object v0, v1

    .line 1444
    goto :goto_0

    .line 1447
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, p1, :cond_3

    :cond_2
    move-object v0, v1

    .line 1448
    goto :goto_0

    .line 1449
    :cond_3
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "index:"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ",genre:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, "mAvailableTracks:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1450
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/z;

    iget v2, v0, Lcom/roidapp/photogrid/video/z;->c:I

    .line 1451
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/z;

    iget v3, v0, Lcom/roidapp/photogrid/video/z;->b:I

    .line 1452
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v4, "trackPageId:"

    invoke-direct {v0, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v4, ",trackIndex:"

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1453
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-gt v0, v2, :cond_4

    .line 1454
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v0, "trackPage size:"

    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v0, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-object v0, v1

    .line 1455
    goto/16 :goto_0

    .line 1458
    :cond_4
    const v0, 0x989680

    if-ne p2, v0, :cond_5

    .line 1459
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/z;

    iget v0, v0, Lcom/roidapp/photogrid/video/z;->b:I

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/video/z;

    iget v1, v1, Lcom/roidapp/photogrid/video/z;->c:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    goto/16 :goto_0

    .line 1461
    :cond_5
    invoke-direct {p0, p2}, Lcom/roidapp/photogrid/video/q;->l(I)Ljava/util/ArrayList;

    move-result-object v2

    .line 1462
    if-eqz v2, :cond_6

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lt p1, v0, :cond_7

    :cond_6
    move-object v0, v1

    .line 1463
    goto/16 :goto_0

    .line 1464
    :cond_7
    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/z;

    iget v0, v0, Lcom/roidapp/photogrid/video/z;->b:I

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_8

    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/z;

    iget v0, v0, Lcom/roidapp/photogrid/video/z;->b:I

    invoke-virtual {v3, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/z;

    iget v0, v0, Lcom/roidapp/photogrid/video/z;->c:I

    if-gt v3, v0, :cond_9

    :cond_8
    move-object v0, v1

    .line 1465
    goto/16 :goto_0

    .line 1466
    :cond_9
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/z;

    iget v0, v0, Lcom/roidapp/photogrid/video/z;->b:I

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/video/z;

    iget v1, v1, Lcom/roidapp/photogrid/video/z;->c:I

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    goto/16 :goto_0

    :cond_a
    move-object v0, v1

    .line 1470
    goto/16 :goto_0
.end method

.method public final a(Lcom/roidapp/photogrid/video/ab;)V
    .locals 0

    .prologue
    .line 256
    iput-object p1, p0, Lcom/roidapp/photogrid/video/q;->r:Lcom/roidapp/photogrid/video/ab;

    .line 257
    return-void
.end method

.method public final a(Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)V
    .locals 4

    .prologue
    .line 808
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    monitor-enter v1

    .line 809
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    .line 810
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 811
    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    iget-object v3, p1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget v3, v3, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    if-ne v0, v3, :cond_0

    .line 812
    monitor-exit v1

    .line 817
    :goto_0
    return-void

    .line 815
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 816
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->e:Ljava/lang/String;

    new-instance v2, Lcom/google/a/k;

    invoke-direct {v2}, Lcom/google/a/k;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v2, v3}, Lcom/google/a/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 817
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final a(I)Z
    .locals 4

    .prologue
    const v3, 0x989680

    const/4 v0, 0x0

    .line 417
    iput p1, p0, Lcom/roidapp/photogrid/video/q;->z:I

    .line 419
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->e:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-gt v1, v2, :cond_0

    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 445
    :cond_0
    :goto_0
    return v0

    .line 422
    :cond_1
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->e:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-ne v1, v2, :cond_2

    if-eq p1, v3, :cond_0

    .line 424
    :cond_2
    const v1, 0x989682

    if-eq p1, v1, :cond_0

    .line 426
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "updateMoreTracks mCloudLoaded : "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/roidapp/photogrid/video/q;->D:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ",NetworkUtils.isNetworkAvailable:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->c:Landroid/content/Context;

    invoke-static {v2}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 427
    iget-boolean v1, p0, Lcom/roidapp/photogrid/video/q;->D:Z

    if-eqz v1, :cond_3

    .line 429
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/q;->j(I)Z

    move-result v0

    goto :goto_0

    .line 431
    :cond_3
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 432
    iget v1, p0, Lcom/roidapp/photogrid/video/q;->a:I

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-gt v1, v2, :cond_4

    if-eq p1, v3, :cond_5

    :cond_4
    if-nez p1, :cond_6

    .line 434
    :cond_5
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->p:Lcom/roidapp/photogrid/video/ac;

    if-eqz v1, :cond_0

    .line 435
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->p:Lcom/roidapp/photogrid/video/ac;

    const/16 v2, 0x1000

    const/16 v3, 0x2001

    invoke-interface {v1, v2, v3}, Lcom/roidapp/photogrid/video/ac;->a(II)V

    goto :goto_0

    .line 438
    :cond_6
    invoke-direct {p0, v3}, Lcom/roidapp/photogrid/video/q;->j(I)Z

    move-result v0

    goto :goto_0

    .line 441
    :cond_7
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->j()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 442
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/q;->i(I)V

    .line 443
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final b(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1305
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-ge v1, v2, :cond_1

    .line 1309
    :cond_0
    :goto_0
    return-object v0

    .line 1307
    :cond_1
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 1308
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    goto :goto_0
.end method

.method public final b()V
    .locals 7

    .prologue
    const/4 v3, 0x0

    .line 305
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->f()V

    .line 306
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->x:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-eqz v0, :cond_1

    .line 307
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->x:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/o;

    .line 308
    if-eqz v0, :cond_0

    .line 309
    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lcom/roidapp/photogrid/video/o;->cancel(Z)Z

    goto :goto_0

    .line 312
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->x:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 313
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-eqz v0, :cond_4

    .line 314
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->keySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .line 315
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 317
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 318
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/a;

    .line 319
    if-eqz v0, :cond_2

    .line 320
    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Lcom/roidapp/photogrid/video/a;->a(Lcom/roidapp/baselib/e/b;)V

    .line 321
    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/a;->a()V

    .line 323
    :cond_2
    invoke-direct {p0, v2}, Lcom/roidapp/photogrid/video/q;->n(I)V

    goto :goto_1

    .line 325
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 327
    :cond_4
    sget-object v0, Lcom/roidapp/photogrid/video/aa;->a:Lcom/roidapp/photogrid/video/aa;

    invoke-direct {p0, v0}, Lcom/roidapp/photogrid/video/q;->a(Lcom/roidapp/photogrid/video/aa;)V

    .line 328
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    if-eqz v0, :cond_5

    .line 329
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->f:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 330
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_5

    .line 331
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 333
    :cond_5
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    if-eqz v0, :cond_6

    .line 334
    new-instance v0, Ljava/io/File;

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 335
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_6

    .line 336
    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    .line 339
    :cond_6
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    if-eqz v0, :cond_8

    move v2, v3

    .line 340
    :goto_2
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->size()I

    move-result v0

    if-ge v2, v0, :cond_8

    .line 341
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v0, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v4

    .line 342
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/m;

    iget v0, v0, Lcom/roidapp/photogrid/video/m;->e:I

    const v1, 0x989680

    if-ne v0, v1, :cond_7

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v0, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_7

    .line 344
    :try_start_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->url:Ljava/lang/String;

    invoke-static {v0}, Lcom/roidapp/photogrid/video/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    iget-object v5, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v5, v4}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v1, v5}, Lcom/google/a/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 345
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->url:Ljava/lang/String;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 2202
    invoke-static {v1}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 345
    iput-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->localkey:Ljava/lang/String;

    .line 346
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v5, p0, Lcom/roidapp/photogrid/video/q;->g:Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v5

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->url:Ljava/lang/String;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->filePath:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 340
    :cond_7
    :goto_3
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto/16 :goto_2

    .line 355
    :cond_8
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    if-eqz v0, :cond_c

    .line 356
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 357
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    if-eqz v0, :cond_e

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-le v0, v1, :cond_e

    move v2, v3

    .line 358
    :goto_4
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v2, v0, :cond_b

    .line 359
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->i:Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/CloundServer;->files:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    move v4, v3

    .line 360
    :goto_5
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-ge v4, v1, :cond_9

    .line 361
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrackPageItem;->trackPageItem:Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->md5:Ljava/lang/String;

    iget-object v6, v0, Lcom/roidapp/photogrid/video/onlinemusic/TrackPageItem;->md5:Ljava/lang/String;

    invoke-virtual {v1, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a

    .line 362
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 358
    :cond_9
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_4

    .line 360
    :cond_a
    add-int/lit8 v1, v4, 0x1

    move v4, v1

    goto :goto_5

    .line 367
    :cond_b
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    new-instance v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-direct {v2, v3, v5}, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v2}, Lcom/google/a/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 373
    :cond_c
    :goto_6
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->e:Ljava/lang/String;

    if-eqz v0, :cond_d

    .line 374
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->e:Ljava/lang/String;

    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v1, v2}, Lcom/google/a/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;Ljava/lang/String;)Z

    .line 378
    :cond_d
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 379
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 380
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 381
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->l:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 382
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->m:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 383
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 384
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 385
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->t:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 386
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->w:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 388
    return-void

    .line 369
    :cond_e
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_c

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-eqz v0, :cond_c

    .line 370
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->d:Ljava/lang/String;

    new-instance v1, Lcom/google/a/k;

    invoke-direct {v1}, Lcom/google/a/k;-><init>()V

    new-instance v2, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;

    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->u:Ljava/util/ArrayList;

    invoke-direct {v2, v3, v4}, Lcom/roidapp/photogrid/video/onlinemusic/LocalServer;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    invoke-virtual {v1, v2}, Lcom/google/a/k;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;Ljava/lang/String;)Z

    goto :goto_6

    :catch_0
    move-exception v0

    goto/16 :goto_3
.end method

.method public final c(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;
    .locals 4

    .prologue
    const/4 v2, 0x0

    .line 1400
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-lt v0, v1, :cond_7

    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->f:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-eq v0, v1, :cond_7

    .line 1401
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    move-object v0, v2

    .line 1419
    :goto_0
    return-object v0

    .line 1404
    :cond_1
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 1405
    iget-object v3, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget v3, v3, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_id:I

    if-ne v3, p1, :cond_2

    goto :goto_0

    .line 1408
    :cond_3
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/z;

    .line 1409
    if-eqz v0, :cond_4

    iget v3, v0, Lcom/roidapp/photogrid/video/z;->a:I

    if-ne v3, p1, :cond_4

    .line 1410
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    iget v3, v0, Lcom/roidapp/photogrid/video/z;->b:I

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    iget v3, v0, Lcom/roidapp/photogrid/video/z;->b:I

    invoke-virtual {v1, v3}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget v3, v0, Lcom/roidapp/photogrid/video/z;->c:I

    if-le v1, v3, :cond_5

    .line 1411
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->v:Landroid/util/SparseArray;

    iget v2, v0, Lcom/roidapp/photogrid/video/z;->b:I

    invoke-virtual {v1, v2}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/ArrayList;

    iget v0, v0, Lcom/roidapp/photogrid/video/z;->c:I

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    goto :goto_0

    :cond_5
    move-object v0, v2

    .line 1413
    goto :goto_0

    :cond_6
    move-object v0, v2

    .line 1416
    goto :goto_0

    :cond_7
    move-object v0, v2

    .line 1419
    goto :goto_0
.end method

.method public final c()V
    .locals 3

    .prologue
    .line 820
    .line 2797
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    monitor-enter v1

    .line 2798
    :try_start_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ltz v0, :cond_0

    .line 2799
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 2800
    new-instance v0, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->e:Ljava/lang/String;

    invoke-direct {v0, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 2801
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    .line 2802
    invoke-virtual {v0}, Ljava/io/File;->delete()Z

    .line 2804
    :cond_0
    monitor-exit v1

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final d()I
    .locals 2

    .prologue
    .line 1299
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v0

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v0

    sget-object v1, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 1300
    const/4 v0, 0x0

    .line 1301
    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final d(I)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1474
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-lt v1, v2, :cond_0

    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->f:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-eq v1, v2, :cond_0

    .line 1476
    const v1, 0x989680

    if-ne p1, v1, :cond_1

    .line 1477
    iget v0, p0, Lcom/roidapp/photogrid/video/q;->a:I

    .line 1488
    :cond_0
    :goto_0
    return v0

    .line 1478
    :cond_1
    const v1, 0x989682

    if-ne p1, v1, :cond_2

    .line 1479
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    .line 1481
    :cond_2
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/q;->k(I)Lcom/roidapp/photogrid/video/onlinemusic/Genre;

    move-result-object v1

    .line 1482
    if-eqz v1, :cond_0

    .line 1483
    iget v0, v1, Lcom/roidapp/photogrid/video/onlinemusic/Genre;->count:I

    goto :goto_0
.end method

.method public final e(I)I
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 1492
    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->c:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-lt v1, v2, :cond_0

    invoke-direct {p0}, Lcom/roidapp/photogrid/video/q;->i()Lcom/roidapp/photogrid/video/aa;

    move-result-object v1

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v1

    sget-object v2, Lcom/roidapp/photogrid/video/aa;->f:Lcom/roidapp/photogrid/video/aa;

    invoke-virtual {v2}, Lcom/roidapp/photogrid/video/aa;->ordinal()I

    move-result v2

    if-eq v1, v2, :cond_0

    .line 1493
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    if-nez v1, :cond_1

    .line 1507
    :cond_0
    :goto_0
    return v0

    .line 1495
    :cond_1
    const v1, 0x989680

    if-ne p1, v1, :cond_2

    .line 1496
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    .line 1497
    :cond_2
    const v1, 0x989682

    if-ne p1, v1, :cond_3

    .line 1498
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->y:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0

    .line 1500
    :cond_3
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/q;->l(I)Ljava/util/ArrayList;

    move-result-object v1

    .line 1501
    if-eqz v1, :cond_0

    .line 1503
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final f(I)Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 1576
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/video/q;->c(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v1

    .line 1577
    if-nez v1, :cond_1

    .line 1589
    :cond_0
    :goto_0
    return v0

    .line 1580
    :cond_1
    iget-object v2, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    if-eqz v2, :cond_2

    iget-object v2, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    .line 1581
    :cond_2
    iget-object v2, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/q;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1582
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v4, p0, Lcom/roidapp/photogrid/video/q;->h:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "_"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    iget-object v3, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v3, v3, Lcom/roidapp/photogrid/video/onlinemusic/Track;->mp3_url:Ljava/lang/String;

    invoke-static {v3}, Lcom/roidapp/photogrid/video/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    .line 1584
    :cond_3
    new-instance v2, Ljava/io/File;

    iget-object v3, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-direct {v2, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1585
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, v1, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/photogrid/video/onlinemusic/Track;->file_md5:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1586
    invoke-direct {p0, p1, v1}, Lcom/roidapp/photogrid/video/q;->a(ILcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 1587
    const/4 v0, 0x1

    goto :goto_0
.end method

.method public final g(I)V
    .locals 7

    .prologue
    const/4 v6, 0x0

    .line 1594
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 1721
    :cond_0
    :goto_0
    return-void

    .line 1597
    :cond_1
    invoke-virtual {p0, p1}, Lcom/roidapp/photogrid/video/q;->c(I)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    move-result-object v0

    .line 1598
    if-nez v0, :cond_2

    .line 1599
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->r:Lcom/roidapp/photogrid/video/ab;

    if-eqz v0, :cond_0

    .line 1600
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->r:Lcom/roidapp/photogrid/video/ab;

    const/4 v1, 0x1

    invoke-interface {v0, p1, v1, v6}, Lcom/roidapp/photogrid/video/ab;->a(IILjava/lang/Exception;)V

    goto :goto_0

    .line 1605
    :cond_2
    iget-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 1606
    :cond_3
    iget-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->track_title:Ljava/lang/String;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/q;->g(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1607
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lcom/roidapp/photogrid/video/q;->h:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "_"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    iget-object v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->mp3_url:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/q;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    .line 1609
    :cond_4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "DownloadTrack updateTrack.getTrack().file_md5:"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v2

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->file_md5:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1610
    new-instance v1, Ljava/io/File;

    iget-object v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 1611
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_5

    iget-object v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-static {v2}, Lcom/roidapp/photogrid/video/bi;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->getTrack()Lcom/roidapp/photogrid/video/onlinemusic/Track;

    move-result-object v3

    iget-object v3, v3, Lcom/roidapp/photogrid/video/onlinemusic/Track;->file_md5:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 1612
    invoke-direct {p0, p1, v0}, Lcom/roidapp/photogrid/video/q;->a(ILcom/roidapp/photogrid/video/onlinemusic/LocalTrack;)Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;

    .line 1613
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->r:Lcom/roidapp/photogrid/video/ab;

    if-eqz v1, :cond_0

    .line 1614
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->r:Lcom/roidapp/photogrid/video/ab;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-interface {v1, p1, v0}, Lcom/roidapp/photogrid/video/ab;->a(ILjava/lang/String;)V

    goto/16 :goto_0

    .line 1616
    :cond_5
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "DownloadTrack DownloadTask:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1617
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    move-result v2

    if-eqz v2, :cond_6

    .line 1618
    invoke-virtual {v1}, Ljava/io/File;->delete()Z

    .line 1620
    :cond_6
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->c:Landroid/content/Context;

    invoke-static {v1}, Lcom/roidapp/baselib/e/l;->b(Landroid/content/Context;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 1621
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->r:Lcom/roidapp/photogrid/video/ab;

    if-eqz v0, :cond_0

    .line 1622
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->r:Lcom/roidapp/photogrid/video/ab;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1, v6}, Lcom/roidapp/photogrid/video/ab;->a(IILjava/lang/Exception;)V

    goto/16 :goto_0

    .line 1626
    :cond_7
    new-instance v1, Ljava/io/File;

    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->h:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    invoke-static {v1}, Lcom/roidapp/baselib/d/a;->b(Ljava/io/File;)J

    move-result-wide v2

    iget-object v1, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v1, v1, Lcom/roidapp/photogrid/video/onlinemusic/Track;->file_size:Ljava/lang/String;

    invoke-static {v1}, Lcom/roidapp/photogrid/video/q;->f(Ljava/lang/String;)J

    move-result-wide v4

    cmp-long v1, v2, v4

    if-gtz v1, :cond_8

    .line 1627
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->r:Lcom/roidapp/photogrid/video/ab;

    if-eqz v0, :cond_0

    .line 1628
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->r:Lcom/roidapp/photogrid/video/ab;

    const/4 v1, 0x2

    invoke-interface {v0, p1, v1, v6}, Lcom/roidapp/photogrid/video/ab;->a(IILjava/lang/Exception;)V

    goto/16 :goto_0

    .line 1634
    :cond_8
    new-instance v1, Lcom/roidapp/photogrid/video/a;

    invoke-direct {v1}, Lcom/roidapp/photogrid/video/a;-><init>()V

    .line 1636
    new-instance v2, Lcom/roidapp/photogrid/video/y;

    invoke-direct {v2, p0, p1}, Lcom/roidapp/photogrid/video/y;-><init>(Lcom/roidapp/photogrid/video/q;I)V

    invoke-virtual {v1, v2}, Lcom/roidapp/photogrid/video/a;->a(Lcom/roidapp/baselib/e/b;)V

    .line 1717
    iget-object v2, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1718
    iget-object v2, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->track:Lcom/roidapp/photogrid/video/onlinemusic/Track;

    iget-object v2, v2, Lcom/roidapp/photogrid/video/onlinemusic/Track;->mp3_url:Ljava/lang/String;

    iget-object v0, v0, Lcom/roidapp/photogrid/video/onlinemusic/LocalTrack;->filePath:Ljava/lang/String;

    invoke-virtual {v1, v2, v0}, Lcom/roidapp/photogrid/video/a;->a(Ljava/lang/String;Ljava/lang/String;)V

    goto/16 :goto_0
.end method

.method public final h(I)V
    .locals 3

    .prologue
    .line 1748
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    move-result v0

    if-gtz v0, :cond_0

    .line 1758
    :goto_0
    return-void

    .line 1750
    :cond_0
    iget-object v0, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/roidapp/photogrid/video/a;

    .line 1751
    if-eqz v0, :cond_1

    .line 1752
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/roidapp/photogrid/video/a;->a(Lcom/roidapp/baselib/e/b;)V

    .line 1753
    iget-object v1, p0, Lcom/roidapp/photogrid/video/q;->F:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1754
    invoke-virtual {v0}, Lcom/roidapp/photogrid/video/a;->a()V

    .line 1756
    :cond_1
    invoke-direct {p0, p1}, Lcom/roidapp/photogrid/video/q;->n(I)V

    goto :goto_0
.end method
