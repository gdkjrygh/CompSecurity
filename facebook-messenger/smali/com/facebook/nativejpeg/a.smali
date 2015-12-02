.class public final enum Lcom/facebook/nativejpeg/a;
.super Ljava/lang/Enum;
.source "BitmapFactory.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/nativejpeg/a;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/facebook/nativejpeg/a;

.field public static final enum GIF:Lcom/facebook/nativejpeg/a;

.field public static final enum JPEG:Lcom/facebook/nativejpeg/a;

.field public static final enum PNG:Lcom/facebook/nativejpeg/a;

.field public static final enum UNKNOWN:Lcom/facebook/nativejpeg/a;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x3

    const/4 v4, 0x2

    const/4 v3, 0x1

    const/4 v2, 0x0

    .line 26
    new-instance v0, Lcom/facebook/nativejpeg/a;

    const-string v1, "JPEG"

    invoke-direct {v0, v1, v2}, Lcom/facebook/nativejpeg/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/nativejpeg/a;->JPEG:Lcom/facebook/nativejpeg/a;

    .line 27
    new-instance v0, Lcom/facebook/nativejpeg/a;

    const-string v1, "PNG"

    invoke-direct {v0, v1, v3}, Lcom/facebook/nativejpeg/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/nativejpeg/a;->PNG:Lcom/facebook/nativejpeg/a;

    .line 28
    new-instance v0, Lcom/facebook/nativejpeg/a;

    const-string v1, "GIF"

    invoke-direct {v0, v1, v4}, Lcom/facebook/nativejpeg/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/nativejpeg/a;->GIF:Lcom/facebook/nativejpeg/a;

    .line 29
    new-instance v0, Lcom/facebook/nativejpeg/a;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1, v5}, Lcom/facebook/nativejpeg/a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/nativejpeg/a;->UNKNOWN:Lcom/facebook/nativejpeg/a;

    .line 25
    const/4 v0, 0x4

    new-array v0, v0, [Lcom/facebook/nativejpeg/a;

    sget-object v1, Lcom/facebook/nativejpeg/a;->JPEG:Lcom/facebook/nativejpeg/a;

    aput-object v1, v0, v2

    sget-object v1, Lcom/facebook/nativejpeg/a;->PNG:Lcom/facebook/nativejpeg/a;

    aput-object v1, v0, v3

    sget-object v1, Lcom/facebook/nativejpeg/a;->GIF:Lcom/facebook/nativejpeg/a;

    aput-object v1, v0, v4

    sget-object v1, Lcom/facebook/nativejpeg/a;->UNKNOWN:Lcom/facebook/nativejpeg/a;

    aput-object v1, v0, v5

    sput-object v0, Lcom/facebook/nativejpeg/a;->$VALUES:[Lcom/facebook/nativejpeg/a;

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
    .line 25
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/nativejpeg/a;
    .locals 1

    .prologue
    .line 25
    const-class v0, Lcom/facebook/nativejpeg/a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/nativejpeg/a;

    return-object v0
.end method

.method public static values()[Lcom/facebook/nativejpeg/a;
    .locals 1

    .prologue
    .line 25
    sget-object v0, Lcom/facebook/nativejpeg/a;->$VALUES:[Lcom/facebook/nativejpeg/a;

    invoke-virtual {v0}, [Lcom/facebook/nativejpeg/a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/nativejpeg/a;

    return-object v0
.end method
