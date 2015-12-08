.class public final Lcom/kik/cache/aw;
.super Lcom/kik/cache/y;
.source "SourceFile"


# instance fields
.field private final f:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V
    .locals 8

    .prologue
    const/4 v4, 0x0

    .line 32
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, v4

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/kik/cache/y;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 33
    iput-object p1, p0, Lcom/kik/cache/aw;->f:Ljava/lang/String;

    .line 34
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)Lcom/kik/cache/aw;
    .locals 6

    .prologue
    .line 20
    invoke-static {p0}, Lcom/kik/cache/aw;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 22
    if-nez v2, :cond_0

    .line 24
    const/4 v0, 0x0

    .line 27
    :goto_0
    return-object v0

    .line 26
    :cond_0
    new-instance v0, Lcom/kik/cache/aw;

    sget-object v4, Lcom/kik/cache/aw;->a:Landroid/graphics/Bitmap$Config;

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/kik/cache/aw;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    goto :goto_0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 43
    invoke-static {p0}, Lcom/kik/cache/aw;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .prologue
    const/16 v0, 0x3c

    .line 48
    if-nez p0, :cond_0

    .line 49
    const/4 v0, 0x0

    .line 51
    :goto_0
    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "http://smiley-cdn.kik.com/smileys/"

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "/"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkik/android/util/DeviceUtils;->b()I

    move-result v2

    sparse-switch v2, :sswitch_data_0

    :goto_1
    :sswitch_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    const-string v3, "x"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :sswitch_1
    const/16 v0, 0xf

    goto :goto_1

    :sswitch_2
    const/16 v0, 0x14

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x1e

    goto :goto_1

    :sswitch_4
    const/16 v0, 0x28

    goto :goto_1

    :sswitch_data_0
    .sparse-switch
        0x78 -> :sswitch_1
        0xa0 -> :sswitch_2
        0xf0 -> :sswitch_3
        0x140 -> :sswitch_4
        0x1e0 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final u()Ljava/lang/String;
    .locals 1

    .prologue
    .line 38
    iget-object v0, p0, Lcom/kik/cache/aw;->f:Ljava/lang/String;

    return-object v0
.end method
