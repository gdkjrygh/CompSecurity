.class public Lorg/spongycastle/util/StoreException;
.super Ljava/lang/RuntimeException;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/Throwable;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .prologue
    .line 10
    invoke-direct {p0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 11
    iput-object p2, p0, Lorg/spongycastle/util/StoreException;->a:Ljava/lang/Throwable;

    .line 12
    return-void
.end method


# virtual methods
.method public getCause()Ljava/lang/Throwable;
    .locals 1

    .prologue
    .line 16
    iget-object v0, p0, Lorg/spongycastle/util/StoreException;->a:Ljava/lang/Throwable;

    return-object v0
.end method
