.class public interface abstract Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants;
.implements Lorg/apache/sanselan/formats/tiff/constants/TiffFieldTypeConstants;


# static fields
.field public static final Q:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final aV_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final aW_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final aX_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final aY_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final aZ_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final ba_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bb_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bc_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bd_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final be_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bf_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bg_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bh_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bi_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bj_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bk_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bl_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bm_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bn_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bo_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bp_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bq_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final br_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bs_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bt_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bu_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bv_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bw_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bx_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final by_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

.field public static final bz_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Version ID"

    const/4 v2, 0x0

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gl:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x4

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->aV_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Latitude Ref"

    const/4 v2, 0x1

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x2

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->aW_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Latitude"

    const/4 v2, 0x2

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x3

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->aX_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Longitude Ref"

    const/4 v2, 0x3

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x2

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->aY_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Longitude"

    const/4 v2, 0x4

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x3

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->aZ_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Altitude Ref"

    const/4 v2, 0x5

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gl:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, -0x1

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ba_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Altitude"

    const/4 v2, 0x6

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, -0x1

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bb_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Time Stamp"

    const/4 v2, 0x7

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x3

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bc_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Satellites"

    const/16 v2, 0x8

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, -0x1

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bd_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Status"

    const/16 v2, 0x9

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x2

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->be_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Measure Mode"

    const/16 v2, 0xa

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x2

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bf_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS DOP"

    const/16 v2, 0xb

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, -0x1

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bg_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Speed Ref"

    const/16 v2, 0xc

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x2

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bh_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Speed"

    const/16 v2, 0xd

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, -0x1

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bi_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Track Ref"

    const/16 v2, 0xe

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x2

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bj_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Track"

    const/16 v2, 0xf

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, -0x1

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bk_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Img Direction Ref"

    const/16 v2, 0x10

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x2

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bl_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Img Direction"

    const/16 v2, 0x11

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, -0x1

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bm_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Map Datum"

    const/16 v2, 0x12

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, -0x1

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bn_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Dest Latitude Ref"

    const/16 v2, 0x13

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x2

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bo_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Dest Latitude"

    const/16 v2, 0x14

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x3

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bp_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Dest Longitude Ref"

    const/16 v2, 0x15

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x2

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bq_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Dest Longitude"

    const/16 v2, 0x16

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x3

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->br_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Dest Bearing Ref"

    const/16 v2, 0x17

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x2

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bs_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Dest Bearing"

    const/16 v2, 0x18

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, -0x1

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bt_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Dest Distance Ref"

    const/16 v2, 0x19

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, 0x2

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bu_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Dest Distance"

    const/16 v2, 0x1a

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gj:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, -0x1

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bv_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;

    const-string v1, "GPS Processing Method"

    const/16 v2, 0x1b

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gn:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bw_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;

    const-string v1, "GPS Area Information"

    const/16 v2, 0x1c

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gn:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    sget-object v4, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct {v0, v1, v2, v3, v4}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo$Text;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bx_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Date Stamp"

    const/16 v2, 0x1d

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->gh:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/16 v4, 0xb

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->by_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    new-instance v0, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const-string v1, "GPS Differential"

    const/16 v2, 0x1e

    sget-object v3, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->r_:[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;

    const/4 v4, -0x1

    sget-object v5, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ge:Lorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;

    invoke-direct/range {v0 .. v5}, Lorg/apache/sanselan/formats/tiff/constants/TagInfo;-><init>(Ljava/lang/String;I[Lorg/apache/sanselan/formats/tiff/fieldtypes/FieldType;ILorg/apache/sanselan/formats/tiff/constants/TiffDirectoryConstants$ExifDirectoryType;)V

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bz_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const/16 v0, 0x1f

    new-array v0, v0, [Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    const/4 v1, 0x0

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->aV_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->aW_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->aX_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->aY_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/4 v1, 0x4

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->aZ_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/4 v1, 0x5

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->ba_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bb_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/4 v1, 0x7

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bc_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x8

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bd_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x9

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->be_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0xa

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bf_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0xb

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bg_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0xc

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bh_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0xd

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bi_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0xe

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bj_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0xf

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bk_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x10

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bl_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x11

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bm_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x12

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bn_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x13

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bo_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x14

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bp_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x15

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bq_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x16

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->br_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x17

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bs_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x18

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bt_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x19

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bu_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bv_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bw_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bx_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->by_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    sget-object v2, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->bz_:Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    aput-object v2, v0, v1

    sput-object v0, Lorg/apache/sanselan/formats/tiff/constants/GPSTagConstants;->Q:[Lorg/apache/sanselan/formats/tiff/constants/TagInfo;

    return-void
.end method
