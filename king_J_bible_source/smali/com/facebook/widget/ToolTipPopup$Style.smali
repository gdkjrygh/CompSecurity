.class public final enum Lcom/facebook/widget/ToolTipPopup$Style;
.super Ljava/lang/Enum;
.source "ToolTipPopup.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/widget/ToolTipPopup;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Style"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/widget/ToolTipPopup$Style;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum BLACK:Lcom/facebook/widget/ToolTipPopup$Style;

.field public static final enum BLUE:Lcom/facebook/widget/ToolTipPopup$Style;

.field private static final synthetic ENUM$VALUES:[Lcom/facebook/widget/ToolTipPopup$Style;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 36
    new-instance v0, Lcom/facebook/widget/ToolTipPopup$Style;

    const-string v1, "BLUE"

    invoke-direct {v0, v1, v2}, Lcom/facebook/widget/ToolTipPopup$Style;-><init>(Ljava/lang/String;I)V

    .line 40
    sput-object v0, Lcom/facebook/widget/ToolTipPopup$Style;->BLUE:Lcom/facebook/widget/ToolTipPopup$Style;

    .line 42
    new-instance v0, Lcom/facebook/widget/ToolTipPopup$Style;

    const-string v1, "BLACK"

    invoke-direct {v0, v1, v3}, Lcom/facebook/widget/ToolTipPopup$Style;-><init>(Ljava/lang/String;I)V

    .line 46
    sput-object v0, Lcom/facebook/widget/ToolTipPopup$Style;->BLACK:Lcom/facebook/widget/ToolTipPopup$Style;

    .line 35
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/facebook/widget/ToolTipPopup$Style;

    sget-object v1, Lcom/facebook/widget/ToolTipPopup$Style;->BLUE:Lcom/facebook/widget/ToolTipPopup$Style;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/widget/ToolTipPopup$Style;->BLACK:Lcom/facebook/widget/ToolTipPopup$Style;

    aput-object v1, v0, v3

    sput-object v0, Lcom/facebook/widget/ToolTipPopup$Style;->ENUM$VALUES:[Lcom/facebook/widget/ToolTipPopup$Style;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/widget/ToolTipPopup$Style;
    .locals 1

    .prologue
    .line 1
    const-class v0, Lcom/facebook/widget/ToolTipPopup$Style;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/widget/ToolTipPopup$Style;

    return-object v0
.end method

.method public static values()[Lcom/facebook/widget/ToolTipPopup$Style;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1
    sget-object v0, Lcom/facebook/widget/ToolTipPopup$Style;->ENUM$VALUES:[Lcom/facebook/widget/ToolTipPopup$Style;

    array-length v1, v0

    new-array v2, v1, [Lcom/facebook/widget/ToolTipPopup$Style;

    invoke-static {v0, v3, v2, v3, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v2
.end method
