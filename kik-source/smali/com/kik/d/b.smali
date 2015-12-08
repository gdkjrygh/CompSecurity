.class public Lcom/kik/d/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/kik/d/a;


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private final b:Ljava/lang/String;

.field private final c:Ljava/io/File;

.field private final d:Lcom/kik/d/c;

.field private final e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 28
    const-class v0, Lcom/kik/d/b;

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/Class;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lcom/kik/d/b;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/io/File;Z)V
    .locals 1

    .prologue
    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-boolean p3, p0, Lcom/kik/d/b;->e:Z

    .line 46
    iput-object p2, p0, Lcom/kik/d/b;->c:Ljava/io/File;

    .line 47
    iput-object p1, p0, Lcom/kik/d/b;->b:Ljava/lang/String;

    .line 49
    if-eqz p1, :cond_0

    .line 50
    new-instance v0, Lcom/kik/d/c;

    invoke-direct {v0, p1, p2}, Lcom/kik/d/c;-><init>(Ljava/lang/String;Ljava/io/File;)V

    iput-object v0, p0, Lcom/kik/d/b;->d:Lcom/kik/d/c;

    .line 55
    :goto_0
    return-void

    .line 53
    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/d/b;->d:Lcom/kik/d/c;

    goto :goto_0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V
    .locals 5

    .prologue
    const/16 v0, 0x1000

    .line 70
    iget-object v1, p0, Lcom/kik/d/b;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lcom/kik/d/b;->c:Ljava/io/File;

    invoke-virtual {v1}, Ljava/io/File;->mkdirs()Z

    move-result v1

    if-nez v1, :cond_1

    .line 74
    sget-object v0, Lcom/kik/d/b;->a:Lorg/c/b;

    const-string v1, "Could not create metrics directory"

    invoke-interface {v0, v1}, Lorg/c/b;->b(Ljava/lang/String;)V

    .line 116
    :cond_0
    :goto_0
    return-void

    .line 77
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ".met"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 78
    new-instance v4, Ljava/io/File;

    iget-object v2, p0, Lcom/kik/d/b;->c:Ljava/io/File;

    invoke-direct {v4, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 79
    const/4 v3, 0x0

    .line 81
    const/4 v2, 0x0

    .line 83
    :try_start_0
    new-instance v1, Ljava/io/FileOutputStream;

    invoke-direct {v1, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 85
    :try_start_1
    invoke-static {}, Lcom/kik/d/b/a$g;->l()Lcom/kik/d/b/a$g$a;

    move-result-object v2

    .line 86
    invoke-virtual {v2, p1}, Lcom/kik/d/b/a$g$a;->a(Ljava/lang/String;)Lcom/kik/d/b/a$g$a;

    move-result-object v2

    .line 87
    invoke-virtual {v2, p2}, Lcom/kik/d/b/a$g$a;->d(Ljava/lang/String;)Lcom/kik/d/b/a$g$a;

    move-result-object v2

    .line 88
    invoke-virtual {v2, p3}, Lcom/kik/d/b/a$g$a;->b(Ljava/lang/String;)Lcom/kik/d/b/a$g$a;

    move-result-object v2

    .line 89
    invoke-virtual {v2, p5}, Lcom/kik/d/b/a$g$a;->a(Ljava/lang/Iterable;)Lcom/kik/d/b/a$g$a;

    move-result-object v2

    .line 90
    invoke-virtual {v2, p4}, Lcom/kik/d/b/a$g$a;->c(Ljava/lang/String;)Lcom/kik/d/b/a$g$a;

    move-result-object v2

    .line 91
    invoke-virtual {v2}, Lcom/kik/d/b/a$g$a;->r()Lcom/kik/d/b/a$g;

    move-result-object v4

    .line 93
    invoke-virtual {v4}, Lcom/c/b/b;->b()I

    move-result v2

    if-le v2, v0, :cond_2

    :goto_1
    invoke-static {v1, v0}, Lcom/c/b/h;->a(Ljava/io/OutputStream;I)Lcom/c/b/h;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/c/b/b;->a(Lcom/c/b/h;)V

    invoke-virtual {v0}, Lcom/c/b/h;->b()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_4
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 95
    const/4 v0, 0x1

    .line 102
    :try_start_2
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 110
    :goto_2
    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/kik/d/b;->d:Lcom/kik/d/c;

    if-eqz v0, :cond_0

    .line 111
    iget-object v0, p0, Lcom/kik/d/b;->d:Lcom/kik/d/c;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Lcom/kik/d/b;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, "?user="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/kik/d/c;->a(Ljava/lang/String;)V

    .line 112
    iget-object v0, p0, Lcom/kik/d/b;->d:Lcom/kik/d/c;

    invoke-virtual {v0}, Lcom/kik/d/c;->a()V

    goto :goto_0

    :cond_2
    move v0, v2

    .line 93
    goto :goto_1

    .line 106
    :catch_0
    move-exception v1

    .line 107
    sget-object v2, Lcom/kik/d/b;->a:Lorg/c/b;

    const-string v3, "Failed to close file"

    invoke-interface {v2, v3, v1}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_2

    .line 97
    :catch_1
    move-exception v0

    move-object v1, v2

    .line 98
    :goto_3
    :try_start_3
    sget-object v2, Lcom/kik/d/b;->a:Lorg/c/b;

    const-string v4, "Failed to write metrics log"

    invoke-interface {v2, v4, v0}, Lorg/c/b;->b(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 102
    if-eqz v1, :cond_3

    .line 103
    :try_start_4
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :cond_3
    move v0, v3

    .line 108
    goto :goto_2

    .line 106
    :catch_2
    move-exception v0

    .line 107
    sget-object v1, Lcom/kik/d/b;->a:Lorg/c/b;

    const-string v2, "Failed to close file"

    invoke-interface {v1, v2, v0}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    move v0, v3

    .line 109
    goto :goto_2

    .line 101
    :catchall_0
    move-exception v0

    move-object v1, v2

    .line 102
    :goto_4
    if-eqz v1, :cond_4

    .line 103
    :try_start_5
    invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 108
    :cond_4
    :goto_5
    throw v0

    .line 106
    :catch_3
    move-exception v1

    .line 107
    sget-object v2, Lcom/kik/d/b;->a:Lorg/c/b;

    const-string v3, "Failed to close file"

    invoke-interface {v2, v3, v1}, Lorg/c/b;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_5

    .line 101
    :catchall_1
    move-exception v0

    goto :goto_4

    .line 97
    :catch_4
    move-exception v0

    goto :goto_3
.end method
