.class public abstract Lorg/apache/http/entity/mime/a/a;
.super Ljava/lang/Object;
.source "360Security"

# interfaces
.implements Lorg/apache/http/entity/mime/a/c;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 41
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 42
    if-nez p1, :cond_0

    .line 43
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string/jumbo v1, "MIME type may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 45
    :cond_0
    iput-object p1, p0, Lorg/apache/http/entity/mime/a/a;->a:Ljava/lang/String;

    .line 46
    const/16 v0, 0x2f

    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(I)I

    move-result v0

    .line 47
    const/4 v1, -0x1

    if-eq v0, v1, :cond_1

    .line 48
    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lorg/apache/http/entity/mime/a/a;->b:Ljava/lang/String;

    .line 49
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lorg/apache/http/entity/mime/a/a;->c:Ljava/lang/String;

    .line 54
    :goto_0
    return-void

    .line 51
    :cond_1
    iput-object p1, p0, Lorg/apache/http/entity/mime/a/a;->b:Ljava/lang/String;

    .line 52
    const/4 v0, 0x0

    iput-object v0, p0, Lorg/apache/http/entity/mime/a/a;->c:Ljava/lang/String;

    goto :goto_0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 57
    iget-object v0, p0, Lorg/apache/http/entity/mime/a/a;->a:Ljava/lang/String;

    return-object v0
.end method
