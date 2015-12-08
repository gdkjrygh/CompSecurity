.class public Lcom/coremedia/iso/boxes/MovieBox;
.super Lcom/googlecode/mp4parser/AbstractContainerBox;
.source "SourceFile"


# static fields
.field public static final TYPE:Ljava/lang/String; = "moov"


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 33
    const-string v0, "moov"

    invoke-direct {p0, v0}, Lcom/googlecode/mp4parser/AbstractContainerBox;-><init>(Ljava/lang/String;)V

    .line 34
    return-void
.end method


# virtual methods
.method public getMovieHeaderBox()Lcom/coremedia/iso/boxes/MovieHeaderBox;
    .locals 3

    .prologue
    .line 57
    invoke-virtual {p0}, Lcom/coremedia/iso/boxes/MovieBox;->getBoxes()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    .line 62
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 57
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/Box;

    .line 58
    instance-of v2, v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;

    if-eqz v2, :cond_0

    .line 59
    check-cast v0, Lcom/coremedia/iso/boxes/MovieHeaderBox;

    goto :goto_0
.end method

.method public getTrackCount()I
    .locals 1

    .prologue
    .line 37
    const-class v0, Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {p0, v0}, Lcom/coremedia/iso/boxes/MovieBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public getTrackNumbers()[J
    .locals 6

    .prologue
    .line 48
    const-class v0, Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {p0, v0}, Lcom/coremedia/iso/boxes/MovieBox;->getBoxes(Ljava/lang/Class;)Ljava/util/List;

    move-result-object v2

    .line 49
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    new-array v3, v0, [J

    .line 50
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v0

    if-lt v1, v0, :cond_0

    .line 53
    return-object v3

    .line 51
    :cond_0
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/coremedia/iso/boxes/TrackBox;

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/TrackBox;->getTrackHeaderBox()Lcom/coremedia/iso/boxes/TrackHeaderBox;

    move-result-object v0

    invoke-virtual {v0}, Lcom/coremedia/iso/boxes/TrackHeaderBox;->getTrackId()J

    move-result-wide v4

    aput-wide v4, v3, v1

    .line 50
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0
.end method
