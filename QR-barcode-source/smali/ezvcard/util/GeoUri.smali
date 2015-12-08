.class public final Lezvcard/util/GeoUri;
.super Ljava/lang/Object;
.source "GeoUri.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/util/GeoUri$1;,
        Lezvcard/util/GeoUri$Builder;
    }
.end annotation


# static fields
.field public static final CRS_WGS84:Ljava/lang/String; = "wgs84"

.field private static final PARAM_CRS:Ljava/lang/String; = "crs"

.field private static final PARAM_UNCERTAINTY:Ljava/lang/String; = "u"

.field private static final hexPattern:Ljava/util/regex/Pattern;

.field private static final labelTextPattern:Ljava/util/regex/Pattern;

.field private static final uriPattern:Ljava/util/regex/Pattern;

.field private static final validParamValueChars:[C


# instance fields
.field private final coordA:Ljava/lang/Double;

.field private final coordB:Ljava/lang/Double;

.field private final coordC:Ljava/lang/Double;

.field private final crs:Ljava/lang/String;

.field private final parameters:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final uncertainty:Ljava/lang/Double;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 75
    const-string v0, "!$&\'()*+-.:[]_~"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lezvcard/util/GeoUri;->validParamValueChars:[C

    .line 78
    sget-object v0, Lezvcard/util/GeoUri;->validParamValueChars:[C

    invoke-static {v0}, Ljava/util/Arrays;->sort([C)V

    .line 84
    const-string v0, "(?i)%([0-9a-f]{2})"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lezvcard/util/GeoUri;->hexPattern:Ljava/util/regex/Pattern;

    .line 89
    const-string v0, "(?i)^[-a-z0-9]+$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lezvcard/util/GeoUri;->labelTextPattern:Ljava/util/regex/Pattern;

    .line 94
    const-string v0, "(?i)^geo:(-?\\d+(\\.\\d+)?),(-?\\d+(\\.\\d+)?)(,(-?\\d+(\\.\\d+)?))?(;(.*))?$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lezvcard/util/GeoUri;->uriPattern:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>(Lezvcard/util/GeoUri$Builder;)V
    .locals 1
    .param p1, "builder"    # Lezvcard/util/GeoUri$Builder;

    .prologue
    .line 106
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 107
    # getter for: Lezvcard/util/GeoUri$Builder;->coordA:Ljava/lang/Double;
    invoke-static {p1}, Lezvcard/util/GeoUri$Builder;->access$000(Lezvcard/util/GeoUri$Builder;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/GeoUri;->coordA:Ljava/lang/Double;

    .line 108
    # getter for: Lezvcard/util/GeoUri$Builder;->coordB:Ljava/lang/Double;
    invoke-static {p1}, Lezvcard/util/GeoUri$Builder;->access$100(Lezvcard/util/GeoUri$Builder;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/GeoUri;->coordB:Ljava/lang/Double;

    .line 109
    # getter for: Lezvcard/util/GeoUri$Builder;->coordC:Ljava/lang/Double;
    invoke-static {p1}, Lezvcard/util/GeoUri$Builder;->access$200(Lezvcard/util/GeoUri$Builder;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/GeoUri;->coordC:Ljava/lang/Double;

    .line 110
    # getter for: Lezvcard/util/GeoUri$Builder;->crs:Ljava/lang/String;
    invoke-static {p1}, Lezvcard/util/GeoUri$Builder;->access$300(Lezvcard/util/GeoUri$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/GeoUri;->crs:Ljava/lang/String;

    .line 111
    # getter for: Lezvcard/util/GeoUri$Builder;->uncertainty:Ljava/lang/Double;
    invoke-static {p1}, Lezvcard/util/GeoUri$Builder;->access$400(Lezvcard/util/GeoUri$Builder;)Ljava/lang/Double;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/GeoUri;->uncertainty:Ljava/lang/Double;

    .line 112
    # getter for: Lezvcard/util/GeoUri$Builder;->parameters:Ljava/util/Map;
    invoke-static {p1}, Lezvcard/util/GeoUri$Builder;->access$500(Lezvcard/util/GeoUri$Builder;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/GeoUri;->parameters:Ljava/util/Map;

    .line 113
    return-void
.end method

.method synthetic constructor <init>(Lezvcard/util/GeoUri$Builder;Lezvcard/util/GeoUri$1;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/util/GeoUri$Builder;
    .param p2, "x1"    # Lezvcard/util/GeoUri$1;

    .prologue
    .line 65
    invoke-direct {p0, p1}, Lezvcard/util/GeoUri;-><init>(Lezvcard/util/GeoUri$Builder;)V

    return-void
.end method

.method static synthetic access$1000(Lezvcard/util/GeoUri;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri;

    .prologue
    .line 65
    iget-object v0, p0, Lezvcard/util/GeoUri;->crs:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$1100(Lezvcard/util/GeoUri;)Ljava/lang/Double;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri;

    .prologue
    .line 65
    iget-object v0, p0, Lezvcard/util/GeoUri;->uncertainty:Ljava/lang/Double;

    return-object v0
.end method

.method static synthetic access$1200(Lezvcard/util/GeoUri;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri;

    .prologue
    .line 65
    iget-object v0, p0, Lezvcard/util/GeoUri;->parameters:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$1300(Ljava/lang/String;)Z
    .locals 1
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 65
    invoke-static {p0}, Lezvcard/util/GeoUri;->isLabelText(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$700(Lezvcard/util/GeoUri;)Ljava/lang/Double;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri;

    .prologue
    .line 65
    iget-object v0, p0, Lezvcard/util/GeoUri;->coordA:Ljava/lang/Double;

    return-object v0
.end method

.method static synthetic access$800(Lezvcard/util/GeoUri;)Ljava/lang/Double;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri;

    .prologue
    .line 65
    iget-object v0, p0, Lezvcard/util/GeoUri;->coordB:Ljava/lang/Double;

    return-object v0
.end method

.method static synthetic access$900(Lezvcard/util/GeoUri;)Ljava/lang/Double;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/GeoUri;

    .prologue
    .line 65
    iget-object v0, p0, Lezvcard/util/GeoUri;->coordC:Ljava/lang/Double;

    return-object v0
.end method

.method private static decodeParamValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 307
    sget-object v3, Lezvcard/util/GeoUri;->hexPattern:Ljava/util/regex/Pattern;

    invoke-virtual {v3, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 308
    .local v1, "m":Ljava/util/regex/Matcher;
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 309
    .local v2, "sb":Ljava/lang/StringBuffer;
    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 310
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    .line 311
    .local v0, "hex":I
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, ""

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    int-to-char v4, v0

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljava/util/regex/Matcher;->appendReplacement(Ljava/lang/StringBuffer;Ljava/lang/String;)Ljava/util/regex/Matcher;

    goto :goto_0

    .line 313
    .end local v0    # "hex":I
    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 314
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method private static encodeParamValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 7
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 293
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v6

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 294
    .local v5, "sb":Ljava/lang/StringBuilder;
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    .local v0, "arr$":[C
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_5

    aget-char v1, v0, v3

    .line 295
    .local v1, "c":C
    const/16 v6, 0x61

    if-lt v1, v6, :cond_0

    const/16 v6, 0x7a

    if-le v1, v6, :cond_3

    :cond_0
    const/16 v6, 0x41

    if-lt v1, v6, :cond_1

    const/16 v6, 0x5a

    if-le v1, v6, :cond_3

    :cond_1
    const/16 v6, 0x30

    if-lt v1, v6, :cond_2

    const/16 v6, 0x39

    if-le v1, v6, :cond_3

    :cond_2
    sget-object v6, Lezvcard/util/GeoUri;->validParamValueChars:[C

    invoke-static {v6, v1}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result v6

    if-ltz v6, :cond_4

    .line 296
    :cond_3
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 294
    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 298
    :cond_4
    move v2, v1

    .line 299
    .local v2, "i":I
    const/16 v6, 0x25

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 300
    const/16 v6, 0x10

    invoke-static {v2, v6}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 303
    .end local v1    # "c":C
    .end local v2    # "i":I
    :cond_5
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    return-object v6
.end method

.method private static isLabelText(Ljava/lang/String;)Z
    .locals 1
    .param p0, "text"    # Ljava/lang/String;

    .prologue
    .line 289
    sget-object v0, Lezvcard/util/GeoUri;->labelTextPattern:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z

    move-result v0

    return v0
.end method

.method public static parse(Ljava/lang/String;)Lezvcard/util/GeoUri;
    .locals 15
    .param p0, "uri"    # Ljava/lang/String;

    .prologue
    const/4 v14, 0x1

    .line 122
    sget-object v12, Lezvcard/util/GeoUri;->uriPattern:Ljava/util/regex/Pattern;

    invoke-virtual {v12, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v5

    .line 123
    .local v5, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v5}, Ljava/util/regex/Matcher;->find()Z

    move-result v12

    if-nez v12, :cond_0

    .line 124
    new-instance v12, Ljava/lang/IllegalArgumentException;

    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V

    const-string v14, "Invalid geo URI: "

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v13

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-direct {v12, v13}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v12

    .line 127
    :cond_0
    new-instance v1, Lezvcard/util/GeoUri$Builder;

    const/4 v12, 0x0

    invoke-direct {v1, v12}, Lezvcard/util/GeoUri$Builder;-><init>(Lezvcard/util/GeoUri$1;)V

    .line 128
    .local v1, "builder":Lezvcard/util/GeoUri$Builder;
    invoke-virtual {v5, v14}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    # setter for: Lezvcard/util/GeoUri$Builder;->coordA:Ljava/lang/Double;
    invoke-static {v1, v12}, Lezvcard/util/GeoUri$Builder;->access$002(Lezvcard/util/GeoUri$Builder;Ljava/lang/Double;)Ljava/lang/Double;

    .line 129
    const/4 v12, 0x3

    invoke-virtual {v5, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v12

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    # setter for: Lezvcard/util/GeoUri$Builder;->coordB:Ljava/lang/Double;
    invoke-static {v1, v12}, Lezvcard/util/GeoUri$Builder;->access$102(Lezvcard/util/GeoUri$Builder;Ljava/lang/Double;)Ljava/lang/Double;

    .line 131
    const/4 v12, 0x6

    invoke-virtual {v5, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v2

    .line 132
    .local v2, "coordCStr":Ljava/lang/String;
    if-eqz v2, :cond_1

    .line 133
    invoke-static {v2}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v12

    # setter for: Lezvcard/util/GeoUri$Builder;->coordC:Ljava/lang/Double;
    invoke-static {v1, v12}, Lezvcard/util/GeoUri$Builder;->access$202(Lezvcard/util/GeoUri$Builder;Ljava/lang/Double;)Ljava/lang/Double;

    .line 136
    :cond_1
    const/16 v12, 0x9

    invoke-virtual {v5, v12}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v11

    .line 137
    .local v11, "paramsStr":Ljava/lang/String;
    if-eqz v11, :cond_5

    .line 138
    const-string v12, ";"

    invoke-virtual {v11, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v10

    .line 140
    .local v10, "paramsArray":[Ljava/lang/String;
    move-object v0, v10

    .local v0, "arr$":[Ljava/lang/String;
    array-length v4, v0

    .local v4, "len$":I
    const/4 v3, 0x0

    .local v3, "i$":I
    :goto_0
    if-ge v3, v4, :cond_5

    aget-object v6, v0, v3

    .line 141
    .local v6, "param":Ljava/lang/String;
    const-string v12, "="

    const/4 v13, 0x2

    invoke-virtual {v6, v12, v13}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v8

    .line 142
    .local v8, "paramSplit":[Ljava/lang/String;
    const/4 v12, 0x0

    aget-object v7, v8, v12

    .line 143
    .local v7, "paramName":Ljava/lang/String;
    array-length v12, v8

    if-le v12, v14, :cond_2

    aget-object v12, v8, v14

    invoke-static {v12}, Lezvcard/util/GeoUri;->decodeParamValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    .line 145
    .local v9, "paramValue":Ljava/lang/String;
    :goto_1
    const-string v12, "crs"

    invoke-virtual {v12, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_3

    .line 146
    # setter for: Lezvcard/util/GeoUri$Builder;->crs:Ljava/lang/String;
    invoke-static {v1, v9}, Lezvcard/util/GeoUri$Builder;->access$302(Lezvcard/util/GeoUri$Builder;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 143
    .end local v9    # "paramValue":Ljava/lang/String;
    :cond_2
    const-string v9, ""

    goto :goto_1

    .line 150
    .restart local v9    # "paramValue":Ljava/lang/String;
    :cond_3
    const-string v12, "u"

    invoke-virtual {v12, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_4

    .line 152
    :try_start_0
    invoke-static {v9}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v12

    # setter for: Lezvcard/util/GeoUri$Builder;->uncertainty:Ljava/lang/Double;
    invoke-static {v1, v12}, Lezvcard/util/GeoUri$Builder;->access$402(Lezvcard/util/GeoUri$Builder;Ljava/lang/Double;)Ljava/lang/Double;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    .line 154
    :catch_0
    move-exception v12

    .line 159
    :cond_4
    # getter for: Lezvcard/util/GeoUri$Builder;->parameters:Ljava/util/Map;
    invoke-static {v1}, Lezvcard/util/GeoUri$Builder;->access$500(Lezvcard/util/GeoUri$Builder;)Ljava/util/Map;

    move-result-object v12

    invoke-interface {v12, v7, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 163
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v3    # "i$":I
    .end local v4    # "len$":I
    .end local v6    # "param":Ljava/lang/String;
    .end local v7    # "paramName":Ljava/lang/String;
    .end local v8    # "paramSplit":[Ljava/lang/String;
    .end local v9    # "paramValue":Ljava/lang/String;
    .end local v10    # "paramsArray":[Ljava/lang/String;
    :cond_5
    invoke-virtual {v1}, Lezvcard/util/GeoUri$Builder;->build()Lezvcard/util/GeoUri;

    move-result-object v12

    return-object v12
.end method

.method private writeParameter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;
    .param p3, "sb"    # Ljava/lang/StringBuilder;

    .prologue
    .line 285
    const/16 v0, 0x3b

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lezvcard/util/GeoUri;->encodeParamValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    return-void
.end method


# virtual methods
.method public getCoordA()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 171
    iget-object v0, p0, Lezvcard/util/GeoUri;->coordA:Ljava/lang/Double;

    return-object v0
.end method

.method public getCoordB()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 179
    iget-object v0, p0, Lezvcard/util/GeoUri;->coordB:Ljava/lang/Double;

    return-object v0
.end method

.method public getCoordC()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lezvcard/util/GeoUri;->coordC:Ljava/lang/Double;

    return-object v0
.end method

.method public getCrs()Ljava/lang/String;
    .locals 1

    .prologue
    .line 196
    iget-object v0, p0, Lezvcard/util/GeoUri;->crs:Ljava/lang/String;

    return-object v0
.end method

.method public getParameter(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 213
    iget-object v0, p0, Lezvcard/util/GeoUri;->parameters:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method public getParameters()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 221
    iget-object v0, p0, Lezvcard/util/GeoUri;->parameters:Ljava/util/Map;

    return-object v0
.end method

.method public getUncertainty()Ljava/lang/Double;
    .locals 1

    .prologue
    .line 204
    iget-object v0, p0, Lezvcard/util/GeoUri;->uncertainty:Ljava/lang/Double;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .prologue
    .line 238
    const/4 v0, 0x6

    invoke-virtual {p0, v0}, Lezvcard/util/GeoUri;->toString(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toString(I)Ljava/lang/String;
    .locals 8
    .param p1, "decimals"    # I

    .prologue
    const/16 v7, 0x2c

    .line 248
    new-instance v1, Lezvcard/util/VCardFloatFormatter;

    invoke-direct {v1, p1}, Lezvcard/util/VCardFloatFormatter;-><init>(I)V

    .line 249
    .local v1, "formatter":Lezvcard/util/VCardFloatFormatter;
    new-instance v4, Ljava/lang/StringBuilder;

    const-string v6, "geo:"

    invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 251
    .local v4, "sb":Ljava/lang/StringBuilder;
    iget-object v6, p0, Lezvcard/util/GeoUri;->coordA:Ljava/lang/Double;

    invoke-virtual {v1, v6}, Lezvcard/util/VCardFloatFormatter;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 252
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 253
    iget-object v6, p0, Lezvcard/util/GeoUri;->coordB:Ljava/lang/Double;

    invoke-virtual {v1, v6}, Lezvcard/util/VCardFloatFormatter;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    iget-object v6, p0, Lezvcard/util/GeoUri;->coordC:Ljava/lang/Double;

    if-eqz v6, :cond_0

    .line 256
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 257
    iget-object v6, p0, Lezvcard/util/GeoUri;->coordC:Ljava/lang/Double;

    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 261
    :cond_0
    iget-object v6, p0, Lezvcard/util/GeoUri;->crs:Ljava/lang/String;

    if-eqz v6, :cond_1

    iget-object v6, p0, Lezvcard/util/GeoUri;->crs:Ljava/lang/String;

    const-string v7, "wgs84"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_1

    .line 262
    const-string v6, "crs"

    iget-object v7, p0, Lezvcard/util/GeoUri;->crs:Ljava/lang/String;

    invoke-direct {p0, v6, v7, v4}, Lezvcard/util/GeoUri;->writeParameter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 265
    :cond_1
    iget-object v6, p0, Lezvcard/util/GeoUri;->uncertainty:Ljava/lang/Double;

    if-eqz v6, :cond_2

    .line 266
    const-string v6, "u"

    iget-object v7, p0, Lezvcard/util/GeoUri;->uncertainty:Ljava/lang/Double;

    invoke-virtual {v1, v7}, Lezvcard/util/VCardFloatFormatter;->format(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {p0, v6, v7, v4}, Lezvcard/util/GeoUri;->writeParameter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 269
    :cond_2
    iget-object v6, p0, Lezvcard/util/GeoUri;->parameters:Ljava/util/Map;

    invoke-interface {v6}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    .local v2, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 270
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 271
    .local v3, "name":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    .line 272
    .local v5, "value":Ljava/lang/String;
    invoke-direct {p0, v3, v5, v4}, Lezvcard/util/GeoUri;->writeParameter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 275
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v3    # "name":Ljava/lang/String;
    .end local v5    # "value":Ljava/lang/String;
    :cond_3
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    return-object v6
.end method

.method public toUri()Ljava/net/URI;
    .locals 1

    .prologue
    .line 229
    invoke-virtual {p0}, Lezvcard/util/GeoUri;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/net/URI;->create(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    return-object v0
.end method
