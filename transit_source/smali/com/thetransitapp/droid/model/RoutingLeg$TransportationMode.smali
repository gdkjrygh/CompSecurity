.class public final enum Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;
.super Ljava/lang/Enum;
.source "RoutingLeg.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/model/RoutingLeg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TransportationMode"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ALIGHTING:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum BICYCLE:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum BOARDING:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum BUS:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum BUSISH:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum CABLE_CAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum CAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum CUSTOM_MOTOR_VEHICLE:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field private static final synthetic ENUM$VALUES:[Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum FERRY:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum FUNICULAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum GONDOLA:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum RAIL:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum STL:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum SUBWAY:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum TRAINISH:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum TRAM:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum TRANSFER:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

.field public static final enum WALK:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 18
    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "WAIT"

    invoke-direct {v0, v1, v3}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "WALK"

    invoke-direct {v0, v1, v4}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->WALK:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "BICYCLE"

    invoke-direct {v0, v1, v5}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BICYCLE:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "CAR"

    invoke-direct {v0, v1, v6}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->CAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "TRAM"

    invoke-direct {v0, v1, v7}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRAM:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "SUBWAY"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->SUBWAY:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "RAIL"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->RAIL:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "BUS"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BUS:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "FERRY"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->FERRY:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "CABLE_CAR"

    const/16 v2, 0x9

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->CABLE_CAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "GONDOLA"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->GONDOLA:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "FUNICULAR"

    const/16 v2, 0xb

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->FUNICULAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "TRANSIT"

    const/16 v2, 0xc

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "TRAINISH"

    const/16 v2, 0xd

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRAINISH:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "BUSISH"

    const/16 v2, 0xe

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BUSISH:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "BOARDING"

    const/16 v2, 0xf

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BOARDING:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "ALIGHTING"

    const/16 v2, 0x10

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ALIGHTING:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "TRANSFER"

    const/16 v2, 0x11

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRANSFER:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "STL"

    const/16 v2, 0x12

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->STL:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    const-string v1, "CUSTOM_MOTOR_VEHICLE"

    const/16 v2, 0x13

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->CUSTOM_MOTOR_VEHICLE:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    .line 17
    const/16 v0, 0x14

    new-array v0, v0, [Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v1, v0, v3

    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->WALK:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v1, v0, v4

    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BICYCLE:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v1, v0, v5

    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->CAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v1, v0, v6

    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRAM:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->SUBWAY:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->RAIL:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BUS:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->FERRY:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->CABLE_CAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->GONDOLA:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->FUNICULAR:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRAINISH:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BUSISH:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->BOARDING:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ALIGHTING:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->TRANSFER:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->STL:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->CUSTOM_MOTOR_VEHICLE:Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    aput-object v2, v0, v1

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ENUM$VALUES:[Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    return-object v0
.end method

.method public static values()[Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;->ENUM$VALUES:[Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    array-length v1, v0

    new-array v2, v1, [Lcom/thetransitapp/droid/model/RoutingLeg$TransportationMode;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
