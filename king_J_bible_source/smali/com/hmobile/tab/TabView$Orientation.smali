.class public final enum Lcom/hmobile/tab/TabView$Orientation;
.super Ljava/lang/Enum;
.source "TabView.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/hmobile/tab/TabView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Orientation"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/hmobile/tab/TabView$Orientation;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum BOTTOM:Lcom/hmobile/tab/TabView$Orientation;

.field private static final synthetic ENUM$VALUES:[Lcom/hmobile/tab/TabView$Orientation;

.field public static final enum TOP:Lcom/hmobile/tab/TabView$Orientation;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 31
    new-instance v0, Lcom/hmobile/tab/TabView$Orientation;

    const-string v1, "TOP"

    invoke-direct {v0, v1, v2}, Lcom/hmobile/tab/TabView$Orientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/hmobile/tab/TabView$Orientation;->TOP:Lcom/hmobile/tab/TabView$Orientation;

    new-instance v0, Lcom/hmobile/tab/TabView$Orientation;

    const-string v1, "BOTTOM"

    invoke-direct {v0, v1, v3}, Lcom/hmobile/tab/TabView$Orientation;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/hmobile/tab/TabView$Orientation;->BOTTOM:Lcom/hmobile/tab/TabView$Orientation;

    .line 30
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/hmobile/tab/TabView$Orientation;

    sget-object v1, Lcom/hmobile/tab/TabView$Orientation;->TOP:Lcom/hmobile/tab/TabView$Orientation;

    aput-object v1, v0, v2

    sget-object v1, Lcom/hmobile/tab/TabView$Orientation;->BOTTOM:Lcom/hmobile/tab/TabView$Orientation;

    aput-object v1, v0, v3

    sput-object v0, Lcom/hmobile/tab/TabView$Orientation;->ENUM$VALUES:[Lcom/hmobile/tab/TabView$Orientation;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 30
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/hmobile/tab/TabView$Orientation;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/hmobile/tab/TabView$Orientation;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/hmobile/tab/TabView$Orientation;

    return-object v0
.end method

.method public static values()[Lcom/hmobile/tab/TabView$Orientation;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/hmobile/tab/TabView$Orientation;->ENUM$VALUES:[Lcom/hmobile/tab/TabView$Orientation;

    array-length v1, v0

    new-array v2, v1, [Lcom/hmobile/tab/TabView$Orientation;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
