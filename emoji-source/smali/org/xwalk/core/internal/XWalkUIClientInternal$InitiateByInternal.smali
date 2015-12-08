.class public final enum Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;
.super Ljava/lang/Enum;
.source "XWalkUIClientInternal.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkUIClientInternal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "InitiateByInternal"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;",
        ">;"
    }
.end annotation

.annotation build Lorg/xwalk/core/internal/XWalkAPI;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

.field public static final enum BY_JAVASCRIPT:Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

.field public static final enum BY_USER_GESTURE:Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 51
    new-instance v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    const-string v1, "BY_USER_GESTURE"

    invoke-direct {v0, v1, v2}, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;->BY_USER_GESTURE:Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    .line 52
    new-instance v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    const-string v1, "BY_JAVASCRIPT"

    invoke-direct {v0, v1, v3}, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;->BY_JAVASCRIPT:Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    .line 49
    const/4 v0, 0x2

    new-array v0, v0, [Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;->BY_USER_GESTURE:Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    aput-object v1, v0, v2

    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;->BY_JAVASCRIPT:Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    aput-object v1, v0, v3

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;->$VALUES:[Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

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
    .line 50
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 49
    const-class v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    return-object v0
.end method

.method public static values()[Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;
    .locals 1

    .prologue
    .line 49
    sget-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;->$VALUES:[Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    invoke-virtual {v0}, [Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/xwalk/core/internal/XWalkUIClientInternal$InitiateByInternal;

    return-object v0
.end method
