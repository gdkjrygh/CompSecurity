.class abstract enum Lcom/google/common/a/ct;
.super Ljava/lang/Enum;
.source "CustomConcurrentHashMap.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/common/a/ct;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/common/a/ct;

.field public static final enum SOFT:Lcom/google/common/a/ct;

.field public static final enum STRONG:Lcom/google/common/a/ct;

.field public static final enum WEAK:Lcom/google/common/a/ct;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 296
    new-instance v0, Lcom/google/common/a/cu;

    const-string v1, "STRONG"

    invoke-direct {v0, v1, v2}, Lcom/google/common/a/cu;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ct;->STRONG:Lcom/google/common/a/ct;

    .line 309
    new-instance v0, Lcom/google/common/a/cv;

    const-string v1, "SOFT"

    invoke-direct {v0, v1, v3}, Lcom/google/common/a/cv;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ct;->SOFT:Lcom/google/common/a/ct;

    .line 322
    new-instance v0, Lcom/google/common/a/cw;

    const-string v1, "WEAK"

    invoke-direct {v0, v1, v4}, Lcom/google/common/a/cw;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/common/a/ct;->WEAK:Lcom/google/common/a/ct;

    .line 290
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/common/a/ct;

    sget-object v1, Lcom/google/common/a/ct;->STRONG:Lcom/google/common/a/ct;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/common/a/ct;->SOFT:Lcom/google/common/a/ct;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/common/a/ct;->WEAK:Lcom/google/common/a/ct;

    aput-object v1, v0, v4

    sput-object v0, Lcom/google/common/a/ct;->$VALUES:[Lcom/google/common/a/ct;

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
    .line 290
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/common/a/bk;)V
    .locals 0

    .prologue
    .line 290
    invoke-direct {p0, p1, p2}, Lcom/google/common/a/ct;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/common/a/ct;
    .locals 1

    .prologue
    .line 290
    const-class v0, Lcom/google/common/a/ct;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/common/a/ct;

    return-object v0
.end method

.method public static values()[Lcom/google/common/a/ct;
    .locals 1

    .prologue
    .line 290
    sget-object v0, Lcom/google/common/a/ct;->$VALUES:[Lcom/google/common/a/ct;

    invoke-virtual {v0}, [Lcom/google/common/a/ct;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/common/a/ct;

    return-object v0
.end method


# virtual methods
.method abstract defaultEquivalence()Lcom/google/common/base/Equivalence;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/common/base/Equivalence",
            "<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method abstract referenceValue(Lcom/google/common/a/cn;Lcom/google/common/a/cm;Ljava/lang/Object;)Lcom/google/common/a/dd;
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
            "<TK;TV;>;TV;)",
            "Lcom/google/common/a/dd",
            "<TK;TV;>;"
        }
    .end annotation
.end method
