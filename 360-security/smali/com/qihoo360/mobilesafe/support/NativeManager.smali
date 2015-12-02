.class public Lcom/qihoo360/mobilesafe/support/NativeManager;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static a:Ljava/lang/String;

.field public static b:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 9
    sput-object v0, Lcom/qihoo360/mobilesafe/support/NativeManager;->a:Ljava/lang/String;

    .line 10
    sput-object v0, Lcom/qihoo360/mobilesafe/support/NativeManager;->b:Ljava/lang/String;

    .line 59
    return-void
.end method

.method public static a(Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 24
    const-string/jumbo v0, "mobilesafe360-jni-1.4"

    .line 25
    const-string/jumbo v0, ".so"

    .line 30
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    invoke-virtual {v0}, Ljava/io/File;->getParentFile()Ljava/io/File;

    move-result-object v0

    .line 33
    if-eqz v0, :cond_0

    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    const-string/jumbo v0, "/lib/lib"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    const-string/jumbo v0, "mobilesafe360-jni-1.4"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    const-string/jumbo v0, ".so"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    new-instance v0, Ljava/io/File;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 40
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 41
    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v1

    invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/Runtime;->load(Ljava/lang/String;)V

    .line 42
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/NativeManager;->initJniPara()V

    .line 43
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/NativeManager;->getInt(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/NativeManager;->a:Ljava/lang/String;

    .line 44
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/NativeManager;->getCode(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/NativeManager;->b:Ljava/lang/String;

    .line 54
    :goto_0
    return-void

    .line 50
    :cond_0
    const-string/jumbo v0, "mobilesafe360-jni-1.4"

    invoke-static {v0}, Ljava/lang/System;->loadLibrary(Ljava/lang/String;)V

    .line 51
    invoke-static {}, Lcom/qihoo360/mobilesafe/support/NativeManager;->initJniPara()V

    .line 52
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/NativeManager;->getInt(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/NativeManager;->a:Ljava/lang/String;

    .line 53
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Lcom/qihoo360/mobilesafe/support/NativeManager;->getCode(J)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/support/NativeManager;->b:Ljava/lang/String;

    goto :goto_0
.end method

.method public static native access(Ljava/lang/String;I)I
.end method

.method public static native chmod(Ljava/lang/String;I)I
.end method

.method public static native getCode(J)Ljava/lang/String;
.end method

.method public static native getCodePD(J)Ljava/lang/String;
.end method

.method public static native getCodePS(J)Ljava/lang/String;
.end method

.method public static native getCpuUsage()I
.end method

.method public static native getInt(J)Ljava/lang/String;
.end method

.method public static native getPidRss(I)I
.end method

.method public static native initJniPara()V
.end method
