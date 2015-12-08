.class Lorg/chromium/content/browser/FileDescriptorInfo;
.super Ljava/lang/Object;
.source "FileDescriptorInfo.java"


# instance fields
.field public mAutoClose:Z

.field public mFd:I

.field public mId:I


# direct methods
.method constructor <init>(IIZ)V
    .locals 0
    .param p1, "id"    # I
    .param p2, "fd"    # I
    .param p3, "autoClose"    # Z

    .prologue
    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lorg/chromium/content/browser/FileDescriptorInfo;->mId:I

    .line 14
    iput p2, p0, Lorg/chromium/content/browser/FileDescriptorInfo;->mFd:I

    .line 15
    iput-boolean p3, p0, Lorg/chromium/content/browser/FileDescriptorInfo;->mAutoClose:Z

    .line 16
    return-void
.end method
