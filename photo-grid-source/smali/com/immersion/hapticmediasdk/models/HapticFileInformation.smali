.class public Lcom/immersion/hapticmediasdk/models/HapticFileInformation;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;

.field public static b04210421С04210421С:I = 0x0

.field public static b0421С042104210421С:I = 0x2

.field public static bС0421042104210421С:I = 0x1

.field public static bС0421С04210421С:I = 0x51


# instance fields
.field private a:Ljava/lang/String;

.field private b:I

.field private c:I

.field private d:I

.field private e:I

.field private f:I

.field private g:I

.field private h:I

.field private i:[I

.field private j:I

.field private k:I

.field private l:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    new-instance v0, Lrrrrrr/rrrcrr;

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v1

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bСС042104210421С()I

    move-result v2

    add-int/2addr v1, v2

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v2

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x51

    sput v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    const/16 v1, 0x4f

    sput v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    :cond_0
    invoke-direct {v0}, Lrrrrrr/rrrcrr;-><init>()V

    sput-object v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bСС042104210421С()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    if-ne v0, v1, :cond_0

    :goto_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    :cond_0
    const/4 v0, 0x6

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    const/16 v0, 0x17

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    goto :goto_0
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 3

    :try_start_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->a:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->c:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->d:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->f:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->g:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->h:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421042104210421С:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v0, v1

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bССССС0421()I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    :cond_0
    :try_start_1
    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->h:I

    new-array v0, v0, [I

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->i:[I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    const/4 v0, 0x0

    :goto_0
    :try_start_2
    iget v1, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->h:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->i:[I
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    :try_start_3
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    aput v2, v1, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->j:I
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    :try_start_4
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->k:I

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->l:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    return-void

    :catch_0
    move-exception v0

    throw v0

    :catch_1
    move-exception v0

    throw v0
.end method

.method private constructor <init>(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->bХХХ0425Х0425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->a:Ljava/lang/String;

    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->b0425ХХ0425Х0425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b:I

    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->bХ0425Х0425Х0425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->c:I

    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->b04250425Х0425Х0425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->d:I

    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->bХХ04250425Х0425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->e:I

    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->b0425Х04250425Х0425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->f:I

    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->bХ042504250425Х0425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->g:I

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421042104210421С:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    :cond_0
    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->b0425042504250425Х0425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->h:I

    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->bХХХХ04250425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)[I

    move-result-object v0

    iput-object v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->i:[I

    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->b0425ХХХ04250425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->j:I

    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->bХ0425ХХ04250425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->k:I

    invoke-static {p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;->b04250425ХХ04250425(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)I

    move-result v0

    iput v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->l:I

    return-void
.end method

.method public synthetic constructor <init>(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;Lrrrrrr/rrrcrr;)V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421042104210421С:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421СССС0421()I

    move-result v1

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x2a

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    :pswitch_0
    invoke-direct {p0, p1}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;-><init>(Lcom/immersion/hapticmediasdk/models/HapticFileInformation$Builder;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public static b04210421042104210421С()I
    .locals 1

    const/16 v0, 0x17

    return v0
.end method

.method public static b0421СССС0421()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public static bСС042104210421С()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public static bССССС0421()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public describeContents()I
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421042104210421С:I

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    const/16 v0, 0x48

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    :pswitch_0
    const/4 v0, 0x0

    return v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public getActuatorArray()[I
    .locals 3

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->i:[I

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    sget v2, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421042104210421С:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    mul-int/2addr v1, v2

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421СССС0421()I

    move-result v2

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    if-eq v1, v2, :cond_0

    const/4 v1, 0x6

    sput v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    const/16 v1, 0x3f

    sput v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    :cond_0
    return-object v0
.end method

.method public getBitsPerSample()I
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bСС042104210421С()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    if-ne v0, v1, :cond_0

    :goto_0
    :try_start_0
    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->g:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    throw v0

    :cond_0
    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    const/16 v0, 0x42

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    goto :goto_0
.end method

.method public getCompressionScheme()I
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bСС042104210421С()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    if-ne v0, v1, :cond_0

    :goto_0
    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->j:I

    return v0

    :cond_0
    const/16 v0, 0x2b

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    const/16 v0, 0x5e

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    goto :goto_0
.end method

.method public getEncoding()I
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421042104210421С:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    if-ne v0, v1, :cond_0

    :goto_0
    :try_start_0
    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->e:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    throw v0

    :cond_0
    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    const/16 v0, 0x50

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    goto :goto_0
.end method

.method public getFileLength()I
    .locals 0

    :goto_0
    goto/32 :goto_0
.end method

.method public getFilePath()Ljava/lang/String;
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421042104210421С:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    mul-int/2addr v0, v1

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421СССС0421()I

    move-result v1

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->a:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    throw v0
.end method

.method public getHapticDataLength()I
    .locals 1

    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->k:I

    return v0
.end method

.method public getHapticDataStartByteOffset()I
    .locals 1

    :goto_0
    const/4 v0, 0x0

    :try_start_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const/16 v0, 0x52

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    :goto_1
    const/4 v0, 0x0

    :try_start_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception v0

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    :goto_2
    goto/32 :goto_2
.end method

.method public getMajorVersion()I
    .locals 1

    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->c:I

    return v0
.end method

.method public getMinorVersion()I
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421042104210421С:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    if-ne v0, v1, :cond_0

    :goto_0
    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->d:I

    return v0

    :cond_0
    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    goto :goto_0
.end method

.method public getNumberOfChannels()I
    .locals 3

    :try_start_0
    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->h:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    sget v2, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421042104210421С:I

    add-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    mul-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v1, v2

    sget v2, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    if-eq v1, v2, :cond_0

    const/16 v1, 0x42

    sput v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    const/16 v1, 0xb

    sput v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    :cond_0
    return v0

    :catch_0
    move-exception v0

    throw v0
.end method

.method public getSampleHertz()I
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bСС042104210421С()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v0, v1

    packed-switch v0, :pswitch_data_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    :pswitch_0
    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->f:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .locals 2

    iget-object v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->a:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->c:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->d:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    sget v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bСС042104210421С()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b0421С042104210421С:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421042104210421С()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->bС0421С04210421С:I

    const/16 v0, 0x52

    sput v0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->b04210421С04210421С:I

    :cond_0
    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->e:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->f:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->g:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->h:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x0

    :goto_0
    iget v1, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->h:I

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->i:[I

    aget v1, v1, v0

    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->j:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->k:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HapticFileInformation;->l:I

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
