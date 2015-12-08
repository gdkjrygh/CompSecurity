.class public Lezvcard/util/TelUri$Builder;
.super Ljava/lang/Object;
.source "TelUri.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lezvcard/util/TelUri;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private extension:Ljava/lang/String;

.field private isdnSubaddress:Ljava/lang/String;

.field private number:Ljava/lang/String;

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

.field private phoneContext:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 349
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 351
    new-instance v0, Ljava/util/TreeMap;

    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    iput-object v0, p0, Lezvcard/util/TelUri$Builder;->parameters:Ljava/util/Map;

    .line 352
    return-void
.end method

.method synthetic constructor <init>(Lezvcard/util/TelUri$1;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/util/TelUri$1;

    .prologue
    .line 340
    invoke-direct {p0}, Lezvcard/util/TelUri$Builder;-><init>()V

    return-void
.end method

.method public constructor <init>(Lezvcard/util/TelUri;)V
    .locals 2
    .param p1, "original"    # Lezvcard/util/TelUri;

    .prologue
    .line 426
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 427
    # getter for: Lezvcard/util/TelUri;->number:Ljava/lang/String;
    invoke-static {p1}, Lezvcard/util/TelUri;->access$600(Lezvcard/util/TelUri;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/TelUri$Builder;->number:Ljava/lang/String;

    .line 428
    # getter for: Lezvcard/util/TelUri;->extension:Ljava/lang/String;
    invoke-static {p1}, Lezvcard/util/TelUri;->access$700(Lezvcard/util/TelUri;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/TelUri$Builder;->extension:Ljava/lang/String;

    .line 429
    # getter for: Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;
    invoke-static {p1}, Lezvcard/util/TelUri;->access$800(Lezvcard/util/TelUri;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/TelUri$Builder;->isdnSubaddress:Ljava/lang/String;

    .line 430
    # getter for: Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;
    invoke-static {p1}, Lezvcard/util/TelUri;->access$900(Lezvcard/util/TelUri;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/TelUri$Builder;->phoneContext:Ljava/lang/String;

    .line 431
    new-instance v0, Ljava/util/TreeMap;

    # getter for: Lezvcard/util/TelUri;->parameters:Ljava/util/Map;
    invoke-static {p1}, Lezvcard/util/TelUri;->access$1000(Lezvcard/util/TelUri;)Ljava/util/Map;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    iput-object v0, p0, Lezvcard/util/TelUri$Builder;->parameters:Ljava/util/Map;

    .line 432
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0
    .param p1, "globalNumber"    # Ljava/lang/String;

    .prologue
    .line 379
    invoke-direct {p0}, Lezvcard/util/TelUri$Builder;-><init>()V

    .line 380
    invoke-virtual {p0, p1}, Lezvcard/util/TelUri$Builder;->globalNumber(Ljava/lang/String;)Lezvcard/util/TelUri$Builder;

    .line 381
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0
    .param p1, "localNumber"    # Ljava/lang/String;
    .param p2, "phoneContext"    # Ljava/lang/String;

    .prologue
    .line 418
    invoke-direct {p0}, Lezvcard/util/TelUri$Builder;-><init>()V

    .line 419
    invoke-virtual {p0, p1, p2}, Lezvcard/util/TelUri$Builder;->localNumber(Ljava/lang/String;Ljava/lang/String;)Lezvcard/util/TelUri$Builder;

    .line 420
    return-void
.end method

.method static synthetic access$000(Lezvcard/util/TelUri$Builder;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/TelUri$Builder;

    .prologue
    .line 340
    iget-object v0, p0, Lezvcard/util/TelUri$Builder;->number:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$002(Lezvcard/util/TelUri$Builder;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lezvcard/util/TelUri$Builder;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 340
    iput-object p1, p0, Lezvcard/util/TelUri$Builder;->number:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$100(Lezvcard/util/TelUri$Builder;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/TelUri$Builder;

    .prologue
    .line 340
    iget-object v0, p0, Lezvcard/util/TelUri$Builder;->extension:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$102(Lezvcard/util/TelUri$Builder;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lezvcard/util/TelUri$Builder;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 340
    iput-object p1, p0, Lezvcard/util/TelUri$Builder;->extension:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$200(Lezvcard/util/TelUri$Builder;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/TelUri$Builder;

    .prologue
    .line 340
    iget-object v0, p0, Lezvcard/util/TelUri$Builder;->isdnSubaddress:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$202(Lezvcard/util/TelUri$Builder;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lezvcard/util/TelUri$Builder;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 340
    iput-object p1, p0, Lezvcard/util/TelUri$Builder;->isdnSubaddress:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$300(Lezvcard/util/TelUri$Builder;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/TelUri$Builder;

    .prologue
    .line 340
    iget-object v0, p0, Lezvcard/util/TelUri$Builder;->phoneContext:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$302(Lezvcard/util/TelUri$Builder;Ljava/lang/String;)Ljava/lang/String;
    .locals 0
    .param p0, "x0"    # Lezvcard/util/TelUri$Builder;
    .param p1, "x1"    # Ljava/lang/String;

    .prologue
    .line 340
    iput-object p1, p0, Lezvcard/util/TelUri$Builder;->phoneContext:Ljava/lang/String;

    return-object p1
.end method

.method static synthetic access$400(Lezvcard/util/TelUri$Builder;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/TelUri$Builder;

    .prologue
    .line 340
    iget-object v0, p0, Lezvcard/util/TelUri$Builder;->parameters:Ljava/util/Map;

    return-object v0
.end method


# virtual methods
.method public build()Lezvcard/util/TelUri;
    .locals 2

    .prologue
    .line 573
    new-instance v0, Lezvcard/util/TelUri;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lezvcard/util/TelUri;-><init>(Lezvcard/util/TelUri$Builder;Lezvcard/util/TelUri$1;)V

    return-object v0
.end method

.method public extension(Ljava/lang/String;)Lezvcard/util/TelUri$Builder;
    .locals 2
    .param p1, "extension"    # Ljava/lang/String;

    .prologue
    .line 528
    if-eqz p1, :cond_0

    # invokes: Lezvcard/util/TelUri;->isPhoneDigit(Ljava/lang/String;)Z
    invoke-static {p1}, Lezvcard/util/TelUri;->access$1100(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 529
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Extension contains invalid characters."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 532
    :cond_0
    iput-object p1, p0, Lezvcard/util/TelUri$Builder;->extension:Ljava/lang/String;

    .line 533
    return-object p0
.end method

.method public globalNumber(Ljava/lang/String;)Lezvcard/util/TelUri$Builder;
    .locals 2
    .param p1, "globalNumber"    # Ljava/lang/String;

    .prologue
    .line 460
    const-string v0, ".*?[0-9].*"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 461
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Global number must contain at least one digit."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 463
    :cond_0
    const-string v0, "+"

    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 464
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Global number must start with \"+\"."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 466
    :cond_1
    const-string v0, "\\+[-0-9.()]*"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 467
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Global number contains invalid characters."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 470
    :cond_2
    iput-object p1, p0, Lezvcard/util/TelUri$Builder;->number:Ljava/lang/String;

    .line 471
    const/4 v0, 0x0

    iput-object v0, p0, Lezvcard/util/TelUri$Builder;->phoneContext:Ljava/lang/String;

    .line 472
    return-object p0
.end method

.method public isdnSubaddress(Ljava/lang/String;)Lezvcard/util/TelUri$Builder;
    .locals 0
    .param p1, "isdnSubaddress"    # Ljava/lang/String;

    .prologue
    .line 542
    iput-object p1, p0, Lezvcard/util/TelUri$Builder;->isdnSubaddress:Ljava/lang/String;

    .line 543
    return-object p0
.end method

.method public localNumber(Ljava/lang/String;Ljava/lang/String;)Lezvcard/util/TelUri$Builder;
    .locals 2
    .param p1, "localNumber"    # Ljava/lang/String;
    .param p2, "phoneContext"    # Ljava/lang/String;

    .prologue
    .line 511
    const-string v0, ".*?[0-9*#].*"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "[0-9\\-.()*#]+"

    invoke-virtual {p1, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 512
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Local number contains invalid characters."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 515
    :cond_1
    iput-object p1, p0, Lezvcard/util/TelUri$Builder;->number:Ljava/lang/String;

    .line 516
    iput-object p2, p0, Lezvcard/util/TelUri$Builder;->phoneContext:Ljava/lang/String;

    .line 517
    return-object p0
.end method

.method public parameter(Ljava/lang/String;Ljava/lang/String;)Lezvcard/util/TelUri$Builder;
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;

    .prologue
    .line 556
    # invokes: Lezvcard/util/TelUri;->isParametername(Ljava/lang/String;)Z
    invoke-static {p1}, Lezvcard/util/TelUri;->access$1200(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 557
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Parameter names can only contain letters, numbers, and hyphens."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 560
    :cond_0
    if-nez p2, :cond_1

    .line 561
    iget-object v0, p0, Lezvcard/util/TelUri$Builder;->parameters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 565
    :goto_0
    return-object p0

    .line 563
    :cond_1
    iget-object v0, p0, Lezvcard/util/TelUri$Builder;->parameters:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0
.end method
