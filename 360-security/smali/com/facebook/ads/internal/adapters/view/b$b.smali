.class public final enum Lcom/facebook/ads/internal/adapters/view/b$b;
.super Ljava/lang/Enum;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/ads/internal/adapters/view/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lcom/facebook/ads/internal/adapters/view/b$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum a:Lcom/facebook/ads/internal/adapters/view/b$b;

.field private static final synthetic b:[Lcom/facebook/ads/internal/adapters/view/b$b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Lcom/facebook/ads/internal/adapters/view/b$b;

    const-string/jumbo v1, "DISPLAY"

    invoke-direct {v0, v1, v2}, Lcom/facebook/ads/internal/adapters/view/b$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/ads/internal/adapters/view/b$b;->a:Lcom/facebook/ads/internal/adapters/view/b$b;

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/facebook/ads/internal/adapters/view/b$b;

    sget-object v1, Lcom/facebook/ads/internal/adapters/view/b$b;->a:Lcom/facebook/ads/internal/adapters/view/b$b;

    aput-object v1, v0, v2

    sput-object v0, Lcom/facebook/ads/internal/adapters/view/b$b;->b:[Lcom/facebook/ads/internal/adapters/view/b$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static a(Lcom/facebook/ads/internal/adapters/view/b$b;Lcom/facebook/ads/InterstitialAdActivity;Lcom/facebook/ads/internal/adapters/view/b$a;)Lcom/facebook/ads/internal/adapters/view/b;
    .locals 2

    sget-object v0, Lcom/facebook/ads/internal/adapters/view/b$1;->a:[I

    invoke-virtual {p0}, Lcom/facebook/ads/internal/adapters/view/b$b;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    :pswitch_0
    new-instance v0, Lcom/facebook/ads/internal/adapters/view/a;

    invoke-direct {v0, p1, p2}, Lcom/facebook/ads/internal/adapters/view/a;-><init>(Lcom/facebook/ads/InterstitialAdActivity;Lcom/facebook/ads/internal/adapters/view/b$a;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/ads/internal/adapters/view/b$b;
    .locals 1

    const-class v0, Lcom/facebook/ads/internal/adapters/view/b$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lcom/facebook/ads/internal/adapters/view/b$b;

    return-object v0
.end method

.method public static values()[Lcom/facebook/ads/internal/adapters/view/b$b;
    .locals 1

    sget-object v0, Lcom/facebook/ads/internal/adapters/view/b$b;->b:[Lcom/facebook/ads/internal/adapters/view/b$b;

    invoke-virtual {v0}, [Lcom/facebook/ads/internal/adapters/view/b$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/ads/internal/adapters/view/b$b;

    return-object v0
.end method
