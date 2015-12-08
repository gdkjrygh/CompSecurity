.class public Lcom/kik/platform/util/ExifHelper;
.super Ljava/lang/Object;


# static fields
.field private static a:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    :try_start_0
    invoke-static {}, Lcom/kik/platform/util/a;->a()V

    const/4 v0, 0x1

    sput-boolean v0, Lcom/kik/platform/util/ExifHelper;->a:Z
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const/4 v0, 0x0

    sput-boolean v0, Lcom/kik/platform/util/ExifHelper;->a:Z

    goto :goto_0
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)F
    .locals 1

    sget-boolean v0, Lcom/kik/platform/util/ExifHelper;->a:Z

    if-eqz v0, :cond_0

    :try_start_0
    invoke-static {p0}, Lcom/kik/platform/util/a;->a(Ljava/lang/String;)F
    :try_end_0
    .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    :goto_0
    return v0

    :catch_0
    move-exception v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
