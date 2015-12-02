.class public final enum Lcom/facebook/orca/d/av;
.super Ljava/lang/Enum;
.source "AudioRecorderTooltipView.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/orca/d/av;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/orca/d/av;

.field public static final enum NUX:Lcom/facebook/orca/d/av;

.field public static final enum TOOLTIP:Lcom/facebook/orca/d/av;

.field public static final enum TOOLTIP_HOVER_OFF:Lcom/facebook/orca/d/av;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 36
    new-instance v0, Lcom/facebook/orca/d/av;

    const-string v1, "TOOLTIP"

    invoke-direct {v0, v1, v2}, Lcom/facebook/orca/d/av;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/d/av;->TOOLTIP:Lcom/facebook/orca/d/av;

    .line 37
    new-instance v0, Lcom/facebook/orca/d/av;

    const-string v1, "TOOLTIP_HOVER_OFF"

    invoke-direct {v0, v1, v3}, Lcom/facebook/orca/d/av;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/d/av;->TOOLTIP_HOVER_OFF:Lcom/facebook/orca/d/av;

    .line 38
    new-instance v0, Lcom/facebook/orca/d/av;

    const-string v1, "NUX"

    invoke-direct {v0, v1, v4}, Lcom/facebook/orca/d/av;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/orca/d/av;->NUX:Lcom/facebook/orca/d/av;

    .line 35
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/orca/d/av;

    sget-object v1, Lcom/facebook/orca/d/av;->TOOLTIP:Lcom/facebook/orca/d/av;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/orca/d/av;->TOOLTIP_HOVER_OFF:Lcom/facebook/orca/d/av;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/orca/d/av;->NUX:Lcom/facebook/orca/d/av;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/orca/d/av;->$VALUES:[Lcom/facebook/orca/d/av;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .prologue
    .line 35
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/orca/d/av;
    .locals 1

    .prologue
    .line 35
    const-class v0, Lcom/facebook/orca/d/av;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/orca/d/av;

    return-object v0
.end method

.method public static values()[Lcom/facebook/orca/d/av;
    .locals 1

    .prologue
    .line 35
    sget-object v0, Lcom/facebook/orca/d/av;->$VALUES:[Lcom/facebook/orca/d/av;

    invoke-virtual {v0}, [Lcom/facebook/orca/d/av;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/orca/d/av;

    return-object v0
.end method
