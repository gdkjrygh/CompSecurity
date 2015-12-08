.class public Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException;
.super Ljava/lang/Exception;


# static fields
.field public static b04210421С0421С0421:I = 0x0

.field public static b0421С04210421С0421:I = 0x2

.field public static bС0421С0421С0421:I = 0x59

.field public static bСС04210421С0421:I = 0x1


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException;->bС0421С0421С0421:I

    sget v1, Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException;->bСС04210421С0421:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException;->bС0421С0421С0421:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException;->b0421С04210421С0421:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException;->b04210421С0421С0421:I

    if-eq v0, v1, :cond_0

    const/16 v0, 0xb

    sput v0, Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException;->bС0421С0421С0421:I

    const/16 v0, 0x46

    sput v0, Lcom/immersion/hapticmediasdk/models/NotEnoughHapticBytesAvailableException;->b04210421С0421С0421:I

    :cond_0
    :try_start_0
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    throw v0
.end method
