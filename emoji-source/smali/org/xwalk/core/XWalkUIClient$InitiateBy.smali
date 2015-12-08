.class public final enum Lorg/xwalk/core/XWalkUIClient$InitiateBy;
.super Ljava/lang/Enum;
.source "XWalkUIClient.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/XWalkUIClient;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "InitiateBy"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/xwalk/core/XWalkUIClient$InitiateBy;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/xwalk/core/XWalkUIClient$InitiateBy;

.field public static final enum BY_JAVASCRIPT:Lorg/xwalk/core/XWalkUIClient$InitiateBy;

.field public static final enum BY_USER_GESTURE:Lorg/xwalk/core/XWalkUIClient$InitiateBy;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 59
    new-instance v0, Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    const-string v1, "BY_USER_GESTURE"

    invoke-direct {v0, v1, v2}, Lorg/xwalk/core/XWalkUIClient$InitiateBy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/XWalkUIClient$InitiateBy;->BY_USER_GESTURE:Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    .line 60
    new-instance v0, Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    const-string v1, "BY_JAVASCRIPT"

    invoke-direct {v0, v1, v3}, Lorg/xwalk/core/XWalkUIClient$InitiateBy;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/XWalkUIClient$InitiateBy;->BY_JAVASCRIPT:Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    .line 58
    const/4 v0, 0x2

    new-array v0, v0, [Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    sget-object v1, Lorg/xwalk/core/XWalkUIClient$InitiateBy;->BY_USER_GESTURE:Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    aput-object v1, v0, v2

    sget-object v1, Lorg/xwalk/core/XWalkUIClient$InitiateBy;->BY_JAVASCRIPT:Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    aput-object v1, v0, v3

    sput-object v0, Lorg/xwalk/core/XWalkUIClient$InitiateBy;->$VALUES:[Lorg/xwalk/core/XWalkUIClient$InitiateBy;

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
    .line 58
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/xwalk/core/XWalkUIClient$InitiateBy;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 58
    const-class v0, Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    return-object v0
.end method

.method public static values()[Lorg/xwalk/core/XWalkUIClient$InitiateBy;
    .locals 1

    .prologue
    .line 58
    sget-object v0, Lorg/xwalk/core/XWalkUIClient$InitiateBy;->$VALUES:[Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    invoke-virtual {v0}, [Lorg/xwalk/core/XWalkUIClient$InitiateBy;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/xwalk/core/XWalkUIClient$InitiateBy;

    return-object v0
.end method
