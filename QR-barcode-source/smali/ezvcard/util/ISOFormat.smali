.class public final enum Lezvcard/util/ISOFormat;
.super Ljava/lang/Enum;
.source "ISOFormat.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum",
        "<",
        "Lezvcard/util/ISOFormat;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lezvcard/util/ISOFormat;

.field public static final enum DATE_BASIC:Lezvcard/util/ISOFormat;

.field public static final enum DATE_EXTENDED:Lezvcard/util/ISOFormat;

.field public static final enum HCARD_TIME_TAG:Lezvcard/util/ISOFormat;

.field public static final enum TIME_BASIC:Lezvcard/util/ISOFormat;

.field public static final enum TIME_EXTENDED:Lezvcard/util/ISOFormat;

.field public static final enum UTC_TIME_BASIC:Lezvcard/util/ISOFormat;

.field public static final enum UTC_TIME_EXTENDED:Lezvcard/util/ISOFormat;


# instance fields
.field private final formatFormat:Ljava/lang/String;

.field private final parseFormat:Ljava/lang/String;

.field private final pattern:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    .prologue
    const/4 v2, 0x4

    const/4 v12, 0x3

    const/4 v11, 0x2

    const/4 v10, 0x1

    const/4 v9, 0x0

    .line 75
    new-instance v0, Lezvcard/util/ISOFormat;

    const-string v1, "DATE_BASIC"

    const-string v3, "\\d{8}"

    const-string v4, "yyyyMMdd"

    invoke-direct {v0, v1, v9, v3, v4}, Lezvcard/util/ISOFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/util/ISOFormat;->DATE_BASIC:Lezvcard/util/ISOFormat;

    .line 80
    new-instance v0, Lezvcard/util/ISOFormat;

    const-string v1, "DATE_EXTENDED"

    const-string v3, "\\d{4}-\\d{2}-\\d{2}"

    const-string v4, "yyyy-MM-dd"

    invoke-direct {v0, v1, v10, v3, v4}, Lezvcard/util/ISOFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/util/ISOFormat;->DATE_EXTENDED:Lezvcard/util/ISOFormat;

    .line 85
    new-instance v0, Lezvcard/util/ISOFormat;

    const-string v1, "TIME_BASIC"

    const-string v3, "\\d{8}T\\d{6}[-\\+]\\d{4}"

    const-string v4, "yyyyMMdd\'T\'HHmmssZ"

    invoke-direct {v0, v1, v11, v3, v4}, Lezvcard/util/ISOFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/util/ISOFormat;->TIME_BASIC:Lezvcard/util/ISOFormat;

    .line 90
    new-instance v0, Lezvcard/util/ISOFormat;

    const-string v1, "TIME_EXTENDED"

    const-string v3, "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}[-\\+]\\d{2}:\\d{2}"

    const-string v4, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    invoke-direct {v0, v1, v12, v3, v4}, Lezvcard/util/ISOFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/util/ISOFormat;->TIME_EXTENDED:Lezvcard/util/ISOFormat;

    .line 95
    new-instance v0, Lezvcard/util/ISOFormat;

    const-string v1, "UTC_TIME_BASIC"

    const-string v3, "\\d{8}T\\d{6}Z"

    const-string v4, "yyyyMMdd\'T\'HHmmssZ"

    const-string v5, "yyyyMMdd\'T\'HHmmss\'Z\'"

    invoke-direct/range {v0 .. v5}, Lezvcard/util/ISOFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/util/ISOFormat;->UTC_TIME_BASIC:Lezvcard/util/ISOFormat;

    .line 100
    new-instance v3, Lezvcard/util/ISOFormat;

    const-string v4, "UTC_TIME_EXTENDED"

    const/4 v5, 0x5

    const-string v6, "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}Z"

    const-string v7, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    const-string v8, "yyyy-MM-dd\'T\'HH:mm:ss\'Z\'"

    invoke-direct/range {v3 .. v8}, Lezvcard/util/ISOFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sput-object v3, Lezvcard/util/ISOFormat;->UTC_TIME_EXTENDED:Lezvcard/util/ISOFormat;

    .line 105
    new-instance v0, Lezvcard/util/ISOFormat;

    const-string v1, "HCARD_TIME_TAG"

    const/4 v3, 0x6

    const-string v4, "\\d{4}-\\d{2}-\\d{2}T\\d{2}:\\d{2}:\\d{2}[-\\+]\\d{2}:?\\d{2}"

    const-string v5, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    invoke-direct {v0, v1, v3, v4, v5}, Lezvcard/util/ISOFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V

    sput-object v0, Lezvcard/util/ISOFormat;->HCARD_TIME_TAG:Lezvcard/util/ISOFormat;

    .line 70
    const/4 v0, 0x7

    new-array v0, v0, [Lezvcard/util/ISOFormat;

    sget-object v1, Lezvcard/util/ISOFormat;->DATE_BASIC:Lezvcard/util/ISOFormat;

    aput-object v1, v0, v9

    sget-object v1, Lezvcard/util/ISOFormat;->DATE_EXTENDED:Lezvcard/util/ISOFormat;

    aput-object v1, v0, v10

    sget-object v1, Lezvcard/util/ISOFormat;->TIME_BASIC:Lezvcard/util/ISOFormat;

    aput-object v1, v0, v11

    sget-object v1, Lezvcard/util/ISOFormat;->TIME_EXTENDED:Lezvcard/util/ISOFormat;

    aput-object v1, v0, v12

    sget-object v1, Lezvcard/util/ISOFormat;->UTC_TIME_BASIC:Lezvcard/util/ISOFormat;

    aput-object v1, v0, v2

    const/4 v1, 0x5

    sget-object v2, Lezvcard/util/ISOFormat;->UTC_TIME_EXTENDED:Lezvcard/util/ISOFormat;

    aput-object v2, v0, v1

    const/4 v1, 0x6

    sget-object v2, Lezvcard/util/ISOFormat;->HCARD_TIME_TAG:Lezvcard/util/ISOFormat;

    aput-object v2, v0, v1

    sput-object v0, Lezvcard/util/ISOFormat;->$VALUES:[Lezvcard/util/ISOFormat;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V
    .locals 6
    .param p3, "regex"    # Ljava/lang/String;
    .param p4, "format"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 129
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p4

    invoke-direct/range {v0 .. v5}, Lezvcard/util/ISOFormat;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1
    .param p3, "regex"    # Ljava/lang/String;
    .param p4, "parseFormat"    # Ljava/lang/String;
    .param p5, "formatFormat"    # Ljava/lang/String;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .prologue
    .line 139
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 140
    invoke-static {p3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/ISOFormat;->pattern:Ljava/util/regex/Pattern;

    .line 141
    iput-object p4, p0, Lezvcard/util/ISOFormat;->parseFormat:Ljava/lang/String;

    .line 142
    iput-object p5, p0, Lezvcard/util/ISOFormat;->formatFormat:Ljava/lang/String;

    .line 143
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lezvcard/util/ISOFormat;
    .locals 1
    .param p0, "name"    # Ljava/lang/String;

    .prologue
    .line 70
    const-class v0, Lezvcard/util/ISOFormat;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object v0

    check-cast v0, Lezvcard/util/ISOFormat;

    return-object v0
.end method

.method public static values()[Lezvcard/util/ISOFormat;
    .locals 1

    .prologue
    .line 70
    sget-object v0, Lezvcard/util/ISOFormat;->$VALUES:[Lezvcard/util/ISOFormat;

    invoke-virtual {v0}, [Lezvcard/util/ISOFormat;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lezvcard/util/ISOFormat;

    return-object v0
.end method


# virtual methods
.method public getFormatDateFormat()Ljava/text/DateFormat;
    .locals 2

    .prologue
    .line 168
    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lezvcard/util/ISOFormat;->formatFormat:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public getParseDateFormat()Ljava/text/DateFormat;
    .locals 2

    .prologue
    .line 159
    new-instance v0, Ljava/text/SimpleDateFormat;

    iget-object v1, p0, Lezvcard/util/ISOFormat;->parseFormat:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public matches(Ljava/lang/String;)Z
    .locals 1
    .param p1, "dateStr"    # Ljava/lang/String;

    .prologue
    .line 151
    iget-object v0, p0, Lezvcard/util/ISOFormat;->pattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    return v0
.end method
