.class public final Lcom/kik/l/al;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Lcom/android/volley/p;

.field private b:Lcom/android/volley/toolbox/d;

.field private c:Ljava/io/File;


# direct methods
.method public constructor <init>(Ljava/io/File;)V
    .locals 1

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/kik/l/al;->c:Ljava/io/File;

    .line 31
    iput-object p1, p0, Lcom/kik/l/al;->c:Ljava/io/File;

    .line 32
    return-void
.end method


# virtual methods
.method public final a()Lcom/android/volley/p;
    .locals 1

    .prologue
    .line 65
    iget-object v0, p0, Lcom/kik/l/al;->a:Lcom/android/volley/p;

    return-object v0
.end method

.method public final a(Ljava/lang/String;Ljava/io/File;)V
    .locals 4

    .prologue
    .line 40
    new-instance v1, Ljava/io/File;

    iget-object v0, p0, Lcom/kik/l/al;->c:Ljava/io/File;

    invoke-direct {v1, v0, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 41
    new-instance v0, Ljava/io/File;

    invoke-direct {v0, p2, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 42
    invoke-static {v0, v1}, Lkik/android/util/d;->a(Ljava/io/File;Ljava/io/File;)V

    .line 44
    const-string v2, "AN"

    .line 45
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x9

    if-lt v0, v3, :cond_0

    .line 48
    new-instance v0, Lcom/android/volley/toolbox/h;

    invoke-direct {v0}, Lcom/android/volley/toolbox/h;-><init>()V

    .line 56
    :goto_0
    new-instance v2, Lcom/android/volley/toolbox/a;

    invoke-direct {v2, v0}, Lcom/android/volley/toolbox/a;-><init>(Lcom/android/volley/toolbox/g;)V

    .line 57
    new-instance v0, Lcom/android/volley/toolbox/d;

    const/high16 v3, 0x100000

    invoke-direct {v0, v1, v3}, Lcom/android/volley/toolbox/d;-><init>(Ljava/io/File;I)V

    iput-object v0, p0, Lcom/kik/l/al;->b:Lcom/android/volley/toolbox/d;

    .line 58
    new-instance v0, Lcom/android/volley/p;

    iget-object v1, p0, Lcom/kik/l/al;->b:Lcom/android/volley/toolbox/d;

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3}, Lcom/android/volley/p;-><init>(Lcom/android/volley/b;Lcom/android/volley/h;I)V

    iput-object v0, p0, Lcom/kik/l/al;->a:Lcom/android/volley/p;

    .line 60
    iget-object v0, p0, Lcom/kik/l/al;->a:Lcom/android/volley/p;

    invoke-virtual {v0}, Lcom/android/volley/p;->a()V

    .line 61
    return-void

    .line 53
    :cond_0
    new-instance v0, Lcom/android/volley/toolbox/e;

    invoke-static {v2}, Landroid/net/http/AndroidHttpClient;->newInstance(Ljava/lang/String;)Landroid/net/http/AndroidHttpClient;

    move-result-object v2

    invoke-direct {v0, v2}, Lcom/android/volley/toolbox/e;-><init>(Lorg/apache/http/client/HttpClient;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 1

    .prologue
    .line 70
    iget-object v0, p0, Lcom/kik/l/al;->b:Lcom/android/volley/toolbox/d;

    invoke-virtual {v0}, Lcom/android/volley/toolbox/d;->b()V

    .line 71
    return-void
.end method
