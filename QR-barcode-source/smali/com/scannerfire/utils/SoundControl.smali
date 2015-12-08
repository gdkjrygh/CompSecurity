.class public Lcom/scannerfire/utils/SoundControl;
.super Ljava/lang/Object;
.source "SoundControl.java"


# static fields
.field public static final NUM_SAMPLE:I = 0x1

.field public static final SAMPLE:[I

.field private static soundId:I

.field private static soundLoaded:Z

.field private static soundPool:Landroid/media/SoundPool;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 15
    const/4 v0, 0x1

    new-array v0, v0, [I

    sput-object v0, Lcom/scannerfire/utils/SoundControl;->SAMPLE:[I

    .line 17
    sput v1, Lcom/scannerfire/utils/SoundControl;->soundId:I

    .line 18
    sput-boolean v1, Lcom/scannerfire/utils/SoundControl;->soundLoaded:Z

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$0(Z)V
    .locals 0

    .prologue
    .line 18
    sput-boolean p0, Lcom/scannerfire/utils/SoundControl;->soundLoaded:Z

    return-void
.end method

.method public static destroySound()V
    .locals 1

    .prologue
    .line 44
    sget-object v0, Lcom/scannerfire/utils/SoundControl;->soundPool:Landroid/media/SoundPool;

    invoke-virtual {v0}, Landroid/media/SoundPool;->release()V

    .line 45
    const/4 v0, 0x0

    sput-boolean v0, Lcom/scannerfire/utils/SoundControl;->soundLoaded:Z

    .line 46
    return-void
.end method

.method public static init(Landroid/content/Context;)V
    .locals 5
    .param p0, "context"    # Landroid/content/Context;

    .prologue
    const/4 v4, 0x0

    .line 22
    new-instance v0, Landroid/media/SoundPool;

    const/4 v1, 0x2

    const/4 v2, 0x3

    const/16 v3, 0x64

    invoke-direct {v0, v1, v2, v3}, Landroid/media/SoundPool;-><init>(III)V

    sput-object v0, Lcom/scannerfire/utils/SoundControl;->soundPool:Landroid/media/SoundPool;

    .line 23
    sget-object v0, Lcom/scannerfire/utils/SoundControl;->soundPool:Landroid/media/SoundPool;

    new-instance v1, Lcom/scannerfire/utils/SoundControl$1;

    invoke-direct {v1}, Lcom/scannerfire/utils/SoundControl$1;-><init>()V

    invoke-virtual {v0, v1}, Landroid/media/SoundPool;->setOnLoadCompleteListener(Landroid/media/SoundPool$OnLoadCompleteListener;)V

    .line 29
    sget-object v0, Lcom/scannerfire/utils/SoundControl;->SAMPLE:[I

    sget-object v1, Lcom/scannerfire/utils/SoundControl;->soundPool:Landroid/media/SoundPool;

    const/high16 v2, 0x7f060000

    invoke-virtual {v1, p0, v2, v4}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I

    move-result v1

    aput v1, v0, v4

    .line 31
    return-void
.end method

.method public static isSoundLoaded()Z
    .locals 1

    .prologue
    .line 49
    sget-boolean v0, Lcom/scannerfire/utils/SoundControl;->soundLoaded:Z

    return v0
.end method

.method public static playSound(I)V
    .locals 7
    .param p0, "i"    # I

    .prologue
    const/high16 v2, 0x3f800000    # 1.0f

    .line 35
    sget-object v0, Lcom/scannerfire/utils/SoundControl;->soundPool:Landroid/media/SoundPool;

    sget-object v1, Lcom/scannerfire/utils/SoundControl;->SAMPLE:[I

    aget v1, v1, p0

    const/4 v4, 0x1

    const/4 v5, 0x0

    move v3, v2

    move v6, v2

    invoke-virtual/range {v0 .. v6}, Landroid/media/SoundPool;->play(IFFIIF)I

    move-result v0

    sput v0, Lcom/scannerfire/utils/SoundControl;->soundId:I

    .line 37
    return-void
.end method

.method public static stopSound()V
    .locals 2

    .prologue
    .line 40
    sget-object v0, Lcom/scannerfire/utils/SoundControl;->soundPool:Landroid/media/SoundPool;

    sget v1, Lcom/scannerfire/utils/SoundControl;->soundId:I

    invoke-virtual {v0, v1}, Landroid/media/SoundPool;->stop(I)V

    .line 41
    return-void
.end method
