.class Lcom/qihoo360/mobilesafe/share/IpcPrefJni;
.super Ljava/lang/Object;
.source "360Security"


# direct methods
.method constructor <init>()V
    .locals 0

    .prologue
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static native prefApply(I[B)V
.end method

.method static native prefClean()V
.end method

.method static native prefClose(I)V
.end method

.method static native prefCloseAll()V
.end method

.method static native prefCommit(I[B)Z
.end method

.method static native prefContains(ILjava/lang/String;)Z
.end method

.method static native prefGet(ILjava/lang/String;)[B
.end method

.method static native prefGetAll(I)[B
.end method

.method static native prefInit(Ljava/lang/String;)Z
.end method

.method static native prefOpen(Ljava/lang/String;I)I
.end method

.method static native prefReload(ILjava/lang/String;)Z
.end method
