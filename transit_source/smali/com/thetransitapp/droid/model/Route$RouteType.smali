.class public final enum Lcom/thetransitapp/droid/model/Route$RouteType;
.super Ljava/lang/Enum;
.source "Route.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/model/Route;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RouteType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/thetransitapp/droid/model/Route$RouteType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum BUS:Lcom/thetransitapp/droid/model/Route$RouteType;

.field public static final enum CABLE_CAR:Lcom/thetransitapp/droid/model/Route$RouteType;

.field private static final synthetic ENUM$VALUES:[Lcom/thetransitapp/droid/model/Route$RouteType;

.field public static final enum FERRY:Lcom/thetransitapp/droid/model/Route$RouteType;

.field public static final enum FUNICULAR:Lcom/thetransitapp/droid/model/Route$RouteType;

.field public static final enum GONDOLA:Lcom/thetransitapp/droid/model/Route$RouteType;

.field public static final enum SUBWAY:Lcom/thetransitapp/droid/model/Route$RouteType;

.field public static final enum TRAIN:Lcom/thetransitapp/droid/model/Route$RouteType;

.field public static final enum TRAMWAY:Lcom/thetransitapp/droid/model/Route$RouteType;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 14
    new-instance v0, Lcom/thetransitapp/droid/model/Route$RouteType;

    const-string v1, "TRAMWAY"

    invoke-direct {v0, v1, v3}, Lcom/thetransitapp/droid/model/Route$RouteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/Route$RouteType;->TRAMWAY:Lcom/thetransitapp/droid/model/Route$RouteType;

    new-instance v0, Lcom/thetransitapp/droid/model/Route$RouteType;

    const-string v1, "SUBWAY"

    invoke-direct {v0, v1, v4}, Lcom/thetransitapp/droid/model/Route$RouteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/Route$RouteType;->SUBWAY:Lcom/thetransitapp/droid/model/Route$RouteType;

    new-instance v0, Lcom/thetransitapp/droid/model/Route$RouteType;

    const-string v1, "TRAIN"

    invoke-direct {v0, v1, v5}, Lcom/thetransitapp/droid/model/Route$RouteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/Route$RouteType;->TRAIN:Lcom/thetransitapp/droid/model/Route$RouteType;

    new-instance v0, Lcom/thetransitapp/droid/model/Route$RouteType;

    const-string v1, "BUS"

    invoke-direct {v0, v1, v6}, Lcom/thetransitapp/droid/model/Route$RouteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/Route$RouteType;->BUS:Lcom/thetransitapp/droid/model/Route$RouteType;

    new-instance v0, Lcom/thetransitapp/droid/model/Route$RouteType;

    const-string v1, "FERRY"

    invoke-direct {v0, v1, v7}, Lcom/thetransitapp/droid/model/Route$RouteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/Route$RouteType;->FERRY:Lcom/thetransitapp/droid/model/Route$RouteType;

    new-instance v0, Lcom/thetransitapp/droid/model/Route$RouteType;

    const-string v1, "CABLE_CAR"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/Route$RouteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/Route$RouteType;->CABLE_CAR:Lcom/thetransitapp/droid/model/Route$RouteType;

    new-instance v0, Lcom/thetransitapp/droid/model/Route$RouteType;

    const-string v1, "GONDOLA"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/Route$RouteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/Route$RouteType;->GONDOLA:Lcom/thetransitapp/droid/model/Route$RouteType;

    new-instance v0, Lcom/thetransitapp/droid/model/Route$RouteType;

    const-string v1, "FUNICULAR"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/Route$RouteType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/Route$RouteType;->FUNICULAR:Lcom/thetransitapp/droid/model/Route$RouteType;

    .line 13
    const/16 v0, 0x8

    new-array v0, v0, [Lcom/thetransitapp/droid/model/Route$RouteType;

    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->TRAMWAY:Lcom/thetransitapp/droid/model/Route$RouteType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->SUBWAY:Lcom/thetransitapp/droid/model/Route$RouteType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->TRAIN:Lcom/thetransitapp/droid/model/Route$RouteType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->BUS:Lcom/thetransitapp/droid/model/Route$RouteType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/thetransitapp/droid/model/Route$RouteType;->FERRY:Lcom/thetransitapp/droid/model/Route$RouteType;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/thetransitapp/droid/model/Route$RouteType;->CABLE_CAR:Lcom/thetransitapp/droid/model/Route$RouteType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/thetransitapp/droid/model/Route$RouteType;->GONDOLA:Lcom/thetransitapp/droid/model/Route$RouteType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/thetransitapp/droid/model/Route$RouteType;->FUNICULAR:Lcom/thetransitapp/droid/model/Route$RouteType;

    aput-object v2, v0, v1

    sput-object v0, Lcom/thetransitapp/droid/model/Route$RouteType;->ENUM$VALUES:[Lcom/thetransitapp/droid/model/Route$RouteType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/thetransitapp/droid/model/Route$RouteType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Route$RouteType;

    return-object v0
.end method

.method public static values()[Lcom/thetransitapp/droid/model/Route$RouteType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/thetransitapp/droid/model/Route$RouteType;->ENUM$VALUES:[Lcom/thetransitapp/droid/model/Route$RouteType;

    array-length v1, v0

    new-array v2, v1, [Lcom/thetransitapp/droid/model/Route$RouteType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
