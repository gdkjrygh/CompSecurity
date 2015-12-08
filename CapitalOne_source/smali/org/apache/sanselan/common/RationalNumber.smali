.class public Lorg/apache/sanselan/common/RationalNumber;
.super Ljava/lang/Number;


# static fields
.field private static final c:Ljava/text/NumberFormat;


# instance fields
.field public final a:I

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ljava/text/DecimalFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v0

    sput-object v0, Lorg/apache/sanselan/common/RationalNumber;->c:Ljava/text/NumberFormat;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Number;-><init>()V

    iput p1, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    iput p2, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    return-void
.end method

.method public static final a(JJ)Lorg/apache/sanselan/common/RationalNumber;
    .locals 10

    const-wide/16 v8, 0x1

    const/4 v6, 0x1

    const-wide/32 v4, 0x7fffffff

    const-wide/32 v2, -0x80000000

    cmp-long v0, p0, v4

    if-gtz v0, :cond_0

    cmp-long v0, p0, v2

    if-ltz v0, :cond_0

    cmp-long v0, p2, v4

    if-gtz v0, :cond_0

    cmp-long v0, p2, v2

    if-gez v0, :cond_4

    :cond_0
    :goto_0
    cmp-long v0, p0, v4

    if-gtz v0, :cond_1

    cmp-long v0, p0, v2

    if-ltz v0, :cond_1

    cmp-long v0, p2, v4

    if-gtz v0, :cond_1

    cmp-long v0, p2, v2

    if-gez v0, :cond_2

    :cond_1
    invoke-static {p0, p1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    cmp-long v0, v0, v8

    if-lez v0, :cond_2

    invoke-static {p2, p3}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    cmp-long v0, v0, v8

    if-gtz v0, :cond_3

    :cond_2
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_4

    new-instance v0, Ljava/lang/NumberFormatException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Invalid value, numerator: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ", divisor: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/NumberFormatException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    shr-long/2addr p0, v6

    shr-long/2addr p2, v6

    goto :goto_0

    :cond_4
    invoke-static {p0, p1, p2, p3}, Lorg/apache/sanselan/common/RationalNumber;->b(JJ)J

    move-result-wide v0

    div-long v2, p2, v0

    div-long v0, p0, v0

    new-instance v4, Lorg/apache/sanselan/common/RationalNumber;

    long-to-int v0, v0

    long-to-int v1, v2

    invoke-direct {v4, v0, v1}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    return-object v4
.end method

.method private static b(JJ)J
    .locals 2

    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v0, p2, v0

    if-nez v0, :cond_0

    return-wide p0

    :cond_0
    rem-long v0, p0, p2

    move-wide p0, p2

    move-wide p2, v0

    goto :goto_0
.end method


# virtual methods
.method public final a()Lorg/apache/sanselan/common/RationalNumber;
    .locals 3

    new-instance v0, Lorg/apache/sanselan/common/RationalNumber;

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    neg-int v1, v1

    iget v2, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/common/RationalNumber;-><init>(II)V

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    rem-int/2addr v0, v1

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    iget v2, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    div-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    invoke-static {}, Ljava/text/DecimalFormat;->getInstance()Ljava/text/NumberFormat;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Ljava/text/NumberFormat;->setMaximumFractionDigits(I)V

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    int-to-double v2, v1

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    int-to-double v4, v1

    div-double/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public doubleValue()D
    .locals 4

    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    int-to-double v0, v0

    iget v2, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    int-to-double v2, v2

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public floatValue()F
    .locals 2

    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    int-to-float v0, v0

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    int-to-float v1, v1

    div-float/2addr v0, v1

    return v0
.end method

.method public intValue()I
    .locals 2

    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    div-int/2addr v0, v1

    return v0
.end method

.method public longValue()J
    .locals 4

    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    int-to-long v0, v0

    iget v2, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    int-to-long v2, v2

    div-long/2addr v0, v2

    return-wide v0
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Invalid rational ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0

    :cond_0
    iget v0, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    rem-int/2addr v0, v1

    if-nez v0, :cond_1

    sget-object v0, Lorg/apache/sanselan/common/RationalNumber;->c:Ljava/text/NumberFormat;

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    iget v2, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    div-int/2addr v1, v2

    int-to-long v2, v1

    invoke-virtual {v0, v2, v3}, Ljava/text/NumberFormat;->format(J)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const-string v1, "/"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    sget-object v1, Lorg/apache/sanselan/common/RationalNumber;->c:Ljava/text/NumberFormat;

    iget v2, p0, Lorg/apache/sanselan/common/RationalNumber;->a:I

    int-to-double v2, v2

    iget v4, p0, Lorg/apache/sanselan/common/RationalNumber;->b:I

    int-to-double v4, v4

    div-double/2addr v2, v4

    invoke-virtual {v1, v2, v3}, Ljava/text/NumberFormat;->format(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
