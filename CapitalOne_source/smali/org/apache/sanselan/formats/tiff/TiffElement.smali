.class public abstract Lorg/apache/sanselan/formats/tiff/TiffElement;
.super Ljava/lang/Object;


# static fields
.field public static final f:Ljava/util/Comparator;


# instance fields
.field public final d:I

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lorg/apache/sanselan/formats/tiff/TiffElement$1;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/TiffElement$1;-><init>()V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/TiffElement;->f:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lorg/apache/sanselan/formats/tiff/TiffElement;->d:I

    iput p2, p0, Lorg/apache/sanselan/formats/tiff/TiffElement;->e:I

    return-void
.end method
