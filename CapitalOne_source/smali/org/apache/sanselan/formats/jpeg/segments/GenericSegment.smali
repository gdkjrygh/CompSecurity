.class public abstract Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;
.super Lorg/apache/sanselan/formats/jpeg/segments/Segment;


# instance fields
.field public final e:[B


# direct methods
.method public constructor <init>(IILjava/io/InputStream;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;-><init>(II)V

    const-string v0, "Segment Data"

    const-string v1, "Invalid Segment: insufficient data"

    invoke-virtual {p0, v0, p2, p3, v1}, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->a(Ljava/lang/String;ILjava/io/InputStream;Ljava/lang/String;)[B

    move-result-object v0

    iput-object v0, p0, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->e:[B

    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 1

    array-length v0, p2

    invoke-direct {p0, p1, v0}, Lorg/apache/sanselan/formats/jpeg/segments/Segment;-><init>(II)V

    iput-object p2, p0, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;->e:[B

    return-void
.end method
