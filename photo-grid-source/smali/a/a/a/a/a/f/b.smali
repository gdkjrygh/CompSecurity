.class public final La/a/a/a/a/f/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/a/a/a/a/f/a;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(La/a/a/a/p;)V
    .locals 2

    .prologue
    .line 37
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 38
    invoke-virtual {p1}, La/a/a/a/p;->v()Landroid/content/Context;

    move-result-object v0

    if-nez v0, :cond_0

    .line 39
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot get directory before context has been set. Call Fabric.with() first"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 43
    :cond_0
    invoke-virtual {p1}, La/a/a/a/p;->v()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, La/a/a/a/a/f/b;->a:Landroid/content/Context;

    .line 44
    invoke-virtual {p1}, La/a/a/a/p;->x()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/a/a/f/b;->b:Ljava/lang/String;

    .line 45
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Android/"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, La/a/a/a/a/f/b;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, La/a/a/a/a/f/b;->c:Ljava/lang/String;

    .line 46
    return-void
.end method


# virtual methods
.method public final a()Ljava/io/File;
    .locals 3

    .prologue
    .line 82
    iget-object v0, p0, La/a/a/a/a/f/b;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v0

    .line 1106
    if-eqz v0, :cond_2

    .line 1107
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1108
    :cond_0
    :goto_0
    return-object v0

    .line 1110
    :cond_1
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    move-result-object v0

    const-string v1, "Fabric"

    const-string v2, "Couldn\'t create file"

    invoke-interface {v0, v1, v2}, La/a/a/a/s;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 1115
    :goto_1
    const/4 v0, 0x0

    .line 82
    goto :goto_0

    .line 1113
    :cond_2
    invoke-static {}, La/a/a/a/f;->d()La/a/a/a/s;

    goto :goto_1
.end method
