.class public final enum Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;
.super Ljava/lang/Enum;
.source "XWalkUIClientInternal.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkUIClientInternal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LoadStatusInternal"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;",
        ">;"
    }
.end annotation

.annotation build Lorg/xwalk/core/internal/XWalkAPI;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

.field public static final enum CANCELLED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

.field public static final enum FAILED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

.field public static final enum FINISHED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 323
    new-instance v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    const-string v1, "FINISHED"

    invoke-direct {v0, v1, v2}, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->FINISHED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .line 325
    new-instance v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    const-string v1, "FAILED"

    invoke-direct {v0, v1, v3}, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->FAILED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .line 327
    new-instance v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    const-string v1, "CANCELLED"

    invoke-direct {v0, v1, v4}, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->CANCELLED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    .line 320
    const/4 v0, 0x3

    new-array v0, v0, [Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->FINISHED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    aput-object v1, v0, v2

    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->FAILED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    aput-object v1, v0, v3

    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->CANCELLED:Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    aput-object v1, v0, v4

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->$VALUES:[Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

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
    .line 321
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 320
    const-class v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    return-object v0
.end method

.method public static values()[Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;
    .locals 1

    .prologue
    .line 320
    sget-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->$VALUES:[Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    invoke-virtual {v0}, [Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/xwalk/core/internal/XWalkUIClientInternal$LoadStatusInternal;

    return-object v0
.end method
