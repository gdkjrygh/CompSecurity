.class abstract enum Lcom/google/common/a/bn;
.super Ljava/lang/Enum;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/common/a/bn;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/common/a/bn;

.field static final EVICTABLE_MASK:I = 0x2

.field static final EXPIRABLE_MASK:I = 0x1

.field public static final enum SOFT:Lcom/google/common/a/bn;

.field public static final enum SOFT_EVICTABLE:Lcom/google/common/a/bn;

.field public static final enum SOFT_EXPIRABLE:Lcom/google/common/a/bn;

.field public static final enum SOFT_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

.field public static final enum STRONG:Lcom/google/common/a/bn;

.field public static final enum STRONG_EVICTABLE:Lcom/google/common/a/bn;

.field public static final enum STRONG_EXPIRABLE:Lcom/google/common/a/bn;

.field public static final enum STRONG_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

.field public static final enum WEAK:Lcom/google/common/a/bn;

.field public static final enum WEAK_EVICTABLE:Lcom/google/common/a/bn;

.field public static final enum WEAK_EXPIRABLE:Lcom/google/common/a/bn;

.field public static final enum WEAK_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

.field static final factories:[[Lcom/google/common/a/bn;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 353
    new-instance v0, Lcom/google/common/a/bo;

    const-string v1, "STRONG"

    invoke-direct {v0, v1, v3}, Lcom/google/common/a/bo;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->STRONG:Lcom/google/common/a/bn;

    .line 360
    new-instance v0, Lcom/google/common/a/bs;

    const-string v1, "STRONG_EXPIRABLE"

    invoke-direct {v0, v1, v4}, Lcom/google/common/a/bs;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->STRONG_EXPIRABLE:Lcom/google/common/a/bn;

    .line 375
    new-instance v0, Lcom/google/common/a/bt;

    const-string v1, "STRONG_EVICTABLE"

    invoke-direct {v0, v1, v5}, Lcom/google/common/a/bt;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->STRONG_EVICTABLE:Lcom/google/common/a/bn;

    .line 390
    new-instance v0, Lcom/google/common/a/bu;

    const-string v1, "STRONG_EXPIRABLE_EVICTABLE"

    invoke-direct {v0, v1, v6}, Lcom/google/common/a/bu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->STRONG_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

    .line 407
    new-instance v0, Lcom/google/common/a/bv;

    const-string v1, "SOFT"

    invoke-direct {v0, v1, v7}, Lcom/google/common/a/bv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->SOFT:Lcom/google/common/a/bn;

    .line 414
    new-instance v0, Lcom/google/common/a/bw;

    const-string v1, "SOFT_EXPIRABLE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/bw;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->SOFT_EXPIRABLE:Lcom/google/common/a/bn;

    .line 429
    new-instance v0, Lcom/google/common/a/bx;

    const-string v1, "SOFT_EVICTABLE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/bx;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->SOFT_EVICTABLE:Lcom/google/common/a/bn;

    .line 444
    new-instance v0, Lcom/google/common/a/by;

    const-string v1, "SOFT_EXPIRABLE_EVICTABLE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/by;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->SOFT_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

    .line 461
    new-instance v0, Lcom/google/common/a/bz;

    const-string v1, "WEAK"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/bz;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->WEAK:Lcom/google/common/a/bn;

    .line 468
    new-instance v0, Lcom/google/common/a/bp;

    const-string v1, "WEAK_EXPIRABLE"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/bp;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->WEAK_EXPIRABLE:Lcom/google/common/a/bn;

    .line 483
    new-instance v0, Lcom/google/common/a/bq;

    const-string v1, "WEAK_EVICTABLE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/bq;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->WEAK_EVICTABLE:Lcom/google/common/a/bn;

    .line 498
    new-instance v0, Lcom/google/common/a/br;

    const-string v1, "WEAK_EXPIRABLE_EVICTABLE"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/br;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/bn;->WEAK_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

    .line 352
    const/16 v0, 0xc

    new-array v0, v0, [Lcom/google/common/a/bn;

    sget-object v1, Lcom/google/common/a/bn;->STRONG:Lcom/google/common/a/bn;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/common/a/bn;->STRONG_EXPIRABLE:Lcom/google/common/a/bn;

    aput-object v1, v0, v4

    sget-object v1, Lcom/google/common/a/bn;->STRONG_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v1, v0, v5

    sget-object v1, Lcom/google/common/a/bn;->STRONG_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v1, v0, v6

    sget-object v1, Lcom/google/common/a/bn;->SOFT:Lcom/google/common/a/bn;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/google/common/a/bn;->SOFT_EXPIRABLE:Lcom/google/common/a/bn;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/google/common/a/bn;->SOFT_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/google/common/a/bn;->SOFT_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/google/common/a/bn;->WEAK:Lcom/google/common/a/bn;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/google/common/a/bn;->WEAK_EXPIRABLE:Lcom/google/common/a/bn;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/google/common/a/bn;->WEAK_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/google/common/a/bn;->WEAK_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v2, v0, v1

    sput-object v0, Lcom/google/common/a/bn;->$VALUES:[Lcom/google/common/a/bn;

    .line 525
    new-array v0, v6, [[Lcom/google/common/a/bn;

    new-array v1, v7, [Lcom/google/common/a/bn;

    sget-object v2, Lcom/google/common/a/bn;->STRONG:Lcom/google/common/a/bn;

    aput-object v2, v1, v3

    sget-object v2, Lcom/google/common/a/bn;->STRONG_EXPIRABLE:Lcom/google/common/a/bn;

    aput-object v2, v1, v4

    sget-object v2, Lcom/google/common/a/bn;->STRONG_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v2, v1, v5

    sget-object v2, Lcom/google/common/a/bn;->STRONG_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v2, v1, v6

    aput-object v1, v0, v3

    new-array v1, v7, [Lcom/google/common/a/bn;

    sget-object v2, Lcom/google/common/a/bn;->SOFT:Lcom/google/common/a/bn;

    aput-object v2, v1, v3

    sget-object v2, Lcom/google/common/a/bn;->SOFT_EXPIRABLE:Lcom/google/common/a/bn;

    aput-object v2, v1, v4

    sget-object v2, Lcom/google/common/a/bn;->SOFT_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v2, v1, v5

    sget-object v2, Lcom/google/common/a/bn;->SOFT_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v2, v1, v6

    aput-object v1, v0, v4

    new-array v1, v7, [Lcom/google/common/a/bn;

    sget-object v2, Lcom/google/common/a/bn;->WEAK:Lcom/google/common/a/bn;

    aput-object v2, v1, v3

    sget-object v2, Lcom/google/common/a/bn;->WEAK_EXPIRABLE:Lcom/google/common/a/bn;

    aput-object v2, v1, v4

    sget-object v2, Lcom/google/common/a/bn;->WEAK_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v2, v1, v5

    sget-object v2, Lcom/google/common/a/bn;->WEAK_EXPIRABLE_EVICTABLE:Lcom/google/common/a/bn;

    aput-object v2, v1, v6

    aput-object v1, v0, v5

    sput-object v0, Lcom/google/common/a/bn;->factories:[[Lcom/google/common/a/bn;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 352
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/common/a/bk;)V
    .locals 0

    .prologue
    .line 352
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/bn;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method static getFactory(Lcom/google/common/a/ct;ZZ)Lcom/google/common/a/bn;
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 533
    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :goto_0
    if-eqz p2, :cond_0

    const/4 v0, 0x2

    :cond_0
    or-int/2addr v0, v1

    .line 534
    sget-object v1, Lcom/google/common/a/bn;->factories:[[Lcom/google/common/a/bn;

    invoke-virtual {p0}, Lcom/google/common/a/ct;->ordinal()I

    move-result v2

    aget-object v1, v1, v2

    aget-object v0, v1, v0

    return-object v0

    :cond_1
    move v1, v0

    .line 533
    goto :goto_0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/a/bn;
    .locals 1

    .prologue
    .line 352
    const-class v0, Lcom/google/common/a/bn;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/bn;

    return-object v0
.end method

.method public static values()[Lcom/google/common/a/bn;
    .locals 1

    .prologue
    .line 352
    sget-object v0, Lcom/google/common/a/bn;->$VALUES:[Lcom/google/common/a/bn;

    invoke-virtual {v0}, [Lcom/google/common/a/bn;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/a/bn;

    return-object v0
.end method


# virtual methods
.method copyEntry(Lcom/google/common/a/cn;Lcom/google/common/a/cm;Lcom/google/common/a/cm;)Lcom/google/common/a/cm;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/cn",
            "<TK;TV;>;",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation

    .prologue
    .line 557
    invoke-interface {p2}, Lcom/google/common/a/cm;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2}, Lcom/google/common/a/cm;->getHash()I

    move-result v1

    invoke-virtual {p0, p1, v0, v1, p3}, Lcom/google/common/a/bn;->newEntry(Lcom/google/common/a/cn;Ljava/lang/Object;ILcom/google/common/a/cm;)Lcom/google/common/a/cm;

    move-result-object v0

    return-object v0
.end method

.method copyEvictableEntry(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation

    .prologue
    .line 576
    invoke-interface {p1}, Lcom/google/common/a/cm;->getPreviousEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/common/a/bj;->b(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 577
    invoke-interface {p1}, Lcom/google/common/a/cm;->getNextEvictable()Lcom/google/common/a/cm;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/google/common/a/bj;->b(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 579
    invoke-static {p1}, Lcom/google/common/a/bj;->e(Lcom/google/common/a/cm;)V

    .line 580
    return-void
.end method

.method copyExpirableEntry(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)V"
        }
    .end annotation

    .annotation build Ljavax/annotation/concurrent/GuardedBy;
        value = "Segment.this"
    .end annotation

    .prologue
    .line 564
    invoke-interface {p1}, Lcom/google/common/a/cm;->getExpirationTime()J

    move-result-wide v0

    invoke-interface {p2, v0, v1}, Lcom/google/common/a/cm;->setExpirationTime(J)V

    .line 566
    invoke-interface {p1}, Lcom/google/common/a/cm;->getPreviousExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    invoke-static {v0, p2}, Lcom/google/common/a/bj;->a(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 567
    invoke-interface {p1}, Lcom/google/common/a/cm;->getNextExpirable()Lcom/google/common/a/cm;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/google/common/a/bj;->a(Lcom/google/common/a/cm;Lcom/google/common/a/cm;)V

    .line 569
    invoke-static {p1}, Lcom/google/common/a/bj;->d(Lcom/google/common/a/cm;)V

    .line 570
    return-void
.end method

.method abstract newEntry(Lcom/google/common/a/cn;Ljava/lang/Object;ILcom/google/common/a/cm;)Lcom/google/common/a/cm;
    .param p4    # Lcom/google/common/a/cm;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/common/a/cn",
            "<TK;TV;>;TK;I",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;)",
            "Lcom/google/common/a/cm",
            "<TK;TV;>;"
        }
    .end annotation
.end method
