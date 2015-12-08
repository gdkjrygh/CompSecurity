.class public final enum Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;
.super Ljava/lang/Enum;
.source "RouteUiHandlers.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/thetransitapp/droid/widget/route/RouteUiHandlers;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ClickType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum DEFAULT:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

.field private static final synthetic ENUM$VALUES:[Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

.field public static final enum FAVORITE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

.field public static final enum MAP:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

.field public static final enum MENU_OPEN:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

.field public static final enum NONE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

.field public static final enum SWITCH_DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

.field public static final enum TIMETABLE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 7
    new-instance v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    const-string v1, "MAP"

    invoke-direct {v0, v1, v3}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MAP:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    new-instance v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    const-string v1, "SWITCH_DIRECTION"

    invoke-direct {v0, v1, v4}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->SWITCH_DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    new-instance v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    const-string v1, "FAVORITE"

    invoke-direct {v0, v1, v5}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->FAVORITE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    new-instance v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    const-string v1, "TIMETABLE"

    invoke-direct {v0, v1, v6}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->TIMETABLE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    new-instance v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    const-string v1, "DEFAULT"

    invoke-direct {v0, v1, v7}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->DEFAULT:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    new-instance v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    const-string v1, "NONE"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->NONE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    new-instance v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    const-string v1, "MENU_OPEN"

    const/4 v2, 0x6

    invoke-direct {v0, v1, v2}, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MENU_OPEN:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    .line 6
    const/4 v0, 0x7

    new-array v0, v0, [Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MAP:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    aput-object v1, v0, v3

    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->SWITCH_DIRECTION:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    aput-object v1, v0, v4

    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->FAVORITE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    aput-object v1, v0, v5

    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->TIMETABLE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    aput-object v1, v0, v6

    sget-object v1, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->DEFAULT:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->NONE:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->MENU_OPEN:Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    aput-object v2, v0, v1

    sput-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ENUM$VALUES:[Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    return-object v0
.end method

.method public static values()[Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;->ENUM$VALUES:[Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    array-length v1, v0

    new-array v2, v1, [Lcom/thetransitapp/droid/widget/route/RouteUiHandlers$ClickType;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
