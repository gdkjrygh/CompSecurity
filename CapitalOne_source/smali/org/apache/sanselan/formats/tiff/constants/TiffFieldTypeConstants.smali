.class public interface abstract Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/SanselanConstants;


# static fields
.field public static final fP:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

.field public static final fR:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

.field public static final fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

.field public static final fU:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final fW:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final g_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

.field public static final gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final gi:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final gk:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final gl:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final gm:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final gn:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final h_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;

.field public static final i_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final j_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final k_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final l_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final m_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final n_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final o_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final p_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final q_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final r_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

.field public static final s_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;


# direct methods
.method static constructor <clinit>()V
    .locals 8

    const/4 v7, 0x4

    const/4 v6, 0x3

    const/4 v5, 0x2

    const/4 v4, 0x0

    const/4 v3, 0x1

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    const-string v1, "Byte"

    invoke-direct {v0, v3, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fP:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    const-string v1, "ASCII"

    invoke-direct {v0, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;-><init>(Ljava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->g_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    const-string v1, "Short"

    invoke-direct {v0, v6, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fR:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    const-string v1, "Long"

    invoke-direct {v0, v7, v1}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;

    const/4 v1, 0x5

    const-string v2, "Rational"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->h_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    const/4 v1, 0x6

    const-string v2, "SByte"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fU:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    const/4 v1, 0x7

    const-string v2, "Undefined"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->i_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    const/16 v1, 0x8

    const-string v2, "SShort"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fW:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    const/16 v1, 0x9

    const-string v2, "SLong"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->j_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;

    const/16 v1, 0xa

    const-string v2, "SRational"

    invoke-direct {v0, v1, v2}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;-><init>(ILjava/lang/String;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->k_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeFloat;-><init>()V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->l_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeDouble;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeDouble;-><init>()V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->m_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeUnknown;

    invoke-direct {v0}, Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeUnknown;-><init>()V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->n_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/16 v0, 0xc

    new-array v0, v0, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fP:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    aput-object v1, v0, v4

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->g_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    aput-object v1, v0, v3

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fR:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    aput-object v1, v0, v5

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    aput-object v1, v0, v6

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->h_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;

    aput-object v1, v0, v7

    const/4 v1, 0x5

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fU:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->i_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fW:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->j_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->k_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->l_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->m_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    aput-object v2, v0, v1

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->o_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->p_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-array v0, v3, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    aput-object v1, v0, v4

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->q_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-array v0, v3, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fR:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    aput-object v1, v0, v4

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->r_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-array v0, v5, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fR:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    aput-object v1, v0, v4

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    aput-object v1, v0, v3

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->s_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-array v0, v3, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->g_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeASCII;

    aput-object v1, v0, v4

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-array v0, v5, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fR:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    aput-object v1, v0, v4

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fS:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeLong;

    aput-object v1, v0, v3

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->gi:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-array v0, v3, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->h_:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeRational;

    aput-object v1, v0, v4

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-array v0, v5, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fR:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeShort;

    aput-object v1, v0, v4

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fP:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    aput-object v1, v0, v3

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->gk:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    new-array v0, v3, [Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v1, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->fP:Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldTypeByte;

    aput-object v1, v0, v4

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->gl:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->p_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->gm:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v0, 0x0

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;->gn:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    return-void
.end method
