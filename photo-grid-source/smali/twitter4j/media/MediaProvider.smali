.class public final enum Ltwitter4j/media/MediaProvider;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Ltwitter4j/media/MediaProvider;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Ltwitter4j/media/MediaProvider;

.field public static final enum IMG_LY:Ltwitter4j/media/MediaProvider;

.field public static final enum LOCKERZ:Ltwitter4j/media/MediaProvider;

.field public static final enum MOBYPICTURE:Ltwitter4j/media/MediaProvider;

.field public static final enum PLIXI:Ltwitter4j/media/MediaProvider;

.field public static final enum POSTEROUS:Ltwitter4j/media/MediaProvider;

.field public static final enum TWIPPLE:Ltwitter4j/media/MediaProvider;

.field public static final enum TWITGOO:Ltwitter4j/media/MediaProvider;

.field public static final enum TWITPIC:Ltwitter4j/media/MediaProvider;

.field public static final enum TWITTER:Ltwitter4j/media/MediaProvider;

.field public static final enum YFROG:Ltwitter4j/media/MediaProvider;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 24
    new-instance v0, Ltwitter4j/media/MediaProvider;

    const-string v1, "TWITTER"

    invoke-direct {v0, v1, v3}, Ltwitter4j/media/MediaProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltwitter4j/media/MediaProvider;->TWITTER:Ltwitter4j/media/MediaProvider;

    new-instance v0, Ltwitter4j/media/MediaProvider;

    const-string v1, "IMG_LY"

    invoke-direct {v0, v1, v4}, Ltwitter4j/media/MediaProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltwitter4j/media/MediaProvider;->IMG_LY:Ltwitter4j/media/MediaProvider;

    new-instance v0, Ltwitter4j/media/MediaProvider;

    const-string v1, "PLIXI"

    invoke-direct {v0, v1, v5}, Ltwitter4j/media/MediaProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltwitter4j/media/MediaProvider;->PLIXI:Ltwitter4j/media/MediaProvider;

    new-instance v0, Ltwitter4j/media/MediaProvider;

    const-string v1, "LOCKERZ"

    invoke-direct {v0, v1, v6}, Ltwitter4j/media/MediaProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltwitter4j/media/MediaProvider;->LOCKERZ:Ltwitter4j/media/MediaProvider;

    new-instance v0, Ltwitter4j/media/MediaProvider;

    const-string v1, "TWIPPLE"

    invoke-direct {v0, v1, v7}, Ltwitter4j/media/MediaProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltwitter4j/media/MediaProvider;->TWIPPLE:Ltwitter4j/media/MediaProvider;

    new-instance v0, Ltwitter4j/media/MediaProvider;

    const-string v1, "TWITGOO"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Ltwitter4j/media/MediaProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltwitter4j/media/MediaProvider;->TWITGOO:Ltwitter4j/media/MediaProvider;

    new-instance v0, Ltwitter4j/media/MediaProvider;

    const-string v1, "TWITPIC"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Ltwitter4j/media/MediaProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltwitter4j/media/MediaProvider;->TWITPIC:Ltwitter4j/media/MediaProvider;

    new-instance v0, Ltwitter4j/media/MediaProvider;

    const-string v1, "YFROG"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Ltwitter4j/media/MediaProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltwitter4j/media/MediaProvider;->YFROG:Ltwitter4j/media/MediaProvider;

    new-instance v0, Ltwitter4j/media/MediaProvider;

    const-string v1, "MOBYPICTURE"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Ltwitter4j/media/MediaProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltwitter4j/media/MediaProvider;->MOBYPICTURE:Ltwitter4j/media/MediaProvider;

    new-instance v0, Ltwitter4j/media/MediaProvider;

    const-string v1, "POSTEROUS"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Ltwitter4j/media/MediaProvider;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ltwitter4j/media/MediaProvider;->POSTEROUS:Ltwitter4j/media/MediaProvider;

    .line 23
    const/16 v0, 0xa

    new-array v0, v0, [Ltwitter4j/media/MediaProvider;

    sget-object v1, Ltwitter4j/media/MediaProvider;->TWITTER:Ltwitter4j/media/MediaProvider;

    aput-object v1, v0, v3

    sget-object v1, Ltwitter4j/media/MediaProvider;->IMG_LY:Ltwitter4j/media/MediaProvider;

    aput-object v1, v0, v4

    sget-object v1, Ltwitter4j/media/MediaProvider;->PLIXI:Ltwitter4j/media/MediaProvider;

    aput-object v1, v0, v5

    sget-object v1, Ltwitter4j/media/MediaProvider;->LOCKERZ:Ltwitter4j/media/MediaProvider;

    aput-object v1, v0, v6

    sget-object v1, Ltwitter4j/media/MediaProvider;->TWIPPLE:Ltwitter4j/media/MediaProvider;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Ltwitter4j/media/MediaProvider;->TWITGOO:Ltwitter4j/media/MediaProvider;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Ltwitter4j/media/MediaProvider;->TWITPIC:Ltwitter4j/media/MediaProvider;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Ltwitter4j/media/MediaProvider;->YFROG:Ltwitter4j/media/MediaProvider;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Ltwitter4j/media/MediaProvider;->MOBYPICTURE:Ltwitter4j/media/MediaProvider;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Ltwitter4j/media/MediaProvider;->POSTEROUS:Ltwitter4j/media/MediaProvider;

    aput-object v2, v0, v1

    sput-object v0, Ltwitter4j/media/MediaProvider;->$VALUES:[Ltwitter4j/media/MediaProvider;

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
    .line 23
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Ltwitter4j/media/MediaProvider;
    .locals 1

    .prologue
    .line 23
    const-class v0, Ltwitter4j/media/MediaProvider;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Ltwitter4j/media/MediaProvider;

    return-object v0
.end method

.method public static values()[Ltwitter4j/media/MediaProvider;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Ltwitter4j/media/MediaProvider;->$VALUES:[Ltwitter4j/media/MediaProvider;

    invoke-virtual {v0}, [Ltwitter4j/media/MediaProvider;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ltwitter4j/media/MediaProvider;

    return-object v0
.end method
