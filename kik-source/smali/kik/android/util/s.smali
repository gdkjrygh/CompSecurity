.class public final Lkik/android/util/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lorg/c/b;

.field private static b:J

.field private static c:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 14
    const-string v0, "BootInfo"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/util/s;->a:Lorg/c/b;

    return-void
.end method

.method public static a()V
    .locals 2

    .prologue
    .line 20
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lkik/android/util/s;->b:J

    .line 22
    return-void
.end method

.method public static b()V
    .locals 6

    .prologue
    .line 58
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    sput-wide v0, Lkik/android/util/s;->c:J

    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Boot finished, total time: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-wide v2, Lkik/android/util/s;->c:J

    sget-wide v4, Lkik/android/util/s;->b:J

    sub-long/2addr v2, v4

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 60
    return-void
.end method
