.class Lorg/chromium/media/AudioManagerAndroid$NonThreadSafe;
.super Ljava/lang/Object;
.source "AudioManagerAndroid.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/chromium/media/AudioManagerAndroid;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "NonThreadSafe"
.end annotation


# instance fields
.field private final mThreadId:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 57
    const-wide/16 v0, 0x0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iput-object v0, p0, Lorg/chromium/media/AudioManagerAndroid$NonThreadSafe;->mThreadId:Ljava/lang/Long;

    .line 59
    return-void
.end method


# virtual methods
.method public calledOnValidThread()Z
    .locals 1

    .prologue
    .line 69
    const/4 v0, 0x1

    return v0
.end method
