.class public final enum Lcom/facebook/webrtc/a;
.super Ljava/lang/Enum;
.source "IWebrtcUiInterface.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/webrtc/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/webrtc/a;

.field public static final enum CallEndAcceptAfterHangUp:Lcom/facebook/webrtc/a;

.field public static final enum CallEndCallerNotVisible:Lcom/facebook/webrtc/a;

.field public static final enum CallEndCarrierBlocked:Lcom/facebook/webrtc/a;

.field public static final enum CallEndClientError:Lcom/facebook/webrtc/a;

.field public static final enum CallEndClientInterrupted:Lcom/facebook/webrtc/a;

.field public static final enum CallEndConnectionDropped:Lcom/facebook/webrtc/a;

.field public static final enum CallEndHangupCall:Lcom/facebook/webrtc/a;

.field public static final enum CallEndIgnoreCall:Lcom/facebook/webrtc/a;

.field public static final enum CallEndInAnotherCall:Lcom/facebook/webrtc/a;

.field public static final enum CallEndIncomingTimeout:Lcom/facebook/webrtc/a;

.field public static final enum CallEndNoAnswerTimeout:Lcom/facebook/webrtc/a;

.field public static final enum CallEndNoPermission:Lcom/facebook/webrtc/a;

.field public static final enum CallEndNoUIError:Lcom/facebook/webrtc/a;

.field public static final enum CallEndOtherCarrierBlocked:Lcom/facebook/webrtc/a;

.field public static final enum CallEndOtherInstanceHandled:Lcom/facebook/webrtc/a;

.field public static final enum CallEndOtherNotCapable:Lcom/facebook/webrtc/a;

.field public static final enum CallEndSignalingMessageFailed:Lcom/facebook/webrtc/a;

.field public static final enum CallEndUnsupportedVersion:Lcom/facebook/webrtc/a;

.field public static final enum CallEndWebRTCError:Lcom/facebook/webrtc/a;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 67
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndIgnoreCall"

    invoke-direct {v0, v1, v3}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndIgnoreCall:Lcom/facebook/webrtc/a;

    .line 68
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndHangupCall"

    invoke-direct {v0, v1, v4}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndHangupCall:Lcom/facebook/webrtc/a;

    .line 69
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndInAnotherCall"

    invoke-direct {v0, v1, v5}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndInAnotherCall:Lcom/facebook/webrtc/a;

    .line 70
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndAcceptAfterHangUp"

    invoke-direct {v0, v1, v6}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndAcceptAfterHangUp:Lcom/facebook/webrtc/a;

    .line 71
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndNoAnswerTimeout"

    invoke-direct {v0, v1, v7}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndNoAnswerTimeout:Lcom/facebook/webrtc/a;

    .line 72
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndIncomingTimeout"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndIncomingTimeout:Lcom/facebook/webrtc/a;

    .line 73
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndOtherInstanceHandled"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndOtherInstanceHandled:Lcom/facebook/webrtc/a;

    .line 74
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndSignalingMessageFailed"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndSignalingMessageFailed:Lcom/facebook/webrtc/a;

    .line 75
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndConnectionDropped"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndConnectionDropped:Lcom/facebook/webrtc/a;

    .line 76
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndClientInterrupted"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndClientInterrupted:Lcom/facebook/webrtc/a;

    .line 77
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndWebRTCError"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndWebRTCError:Lcom/facebook/webrtc/a;

    .line 78
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndClientError"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndClientError:Lcom/facebook/webrtc/a;

    .line 79
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndNoPermission"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndNoPermission:Lcom/facebook/webrtc/a;

    .line 80
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndOtherNotCapable"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndOtherNotCapable:Lcom/facebook/webrtc/a;

    .line 81
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndNoUIError"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndNoUIError:Lcom/facebook/webrtc/a;

    .line 82
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndUnsupportedVersion"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndUnsupportedVersion:Lcom/facebook/webrtc/a;

    .line 83
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndCallerNotVisible"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndCallerNotVisible:Lcom/facebook/webrtc/a;

    .line 84
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndCarrierBlocked"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndCarrierBlocked:Lcom/facebook/webrtc/a;

    .line 85
    new-instance v0, Lcom/facebook/webrtc/a;

    const-string v1, "CallEndOtherCarrierBlocked"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Lcom/facebook/webrtc/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/webrtc/a;->CallEndOtherCarrierBlocked:Lcom/facebook/webrtc/a;

    .line 66
    const/16 v0, 0x13

    new-array v0, v0, [Lcom/facebook/webrtc/a;

    sget-object v1, Lcom/facebook/webrtc/a;->CallEndIgnoreCall:Lcom/facebook/webrtc/a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/webrtc/a;->CallEndHangupCall:Lcom/facebook/webrtc/a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/webrtc/a;->CallEndInAnotherCall:Lcom/facebook/webrtc/a;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/webrtc/a;->CallEndAcceptAfterHangUp:Lcom/facebook/webrtc/a;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/webrtc/a;->CallEndNoAnswerTimeout:Lcom/facebook/webrtc/a;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndIncomingTimeout:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndOtherInstanceHandled:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndSignalingMessageFailed:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndConnectionDropped:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndClientInterrupted:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndWebRTCError:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndClientError:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndNoPermission:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndOtherNotCapable:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndNoUIError:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndUnsupportedVersion:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndCallerNotVisible:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndCarrierBlocked:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lcom/facebook/webrtc/a;->CallEndOtherCarrierBlocked:Lcom/facebook/webrtc/a;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/webrtc/a;->$VALUES:[Lcom/facebook/webrtc/a;

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
    .line 66
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/webrtc/a;
    .locals 1

    .prologue
    .line 66
    const-class v0, Lcom/facebook/webrtc/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/webrtc/a;

    return-object v0
.end method

.method public static values()[Lcom/facebook/webrtc/a;
    .locals 1

    .prologue
    .line 66
    sget-object v0, Lcom/facebook/webrtc/a;->$VALUES:[Lcom/facebook/webrtc/a;

    invoke-virtual {v0}, [Lcom/facebook/webrtc/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/webrtc/a;

    return-object v0
.end method
