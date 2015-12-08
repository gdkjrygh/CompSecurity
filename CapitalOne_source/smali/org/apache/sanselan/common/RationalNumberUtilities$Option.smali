.class Lorg/apache/sanselan/common/RationalNumberUtilities$Option;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lorg/apache/sanselan/common/RationalNumber;

.field public final b:D


# direct methods
.method private constructor <init>(Lorg/apache/sanselan/common/RationalNumber;D)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->a:Lorg/apache/sanselan/common/RationalNumber;

    iput-wide p2, p0, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->b:D

    return-void
.end method

.method public static final a(Lorg/apache/sanselan/common/RationalNumber;D)Lorg/apache/sanselan/common/RationalNumberUtilities$Option;
    .locals 5

    new-instance v0, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;

    invoke-virtual {p0}, Lorg/apache/sanselan/common/RationalNumber;->doubleValue()D

    move-result-wide v2

    sub-double/2addr v2, p1

    invoke-static {v2, v3}, Ljava/lang/Math;->abs(D)D

    move-result-wide v2

    invoke-direct {v0, p0, v2, v3}, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;-><init>(Lorg/apache/sanselan/common/RationalNumber;D)V

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/common/RationalNumberUtilities$Option;->a:Lorg/apache/sanselan/common/RationalNumber;

    invoke-virtual {v0}, Lorg/apache/sanselan/common/RationalNumber;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
