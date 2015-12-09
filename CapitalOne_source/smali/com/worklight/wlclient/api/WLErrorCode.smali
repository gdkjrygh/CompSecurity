.class public final enum Lcom/worklight/wlclient/api/WLErrorCode;
.super Ljava/lang/Enum;
.source "WLErrorCode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/worklight/wlclient/api/WLErrorCode;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum APP_VERSION_ACCESS_DENIAL:Lcom/worklight/wlclient/api/WLErrorCode;

.field public static final enum APP_VERSION_ACCESS_NOTIFY:Lcom/worklight/wlclient/api/WLErrorCode;

.field private static final synthetic ENUM$VALUES:[Lcom/worklight/wlclient/api/WLErrorCode;

.field public static final enum PROCEDURE_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

.field public static final enum REQUEST_TIMEOUT:Lcom/worklight/wlclient/api/WLErrorCode;

.field public static final enum UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

.field public static final enum UNRESPONSIVE_HOST:Lcom/worklight/wlclient/api/WLErrorCode;


# instance fields
.field private final description:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .prologue
    const/4 v8, 0x4

    const/4 v7, 0x3

    const/4 v6, 0x2

    const/4 v5, 0x1

    const/4 v4, 0x0

    .line 20
    new-instance v0, Lcom/worklight/wlclient/api/WLErrorCode;

    const-string v1, "UNEXPECTED_ERROR"

    const-string v2, "Unexpected errorCode occurred. Please try again."

    invoke-direct {v0, v1, v4, v2}, Lcom/worklight/wlclient/api/WLErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/wlclient/api/WLErrorCode;->UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    .line 21
    new-instance v0, Lcom/worklight/wlclient/api/WLErrorCode;

    const-string v1, "REQUEST_TIMEOUT"

    const-string v2, "Request timed out."

    invoke-direct {v0, v1, v5, v2}, Lcom/worklight/wlclient/api/WLErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/wlclient/api/WLErrorCode;->REQUEST_TIMEOUT:Lcom/worklight/wlclient/api/WLErrorCode;

    .line 22
    new-instance v0, Lcom/worklight/wlclient/api/WLErrorCode;

    const-string v1, "UNRESPONSIVE_HOST"

    const-string v2, "The service is currently not available."

    invoke-direct {v0, v1, v6, v2}, Lcom/worklight/wlclient/api/WLErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/wlclient/api/WLErrorCode;->UNRESPONSIVE_HOST:Lcom/worklight/wlclient/api/WLErrorCode;

    .line 23
    new-instance v0, Lcom/worklight/wlclient/api/WLErrorCode;

    const-string v1, "PROCEDURE_ERROR"

    const-string v2, "Procedure invocation errorCode."

    invoke-direct {v0, v1, v7, v2}, Lcom/worklight/wlclient/api/WLErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/wlclient/api/WLErrorCode;->PROCEDURE_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    .line 24
    new-instance v0, Lcom/worklight/wlclient/api/WLErrorCode;

    const-string v1, "APP_VERSION_ACCESS_DENIAL"

    const-string v2, "Application version denied."

    invoke-direct {v0, v1, v8, v2}, Lcom/worklight/wlclient/api/WLErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/wlclient/api/WLErrorCode;->APP_VERSION_ACCESS_DENIAL:Lcom/worklight/wlclient/api/WLErrorCode;

    .line 25
    new-instance v0, Lcom/worklight/wlclient/api/WLErrorCode;

    const-string v1, "APP_VERSION_ACCESS_NOTIFY"

    const/4 v2, 0x5

    const-string v3, "Notify application version changed."

    invoke-direct {v0, v1, v2, v3}, Lcom/worklight/wlclient/api/WLErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/wlclient/api/WLErrorCode;->APP_VERSION_ACCESS_NOTIFY:Lcom/worklight/wlclient/api/WLErrorCode;

    .line 19
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/worklight/wlclient/api/WLErrorCode;

    sget-object v1, Lcom/worklight/wlclient/api/WLErrorCode;->UNEXPECTED_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/worklight/wlclient/api/WLErrorCode;->REQUEST_TIMEOUT:Lcom/worklight/wlclient/api/WLErrorCode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/worklight/wlclient/api/WLErrorCode;->UNRESPONSIVE_HOST:Lcom/worklight/wlclient/api/WLErrorCode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/worklight/wlclient/api/WLErrorCode;->PROCEDURE_ERROR:Lcom/worklight/wlclient/api/WLErrorCode;

    aput-object v1, v0, v7

    sget-object v1, Lcom/worklight/wlclient/api/WLErrorCode;->APP_VERSION_ACCESS_DENIAL:Lcom/worklight/wlclient/api/WLErrorCode;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/worklight/wlclient/api/WLErrorCode;->APP_VERSION_ACCESS_NOTIFY:Lcom/worklight/wlclient/api/WLErrorCode;

    aput-object v2, v0, v1

    sput-object v0, Lcom/worklight/wlclient/api/WLErrorCode;->ENUM$VALUES:[Lcom/worklight/wlclient/api/WLErrorCode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p3, "description"    # Ljava/lang/String;

    .prologue
    .line 29
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 30
    iput-object p3, p0, Lcom/worklight/wlclient/api/WLErrorCode;->description:Ljava/lang/String;

    .line 31
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/worklight/wlclient/api/WLErrorCode;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/worklight/wlclient/api/WLErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/worklight/wlclient/api/WLErrorCode;

    return-object v0
.end method

.method public static values()[Lcom/worklight/wlclient/api/WLErrorCode;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/worklight/wlclient/api/WLErrorCode;->ENUM$VALUES:[Lcom/worklight/wlclient/api/WLErrorCode;

    array-length v1, v0

    new-array v2, v1, [Lcom/worklight/wlclient/api/WLErrorCode;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 34
    iget-object v0, p0, Lcom/worklight/wlclient/api/WLErrorCode;->description:Ljava/lang/String;

    return-object v0
.end method
