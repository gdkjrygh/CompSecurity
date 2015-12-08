.class public Lorg/spongycastle/crypto/tls/NamedCurve;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 51
    const/16 v0, 0x19

    new-array v0, v0, [Ljava/lang/String;

    const/4 v1, 0x0

    const-string v2, "sect163k1"

    aput-object v2, v0, v1

    const/4 v1, 0x1

    const-string v2, "sect163r1"

    aput-object v2, v0, v1

    const/4 v1, 0x2

    const-string v2, "sect163r2"

    aput-object v2, v0, v1

    const/4 v1, 0x3

    const-string v2, "sect193r1"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "sect193r2"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "sect233k1"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "sect233r1"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "sect239k1"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "sect283k1"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "sect283r1"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "sect409k1"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "sect409r1"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "sect571k1"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "sect571r1"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "secp160k1"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "secp160r1"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "secp160r2"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "secp192k1"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "secp192r1"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "secp224k1"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "secp224r1"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string v2, "secp256k1"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "secp256r1"

    aput-object v2, v0, v1

    const/16 v1, 0x17

    const-string v2, "secp384r1"

    aput-object v2, v0, v1

    const/16 v1, 0x18

    const-string v2, "secp521r1"

    aput-object v2, v0, v1

    sput-object v0, Lorg/spongycastle/crypto/tls/NamedCurve;->a:[Ljava/lang/String;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
