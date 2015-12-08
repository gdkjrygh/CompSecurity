.class public final enum Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;
.super Ljava/lang/Enum;
.source "XWalkDevToolsServer.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkDevToolsServer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Security"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

.field public static final enum ALLOW_DEBUG_PERMISSION:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

.field public static final enum ALLOW_SOCKET_ACCESS:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

.field public static final enum DEFAULT:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 25
    new-instance v0, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    const-string v1, "DEFAULT"

    invoke-direct {v0, v1, v2}, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->DEFAULT:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    .line 29
    new-instance v0, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    const-string v1, "ALLOW_DEBUG_PERMISSION"

    invoke-direct {v0, v1, v3}, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->ALLOW_DEBUG_PERMISSION:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    .line 32
    new-instance v0, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    const-string v1, "ALLOW_SOCKET_ACCESS"

    invoke-direct {v0, v1, v4}, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->ALLOW_SOCKET_ACCESS:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    .line 23
    const/4 v0, 0x3

    new-array v0, v0, [Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    sget-object v1, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->DEFAULT:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    aput-object v1, v0, v2

    sget-object v1, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->ALLOW_DEBUG_PERMISSION:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    aput-object v1, v0, v3

    sget-object v1, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->ALLOW_SOCKET_ACCESS:Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    aput-object v1, v0, v4

    sput-object v0, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->$VALUES:[Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

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

.method public static valueOf(Ljava/lang/String;)Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 23
    const-class v0, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    return-object v0
.end method

.method public static values()[Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;
    .locals 1

    .prologue
    .line 23
    sget-object v0, Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->$VALUES:[Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    invoke-virtual {v0}, [Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/xwalk/core/internal/XWalkDevToolsServer$Security;

    return-object v0
.end method
