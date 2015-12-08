.class public Lrrrrrr/rrcrrr;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static b0415Е0415Е04150415:I = 0x1

.field public static bЕ04150415Е04150415:I = 0x2

.field public static bЕЕ0415Е04150415:I = 0x2

.field public static bЕЕЕ041504150415:I


# instance fields
.field public final synthetic bЗ04170417041704170417:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;


# direct methods
.method public constructor <init>(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V
    .locals 2

    sget v0, Lrrrrrr/rrcrrr;->bЕЕ0415Е04150415:I

    sget v1, Lrrrrrr/rrcrrr;->b0415Е0415Е04150415:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lrrrrrr/rrcrrr;->bЕ04150415Е04150415:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lrrrrrr/rrcrrr;->b041504150415Е04150415()I

    move-result v0

    sput v0, Lrrrrrr/rrcrrr;->bЕЕ0415Е04150415:I

    invoke-static {}, Lrrrrrr/rrcrrr;->b041504150415Е04150415()I

    move-result v0

    sput v0, Lrrrrrr/rrcrrr;->b0415Е0415Е04150415:I

    :pswitch_0
    iput-object p1, p0, Lrrrrrr/rrcrrr;->bЗ04170417041704170417:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static b041504150415Е04150415()I
    .locals 1

    const/16 v0, 0x36

    return v0
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lrrrrrr/rrcrrr;->bЗ04170417041704170417:Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;

    invoke-static {v0}, Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;->bБ0411041104110411Б(Lcom/immersion/hapticmediasdk/controllers/HapticPlaybackThread;)V

    return-void
.end method
