.class public Lcom/googlecode/flickrjandroid/photos/SearchParameters;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DATE_FORMATS:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/text/DateFormat;",
            ">;"
        }
    .end annotation
.end field

.field public static DATE_POSTED_ASC:I = 0x0

.field public static DATE_POSTED_DESC:I = 0x0

.field public static DATE_TAKEN_ASC:I = 0x0

.field public static DATE_TAKEN_DESC:I = 0x0

.field public static INTERESTINGNESS_ASC:I = 0x0

.field public static INTERESTINGNESS_DESC:I = 0x0

.field public static final MYSQL_DATE_FORMATS:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal",
            "<",
            "Ljava/text/DateFormat;",
            ">;"
        }
    .end annotation
.end field

.field public static RELEVANCE:I = 0x0

.field public static final serialVersionUID:J = 0xcL


# instance fields
.field private accuracy:I

.field private bbox:[Ljava/lang/String;

.field private contacts:Ljava/lang/String;

.field private extras:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private groupId:Ljava/lang/String;

.field private hasGeo:Z

.field private inCommons:Z

.field private interestingnessDate:Ljava/util/Date;

.field private latitude:Ljava/lang/String;

.field private license:Ljava/lang/String;

.field private longitude:Ljava/lang/String;

.field private machineTagMode:Ljava/lang/String;

.field private machineTags:[Ljava/lang/String;

.field private maxTakenDate:Ljava/util/Date;

.field private maxUploadDate:Ljava/util/Date;

.field private media:Ljava/lang/String;

.field private minTakenDate:Ljava/util/Date;

.field private minUploadDate:Ljava/util/Date;

.field private placeId:Ljava/lang/String;

.field private radius:I

.field private radiusUnits:Ljava/lang/String;

.field private safeSearch:Ljava/lang/String;

.field private sort:I

.field private tagMode:Ljava/lang/String;

.field private tags:[Ljava/lang/String;

.field private text:Ljava/lang/String;

.field private userId:Ljava/lang/String;

.field private woeId:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 53
    new-instance v0, Lcom/googlecode/flickrjandroid/photos/c;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/photos/c;-><init>()V

    sput-object v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->DATE_FORMATS:Ljava/lang/ThreadLocal;

    .line 59
    new-instance v0, Lcom/googlecode/flickrjandroid/photos/d;

    invoke-direct {v0}, Lcom/googlecode/flickrjandroid/photos/d;-><init>()V

    sput-object v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->MYSQL_DATE_FORMATS:Ljava/lang/ThreadLocal;

    .line 66
    const/4 v0, 0x0

    sput v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->DATE_POSTED_DESC:I

    .line 68
    const/4 v0, 0x1

    sput v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->DATE_POSTED_ASC:I

    .line 70
    const/4 v0, 0x2

    sput v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->DATE_TAKEN_DESC:I

    .line 72
    const/4 v0, 0x3

    sput v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->DATE_TAKEN_ASC:I

    .line 74
    const/4 v0, 0x4

    sput v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->INTERESTINGNESS_DESC:I

    .line 76
    const/4 v0, 0x5

    sput v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->INTERESTINGNESS_ASC:I

    .line 78
    const/4 v0, 0x6

    sput v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->RELEVANCE:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 81
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    iput v1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->accuracy:I

    .line 48
    const/4 v0, -0x1

    iput v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->radius:I

    .line 50
    iput-boolean v1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->hasGeo:Z

    .line 51
    iput-boolean v1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->inCommons:Z

    .line 79
    iput v1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->sort:I

    .line 83
    return-void
.end method


# virtual methods
.method public getAccuracy()I
    .locals 1

    .prologue
    .line 101
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->accuracy:I

    return v0
.end method

.method public getAsParameters()Ljava/util/Collection;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Collection",
            "<",
            "Lcom/googlecode/flickrjandroid/Parameter;",
            ">;"
        }
    .end annotation

    .prologue
    const-wide/16 v8, 0x3e8

    .line 440
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 442
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->inCommons:Z

    if-eqz v0, :cond_0

    .line 443
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "is_commons"

    const-string v3, "true"

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 446
    :cond_0
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getLatitude()Ljava/lang/String;

    move-result-object v0

    .line 447
    if-eqz v0, :cond_1

    .line 448
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "lat"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 451
    :cond_1
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getLongitude()Ljava/lang/String;

    move-result-object v0

    .line 452
    if-eqz v0, :cond_2

    .line 453
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "lon"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 456
    :cond_2
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getRadius()I

    move-result v0

    .line 457
    if-lez v0, :cond_3

    .line 458
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "radius"

    int-to-long v4, v0

    invoke-direct {v2, v3, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;J)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 461
    :cond_3
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getRadiusUnits()Ljava/lang/String;

    move-result-object v0

    .line 462
    if-eqz v0, :cond_4

    .line 463
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "radius_units"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 466
    :cond_4
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getMedia()Ljava/lang/String;

    move-result-object v0

    .line 467
    if-eqz v0, :cond_5

    .line 468
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "media"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 471
    :cond_5
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getUserId()Ljava/lang/String;

    move-result-object v0

    .line 472
    if-eqz v0, :cond_6

    .line 473
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "user_id"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 474
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getContacts()Ljava/lang/String;

    move-result-object v0

    .line 475
    if-eqz v0, :cond_6

    .line 476
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "contacts"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 480
    :cond_6
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getGroupId()Ljava/lang/String;

    move-result-object v0

    .line 481
    if-eqz v0, :cond_7

    .line 482
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "group_id"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 485
    :cond_7
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getTags()[Ljava/lang/String;

    move-result-object v0

    .line 486
    if-eqz v0, :cond_8

    .line 487
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "tags"

    const-string v4, ","

    invoke-static {v0, v4}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 490
    :cond_8
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getTagMode()Ljava/lang/String;

    move-result-object v0

    .line 491
    if-eqz v0, :cond_9

    .line 492
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "tag_mode"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 495
    :cond_9
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getMachineTags()[Ljava/lang/String;

    move-result-object v0

    .line 496
    if-eqz v0, :cond_a

    .line 497
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "machine_tags"

    const-string v4, ","

    invoke-static {v0, v4}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 500
    :cond_a
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getMachineTagMode()Ljava/lang/String;

    move-result-object v0

    .line 501
    if-eqz v0, :cond_b

    .line 502
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "machine_tag_mode"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 505
    :cond_b
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getText()Ljava/lang/String;

    move-result-object v0

    .line 506
    if-eqz v0, :cond_c

    .line 507
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "text"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 510
    :cond_c
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getMinUploadDate()Ljava/util/Date;

    move-result-object v0

    .line 511
    if-eqz v0, :cond_d

    .line 512
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "min_upload_date"

    new-instance v4, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    div-long/2addr v6, v8

    invoke-direct {v4, v6, v7}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 515
    :cond_d
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getMaxUploadDate()Ljava/util/Date;

    move-result-object v0

    .line 516
    if-eqz v0, :cond_e

    .line 517
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "max_upload_date"

    new-instance v4, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v6

    div-long/2addr v6, v8

    invoke-direct {v4, v6, v7}, Ljava/lang/Long;-><init>(J)V

    invoke-direct {v2, v3, v4}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 520
    :cond_e
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getMinTakenDate()Ljava/util/Date;

    move-result-object v2

    .line 521
    if-eqz v2, :cond_f

    .line 522
    new-instance v3, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "min_taken_date"

    sget-object v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->MYSQL_DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 525
    :cond_f
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getMaxTakenDate()Ljava/util/Date;

    move-result-object v2

    .line 526
    if-eqz v2, :cond_10

    .line 527
    new-instance v3, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "max_taken_date"

    sget-object v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->MYSQL_DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 530
    :cond_10
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getLicense()Ljava/lang/String;

    move-result-object v0

    .line 531
    if-eqz v0, :cond_11

    .line 532
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "license"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 535
    :cond_11
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getInterestingnessDate()Ljava/util/Date;

    move-result-object v2

    .line 536
    if-eqz v2, :cond_12

    .line 537
    new-instance v3, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v4, "date"

    sget-object v0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->DATE_FORMATS:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/text/DateFormat;

    invoke-virtual {v0, v2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v4, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 540
    :cond_12
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getBBox()[Ljava/lang/String;

    move-result-object v0

    .line 541
    if-eqz v0, :cond_1e

    .line 542
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "bbox"

    const-string v4, ","

    invoke-static {v0, v4}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join([Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 543
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->accuracy:I

    if-lez v0, :cond_13

    .line 544
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "accuracy"

    iget v3, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->accuracy:I

    int-to-long v4, v3

    invoke-direct {v0, v2, v4, v5}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;J)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 553
    :cond_13
    :goto_0
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getSafeSearch()Ljava/lang/String;

    move-result-object v0

    .line 554
    if-eqz v0, :cond_14

    .line 555
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "safe_search"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 558
    :cond_14
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getHasGeo()Z

    move-result v0

    .line 559
    if-eqz v0, :cond_15

    .line 560
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "has_geo"

    const-string v3, "true"

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 563
    :cond_15
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->extras:Ljava/util/Set;

    if-eqz v0, :cond_16

    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->extras:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_16

    .line 564
    new-instance v0, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v2, "extras"

    iget-object v3, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->extras:Ljava/util/Set;

    const-string v4, ","

    invoke-static {v3, v4}, Lcom/googlecode/flickrjandroid/util/StringUtilities;->join(Ljava/util/Collection;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v2, v3}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 567
    :cond_16
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->sort:I

    sget v2, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->DATE_POSTED_DESC:I

    if-eq v0, v2, :cond_1d

    .line 568
    const/4 v0, 0x0

    .line 569
    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->sort:I

    sget v3, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->DATE_POSTED_ASC:I

    if-ne v2, v3, :cond_17

    const-string v0, "date-posted-asc"

    .line 570
    :cond_17
    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->sort:I

    sget v3, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->DATE_TAKEN_DESC:I

    if-ne v2, v3, :cond_18

    const-string v0, "date-taken-desc"

    .line 571
    :cond_18
    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->sort:I

    sget v3, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->DATE_TAKEN_ASC:I

    if-ne v2, v3, :cond_19

    const-string v0, "date-taken-asc"

    .line 572
    :cond_19
    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->sort:I

    sget v3, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->INTERESTINGNESS_DESC:I

    if-ne v2, v3, :cond_1a

    const-string v0, "interestingness-desc"

    .line 573
    :cond_1a
    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->sort:I

    sget v3, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->INTERESTINGNESS_ASC:I

    if-ne v2, v3, :cond_1b

    const-string v0, "interestingness-asc"

    .line 574
    :cond_1b
    iget v2, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->sort:I

    sget v3, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->RELEVANCE:I

    if-ne v2, v3, :cond_1c

    const-string v0, "relevance"

    .line 575
    :cond_1c
    if-eqz v0, :cond_1d

    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "sort"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 578
    :cond_1d
    return-object v1

    .line 547
    :cond_1e
    invoke-virtual {p0}, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->getWoeId()Ljava/lang/String;

    move-result-object v0

    .line 548
    if-eqz v0, :cond_13

    .line 549
    new-instance v2, Lcom/googlecode/flickrjandroid/Parameter;

    const-string v3, "woe_id"

    invoke-direct {v2, v3, v0}, Lcom/googlecode/flickrjandroid/Parameter;-><init>(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0
.end method

.method public getBBox()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 304
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->bbox:[Ljava/lang/String;

    return-object v0
.end method

.method public getContacts()Ljava/lang/String;
    .locals 1

    .prologue
    .line 422
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->contacts:Ljava/lang/String;

    return-object v0
.end method

.method public getGroupId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 105
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->groupId:Ljava/lang/String;

    return-object v0
.end method

.method public getHasGeo()Z
    .locals 1

    .prologue
    .line 138
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->hasGeo:Z

    return v0
.end method

.method public getInterestingnessDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 206
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->interestingnessDate:Ljava/util/Date;

    return-object v0
.end method

.method public getLatitude()Ljava/lang/String;
    .locals 1

    .prologue
    .line 598
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->latitude:Ljava/lang/String;

    return-object v0
.end method

.method public getLicense()Ljava/lang/String;
    .locals 1

    .prologue
    .line 198
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->license:Ljava/lang/String;

    return-object v0
.end method

.method public getLongitude()Ljava/lang/String;
    .locals 1

    .prologue
    .line 602
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->longitude:Ljava/lang/String;

    return-object v0
.end method

.method public getMachineTagMode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 240
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->machineTagMode:Ljava/lang/String;

    return-object v0
.end method

.method public getMachineTags()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 228
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->machineTags:[Ljava/lang/String;

    return-object v0
.end method

.method public getMaxTakenDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 190
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->maxTakenDate:Ljava/util/Date;

    return-object v0
.end method

.method public getMaxUploadDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 174
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->maxUploadDate:Ljava/util/Date;

    return-object v0
.end method

.method public getMedia()Ljava/lang/String;
    .locals 1

    .prologue
    .line 401
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->media:Ljava/lang/String;

    return-object v0
.end method

.method public getMinTakenDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 182
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->minTakenDate:Ljava/util/Date;

    return-object v0
.end method

.method public getMinUploadDate()Ljava/util/Date;
    .locals 1

    .prologue
    .line 166
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->minUploadDate:Ljava/util/Date;

    return-object v0
.end method

.method public getPlaceId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 350
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->placeId:Ljava/lang/String;

    return-object v0
.end method

.method public getRadius()I
    .locals 1

    .prologue
    .line 606
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->radius:I

    return v0
.end method

.method public getRadiusUnits()Ljava/lang/String;
    .locals 1

    .prologue
    .line 610
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->radiusUnits:Ljava/lang/String;

    return-object v0
.end method

.method public getSafeSearch()Ljava/lang/String;
    .locals 1

    .prologue
    .line 321
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->safeSearch:Ljava/lang/String;

    return-object v0
.end method

.method public getSort()I
    .locals 1

    .prologue
    .line 325
    iget v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->sort:I

    return v0
.end method

.method public getTagMode()Ljava/lang/String;
    .locals 1

    .prologue
    .line 150
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->tagMode:Ljava/lang/String;

    return-object v0
.end method

.method public getTags()[Ljava/lang/String;
    .locals 1

    .prologue
    .line 142
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->tags:[Ljava/lang/String;

    return-object v0
.end method

.method public getText()Ljava/lang/String;
    .locals 1

    .prologue
    .line 158
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->text:Ljava/lang/String;

    return-object v0
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 614
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->userId:Ljava/lang/String;

    return-object v0
.end method

.method public getWoeId()Ljava/lang/String;
    .locals 1

    .prologue
    .line 375
    iget-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->woeId:Ljava/lang/String;

    return-object v0
.end method

.method public isInCommons()Z
    .locals 1

    .prologue
    .line 622
    iget-boolean v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->inCommons:Z

    return v0
.end method

.method public setAccuracy(I)V
    .locals 0

    .prologue
    .line 97
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->accuracy:I

    .line 98
    return-void
.end method

.method public setBBox(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 295
    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 296
    aput-object p1, v0, v1

    const/4 v1, 0x1

    .line 297
    aput-object p2, v0, v1

    const/4 v1, 0x2

    .line 298
    aput-object p3, v0, v1

    const/4 v1, 0x3

    .line 299
    aput-object p4, v0, v1

    .line 295
    iput-object v0, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->bbox:[Ljava/lang/String;

    .line 301
    return-void
.end method

.method public setContacts(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 436
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->contacts:Ljava/lang/String;

    .line 437
    return-void
.end method

.method public setExtras(Ljava/util/Set;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set",
            "<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .prologue
    .line 256
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->extras:Ljava/util/Set;

    .line 257
    return-void
.end method

.method public setGroupId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 115
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->groupId:Ljava/lang/String;

    .line 116
    return-void
.end method

.method public setHasGeo(Z)V
    .locals 0

    .prologue
    .line 134
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->hasGeo:Z

    .line 135
    return-void
.end method

.method public setInCommons(Z)V
    .locals 0

    .prologue
    .line 626
    iput-boolean p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->inCommons:Z

    .line 627
    return-void
.end method

.method public setInterestingnessDate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 215
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->interestingnessDate:Ljava/util/Date;

    .line 216
    return-void
.end method

.method public setLatitude(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 582
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->latitude:Ljava/lang/String;

    .line 583
    return-void
.end method

.method public setLicense(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 202
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->license:Ljava/lang/String;

    .line 203
    return-void
.end method

.method public setLongitude(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 590
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->longitude:Ljava/lang/String;

    .line 591
    return-void
.end method

.method public setMachineTagMode(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 236
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->machineTagMode:Ljava/lang/String;

    .line 237
    return-void
.end method

.method public setMachineTags([Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 224
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->machineTags:[Ljava/lang/String;

    .line 225
    return-void
.end method

.method public setMaxTakenDate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 194
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->maxTakenDate:Ljava/util/Date;

    .line 195
    return-void
.end method

.method public setMaxUploadDate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 178
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->maxUploadDate:Ljava/util/Date;

    .line 179
    return-void
.end method

.method public setMedia(Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 411
    const-string v0, "all"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 412
    const-string v0, "photos"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 413
    const-string v0, "videos"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 415
    :cond_0
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->media:Ljava/lang/String;

    .line 416
    return-void

    .line 417
    :cond_1
    new-instance v0, Lcom/googlecode/flickrjandroid/FlickrException;

    const-string v1, "0"

    const-string v2, "Media type is not valid."

    invoke-direct {v0, v1, v2}, Lcom/googlecode/flickrjandroid/FlickrException;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    throw v0
.end method

.method public setMinTakenDate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 186
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->minTakenDate:Ljava/util/Date;

    .line 187
    return-void
.end method

.method public setMinUploadDate(Ljava/util/Date;)V
    .locals 0

    .prologue
    .line 170
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->minUploadDate:Ljava/util/Date;

    .line 171
    return-void
.end method

.method public setPlaceId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 371
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->placeId:Ljava/lang/String;

    .line 372
    return-void
.end method

.method public setRadius(I)V
    .locals 0

    .prologue
    .line 586
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->radius:I

    .line 587
    return-void
.end method

.method public setRadiusUnits(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 594
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->radiusUnits:Ljava/lang/String;

    .line 595
    return-void
.end method

.method public setSafeSearch(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 317
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->safeSearch:Ljava/lang/String;

    .line 318
    return-void
.end method

.method public setSort(I)V
    .locals 0

    .prologue
    .line 342
    iput p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->sort:I

    .line 343
    return-void
.end method

.method public setTagMode(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 154
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->tagMode:Ljava/lang/String;

    .line 155
    return-void
.end method

.method public setTags([Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 146
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->tags:[Ljava/lang/String;

    .line 147
    return-void
.end method

.method public setText(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 162
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->text:Ljava/lang/String;

    .line 163
    return-void
.end method

.method public setUserId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 618
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->userId:Ljava/lang/String;

    .line 619
    return-void
.end method

.method public setWoeId(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 397
    iput-object p1, p0, Lcom/googlecode/flickrjandroid/photos/SearchParameters;->woeId:Ljava/lang/String;

    .line 398
    return-void
.end method
