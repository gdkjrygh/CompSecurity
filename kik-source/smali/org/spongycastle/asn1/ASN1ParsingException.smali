.class public Lorg/spongycastle/asn1/ASN1ParsingException;
.super Ljava/lang/IllegalStateException;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 11
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 15
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 16
    iput-object p2, p0, Lorg/spongycastle/asn1/ASN1ParsingException;->a:Ljava/lang/Throwable;

    .line 17
    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 21
    iget-object v0, p0, Lorg/spongycastle/asn1/ASN1ParsingException;->a:Ljava/lang/Throwable;

    return-object v0
.end method
