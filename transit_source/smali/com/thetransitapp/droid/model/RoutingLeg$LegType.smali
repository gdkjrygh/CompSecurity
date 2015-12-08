.class public final enum Lcom/thetransitapp/droid/model/RoutingLeg$LegType;
.super Ljava/lang/Enum;
.source "RoutingLeg.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/model/RoutingLeg;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LegType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/thetransitapp/droid/model/RoutingLeg$LegType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum END:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

.field private static final synthetic ENUM$VALUES:[Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

.field public static final enum START:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

.field public static final enum TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

.field public static final enum WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

.field public static final enum WALK:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .prologue
    const/4 v6, 0x4

    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 22
    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    const-string v1, "START"

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->START:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    const-string v1, "WALK"

    invoke-direct {v0, v1, v3}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WALK:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    const-string v1, "WAIT"

    invoke-direct {v0, v1, v4}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    const-string v1, "TRANSIT"

    invoke-direct {v0, v1, v5}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    new-instance v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    const-string v1, "END"

    invoke-direct {v0, v1, v6}, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->END:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    .line 21
    const/4 v0, 0x5

    new-array v0, v0, [Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->START:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WALK:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->WAIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->TRANSIT:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->END:Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    aput-object v1, v0, v6

    sput-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->ENUM$VALUES:[Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 21
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/thetransitapp/droid/model/RoutingLeg$LegType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    return-object v0
.end method

.method public static values()[Lcom/thetransitapp/droid/model/RoutingLeg$LegType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/thetransitapp/droid/model/RoutingLeg$LegType;->ENUM$VALUES:[Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    array-length v1, v0

    new-array v2, v1, [Lcom/thetransitapp/droid/model/RoutingLeg$LegType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
