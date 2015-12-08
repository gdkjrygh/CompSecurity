.class abstract enum Lcom/google/inject/internal/util/$MapMaker$Strength;
.super Ljava/lang/Enum;
.source "MapMaker.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/inject/internal/util/$MapMaker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x440a
    name = "Strength"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/google/inject/internal/util/$MapMaker$Strength;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/inject/internal/util/$MapMaker$Strength;

.field public static final enum SOFT:Lcom/google/inject/internal/util/$MapMaker$Strength;

.field public static final enum STRONG:Lcom/google/inject/internal/util/$MapMaker$Strength;

.field public static final enum WEAK:Lcom/google/inject/internal/util/$MapMaker$Strength;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 298
    new-instance v0, Lcom/google/inject/internal/util/$MapMaker$Strength$1;

    const-string v1, "WEAK"

    invoke-direct {v0, v1, v2}, Lcom/google/inject/internal/util/$MapMaker$Strength$1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/util/$MapMaker$Strength;->WEAK:Lcom/google/inject/internal/util/$MapMaker$Strength;

    .line 327
    new-instance v0, Lcom/google/inject/internal/util/$MapMaker$Strength$2;

    const-string v1, "SOFT"

    invoke-direct {v0, v1, v3}, Lcom/google/inject/internal/util/$MapMaker$Strength$2;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/util/$MapMaker$Strength;->SOFT:Lcom/google/inject/internal/util/$MapMaker$Strength;

    .line 356
    new-instance v0, Lcom/google/inject/internal/util/$MapMaker$Strength$3;

    const-string v1, "STRONG"

    invoke-direct {v0, v1, v4}, Lcom/google/inject/internal/util/$MapMaker$Strength$3;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/inject/internal/util/$MapMaker$Strength;->STRONG:Lcom/google/inject/internal/util/$MapMaker$Strength;

    .line 297
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/google/inject/internal/util/$MapMaker$Strength;

    sget-object v1, Lcom/google/inject/internal/util/$MapMaker$Strength;->WEAK:Lcom/google/inject/internal/util/$MapMaker$Strength;

    aput-object v1, v0, v2

    sget-object v1, Lcom/google/inject/internal/util/$MapMaker$Strength;->SOFT:Lcom/google/inject/internal/util/$MapMaker$Strength;

    aput-object v1, v0, v3

    sget-object v1, Lcom/google/inject/internal/util/$MapMaker$Strength;->STRONG:Lcom/google/inject/internal/util/$MapMaker$Strength;

    aput-object v1, v0, v4

    sput-object v0, Lcom/google/inject/internal/util/$MapMaker$Strength;->$VALUES:[Lcom/google/inject/internal/util/$MapMaker$Strength;

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
    .line 297
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;ILcom/google/inject/internal/util/$MapMaker$1;)V
    .locals 0
    .param p1, "x0"    # Ljava/lang/String;
    .param p2, "x1"    # I
    .param p3, "x2"    # Lcom/google/inject/internal/util/$MapMaker$1;

    .prologue
    .line 297
    invoke-direct {p0, p1, p2}, Lcom/google/inject/internal/util/$MapMaker$Strength;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/inject/internal/util/$MapMaker$Strength;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 297
    const-class v0, Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/google/inject/internal/util/$MapMaker$Strength;

    return-object v0
.end method

.method public static values()[Lcom/google/inject/internal/util/$MapMaker$Strength;
    .locals 1

    .prologue
    .line 297
    sget-object v0, Lcom/google/inject/internal/util/$MapMaker$Strength;->$VALUES:[Lcom/google/inject/internal/util/$MapMaker$Strength;

    invoke-virtual {v0}, [Lcom/google/inject/internal/util/$MapMaker$Strength;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/inject/internal/util/$MapMaker$Strength;

    return-object v0
.end method


# virtual methods
.method abstract copyEntry(Ljava/lang/Object;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(TK;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;"
        }
    .end annotation
.end method

.method abstract equal(Ljava/lang/Object;Ljava/lang/Object;)Z
.end method

.method abstract hash(Ljava/lang/Object;)I
.end method

.method abstract newEntry(Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals;Ljava/lang/Object;ILcom/google/inject/internal/util/$MapMaker$ReferenceEntry;)Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/internal/util/$CustomConcurrentHashMap$Internals",
            "<TK;TV;",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;>;TK;I",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;)",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;"
        }
    .end annotation
.end method

.method abstract referenceValue(Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry;Ljava/lang/Object;)Lcom/google/inject/internal/util/$MapMaker$ValueReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/inject/internal/util/$MapMaker$ReferenceEntry",
            "<TK;TV;>;TV;)",
            "Lcom/google/inject/internal/util/$MapMaker$ValueReference",
            "<TK;TV;>;"
        }
    .end annotation
.end method
