.class public Lcom/googlecode/mp4parser/authoring/builder/TwoSecondIntersectionFinder;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/googlecode/mp4parser/authoring/builder/FragmentIntersectionFinder;


# instance fields
.field private fragmentLength:I

.field private movie:Lcom/googlecode/mp4parser/authoring/Movie;


# direct methods
.method public constructor <init>(Lcom/googlecode/mp4parser/authoring/Movie;I)V
    .locals 1

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x2

    iput v0, p0, Lcom/googlecode/mp4parser/authoring/builder/TwoSecondIntersectionFinder;->fragmentLength:I

    .line 33
    iput-object p1, p0, Lcom/googlecode/mp4parser/authoring/builder/TwoSecondIntersectionFinder;->movie:Lcom/googlecode/mp4parser/authoring/Movie;

    .line 34
    iput p2, p0, Lcom/googlecode/mp4parser/authoring/builder/TwoSecondIntersectionFinder;->fragmentLength:I

    .line 35
    return-void
.end method


# virtual methods
.method public sampleNumbers(Lcom/googlecode/mp4parser/authoring/Track;)[J
    .locals 14

    .prologue
    .line 42
    const-wide/16 v0, 0x0

    .line 43
    iget-object v2, p0, Lcom/googlecode/mp4parser/authoring/builder/TwoSecondIntersectionFinder;->movie:Lcom/googlecode/mp4parser/authoring/Movie;

    invoke-virtual {v2}, Lcom/googlecode/mp4parser/authoring/Movie;->getTracks()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move-wide v2, v0

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 50
    iget v0, p0, Lcom/googlecode/mp4parser/authoring/builder/TwoSecondIntersectionFinder;->fragmentLength:I

    int-to-double v0, v0

    div-double v0, v2, v0

    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    move-result-wide v0

    double-to-int v0, v0

    add-int/lit8 v0, v0, -0x1

    .line 51
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/Track;->getSamples()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 52
    if-gtz v0, :cond_1

    .line 53
    const/4 v0, 0x1

    .line 56
    :cond_1
    new-array v5, v0, [J

    .line 57
    const-wide/16 v0, -0x1

    invoke-static {v5, v0, v1}, Ljava/util/Arrays;->fill([JJ)V

    .line 58
    const/4 v0, 0x0

    const-wide/16 v2, 0x1

    aput-wide v2, v5, v0

    .line 60
    const-wide/16 v0, 0x0

    .line 61
    const/4 v3, 0x0

    .line 62
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/Track;->getSampleDurations()[J

    move-result-object v6

    array-length v7, v6

    const/4 v2, 0x0

    :goto_1
    if-lt v2, v7, :cond_4

    .line 70
    :cond_2
    add-int/lit8 v0, v3, 0x1

    int-to-long v0, v0

    .line 72
    array-length v2, v5

    add-int/lit8 v2, v2, -0x1

    :goto_2
    if-gez v2, :cond_5

    .line 78
    return-object v5

    .line 43
    :cond_3
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/googlecode/mp4parser/authoring/Track;

    .line 44
    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getDuration()J

    move-result-wide v6

    invoke-interface {v0}, Lcom/googlecode/mp4parser/authoring/Track;->getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    move-result-object v0

    invoke-virtual {v0}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->getTimescale()J

    move-result-wide v0

    div-long v0, v6, v0

    long-to-double v0, v0

    .line 45
    cmpg-double v5, v2, v0

    if-gez v5, :cond_0

    move-wide v2, v0

    .line 46
    goto :goto_0

    .line 62
    :cond_4
    aget-wide v8, v6, v2

    .line 63
    invoke-interface {p1}, Lcom/googlecode/mp4parser/authoring/Track;->getTrackMetaData()Lcom/googlecode/mp4parser/authoring/TrackMetaData;

    move-result-object v4

    invoke-virtual {v4}, Lcom/googlecode/mp4parser/authoring/TrackMetaData;->getTimescale()J

    move-result-wide v10

    div-long v10, v0, v10

    iget v4, p0, Lcom/googlecode/mp4parser/authoring/builder/TwoSecondIntersectionFinder;->fragmentLength:I

    int-to-long v12, v4

    div-long/2addr v10, v12

    long-to-int v4, v10

    add-int/lit8 v10, v4, 0x1

    .line 64
    array-length v4, v5

    if-ge v10, v4, :cond_2

    .line 65
    add-int/lit8 v4, v3, 0x1

    add-int/lit8 v3, v3, 0x1

    int-to-long v12, v3

    aput-wide v12, v5, v10

    .line 68
    add-long/2addr v0, v8

    .line 62
    add-int/lit8 v2, v2, 0x1

    move v3, v4

    goto :goto_1

    .line 73
    :cond_5
    aget-wide v6, v5, v2

    const-wide/16 v8, -0x1

    cmp-long v3, v6, v8

    if-nez v3, :cond_6

    .line 74
    aput-wide v0, v5, v2

    .line 76
    :cond_6
    aget-wide v0, v5, v2

    .line 72
    add-int/lit8 v2, v2, -0x1

    goto :goto_2
.end method
