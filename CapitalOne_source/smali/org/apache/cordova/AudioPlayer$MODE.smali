.class public final enum Lorg/apache/cordova/AudioPlayer$MODE;
.super Ljava/lang/Enum;
.source "AudioPlayer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/apache/cordova/AudioPlayer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "MODE"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/apache/cordova/AudioPlayer$MODE;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/apache/cordova/AudioPlayer$MODE;

.field public static final enum NONE:Lorg/apache/cordova/AudioPlayer$MODE;

.field public static final enum PLAY:Lorg/apache/cordova/AudioPlayer$MODE;

.field public static final enum RECORD:Lorg/apache/cordova/AudioPlayer$MODE;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 46
    new-instance v0, Lorg/apache/cordova/AudioPlayer$MODE;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lorg/apache/cordova/AudioPlayer$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/apache/cordova/AudioPlayer$MODE;->NONE:Lorg/apache/cordova/AudioPlayer$MODE;

    new-instance v0, Lorg/apache/cordova/AudioPlayer$MODE;

    const-string v1, "PLAY"

    invoke-direct {v0, v1, v3}, Lorg/apache/cordova/AudioPlayer$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/apache/cordova/AudioPlayer$MODE;->PLAY:Lorg/apache/cordova/AudioPlayer$MODE;

    new-instance v0, Lorg/apache/cordova/AudioPlayer$MODE;

    const-string v1, "RECORD"

    invoke-direct {v0, v1, v4}, Lorg/apache/cordova/AudioPlayer$MODE;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/apache/cordova/AudioPlayer$MODE;->RECORD:Lorg/apache/cordova/AudioPlayer$MODE;

    const/4 v0, 0x3

    new-array v0, v0, [Lorg/apache/cordova/AudioPlayer$MODE;

    sget-object v1, Lorg/apache/cordova/AudioPlayer$MODE;->NONE:Lorg/apache/cordova/AudioPlayer$MODE;

    aput-object v1, v0, v2

    sget-object v1, Lorg/apache/cordova/AudioPlayer$MODE;->PLAY:Lorg/apache/cordova/AudioPlayer$MODE;

    aput-object v1, v0, v3

    sget-object v1, Lorg/apache/cordova/AudioPlayer$MODE;->RECORD:Lorg/apache/cordova/AudioPlayer$MODE;

    aput-object v1, v0, v4

    sput-object v0, Lorg/apache/cordova/AudioPlayer$MODE;->$VALUES:[Lorg/apache/cordova/AudioPlayer$MODE;

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
    .line 46
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/apache/cordova/AudioPlayer$MODE;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 46
    const-class v0, Lorg/apache/cordova/AudioPlayer$MODE;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/apache/cordova/AudioPlayer$MODE;

    return-object v0
.end method

.method public static values()[Lorg/apache/cordova/AudioPlayer$MODE;
    .locals 1

    .prologue
    .line 46
    sget-object v0, Lorg/apache/cordova/AudioPlayer$MODE;->$VALUES:[Lorg/apache/cordova/AudioPlayer$MODE;

    invoke-virtual {v0}, [Lorg/apache/cordova/AudioPlayer$MODE;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/apache/cordova/AudioPlayer$MODE;

    return-object v0
.end method
