.class Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;
.super Ljava/lang/Object;
.source "CipherFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/crypto/CipherFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "CipherData"
.end annotation


# instance fields
.field public final iv:[B

.field public final key:Ljava/security/Key;


# direct methods
.method public constructor <init>(Ljava/security/Key;[B)V
    .locals 0
    .param p1, "key"    # Ljava/security/Key;
    .param p2, "iv"    # [B

    .prologue
    .line 59
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 60
    iput-object p1, p0, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;->key:Ljava/security/Key;

    .line 61
    iput-object p2, p0, Lorg/chromium/content/browser/crypto/CipherFactory$CipherData;->iv:[B

    .line 62
    return-void
.end method
