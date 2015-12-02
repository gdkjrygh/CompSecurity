.class public final enum Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Style"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum NORMAL:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

.field public static final enum ROUNDED:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

.field private static final synthetic a:[Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 50
    new-instance v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    const-string/jumbo v1, "NORMAL"

    invoke-direct {v0, v1, v2}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;->NORMAL:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    new-instance v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    const-string/jumbo v1, "ROUNDED"

    invoke-direct {v0, v1, v3}, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;->ROUNDED:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    .line 49
    const/4 v0, 0x2

    new-array v0, v0, [Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    sget-object v1, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;->NORMAL:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;->ROUNDED:Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    aput-object v1, v0, v3

    sput-object v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;->a:[Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

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
    .line 49
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;
    .locals 1

    .prologue
    .line 49
    const-class v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;
    .locals 1

    .prologue
    .line 49
    sget-object v0, Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;->a:[Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    invoke-virtual {v0}, [Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/widget/circularprogress/CircularProgressDrawable$Style;

    return-object v0
.end method
