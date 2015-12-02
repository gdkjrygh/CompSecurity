.class public final enum Lcom/facebook/base/g;
.super Ljava/lang/Enum;
.source "NormalizerWrapper.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/base/g;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/base/g;

.field public static final enum NFC:Lcom/facebook/base/g;

.field public static final enum NFD:Lcom/facebook/base/g;

.field public static final enum NFKC:Lcom/facebook/base/g;

.field public static final enum NFKD:Lcom/facebook/base/g;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 17
    new-instance v0, Lcom/facebook/base/g;

    const-string v1, "NFC"

    invoke-direct {v0, v1, v2}, Lcom/facebook/base/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/base/g;->NFC:Lcom/facebook/base/g;

    new-instance v0, Lcom/facebook/base/g;

    const-string v1, "NFD"

    invoke-direct {v0, v1, v3}, Lcom/facebook/base/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/base/g;->NFD:Lcom/facebook/base/g;

    new-instance v0, Lcom/facebook/base/g;

    const-string v1, "NFKC"

    invoke-direct {v0, v1, v4}, Lcom/facebook/base/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/base/g;->NFKC:Lcom/facebook/base/g;

    new-instance v0, Lcom/facebook/base/g;

    const-string v1, "NFKD"

    invoke-direct {v0, v1, v5}, Lcom/facebook/base/g;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/base/g;->NFKD:Lcom/facebook/base/g;

    .line 16
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/base/g;

    sget-object v1, Lcom/facebook/base/g;->NFC:Lcom/facebook/base/g;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/base/g;->NFD:Lcom/facebook/base/g;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/base/g;->NFKC:Lcom/facebook/base/g;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/base/g;->NFKD:Lcom/facebook/base/g;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/base/g;->$VALUES:[Lcom/facebook/base/g;

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
    .line 16
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static unwrap(Lcom/facebook/base/g;)Ljava/text/Normalizer$Form;
    .locals 2
    .annotation build Landroid/annotation/TargetApi;
        value = 0x9
    .end annotation

    .prologue
    .line 21
    sget-object v0, Lcom/facebook/base/f;->a:[I

    invoke-virtual {p0}, Lcom/facebook/base/g;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 31
    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 23
    :pswitch_0
    sget-object v0, Ljava/text/Normalizer$Form;->NFC:Ljava/text/Normalizer$Form;

    goto :goto_0

    .line 25
    :pswitch_1
    sget-object v0, Ljava/text/Normalizer$Form;->NFD:Ljava/text/Normalizer$Form;

    goto :goto_0

    .line 27
    :pswitch_2
    sget-object v0, Ljava/text/Normalizer$Form;->NFKC:Ljava/text/Normalizer$Form;

    goto :goto_0

    .line 29
    :pswitch_3
    sget-object v0, Ljava/text/Normalizer$Form;->NFKD:Ljava/text/Normalizer$Form;

    goto :goto_0

    .line 21
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/base/g;
    .locals 1

    .prologue
    .line 16
    const-class v0, Lcom/facebook/base/g;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/base/g;

    return-object v0
.end method

.method public static values()[Lcom/facebook/base/g;
    .locals 1

    .prologue
    .line 16
    sget-object v0, Lcom/facebook/base/g;->$VALUES:[Lcom/facebook/base/g;

    invoke-virtual {v0}, [Lcom/facebook/base/g;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/base/g;

    return-object v0
.end method
