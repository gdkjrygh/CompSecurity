.class public Lezvcard/util/GeoUri$Builder;
.super Ljava/lang/Object;
.source "GeoUri.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/util/GeoUri;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private coordA:Ljava/lang/Double;

.field private coordB:Ljava/lang/Double;

.field private coordC:Ljava/lang/Double;

.field private crs:Ljava/lang/String;

.field private parameters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private uncertainty:Ljava/lang/Double;


# direct methods
.method private constructor <init>()V
    .locals 2

    .prologue
    .line 329
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 331
    new-instance v0, Ljava/util/LinkedHashMap;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    iput-object v0, p0, Lezvcard/util/GeoUri$Builder;->parameters:Ljava/util/Map;

    .line 332
    return-void
.end method

.method synthetic constructor <init>(Lezvcard/util/GeoUri$1;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/util/GeoUri$1;

    .prologue
    .line 321
    invoke-direct {p0}, Lezvcard/util/GeoUri$Builder;-><init>()V

    return-void
.end method

.method public constructor <init>(Lezvcard/util/GeoUri;)V
    .locals 2
    .param p1, "original"    # Lezvcard/util/GeoUri;

    .prologue
    .line 349
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 350
    # getter for: Lezvcard/util/GeoUri;->coordA:Ljava/lang/Double;
    invoke-static {p1}, Lezvcard/util/GeoUri;->access$700(Lezvcard/util/GeoUri;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lezvcard/util/GeoUri$Builder;->coordA(Ljava/lang/Double;)Lezvcard/util/GeoUri$Builder;

    .line 351
    # getter for: Lezvcard/util/GeoUri;->coordB:Ljava/lang/Double;
    invoke-static {p1}, Lezvcard/util/GeoUri;->access$800(Lezvcard/util/GeoUri;)Ljava/lang/Double;

    move-result-object v0

    invoke-virtual {p0, v0}, Lezvcard/util/GeoUri$Builder;->coordB(Ljava/lang/Double;)Lezvcard/util/GeoUri$Builder;

    .line 352
    # getter for: Lezvcard/util/GeoUri;->coordC:Ljava/lang/Double;
    invoke-static {p1}, Lezvcard/util/GeoUri;->access$900(Lezvcard/util/GeoUri;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/GeoUri$Builder;->coordC:Ljava/lang/Double;

    .line 353
    # getter for: Lezvcard/util/GeoUri;->crs:Ljava/lang/String;
    invoke-static {p1}, Lezvcard/util/GeoUri;->access$1000(Lezvcard/util/GeoUri;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/GeoUri$Builder;->crs:Ljava/lang/String;

    .line 354
    # getter for: Lezvcard/util/GeoUri;->uncertainty:Ljava/lang/Double;
    invoke-static {p1}, Lezvcard/util/GeoUri;->access$1100(Lezvcard/util/GeoUri;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/GeoUri$Builder;->uncertainty:Ljava/lang/Double;

    .line 355
    new-instance v0, Ljava/util/LinkedHashMap;

    # getter for: Lezvcard/util/GeoUri;->parameters:Ljava/util/Map;
    invoke-static {p1}, Lezvcard/util/GeoUri;->access$1200(Lezvcard/util/GeoUri;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lezvcard/util/GeoUri$Builder;->parameters:Ljava/util/Map;

    .line 356
    return-void
.end method

.method public constructor <init>(Ljava/lang/Double;Ljava/lang/Double;)V
    .locals 0
    .param p1, "coordA"    # Ljava/lang/Double;
    .param p2, "coordB"    # Ljava/lang/Double;

    .prologue
    .line 340
    invoke-direct {p0}, Lezvcard/util/GeoUri$Builder;-><init>()V

    .line 341
    invoke-virtual {p0, p1}, Lezvcard/util/GeoUri$Builder;->coordA(Ljava/lang/Double;)Lezvcard/util/GeoUri$Builder;

    .line 342
    invoke-virtual {p0, p2}, Lezvcard/util/GeoUri$Builder;->coordB(Ljava/lang/Double;)Lezvcard/util/GeoUri$Builder;

    .line 343
    return-void
.end method

.method static synthetic access$000(Lezvcard/util/GeoUri$Builder;)Ljava/lang/Double;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri$Builder;

    .prologue
    .line 321
    iget-object v0, p0, Lezvcard/util/GeoUri$Builder;->coordA:Ljava/lang/Double;

    return-object v0
.end method

.method static synthetic access$002(Lezvcard/util/GeoUri$Builder;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0
    .param p0, "x0"    # Lezvcard/util/GeoUri$Builder;
    .param p1, "x1"    # Ljava/lang/Double;

    .prologue
    .line 321
    iput-object p1, p0, Lezvcard/util/GeoUri$Builder;->coordA:Ljava/lang/Double;

    return-object p1
.end method

.method static synthetic access$100(Lezvcard/util/GeoUri$Builder;)Ljava/lang/Double;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri$Builder;

    .prologue
    .line 321
    iget-object v0, p0, Lezvcard/util/GeoUri$Builder;->coordB:Ljava/lang/Double;

    return-object v0
.end method

.method static synthetic access$102(Lezvcard/util/GeoUri$Builder;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0
    .param p0, "x0"    # Lezvcard/util/GeoUri$Builder;
    .param p1, "x1"    # Ljava/lang/Double;

    .prologue
    .line 321
    iput-object p1, p0, Lezvcard/util/GeoUri$Builder;->coordB:Ljava/lang/Double;

    return-object p1
.end method

.method static synthetic access$200(Lezvcard/util/GeoUri$Builder;)Ljava/lang/Double;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri$Builder;

    .prologue
    .line 321
    iget-object v0, p0, Lezvcard/util/GeoUri$Builder;->coordC:Ljava/lang/Double;

    return-object v0
.end method

.method static synthetic access$202(Lezvcard/util/GeoUri$Builder;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0
    .param p0, "x0"    # Lezvcard/util/GeoUri$Builder;
    .param p1, "x1"    # Ljava/lang/Double;

    .prologue
    .line 321
    iput-object p1, p0, Lezvcard/util/GeoUri$Builder;->coordC:Ljava/lang/Double;

    return-object p1
.end method

.method static synthetic access$300(Lezvcard/util/GeoUri$Builder;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri$Builder;

    .prologue
    .line 321
    iget-object v0, p0, Lezvcard/util/GeoUri$Builder;->crs:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$302(Lezvcard/util/GeoUri$Builder;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lezvcard/util/GeoUri$Builder;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 321
    iput-object p1, p0, Lezvcard/util/GeoUri$Builder;->crs:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$400(Lezvcard/util/GeoUri$Builder;)Ljava/lang/Double;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri$Builder;

    .prologue
    .line 321
    iget-object v0, p0, Lezvcard/util/GeoUri$Builder;->uncertainty:Ljava/lang/Double;

    return-object v0
.end method

.method static synthetic access$402(Lezvcard/util/GeoUri$Builder;Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0
    .param p0, "x0"    # Lezvcard/util/GeoUri$Builder;
    .param p1, "x1"    # Ljava/lang/Double;

    .prologue
    .line 321
    iput-object p1, p0, Lezvcard/util/GeoUri$Builder;->uncertainty:Ljava/lang/Double;

    return-object p1
.end method

.method static synthetic access$500(Lezvcard/util/GeoUri$Builder;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri$Builder;

    .prologue
    .line 321
    iget-object v0, p0, Lezvcard/util/GeoUri$Builder;->parameters:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public build()Lezvcard/util/GeoUri;
    .locals 2

    .prologue
    .line 441
    new-instance v0, Lezvcard/util/GeoUri;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/util/GeoUri;-><init>(Lezvcard/util/GeoUri$Builder;Lezvcard/util/GeoUri$1;)V

    return-object v0
.end method

.method public coordA(Ljava/lang/Double;)Lezvcard/util/GeoUri$Builder;
    .locals 2
    .param p1, "coordA"    # Ljava/lang/Double;

    .prologue
    .line 364
    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/GeoUri$Builder;->coordA:Ljava/lang/Double;

    .line 365
    return-object p0

    .line 364
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    goto :goto_0
.end method

.method public coordB(Ljava/lang/Double;)Lezvcard/util/GeoUri$Builder;
    .locals 2
    .param p1, "coordB"    # Ljava/lang/Double;

    .prologue
    .line 374
    if-nez p1, :cond_0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/GeoUri$Builder;->coordB:Ljava/lang/Double;

    .line 375
    return-object p0

    .line 374
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    goto :goto_0
.end method

.method public coordC(Ljava/lang/Double;)Lezvcard/util/GeoUri$Builder;
    .locals 0
    .param p1, "coordC"    # Ljava/lang/Double;

    .prologue
    .line 384
    iput-object p1, p0, Lezvcard/util/GeoUri$Builder;->coordC:Ljava/lang/Double;

    .line 385
    return-object p0
.end method

.method public crs(Ljava/lang/String;)Lezvcard/util/GeoUri$Builder;
    .locals 2
    .param p1, "crs"    # Ljava/lang/String;

    .prologue
    .line 397
    if-eqz p1, :cond_0

    # invokes: Lezvcard/util/GeoUri;->isLabelText(Ljava/lang/String;)Z
    invoke-static {p1}, Lezvcard/util/GeoUri;->access$1300(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 398
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "CRS can only contain letters, numbers, and hypens."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 400
    :cond_0
    iput-object p1, p0, Lezvcard/util/GeoUri$Builder;->crs:Ljava/lang/String;

    .line 401
    return-object p0
.end method

.method public parameter(Ljava/lang/String;Ljava/lang/String;)Lezvcard/util/GeoUri$Builder;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 424
    # invokes: Lezvcard/util/GeoUri;->isLabelText(Ljava/lang/String;)Z
    invoke-static {p1}, Lezvcard/util/GeoUri;->access$1300(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 425
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Parameter names can only contain letters, numbers, and hyphens."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 428
    :cond_0
    if-nez p2, :cond_1

    .line 429
    iget-object v0, p0, Lezvcard/util/GeoUri$Builder;->parameters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    :goto_0
    return-object p0

    .line 431
    :cond_1
    iget-object v0, p0, Lezvcard/util/GeoUri$Builder;->parameters:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method

.method public uncertainty(Ljava/lang/Double;)Lezvcard/util/GeoUri$Builder;
    .locals 0
    .param p1, "uncertainty"    # Ljava/lang/Double;

    .prologue
    .line 410
    iput-object p1, p0, Lezvcard/util/GeoUri$Builder;->uncertainty:Ljava/lang/Double;

    .line 411
    return-object p0
.end method
