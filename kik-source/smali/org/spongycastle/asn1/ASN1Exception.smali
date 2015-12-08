.class public Lorg/spongycastle/asn1/ASN1Exception;
.super Ljava/io/IOException;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 12
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 13
    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 17
    invoke-direct {p0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 18
    iput-object p2, p0, Lorg/spongycastle/asn1/ASN1Exception;->a:Ljava/lang/Throwable;

    .line 19
    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 23
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1Exception;->a:Ljava/lang/Throwable;

    return-object v0
.end method
