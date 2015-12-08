.class public final Lcom/cm/kinfoc/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Landroid/content/Context;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 25
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    const/4 v0, 0x0

    iput-object v0, p0, Lcom/cm/kinfoc/g;->a:Landroid/content/Context;

    .line 26
    iput-object p1, p0, Lcom/cm/kinfoc/g;->a:Landroid/content/Context;

    .line 27
    return-void
.end method

.method public static a(Ljava/io/File;)[B
    .locals 5

    .prologue
    const/16 v0, 0x400

    .line 152
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    .line 153
    invoke-virtual {v2}, Ljava/io/FileInputStream;->available()I

    move-result v1

    .line 154
    if-le v1, v0, :cond_2

    .line 157
    :goto_0
    if-gtz v0, :cond_0

    .line 158
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 159
    const/4 v0, 0x0

    .line 169
    :goto_1
    return-object v0

    .line 162
    :cond_0
    new-array v0, v0, [B

    .line 163
    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    .line 164
    :goto_2
    invoke-virtual {v2, v0}, Ljava/io/FileInputStream;->read([B)I

    move-result v3

    const/4 v4, -0x1

    if-eq v3, v4, :cond_1

    .line 165
    invoke-virtual {v1, v0}, Ljava/io/ByteArrayOutputStream;->write([B)V

    goto :goto_2

    .line 167
    :cond_1
    invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V

    .line 168
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    goto :goto_1

    :cond_2
    move v0, v1

    goto :goto_0
.end method
