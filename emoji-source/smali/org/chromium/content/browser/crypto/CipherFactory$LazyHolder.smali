.class Lorg/chromium/content/browser/crypto/CipherFactory$LazyHolder;
.super Ljava/lang/Object;
.source "CipherFactory.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/content/browser/crypto/CipherFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "LazyHolder"
.end annotation


# static fields
.field private static sInstance:Lorg/chromium/content/browser/crypto/CipherFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 67
    new-instance v0, Lorg/chromium/content/browser/crypto/CipherFactory;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lorg/chromium/content/browser/crypto/CipherFactory;-><init>(Lorg/chromium/content/browser/crypto/CipherFactory$1;)V

    sput-object v0, Lorg/chromium/content/browser/crypto/CipherFactory$LazyHolder;->sInstance:Lorg/chromium/content/browser/crypto/CipherFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic access$100()Lorg/chromium/content/browser/crypto/CipherFactory;
    .locals 1

    .prologue
    .line 66
    sget-object v0, Lorg/chromium/content/browser/crypto/CipherFactory$LazyHolder;->sInstance:Lorg/chromium/content/browser/crypto/CipherFactory;

    return-object v0
.end method
