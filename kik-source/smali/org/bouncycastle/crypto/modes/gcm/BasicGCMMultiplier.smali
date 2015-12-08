.class public Lorg/bouncycastle/crypto/modes/gcm/BasicGCMMultiplier;
.super Ljava/lang/Object;

# interfaces
.implements Lorg/bouncycastle/crypto/modes/gcm/GCMMultiplier;


# instance fields
.field private a:[B


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public init([B)V
    .locals 1

    invoke-static {p1}, Lorg/bouncycastle/util/Arrays;->c([B)[B

    move-result-object v0

    iput-object v0, p0, Lorg/bouncycastle/crypto/modes/gcm/BasicGCMMultiplier;->a:[B

    return-void
.end method

.method public multiplyH([B)V
    .locals 1

    iget-object v0, p0, Lorg/bouncycastle/crypto/modes/gcm/BasicGCMMultiplier;->a:[B

    invoke-static {p1, v0}, Lorg/bouncycastle/crypto/modes/gcm/a;->multiply([B[B)V

    return-void
.end method
