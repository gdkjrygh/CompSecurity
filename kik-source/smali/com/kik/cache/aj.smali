.class public final Lcom/kik/cache/aj;
.super Lcom/kik/cache/y;
.source "SourceFile"


# instance fields
.field private final f:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V
    .locals 8

    .prologue
    const/4 v4, 0x0

    .line 30
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, v4

    move-object v6, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/kik/cache/y;-><init>(Ljava/lang/Object;Ljava/lang/String;Lcom/android/volley/r$b;IILandroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    .line 31
    iput-object p1, p0, Lcom/kik/cache/aj;->f:Ljava/lang/String;

    .line 32
    return-void
.end method

.method public static a(Ljava/lang/String;Lcom/android/volley/r$b;Lcom/android/volley/r$a;)Lcom/kik/cache/aj;
    .locals 6

    .prologue
    .line 18
    invoke-static {p0}, Lcom/kik/cache/aj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 20
    if-nez v2, :cond_0

    .line 22
    const/4 v0, 0x0

    .line 25
    :goto_0
    return-object v0

    .line 24
    :cond_0
    new-instance v0, Lcom/kik/cache/aj;

    sget-object v4, Lcom/kik/cache/aj;->a:Landroid/graphics/Bitmap$Config;

    move-object v1, p0

    move-object v3, p1

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lcom/kik/cache/aj;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/android/volley/r$b;Landroid/graphics/Bitmap$Config;Lcom/android/volley/r$a;)V

    goto :goto_0
.end method

.method public static d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 41
    invoke-static {p0}, Lcom/kik/cache/aj;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private static e(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 46
    if-nez p0, :cond_0

    .line 47
    const/4 v0, 0x0

    .line 49
    :goto_0
    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "http://smiley-cdn.kik.com/smileys/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, "/96x96.png"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method
