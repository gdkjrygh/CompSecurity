.class public Lorg/apache/sanselan/ImageFormat;
.super Ljava/lang/Object;


# static fields
.field public static final d:Lorg/apache/sanselan/ImageFormat;

.field public static final e:Lorg/apache/sanselan/ImageFormat;

.field public static final f:Lorg/apache/sanselan/ImageFormat;

.field public static final g:Lorg/apache/sanselan/ImageFormat;

.field public static final h:Lorg/apache/sanselan/ImageFormat;

.field public static final i:Lorg/apache/sanselan/ImageFormat;

.field public static final j:Lorg/apache/sanselan/ImageFormat;

.field public static final k:Lorg/apache/sanselan/ImageFormat;

.field public static final l:Lorg/apache/sanselan/ImageFormat;

.field public static final m:Lorg/apache/sanselan/ImageFormat;

.field public static final n:Lorg/apache/sanselan/ImageFormat;

.field public static final o:Lorg/apache/sanselan/ImageFormat;

.field public static final p:Lorg/apache/sanselan/ImageFormat;

.field public static final q:Lorg/apache/sanselan/ImageFormat;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v2, 0x0

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "UNKNOWN"

    invoke-direct {v0, v1}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->d:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "PNG"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->e:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "GIF"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->f:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "ICO"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->g:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "TIFF"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->h:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "JPEG"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->i:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "BMP"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->j:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "PSD"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->k:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "PBM"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->l:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "PGM"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->m:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "PPM"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->n:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "PNM"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->o:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "TGA"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->p:Lorg/apache/sanselan/ImageFormat;

    new-instance v0, Lorg/apache/sanselan/ImageFormat;

    const-string v1, "JBig2"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/ImageFormat;-><init>(Ljava/lang/String;B)V

    sput-object v0, Lorg/apache/sanselan/ImageFormat;->q:Lorg/apache/sanselan/ImageFormat;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/apache/sanselan/ImageFormat;->a:Ljava/lang/String;

    iput-object p1, p0, Lorg/apache/sanselan/ImageFormat;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lorg/apache/sanselan/ImageFormat;->c:Z

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lorg/apache/sanselan/ImageFormat;->a:Ljava/lang/String;

    iput-object p1, p0, Lorg/apache/sanselan/ImageFormat;->b:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lorg/apache/sanselan/ImageFormat;->c:Z

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lorg/apache/sanselan/ImageFormat;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_0
    check-cast p1, Lorg/apache/sanselan/ImageFormat;

    iget-object v0, p1, Lorg/apache/sanselan/ImageFormat;->a:Ljava/lang/String;

    iget-object v1, p0, Lorg/apache/sanselan/ImageFormat;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lorg/apache/sanselan/ImageFormat;->a:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lorg/apache/sanselan/ImageFormat;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lorg/apache/sanselan/ImageFormat;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
