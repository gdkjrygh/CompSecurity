.class public final Lcom/kik/cache/bb;
.super Lcom/kik/cache/s;
.source "SourceFile"


# direct methods
.method public constructor <init>(Ljava/io/File;Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1, p2}, Lcom/kik/cache/s;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 13
    return-void
.end method


# virtual methods
.method protected final b(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 17
    invoke-super {p0, p1}, Lcom/kik/cache/s;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 18
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ".mp4"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
