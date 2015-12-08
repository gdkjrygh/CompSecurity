.class public abstract Lcom/dropbox/client2/ProgressListener;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 121
    return-void
.end method


# virtual methods
.method public abstract onProgress(JJ)V
.end method

.method public progressInterval()J
    .locals 2

    .prologue
    .line 56
    const-wide/16 v0, 0x1f4

    return-wide v0
.end method
