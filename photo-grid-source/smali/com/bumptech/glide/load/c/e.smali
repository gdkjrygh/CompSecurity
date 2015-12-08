.class public Lcom/bumptech/glide/load/c/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Ljava/net/URL;

.field private final b:Lcom/bumptech/glide/load/c/f;

.field private final c:Ljava/lang/String;

.field private d:Ljava/lang/String;

.field private e:Ljava/net/URL;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 37
    sget-object v0, Lcom/bumptech/glide/load/c/f;->b:Lcom/bumptech/glide/load/c/f;

    invoke-direct {p0, p1, v0}, Lcom/bumptech/glide/load/c/e;-><init>(Ljava/lang/String;Lcom/bumptech/glide/load/c/f;)V

    .line 38
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;Lcom/bumptech/glide/load/c/f;)V
    .locals 3

    .prologue
    .line 52
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 53
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 54
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "String url must not be empty or null: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 56
    :cond_0
    if-nez p2, :cond_1

    .line 57
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Headers must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 59
    :cond_1
    iput-object p1, p0, Lcom/bumptech/glide/load/c/e;->c:Ljava/lang/String;

    .line 60
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/load/c/e;->a:Ljava/net/URL;

    .line 61
    iput-object p2, p0, Lcom/bumptech/glide/load/c/e;->b:Lcom/bumptech/glide/load/c/f;

    .line 62
    return-void
.end method

.method public constructor <init>(Ljava/net/URL;)V
    .locals 1

    .prologue
    .line 33
    sget-object v0, Lcom/bumptech/glide/load/c/f;->b:Lcom/bumptech/glide/load/c/f;

    invoke-direct {p0, p1, v0}, Lcom/bumptech/glide/load/c/e;-><init>(Ljava/net/URL;Lcom/bumptech/glide/load/c/f;)V

    .line 34
    return-void
.end method

.method private constructor <init>(Ljava/net/URL;Lcom/bumptech/glide/load/c/f;)V
    .locals 2

    .prologue
    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    if-nez p1, :cond_0

    .line 42
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "URL must not be null!"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 44
    :cond_0
    if-nez p2, :cond_1

    .line 45
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Headers must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 47
    :cond_1
    iput-object p1, p0, Lcom/bumptech/glide/load/c/e;->a:Ljava/net/URL;

    .line 48
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/bumptech/glide/load/c/e;->c:Ljava/lang/String;

    .line 49
    iput-object p2, p0, Lcom/bumptech/glide/load/c/e;->b:Lcom/bumptech/glide/load/c/f;

    .line 50
    return-void
.end method


# virtual methods
.method public final a()Ljava/net/URL;
    .locals 3

    .prologue
    .line 72
    .line 1079
    iget-object v0, p0, Lcom/bumptech/glide/load/c/e;->e:Ljava/net/URL;

    if-nez v0, :cond_2

    .line 1080
    new-instance v1, Ljava/net/URL;

    .line 1096
    iget-object v0, p0, Lcom/bumptech/glide/load/c/e;->d:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1097
    iget-object v0, p0, Lcom/bumptech/glide/load/c/e;->c:Ljava/lang/String;

    .line 1098
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    .line 1099
    iget-object v0, p0, Lcom/bumptech/glide/load/c/e;->a:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1101
    :cond_0
    const-string v2, "@#&=*+-_.,:!?()/~\'%"

    invoke-static {v0, v2}, Landroid/net/Uri;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/bumptech/glide/load/c/e;->d:Ljava/lang/String;

    .line 1103
    :cond_1
    iget-object v0, p0, Lcom/bumptech/glide/load/c/e;->d:Ljava/lang/String;

    .line 1080
    invoke-direct {v1, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object v1, p0, Lcom/bumptech/glide/load/c/e;->e:Ljava/net/URL;

    .line 1082
    :cond_2
    iget-object v0, p0, Lcom/bumptech/glide/load/c/e;->e:Ljava/net/URL;

    .line 72
    return-object v0
.end method

.method public final b()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map",
            "<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .prologue
    .line 110
    iget-object v0, p0, Lcom/bumptech/glide/load/c/e;->b:Lcom/bumptech/glide/load/c/f;

    invoke-interface {v0}, Lcom/bumptech/glide/load/c/f;->a()Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    .prologue
    .line 121
    iget-object v0, p0, Lcom/bumptech/glide/load/c/e;->c:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/bumptech/glide/load/c/e;->c:Ljava/lang/String;

    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/bumptech/glide/load/c/e;->a:Ljava/net/URL;

    invoke-virtual {v0}, Ljava/net/URL;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 131
    instance-of v1, p1, Lcom/bumptech/glide/load/c/e;

    if-eqz v1, :cond_0

    .line 132
    check-cast p1, Lcom/bumptech/glide/load/c/e;

    .line 133
    invoke-virtual {p0}, Lcom/bumptech/glide/load/c/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcom/bumptech/glide/load/c/e;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/bumptech/glide/load/c/e;->b:Lcom/bumptech/glide/load/c/f;

    iget-object v2, p1, Lcom/bumptech/glide/load/c/e;->b:Lcom/bumptech/glide/load/c/f;

    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 136
    :cond_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    .prologue
    .line 141
    invoke-virtual {p0}, Lcom/bumptech/glide/load/c/e;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    .line 142
    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/bumptech/glide/load/c/e;->b:Lcom/bumptech/glide/load/c/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    .line 143
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 126
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Lcom/bumptech/glide/load/c/e;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const/16 v1, 0xa

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lcom/bumptech/glide/load/c/e;->b:Lcom/bumptech/glide/load/c/f;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
