.class public Lcom/qihoo360/mobilesafe/core/d/g;
.super Ljava/lang/Object;
.source "360Security"


# static fields
.field public static final a:Ljava/lang/String;

.field static b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const-class v0, Lcom/qihoo360/mobilesafe/core/d/g;

    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lcom/qihoo360/mobilesafe/core/d/g;->a:Ljava/lang/String;

    .line 50
    const/16 v0, 0x9

    sput v0, Lcom/qihoo360/mobilesafe/core/d/g;->b:I

    .line 101
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static a(I)I
    .locals 3

    .prologue
    const/16 v0, 0x190

    const/16 v1, 0x12c

    .line 107
    sget v2, Lcom/qihoo360/mobilesafe/core/d/g;->b:I

    if-lt p0, v2, :cond_1

    .line 122
    :cond_0
    :goto_0
    return v0

    .line 109
    :cond_1
    const/16 v2, 0x8

    if-lt p0, v2, :cond_2

    move v0, v1

    .line 110
    goto :goto_0

    .line 111
    :cond_2
    const/4 v2, 0x6

    if-ge p0, v2, :cond_0

    .line 113
    const/4 v0, 0x5

    if-lt p0, v0, :cond_3

    move v0, v1

    .line 114
    goto :goto_0

    .line 115
    :cond_3
    const/4 v0, 0x3

    if-lt p0, v0, :cond_4

    .line 116
    const/16 v0, 0xaa

    goto :goto_0

    .line 117
    :cond_4
    const/4 v0, 0x2

    if-lt p0, v0, :cond_5

    .line 118
    const/16 v0, 0x82

    goto :goto_0

    .line 119
    :cond_5
    const/4 v0, 0x1

    if-lt p0, v0, :cond_6

    .line 120
    const/16 v0, 0xc8

    goto :goto_0

    .line 122
    :cond_6
    const/16 v0, 0x64

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 18
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x15

    if-ge v0, v1, :cond_0

    .line 19
    const/4 v0, 0x1

    .line 29
    :goto_0
    return v0

    .line 21
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    .line 22
    const-string/jumbo v1, "activity"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager;

    .line 24
    :try_start_0
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    .line 25
    invoke-static {v0}, Lcom/qihoo360/mobilesafe/core/d/g;->a(Ljava/util/List;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-result v0

    goto :goto_0

    .line 26
    :catch_0
    move-exception v0

    .line 29
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Ljava/util/List;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List",
            "<",
            "Landroid/app/ActivityManager$RunningAppProcessInfo;",
            ">;)Z"
        }
    .end annotation

    .prologue
    const/4 v1, 0x1

    .line 33
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-ge v0, v2, :cond_0

    move v0, v1

    .line 44
    :goto_0
    return v0

    .line 36
    :cond_0
    if-eqz p0, :cond_2

    .line 37
    invoke-static {}, Landroid/os/Process;->myUid()I

    move-result v2

    .line 38
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_3

    .line 44
    :cond_2
    const/4 v0, 0x0

    goto :goto_0

    .line 38
    :cond_3
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 39
    if-eqz v0, :cond_1

    iget v0, v0, Landroid/app/ActivityManager$RunningAppProcessInfo;->uid:I

    if-eq v0, v2, :cond_1

    move v0, v1

    .line 40
    goto :goto_0
.end method
