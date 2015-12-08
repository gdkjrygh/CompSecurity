.class public Lcom/kik/d/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Ljava/io/File;

.field private final c:I

.field private volatile d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 12
    const-class v0, Lcom/kik/d/d;

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/Class;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/d/d;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Ljava/io/File;I)V
    .locals 1

    .prologue
    .line 20
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/kik/d/d;->d:Z

    .line 21
    iput-object p1, p0, Lcom/kik/d/d;->b:Ljava/io/File;

    .line 22
    iput p2, p0, Lcom/kik/d/d;->c:I

    .line 23
    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .prologue
    const/4 v7, 0x1

    const/4 v0, 0x0

    .line 29
    iput-boolean v0, p0, Lcom/kik/d/d;->d:Z

    .line 31
    iget-object v1, p0, Lcom/kik/d/d;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_1

    .line 32
    sget-object v0, Lcom/kik/d/d;->a:Lorg/c/b;

    const-string v1, "Not a directory"

    invoke-interface {v0, v1}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 57
    :cond_0
    :goto_0
    return-void

    .line 36
    :cond_1
    iget-object v1, p0, Lcom/kik/d/d;->b:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->list()[Ljava/lang/String;

    move-result-object v2

    .line 37
    array-length v1, v2

    iget v3, p0, Lcom/kik/d/d;->c:I

    if-ge v1, v3, :cond_2

    .line 38
    sget-object v0, Lcom/kik/d/d;->a:Lorg/c/b;

    const-string v1, "Not deleting {} files"

    array-length v2, v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 39
    iput-boolean v7, p0, Lcom/kik/d/d;->d:Z

    goto :goto_0

    .line 42
    :cond_2
    invoke-static {v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;)V

    .line 43
    array-length v1, v2

    iget v3, p0, Lcom/kik/d/d;->c:I

    sub-int v3, v1, v3

    move v1, v0

    .line 45
    :goto_1
    if-ge v1, v3, :cond_4

    .line 46
    new-instance v4, Ljava/io/File;

    iget-object v5, p0, Lcom/kik/d/d;->b:Ljava/io/File;

    aget-object v6, v2, v1

    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/io/File;->delete()Z

    move-result v4

    if-nez v4, :cond_3

    .line 49
    add-int/lit8 v0, v0, 0x1

    .line 45
    :cond_3
    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 53
    :cond_4
    if-nez v0, :cond_0

    .line 54
    iput-boolean v7, p0, Lcom/kik/d/d;->d:Z

    goto :goto_0
.end method
