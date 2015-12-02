.class public final enum Lcom/facebook/orca/f/ae;
.super Ljava/lang/Enum;
.source "ThreadsCache.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/f/ae;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/f/ae;

.field public static final enum PREFER_MERGED_FOLDERS:Lcom/facebook/orca/f/ae;

.field public static final enum PREFER_RAW_FOLDERS:Lcom/facebook/orca/f/ae;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 108
    new-instance v0, Lcom/facebook/orca/f/ae;

    const-string v1, "PREFER_MERGED_FOLDERS"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/f/ae;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/f/ae;->PREFER_MERGED_FOLDERS:Lcom/facebook/orca/f/ae;

    .line 109
    new-instance v0, Lcom/facebook/orca/f/ae;

    const-string v1, "PREFER_RAW_FOLDERS"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/f/ae;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/f/ae;->PREFER_RAW_FOLDERS:Lcom/facebook/orca/f/ae;

    .line 107
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/orca/f/ae;

    sget-object v1, Lcom/facebook/orca/f/ae;->PREFER_MERGED_FOLDERS:Lcom/facebook/orca/f/ae;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/f/ae;->PREFER_RAW_FOLDERS:Lcom/facebook/orca/f/ae;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/orca/f/ae;->$VALUES:[Lcom/facebook/orca/f/ae;

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
    .line 107
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/f/ae;
    .locals 1

    .prologue
    .line 107
    const-class v0, Lcom/facebook/orca/f/ae;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/f/ae;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/f/ae;
    .locals 1

    .prologue
    .line 107
    sget-object v0, Lcom/facebook/orca/f/ae;->$VALUES:[Lcom/facebook/orca/f/ae;

    invoke-virtual {v0}, [Lcom/facebook/orca/f/ae;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/f/ae;

    return-object v0
.end method
