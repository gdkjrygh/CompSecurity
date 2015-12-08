.class public Lorg/spongycastle/math/ntru/polynomial/Constants;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field static final a:Ljava/math/BigInteger;

.field static final b:Ljava/math/BigInteger;

.field static final c:Ljava/math/BigDecimal;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .prologue
    const-wide/16 v2, 0x1

    .line 8
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/math/ntru/polynomial/Constants;->a:Ljava/math/BigInteger;

    .line 9
    invoke-static {v2, v3}, Ljava/math/BigInteger;->valueOf(J)Ljava/math/BigInteger;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/math/ntru/polynomial/Constants;->b:Ljava/math/BigInteger;

    .line 11
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    move-result-object v0

    sput-object v0, Lorg/spongycastle/math/ntru/polynomial/Constants;->c:Ljava/math/BigDecimal;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
