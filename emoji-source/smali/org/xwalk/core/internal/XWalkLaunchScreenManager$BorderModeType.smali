.class final enum Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
.super Ljava/lang/Enum;
.source "XWalkLaunchScreenManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkLaunchScreenManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "BorderModeType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

.field public static final enum NONE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

.field public static final enum REPEAT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

.field public static final enum ROUND:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

.field public static final enum STRETCH:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 81
    new-instance v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    const-string v1, "REPEAT"

    invoke-direct {v0, v1, v2}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->REPEAT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    .line 82
    new-instance v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    const-string v1, "STRETCH"

    invoke-direct {v0, v1, v3}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->STRETCH:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    .line 83
    new-instance v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    const-string v1, "ROUND"

    invoke-direct {v0, v1, v4}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->ROUND:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    .line 84
    new-instance v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v5}, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->NONE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    .line 80
    const/4 v0, 0x4

    new-array v0, v0, [Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->REPEAT:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    aput-object v1, v0, v2

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->STRETCH:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    aput-object v1, v0, v3

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->ROUND:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    aput-object v1, v0, v4

    sget-object v1, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->NONE:Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    aput-object v1, v0, v5

    sput-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->$VALUES:[Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

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
    .line 80
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 80
    const-class v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    return-object v0
.end method

.method public static values()[Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;
    .locals 1

    .prologue
    .line 80
    sget-object v0, Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->$VALUES:[Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    invoke-virtual {v0}, [Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/xwalk/core/internal/XWalkLaunchScreenManager$BorderModeType;

    return-object v0
.end method
