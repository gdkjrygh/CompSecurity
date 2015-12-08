.class public abstract Lcom/c/b/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/c/b/be;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/b$a;
    }
.end annotation


# instance fields
.field protected b:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    const/4 v0, 0x0

    iput v0, p0, Lcom/c/b/b;->b:I

    .line 122
    return-void
.end method


# virtual methods
.method public final b_()[B
    .locals 3

    .prologue
    .line 64
    :try_start_0
    invoke-virtual {p0}, Lcom/c/b/b;->b()I

    move-result v0

    new-array v0, v0, [B

    .line 65
    invoke-static {v0}, Lcom/c/b/h;->a([B)Lcom/c/b/h;

    move-result-object v1

    .line 66
    invoke-virtual {p0, v1}, Lcom/c/b/b;->a(Lcom/c/b/h;)V

    .line 67
    invoke-virtual {v1}, Lcom/c/b/h;->c()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 68
    return-object v0

    .line 69
    :catch_0
    move-exception v0

    .line 70
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Serializing to a byte array threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method c()Lcom/c/b/bx;
    .locals 1

    .prologue
    .line 102
    new-instance v0, Lcom/c/b/bx;

    invoke-direct {v0}, Lcom/c/b/bx;-><init>()V

    return-object v0
.end method

.method public final d()Lcom/c/b/f;
    .locals 3

    .prologue
    .line 51
    :try_start_0
    invoke-virtual {p0}, Lcom/c/b/b;->b()I

    move-result v0

    invoke-static {v0}, Lcom/c/b/f;->b(I)Lcom/c/b/f$b;

    move-result-object v0

    .line 53
    invoke-virtual {v0}, Lcom/c/b/f$b;->b()Lcom/c/b/h;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/c/b/b;->a(Lcom/c/b/h;)V

    .line 54
    invoke-virtual {v0}, Lcom/c/b/f$b;->a()Lcom/c/b/f;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v0

    return-object v0

    .line 55
    :catch_0
    move-exception v0

    .line 56
    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "Serializing to a ByteString threw an IOException (should never happen)."

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method
