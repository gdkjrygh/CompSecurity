.class public final Lcom/c/b/ak$c;
.super Ljava/lang/Exception;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/c/b/ak;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "c"
.end annotation


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Lcom/c/b/bd;

.field private final c:Ljava/lang/String;


# direct methods
.method private constructor <init>(Lcom/c/b/ak$g;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1942
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/c/b/ak$g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1947
    invoke-virtual {p1}, Lcom/c/b/ak$g;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$c;->a:Ljava/lang/String;

    .line 1948
    invoke-virtual {p1}, Lcom/c/b/ak$g;->a()Lcom/c/b/i$o;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$c;->b:Lcom/c/b/bd;

    .line 1949
    iput-object p2, p0, Lcom/c/b/ak$c;->c:Ljava/lang/String;

    .line 1950
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/ak$g;Ljava/lang/String;B)V
    .locals 0

    .prologue
    .line 1898
    invoke-direct {p0, p1, p2}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$g;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/ak$h;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 1921
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lcom/c/b/ak$h;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ": "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 1926
    invoke-virtual {p1}, Lcom/c/b/ak$h;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$c;->a:Ljava/lang/String;

    .line 1927
    invoke-virtual {p1}, Lcom/c/b/ak$h;->i()Lcom/c/b/bd;

    move-result-object v0

    iput-object v0, p0, Lcom/c/b/ak$c;->b:Lcom/c/b/bd;

    .line 1928
    iput-object p2, p0, Lcom/c/b/ak$c;->c:Ljava/lang/String;

    .line 1929
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/ak$h;Ljava/lang/String;B)V
    .locals 0

    .prologue
    .line 1898
    invoke-direct {p0, p1, p2}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lcom/c/b/ak$h;Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 1935
    invoke-direct {p0, p1, p2}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;)V

    .line 1936
    invoke-virtual {p0, p3}, Lcom/c/b/ak$c;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    .line 1937
    return-void
.end method

.method synthetic constructor <init>(Lcom/c/b/ak$h;Ljava/lang/String;Ljava/lang/Throwable;B)V
    .locals 0

    .prologue
    .line 1898
    invoke-direct {p0, p1, p2, p3}, Lcom/c/b/ak$c;-><init>(Lcom/c/b/ak$h;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
