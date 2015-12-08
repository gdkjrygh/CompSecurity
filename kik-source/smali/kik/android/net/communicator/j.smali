.class public abstract Lkik/android/net/communicator/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lkik/android/net/communicator/j$a;
    }
.end annotation


# static fields
.field private static final a:Lorg/c/b;


# instance fields
.field private volatile b:Z

.field private c:Lkik/a/f/n;

.field private d:Lkik/android/net/communicator/j$a;

.field private volatile e:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 15
    const-string v0, "InputThreadAbstract"

    invoke-static {v0}, Lorg/c/c;->a(Ljava/lang/String;)Lorg/c/b;

    move-result-object v0

    sput-object v0, Lkik/android/net/communicator/j;->a:Lorg/c/b;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .prologue
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 28
    const/4 v0, 0x0

    iput-boolean v0, p0, Lkik/android/net/communicator/j;->e:Z

    return-void
.end method


# virtual methods
.method protected abstract a()V
.end method

.method protected abstract a(Lkik/a/f/n;)V
.end method

.method final a(Lkik/a/f/n;Lkik/android/net/communicator/j$a;)V
    .locals 0

    .prologue
    .line 37
    iput-object p1, p0, Lkik/android/net/communicator/j;->c:Lkik/a/f/n;

    .line 38
    iput-object p2, p0, Lkik/android/net/communicator/j;->d:Lkik/android/net/communicator/j$a;

    .line 39
    return-void
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 32
    const/4 v0, 0x1

    iput-boolean v0, p0, Lkik/android/net/communicator/j;->e:Z

    .line 33
    return-void
.end method

.method public final run()V
    .locals 4

    .prologue
    const/4 v3, 0x1

    .line 48
    :try_start_0
    iget-object v0, p0, Lkik/android/net/communicator/j;->c:Lkik/a/f/n;

    const-string v1, "k"

    invoke-virtual {v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 49
    iget-object v0, p0, Lkik/android/net/communicator/j;->c:Lkik/a/f/n;

    invoke-virtual {v0}, Lkik/a/f/n;->next()I

    .line 52
    :cond_0
    :goto_0
    iget-boolean v0, p0, Lkik/android/net/communicator/j;->e:Z

    if-nez v0, :cond_3

    .line 54
    iget-object v0, p0, Lkik/android/net/communicator/j;->c:Lkik/a/f/n;

    invoke-virtual {v0}, Lkik/a/f/n;->getEventType()I

    move-result v0

    if-eq v0, v3, :cond_3

    iget-object v0, p0, Lkik/android/net/communicator/j;->c:Lkik/a/f/n;

    const-string v1, "stream"

    invoke-virtual {v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lkik/android/net/communicator/j;->c:Lkik/a/f/n;

    const-string v1, "stream:stream"

    invoke-virtual {v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    iget-object v0, p0, Lkik/android/net/communicator/j;->c:Lkik/a/f/n;

    const-string v1, "k"

    invoke-virtual {v0, v1}, Lkik/a/f/n;->b(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 58
    iget-object v0, p0, Lkik/android/net/communicator/j;->c:Lkik/a/f/n;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lkik/a/f/n;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 62
    iget-object v0, p0, Lkik/android/net/communicator/j;->c:Lkik/a/f/n;

    invoke-virtual {p0, v0}, Lkik/android/net/communicator/j;->a(Lkik/a/f/n;)V

    .line 63
    iget-object v0, p0, Lkik/android/net/communicator/j;->d:Lkik/android/net/communicator/j$a;

    invoke-interface {v0}, Lkik/android/net/communicator/j$a;->a()V
    :try_end_0
    .catch Lorg/d/a/b; {:try_start_0 .. :try_end_0} :catch_0
    .catch Lkik/a/f/g; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    .line 71
    :catch_0
    move-exception v0

    .line 72
    :try_start_1
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Net Error--> XmlPullParserException in XmppInputThread: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lorg/d/a/b;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    iput-boolean v3, p0, Lkik/android/net/communicator/j;->b:Z

    .line 84
    iget-boolean v0, p0, Lkik/android/net/communicator/j;->e:Z

    if-nez v0, :cond_1

    .line 85
    invoke-virtual {p0}, Lkik/android/net/communicator/j;->a()V

    .line 88
    :cond_1
    :goto_1
    return-void

    .line 67
    :cond_2
    :try_start_2
    iget-object v0, p0, Lkik/android/net/communicator/j;->c:Lkik/a/f/n;

    invoke-virtual {v0}, Lkik/a/f/n;->next()I
    :try_end_2
    .catch Lorg/d/a/b; {:try_start_2 .. :try_end_2} :catch_0
    .catch Lkik/a/f/g; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    .line 74
    :catch_1
    move-exception v0

    .line 75
    :try_start_3
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Net Error--> EncryptionException in XmppInputThread: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Lkik/a/f/g;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 82
    iput-boolean v3, p0, Lkik/android/net/communicator/j;->b:Z

    .line 84
    iget-boolean v0, p0, Lkik/android/net/communicator/j;->e:Z

    if-nez v0, :cond_1

    .line 85
    invoke-virtual {p0}, Lkik/android/net/communicator/j;->a()V

    goto :goto_1

    .line 82
    :cond_3
    iput-boolean v3, p0, Lkik/android/net/communicator/j;->b:Z

    .line 84
    iget-boolean v0, p0, Lkik/android/net/communicator/j;->e:Z

    if-nez v0, :cond_1

    .line 85
    invoke-virtual {p0}, Lkik/android/net/communicator/j;->a()V

    goto :goto_1

    .line 77
    :catch_2
    move-exception v0

    .line 79
    :try_start_4
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Net Error--> IOException in XmppInputThread: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 82
    iput-boolean v3, p0, Lkik/android/net/communicator/j;->b:Z

    .line 84
    iget-boolean v0, p0, Lkik/android/net/communicator/j;->e:Z

    if-nez v0, :cond_1

    .line 85
    invoke-virtual {p0}, Lkik/android/net/communicator/j;->a()V

    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    iput-boolean v3, p0, Lkik/android/net/communicator/j;->b:Z

    .line 84
    iget-boolean v1, p0, Lkik/android/net/communicator/j;->e:Z

    if-nez v1, :cond_4

    .line 85
    invoke-virtual {p0}, Lkik/android/net/communicator/j;->a()V

    :cond_4
    throw v0
.end method
