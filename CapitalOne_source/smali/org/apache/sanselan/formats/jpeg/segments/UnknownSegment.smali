.class public Lorg/apache/sanselan/formats/jpeg/segments/UnknownSegment;
.super Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;


# direct methods
.method public constructor <init>(I[B)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;-><init>(I[B)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Unknown ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/UnknownSegment;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
