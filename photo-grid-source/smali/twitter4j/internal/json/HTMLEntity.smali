.class final Ltwitter4j/internal/json/HTMLEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final entityEscapeMap:Ljava/util/Map;
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

.field private static final escapeEntityMap:Ljava/util/Map;
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


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .prologue
    const/16 v9, 0xfb

    const/4 v5, 0x3

    const/4 v8, 0x1

    const/4 v7, 0x2

    const/4 v1, 0x0

    .line 168
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ltwitter4j/internal/json/HTMLEntity;->entityEscapeMap:Ljava/util/Map;

    .line 169
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Ltwitter4j/internal/json/HTMLEntity;->escapeEntityMap:Ljava/util/Map;

    .line 172
    new-array v2, v9, [[Ljava/lang/String;

    new-array v0, v5, [Ljava/lang/String;

    const-string v3, "&nbsp;"

    aput-object v3, v0, v1

    const-string v3, "&#160;"

    aput-object v3, v0, v8

    const-string v3, "\u00a0"

    aput-object v3, v0, v7

    aput-object v0, v2, v1

    new-array v0, v5, [Ljava/lang/String;

    const-string v3, "&iexcl;"

    aput-object v3, v0, v1

    const-string v3, "&#161;"

    aput-object v3, v0, v8

    const-string v3, "\u00a1"

    aput-object v3, v0, v7

    aput-object v0, v2, v8

    new-array v0, v5, [Ljava/lang/String;

    const-string v3, "&cent;"

    aput-object v3, v0, v1

    const-string v3, "&#162;"

    aput-object v3, v0, v8

    const-string v3, "\u00a2"

    aput-object v3, v0, v7

    aput-object v0, v2, v7

    new-array v0, v5, [Ljava/lang/String;

    const-string v3, "&pound;"

    aput-object v3, v0, v1

    const-string v3, "&#163;"

    aput-object v3, v0, v8

    const-string v3, "\u00a3"

    aput-object v3, v0, v7

    aput-object v0, v2, v5

    const/4 v0, 0x4

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&curren;"

    aput-object v4, v3, v1

    const-string v4, "&#164;"

    aput-object v4, v3, v8

    const-string v4, "\u00a4"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/4 v0, 0x5

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&yen;"

    aput-object v4, v3, v1

    const-string v4, "&#165;"

    aput-object v4, v3, v8

    const-string v4, "\u00a5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/4 v0, 0x6

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&brvbar;"

    aput-object v4, v3, v1

    const-string v4, "&#166;"

    aput-object v4, v3, v8

    const-string v4, "\u00a6"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/4 v0, 0x7

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sect;"

    aput-object v4, v3, v1

    const-string v4, "&#167;"

    aput-object v4, v3, v8

    const-string v4, "\u00a7"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x8

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&uml;"

    aput-object v4, v3, v1

    const-string v4, "&#168;"

    aput-object v4, v3, v8

    const-string v4, "\u00a8"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x9

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&copy;"

    aput-object v4, v3, v1

    const-string v4, "&#169;"

    aput-object v4, v3, v8

    const-string v4, "\u00a9"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xa

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ordf;"

    aput-object v4, v3, v1

    const-string v4, "&#170;"

    aput-object v4, v3, v8

    const-string v4, "\u00aa"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xb

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&laquo;"

    aput-object v4, v3, v1

    const-string v4, "&#171;"

    aput-object v4, v3, v8

    const-string v4, "\u00ab"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xc

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&not;"

    aput-object v4, v3, v1

    const-string v4, "&#172;"

    aput-object v4, v3, v8

    const-string v4, "\u00ac"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xd

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&shy;"

    aput-object v4, v3, v1

    const-string v4, "&#173;"

    aput-object v4, v3, v8

    const-string v4, "\u00ad"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xe

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&reg;"

    aput-object v4, v3, v1

    const-string v4, "&#174;"

    aput-object v4, v3, v8

    const-string v4, "\u00ae"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xf

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&macr;"

    aput-object v4, v3, v1

    const-string v4, "&#175;"

    aput-object v4, v3, v8

    const-string v4, "\u00af"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x10

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&deg;"

    aput-object v4, v3, v1

    const-string v4, "&#176;"

    aput-object v4, v3, v8

    const-string v4, "\u00b0"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x11

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&plusmn;"

    aput-object v4, v3, v1

    const-string v4, "&#177;"

    aput-object v4, v3, v8

    const-string v4, "\u00b1"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x12

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sup2;"

    aput-object v4, v3, v1

    const-string v4, "&#178;"

    aput-object v4, v3, v8

    const-string v4, "\u00b2"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x13

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sup3;"

    aput-object v4, v3, v1

    const-string v4, "&#179;"

    aput-object v4, v3, v8

    const-string v4, "\u00b3"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x14

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&acute;"

    aput-object v4, v3, v1

    const-string v4, "&#180;"

    aput-object v4, v3, v8

    const-string v4, "\u00b4"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x15

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&micro;"

    aput-object v4, v3, v1

    const-string v4, "&#181;"

    aput-object v4, v3, v8

    const-string v4, "\u00b5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x16

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&para;"

    aput-object v4, v3, v1

    const-string v4, "&#182;"

    aput-object v4, v3, v8

    const-string v4, "\u00b6"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x17

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&middot;"

    aput-object v4, v3, v1

    const-string v4, "&#183;"

    aput-object v4, v3, v8

    const-string v4, "\u00b7"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x18

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&cedil;"

    aput-object v4, v3, v1

    const-string v4, "&#184;"

    aput-object v4, v3, v8

    const-string v4, "\u00b8"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x19

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sup1;"

    aput-object v4, v3, v1

    const-string v4, "&#185;"

    aput-object v4, v3, v8

    const-string v4, "\u00b9"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x1a

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ordm;"

    aput-object v4, v3, v1

    const-string v4, "&#186;"

    aput-object v4, v3, v8

    const-string v4, "\u00ba"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x1b

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&raquo;"

    aput-object v4, v3, v1

    const-string v4, "&#187;"

    aput-object v4, v3, v8

    const-string v4, "\u00bb"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x1c

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&frac14;"

    aput-object v4, v3, v1

    const-string v4, "&#188;"

    aput-object v4, v3, v8

    const-string v4, "\u00bc"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x1d

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&frac12;"

    aput-object v4, v3, v1

    const-string v4, "&#189;"

    aput-object v4, v3, v8

    const-string v4, "\u00bd"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x1e

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&frac34;"

    aput-object v4, v3, v1

    const-string v4, "&#190;"

    aput-object v4, v3, v8

    const-string v4, "\u00be"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x1f

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&iquest;"

    aput-object v4, v3, v1

    const-string v4, "&#191;"

    aput-object v4, v3, v8

    const-string v4, "\u00bf"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x20

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Agrave;"

    aput-object v4, v3, v1

    const-string v4, "&#192;"

    aput-object v4, v3, v8

    const-string v4, "\u00c0"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x21

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Aacute;"

    aput-object v4, v3, v1

    const-string v4, "&#193;"

    aput-object v4, v3, v8

    const-string v4, "\u00c1"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x22

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Acirc;"

    aput-object v4, v3, v1

    const-string v4, "&#194;"

    aput-object v4, v3, v8

    const-string v4, "\u00c2"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x23

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Atilde;"

    aput-object v4, v3, v1

    const-string v4, "&#195;"

    aput-object v4, v3, v8

    const-string v4, "\u00c3"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x24

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Auml;"

    aput-object v4, v3, v1

    const-string v4, "&#196;"

    aput-object v4, v3, v8

    const-string v4, "\u00c4"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x25

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Aring;"

    aput-object v4, v3, v1

    const-string v4, "&#197;"

    aput-object v4, v3, v8

    const-string v4, "\u00c5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x26

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&AElig;"

    aput-object v4, v3, v1

    const-string v4, "&#198;"

    aput-object v4, v3, v8

    const-string v4, "\u00c6"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x27

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Ccedil;"

    aput-object v4, v3, v1

    const-string v4, "&#199;"

    aput-object v4, v3, v8

    const-string v4, "\u00c7"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x28

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Egrave;"

    aput-object v4, v3, v1

    const-string v4, "&#200;"

    aput-object v4, v3, v8

    const-string v4, "\u00c8"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x29

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Eacute;"

    aput-object v4, v3, v1

    const-string v4, "&#201;"

    aput-object v4, v3, v8

    const-string v4, "\u00c9"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x2a

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Ecirc;"

    aput-object v4, v3, v1

    const-string v4, "&#202;"

    aput-object v4, v3, v8

    const-string v4, "\u00ca"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x2b

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Euml;"

    aput-object v4, v3, v1

    const-string v4, "&#203;"

    aput-object v4, v3, v8

    const-string v4, "\u00cb"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x2c

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Igrave;"

    aput-object v4, v3, v1

    const-string v4, "&#204;"

    aput-object v4, v3, v8

    const-string v4, "\u00cc"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x2d

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Iacute;"

    aput-object v4, v3, v1

    const-string v4, "&#205;"

    aput-object v4, v3, v8

    const-string v4, "\u00cd"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x2e

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Icirc;"

    aput-object v4, v3, v1

    const-string v4, "&#206;"

    aput-object v4, v3, v8

    const-string v4, "\u00ce"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x2f

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Iuml;"

    aput-object v4, v3, v1

    const-string v4, "&#207;"

    aput-object v4, v3, v8

    const-string v4, "\u00cf"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x30

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ETH;"

    aput-object v4, v3, v1

    const-string v4, "&#208;"

    aput-object v4, v3, v8

    const-string v4, "\u00d0"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x31

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Ntilde;"

    aput-object v4, v3, v1

    const-string v4, "&#209;"

    aput-object v4, v3, v8

    const-string v4, "\u00d1"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x32

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Ograve;"

    aput-object v4, v3, v1

    const-string v4, "&#210;"

    aput-object v4, v3, v8

    const-string v4, "\u00d2"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x33

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Oacute;"

    aput-object v4, v3, v1

    const-string v4, "&#211;"

    aput-object v4, v3, v8

    const-string v4, "\u00d3"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x34

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Ocirc;"

    aput-object v4, v3, v1

    const-string v4, "&#212;"

    aput-object v4, v3, v8

    const-string v4, "\u00d4"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x35

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Otilde;"

    aput-object v4, v3, v1

    const-string v4, "&#213;"

    aput-object v4, v3, v8

    const-string v4, "\u00d5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x36

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Ouml;"

    aput-object v4, v3, v1

    const-string v4, "&#214;"

    aput-object v4, v3, v8

    const-string v4, "\u00d6"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x37

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&times;"

    aput-object v4, v3, v1

    const-string v4, "&#215;"

    aput-object v4, v3, v8

    const-string v4, "\u00d7"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x38

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Oslash;"

    aput-object v4, v3, v1

    const-string v4, "&#216;"

    aput-object v4, v3, v8

    const-string v4, "\u00d8"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x39

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Ugrave;"

    aput-object v4, v3, v1

    const-string v4, "&#217;"

    aput-object v4, v3, v8

    const-string v4, "\u00d9"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x3a

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Uacute;"

    aput-object v4, v3, v1

    const-string v4, "&#218;"

    aput-object v4, v3, v8

    const-string v4, "\u00da"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x3b

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Ucirc;"

    aput-object v4, v3, v1

    const-string v4, "&#219;"

    aput-object v4, v3, v8

    const-string v4, "\u00db"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x3c

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Uuml;"

    aput-object v4, v3, v1

    const-string v4, "&#220;"

    aput-object v4, v3, v8

    const-string v4, "\u00dc"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x3d

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Yacute;"

    aput-object v4, v3, v1

    const-string v4, "&#221;"

    aput-object v4, v3, v8

    const-string v4, "\u00dd"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x3e

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&THORN;"

    aput-object v4, v3, v1

    const-string v4, "&#222;"

    aput-object v4, v3, v8

    const-string v4, "\u00de"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x3f

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&szlig;"

    aput-object v4, v3, v1

    const-string v4, "&#223;"

    aput-object v4, v3, v8

    const-string v4, "\u00df"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x40

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&agrave;"

    aput-object v4, v3, v1

    const-string v4, "&#224;"

    aput-object v4, v3, v8

    const-string v4, "\u00e0"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x41

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&aacute;"

    aput-object v4, v3, v1

    const-string v4, "&#225;"

    aput-object v4, v3, v8

    const-string v4, "\u00e1"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x42

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&acirc;"

    aput-object v4, v3, v1

    const-string v4, "&#226;"

    aput-object v4, v3, v8

    const-string v4, "\u00e2"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x43

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&atilde;"

    aput-object v4, v3, v1

    const-string v4, "&#227;"

    aput-object v4, v3, v8

    const-string v4, "\u00e3"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x44

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&auml;"

    aput-object v4, v3, v1

    const-string v4, "&#228;"

    aput-object v4, v3, v8

    const-string v4, "\u00e4"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x45

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&aring;"

    aput-object v4, v3, v1

    const-string v4, "&#229;"

    aput-object v4, v3, v8

    const-string v4, "\u00e5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x46

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&aelig;"

    aput-object v4, v3, v1

    const-string v4, "&#230;"

    aput-object v4, v3, v8

    const-string v4, "\u00e6"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x47

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ccedil;"

    aput-object v4, v3, v1

    const-string v4, "&#231;"

    aput-object v4, v3, v8

    const-string v4, "\u00e7"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x48

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&egrave;"

    aput-object v4, v3, v1

    const-string v4, "&#232;"

    aput-object v4, v3, v8

    const-string v4, "\u00e8"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x49

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&eacute;"

    aput-object v4, v3, v1

    const-string v4, "&#233;"

    aput-object v4, v3, v8

    const-string v4, "\u00e9"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x4a

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ecirc;"

    aput-object v4, v3, v1

    const-string v4, "&#234;"

    aput-object v4, v3, v8

    const-string v4, "\u00ea"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x4b

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&euml;"

    aput-object v4, v3, v1

    const-string v4, "&#235;"

    aput-object v4, v3, v8

    const-string v4, "\u00eb"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x4c

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&igrave;"

    aput-object v4, v3, v1

    const-string v4, "&#236;"

    aput-object v4, v3, v8

    const-string v4, "\u00ec"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x4d

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&iacute;"

    aput-object v4, v3, v1

    const-string v4, "&#237;"

    aput-object v4, v3, v8

    const-string v4, "\u00ed"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x4e

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&icirc;"

    aput-object v4, v3, v1

    const-string v4, "&#238;"

    aput-object v4, v3, v8

    const-string v4, "\u00ee"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x4f

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&iuml;"

    aput-object v4, v3, v1

    const-string v4, "&#239;"

    aput-object v4, v3, v8

    const-string v4, "\u00ef"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x50

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&eth;"

    aput-object v4, v3, v1

    const-string v4, "&#240;"

    aput-object v4, v3, v8

    const-string v4, "\u00f0"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x51

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ntilde;"

    aput-object v4, v3, v1

    const-string v4, "&#241;"

    aput-object v4, v3, v8

    const-string v4, "\u00f1"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x52

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ograve;"

    aput-object v4, v3, v1

    const-string v4, "&#242;"

    aput-object v4, v3, v8

    const-string v4, "\u00f2"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x53

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&oacute;"

    aput-object v4, v3, v1

    const-string v4, "&#243;"

    aput-object v4, v3, v8

    const-string v4, "\u00f3"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x54

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ocirc;"

    aput-object v4, v3, v1

    const-string v4, "&#244;"

    aput-object v4, v3, v8

    const-string v4, "\u00f4"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x55

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&otilde;"

    aput-object v4, v3, v1

    const-string v4, "&#245;"

    aput-object v4, v3, v8

    const-string v4, "\u00f5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x56

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ouml;"

    aput-object v4, v3, v1

    const-string v4, "&#246;"

    aput-object v4, v3, v8

    const-string v4, "\u00f6"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x57

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&divide;"

    aput-object v4, v3, v1

    const-string v4, "&#247;"

    aput-object v4, v3, v8

    const-string v4, "\u00f7"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x58

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&oslash;"

    aput-object v4, v3, v1

    const-string v4, "&#248;"

    aput-object v4, v3, v8

    const-string v4, "\u00f8"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x59

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ugrave;"

    aput-object v4, v3, v1

    const-string v4, "&#249;"

    aput-object v4, v3, v8

    const-string v4, "\u00f9"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x5a

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&uacute;"

    aput-object v4, v3, v1

    const-string v4, "&#250;"

    aput-object v4, v3, v8

    const-string v4, "\u00fa"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x5b

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ucirc;"

    aput-object v4, v3, v1

    const-string v4, "&#251;"

    aput-object v4, v3, v8

    const-string v4, "\u00fb"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x5c

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&uuml;"

    aput-object v4, v3, v1

    const-string v4, "&#252;"

    aput-object v4, v3, v8

    const-string v4, "\u00fc"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x5d

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&yacute;"

    aput-object v4, v3, v1

    const-string v4, "&#253;"

    aput-object v4, v3, v8

    const-string v4, "\u00fd"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x5e

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&thorn;"

    aput-object v4, v3, v1

    const-string v4, "&#254;"

    aput-object v4, v3, v8

    const-string v4, "\u00fe"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x5f

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&yuml;"

    aput-object v4, v3, v1

    const-string v4, "&#255;"

    aput-object v4, v3, v8

    const-string v4, "\u00ff"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x60

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&fnof;"

    aput-object v4, v3, v1

    const-string v4, "&#402;"

    aput-object v4, v3, v8

    const-string v4, "\u0192"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x61

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Alpha;"

    aput-object v4, v3, v1

    const-string v4, "&#913;"

    aput-object v4, v3, v8

    const-string v4, "\u0391"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x62

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Beta;"

    aput-object v4, v3, v1

    const-string v4, "&#914;"

    aput-object v4, v3, v8

    const-string v4, "\u0392"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x63

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Gamma;"

    aput-object v4, v3, v1

    const-string v4, "&#915;"

    aput-object v4, v3, v8

    const-string v4, "\u0393"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x64

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Delta;"

    aput-object v4, v3, v1

    const-string v4, "&#916;"

    aput-object v4, v3, v8

    const-string v4, "\u0394"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x65

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Epsilon;"

    aput-object v4, v3, v1

    const-string v4, "&#917;"

    aput-object v4, v3, v8

    const-string v4, "\u0395"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x66

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Zeta;"

    aput-object v4, v3, v1

    const-string v4, "&#918;"

    aput-object v4, v3, v8

    const-string v4, "\u0396"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x67

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Eta;"

    aput-object v4, v3, v1

    const-string v4, "&#919;"

    aput-object v4, v3, v8

    const-string v4, "\u0397"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x68

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Theta;"

    aput-object v4, v3, v1

    const-string v4, "&#920;"

    aput-object v4, v3, v8

    const-string v4, "\u0398"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x69

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Iota;"

    aput-object v4, v3, v1

    const-string v4, "&#921;"

    aput-object v4, v3, v8

    const-string v4, "\u0399"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x6a

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Kappa;"

    aput-object v4, v3, v1

    const-string v4, "&#922;"

    aput-object v4, v3, v8

    const-string v4, "\u039a"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x6b

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Lambda;"

    aput-object v4, v3, v1

    const-string v4, "&#923;"

    aput-object v4, v3, v8

    const-string v4, "\u039b"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x6c

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Mu;"

    aput-object v4, v3, v1

    const-string v4, "&#924;"

    aput-object v4, v3, v8

    const-string v4, "\u039c"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x6d

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Nu;"

    aput-object v4, v3, v1

    const-string v4, "&#925;"

    aput-object v4, v3, v8

    const-string v4, "\u039d"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x6e

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Xi;"

    aput-object v4, v3, v1

    const-string v4, "&#926;"

    aput-object v4, v3, v8

    const-string v4, "\u039e"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x6f

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Omicron;"

    aput-object v4, v3, v1

    const-string v4, "&#927;"

    aput-object v4, v3, v8

    const-string v4, "\u039f"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x70

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Pi;"

    aput-object v4, v3, v1

    const-string v4, "&#928;"

    aput-object v4, v3, v8

    const-string v4, "\u03a0"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x71

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Rho;"

    aput-object v4, v3, v1

    const-string v4, "&#929;"

    aput-object v4, v3, v8

    const-string v4, "\u03a1"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x72

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Sigma;"

    aput-object v4, v3, v1

    const-string v4, "&#931;"

    aput-object v4, v3, v8

    const-string v4, "\u03a3"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x73

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Tau;"

    aput-object v4, v3, v1

    const-string v4, "&#932;"

    aput-object v4, v3, v8

    const-string v4, "\u03a4"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x74

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Upsilon;"

    aput-object v4, v3, v1

    const-string v4, "&#933;"

    aput-object v4, v3, v8

    const-string v4, "\u03a5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x75

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Phi;"

    aput-object v4, v3, v1

    const-string v4, "&#934;"

    aput-object v4, v3, v8

    const-string v4, "\u03a6"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x76

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Chi;"

    aput-object v4, v3, v1

    const-string v4, "&#935;"

    aput-object v4, v3, v8

    const-string v4, "\u03a7"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x77

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Psi;"

    aput-object v4, v3, v1

    const-string v4, "&#936;"

    aput-object v4, v3, v8

    const-string v4, "\u03a8"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x78

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Omega;"

    aput-object v4, v3, v1

    const-string v4, "&#937;"

    aput-object v4, v3, v8

    const-string v4, "\u03a9"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x79

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&alpha;"

    aput-object v4, v3, v1

    const-string v4, "&#945;"

    aput-object v4, v3, v8

    const-string v4, "\u03b1"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x7a

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&beta;"

    aput-object v4, v3, v1

    const-string v4, "&#946;"

    aput-object v4, v3, v8

    const-string v4, "\u03b2"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x7b

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&gamma;"

    aput-object v4, v3, v1

    const-string v4, "&#947;"

    aput-object v4, v3, v8

    const-string v4, "\u03b3"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x7c

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&delta;"

    aput-object v4, v3, v1

    const-string v4, "&#948;"

    aput-object v4, v3, v8

    const-string v4, "\u03b4"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x7d

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&epsilon;"

    aput-object v4, v3, v1

    const-string v4, "&#949;"

    aput-object v4, v3, v8

    const-string v4, "\u03b5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x7e

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&zeta;"

    aput-object v4, v3, v1

    const-string v4, "&#950;"

    aput-object v4, v3, v8

    const-string v4, "\u03b6"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x7f

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&eta;"

    aput-object v4, v3, v1

    const-string v4, "&#951;"

    aput-object v4, v3, v8

    const-string v4, "\u03b7"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x80

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&theta;"

    aput-object v4, v3, v1

    const-string v4, "&#952;"

    aput-object v4, v3, v8

    const-string v4, "\u03b8"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x81

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&iota;"

    aput-object v4, v3, v1

    const-string v4, "&#953;"

    aput-object v4, v3, v8

    const-string v4, "\u03b9"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x82

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&kappa;"

    aput-object v4, v3, v1

    const-string v4, "&#954;"

    aput-object v4, v3, v8

    const-string v4, "\u03ba"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x83

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&lambda;"

    aput-object v4, v3, v1

    const-string v4, "&#955;"

    aput-object v4, v3, v8

    const-string v4, "\u03bb"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x84

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&mu;"

    aput-object v4, v3, v1

    const-string v4, "&#956;"

    aput-object v4, v3, v8

    const-string v4, "\u03bc"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x85

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&nu;"

    aput-object v4, v3, v1

    const-string v4, "&#957;"

    aput-object v4, v3, v8

    const-string v4, "\u03bd"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x86

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&xi;"

    aput-object v4, v3, v1

    const-string v4, "&#958;"

    aput-object v4, v3, v8

    const-string v4, "\u03be"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x87

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&omicron;"

    aput-object v4, v3, v1

    const-string v4, "&#959;"

    aput-object v4, v3, v8

    const-string v4, "\u03bf"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x88

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&pi;"

    aput-object v4, v3, v1

    const-string v4, "&#960;"

    aput-object v4, v3, v8

    const-string v4, "\u03c0"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x89

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&rho;"

    aput-object v4, v3, v1

    const-string v4, "&#961;"

    aput-object v4, v3, v8

    const-string v4, "\u03c1"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x8a

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sigmaf;"

    aput-object v4, v3, v1

    const-string v4, "&#962;"

    aput-object v4, v3, v8

    const-string v4, "\u03c2"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x8b

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sigma;"

    aput-object v4, v3, v1

    const-string v4, "&#963;"

    aput-object v4, v3, v8

    const-string v4, "\u03c3"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x8c

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&tau;"

    aput-object v4, v3, v1

    const-string v4, "&#964;"

    aput-object v4, v3, v8

    const-string v4, "\u03c4"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x8d

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&upsilon;"

    aput-object v4, v3, v1

    const-string v4, "&#965;"

    aput-object v4, v3, v8

    const-string v4, "\u03c5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x8e

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&phi;"

    aput-object v4, v3, v1

    const-string v4, "&#966;"

    aput-object v4, v3, v8

    const-string v4, "\u03c6"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x8f

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&chi;"

    aput-object v4, v3, v1

    const-string v4, "&#967;"

    aput-object v4, v3, v8

    const-string v4, "\u03c7"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x90

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&psi;"

    aput-object v4, v3, v1

    const-string v4, "&#968;"

    aput-object v4, v3, v8

    const-string v4, "\u03c8"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x91

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&omega;"

    aput-object v4, v3, v1

    const-string v4, "&#969;"

    aput-object v4, v3, v8

    const-string v4, "\u03c9"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x92

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&thetasym;"

    aput-object v4, v3, v1

    const-string v4, "&#977;"

    aput-object v4, v3, v8

    const-string v4, "\u03d1"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x93

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&upsih;"

    aput-object v4, v3, v1

    const-string v4, "&#978;"

    aput-object v4, v3, v8

    const-string v4, "\u03d2"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x94

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&piv;"

    aput-object v4, v3, v1

    const-string v4, "&#982;"

    aput-object v4, v3, v8

    const-string v4, "\u03d6"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x95

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&bull;"

    aput-object v4, v3, v1

    const-string v4, "&#8226;"

    aput-object v4, v3, v8

    const-string v4, "\u2022"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x96

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&hellip;"

    aput-object v4, v3, v1

    const-string v4, "&#8230;"

    aput-object v4, v3, v8

    const-string v4, "\u2026"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x97

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&prime;"

    aput-object v4, v3, v1

    const-string v4, "&#8242;"

    aput-object v4, v3, v8

    const-string v4, "\u2032"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x98

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Prime;"

    aput-object v4, v3, v1

    const-string v4, "&#8243;"

    aput-object v4, v3, v8

    const-string v4, "\u2033"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x99

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&oline;"

    aput-object v4, v3, v1

    const-string v4, "&#8254;"

    aput-object v4, v3, v8

    const-string v4, "\u203e"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x9a

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&frasl;"

    aput-object v4, v3, v1

    const-string v4, "&#8260;"

    aput-object v4, v3, v8

    const-string v4, "\u2044"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x9b

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&weierp;"

    aput-object v4, v3, v1

    const-string v4, "&#8472;"

    aput-object v4, v3, v8

    const-string v4, "\u2118"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x9c

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&image;"

    aput-object v4, v3, v1

    const-string v4, "&#8465;"

    aput-object v4, v3, v8

    const-string v4, "\u2111"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x9d

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&real;"

    aput-object v4, v3, v1

    const-string v4, "&#8476;"

    aput-object v4, v3, v8

    const-string v4, "\u211c"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x9e

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&trade;"

    aput-object v4, v3, v1

    const-string v4, "&#8482;"

    aput-object v4, v3, v8

    const-string v4, "\u2122"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0x9f

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&alefsym;"

    aput-object v4, v3, v1

    const-string v4, "&#8501;"

    aput-object v4, v3, v8

    const-string v4, "\u2135"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xa0

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&larr;"

    aput-object v4, v3, v1

    const-string v4, "&#8592;"

    aput-object v4, v3, v8

    const-string v4, "\u2190"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xa1

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&uarr;"

    aput-object v4, v3, v1

    const-string v4, "&#8593;"

    aput-object v4, v3, v8

    const-string v4, "\u2191"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xa2

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&rarr;"

    aput-object v4, v3, v1

    const-string v4, "&#8594;"

    aput-object v4, v3, v8

    const-string v4, "\u2192"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xa3

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&darr;"

    aput-object v4, v3, v1

    const-string v4, "&#8595;"

    aput-object v4, v3, v8

    const-string v4, "\u2193"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xa4

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&harr;"

    aput-object v4, v3, v1

    const-string v4, "&#8596;"

    aput-object v4, v3, v8

    const-string v4, "\u2194"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xa5

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&crarr;"

    aput-object v4, v3, v1

    const-string v4, "&#8629;"

    aput-object v4, v3, v8

    const-string v4, "\u21b5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xa6

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&lArr;"

    aput-object v4, v3, v1

    const-string v4, "&#8656;"

    aput-object v4, v3, v8

    const-string v4, "\u21d0"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xa7

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&uArr;"

    aput-object v4, v3, v1

    const-string v4, "&#8657;"

    aput-object v4, v3, v8

    const-string v4, "\u21d1"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xa8

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&rArr;"

    aput-object v4, v3, v1

    const-string v4, "&#8658;"

    aput-object v4, v3, v8

    const-string v4, "\u21d2"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xa9

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&dArr;"

    aput-object v4, v3, v1

    const-string v4, "&#8659;"

    aput-object v4, v3, v8

    const-string v4, "\u21d3"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xaa

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&hArr;"

    aput-object v4, v3, v1

    const-string v4, "&#8660;"

    aput-object v4, v3, v8

    const-string v4, "\u21d4"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xab

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&forall;"

    aput-object v4, v3, v1

    const-string v4, "&#8704;"

    aput-object v4, v3, v8

    const-string v4, "\u2200"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xac

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&part;"

    aput-object v4, v3, v1

    const-string v4, "&#8706;"

    aput-object v4, v3, v8

    const-string v4, "\u2202"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xad

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&exist;"

    aput-object v4, v3, v1

    const-string v4, "&#8707;"

    aput-object v4, v3, v8

    const-string v4, "\u2203"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xae

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&empty;"

    aput-object v4, v3, v1

    const-string v4, "&#8709;"

    aput-object v4, v3, v8

    const-string v4, "\u2205"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xaf

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&nabla;"

    aput-object v4, v3, v1

    const-string v4, "&#8711;"

    aput-object v4, v3, v8

    const-string v4, "\u2207"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xb0

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&isin;"

    aput-object v4, v3, v1

    const-string v4, "&#8712;"

    aput-object v4, v3, v8

    const-string v4, "\u2208"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xb1

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&notin;"

    aput-object v4, v3, v1

    const-string v4, "&#8713;"

    aput-object v4, v3, v8

    const-string v4, "\u2209"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xb2

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ni;"

    aput-object v4, v3, v1

    const-string v4, "&#8715;"

    aput-object v4, v3, v8

    const-string v4, "\u220b"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xb3

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&prod;"

    aput-object v4, v3, v1

    const-string v4, "&#8719;"

    aput-object v4, v3, v8

    const-string v4, "\u220f"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xb4

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sum;"

    aput-object v4, v3, v1

    const-string v4, "&#8721;"

    aput-object v4, v3, v8

    const-string v4, "\u2211"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xb5

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&minus;"

    aput-object v4, v3, v1

    const-string v4, "&#8722;"

    aput-object v4, v3, v8

    const-string v4, "\u2212"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xb6

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&lowast;"

    aput-object v4, v3, v1

    const-string v4, "&#8727;"

    aput-object v4, v3, v8

    const-string v4, "\u2217"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xb7

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&radic;"

    aput-object v4, v3, v1

    const-string v4, "&#8730;"

    aput-object v4, v3, v8

    const-string v4, "\u221a"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xb8

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&prop;"

    aput-object v4, v3, v1

    const-string v4, "&#8733;"

    aput-object v4, v3, v8

    const-string v4, "\u221d"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xb9

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&infin;"

    aput-object v4, v3, v1

    const-string v4, "&#8734;"

    aput-object v4, v3, v8

    const-string v4, "\u221e"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xba

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ang;"

    aput-object v4, v3, v1

    const-string v4, "&#8736;"

    aput-object v4, v3, v8

    const-string v4, "\u2220"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xbb

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&and;"

    aput-object v4, v3, v1

    const-string v4, "&#8743;"

    aput-object v4, v3, v8

    const-string v4, "\u2227"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xbc

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&or;"

    aput-object v4, v3, v1

    const-string v4, "&#8744;"

    aput-object v4, v3, v8

    const-string v4, "\u2228"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xbd

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&cap;"

    aput-object v4, v3, v1

    const-string v4, "&#8745;"

    aput-object v4, v3, v8

    const-string v4, "\u2229"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xbe

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&cup;"

    aput-object v4, v3, v1

    const-string v4, "&#8746;"

    aput-object v4, v3, v8

    const-string v4, "\u222a"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xbf

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&int;"

    aput-object v4, v3, v1

    const-string v4, "&#8747;"

    aput-object v4, v3, v8

    const-string v4, "\u222b"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xc0

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&there4;"

    aput-object v4, v3, v1

    const-string v4, "&#8756;"

    aput-object v4, v3, v8

    const-string v4, "\u2234"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xc1

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sim;"

    aput-object v4, v3, v1

    const-string v4, "&#8764;"

    aput-object v4, v3, v8

    const-string v4, "\u223c"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xc2

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&cong;"

    aput-object v4, v3, v1

    const-string v4, "&#8773;"

    aput-object v4, v3, v8

    const-string v4, "\u2245"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xc3

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&asymp;"

    aput-object v4, v3, v1

    const-string v4, "&#8776;"

    aput-object v4, v3, v8

    const-string v4, "\u2248"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xc4

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ne;"

    aput-object v4, v3, v1

    const-string v4, "&#8800;"

    aput-object v4, v3, v8

    const-string v4, "\u2260"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xc5

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&equiv;"

    aput-object v4, v3, v1

    const-string v4, "&#8801;"

    aput-object v4, v3, v8

    const-string v4, "\u2261"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xc6

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&le;"

    aput-object v4, v3, v1

    const-string v4, "&#8804;"

    aput-object v4, v3, v8

    const-string v4, "\u2264"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xc7

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ge;"

    aput-object v4, v3, v1

    const-string v4, "&#8805;"

    aput-object v4, v3, v8

    const-string v4, "\u2265"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xc8

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sub;"

    aput-object v4, v3, v1

    const-string v4, "&#8834;"

    aput-object v4, v3, v8

    const-string v4, "\u2282"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xc9

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sup;"

    aput-object v4, v3, v1

    const-string v4, "&#8835;"

    aput-object v4, v3, v8

    const-string v4, "\u2283"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xca

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sube;"

    aput-object v4, v3, v1

    const-string v4, "&#8838;"

    aput-object v4, v3, v8

    const-string v4, "\u2286"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xcb

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&supe;"

    aput-object v4, v3, v1

    const-string v4, "&#8839;"

    aput-object v4, v3, v8

    const-string v4, "\u2287"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xcc

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&oplus;"

    aput-object v4, v3, v1

    const-string v4, "&#8853;"

    aput-object v4, v3, v8

    const-string v4, "\u2295"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xcd

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&otimes;"

    aput-object v4, v3, v1

    const-string v4, "&#8855;"

    aput-object v4, v3, v8

    const-string v4, "\u2297"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xce

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&perp;"

    aput-object v4, v3, v1

    const-string v4, "&#8869;"

    aput-object v4, v3, v8

    const-string v4, "\u22a5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xcf

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sdot;"

    aput-object v4, v3, v1

    const-string v4, "&#8901;"

    aput-object v4, v3, v8

    const-string v4, "\u22c5"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xd0

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&lceil;"

    aput-object v4, v3, v1

    const-string v4, "&#8968;"

    aput-object v4, v3, v8

    const-string v4, "\u2308"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xd1

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&rceil;"

    aput-object v4, v3, v1

    const-string v4, "&#8969;"

    aput-object v4, v3, v8

    const-string v4, "\u2309"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xd2

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&lfloor;"

    aput-object v4, v3, v1

    const-string v4, "&#8970;"

    aput-object v4, v3, v8

    const-string v4, "\u230a"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xd3

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&rfloor;"

    aput-object v4, v3, v1

    const-string v4, "&#8971;"

    aput-object v4, v3, v8

    const-string v4, "\u230b"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xd4

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&lang;"

    aput-object v4, v3, v1

    const-string v4, "&#9001;"

    aput-object v4, v3, v8

    const-string v4, "\u2329"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xd5

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&rang;"

    aput-object v4, v3, v1

    const-string v4, "&#9002;"

    aput-object v4, v3, v8

    const-string v4, "\u232a"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xd6

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&loz;"

    aput-object v4, v3, v1

    const-string v4, "&#9674;"

    aput-object v4, v3, v8

    const-string v4, "\u25ca"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xd7

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&spades;"

    aput-object v4, v3, v1

    const-string v4, "&#9824;"

    aput-object v4, v3, v8

    const-string v4, "\u2660"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xd8

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&clubs;"

    aput-object v4, v3, v1

    const-string v4, "&#9827;"

    aput-object v4, v3, v8

    const-string v4, "\u2663"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xd9

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&hearts;"

    aput-object v4, v3, v1

    const-string v4, "&#9829;"

    aput-object v4, v3, v8

    const-string v4, "\u2665"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xda

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&diams;"

    aput-object v4, v3, v1

    const-string v4, "&#9830;"

    aput-object v4, v3, v8

    const-string v4, "\u2666"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xdb

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&quot;"

    aput-object v4, v3, v1

    const-string v4, "&#34;"

    aput-object v4, v3, v8

    const-string v4, "\""

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xdc

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&amp;"

    aput-object v4, v3, v1

    const-string v4, "&#38;"

    aput-object v4, v3, v8

    const-string v4, "&"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xdd

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&lt;"

    aput-object v4, v3, v1

    const-string v4, "&#60;"

    aput-object v4, v3, v8

    const-string v4, "<"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xde

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&gt;"

    aput-object v4, v3, v1

    const-string v4, "&#62;"

    aput-object v4, v3, v8

    const-string v4, ">"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xdf

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&OElig;"

    aput-object v4, v3, v1

    const-string v4, "&#338;"

    aput-object v4, v3, v8

    const-string v4, "\u0152"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xe0

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&oelig;"

    aput-object v4, v3, v1

    const-string v4, "&#339;"

    aput-object v4, v3, v8

    const-string v4, "\u0153"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xe1

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Scaron;"

    aput-object v4, v3, v1

    const-string v4, "&#352;"

    aput-object v4, v3, v8

    const-string v4, "\u0160"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xe2

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&scaron;"

    aput-object v4, v3, v1

    const-string v4, "&#353;"

    aput-object v4, v3, v8

    const-string v4, "\u0161"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xe3

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Yuml;"

    aput-object v4, v3, v1

    const-string v4, "&#376;"

    aput-object v4, v3, v8

    const-string v4, "\u0178"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xe4

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&circ;"

    aput-object v4, v3, v1

    const-string v4, "&#710;"

    aput-object v4, v3, v8

    const-string v4, "\u02c6"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xe5

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&tilde;"

    aput-object v4, v3, v1

    const-string v4, "&#732;"

    aput-object v4, v3, v8

    const-string v4, "\u02dc"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xe6

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ensp;"

    aput-object v4, v3, v1

    const-string v4, "&#8194;"

    aput-object v4, v3, v8

    const-string v4, "\u2002"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xe7

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&emsp;"

    aput-object v4, v3, v1

    const-string v4, "&#8195;"

    aput-object v4, v3, v8

    const-string v4, "\u2003"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xe8

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&thinsp;"

    aput-object v4, v3, v1

    const-string v4, "&#8201;"

    aput-object v4, v3, v8

    const-string v4, "\u2009"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xe9

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&zwnj;"

    aput-object v4, v3, v1

    const-string v4, "&#8204;"

    aput-object v4, v3, v8

    const-string v4, "\u200c"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xea

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&zwj;"

    aput-object v4, v3, v1

    const-string v4, "&#8205;"

    aput-object v4, v3, v8

    const-string v4, "\u200d"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xeb

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&lrm;"

    aput-object v4, v3, v1

    const-string v4, "&#8206;"

    aput-object v4, v3, v8

    const-string v4, "\u200e"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xec

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&rlm;"

    aput-object v4, v3, v1

    const-string v4, "&#8207;"

    aput-object v4, v3, v8

    const-string v4, "\u200f"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xed

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ndash;"

    aput-object v4, v3, v1

    const-string v4, "&#8211;"

    aput-object v4, v3, v8

    const-string v4, "\u2013"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xee

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&mdash;"

    aput-object v4, v3, v1

    const-string v4, "&#8212;"

    aput-object v4, v3, v8

    const-string v4, "\u2014"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xef

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&lsquo;"

    aput-object v4, v3, v1

    const-string v4, "&#8216;"

    aput-object v4, v3, v8

    const-string v4, "\u2018"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xf0

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&rsquo;"

    aput-object v4, v3, v1

    const-string v4, "&#8217;"

    aput-object v4, v3, v8

    const-string v4, "\u2019"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xf1

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&sbquo;"

    aput-object v4, v3, v1

    const-string v4, "&#8218;"

    aput-object v4, v3, v8

    const-string v4, "\u201a"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xf2

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&ldquo;"

    aput-object v4, v3, v1

    const-string v4, "&#8220;"

    aput-object v4, v3, v8

    const-string v4, "\u201c"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xf3

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&rdquo;"

    aput-object v4, v3, v1

    const-string v4, "&#8221;"

    aput-object v4, v3, v8

    const-string v4, "\u201d"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xf4

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&bdquo;"

    aput-object v4, v3, v1

    const-string v4, "&#8222;"

    aput-object v4, v3, v8

    const-string v4, "\u201e"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xf5

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&dagger;"

    aput-object v4, v3, v1

    const-string v4, "&#8224;"

    aput-object v4, v3, v8

    const-string v4, "\u2020"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xf6

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&Dagger;"

    aput-object v4, v3, v1

    const-string v4, "&#8225;"

    aput-object v4, v3, v8

    const-string v4, "\u2021"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xf7

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&permil;"

    aput-object v4, v3, v1

    const-string v4, "&#8240;"

    aput-object v4, v3, v8

    const-string v4, "\u2030"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xf8

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&lsaquo;"

    aput-object v4, v3, v1

    const-string v4, "&#8249;"

    aput-object v4, v3, v8

    const-string v4, "\u2039"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xf9

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&rsaquo;"

    aput-object v4, v3, v1

    const-string v4, "&#8250;"

    aput-object v4, v3, v8

    const-string v4, "\u203a"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    const/16 v0, 0xfa

    new-array v3, v5, [Ljava/lang/String;

    const-string v4, "&euro;"

    aput-object v4, v3, v1

    const-string v4, "&#8364;"

    aput-object v4, v3, v8

    const-string v4, "\u20ac"

    aput-object v4, v3, v7

    aput-object v3, v2, v0

    move v0, v1

    .line 452
    :goto_0
    if-ge v0, v9, :cond_0

    aget-object v3, v2, v0

    .line 453
    sget-object v4, Ltwitter4j/internal/json/HTMLEntity;->entityEscapeMap:Ljava/util/Map;

    aget-object v5, v3, v7

    aget-object v6, v3, v1

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 454
    sget-object v4, Ltwitter4j/internal/json/HTMLEntity;->escapeEntityMap:Ljava/util/Map;

    aget-object v5, v3, v1

    aget-object v6, v3, v7

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 455
    sget-object v4, Ltwitter4j/internal/json/HTMLEntity;->escapeEntityMap:Ljava/util/Map;

    aget-object v5, v3, v8

    aget-object v3, v3, v7

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 457
    :cond_0
    return-void
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static escape(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 31
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    invoke-static {v0}, Ltwitter4j/internal/json/HTMLEntity;->escape(Ljava/lang/StringBuilder;)V

    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method static escape(Ljava/lang/StringBuilder;)V
    .locals 3

    .prologue
    .line 37
    const/4 v0, 0x0

    move v1, v0

    .line 39
    :goto_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-ge v1, v0, :cond_1

    .line 40
    sget-object v0, Ltwitter4j/internal/json/HTMLEntity;->entityEscapeMap:Ljava/util/Map;

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, v1, v2}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 41
    if-eqz v0, :cond_0

    .line 42
    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, v1, v2, v0}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v1

    move v1, v0

    goto :goto_0

    .line 45
    :cond_0
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 48
    :cond_1
    return-void
.end method

.method static unescape(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 51
    const/4 v0, 0x0

    .line 52
    if-eqz p0, :cond_0

    .line 53
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    invoke-static {v0}, Ltwitter4j/internal/json/HTMLEntity;->unescape(Ljava/lang/StringBuilder;)V

    .line 55
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 57
    :cond_0
    return-object v0
.end method

.method static unescape(Ljava/lang/StringBuilder;)V
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 61
    const/4 v0, 0x0

    .line 65
    :goto_0
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 66
    const-string v1, "&"

    invoke-virtual {p0, v1, v0}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;I)I

    move-result v1

    .line 67
    if-eq v4, v1, :cond_1

    .line 70
    const-string v0, ";"

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;I)I

    move-result v2

    .line 71
    if-eq v4, v2, :cond_1

    .line 72
    add-int/lit8 v0, v2, 0x1

    invoke-virtual {p0, v1, v0}, Ljava/lang/StringBuilder;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 73
    sget-object v3, Ltwitter4j/internal/json/HTMLEntity;->escapeEntityMap:Ljava/util/Map;

    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 74
    if-eqz v0, :cond_0

    .line 75
    add-int/lit8 v2, v2, 0x1

    invoke-virtual {p0, v1, v2, v0}, Ljava/lang/StringBuilder;->replace(IILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    :cond_0
    add-int/lit8 v0, v1, 0x1

    goto :goto_0

    .line 82
    :cond_1
    return-void
.end method

.method static unescapeAndSlideEntityIncdices(Ljava/lang/String;[Ltwitter4j/UserMentionEntity;[Ltwitter4j/URLEntity;[Ltwitter4j/HashtagEntity;[Ltwitter4j/MediaEntity;)Ljava/lang/String;
    .locals 11

    .prologue
    .line 89
    if-nez p1, :cond_4

    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v1, v0, 0x0

    .line 90
    if-nez p2, :cond_5

    const/4 v0, 0x0

    :goto_1
    add-int/2addr v1, v0

    .line 91
    if-nez p3, :cond_6

    const/4 v0, 0x0

    :goto_2
    add-int/2addr v1, v0

    .line 92
    if-nez p4, :cond_7

    const/4 v0, 0x0

    :goto_3
    add-int/2addr v0, v1

    .line 94
    new-array v6, v0, [Ltwitter4j/internal/json/EntityIndex;

    .line 95
    const/4 v0, 0x0

    .line 96
    if-eqz p1, :cond_0

    .line 97
    const/4 v0, 0x0

    const/4 v1, 0x0

    array-length v2, p1

    invoke-static {p1, v0, v6, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 98
    array-length v0, p1

    add-int/lit8 v0, v0, 0x0

    .line 101
    :cond_0
    if-eqz p2, :cond_1

    .line 102
    const/4 v1, 0x0

    array-length v2, p2

    invoke-static {p2, v1, v6, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 103
    array-length v1, p2

    add-int/2addr v0, v1

    .line 106
    :cond_1
    if-eqz p3, :cond_2

    .line 107
    const/4 v1, 0x0

    array-length v2, p3

    invoke-static {p3, v1, v6, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 108
    array-length v1, p3

    add-int/2addr v0, v1

    .line 111
    :cond_2
    if-eqz p4, :cond_3

    .line 112
    const/4 v1, 0x0

    array-length v2, p4

    invoke-static {p4, v1, v6, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 115
    :cond_3
    invoke-static {v6}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 116
    const/4 v5, 0x1

    .line 117
    const/4 v4, 0x0

    .line 119
    const/4 v3, 0x0

    .line 123
    new-instance v7, Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-direct {v7, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 125
    const/4 v2, 0x0

    :goto_4
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-ge v2, v0, :cond_c

    .line 126
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result v8

    .line 127
    const/16 v0, 0x26

    if-ne v8, v0, :cond_a

    .line 128
    const-string v0, ";"

    invoke-virtual {p0, v0, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v1

    .line 129
    const/4 v0, -0x1

    if-eq v0, v1, :cond_9

    .line 130
    add-int/lit8 v0, v1, 0x1

    invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v9

    .line 131
    sget-object v0, Ltwitter4j/internal/json/HTMLEntity;->escapeEntityMap:Ljava/util/Map;

    invoke-interface {v0, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 132
    if-eqz v0, :cond_8

    .line 133
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v0

    rsub-int/lit8 v0, v0, 0x1

    move v10, v1

    move v1, v0

    move v0, v10

    .line 145
    :goto_5
    array-length v2, v6

    if-ge v4, v2, :cond_e

    .line 146
    if-eqz v5, :cond_b

    .line 147
    aget-object v2, v6, v4

    invoke-virtual {v2}, Ltwitter4j/internal/json/EntityIndex;->getStart()I

    move-result v2

    add-int/2addr v1, v0

    if-ne v2, v1, :cond_e

    .line 148
    aget-object v1, v6, v4

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ltwitter4j/internal/json/EntityIndex;->setStart(I)V

    .line 149
    const/4 v1, 0x0

    move v2, v1

    move v1, v4

    .line 157
    :goto_6
    const/4 v3, 0x0

    .line 125
    add-int/lit8 v0, v0, 0x1

    move v4, v1

    move v5, v2

    move v2, v0

    goto :goto_4

    .line 89
    :cond_4
    array-length v0, p1

    goto/16 :goto_0

    .line 90
    :cond_5
    array-length v0, p2

    goto/16 :goto_1

    .line 91
    :cond_6
    array-length v0, p3

    goto/16 :goto_2

    .line 92
    :cond_7
    array-length v0, p4

    goto/16 :goto_3

    .line 137
    :cond_8
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v0, v2

    move v1, v3

    goto :goto_5

    .line 140
    :cond_9
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v0, v2

    move v1, v3

    goto :goto_5

    .line 143
    :cond_a
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move v0, v2

    move v1, v3

    goto :goto_5

    .line 151
    :cond_b
    aget-object v2, v6, v4

    invoke-virtual {v2}, Ltwitter4j/internal/json/EntityIndex;->getEnd()I

    move-result v2

    add-int/2addr v1, v0

    if-ne v2, v1, :cond_e

    .line 152
    aget-object v1, v6, v4

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ltwitter4j/internal/json/EntityIndex;->setEnd(I)V

    .line 153
    add-int/lit8 v1, v4, 0x1

    .line 154
    const/4 v2, 0x1

    goto :goto_6

    .line 159
    :cond_c
    array-length v0, v6

    if-ge v4, v0, :cond_d

    .line 160
    aget-object v0, v6, v4

    invoke-virtual {v0}, Ltwitter4j/internal/json/EntityIndex;->getEnd()I

    move-result v0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ne v0, v1, :cond_d

    .line 161
    aget-object v0, v6, v4

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Ltwitter4j/internal/json/EntityIndex;->setEnd(I)V

    .line 165
    :cond_d
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_e
    move v1, v4

    move v2, v5

    goto :goto_6
.end method
