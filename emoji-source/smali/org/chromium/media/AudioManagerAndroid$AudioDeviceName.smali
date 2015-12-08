.class Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;
.super Ljava/lang/Object;
.source "AudioManagerAndroid.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/AudioManagerAndroid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "AudioDeviceName"
.end annotation


# instance fields
.field private final mId:I

.field private final mName:Ljava/lang/String;


# direct methods
.method private constructor <init>(ILjava/lang/String;)V
    .locals 0
    .param p1, "id"    # I
    .param p2, "name"    # Ljava/lang/String;

    .prologue
    .line 90
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 91
    iput p1, p0, Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;->mId:I

    .line 92
    iput-object p2, p0, Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;->mName:Ljava/lang/String;

    .line 93
    return-void
.end method

.method synthetic constructor <init>(ILjava/lang/String;Lorg/chromium/media/AudioManagerAndroid$1;)V
    .locals 0
    .param p1, "x0"    # I
    .param p2, "x1"    # Ljava/lang/String;
    .param p3, "x2"    # Lorg/chromium/media/AudioManagerAndroid$1;

    .prologue
    .line 86
    invoke-direct {p0, p1, p2}, Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;-><init>(ILjava/lang/String;)V

    return-void
.end method

.method private id()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "AudioDeviceName"
    .end annotation

    .prologue
    .line 96
    iget v0, p0, Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;->mId:I

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private name()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/chromium/base/CalledByNative;
        value = "AudioDeviceName"
    .end annotation

    .prologue
    .line 99
    iget-object v0, p0, Lorg/chromium/media/AudioManagerAndroid$AudioDeviceName;->mName:Ljava/lang/String;

    return-object v0
.end method
