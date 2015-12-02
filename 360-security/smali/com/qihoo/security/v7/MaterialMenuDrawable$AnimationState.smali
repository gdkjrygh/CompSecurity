.class public final enum Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v7/MaterialMenuDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AnimationState"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum ARROW_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

.field public static final enum ARROW_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

.field public static final enum BURGER_ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

.field public static final enum BURGER_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

.field public static final enum BURGER_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

.field public static final enum X_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

.field private static final synthetic a:[Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .prologue
    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 29
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    const-string/jumbo v1, "BURGER_ARROW"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    const-string/jumbo v1, "BURGER_X"

    invoke-direct {v0, v1, v4}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    const-string/jumbo v1, "ARROW_X"

    invoke-direct {v0, v1, v5}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ARROW_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    const-string/jumbo v1, "ARROW_CHECK"

    invoke-direct {v0, v1, v6}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ARROW_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    const-string/jumbo v1, "BURGER_CHECK"

    invoke-direct {v0, v1, v7}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    const-string/jumbo v1, "X_CHECK"

    const/4 v2, 0x5

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->X_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    .line 28
    const/4 v0, 0x6

    new-array v0, v0, [Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    aput-object v1, v0, v3

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ARROW_X:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    aput-object v1, v0, v5

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ARROW_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    aput-object v1, v0, v6

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->BURGER_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->X_CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    aput-object v2, v0, v1

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->a:[Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

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
    .line 28
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;
    .locals 1

    .prologue
    .line 28
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->a:[Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    invoke-virtual {v0}, [Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;

    return-object v0
.end method


# virtual methods
.method public getFirstState()Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;
    .locals 2

    .prologue
    .line 32
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 46
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 34
    :pswitch_0
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 36
    :pswitch_1
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 38
    :pswitch_2
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 40
    :pswitch_3
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 42
    :pswitch_4
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->BURGER:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 44
    :pswitch_5
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->X:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 32
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public getSecondState()Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;
    .locals 2

    .prologue
    .line 51
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$5;->a:[I

    invoke-virtual {p0}, Lcom/qihoo/security/v7/MaterialMenuDrawable$AnimationState;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 65
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 53
    :pswitch_0
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->ARROW:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 55
    :pswitch_1
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->X:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 57
    :pswitch_2
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->X:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 59
    :pswitch_3
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 61
    :pswitch_4
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 63
    :pswitch_5
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;->CHECK:Lcom/qihoo/security/v7/MaterialMenuDrawable$IconState;

    goto :goto_0

    .line 51
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method
