.class public final Lcom/roidapp/videolib/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/videolib/e;

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private b:Lcom/roidapp/videolib/a;

.field private c:Ljava/lang/Boolean;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .prologue
    const/4 v5, 0x2

    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 20
    const/16 v0, 0x27

    new-array v0, v0, [Ljava/lang/String;

    const-string v1, "SAMSUNG-SGH-I747"

    aput-object v1, v0, v3

    const-string v1, "VS950 4G"

    aput-object v1, v0, v4

    const-string v1, "Viettel_i67"

    aput-object v1, v0, v5

    const/4 v1, 0x3

    const-string v2, "KYY21"

    aput-object v2, v0, v1

    const/4 v1, 0x4

    const-string v2, "R8113"

    aput-object v2, v0, v1

    const/4 v1, 0x5

    const-string v2, "SoftwinerEvb"

    aput-object v2, v0, v1

    const/4 v1, 0x6

    const-string v2, "C5303"

    aput-object v2, v0, v1

    const/4 v1, 0x7

    const-string v2, "LG-E40"

    aput-object v2, v0, v1

    const/16 v1, 0x8

    const-string v2, "LG-E425g"

    aput-object v2, v0, v1

    const/16 v1, 0x9

    const-string v2, "X9017"

    aput-object v2, v0, v1

    const/16 v1, 0xa

    const-string v2, "X907"

    aput-object v2, v0, v1

    const/16 v1, 0xb

    const-string v2, "DTC GT8"

    aput-object v2, v0, v1

    const/16 v1, 0xc

    const-string v2, "ST27i"

    aput-object v2, v0, v1

    const/16 v1, 0xd

    const-string v2, "C5302"

    aput-object v2, v0, v1

    const/16 v1, 0xe

    const-string v2, "ME172V"

    aput-object v2, v0, v1

    const/16 v1, 0xf

    const-string v2, "A95"

    aput-object v2, v0, v1

    const/16 v1, 0x10

    const-string v2, "Flare 2.0"

    aput-object v2, v0, v1

    const/16 v1, 0x11

    const-string v2, "Tablet"

    aput-object v2, v0, v1

    const/16 v1, 0x12

    const-string v2, "Aqua.Active"

    aput-object v2, v0, v1

    const/16 v1, 0x13

    const-string v2, "ICE 350e"

    aput-object v2, v0, v1

    const/16 v1, 0x14

    const-string v2, "GT-S5303B"

    aput-object v2, v0, v1

    const/16 v1, 0x15

    const-string v2, "GT-S5301B"

    aput-object v2, v0, v1

    const/16 v1, 0x16

    const-string v2, "GT-I5800"

    aput-object v2, v0, v1

    const/16 v1, 0x17

    const-string v2, "GT-I8190"

    aput-object v2, v0, v1

    const/16 v1, 0x18

    const-string v2, "GT-N5100"

    aput-object v2, v0, v1

    const/16 v1, 0x19

    const-string v2, "GT-N7000"

    aput-object v2, v0, v1

    const/16 v1, 0x1a

    const-string v2, "GT-N7100"

    aput-object v2, v0, v1

    const/16 v1, 0x1b

    const-string v2, "LG-L38C"

    aput-object v2, v0, v1

    const/16 v1, 0x1c

    const-string v2, "M100"

    aput-object v2, v0, v1

    const/16 v1, 0x1d

    const-string v2, "ME172V"

    aput-object v2, v0, v1

    const/16 v1, 0x1e

    const-string v2, "MTK6515"

    aput-object v2, v0, v1

    const/16 v1, 0x1f

    const-string v2, "ONE TOUCH TAB 7HD"

    aput-object v2, v0, v1

    const/16 v1, 0x20

    const-string v2, "ZTE V791"

    aput-object v2, v0, v1

    const/16 v1, 0x21

    const-string v2, "Lenovo A369"

    aput-object v2, v0, v1

    const/16 v1, 0x22

    const-string v2, "SM-N900V"

    aput-object v2, v0, v1

    const/16 v1, 0x23

    const-string v2, "C1504"

    aput-object v2, v0, v1

    const/16 v1, 0x24

    const-string v2, "Micromax A35"

    aput-object v2, v0, v1

    const/16 v1, 0x25

    const-string v2, "SM-T210"

    aput-object v2, v0, v1

    const/16 v1, 0x26

    const-string v2, "GT-S6310"

    aput-object v2, v0, v1

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/roidapp/videolib/e;->d:Ljava/util/List;

    .line 63
    new-array v0, v5, [Ljava/lang/String;

    const-string v1, "LG-P990"

    aput-object v1, v0, v3

    const-string v1, "GT-I9103"

    aput-object v1, v0, v4

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/roidapp/videolib/e;->e:Ljava/util/List;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .prologue
    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    return-void
.end method

.method public static a()Lcom/roidapp/videolib/e;
    .locals 1

    .prologue
    .line 78
    sget-object v0, Lcom/roidapp/videolib/e;->a:Lcom/roidapp/videolib/e;

    if-nez v0, :cond_0

    .line 79
    new-instance v0, Lcom/roidapp/videolib/e;

    invoke-direct {v0}, Lcom/roidapp/videolib/e;-><init>()V

    sput-object v0, Lcom/roidapp/videolib/e;->a:Lcom/roidapp/videolib/e;

    .line 81
    :cond_0
    sget-object v0, Lcom/roidapp/videolib/e;->a:Lcom/roidapp/videolib/e;

    return-object v0
.end method

.method public static a(Landroid/content/Context;Z)V
    .locals 3

    .prologue
    .line 181
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    const-string v2, "videoTestFailed"

    if-nez p1, :cond_0

    const/4 v0, 0x1

    :goto_0
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 182
    return-void

    .line 181
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static a(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 153
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "videoOK2"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private static a(Ljava/lang/String;Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .prologue
    .line 71
    if-eqz p1, :cond_0

    invoke-static {p1, p0}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/Iterable;Ljava/lang/String;)Z

    move-result v0

    :goto_0
    return v0

    :cond_0
    sget-object v0, Lcom/roidapp/videolib/e;->d:Ljava/util/List;

    invoke-static {v0, p0}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/Iterable;Ljava/lang/String;)Z

    move-result v0

    goto :goto_0
.end method

.method public static b(Landroid/content/Context;)V
    .locals 3

    .prologue
    .line 162
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "videoOK2"

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 163
    return-void
.end method

.method public static b(Landroid/content/Context;Z)V
    .locals 2

    .prologue
    .line 190
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    const-string v1, "videoUninstall"

    invoke-interface {v0, v1, p1}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    move-result-object v0

    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 191
    return-void
.end method

.method public static c(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 172
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "videoTestFailed"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method public static d(Landroid/content/Context;)Z
    .locals 3

    .prologue
    .line 200
    invoke-static {p0}, Landroid/preference/PreferenceManager;->getDefaultSharedPreferences(Landroid/content/Context;)Landroid/content/SharedPreferences;

    move-result-object v0

    const-string v1, "videoUninstall"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/List",
            "<",
            "Ljava/lang/String;",
            ">;)I"
        }
    .end annotation

    .prologue
    .line 108
    invoke-static {}, Lcom/roidapp/baselib/c/n;->b()Z

    move-result v0

    if-nez v0, :cond_0

    .line 109
    sget v0, Lcom/roidapp/videolib/f;->b:I

    .line 141
    :goto_0
    return v0

    .line 117
    :cond_0
    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    .line 118
    if-eqz v0, :cond_1

    const-string v1, "armeabi-v7a"

    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 119
    sget v0, Lcom/roidapp/videolib/f;->b:I

    goto :goto_0

    .line 121
    :cond_1
    sget-object v0, Lcom/roidapp/videolib/e;->e:Ljava/util/List;

    sget-object v1, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v0, v1}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/Iterable;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_4

    iget-object v0, p0, Lcom/roidapp/videolib/e;->c:Ljava/lang/Boolean;

    if-nez v0, :cond_3

    const-string v0, "neon"

    invoke-static {v0}, Lcom/roidapp/baselib/c/n;->a(Ljava/lang/String;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lcom/roidapp/videolib/e;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_4

    .line 122
    :cond_2
    sget v0, Lcom/roidapp/videolib/f;->b:I

    goto :goto_0

    .line 121
    :cond_3
    iget-object v0, p0, Lcom/roidapp/videolib/e;->c:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 124
    :cond_4
    invoke-static {}, Lcom/roidapp/baselib/c/n;->d()Z

    move-result v0

    if-eqz v0, :cond_7

    .line 126
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v0, p2}, Lcom/roidapp/videolib/e;->a(Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 128
    invoke-static {p1}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 129
    sget v0, Lcom/roidapp/videolib/f;->a:I

    goto :goto_0

    .line 130
    :cond_5
    sget v0, Lcom/roidapp/videolib/f;->c:I

    goto :goto_0

    .line 132
    :cond_6
    sget v0, Lcom/roidapp/videolib/f;->a:I

    goto :goto_0

    .line 136
    :cond_7
    sget-object v0, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-static {v0, p2}, Lcom/roidapp/videolib/e;->a(Ljava/lang/String;Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_8

    .line 137
    sget v0, Lcom/roidapp/videolib/f;->b:I

    goto :goto_0

    .line 139
    :cond_8
    invoke-static {p1}, Lcom/roidapp/videolib/e;->a(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_9

    .line 140
    sget v0, Lcom/roidapp/videolib/f;->a:I

    goto :goto_0

    .line 141
    :cond_9
    sget v0, Lcom/roidapp/videolib/f;->c:I

    goto :goto_0
.end method

.method public final a(Lcom/roidapp/videolib/a;)V
    .locals 0

    .prologue
    .line 85
    iput-object p1, p0, Lcom/roidapp/videolib/e;->b:Lcom/roidapp/videolib/a;

    .line 86
    return-void
.end method

.method public final e(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 224
    iget-object v0, p0, Lcom/roidapp/videolib/e;->b:Lcom/roidapp/videolib/a;

    invoke-interface {v0, p1}, Lcom/roidapp/videolib/a;->a(Landroid/content/Context;)V

    .line 225
    return-void
.end method
