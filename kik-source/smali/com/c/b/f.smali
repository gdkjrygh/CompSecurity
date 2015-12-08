.class public abstract Lcom/c/b/f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Serializable;
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/c/b/f$b;,
        Lcom/c/b/f$a;
    }
.end annotation


# static fields
.field public static final a:Lcom/c/b/f;

.field static final synthetic b:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 63
    const-class v0, Lcom/c/b/f;

    invoke-virtual {v0}, Ljava/lang/Class;->desiredAssertionStatus()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Lcom/c/b/f;->b:Z

    .line 84
    new-instance v0, Lcom/c/b/ba;

    new-array v1, v1, [B

    invoke-direct {v0, v1}, Lcom/c/b/ba;-><init>([B)V

    sput-object v0, Lcom/c/b/f;->a:Lcom/c/b/f;

    return-void

    :cond_0
    move v0, v1

    .line 63
    goto :goto_0
.end method

.method constructor <init>()V
    .locals 0

    .prologue
    .line 87
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/c/b/f;
    .locals 2

    .prologue
    .line 283
    new-instance v0, Lcom/c/b/ba;

    sget-object v1, Lcom/c/b/au;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/c/b/ba;-><init>([B)V

    return-object v0
.end method

.method public static a([B)Lcom/c/b/f;
    .locals 2

    .prologue
    .line 221
    const/4 v0, 0x0

    array-length v1, p0

    invoke-static {p0, v0, v1}, Lcom/c/b/f;->a([BII)Lcom/c/b/f;

    move-result-object v0

    return-object v0
.end method

.method public static a([BII)Lcom/c/b/f;
    .locals 2

    .prologue
    .line 209
    new-array v0, p2, [B

    .line 210
    const/4 v1, 0x0

    invoke-static {p0, p1, v0, v1, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 211
    new-instance v1, Lcom/c/b/ba;

    invoke-direct {v1, v0}, Lcom/c/b/ba;-><init>([B)V

    return-object v1
.end method

.method static b(I)Lcom/c/b/f$b;
    .locals 2

    .prologue
    .line 985
    new-instance v0, Lcom/c/b/f$b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/c/b/f$b;-><init>(IB)V

    return-object v0
.end method


# virtual methods
.method public abstract a(I)B
.end method

.method public abstract a()I
.end method

.method protected abstract a(III)I
.end method

.method protected abstract a(Ljava/nio/charset/Charset;)Ljava/lang/String;
.end method

.method abstract a(Ljava/io/OutputStream;II)V
.end method

.method protected abstract a([BIII)V
.end method

.method protected abstract b(III)I
.end method

.method public final b([BIII)V
    .locals 3

    .prologue
    .line 492
    if-gez p2, :cond_0

    .line 493
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Source offset < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 495
    :cond_0
    if-gez p3, :cond_1

    .line 496
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Target offset < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 498
    :cond_1
    if-gez p4, :cond_2

    .line 499
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Length < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 501
    :cond_2
    add-int v0, p2, p4

    invoke-virtual {p0}, Lcom/c/b/f;->a()I

    move-result v1

    if-le v0, v1, :cond_3

    .line 502
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Source end offset < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int v2, p2, p4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 505
    :cond_3
    add-int v0, p3, p4

    array-length v1, p1

    if-le v0, v1, :cond_4

    .line 506
    new-instance v0, Ljava/lang/IndexOutOfBoundsException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Target end offset < 0: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    add-int v2, p3, p4

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 509
    :cond_4
    if-lez p4, :cond_5

    .line 510
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/c/b/f;->a([BIII)V

    .line 512
    :cond_5
    return-void
.end method

.method public abstract c()Lcom/c/b/f$a;
.end method

.method public final d()Z
    .locals 1

    .prologue
    .line 138
    invoke-virtual {p0}, Lcom/c/b/f;->a()I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final e()[B
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 539
    invoke-virtual {p0}, Lcom/c/b/f;->a()I

    move-result v1

    .line 540
    if-nez v1, :cond_0

    .line 541
    sget-object v0, Lcom/c/b/au;->c:[B

    .line 545
    :goto_0
    return-object v0

    .line 543
    :cond_0
    new-array v0, v1, [B

    .line 544
    invoke-virtual {p0, v0, v2, v2, v1}, Lcom/c/b/f;->a([BIII)V

    goto :goto_0
.end method

.method public abstract equals(Ljava/lang/Object;)Z
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    .prologue
    .line 662
    sget-object v0, Lcom/c/b/au;->a:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Lcom/c/b/f;->a()I

    move-result v1

    if-nez v1, :cond_0

    const-string v0, ""

    :goto_0
    return-object v0

    :cond_0
    invoke-virtual {p0, v0}, Lcom/c/b/f;->a(Ljava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public abstract g()Z
.end method

.method public abstract h()Lcom/c/b/g;
.end method

.method protected abstract i()I
.end method

.method public synthetic iterator()Ljava/util/Iterator;
    .locals 1

    .prologue
    .line 63
    invoke-virtual {p0}, Lcom/c/b/f;->c()Lcom/c/b/f$a;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 1054
    const-string v0, "<ByteString@%s size=%d>"

    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    invoke-virtual {p0}, Lcom/c/b/f;->a()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
