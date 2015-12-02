.class final enum Lcom/facebook/l/h;
.super Ljava/lang/Enum;
.source "MusicPresenceHandler.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/l/h;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/l/h;

.field public static final enum MUSIC_IS_NOT_PLAYING:Lcom/facebook/l/h;

.field public static final enum MUSIC_IS_PLAYING:Lcom/facebook/l/h;

.field public static final enum UNKNOWN:Lcom/facebook/l/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 57
    new-instance v0, Lcom/facebook/l/h;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v2}, Lcom/facebook/l/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/l/h;->UNKNOWN:Lcom/facebook/l/h;

    new-instance v0, Lcom/facebook/l/h;

    const-string v1, "MUSIC_IS_PLAYING"

    invoke-direct {v0, v1, v3}, Lcom/facebook/l/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/l/h;->MUSIC_IS_PLAYING:Lcom/facebook/l/h;

    new-instance v0, Lcom/facebook/l/h;

    const-string v1, "MUSIC_IS_NOT_PLAYING"

    invoke-direct {v0, v1, v4}, Lcom/facebook/l/h;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/l/h;->MUSIC_IS_NOT_PLAYING:Lcom/facebook/l/h;

    .line 56
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/l/h;

    sget-object v1, Lcom/facebook/l/h;->UNKNOWN:Lcom/facebook/l/h;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/l/h;->MUSIC_IS_PLAYING:Lcom/facebook/l/h;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/l/h;->MUSIC_IS_NOT_PLAYING:Lcom/facebook/l/h;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/l/h;->$VALUES:[Lcom/facebook/l/h;

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
    .line 56
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/l/h;
    .locals 1

    .prologue
    .line 56
    const-class v0, Lcom/facebook/l/h;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/l/h;

    return-object v0
.end method

.method public static values()[Lcom/facebook/l/h;
    .locals 1

    .prologue
    .line 56
    sget-object v0, Lcom/facebook/l/h;->$VALUES:[Lcom/facebook/l/h;

    invoke-virtual {v0}, [Lcom/facebook/l/h;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/l/h;

    return-object v0
.end method
