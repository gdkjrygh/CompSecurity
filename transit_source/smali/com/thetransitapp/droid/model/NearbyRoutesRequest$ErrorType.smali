.class public final enum Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
.super Ljava/lang/Enum;
.source "NearbyRoutesRequest.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/model/NearbyRoutesRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ErrorType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field public static final enum LINES_INACTIVE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field public static final enum MESSAGE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field public static final enum NO_INTERNET:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field public static final enum NO_NEARBY_STOPS:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field public static final enum OUT_OF_SERVICE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field public static final enum REGION_IN_MAINTENANCE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field public static final enum REGION_UNSUPPORTED:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field public static final enum TIMEOUT:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field public static final enum TIME_DELTA_OUT:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

.field public static final enum UNAUTHORIZED:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;


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
    new-instance v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    const-string v1, "REGION_UNSUPPORTED"

    invoke-direct {v0, v1, v3}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->REGION_UNSUPPORTED:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    new-instance v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    const-string v1, "NO_NEARBY_STOPS"

    invoke-direct {v0, v1, v4}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->NO_NEARBY_STOPS:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    new-instance v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    const-string v1, "LINES_INACTIVE"

    invoke-direct {v0, v1, v5}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->LINES_INACTIVE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    new-instance v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    const-string v1, "REGION_IN_MAINTENANCE"

    invoke-direct {v0, v1, v6}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->REGION_IN_MAINTENANCE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    new-instance v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    const-string v1, "OUT_OF_SERVICE"

    invoke-direct {v0, v1, v7}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->OUT_OF_SERVICE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    new-instance v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    const-string v1, "UNAUTHORIZED"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->UNAUTHORIZED:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    new-instance v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    const-string v1, "MESSAGE"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->MESSAGE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    new-instance v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    const-string v1, "TIMEOUT"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->TIMEOUT:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    new-instance v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    const-string v1, "NO_INTERNET"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->NO_INTERNET:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    new-instance v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    const-string v1, "TIME_DELTA_OUT"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->TIME_DELTA_OUT:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    .line 11
    const/16 v0, 0xa

    new-array v0, v0, [Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->REGION_UNSUPPORTED:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->NO_NEARBY_STOPS:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->LINES_INACTIVE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->REGION_IN_MAINTENANCE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->OUT_OF_SERVICE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->UNAUTHORIZED:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->MESSAGE:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->TIMEOUT:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->NO_INTERNET:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->TIME_DELTA_OUT:Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    aput-object v2, v0, v1

    sput-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ENUM$VALUES:[Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 11
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    return-object v0
.end method

.method public static values()[Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;->ENUM$VALUES:[Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    array-length v1, v0

    new-array v2, v1, [Lcom/thetransitapp/droid/model/NearbyRoutesRequest$ErrorType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
