.class public Lcom/immersion/content/Log;
.super Ljava/lang/Object;


# static fields
.field private static final a:Z = false

.field public static b04460446цццц:I = 0x0

.field public static b0446ц0446ццц:I = 0x2

.field public static bц0446цццц:I = 0x2d

.field public static bцц0446ццц:I = 0x1


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static bц04460446ццц()I
    .locals 1

    const/16 v0, 0x28

    return v0
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    :try_start_0
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    sget v0, Lcom/immersion/content/Log;->bц0446цццц:I

    sget v1, Lcom/immersion/content/Log;->bцц0446ццц:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/content/Log;->bц0446цццц:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/content/Log;->b0446ц0446ццц:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/content/Log;->b04460446цццц:I

    if-ne v0, v1, :cond_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    throw v0

    :cond_0
    const/16 v0, 0x38

    sput v0, Lcom/immersion/content/Log;->bц0446цццц:I

    const/16 v0, 0x46

    sput v0, Lcom/immersion/content/Log;->b04460446цццц:I

    goto :goto_0
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public static v(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method
