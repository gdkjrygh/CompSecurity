.class Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/TiffReader$Listener;


# instance fields
.field private a:Lorg/apache/sanselan/formats/tiff/TiffHeader;

.field private b:Ljava/util/ArrayList;

.field private c:Ljava/util/ArrayList;

.field private final d:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;-><init>(B)V

    return-void
.end method

.method public constructor <init>(B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->a:Lorg/apache/sanselan/formats/tiff/TiffHeader;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->b:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->c:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->d:Z

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->d:Z

    return v0
.end method

.method public a(Lorg/apache/sanselan/formats/tiff/TiffDirectory;)Z
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    return v0
.end method

.method public final a(Lorg/apache/sanselan/formats/tiff/TiffField;)Z
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->c:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    return v0
.end method

.method public final a(Lorg/apache/sanselan/formats/tiff/TiffHeader;)Z
    .locals 1

    iput-object p1, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->a:Lorg/apache/sanselan/formats/tiff/TiffHeader;

    const/4 v0, 0x1

    return v0
.end method

.method public final b()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final c()Lorg/apache/sanselan/formats/tiff/TiffContents;
    .locals 3

    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffContents;

    iget-object v1, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->a:Lorg/apache/sanselan/formats/tiff/TiffHeader;

    iget-object v2, p0, Lorg/apache/sanselan/formats/tiff/TiffReader$Collector;->b:Ljava/util/ArrayList;

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/TiffContents;-><init>(Lorg/apache/sanselan/formats/tiff/TiffHeader;Ljava/util/ArrayList;)V

    return-object v0
.end method
