.class public final Lorg/c/b/a;
.super Lorg/c/a/b;
.source "SourceFile"


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 66
    invoke-direct {p0}, Lorg/c/a/b;-><init>()V

    .line 67
    iput-object p1, p0, Lorg/c/b/a;->b:Ljava/lang/String;

    .line 68
    return-void
.end method

.method private static d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 259
    invoke-static {p0, p1, p2}, Lorg/c/a/c;->a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Lorg/c/a/a;

    move-result-object v0

    invoke-virtual {v0}, Lorg/c/a/a;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 187
    iget-object v0, p0, Lorg/c/b/a;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 188
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .prologue
    .line 85
    const/4 v0, 0x0

    invoke-static {p1, p2, v0}, Lorg/c/b/a;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    .line 86
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .prologue
    .line 91
    invoke-static {p1, p2, p3}, Lorg/c/b/a;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    .line 92
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 211
    iget-object v0, p0, Lorg/c/b/a;->b:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 212
    return-void
.end method

.method public final a()Z
    .locals 2

    .prologue
    .line 109
    iget-object v0, p0, Lorg/c/b/a;->b:Ljava/lang/String;

    const/4 v1, 0x3

    invoke-static {v0, v1}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    return v0
.end method

.method public final b(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 223
    iget-object v0, p0, Lorg/c/b/a;->b:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 224
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 193
    iget-object v0, p0, Lorg/c/b/a;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p1, p2, v1}, Lorg/c/b/a;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 194
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 199
    iget-object v0, p0, Lorg/c/b/a;->b:Ljava/lang/String;

    invoke-static {p1, p2, p3}, Lorg/c/b/a;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 200
    return-void
.end method

.method public final b(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 1

    .prologue
    .line 247
    iget-object v0, p0, Lorg/c/b/a;->b:Ljava/lang/String;

    invoke-static {v0, p1, p2}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 248
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 229
    iget-object v0, p0, Lorg/c/b/a;->b:Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p1, p2, v1}, Lorg/c/b/a;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 230
    return-void
.end method

.method public final c(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .prologue
    .line 235
    iget-object v0, p0, Lorg/c/b/a;->b:Ljava/lang/String;

    invoke-static {p1, p2, p3}, Lorg/c/b/a;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 236
    return-void
.end method
