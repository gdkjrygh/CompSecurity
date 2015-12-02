.class public final enum Lcom/facebook/config/a/d;
.super Ljava/lang/Enum;
.source "Product.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/config/a/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/config/a/d;

.field public static final enum FB4A:Lcom/facebook/config/a/d;

.field public static final enum GIFTS:Lcom/facebook/config/a/d;

.field public static final enum MESSENGER:Lcom/facebook/config/a/d;

.field public static final enum NATIVEMSITE:Lcom/facebook/config/a/d;

.field public static final enum PAA:Lcom/facebook/config/a/d;

.field public static final enum POKE:Lcom/facebook/config/a/d;

.field public static final enum SAMPLE:Lcom/facebook/config/a/d;

.field public static final enum UNKNOWN:Lcom/facebook/config/a/d;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 9
    new-instance v0, Lcom/facebook/config/a/d;

    const-string v1, "MESSENGER"

    invoke-direct {v0, v1, v3}, Lcom/facebook/config/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    .line 10
    new-instance v0, Lcom/facebook/config/a/d;

    const-string v1, "FB4A"

    invoke-direct {v0, v1, v4}, Lcom/facebook/config/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/config/a/d;->FB4A:Lcom/facebook/config/a/d;

    .line 11
    new-instance v0, Lcom/facebook/config/a/d;

    const-string v1, "PAA"

    invoke-direct {v0, v1, v5}, Lcom/facebook/config/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/config/a/d;->PAA:Lcom/facebook/config/a/d;

    .line 12
    new-instance v0, Lcom/facebook/config/a/d;

    const-string v1, "POKE"

    invoke-direct {v0, v1, v6}, Lcom/facebook/config/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/config/a/d;->POKE:Lcom/facebook/config/a/d;

    .line 13
    new-instance v0, Lcom/facebook/config/a/d;

    const-string v1, "SAMPLE"

    invoke-direct {v0, v1, v7}, Lcom/facebook/config/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/config/a/d;->SAMPLE:Lcom/facebook/config/a/d;

    .line 14
    new-instance v0, Lcom/facebook/config/a/d;

    const-string v1, "GIFTS"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/config/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/config/a/d;->GIFTS:Lcom/facebook/config/a/d;

    .line 15
    new-instance v0, Lcom/facebook/config/a/d;

    const-string v1, "NATIVEMSITE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/config/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/config/a/d;->NATIVEMSITE:Lcom/facebook/config/a/d;

    .line 16
    new-instance v0, Lcom/facebook/config/a/d;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/facebook/config/a/d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/config/a/d;->UNKNOWN:Lcom/facebook/config/a/d;

    .line 8
    const/16 v0, 0x8

    new-array v0, v0, [Lcom/facebook/config/a/d;

    sget-object v1, Lcom/facebook/config/a/d;->MESSENGER:Lcom/facebook/config/a/d;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/config/a/d;->FB4A:Lcom/facebook/config/a/d;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/config/a/d;->PAA:Lcom/facebook/config/a/d;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/config/a/d;->POKE:Lcom/facebook/config/a/d;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/config/a/d;->SAMPLE:Lcom/facebook/config/a/d;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/config/a/d;->GIFTS:Lcom/facebook/config/a/d;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/config/a/d;->NATIVEMSITE:Lcom/facebook/config/a/d;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/config/a/d;->UNKNOWN:Lcom/facebook/config/a/d;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/config/a/d;->$VALUES:[Lcom/facebook/config/a/d;

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
    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/config/a/d;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/config/a/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/config/a/d;

    return-object v0
.end method

.method public static values()[Lcom/facebook/config/a/d;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/config/a/d;->$VALUES:[Lcom/facebook/config/a/d;

    invoke-virtual {v0}, [Lcom/facebook/config/a/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/config/a/d;

    return-object v0
.end method
