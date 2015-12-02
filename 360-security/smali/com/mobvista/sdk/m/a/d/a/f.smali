.class final Lcom/mobvista/sdk/m/a/d/a/f;
.super Lcom/mobvista/sdk/m/a/d/a/l;
.source "360Security"


# instance fields
.field final synthetic a:Lcom/mobvista/sdk/m/a/d/a/d;


# direct methods
.method constructor <init>(Lcom/mobvista/sdk/m/a/d/a/d;I)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lcom/mobvista/sdk/m/a/d/a/f;->a:Lcom/mobvista/sdk/m/a/d/a/d;

    invoke-direct {p0, p2}, Lcom/mobvista/sdk/m/a/d/a/l;-><init>(I)V

    return-void
.end method

.method private static a(Landroid/graphics/Bitmap;)I
    .locals 2

    .prologue
    .line 112
    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getRowBytes()I

    move-result v0

    invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    mul-int/2addr v0, v1

    return v0
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .prologue
    .line 107
    check-cast p2, Landroid/graphics/Bitmap;

    invoke-static {p2}, Lcom/mobvista/sdk/m/a/d/a/f;->a(Landroid/graphics/Bitmap;)I

    move-result v0

    return v0
.end method
