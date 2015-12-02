.class public final Lcom/fasterxml/jackson/dataformat/smile/SmileConstants;
.super Ljava/lang/Object;
.source "SmileConstants.java"


# static fields
.field public static final BYTE_MARKER_END_OF_CONTENT:B = -0x1t

.field public static final BYTE_MARKER_END_OF_STRING:B = -0x4t

.field public static final HEADER_BIT_HAS_RAW_BINARY:I = 0x4

.field public static final HEADER_BIT_HAS_SHARED_NAMES:I = 0x1

.field public static final HEADER_BIT_HAS_SHARED_STRING_VALUES:I = 0x2

.field public static final HEADER_BYTE_1:B = 0x3at

.field public static final HEADER_BYTE_2:B = 0x29t

.field public static final HEADER_BYTE_3:B = 0xat

.field public static final HEADER_BYTE_4:B = 0x0t

.field public static final HEADER_VERSION_0:I = 0x0

.field public static final INT_MARKER_END_OF_STRING:I = 0xfc

.field public static final MAX_SHARED_NAMES:I = 0x400

.field public static final MAX_SHARED_STRING_LENGTH_BYTES:I = 0x41

.field public static final MAX_SHARED_STRING_VALUES:I = 0x400

.field public static final MAX_SHORT_NAME_ASCII_BYTES:I = 0x40

.field public static final MAX_SHORT_NAME_UNICODE_BYTES:I = 0x38

.field public static final MAX_SHORT_VALUE_STRING_BYTES:I = 0x40

.field public static final MIN_BUFFER_FOR_POSSIBLE_SHORT_STRING:I = 0xc4

.field public static final TOKEN_KEY_EMPTY_STRING:B = 0x20t

.field public static final TOKEN_KEY_LONG_STRING:B = 0x34t

.field public static final TOKEN_LITERAL_EMPTY_STRING:B = 0x20t

.field public static final TOKEN_LITERAL_END_ARRAY:B = -0x7t

.field public static final TOKEN_LITERAL_END_OBJECT:B = -0x5t

.field public static final TOKEN_LITERAL_FALSE:B = 0x22t

.field public static final TOKEN_LITERAL_NULL:B = 0x21t

.field public static final TOKEN_LITERAL_START_ARRAY:B = -0x8t

.field public static final TOKEN_LITERAL_START_OBJECT:B = -0x6t

.field public static final TOKEN_LITERAL_TRUE:B = 0x23t

.field public static final TOKEN_MISC_BINARY_7BIT:I = 0xe8

.field public static final TOKEN_MISC_BINARY_RAW:I = 0xfd

.field public static final TOKEN_MISC_FLOAT_32:I = 0x0

.field public static final TOKEN_MISC_FLOAT_64:I = 0x1

.field public static final TOKEN_MISC_FLOAT_BIG:I = 0x2

.field public static final TOKEN_MISC_FP:I = 0x28

.field public static final TOKEN_MISC_INTEGER:I = 0x24

.field public static final TOKEN_MISC_INTEGER_32:I = 0x0

.field public static final TOKEN_MISC_INTEGER_64:I = 0x1

.field public static final TOKEN_MISC_INTEGER_BIG:I = 0x2

.field public static final TOKEN_MISC_LONG_TEXT_ASCII:I = 0xe0

.field public static final TOKEN_MISC_LONG_TEXT_UNICODE:I = 0xe4

.field public static final TOKEN_MISC_SHARED_STRING_LONG:I = 0xec

.field public static final TOKEN_PREFIX_KEY_ASCII:I = 0x80

.field public static final TOKEN_PREFIX_KEY_SHARED_LONG:I = 0x30

.field public static final TOKEN_PREFIX_KEY_SHARED_SHORT:I = 0x40

.field public static final TOKEN_PREFIX_KEY_UNICODE:I = 0xc0

.field public static final TOKEN_PREFIX_MISC_OTHER:I = 0xe0

.field public static final TOKEN_PREFIX_SHARED_STRING_SHORT:I = 0x0

.field public static final TOKEN_PREFIX_SHORT_UNICODE:I = 0xa0

.field public static final TOKEN_PREFIX_SMALL_ASCII:I = 0x60

.field public static final TOKEN_PREFIX_SMALL_INT:I = 0xc0

.field public static final TOKEN_PREFIX_TINY_ASCII:I = 0x40

.field public static final TOKEN_PREFIX_TINY_UNICODE:I = 0x80

.field public static final sUtf8UnitLengths:[I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .prologue
    const/16 v4, 0x100

    .line 342
    new-array v2, v4, [I

    .line 343
    const/16 v0, 0x80

    move v1, v0

    :goto_0
    if-ge v1, v4, :cond_3

    .line 347
    and-int/lit16 v0, v1, 0xe0

    const/16 v3, 0xc0

    if-ne v0, v3, :cond_0

    .line 348
    const/4 v0, 0x1

    .line 358
    :goto_1
    aput v0, v2, v1

    .line 343
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 349
    :cond_0
    and-int/lit16 v0, v1, 0xf0

    const/16 v3, 0xe0

    if-ne v0, v3, :cond_1

    .line 350
    const/4 v0, 0x2

    goto :goto_1

    .line 351
    :cond_1
    and-int/lit16 v0, v1, 0xf8

    const/16 v3, 0xf0

    if-ne v0, v3, :cond_2

    .line 353
    const/4 v0, 0x3

    goto :goto_1

    .line 356
    :cond_2
    const/4 v0, -0x1

    goto :goto_1

    .line 360
    :cond_3
    sput-object v2, Lcom/fasterxml/jackson/dataformat/smile/SmileConstants;->sUtf8UnitLengths:[I

    .line 361
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
