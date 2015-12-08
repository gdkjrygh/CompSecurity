.class Lorg/xwalk/core/internal/ErrorCodeConversionHelper;
.super Ljava/lang/Object;
.source "ErrorCodeConversionHelper.java"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static convertErrorCode(I)I
    .locals 1
    .param p0, "netError"    # I

    .prologue
    .line 16
    sparse-switch p0, :sswitch_data_0

    .line 107
    const/4 v0, -0x1

    :goto_0
    return v0

    .line 18
    :sswitch_0
    const/4 v0, -0x3

    goto :goto_0

    .line 23
    :sswitch_1
    const/4 v0, -0x4

    goto :goto_0

    .line 26
    :sswitch_2
    const/16 v0, -0x9

    goto :goto_0

    .line 29
    :sswitch_3
    const/16 v0, -0xe

    goto :goto_0

    .line 32
    :sswitch_4
    const/16 v0, -0xc

    goto :goto_0

    .line 36
    :sswitch_5
    const/16 v0, -0xa

    goto :goto_0

    .line 40
    :sswitch_6
    const/4 v0, -0x7

    goto :goto_0

    .line 44
    :sswitch_7
    const/4 v0, -0x8

    goto :goto_0

    .line 47
    :sswitch_8
    const/16 v0, -0xd

    goto :goto_0

    .line 52
    :sswitch_9
    const/16 v0, -0xf

    goto :goto_0

    .line 60
    :sswitch_a
    const/4 v0, -0x6

    goto :goto_0

    .line 67
    :sswitch_b
    const/4 v0, -0x2

    goto :goto_0

    .line 84
    :sswitch_c
    const/16 v0, -0xb

    goto :goto_0

    .line 90
    :sswitch_d
    const/4 v0, -0x5

    goto :goto_0

    .line 104
    :sswitch_e
    const/4 v0, 0x0

    goto :goto_0

    .line 16
    :sswitch_data_0
    .sparse-switch
        -0x157 -> :sswitch_1
        -0x155 -> :sswitch_1
        -0x153 -> :sswitch_0
        -0x152 -> :sswitch_1
        -0x14b -> :sswitch_6
        -0x143 -> :sswitch_d
        -0x136 -> :sswitch_2
        -0x12e -> :sswitch_5
        -0x12d -> :sswitch_5
        -0x12c -> :sswitch_4
        -0xd2 -> :sswitch_e
        -0xd0 -> :sswitch_e
        -0xcf -> :sswitch_e
        -0xce -> :sswitch_e
        -0xcd -> :sswitch_e
        -0xcc -> :sswitch_e
        -0xcb -> :sswitch_e
        -0xca -> :sswitch_e
        -0xc9 -> :sswitch_e
        -0xc8 -> :sswitch_e
        -0x89 -> :sswitch_b
        -0x87 -> :sswitch_c
        -0x86 -> :sswitch_c
        -0x82 -> :sswitch_d
        -0x81 -> :sswitch_c
        -0x80 -> :sswitch_c
        -0x7f -> :sswitch_d
        -0x7e -> :sswitch_c
        -0x7d -> :sswitch_c
        -0x7b -> :sswitch_c
        -0x77 -> :sswitch_9
        -0x76 -> :sswitch_7
        -0x75 -> :sswitch_c
        -0x74 -> :sswitch_c
        -0x73 -> :sswitch_d
        -0x72 -> :sswitch_c
        -0x71 -> :sswitch_c
        -0x70 -> :sswitch_c
        -0x6f -> :sswitch_c
        -0x6e -> :sswitch_c
        -0x6d -> :sswitch_b
        -0x6c -> :sswitch_b
        -0x6b -> :sswitch_c
        -0x6a -> :sswitch_b
        -0x69 -> :sswitch_b
        -0x68 -> :sswitch_a
        -0x67 -> :sswitch_a
        -0x66 -> :sswitch_a
        -0x65 -> :sswitch_a
        -0x64 -> :sswitch_a
        -0xf -> :sswitch_a
        -0xe -> :sswitch_3
        -0xd -> :sswitch_9
        -0xc -> :sswitch_9
        -0x8 -> :sswitch_8
        -0x7 -> :sswitch_7
        -0x1 -> :sswitch_6
    .end sparse-switch
.end method
