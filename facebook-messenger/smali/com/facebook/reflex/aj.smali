.class public final enum Lcom/facebook/reflex/aj;
.super Ljava/lang/Enum;
.source "Scrollable.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/reflex/aj;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/reflex/aj;

.field public static final enum Fling:Lcom/facebook/reflex/aj;

.field public static final enum Idle:Lcom/facebook/reflex/aj;

.field public static final enum Interactive:Lcom/facebook/reflex/aj;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 27
    new-instance v0, Lcom/facebook/reflex/aj;

    const-string v1, "Idle"

    invoke-direct {v0, v1, v2}, Lcom/facebook/reflex/aj;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/aj;->Idle:Lcom/facebook/reflex/aj;

    new-instance v0, Lcom/facebook/reflex/aj;

    const-string v1, "Interactive"

    invoke-direct {v0, v1, v3}, Lcom/facebook/reflex/aj;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/aj;->Interactive:Lcom/facebook/reflex/aj;

    new-instance v0, Lcom/facebook/reflex/aj;

    const-string v1, "Fling"

    invoke-direct {v0, v1, v4}, Lcom/facebook/reflex/aj;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/reflex/aj;->Fling:Lcom/facebook/reflex/aj;

    .line 26
    const/4 v0, 0x3

    new-array v0, v0, [Lcom/facebook/reflex/aj;

    sget-object v1, Lcom/facebook/reflex/aj;->Idle:Lcom/facebook/reflex/aj;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/reflex/aj;->Interactive:Lcom/facebook/reflex/aj;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/reflex/aj;->Fling:Lcom/facebook/reflex/aj;

    aput-object v1, v0, v4

    sput-object v0, Lcom/facebook/reflex/aj;->$VALUES:[Lcom/facebook/reflex/aj;

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
    .line 26
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static convertFromOrdinal(I)Lcom/facebook/reflex/aj;
    .locals 1

    .prologue
    .line 30
    if-ltz p0, :cond_0

    const/4 v0, 0x2

    if-gt p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkState(Z)V

    .line 31
    packed-switch p0, :pswitch_data_0

    .line 39
    sget-object v0, Lcom/facebook/reflex/aj;->Idle:Lcom/facebook/reflex/aj;

    :goto_1
    return-object v0

    .line 30
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 33
    :pswitch_0
    sget-object v0, Lcom/facebook/reflex/aj;->Idle:Lcom/facebook/reflex/aj;

    goto :goto_1

    .line 35
    :pswitch_1
    sget-object v0, Lcom/facebook/reflex/aj;->Interactive:Lcom/facebook/reflex/aj;

    goto :goto_1

    .line 37
    :pswitch_2
    sget-object v0, Lcom/facebook/reflex/aj;->Fling:Lcom/facebook/reflex/aj;

    goto :goto_1

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/reflex/aj;
    .locals 1

    .prologue
    .line 26
    const-class v0, Lcom/facebook/reflex/aj;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/reflex/aj;

    return-object v0
.end method

.method public static values()[Lcom/facebook/reflex/aj;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/facebook/reflex/aj;->$VALUES:[Lcom/facebook/reflex/aj;

    invoke-virtual {v0}, [Lcom/facebook/reflex/aj;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/reflex/aj;

    return-object v0
.end method
