.class public final Lrrrrrr/rrrcrr;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable$Creator;


# static fields
.field public static b0446ц04460446ц0446:I = 0x0

.field public static bц044604460446ц0446:I = 0x1

.field public static bц0446цц04460446:I = 0x2

.field public static bцц04460446ц0446:I = 0x54


# direct methods
.method public constructor <init>()V
    .locals 2

    sget v0, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    sget v1, Lrrrrrr/rrrcrr;->bц044604460446ц0446:I

    add-int/2addr v0, v1

    sget v1, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    mul-int/2addr v0, v1

    invoke-static {}, Lrrrrrr/rrrcrr;->b0446044604460446ц0446()I

    move-result v1

    rem-int/2addr v0, v1

    sget v1, Lrrrrrr/rrrcrr;->b0446ц04460446ц0446:I

    if-ne v0, v1, :cond_0

    :goto_0
    :try_start_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0

    :cond_0
    invoke-static {}, Lrrrrrr/rrrcrr;->bцццц04460446()I

    move-result v0

    sput v0, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    invoke-static {}, Lrrrrrr/rrrcrr;->bцццц04460446()I

    move-result v0

    sput v0, Lrrrrrr/rrrcrr;->b0446ц04460446ц0446:I

    goto :goto_0
.end method

.method public static b0446044604460446ц0446()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static b04460446цц04460446()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public static b0446ццц04460446()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static bцццц04460446()I
    .locals 1

    const/16 v0, 0x36

    return v0
.end method


# virtual methods
.method public final createFromParcel(Landroid/os/Parcel;)Lcom/immersion/hapticmediasdk/models/HapticFileInformation;
    .locals 3

    new-instance v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;

    invoke-static {}, Lrrrrrr/rrrcrr;->bцццц04460446()I

    move-result v1

    invoke-static {}, Lrrrrrr/rrrcrr;->b0446ццц04460446()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {}, Lrrrrrr/rrrcrr;->bцццц04460446()I

    move-result v2

    mul-int/2addr v1, v2

    sget v2, Lrrrrrr/rrrcrr;->bц0446цц04460446:I

    rem-int/2addr v1, v2

    sget v2, Lrrrrrr/rrrcrr;->b0446ц04460446ц0446:I

    if-eq v1, v2, :cond_0

    invoke-static {}, Lrrrrrr/rrrcrr;->bцццц04460446()I

    move-result v1

    sput v1, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    invoke-static {}, Lrrrrrr/rrrcrr;->bцццц04460446()I

    move-result v1

    sput v1, Lrrrrrr/rrrcrr;->b0446ц04460446ц0446:I

    :cond_0
    invoke-direct {v0, p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method

.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .locals 3

    :try_start_0
    invoke-virtual {p0, p1}, Lrrrrrr/rrrcrr;->createFromParcel(Landroid/os/Parcel;)Lcom/immersion/hapticmediasdk/models/HapticFileInformation;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    sget v1, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    sget v2, Lrrrrrr/rrrcrr;->bц044604460446ц0446:I

    add-int/2addr v1, v2

    sget v2, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    mul-int/2addr v1, v2

    invoke-static {}, Lrrrrrr/rrrcrr;->b0446044604460446ц0446()I

    move-result v2

    rem-int/2addr v1, v2

    invoke-static {}, Lrrrrrr/rrrcrr;->b04460446цц04460446()I

    move-result v2

    if-eq v1, v2, :cond_0

    const/16 v1, 0x2e

    sput v1, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    invoke-static {}, Lrrrrrr/rrrcrr;->bцццц04460446()I

    move-result v1

    sput v1, Lrrrrrr/rrrcrr;->b0446ц04460446ц0446:I

    :cond_0
    return-object v0

    :catch_0
    move-exception v0

    throw v0
.end method

.method public final newArray(I)[Lcom/immersion/hapticmediasdk/models/HapticFileInformation;
    .locals 3

    new-array v0, p1, [Lcom/immersion/hapticmediasdk/models/HapticFileInformation;

    sget v1, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    sget v2, Lrrrrrr/rrrcrr;->bц044604460446ц0446:I

    add-int/2addr v1, v2

    sget v2, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    mul-int/2addr v1, v2

    sget v2, Lrrrrrr/rrrcrr;->bц0446цц04460446:I

    rem-int/2addr v1, v2

    sget v2, Lrrrrrr/rrrcrr;->b0446ц04460446ц0446:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x20

    sput v1, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    const/16 v1, 0x50

    sput v1, Lrrrrrr/rrrcrr;->b0446ц04460446ц0446:I

    :cond_0
    return-object v0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .locals 2

    sget v0, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    sget v1, Lrrrrrr/rrrcrr;->bц044604460446ц0446:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lrrrrrr/rrrcrr;->bц0446цц04460446:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lrrrrrr/rrrcrr;->bцццц04460446()I

    move-result v0

    sput v0, Lrrrrrr/rrrcrr;->bцц04460446ц0446:I

    const/16 v0, 0x2f

    sput v0, Lrrrrrr/rrrcrr;->b0446ц04460446ц0446:I

    :pswitch_0
    invoke-virtual {p0, p1}, Lrrrrrr/rrrcrr;->newArray(I)[Lcom/immersion/hapticmediasdk/models/HapticFileInformation;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
