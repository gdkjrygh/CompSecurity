.class public Lorg/apache/sanselan/formats/jpeg/segments/APPNSegment;
.super Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;


# direct methods
.method public constructor <init>(IILjava/io/InputStream;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lorg/apache/sanselan/formats/jpeg/segments/GenericSegment;-><init>(IILjava/io/InputStream;)V

    return-void
.end method


# virtual methods
.method public final d()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "APPN (APP"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lorg/apache/sanselan/formats/jpeg/segments/APPNSegment;->t_:I

    const v2, 0xffe0

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ") ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {p0}, Lorg/apache/sanselan/formats/jpeg/segments/APPNSegment;->e()Ljava/lang/String;

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
