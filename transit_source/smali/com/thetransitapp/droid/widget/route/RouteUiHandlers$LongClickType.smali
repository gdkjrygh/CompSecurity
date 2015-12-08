.class public final enum Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;
.super Ljava/lang/Enum;
.source "RouteUiHandlers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "LongClickType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

.field private static final synthetic ENUM$VALUES:[Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

.field public static final enum TIME:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 11
    new-instance v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    const-string v1, "TIME"

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->TIME:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    new-instance v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    const-string v1, "DIRECTION"

    invoke-direct {v0, v1, v3}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    .line 10
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->TIME:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    aput-object v1, v0, v2

    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    aput-object v1, v0, v3

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->ENUM$VALUES:[Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    return-object v0
.end method

.method public static values()[Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;->ENUM$VALUES:[Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    array-length v1, v0

    new-array v2, v1, [Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$LongClickType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
