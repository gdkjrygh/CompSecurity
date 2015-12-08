.class final enum Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;
.super Ljava/lang/Enum;
.source "XWalkLaunchScreenManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkLaunchScreenManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "ReadyWhenType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

.field public static final enum COMPLETE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

.field public static final enum CUSTOM:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

.field public static final enum FIRST_PAINT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

.field public static final enum USER_INTERACTIVE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 74
    new-instance v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    const-string v1, "FIRST_PAINT"

    invoke-direct {v0, v1, v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->FIRST_PAINT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    .line 75
    new-instance v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    const-string v1, "USER_INTERACTIVE"

    invoke-direct {v0, v1, v3}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->USER_INTERACTIVE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    .line 76
    new-instance v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    const-string v1, "COMPLETE"

    invoke-direct {v0, v1, v4}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->COMPLETE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    .line 77
    new-instance v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    const-string v1, "CUSTOM"

    invoke-direct {v0, v1, v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->CUSTOM:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    .line 73
    const/4 v0, 0x4

    new-array v0, v0, [Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->FIRST_PAINT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    aput-object v1, v0, v2

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->USER_INTERACTIVE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    aput-object v1, v0, v3

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->COMPLETE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    aput-object v1, v0, v4

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->CUSTOM:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    aput-object v1, v0, v5

    sput-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->$VALUES:[Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

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
    .line 73
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 73
    const-class v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    return-object v0
.end method

.method public static values()[Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;
    .locals 1

    .prologue
    .line 73
    sget-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->$VALUES:[Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    invoke-virtual {v0}, [Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/xwalk/core/internal/XWalkLaunchScreenManager$ReadyWhenType;

    return-object v0
.end method
