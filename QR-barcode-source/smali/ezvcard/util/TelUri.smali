.class public final Lezvcard/util/TelUri;
.super Ljava/lang/Object;
.source "TelUri.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lezvcard/util/TelUri$1;,
        Lezvcard/util/TelUri$Builder;
    }
.end annotation


# static fields
.field private static final PARAM_EXTENSION:Ljava/lang/String; = "ext"

.field private static final PARAM_ISDN_SUBADDRESS:Ljava/lang/String; = "isub"

.field private static final PARAM_PHONE_CONTEXT:Ljava/lang/String; = "phone-context"

.field private static final hexPattern:Ljava/util/regex/Pattern;

.field private static final uriPattern:Ljava/util/regex/Pattern;

.field private static final validParamValueChars:[C


# instance fields
.field private final extension:Ljava/lang/String;

.field private final isdnSubaddress:Ljava/lang/String;

.field private final number:Ljava/lang/String;

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

.field private final phoneContext:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 67
    const-string v0, "!$&\'()*+-.:[]_~/"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    sput-object v0, Lezvcard/util/TelUri;->validParamValueChars:[C

    .line 70
    sget-object v0, Lezvcard/util/TelUri;->validParamValueChars:[C

    invoke-static {v0}, Ljava/util/Arrays;->sort([C)V

    .line 76
    const-string v0, "(?i)%([0-9a-f]{2})"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lezvcard/util/TelUri;->hexPattern:Ljava/util/regex/Pattern;

    .line 81
    const-string v0, "(?i)^tel:(.*?)(;(.*))?$"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lezvcard/util/TelUri;->uriPattern:Ljava/util/regex/Pattern;

    return-void
.end method

.method private constructor <init>(Lezvcard/util/TelUri$Builder;)V
    .locals 1
    .param p1, "builder"    # Lezvcard/util/TelUri$Builder;

    .prologue
    .line 93
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 94
    # getter for: Lezvcard/util/TelUri$Builder;->number:Ljava/lang/String;
    invoke-static {p1}, Lezvcard/util/TelUri$Builder;->access$000(Lezvcard/util/TelUri$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/TelUri;->number:Ljava/lang/String;

    .line 95
    # getter for: Lezvcard/util/TelUri$Builder;->extension:Ljava/lang/String;
    invoke-static {p1}, Lezvcard/util/TelUri$Builder;->access$100(Lezvcard/util/TelUri$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/TelUri;->extension:Ljava/lang/String;

    .line 96
    # getter for: Lezvcard/util/TelUri$Builder;->isdnSubaddress:Ljava/lang/String;
    invoke-static {p1}, Lezvcard/util/TelUri$Builder;->access$200(Lezvcard/util/TelUri$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;

    .line 97
    # getter for: Lezvcard/util/TelUri$Builder;->phoneContext:Ljava/lang/String;
    invoke-static {p1}, Lezvcard/util/TelUri$Builder;->access$300(Lezvcard/util/TelUri$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;

    .line 98
    # getter for: Lezvcard/util/TelUri$Builder;->parameters:Ljava/util/Map;
    invoke-static {p1}, Lezvcard/util/TelUri$Builder;->access$400(Lezvcard/util/TelUri$Builder;)Ljava/util/Map;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    iput-object v0, p0, Lezvcard/util/TelUri;->parameters:Ljava/util/Map;

    .line 99
    return-void
.end method

.method synthetic constructor <init>(Lezvcard/util/TelUri$Builder;Lezvcard/util/TelUri$1;)V
    .locals 0
    .param p1, "x0"    # Lezvcard/util/TelUri$Builder;
    .param p2, "x1"    # Lezvcard/util/TelUri$1;

    .prologue
    .line 62
    invoke-direct {p0, p1}, Lezvcard/util/TelUri;-><init>(Lezvcard/util/TelUri$Builder;)V

    return-void
.end method

.method static synthetic access$1000(Lezvcard/util/TelUri;)Ljava/util/Map;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/TelUri;

    .prologue
    .line 62
    iget-object v0, p0, Lezvcard/util/TelUri;->parameters:Ljava/util/Map;

    return-object v0
.end method

.method static synthetic access$1100(Ljava/lang/String;)Z
    .locals 1
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 62
    invoke-static {p0}, Lezvcard/util/TelUri;->isPhoneDigit(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$1200(Ljava/lang/String;)Z
    .locals 1
    .param p0, "x0"    # Ljava/lang/String;

    .prologue
    .line 62
    invoke-static {p0}, Lezvcard/util/TelUri;->isParametername(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method static synthetic access$600(Lezvcard/util/TelUri;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/TelUri;

    .prologue
    .line 62
    iget-object v0, p0, Lezvcard/util/TelUri;->number:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$700(Lezvcard/util/TelUri;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/TelUri;

    .prologue
    .line 62
    iget-object v0, p0, Lezvcard/util/TelUri;->extension:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$800(Lezvcard/util/TelUri;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/TelUri;

    .prologue
    .line 62
    iget-object v0, p0, Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic access$900(Lezvcard/util/TelUri;)Ljava/lang/String;
    .locals 1
    .param p0, "x0"    # Lezvcard/util/TelUri;

    .prologue
    .line 62
    iget-object v0, p0, Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;

    return-object v0
.end method

.method private static decodeParamValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 330
    sget-object v3, Lezvcard/util/TelUri;->hexPattern:Ljava/util/regex/Pattern;

    invoke-virtual {v3, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 331
    .local v1, "m":Ljava/util/regex/Matcher;
    new-instance v2, Ljava/lang/StringBuffer;

    invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V

    .line 332
    .local v2, "sb":Ljava/lang/StringBuffer;
    :goto_0
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->find()Z

    move-result v3

    if-eqz v3, :cond_0

    .line 333
    const/4 v3, 0x1

    invoke-virtual {v1, v3}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v3

    const/16 v4, 0x10

    invoke-static {v3, v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;I)I

    move-result v0

    .line 334
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

    .line 336
    .end local v0    # "hex":I
    :cond_0
    invoke-virtual {v1, v2}, Ljava/util/regex/Matcher;->appendTail(Ljava/lang/StringBuffer;)Ljava/lang/StringBuffer;

    .line 337
    invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object v3

    return-object v3
.end method

.method private static encodeParamValue(Ljava/lang/String;)Ljava/lang/String;
    .locals 5
    .param p0, "value"    # Ljava/lang/String;

    .prologue
    .line 310
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 311
    .local v3, "sb":Ljava/lang/StringBuilder;
    const/4 v2, 0x0

    .local v2, "i":I
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    if-ge v2, v4, :cond_5

    .line 312
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 313
    .local v0, "c":C
    const/16 v4, 0x61

    if-lt v0, v4, :cond_0

    const/16 v4, 0x7a

    if-le v0, v4, :cond_3

    :cond_0
    const/16 v4, 0x41

    if-lt v0, v4, :cond_1

    const/16 v4, 0x5a

    if-le v0, v4, :cond_3

    :cond_1
    const/16 v4, 0x30

    if-lt v0, v4, :cond_2

    const/16 v4, 0x39

    if-le v0, v4, :cond_3

    :cond_2
    sget-object v4, Lezvcard/util/TelUri;->validParamValueChars:[C

    invoke-static {v4, v0}, Ljava/util/Arrays;->binarySearch([CC)I

    move-result v4

    if-ltz v4, :cond_4

    .line 314
    :cond_3
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 311
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 316
    :cond_4
    move v1, v0

    .line 317
    .local v1, "cInt":I
    const/16 v4, 0x25

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 318
    const/16 v4, 0x10

    invoke-static {v1, v4}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    .line 321
    .end local v0    # "c":C
    .end local v1    # "cInt":I
    :cond_5
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    return-object v4
.end method

.method private static isParametername(Ljava/lang/String;)Z
    .locals 1
    .param p0, "text"    # Ljava/lang/String;

    .prologue
    .line 291
    const-string v0, "(?i)[-a-z0-9]+"

    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private static isPhoneDigit(Ljava/lang/String;)Z
    .locals 1
    .param p0, "text"    # Ljava/lang/String;

    .prologue
    .line 301
    const-string v0, "[-0-9.()]+"

    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public static parse(Ljava/lang/String;)Lezvcard/util/TelUri;
    .locals 14
    .param p0, "uri"    # Ljava/lang/String;

    .prologue
    const/4 v13, 0x1

    .line 108
    sget-object v11, Lezvcard/util/TelUri;->uriPattern:Ljava/util/regex/Pattern;

    invoke-virtual {v11, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v4

    .line 109
    .local v4, "m":Ljava/util/regex/Matcher;
    invoke-virtual {v4}, Ljava/util/regex/Matcher;->find()Z

    move-result v11

    if-nez v11, :cond_0

    .line 110
    new-instance v11, Ljava/lang/IllegalArgumentException;

    new-instance v12, Ljava/lang/StringBuilder;

    invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V

    const-string v13, "Invalid tel URI: "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v11

    .line 113
    :cond_0
    new-instance v1, Lezvcard/util/TelUri$Builder;

    const/4 v11, 0x0

    invoke-direct {v1, v11}, Lezvcard/util/TelUri$Builder;-><init>(Lezvcard/util/TelUri$1;)V

    .line 114
    .local v1, "builder":Lezvcard/util/TelUri$Builder;
    invoke-virtual {v4, v13}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v11

    # setter for: Lezvcard/util/TelUri$Builder;->number:Ljava/lang/String;
    invoke-static {v1, v11}, Lezvcard/util/TelUri$Builder;->access$002(Lezvcard/util/TelUri$Builder;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    const/4 v11, 0x3

    invoke-virtual {v4, v11}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v10

    .line 117
    .local v10, "paramsStr":Ljava/lang/String;
    if-eqz v10, :cond_5

    .line 118
    const-string v11, ";"

    invoke-virtual {v10, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v9

    .line 120
    .local v9, "paramsArray":[Ljava/lang/String;
    move-object v0, v9

    .local v0, "arr$":[Ljava/lang/String;
    array-length v3, v0

    .local v3, "len$":I
    const/4 v2, 0x0

    .local v2, "i$":I
    :goto_0
    if-ge v2, v3, :cond_5

    aget-object v5, v0, v2

    .line 121
    .local v5, "param":Ljava/lang/String;
    const-string v11, "="

    const/4 v12, 0x2

    invoke-virtual {v5, v11, v12}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object v7

    .line 122
    .local v7, "paramSplit":[Ljava/lang/String;
    const/4 v11, 0x0

    aget-object v6, v7, v11

    .line 123
    .local v6, "paramName":Ljava/lang/String;
    array-length v11, v7

    if-le v11, v13, :cond_1

    aget-object v11, v7, v13

    invoke-static {v11}, Lezvcard/util/TelUri;->decodeParamValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 125
    .local v8, "paramValue":Ljava/lang/String;
    :goto_1
    const-string v11, "ext"

    invoke-virtual {v11, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_2

    .line 126
    # setter for: Lezvcard/util/TelUri$Builder;->extension:Ljava/lang/String;
    invoke-static {v1, v8}, Lezvcard/util/TelUri$Builder;->access$102(Lezvcard/util/TelUri$Builder;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    :goto_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 123
    .end local v8    # "paramValue":Ljava/lang/String;
    :cond_1
    const-string v8, ""

    goto :goto_1

    .line 130
    .restart local v8    # "paramValue":Ljava/lang/String;
    :cond_2
    const-string v11, "isub"

    invoke-virtual {v11, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_3

    .line 131
    # setter for: Lezvcard/util/TelUri$Builder;->isdnSubaddress:Ljava/lang/String;
    invoke-static {v1, v8}, Lezvcard/util/TelUri$Builder;->access$202(Lezvcard/util/TelUri$Builder;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_2

    .line 135
    :cond_3
    const-string v11, "phone-context"

    invoke-virtual {v11, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v11

    if-eqz v11, :cond_4

    .line 136
    # setter for: Lezvcard/util/TelUri$Builder;->phoneContext:Ljava/lang/String;
    invoke-static {v1, v8}, Lezvcard/util/TelUri$Builder;->access$302(Lezvcard/util/TelUri$Builder;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_2

    .line 140
    :cond_4
    # getter for: Lezvcard/util/TelUri$Builder;->parameters:Ljava/util/Map;
    invoke-static {v1}, Lezvcard/util/TelUri$Builder;->access$400(Lezvcard/util/TelUri$Builder;)Ljava/util/Map;

    move-result-object v11

    invoke-interface {v11, v6, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    .line 144
    .end local v0    # "arr$":[Ljava/lang/String;
    .end local v2    # "i$":I
    .end local v3    # "len$":I
    .end local v5    # "param":Ljava/lang/String;
    .end local v6    # "paramName":Ljava/lang/String;
    .end local v7    # "paramSplit":[Ljava/lang/String;
    .end local v8    # "paramValue":Ljava/lang/String;
    .end local v9    # "paramsArray":[Ljava/lang/String;
    :cond_5
    invoke-virtual {v1}, Lezvcard/util/TelUri$Builder;->build()Lezvcard/util/TelUri;

    move-result-object v11

    return-object v11
.end method

.method private writeParameter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 2
    .param p1, "name"    # Ljava/lang/String;
    .param p2, "value"    # Ljava/lang/String;
    .param p3, "sb"    # Ljava/lang/StringBuilder;

    .prologue
    .line 232
    const/16 v0, 0x3b

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {p2}, Lezvcard/util/TelUri;->encodeParamValue(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5
    .param p1, "obj"    # Ljava/lang/Object;

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 249
    if-ne p0, p1, :cond_1

    .line 281
    :cond_0
    :goto_0
    return v1

    .line 251
    :cond_1
    if-nez p1, :cond_2

    move v1, v2

    .line 252
    goto :goto_0

    .line 253
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    if-eq v3, v4, :cond_3

    move v1, v2

    .line 254
    goto :goto_0

    :cond_3
    move-object v0, p1

    .line 255
    check-cast v0, Lezvcard/util/TelUri;

    .line 256
    .local v0, "other":Lezvcard/util/TelUri;
    iget-object v3, p0, Lezvcard/util/TelUri;->extension:Ljava/lang/String;

    if-nez v3, :cond_4

    .line 257
    iget-object v3, v0, Lezvcard/util/TelUri;->extension:Ljava/lang/String;

    if-eqz v3, :cond_5

    move v1, v2

    .line 258
    goto :goto_0

    .line 259
    :cond_4
    iget-object v3, p0, Lezvcard/util/TelUri;->extension:Ljava/lang/String;

    iget-object v4, v0, Lezvcard/util/TelUri;->extension:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_5

    move v1, v2

    .line 260
    goto :goto_0

    .line 261
    :cond_5
    iget-object v3, p0, Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;

    if-nez v3, :cond_6

    .line 262
    iget-object v3, v0, Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;

    if-eqz v3, :cond_7

    move v1, v2

    .line 263
    goto :goto_0

    .line 264
    :cond_6
    iget-object v3, p0, Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;

    iget-object v4, v0, Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    move v1, v2

    .line 265
    goto :goto_0

    .line 266
    :cond_7
    iget-object v3, p0, Lezvcard/util/TelUri;->number:Ljava/lang/String;

    if-nez v3, :cond_8

    .line 267
    iget-object v3, v0, Lezvcard/util/TelUri;->number:Ljava/lang/String;

    if-eqz v3, :cond_9

    move v1, v2

    .line 268
    goto :goto_0

    .line 269
    :cond_8
    iget-object v3, p0, Lezvcard/util/TelUri;->number:Ljava/lang/String;

    iget-object v4, v0, Lezvcard/util/TelUri;->number:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    move v1, v2

    .line 270
    goto :goto_0

    .line 271
    :cond_9
    iget-object v3, p0, Lezvcard/util/TelUri;->parameters:Ljava/util/Map;

    if-nez v3, :cond_a

    .line 272
    iget-object v3, v0, Lezvcard/util/TelUri;->parameters:Ljava/util/Map;

    if-eqz v3, :cond_b

    move v1, v2

    .line 273
    goto :goto_0

    .line 274
    :cond_a
    iget-object v3, p0, Lezvcard/util/TelUri;->parameters:Ljava/util/Map;

    iget-object v4, v0, Lezvcard/util/TelUri;->parameters:Ljava/util/Map;

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    move v1, v2

    .line 275
    goto :goto_0

    .line 276
    :cond_b
    iget-object v3, p0, Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;

    if-nez v3, :cond_c

    .line 277
    iget-object v3, v0, Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;

    if-eqz v3, :cond_0

    move v1, v2

    .line 278
    goto :goto_0

    .line 279
    :cond_c
    iget-object v3, p0, Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;

    iget-object v4, v0, Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    move v1, v2

    .line 280
    goto/16 :goto_0
.end method

.method public getExtension()Ljava/lang/String;
    .locals 1

    .prologue
    .line 168
    iget-object v0, p0, Lezvcard/util/TelUri;->extension:Ljava/lang/String;

    return-object v0
.end method

.method public getIsdnSubaddress()Ljava/lang/String;
    .locals 1

    .prologue
    .line 176
    iget-object v0, p0, Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;

    return-object v0
.end method

.method public getNumber()Ljava/lang/String;
    .locals 1

    .prologue
    .line 152
    iget-object v0, p0, Lezvcard/util/TelUri;->number:Ljava/lang/String;

    return-object v0
.end method

.method public getParameter(Ljava/lang/String;)Ljava/lang/String;
    .locals 1
    .param p1, "name"    # Ljava/lang/String;

    .prologue
    .line 185
    iget-object v0, p0, Lezvcard/util/TelUri;->parameters:Ljava/util/Map;

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
    .line 193
    iget-object v0, p0, Lezvcard/util/TelUri;->parameters:Ljava/util/Map;

    return-object v0
.end method

.method public getPhoneContext()Ljava/lang/String;
    .locals 1

    .prologue
    .line 160
    iget-object v0, p0, Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 237
    const/16 v0, 0x1f

    .line 238
    .local v0, "prime":I
    const/4 v1, 0x1

    .line 239
    .local v1, "result":I
    iget-object v2, p0, Lezvcard/util/TelUri;->extension:Ljava/lang/String;

    if-nez v2, :cond_0

    move v2, v3

    :goto_0
    add-int/lit8 v1, v2, 0x1f

    .line 240
    mul-int/lit8 v4, v1, 0x1f

    iget-object v2, p0, Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    :goto_1
    add-int v1, v4, v2

    .line 241
    mul-int/lit8 v4, v1, 0x1f

    iget-object v2, p0, Lezvcard/util/TelUri;->number:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    :goto_2
    add-int v1, v4, v2

    .line 242
    mul-int/lit8 v4, v1, 0x1f

    iget-object v2, p0, Lezvcard/util/TelUri;->parameters:Ljava/util/Map;

    if-nez v2, :cond_3

    move v2, v3

    :goto_3
    add-int v1, v4, v2

    .line 243
    mul-int/lit8 v2, v1, 0x1f

    iget-object v4, p0, Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;

    if-nez v4, :cond_4

    :goto_4
    add-int v1, v2, v3

    .line 244
    return v1

    .line 239
    :cond_0
    iget-object v2, p0, Lezvcard/util/TelUri;->extension:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    .line 240
    :cond_1
    iget-object v2, p0, Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    .line 241
    :cond_2
    iget-object v2, p0, Lezvcard/util/TelUri;->number:Ljava/lang/String;

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    .line 242
    :cond_3
    iget-object v2, p0, Lezvcard/util/TelUri;->parameters:Ljava/util/Map;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    goto :goto_3

    .line 243
    :cond_4
    iget-object v3, p0, Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    goto :goto_4
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .prologue
    .line 202
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "tel:"

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 204
    .local v3, "sb":Ljava/lang/StringBuilder;
    iget-object v5, p0, Lezvcard/util/TelUri;->number:Ljava/lang/String;

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    iget-object v5, p0, Lezvcard/util/TelUri;->extension:Ljava/lang/String;

    if-eqz v5, :cond_0

    .line 207
    const-string v5, "ext"

    iget-object v6, p0, Lezvcard/util/TelUri;->extension:Ljava/lang/String;

    invoke-direct {p0, v5, v6, v3}, Lezvcard/util/TelUri;->writeParameter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 209
    :cond_0
    iget-object v5, p0, Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;

    if-eqz v5, :cond_1

    .line 210
    const-string v5, "isub"

    iget-object v6, p0, Lezvcard/util/TelUri;->isdnSubaddress:Ljava/lang/String;

    invoke-direct {p0, v5, v6, v3}, Lezvcard/util/TelUri;->writeParameter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 212
    :cond_1
    iget-object v5, p0, Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;

    if-eqz v5, :cond_2

    .line 213
    const-string v5, "phone-context"

    iget-object v6, p0, Lezvcard/util/TelUri;->phoneContext:Ljava/lang/String;

    invoke-direct {p0, v5, v6, v3}, Lezvcard/util/TelUri;->writeParameter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 216
    :cond_2
    iget-object v5, p0, Lezvcard/util/TelUri;->parameters:Ljava/util/Map;

    invoke-interface {v5}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    .local v1, "i$":Ljava/util/Iterator;
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 217
    .local v0, "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 218
    .local v2, "name":Ljava/lang/String;
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 219
    .local v4, "value":Ljava/lang/String;
    invoke-direct {p0, v2, v4, v3}, Lezvcard/util/TelUri;->writeParameter(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    goto :goto_0

    .line 222
    .end local v0    # "entry":Ljava/util/Map$Entry;, "Ljava/util/Map$Entry<Ljava/lang/String;Ljava/lang/String;>;"
    .end local v2    # "name":Ljava/lang/String;
    .end local v4    # "value":Ljava/lang/String;
    :cond_3
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    return-object v5
.end method
