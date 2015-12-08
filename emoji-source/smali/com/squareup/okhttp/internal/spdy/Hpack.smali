.class final Lcom/squareup/okhttp/internal/spdy/Hpack;
.super Ljava/lang/Object;
.source "Hpack.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/squareup/okhttp/internal/spdy/Hpack$Writer;,
        Lcom/squareup/okhttp/internal/spdy/Hpack$Reader;,
        Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;
    }
.end annotation


# static fields
.field static final INITIAL_CLIENT_TO_SERVER_HEADER_TABLE:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;",
            ">;"
        }
    .end annotation
.end field

.field static final INITIAL_CLIENT_TO_SERVER_HEADER_TABLE_LENGTH:I = 0x4ee

.field static final INITIAL_SERVER_TO_CLIENT_HEADER_TABLE:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;",
            ">;"
        }
    .end annotation
.end field

.field static final INITIAL_SERVER_TO_CLIENT_HEADER_TABLE_LENGTH:I = 0x518

.field static final PREFIX_5_BITS:I = 0x1f

.field static final PREFIX_6_BITS:I = 0x3f

.field static final PREFIX_7_BITS:I = 0x7f

.field static final PREFIX_8_BITS:I = 0xff


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .prologue
    const/4 v9, 0x4

    const/4 v8, 0x3

    const/4 v7, 0x2

    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 53
    const/16 v0, 0x1e

    new-array v0, v0, [Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    new-instance v1, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v2, ":scheme"

    const-string v3, "http"

    invoke-direct {v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v5

    new-instance v1, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v2, ":scheme"

    const-string v3, "https"

    invoke-direct {v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v6

    new-instance v1, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v2, ":host"

    const-string v3, ""

    invoke-direct {v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v7

    new-instance v1, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v2, ":path"

    const-string v3, "/"

    invoke-direct {v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v8

    new-instance v1, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v2, ":method"

    const-string v3, "GET"

    invoke-direct {v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v9

    const/4 v1, 0x5

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "accept"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/4 v1, 0x6

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "accept-charset"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/4 v1, 0x7

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "accept-encoding"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x8

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "accept-language"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x9

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "cookie"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xa

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "if-modified-since"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xb

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "user-agent"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xc

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "referer"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xd

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "authorization"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xe

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "allow"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xf

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "cache-control"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x10

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "connection"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x11

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "content-length"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x12

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "content-type"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x13

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "date"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x14

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "expect"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x15

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "from"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x16

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "if-match"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x17

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "if-none-match"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x18

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "if-range"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x19

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "if-unmodified-since"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "max-forwards"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "proxy-authorization"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "range"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "via"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/Hpack;->INITIAL_CLIENT_TO_SERVER_HEADER_TABLE:Ljava/util/List;

    .line 86
    const/16 v0, 0x1e

    new-array v0, v0, [Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    new-instance v1, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v2, ":status"

    const-string v3, "200"

    invoke-direct {v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v5

    new-instance v1, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v2, "age"

    const-string v3, ""

    invoke-direct {v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v6

    new-instance v1, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v2, "cache-control"

    const-string v3, ""

    invoke-direct {v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v7

    new-instance v1, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v2, "content-length"

    const-string v3, ""

    invoke-direct {v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v8

    new-instance v1, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v2, "content-type"

    const-string v3, ""

    invoke-direct {v1, v2, v3}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v1, v0, v9

    const/4 v1, 0x5

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "date"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/4 v1, 0x6

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "etag"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/4 v1, 0x7

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "expires"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x8

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "last-modified"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x9

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "server"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xa

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "set-cookie"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xb

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "vary"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xc

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "via"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xd

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "access-control-allow-origin"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xe

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "accept-ranges"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0xf

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "allow"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x10

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "connection"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x11

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "content-disposition"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x12

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "content-encoding"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x13

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "content-language"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x14

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "content-location"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x15

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "content-range"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x16

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "link"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x17

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "location"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x18

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "proxy-authenticate"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x19

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "refresh"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "retry-after"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "strict-transport-security"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "transfer-encoding"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    new-instance v2, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;

    const-string v3, "www-authenticate"

    const-string v4, ""

    invoke-direct {v2, v3, v4}, Lcom/squareup/okhttp/internal/spdy/Hpack$HeaderEntry;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/squareup/okhttp/internal/spdy/Hpack;->INITIAL_SERVER_TO_CLIENT_HEADER_TABLE:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 123
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 124
    return-void
.end method
