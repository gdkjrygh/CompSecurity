.class public Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;
.super Ljava/lang/Exception;


# static fields
.field public static b04270427Ч0427ЧЧ:I = 0x2

.field public static b0427ЧЧ0427ЧЧ:I = 0x0

.field public static bЧ0427Ч0427ЧЧ:I = 0x1

.field public static bЧЧЧ0427ЧЧ:I = 0x18

.field private static final serialVersionUID:J = -0x37e423444e3a177L


# instance fields
.field private a:I


# direct methods
.method public constructor <init>(ILjava/lang/String;)V
    .locals 2

    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    sget v0, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->bЧЧЧ0427ЧЧ:I

    sget v1, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->bЧ0427Ч0427ЧЧ:I

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->bЧЧЧ0427ЧЧ:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->b04270427Ч0427ЧЧ:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->b0427ЧЧ0427ЧЧ:I

    if-eq v0, v1, :cond_0

    const/16 v0, 0x4a

    sput v0, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->bЧЧЧ0427ЧЧ:I

    const/16 v0, 0x62

    sput v0, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->b0427ЧЧ0427ЧЧ:I

    :cond_0
    iput p1, p0, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->a:I

    return-void
.end method

.method public static b0427Ч04270427ЧЧ()I
    .locals 1

    const/16 v0, 0x4b

    return v0
.end method

.method public static bЧЧ04270427ЧЧ()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method


# virtual methods
.method public getHttpStatusCode()I
    .locals 2

    sget v0, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->bЧЧЧ0427ЧЧ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->bЧЧ04270427ЧЧ()I

    move-result v1

    add-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->bЧЧЧ0427ЧЧ:I

    mul-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->b04270427Ч0427ЧЧ:I

    rem-int/2addr v0, v1

    sget v1, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->b0427ЧЧ0427ЧЧ:I

    if-eq v0, v1, :cond_0

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->b0427Ч04270427ЧЧ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->bЧЧЧ0427ЧЧ:I

    invoke-static {}, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->b0427Ч04270427ЧЧ()I

    move-result v0

    sput v0, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->b0427ЧЧ0427ЧЧ:I

    :cond_0
    :try_start_0
    iget v0, p0, Lcom/immersion/hapticmediasdk/models/HttpUnsuccessfulException;->a:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v0

    throw v0
.end method
