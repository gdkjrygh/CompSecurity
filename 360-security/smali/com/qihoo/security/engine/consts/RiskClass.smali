.class public final Lcom/qihoo/security/engine/consts/RiskClass;
.super Ljava/lang/Object;


# static fields
.field public static final RC_ANQUAN:I = 0x0

.field public static final RC_CAUTION:I = 0x64

.field public static final RC_CUANGAI:I = 0x1f4

.field public static final RC_GANRAN:I = 0x190

.field public static final RC_GAOWEI:I = 0x2bc

.field public static final RC_GUANGGAO:I = 0x65

.field public static final RC_MUMA:I = 0x320

.field public static final RC_QIDONG:I = 0xc8

.field public static final RC_UNKNOWN:I = 0x1

.field public static final RC_USEBYMUMA:I = 0x12c

.field public static final RC_WEIXIAN:I = 0x258


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final isBlack(I)Z
    .locals 1

    const/16 v0, 0x12c

    if-lt p0, v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
