.class public final enum Lcom/worklight/androidgap/push/GCMErrorCode;
.super Ljava/lang/Enum;
.source "GCMErrorCode.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/worklight/androidgap/push/GCMErrorCode;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ACCOUNT_MISSING:Lcom/worklight/androidgap/push/GCMErrorCode;

.field public static final enum AUTHENTICATION_FAILED:Lcom/worklight/androidgap/push/GCMErrorCode;

.field private static final synthetic ENUM$VALUES:[Lcom/worklight/androidgap/push/GCMErrorCode;

.field public static final enum INVALID_PARAMETERS:Lcom/worklight/androidgap/push/GCMErrorCode;

.field public static final enum INVALID_SENDER:Lcom/worklight/androidgap/push/GCMErrorCode;

.field public static final enum PHONE_REGISTRATION_ERROR:Lcom/worklight/androidgap/push/GCMErrorCode;

.field public static final enum SERVICE_NOT_AVAILABLE:Lcom/worklight/androidgap/push/GCMErrorCode;

.field public static final enum TOO_MANY_REGISTRATIONS:Lcom/worklight/androidgap/push/GCMErrorCode;

.field public static final enum UNEXPECTED:Lcom/worklight/androidgap/push/GCMErrorCode;


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

    .line 21
    new-instance v0, Lcom/worklight/androidgap/push/GCMErrorCode;

    const-string v1, "SERVICE_NOT_AVAILABLE"

    const-string v2, "Push Service: The device can\'t read the response, or there was a 500/503 from the server that can be retried later."

    invoke-direct {v0, v1, v4, v2}, Lcom/worklight/androidgap/push/GCMErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/androidgap/push/GCMErrorCode;->SERVICE_NOT_AVAILABLE:Lcom/worklight/androidgap/push/GCMErrorCode;

    .line 22
    new-instance v0, Lcom/worklight/androidgap/push/GCMErrorCode;

    const-string v1, "ACCOUNT_MISSING"

    const-string v2, "Push Service: There is no Google account on the phone."

    invoke-direct {v0, v1, v5, v2}, Lcom/worklight/androidgap/push/GCMErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/androidgap/push/GCMErrorCode;->ACCOUNT_MISSING:Lcom/worklight/androidgap/push/GCMErrorCode;

    .line 23
    new-instance v0, Lcom/worklight/androidgap/push/GCMErrorCode;

    const-string v1, "AUTHENTICATION_FAILED"

    const-string v2, "Push Service: Bad password."

    invoke-direct {v0, v1, v6, v2}, Lcom/worklight/androidgap/push/GCMErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/androidgap/push/GCMErrorCode;->AUTHENTICATION_FAILED:Lcom/worklight/androidgap/push/GCMErrorCode;

    .line 24
    new-instance v0, Lcom/worklight/androidgap/push/GCMErrorCode;

    const-string v1, "TOO_MANY_REGISTRATIONS"

    const-string v2, "Push Service: The user has too many applications registered."

    invoke-direct {v0, v1, v7, v2}, Lcom/worklight/androidgap/push/GCMErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/androidgap/push/GCMErrorCode;->TOO_MANY_REGISTRATIONS:Lcom/worklight/androidgap/push/GCMErrorCode;

    .line 25
    new-instance v0, Lcom/worklight/androidgap/push/GCMErrorCode;

    const-string v1, "INVALID_SENDER"

    const-string v2, "Push Service: The sender account is not recognized."

    invoke-direct {v0, v1, v8, v2}, Lcom/worklight/androidgap/push/GCMErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/androidgap/push/GCMErrorCode;->INVALID_SENDER:Lcom/worklight/androidgap/push/GCMErrorCode;

    .line 26
    new-instance v0, Lcom/worklight/androidgap/push/GCMErrorCode;

    const-string v1, "PHONE_REGISTRATION_ERROR"

    const/4 v2, 0x5

    const-string v3, "Push Service: Incorrect phone registration with Google."

    invoke-direct {v0, v1, v2, v3}, Lcom/worklight/androidgap/push/GCMErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/androidgap/push/GCMErrorCode;->PHONE_REGISTRATION_ERROR:Lcom/worklight/androidgap/push/GCMErrorCode;

    .line 27
    new-instance v0, Lcom/worklight/androidgap/push/GCMErrorCode;

    const-string v1, "INVALID_PARAMETERS"

    const/4 v2, 0x6

    const-string v3, "Push Service: Invalid parameter for email sender."

    invoke-direct {v0, v1, v2, v3}, Lcom/worklight/androidgap/push/GCMErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/androidgap/push/GCMErrorCode;->INVALID_PARAMETERS:Lcom/worklight/androidgap/push/GCMErrorCode;

    .line 28
    new-instance v0, Lcom/worklight/androidgap/push/GCMErrorCode;

    const-string v1, "UNEXPECTED"

    const/4 v2, 0x7

    const-string v3, "Push Service: Unexpected error from google gcm service"

    invoke-direct {v0, v1, v2, v3}, Lcom/worklight/androidgap/push/GCMErrorCode;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lcom/worklight/androidgap/push/GCMErrorCode;->UNEXPECTED:Lcom/worklight/androidgap/push/GCMErrorCode;

    .line 20
    const/16 v0, 0x8

    new-array v0, v0, [Lcom/worklight/androidgap/push/GCMErrorCode;

    sget-object v1, Lcom/worklight/androidgap/push/GCMErrorCode;->SERVICE_NOT_AVAILABLE:Lcom/worklight/androidgap/push/GCMErrorCode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/worklight/androidgap/push/GCMErrorCode;->ACCOUNT_MISSING:Lcom/worklight/androidgap/push/GCMErrorCode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/worklight/androidgap/push/GCMErrorCode;->AUTHENTICATION_FAILED:Lcom/worklight/androidgap/push/GCMErrorCode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/worklight/androidgap/push/GCMErrorCode;->TOO_MANY_REGISTRATIONS:Lcom/worklight/androidgap/push/GCMErrorCode;

    aput-object v1, v0, v7

    sget-object v1, Lcom/worklight/androidgap/push/GCMErrorCode;->INVALID_SENDER:Lcom/worklight/androidgap/push/GCMErrorCode;

    aput-object v1, v0, v8

    const/4 v1, 0x5

    sget-object v2, Lcom/worklight/androidgap/push/GCMErrorCode;->PHONE_REGISTRATION_ERROR:Lcom/worklight/androidgap/push/GCMErrorCode;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/worklight/androidgap/push/GCMErrorCode;->INVALID_PARAMETERS:Lcom/worklight/androidgap/push/GCMErrorCode;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/worklight/androidgap/push/GCMErrorCode;->UNEXPECTED:Lcom/worklight/androidgap/push/GCMErrorCode;

    aput-object v2, v0, v1

    sput-object v0, Lcom/worklight/androidgap/push/GCMErrorCode;->ENUM$VALUES:[Lcom/worklight/androidgap/push/GCMErrorCode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .param p3, "description"    # Ljava/lang/String;

    .prologue
    .line 32
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 33
    iput-object p3, p0, Lcom/worklight/androidgap/push/GCMErrorCode;->description:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/worklight/androidgap/push/GCMErrorCode;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/worklight/androidgap/push/GCMErrorCode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/worklight/androidgap/push/GCMErrorCode;

    return-object v0
.end method

.method public static values()[Lcom/worklight/androidgap/push/GCMErrorCode;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/worklight/androidgap/push/GCMErrorCode;->ENUM$VALUES:[Lcom/worklight/androidgap/push/GCMErrorCode;

    array-length v1, v0

    new-array v2, v1, [Lcom/worklight/androidgap/push/GCMErrorCode;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method


# virtual methods
.method public getDescription()Ljava/lang/String;
    .locals 1

    .prologue
    .line 37
    iget-object v0, p0, Lcom/worklight/androidgap/push/GCMErrorCode;->description:Ljava/lang/String;

    return-object v0
.end method
