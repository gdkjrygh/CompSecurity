.class public final enum Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;
.super Ljava/lang/Enum;
.source "360Security"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/qihoo/security/v7/MaterialMenuDrawable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Stroke"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum EXTRA_THIN:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

.field public static final enum REGULAR:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

.field public static final enum THIN:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

.field private static final synthetic b:[Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;


# instance fields
.field private final a:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x0

    const/4 v3, 0x2

    const/4 v2, 0x1

    .line 74
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    const-string/jumbo v1, "REGULAR"

    invoke-direct {v0, v1, v4, v5}, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->REGULAR:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    .line 78
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    const-string/jumbo v1, "THIN"

    invoke-direct {v0, v1, v2, v3}, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->THIN:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    .line 82
    new-instance v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    const-string/jumbo v1, "EXTRA_THIN"

    invoke-direct {v0, v1, v3, v2}, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->EXTRA_THIN:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    .line 70
    new-array v0, v5, [Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->REGULAR:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    aput-object v1, v0, v4

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->THIN:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    aput-object v1, v0, v2

    sget-object v1, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->EXTRA_THIN:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    aput-object v1, v0, v3

    sput-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->b:[Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    .prologue
    .line 86
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 87
    iput p3, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->a:I

    .line 88
    return-void
.end method

.method static synthetic a(Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;)I
    .locals 1

    .prologue
    .line 70
    iget v0, p0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->a:I

    return v0
.end method

.method protected static a(I)Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;
    .locals 1

    .prologue
    .line 91
    packed-switch p0, :pswitch_data_0

    .line 99
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->THIN:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    :goto_0
    return-object v0

    .line 93
    :pswitch_0
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->REGULAR:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    goto :goto_0

    .line 95
    :pswitch_1
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->THIN:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    goto :goto_0

    .line 97
    :pswitch_2
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->EXTRA_THIN:Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    goto :goto_0

    .line 91
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;
    .locals 1

    .prologue
    .line 70
    const-class v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    return-object v0
.end method

.method public static values()[Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;
    .locals 1

    .prologue
    .line 70
    sget-object v0, Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->b:[Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    invoke-virtual {v0}, [Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/qihoo/security/v7/MaterialMenuDrawable$Stroke;

    return-object v0
.end method
