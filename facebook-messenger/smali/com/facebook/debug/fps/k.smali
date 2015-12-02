.class public final enum Lcom/facebook/debug/fps/k;
.super Ljava/lang/Enum;
.source "FpsEnableFlag.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/debug/fps/k;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/debug/fps/k;

.field public static final enum ENABLE:Lcom/facebook/debug/fps/k;

.field public static final enum ENABLE_FLUSH_DATA_ON_PAUSE:Lcom/facebook/debug/fps/k;

.field public static final enum ENABLE_FRAME_COUNTER:Lcom/facebook/debug/fps/k;

.field public static final enum ENABLE_OUTPUT_TO_LOGCAT:Lcom/facebook/debug/fps/k;

.field public static final enum ENABLE_RECORD_DATA:Lcom/facebook/debug/fps/k;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 10
    new-instance v0, Lcom/facebook/debug/fps/k;

    const-string v1, "ENABLE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/debug/fps/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/debug/fps/k;->ENABLE:Lcom/facebook/debug/fps/k;

    .line 13
    new-instance v0, Lcom/facebook/debug/fps/k;

    const-string v1, "ENABLE_RECORD_DATA"

    invoke-direct {v0, v1, v3}, Lcom/facebook/debug/fps/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/debug/fps/k;->ENABLE_RECORD_DATA:Lcom/facebook/debug/fps/k;

    .line 16
    new-instance v0, Lcom/facebook/debug/fps/k;

    const-string v1, "ENABLE_OUTPUT_TO_LOGCAT"

    invoke-direct {v0, v1, v4}, Lcom/facebook/debug/fps/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/debug/fps/k;->ENABLE_OUTPUT_TO_LOGCAT:Lcom/facebook/debug/fps/k;

    .line 19
    new-instance v0, Lcom/facebook/debug/fps/k;

    const-string v1, "ENABLE_FRAME_COUNTER"

    invoke-direct {v0, v1, v5}, Lcom/facebook/debug/fps/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/debug/fps/k;->ENABLE_FRAME_COUNTER:Lcom/facebook/debug/fps/k;

    .line 22
    new-instance v0, Lcom/facebook/debug/fps/k;

    const-string v1, "ENABLE_FLUSH_DATA_ON_PAUSE"

    invoke-direct {v0, v1, v6}, Lcom/facebook/debug/fps/k;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/debug/fps/k;->ENABLE_FLUSH_DATA_ON_PAUSE:Lcom/facebook/debug/fps/k;

    .line 8
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/facebook/debug/fps/k;

    sget-object v1, Lcom/facebook/debug/fps/k;->ENABLE:Lcom/facebook/debug/fps/k;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/debug/fps/k;->ENABLE_RECORD_DATA:Lcom/facebook/debug/fps/k;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/debug/fps/k;->ENABLE_OUTPUT_TO_LOGCAT:Lcom/facebook/debug/fps/k;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/debug/fps/k;->ENABLE_FRAME_COUNTER:Lcom/facebook/debug/fps/k;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/debug/fps/k;->ENABLE_FLUSH_DATA_ON_PAUSE:Lcom/facebook/debug/fps/k;

    aput-object v1, v0, v6

    sput-object v0, Lcom/facebook/debug/fps/k;->$VALUES:[Lcom/facebook/debug/fps/k;

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

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/debug/fps/k;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/debug/fps/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/debug/fps/k;

    return-object v0
.end method

.method public static values()[Lcom/facebook/debug/fps/k;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/debug/fps/k;->$VALUES:[Lcom/facebook/debug/fps/k;

    invoke-virtual {v0}, [Lcom/facebook/debug/fps/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/debug/fps/k;

    return-object v0
.end method
