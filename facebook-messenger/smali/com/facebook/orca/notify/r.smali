.class final enum Lcom/facebook/orca/notify/r;
.super Ljava/lang/Enum;
.source "InAppMessagingNotificationHandler.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/notify/r;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/notify/r;

.field public static final enum FADE_OUT:Lcom/facebook/orca/notify/r;

.field public static final enum NONE:Lcom/facebook/orca/notify/r;

.field public static final enum SLIDE_OUT:Lcom/facebook/orca/notify/r;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 58
    new-instance v0, Lcom/facebook/orca/notify/r;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/notify/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/notify/r;->NONE:Lcom/facebook/orca/notify/r;

    .line 59
    new-instance v0, Lcom/facebook/orca/notify/r;

    const-string v1, "SLIDE_OUT"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/notify/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/notify/r;->SLIDE_OUT:Lcom/facebook/orca/notify/r;

    .line 60
    new-instance v0, Lcom/facebook/orca/notify/r;

    const-string v1, "FADE_OUT"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/notify/r;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/notify/r;->FADE_OUT:Lcom/facebook/orca/notify/r;

    .line 57
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/notify/r;

    sget-object v1, Lcom/facebook/orca/notify/r;->NONE:Lcom/facebook/orca/notify/r;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/notify/r;->SLIDE_OUT:Lcom/facebook/orca/notify/r;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/notify/r;->FADE_OUT:Lcom/facebook/orca/notify/r;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/notify/r;->$VALUES:[Lcom/facebook/orca/notify/r;

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
    .line 57
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/notify/r;
    .locals 1

    .prologue
    .line 57
    const-class v0, Lcom/facebook/orca/notify/r;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/notify/r;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/notify/r;
    .locals 1

    .prologue
    .line 57
    sget-object v0, Lcom/facebook/orca/notify/r;->$VALUES:[Lcom/facebook/orca/notify/r;

    invoke-virtual {v0}, [Lcom/facebook/orca/notify/r;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/notify/r;

    return-object v0
.end method
