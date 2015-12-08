.class public final enum Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

.field public static final enum AUTHENTICATION_REOPEN_SESSION:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

.field public static final enum AUTHENTICATION_RETRY:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

.field public static final enum BAD_REQUEST:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

.field public static final enum CLIENT:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

.field public static final enum OTHER:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

.field public static final enum PERMISSION:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

.field public static final enum SERVER:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

.field public static final enum THROTTLING:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 351
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    const-string v1, "AUTHENTICATION_RETRY"

    invoke-direct {v0, v1, v3}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->AUTHENTICATION_RETRY:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 357
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    const-string v1, "AUTHENTICATION_REOPEN_SESSION"

    invoke-direct {v0, v1, v4}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->AUTHENTICATION_REOPEN_SESSION:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 360
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    const-string v1, "PERMISSION"

    invoke-direct {v0, v1, v5}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->PERMISSION:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 366
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    const-string v1, "SERVER"

    invoke-direct {v0, v1, v6}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->SERVER:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 369
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    const-string v1, "THROTTLING"

    invoke-direct {v0, v1, v7}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->THROTTLING:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 375
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    const-string v1, "OTHER"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->OTHER:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 381
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    const-string v1, "BAD_REQUEST"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->BAD_REQUEST:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 387
    new-instance v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    const-string v1, "CLIENT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->CLIENT:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    .line 346
    const/16 v0, 0x8

    new-array v0, v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->AUTHENTICATION_RETRY:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    aput-object v1, v0, v3

    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->AUTHENTICATION_REOPEN_SESSION:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    aput-object v1, v0, v4

    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->PERMISSION:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    aput-object v1, v0, v5

    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->SERVER:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    aput-object v1, v0, v6

    sget-object v1, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->THROTTLING:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->OTHER:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->BAD_REQUEST:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->CLIENT:Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    aput-object v2, v0, v1

    sput-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->$VALUES:[Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

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
    .line 346
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;
    .locals 1

    .prologue
    .line 346
    const-class v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    return-object v0
.end method

.method public static values()[Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;
    .locals 1

    .prologue
    .line 346
    sget-object v0, Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->$VALUES:[Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    invoke-virtual {v0}, [Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/cleanmaster/sdk/cmloginsdkjar/CmLoginSdkRequestError$Category;

    return-object v0
.end method
