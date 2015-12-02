.class public final enum Lcom/facebook/cache/i;
.super Ljava/lang/Enum;
.source "CachePriority.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/cache/i;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/cache/i;

.field public static final enum HIGH:Lcom/facebook/cache/i;

.field public static final enum LOW:Lcom/facebook/cache/i;

.field public static final enum MEDIUM:Lcom/facebook/cache/i;


# instance fields
.field private final mPriorityValue:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 11
    new-instance v0, Lcom/facebook/cache/i;

    const-string v1, "HIGH"

    const/16 v2, 0x96

    invoke-direct {v0, v1, v3, v2}, Lcom/facebook/cache/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/cache/i;->HIGH:Lcom/facebook/cache/i;

    .line 12
    new-instance v0, Lcom/facebook/cache/i;

    const-string v1, "MEDIUM"

    const/16 v2, 0x64

    invoke-direct {v0, v1, v4, v2}, Lcom/facebook/cache/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/cache/i;->MEDIUM:Lcom/facebook/cache/i;

    .line 13
    new-instance v0, Lcom/facebook/cache/i;

    const-string v1, "LOW"

    const/16 v2, 0x32

    invoke-direct {v0, v1, v5, v2}, Lcom/facebook/cache/i;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/facebook/cache/i;->LOW:Lcom/facebook/cache/i;

    .line 9
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/cache/i;

    sget-object v1, Lcom/facebook/cache/i;->HIGH:Lcom/facebook/cache/i;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/cache/i;->MEDIUM:Lcom/facebook/cache/i;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/cache/i;->LOW:Lcom/facebook/cache/i;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/cache/i;->$VALUES:[Lcom/facebook/cache/i;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 18
    iput p3, p0, Lcom/facebook/cache/i;->mPriorityValue:I

    .line 19
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/cache/i;
    .locals 1

    .prologue
    .line 9
    const-class v0, Lcom/facebook/cache/i;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/cache/i;

    return-object v0
.end method

.method public static values()[Lcom/facebook/cache/i;
    .locals 1

    .prologue
    .line 9
    sget-object v0, Lcom/facebook/cache/i;->$VALUES:[Lcom/facebook/cache/i;

    invoke-virtual {v0}, [Lcom/facebook/cache/i;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/cache/i;

    return-object v0
.end method


# virtual methods
.method public getPriorityValue()I
    .locals 1

    .prologue
    .line 25
    iget v0, p0, Lcom/facebook/cache/i;->mPriorityValue:I

    return v0
.end method
