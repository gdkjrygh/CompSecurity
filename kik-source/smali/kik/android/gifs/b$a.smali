.class final Lkik/android/gifs/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lkik/android/gifs/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method private constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 205
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 206
    iput-object p1, p0, Lkik/android/gifs/b$a;->a:Ljava/lang/String;

    .line 207
    iput-object p2, p0, Lkik/android/gifs/b$a;->b:Ljava/lang/String;

    .line 208
    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;B)V
    .locals 0

    .prologue
    .line 199
    invoke-direct {p0, p1, p2}, Lkik/android/gifs/b$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .prologue
    const/4 v0, 0x0

    .line 213
    if-eqz p1, :cond_0

    instance-of v1, p1, Lkik/android/gifs/b$a;

    if-eqz v1, :cond_0

    .line 214
    check-cast p1, Lkik/android/gifs/b$a;

    .line 215
    iget-object v1, p0, Lkik/android/gifs/b$a;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/gifs/b$a;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lkik/android/gifs/b$a;->a:Ljava/lang/String;

    if-eqz v1, :cond_0

    iget-object v1, p1, Lkik/android/gifs/b$a;->b:Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 216
    iget-object v1, p0, Lkik/android/gifs/b$a;->a:Ljava/lang/String;

    iget-object v2, p1, Lkik/android/gifs/b$a;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lkik/android/gifs/b$a;->b:Ljava/lang/String;

    iget-object v2, p1, Lkik/android/gifs/b$a;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v0, 0x1

    .line 219
    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .prologue
    .line 225
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lkik/android/gifs/b$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Lkik/android/gifs/b$a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    return v0
.end method
