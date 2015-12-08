.class public final enum Lcom/thetransitapp/droid/TransitActivity$TransitScreen;
.super Ljava/lang/Enum;
.source "TransitActivity.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/TransitActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "TransitScreen"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/thetransitapp/droid/TransitActivity$TransitScreen;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ABOUT_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

.field private static final synthetic ENUM$VALUES:[Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

.field public static final enum ITINERARY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

.field public static final enum LEGAL_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

.field public static final enum LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

.field public static final enum NEARBY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

.field public static final enum OPTION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

.field public static final enum ROUTING_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

.field public static final enum ROUTING_SCREEN_DETAILS:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

.field public static final enum SCHEDULE_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 72
    new-instance v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    const-string v1, "NEARBY_SCREEN"

    invoke-direct {v0, v1, v3}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->NEARBY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    new-instance v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    const-string v1, "ROUTING_SCREEN"

    invoke-direct {v0, v1, v4}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    new-instance v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    const-string v1, "LOCATION_SCREEN"

    invoke-direct {v0, v1, v5}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    new-instance v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    const-string v1, "ITINERARY_SCREEN"

    invoke-direct {v0, v1, v6}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ITINERARY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    new-instance v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    const-string v1, "SCHEDULE_SCREEN"

    invoke-direct {v0, v1, v7}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->SCHEDULE_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    new-instance v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    const-string v1, "OPTION_SCREEN"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->OPTION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    new-instance v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    const-string v1, "ABOUT_SCREEN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ABOUT_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    new-instance v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    const-string v1, "LEGAL_SCREEN"

    const/4 v2, 0x7

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LEGAL_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    new-instance v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    const-string v1, "ROUTING_SCREEN_DETAILS"

    const/16 v2, 0x8

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN_DETAILS:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    .line 71
    const/16 v0, 0x9

    new-array v0, v0, [Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->NEARBY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    aput-object v1, v0, v3

    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    aput-object v1, v0, v4

    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LOCATION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    aput-object v1, v0, v5

    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ITINERARY_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    aput-object v1, v0, v6

    sget-object v1, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->SCHEDULE_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->OPTION_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ABOUT_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->LEGAL_SCREEN:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ROUTING_SCREEN_DETAILS:Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    aput-object v2, v0, v1

    sput-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ENUM$VALUES:[Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 71
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/thetransitapp/droid/TransitActivity$TransitScreen;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    return-object v0
.end method

.method public static values()[Lcom/thetransitapp/droid/TransitActivity$TransitScreen;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/thetransitapp/droid/TransitActivity$TransitScreen;->ENUM$VALUES:[Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    array-length v1, v0

    new-array v2, v1, [Lcom/thetransitapp/droid/TransitActivity$TransitScreen;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
