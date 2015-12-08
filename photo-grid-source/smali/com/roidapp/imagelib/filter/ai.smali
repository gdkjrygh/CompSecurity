.class public final enum Lcom/roidapp/imagelib/filter/ai;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/roidapp/imagelib/filter/ai;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/roidapp/imagelib/filter/ai;

.field public static final enum b:Lcom/roidapp/imagelib/filter/ai;

.field public static final enum c:Lcom/roidapp/imagelib/filter/ai;

.field public static final enum d:Lcom/roidapp/imagelib/filter/ai;

.field private static final synthetic f:[Lcom/roidapp/imagelib/filter/ai;


# instance fields
.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 35
    new-instance v0, Lcom/roidapp/imagelib/filter/ai;

    const-string v1, "LIGHTNESS"

    invoke-direct {v0, v1, v2, v2}, Lcom/roidapp/imagelib/filter/ai;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roidapp/imagelib/filter/ai;->a:Lcom/roidapp/imagelib/filter/ai;

    new-instance v0, Lcom/roidapp/imagelib/filter/ai;

    const-string v1, "CONTRAST"

    invoke-direct {v0, v1, v3, v3}, Lcom/roidapp/imagelib/filter/ai;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roidapp/imagelib/filter/ai;->b:Lcom/roidapp/imagelib/filter/ai;

    new-instance v0, Lcom/roidapp/imagelib/filter/ai;

    const-string v1, "SATURATION"

    invoke-direct {v0, v1, v4, v4}, Lcom/roidapp/imagelib/filter/ai;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roidapp/imagelib/filter/ai;->c:Lcom/roidapp/imagelib/filter/ai;

    new-instance v0, Lcom/roidapp/imagelib/filter/ai;

    const-string v1, "HUE"

    invoke-direct {v0, v1, v5, v5}, Lcom/roidapp/imagelib/filter/ai;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/roidapp/imagelib/filter/ai;->d:Lcom/roidapp/imagelib/filter/ai;

    .line 34
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/roidapp/imagelib/filter/ai;

    sget-object v1, Lcom/roidapp/imagelib/filter/ai;->a:Lcom/roidapp/imagelib/filter/ai;

    aput-object v1, v0, v2

    sget-object v1, Lcom/roidapp/imagelib/filter/ai;->b:Lcom/roidapp/imagelib/filter/ai;

    aput-object v1, v0, v3

    sget-object v1, Lcom/roidapp/imagelib/filter/ai;->c:Lcom/roidapp/imagelib/filter/ai;

    aput-object v1, v0, v4

    sget-object v1, Lcom/roidapp/imagelib/filter/ai;->d:Lcom/roidapp/imagelib/filter/ai;

    aput-object v1, v0, v5

    sput-object v0, Lcom/roidapp/imagelib/filter/ai;->f:[Lcom/roidapp/imagelib/filter/ai;

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
    .line 38
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39
    iput p3, p0, Lcom/roidapp/imagelib/filter/ai;->e:I

    .line 40
    return-void
.end method

.method public static a(I)Lcom/roidapp/imagelib/filter/ai;
    .locals 1

    .prologue
    .line 48
    packed-switch p0, :pswitch_data_0

    .line 59
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->a:Lcom/roidapp/imagelib/filter/ai;

    :goto_0
    return-object v0

    .line 50
    :pswitch_0
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->a:Lcom/roidapp/imagelib/filter/ai;

    goto :goto_0

    .line 52
    :pswitch_1
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->b:Lcom/roidapp/imagelib/filter/ai;

    goto :goto_0

    .line 54
    :pswitch_2
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->c:Lcom/roidapp/imagelib/filter/ai;

    goto :goto_0

    .line 56
    :pswitch_3
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->d:Lcom/roidapp/imagelib/filter/ai;

    goto :goto_0

    .line 48
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/roidapp/imagelib/filter/ai;
    .locals 1

    .prologue
    .line 34
    const-class v0, Lcom/roidapp/imagelib/filter/ai;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/roidapp/imagelib/filter/ai;

    return-object v0
.end method

.method public static values()[Lcom/roidapp/imagelib/filter/ai;
    .locals 1

    .prologue
    .line 34
    sget-object v0, Lcom/roidapp/imagelib/filter/ai;->f:[Lcom/roidapp/imagelib/filter/ai;

    invoke-virtual {v0}, [Lcom/roidapp/imagelib/filter/ai;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/roidapp/imagelib/filter/ai;

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 44
    iget v0, p0, Lcom/roidapp/imagelib/filter/ai;->e:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
