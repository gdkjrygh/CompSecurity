.class public final enum Lcom/cleanmaster/net/ResponseCode;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum AuthError:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum BadRequest:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum Canced:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum Conflict:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum DEFAULT:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum Failed:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum Forbidden:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum GZipError:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum IOError:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum InternalError:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum NeedReRequst:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum NetworkError:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum NotFound:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum ParamError:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum ParseError:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum Succeed:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum Timeout:Lcom/cleanmaster/net/ResponseCode;

.field public static final enum UnAuthorized:Lcom/cleanmaster/net/ResponseCode;

.field private static final synthetic a:[Lcom/cleanmaster/net/ResponseCode;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 12
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "Succeed"

    invoke-direct {v0, v1, v3}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->Succeed:Lcom/cleanmaster/net/ResponseCode;

    .line 17
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "Timeout"

    invoke-direct {v0, v1, v4}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->Timeout:Lcom/cleanmaster/net/ResponseCode;

    .line 22
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "NetworkError"

    invoke-direct {v0, v1, v5}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->NetworkError:Lcom/cleanmaster/net/ResponseCode;

    .line 27
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "AuthError"

    invoke-direct {v0, v1, v6}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->AuthError:Lcom/cleanmaster/net/ResponseCode;

    .line 32
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "ParamError"

    invoke-direct {v0, v1, v7}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->ParamError:Lcom/cleanmaster/net/ResponseCode;

    .line 37
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "Failed"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->Failed:Lcom/cleanmaster/net/ResponseCode;

    .line 41
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "BadRequest"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->BadRequest:Lcom/cleanmaster/net/ResponseCode;

    .line 45
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "UnAuthorized"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->UnAuthorized:Lcom/cleanmaster/net/ResponseCode;

    .line 49
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "Forbidden"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->Forbidden:Lcom/cleanmaster/net/ResponseCode;

    .line 53
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "NotFound"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->NotFound:Lcom/cleanmaster/net/ResponseCode;

    .line 57
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "Conflict"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->Conflict:Lcom/cleanmaster/net/ResponseCode;

    .line 61
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "InternalError"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->InternalError:Lcom/cleanmaster/net/ResponseCode;

    .line 66
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "Canced"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->Canced:Lcom/cleanmaster/net/ResponseCode;

    .line 71
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "NeedReRequst"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->NeedReRequst:Lcom/cleanmaster/net/ResponseCode;

    .line 76
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "GZipError"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->GZipError:Lcom/cleanmaster/net/ResponseCode;

    .line 81
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "ParseError"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->ParseError:Lcom/cleanmaster/net/ResponseCode;

    .line 86
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "IOError"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->IOError:Lcom/cleanmaster/net/ResponseCode;

    .line 87
    new-instance v0, Lcom/cleanmaster/net/ResponseCode;

    const-string v1, "DEFAULT"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/net/ResponseCode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->DEFAULT:Lcom/cleanmaster/net/ResponseCode;

    .line 8
    const/16 v0, 0x12

    new-array v0, v0, [Lcom/cleanmaster/net/ResponseCode;

    sget-object v1, Lcom/cleanmaster/net/ResponseCode;->Succeed:Lcom/cleanmaster/net/ResponseCode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/cleanmaster/net/ResponseCode;->Timeout:Lcom/cleanmaster/net/ResponseCode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/cleanmaster/net/ResponseCode;->NetworkError:Lcom/cleanmaster/net/ResponseCode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/cleanmaster/net/ResponseCode;->AuthError:Lcom/cleanmaster/net/ResponseCode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/cleanmaster/net/ResponseCode;->ParamError:Lcom/cleanmaster/net/ResponseCode;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->Failed:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->BadRequest:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->UnAuthorized:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->Forbidden:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->NotFound:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->Conflict:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->InternalError:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->Canced:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->NeedReRequst:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->GZipError:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->ParseError:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->IOError:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/cleanmaster/net/ResponseCode;->DEFAULT:Lcom/cleanmaster/net/ResponseCode;

    aput-object v2, v0, v1

    sput-object v0, Lcom/cleanmaster/net/ResponseCode;->a:[Lcom/cleanmaster/net/ResponseCode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/cleanmaster/net/ResponseCode;
    .locals 1

    .prologue
    .line 8
    const-class v0, Lcom/cleanmaster/net/ResponseCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/net/ResponseCode;

    return-object v0
.end method

.method public static values()[Lcom/cleanmaster/net/ResponseCode;
    .locals 1

    .prologue
    .line 8
    sget-object v0, Lcom/cleanmaster/net/ResponseCode;->a:[Lcom/cleanmaster/net/ResponseCode;

    invoke-virtual {v0}, [Lcom/cleanmaster/net/ResponseCode;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/cleanmaster/net/ResponseCode;

    return-object v0
.end method
