.class public Lcom/roidapp/imagelib/ImageLibrary;
.super Landroid/app/Application;
.source "SourceFile"


# static fields
.field private static a:Lcom/roidapp/imagelib/ImageLibrary;


# instance fields
.field private b:Lcom/roidapp/imagelib/a;

.field private c:Ljava/lang/String;

.field private d:Z


# direct methods
.method private constructor <init>()V
    .locals 1

    .prologue
    .line 21
    invoke-direct {p0}, Landroid/app/Application;-><init>()V

    .line 18
    const-string v0, ""

    iput-object v0, p0, Lcom/roidapp/imagelib/ImageLibrary;->c:Ljava/lang/String;

    .line 19
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/roidapp/imagelib/ImageLibrary;->d:Z

    .line 23
    return-void
.end method

.method public static a()Lcom/roidapp/imagelib/ImageLibrary;
    .locals 1

    .prologue
    .line 26
    sget-object v0, Lcom/roidapp/imagelib/ImageLibrary;->a:Lcom/roidapp/imagelib/ImageLibrary;

    if-nez v0, :cond_0

    .line 27
    new-instance v0, Lcom/roidapp/imagelib/ImageLibrary;

    invoke-direct {v0}, Lcom/roidapp/imagelib/ImageLibrary;-><init>()V

    sput-object v0, Lcom/roidapp/imagelib/ImageLibrary;->a:Lcom/roidapp/imagelib/ImageLibrary;

    .line 29
    :cond_0
    sget-object v0, Lcom/roidapp/imagelib/ImageLibrary;->a:Lcom/roidapp/imagelib/ImageLibrary;

    return-object v0
.end method

.method public static b()Ljava/lang/String;
    .locals 1

    .prologue
    .line 65
    const-string v0, "/.Filter"

    return-object v0
.end method

.method public static c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 69
    const-string v0, "/.Crop"

    return-object v0
.end method

.method public static d()Ljava/lang/String;
    .locals 1

    .prologue
    .line 73
    const-string v0, "/.FreeCrop"

    return-object v0
.end method

.method public static e()Ljava/lang/String;
    .locals 1

    .prologue
    .line 77
    const-string v0, "/.VideoTemp"

    return-object v0
.end method

.method public static f()Ljava/lang/String;
    .locals 1

    .prologue
    .line 81
    const-string v0, "/.VideoPreviewTemp"

    return-object v0
.end method

.method public static g()Ljava/lang/String;
    .locals 1

    .prologue
    .line 85
    const-string v0, "/.BackgroundImage"

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lcom/roidapp/imagelib/ImageLibrary;->b:Lcom/roidapp/imagelib/a;

    invoke-interface {v0, p1}, Lcom/roidapp/imagelib/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final a(Lcom/roidapp/imagelib/a;)V
    .locals 0

    .prologue
    .line 33
    iput-object p1, p0, Lcom/roidapp/imagelib/ImageLibrary;->b:Lcom/roidapp/imagelib/a;

    .line 34
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 45
    iget-object v0, p0, Lcom/roidapp/imagelib/ImageLibrary;->b:Lcom/roidapp/imagelib/a;

    invoke-interface {v0, p1}, Lcom/roidapp/imagelib/a;->a(Ljava/lang/String;)V

    .line 46
    return-void
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 49
    iget-object v0, p0, Lcom/roidapp/imagelib/ImageLibrary;->b:Lcom/roidapp/imagelib/a;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/imagelib/a;->a(Landroid/content/Context;Ljava/lang/String;)[Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final a(Ljava/lang/String;I)[Ljava/lang/Integer;
    .locals 1

    .prologue
    .line 53
    iget-object v0, p0, Lcom/roidapp/imagelib/ImageLibrary;->b:Lcom/roidapp/imagelib/a;

    invoke-interface {v0, p1, p2}, Lcom/roidapp/imagelib/a;->a(Ljava/lang/String;I)[Ljava/lang/Integer;

    move-result-object v0

    return-object v0
.end method

.method public final b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lcom/roidapp/imagelib/ImageLibrary;->b:Lcom/roidapp/imagelib/a;

    invoke-interface {v0, p1}, Lcom/roidapp/imagelib/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .prologue
    .line 97
    iget-object v0, p0, Lcom/roidapp/imagelib/ImageLibrary;->b:Lcom/roidapp/imagelib/a;

    invoke-interface {v0}, Lcom/roidapp/imagelib/a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
