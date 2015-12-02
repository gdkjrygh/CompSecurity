.class public final enum Lcom/facebook/fbservice/service/t;
.super Ljava/lang/Enum;
.source "ErrorCode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/fbservice/service/t;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/fbservice/service/t;

.field public static final enum API_ERROR:Lcom/facebook/fbservice/service/t;

.field public static final enum CONNECTION_FAILURE:Lcom/facebook/fbservice/service/t;

.field public static final enum HTTP_400_AUTHENTICATION:Lcom/facebook/fbservice/service/t;

.field public static final enum HTTP_400_OTHER:Lcom/facebook/fbservice/service/t;

.field public static final enum HTTP_500_CLASS:Lcom/facebook/fbservice/service/t;

.field public static final enum NO_ERROR:Lcom/facebook/fbservice/service/t;

.field public static final enum ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

.field public static final enum ORCA_SERVICE_UNKNOWN_OPERATION:Lcom/facebook/fbservice/service/t;

.field public static final enum OTHER:Lcom/facebook/fbservice/service/t;

.field public static final enum OUT_OF_MEMORY:Lcom/facebook/fbservice/service/t;

.field public static final enum PHOTO_UPLOAD_FAILED:Lcom/facebook/fbservice/service/t;

.field public static final enum PHOTO_UPLOAD_NOT_COMPLETE:Lcom/facebook/fbservice/service/t;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 10
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "NO_ERROR"

    invoke-direct {v0, v1, v3}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->NO_ERROR:Lcom/facebook/fbservice/service/t;

    .line 11
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "API_ERROR"

    invoke-direct {v0, v1, v4}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    .line 12
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "HTTP_400_AUTHENTICATION"

    invoke-direct {v0, v1, v5}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->HTTP_400_AUTHENTICATION:Lcom/facebook/fbservice/service/t;

    .line 13
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "HTTP_400_OTHER"

    invoke-direct {v0, v1, v6}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->HTTP_400_OTHER:Lcom/facebook/fbservice/service/t;

    .line 14
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "HTTP_500_CLASS"

    invoke-direct {v0, v1, v7}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->HTTP_500_CLASS:Lcom/facebook/fbservice/service/t;

    .line 15
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "CONNECTION_FAILURE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->CONNECTION_FAILURE:Lcom/facebook/fbservice/service/t;

    .line 16
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "ORCA_SERVICE_UNKNOWN_OPERATION"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_UNKNOWN_OPERATION:Lcom/facebook/fbservice/service/t;

    .line 17
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "ORCA_SERVICE_IPC_FAILURE"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    .line 18
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "OUT_OF_MEMORY"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->OUT_OF_MEMORY:Lcom/facebook/fbservice/service/t;

    .line 19
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "OTHER"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->OTHER:Lcom/facebook/fbservice/service/t;

    .line 20
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "PHOTO_UPLOAD_NOT_COMPLETE"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_NOT_COMPLETE:Lcom/facebook/fbservice/service/t;

    .line 21
    new-instance v0, Lcom/facebook/fbservice/service/t;

    const-string v1, "PHOTO_UPLOAD_FAILED"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/facebook/fbservice/service/t;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_FAILED:Lcom/facebook/fbservice/service/t;

    .line 8
    const/16 v0, 0xc

    new-array v0, v0, [Lcom/facebook/fbservice/service/t;

    sget-object v1, Lcom/facebook/fbservice/service/t;->NO_ERROR:Lcom/facebook/fbservice/service/t;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/fbservice/service/t;->API_ERROR:Lcom/facebook/fbservice/service/t;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/fbservice/service/t;->HTTP_400_AUTHENTICATION:Lcom/facebook/fbservice/service/t;

    aput-object v1, v0, v5

    sget-object v1, Lcom/facebook/fbservice/service/t;->HTTP_400_OTHER:Lcom/facebook/fbservice/service/t;

    aput-object v1, v0, v6

    sget-object v1, Lcom/facebook/fbservice/service/t;->HTTP_500_CLASS:Lcom/facebook/fbservice/service/t;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/facebook/fbservice/service/t;->CONNECTION_FAILURE:Lcom/facebook/fbservice/service/t;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_UNKNOWN_OPERATION:Lcom/facebook/fbservice/service/t;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/facebook/fbservice/service/t;->ORCA_SERVICE_IPC_FAILURE:Lcom/facebook/fbservice/service/t;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/facebook/fbservice/service/t;->OUT_OF_MEMORY:Lcom/facebook/fbservice/service/t;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/facebook/fbservice/service/t;->OTHER:Lcom/facebook/fbservice/service/t;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_NOT_COMPLETE:Lcom/facebook/fbservice/service/t;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/facebook/fbservice/service/t;->PHOTO_UPLOAD_FAILED:Lcom/facebook/fbservice/service/t;

    aput-object v2, v0, v1

    sput-object v0, Lcom/facebook/fbservice/service/t;->$VALUES:[Lcom/facebook/fbservice/service/t;

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
    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/fbservice/service/t;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/facebook/fbservice/service/t;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/fbservice/service/t;

    return-object v0
.end method

.method public static values()[Lcom/facebook/fbservice/service/t;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/facebook/fbservice/service/t;->$VALUES:[Lcom/facebook/fbservice/service/t;

    invoke-virtual {v0}, [Lcom/facebook/fbservice/service/t;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/fbservice/service/t;

    return-object v0
.end method
