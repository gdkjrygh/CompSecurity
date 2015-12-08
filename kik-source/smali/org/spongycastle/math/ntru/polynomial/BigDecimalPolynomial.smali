.class public Lorg/spongycastle/math/ntru/polynomial/BigDecimalPolynomial;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final b:Ljava/math/BigDecimal;

.field private static final c:Ljava/math/BigDecimal;


# instance fields
.field a:[Ljava/math/BigDecimal;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 12
    new-instance v0, Ljava/math/BigDecimal;

    const-string v1, "0"

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/math/ntru/polynomial/BigDecimalPolynomial;->b:Ljava/math/BigDecimal;

    .line 13
    new-instance v0, Ljava/math/BigDecimal;

    const-string v1, "0.5"

    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/spongycastle/math/ntru/polynomial/BigDecimalPolynomial;->c:Ljava/math/BigDecimal;

    return-void
.end method

.method private constructor <init>([Ljava/math/BigDecimal;)V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    iput-object p1, p0, Lorg/spongycastle/math/ntru/polynomial/BigDecimalPolynomial;->a:[Ljava/math/BigDecimal;

    .line 39
    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 2

    .prologue
    .line 227
    new-instance v1, Lorg/spongycastle/math/ntru/polynomial/BigDecimalPolynomial;

    iget-object v0, p0, Lorg/spongycastle/math/ntru/polynomial/BigDecimalPolynomial;->a:[Ljava/math/BigDecimal;

    invoke-virtual {v0}, [Ljava/math/BigDecimal;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/math/BigDecimal;

    invoke-direct {v1, v0}, Lorg/spongycastle/math/ntru/polynomial/BigDecimalPolynomial;-><init>([Ljava/math/BigDecimal;)V

    return-object v1
.end method
