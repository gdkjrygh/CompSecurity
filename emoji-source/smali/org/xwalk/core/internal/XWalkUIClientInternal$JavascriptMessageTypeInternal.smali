.class public final enum Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;
.super Ljava/lang/Enum;
.source "XWalkUIClientInternal.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/xwalk/core/internal/XWalkUIClientInternal;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "JavascriptMessageTypeInternal"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;",
        ">;"
    }
.end annotation

.annotation build Lorg/xwalk/core/internal/XWalkAPI;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

.field public static final enum JAVASCRIPT_ALERT:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

.field public static final enum JAVASCRIPT_BEFOREUNLOAD:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

.field public static final enum JAVASCRIPT_CONFIRM:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

.field public static final enum JAVASCRIPT_PROMPT:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 146
    new-instance v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    const-string v1, "JAVASCRIPT_ALERT"

    invoke-direct {v0, v1, v2}, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_ALERT:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    .line 148
    new-instance v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    const-string v1, "JAVASCRIPT_CONFIRM"

    invoke-direct {v0, v1, v3}, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_CONFIRM:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    .line 150
    new-instance v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    const-string v1, "JAVASCRIPT_PROMPT"

    invoke-direct {v0, v1, v4}, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_PROMPT:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    .line 152
    new-instance v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    const-string v1, "JAVASCRIPT_BEFOREUNLOAD"

    invoke-direct {v0, v1, v5}, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_BEFOREUNLOAD:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    .line 143
    const/4 v0, 0x4

    new-array v0, v0, [Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_ALERT:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    aput-object v1, v0, v2

    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_CONFIRM:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    aput-object v1, v0, v3

    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_PROMPT:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    aput-object v1, v0, v4

    sget-object v1, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->JAVASCRIPT_BEFOREUNLOAD:Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    aput-object v1, v0, v5

    sput-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->$VALUES:[Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

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
    .line 144
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 143
    const-class v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    return-object v0
.end method

.method public static values()[Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;
    .locals 1

    .prologue
    .line 143
    sget-object v0, Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->$VALUES:[Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    invoke-virtual {v0}, [Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lorg/xwalk/core/internal/XWalkUIClientInternal$JavascriptMessageTypeInternal;

    return-object v0
.end method
