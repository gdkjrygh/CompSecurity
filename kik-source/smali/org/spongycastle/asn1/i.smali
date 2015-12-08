.class abstract Lorg/spongycastle/asn1/i;
.super Ljava/io/InputStream;
.source "SourceFile"


# instance fields
.field protected final a:Ljava/io/InputStream;

.field private b:I


# direct methods
.method constructor <init>(Ljava/io/InputStream;I)V
    .locals 0

    .prologue
    .line 14
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 15
    iput-object p1, p0, Lorg/spongycastle/asn1/i;->a:Ljava/io/InputStream;

    .line 16
    iput p2, p0, Lorg/spongycastle/asn1/i;->b:I

    .line 17
    return-void
.end method


# virtual methods
.method a()I
    .locals 1

    .prologue
    .line 22
    iget v0, p0, Lorg/spongycastle/asn1/i;->b:I

    return v0
.end method

.method protected final c()V
    .locals 2

    .prologue
    .line 27
    iget-object v0, p0, Lorg/spongycastle/asn1/i;->a:Ljava/io/InputStream;

    instance-of v0, v0, Lorg/spongycastle/asn1/f;

    if-eqz v0, :cond_0

    .line 29
    iget-object v0, p0, Lorg/spongycastle/asn1/i;->a:Ljava/io/InputStream;

    check-cast v0, Lorg/spongycastle/asn1/f;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lorg/spongycastle/asn1/f;->a(Z)V

    .line 31
    :cond_0
    return-void
.end method
