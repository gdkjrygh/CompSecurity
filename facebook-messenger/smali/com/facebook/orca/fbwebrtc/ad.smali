.class final enum Lcom/facebook/orca/fbwebrtc/ad;
.super Ljava/lang/Enum;
.source "WebrtcIncallActivity.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/fbwebrtc/ad;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/fbwebrtc/ad;

.field public static final enum CONNECTING:Lcom/facebook/orca/fbwebrtc/ad;

.field public static final enum IN_CALL:Lcom/facebook/orca/fbwebrtc/ad;

.field public static final enum NONE:Lcom/facebook/orca/fbwebrtc/ad;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 917
    new-instance v0, Lcom/facebook/orca/fbwebrtc/ad;

    const-string v1, "NONE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/fbwebrtc/ad;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/fbwebrtc/ad;->NONE:Lcom/facebook/orca/fbwebrtc/ad;

    .line 918
    new-instance v0, Lcom/facebook/orca/fbwebrtc/ad;

    const-string v1, "CONNECTING"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/fbwebrtc/ad;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/fbwebrtc/ad;->CONNECTING:Lcom/facebook/orca/fbwebrtc/ad;

    .line 919
    new-instance v0, Lcom/facebook/orca/fbwebrtc/ad;

    const-string v1, "IN_CALL"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/fbwebrtc/ad;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/fbwebrtc/ad;->IN_CALL:Lcom/facebook/orca/fbwebrtc/ad;

    .line 916
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/fbwebrtc/ad;

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ad;->NONE:Lcom/facebook/orca/fbwebrtc/ad;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ad;->CONNECTING:Lcom/facebook/orca/fbwebrtc/ad;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/fbwebrtc/ad;->IN_CALL:Lcom/facebook/orca/fbwebrtc/ad;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/fbwebrtc/ad;->$VALUES:[Lcom/facebook/orca/fbwebrtc/ad;

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
    .line 916
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/fbwebrtc/ad;
    .locals 1

    .prologue
    .line 916
    const-class v0, Lcom/facebook/orca/fbwebrtc/ad;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/fbwebrtc/ad;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/fbwebrtc/ad;
    .locals 1

    .prologue
    .line 916
    sget-object v0, Lcom/facebook/orca/fbwebrtc/ad;->$VALUES:[Lcom/facebook/orca/fbwebrtc/ad;

    invoke-virtual {v0}, [Lcom/facebook/orca/fbwebrtc/ad;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/fbwebrtc/ad;

    return-object v0
.end method
