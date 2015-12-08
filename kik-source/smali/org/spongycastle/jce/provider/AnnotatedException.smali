.class public Lorg/spongycastle/jce/provider/AnnotatedException;
.super Ljava/lang/Exception;
.source "SourceFile"

# interfaces
.implements Lorg/spongycastle/jce/exception/ExtException;


# instance fields
.field private a:Ljava/lang/Throwable;


# direct methods
.method constructor <init>(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 20
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lorg/spongycastle/jce/provider/AnnotatedException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    return-void
.end method

.method constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 13
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 15
    iput-object p2, p0, Lorg/spongycastle/jce/provider/AnnotatedException;->a:Ljava/lang/Throwable;

    .line 16
    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 30
    iget-object v0, p0, Lorg/spongycastle/jce/provider/AnnotatedException;->a:Ljava/lang/Throwable;

    return-object v0
.end method
