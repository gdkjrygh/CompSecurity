.class public final enum Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
.super Ljava/lang/Enum;
.source "Itinerary.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/model/Itinerary;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "DirectionType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/thetransitapp/droid/model/Itinerary$DirectionType;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic ENUM$VALUES:[Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

.field public static final enum INBOUND:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

.field public static final enum OUTBOUND:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

.field public static final enum UNDEFINED:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 16
    new-instance v0, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    const-string v1, "INBOUND"

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->INBOUND:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    new-instance v0, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    const-string v1, "OUTBOUND"

    invoke-direct {v0, v1, v3}, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->OUTBOUND:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    new-instance v0, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    const-string v1, "UNDEFINED"

    invoke-direct {v0, v1, v4}, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->UNDEFINED:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    .line 15
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    sget-object v1, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->INBOUND:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->OUTBOUND:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->UNDEFINED:Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    aput-object v1, v0, v4

    sput-object v0, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->ENUM$VALUES:[Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    return-object v0
.end method

.method public static values()[Lcom/thetransitapp/droid/model/Itinerary$DirectionType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/thetransitapp/droid/model/Itinerary$DirectionType;->ENUM$VALUES:[Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    array-length v1, v0

    new-array v2, v1, [Lcom/thetransitapp/droid/model/Itinerary$DirectionType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
